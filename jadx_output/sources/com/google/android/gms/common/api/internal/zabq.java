package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public final class zabq implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.internal.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.Api.Client zac;
    private final com.google.android.gms.common.api.internal.ApiKey zad;
    private final com.google.android.gms.common.api.internal.zaad zae;
    private final int zah;
    private final com.google.android.gms.common.api.internal.zact zai;
    private boolean zaj;
    private final java.util.Queue zab = new java.util.LinkedList();
    private final java.util.Set zaf = new java.util.HashSet();
    private final java.util.Map zag = new java.util.HashMap();
    private final java.util.List zak = new java.util.ArrayList();
    private com.google.android.gms.common.ConnectionResult zal = null;
    private int zam = 0;

    public zabq(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.GoogleApi googleApi) {
        android.os.Handler handler;
        android.content.Context context;
        android.os.Handler handler2;
        this.zaa = googleApiManager;
        handler = googleApiManager.zar;
        com.google.android.gms.common.api.Api.Client zab = googleApi.zab(handler.getLooper(), this);
        this.zac = zab;
        this.zad = googleApi.getApiKey();
        this.zae = new com.google.android.gms.common.api.internal.zaad();
        this.zah = googleApi.zaa();
        if (!zab.requiresSignIn()) {
            this.zai = null;
            return;
        }
        context = googleApiManager.zai;
        handler2 = googleApiManager.zar;
        this.zai = googleApi.zac(context, handler2);
    }

    private final com.google.android.gms.common.Feature zaC(com.google.android.gms.common.Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            com.google.android.gms.common.Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new com.google.android.gms.common.Feature[0];
            }
            x.b bVar = new x.b(availableFeatures.length);
            for (com.google.android.gms.common.Feature feature : availableFeatures) {
                bVar.put(feature.getName(), java.lang.Long.valueOf(feature.getVersion()));
            }
            for (com.google.android.gms.common.Feature feature2 : featureArr) {
                java.lang.Long l17 = (java.lang.Long) bVar.getOrDefault(feature2.getName(), null);
                if (l17 == null || l17.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void zaD(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.Iterator it = this.zaf.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.zal) it.next()).zac(this.zad, connectionResult, com.google.android.gms.common.internal.Objects.equal(connectionResult, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        this.zaf.clear();
    }

    public final void zaE(com.google.android.gms.common.api.Status status) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        zaF(status, null, false);
    }

    private final void zaF(com.google.android.gms.common.api.Status status, java.lang.Exception exc, boolean z17) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        if ((status == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) it.next();
            if (!z17 || zaiVar.zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    private final void zaG() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zab);
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) arrayList.get(i17);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaM(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    public final void zaH() {
        zan();
        zaD(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
        zaL();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zaci zaciVar = (com.google.android.gms.common.api.internal.zaci) it.next();
            if (zaC(zaciVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zaciVar.zaa.registerListener(this.zac, new com.google.android.gms.tasks.TaskCompletionSource<>());
                } catch (android.os.DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (android.os.RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaG();
        zaJ();
    }

    public final void zaI(int i17) {
        android.os.Handler handler;
        android.os.Handler handler2;
        android.os.Handler handler3;
        android.os.Handler handler4;
        com.google.android.gms.common.internal.zal zalVar;
        zan();
        this.zaj = true;
        this.zae.zae(i17, this.zac.getLastDisconnectMessage());
        com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        handler = googleApiManager.zar;
        handler2 = googleApiManager.zar;
        handler.sendMessageDelayed(android.os.Message.obtain(handler2, 9, apiKey), 5000L);
        com.google.android.gms.common.api.internal.ApiKey apiKey2 = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        handler3 = googleApiManager2.zar;
        handler4 = googleApiManager2.zar;
        handler3.sendMessageDelayed(android.os.Message.obtain(handler4, 11, apiKey2), u04.d.f423477c);
        zalVar = this.zaa.zak;
        zalVar.zac();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.zaci) it.next()).zac.run();
        }
    }

    private final void zaJ() {
        android.os.Handler handler;
        android.os.Handler handler2;
        android.os.Handler handler3;
        long j17;
        com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
        handler = this.zaa.zar;
        handler.removeMessages(12, apiKey);
        com.google.android.gms.common.api.internal.ApiKey apiKey2 = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        handler2 = googleApiManager.zar;
        handler3 = googleApiManager.zar;
        android.os.Message obtainMessage = handler3.obtainMessage(12, apiKey2);
        j17 = this.zaa.zae;
        handler2.sendMessageDelayed(obtainMessage, j17);
    }

    private final void zaK(com.google.android.gms.common.api.internal.zai zaiVar) {
        zaiVar.zag(this.zae, zaA());
        try {
            zaiVar.zaf(this);
        } catch (android.os.DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void zaL() {
        android.os.Handler handler;
        android.os.Handler handler2;
        if (this.zaj) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
            handler = googleApiManager.zar;
            handler.removeMessages(11, apiKey);
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
            com.google.android.gms.common.api.internal.ApiKey apiKey2 = this.zad;
            handler2 = googleApiManager2.zar;
            handler2.removeMessages(9, apiKey2);
            this.zaj = false;
        }
    }

    private final boolean zaM(com.google.android.gms.common.api.internal.zai zaiVar) {
        boolean z17;
        android.os.Handler handler;
        android.os.Handler handler2;
        android.os.Handler handler3;
        android.os.Handler handler4;
        android.os.Handler handler5;
        android.os.Handler handler6;
        android.os.Handler handler7;
        if (!(zaiVar instanceof com.google.android.gms.common.api.internal.zac)) {
            zaK(zaiVar);
            return true;
        }
        com.google.android.gms.common.api.internal.zac zacVar = (com.google.android.gms.common.api.internal.zac) zaiVar;
        com.google.android.gms.common.Feature zaC = zaC(zacVar.zab(this));
        if (zaC == null) {
            zaK(zaiVar);
            return true;
        }
        this.zac.getClass();
        zaC.getName();
        zaC.getVersion();
        z17 = this.zaa.zas;
        if (!z17 || !zacVar.zaa(this)) {
            zacVar.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(zaC));
            return true;
        }
        com.google.android.gms.common.api.internal.zabs zabsVar = new com.google.android.gms.common.api.internal.zabs(this.zad, zaC, null);
        int indexOf = this.zak.indexOf(zabsVar);
        if (indexOf >= 0) {
            com.google.android.gms.common.api.internal.zabs zabsVar2 = (com.google.android.gms.common.api.internal.zabs) this.zak.get(indexOf);
            handler5 = this.zaa.zar;
            handler5.removeMessages(15, zabsVar2);
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            handler6 = googleApiManager.zar;
            handler7 = googleApiManager.zar;
            handler6.sendMessageDelayed(android.os.Message.obtain(handler7, 15, zabsVar2), 5000L);
            return false;
        }
        this.zak.add(zabsVar);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        handler = googleApiManager2.zar;
        handler2 = googleApiManager2.zar;
        handler.sendMessageDelayed(android.os.Message.obtain(handler2, 15, zabsVar), 5000L);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager3 = this.zaa;
        handler3 = googleApiManager3.zar;
        handler4 = googleApiManager3.zar;
        handler3.sendMessageDelayed(android.os.Message.obtain(handler4, 16, zabsVar), u04.d.f423477c);
        com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(2, null);
        if (zaN(connectionResult)) {
            return false;
        }
        this.zaa.zaE(connectionResult, this.zah);
        return false;
    }

    private final boolean zaN(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.lang.Object obj;
        com.google.android.gms.common.api.internal.zaae zaaeVar;
        java.util.Set set;
        com.google.android.gms.common.api.internal.zaae zaaeVar2;
        obj = com.google.android.gms.common.api.internal.GoogleApiManager.zac;
        synchronized (obj) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            zaaeVar = googleApiManager.zao;
            if (zaaeVar != null) {
                set = googleApiManager.zap;
                if (set.contains(this.zad)) {
                    zaaeVar2 = this.zaa.zao;
                    zaaeVar2.zah(connectionResult, this.zah);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zaO(boolean z17) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        if (!this.zac.isConnected() || !this.zag.isEmpty()) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.disconnect("Timing out service connection.");
            return true;
        }
        if (!z17) {
            return false;
        }
        zaJ();
        return false;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.ApiKey zag(com.google.android.gms.common.api.internal.zabq zabqVar) {
        return zabqVar.zad;
    }

    public static /* bridge */ /* synthetic */ void zai(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.api.Status status) {
        zabqVar.zaE(status);
    }

    public static /* bridge */ /* synthetic */ void zal(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.api.internal.zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.zaj) {
            if (zabqVar.zac.isConnected()) {
                zabqVar.zaG();
            } else {
                zabqVar.zao();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zam(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.api.internal.zabs zabsVar) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.google.android.gms.common.Feature feature;
        com.google.android.gms.common.Feature[] zab;
        if (zabqVar.zak.remove(zabsVar)) {
            handler = zabqVar.zaa.zar;
            handler.removeMessages(15, zabsVar);
            handler2 = zabqVar.zaa.zar;
            handler2.removeMessages(16, zabsVar);
            feature = zabsVar.zab;
            java.util.ArrayList arrayList = new java.util.ArrayList(zabqVar.zab.size());
            for (com.google.android.gms.common.api.internal.zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof com.google.android.gms.common.api.internal.zac) && (zab = ((com.google.android.gms.common.api.internal.zac) zaiVar).zab(zabqVar)) != null && com.google.android.gms.common.util.ArrayUtils.contains(zab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.google.android.gms.common.api.internal.zai zaiVar2 = (com.google.android.gms.common.api.internal.zai) arrayList.get(i17);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(feature));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zay(com.google.android.gms.common.api.internal.zabq zabqVar, boolean z17) {
        return zabqVar.zaO(false);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        handler = googleApiManager.zar;
        if (myLooper == handler.getLooper()) {
            zaH();
        } else {
            handler2 = this.zaa.zar;
            handler2.post(new com.google.android.gms.common.api.internal.zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i17) {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        handler = googleApiManager.zar;
        if (myLooper == handler.getLooper()) {
            zaI(i17);
        } else {
            handler2 = this.zaa.zar;
            handler2.post(new com.google.android.gms.common.api.internal.zabn(this, i17));
        }
    }

    public final boolean zaA() {
        return this.zac.requiresSignIn();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zaB() {
        return zaO(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z17) {
        throw null;
    }

    public final int zab() {
        return this.zah;
    }

    public final int zac() {
        return this.zam;
    }

    public final com.google.android.gms.common.ConnectionResult zad() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        return this.zal;
    }

    public final com.google.android.gms.common.api.Api.Client zaf() {
        return this.zac;
    }

    public final java.util.Map zah() {
        return this.zag;
    }

    public final void zan() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        this.zal = null;
    }

    public final void zao() {
        android.os.Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        android.content.Context context;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        if (this.zac.isConnected() || this.zac.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            zalVar = googleApiManager.zak;
            context = googleApiManager.zai;
            int zab = zalVar.zab(context, this.zac);
            if (zab != 0) {
                com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(zab, null);
                this.zac.getClass();
                connectionResult.toString();
                zar(connectionResult, null);
                return;
            }
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
            com.google.android.gms.common.api.Api.Client client = this.zac;
            com.google.android.gms.common.api.internal.zabu zabuVar = new com.google.android.gms.common.api.internal.zabu(googleApiManager2, client, this.zad);
            if (client.requiresSignIn()) {
                ((com.google.android.gms.common.api.internal.zact) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zai)).zae(zabuVar);
            }
            try {
                this.zac.connect(zabuVar);
            } catch (java.lang.SecurityException e17) {
                zar(new com.google.android.gms.common.ConnectionResult(10), e17);
            }
        } catch (java.lang.IllegalStateException e18) {
            zar(new com.google.android.gms.common.ConnectionResult(10), e18);
        }
    }

    public final void zap(com.google.android.gms.common.api.internal.zai zaiVar) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        if (this.zac.isConnected()) {
            if (zaM(zaiVar)) {
                zaJ();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        com.google.android.gms.common.ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    public final void zaq() {
        this.zam++;
    }

    public final void zar(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.Exception exc) {
        android.os.Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        boolean z17;
        com.google.android.gms.common.api.Status zaF;
        com.google.android.gms.common.api.Status zaF2;
        com.google.android.gms.common.api.Status zaF3;
        android.os.Handler handler2;
        android.os.Handler handler3;
        android.os.Handler handler4;
        com.google.android.gms.common.api.Status status;
        android.os.Handler handler5;
        android.os.Handler handler6;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        com.google.android.gms.common.api.internal.zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        zalVar = this.zaa.zak;
        zalVar.zac();
        zaD(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.zaf = true;
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            handler5 = googleApiManager.zar;
            handler6 = googleApiManager.zar;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            status = com.google.android.gms.common.api.internal.GoogleApiManager.zab;
            zaE(status);
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            handler4 = this.zaa.zar;
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler4);
            zaF(null, exc, false);
            return;
        }
        z17 = this.zaa.zas;
        if (!z17) {
            zaF = com.google.android.gms.common.api.internal.GoogleApiManager.zaF(this.zad, connectionResult);
            zaE(zaF);
            return;
        }
        zaF2 = com.google.android.gms.common.api.internal.GoogleApiManager.zaF(this.zad, connectionResult);
        zaF(zaF2, null, true);
        if (this.zab.isEmpty() || zaN(connectionResult) || this.zaa.zaE(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaF3 = com.google.android.gms.common.api.internal.GoogleApiManager.zaF(this.zad, connectionResult);
            zaE(zaF3);
            return;
        }
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
        handler2 = googleApiManager2.zar;
        handler3 = googleApiManager2.zar;
        handler2.sendMessageDelayed(android.os.Message.obtain(handler3, 9, apiKey), 5000L);
    }

    public final void zas(com.google.android.gms.common.ConnectionResult connectionResult) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        com.google.android.gms.common.api.Api.Client client = this.zac;
        client.disconnect("onSignInFailed for " + client.getClass().getName() + " with " + java.lang.String.valueOf(connectionResult));
        zar(connectionResult, null);
    }

    public final void zat(com.google.android.gms.common.api.internal.zal zalVar) {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        this.zaf.add(zalVar);
    }

    public final void zau() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        if (this.zaj) {
            zao();
        }
    }

    public final void zav() {
        android.os.Handler handler;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
        this.zae.zaf();
        for (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey : (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[0])) {
            zap(new com.google.android.gms.common.api.internal.zah(listenerKey, new com.google.android.gms.tasks.TaskCompletionSource()));
        }
        zaD(new com.google.android.gms.common.ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new com.google.android.gms.common.api.internal.zabp(this));
        }
    }

    public final void zaw() {
        android.os.Handler handler;
        com.google.android.gms.common.GoogleApiAvailability googleApiAvailability;
        android.content.Context context;
        handler = this.zaa.zar;
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(handler);
        if (this.zaj) {
            zaL();
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiAvailability = googleApiManager.zaj;
            context = googleApiManager.zai;
            zaE(googleApiAvailability.isGooglePlayServicesAvailable(context) == 18 ? new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.") : new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.zac.isConnected();
    }
}

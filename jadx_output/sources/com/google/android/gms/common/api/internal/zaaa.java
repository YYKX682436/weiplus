package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zaaa implements com.google.android.gms.common.api.internal.zaca {
    private final android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabe zab;
    private final android.os.Looper zac;
    private final com.google.android.gms.common.api.internal.zabi zad;
    private final com.google.android.gms.common.api.internal.zabi zae;
    private final java.util.Map zaf;
    private final com.google.android.gms.common.api.Api.Client zah;
    private android.os.Bundle zai;
    private final java.util.concurrent.locks.Lock zam;
    private final java.util.Set zag = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private com.google.android.gms.common.ConnectionResult zaj = null;
    private com.google.android.gms.common.ConnectionResult zak = null;
    private boolean zal = false;
    private int zan = 0;

    private zaaa(android.content.Context context, com.google.android.gms.common.api.internal.zabe zabeVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map map, java.util.Map map2, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, com.google.android.gms.common.api.Api.Client client, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.Map map3, java.util.Map map4) {
        this.zaa = context;
        this.zab = zabeVar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        this.zad = new com.google.android.gms.common.api.internal.zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new com.google.android.gms.common.api.internal.zax(this, null));
        this.zae = new com.google.android.gms.common.api.internal.zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new com.google.android.gms.common.api.internal.zaz(this, null));
        x.b bVar = new x.b();
        java.util.Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            bVar.put((com.google.android.gms.common.api.Api.AnyClientKey) it.next(), this.zad);
        }
        java.util.Iterator it6 = map.keySet().iterator();
        while (it6.hasNext()) {
            bVar.put((com.google.android.gms.common.api.Api.AnyClientKey) it6.next(), this.zae);
        }
        this.zaf = java.util.Collections.unmodifiableMap(bVar);
    }

    private final void zaA(com.google.android.gms.common.ConnectionResult connectionResult) {
        int i17 = this.zan;
        if (i17 != 1) {
            if (i17 != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.Exception());
                this.zan = 0;
            }
            this.zab.zaa(connectionResult);
        }
        zaB();
        this.zan = 0;
    }

    private final void zaB() {
        java.util.Iterator it = this.zag.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.SignInConnectionListener) it.next()).onComplete();
        }
        this.zag.clear();
    }

    private final boolean zaC() {
        com.google.android.gms.common.ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaD(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        com.google.android.gms.common.api.internal.zabi zabiVar = (com.google.android.gms.common.api.internal.zabi) this.zaf.get(apiMethodImpl.getClientKey());
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.zae);
    }

    private static boolean zaE(com.google.android.gms.common.ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static com.google.android.gms.common.api.internal.zaaa zag(android.content.Context context, com.google.android.gms.common.api.internal.zabe zabeVar, java.util.concurrent.locks.Lock lock, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, java.util.Map map, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map map2, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, java.util.ArrayList arrayList) {
        x.b bVar = new x.b();
        x.b bVar2 = new x.b();
        com.google.android.gms.common.api.Api.Client client = null;
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.gms.common.api.Api.Client client2 = (com.google.android.gms.common.api.Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                bVar.put((com.google.android.gms.common.api.Api.AnyClientKey) entry.getKey(), client2);
            } else {
                bVar2.put((com.google.android.gms.common.api.Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkState(!bVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        x.b bVar3 = new x.b();
        x.b bVar4 = new x.b();
        for (com.google.android.gms.common.api.Api api : map2.keySet()) {
            com.google.android.gms.common.api.Api.AnyClientKey zab = api.zab();
            if (bVar.containsKey(zab)) {
                bVar3.put(api, (java.lang.Boolean) map2.get(api));
            } else {
                if (!bVar2.containsKey(zab)) {
                    throw new java.lang.IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                bVar4.put(api, (java.lang.Boolean) map2.get(api));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.google.android.gms.common.api.internal.zat zatVar = (com.google.android.gms.common.api.internal.zat) arrayList.get(i17);
            if (bVar3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!bVar4.containsKey(zatVar.zaa)) {
                    throw new java.lang.IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zatVar);
            }
        }
        return new com.google.android.gms.common.api.internal.zaaa(context, zabeVar, lock, looper, googleApiAvailabilityLight, bVar, bVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, bVar3, bVar4);
    }

    public static /* bridge */ /* synthetic */ void zan(com.google.android.gms.common.api.internal.zaaa zaaaVar, int i17, boolean z17) {
        zaaaVar.zab.zac(i17, z17);
        zaaaVar.zak = null;
        zaaaVar.zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(com.google.android.gms.common.api.internal.zaaa zaaaVar, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = zaaaVar.zai;
        if (bundle2 == null) {
            zaaaVar.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void zap(com.google.android.gms.common.api.internal.zaaa zaaaVar) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        if (!zaE(zaaaVar.zaj)) {
            if (zaaaVar.zaj != null && zaE(zaaaVar.zak)) {
                zaaaVar.zae.zar();
                zaaaVar.zaA((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull(zaaaVar.zaj));
                return;
            }
            com.google.android.gms.common.ConnectionResult connectionResult2 = zaaaVar.zaj;
            if (connectionResult2 == null || (connectionResult = zaaaVar.zak) == null) {
                return;
            }
            if (zaaaVar.zae.zaf < zaaaVar.zad.zaf) {
                connectionResult2 = connectionResult;
            }
            zaaaVar.zaA(connectionResult2);
            return;
        }
        if (!zaE(zaaaVar.zak) && !zaaaVar.zaC()) {
            com.google.android.gms.common.ConnectionResult connectionResult3 = zaaaVar.zak;
            if (connectionResult3 != null) {
                if (zaaaVar.zan == 1) {
                    zaaaVar.zaB();
                    return;
                } else {
                    zaaaVar.zaA(connectionResult3);
                    zaaaVar.zad.zar();
                    return;
                }
            }
            return;
        }
        int i17 = zaaaVar.zan;
        if (i17 != 1) {
            if (i17 != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new java.lang.AssertionError());
                zaaaVar.zan = 0;
            }
            ((com.google.android.gms.common.api.internal.zabe) com.google.android.gms.common.internal.Preconditions.checkNotNull(zaaaVar.zab)).zab(zaaaVar.zai);
        }
        zaaaVar.zaB();
        zaaaVar.zan = 0;
    }

    private final android.app.PendingIntent zaz() {
        com.google.android.gms.common.api.Api.Client client = this.zah;
        if (client == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(this.zaa, java.lang.System.identityHashCode(this.zab), client.getSignInIntent(), com.google.android.gms.internal.base.zap.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zab() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zac(long j17, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api api) {
        return com.google.android.gms.common.internal.Objects.equal(this.zaf.get(api.zab()), this.zae) ? zaC() ? new com.google.android.gms.common.ConnectionResult(4, zaz()) : this.zae.zad(api) : this.zad.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            this.zad.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (zaC()) {
            apiMethodImpl.setFailedResult(new com.google.android.gms.common.api.Status(4, (java.lang.String) null, zaz()));
            return apiMethodImpl;
        }
        this.zae.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            return this.zad.zaf(apiMethodImpl);
        }
        if (!zaC()) {
            return this.zae.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new com.google.android.gms.common.api.Status(4, (java.lang.String) null, zaz()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.append((java.lang.CharSequence) str).append("authClient").println(":");
        this.zae.zas(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((java.lang.CharSequence) str).append("anonClient").println(":");
        this.zad.zas(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.zam.lock();
        try {
            boolean zax = zax();
            this.zae.zar();
            this.zak = new com.google.android.gms.common.ConnectionResult(4);
            if (zax) {
                new com.google.android.gms.internal.base.zau(this.zac).post(new com.google.android.gms.common.api.internal.zav(this));
            } else {
                zaB();
            }
        } finally {
            this.zam.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.zan == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.zad     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.common.api.internal.zabi r0 = r3.zae     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.zaC()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.zan     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L22
        L21:
            r1 = r2
        L22:
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zam
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.zaw():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            boolean z17 = false;
            if ((zax() || zaw()) && !this.zae.zaw()) {
                this.zag.add(signInConnectionListener);
                z17 = true;
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaq();
            }
            return z17;
        } finally {
            this.zam.unlock();
        }
    }
}

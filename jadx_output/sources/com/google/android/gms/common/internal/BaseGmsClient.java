package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private volatile java.lang.String zzA;
    private com.google.android.gms.common.ConnectionResult zzB;
    private boolean zzC;
    private volatile com.google.android.gms.common.internal.zzk zzD;
    com.google.android.gms.common.internal.zzv zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;
    private static final com.google.android.gms.common.Feature[] zze = new com.google.android.gms.common.Feature[0];
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* loaded from: classes13.dex */
    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(android.os.Bundle bundle);

        void onConnectionSuspended(int i17);
    }

    /* loaded from: classes13.dex */
    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    /* loaded from: classes13.dex */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    /* loaded from: classes13.dex */
    public class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
            if (!connectionResult.isSuccess()) {
                if (com.google.android.gms.common.internal.BaseGmsClient.this.zzx != null) {
                    com.google.android.gms.common.internal.BaseGmsClient.this.zzx.onConnectionFailed(connectionResult);
                    return;
                }
                return;
            }
            com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = com.google.android.gms.common.internal.BaseGmsClient.this;
            java.util.Set<com.google.android.gms.common.api.Scope> scopes = baseGmsClient.getScopes();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(scopes);
            arrayList.add(null);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(baseGmsClient, arrayList.toArray(), "com/google/android/gms/common/internal/BaseGmsClient$LegacyClientCallbackAdapter", "onReportServiceBinding", "(Lcom/google/android/gms/common/ConnectionResult;)V", "com/google/android/gms/common/internal/BaseGmsClient", "getRemoteService", "(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V");
        }
    }

    /* loaded from: classes13.dex */
    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    public BaseGmsClient(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i17, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i17;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, com.google.android.gms.common.internal.zzk zzkVar) {
        baseGmsClient.zzD = zzkVar;
        if (baseGmsClient.usesClientTelemetry()) {
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.zzd;
            com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i17) {
        int i18;
        int i19;
        synchronized (baseGmsClient.zzp) {
            i18 = baseGmsClient.zzv;
        }
        if (i18 == 3) {
            baseGmsClient.zzC = true;
            i19 = 5;
        } else {
            i19 = 4;
        }
        android.os.Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i19, baseGmsClient.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i17, int i18, android.os.IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i17) {
                return false;
            }
            baseGmsClient.zzp(i18, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:945)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.BaseGmsClient r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.zzo(com.google.android.gms.common.internal.BaseGmsClient):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i17, android.os.IInterface iInterface) {
        com.google.android.gms.common.internal.zzv zzvVar;
        com.google.android.gms.common.internal.Preconditions.checkArgument((i17 == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i17;
            this.zzs = iInterface;
            if (i17 == 1) {
                com.google.android.gms.common.internal.zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = this.zzn;
                    java.lang.String zzb = this.zza.zzb();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb);
                    gmsClientSupervisor.zzb(zzb, this.zza.zza(), 4225, zzeVar, zze(), this.zza.zzc());
                    this.zzu = null;
                }
            } else if (i17 == 2 || i17 == 3) {
                com.google.android.gms.common.internal.zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzvVar = this.zza) != null) {
                    zzvVar.zzb();
                    zzvVar.zza();
                    com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                    java.lang.String zzb2 = this.zza.zzb();
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb2);
                    gmsClientSupervisor2.zzb(zzb2, this.zza.zza(), 4225, zzeVar2, zze(), this.zza.zzc());
                    this.zzd.incrementAndGet();
                }
                com.google.android.gms.common.internal.zze zzeVar3 = new com.google.android.gms.common.internal.zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                com.google.android.gms.common.internal.zzv zzvVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new com.google.android.gms.common.internal.zzv(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new com.google.android.gms.common.internal.zzv(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = zzvVar2;
                if (zzvVar2.zzc() && getMinApkVersion() < 17895000) {
                    throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf(this.zza.zzb())));
                }
                com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                java.lang.String zzb3 = this.zza.zzb();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb3);
                if (!gmsClientSupervisor3.zzc(new com.google.android.gms.common.internal.zzo(zzb3, this.zza.zza(), 4225, this.zza.zzc()), zzeVar3, zze(), getBindServiceExecutor())) {
                    this.zza.zzb();
                    this.zza.zza();
                    zzl(16, null, this.zzd.get());
                }
            } else if (i17 == 4) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable == 0) {
            connect(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter());
        } else {
            zzp(1, null);
            triggerNotAvailable(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter(), isGooglePlayServicesAvailable, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    public abstract T createServiceInterface(android.os.IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((com.google.android.gms.common.internal.zzc) this.zzt.get(i17)).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int i17;
        android.os.IInterface iInterface;
        com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i17 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((java.lang.CharSequence) str).append("mConnectState=");
        if (i17 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i17 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i17 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i17 == 4) {
            printWriter.print("CONNECTED");
        } else if (i17 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((java.lang.CharSequence) getServiceDescriptor()).append("@").append((java.lang.CharSequence) java.lang.Integer.toHexString(java.lang.System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.zzh > 0) {
            java.io.PrintWriter append = printWriter.append((java.lang.CharSequence) str).append("lastConnectedTime=");
            long j17 = this.zzh;
            append.println(j17 + " " + simpleDateFormat.format(new java.util.Date(j17)));
        }
        if (this.zzg > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastSuspendedCause=");
            int i18 = this.zzf;
            if (i18 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i18 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i18 != 3) {
                printWriter.append((java.lang.CharSequence) java.lang.String.valueOf(i18));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            java.io.PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j18 = this.zzg;
            append2.println(j18 + " " + simpleDateFormat.format(new java.util.Date(j18)));
        }
        if (this.zzj > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastFailedStatus=").append((java.lang.CharSequence) com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzi));
            java.io.PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j19 = this.zzj;
            append3.println(j19 + " " + simpleDateFormat.format(new java.util.Date(j19)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public android.accounts.Account getAccount() {
        return null;
    }

    public com.google.android.gms.common.Feature[] getApiFeatures() {
        return zze;
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
        com.google.android.gms.common.internal.zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzb;
    }

    public java.util.concurrent.Executor getBindServiceExecutor() {
        return null;
    }

    public android.os.Bundle getConnectionHint() {
        return null;
    }

    public final android.content.Context getContext() {
        return this.zzl;
    }

    public java.lang.String getEndpointPackageName() {
        com.google.android.gms.common.internal.zzv zzvVar;
        if (!isConnected() || (zzvVar = this.zza) == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
        return zzvVar.zza();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public android.os.Bundle getGetServiceRequestExtraArgs() {
        return new android.os.Bundle();
    }

    public java.lang.String getLastDisconnectMessage() {
        return this.zzk;
    }

    public java.lang.String getLocalStartServiceAction() {
        return null;
    }

    public final android.os.Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        android.os.Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        java.lang.String str = this.zzA;
        int i17 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.zza;
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = this.zzy;
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.common.internal.GetServiceRequest.zzb;
        com.google.android.gms.common.internal.GetServiceRequest getServiceRequest = new com.google.android.gms.common.internal.GetServiceRequest(6, i18, i17, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (requiresSignIn()) {
            android.accounts.Account account = getAccount();
            if (account == null) {
                account = new android.accounts.Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzj = getAccount();
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.getService(new com.google.android.gms.common.internal.zzd(this, this.zzd.get()), getServiceRequest);
                    }
                }
            } catch (android.os.RemoteException | java.lang.RuntimeException unused) {
                onPostInitHandler(8, null, null, this.zzd.get());
            }
        } catch (android.os.DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (java.lang.SecurityException e17) {
            throw e17;
        }
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return java.util.Collections.emptySet();
    }

    public final T getService() {
        T t17;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new android.os.DeadObjectException();
            }
            checkConnected();
            t17 = (T) this.zzs;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(t17, "Client is connected but service is null");
        }
        return t17;
    }

    public android.os.IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    public abstract java.lang.String getServiceDescriptor();

    public android.content.Intent getSignInIntent() {
        throw new java.lang.UnsupportedOperationException("Not a sign in API");
    }

    public abstract java.lang.String getStartServiceAction();

    public java.lang.String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        com.google.android.gms.common.internal.zzk zzkVar = this.zzD;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zzd;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z17;
        synchronized (this.zzp) {
            z17 = this.zzv == 4;
        }
        return z17;
    }

    public boolean isConnecting() {
        boolean z17;
        synchronized (this.zzp) {
            int i17 = this.zzv;
            z17 = true;
            if (i17 != 2 && i17 != 3) {
                z17 = false;
            }
        }
        return z17;
    }

    public void onConnectedLocked(T t17) {
        this.zzh = java.lang.System.currentTimeMillis();
    }

    public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = java.lang.System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i17) {
        this.zzf = i17;
        this.zzg = java.lang.System.currentTimeMillis();
    }

    public void onPostInitHandler(int i17, android.os.IBinder iBinder, android.os.Bundle bundle, int i18) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i18, -1, new com.google.android.gms.common.internal.zzf(this, i17, iBinder, bundle)));
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(java.lang.String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i17) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i17));
    }

    public void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i17, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i17, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final java.lang.String zze() {
        java.lang.String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i17, android.os.Bundle bundle, int i18) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i18, -1, new com.google.android.gms.common.internal.zzg(this, i17, null)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    public void disconnect(java.lang.String str) {
        this.zzk = str;
        disconnect();
    }

    public BaseGmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i17, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this.zzk = null;
        this.zzp = new java.lang.Object();
        this.zzq = new java.lang.Object();
        this.zzt = new java.util.ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new com.google.android.gms.common.internal.zzb(this, looper);
        this.zzy = i17;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}

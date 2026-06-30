package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient */
/* loaded from: classes13.dex */
public final class ServiceConnectionC1783xc5aca5d9 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb, android.content.ServiceConnection {
    private static final java.lang.String zaa = "NonGmsServiceBrokerClient";
    private final java.lang.String zab;
    private final java.lang.String zac;
    private final android.content.ComponentName zad;
    private final android.content.Context zae;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 zaf;
    private final android.os.Handler zag;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae zah;
    private android.os.IBinder zai;
    private boolean zaj;
    private java.lang.String zak;
    private java.lang.String zal;

    public ServiceConnectionC1783xc5aca5d9(android.content.Context context, android.os.Looper looper, android.content.ComponentName componentName, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 interfaceC1772x6c072b70, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae interfaceC1784xee64ffae) {
        this(context, looper, null, null, componentName, interfaceC1772x6c072b70, interfaceC1784xee64ffae);
    }

    private final void zad() {
        if (java.lang.Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new java.lang.IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: connect */
    public final void mo17707x38b478ea(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        zad();
        java.lang.String.valueOf(this.zai);
        if (mo17718x23b734ff()) {
            try {
                mo17709x1f9d589c("connect() called when already connected");
            } catch (java.lang.Exception unused) {
            }
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            android.content.ComponentName componentName = this.zad;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            boolean bindService = this.zae.bindService(intent, this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0.m18164xdafa227f());
            this.zaj = bindService;
            if (!bindService) {
                this.zai = null;
                this.zah.mo17932xce9394ba(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(16));
            }
            java.lang.String.valueOf(this.zai);
        } catch (java.lang.SecurityException e17) {
            this.zaj = false;
            this.zai = null;
            throw e17;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: disconnect */
    public final void mo17708x1f9d589c() {
        zad();
        java.lang.String.valueOf(this.zai);
        try {
            this.zae.unbindService(this);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        this.zaj = false;
        this.zai = null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: dump */
    public final void mo17710x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getAvailableFeatures */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] mo17711x968e8170() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[0];
    }

    /* renamed from: getBinder */
    public android.os.IBinder m17931x124d38a0() {
        zad();
        return this.zai;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getEndpointPackageName */
    public final java.lang.String mo17712x51be17e6() {
        java.lang.String str = this.zab;
        if (str != null) {
            return str;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zad);
        return this.zad.getPackageName();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getLastDisconnectMessage */
    public final java.lang.String mo17713x5778d61f() {
        return this.zak;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getMinApkVersion */
    public final int mo17560x352ce358() {
        return 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getRemoteService */
    public final void mo17714x525c67d9(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b interfaceC1914xc5c6680b, java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> set) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getRequiredFeatures */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] mo17715xf716cc72() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[0];
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getScopesForConnectionlessNonSignIn */
    public final java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo17716xa9228da4() {
        return java.util.Collections.emptySet();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getServiceBrokerBinder */
    public final android.os.IBinder mo17717xaaad0302() {
        return null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getSignInIntent */
    public final android.content.Intent mo17562xc37ac774() {
        return new android.content.Intent();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: isConnected */
    public final boolean mo17718x23b734ff() {
        zad();
        return this.zai != null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: isConnecting */
    public final boolean mo17719x532f7b82() {
        zad();
        return this.zaj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        this.zag.post(new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zacg
            @Override // java.lang.Runnable
            public final void run() {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ServiceConnectionC1783xc5aca5d9.this.zaa(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zag.post(new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zacf
            @Override // java.lang.Runnable
            public final void run() {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ServiceConnectionC1783xc5aca5d9.this.zab();
            }
        });
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: onUserSignOut */
    public final void mo17720x87088ea7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: providesSignIn */
    public final boolean mo17564x6e8aa054() {
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: requiresAccount */
    public final boolean mo17721xcf1169f() {
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: requiresGooglePlayServices */
    public final boolean mo17722xb7ac48d9() {
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: requiresSignIn */
    public final boolean mo17723xabdb8910() {
        return false;
    }

    public final /* synthetic */ void zaa(android.os.IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        java.lang.String.valueOf(iBinder);
        this.zaf.mo17884xdba42fea(new android.os.Bundle());
    }

    public final /* synthetic */ void zab() {
        this.zaj = false;
        this.zai = null;
        this.zaf.mo17885x4511603e(1);
    }

    public final void zac(java.lang.String str) {
        this.zal = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private ServiceConnectionC1783xc5aca5d9(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 r7, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zak = r0
            r1.zae = r2
            com.google.android.gms.internal.base.zau r2 = new com.google.android.gms.internal.base.zau
            r2.<init>(r3)
            r1.zag = r2
            r1.zaf = r7
            r1.zah = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.zab = r4
            r1.zac = r5
            r1.zad = r6
            return
        L27:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ServiceConnectionC1783xc5aca5d9.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }

    public ServiceConnectionC1783xc5aca5d9(android.content.Context context, android.os.Looper looper, java.lang.String str, java.lang.String str2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 interfaceC1772x6c072b70, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae interfaceC1784xee64ffae) {
        this(context, looper, str, str2, null, interfaceC1772x6c072b70, interfaceC1784xee64ffae);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: disconnect */
    public final void mo17709x1f9d589c(java.lang.String str) {
        zad();
        this.zak = str;
        mo17708x1f9d589c();
    }
}

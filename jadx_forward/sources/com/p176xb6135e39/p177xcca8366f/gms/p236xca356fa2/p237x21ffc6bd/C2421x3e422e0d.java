package com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd;

/* renamed from: com.google.android.gms.signin.internal.SignInClientImpl */
/* loaded from: classes13.dex */
public class C2421x3e422e0d extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1910x95bf6258<com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zaf> implements com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae {
    public static final /* synthetic */ int zaa = 0;
    private final boolean zab;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e zac;
    private final android.os.Bundle zad;
    private final java.lang.Integer zae;

    public C2421x3e422e0d(android.content.Context context, android.os.Looper looper, boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, android.os.Bundle bundle, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, c1904x2257e52e, connectionCallbacks, onConnectionFailedListener);
        this.zab = true;
        this.zac = c1904x2257e52e;
        this.zad = bundle;
        this.zae = c1904x2257e52e.zab();
    }

    /* renamed from: createBundleFromClientSettings */
    public static android.os.Bundle m19516xb5646c96(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e) {
        c1904x2257e52e.zaa();
        java.lang.Integer zab = c1904x2257e52e.zab();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1904x2257e52e.m18136xf7a0c5f7());
        if (zab != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", zab.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: createServiceInterface */
    public final /* synthetic */ android.os.IInterface mo17559xa50fef20(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zaf ? (com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zaf) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zaf(iBinder);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getGetServiceRequestExtraArgs */
    public final android.os.Bundle mo18102x97bc63d3() {
        if (!m18099x76847179().getPackageName().equals(this.zac.m18142xb59aef72())) {
            this.zad.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zac.m18142xb59aef72());
        }
        return this.zad;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getMinApkVersion */
    public final int mo17560x352ce358() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.f5840x7aedca50;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getServiceDescriptor */
    public final java.lang.String mo17561x83e1df4e() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getStartServiceAction */
    public final java.lang.String mo17563x572a11ff() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: requiresSignIn */
    public final boolean mo17723xabdb8910() {
        return this.zab;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae
    public final void zaa() {
        try {
            ((com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zaf) m18108xb411027f()).zae(((java.lang.Integer) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zae)).intValue());
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae
    public final void zab() {
        mo17707x38b478ea(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.LegacyClientCallbackAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae
    public final void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b interfaceC1914xc5c6680b, boolean z17) {
        try {
            ((com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zaf) m18108xb411027f()).zaf(interfaceC1914xc5c6680b, ((java.lang.Integer) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zae)).intValue(), z17);
        } catch (android.os.RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae
    public final void zad(com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zae zaeVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(zaeVar, "Expecting a valid ISignInCallbacks");
        try {
            android.accounts.Account m18138x95f9aaa7 = this.zac.m18138x95f9aaa7();
            ((com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zaf) m18108xb411027f()).zag(new com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zai(1, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zat(m18138x95f9aaa7, ((java.lang.Integer) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zae)).intValue(), "<<default account>>".equals(m18138x95f9aaa7.name) ? com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b.m17551x9cf0d20b(m18099x76847179()).m17553xc1f1cc02() : null)), zaeVar);
        } catch (android.os.RemoteException e17) {
            try {
                zaeVar.zab(new com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zak(1, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8, null), null));
            } catch (android.os.RemoteException unused) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e17);
            }
        }
    }
}

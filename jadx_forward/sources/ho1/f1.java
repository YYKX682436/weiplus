package ho1;

/* loaded from: classes9.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.lang.String str, ho1.q1 q1Var, long j17) {
        super(0);
        this.f364201d = str;
        this.f364202e = q1Var;
        this.f364203f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f364201d;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("getAdamTunnelCryptoInfoAsync, cryptoMaterial == null");
        }
        jy3.c cVar = new jy3.c();
        cVar.J(jy3.c.f384036f.b(str));
        try {
            return java.lang.Integer.valueOf(cVar.mo807x6c193ac1(gm0.j1.d().f152297d, new ho1.e1(this.f364202e, this.f364203f)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackup.RoamProviderImpl", "NetSceneBuildDeviceSecureChannel do scene error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamBackup.RoamProviderImpl", e17, "", new java.lang.Object[0]);
            return jz5.f0.f384359a;
        }
    }
}

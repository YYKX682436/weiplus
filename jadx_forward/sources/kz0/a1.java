package kz0;

/* loaded from: classes5.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f395187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f395188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 f395189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395190g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395191h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ty0.b1 b1Var, yz5.l lVar, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f395187d = b1Var;
        this.f395188e = lVar;
        this.f395189f = t0Var;
        this.f395190g = v2Var;
        this.f395191h = v2Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: on search btn clicked");
        kz0.a aVar = kz0.a.f395178m;
        int i17 = kz0.k1.f395300a;
        n0.v2 v2Var = this.f395190g;
        v2Var.mo148714x53d8522f(aVar);
        this.f395191h.mo148714x53d8522f(java.lang.Boolean.valueOf(((java.lang.Boolean) this.f395187d.f504327d.mo128745x754a37bb()).booleanValue()));
        this.f395188e.mo146xb9724478(kz0.k1.e(v2Var));
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var = this.f395189f;
        if (t0Var != null) {
            t0Var.a();
        }
        return jz5.f0.f384359a;
    }
}

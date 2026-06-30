package kz0;

/* loaded from: classes5.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f395276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 f395277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f395279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(yz5.l lVar, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f395276d = lVar;
        this.f395277e = t0Var;
        this.f395278f = v2Var;
        this.f395279g = v2Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismissBottomSheet ");
        n0.v2 v2Var = this.f395278f;
        sb6.append(kz0.k1.c(v2Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateUIPage", sb6.toString());
        if (kz0.k1.c(v2Var)) {
            v2Var.mo148714x53d8522f(java.lang.Boolean.FALSE);
            this.f395276d.mo146xb9724478(null);
            if (kz0.k1.e(this.f395279g) == kz0.a.f395178m && (t0Var = this.f395277e) != null) {
                t0Var.c();
            }
        }
        return jz5.f0.f384359a;
    }
}

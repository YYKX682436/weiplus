package r01;

/* loaded from: classes9.dex */
public class h3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f449638d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f449639e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f449640f;

    public h3(r01.m mVar, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.qf5();
        lVar.f152198b = new r45.rf5();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/reportpluginstat";
        lVar.f152200d = 2805;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f449639e = a17;
        r45.qf5 qf5Var = (r45.qf5) a17.f152243a.f152217a;
        qf5Var.f465478d = i17;
        qf5Var.f465479e = mVar.f66046x771ad30a;
        qf5Var.f465481g = mVar.f66050x2a8d0441;
        qf5Var.f465482h = gm0.j1.b().h();
        qf5Var.f465483i = i19;
        qf5Var.f465484m = i18;
        qf5Var.f465485n = i27;
        qf5Var.f465486o = new java.util.Date().getTime();
        qf5Var.f465487p = 1;
        qf5Var.f465488q = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, o45.wf.f424562g);
        this.f449640f = obj;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f449638d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneEnterprisePushStat", "do scene");
        return mo9409x10f9447a(sVar, this.f449639e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2805;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f449638d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f253323d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f253324e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n87 f253325f;

    public i() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1947;
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/getwxsportconfig";
        lVar.f152197a = new r45.m87();
        lVar.f152198b = new r45.n87();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f253324e = a17;
        r45.m87 m87Var = (r45.m87) a17.f152243a.f152217a;
        m87Var.f461786g = o45.wf.f424559d;
        m87Var.f461783d = com.p314xaae8f345.mm.p2621x8fb0427b.la.m0();
        m87Var.f461784e = android.os.Build.BRAND;
        java.lang.String m17 = wo.w0.m();
        m87Var.f461785f = m17;
        m87Var.f461787h = wo.q.f529317e;
        java.lang.String str = o45.wf.f424560e;
        m87Var.f461788i = str;
        java.lang.String str2 = wo.q.f529318f;
        m87Var.f461789m = str2;
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        m87Var.f461790n = str3;
        java.lang.String str4 = android.os.Build.MANUFACTURER;
        m87Var.f461791o = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "request params=[%s, %s, %s, %s, %s, %s, %s, %s, %s]", m87Var.f461783d, m87Var.f461784e, m17, m87Var.f461786g, str2, str, str2, str3, str4);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f253323d = u0Var;
        return mo9409x10f9447a(sVar, this.f253324e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1947;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "onGYNetEnd %d %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f253323d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f253325f = (r45.n87) this.f253324e.f152244b.f152233a;
            this.f253323d.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class m2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Vector f246001i = new java.util.Vector();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246002d;

    /* renamed from: e, reason: collision with root package name */
    public final long f246003e;

    /* renamed from: f, reason: collision with root package name */
    public final int f246004f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f246005g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246006h;

    public m2(long j17, java.lang.String str) {
        this.f246003e = 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.v76();
        lVar.f152198b = new r45.w76();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsclassifytimeline";
        lVar.f152200d = 601;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246002d = a17;
        this.f246003e = j17;
        this.f246004f = 2;
        r45.v76 v76Var = (r45.v76) a17.f152243a.f152217a;
        v76Var.f469504d = "";
        v76Var.f469505e = j17;
        v76Var.f469506f = str;
        v76Var.f469507g = 1;
        ca4.z0.t0(j17);
    }

    public static synchronized boolean H(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m2.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            java.util.Vector vector = f246001i;
            if (vector.contains(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                return false;
            }
            vector.add(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            return true;
        }
    }

    public static synchronized boolean I(java.lang.String str) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m2.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            f246001i.remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeTimeLineReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        this.f246006h = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f246002d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        return 601;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
        r45.w76 w76Var = (r45.w76) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() != 207 && v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() != 0 && v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8() != 212) {
            I("@__classify_timeline");
            this.f246006h.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            return;
        }
        v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8();
        int i27 = w76Var.f470484g;
        ca4.z0.s0(this.f246003e);
        java.util.Iterator it = w76Var.f470483f.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("objToSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
            if (c17933xe8d1b226.m70441xe9f5bdb7(new java.lang.String(c19806x4c372b7.f38990xb6613a90.f453374f.g()))) {
                c19806x4c372b7.f38990xb6613a90.d(new byte[0]);
                c17933xe8d1b226.m70468x66ad9b78(c19806x4c372b7.f38999xf403ecf6);
                c17933xe8d1b226.m70443x6e018feb(c19806x4c372b7.f38965xc86e6609);
                c17933xe8d1b226.m70448xb8471e25(c19806x4c372b7.f38983x458ee3c3);
                c17933xe8d1b226.m70462x53b40971(c19806x4c372b7.Id);
                c17933xe8d1b226.m70463x5078d04c(c19806x4c372b7.Id);
                c17933xe8d1b226.m70338xbeec15a8(this.f246004f);
                try {
                    c17933xe8d1b226.m70440x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsClassifyTimeLine", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                m70371x485d7.f39018xf3f56116 = c19806x4c372b7.f38999xf403ecf6;
                c17933xe8d1b226.m70460x23d307c3(m70371x485d7.f39017xbebdef61);
                c17933xe8d1b226.m70445x635d8e6b();
                c17933xe8d1b226.m70466xfabce6e3(m70371x485d7);
                c17933xe8d1b226.m70467x4e3c7448(m70371x485d7.f39014x86965dde.f451370e);
                c17933xe8d1b226.m70465x963f7264(m70371x485d7.f39014x86965dde.f451374i);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("objToSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("objToSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
                c17933xe8d1b226 = null;
            }
            if (c17933xe8d1b226 != null) {
                this.f246005g.add(c17933xe8d1b226);
            }
        }
        I("@__classify_timeline");
        this.f246006h.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsClassifyTimeLine");
    }
}

package lr1;

/* loaded from: classes8.dex */
public class f0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static long f402192f;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f402193d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f402194e;

    public static java.util.LinkedList H() {
        try {
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(gm0.j1.u().d() + "search_biz_recommend", 0, Integer.MAX_VALUE);
            if (N != null) {
                r45.dl5 dl5Var = new r45.dl5();
                dl5Var.mo11468x92b714fd(N);
                return dl5Var.f454088e;
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e17, "", new java.lang.Object[0]);
        }
        return new java.util.LinkedList();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        f402192f = java.lang.System.currentTimeMillis();
        this.f402193d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.du3();
        lVar.f152198b = new r45.eu3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/grouprecommendbiz";
        lVar.f152200d = 456;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f402194e = a17;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 456;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.eu3 eu3Var = (r45.eu3) this.f402194e.f152244b.f152233a;
            if (eu3Var.f455262d.f454087d > 0) {
                try {
                    com.p314xaae8f345.mm.vfs.w6.R(gm0.j1.u().d() + "search_biz_recommend", eu3Var.f455262d.mo14344x5f01b1f6());
                    java.util.Iterator it = eu3Var.f455262d.f454088e.iterator();
                    while (it.hasNext()) {
                        java.util.Iterator it6 = ((r45.cl5) it.next()).f453191f.iterator();
                        while (it6.hasNext()) {
                            r45.fx5 fx5Var = (r45.fx5) it6.next();
                            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                            r0Var.f152062a = x51.j1.g(fx5Var.f456234d);
                            r0Var.f152066e = fx5Var.f456249v;
                            r0Var.f152065d = fx5Var.f456250w;
                            r0Var.f152070i = -1;
                            r0Var.f152063b = 3;
                            r0Var.f152067f = 1;
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                        }
                    }
                } catch (java.io.IOException e17) {
                    e17.getMessage();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e17, "", new java.lang.Object[0]);
                }
            } else {
                com.p314xaae8f345.mm.vfs.w6.h(gm0.j1.u().d() + "search_biz_recommend");
            }
        }
        this.f402193d.mo815x76e0bfae(i18, i19, str, this);
    }
}

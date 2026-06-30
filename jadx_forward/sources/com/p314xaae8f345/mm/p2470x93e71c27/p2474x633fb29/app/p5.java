package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f270569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f270570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 f270571f;

    public p5(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 s5Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f270571f = s5Var;
        this.f270569d = m1Var;
        this.f270570e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5.f270601s++;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f270569d;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 s5Var = this.f270571f;
        if (mo808xfb85f7b0 == 222) {
            j18 = -1;
        } else if (m1Var instanceof bt3.l0) {
            s5Var.f270607i = false;
            j18 = ((bt3.l0) m1Var).f105849h;
        } else {
            if (!(m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneAppMsg", "onSceneEnd Error SceneType:" + m1Var.mo808xfb85f7b0());
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5.f270601s = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5.f270601s + (-1);
                return;
            }
            s5Var.f270608m = false;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4 w4Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w4) m1Var;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = w4Var.f270648f;
            java.lang.String str = dVar == null ? null : dVar.f68105x2c1f0acb;
            java.lang.String str2 = (java.lang.String) s5Var.f270602d.remove(java.lang.Long.valueOf(dVar == null ? 0L : dVar.f68106x315a5445));
            boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w4Var.f270659t);
            long j19 = w4Var.f270651i;
            if (!z17 && !w4Var.f270660u && !w4Var.f270661v && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(j19, dVar2);
                if (dVar2.f72763xa3c65b86 == j19) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.y(dVar2.f68106x315a5445, dVar2.f68107xaaaa6883, str, null, true);
                    j17 = j19;
                    c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4(dVar2.f68107xaaaa6883, dVar2.f68106x315a5445, str2, null));
                    j18 = j17;
                }
            }
            j17 = j19;
            j18 = j17;
        }
        if (j18 != -1) {
            if (((java.util.HashMap) s5Var.f270606h).get(java.lang.Long.valueOf(j18)) != null) {
                java.util.Map map = s5Var.f270606h;
                ((fp.j) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j18))).a();
                ((java.util.HashMap) map).remove(java.lang.Long.valueOf(j18));
            }
        }
        m1Var.mo808xfb85f7b0();
        if (this.f270570e != 0) {
            s5Var.f270610o--;
        }
        int i17 = s5Var.f270610o;
        boolean z18 = s5Var.f270607i;
        boolean z19 = s5Var.f270608m;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5.a(s5Var);
        } else if (!z19 && !z18) {
            s5Var.c();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5.f270601s--;
    }

    /* renamed from: toString */
    public java.lang.String m75179x9616526c() {
        return super.toString() + "|onSceneEnd";
    }
}

package aq1;

/* loaded from: classes11.dex */
public class d implements vg3.g3 {
    public final void a(r45.j4 j4Var, c01.ea eaVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        c01.d9.b().p().w(73729, 1);
        java.lang.String P0 = z3Var.P0();
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
        t8Var.f66507xad49e234 = x51.j1.g(j4Var.f459094h);
        t8Var.f66508xad24a2e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        t8Var.f66510xe6e11023 = "";
        t8Var.f66512x7236dff2 = j4Var.f459093g == 3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7b) : x51.j1.g(j4Var.f459094h);
        t8Var.f66514x49f69af2 = g17;
        t8Var.f66515x29cbf907 = 18;
        int i17 = j4Var.f459095i;
        t8Var.f66516x10a0fed7 = i17 > 3 ? i17 : 3;
        t8Var.f66517x29d4cc45 = j4Var.f459101r;
        t8Var.f66518x114ef53e = P0;
        t8Var.f66520x2262335f = j4Var.f459093g;
        t8Var.f66511xff7bdab7 = 0;
        t8Var.f66513xe76baaa9 = g17;
        t8Var.f66519x11bb99f1 = eaVar.f118683i;
        r21.w.Bi().mo880xb970c2b9(t8Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b();
        c5672xb6c0812b.f135997g.f88959a = g17;
        c5672xb6c0812b.e();
    }

    @Override // vg3.g3
    public void l(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
        r45.j4 j4Var = p0Var.f152259a;
        c01.ea w17 = c01.w9.w(j4Var.f459099p);
        if (w17 != null) {
            f9Var.p3(w17.f118680f);
            f9Var.o3(w17.f118681g);
            f9Var.a1(w17.f118679e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseMsgCallbackImpl", "bizClientMsgId = %s", w17.f118679e);
            if (w17.f118683i == null || w17.f118684j != 1 || j4Var.f459093g == 10000) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) > 0) {
                a(j4Var, w17, n17);
                return;
            }
            ((c01.k7) c01.n8.a()).b(str, 10, new aq1.c(this, str, j4Var, w17));
        }
    }

    @Override // vg3.g3
    public void m(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
    }
}

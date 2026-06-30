package bm5;

/* loaded from: classes12.dex */
public abstract class d0 {
    public static java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 resType, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        boolean z28 = f9Var.I0() == 0;
        return bm5.c0.f104083a.k(bm5.w.a(f9Var), resType, f9Var.Q0(), z28, z28 ? f9Var.m124847x74d37ac6() : f9Var.I0(), null, z19, z27);
    }

    public static final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 resType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        java.lang.String m17 = bm5.c0.m(bm5.c0.f104083a, bm5.w.a(f9Var), resType, f9Var.Q0(), true, f9Var.m124847x74d37ac6(), null, false, false, 96, null);
        if (com.p314xaae8f345.mm.vfs.w6.j(m17)) {
            java.lang.String a17 = a(f9Var, resType, false, true, 2, null);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m17, a17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPath", "move c2c temp file, src[" + m17 + "] -> dst[" + a17 + "], businessType: " + bm5.w.a(f9Var) + ", resType: " + resType + ", talker: " + f9Var.Q0() + ", localId: " + f9Var.m124847x74d37ac6() + ", svrId: " + f9Var.I0() + ", ret: " + com.p314xaae8f345.mm.vfs.w6.x(m17, a17, true));
                return a17;
            }
        }
        return m17;
    }
}

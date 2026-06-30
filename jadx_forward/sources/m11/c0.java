package m11;

/* loaded from: classes9.dex */
public abstract class c0 {
    public static java.lang.String a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        return kk.k.g((str + "-" + com.p314xaae8f345.mm.vfs.w6.k(str)).getBytes());
    }

    public static java.lang.String b(m11.b0 b0Var) {
        return b0Var == null ? "" : b0Var.j() ? m11.b1.Di().C1(java.lang.Long.valueOf(b0Var.f404182q)).f404170e : b0Var.f404170e;
    }

    public static java.lang.String c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var) {
        if (b0Var == null) {
            return "";
        }
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104096h, b0Var.f404171f, "", "", true, false);
        if (com.p314xaae8f345.mm.vfs.w6.j(bj6)) {
            return bj6;
        }
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.c0.f104083a.d(b0Var.l()), b0Var.f404170e, "", "", true, false);
    }

    public static m11.b0 d(m11.b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        return b0Var.j() ? m11.b1.Di().C1(java.lang.Long.valueOf(b0Var.f404182q)) : b0Var;
    }
}

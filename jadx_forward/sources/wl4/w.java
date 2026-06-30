package wl4;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final wl4.w f528637a = new wl4.w();

    public final rl4.c a(bw5.eq0 id6, bw5.cq0 cq0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        int ordinal = id6.ordinal();
        if (ordinal == 0) {
            return wl4.a.f528616a;
        }
        if (ordinal == 3) {
            return wl4.f.f528621a;
        }
        if (ordinal == 4) {
            return wl4.b.f528617a;
        }
        if (ordinal == 7) {
            return wl4.d.f528619a;
        }
        if (ordinal == 8) {
            return wl4.v.f528636a;
        }
        if (ordinal != 9) {
            return new wl4.c(id6);
        }
        bw5.dq0 dq0Var = bw5.dq0.FloatBallTypeMusic;
        bw5.dq0 dq0Var2 = cq0Var != null ? cq0Var.f107733m[4] ? cq0Var.f107730g : dq0Var : null;
        if (dq0Var2 != null) {
            dq0Var = dq0Var2;
        }
        return new wl4.e(dq0Var);
    }
}

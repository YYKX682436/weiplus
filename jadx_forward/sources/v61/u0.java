package v61;

/* loaded from: classes13.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f515012a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f515013b = null;

    public static void a(v61.t0 t0Var) {
        int ordinal = t0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f515012a = 0;
                if (f515013b == null) {
                    f515013b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new v61.s0(), true);
                }
                f515013b.c(900000L, 900000L);
                return;
            }
            if (ordinal != 2) {
                return;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f515013b;
        if (b4Var != null) {
            b4Var.d();
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(36);
        f515012a = 0;
        f515013b = null;
    }
}

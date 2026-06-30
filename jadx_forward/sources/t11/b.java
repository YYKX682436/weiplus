package t11;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f496089a = lp0.b.D() + ".tmp";

    /* renamed from: b, reason: collision with root package name */
    public static long f496090b = 0;

    public static boolean a() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f496089a);
        try {
            if (r6Var.m() && !r6Var.A()) {
                b(r6Var, true);
            }
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] clean tmp file path exception.");
            return false;
        }
    }

    public static void b(com.p314xaae8f345.mm.vfs.r6 r6Var, boolean z17) {
        if (r6Var != null && r6Var.m() && r6Var.y()) {
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
            if (G != null && G.length > 0) {
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    if (r6Var2 != null && r6Var2.m()) {
                        if (!r6Var2.A()) {
                            if ((java.lang.System.currentTimeMillis() - r6Var2.B() >= 259200000) && z17) {
                                b(r6Var2, false);
                            }
                        } else if (r6Var2.A() && r6Var2.m()) {
                            r6Var2.l();
                        }
                    }
                }
            }
            r6Var.l();
        }
    }
}

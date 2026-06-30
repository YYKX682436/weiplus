package hy4;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return;
        }
        if (r6Var.y()) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : r6Var.G()) {
                a(r6Var2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ABI64WebViewCompat", "delete isSuccessDelete: %s fileName: %s", java.lang.Boolean.valueOf(r6Var.l()), r6Var.o());
    }
}

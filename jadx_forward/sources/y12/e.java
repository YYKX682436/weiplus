package y12;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static y12.e f540389c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f540390a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.regex.Pattern f540391b = java.util.regex.Pattern.compile("_\\d");

    public static y12.e b() {
        if (f540389c == null) {
            synchronized (y12.e.class) {
                f540389c = new y12.e();
            }
        }
        return f540389c;
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (G = r6Var.G()) == null || G.length <= 0) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.y()) {
                a(r6Var2.u());
            } else {
                r6Var2.m82467xfb82e301();
                r6Var2.l();
            }
        }
    }

    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y() || (G = r6Var.G()) == null || G.length <= 0) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            if (!this.f540390a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "stop run");
                return;
            }
            if (r6Var2.y()) {
                c(r6Var2.u());
            } else {
                java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                if (this.f540391b.matcher(m82467xfb82e301).find() || m82467xfb82e301.startsWith("temp")) {
                    r6Var2.l();
                }
            }
        }
    }
}

package ss3;

/* loaded from: classes5.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss3.c0 f493528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f493529e;

    public a0(ss3.c0 c0Var, int i17) {
        this.f493528d = c0Var;
        this.f493529e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(g83.a.a());
        boolean m17 = r6Var.m();
        ss3.c0 c0Var = this.f493528d;
        if (!m17 || !r6Var.y()) {
            ss3.d0.Ai(c0Var);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G == null || G.length <= 0) {
            ss3.d0.Ai(c0Var);
            return;
        }
        int i17 = this.f493529e;
        java.lang.String format = java.lang.String.format("reader_%d_", java.lang.Integer.valueOf(i17));
        java.lang.String format2 = java.lang.String.format("ReaderApp_%d", java.lang.Integer.valueOf(i17));
        for (int i18 = 0; i18 < G.length; i18++) {
            if (c0Var != null && c0Var.a()) {
                ss3.d0.Ai(c0Var);
                return;
            }
            if (G[i18].m82467xfb82e301().startsWith(format)) {
                G[i18].l();
            }
            if (G[i18].m82467xfb82e301().startsWith(format2)) {
                G[i18].l();
            }
        }
        ss3.d0.Ai(c0Var);
    }

    /* renamed from: toString */
    public java.lang.String m165149x9616526c() {
        return super.toString() + "|deleteAllPic";
    }
}

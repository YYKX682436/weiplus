package rs3;

/* loaded from: classes5.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f480869d;

    public f(boolean z17) {
        this.f480869d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f480869d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginReaderApp", "set pluginReaderApp install %b", java.lang.Boolean.valueOf(z17));
        int n17 = c01.z1.n();
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-524289) : n17 | 524288));
        r45.u85 u85Var = new r45.u85();
        u85Var.f468669d = 524288;
        u85Var.f468670e = !z17 ? 1 : 0;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        if (z17) {
            rs3.h.Ai(true);
        } else {
            ss3.d0.wi(null);
            rs3.h.Ai(false);
        }
    }
}

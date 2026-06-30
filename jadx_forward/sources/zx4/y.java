package zx4;

/* loaded from: classes8.dex */
public final class y implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f558742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558743e;

    public y(java.lang.ref.WeakReference weakReference, zx4.l0 l0Var) {
        this.f558742d = weakReference;
        this.f558743e = l0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        nw4.n nVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "onScreenShot, path: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f558742d.get();
        boolean z18 = false;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null && (nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0) != null && (c22633x83752a59 = viewOnCreateContextMenuListenerC19337x37f3384d.f265348f) != null) {
            nVar.a0(c22633x83752a59.mo120156xb5887639(), viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getBundleExtra("ad_report_bundle"), (viewOnCreateContextMenuListenerC19337x37f3384d.f265409z1.b().f273710d & 1048576) > 0);
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.J2) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2;
        if (c6Var != null && c6Var.z(viewOnCreateContextMenuListenerC19337x37f3384d.C7(), 456) && viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.n(57) && !java.lang.Boolean.TRUE.equals(viewOnCreateContextMenuListenerC19337x37f3384d.Q1.get(viewOnCreateContextMenuListenerC19337x37f3384d.x7()))) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = viewOnCreateContextMenuListenerC19337x37f3384d.f265348f;
            if (c22633x83752a592 != null && c22633x83752a592.z0()) {
                z18 = true;
            }
            if (!z18 || str == null) {
                return;
            }
            this.f558743e.h(viewOnCreateContextMenuListenerC19337x37f3384d, str);
        }
    }
}

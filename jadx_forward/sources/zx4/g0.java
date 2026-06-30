package zx4;

/* loaded from: classes8.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f558668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f558669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f558670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f558671g;

    public g0(zx4.l0 l0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f558668d = l0Var;
        this.f558669e = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f558670f = z17;
        this.f558671g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebviewScreenShotHelper", "captureResult failed: permission denied");
        zx4.l0.c(this.f558668d, this.f558669e, this.f558670f, this.f558671g);
    }
}

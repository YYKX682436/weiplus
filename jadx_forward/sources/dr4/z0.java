package dr4;

/* loaded from: classes14.dex */
public final class z0 implements android.hardware.display.DisplayManager.DisplayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324302d;

    public z0(dr4.p1 p1Var) {
        this.f324302d = p1Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onDisplayAdded: " + i17);
        this.f324302d.c();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onDisplayChanged: " + i17);
        this.f324302d.c();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onDisplayRemoved: " + i17);
        this.f324302d.c();
    }
}

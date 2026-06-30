package bj0;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 f102653d;

    public n(com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263) {
        this.f102653d = c10717xfba6b263;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f102653d;
        io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "do switchToSurfaceView onNextFrameDisplayed");
        c10717xfba6b263.f149678w = false;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = c10717xfba6b263.f149670o;
        if (c28553x45ef20c1 != null) {
            c28553x45ef20c1.m137284xfa380ad9(true);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263.a(c10717xfba6b263, bj0.f.f102638e);
        if (c10717xfba6b263.B == 0) {
            c10717xfba6b263.B = java.lang.System.currentTimeMillis();
            io.p3284xd2ae381c.Log.i(c10717xfba6b263.C, "mark snapshotRenderMills:" + c10717xfba6b263.B);
        }
    }
}

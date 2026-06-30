package ls0;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402473d;

    public w(ls0.r0 r0Var) {
        this.f402473d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402473d.f402449t, "delay check frameDraw: " + this.f402473d.f402431f0);
        if (this.f402473d.f402431f0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402473d.f402449t, "after 1000 ms, first frame stil not draw!!!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawTimeout");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 54L, 1L);
    }
}

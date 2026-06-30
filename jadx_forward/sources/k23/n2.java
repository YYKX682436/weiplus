package k23;

/* loaded from: classes12.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.p2 f385166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f385167e;

    public n2(k23.p2 p2Var, int i17) {
        this.f385166d = p2Var;
        this.f385167e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        k23.p2 p2Var = this.f385166d;
        p2Var.m141803xca568c10().getLocationInWindow(iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSStartRecognizeBtn", "DIAG setMarginBottomPx(" + this.f385167e + ") -> startBtn topInWindow=" + iArr[1] + " bottomInWindow=" + (iArr[1] + p2Var.m141803xca568c10().getHeight()) + " rootHeight=" + p2Var.f385185o.getRootView().getHeight());
    }
}

package k23;

/* loaded from: classes12.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385114d;

    public h2(k23.j2 j2Var) {
        this.f385114d = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.j2 j2Var = this.f385114d;
        if (j2Var.m141803xca568c10().getWidth() > 0 && j2Var.m141803xca568c10().getHeight() > 0) {
            k23.j2.h(j2Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation: startBtn size is 0, skip");
            j2Var.G = false;
        }
    }
}

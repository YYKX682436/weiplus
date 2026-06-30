package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class h1 implements android.view.Choreographer.FrameCallback, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.i1 f10575d;

    public h1(androidx.compose.ui.platform.i1 i1Var) {
        this.f10575d = i1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        this.f10575d.f10590f.removeCallbacks(this);
        androidx.compose.ui.platform.i1.K(this.f10575d);
        androidx.compose.ui.platform.i1 i1Var = this.f10575d;
        synchronized (i1Var.f10591g) {
            if (i1Var.f10596o) {
                i1Var.f10596o = false;
                java.util.List list = i1Var.f10593i;
                i1Var.f10593i = i1Var.f10594m;
                i1Var.f10594m = list;
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    ((android.view.Choreographer.FrameCallback) list.get(i17)).doFrame(j17);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.compose.ui.platform.i1.K(this.f10575d);
        androidx.compose.ui.platform.i1 i1Var = this.f10575d;
        synchronized (i1Var.f10591g) {
            if (i1Var.f10593i.isEmpty()) {
                i1Var.f10589e.removeFrameCallback(this);
                i1Var.f10596o = false;
            }
        }
    }
}

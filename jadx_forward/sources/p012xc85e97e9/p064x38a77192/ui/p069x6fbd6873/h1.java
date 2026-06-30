package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class h1 implements android.view.Choreographer.FrameCallback, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 f92108d;

    public h1(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var) {
        this.f92108d = i1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        this.f92108d.f92123f.removeCallbacks(this);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1.K(this.f92108d);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var = this.f92108d;
        synchronized (i1Var.f92124g) {
            if (i1Var.f92129o) {
                i1Var.f92129o = false;
                java.util.List list = i1Var.f92126i;
                i1Var.f92126i = i1Var.f92127m;
                i1Var.f92127m = list;
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
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1.K(this.f92108d);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var = this.f92108d;
        synchronized (i1Var.f92124g) {
            if (i1Var.f92126i.isEmpty()) {
                i1Var.f92122e.removeFrameCallback(this);
                i1Var.f92129o = false;
            }
        }
    }
}

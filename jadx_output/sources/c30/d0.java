package c30;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f38105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38106e;

    public d0(c30.f0 f0Var, int i17) {
        this.f38105d = f0Var;
        this.f38106e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c30.f0 f0Var = this.f38105d;
        f0Var.f38114e = false;
        c30.h0 h0Var = f0Var.f38118i;
        if (h0Var != null) {
            com.tencent.mars.xlog.Log.i("EcsWeShopMonitor", "onEndErrorLoad, identifier: " + this.f38106e + ", cost: " + (android.os.SystemClock.elapsedRealtime() - h0Var.f38128d));
        }
    }
}

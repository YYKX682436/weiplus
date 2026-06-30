package c30;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f119638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119639e;

    public d0(c30.f0 f0Var, int i17) {
        this.f119638d = f0Var;
        this.f119639e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c30.f0 f0Var = this.f119638d;
        f0Var.f119647e = false;
        c30.h0 h0Var = f0Var.f119651i;
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMonitor", "onEndErrorLoad, identifier: " + this.f119639e + ", cost: " + (android.os.SystemClock.elapsedRealtime() - h0Var.f119661d));
        }
    }
}

package in5;

/* loaded from: classes10.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.v0 f374621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f374622e;

    public l1(in5.v0 v0Var, in5.s0 s0Var) {
        this.f374621d = v0Var;
        this.f374622e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f374622e;
        int measuredWidth = s0Var.f3639x46306858.getMeasuredWidth();
        in5.v0 v0Var = this.f374621d;
        v0Var.f374677b = measuredWidth;
        v0Var.f374678c = s0Var.f3639x46306858.getMeasuredHeight();
    }
}

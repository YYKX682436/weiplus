package gm0;

/* loaded from: classes12.dex */
public class k0 implements java.lang.Runnable, wu5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f354758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gm0.b0 f354759e;

    public k0(gm0.b0 b0Var, gm0.d0 d0Var) {
        this.f354759e = b0Var;
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f354758d = future;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.b0 b0Var = this.f354759e;
        b0Var.f354697q = java.lang.Boolean.valueOf(b0Var.l());
    }
}

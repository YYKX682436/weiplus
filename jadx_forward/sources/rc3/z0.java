package rc3;

/* loaded from: classes7.dex */
public final class z0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.d0 f475652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f475653e;

    public z0(lc3.d0 d0Var, lc3.a0 a0Var) {
        this.f475652d = d0Var;
        this.f475653e = a0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return this.f475652d.r(this.f475653e);
    }
}

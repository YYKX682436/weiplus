package rc3;

/* loaded from: classes7.dex */
public final class k implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.d0 f475546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f475547e;

    public k(lc3.d0 d0Var, lc3.a0 a0Var) {
        this.f475546d = d0Var;
        this.f475547e = a0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return this.f475546d.r(this.f475547e);
    }
}

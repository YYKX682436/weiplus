package rk4;

/* loaded from: classes11.dex */
public final class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f478162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f478163e;

    public e6(rk4.p6 p6Var, boolean z17) {
        this.f478162d = p6Var;
        this.f478163e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f478162d.wi(this.f478163e ? 1125 : 1124, null, null, null);
    }
}

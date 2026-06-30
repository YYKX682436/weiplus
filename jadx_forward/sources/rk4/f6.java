package rk4;

/* loaded from: classes11.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f478184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f478185e;

    public f6(rk4.p6 p6Var, int i17) {
        this.f478184d = p6Var;
        this.f478185e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f478184d.wi(this.f478185e, null, null, null);
    }
}

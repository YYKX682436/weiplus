package rk4;

/* loaded from: classes11.dex */
public final class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f478397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.xb0 f478398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478399f;

    public n6(rk4.p6 p6Var, bw5.xb0 xb0Var, java.lang.String str) {
        this.f478397d = p6Var;
        this.f478398e = xb0Var;
        this.f478399f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f478397d.wi(1119, this.f478398e, this.f478399f, null);
    }
}

package rk4;

/* loaded from: classes11.dex */
public final class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f478144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.yq0 f478145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.xb0 f478146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478147g;

    public d6(rk4.p6 p6Var, bw5.yq0 yq0Var, bw5.xb0 xb0Var, java.lang.String str) {
        this.f478144d = p6Var;
        this.f478145e = yq0Var;
        this.f478146f = xb0Var;
        this.f478147g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f478144d.wi(this.f478145e.f117159d, this.f478146f, this.f478147g, null);
    }
}

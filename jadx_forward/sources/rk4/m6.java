package rk4;

/* loaded from: classes11.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f478381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.yq0 f478382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.xb0 f478383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478384g;

    public m6(rk4.p6 p6Var, bw5.yq0 yq0Var, bw5.xb0 xb0Var, java.lang.String str) {
        this.f478381d = p6Var;
        this.f478382e = yq0Var;
        this.f478383f = xb0Var;
        this.f478384g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f478381d.wi(this.f478382e.f117159d, this.f478383f, this.f478384g, null);
    }
}

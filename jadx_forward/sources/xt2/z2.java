package xt2;

/* loaded from: classes3.dex */
public final class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f538671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f538672f;

    public z2(xt2.e3 e3Var, cm2.m0 m0Var, float f17, long j17) {
        this.f538670d = e3Var;
        this.f538671e = m0Var;
        this.f538672f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xt2.e3 e3Var = this.f538670d;
        e3Var.m(this.f538671e);
        e3Var.f538252w.post(new xt2.y2(e3Var, this.f538672f, 300L));
    }
}

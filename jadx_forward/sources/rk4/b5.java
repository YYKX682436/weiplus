package rk4;

/* loaded from: classes10.dex */
public final class b5 implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d f478095a;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d) {
        this.f478095a = activityC18699x6096e65d;
    }

    @Override // al4.b
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d = this.f478095a;
        rk4.k5.c("onAnimationCancel switchToSurfaceView", activityC18699x6096e65d.getB());
        activityC18699x6096e65d.Y6();
    }

    @Override // al4.b
    /* renamed from: onAnimationEnd */
    public void mo2271xbb3aa236() {
        rk4.k5.c("onAnimationEnd switchToSurfaceView", this.f478095a.getB());
        ((ku5.t0) ku5.t0.f394148d).B(new rk4.a5(this.f478095a));
    }

    @Override // al4.b
    /* renamed from: onAnimationStart */
    public void mo2272xd7e2f2fd() {
        this.f478095a.Z6();
    }
}

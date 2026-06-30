package rk4;

/* loaded from: classes10.dex */
public final class d5 implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d f478143a;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d) {
        this.f478143a = activityC18699x6096e65d;
    }

    @Override // al4.b
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.a7(this.f478143a, false);
    }

    @Override // al4.b
    /* renamed from: onAnimationEnd */
    public void mo2271xbb3aa236() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.a7(this.f478143a, true);
    }

    @Override // al4.b
    /* renamed from: onAnimationStart */
    public void mo2272xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d = this.f478143a;
        rk4.k5.c("onAnimationStart switchToTextureView", activityC18699x6096e65d.getB());
        activityC18699x6096e65d.Z6();
    }
}

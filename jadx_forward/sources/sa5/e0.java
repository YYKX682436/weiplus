package sa5;

/* loaded from: classes14.dex */
public final class e0 extends sa5.e {

    /* renamed from: f, reason: collision with root package name */
    public final sa5.r0 f486869f;

    public e0(sa5.r0 direction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        this.f486869f = direction;
        this.f486883c = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(direction, sa5.x.f486906a) ? new sa5.w(sa5.y.f486907d, sa5.z.f486908d, null, 4, null) : new sa5.w(sa5.a0.f486852d, sa5.b0.f486859d, null, 4, null);
    }

    @Override // sa5.e, sa5.j
    public void d() {
        super.d();
        android.view.View view = this.f486884d;
        if (view != null) {
            view.setClipToOutline(true);
        }
        android.view.View view2 = this.f486884d;
        if (view2 == null) {
            return;
        }
        view2.setOutlineProvider(new sa5.c0());
    }

    @Override // sa5.e, sa5.j
    public boolean e() {
        android.view.View view = this.f486884d;
        return view != null && view.getVisibility() == 0;
    }

    @Override // sa5.j
    public void h(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486869f, sa5.x.f486906a);
        float animatedFraction = animation.getAnimatedFraction();
        android.view.View view = this.f486884d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new sa5.d0(b17, animatedFraction));
    }
}

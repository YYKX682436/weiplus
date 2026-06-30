package sa5;

/* loaded from: classes14.dex */
public final class n0 extends sa5.f {

    /* renamed from: f, reason: collision with root package name */
    public final sa5.r0 f486893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sa5.r0 direction) {
        super(0, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        this.f486893f = direction;
        this.f486883c = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(direction, sa5.x.f486906a) ? new sa5.w(sa5.i0.f486880d, sa5.j0.f486885d, null, 4, null) : new sa5.w(sa5.k0.f486888d, sa5.l0.f486889d, null, 4, null);
    }

    @Override // sa5.j
    public void h(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486893f, sa5.x.f486906a);
        float animatedFraction = animation.getAnimatedFraction();
        android.view.View view = this.f486884d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new sa5.m0(b17, animatedFraction));
    }
}

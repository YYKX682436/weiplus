package ln5;

/* loaded from: classes15.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f401449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f401450e;

    public a(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, boolean z17) {
        this.f401449d = c22851x22587864;
        this.f401450e = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f401449d;
        if (c22851x22587864.A.f502405e == null || c22851x22587864.getHeaderPlugin() == null) {
            return;
        }
        tn5.j jVar = c22851x22587864.f295286z;
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        jVar.a(((java.lang.Integer) animatedValue).intValue(), true, this.f401450e);
    }
}

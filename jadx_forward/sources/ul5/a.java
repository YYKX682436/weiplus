package ul5;

/* loaded from: classes3.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22714xbbd3aea4 f510157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f510158e;

    public a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22714xbbd3aea4 c22714xbbd3aea4, android.view.View view) {
        this.f510157d = c22714xbbd3aea4;
        this.f510158e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        this.f510157d.getClass();
        android.view.View child = this.f510158e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        child.setTranslationY(intValue);
    }
}

package bh5;

/* loaded from: classes14.dex */
public final class v0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f102499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104 f102500e;

    public v0(android.view.ViewGroup.LayoutParams layoutParams, com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104 c22416x4a36f104) {
        this.f102499d = layoutParams;
        this.f102500e = c22416x4a36f104;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f102499d;
        layoutParams.height = intValue;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104 c22416x4a36f104 = this.f102500e;
        c22416x4a36f104.o0().setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c c22412x5e02431c = c22416x4a36f104.f290345p;
    }
}

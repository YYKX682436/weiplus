package rf4;

/* loaded from: classes4.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 f476566d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7) {
        this.f476566d = c18474x76daa3b7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7 = this.f476566d;
        android.view.ViewGroup.LayoutParams layoutParams = c18474x76daa3b7.getLayoutParams();
        int i17 = c18474x76daa3b7.f253422n;
        layoutParams.width = ((int) ((c18474x76daa3b7.f253424p - i17) * floatValue)) + i17;
        layoutParams.height = i17 + ((int) ((c18474x76daa3b7.f253423o - i17) * floatValue));
        c18474x76daa3b7.setLayoutParams(layoutParams);
    }
}

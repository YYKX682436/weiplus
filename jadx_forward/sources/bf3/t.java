package bf3;

/* loaded from: classes7.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebView f101195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bf3.z f101196e;

    public t(android.webkit.WebView webView, bf3.z zVar) {
        this.f101195d = webView;
        this.f101196e = zVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        boolean z17 = ((java.lang.Float) animatedValue).floatValue() == 1.0f;
        android.webkit.WebView webView = this.f101195d;
        if (z17) {
            webView.setVisibility(8);
            return;
        }
        java.lang.Object animatedValue2 = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        webView.setTranslationY(((java.lang.Float) animatedValue2).floatValue() * this.f101196e.f());
        webView.requestLayout();
    }
}

package xw5;

/* loaded from: classes8.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebView f539299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw5.d f539300e;

    public e(android.webkit.WebView webView, xw5.d dVar) {
        this.f539299d = webView;
        this.f539300e = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        boolean z17 = ((java.lang.Float) animatedValue).floatValue() == 1.0f;
        android.webkit.WebView webView = this.f539299d;
        if (z17) {
            webView.setVisibility(8);
            return;
        }
        java.lang.Object animatedValue2 = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        webView.setTranslationY(((java.lang.Float) animatedValue2).floatValue() * ((java.lang.Number) ((jz5.n) this.f539300e.f539280b).mo141623x754a37bb()).floatValue());
        webView.requestLayout();
    }
}

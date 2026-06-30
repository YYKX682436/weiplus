package bf3;

/* loaded from: classes7.dex */
public final class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebView f101190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bf3.z f101191e;

    public s(android.webkit.WebView webView, bf3.z zVar) {
        this.f101190d = webView;
        this.f101191e = zVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue() * this.f101191e.f();
        android.webkit.WebView webView = this.f101190d;
        webView.setTranslationY(floatValue);
        webView.requestLayout();
    }
}

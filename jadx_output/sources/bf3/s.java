package bf3;

/* loaded from: classes7.dex */
public final class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebView f19657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bf3.z f19658e;

    public s(android.webkit.WebView webView, bf3.z zVar) {
        this.f19657d = webView;
        this.f19658e = zVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue() * this.f19658e.f();
        android.webkit.WebView webView = this.f19657d;
        webView.setTranslationY(floatValue);
        webView.requestLayout();
    }
}

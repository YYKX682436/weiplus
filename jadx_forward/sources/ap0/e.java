package ap0;

/* loaded from: classes2.dex */
public final class e implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp0.n f94125a;

    public e(cp0.n nVar) {
        this.f94125a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        cp0.n nVar = this.f94125a;
        android.view.View b17 = nVar != null ? nVar.b() : null;
        if (b17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/loader/impr/DefaultImageLoaderAnimation$onLoadCompleted$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(b17, "com/tencent/mm/loader/impr/DefaultImageLoaderAnimation$onLoadCompleted$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}

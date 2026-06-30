package ah1;

/* loaded from: classes7.dex */
public final class g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f4825e;

    public g(android.view.View view, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f4824d = view;
        this.f4825e = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f4824d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.setTranslationY(view.getMeasuredHeight());
        android.view.ViewPropertyAnimator duration = view.animate().setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationY(0.0f).setDuration(300L);
        duration.setListener(new ah1.h(this.f4825e));
        duration.start();
        return true;
    }
}

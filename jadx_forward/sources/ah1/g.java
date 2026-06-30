package ah1;

/* loaded from: classes7.dex */
public final class g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f86358e;

    public g(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f86357d = view;
        this.f86358e = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f86357d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.setTranslationY(view.getMeasuredHeight());
        android.view.ViewPropertyAnimator duration = view.animate().setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationY(0.0f).setDuration(300L);
        duration.setListener(new ah1.h(this.f86358e));
        duration.start();
        return true;
    }
}

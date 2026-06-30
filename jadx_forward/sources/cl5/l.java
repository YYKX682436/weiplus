package cl5;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl5.n f124526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124527e;

    public l(cl5.n nVar, android.view.View view) {
        this.f124526d = nVar;
        this.f124527e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.yk.c("PushBanner", "show banner!!", new java.lang.Object[0]);
        android.view.View view = this.f124527e;
        int measuredHeight = view.getMeasuredHeight();
        cl5.n nVar = this.f124526d;
        nVar.f124534f = measuredHeight;
        android.animation.Animator animator = nVar.f124537i;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-nVar.f124534f, 0);
        android.view.View view2 = nVar.f124530b;
        if (view2 != null) {
            ofInt.addUpdateListener(new cl5.j(view2, nVar));
        }
        ofInt.addListener(new cl5.k(view, nVar));
        ofInt.setDuration(200L);
        ofInt.start();
        nVar.f124537i = ofInt;
    }
}

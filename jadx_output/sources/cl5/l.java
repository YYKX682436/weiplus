package cl5;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl5.n f42993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42994e;

    public l(cl5.n nVar, android.view.View view) {
        this.f42993d = nVar;
        this.f42994e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.yk.c("PushBanner", "show banner!!", new java.lang.Object[0]);
        android.view.View view = this.f42994e;
        int measuredHeight = view.getMeasuredHeight();
        cl5.n nVar = this.f42993d;
        nVar.f43001f = measuredHeight;
        android.animation.Animator animator = nVar.f43004i;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-nVar.f43001f, 0);
        android.view.View view2 = nVar.f42997b;
        if (view2 != null) {
            ofInt.addUpdateListener(new cl5.j(view2, nVar));
        }
        ofInt.addListener(new cl5.k(view, nVar));
        ofInt.setDuration(200L);
        ofInt.start();
        nVar.f43004i = ofInt;
    }
}

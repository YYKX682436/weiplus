package uj3;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.g f509794d;

    public f(uj3.g gVar) {
        this.f509794d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withStartAction;
        uj3.g gVar = this.f509794d;
        if (gVar.f509808h) {
            return;
        }
        android.view.View view = gVar.f509803c;
        if (view != null) {
            view.clearAnimation();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = gVar.f509802b;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(0);
        }
        android.view.View view2 = gVar.f509803c;
        if (view2 == null || (animate = view2.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(100L)) == null || (withStartAction = duration.withStartAction(new uj3.e(gVar))) == null) {
            return;
        }
        withStartAction.start();
    }
}

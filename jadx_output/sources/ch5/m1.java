package ch5;

/* loaded from: classes3.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen f41607d;

    public m1(com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen webSearchHomeHalfScreen) {
        this.f41607d = webSearchHomeHalfScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen webSearchHomeHalfScreen = this.f41607d;
        android.view.View view = (android.view.View) ((jz5.n) webSearchHomeHalfScreen.G).getValue();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = (android.view.View) ((jz5.n) webSearchHomeHalfScreen.G).getValue();
        if (view2 == null || (animate = view2.animate()) == null || (alpha = animate.alpha(0.3f)) == null) {
            return;
        }
        alpha.setInterpolator(ta5.h.f416879a.a());
        alpha.setDuration(300L);
        alpha.start();
    }
}

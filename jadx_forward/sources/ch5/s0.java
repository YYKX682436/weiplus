package ch5;

/* loaded from: classes3.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 f123155d;

    public s0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7) {
        this.f123155d = c22421x5301a0d7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7 = this.f123155d;
        android.view.View view2 = (android.view.View) ((jz5.n) c22421x5301a0d7.R).mo141623x754a37bb();
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/halfscreen/custom/MPWebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/halfscreen/custom/MPWebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (((java.lang.Boolean) ((jz5.n) c22421x5301a0d7.N).mo141623x754a37bb()).booleanValue() || (view = (android.view.View) ((jz5.n) c22421x5301a0d7.R).mo141623x754a37bb()) == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.3f)) == null) {
            return;
        }
        alpha.setInterpolator(ta5.h.f498412a.a());
        alpha.setDuration(300L);
        alpha.start();
    }
}

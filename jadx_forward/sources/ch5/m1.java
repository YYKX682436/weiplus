package ch5;

/* loaded from: classes3.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22427xcffdd1da f123140d;

    public m1(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22427xcffdd1da c22427xcffdd1da) {
        this.f123140d = c22427xcffdd1da;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22427xcffdd1da c22427xcffdd1da = this.f123140d;
        android.view.View view = (android.view.View) ((jz5.n) c22427xcffdd1da.G).mo141623x754a37bb();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen$onViewCreated$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = (android.view.View) ((jz5.n) c22427xcffdd1da.G).mo141623x754a37bb();
        if (view2 == null || (animate = view2.animate()) == null || (alpha = animate.alpha(0.3f)) == null) {
            return;
        }
        alpha.setInterpolator(ta5.h.f498412a.a());
        alpha.setDuration(300L);
        alpha.start();
    }
}

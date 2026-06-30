package uw0;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513134d;

    public s(uw0.x xVar) {
        this.f513134d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m170643xc24d69b7;
        android.view.View m170643xc24d69b72;
        uw0.x xVar = this.f513134d;
        m170643xc24d69b7 = xVar.m170643xc24d69b7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m170643xc24d69b7, "access$getRecommendTitleView(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m170643xc24d69b7, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$disAppearView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m170643xc24d69b7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m170643xc24d69b7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$disAppearView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m170643xc24d69b72 = xVar.m170643xc24d69b7();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m170643xc24d69b72, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$disAppearView$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m170643xc24d69b72.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(m170643xc24d69b72, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel$disAppearView$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

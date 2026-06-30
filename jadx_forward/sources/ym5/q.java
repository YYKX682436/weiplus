package ym5;

/* loaded from: classes10.dex */
public class q implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.h f545009a;

    public q(ym5.h hVar) {
        this.f545009a = hVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ym5.h hVar = this.f545009a;
        android.view.View m177309xb3ec347 = hVar.m177309xb3ec347();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m177309xb3ec347, arrayList.toArray(), "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m177309xb3ec347.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m177309xb3ec347, "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View m177316x936200b6 = hVar.m177316x936200b6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m177316x936200b6, arrayList2.toArray(), "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m177316x936200b6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m177316x936200b6, "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}

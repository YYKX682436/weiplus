package pa;

/* loaded from: classes.dex */
public class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f434468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f434469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f434470f;

    public c(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2724x48049842 abstractC2724x48049842, boolean z17, android.view.View view, android.view.View view2) {
        this.f434468d = z17;
        this.f434469e = view;
        this.f434470f = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f434468d) {
            return;
        }
        android.view.View view = this.f434469e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f434470f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f434470f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        if (this.f434468d) {
            android.view.View view = this.f434469e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f434470f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = this.f434470f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/google/android/material/transformation/FabTransformationBehavior$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

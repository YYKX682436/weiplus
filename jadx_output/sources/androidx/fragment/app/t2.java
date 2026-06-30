package androidx.fragment.app;

/* loaded from: classes14.dex */
public class t2 implements android.transition.Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11481b;

    public t2(androidx.fragment.app.x2 x2Var, android.view.View view, java.util.ArrayList arrayList) {
        this.f11480a = view;
        this.f11481b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
        android.view.View view = this.f11480a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = this.f11481b;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view2 = (android.view.View) arrayList2.get(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(android.transition.Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}

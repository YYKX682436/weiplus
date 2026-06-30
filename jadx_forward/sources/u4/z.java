package u4;

/* loaded from: classes11.dex */
public class z implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f506128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f506129e;

    public z(u4.c0 c0Var, android.view.View view, java.util.ArrayList arrayList) {
        this.f506128d = view;
        this.f506129e = arrayList;
    }

    @Override // u4.b1
    public void a(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
    }

    @Override // u4.b1
    public void b(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
    }

    @Override // u4.b1
    public void c(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        abstractC1183x100d4975.E(this);
        android.view.View view = this.f506128d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = this.f506129e;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view2 = (android.view.View) arrayList2.get(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

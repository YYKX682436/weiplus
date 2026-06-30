package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes15.dex */
public class s1 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 f171683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 f171684b;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var) {
        this.f171684b = a2Var;
        this.f171683a = c1Var;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = this.f171683a;
        android.view.View view2 = c1Var.f171584m;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        view2.setScaleX(1.0f);
        android.view.View view3 = c1Var.f171584m;
        view3.setScaleY(1.0f);
        n3.l1.m(view3, 1.0f);
        android.view.View view4 = c1Var.f171584m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator$5", "onAnimationEnd", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator$5", "onAnimationEnd", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var = this.f171684b;
        a2Var.h(c1Var);
        a2Var.E.remove(c1Var);
        if (a2Var.o()) {
            return;
        }
        a2Var.i();
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f171684b.getClass();
    }
}

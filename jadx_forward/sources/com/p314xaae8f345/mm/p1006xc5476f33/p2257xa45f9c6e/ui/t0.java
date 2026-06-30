package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f254258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 f254259e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var, java.util.ArrayList arrayList) {
        this.f254259e = d1Var;
        this.f254258d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f254258d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var = this.f254259e;
            if (!hasNext) {
                arrayList.clear();
                d1Var.f254127m.remove(arrayList);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c1) it.next();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = c1Var.f254112a;
            d1Var.getClass();
            android.view.View view = k3Var.f3639x46306858;
            int i17 = c1Var.f254115d - c1Var.f254113b;
            int i18 = c1Var.f254116e - c1Var.f254114c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            d1Var.f254130p.add(k3Var);
            animate.setDuration(d1Var.f93703e).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y0(d1Var, k3Var, i17, view, i18, animate)).start();
        }
    }
}

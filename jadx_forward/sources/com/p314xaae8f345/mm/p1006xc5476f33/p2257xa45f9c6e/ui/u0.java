package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f254262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 f254263e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var, java.util.ArrayList arrayList) {
        this.f254263e = d1Var;
        this.f254262d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f254262d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var = this.f254263e;
            if (!hasNext) {
                arrayList.clear();
                d1Var.f254128n.remove(arrayList);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b1) it.next();
            d1Var.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = b1Var.f254096a;
            android.view.View view = k3Var == null ? null : k3Var.f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = b1Var.f254097b;
            android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
            java.util.ArrayList arrayList2 = d1Var.f254132r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(d1Var.f93704f);
                arrayList2.add(b1Var.f254096a);
                duration.translationX(b1Var.f254100e - b1Var.f254098c);
                duration.translationY(b1Var.f254101f - b1Var.f254099d);
                duration.alpha(0.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z0(d1Var, b1Var, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(b1Var.f254097b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(d1Var.f93704f).alpha(1.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a1(d1Var, b1Var, animate, view2)).start();
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f254267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 f254268e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var, java.util.ArrayList arrayList) {
        this.f254268e = d1Var;
        this.f254267d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f254267d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var = this.f254268e;
            if (!hasNext) {
                arrayList.clear();
                d1Var.f254126l.remove(arrayList);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            d1Var.getClass();
            android.view.View view = k3Var.f3639x46306858;
            android.view.ViewPropertyAnimator animate = view.animate();
            d1Var.f254129o.add(k3Var);
            animate.alpha(1.0f).setDuration(d1Var.f93701c).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.x0(d1Var, k3Var, view, animate)).start();
        }
    }
}

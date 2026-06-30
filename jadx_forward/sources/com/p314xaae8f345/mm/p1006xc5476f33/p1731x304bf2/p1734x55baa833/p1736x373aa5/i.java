package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l f220680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f220681e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar, java.util.ArrayList arrayList) {
        this.f220680d = lVar;
        this.f220681e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar = this.f220680d;
        java.util.ArrayList arrayList = lVar.f220741l;
        java.util.ArrayList arrayList2 = this.f220681e;
        if (arrayList.remove(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
                lVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.o1) lVar;
                android.view.ViewPropertyAnimator animate = k3Var.f3639x46306858.animate();
                animate.translationY(0.0f);
                animate.alpha(1.0f);
                animate.setDuration(o1Var.f93701c);
                animate.setInterpolator(animate.getInterpolator());
                animate.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.c(o1Var, k3Var));
                animate.setStartDelay(java.lang.Math.abs((k3Var.m8183xf806b362() * o1Var.f93701c) / 4));
                animate.start();
                lVar.f220744o.add(k3Var);
            }
            arrayList2.clear();
        }
    }
}

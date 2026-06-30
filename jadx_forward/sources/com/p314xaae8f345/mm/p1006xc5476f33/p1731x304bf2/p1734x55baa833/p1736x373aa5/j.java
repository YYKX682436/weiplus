package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l f220710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f220711e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar, java.util.ArrayList arrayList) {
        this.f220710d = lVar;
        this.f220711e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar = this.f220710d;
        java.util.ArrayList arrayList = lVar.f220743n;
        java.util.ArrayList arrayList2 = this.f220711e;
        if (arrayList.remove(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                lVar.getClass();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = bVar.f220560a;
                android.view.View view = k3Var != null ? k3Var.f3639x46306858 : null;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = bVar.f220561b;
                android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
                java.util.ArrayList arrayList3 = lVar.f220747r;
                if (view != null) {
                    if (k3Var != null) {
                        arrayList3.add(k3Var);
                    }
                    android.view.ViewPropertyAnimator duration = view.animate().setDuration(lVar.f93704f);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
                    duration.translationX(bVar.f220564e - bVar.f220562c);
                    duration.translationY(bVar.f220565f - bVar.f220563d);
                    duration.alpha(0.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.f(lVar, bVar, duration, view)).start();
                }
                if (view2 != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var3 = bVar.f220561b;
                    if (k3Var3 != null) {
                        arrayList3.add(k3Var3);
                    }
                    android.view.ViewPropertyAnimator animate = view2.animate();
                    animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f93704f).alpha(1.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.g(lVar, bVar, animate, view2)).start();
                }
            }
            arrayList2.clear();
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l f220722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f220723e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar, java.util.ArrayList arrayList) {
        this.f220722d = lVar;
        this.f220723e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar = this.f220722d;
        java.util.ArrayList arrayList = lVar.f220742m;
        java.util.ArrayList arrayList2 = this.f220723e;
        if (arrayList.remove(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e) it.next();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = eVar.f220605a;
                lVar.getClass();
                android.view.View itemView = k3Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                int i17 = eVar.f220608d - eVar.f220606b;
                int i18 = eVar.f220609e - eVar.f220607c;
                if (i17 != 0) {
                    itemView.animate().translationX(0.0f);
                }
                if (i18 != 0) {
                    itemView.animate().translationY(0.0f);
                }
                lVar.f220745p.add(k3Var);
                android.view.ViewPropertyAnimator animate = itemView.animate();
                animate.setDuration(lVar.f93703e).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.h(lVar, k3Var, i17, itemView, i18, animate)).start();
            }
            arrayList2.clear();
        }
    }
}

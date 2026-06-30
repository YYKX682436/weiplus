package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.b f171575d;

    public c(android.app.Activity activity, android.view.ViewGroup viewGroup) {
    }

    public abstract android.view.View c();

    public final boolean d() {
        return c() != null && c().getVisibility() == 0;
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i(int i17);

    public abstract void j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352);

    public abstract void k(int i17);

    public final void l(boolean z17) {
        boolean z18;
        int i17;
        android.view.View childAt;
        if (c() == null) {
            return;
        }
        int i18 = 8;
        if (z17) {
            if (c().getVisibility() != 0) {
                android.view.View c17 = c();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c17, "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (c().getVisibility() != 8) {
            android.view.View c18 = c();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c18, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/plugin/appbrand/ui/recents/AbsAppBrandLauncherListHeader", "setViewEnable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.b bVar = this.f171575d;
        if (bVar == null) {
            return;
        }
        android.view.View c19 = c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.j1) bVar;
        android.view.ViewGroup viewGroup = j1Var.f171634g;
        if (viewGroup == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandLauncherRecentsListHeaderController", "onViewEnabledChanged [%s] [%s] [%b]", this, c19, java.lang.Boolean.valueOf(z17));
        java.util.List list = j1Var.f171632e;
        if (list != null) {
            int i19 = 0;
            boolean z19 = false;
            for (int i27 = 1; i19 < list.size() - i27; i27 = 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) list.get(i19);
                if (cVar != null) {
                    if (!z19) {
                        z19 = cVar.d();
                    }
                    if (!cVar.d()) {
                        android.view.View childAt2 = viewGroup.getChildAt(viewGroup.indexOfChild(cVar.c()) + i27);
                        if (childAt2 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList3.add(java.lang.Integer.valueOf(i18));
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(childAt2, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            childAt2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(childAt2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (childAt2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h1) {
                            if (!z19) {
                            }
                        }
                    }
                    int i28 = i19 + 1;
                    while (true) {
                        if (i28 >= list.size()) {
                            i17 = 0;
                            break;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) list.get(i28);
                        if (cVar2 != null && cVar2.d()) {
                            i17 = i27;
                            break;
                        }
                        i28++;
                    }
                    if (i17 != 0 && (childAt = viewGroup.getChildAt(viewGroup.indexOfChild(cVar.c()) + i27)) != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(childAt, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "resetDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                i19++;
                i18 = 8;
            }
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = false;
                break;
            }
            android.view.View c27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).c();
            if (c27 != null && c27.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandLauncherRecentsListHeaderController", "hasValidHeader %s", this);
                z18 = true;
                break;
            }
        }
        if (z18) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        if (j1Var.f171635h) {
            j1Var.n();
        }
    }
}

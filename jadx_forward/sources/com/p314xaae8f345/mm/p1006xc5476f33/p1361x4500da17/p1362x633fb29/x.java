package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f178865a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f178866b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f178867c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f178868d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f178869e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedList f178870f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.LinkedList f178871g = new java.util.LinkedList();

    public static void a(long j17) {
        java.util.Iterator it = f178870f.iterator();
        while (it.hasNext()) {
            ((r02.t0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s) it.next())).a(5, j17);
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.u.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((n02.e) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.u) ((fs.n) qVar.get()))).Z(5, j17);
            }
        }
    }

    public static void b(boolean z17) {
        java.util.Iterator it = f178867c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 c13241xdbd8cf0 = ((r02.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r) it.next())).f449826a;
            if (z17) {
                c13241xdbd8cf0.f178898f.setClickable(true);
                l02.n.a(c13241xdbd8cf0.f178900h, "download_delete_enable");
                c13241xdbd8cf0.f178899g.setTextColor(c13241xdbd8cf0.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            } else {
                c13241xdbd8cf0.f178898f.setClickable(false);
                l02.n.a(c13241xdbd8cf0.f178900h, "download_delete_disable");
                c13241xdbd8cf0.f178899g.setTextColor(c13241xdbd8cf0.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
            }
        }
    }

    public static void c(java.lang.String str) {
        java.util.Iterator it = f178868d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = ((r02.w0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.v) it.next())).f449873a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) ((java.util.HashMap) c13250xfa9a7928.f178952g2).get(str);
            if (r0Var != null) {
                if (r0Var.f178847c == 6) {
                    r0Var.f178847c = 2;
                    c13250xfa9a7928.m1(r0Var);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c13250xfa9a7928.getLayoutManager();
                int m8008x3d79f549 = c1162x665295de.m8008x3d79f549();
                for (int i17 = 0; i17 <= m8008x3d79f549; i17++) {
                    if (c1162x665295de.m8007x6a486239(i17) != null) {
                        android.view.View childAt = ((android.view.ViewGroup) c1162x665295de.m8007x6a486239(i17)).getChildAt(0);
                        if (childAt.getVisibility() == 0 && (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d c13249xf095011d = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) childAt;
                            if (c13249xf095011d.B.f178850f.equals(str)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskItemView", "onTaskPreStartDownload, appId: %s", str);
                                c13249xf095011d.C = true;
                                c13249xf095011d.post(new r02.l0(c13249xf095011d));
                            }
                        }
                    }
                }
            }
        }
    }
}

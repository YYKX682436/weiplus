package ox1;

/* loaded from: classes12.dex */
public class s implements ox1.a {

    /* renamed from: J, reason: collision with root package name */
    public static volatile ox1.s f431147J;
    public static boolean K;

    /* renamed from: a, reason: collision with root package name */
    public boolean f431148a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f431149b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f431150c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f431151d = 14;

    /* renamed from: e, reason: collision with root package name */
    public int f431152e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f431153f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f431154g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f431155h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f431156i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f431157j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f431158k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f431159l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f431160m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int[] f431161n = null;

    /* renamed from: o, reason: collision with root package name */
    public int[] f431162o = null;

    /* renamed from: p, reason: collision with root package name */
    public int[] f431163p = null;

    /* renamed from: q, reason: collision with root package name */
    public int[] f431164q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.PopupWindow f431165r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.PopupWindow f431166s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.PopupWindow f431167t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.PopupWindow f431168u = null;

    /* renamed from: v, reason: collision with root package name */
    public mx1.a f431169v = null;

    /* renamed from: w, reason: collision with root package name */
    public ox1.e f431170w = null;

    /* renamed from: x, reason: collision with root package name */
    public ox1.c f431171x = null;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f431172y = null;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f431173z = null;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 A = null;
    public android.widget.TextView B = null;
    public android.widget.TextView C = null;
    public android.widget.TextView D = null;
    public android.widget.TextView E = null;
    public android.widget.TextView F = null;
    public android.widget.TextView G = null;
    public android.widget.TextView H = null;
    public android.widget.TextView I = null;

    public s() {
        K = false;
    }

    public static boolean a(ox1.s sVar) {
        if (sVar.m() != 3) {
            return false;
        }
        for (int i17 = sVar.f431170w.f431128a; i17 <= sVar.f431170w.f431130c; i17++) {
            ix1.a l17 = nx1.d.q().l(i17);
            if (l17 != null && l17.b() == 4 && ((ix1.n) l17).f376882w.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static ox1.s h() {
        if (f431147J == null) {
            synchronized (nx1.d.class) {
                if (f431147J == null) {
                    f431147J = new ox1.s();
                }
            }
        }
        return f431147J;
    }

    public void A(boolean z17, boolean z18, long j17) {
        if (K) {
            n();
            p();
            E(true, 50L);
            x(z17);
            this.A.mo50297x7c4d7ca2(new ox1.k(this, z18), j17);
        }
    }

    public final boolean B(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.widget.PopupWindow popupWindow, int i18, int i19) {
        int i27;
        if (K && c1163xf1deaba4 != null && popupWindow != null && i19 >= k(c1163xf1deaba4)) {
            int i28 = this.f431157j;
            mx1.a aVar = this.f431169v;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar;
                i27 = (abstractActivityC13156x6363e8e1.f178042s ? com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(abstractActivityC13156x6363e8e1) : 0) + ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f431169v).c7();
            } else {
                i27 = 0;
            }
            if (i19 <= i28 - i27) {
                if (popupWindow.isShowing()) {
                    popupWindow.update(i18, i19, -1, -1, false);
                    u(i17, i18, i19);
                } else {
                    popupWindow.showAtLocation(c1163xf1deaba4, 0, i18, i19);
                    u(i17, i18, i19);
                }
                if (i17 != 2) {
                    return true;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f431173z;
                if (b4Var == null) {
                    this.f431173z = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ox1.l(this), false);
                } else {
                    b4Var.d();
                }
                this.f431173z.c(3000L, 0L);
                return true;
            }
        }
        return false;
    }

    public final boolean C(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        int i19;
        if (K && c1163xf1deaba4 != null && this.f431168u != null && i18 >= k(c1163xf1deaba4)) {
            int i27 = this.f431157j;
            mx1.a aVar = this.f431169v;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar;
                i19 = (abstractActivityC13156x6363e8e1.f178042s ? com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(abstractActivityC13156x6363e8e1) : 0) + ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f431169v).c7();
            } else {
                i19 = 0;
            }
            if (i18 <= i27 - i19) {
                if (this.f431168u.isShowing()) {
                    this.f431168u.update(i17, i18, -1, -1, false);
                    return true;
                }
                this.f431168u.showAtLocation(c1163xf1deaba4, 0, i17, i18);
                return true;
            }
        }
        return false;
    }

    public void D(android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        if (!K || view == null || view2 == null || view3 == null || this.f431170w == null) {
            return;
        }
        int g17 = g(i17);
        if (g17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 1) {
            ox1.e eVar = this.f431170w;
            if (eVar.f431129b == eVar.f431131d) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(4);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(4);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view3, arrayList7.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 2) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view, arrayList8.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view2, arrayList9.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view3, arrayList10.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 3) {
            if (this.f431170w.f431131d == 0) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view, arrayList11.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(4);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view2, arrayList12.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(4);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view3, arrayList13.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view, arrayList14.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(0);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(view2, arrayList15.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(4);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view3, arrayList16.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 != 4) {
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(view, arrayList17.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            arrayList18.add(4);
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(view2, arrayList18.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            arrayList19.add(4);
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(view3, arrayList19.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f431170w.f431129b == 0) {
            java.util.ArrayList arrayList20 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList20.add(0);
            java.util.Collections.reverse(arrayList20);
            yj0.a.d(view, arrayList20.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList21 = new java.util.ArrayList();
            arrayList21.add(4);
            java.util.Collections.reverse(arrayList21);
            yj0.a.d(view2, arrayList21.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            arrayList22.add(0);
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(view3, arrayList22.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList23 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
        arrayList23.add(8);
        java.util.Collections.reverse(arrayList23);
        yj0.a.d(view, arrayList23.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        arrayList24.add(4);
        java.util.Collections.reverse(arrayList24);
        yj0.a.d(view2, arrayList24.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList25 = new java.util.ArrayList();
        arrayList25.add(4);
        java.util.Collections.reverse(arrayList25);
        yj0.a.d(view3, arrayList25.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void E(boolean z17, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        if (!K || (n3Var = this.A) == null) {
            return;
        }
        n3Var.mo50297x7c4d7ca2(new ox1.j(this, z17), j17);
    }

    public final int F(int i17, int i18, int i19) {
        boolean v17;
        int i27;
        int i28;
        if (!K) {
            return 0;
        }
        if (i17 == 2) {
            v17 = v(i18, i19, i18, i19);
        } else if (i17 == 3) {
            ox1.e eVar = this.f431170w;
            if (eVar == null || i18 > (i27 = eVar.f431130c) || (i18 == i27 && i19 >= eVar.f431131d)) {
                return 1;
            }
            v17 = v(i18, i19, i27, eVar.f431131d);
        } else {
            if (i17 != 4) {
                return 0;
            }
            ox1.e eVar2 = this.f431170w;
            if (eVar2 == null || i18 < (i28 = eVar2.f431128a) || (i18 == i28 && i19 <= eVar2.f431129b)) {
                return 1;
            }
            v17 = v(i28, eVar2.f431129b, i18, i19);
        }
        return v17 ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(boolean r19) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.G(boolean):void");
    }

    public final void b() {
        mx1.a aVar = this.f431169v;
        if (aVar != null) {
            aVar.b5();
        }
    }

    public void c() {
        if (K) {
            v(-1, -1, -1, -1);
            E(true, 0L);
            n();
            p();
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData");
        if (!K) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData: not init");
            return;
        }
        p();
        int m17 = m();
        if (m17 == 2) {
            f(true, null, "");
        } else if (m17 == 3) {
            e(true, null, "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData: not in select");
            r();
        }
    }

    public final java.util.ArrayList e(boolean z17, java.util.ArrayList arrayList, java.lang.String str) {
        int i17;
        boolean z18;
        int i18;
        int i19;
        mx1.a aVar;
        ox1.e l17 = l();
        c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (l17.a() != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
            return null;
        }
        int i27 = l17.f431128a;
        int i28 = l17.f431130c;
        while (true) {
            i17 = 0;
            if (i28 < l17.f431128a) {
                break;
            }
            ix1.a l18 = nx1.d.q().l(i28);
            if (l18 != null) {
                if (i28 == l17.f431130c && l18.b() == 1) {
                    ix1.l lVar = (ix1.l) l18;
                    android.text.SpannableStringBuilder s17 = s(lVar, 0, l17.f431131d, false, z17, "", false);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(s17)) {
                        ix1.l lVar2 = new ix1.l();
                        lVar2.f376871s = lx1.c.a(s17);
                        lVar2.f376846c = -1;
                        lVar2.f376845b = false;
                        arrayList2.add(lVar2);
                    }
                    if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f376871s)) {
                        nx1.d.q().w(i28, true);
                    }
                } else if (i28 == l17.f431128a && l18.b() == 1) {
                    ix1.l lVar3 = (ix1.l) l18;
                    android.text.SpannableStringBuilder s18 = s(lVar3, l17.f431129b, 0, true, z17, "", false);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(s18)) {
                        ix1.l lVar4 = new ix1.l();
                        lVar4.f376871s = lx1.c.a(s18);
                        lVar4.f376846c = -1;
                        lVar4.f376845b = false;
                        arrayList2.add(lVar4);
                    }
                    if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar3.f376871s)) {
                        nx1.d.q().w(i28, true);
                    } else {
                        i27++;
                    }
                } else {
                    arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.a(l18));
                    if (z17) {
                        nx1.d.q().w(i28, true);
                    }
                }
            }
            i28--;
        }
        if (z17) {
            int i29 = i27 - 1;
            int i37 = i27 + 1;
            if (arrayList == null || arrayList.size() <= 0) {
                ix1.l lVar5 = new ix1.l();
                lVar5.f376871s = str != null ? str : "";
                lVar5.f376845b = false;
                lVar5.f376846c = -1;
                z18 = true;
                nx1.d.q().a(i27, lVar5, true);
            } else {
                nx1.d q17 = nx1.d.q();
                q17.getClass();
                if (arrayList.size() > 0) {
                    synchronized (q17) {
                        if (q17.f422815a != null) {
                            i18 = i27;
                            i19 = 0;
                            while (i17 < arrayList.size() && i18 >= 0 && i18 <= q17.f422815a.size()) {
                                ix1.a aVar2 = (ix1.a) arrayList.get(i17);
                                if (aVar2 != null) {
                                    q17.u(aVar2);
                                    q17.f422815a.add(i18, aVar2);
                                    i19++;
                                    i18++;
                                    q17.C(aVar2, true);
                                }
                                i17++;
                            }
                            i17 = 1;
                        } else {
                            i18 = i27;
                            i19 = 0;
                        }
                    }
                    if (i17 != 0 && (aVar = q17.f422816b) != null) {
                        aVar.i0(i18 - i19, i19);
                    }
                }
                i37 = i27 + arrayList.size();
                z18 = true;
            }
            nx1.d.q().d(i29, i37, z18);
        }
        java.util.Collections.reverse(arrayList2);
        return arrayList2;
    }

    public final android.text.SpannableStringBuilder f(boolean z17, java.util.ArrayList arrayList, java.lang.String str) {
        java.util.ArrayList arrayList2;
        ox1.e l17 = l();
        c();
        int a17 = l17.a();
        if (a17 != 1 && a17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
            return null;
        }
        ix1.a l18 = nx1.d.q().l(l17.f431128a);
        if (l18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (l18.b() == 1) {
            if (z17 && arrayList != null && arrayList.size() > 0) {
                android.text.SpannableStringBuilder s17 = s((ix1.l) l18, l17.f431129b, l17.f431131d, false, false, "", true);
                nx1.d.q().t(arrayList, 0, l17.f431128a, l17.f431129b, l17.f431131d, true, true);
                nx1.d q17 = nx1.d.q();
                int i17 = l17.f431128a;
                q17.d(i17, arrayList.size() + i17 + 1, true);
                return s17;
            }
            android.text.SpannableStringBuilder s18 = s((ix1.l) l18, l17.f431129b, l17.f431131d, false, z17, str, true);
            mx1.a aVar = this.f431169v;
            if (aVar != null) {
                aVar.j3(l17.f431128a, 0L);
            }
            if (!z17) {
                return s18;
            }
            nx1.d.q().v();
            return s18;
        }
        if (a17 != 1 || !z17) {
            return spannableStringBuilder;
        }
        int i18 = l17.f431129b == 0 ? 1 : 2;
        if (arrayList != null && arrayList.size() > 0) {
            arrayList2 = arrayList;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return spannableStringBuilder;
            }
            arrayList2 = new java.util.ArrayList();
            ix1.l lVar = new ix1.l();
            lVar.f376871s = str;
            lVar.f376845b = false;
            lVar.f376846c = -1;
            arrayList2.add(lVar);
        }
        nx1.d.q().t(arrayList2, i18, l17.f431128a, l17.f431129b, l17.f431131d, true, true);
        nx1.d q18 = nx1.d.q();
        int i19 = l17.f431128a;
        q18.d(i19 - 1, i19 + arrayList2.size() + 1, true);
        return spannableStringBuilder;
    }

    public int g(int i17) {
        ox1.e eVar;
        int i18;
        int i19;
        if (K && this.f431170w != null && m() != 0 && i17 >= (i18 = (eVar = this.f431170w).f431128a) && i17 <= (i19 = eVar.f431130c)) {
            if (i17 == i18 && i17 == i19) {
                return 1;
            }
            if (i17 > i18 && i17 < i19) {
                return 2;
            }
            if (i17 == i18 && i17 < i19) {
                return 4;
            }
            if (i17 > i18 && i17 == i19) {
                return 3;
            }
        }
        return 0;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 i() {
        mx1.a aVar = this.f431169v;
        if (aVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).f178030d;
        }
        return null;
    }

    public final int j() {
        mx1.a aVar;
        mx1.a aVar2 = this.f431169v;
        int i17 = 0;
        if (aVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar2;
            if (abstractActivityC13156x6363e8e1.f178042s) {
                i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(abstractActivityC13156x6363e8e1);
            }
        }
        if (i17 == 0 && (aVar = this.f431169v) != null) {
            i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).c7();
        }
        if (i17 == 0) {
            i17 = 150;
        }
        return this.f431157j - i17;
    }

    public final int k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.getLocationOnScreen(this.f431161n);
            if (q(this.f431161n)) {
                return this.f431161n[1];
            }
        }
        return 150;
    }

    public ox1.e l() {
        if (!K) {
            return new ox1.e();
        }
        if (this.f431170w == null) {
            this.f431170w = new ox1.e();
        }
        ox1.e eVar = this.f431170w;
        return new ox1.e(eVar.f431128a, eVar.f431129b, eVar.f431130c, eVar.f431131d);
    }

    public int m() {
        if (!K) {
            return 0;
        }
        if (this.f431170w == null) {
            this.f431170w = new ox1.e();
        }
        return this.f431170w.a();
    }

    public void n() {
        if (K) {
            o(2);
            o(3);
            o(4);
        }
    }

    public final boolean o(int i17) {
        android.widget.PopupWindow popupWindow;
        android.widget.PopupWindow popupWindow2;
        android.widget.PopupWindow popupWindow3;
        ox1.c cVar = this.f431171x;
        if (cVar != null && cVar.f431114a == i17 && cVar.a() == 1) {
            return false;
        }
        if (i17 == 2 && (popupWindow3 = this.f431165r) != null) {
            popupWindow3.dismiss();
            u(2, -1, -1);
        } else if (i17 == 3 && (popupWindow2 = this.f431166s) != null) {
            popupWindow2.dismiss();
            u(3, -1, -1);
        } else {
            if (i17 != 4 || (popupWindow = this.f431167t) == null) {
                return false;
            }
            popupWindow.dismiss();
            u(4, -1, -1);
        }
        return true;
    }

    public void p() {
        android.widget.PopupWindow popupWindow = this.f431168u;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean q(int[] iArr) {
        return (!K || iArr == null || iArr.length != 2 || iArr[0] == -1 || iArr[1] == -1) ? false : true;
    }

    public final void r() {
        mx1.a aVar = this.f431169v;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar;
            dp.a.m125854x26a183b(abstractActivityC13156x6363e8e1.mo55332x76847179(), abstractActivityC13156x6363e8e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfp), 0).show();
        }
    }

    public final android.text.SpannableStringBuilder s(ix1.l lVar, int i17, int i18, boolean z17, boolean z18, java.lang.String str, boolean z19) {
        android.text.Spanned a17;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: textDataItem is null");
            return null;
        }
        android.text.Spanned a18 = lx1.a.a(lVar.f376871s);
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: spannedText is null");
            return null;
        }
        if (z17) {
            i18 = a18.length();
        }
        if (str == null) {
            str = "";
        }
        if (i17 < 0 || i17 > a18.length() || i18 < 0 || i18 > a18.length() || i17 > i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: incorrect offset");
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) a18.subSequence(0, i17);
        android.text.SpannableStringBuilder spannableStringBuilder2 = (android.text.SpannableStringBuilder) a18.subSequence(i17, i18);
        android.text.SpannableStringBuilder spannableStringBuilder3 = (android.text.SpannableStringBuilder) a18.subSequence(i18, a18.length());
        if (z18) {
            i18 = spannableStringBuilder.length();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (a17 = lx1.a.a(str)) != null) {
                i18 += a17.length();
            }
            lVar.f376871s = lx1.c.a(spannableStringBuilder) + str + lx1.c.a(spannableStringBuilder3);
        }
        if (z19) {
            lVar.f376845b = true;
            lVar.f376846c = i18;
        } else {
            lVar.f376845b = false;
            lVar.f376846c = -1;
        }
        return spannableStringBuilder2;
    }

    public final boolean t(android.view.View view, boolean z17) {
        if (view == null) {
            return false;
        }
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }

    public final void u(int i17, int i18, int i19) {
        int[] iArr;
        if (K) {
            if (i17 == 2) {
                int[] iArr2 = this.f431162o;
                if (iArr2 == null || iArr2.length != 2) {
                    return;
                }
                iArr2[0] = i18;
                iArr2[1] = i19;
                return;
            }
            if (i17 != 3) {
                if (i17 == 4 && (iArr = this.f431164q) != null && iArr.length == 2) {
                    iArr[0] = i18;
                    iArr[1] = i19;
                    return;
                }
                return;
            }
            int[] iArr3 = this.f431163p;
            if (iArr3 == null || iArr3.length != 2) {
                return;
            }
            iArr3[0] = i18;
            iArr3[1] = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v(int r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            boolean r0 = ox1.s.K
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ox1.e r0 = r3.f431170w
            if (r0 != 0) goto L12
            ox1.e r0 = new ox1.e
            r0.<init>(r4, r5, r6, r7)
            r3.f431170w = r0
            goto L2a
        L12:
            int r2 = r0.f431128a
            if (r2 != r4) goto L22
            int r2 = r0.f431129b
            if (r2 != r5) goto L22
            int r2 = r0.f431130c
            if (r2 != r6) goto L22
            int r2 = r0.f431131d
            if (r2 == r7) goto L2b
        L22:
            r0.f431128a = r4
            r0.f431129b = r5
            r0.f431130c = r6
            r0.f431131d = r7
        L2a:
            r1 = 1
        L2b:
            if (r1 == 0) goto L37
            ox1.e r4 = r3.f431170w
            int r5 = r4.f431128a
            int r5 = r4.f431129b
            int r5 = r4.f431130c
            int r4 = r4.f431131d
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.v(int, int, int, int):boolean");
    }

    public final void w(android.widget.TextView textView, int i17) {
        if (textView != null) {
            textView.setTextSize(1, i17);
        }
    }

    public void x(boolean z17) {
        if (K) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 i17 = i();
            int m17 = m();
            if (i17 == null || m17 == 0 || (m17 == 1 && !z17)) {
                n();
                return;
            }
            android.view.View b17 = ox1.t.b(i17, this.f431170w.f431128a);
            android.view.View b18 = ox1.t.b(i17, this.f431170w.f431130c);
            if (m17 == 1) {
                o(3);
                o(4);
                y(2, i17, b17, this.f431170w.f431129b);
            } else {
                o(2);
                y(3, i17, b17, this.f431170w.f431129b);
                y(4, i17, b18, this.f431170w.f431131d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r10, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r11, android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.y(int, androidx.recyclerview.widget.RecyclerView, android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(boolean r18) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.s.z(boolean):void");
    }
}

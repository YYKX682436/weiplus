package nz4;

/* loaded from: classes12.dex */
public class y implements nz4.a {
    public static volatile nz4.y L;
    public static boolean M;

    /* renamed from: a, reason: collision with root package name */
    public boolean f423176a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f423177b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f423178c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f423179d = 14;

    /* renamed from: e, reason: collision with root package name */
    public int f423180e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f423181f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f423182g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f423183h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f423184i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f423185j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f423186k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f423187l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f423188m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int[] f423189n = null;

    /* renamed from: o, reason: collision with root package name */
    public int[] f423190o = null;

    /* renamed from: p, reason: collision with root package name */
    public int[] f423191p = null;

    /* renamed from: q, reason: collision with root package name */
    public int[] f423192q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.PopupWindow f423193r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.PopupWindow f423194s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.PopupWindow f423195t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.PopupWindow f423196u = null;

    /* renamed from: v, reason: collision with root package name */
    public lz4.a f423197v = null;

    /* renamed from: w, reason: collision with root package name */
    public nz4.h f423198w = null;

    /* renamed from: x, reason: collision with root package name */
    public nz4.f f423199x = null;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f423200y = null;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f423201z = null;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 A = null;
    public android.widget.TextView B = null;
    public android.widget.TextView C = null;
    public android.widget.TextView D = null;
    public android.widget.TextView E = null;
    public android.widget.TextView F = null;
    public android.widget.TextView G = null;
    public android.widget.TextView H = null;
    public android.widget.TextView I = null;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f423175J = null;
    public android.widget.TextView K = null;

    public y() {
        M = false;
    }

    public static boolean a(nz4.y yVar) {
        if (yVar.m() != 3) {
            return false;
        }
        for (int i17 = yVar.f423198w.f423152a; i17 <= yVar.f423198w.f423154c; i17++) {
            iz4.c l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) yVar.f423197v).J1.l(i17);
            if (l17 != null && l17.d() == 4 && ((iz4.l) l17).f377654y.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static nz4.y h() {
        if (L == null) {
            synchronized (mz4.d.class) {
                if (L == null) {
                    L = new nz4.y();
                }
            }
        }
        return L;
    }

    public void A(boolean z17) {
        if (M) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 i17 = i();
            int m17 = m();
            if (i17 == null || m17 == 0 || (m17 == 1 && !z17)) {
                n();
                return;
            }
            android.view.View b17 = nz4.z.b(i17, this.f423198w.f423152a);
            android.view.View b18 = nz4.z.b(i17, this.f423198w.f423154c);
            if (m17 == 1) {
                o(3);
                o(4);
                B(2, i17, b17, this.f423198w.f423153b);
            } else {
                o(2);
                B(3, i17, b17, this.f423198w.f423153b);
                B(4, i17, b18, this.f423198w.f423155d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r10, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r11, android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz4.y.B(int, androidx.recyclerview.widget.RecyclerView, android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(boolean r18) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz4.y.C(boolean):void");
    }

    public void D(boolean z17, boolean z18, long j17) {
        if (M) {
            n();
            p();
            I(true, 50L);
            A(z17);
            this.A.mo50297x7c4d7ca2(new nz4.q(this, z18), j17);
        }
    }

    public final boolean E(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.widget.PopupWindow popupWindow, int i18, int i19) {
        int i27;
        if (M && c1163xf1deaba4 != null && popupWindow != null && i19 >= k(c1163xf1deaba4)) {
            int i28 = this.f423185j;
            lz4.a aVar = this.f423197v;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar;
                int a17 = activityC19519x7af4daf3.N ? com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(activityC19519x7af4daf3) : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf32 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v;
                android.widget.FrameLayout frameLayout = activityC19519x7af4daf32.f269683p;
                int i29 = (frameLayout == null || frameLayout.getVisibility() != 0) ? 0 : activityC19519x7af4daf32.D1 + 0;
                android.view.View view = activityC19519x7af4daf32.S;
                if (view != null && view.getVisibility() == 0) {
                    i29 += activityC19519x7af4daf32.D1;
                }
                i27 = a17 + i29;
            } else {
                i27 = 0;
            }
            if (i19 <= i28 - i27) {
                if (popupWindow.isShowing()) {
                    popupWindow.update(i18, i19, -1, -1, false);
                    x(i17, i18, i19);
                } else {
                    popupWindow.showAtLocation(c1163xf1deaba4, 0, i18, i19);
                    x(i17, i18, i19);
                }
                if (i17 != 2) {
                    return true;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f423201z;
                if (b4Var == null) {
                    this.f423201z = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new nz4.r(this), false);
                } else {
                    b4Var.d();
                }
                this.f423201z.c(3000L, 0L);
                return true;
            }
        }
        return false;
    }

    public final boolean F(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        int i19;
        if (M && c1163xf1deaba4 != null && this.f423196u != null && i18 >= k(c1163xf1deaba4)) {
            int i27 = this.f423185j;
            lz4.a aVar = this.f423197v;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar;
                int a17 = activityC19519x7af4daf3.N ? com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(activityC19519x7af4daf3) : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf32 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v;
                android.widget.FrameLayout frameLayout = activityC19519x7af4daf32.f269683p;
                int i28 = (frameLayout == null || frameLayout.getVisibility() != 0) ? 0 : activityC19519x7af4daf32.D1 + 0;
                android.view.View view = activityC19519x7af4daf32.S;
                if (view != null && view.getVisibility() == 0) {
                    i28 += activityC19519x7af4daf32.D1;
                }
                i19 = a17 + i28;
            } else {
                i19 = 0;
            }
            if (i18 <= i27 - i19) {
                if (this.f423196u.isShowing()) {
                    this.f423196u.update(i17, i18, -1, -1, false);
                    return true;
                }
                this.f423196u.showAtLocation(c1163xf1deaba4, 0, i17, i18);
                return true;
            }
        }
        return false;
    }

    public void G(nz4.g gVar, android.view.View view, boolean z17) {
        if (gVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = gVar.f423146a;
        if (c19515x154ec45a != null) {
            if (z17) {
                c19515x154ec45a.postInvalidate();
            }
        } else {
            if (gVar.f423149d != null) {
                H(gVar.f423151f, (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kn7), (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567749kn1), gVar.f423149d.m74969x1c481d6b());
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = gVar.f423147b;
            if (c19515x154ec45a2 == null || gVar.f423148c == null) {
                return;
            }
            H((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kmx), (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kn7), (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567749kn1), c19515x154ec45a2.m74969x1c481d6b());
        }
    }

    public final void H(android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        if (!M || view == null || view2 == null || view3 == null || this.f423198w == null) {
            return;
        }
        int g17 = g(i17);
        if (g17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 1) {
            nz4.h hVar = this.f423198w;
            if (hVar.f423153b == hVar.f423155d) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(4);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(4);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view3, arrayList7.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 2) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view, arrayList8.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view2, arrayList9.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view3, arrayList10.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 == 3) {
            if (this.f423198w.f423155d == 0) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view, arrayList11.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(4);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view2, arrayList12.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(4);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view3, arrayList13.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view, arrayList14.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(0);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(view2, arrayList15.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(4);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view3, arrayList16.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (g17 != 4) {
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList17.add(8);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(view, arrayList17.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            arrayList18.add(4);
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(view2, arrayList18.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            arrayList19.add(4);
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(view3, arrayList19.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f423198w.f423153b == 0) {
            java.util.ArrayList arrayList20 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList20.add(0);
            java.util.Collections.reverse(arrayList20);
            yj0.a.d(view, arrayList20.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList21 = new java.util.ArrayList();
            arrayList21.add(4);
            java.util.Collections.reverse(arrayList21);
            yj0.a.d(view2, arrayList21.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            arrayList22.add(0);
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(view3, arrayList22.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList23 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
        arrayList23.add(8);
        java.util.Collections.reverse(arrayList23);
        yj0.a.d(view, arrayList23.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        arrayList24.add(4);
        java.util.Collections.reverse(arrayList24);
        yj0.a.d(view2, arrayList24.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList25 = new java.util.ArrayList();
        arrayList25.add(4);
        java.util.Collections.reverse(arrayList25);
        yj0.a.d(view3, arrayList25.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void I(boolean z17, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        if (!M || (n3Var = this.A) == null) {
            return;
        }
        n3Var.mo50297x7c4d7ca2(new nz4.p(this, z17), j17);
    }

    public final int J(int i17, int i18, int i19) {
        boolean y17;
        int i27;
        int i28;
        if (!M) {
            return 0;
        }
        if (i17 == 2) {
            y17 = y(i18, i19, i18, i19);
        } else if (i17 == 3) {
            nz4.h hVar = this.f423198w;
            if (hVar == null || i18 > (i27 = hVar.f423154c) || (i18 == i27 && i19 >= hVar.f423155d)) {
                return 1;
            }
            y17 = y(i18, i19, i27, hVar.f423155d);
        } else {
            if (i17 != 4) {
                return 0;
            }
            nz4.h hVar2 = this.f423198w;
            if (hVar2 == null || i18 < (i28 = hVar2.f423152a) || (i18 == i28 && i19 <= hVar2.f423153b)) {
                return 1;
            }
            y17 = y(i28, hVar2.f423153b, i18, i19);
        }
        return y17 ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(boolean r19) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz4.y.K(boolean):void");
    }

    public final void b() {
        lz4.a aVar = this.f423197v;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).b5();
        }
    }

    public void c() {
        if (M) {
            y(-1, -1, -1, -1);
            I(true, 0L);
            n();
            p();
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoteSelectManager", "deleteSelectedData");
        if (!M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "deleteSelectedData: not init");
            return;
        }
        p();
        int m17 = m();
        if (m17 == 2) {
            f(true, null, "");
        } else if (m17 == 3) {
            e(true, null, "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "deleteSelectedData: not in select");
            s();
        }
    }

    public final java.util.ArrayList e(boolean z17, final java.util.ArrayList arrayList, java.lang.String str) {
        boolean z18;
        java.lang.Object obj;
        nz4.h l17 = l();
        c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.Object obj2 = null;
        if (l17.a() != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
            return null;
        }
        int i17 = l17.f423152a;
        int i18 = l17.f423154c;
        while (i18 >= l17.f423152a) {
            iz4.c l18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.l(i18);
            if (l18 == null) {
                obj = obj2;
            } else if (i18 == l17.f423154c && l18.d() == 1) {
                iz4.i iVar = (iz4.i) l18;
                android.text.SpannableStringBuilder u17 = u(iVar, 0, l17.f423155d, false, z17, "", false);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(u17)) {
                    iz4.i iVar2 = new iz4.i();
                    iVar2.f377688t = kz4.c.b(u17);
                    iVar2.f377638c = -1;
                    iVar2.f377637b = false;
                    arrayList2.add(iVar2);
                }
                if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f377688t)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.z(i18, true, null);
                }
                obj = null;
            } else if (i18 == l17.f423152a && l18.d() == 1) {
                iz4.i iVar3 = (iz4.i) l18;
                android.text.SpannableStringBuilder u18 = u(iVar3, l17.f423153b, 0, true, z17, "", false);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(u18)) {
                    iz4.i iVar4 = new iz4.i();
                    iVar4.f377688t = kz4.c.b(u18);
                    iVar4.f377638c = -1;
                    iVar4.f377637b = false;
                    arrayList2.add(iVar4);
                }
                if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar3.f377688t)) {
                    obj = null;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.z(i18, true, null);
                } else {
                    obj = null;
                    i17++;
                }
            } else {
                obj = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoteSelectManager", "cloneDataItem startPos=%s endPos=%s endOffset=%s", java.lang.Integer.valueOf(l17.f423152a), java.lang.Integer.valueOf(l17.f423154c), java.lang.Integer.valueOf(l17.f423155d));
                arrayList2.add(qz4.c.a(l18, l17));
                if (z17) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.z(i18, true, l17);
                }
            }
            i18--;
            obj2 = obj;
        }
        if (z17) {
            int i19 = i17 - 1;
            int i27 = i17 + 1;
            if (arrayList == null || arrayList.size() <= 0) {
                iz4.i iVar5 = new iz4.i();
                iVar5.f377688t = str != null ? str : "";
                iVar5.f377637b = false;
                iVar5.f377638c = -1;
                z18 = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.a(i17, iVar5, true);
            } else {
                final mz4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1;
                final boolean z19 = true;
                dVar.getClass();
                final int i28 = i17;
                final int i29 = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: mz4.d$$j
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i37;
                        int i38;
                        lz4.a aVar;
                        mz4.d dVar2 = mz4.d.this;
                        java.util.ArrayList arrayList3 = arrayList;
                        int i39 = i28;
                        boolean z27 = z19;
                        int i47 = i29;
                        dVar2.getClass();
                        if (arrayList3 == null || arrayList3.size() <= 0) {
                            return;
                        }
                        synchronized (dVar2) {
                            i37 = 0;
                            if (dVar2.f414762a != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[addBatch] position = " + i39 + ", dataList size = " + dVar2.f414762a.size());
                                i38 = 0;
                                while (i37 < arrayList3.size() && i39 >= 0 && i39 <= dVar2.f414762a.size()) {
                                    iz4.c cVar = (iz4.c) arrayList3.get(i37);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[addBatch] item = " + cVar);
                                    if (cVar != null) {
                                        dVar2.x(cVar);
                                        dVar2.f414762a.add(i39, cVar);
                                        i38++;
                                        i39++;
                                        dVar2.E(cVar, true);
                                    }
                                    i37++;
                                }
                                i37 = 1;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[addBatch] position = " + i39 + ", dataList = null");
                                i38 = 0;
                            }
                        }
                        if (i37 == 0 || !z27 || (aVar = dVar2.f414763b) == null) {
                            return;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.t((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar, i47 - i38, i38));
                    }
                });
                i27 = arrayList.size() + i17;
                z18 = true;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.e(i19, i27, z18);
        }
        java.util.Collections.reverse(arrayList2);
        return arrayList2;
    }

    public final android.text.SpannableStringBuilder f(boolean z17, java.util.ArrayList arrayList, java.lang.String str) {
        java.util.ArrayList arrayList2;
        nz4.h l17 = l();
        c();
        int a17 = l17.a();
        if (a17 != 1 && a17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
            return null;
        }
        iz4.c l18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.l(l17.f423152a);
        if (l18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (l18.d() == 1) {
            if (z17 && arrayList != null && arrayList.size() > 0) {
                android.text.SpannableStringBuilder u17 = u((iz4.i) l18, l17.f423153b, l17.f423155d, false, false, "", true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.w(arrayList, 0, l17.f423152a, l17.f423153b, l17.f423155d, true, true);
                mz4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1;
                int i17 = l17.f423152a;
                dVar.e(i17, arrayList.size() + i17 + 1, true);
                this.A.mo77785xc570fb34(new nz4.o(this));
                return u17;
            }
            android.text.SpannableStringBuilder u18 = u((iz4.i) l18, l17.f423153b, l17.f423155d, false, z17, str, true);
            lz4.a aVar = this.f423197v;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).j3(l17.f423152a, 0L);
            }
            if (!z17) {
                return u18;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.y();
            return u18;
        }
        if (a17 != 1 || !z17) {
            return spannableStringBuilder;
        }
        int i18 = l17.f423153b == 0 ? 1 : 2;
        if (arrayList != null && arrayList.size() > 0) {
            arrayList2 = arrayList;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return spannableStringBuilder;
            }
            arrayList2 = new java.util.ArrayList();
            iz4.i iVar = new iz4.i();
            iVar.f377688t = str;
            iVar.f377637b = false;
            iVar.f377638c = -1;
            arrayList2.add(iVar);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.s(arrayList2, l17.f423154c, l17.f423155d, null)) {
            return spannableStringBuilder;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1.w(arrayList2, i18, l17.f423152a, l17.f423153b, l17.f423155d, true, true);
        mz4.d dVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f423197v).J1;
        int i19 = l17.f423152a;
        dVar2.e(i19 - 1, i19 + arrayList2.size() + 1, true);
        return spannableStringBuilder;
    }

    public int g(int i17) {
        nz4.h hVar;
        int i18;
        int i19;
        if (M && this.f423198w != null && m() != 0 && i17 >= (i18 = (hVar = this.f423198w).f423152a) && i17 <= (i19 = hVar.f423154c)) {
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
        lz4.a aVar = this.f423197v;
        if (aVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).f269681n;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r3 = this;
            lz4.a r0 = r3.f423197v
            r1 = 0
            if (r0 == 0) goto L10
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) r0
            boolean r2 = r0.N
            if (r2 == 0) goto L10
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(r0)
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L34
            lz4.a r2 = r3.f423197v
            if (r2 == 0) goto L34
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) r2
            android.widget.FrameLayout r0 = r2.f269683p
            if (r0 == 0) goto L26
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L26
            int r0 = r2.D1
            int r1 = r1 + r0
        L26:
            android.view.View r0 = r2.S
            if (r0 == 0) goto L33
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L33
            int r0 = r2.D1
            int r1 = r1 + r0
        L33:
            r0 = r1
        L34:
            if (r0 != 0) goto L38
            r0 = 150(0x96, float:2.1E-43)
        L38:
            int r1 = r3.f423185j
            int r1 = r1 - r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nz4.y.j():int");
    }

    public final int k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.getLocationOnScreen(this.f423189n);
            if (q(this.f423189n)) {
                return this.f423189n[1];
            }
        }
        return 150;
    }

    public nz4.h l() {
        if (!M) {
            return new nz4.h(this.f423197v);
        }
        if (this.f423198w == null) {
            this.f423198w = new nz4.h(this.f423197v);
        }
        lz4.a aVar = this.f423197v;
        nz4.h hVar = this.f423198w;
        return new nz4.h(aVar, hVar.f423152a, hVar.f423153b, hVar.f423154c, hVar.f423155d);
    }

    public int m() {
        if (!M) {
            return 0;
        }
        if (this.f423198w == null) {
            this.f423198w = new nz4.h(this.f423197v);
        }
        return this.f423198w.a();
    }

    public void n() {
        if (M) {
            o(2);
            o(3);
            o(4);
        }
    }

    public final boolean o(int i17) {
        android.widget.PopupWindow popupWindow;
        android.widget.PopupWindow popupWindow2;
        android.widget.PopupWindow popupWindow3;
        nz4.f fVar = this.f423199x;
        if (fVar != null && fVar.f423135a == i17 && fVar.a() == 1) {
            return false;
        }
        if (i17 == 2 && (popupWindow3 = this.f423193r) != null) {
            popupWindow3.dismiss();
            x(2, -1, -1);
        } else if (i17 == 3 && (popupWindow2 = this.f423194s) != null) {
            popupWindow2.dismiss();
            x(3, -1, -1);
        } else {
            if (i17 != 4 || (popupWindow = this.f423195t) == null) {
                return false;
            }
            popupWindow.dismiss();
            x(4, -1, -1);
        }
        return true;
    }

    public void p() {
        android.widget.PopupWindow popupWindow = this.f423196u;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean q(int[] iArr) {
        return (!M || iArr == null || iArr.length != 2 || iArr[0] == -1 || iArr[1] == -1) ? false : true;
    }

    public final boolean r(boolean z17) {
        boolean z18;
        int i17;
        int i18;
        int i19;
        if (!this.f423176a || !mz4.m.f414851a.a()) {
            return false;
        }
        nz4.h l17 = l();
        int i27 = l17.f423152a;
        if (i27 >= 0 && (i17 = l17.f423153b) >= 0 && (i18 = l17.f423154c) >= 0 && (i19 = l17.f423155d) >= 0 && i27 <= i18 && ((i27 != i18 || i17 <= i19) && (i27 != i18 || i17 != i19))) {
            while (i27 <= l17.f423154c) {
                int d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) l17.f423156e).J1.l(i27).d();
                if (d17 == 2 || d17 == 6 || d17 == 7) {
                    z18 = true;
                    break;
                }
                i27++;
            }
        }
        z18 = false;
        if (!z18) {
            return false;
        }
        lz4.a aVar = this.f423197v;
        mz4.d dVar = aVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).J1 : null;
        return z17 ? (dVar == null || dVar.f414771j) ? false : true : dVar != null && dVar.f414771j;
    }

    public final void s() {
        lz4.a aVar = this.f423197v;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar;
            dp.a.m125854x26a183b(activityC19519x7af4daf3.mo55332x76847179(), activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_u), 0).show();
        }
    }

    public void t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoteSelectManager", "onDestroy");
        M = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f423200y;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f423201z;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        android.widget.PopupWindow popupWindow = this.f423193r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        android.widget.PopupWindow popupWindow2 = this.f423194s;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
        android.widget.PopupWindow popupWindow3 = this.f423195t;
        if (popupWindow3 != null) {
            popupWindow3.dismiss();
        }
        android.widget.PopupWindow popupWindow4 = this.f423196u;
        if (popupWindow4 != null) {
            popupWindow4.dismiss();
        }
        L = null;
    }

    public final android.text.SpannableStringBuilder u(iz4.i iVar, int i17, int i18, boolean z17, boolean z18, java.lang.String str, boolean z19) {
        android.text.Spanned a17;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "processTextDataItem: textDataItem is null");
            return null;
        }
        android.text.Spanned a18 = kz4.a.a(iVar.f377688t);
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "processTextDataItem: spannedText is null");
            return null;
        }
        if (z17) {
            i18 = a18.length();
        }
        if (str == null) {
            str = "";
        }
        if (i17 < 0 || i17 > a18.length() || i18 < 0 || i18 > a18.length() || i17 > i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "processTextDataItem: incorrect offset");
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) a18.subSequence(0, i17);
        android.text.SpannableStringBuilder spannableStringBuilder2 = (android.text.SpannableStringBuilder) a18.subSequence(i17, i18);
        android.text.SpannableStringBuilder spannableStringBuilder3 = (android.text.SpannableStringBuilder) a18.subSequence(i18, a18.length());
        if (z18) {
            i18 = spannableStringBuilder.length();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (a17 = kz4.a.a(str)) != null) {
                i18 += a17.length();
            }
            iVar.f377688t = kz4.c.b(spannableStringBuilder) + str + kz4.c.b(spannableStringBuilder3);
        }
        if (z19) {
            iVar.f377637b = true;
            iVar.f377638c = i18;
        } else {
            iVar.f377637b = false;
            iVar.f377638c = -1;
        }
        return spannableStringBuilder2;
    }

    public final boolean v(android.view.View view, boolean z17) {
        if (view == null) {
            return false;
        }
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }

    public void w() {
        java.util.Objects.toString(this.f423198w);
        b();
        nz4.h hVar = this.f423198w;
        int i17 = hVar.f423155d;
        int i18 = i17 > 0 ? i17 - 1 : 0;
        int i19 = hVar.f423152a;
        y(i19, i18, i19, i18 + 1);
        D(true, true, 50L);
    }

    public final void x(int i17, int i18, int i19) {
        int[] iArr;
        if (M) {
            if (i17 == 2) {
                int[] iArr2 = this.f423190o;
                if (iArr2 == null || iArr2.length != 2) {
                    return;
                }
                iArr2[0] = i18;
                iArr2[1] = i19;
                return;
            }
            if (i17 != 3) {
                if (i17 == 4 && (iArr = this.f423192q) != null && iArr.length == 2) {
                    iArr[0] = i18;
                    iArr[1] = i19;
                    return;
                }
                return;
            }
            int[] iArr3 = this.f423191p;
            if (iArr3 == null || iArr3.length != 2) {
                return;
            }
            iArr3[0] = i18;
            iArr3[1] = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            boolean r0 = nz4.y.M
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            nz4.h r0 = r8.f423198w
            if (r0 != 0) goto L19
            nz4.h r0 = new nz4.h
            lz4.a r3 = r8.f423197v
            r2 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f423198w = r0
            goto L31
        L19:
            int r2 = r0.f423152a
            if (r2 != r9) goto L29
            int r2 = r0.f423153b
            if (r2 != r10) goto L29
            int r2 = r0.f423154c
            if (r2 != r11) goto L29
            int r2 = r0.f423155d
            if (r2 == r12) goto L32
        L29:
            r0.f423152a = r9
            r0.f423153b = r10
            r0.f423154c = r11
            r0.f423155d = r12
        L31:
            r1 = 1
        L32:
            if (r1 == 0) goto L3e
            nz4.h r9 = r8.f423198w
            int r10 = r9.f423152a
            int r10 = r9.f423153b
            int r10 = r9.f423154c
            int r9 = r9.f423155d
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nz4.y.y(int, int, int, int):boolean");
    }

    public final void z(android.widget.TextView textView, int i17) {
        if (textView != null) {
            textView.setTextSize(1, i17);
        }
    }
}

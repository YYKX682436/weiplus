package cl1;

/* loaded from: classes8.dex */
public class u extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb f124432d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb, cl1.m mVar) {
        this.f124432d = c12767x7016a6fb;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f124432d.f172617h2.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = this.f124432d;
        cl1.n0 n0Var = (i17 >= c12767x7016a6fb.f172617h2.size() || i17 < 0) ? null : (cl1.n0) c12767x7016a6fb.f172617h2.get(i17);
        if (n0Var != null) {
            return n0Var.f124422b;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        if (list.size() == 0) {
            mo864xe5e2e48d(k3Var, i17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = this.f124432d;
        if (i17 == 2 || i17 == 1) {
            return new cl1.z(com.p314xaae8f345.mm.ui.id.b(c12767x7016a6fb.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569679ig, viewGroup, false));
        }
        if (i17 == 3) {
            android.view.View view = new android.view.View(c12767x7016a6fb.getContext());
            view.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, c12767x7016a6fb.f172633x2));
            return new cl1.s(c12767x7016a6fb, view);
        }
        if (i17 == 4) {
            c12767x7016a6fb.f172634y2 = com.p314xaae8f345.mm.ui.id.b(c12767x7016a6fb.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569554em, viewGroup, false);
            return new cl1.w(c12767x7016a6fb, c12767x7016a6fb.f172634y2);
        }
        if (i17 != 6) {
            return new cl1.s(c12767x7016a6fb, com.p314xaae8f345.mm.ui.id.b(c12767x7016a6fb.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5r, viewGroup, false));
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(c12767x7016a6fb.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569553el, viewGroup, false);
        c12767x7016a6fb.f172622m2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9) inflate.findViewById(com.p314xaae8f345.mm.R.id.imn);
        return new cl1.s(c12767x7016a6fb, inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f9;
        int m8185xcdaf1228 = k3Var.m8185xcdaf1228();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = this.f124432d;
        if (m8185xcdaf1228 == 3) {
            android.view.View view = k3Var.f3639x46306858;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$ItemAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) k3Var.f3639x46306858.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = c12767x7016a6fb.f172633x2;
            k3Var.f3639x46306858.setLayoutParams(layoutParams);
            return;
        }
        if (m8185xcdaf1228 == 6 && (c22651x9410f9f9 = c12767x7016a6fb.f172622m2) != null) {
            c22651x9410f9f9.e();
        }
        if (m8185xcdaf1228 == 4) {
            if (k3Var.f3639x46306858 != null) {
                java.lang.String str = c12767x7016a6fb.f172635z2;
                java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_FROM_DESKTOP_INPUT_HINT_CONTENT_STRING_SYNC, null);
                if (m17 instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) m17;
                    java.lang.String str3 = c12767x7016a6fb.f172635z2;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str2 == null) {
                        str2 = str3;
                    }
                    c12767x7016a6fb.f172635z2 = str2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "updateSearchWording last: %s, new: %s", str, c12767x7016a6fb.f172635z2);
                return;
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.f172613h0;
            c12767x7016a6fb.getClass();
            return;
        }
        if (m8185xcdaf1228 == 1 || m8185xcdaf1228 == 2) {
            cl1.z zVar = (cl1.z) k3Var;
            cl1.n0 n0Var = (i17 >= c12767x7016a6fb.f172617h2.size() || i17 < 0) ? null : (cl1.n0) c12767x7016a6fb.f172617h2.get(i17);
            if (n0Var == null) {
                return;
            }
            zVar.f124382d = n0Var;
            zVar.i(new cl1.t(this, zVar, n0Var), null);
            if (c12767x7016a6fb.f172631v2 == 0) {
                android.view.View view2 = k3Var.f3639x46306858;
                view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "onBindViewHolder itemHeight: %d, itemWidth: %d", java.lang.Integer.valueOf(view2.getMeasuredHeight()), java.lang.Integer.valueOf(view2.getMeasuredWidth()));
                c12767x7016a6fb.f172631v2 = view2.getMeasuredHeight();
            }
            boolean z18 = m8185xcdaf1228 == 2;
            if (i17 > c12767x7016a6fb.f172630u2 && i17 <= c12767x7016a6fb.f172629t2) {
                c12767x7016a6fb.f172615f2.e(n0Var, z18, true, true, i17);
            } else {
                c12767x7016a6fb.f172615f2.e(n0Var, z18, true, false, i17);
            }
            c12767x7016a6fb.f172630u2 = java.lang.Math.max(c12767x7016a6fb.f172630u2, i17);
        }
        if (c12767x7016a6fb.m53374x64bf9516() == null || c12767x7016a6fb.m53374x64bf9516().m53368x4905e9fa() != c12767x7016a6fb) {
            return;
        }
        c12767x7016a6fb.m53374x64bf9516().i(k3Var, i17);
    }
}

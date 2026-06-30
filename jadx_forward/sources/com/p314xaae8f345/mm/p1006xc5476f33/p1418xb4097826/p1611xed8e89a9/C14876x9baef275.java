package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FlowLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Lzy2/xb;", "<init>", "()V", "com/tencent/mm/plugin/finder/profile/c0", "com/tencent/mm/plugin/finder/profile/d0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.FlowLayoutManager */
/* loaded from: classes15.dex */
public final class C14876x9baef275 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager implements zy2.xb {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275 f204829d;

    /* renamed from: e, reason: collision with root package name */
    public int f204830e;

    /* renamed from: f, reason: collision with root package name */
    public int f204831f;

    /* renamed from: g, reason: collision with root package name */
    public int f204832g;

    /* renamed from: h, reason: collision with root package name */
    public int f204833h;

    /* renamed from: i, reason: collision with root package name */
    public int f204834i;

    /* renamed from: m, reason: collision with root package name */
    public int f204835m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 f204836n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f204837o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f204838p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f204839q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f204840r;

    /* renamed from: s, reason: collision with root package name */
    public int f204841s;

    public C14876x9baef275() {
        mo8089xb148c794(true);
        this.f204829d = this;
        this.f204836n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0(this);
        this.f204837o = new java.util.ArrayList();
        this.f204838p = new android.util.SparseArray();
        this.f204840r = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically, reason: from getter */
    public boolean getF204840r() {
        return this.f204840r;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
    }

    public final void m(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (h3Var.f93598g || m8020x7e414b06() == 0) {
            return;
        }
        java.util.List list = this.f204837o;
        int size = ((java.util.ArrayList) list).size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.List list2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0) ((java.util.ArrayList) list).get(i17)).f204869c;
            int size2 = list2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                android.view.View view = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0) list2.get(i18)).f204861b;
                mo8052x6ae7e3a1(view, 0, 0);
                mo7989xbb8aeee6(view);
                android.graphics.Rect rect = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0) list2.get(i18)).f204862c;
                int i19 = rect.left;
                int i27 = rect.top;
                int i28 = this.f204834i;
                m8050xb62e03b2(view, i19, i27 - i28, rect.right, rect.bottom - i28);
            }
        }
    }

    public final void n() {
        java.util.List list = this.f204836n.f204869c;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0) list.get(i17);
            int m8032xa86cd69f = m8032xa86cd69f(c0Var.f204861b);
            android.util.SparseArray sparseArray = this.f204838p;
            float f17 = ((android.graphics.Rect) sparseArray.get(m8032xa86cd69f)).top;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var = this.f204836n;
            float f18 = 2;
            if (f17 < d0Var.f204867a + ((d0Var.f204868b - ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0) list.get(i17)).f204860a) / f18)) {
                android.graphics.Rect rect = (android.graphics.Rect) sparseArray.get(m8032xa86cd69f);
                if (rect == null) {
                    rect = new android.graphics.Rect();
                }
                int i18 = ((android.graphics.Rect) sparseArray.get(m8032xa86cd69f)).left;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var2 = this.f204836n;
                int i19 = (int) (d0Var2.f204867a + ((d0Var2.f204868b - ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0) list.get(i17)).f204860a) / f18));
                int i27 = ((android.graphics.Rect) sparseArray.get(m8032xa86cd69f)).right;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var3 = this.f204836n;
                rect.set(i18, i19, i27, (int) (d0Var3.f204867a + ((d0Var3.f204868b - ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0) list.get(i17)).f204860a) / f18) + m8013x8bb7462e(r4)));
                sparseArray.put(m8032xa86cd69f, rect);
                c0Var.f204862c = rect;
                list.set(i17, c0Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var4 = this.f204836n;
        d0Var4.getClass();
        d0Var4.f204869c = list;
        ((java.util.ArrayList) this.f204837o).add(this.f204836n);
        this.f204836n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0(this);
    }

    public int o(int i17) {
        java.util.List list = this.f204837o;
        if (i17 < ((java.util.ArrayList) list).size()) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0) ((java.util.ArrayList) list).get(i17)).f204869c.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler = z2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int i17 = this.f204831f;
        int i18 = 0;
        this.f204835m = 0;
        this.f204836n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0(this);
        java.util.List list = this.f204837o;
        ((java.util.ArrayList) list).clear();
        android.util.SparseArray sparseArray = this.f204838p;
        sparseArray.clear();
        m8076xba225f1();
        if (m8020x7e414b06() == 0) {
            m7996x5201473d(z2Var);
            this.f204834i = 0;
            return;
        }
        if (m8008x3d79f549() == 0 && state.f93598g) {
            return;
        }
        m7996x5201473d(z2Var);
        if (m8008x3d79f549() == 0) {
            this.f204830e = m8028x805c2682();
            this.f204832g = m8029x8b7f0b01();
            this.f204831f = m8031xf39fff7a();
            this.f204833h = (m8037x755bd410() - this.f204830e) - this.f204832g;
        }
        int m8020x7e414b06 = m8020x7e414b06();
        int i19 = i17;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (i27 < m8020x7e414b06) {
            try {
                android.view.View f17 = recycler.f(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
                if (8 != f17.getVisibility()) {
                    mo8052x6ae7e3a1(f17, i18, i18);
                    int m8014x2ea13bdf = m8014x2ea13bdf(f17);
                    int m8013x8bb7462e = m8013x8bb7462e(f17);
                    int i37 = i28 + m8014x2ea13bdf;
                    if (i37 <= this.f204833h) {
                        int i38 = this.f204830e + i28;
                        android.graphics.Rect rect = (android.graphics.Rect) sparseArray.get(i27);
                        if (rect == null) {
                            rect = new android.graphics.Rect();
                        }
                        android.graphics.Rect rect2 = rect;
                        rect2.set(i38, i19, m8014x2ea13bdf + i38, i19 + m8013x8bb7462e);
                        sparseArray.put(i27, rect2);
                        try {
                            i29 = java.lang.Math.max(i29, m8013x8bb7462e);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var = this.f204836n;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0(this, m8013x8bb7462e, f17, rect2);
                            d0Var.getClass();
                            d0Var.f204869c.add(c0Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var2 = this.f204836n;
                            d0Var2.f204867a = i19;
                            d0Var2.f204868b = i29;
                            i28 = i37;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            i28 = i37;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FlowLayoutManager", "onLayoutChildren e = " + e.getMessage() + ", i = " + i27 + " itemCount = " + m8020x7e414b06());
                            i27++;
                            recycler = z2Var;
                            i18 = 0;
                        }
                    } else {
                        if (this.f204839q) {
                            n();
                            this.f204835m += i29;
                            break;
                        }
                        n();
                        i19 += i29;
                        this.f204835m += i29;
                        int i39 = this.f204830e;
                        android.graphics.Rect rect3 = (android.graphics.Rect) sparseArray.get(i27);
                        if (rect3 == null) {
                            rect3 = new android.graphics.Rect();
                        }
                        rect3.set(i39, i19, i39 + m8014x2ea13bdf, i19 + m8013x8bb7462e);
                        sparseArray.put(i27, rect3);
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var3 = this.f204836n;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0 c0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.c0(this, m8013x8bb7462e, f17, rect3);
                            d0Var3.getClass();
                            d0Var3.f204869c.add(c0Var2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.d0 d0Var4 = this.f204836n;
                            d0Var4.f204867a = i19;
                            d0Var4.f204868b = m8013x8bb7462e;
                            i28 = m8014x2ea13bdf;
                            i29 = m8013x8bb7462e;
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            i28 = m8014x2ea13bdf;
                            i29 = m8013x8bb7462e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FlowLayoutManager", "onLayoutChildren e = " + e.getMessage() + ", i = " + i27 + " itemCount = " + m8020x7e414b06());
                            i27++;
                            recycler = z2Var;
                            i18 = 0;
                        }
                    }
                    if (i27 == m8020x7e414b06() - 1) {
                        n();
                        this.f204835m += i29;
                    }
                    if (this.f204841s > 0 && ((java.util.ArrayList) list).size() >= this.f204841s) {
                        break;
                    }
                }
            } catch (java.lang.Exception e19) {
                e = e19;
            }
            i27++;
            recycler = z2Var;
            i18 = 0;
        }
        this.f204835m = java.lang.Math.max(this.f204835m, p());
        m(z2Var, state);
    }

    public final int p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275 c14876x9baef275 = this.f204829d;
        return (c14876x9baef275.m8018x1c4fb41d() - c14876x9baef275.m8026xc96f6de6()) - c14876x9baef275.m8031xf39fff7a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int i18 = this.f204835m;
        int i19 = this.f204834i;
        if (i19 + i17 < 0) {
            i17 = -i19;
        } else if (i19 + i17 > i18 - p()) {
            i17 = (this.f204835m - p()) - this.f204834i;
        }
        this.f204834i += i17;
        mo8055xe23cdd48(-i17);
        m(recycler, state);
        return i17;
    }
}

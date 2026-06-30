package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2154xd1954cdd.ui.p2155xac8f1cfd.p2156xd0e2e03f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/wsfold/ui/component/recycler/ScaleLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager */
/* loaded from: classes4.dex */
public final class C17827xd9ca7419 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f245509d;

    /* renamed from: e, reason: collision with root package name */
    public final int f245510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f245511f;

    /* renamed from: g, reason: collision with root package name */
    public int f245512g;

    /* renamed from: h, reason: collision with root package name */
    public int f245513h;

    /* renamed from: i, reason: collision with root package name */
    public int f245514i;

    /* renamed from: m, reason: collision with root package name */
    public int f245515m;

    /* renamed from: n, reason: collision with root package name */
    public int f245516n;

    /* renamed from: o, reason: collision with root package name */
    public float f245517o;

    /* renamed from: p, reason: collision with root package name */
    public int f245518p;

    /* renamed from: q, reason: collision with root package name */
    public int f245519q;

    /* renamed from: r, reason: collision with root package name */
    public int f245520r;

    /* renamed from: s, reason: collision with root package name */
    public int f245521s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.l f245522t;

    public C17827xd9ca7419(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f245509d = c44.b.a(16);
        this.f245510e = c44.b.a(40);
        this.f245511f = c44.b.a(8);
        this.f245518p = 1;
        this.f245519q = -1;
        this.f245522t = j94.b.c(context, 0, 0, 6, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canScrollVertically", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canScrollVertically", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return layoutParams;
    }

    public final void m(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        float f17;
        float f18;
        float f19;
        float f27;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fill", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        jz5.l lVar = this.f245522t;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        if (intValue == 0 || intValue2 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fill", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        m7996x5201473d(z2Var);
        float f28 = this.f245517o / this.f245518p;
        float floor = f28 - ((float) java.lang.Math.floor(f28));
        int floor2 = this.f245516n + ((int) java.lang.Math.floor(r2));
        int i18 = this.f245511f;
        float f29 = intValue;
        float f37 = (f29 / 2.0f) - ((((this.f245512g / 2.0f) + i18) + (this.f245513h / 2.0f)) * floor);
        int p17 = p(floor);
        o(z2Var, floor2, f37, p17, intValue2);
        float f38 = p17 / 2.0f;
        float f39 = f37 + f38;
        int i19 = 1;
        while (true) {
            f17 = 1.0f;
            f18 = 0.0f;
            if (f39 >= f29 || i19 > this.f245515m + 2) {
                break;
            }
            int p18 = p(e06.p.e(java.lang.Math.abs(i19 - floor), 0.0f, 1.0f));
            float f47 = p18 / 2.0f;
            float f48 = f39 + i18 + f47;
            if (f48 - f47 < f29) {
                i17 = i19;
                o(z2Var, floor2 + i19, f48, p18, intValue2);
            } else {
                i17 = i19;
            }
            f39 = f48 + f47;
            i19 = i17 + 1;
        }
        float f49 = f37 - f38;
        int i27 = -1;
        while (f49 > f18 && (-i27) <= this.f245515m + 2) {
            int p19 = p(e06.p.e(java.lang.Math.abs(i27 - floor), f18, f17));
            float f57 = p19 / 2.0f;
            float f58 = (f49 - i18) - f57;
            if (f58 + f57 > f18) {
                f19 = f18;
                f27 = f17;
                o(z2Var, floor2 + i27, f58, p19, intValue2);
            } else {
                f19 = f18;
                f27 = f17;
            }
            f49 = f58 - f57;
            i27--;
            f18 = f19;
            f17 = f27;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fill", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }

    public final int n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentRealIndex", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        if (this.f245515m <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentRealIndex", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return 0;
        }
        int b17 = this.f245516n + a06.d.b(this.f245517o / this.f245518p);
        int i17 = this.f245515m;
        int i18 = ((b17 % i17) + i17) % i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentRealIndex", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return i18;
    }

    public final void o(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17, float f17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        if (i17 < 0 || i17 >= this.f245521s) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        android.view.View f18 = z2Var.f(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f18, "getViewForPosition(...)");
        mo7989xbb8aeee6(f18);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
        f18.measure(makeMeasureSpec, makeMeasureSpec);
        int b17 = a06.d.b(f17 - (i18 / 2.0f));
        int i27 = (i19 - i18) / 2;
        m8049xe4474aed(f18, b17, i27, b17 + i18, i27 + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int b17 = state.b();
        this.f245521s = b17;
        if (this.f245515m == 0 || b17 == 0) {
            m8077x28b7b1cd(recycler);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        jz5.l lVar = this.f245522t;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        if (intValue == 0 || intValue2 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        int i17 = intValue2 - (this.f245509d * 2);
        this.f245512g = i17;
        int i18 = intValue2 - (this.f245510e * 2);
        this.f245513h = i18;
        this.f245514i = i18 - i17;
        this.f245518p = i17 + this.f245511f;
        int i19 = this.f245519q;
        if (i19 >= 0) {
            this.f245516n = i19;
            this.f245517o = this.f245520r;
            this.f245519q = -1;
            this.f245520r = 0;
        }
        m(recycler);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }

    public final int p(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lerpSize", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        int b17 = a06.d.b(this.f245512g + (this.f245514i * f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lerpSize", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return b17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (i17 == 0 || this.f245515m == 0 || this.f245518p <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return 0;
        }
        this.f245517o += i17;
        m(recycler);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToPosition", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/recycler/ScaleLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        int intValue2 = ((java.lang.Integer) arrayList.get(1)).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        this.f245519q = intValue;
        this.f245520r = intValue2;
        m8087x46ac7299();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        yj0.a.f(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/recycler/ScaleLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollToPosition", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }
}

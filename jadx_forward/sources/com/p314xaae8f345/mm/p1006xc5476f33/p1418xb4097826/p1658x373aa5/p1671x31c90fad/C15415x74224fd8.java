package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/manager/FinderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lym5/o2;", "Lrx2/x;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager */
/* loaded from: classes10.dex */
public class C15415x74224fd8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de implements ym5.o2, rx2.x {
    public final jz5.g A;
    public int B;
    public boolean C;
    public boolean D;
    public yz5.p E;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 F;
    public int G;

    /* renamed from: v, reason: collision with root package name */
    public android.content.Context f214170v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f214171w;

    /* renamed from: x, reason: collision with root package name */
    public float f214172x;

    /* renamed from: y, reason: collision with root package name */
    public float f214173y;

    /* renamed from: z, reason: collision with root package name */
    public int f214174z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15415x74224fd8(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.h.b(new rx2.s(this));
        m8091xc21abdf5(false);
        this.f214172x = 5.0f;
        this.f214174z = 100;
        this.A = jz5.h.b(new rx2.r(this));
        this.C = true;
        this.D = true;
        this.G = -1;
        this.f214170v = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public int G(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i17 = this.f214174z;
        return i17 == -1 ? super.G(h3Var) : i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void P(int i17, int i18) {
        super.P(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLayoutManager", "[scrollToPositionWithOffset] position=" + i17 + " offset=" + i18);
    }

    public final void W(int i17) {
        if (i17 < 0 || i17 == this.G || this.f214174z > 1) {
            return;
        }
        this.f214174z = 100;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.F;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.requestLayout();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        return this.D && super.mo2416xc6ea780e();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return this.C && super.getF204840r();
    }

    @Override // rx2.x
    public void k(yz5.p pVar) {
        this.E = pVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: measureChildWithMargins */
    public void mo8052x6ae7e3a1(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (!this.f214171w) {
            super.mo8052x6ae7e3a1(child, i17, i18);
            return;
        }
        try {
            super.mo8052x6ae7e3a1(child, i17, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLayoutManager", "measureChildWithMargins error", e17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAttachedToWindow */
    public void mo8058xfc50800e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo8058xfc50800e(view);
        this.F = view;
        this.G = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 view, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        this.F = null;
        this.G = -1;
        super.mo7937x8876e98b(view, recycler);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onScrollStateChanged */
    public void mo8069x4d79408f(int i17) {
        super.mo8069x4d79408f(i17);
        this.B = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int mo2419x96d40915 = super.mo2419x96d40915(i17, z2Var, h3Var);
        if (mo2419x96d40915 == 0 && i17 != 0 && this.B == 2) {
            android.view.View m8007x6a486239 = m8007x6a486239(0);
            android.view.ViewParent parent = m8007x6a486239 != null ? m8007x6a486239.getParent() : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLayoutManager", "horizontal fling to end, " + i17 + ' ' + mo2419x96d40915 + ", " + c1163xf1deaba4);
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.f1();
            }
        }
        return mo2419x96d40915;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        super.mo2420xc593c771(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLayoutManager", "[scrollToPosition] position=" + i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        long currentTimeMillis = this.E == null ? 0L : java.lang.System.currentTimeMillis();
        try {
            int mo7922xd8d712a7 = super.mo7922xd8d712a7(i17, z2Var, h3Var);
            if (mo7922xd8d712a7 == 0 && i17 != 0 && this.B == 2) {
                android.view.View m8007x6a486239 = m8007x6a486239(0);
                android.view.ViewParent parent = m8007x6a486239 != null ? m8007x6a486239.getParent() : null;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLayoutManager", "vertical fling to end, " + i17 + ' ' + mo7922xd8d712a7 + ", " + c1163xf1deaba4);
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.f1();
                }
            }
            return mo7922xd8d712a7;
        } finally {
            yz5.p pVar = this.E;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.mo149xb9724478(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), h3Var);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLayoutManager", "[smoothScrollToPosition] position=" + i17);
        jz5.g gVar = this.A;
        ((rx2.q) ((jz5.n) gVar).mo141623x754a37bb()).f93582a = i17;
        m8099x6305639d((rx2.q) ((jz5.n) gVar).mo141623x754a37bb());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: supportsPredictiveItemAnimations */
    public boolean mo7924x9f0306c5() {
        return !((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.n1().r()).booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15415x74224fd8(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.h.b(new rx2.s(this));
        m8091xc21abdf5(false);
        this.f214172x = 5.0f;
        this.f214174z = 100;
        this.A = jz5.h.b(new rx2.r(this));
        this.C = true;
        this.D = true;
        this.G = -1;
        this.f214170v = context;
    }
}

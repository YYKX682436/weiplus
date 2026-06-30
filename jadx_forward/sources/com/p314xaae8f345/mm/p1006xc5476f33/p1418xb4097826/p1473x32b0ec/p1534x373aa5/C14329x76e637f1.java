package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lrx2/x;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager */
/* loaded from: classes10.dex */
public class C14329x76e637f1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de implements rx2.x {
    public static final int E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
    public yz5.a A;
    public final boolean B;
    public final int C;
    public yz5.p D;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f197521v;

    /* renamed from: w, reason: collision with root package name */
    public int f197522w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f197523x;

    /* renamed from: y, reason: collision with root package name */
    public int f197524y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.r f197525z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14329x76e637f1(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197521v = context;
        this.f197524y = -1;
        ae2.in inVar = ae2.in.f85221a;
        this.B = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.W2).mo141623x754a37bb()).r()).intValue() == 0;
        this.C = E + ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1.0f);
    }

    public static void Y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1 c14329x76e637f1, boolean z17, boolean z18, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelectedChild");
        }
        int i18 = 0;
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            c5445x963cab3 = null;
        }
        if (c14329x76e637f1.m8008x3d79f549() != 1) {
            if (super.mo2416xc6ea780e()) {
                int m8037x755bd410 = c14329x76e637f1.m8037x755bd410() / 2;
                int m8008x3d79f549 = c14329x76e637f1.m8008x3d79f549();
                while (i18 < m8008x3d79f549) {
                    android.view.View m8007x6a486239 = c14329x76e637f1.m8007x6a486239(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a486239);
                    int left = m8007x6a486239.getLeft();
                    android.view.View m8007x6a4862392 = c14329x76e637f1.m8007x6a486239(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862392);
                    if ((left + m8007x6a4862392.getRight()) / 2 == m8037x755bd410) {
                        break;
                    } else {
                        i18++;
                    }
                }
                i18 = -1;
            } else {
                int m8018x1c4fb41d = c14329x76e637f1.m8018x1c4fb41d() / 2;
                int m8008x3d79f5492 = c14329x76e637f1.m8008x3d79f549();
                while (i18 < m8008x3d79f5492) {
                    android.view.View m8007x6a4862393 = c14329x76e637f1.m8007x6a486239(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862393);
                    int top = m8007x6a4862393.getTop();
                    android.view.View m8007x6a4862394 = c14329x76e637f1.m8007x6a486239(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862394);
                    if ((top + m8007x6a4862394.getBottom()) / 2 == m8018x1c4fb41d) {
                        break;
                    } else {
                        i18++;
                    }
                }
                i18 = -1;
            }
        }
        if (i18 >= 0) {
            android.view.View m8007x6a4862395 = c14329x76e637f1.m8007x6a486239(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a4862395);
            int m8032xa86cd69f = c14329x76e637f1.m8032xa86cd69f(m8007x6a4862395);
            if (m8032xa86cd69f != c14329x76e637f1.f197524y || z17 || z18) {
                c14329x76e637f1.f197524y = m8032xa86cd69f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveLayoutManager", "selectedPosition:" + c14329x76e637f1.f197524y);
                yz5.r rVar = c14329x76e637f1.f197525z;
                if (rVar != null) {
                    rVar.C(java.lang.Integer.valueOf(c14329x76e637f1.f197524y), m8007x6a4862395, java.lang.Boolean.valueOf(z18), c5445x963cab3);
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public int G(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i17;
        return (!this.B || (i17 = this.C) == -1) ? super.G(h3Var) : i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void P(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveLayoutManager", "lxltest scrollToPositionWithOffset position:" + i17 + ", offset:" + i18);
        super.P(i17, i18);
    }

    public final boolean W(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (i19 > 0 && i17 != i19) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i17;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i17;
        }
        return true;
    }

    public final boolean X(android.view.View view, int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && m8046xbf836eb1() && W(view.getWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && W(view.getHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        return super.mo2416xc6ea780e();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        tn0.w0 w0Var;
        if (this.f93400d != 1 || this.f197521v.getResources().getConfiguration().orientation != 1) {
            return false;
        }
        android.view.View mo7935xa188593e = mo7935xa188593e(this.f197524y);
        android.view.View findViewById = mo7935xa188593e != null ? mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) findViewById : null;
        if (c14353xe7c1f419 != null ? c14353xe7c1f419.m57481xabf85283() : false) {
            return false;
        }
        if ((zl2.r4.f555483a.w1() || (w0Var = dk2.ef.f314911d) == null || !w0Var.X()) ? false : true) {
            return false;
        }
        android.view.View mo7935xa188593e2 = mo7935xa188593e(this.f197524y);
        android.view.KeyEvent.Callback findViewById2 = mo7935xa188593e2 != null ? mo7935xa188593e2.findViewById(com.p314xaae8f345.mm.R.id.fkn) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185 c14328x87868185 = findViewById2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185) findViewById2 : null;
        if (c14328x87868185 != null ? c14328x87868185.getInterceptTouch() : false) {
            return false;
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        return !(c1Var != null && c1Var.Z2);
    }

    @Override // rx2.x
    public void k(yz5.p pVar) {
        this.D = pVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: measureChild */
    public void mo8051xe81a0a5e(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
        m7995x142d145d(child, new android.graphics.Rect());
        int m7980xa05842f3 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8037x755bd410(), m8038xfc57f9d3(), m8028x805c2682() + m8029x8b7f0b01() + i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, mo2416xc6ea780e());
        int m7980xa05842f32 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8018x1c4fb41d(), m8019x47130b60(), m8031xf39fff7a() + m8026xc96f6de6() + i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, getF204840r());
        try {
            if (X(child, m7980xa05842f3, m7980xa05842f32, layoutParams2)) {
                child.measure(m7980xa05842f3, m7980xa05842f32);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveLayoutManager", "measureChild error", th6);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: measureChildWithMargins */
    public void mo8052x6ae7e3a1(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
        m7995x142d145d(child, new android.graphics.Rect());
        int m7980xa05842f3 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8037x755bd410(), m8038xfc57f9d3(), m8028x805c2682() + m8029x8b7f0b01() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, mo2416xc6ea780e());
        int m7980xa05842f32 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8018x1c4fb41d(), m8019x47130b60(), m8031xf39fff7a() + m8026xc96f6de6() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, getF204840r());
        try {
            if (X(child, m7980xa05842f3, m7980xa05842f32, layoutParams2)) {
                child.measure(m7980xa05842f3, m7980xa05842f32);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveLayoutManager", "measureChildWithMargins error", th6);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u5(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onScrollStateChanged */
    public void mo8069x4d79408f(int i17) {
        super.mo8069x4d79408f(i17);
        this.f197522w = i17;
        if (i17 == 0) {
            yz5.a aVar = this.A;
            if (aVar != null) {
                boolean booleanValue = ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveLayoutManager", "isNeedCheck = " + booleanValue);
                if (booleanValue) {
                    Y(this, true, false, null, 6, null);
                } else {
                    Y(this, false, false, null, 7, null);
                }
            }
            if (this.A == null) {
                Y(this, false, false, null, 7, null);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveLayoutManager", "lxltest scrollToPosition position:" + i17);
        super.mo2420xc593c771(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        long currentTimeMillis = this.D == null ? 0L : java.lang.System.currentTimeMillis();
        try {
            return super.mo7922xd8d712a7(i17, z2Var, h3Var);
        } finally {
            yz5.p pVar = this.D;
            if (pVar != null && currentTimeMillis > 0) {
                pVar.mo149xb9724478(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), h3Var);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveLayoutManager", "lxltest smoothScrollToPosition state:" + h3Var + ", position:" + i17);
        super.mo7942xd1b4653f(c1163xf1deaba4, h3Var, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: supportsPredictiveItemAnimations */
    public boolean mo7924x9f0306c5() {
        return false;
    }
}

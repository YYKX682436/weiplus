package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class s2 extends fc2.o {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f206875r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f206876s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f206877t;

    public s2(fc2.c cVar) {
        super(cVar);
        this.f206875r = "Finder.FinderProfileAllFlowEventSubscriber";
        new android.graphics.Rect();
        this.f206876s = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.y0().r()).intValue() == 1;
    }

    @Override // fc2.o
    public fc2.a c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        jz5.l lVar;
        int w17;
        int y17;
        int i18;
        int i19;
        int i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        fc2.y yVar = (fc2.y) h(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
            java.lang.Integer j07 = kz5.z.j0(c1164x587b7ff1.u(null));
            w17 = j07 != null ? j07.intValue() : 0;
            java.lang.Integer h07 = kz5.z.h0(c1164x587b7ff1.v(null));
            y17 = h07 != null ? h07.intValue() : 0;
        } else {
            if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
                lVar = new jz5.l(-1, -1);
                int intValue = ((java.lang.Number) lVar.f384366d).intValue();
                int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
                yVar.f342542g = intValue;
                yVar.f342543h = intValue2;
                yVar.f342545j = i(intValue, intValue2, recyclerView);
                i18 = this.f342493e;
                i19 = yVar.f342542g;
                if (i18 == i19 || this.f342494f != yVar.f342543h) {
                    if (i18 != Integer.MAX_VALUE || (i27 = this.f342494f) == Integer.MAX_VALUE) {
                        i27 = yVar.f342543h;
                    } else {
                        if (i19 < i18) {
                            i18 = i19;
                        }
                        int i28 = yVar.f342543h;
                        if (i28 > i27) {
                            i27 = i28;
                        }
                        i19 = i18;
                    }
                    yVar.f342544i = i(i19, i27, recyclerView);
                }
                this.f342493e = yVar.f342542g;
                this.f342494f = yVar.f342543h;
                return yVar;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            w17 = c1162x665295de.w();
            y17 = c1162x665295de.y();
        }
        boolean z17 = this.f206876s;
        int j17 = hc2.f1.j(recyclerView, z17, w17, 1);
        int j18 = hc2.f1.j(recyclerView, z17, y17, -1);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (w17 <= y17) {
            int i29 = w17;
            while (true) {
                android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i29);
                if (m8007x6a486239 != null) {
                    if (!(m8007x6a486239.isShown() && m8007x6a486239.getAlpha() > 0.0f && m8007x6a486239.getGlobalVisibleRect(rect))) {
                        if (i29 == w17) {
                            j17++;
                        } else {
                            j18--;
                        }
                    }
                }
                if (i29 == y17) {
                    break;
                }
                i29++;
            }
        }
        lVar = new jz5.l(java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(j18));
        int intValue3 = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue22 = ((java.lang.Number) lVar.f384367e).intValue();
        yVar.f342542g = intValue3;
        yVar.f342543h = intValue22;
        yVar.f342545j = i(intValue3, intValue22, recyclerView);
        i18 = this.f342493e;
        i19 = yVar.f342542g;
        if (i18 == i19) {
        }
        if (i18 != Integer.MAX_VALUE) {
        }
        i27 = yVar.f342543h;
        yVar.f342544i = i(i19, i27, recyclerView);
        this.f342493e = yVar.f342542g;
        this.f342494f = yVar.f342543h;
        return yVar;
    }

    @Override // fc2.o
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f206875r, "onInvisible visible=" + this.f206877t);
        if (this.f206877t) {
            super.e();
        }
        this.f206877t = false;
    }

    @Override // fc2.o
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f206875r, "onVisible visible=" + this.f206877t);
        if (!this.f206877t) {
            super.f();
        }
        this.f206877t = true;
    }

    public fc2.a h(int i17) {
        return new fc2.y(i17);
    }

    public final java.util.List i(int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 < 0 || i18 < 0 || i17 > i18) {
            return kz5.n0.V0(linkedList);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if (mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19;
            java.util.List m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820();
            if (i17 <= i18) {
                int i19 = 0;
                while (true) {
                    int a07 = i17 - c22848x6ddd90cf.a0();
                    if (a07 >= 0 && a07 < m82898xfb7e5820.size()) {
                        in5.c cVar = (in5.c) m82898xfb7e5820.get(a07);
                        if (cVar.mo2128x1ed62e84() != 0 && (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
                            if (abstractC14490x69736cb5.getFeedObject().getProfileTabScene() == 3 || abstractC14490x69736cb5.getFeedObject().getProfileTabScene() == 12 || abstractC14490x69736cb5.getFeedObject().getProfileTabScene() == 5) {
                                fc2.r rVar = new fc2.r((so2.j5) cVar, i19, null, 4, null);
                                in5.v0 v0Var = (in5.v0) c22848x6ddd90cf.f295254z.get(cVar.mo2128x1ed62e84());
                                if (v0Var != null) {
                                    rVar.f342512c = v0Var;
                                }
                                linkedList.add(rVar);
                                i19++;
                            }
                        }
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17++;
                }
            }
        }
        return kz5.n0.V0(linkedList);
    }
}

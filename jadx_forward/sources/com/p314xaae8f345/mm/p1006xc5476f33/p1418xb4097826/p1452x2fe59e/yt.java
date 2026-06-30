package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class yt implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.et {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f192730d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a f192731e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ft f192732f;

    /* renamed from: g, reason: collision with root package name */
    public final ey2.t0 f192733g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f192734h;

    /* renamed from: i, reason: collision with root package name */
    public int f192735i;

    /* renamed from: m, reason: collision with root package name */
    public long f192736m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f192737n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f192738o;

    /* renamed from: p, reason: collision with root package name */
    public final so2.s f192739p;

    /* renamed from: q, reason: collision with root package name */
    public final ym5.q1 f192740q;

    public yt(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f192730d = activity;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        this.f192733g = t0Var;
        this.f192734h = t0Var.R6(1000);
        this.f192736m = -1L;
        this.f192739p = new so2.s(null, 0, 0, null, 15, null);
        this.f192740q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xt(this);
    }

    public void c(long j17, boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f17 = h().f();
        if (f17 != null) {
            f17.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gt(f17, z17), j17);
        }
    }

    public final int f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            int[] iArr = new int[2];
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager).u(iArr);
            return iArr[1];
        }
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        }
        return 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a = this.f192731e;
        if (c13865x4e81e68a != null) {
            return c13865x4e81e68a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ft h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ft ftVar = this.f192732f;
        if (ftVar != null) {
            return ftVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    public void i(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa = h().mo56062x4905e9fa();
        if (mo56062x4905e9fa == null) {
            return;
        }
        int f17 = f(mo56062x4905e9fa);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTimelineLbsMixPresenter", "[onActionbarClick] position=" + f17 + " isDouble=" + z17);
        if (f17 <= 12) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo56062x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
            mo56062x4905e9fa.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo56062x4905e9fa, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo56062x4905e9fa, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            mo56062x4905e9fa.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo56062x4905e9fa, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter", "onActionbarClick", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f192730d;
        if (!z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar != null) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).aj(nyVar.V6(), 1, 0);
                return;
            }
            return;
        }
        if (f17 <= 12) {
            c(20L, false);
        } else {
            c(600L, false);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 != null) {
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).aj(nyVar2.V6(), 5, 0);
        }
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        g().m56401x31d4943c(this.f192740q);
        ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).T6(1000);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.et
    /* renamed from: onLoadMore */
    public void mo56059x1318b45a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(g(), false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.et
    /* renamed from: onRefresh */
    public void mo56060x905893fc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qt qtVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qt(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ut utVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ut(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vt vtVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vt(this);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            qtVar.mo152xb9724478();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            vtVar.mo152xb9724478();
        } else {
            utVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.et
    /* renamed from: onRefreshEnd */
    public void mo56061xb3ee2b3f(ym5.s3 reason) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f17;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f192736m = c01.id.c();
        if (reason.f545056h <= 0 && (f18 = h().f()) != null) {
            f18.W(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q1(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wt.f192540d);
        }
        if (reason.f545054f) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f19 = h().f();
            boolean z17 = false;
            if (((f19 == null || f19.isHasBottomMore) ? false : true) && (f17 = h().f()) != null) {
                f17.m82693x1501d518(true);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f27 = h().f();
            if (f27 != null && !f27.getEnableLoadMore()) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f28 = h().f();
                if (f28 != null) {
                    f28.m82688x390c1d00(true);
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f29 = h().f();
                if (f29 != null) {
                    android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f192730d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                    f29.m82697xe136b7d8(inflate);
                }
            }
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ht(reason, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.et
    public void y0(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6508x880ec326 struct, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 lbsItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lbsItem, "lbsItem");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f192730d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 a76 = nyVar != null ? nyVar.a7(-1) : null;
        if (a76 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p5) {
            struct.f138526g = this.f192736m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p5 p5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p5) a76;
            p5Var.getClass();
            p5Var.T0(struct);
            p5Var.S0(struct, lbsItem);
            if (i17 >= 0) {
                java.util.LinkedList linkedList = lbsItem.f208832b;
                if (i17 < linkedList.size()) {
                    struct.f138533n = i17;
                    java.lang.Object obj = linkedList.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    p5Var.U0(struct, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj);
                }
            }
            struct.k();
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public class b9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f187895s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f187896t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f187897u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13755xe59fa634 f187898v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f187899w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.l f187900x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f187901y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f187902z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter$feedChangeListener$1] */
    public b9(int i17, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, boolean z17, boolean z18, boolean z19, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context, 0, 2, null);
        z17 = (i18 & 4) != 0 ? false : z17;
        z18 = (i18 & 8) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f187895s = z17;
        this.f187896t = z18;
        this.f187897u = new java.util.ArrayList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f187898v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter$feedChangeListener$1
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9.this, event));
                return true;
            }
        };
        this.f187900x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z8(this);
        this.f187902z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y8(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        if (i0Var != null) {
            i0Var.r(this.f187897u);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.D(callback);
        mo48813x58998cd();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.class)).P6(callback.m56068x4905e9fa());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = i0Var != null ? i0Var.m56068x4905e9fa() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = m56068x4905e9fa instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56068x4905e9fa : null;
        if (c13728x20aad6ea != null) {
            c13728x20aad6ea.m55765x156e0547(this.f187900x);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = this.f187957g;
        android.view.ViewParent m56068x4905e9fa2 = i0Var2 != null ? i0Var2.m56068x4905e9fa() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea2 = m56068x4905e9fa2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56068x4905e9fa2 : null;
        if (c13728x20aad6ea2 == null) {
            return;
        }
        c13728x20aad6ea2.m55761xe02f1f0f(this.f187902z);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void P() {
    }

    public final so2.j5 Q() {
        java.util.ArrayList arrayList = this.f187897u;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            return null;
        }
        return (so2.j5) arrayList.get(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fp
    public int c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        so2.j5 Q = Q();
        return Q != null && (feed.mo2128x1ed62e84() > Q.mo2128x1ed62e84() ? 1 : (feed.mo2128x1ed62e84() == Q.mo2128x1ed62e84() ? 0 : -1)) == 0 ? 0 : -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public boolean d0() {
        return this.f187896t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fp
    public java.util.ArrayList f() {
        return this.f187897u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type != 2) {
                    if (type != 4) {
                        if (type == 9) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9 b9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9.this;
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf(b9Var.f187962o, b9Var, b9Var.f187895s, 0, 0, 24, null);
                        }
                        if (type != 3001) {
                            if (type != 3002) {
                                hc2.l.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9.this.v(), type);
                                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9 b9Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9.this;
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh(b9Var2.f187962o, b9Var2, b9Var2.f187895s, 0, false, 24, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9 b9Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b9.this;
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df(b9Var3, b9Var3.f187895s, 0, false, 12, null);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (this.f187896t) {
            menu.b(108, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0, com.p314xaae8f345.mm.R.raw.f80075x444ae503);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (feed.getFeedObject().m59303x7d1523() || !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a.c0(context)) {
                menu.g(107, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwf), com.p314xaae8f345.mm.R.raw.f80064x214d7a07);
            } else {
                menu.g(106, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572896cv4), com.p314xaae8f345.mm.R.raw.f80065x5d7d9c0);
            }
        }
        super.m(feed, menu, sheet, holder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v(), "createSecond MenumentionListSelected : " + feed.getFeedObject().m59266x2e40492d());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        super.mo979x3f5eee52();
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = i0Var != null ? i0Var.m56068x4905e9fa() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = m56068x4905e9fa instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56068x4905e9fa : null;
        if (c13728x20aad6ea != null) {
            c13728x20aad6ea.m55765x156e0547(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = this.f187957g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa2 = i0Var2 != null ? i0Var2.m56068x4905e9fa() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea2 = m56068x4905e9fa2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56068x4905e9fa2 : null;
        if (c13728x20aad6ea2 == null) {
            return;
        }
        c13728x20aad6ea2.m55761xe02f1f0f(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public boolean q() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public so2.j5 s(int i17) {
        return Q();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa y() {
        so2.j5 Q = Q();
        return Q != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa(Q, null, 2, null) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa(null, 1, null);
    }
}

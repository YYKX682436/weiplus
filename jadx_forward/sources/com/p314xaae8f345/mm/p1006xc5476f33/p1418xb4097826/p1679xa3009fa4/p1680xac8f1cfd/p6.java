package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class p6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f217051d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f217052e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f217053f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f217054g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f217055h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f217056i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f217057m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f217058n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f217059o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f217060p;

    /* renamed from: q, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2495xc50a8b8b.g f217061q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f217062r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217058n = new java.util.ArrayList();
        this.f217059o = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f217060p = "Finder.FinderCollectionPurchaseListUIC";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p6 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e6
            if (r0 == 0) goto L16
            r0 = r9
            com.tencent.mm.plugin.finder.viewmodel.component.e6 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e6) r0
            int r1 = r0.f215729f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f215729f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.viewmodel.component.e6 r0 = new com.tencent.mm.plugin.finder.viewmodel.component.e6
            r0.<init>(r8, r9)
        L1b:
            r5 = r0
            java.lang.Object r9 = r5.f215727d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f215729f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L7b
            goto L74
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L7b
            db2.k1 r1 = new db2.k1     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.protobuf.g r9 = r8.f217061q     // Catch: java.lang.Throwable -> L7b
            android.app.Activity r8 = r8.m80379x76847179()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r3)     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r8 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f     // Catch: java.lang.Throwable -> L7b
            r4 = 0
            if (r3 == 0) goto L5b
            androidx.appcompat.app.AppCompatActivity r8 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r8     // Catch: java.lang.Throwable -> L7b
            pf5.z r3 = pf5.z.f435481a     // Catch: java.lang.Throwable -> L7b
            pf5.v r8 = r3.a(r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r3)     // Catch: java.lang.Throwable -> L7b
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r8     // Catch: java.lang.Throwable -> L7b
            goto L5c
        L5b:
            r8 = r4
        L5c:
            if (r8 == 0) goto L62
            r45.qt2 r4 = r8.V6()     // Catch: java.lang.Throwable -> L7b
        L62:
            r1.<init>(r9, r4)     // Catch: java.lang.Throwable -> L7b
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f215729f = r2     // Catch: java.lang.Throwable -> L7b
            r2 = r8
            java.lang.Object r9 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r0) goto L74
            goto L87
        L74:
            r45.f91 r9 = (r45.f91) r9     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L7b:
            r8 = move-exception
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r8 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8)
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r8)
        L86:
            r0 = r8
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p6.O6(com.tencent.mm.plugin.finder.viewmodel.component.p6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if ((r2 != null ? r2.m75939xb282bd08(13) : 1) == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if ((r2 != null ? r2.m75939xb282bd08(13) : 1) == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p6 r7, r45.f91 r8) {
        /*
            r7.getClass()
            r0 = 1
            java.util.LinkedList r8 = r8.m75941xfb821914(r0)
            java.lang.String r1 = "getCollection_info(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L16:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r8.next()
            r45.do2 r2 = (r45.do2) r2
            nr2.m r3 = new nr2.m
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            r3.<init>(r2)
            boolean r2 = r3.p()
            r4 = 13
            r45.do2 r5 = r3.f420801d
            r6 = 0
            if (r2 == 0) goto L46
            com.tencent.mm.protobuf.f r2 = r5.m75936x14adae67(r6)
            r45.uz0 r2 = (r45.uz0) r2
            if (r2 == 0) goto L42
            int r2 = r2.m75939xb282bd08(r4)
            goto L43
        L42:
            r2 = r0
        L43:
            if (r2 != r0) goto L5d
            goto L5c
        L46:
            boolean r2 = r3.q()
            if (r2 == 0) goto L5c
            com.tencent.mm.protobuf.f r2 = r5.m75936x14adae67(r0)
            r45.n11 r2 = (r45.n11) r2
            if (r2 == 0) goto L59
            int r2 = r2.m75939xb282bd08(r4)
            goto L5a
        L59:
            r2 = r0
        L5a:
            if (r2 != r0) goto L5d
        L5c:
            r6 = r0
        L5d:
            if (r6 == 0) goto L74
            long r2 = r3.l()
            java.lang.String r2 = pm0.v.u(r2)
            java.lang.String r3 = "skip course invalid "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = r7.f217060p
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            r3 = 0
        L74:
            if (r3 == 0) goto L16
            r1.add(r3)
            goto L16
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p6.P6(com.tencent.mm.plugin.finder.viewmodel.component.p6, r45.f91):java.util.List");
    }

    public final android.widget.FrameLayout Q6() {
        android.widget.FrameLayout frameLayout = this.f217053f;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
        throw null;
    }

    public final android.view.View R6() {
        android.view.View view = this.f217056i;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final void S6() {
        Q6().setVisibility(8);
        R6().setOnClickListener(null);
    }

    public final void T6() {
        Q6().setVisibility(0);
        android.view.View view = this.f217054g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f217055h;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View R6 = R6();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCollectionPurchaseListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getRecyclerView */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m63215x4905e9fa() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f217052e;
        if (c22849x81a93d25 != null) {
            return c22849x81a93d25;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    /* renamed from: getRlLayout */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f m63216x96811f7a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f217051d;
        if (c15343x638a173f != null) {
            return c15343x638a173f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f217051d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66 c15425x2593fa66 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66(m80379x76847179(), null);
        c15425x2593fa66.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsd);
        m63216x96811f7a().D(c15425x2593fa66);
        android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f217052e = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById2;
        m63215x4905e9fa().m7963x830bc99d(true);
        m63215x4905e9fa().m7965x440a0e9(4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m63215x4905e9fa().m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        m63215x4905e9fa().mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(m80379x76847179()));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m63215x4905e9fa = m63215x4905e9fa();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderCollectionPurchaseListUIC$getAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == nr2.m.class.hashCode()) {
                    return new nr2.m1();
                }
                hc2.l.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p6.this.f217060p, type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, this.f217058n, false);
        this.f217057m = c22848x6ddd90cf;
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f6(this);
        m63215x4905e9fa.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.View findViewById3 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.kxr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f217053f = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.oai);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f217054g = findViewById4;
        android.view.View findViewById5 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.oao);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f217055h = findViewById5;
        android.view.View findViewById6 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.oav);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f217056i = findViewById6;
        S6();
        m63216x96811f7a().m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g6(this));
        T6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f217060p, "requestInit CgiFinderGetTopicFeed");
        p3325xe03a0797.p3326xc267989b.l.d(this.f217059o, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k6(this, null), 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f217058n = new java.util.ArrayList();
        this.f217059o = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f217060p = "Finder.FinderCollectionPurchaseListUIC";
    }
}

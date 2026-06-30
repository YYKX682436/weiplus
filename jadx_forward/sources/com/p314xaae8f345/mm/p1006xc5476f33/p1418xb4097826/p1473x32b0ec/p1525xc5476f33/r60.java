package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class r60 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements vd2.j5 {
    public final android.graphics.Point A;
    public p3325xe03a0797.p3326xc267989b.r2 B;
    public p3325xe03a0797.p3326xc267989b.r2 C;
    public java.lang.Long D;
    public java.lang.String E;
    public final java.util.List F;
    public final java.util.List G;
    public final java.util.List H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.l f195627J;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f195628p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f195629q;

    /* renamed from: r, reason: collision with root package name */
    public final qo0.c f195630r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f195631s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f195632t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f195633u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f195634v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.ViewGroup f195635w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ScrollView f195636x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f195637y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.ViewGroup f195638z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(android.view.ViewGroup liveRootView, android.view.ViewGroup promoteBubbleContainerParent, qo0.c statusMonitor) {
        super(promoteBubbleContainerParent, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRootView, "liveRootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promoteBubbleContainerParent, "promoteBubbleContainerParent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195628p = liveRootView;
        this.f195629q = promoteBubbleContainerParent;
        this.f195630r = statusMonitor;
        this.f195631s = "FinderLivePromoteBubblePlugin";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f195632t = linkedList;
        this.A = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.F = kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj.class);
        this.G = kz5.c0.i(cm2.y.class, cm2.z.class);
        this.H = kz5.c0.i(cm2.m0.class, cm2.k0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i6.class);
        this.I = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t50(this));
        this.f195627J = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f60(this);
        android.view.View findViewById = promoteBubbleContainerParent.findViewById(com.p314xaae8f345.mm.R.id.fio);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f195635w = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = promoteBubbleContainerParent.findViewById(com.p314xaae8f345.mm.R.id.fip);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f195636x = (android.widget.ScrollView) findViewById2;
        android.view.View findViewById3 = promoteBubbleContainerParent.findViewById(com.p314xaae8f345.mm.R.id.fil);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f195637y = findViewById3;
        android.view.View findViewById4 = promoteBubbleContainerParent.findViewById(com.p314xaae8f345.mm.R.id.fim);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById4).getPaint(), 0.8f);
        android.view.View findViewById5 = promoteBubbleContainerParent.findViewById(com.p314xaae8f345.mm.R.id.qya);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f195638z = (android.view.ViewGroup) findViewById5;
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f50(this));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g50(this));
        if (x0()) {
            return;
        }
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(promoteBubbleContainerParent.getContext());
        if (b17.x >= (b17.y / 3) * 2) {
            android.view.ViewGroup.LayoutParams layoutParams = promoteBubbleContainerParent.getLayoutParams();
            layoutParams.width = (b17.x / 2) + ((int) promoteBubbleContainerParent.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561262dl));
            promoteBubbleContainerParent.setLayoutParams(layoutParams);
        }
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var, cm2.t tVar) {
        cm2.t A;
        r60Var.getClass();
        java.lang.String str = "[addPromoteData],promoteData = " + tVar.f124918d;
        java.lang.String str2 = r60Var.f195631s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = r60Var.f195633u;
        if (((ep0Var == null || (A = ep0Var.A()) == null) ? -1L : A.f124918d) == tVar.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[addPromoteData],promoteData = " + tVar.f124918d + ", already add");
            return;
        }
        if (!((mm2.f6) r60Var.P0(mm2.f6.class)).f410568i && ((tVar instanceof cm2.m0) || (tVar instanceof cm2.k0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveShopSlice", "shoppingAvailable false, reset promotingProduct");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBubble: reportExtBuff:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = tVar.f124930s;
        sb6.append(gVar != null ? new java.lang.String(gVar.g(), r26.c.f450398a) : "");
        sb6.append(", businessExtBuff:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = tVar.f124931t;
        sb6.append(gVar2 != null ? new java.lang.String(gVar2.g(), r26.c.f450398a) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kenneth_PromoteReport", sb6.toString());
        r60Var.E1(tVar);
        r60Var.x1(tVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 C1 = r60Var.C1(tVar);
        if (C1 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var2 = r60Var.f195633u;
            if (ep0Var2 != null) {
                ep0Var2.l0();
            }
            if (r60Var.f195634v != null) {
                ((mm2.i5) r60Var.P0(mm2.i5.class)).f410673f.mo7808x76db6cb1(null);
            }
            C1.l(tVar);
            r60Var.F1(null);
            r60Var.y1(C1);
            r60Var.v1(r60Var.f195633u, C1);
            r60Var.f195633u = C1;
            ((mm2.f6) r60Var.P0(mm2.f6.class)).c7(tVar);
            df2.pv pvVar = (df2.pv) r60Var.U0(df2.pv.class);
            if (pvVar != null) {
                pvVar.d7(r60Var);
            }
            r60Var.G1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(r60Var, null, r60Var.f195631s, false, 4, null);
        }
        ((mm2.f6) r60Var.P0(mm2.f6.class)).L = 0L;
        pm0.v.V(1000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s50(r60Var));
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk dkVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui uiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui) r60Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ui.class);
        if (uiVar != null && (dkVar = uiVar.f196101p) != null) {
            dkVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ll0 ll0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ll0) r60Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ll0.class);
        if (ll0Var != null) {
            ll0Var.t1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hz hzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hz) r60Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hz.class);
        if (hzVar != null) {
            hzVar.v1();
        }
        ((mm2.c1) r60Var.P0(mm2.c1.class)).J2.mo7808x76db6cb1(java.lang.Boolean.FALSE);
    }

    public final void A1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var, yz5.a aVar) {
        if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class);
            if (c4Var != null) {
                c4Var.H1();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            if (ag0Var != null) {
                ag0Var.L1();
            }
        }
        if (ep0Var != null) {
            ep0Var.R(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c60(aVar));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        this.f446856d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j60(this, bundle, obj, j17), 500L);
    }

    public final void B1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var2) {
        android.view.View mo56902xfb86a31b = ep0Var != null ? ep0Var.mo56902xfb86a31b() : null;
        android.view.View mo56902xfb86a31b2 = ep0Var2.mo56902xfb86a31b();
        D1("doShopBubbleShowAnimate", mo56902xfb86a31b);
        android.view.ViewGroup viewGroup = this.f195635w;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
            throw null;
        }
        viewGroup.addView(mo56902xfb86a31b2);
        if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class);
            if (c4Var != null) {
                c4Var.H1();
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            if (ag0Var != null) {
                ag0Var.L1();
            }
        }
        if (!ep0Var2.q0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IFinderLivePromoteItem", "runShopBubbleAnimateV2 when shopping not visible");
            return;
        }
        android.view.View mo56902xfb86a31b3 = ep0Var2.mo56902xfb86a31b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo56902xfb86a31b3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float floatValue = ((java.lang.Float) arrayList.get(0)).floatValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo56902xfb86a31b3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        mo56902xfb86a31b3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(mo56902xfb86a31b3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        yj0.a.f(mo56902xfb86a31b3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "runShopBubbleAnimateV2", "(Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewGroup.LayoutParams layoutParams = mo56902xfb86a31b3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = -((int) mo56902xfb86a31b3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br));
        }
        mo56902xfb86a31b3.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zo0(mo56902xfb86a31b3, ep0Var2, this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 C1(cm2.t tVar) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q50 q50Var : this.f195632t) {
            if (q50Var.a(tVar)) {
                return q50Var.b(tVar);
            }
        }
        return null;
    }

    @Override // vd2.j5
    public void C4() {
        K0(0);
    }

    public final void D1(java.lang.String str, android.view.View view) {
        java.lang.Boolean bool;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[removeOldViewAndLog] ");
        sb6.append(str);
        sb6.append(", contains:");
        android.view.ViewGroup viewGroup = this.f195635w;
        if (view == null) {
            bool = null;
        } else {
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
                throw null;
            }
            bool = java.lang.Boolean.valueOf(viewGroup.indexOfChild(view) != -1);
        }
        sb6.append(bool);
        sb6.append("?:false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195631s, sb6.toString());
        if (viewGroup != null) {
            viewGroup.removeView(view);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
            throw null;
        }
    }

    public final void E1(cm2.t tVar) {
        cm2.t A;
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f195633u;
        if (tVar.f124918d != ((ep0Var == null || (A = ep0Var.A()) == null) ? 0L : A.f124918d)) {
            df2.nt ntVar = (df2.nt) U0(df2.nt.class);
            if (ntVar != null) {
                r45.yp5 yp5Var = new r45.yp5();
                yp5Var.set(0, java.lang.Long.valueOf(tVar.f124918d));
                yp5Var.set(2, 1);
                yp5Var.set(1, 1);
                yp5Var.set(3, tVar.f124930s);
                ntVar.a7(yp5Var);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = tVar.f124930s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kenneth_PromoteReport", "[reportExpose] reportExtBuff:".concat(gVar != null ? new java.lang.String(gVar.g(), r26.c.f450398a) : ""));
        }
    }

    public final void F1(java.lang.Boolean bool) {
        if (zl2.r4.f555483a.y1(S0())) {
            return;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) ((je2.h) P0(je2.h.class)).f380766f.mo3195x754a37bb();
        int i17 = bool != null ? bool.booleanValue() : bool2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, java.lang.Boolean.FALSE) ? 0 : 8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f195633u;
        if (ep0Var != null) {
            android.view.View findViewById = ep0Var.mo56902xfb86a31b().findViewById(ep0Var.e0());
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            y1(ep0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var2 = this.f195634v;
        if (ep0Var2 != null) {
            android.view.View findViewById2 = ep0Var2.mo56902xfb86a31b().findViewById(ep0Var2.e0());
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "showOrHideCloseView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            y1(ep0Var2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    public final void G1() {
        java.lang.String str;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f b17;
        so2.j5 j5Var = ((mm2.f6) S0().a(mm2.f6.class)).f410582w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        r45.qc2 qc2Var = new r45.qc2();
        qc2Var.set(0, java.lang.Long.valueOf(tVar != null ? tVar.f124918d : 0L));
        qc2Var.set(1, tVar != null ? tVar.a() : null);
        qc2Var.set(2, tVar != null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(tVar.b().mo14344x5f01b1f6()) : null);
        if (tVar == null || (str = tVar.f124929r) == null) {
            str = "";
        }
        qc2Var.set(4, str);
        qc2Var.set(5, ((mm2.f6) S0().a(mm2.f6.class)).N);
        java.lang.Object obj2 = "null";
        if (tVar == null || (b17 = tVar.b()) == null || (obj = pm0.b0.g(b17)) == null) {
            obj = "null";
        }
        if (tVar != null) {
            r45.d52 d52Var = new r45.d52();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g a17 = tVar.a();
            if (a17 != null) {
                d52Var.mo11468x92b714fd(a17.g());
            }
            java.lang.Object g17 = pm0.b0.g(d52Var);
            if (g17 != null) {
                obj2 = g17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195631s, "[startOrUpdatePollingData] update polling extBUf = " + qc2Var.m75934xbce7f2f(1) + ", current_promoting_id = " + qc2Var.m75942xfb822ef2(0) + ", promote_info_buffer = " + obj + ", ext_buffer = " + obj2);
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.h(10, qc2Var);
    }

    @Override // qo0.a
    public void I0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f195633u;
        if (ep0Var != null) {
            ep0Var.mo56918xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p60(status, bundle, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        if (!((mm2.c1) P0(mm2.c1.class)).R5) {
            z1(false, false, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f195633u;
        if (ep0Var != null) {
            ep0Var.t();
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        dk2.ef.f314925k.f(10);
        this.f195633u = null;
        w1();
    }

    @Override // vd2.j5
    public java.lang.String Q() {
        return this.f195631s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void g1(android.content.res.Configuration configuration) {
        if (x0()) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f195629q;
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext());
        if (b17.x >= (b17.y / 3) * 2) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = (b17.x / 2) + ((int) viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561262dl));
            viewGroup.setLayoutParams(layoutParams);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.width = -1;
            viewGroup.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void i1(android.os.Bundle bundle) {
        this.f446856d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g60(this, bundle), 500L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void j1(android.os.Bundle bundle, long j17) {
        this.f446856d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h60(this, bundle, j17), 500L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        this.f446856d.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i60(this, bundle, obj), 500L);
    }

    @Override // vd2.j5
    public void o1() {
        K0(8);
    }

    @Override // vd2.j5
    /* renamed from: priority */
    public int mo56972xba8879a4() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var2) {
        android.view.View mo56902xfb86a31b = ep0Var != null ? ep0Var.mo56902xfb86a31b() : null;
        android.view.View mo56902xfb86a31b2 = ep0Var2.mo56902xfb86a31b();
        android.view.ViewGroup viewGroup = this.f195635w;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
            throw null;
        }
        if (viewGroup.getChildCount() == 0 || mo56902xfb86a31b == null) {
            if (ep0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0) {
                B1(ep0Var, ep0Var2);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[addPromoteBubbleAnim] addView when container cnt = ");
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
                throw null;
            }
            sb6.append(viewGroup.getChildCount());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195631s, sb6.toString());
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
                throw null;
            }
            viewGroup.addView(mo56902xfb86a31b2);
            if (viewGroup != null) {
                viewGroup.requestLayout();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
                throw null;
            }
        }
        if (ep0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0) {
            A1(ep0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r50(this, ep0Var2, ep0Var, mo56902xfb86a31b, mo56902xfb86a31b2));
            return;
        }
        android.view.View mo56902xfb86a31b3 = ep0Var != null ? ep0Var.mo56902xfb86a31b() : null;
        android.view.View mo56902xfb86a31b4 = ep0Var2.mo56902xfb86a31b();
        if (ep0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0) {
            B1(ep0Var, ep0Var2);
            return;
        }
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
            throw null;
        }
        int height = viewGroup.getHeight();
        android.view.ViewGroup viewGroup2 = this.f195629q;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        layoutParams.height = height;
        viewGroup2.setLayoutParams(layoutParams);
        viewGroup.addView(mo56902xfb86a31b4);
        mo56902xfb86a31b4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b60(mo56902xfb86a31b3, mo56902xfb86a31b4, this, ep0Var2));
    }

    public final void w1() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.B;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.D = null;
        this.E = null;
    }

    public final void x1(cm2.t tVar) {
        if (zl2.r4.f555483a.y1(S0())) {
            return;
        }
        so2.j5 j5Var = ((mm2.f6) P0(mm2.f6.class)).f410582w;
        cm2.t tVar2 = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        long j17 = tVar2 != null ? tVar2.f124918d : 0L;
        java.lang.String str = "[checkAndLaunchDelayDismissJob] curPromoteDataId = " + j17 + " , remotePromoteDataId = " + tVar.f124918d + " , delay:" + tVar.f124923i;
        java.lang.String str2 = this.f195631s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (j17 == tVar.f124918d && this.f195633u != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[checkAndLaunchDelayDismissJob] return");
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.C;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        cm2.t tVar3 = tVar.f124923i > 0 ? tVar : null;
        if (tVar3 != null) {
            this.C = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u50(tVar3, this, tVar, null), 3, null);
        }
    }

    public final void y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var) {
        kn0.p pVar;
        tn0.w0 Z0 = Z0();
        boolean z17 = false;
        if (Z0 != null && (pVar = Z0.D) != null && pVar.f()) {
            z17 = true;
        }
        java.lang.String str = this.f195631s;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkLayout] float mode, return.");
        } else if (x0()) {
            if (this.F.contains(ep0Var.getClass())) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkLayout] enter");
            ep0Var.mo56902xfb86a31b().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v50(ep0Var, this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.i5) P0(mm2.i5.class)).f410673f;
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d60(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442 = ((je2.h) P0(je2.h.class)).f380766f;
        c14227x4262fb442.f193193d = true;
        c14227x4262fb442.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e60(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.z1(boolean, boolean, boolean):void");
    }
}

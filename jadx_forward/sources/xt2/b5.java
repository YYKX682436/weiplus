package xt2;

/* loaded from: classes3.dex */
public final class b5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 D;
    public android.view.View E;
    public android.view.View F;
    public yz5.a G;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f538169h;

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f538170i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f538171m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f538172n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f538173o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f538174p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f538175q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f538176r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f538177s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f538178t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f538179u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f538180v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f538181w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f538182x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f538183y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f538184z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gk2.e buContext, int i17) {
        super(activity, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f538169h = activity;
        this.f538170i = buContext;
        r45.nt2 nt2Var = ((mm2.f6) buContext.a(mm2.f6.class)).E;
        if (nt2Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f538171m;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productReplaySwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(nt2Var.m75939xb282bd08(0) == 1);
            android.view.View view = this.f538174p;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionParent");
                throw null;
            }
            int i18 = nt2Var.m75939xb282bd08(0) == 1 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int m75939xb282bd08 = nt2Var.m75939xb282bd08(1);
            if (m75939xb282bd08 == 0) {
                android.view.View view2 = this.f538176r;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoChooseIcon");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (m75939xb282bd08 == 1) {
                android.view.View view3 = this.f538177s;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("manualChooseIcon");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f538171m;
            if (viewOnClickListenerC22631x1cc07cc82 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productReplaySwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new xt2.r4(nt2Var, this));
            android.view.View view4 = this.f538178t;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoOptionView");
                throw null;
            }
            view4.setOnClickListener(new xt2.t4(this));
            android.view.View view5 = this.f538179u;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("manualOptionView");
                throw null;
            }
            view5.setOnClickListener(new xt2.v4(this));
        }
        r45.k31 k31Var = ((mm2.f6) buContext.a(mm2.f6.class)).W;
        r45.j31 j31Var = ((mm2.f6) buContext.a(mm2.f6.class)).Y;
        if (k31Var != null && k31Var.m75939xb282bd08(0) == 1) {
            android.view.View view6 = this.f538181w;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("flashSaleSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FLASH_SALE_ENABLED_BOOLEAN_SYNC, true), j31Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = this.f538182x;
            if (viewOnClickListenerC22631x1cc07cc83 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("flashSaleSwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc83.m81396xb3e0a10a(new xt2.e4(this, j31Var));
        } else {
            android.view.View view7 = this.f538181w;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("flashSaleSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (j31Var != null && j31Var.m75939xb282bd08(0) == 1) {
                android.view.View view8 = this.f538180v;
                if (view8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("flashSaleRecordBtn");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view9 = this.f538180v;
                if (view9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("flashSaleRecordBtn");
                    throw null;
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view10 = this.f538180v;
        if (view10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("flashSaleRecordBtn");
            throw null;
        }
        view10.setOnClickListener(new xt2.f4(this, j31Var));
        r45.yv2 yv2Var = ((mm2.f6) buContext.a(mm2.f6.class)).f410584x0;
        if (yv2Var != null) {
            android.view.View view11 = this.E;
            if (view11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productOrderContainer");
                throw null;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view11, arrayList8.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view12 = this.F;
            if (view12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("insertOrderContainer");
                throw null;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view12, arrayList9.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            for (int i19 = 1; i19 < 5; i19++) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (dk2.ef.f314905a.x()) {
                    jSONObject.put("type", 21);
                    jSONObject.put("func_type", i19);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "report 21054, " + jSONObject);
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
                } else {
                    jSONObject.put("type", 10);
                    jSONObject.put("func_type", i19);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "report 21017, " + jSONObject);
                    i95.m c18 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c18;
                    ml2.c1 c1Var = ml2.c1.f408858e;
                    zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f95 = this.A;
            if (c14973x93b87f95 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ascendingOptionBtn");
                throw null;
            }
            c14973x93b87f95.a(yv2Var.m75939xb282bd08(0) == 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f952 = this.B;
            if (c14973x93b87f952 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descendingOptionBtn");
                throw null;
            }
            c14973x93b87f952.a(yv2Var.m75939xb282bd08(0) == 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f953 = this.D;
            if (c14973x93b87f953 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addToBottomOptionBtn");
                throw null;
            }
            c14973x93b87f953.a(yv2Var.m75939xb282bd08(1) == 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f954 = this.C;
            if (c14973x93b87f954 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addToTopOptionBtn");
                throw null;
            }
            c14973x93b87f954.a(yv2Var.m75939xb282bd08(1) == 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f955 = this.A;
            if (c14973x93b87f955 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ascendingOptionBtn");
                throw null;
            }
            c14973x93b87f955.setOnClickListener(new xt2.h4(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f956 = this.B;
            if (c14973x93b87f956 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descendingOptionBtn");
                throw null;
            }
            c14973x93b87f956.setOnClickListener(new xt2.j4(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f957 = this.D;
            if (c14973x93b87f957 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addToBottomOptionBtn");
                throw null;
            }
            c14973x93b87f957.setOnClickListener(new xt2.l4(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95 c14973x93b87f958 = this.C;
            if (c14973x93b87f958 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addToTopOptionBtn");
                throw null;
            }
            c14973x93b87f958.setOnClickListener(new xt2.n4(this));
        }
        if (((mm2.f6) this.f538170i.a(mm2.f6.class)).A1 == 1) {
            android.view.View view13 = this.f538183y;
            if (view13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("prehotSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view13, arrayList10.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PREHOT_ENABLED_BOOLEAN_SYNC, true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc84 = this.f538184z;
            if (viewOnClickListenerC22631x1cc07cc84 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("prehotSwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc84.m81392x52cfa5c6(o17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc85 = this.f538184z;
            if (viewOnClickListenerC22631x1cc07cc85 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("prehotSwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc85.m81396xb3e0a10a(xt2.o4.f538456a);
        } else {
            android.view.View view14 = this.f538183y;
            if (view14 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("prehotSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view14, arrayList11.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r45.uv2 uv2Var = ((mm2.f6) this.f538170i.a(mm2.f6.class)).F;
        if (uv2Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc86 = this.f538172n;
            if (viewOnClickListenerC22631x1cc07cc86 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc86.m81392x52cfa5c6(uv2Var.m75939xb282bd08(0) == 1);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc87 = this.f538172n;
            if (viewOnClickListenerC22631x1cc07cc87 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc87.m81396xb3e0a10a(new xt2.c4(this));
        }
        r45.dv1 dv1Var = ((mm2.f6) this.f538170i.a(mm2.f6.class)).f410571n;
        if (dv1Var != null) {
            android.view.View view15 = this.f538175q;
            if (view15 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presentParent");
                throw null;
            }
            bw5.q30 q30Var = (bw5.q30) dv1Var.m75936x14adae67(41);
            int i27 = (q30Var != null ? q30Var.f113453g[3] ? q30Var.f113452f : new bw5.x7() : null) != null ? 0 : 8;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view15, arrayList12.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initAnchorPresenterSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initAnchorPresenterSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view16 = this.f538175q;
            if (view16 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presentParent");
                throw null;
            }
            view16.setOnClickListener(new xt2.a4(dv1Var, this));
        }
    }

    public static final void A(xt2.b5 b5Var, int i17, int i18, yz5.q qVar) {
        b5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xt2.a5(h0Var, b5Var, null), 2, null);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = b5Var.f538170i;
        dk2.xf k17 = efVar.k(eVar);
        if (k17 != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b5Var.f538169h;
            long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
            java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
            r45.hx0 hx0Var = new r45.hx0();
            r45.k12 k12Var = new r45.k12();
            k12Var.set(0, java.lang.Integer.valueOf(i17));
            k12Var.set(1, java.lang.Integer.valueOf(i18));
            hx0Var.set(1, hc2.b.a(k12Var));
            hx0Var.set(0, 104);
            ((dk2.r4) k17).a0(abstractActivityC21394xb3d2c0cf, m75942xfb822ef2, j17, str, hx0Var, new xt2.z4(d17, h0Var, qVar, i17, i18));
        }
    }

    public static final void B(xt2.b5 b5Var, int i17) {
        b5Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (dk2.ef.f314905a.x()) {
            jSONObject.put("type", 22);
            jSONObject.put("func_type", i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "report 21054, " + jSONObject);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
            return;
        }
        jSONObject.put("type", 11);
        jSONObject.put("func_type", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "report 21017, " + jSONObject);
        i95.m c18 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c18;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
    }

    public static final void y(xt2.b5 b5Var, int i17, yz5.a aVar) {
        r45.yv2 yv2Var = ((mm2.f6) b5Var.f538170i.a(mm2.f6.class)).f410584x0;
        if (yv2Var == null || yv2Var.m75939xb282bd08(1) == i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "mod insert to " + i17);
        r45.hx0 hx0Var = new r45.hx0();
        r45.g12 g12Var = new r45.g12();
        g12Var.set(0, java.lang.Integer.valueOf(yv2Var.m75939xb282bd08(0)));
        g12Var.set(1, java.lang.Integer.valueOf(i17));
        hx0Var.set(1, hc2.b.a(g12Var));
        hx0Var.set(0, 108);
        b5Var.D(hx0Var, aVar);
    }

    public static final void z(xt2.b5 b5Var, int i17, yz5.a aVar) {
        r45.yv2 yv2Var = ((mm2.f6) b5Var.f538170i.a(mm2.f6.class)).f410584x0;
        if (yv2Var == null || yv2Var.m75939xb282bd08(0) == i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "mod order to " + i17);
        r45.hx0 hx0Var = new r45.hx0();
        r45.g12 g12Var = new r45.g12();
        g12Var.set(0, java.lang.Integer.valueOf(i17));
        g12Var.set(1, java.lang.Integer.valueOf(yv2Var.m75939xb282bd08(1)));
        hx0Var.set(1, hc2.b.a(g12Var));
        hx0Var.set(0, 108);
        b5Var.D(hx0Var, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r23.m75939xb282bd08(0) == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(boolean r22, r45.j31 r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            com.tencent.mm.ui.widget.MMSwitchBtn r3 = r0.f538182x
            r4 = 0
            if (r3 == 0) goto Lb8
            r3.m81392x52cfa5c6(r1)
            java.lang.String r3 = "flashSaleRecordBtn"
            r5 = 0
            if (r1 == 0) goto L6b
            if (r2 == 0) goto L1d
            int r1 = r2.m75939xb282bd08(r5)
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r5
        L1e:
            if (r2 == 0) goto L6b
            android.view.View r1 = r0.f538180v
            if (r1 == 0) goto L67
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r7 = r2.toArray()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r9 = "enableFlashSale"
            java.lang.String r10 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r8 = "enableFlashSale"
            java.lang.String r9 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r1
            yj0.a.f(r6, r7, r8, r9, r10, r11, r12)
            goto Lb3
        L67:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r4
        L6b:
            android.view.View r1 = r0.f538180v
            if (r1 == 0) goto Lb4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r14 = r2.toArray()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r16 = "enableFlashSale"
            java.lang.String r17 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            yj0.a.d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r15 = "enableFlashSale"
            java.lang.String r16 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r13 = r1
            yj0.a.f(r13, r14, r15, r16, r17, r18, r19)
        Lb3:
            return
        Lb4:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r4
        Lb8:
            java.lang.String r1 = "flashSaleSwitchBtn"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.b5.C(boolean, r45.j31):void");
    }

    public final void D(r45.hx0 hx0Var, yz5.a aVar) {
        java.lang.String str;
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            az2.c cVar = az2.f.f97658d;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f538169h;
            az2.f a17 = az2.c.a(cVar, abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 500L, null, 8, null);
            a17.a();
            dk2.xf k17 = efVar.k(this.f538170i);
            if (k17 != null) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f538169h;
                long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
                long j17 = e1Var.f410516m;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var == null || (str = c1Var.f410385o) == null) {
                    str = "";
                }
                ((dk2.r4) k17).a0(abstractActivityC21394xb3d2c0cf2, m75942xfb822ef2, j17, str, hx0Var, new xt2.y4(a17, this, aVar, hx0Var));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axe;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        rootView.findViewById(com.p314xaae8f345.mm.R.id.f567790yf);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.fhn)).getPaint(), 0.8f);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.fho);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f538171m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rlj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f538172n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.flg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f538173o = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f538174p = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.tnn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f538175q = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fh9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f538176r = findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fha);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f538177s = findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f538178t = findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fhl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f538179u = findViewById9;
        android.view.View findViewById10 = rootView.findViewById(com.p314xaae8f345.mm.R.id.g86);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f538180v = findViewById10;
        android.view.View findViewById11 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qfp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f538181w = findViewById11;
        android.view.View findViewById12 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qfq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f538182x = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById12;
        android.view.View findViewById13 = rootView.findViewById(com.p314xaae8f345.mm.R.id.r47);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f538183y = findViewById13;
        android.view.View findViewById14 = rootView.findViewById(com.p314xaae8f345.mm.R.id.r48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f538184z = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById14;
        android.view.View findViewById15 = rootView.findViewById(com.p314xaae8f345.mm.R.id.a5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.A = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95) findViewById15;
        android.view.View findViewById16 = rootView.findViewById(com.p314xaae8f345.mm.R.id.cuy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.B = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95) findViewById16;
        android.view.View findViewById17 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f564252m2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        this.C = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95) findViewById17;
        android.view.View findViewById18 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f564249lz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        this.D = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14973x93b87f95) findViewById18;
        android.view.View findViewById19 = rootView.findViewById(com.p314xaae8f345.mm.R.id.l7c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        this.E = findViewById19;
        android.view.View findViewById20 = rootView.findViewById(com.p314xaae8f345.mm.R.id.hdw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById20, "findViewById(...)");
        this.F = findViewById20;
        android.view.View view = this.f538173o;
        if (view != null) {
            view.setOnClickListener(new xt2.d4(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        yz5.a aVar = this.G;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}

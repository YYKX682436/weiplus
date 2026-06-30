package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55;

/* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC */
/* loaded from: classes15.dex */
public final class C14558x6dc32d60 extends mq2.c {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 H;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f203624J;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f203625g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f203626h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f203627i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f203628m;

    /* renamed from: n, reason: collision with root package name */
    public mq2.h f203629n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f203630o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f203631p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f203632q;

    /* renamed from: r, reason: collision with root package name */
    public int f203633r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f203634s;

    /* renamed from: t, reason: collision with root package name */
    public i11.e f203635t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f203636u;

    /* renamed from: v, reason: collision with root package name */
    public mq2.b f203637v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f203638w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f203639x;

    /* renamed from: y, reason: collision with root package name */
    public final i11.c f203640y;

    /* renamed from: z, reason: collision with root package name */
    public long f203641z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14558x6dc32d60(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        new java.util.LinkedList();
        this.f203631p = new java.util.LinkedList();
        this.f203633r = 1;
        this.f203640y = new mq2.q(this);
        this.D = true;
        this.E = true;
        this.G = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.I = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$sayHiListener$1
            {
                this.f39173x3fe91575 = -772738789;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b event = c5672xb6c0812b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mq2.v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60.this));
                return false;
            }
        };
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60) {
        c14558x6dc32d60.getClass();
        if (!((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            c14558x6dc32d60.W6();
            c14558x6dc32d60.U6();
            return;
        }
        if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308702t, new mq2.m(c14558x6dc32d60))) {
            c14558x6dc32d60.R6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "handleOnStartLoadData return for permission:" + c14558x6dc32d60.f203624J);
    }

    public final boolean P6() {
        boolean N6 = ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).N6();
        this.f203624J = N6;
        return N6;
    }

    public final void Q6() {
        if (!this.F) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for isOnResume:" + this.F);
            return;
        }
        if (!this.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for isOnUserVisibleFocused:" + this.C);
            return;
        }
        if (this.f203624J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for lastOnPauseHasPermission:" + this.f203624J);
            return;
        }
        if (!((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain return for permission:" + this.f203624J);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "shouldTryRequestFirstPageAgain requestInit");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPersonUIC", "dismissPermissionView");
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.hzf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "dismissPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "dismissPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6();
    }

    public final void R6() {
        int P;
        java.util.Map map;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "fetchDataInternal hasLoadData:" + this.A);
        if (this.A) {
            return;
        }
        X6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_nearby_ad, "", true), "lbsads", null);
            if (d17 != null && (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".lbsads.$count"), 0)) > 0) {
                int i17 = 0;
                while (true) {
                    map = this.f412257f;
                    if (i17 >= P) {
                        break;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".lbsads.lbsad");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    mq2.a aVar = new mq2.a();
                    aVar.f412237a = (java.lang.String) d17.get(sb7 + ".$id");
                    aVar.f412238b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".$pos"), 0);
                    aVar.f412239c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".$close_times"), 0);
                    aVar.f412240d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".$show_times"), Integer.MAX_VALUE);
                    aVar.f412241e = (java.lang.String) d17.get(sb7 + ".name");
                    aVar.f412242f = (java.lang.String) d17.get(sb7 + ".desc");
                    aVar.f412243g = (java.lang.String) d17.get(sb7 + ".icon");
                    aVar.f412244h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb7 + ".jump.$type"), 0);
                    aVar.f412245i = (java.lang.String) d17.get(sb7 + ".jump");
                    java.lang.String str = aVar.f412237a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    ((java.util.HashMap) map).put(str, aVar);
                    i17++;
                }
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, null);
                if (str2 != null) {
                    for (java.lang.String str3 : (java.lang.String[]) r26.n0.f0(str2, new java.lang.String[]{"\\|"}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                        java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str3, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]);
                        if (strArr.length == 3) {
                            mq2.a aVar2 = (mq2.a) ((java.util.HashMap) map).get(strArr[0]);
                            if (aVar2 != null) {
                                aVar2.f412246j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[1], 0);
                                aVar2.f412247k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 0);
                            }
                        }
                    }
                }
            }
        }
        this.A = true;
    }

    public final boolean S6(r45.b64 b64Var) {
        r45.cb6 cb6Var = b64Var.f452099w;
        return cb6Var != null && (cb6Var.f452961d & 1) > 0;
    }

    public final void T6() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = this.f203631p.size();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                break;
            }
            if (!(((r45.b64) this.f203631p.get(i19)).f452089m == 10000)) {
                linkedList.add(this.f203631p.get(i19));
            }
            i19++;
        }
        this.f203631p.clear();
        this.f203631p = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "mergeADItemList friendList size:" + this.f203631p.size());
        boolean isEmpty = this.f203631p.isEmpty() ^ true;
        java.util.Map map = this.f412257f;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            if (isEmpty) {
                mq2.a aVar = (mq2.a) ((java.util.HashMap) map).get(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                if (!aVar.f412249m && ((i17 = aVar.f412239c) < 1 || aVar.f412246j < i17)) {
                    if (aVar.f412247k < aVar.f412240d) {
                        java.util.List list = this.f203631p;
                        int i27 = aVar.f412238b;
                        int size2 = (i27 < 0 || i27 > list.size()) ? this.f203631p.size() : aVar.f412238b + i18;
                        java.lang.String str2 = aVar.f412237a;
                        java.lang.String str3 = aVar.f412243g;
                        java.lang.String str4 = aVar.f412241e;
                        java.lang.String str5 = aVar.f412242f;
                        java.lang.String str6 = aVar.f412245i;
                        ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
                        an3.c cVar = new an3.c();
                        cVar.f452089m = 10000;
                        cVar.f452083d = str2;
                        cVar.f452102z = str3;
                        cVar.f452088i = str5;
                        cVar.f452084e = str4;
                        cVar.f452085f = str6;
                        list.add(size2, cVar);
                        i18++;
                    }
                }
            }
        }
    }

    public final void U6() {
        boolean Di;
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            ((sb0.f) jVar).getClass();
            Di = j35.u.d(m158354x19263085, "android.permission.ACCESS_FINE_LOCATION", true);
            if (!Di) {
                if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, false)) {
                    tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
                    ((sb0.f) jVar2).getClass();
                    j35.u.i(m158354x192630852, "android.permission.ACCESS_FINE_LOCATION", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5);
                } else {
                    js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
                    java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
                    ((is.h) s0Var).getClass();
                    c71.b.c(m158354x192630853, string, 30764, true);
                }
            }
        } else {
            Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(m158354x19263085(), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5, null, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "requestLocationPermission checkLocation:" + Di);
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "showLbsTips");
        qa0.e eVar = (qa0.e) i95.n0.c(qa0.e.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        ((pa0.e) eVar).getClass();
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.e(m158354x19263085);
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyPersonUIC", "showNoPermissionView");
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.hzf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "showPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "showPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.hzg).setOnClickListener(new mq2.e0(this));
    }

    public final void X6() {
        gm0.j1.d().a(148, this);
        gm0.j1.d().a(1087, this);
        this.f203628m = db5.e1.Q(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.h69), true, true, new mq2.d0(this));
        this.f203636u = false;
        this.f203639x = false;
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f203635t = e17;
        if (e17 != null) {
            e17.l(this.f203640y, true, false, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
    }

    public final void Y6() {
        ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
        if (!m25.a.c()) {
            ((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).getClass();
            if (!m25.a.b()) {
                return;
            }
        }
        android.view.View view = null;
        if (this.f203627i != null) {
            android.widget.ListView listView = this.f203626h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(listView);
            listView.removeHeaderView(this.f203627i);
            this.f203627i = null;
        }
        android.view.View inflate = android.view.View.inflate(m158354x19263085(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c6_, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.m9z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        gm0.j1.b().c();
        int f17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f();
        if (f17 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "getSayHiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(m158354x19263085().getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571224a1, f17, java.lang.Integer.valueOf(f17)));
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567396jd0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
            com.p314xaae8f345.mm.p2621x8fb0427b.t8 P0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).P0();
            if (P0 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, P0.f66514x49f69af2, null);
            }
            inflate.setOnClickListener(new mq2.j(this));
            rq2.u.f480422a.b(11L);
            view = inflate;
        }
        this.f203627i = view;
        if (view != null) {
            android.widget.ListView listView2 = this.f203626h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(listView2);
            listView2.addHeaderView(this.f203627i);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(11);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LBSShowBindPhone");
        if (d17 != null) {
            if (d17.length() > 0) {
                try {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(d17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                    valueOf.intValue();
                } catch (java.lang.Exception unused) {
                }
            }
        }
        this.f203633r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(16386, null), 1);
        this.f203629n = new mq2.h(this, m158354x19263085());
        android.widget.ListView listView = (android.widget.ListView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.k5q);
        this.f203626h = listView;
        if (listView != null) {
            if (this.f203625g == null) {
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(m158354x19263085());
                this.f203625g = linearLayout;
                linearLayout.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
                android.view.ViewGroup viewGroup = this.f203625g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewGroup, "null cannot be cast to non-null type android.widget.LinearLayout");
                ((android.widget.LinearLayout) viewGroup).setGravity(17);
            }
            this.f203630o = true;
            listView.addHeaderView(this.f203625g);
        }
        android.widget.ListView listView2 = this.f203626h;
        if (listView2 != null) {
            listView2.setAdapter((android.widget.ListAdapter) this.f203629n);
        }
        android.widget.ListView listView3 = this.f203626h;
        if (listView3 != null) {
            listView3.setOnItemClickListener(new mq2.n(this));
        }
        android.widget.ListView listView4 = this.f203626h;
        if (listView4 != null) {
            listView4.setOnTouchListener(new mq2.o(this));
        }
        this.f203641z = java.lang.System.currentTimeMillis();
        P6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "onCreate");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        bb5.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
        gm0.j1.d().q(148, this);
        gm0.j1.d().q(1087, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "dismissTipDialog");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f203628m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f203628m = null;
        i11.e eVar = this.f203635t;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f203640y);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.wi().a();
        mq2.h hVar = this.f203629n;
        if (hVar != null && (gVar = hVar.f412270e) != null) {
            gVar.a();
            hVar.f412270e = null;
        }
        if (((java.util.LinkedList) this.f203631p).size() > 0) {
            java.lang.String str = "";
            for (mq2.a aVar : ((java.util.HashMap) this.f412257f).values()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append('|');
                sb6.append(aVar.f412237a);
                sb6.append(':');
                sb6.append(aVar.f412246j);
                sb6.append(':');
                int i17 = aVar.f412247k + 1;
                aVar.f412247k = i17;
                sb6.append(i17);
                str = sb6.toString();
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, str);
        }
        rq2.u.c(rq2.u.f480422a, null, null, null, null, 0L, 100L, 0L, 0L, 0L, 0L, 0L, 0L, java.lang.System.currentTimeMillis() - this.f203641z, 4063, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "onPause");
        i11.e eVar = this.f203635t;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f203640y);
        }
        this.I.mo48814x2efc64();
        this.f203639x = true;
        this.F = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "onRequestPermissionsResult requestCode:" + i17 + " grantResults[0]:" + grantResults[0]);
        if (i17 == 79 || i17 == 153) {
            if (grantResults[0] == 0) {
                Q6();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec.TAG, "onRequestPermissionsResult return for grant.");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "onResume");
        this.F = true;
        if (!this.G) {
            Q6();
        }
        Y6();
        mq2.h hVar = this.f203629n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
        hVar.notifyDataSetChanged();
        gm0.j1.b().c();
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f() == 0) {
            android.widget.ListView listView = this.f203626h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(listView);
            listView.removeHeaderView(null);
        }
        this.I.mo48813x58998cd();
        this.f203639x = false;
        this.G = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e2, code lost:
    
        if (r6 != 4) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0325  */
    @Override // mq2.c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r24, int r25, java.lang.String r26, com.p314xaae8f345.mm.p944x882e457a.m1 r27) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        P6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        c01.fb b17 = c01.fb.b();
        if (!this.E || b17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.d()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(java.lang.Integer.valueOf(b17.f118721b), 0) == 0) {
            this.E = true;
            j45.l.h(m80379x76847179(), "nearby", ".ui.NearbyPersonalInfoUI");
            pm0.v.V(200L, new mq2.s(this));
            return;
        }
        this.C = true;
        mq2.u uVar = new mq2.u(this);
        mq2.t tVar = new mq2.t(this);
        if (this.B || !gm0.j1.u().c().n(4104, true)) {
            uVar.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
            android.view.View inflate = android.view.View.inflate(m158354x19263085(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bpr, null);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            mq2.x xVar = new mq2.x(uVar);
            mq2.y yVar = new mq2.y(tVar);
            if (!(m158354x19263085 instanceof android.app.Activity) || !m158354x19263085.isFinishing()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(m158354x19263085);
                i0Var.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                i0Var.d(-1);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
                aVar.L = inflate;
                i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                aVar.E = xVar;
                i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f571545ig);
                aVar.F = yVar;
                aVar.G = new db5.t0(yVar);
                j0Var = i0Var.a();
                j0Var.show();
                db5.e1.a(m158354x19263085, j0Var);
            }
            j0Var.show();
            rq2.u.f480422a.b(15L);
            this.B = true;
        }
        if (!this.D) {
            Q6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        gaVar.o(3, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        this.D = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "onUserVisibleFocused");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        this.C = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "onUserVisibleUnFocused");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14558x6dc32d60(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        new java.util.LinkedList();
        this.f203631p = new java.util.LinkedList();
        this.f203633r = 1;
        this.f203640y = new mq2.q(this);
        this.D = true;
        this.E = true;
        this.G = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.I = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b>(a0Var) { // from class: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC$sayHiListener$1
            {
                this.f39173x3fe91575 = -772738789;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b event = c5672xb6c0812b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mq2.v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60.this));
                return false;
            }
        };
    }
}

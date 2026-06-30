package dm4;

/* loaded from: classes11.dex */
public final class b implements com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24998xba98362a f323288g;

    /* renamed from: d, reason: collision with root package name */
    public final int f323289d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f323290e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f323291f;

    public b(int i17) {
        this.f323289d = i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af
    /* renamed from: getFinderProfileDynamicReportParams */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24957x1ba3adfd mo92694x6759418c() {
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17 != null ? c17 : "");
        return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24957x1ba3adfd(kz5.c1.k(lVarArr));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f323291f = p07.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af.Companion.m92700x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f323290e = p07.m137982x6e669035();
        if (this.f323289d == 0) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = p07.m137983x3b5b91dc();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
            f323288g = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24998xba98362a(m137983x3b5b91dc2, null, 2, null);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f323291f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af.Companion.m92700x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f323290e = null;
        if (this.f323289d == 0) {
            f323288g = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af
    /* renamed from: openCategoryItem */
    public void mo92695xda39589b(byte[] categoryItem, byte[] bArr, long j17) {
        java.lang.String str;
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItem, "categoryItem");
        int i17 = (int) j17;
        boolean z17 = i17 == 600;
        android.app.Activity activity = this.f323291f;
        if (activity == null || (intent = activity.getIntent()) == null || (str = intent.getStringExtra("finder_username")) == null) {
            str = "";
        }
        il4.e eVar = new il4.e(null, 0, i17, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        il4.f fVar = eVar.f373655s;
        fVar.f373665d.put("finderusername", str);
        fVar.f373664c = z17;
        android.content.Context context = this.f323290e;
        if (context != null) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            qk.ja jaVar = qk.ja.f445725e;
            rk4.k8 k8Var = (rk4.k8) aj6;
            try {
                bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(categoryItem);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
                bw5.ar0 i18 = bw5.ar0.i(i17);
                if (i18 == null) {
                    i18 = bw5.ar0.TingScene_UnDefined;
                }
                qk.f9.d(k8Var, context, mo11468x92b714fd, null, jaVar, i18, eVar, null, bArr, null, null, false, 1792, null);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingRouter", "consumeCategoryItemBuffer parse error");
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af
    /* renamed from: openFinderDiscover */
    public void mo92696xaa09f719(byte[] discoverLineData, java.lang.String finderUsername, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(discoverLineData, "discoverLineData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        android.content.Context context = this.f323290e;
        if (context != null) {
            rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            p3325xe03a0797.p3326xc267989b.l.d(k8Var, null, null, new rk4.a8(k8Var, discoverLineData, finderUsername, bArr, context, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af
    /* renamed from: openTingPage */
    public void mo92697x1a4da307(java.lang.String pageUrl, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24967x7266a38d pageParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageUrl, "pageUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageParams, "pageParams");
        java.util.Map<java.lang.String, java.lang.Object> m92550x29c21c7c = pageParams.m92550x29c21c7c();
        java.lang.Object obj = m92550x29c21c7c != null ? m92550x29c21c7c.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) : null;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingRouterPlugin_Flutter", "openTingPage scene " + intValue + ", pageUrl " + pageUrl);
        boolean z17 = intValue == 600;
        il4.e eVar = new il4.e(null, 0, intValue, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        eVar.f373655s.f373664c = z17;
        android.content.Context context = this.f323290e;
        if (context != null) {
            rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            bw5.ar0 i17 = bw5.ar0.i(eVar.f373639c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRouter", "openTingPage enterScene: " + i17 + " pageUrl = " + pageUrl);
            if (i17 != null) {
                k8Var.M(i17);
            }
            il4.l.q(eVar, true, context, null, 8, null);
            p3325xe03a0797.p3326xc267989b.l.d(k8Var, null, null, new rk4.c8(k8Var, pageUrl, context, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24990x69dfd5af
    /* renamed from: openTingPageWithNewEngine */
    public void mo92698x56d1b615(java.lang.String routeName, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24967x7266a38d params) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routeName, "routeName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        android.content.Context context = this.f323290e;
        if (context != null) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            java.util.Map<java.lang.String, java.lang.Object> m92550x29c21c7c = params.m92550x29c21c7c();
            if (m92550x29c21c7c != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : m92550x29c21c7c.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    jz5.l lVar = (key == null || value == null) ? null : new jz5.l(key, value);
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                map = kz5.c1.q(arrayList);
            } else {
                map = null;
            }
            ((rk4.k8) aj6).F(context, routeName, map, null);
        }
    }
}

package yq1;

/* loaded from: classes8.dex */
public final class z implements zq1.a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.a3 f546029g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.a3();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.a3 f546030h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.a3();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f546031i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c3.a(), 60);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f546032d = jz5.h.b(new yq1.u(this));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f546033e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final long f546034f = 15000;

    public z() {
        jz5.h.b(yq1.t.f546004d);
    }

    public void A(java.lang.String str, r45.nw1 nw1Var) {
        if (nw1Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveInfo == null? ");
            sb6.append(nw1Var == null);
            sb6.append(", exportId empty? ");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
            return;
        }
        k().H(("Biz_" + gm0.j1.b().j() + "_LivesInfo") + '_' + str, nw1Var.mo14344x5f01b1f6());
    }

    public void B(android.content.Context context, yz5.l lVar) {
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        yq1.y yVar = new yq1.y(this, lVar);
        ((vd0.j2) q1Var).getClass();
        v24.o0.b(context, 256L, true, yVar);
    }

    public boolean E(android.content.Context context, java.lang.String url, int i17, boolean z17, int i18, int i19, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.r(context, url, i17, z17, i18, i19, intent, 0, null, false, ce1.h.f4368x366c91de, null);
    }

    public boolean F(android.content.Context context, java.lang.String url, int i17, boolean z17, int i18, int i19, android.content.Intent intent, int i27, zq1.z result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.r(context, url, i17, z17, i18, i19, intent, i27, result, false, 512, null);
    }

    public java.lang.String a(java.lang.String str, int i17, int i18, int i19) {
        return ot0.g0.a(str, i17, i18, i19);
    }

    public void b(java.lang.String str, int i17, int i18, int i19, java.lang.Object... vals) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vals, "vals");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        zq1.i0 i0Var = new zq1.i0();
        i0Var.f556516a = str;
        i0Var.f556518c = i19;
        arrayList.add(i0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", "addToGeneralPreload preloadType:" + i17);
        if (i17 == 1) {
            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).i(arrayList);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        yq1.o oVar = new yq1.o(currentTimeMillis, this);
        ((yq1.x0) m0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175725a;
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.w2(currentTimeMillis, oVar), "MicroMsg.WebPrefetcherCallbackManager");
        ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).g(currentTimeMillis, arrayList);
    }

    public void c(java.lang.String url, int i17, int i18, java.lang.String str, java.lang.Object... vals) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vals, "vals");
        java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.h(url);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a3 a3Var = f546029g;
        if (a3Var.n(h17)) {
            return;
        }
        a3Var.m(h17);
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", "preloadData: addToPreload:" + h17 + ", " + url + ", openScene=" + i18 + ", userName=" + str2);
        ((ku5.t0) ku5.t0.f394148d).h(new yq1.p(url, i17, i18, str2, vals, this), "tmplPreload");
    }

    public void d(java.lang.String url, int i17, int i18, java.lang.Object... vals) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vals, "vals");
        c(url, i17, i18, null, vals);
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.String event, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        yq1.q qVar = new yq1.q(str, str2, event, str3);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.biz.q.f175403d;
        if (currentTimeMillis >= this.f546034f) {
            qVar.mo152xb9724478();
            return;
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ((ku5.t0) ku5.t0.f394148d).k(new yq1.x(qVar), java.lang.Math.max(this.f546034f - currentTimeMillis, 5000L));
    }

    public void f(r45.ee eeVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.q0.f267348a.b(eeVar);
    }

    public r45.nw1 g(java.lang.String str) {
        byte[] j17 = k().j(("Biz_" + gm0.j1.b().j() + "_LivesInfo") + '_' + str);
        if (j17 == null || j17.length == 0) {
            return null;
        }
        try {
            r45.nw1 nw1Var = new r45.nw1();
            nw1Var.mo11468x92b714fd(j17);
            return nw1Var;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceImpl", "parse finderLive fail, parseFrom:%s", e17.getMessage());
            return null;
        }
    }

    public long h(java.lang.String chatName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatName, "chatName");
        java.lang.Long l17 = (java.lang.Long) this.f546033e.get(chatName);
        if (l17 == null) {
            return -1L;
        }
        return l17.longValue();
    }

    public java.lang.String i(java.lang.String str) {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.e(str);
    }

    public int j(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
        if (str == null) {
            return 0;
        }
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270732c.o("live_scene-".concat(str), 0);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 k() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f546032d).mo141623x754a37bb();
    }

    public int l() {
        java.lang.Integer num;
        if (((zq1.x) i95.n0.c(zq1.x.class)) == null || (num = (java.lang.Integer) gg5.b.f353322b.get("officialaccounts")) == null) {
            return -1;
        }
        return num.intValue();
    }

    public java.lang.String m(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.n(url);
    }

    public boolean n() {
        return r26.i0.p("CN", gm0.j1.u().c().u(274436, "CN"), true);
    }

    public boolean o(java.lang.String str) {
        if (str != null) {
            return hy4.i.l(str);
        }
        return false;
    }

    public boolean p(java.lang.String str) {
        if (str != null) {
            return hy4.i.p(str);
        }
        return false;
    }

    public boolean q() {
        if (gm0.j1.a()) {
            return n() || (c01.z1.i() & 256) != 0;
        }
        return false;
    }

    public void r(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, r45.nw1 nw1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.p(context, str, str2, null, i17, i18, null, str3, nw1Var, null, null, null, null, null);
    }

    public void s(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, r45.nw1 nw1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.r(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a, context, str, str2, null, i17, i18, null, nw1Var, null, null, null, null, null, 7936, null);
    }

    public void t(android.content.Context context, org.json.JSONObject jSONObject, java.util.HashMap ret) {
        java.lang.String message;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("item_show_type");
        android.os.Bundle bundle = new android.os.Bundle();
        if (optInt == 5) {
            cy4.b bVar = cy4.b.f306392a;
            if (bVar.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload");
                java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload vid null");
                } else {
                    int L = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("videoInitialTime"), 0.0f);
                    java.lang.String optString2 = jSONObject.optString("videoInitialSnapshot");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload bitmap null");
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) cy4.b.f306394c.i();
                        o4Var.A("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_playTime", L);
                        o4Var.B("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_expire", (java.lang.System.currentTimeMillis() / 1000) + 600);
                        o4Var.D("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_bitmap", optString2);
                        bVar.d(optString);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1061L, 21L, 1L, false);
        }
        bundle.putString("url", jSONObject.optString("url"));
        bundle.putInt("item_show_type", jSONObject.optInt("item_show_type"));
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
        bundle.putInt("subscene", jSONObject.optInt("subscene"));
        bundle.putInt("openType", jSONObject.optInt("openType"));
        bundle.putString("biz_video_channel_session_id", jSONObject.optString("channelSessionId"));
        zq1.z zVar = new zq1.z();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("immersiveUIStyle", jSONObject.optBoolean("immersiveUIStyle", false) ? 1 : 0);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        intent.putExtra("kBizSessionId", com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a);
        int i17 = bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        int i18 = bundle.getInt("subscene", 10000);
        java.lang.String string = bundle.getString("url");
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(string)) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            string = ot0.g0.a(string, i17, i18, currentTimeMillis);
        }
        ret.put(ya.b.f77504xbb80cbe3, java.lang.Boolean.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).F(context, string, bundle.getInt("item_show_type"), bundle.getBoolean("isNativePage"), i17, i18, intent, bundle.getInt("openType"), zVar)));
        if (zVar.f556557a || (message = zVar.f556558b) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(message, "message");
        ret.put("desc", message);
    }

    public void u(int i17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175969b;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        if (i17 != 10000) {
            android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.p1(i17));
            return;
        }
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.p(i17);
        atomicBoolean.set(false);
    }

    public void v(java.util.List items, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = items.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.h((java.lang.String) ((java.util.List) next).get(0));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a3 a3Var = f546029g;
            if (a3Var.n(h17)) {
                z17 = false;
            } else {
                a3Var.m(h17);
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData: preloadByIdAndUrls:");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.h((java.lang.String) ((java.util.List) it6.next()).get(0)));
                }
                sb6.append(arrayList2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
            }
            ((ku5.t0) ku5.t0.f394148d).h(new yq1.v(arrayList, i17), "tmplPreload");
        }
    }

    public void w(int i17, java.util.List list) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceImpl", "preloadWebView can not preload scene: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceImpl", "preloadWebView openScene: " + i17 + ", itemShowTypeList: " + list);
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.g(i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a.b());
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.k(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.j(((java.lang.Number) it.next()).intValue()));
            }
        }
    }

    public void x(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6786x1b9ae45f c6786x1b9ae45f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6786x1b9ae45f();
        c6786x1b9ae45f.f141186d = i17;
        c6786x1b9ae45f.f141187e = c6786x1b9ae45f.b("NetType", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "wifi" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "5g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "4g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "3g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "2g" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc, true);
        c6786x1b9ae45f.f141188f = i18;
        c6786x1b9ae45f.f141189g = i19;
        c6786x1b9ae45f.k();
    }

    public void y(int i17, int i18, int i19, float f17, int i27, int i28) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6786x1b9ae45f c6786x1b9ae45f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6786x1b9ae45f();
        c6786x1b9ae45f.f141186d = i17;
        c6786x1b9ae45f.f141187e = c6786x1b9ae45f.b("NetType", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "wifi" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "5g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "4g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "3g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "2g" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc, true);
        c6786x1b9ae45f.f141193k = i18;
        c6786x1b9ae45f.f141194l = i19;
        c6786x1b9ae45f.f141195m = f17 * 100;
        c6786x1b9ae45f.f141196n = i27;
        c6786x1b9ae45f.f141197o = i28;
        c6786x1b9ae45f.k();
    }

    public void z(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6786x1b9ae45f c6786x1b9ae45f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6786x1b9ae45f();
        c6786x1b9ae45f.f141186d = i17;
        c6786x1b9ae45f.f141187e = c6786x1b9ae45f.b("NetType", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "wifi" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "5g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "4g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "3g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "2g" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc, true);
        c6786x1b9ae45f.f141190h = i18;
        c6786x1b9ae45f.f141192j = i27;
        c6786x1b9ae45f.f141191i = i19;
        c6786x1b9ae45f.k();
    }
}

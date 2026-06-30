package lx;

/* loaded from: classes11.dex */
public final class y1 implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403547d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23168x382cce3a f403548e;

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: addToGeneralPreload */
    public void mo85101x17886a1d(java.lang.String url, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).b(url, 0, 0, (int) j17, new java.lang.Object[0]);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: addToPreload */
    public void mo85102x81a9936d(java.lang.String url, long j17, long j18, java.lang.String str, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, str, new java.lang.Object[0]);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403547d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10.Companion.m85113x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f403548e = new com.p314xaae8f345.p2845xc516c4b6.biz.C23168x382cce3a(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403547d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403547d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10.Companion.m85113x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f403548e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403547d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: openBusinessProfilePage */
    public void mo85103xe412cd4e(java.lang.String userName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (userName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openBusinessProfilePage: userName empty");
            return;
        }
        i95.m c17 = i95.n0.c(r01.l1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r01.l1 l1Var = (r01.l1) c17;
        android.content.Context context = this.f403547d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        r01.l1.Zi(l1Var, context, userName, (int) j17, false, 8, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: openCommonUrl */
    public void mo85104x9d33c45a(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        android.content.Context context = this.f403547d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: openEditorFromMeTab */
    public void mo85105x8282a2bc(com.p314xaae8f345.p2845xc516c4b6.biz.C23285x122b27d2 jumpInfo) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openEditorFromMeTab: " + jumpInfo);
        if (this.f403547d == null) {
            return;
        }
        java.lang.Long m85875x37fbfab7 = jumpInfo.m85875x37fbfab7();
        if (m85875x37fbfab7 != null) {
            i17 = (int) m85875x37fbfab7.longValue();
        } else {
            tk.s[] sVarArr = tk.s.f501403d;
            i17 = 1;
        }
        if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            tk.s[] sVarArr2 = tk.s.f501403d;
            if (i17 == 2) {
                android.app.Activity activity = this.f403547d;
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.paj);
                e4Var.f293312f = false;
                e4Var.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMeTabPlugin", "openEditorFromMeTab: can not create biz photo, return   ");
                return;
            }
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f403548e);
        java.lang.Long m85878xb9a4415a = jumpInfo.m85878xb9a4415a();
        boolean z17 = (m85878xb9a4415a != null ? (int) m85878xb9a4415a.longValue() : 0) == 1;
        java.lang.Long m85876xec4435c5 = jumpInfo.m85876xec4435c5();
        tk.u uVar = (m85876xec4435c5 != null ? (int) m85876xec4435c5.longValue() : 0) == 1 ? tk.u.f501406g : tk.u.f501405f;
        tk.s[] sVarArr3 = tk.s.f501403d;
        int i19 = i17 == 1 ? 1396 : 1415;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("draftScene", "personalCenter");
        jSONObject.put("draftType", jumpInfo.m85876xec4435c5());
        jSONObject.put("publishScene", "mineTab");
        jSONObject.put("mpPublishAction", uVar.f501410d);
        jSONObject.put("bizType", i17);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i19);
        jSONObject.put("weAppParam", jSONObject2);
        tk.q qVar = (tk.q) i95.n0.c(tk.q.class);
        android.app.Activity activity2 = this.f403547d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity2);
        ((ox.o) qVar).Ai(activity2, jSONObject, new lx.v1(z17, weakReference));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: openFansMsg */
    public void mo85106xb3c9e9f7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("serviceType", 5);
        android.content.Context context = this.f403547d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        j45.l.j(context, "brandservice", ".conversation.ui.BizFansConversationListUI", intent, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: openLiteApp */
    public void mo85107xff2414e9(long j17) {
        jz5.f0 f0Var;
        if (this.f403547d != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("show_packet_name", "com.tencent.wetype");
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, (int) j17);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("packet_name", "com.tencent.wetype");
            jSONObject2.put("check_type", jSONObject3);
            jSONObject2.put("swiperId", "voice");
            jSONArray.put(jSONObject2);
            jSONObject.put("items", jSONArray);
            java.lang.String jSONObject4 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalitebf3a88de4da873052ba340892dc97559");
            bundle.putString("query", jSONObject4);
            bundle.putString("minVersion", "1.1.10");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this.f403547d, bundle, true, false, new lx.w1());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMeTabPlugin", "openLiteApp: activity is null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: openRedDot */
    public void mo85108x1237f1e2() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e;
        android.content.Context context = this.f403547d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.p2845xc516c4b6.biz.C23168x382cce3a c23168x382cce3a = this.f403548e;
        if (c23168x382cce3a != null) {
            c23168x382cce3a.m85122x7ed6b1f3(lx.x1.f403536d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("MyTabPhotoProfile");
        r2 = null;
        java.lang.String str = null;
        r45.vs2 vs2Var = L0 != null ? L0.f65874xb5f7102a : null;
        if (vs2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openRedDot: ctrlInfo is null");
            return;
        }
        r45.xs2 xs2Var = new r45.xs2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = vs2Var.f470021f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f m75932x347fbd55 = xs2Var.m75932x347fbd55(gVar != null ? gVar.g() : null);
        r45.xs2 xs2Var2 = m75932x347fbd55 instanceof r45.xs2 ? (r45.xs2) m75932x347fbd55 : null;
        if (xs2Var2 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
            boolean z17 = true;
            if ((c19786x6a1e2862 != null && c19786x6a1e2862.m76503x92bc3c07() == 1) == true) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                if (c19786x6a1e28622 != null && (m76505xea668b3e = c19786x6a1e28622.m76505xea668b3e()) != null) {
                    android.content.Context context2 = this.f403547d;
                    if (context2 == null) {
                        context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    }
                    java.lang.String m77174x10fbdaef = m76505xea668b3e.m77174x10fbdaef();
                    if (m77174x10fbdaef == null) {
                        m77174x10fbdaef = "";
                    }
                    java.lang.String m77175xf2b998c1 = m76505xea668b3e.m77175xf2b998c1();
                    java.lang.String m77188xfb83cc9b = m76505xea668b3e.m77188xfb83cc9b();
                    if (m77188xfb83cc9b == null) {
                        m77188xfb83cc9b = "";
                    }
                    int m77191x7520bed6 = m76505xea668b3e.m77191x7520bed6();
                    java.lang.String m77192x6a417fbb = m76505xea668b3e.m77192x6a417fbb();
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398547b = m77174x10fbdaef;
                    b1Var.f398545a = m77175xf2b998c1;
                    b1Var.f398555f = m77188xfb83cc9b;
                    b1Var.f398565k = m77191x7520bed6;
                    b1Var.f398567l = m77192x6a417fbb;
                    android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                    java.lang.String m77194xac98a158 = m76505xea668b3e.m77194xac98a158();
                    persistableBundle.putString("commonUxInfo", m77194xac98a158 != null ? m77194xac98a158 : "");
                    b1Var.f398563j = persistableBundle;
                    b1Var.f398561i = new lx.t1(m76505xea668b3e);
                    b1Var.L = new lx.s1(this);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context2, b1Var);
                }
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                if ((c19786x6a1e28623 != null && c19786x6a1e28623.m76503x92bc3c07() == 2) == true) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28624 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                    if (c19786x6a1e28624 != null && (m76494x46f709d9 = c19786x6a1e28624.m76494x46f709d9()) != null) {
                        str = m76494x46f709d9.m77166xb5887639();
                    }
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMeTabPlugin", "jumpInfo url is null");
                    } else {
                        tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                        ((ox.g) oVar).tj(context, str);
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parse jumpInfo error, type: ");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28625 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) xs2Var2.m75936x14adae67(20);
                    sb6.append(c19786x6a1e28625 != null ? java.lang.Integer.valueOf(c19786x6a1e28625.m76503x92bc3c07()) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMeTabPlugin", sb6.toString());
                }
            }
        }
        ((t01.m) ((rm.c0) i95.n0.c(rm.c0.class))).Ai(0);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: openUrl */
    public void mo85109xb4b50ac5(com.p314xaae8f345.p2845xc516c4b6.biz.C23284xd8c8bce articleInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(articleInfo, "articleInfo");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1 c23335x4dbe57d1 = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1(articleInfo.m85855x74d37ac6(), null, null, null, articleInfo.m85857x5ae7d1ac(), articleInfo.m85858xff358fa2(), articleInfo.m85860xb5887639(), articleInfo.m85853x7235c680(), articleInfo.m85861x6bf53a6c(), articleInfo.m85856x80025a04(), articleInfo.m85859x7531c8a2(), articleInfo.m85851x66e287ae(), null, null, null, articleInfo.m85850x6b6d78f4(), articleInfo.m85854x27681aaa(), articleInfo.m85852x6de99b06(), 28686, null);
        yw.h1 h1Var = yw.h1.f547865a;
        android.content.Context context = this.f403547d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        h1Var.s(c23335x4dbe57d1, context);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: preloadEnvForPluginApp */
    public void mo85110x39917f69() {
        ((r01.l1) i95.n0.c(r01.l1.class)).bj();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23154xf01dcc10
    /* renamed from: triggerPreDownloadForPath */
    public void mo85111xc2779d9b(java.lang.String appId, java.lang.String path, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        ((r01.l1) i95.n0.c(r01.l1.class)).fj(appId, path, (int) j17);
    }
}

package vm1;

/* loaded from: classes11.dex */
public final class x0 implements com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f519601d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f519602e;

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f519604g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.OrientationEventListener f519605h;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f519607m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f519608n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f519609o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f519610p;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f519603f = jz5.h.b(vm1.m0.f519563d);

    /* renamed from: i, reason: collision with root package name */
    public final int f519606i = 3004;

    public final android.content.Context a() {
        android.app.Activity activity = this.f519602e;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = this.f519601d;
        if (context != null) {
            return context;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        return context2;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: addOrRevertBlackList */
    public void mo92877xdf7778b5(byte[] tingBypassBuffer, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingBypassBuffer, "tingBypassBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g h17 = pm0.b0.h(tingBypassBuffer);
        if (h17 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y.f361647e.s(h17, z17, new vm1.q(callback));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: addToStar */
    public void mo92878x16d7b6e(byte[] listenItemData, long j17, boolean z17, boolean z18, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25183x8428c238 c25183x8428c238, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: allowRotate */
    public void mo92879x3a6a1204(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 activityC12823xa4912a28;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "allow rotate");
            android.app.Activity activity = this.f519602e;
            activityC12823xa4912a28 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) activity : null;
            if (activityC12823xa4912a28 != null) {
                activityC12823xa4912a28.setRequestedOrientation(4);
            }
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x;
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x = 4;
            this.f519610p = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "disallow rotate");
        android.app.Activity activity2 = this.f519602e;
        activityC12823xa4912a28 = activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) activity2 : null;
        if (activityC12823xa4912a28 != null) {
            activityC12823xa4912a28.setRequestedOrientation(1);
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x = 1;
        this.f519610p = false;
    }

    public final wm1.h b() {
        return (wm1.h) ((jz5.n) this.f519603f).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: buyWCCoin */
    public void mo92880xd533e983(byte[] param, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.bp0 mo11468x92b714fd = new bw5.bp0().mo11468x92b714fd(param);
        js4.n nVar = new js4.n();
        nVar.f383077b = mo11468x92b714fd.f107315d;
        nVar.f383076a = mo11468x92b714fd.f107316e;
        nVar.f383082g = js4.m.COMMON_CHARGE;
        nVar.f383088m = true;
        nVar.f383079d = new vm1.r(callback);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) a(), nVar);
    }

    public final void c(java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.w0(context, str, str2, intent, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: canShowHandOffOpenCommandItem */
    public boolean mo92881xf4ab101(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().mo11468x92b714fd(tingItemData).d();
        if (!il4.l.i(d17 != null ? d17.f115722e : 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioInteractPlugin", "canShowHandOffOpenCommandItem not file type");
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: consumeWCCoin */
    public void mo92882xbf36f679(byte[] param, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.ep0 mo11468x92b714fd = new bw5.ep0().mo11468x92b714fd(param);
        pr4.l lVar = new pr4.l(mo11468x92b714fd.f108518d, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) a(), new vm1.s(callback), new vm1.t(callback), new vm1.u(callback));
        lVar.f439559g = (mo11468x92b714fd.f108526o[2] ? mo11468x92b714fd.f108519e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: containsInStar */
    public void mo92883xd2657c16(java.util.List listenId, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: deleteFavBySourceId */
    public boolean mo92884xfd05f99d(java.lang.String sourceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceId, "sourceId");
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        ((a82.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(sourceId, "", null);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: destroyAndReopenTingMiniProgram */
    public void mo92885xfe322a25(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "destroyAndReopenTingMiniProgram scene: " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 activityC12823xa4912a28 = ((bv.f) ((rv.i2) i95.n0.c(rv.i2.class))).f106178d;
        java.lang.Boolean valueOf = activityC12823xa4912a28 != null ? java.lang.Boolean.valueOf(activityC12823xa4912a28.mo78538xecd98af8()) : null;
        bv.f fVar = (bv.f) ((rv.i2) i95.n0.c(rv.i2.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 activityC12823xa4912a282 = fVar.f106178d;
        if (activityC12823xa4912a282 != null) {
            activityC12823xa4912a282.finish();
        }
        fVar.wi(null);
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(new vm1.w(valueOf, j17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: followBrandAccount */
    public void mo92886x6bd5aef7(java.lang.String username, boolean z17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "followBrandAccount, username:" + username + "， scene:" + j17 + ", sceneNote:" + str2 + ", isCancel:" + z17);
        if (z17) {
            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
            ((qv.e) ((rv.m2) i95.n0.c(rv.m2.class))).wi(r01.z.b(username), this.f519602e, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true), false);
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f423996a = str;
        aVar.f423998c = str2;
        aVar.f423999d = str3;
        aVar.f424002g = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vm1.x(((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(a(), username, (int) j17, new vm1.y(callback), aVar)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: followFinderAccount */
    public void mo92887xf78a8ef6(java.lang.String username, boolean z17, byte[] bArr, long j17, java.lang.String str, yz5.l callback) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (bArr != null) {
            try {
                new bw5.lp0().mo11468x92b714fd(bArr);
                i17 = 15;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioInteractPlugin", "doFollowFinder exp=" + e17);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
                return;
            }
        } else {
            i17 = 0;
        }
        int i18 = i17;
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        int i19 = z17 ? 2 : 1;
        java.lang.Long l17 = 0L;
        int i27 = (int) j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) e6Var;
        s1Var.getClass();
        s1Var.Di(username, i19, l17.longValue(), false, i27, i18, i27, str);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: get3rdAppInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24971x3a22f28 mo92888xf0604ce0(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (appId.length() == 0) {
            return null;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(appId);
        if (h17 == null) {
            return null;
        }
        java.lang.String str = h17.f67372x453d1e07;
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24971x3a22f28 c24971x3a22f28 = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24971x3a22f28(appId, str == null ? "" : str, null, null, null, 28, null);
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(appId, 1, i65.a.g(a()));
        if (Di == null) {
            java.lang.String str2 = h17.f67369x5e556d3a;
            return com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24971x3a22f28.m92589x75149012(c24971x3a22f28, null, null, str2 == null ? "" : str2, null, null, 27, null);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        Di.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "recycle bitmap:%s", Di);
        Di.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
        try {
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FlutterBizAudioInteractPlugin", e17, "", new java.lang.Object[0]);
        }
        return com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24971x3a22f28.m92589x75149012(c24971x3a22f28, null, null, null, byteArray, byteArray, 7, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: get3rdAppInfoAsync */
    public void mo92889x7df6d17c(java.lang.String appId, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getBrandContactInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24983xeae3ce15 mo92890x7df4065d(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24983xeae3ce15(username, java.lang.Boolean.valueOf(n17 != null && n17.r2()));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getContactInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25185xbf891f35 mo92891xdc4133b8(java.lang.String username) {
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String str = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(username)) {
            return null;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(username);
        if (((kv.a0) i95.n0.c(kv.a0.class)) != null && (Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni()) != null && (n07 = Ni.n0(username)) != null) {
            str = n07.d();
        }
        return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25185xbf891f35(username, e17, str, null, 8, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getContactInfoFromHash */
    public java.util.List mo92892xf832c7b0(java.util.List hashusernames) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashusernames, "hashusernames");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = hashusernames.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            n73.e eVar = (n73.e) i95.n0.c(n73.e.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 wi6 = eVar != null ? ((m73.q) eVar).wi(str, 2) : null;
            if (wi6 != null) {
                arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25185xbf891f35(wi6.d1(), wi6.P0(), null, str, 4, null));
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getContactInfoFromHashAsync */
    public void mo92893x1b9098ac(java.util.List hashUsernames, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashUsernames, "hashUsernames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getFinderAccountInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a mo92894xf073c7bf() {
        java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(a());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.b2 b17 = ya2.h.f542017a.b(Ui);
        java.lang.String w07 = b17 != null ? b17.w0() : null;
        java.lang.String str = w07 == null ? "" : w07;
        java.lang.String m176700xe5e0d2a0 = b17 != null ? b17.m176700xe5e0d2a0() : null;
        if (m176700xe5e0d2a0 == null) {
            m176700xe5e0d2a0 = "";
        }
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a c25010xf04c5f7a = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a(Ui, str, m176700xe5e0d2a0, null, 8, null);
        java.lang.String m92760x6c03c64c = c25010xf04c5f7a.m92760x6c03c64c();
        if (m92760x6c03c64c == null || r26.n0.N(m92760x6c03c64c)) {
            return null;
        }
        return c25010xf04c5f7a;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getFinderContactInfo */
    public void mo92895xbf433032(java.lang.String userName, yz5.l callback) {
        java.lang.String str;
        java.lang.String m76175x6d346f39;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa Rj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rj(userName);
        boolean z17 = false;
        if (Rj != null) {
            int m76170x756826b3 = Rj.m76170x756826b3();
            l75.e0 e0Var = ya2.b2.O2;
            if (m76170x756826b3 == ya2.b2.Q2) {
                z17 = true;
            }
        }
        java.lang.String str2 = "";
        if (Rj == null || (str = Rj.m76184x8010e5e4()) == null) {
            str = "";
        }
        if (Rj != null && (m76175x6d346f39 = Rj.m76175x6d346f39()) != null) {
            str2 = m76175x6d346f39;
        }
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a(userName, str, str2, java.lang.Boolean.valueOf(z17)))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getIdentityType */
    public long mo92896x59c0778e() {
        return 2L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getPoiInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25172xd971bb2a mo92897x25db91e2() {
        return new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25172xd971bb2a(null, null, null, null, 15, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getWCCoinBalance */
    public void mo92898x454cb509(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new vm1.z(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getWxUsername */
    public java.lang.String mo92899xf07c42cd() {
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        return r17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToCreateFinderAccount */
    public void mo92900xe0093908(java.lang.String str, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f519607m = callback;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        android.content.Context a17 = a();
        if (str == null) {
            str = "";
        }
        ((c61.l7) b6Var).Zi(a17, str, this.f519606i);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToLiteApp */
    public void mo92901xf30adb90(java.lang.String appId, java.lang.String path, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToMusicChatroom */
    public void mo92902xb44204b5(java.lang.String categoryId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryId, "categoryId");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToProfile */
    public void mo92903xd5b9faa6(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.a0(userName, context, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToQQMusicPayment */
    public void mo92904x4367e2a4(java.lang.String appId, java.lang.String mid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mid, "mid");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToShakeViewController */
    public void mo92905x25296644() {
        ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(a(), new android.content.Intent(), true);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToWebPage */
    public void mo92906x31154900(java.lang.String url, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("convertActivityFromTranslucent", true);
        c("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoAppInstallPage */
    public void mo92907x301b9a2c(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoBusinessAccountProfile */
    public void mo92908x1cfae7df(java.lang.String userName, long j17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (userName.length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "gotoBusinessAccountProfile, userName:" + userName + ", scene:" + j17 + ", sceneNote:" + str);
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.b0(userName, j17, str, context, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoBusinessArticle */
    public void mo92909xdf625133(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("forceHideShare", true);
        android.content.Intent putExtra = intent.putExtra("convertActivityFromTranslucent", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        c("webview", ".ui.tools.WebViewUI", putExtra);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderAccountProfile */
    public void mo92910x841b6a85(java.lang.String userName, long j17, long j18, java.lang.String str, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderAccountProfileHalfPage */
    public void mo92911x973ebf07(java.lang.String username, long j17, long j18, java.lang.String str, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderDetail */
    public void mo92912x8df9211a(java.lang.String tid, java.lang.String nonceId, boolean z17, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tid, "tid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        mo92913x1a8da12f(tid, nonceId, z17, sessionId, 0L);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderDetailWithStartTime */
    public void mo92913x1a8da12f(java.lang.String tid, java.lang.String nonceId, boolean z17, java.lang.String sessionId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tid, "tid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.c0(context, tid, nonceId, z17, sessionId, j17, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderFeed */
    public void mo92914xf24c8ca7(java.lang.String tid, java.lang.String nonceId, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tid, "tid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "gotoFinderFeed tid: " + tid + ", nonceId: " + nonceId + ", sessionId: " + sessionId);
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.d0(tid, nonceId, context, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderLive */
    public void mo92915xf24f57f5(java.lang.String tid, java.lang.String nonceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tid, "tid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = a();
        }
        android.content.Context context2 = context;
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(tid, 0L)));
        m84Var.set(2, nonceId);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        ((vd2.f1) e0Var).Ri(context2, null, m84Var, true, wk0Var, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderMyProfileAudioTab */
    public void mo92916xf3b734f3(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a c25010xf04c5f7a) {
        if (c25010xf04c5f7a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "gotoFinderMyProfileAudioTab contactInfo is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "gotoFinderMyProfileAudioTab userName:" + c25010xf04c5f7a.m92760x6c03c64c());
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.e0(context, c25010xf04c5f7a, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoTingSettingPage */
    public void mo92917x66e1f54e() {
        c("setting", ".ui.setting.SettingsMusicUI", new android.content.Intent());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: hasAddedInFavDB */
    public boolean mo92918xad83114e(java.lang.String sourceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceId, "sourceId");
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId) != null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: hybridOpenAudioMine */
    public void mo92919x105fad83() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: inPlayer */
    public void mo92920xe4ec6466(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071 A[RETURN] */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: isAppInstalled */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo92921x3a4ba4a3(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "appId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "scheme"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isAppInstalled appId: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", scheme: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FlutterBizAudioInteractPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            int r0 = r7.length()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L2f
            r0 = r2
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L34
        L32:
            r7 = r3
            goto L5e
        L34:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L55
            r0.<init>(r4, r7)     // Catch: java.lang.Throwable -> L55
            android.content.Context r7 = r5.a()     // Catch: java.lang.Throwable -> L55
            java.util.List r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L52
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L50
            goto L52
        L50:
            r7 = r3
            goto L53
        L52:
            r7 = r2
        L53:
            r7 = r7 ^ r2
            goto L5e
        L55:
            r7 = move-exception
            java.lang.String r0 = "isAppInstalled exception"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r7, r0, r4)
            goto L32
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "isAppInstalled ret: "
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r7 == 0) goto L72
            return r7
        L72:
            java.lang.Class<lt.i0> r7 = lt.i0.class
            i95.m r7 = i95.n0.c(r7)
            lt.i0 r7 = (lt.i0) r7
            kt.c r7 = (kt.c) r7
            r7.getClass()
            com.tencent.mm.pluginsdk.model.app.m r7 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(r6)
            if (r7 == 0) goto L88
            java.lang.String r7 = r7.f67386xa1e9e82c
            goto L89
        L88:
            r7 = 0
        L89:
            if (r7 != 0) goto L8d
            java.lang.String r7 = ""
        L8d:
            java.lang.String r0 = "isAppInstalled packageName: "
            java.lang.String r0 = r0.concat(r7)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            int r0 = r7.length()
            if (r0 <= 0) goto L9e
            r0 = r2
            goto L9f
        L9e:
            r0 = r3
        L9f:
            if (r0 == 0) goto Lac
            android.content.Context r0 = r5.a()
            boolean r7 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(r0, r7)
            if (r7 == 0) goto Lac
            return r2
        Lac:
            java.lang.String r7 = "isAppInstalled not install, appId: "
            java.lang.String r6 = r7.concat(r6)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vm1.x0.mo92921x3a4ba4a3(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: launchApplication */
    public void mo92922xbb674b9d(java.lang.String appId, java.lang.String scheme) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scheme, "scheme");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "launchApplication appId: " + appId + ", scheme: " + scheme);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new vm1.f0(), null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FlutterBizAudioInteractPlugin", th6, "launchApplication exception", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: launchApplicationWithUrl */
    public void mo92923x53f5106c(java.lang.String appId, java.lang.String scheme, java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scheme, "scheme");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "launchApplicationWithUrl appId: " + appId + ", scheme: " + scheme);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new vm1.g0(z17, this, appId, url), null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: markPlayTaskInFullScreenPlayerMode */
    public void mo92924x9326978a() {
        rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        k8Var.N(true);
        k8Var.L(true);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        int i19 = this.f519606i;
        if (i17 == i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "onActivityResult createFinderRequestCode req is " + i19 + " result is " + i18, "FlutterTingInteractPlugin onActivityResult");
            if (i18 == 1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult createFinderRequestCode ");
                sb6.append(intent != null ? intent.getStringExtra("KEY_FINDER_USERNAME_SELF") : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", sb6.toString(), "FlutterTingInteractPlugin onActivityResult");
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("KEY_FINDER_USERNAME_SELF") : null;
                yz5.l lVar = this.f519607m;
                if (lVar != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a(stringExtra, null, null, null, 14, null))));
                }
            } else {
                yz5.l lVar2 = this.f519607m;
                if (lVar2 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("createOver")))));
                }
            }
        }
        if (!(this.f519602e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28)) {
            return false;
        }
        if (i17 == 1001) {
            if (i18 == -1) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
                if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra, ";");
                }
            }
            return true;
        }
        if (i17 == 1004 || i17 == 1006 || i17 == 1007) {
            return true;
        }
        if (i17 == 1002) {
            if (i18 == -1) {
                dp.a.m125854x26a183b(a(), a().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3v), 0).show();
            }
            return true;
        }
        if (i17 == 1005) {
            if (i18 == -1) {
                dp.a.m125854x26a183b(a(), a().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3v), 0).show();
            }
            return true;
        }
        if (i17 == 1003) {
            return true;
        }
        if (i17 == 2) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            android.app.Activity activity = this.f519602e;
            ((ht.a) vVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f(activity, i17, i18, intent, true, com.p314xaae8f345.mm.R.C30867xcad56011.brq, com.p314xaae8f345.mm.R.C30867xcad56011.brr, 15);
        }
        return false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "onAttachedToActivity");
        this.f519602e = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
        if (this.f519602e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) {
            mo92879x3a6a1204(this.f519610p);
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428859w);
        vm1.h0 h0Var = new vm1.h0(this, a());
        this.f519605h = h0Var;
        h0Var.enable();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f519601d = p07.m137982x6e669035();
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion.m92973x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25049xf3c6a8f4(m137983x3b5b91dc2, null, 2, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25036xfb9a55be(m137983x3b5b91dc3, null, 2, null);
        new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(p07.m137983x3b5b91dc(), "ting_ugc_voice_input/event").m138415x95b45268(new vm1.i0(this));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: onCommonHalfScreenGoDetailClick */
    public void mo92925x53b53566(java.lang.String identifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identifier, "identifier");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(identifier, "thumb_like_education")) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = this.f519602e;
            if (context == null) {
                context = a();
            }
            qk.f9.e(aj6, context, bw5.ar0.TingScene_FinderDetailPage, null, 0, null, null, 52, null);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "onDetachedFromActivity");
        this.f519602e = null;
        android.view.OrientationEventListener orientationEventListener = this.f519605h;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f519605h = null;
        zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
        if (c3Var != null) {
            ((yg0.u3) c3Var).wi();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f519602e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion.m92973x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: onPlayerAction */
    public void mo92926x469423f6(byte[] itemData, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        new bw5.lp0().mo11468x92b714fd(itemData);
        if (j17 != com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24969xdb1cec97.PRE.ordinal()) {
            com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24969xdb1cec97.f44756x2482f3.ordinal();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: onPlayerLike */
    public void mo92927x4405c557(byte[] itemData, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f519602e = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: onTingCommonEvent */
    public void mo92928x8a53f7c2(long j17, java.util.Map map) {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: open3rdAppWithTingItem */
    public void mo92929xebcce22d(java.lang.String appId, byte[] itemData, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openAD */
    public void mo92930xc3c3c3ed(byte[] adSchemeInfo, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adSchemeInfo, "adSchemeInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openByOtherApp */
    public void mo92931x192bc052(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openFinderAudioMinePage */
    public void mo92932x9bc8e248() {
        ((wy2.g) ((o40.e) i95.n0.c(o40.e.class))).Ni(a());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openLiteApp */
    public void mo92933xff2414e9(long j17, java.lang.String appId, java.lang.String path, java.lang.String query, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", appId);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, path);
        bundle.putString("query", query);
        bundle.putBoolean("isHalfScreen", j17 == 2);
        bundle.putString("minVersion", str);
        if (z17) {
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, z17);
            bundle.putBoolean("forbidRightGesture", true);
            bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559412e3);
            bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "gotoLiteApp appId: " + appId + ", liteAppType:" + j17 + ", path: " + path + " query: " + query);
        ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).aj(appId);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(a(), bundle, true, false, new vm1.j0(this));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openWeApp */
    public void mo92934x5bb32049(java.lang.String appId, java.lang.String path, long j17, java.lang.String sceneNote, boolean z17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneNote, "sceneNote");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vm1.k0(appId, path, j17, sceneNote, z17, j18, this, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openWebPage */
    public void mo92935x3d2e8259(java.lang.String url, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24968xe7b93e87 openInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openInfo, "openInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("convertActivityFromTranslucent", true);
        intent.putExtra("hide_option_menu", openInfo.m92561xcbc2b4c());
        c("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: preloadMiniProgram */
    public void mo92936xbf3d9c64(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: prepareLiteApp */
    public void mo92937x34c18f8c(long j17, java.lang.String appId, java.lang.String page, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).sj(7, null);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(appId) == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(appId, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: quickShareCategoryItem */
    public void mo92938x7e49dc43(byte[] itemData, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (this.f519602e == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(itemData);
        wm1.h b17 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        android.app.Activity activity = this.f519602e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        b17.getClass();
        java.lang.String b18 = b17.b(mo11468x92b714fd);
        if (b18 == null) {
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        oe5.b bVar = new oe5.b();
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(b18);
        bVar.l(cVar);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        wm1.a aVar = new wm1.a(userName, mo11468x92b714fd, b18, activity);
        n13.t tVar = new n13.t();
        tVar.f415666a = aVar;
        ((dk5.y) a0Var).wi(activity, bVar, userName, tVar);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: quickShareTingItem */
    public void mo92939xff3f5333(byte[] tingItemData, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (this.f519602e == null) {
            return;
        }
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
        wm1.h b17 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        android.app.Activity activity = this.f519602e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        b17.getClass();
        java.lang.String d17 = b17.d(mo11468x92b714fd);
        if (d17 == null) {
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        oe5.c cVar = new oe5.c();
        l15.c cVar2 = new l15.c();
        cVar2.m126728xdc93280d(d17);
        cVar.l(cVar2);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        wm1.g gVar = new wm1.g(userName, mo11468x92b714fd, d17, activity);
        n13.t tVar = new n13.t();
        tVar.f415666a = gVar;
        ((dk5.y) a0Var).wi(activity, cVar, userName, tVar);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: saveLocalFile */
    public void mo92940x4125568a(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
        bw5.v70 d17 = mo11468x92b714fd.d();
        if (!il4.l.i(d17 != null ? d17.f115722e : 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioInteractPlugin", "saveLocalFile not file type and ignore");
            return;
        }
        java.lang.String m12386x5000ed37 = mo11468x92b714fd.d().i().m12386x5000ed37();
        if (m12386x5000ed37 == null) {
            m12386x5000ed37 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "saveLocalFile filePath: " + m12386x5000ed37 + ", title: " + rk4.j5.j(mo11468x92b714fd));
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context a17 = a();
        bw5.l80 i17 = mo11468x92b714fd.d().i();
        java.lang.String b17 = i17 != null ? i17.b() : null;
        java.lang.String str = b17 != null ? b17 : "";
        vm1.l0 l0Var = new vm1.l0(this);
        ((yb0.g) b0Var).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(a17, m12386x5000ed37, str, l0Var);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: scan */
    public void mo92941x35c67d(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: selectLocalImage */
    public void mo92942x5ffbcacc(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: selectLocalPhoto */
    public void mo92943x605c5fa3(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: sendHandOffOpenCommand */
    public void mo92944x810d70a9(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().mo11468x92b714fd(tingItemData).d();
        if (il4.l.i(d17 != null ? d17.f115722e : 0)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioInteractPlugin", "sendHandOffOpenCommand not file type");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setNavigationBarColor */
    public void mo92945x8ef35546(long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setOnceOrientation */
    public void mo92946x72067fcd(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 activityC12823xa4912a28;
        int i17 = (int) j17;
        if (java.lang.Integer.valueOf(i17).equals(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "setOnceOrientation 0");
            android.app.Activity activity = this.f519602e;
            activityC12823xa4912a28 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) activity : null;
            if (activityC12823xa4912a28 != null) {
                activityC12823xa4912a28.setRequestedOrientation(1);
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x;
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x = 1;
            this.f519609o = true;
            this.f519608n = false;
            return;
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioInteractPlugin", "setOnceOrientation value error");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "setOnceOrientation 0");
        android.app.Activity activity2 = this.f519602e;
        activityC12823xa4912a28 = activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28) activity2 : null;
        if (activityC12823xa4912a28 != null) {
            activityC12823xa4912a28.setRequestedOrientation(0);
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.f173998x = 0;
        this.f519608n = true;
        this.f519609o = false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setShowAudioRedDot */
    public void mo92947xb47e766f(boolean z17) {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ri(z17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setWindowKeepScreenOn */
    public void mo92948x1dfb4622(boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareCategoryItem */
    public void mo92949xbd57cab0(byte[] itemData, long j17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "shareCategoryItem shareScene: " + j17);
        android.app.Activity activity = this.f519602e;
        if (activity == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(itemData);
        str = "";
        if (j17 == 1) {
            wm1.h b17 = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            b17.getClass();
            java.lang.String k17 = il4.d.k(mo11468x92b714fd);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAudioShareHelper", "shareAlbumToChat categoryId: " + mo11468x92b714fd.c() + ", categoryType: " + mo11468x92b714fd.f112497n + ", coverUrl: %s", k17);
            java.lang.String b18 = b17.b(mo11468x92b714fd);
            if (b18 == null) {
                return;
            }
            java.lang.String Ri = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ri(k17 != null ? k17 : "");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", b18);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", Ri);
            intent.putExtra("Retr_Msg_thumb_url", k17);
            j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, 1004);
            return;
        }
        if (j17 != 2) {
            if (j17 == 3) {
                wm1.h b19 = b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
                b19.getClass();
                ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
                java.lang.String k18 = il4.d.k(mo11468x92b714fd);
                ((dl4.m0) tVar).Bi(k18 != null ? k18 : "", new wm1.b(mo11468x92b714fd, activity, 3, b19));
                return;
            }
            return;
        }
        wm1.h b27 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        b27.getClass();
        android.content.Intent intent2 = new android.content.Intent();
        r45.km6 km6Var = new r45.km6();
        km6Var.f460371d = mo11468x92b714fd.f112497n;
        km6Var.f460372e = il4.d.e(mo11468x92b714fd);
        java.lang.String c17 = mo11468x92b714fd.c();
        if (c17 == null) {
            c17 = "";
        }
        km6Var.f460373f = c17;
        java.lang.String m12638xb5887639 = mo11468x92b714fd.m12638xb5887639();
        java.lang.String m12638xb58876392 = !(m12638xb5887639 == null || m12638xb5887639.length() == 0) ? mo11468x92b714fd.m12638xb5887639() : rk4.m.f478368b;
        java.lang.String k19 = il4.d.k(mo11468x92b714fd);
        if (k19 == null) {
            k19 = "";
        }
        if (!(k19.length() == 0)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(k19);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (km6Var.f460371d > 0) {
                sb6.append("<tingCategoryItem>");
                sb6.append("<type>");
                sb6.append(km6Var.f460371d);
                sb6.append("</type>");
                sb6.append("<categoryItem>");
                java.lang.String str2 = km6Var.f460372e;
                if (str2 == null) {
                    str2 = "";
                }
                sb6.append(str2);
                sb6.append("</categoryItem>");
                sb6.append("<categoryId>");
                java.lang.String str3 = km6Var.f460373f;
                if (str3 != null) {
                    str = str3;
                }
                sb6.append(str);
                sb6.append("</categoryId>");
                sb6.append("</tingCategoryItem>");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizAudioAlbumShareParser", "make content error! %s", e17.getMessage());
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        intent2.putExtra("Ksnsupload_ting_album_share_object_xml", sb7);
        intent2.putExtra("Ksnsupload_link", m12638xb58876392);
        intent2.putExtra("Ksnsupload_title", mo11468x92b714fd.m12637xfb82e301());
        intent2.putExtra("Ksnsupload_type", 35);
        intent2.putExtra("need_result", true);
        intent2.putExtra("Ksnsupload_source", 1);
        j45.l.v(activity, ".plugin.sns.ui.SnsUploadUI", intent2, 1005);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareContent */
    public void mo92950x1fc9b39a(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25177xe9583a5 shareData, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25176x66a813 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareData, "shareData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareLyric */
    public void mo92951x946477c0(byte[] tingItemData, java.util.List lyricItems, double d17, double d18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricItems, "lyricItems");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareTingChatRoom */
    public void mo92952x2aded2e0(byte[] categoryItemData, byte[] bArr, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItemData, "categoryItemData");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareTingChatRoomForward */
    public void mo92953x56145bc5(byte[] categoryItemData, byte[] bArr, long j17, java.lang.String str, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItemData, "categoryItemData");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareTingItem */
    public void mo92954x81378020(byte[] tingItemData, byte[] bArr, byte[] bArr2, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "shareTingItem shareScene: " + j17);
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
        android.app.Activity activity = this.f519602e;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).k(new vm1.n0(j17, this, activity, mo11468x92b714fd, bArr), 200L);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showAudioRedDot */
    public boolean mo92955x99460b31() {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        return em4.b.f336745a;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showFansHalfProfile */
    public void mo92956xdce9ad59(java.lang.String username, java.lang.String nickname, java.lang.String headImgUrl, byte[] listenBypassBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headImgUrl, "headImgUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenBypassBuffer, "listenBypassBuffer");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String e17 = xy2.c.e(a());
        intent.putExtra("IsPoster", true);
        intent.putExtra("feedUser", e17);
        intent.putExtra("Avatar", headImgUrl);
        intent.putExtra("Nickname", nickname);
        intent.putExtra("Username", username);
        intent.putExtra("V5UserName", username);
        intent.putExtra("Action", 1);
        intent.putExtra("listenBypassBuffer", listenBypassBuffer);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214053a.g(a(), intent, 21);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showHalfScreenWebView */
    public void mo92957x29062f1d(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.app.Activity activity = this.f519602e;
        if (activity == null) {
            return;
        }
        i95.m c17 = i95.n0.c(zg0.u2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) zg0.u2.K2((zg0.u2) c17, activity, url, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(0.6f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388590, null), 4, null)).show();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showMultiSelectContactViewAndGetInfo */
    public void mo92958xc514129a(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25175x712785bf config, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showSessionSelectViewAndGetInfo */
    public void mo92959x2b768667(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showSharePreConfirmView */
    public void mo92960x6a3d2a64(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238 contactInfo, byte[] categoryItemData, byte[] listenItemData, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactInfo, "contactInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItemData, "categoryItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: startRecognizeSong */
    public void mo92961x70f09581(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: startRecord */
    public void mo92962x8e35cb53(long j17, long j18, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        d75.b.g(new vm1.q0(j17, j18, this, callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: startRecordWithConfiguration */
    public void mo92963x76ed0abd(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24982xdc19259d configuration, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        d75.b.g(new vm1.t0(configuration, this, callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: startVoiceInput */
    public void mo92964x15c083ba(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: stopRecognizeSong */
    public void mo92965xfb8835e1() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: stopRecord */
    public void mo92966xad07d6f3(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        d75.b.g(new vm1.v0(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: stopVoiceInput */
    public void mo92967x1f63bf5a() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: updateCurrentMultiTaskId */
    public void mo92968x3e83cd89(java.lang.String str, boolean z17) {
        ia0.n nVar = (ia0.n) i95.n0.c(ia0.n.class);
        android.content.Context context = this.f519602e;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        ((ia0.o) nVar).Ai(context);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: updatePersonalizedRecommend */
    public void mo92969x9fa30183(boolean z17) {
        ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).cj(java.lang.Boolean.valueOf(z17), true);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: uploadLocalPhoto */
    public void mo92970xf35d7668(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24970x8aec39c0 localPhotoResult, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPhotoResult, "localPhotoResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: uploadRecordFileToCdn */
    public void mo92971x1f921204(java.lang.String localFilePath, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localFilePath, "localFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
    }
}

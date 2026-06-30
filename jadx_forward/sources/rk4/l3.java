package rk4;

/* loaded from: classes11.dex */
public final class l3 implements com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: t, reason: collision with root package name */
    public static com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25036xfb9a55be f478347t;

    /* renamed from: u, reason: collision with root package name */
    public static com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25180x35e58c40 f478348u;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f478349d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f478350e;

    /* renamed from: g, reason: collision with root package name */
    public dl4.f f478352g;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f478353h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24979xd5d6633e f478354i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.OrientationEventListener f478355m;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f478357o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f478358p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f478359q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f478360r;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f478351f = jz5.h.b(rk4.n2.f478389d);

    /* renamed from: n, reason: collision with root package name */
    public final int f478356n = 3004;

    /* renamed from: s, reason: collision with root package name */
    public final int f478361s = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658;

    public final android.content.Context a() {
        android.app.Activity activity = this.f478350e;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = this.f478349d;
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
        jm4.h5.a(tingBypassBuffer, z17, new rk4.b1(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: addToStar */
    public void mo92878x16d7b6e(byte[] listenItemData, long j17, boolean z17, boolean z18, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25183x8428c238 c25183x8428c238, boolean z19) {
        android.graphics.Rect rect;
        android.graphics.Bitmap bitmap;
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
        try {
            bw5.v70 mo11468x92b714fd = new bw5.v70().mo11468x92b714fd(listenItemData);
            byte[] m93159x12f2b736 = c25183x8428c238 != null ? c25183x8428c238.m93159x12f2b736() : null;
            if (c25183x8428c238 == null || m93159x12f2b736 == null) {
                rect = null;
                bitmap = null;
            } else {
                int length = m93159x12f2b736.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(m93159x12f2b736);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/ting/FlutterTingInteractPlugin", "addToStar", "([BJZZLcom/tencent/pigeon/ting/TingStarSnapInfo;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/ting/FlutterTingInteractPlugin", "addToStar", "([BJZZLcom/tencent/pigeon/ting/TingStarSnapInfo;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Rect rect2 = new android.graphics.Rect();
                java.lang.Double m93161xfb82087d = c25183x8428c238.m93161xfb82087d();
                int doubleValue = m93161xfb82087d != null ? (int) m93161xfb82087d.doubleValue() : 0;
                rect2.left = doubleValue;
                java.lang.Double m93163x755bd410 = c25183x8428c238.m93163x755bd410();
                rect2.right = doubleValue + (m93163x755bd410 != null ? (int) m93163x755bd410.doubleValue() : 0);
                java.lang.Double m93162xb588721f = c25183x8428c238.m93162xb588721f();
                int doubleValue2 = m93162xb588721f != null ? (int) m93162xb588721f.doubleValue() : 0;
                rect2.top = doubleValue2;
                java.lang.Double m93160x1c4fb41d = c25183x8428c238.m93160x1c4fb41d();
                rect2.bottom = doubleValue2 + (m93160x1c4fb41d != null ? (int) m93160x1c4fb41d.doubleValue() : 0);
                rect = rect2;
                bitmap = decodeByteArray;
            }
            cl4.l lVar = new cl4.l(new cl4.m(this.f478350e));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            cl4.l.c0(lVar, mo11468x92b714fd, z18, z17, rect, bitmap, false, 32, null);
            if (!z19 || (activity = this.f478350e) == null) {
                return;
            }
            activity.finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "addToStar Exception=" + e17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: allowRotate */
    public void mo92879x3a6a1204(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d;
        if (z17) {
            rk4.k5.e("allow rotate", "FlutterTingInteractPlugin");
            android.app.Activity activity = this.f478350e;
            activityC18699x6096e65d = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) activity : null;
            if (activityC18699x6096e65d != null) {
                activityC18699x6096e65d.setRequestedOrientation(4);
            }
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z;
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z = 4;
            this.f478360r = true;
            return;
        }
        rk4.k5.e("disallow rotate", "FlutterTingInteractPlugin");
        android.app.Activity activity2 = this.f478350e;
        activityC18699x6096e65d = activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) activity2 : null;
        if (activityC18699x6096e65d != null) {
            activityC18699x6096e65d.setRequestedOrientation(1);
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z = 1;
        this.f478360r = false;
    }

    public final cl4.v b() {
        return (cl4.v) ((jz5.n) this.f478351f).mo141623x754a37bb();
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
        nVar.f383079d = new rk4.c1(callback);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) a(), nVar);
    }

    public final void c(java.lang.String userName, long j17, long j18, java.lang.String str, long j19, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        rk4.k5.e("gotoFinderAccountProfile userName:" + userName + " tabType=" + j17, "FlutterTingInteractPlugin");
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.z1(context, j17, j18, userName, str, z17, j19, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: canShowHandOffOpenCommandItem */
    public boolean mo92881xf4ab101(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().mo11468x92b714fd(tingItemData).d();
        if (il4.l.i(d17 != null ? d17.f115722e : 0)) {
            return ((d73.i) i95.n0.c(d73.i.class)).Qg() && ((d73.i) i95.n0.c(d73.i.class)).t1() != null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "canShowHandOffOpenCommandItem not file type");
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: consumeWCCoin */
    public void mo92882xbf36f679(byte[] param, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.ep0 mo11468x92b714fd = new bw5.ep0().mo11468x92b714fd(param);
        pr4.l lVar = new pr4.l(mo11468x92b714fd.f108518d, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) a(), new rk4.d1(callback), new rk4.e1(callback), new rk4.f1(callback));
        lVar.f439559g = (mo11468x92b714fd.f108526o[2] ? mo11468x92b714fd.f108519e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: containsInStar */
    public void mo92883xd2657c16(java.util.List listenId, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        jm4.h5.b((java.lang.String[]) listenId.toArray(new java.lang.String[0]), z17, new rk4.g1(callback));
    }

    public final void d(java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.i3(context, str, str2, intent, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: deleteFavBySourceId */
    public boolean mo92884xfd05f99d(java.lang.String sourceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceId, "sourceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        rk4.h1 h1Var = new rk4.h1(c0Var);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        ((a82.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(sourceId, "", null);
        h1Var.mo146xb9724478(java.lang.Boolean.TRUE);
        return c0Var.f391645d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: destroyAndReopenTingMiniProgram */
    public void mo92885xfe322a25(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "destroyAndReopenTingMiniProgram scene: " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d = ((ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class))).f333758e;
        java.lang.Boolean valueOf = activityC18699x6096e65d != null ? java.lang.Boolean.valueOf(activityC18699x6096e65d.mo78538xecd98af8()) : null;
        ef0.h3 h3Var = (ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d2 = h3Var.f333758e;
        if (activityC18699x6096e65d2 != null) {
            activityC18699x6096e65d2.finish();
        }
        h3Var.Bi(null);
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(new rk4.j1(valueOf, j17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: followBrandAccount */
    public void mo92886x6bd5aef7(java.lang.String username, boolean z17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        rk4.k5.e("followBrandAccount, username:" + username + "， scene:" + j17 + ", sceneNote:" + str2 + ", isCancel:" + z17, "FlutterTingInteractPlugin");
        if (z17) {
            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
            ((qv.e) ((rv.m2) i95.n0.c(rv.m2.class))).wi(r01.z.b(username), this.f478350e, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true), false);
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f423996a = str;
        aVar.f423998c = str2;
        aVar.f423999d = str3;
        aVar.f424002g = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new rk4.k1(((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(a(), username, (int) j17, new rk4.l1(callback), aVar)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: followFinderAccount */
    public void mo92887xf78a8ef6(java.lang.String username, boolean z17, byte[] bArr, long j17, java.lang.String str, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArr2 = bArr;
        if (str == null) {
            str = "";
        }
        rk4.m1 m1Var = new rk4.m1(callback);
        ((u71.i) rVar).getClass();
        w71.e.a(username, z17, bArr2, j17, str, m1Var);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "recycle bitmap:%s", Di);
        Di.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
        try {
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FlutterTingInteractPlugin", e17, "", new java.lang.Object[0]);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.n1 n1Var = new rk4.n1(h0Var);
        ((u71.i) rVar).getClass();
        w71.e.b(username, n1Var);
        return (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24983xeae3ce15) h0Var.f391656d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getContactInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25185xbf891f35 mo92891xdc4133b8(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.o1 o1Var = new rk4.o1(h0Var);
        ((u71.i) rVar).getClass();
        w71.e.c(username, o1Var);
        return (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25185xbf891f35) h0Var.f391656d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getContactInfoFromHash */
    public java.util.List mo92892xf832c7b0(java.util.List hashusernames) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashusernames, "hashusernames");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        java.lang.String[] hashUsernames = (java.lang.String[]) hashusernames.toArray(new java.lang.String[0]);
        rk4.p1 p1Var = new rk4.p1(h0Var);
        ((u71.i) rVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashUsernames, "hashUsernames");
        w71.e.d(hashUsernames, p1Var);
        return (java.util.List) h0Var.f391656d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getContactInfoFromHashAsync */
    public void mo92893x1b9098ac(java.util.List hashUsernames, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashUsernames, "hashUsernames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        java.lang.String[] hashUsernames2 = (java.lang.String[]) hashUsernames.toArray(new java.lang.String[0]);
        rk4.r1 r1Var = new rk4.r1(callback);
        ((u71.i) rVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashUsernames2, "hashUsernames");
        w71.e.d(hashUsernames2, r1Var);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.s1 s1Var = new rk4.s1(callback);
        ((u71.i) rVar).getClass();
        w71.e.e(userName, s1Var);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getIdentityType */
    public long mo92896x59c0778e() {
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        jm4.h5.c(new rk4.t1(g0Var));
        return g0Var.f391654d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getPoiInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25172xd971bb2a mo92897x25db91e2() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25172xd971bb2a(null, null, null, null, 15, null);
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.u1 u1Var = new rk4.u1(h0Var);
        ((u71.i) rVar).getClass();
        w71.e.f(u1Var);
        return (com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25172xd971bb2a) h0Var.f391656d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getWCCoinBalance */
    public void mo92898x454cb509(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new rk4.v1(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: getWxUsername */
    public java.lang.String mo92899xf07c42cd() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.w1 w1Var = new rk4.w1(h0Var);
        ((u71.i) rVar).getClass();
        java.lang.String r17 = c01.z1.r();
        w1Var.mo146xb9724478(r17 != null ? r17 : "");
        return (java.lang.String) h0Var.f391656d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToCreateFinderAccount */
    public void mo92900xe0093908(java.lang.String str, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f478357o = callback;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        android.content.Context a17 = a();
        if (str == null) {
            str = "";
        }
        ((c61.l7) b6Var).Zi(a17, str, this.f478356n);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "goToMusicChatroom");
        bw5.o50 o50Var = new bw5.o50();
        o50Var.i(categoryId);
        android.app.Activity activity = this.f478350e;
        if (activity != null) {
            qk.f9.a(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), activity, o50Var, null, false, null, 28, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToProfile */
    public void mo92903xd5b9faa6(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.x1(userName, context, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: goToQQMusicPayment */
    public void mo92904x4367e2a4(java.lang.String appId, java.lang.String mid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mid, "mid");
        android.content.Context a17 = a();
        b21.r rVar = new b21.r();
        rVar.f98891t = appId;
        new vk4.a(appId, mid).l().q(new rk4.c6(a17, rVar));
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
        d("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoAppInstallPage */
    public void mo92907x301b9a2c(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String str = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx5aa333606550dfd5", appId) ? "https://y.qq.com/m/download/index.html?channelId=2005000732" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx8dd6ecd81906fd84", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=com.netease.cloudmusic" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx79f2c4418704b4f8", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=com.kugou.android" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxc305711a2a7ad71c", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=cn.kuwo.player" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxf7cc00aea2bdc884", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=com.tencentmusic.venus" : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "gotoAppInstallPage appId: " + appId + ", url: %s", str);
        mo92906x31154900(str, -1L);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoBusinessAccountProfile */
    public void mo92908x1cfae7df(java.lang.String userName, long j17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (userName.length() == 0) {
            return;
        }
        rk4.k5.e("gotoBusinessAccountProfile, userName:" + userName + ", scene:" + j17 + ", sceneNote:" + str, "FlutterTingInteractPlugin");
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.y1(userName, j17, str, context, null), 3, null);
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
        d("webview", ".ui.tools.WebViewUI", putExtra);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderAccountProfile */
    public void mo92910x841b6a85(java.lang.String userName, long j17, long j18, java.lang.String str, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        c(userName, j17, j18, str, j19, false);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderAccountProfileHalfPage */
    public void mo92911x973ebf07(java.lang.String username, long j17, long j18, java.lang.String str, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        c(username, j17, j18, str, j19, true);
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
        rk4.k5.c("gotoFinderDetail tid:" + tid + ", nonceId:" + nonceId + ", needGetRelatedList: " + z17 + ", sessionId: " + sessionId + ", startTime:" + j17, "FlutterTingInteractPlugin");
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.a2(context, tid, nonceId, z17, sessionId, j17, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderFeed */
    public void mo92914xf24c8ca7(java.lang.String tid, java.lang.String nonceId, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tid, "tid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "gotoFinderFeed tid: " + tid + ", nonceId: " + nonceId + ", sessionId: " + sessionId);
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.b2(tid, nonceId, context, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoFinderLive */
    public void mo92915xf24f57f5(java.lang.String tid, java.lang.String nonceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tid, "tid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        android.content.Context context = this.f478350e;
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
            rk4.k5.e("gotoFinderMyProfileAudioTab contactInfo is null", "FlutterTingInteractPlugin");
            return;
        }
        rk4.k5.e("gotoFinderMyProfileAudioTab userName:" + c25010xf04c5f7a.m92760x6c03c64c(), "FlutterTingInteractPlugin");
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.c2(context, c25010xf04c5f7a, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: gotoTingSettingPage */
    public void mo92917x66e1f54e() {
        d("setting", ".ui.setting.SettingsMusicUI", new android.content.Intent());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: hasAddedInFavDB */
    public boolean mo92918xad83114e(java.lang.String sourceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceId, "sourceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        jm4.h5.d(sourceId, new rk4.d2(c0Var));
        return c0Var.f391645d;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: hybridOpenAudioMine */
    public void mo92919x105fad83() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: inPlayer */
    public void mo92920xe4ec6466(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0075 A[RETURN] */
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
            java.lang.String r1 = "FlutterTingInteractPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            int r0 = r7.length()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r3
        L32:
            if (r0 == 0) goto L36
        L34:
            r7 = r3
            goto L61
        L36:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L57
            r0.<init>(r4, r7)     // Catch: java.lang.Throwable -> L57
            android.content.Context r7 = r5.a()     // Catch: java.lang.Throwable -> L57
            java.util.List r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(r7, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L54
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L52
            goto L54
        L52:
            r7 = r3
            goto L55
        L54:
            r7 = r2
        L55:
            r7 = r7 ^ r2
            goto L61
        L57:
            r7 = move-exception
            java.lang.String r0 = "isAppInstalled exception"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r7, r0, r4)
            goto L34
        L61:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "isAppInstalled ret: "
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r7 == 0) goto L76
            return r7
        L76:
            java.lang.Class<lt.i0> r7 = lt.i0.class
            i95.m r7 = i95.n0.c(r7)
            lt.i0 r7 = (lt.i0) r7
            kt.c r7 = (kt.c) r7
            r7.getClass()
            com.tencent.mm.pluginsdk.model.app.m r7 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(r6)
            if (r7 == 0) goto L8c
            java.lang.String r7 = r7.f67386xa1e9e82c
            goto L8d
        L8c:
            r7 = 0
        L8d:
            if (r7 != 0) goto L91
            java.lang.String r7 = ""
        L91:
            java.lang.String r0 = "isAppInstalled packageName: "
            java.lang.String r0 = r0.concat(r7)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            int r0 = r7.length()
            if (r0 <= 0) goto La3
            r0 = r2
            goto La4
        La3:
            r0 = r3
        La4:
            if (r0 == 0) goto Lb1
            android.content.Context r0 = r5.a()
            boolean r7 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(r0, r7)
            if (r7 == 0) goto Lb1
            return r2
        Lb1:
            java.lang.String r7 = "isAppInstalled not install, appId: "
            java.lang.String r6 = r7.concat(r6)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.l3.mo92921x3a4ba4a3(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: launchApplication */
    public void mo92922xbb674b9d(java.lang.String appId, java.lang.String scheme) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scheme, "scheme");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "launchApplication appId: " + appId + ", scheme: " + scheme);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new rk4.e2(), null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FlutterTingInteractPlugin", th6, "launchApplication exception", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: launchApplicationWithUrl */
    public void mo92923x53f5106c(java.lang.String appId, java.lang.String scheme, java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scheme, "scheme");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "launchApplicationWithUrl appId: " + appId + ", scheme: " + scheme);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new rk4.f2(z17, this, appId, url), null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: markPlayTaskInFullScreenPlayerMode */
    public void mo92924x9326978a() {
        rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        k8Var.N(true);
        k8Var.L(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a1 A[RETURN] */
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo63506x9d4787cb(int r24, int r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.l3.mo63506x9d4787cb(int, int, android.content.Intent):boolean");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "onAttachedToActivity");
        this.f478350e = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
        if (this.f478350e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) {
            mo92879x3a6a1204(this.f478360r);
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f428851o);
        rk4.g2 g2Var = new rk4.g2(this, a());
        this.f478355m = g2Var;
        g2Var.enable();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f478349d = p07.m137982x6e669035();
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion.m92973x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25049xf3c6a8f4(m137983x3b5b91dc2, null, 2, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        f478347t = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25036xfb9a55be(m137983x3b5b91dc3, null, 2, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc4 = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc4, "getBinaryMessenger(...)");
        f478348u = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25180x35e58c40(m137983x3b5b91dc4, null, 2, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc5 = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc5, "getBinaryMessenger(...)");
        this.f478354i = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24979xd5d6633e(m137983x3b5b91dc5, null, 2, null);
        ef0.q1 q1Var = (ef0.q1) ((qk.a8) i95.n0.c(qk.a8.class));
        q1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        jk3.d dVar = q1Var.f333836d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).getClass();
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231977x.add(dVar);
        }
        new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(p07.m137983x3b5b91dc(), "ting_ugc_voice_input/event").m138415x95b45268(new rk4.h2(this));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: onCommonHalfScreenGoDetailClick */
    public void mo92925x53b53566(java.lang.String identifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identifier, "identifier");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(identifier, "thumb_like_education")) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = this.f478350e;
            if (context == null) {
                context = a();
            }
            qk.f9.e(aj6, context, bw5.ar0.TingScene_FinderDetailPage, null, 0, null, null, 52, null);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "onDetachedFromActivity");
        this.f478350e = null;
        android.view.OrientationEventListener orientationEventListener = this.f478355m;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f478355m = null;
        zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
        if (c3Var != null) {
            ((yg0.u3) c3Var).wi();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f478350e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41.Companion.m92973x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        ef0.q1 q1Var = (ef0.q1) ((qk.a8) i95.n0.c(qk.a8.class));
        q1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        jk3.d dVar = q1Var.f333836d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).getClass();
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231977x.remove(dVar);
        }
        f478347t = null;
        f478348u = null;
        this.f478354i = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: onPlayerAction */
    public void mo92926x469423f6(byte[] itemData, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        jm4.h5.e(itemData, j17, null);
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
        this.f478350e = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: onTingCommonEvent */
    public void mo92928x8a53f7c2(long j17, java.util.Map map) {
        java.lang.String jSONObject = map != null ? new org.json.JSONObject(map).toString() : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        jm4.h5.f(j17, jSONObject, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: open3rdAppWithTingItem */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo92929xebcce22d(java.lang.String r19, byte[] r20, long r21) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.l3.mo92929xebcce22d(java.lang.String, byte[], long):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openAD */
    public void mo92930xc3c3c3ed(byte[] adSchemeInfo, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adSchemeInfo, "adSchemeInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            bw5.q80 mo11468x92b714fd = new bw5.q80().mo11468x92b714fd(adSchemeInfo);
            km4.l lVar = km4.l.f390829a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            lVar.b(mo11468x92b714fd, j17, callback, a());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "openAD exp=" + e17);
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24973x3635af2e(java.lang.Long.valueOf((long) com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3.ordinal())))));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openByOtherApp */
    public void mo92931x192bc052(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
        bw5.v70 d17 = mo11468x92b714fd.d();
        if (!il4.l.i(d17 != null ? d17.f115722e : 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "openByOtherApp not file type and ignore");
            return;
        }
        java.lang.String m12386x5000ed37 = mo11468x92b714fd.d().i().m12386x5000ed37();
        java.lang.String str = m12386x5000ed37 == null ? "" : m12386x5000ed37;
        bw5.l80 i17 = mo11468x92b714fd.d().i();
        java.lang.String str2 = i17.m12387x6e095e9(3) ? i17.f111218f : "";
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String b17 = mo11468x92b714fd.d().i().b();
        java.lang.String str4 = b17 == null ? "" : b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "openByOtherApp filePath: " + str + ", fileExt: " + str3 + ", title: " + rk4.j5.j(mo11468x92b714fd));
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        android.app.Activity activity = this.f478350e;
        ((ht.a) vVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.l(activity, str, str4, str3, 8, 2);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "gotoLiteApp appId: " + appId + ", liteAppType:" + j17 + ", path: " + path + " query: " + query);
        ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).aj(appId);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(a(), bundle, true, false, new rk4.i2(this));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: openWeApp */
    public void mo92934x5bb32049(java.lang.String appId, java.lang.String path, long j17, java.lang.String sceneNote, boolean z17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneNote, "sceneNote");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.j2(appId, path, j17, sceneNote, z17, j18, this, null), 3, null);
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
        d("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: preloadMiniProgram */
    public void mo92936xbf3d9c64(long j17, long j18) {
        jm4.h5.g(j17, j18, null);
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
        if (this.f478350e == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(itemData);
        cl4.v b17 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        android.app.Activity activity = this.f478350e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        b17.getClass();
        if (mo11468x92b714fd.f112497n == 42) {
            java.lang.String k17 = gm0.j1.b().k();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(k17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(k17);
            java.lang.String c17 = n07 != null ? n07.c() : null;
            bw5.mc0 mc0Var = new bw5.mc0();
            mc0Var.f111699e = q17.d1();
            boolean[] zArr = mc0Var.f111712u;
            zArr[2] = true;
            mc0Var.f111700f = q17.P0();
            zArr[3] = true;
            mc0Var.f111701g = c17;
            zArr[4] = true;
            mo11468x92b714fd.f112515z = mc0Var;
            mo11468x92b714fd.L1[20] = true;
        }
        java.lang.String d17 = b17.d(mo11468x92b714fd);
        if (d17 == null) {
            return;
        }
        oe5.b bVar = new oe5.b();
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(d17);
        bVar.l(cVar);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        cl4.n nVar = new cl4.n(userName, mo11468x92b714fd, d17, activity);
        n13.t tVar = new n13.t();
        tVar.f415666a = nVar;
        n13.a0.V0.getClass();
        tVar.f415668c = n13.y.f415674a;
        ((dk5.y) a0Var).wi(activity, bVar, userName, tVar);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: quickShareTingItem */
    public void mo92939xff3f5333(byte[] tingItemData, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (this.f478350e == null) {
            return;
        }
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
        cl4.v b17 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        android.app.Activity activity = this.f478350e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        b17.getClass();
        java.lang.String g17 = b17.g(mo11468x92b714fd);
        if (g17 == null) {
            return;
        }
        oe5.c cVar = new oe5.c();
        l15.c cVar2 = new l15.c();
        cVar2.m126728xdc93280d(g17);
        cVar.l(cVar2);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        cl4.u uVar = new cl4.u(userName, mo11468x92b714fd, g17, activity);
        n13.t tVar = new n13.t();
        tVar.f415666a = uVar;
        n13.a0.V0.getClass();
        tVar.f415668c = n13.y.f415674a;
        ((dk5.y) a0Var).wi(activity, cVar, userName, tVar);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: saveLocalFile */
    public void mo92940x4125568a(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
        bw5.v70 d17 = mo11468x92b714fd.d();
        if (!il4.l.i(d17 != null ? d17.f115722e : 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "saveLocalFile not file type and ignore");
            return;
        }
        java.lang.String m12386x5000ed37 = mo11468x92b714fd.d().i().m12386x5000ed37();
        if (m12386x5000ed37 == null) {
            m12386x5000ed37 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "saveLocalFile filePath: " + m12386x5000ed37 + ", title: " + rk4.j5.j(mo11468x92b714fd));
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context a17 = a();
        bw5.l80 i17 = mo11468x92b714fd.d().i();
        java.lang.String b17 = i17 != null ? i17.b() : null;
        java.lang.String str = b17 != null ? b17 : "";
        rk4.k2 k2Var = new rk4.k2(this);
        ((yb0.g) b0Var).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(a17, m12386x5000ed37, str, k2Var);
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
        dl4.f fVar = new dl4.f(new rk4.l2(callback), new java.lang.ref.WeakReference(this.f478350e));
        rk4.k5.c("selectPhoto", fVar.f316926c);
        android.app.Activity activity = (android.app.Activity) fVar.f316925b.get();
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.h(activity, 10, intent);
        }
        this.f478352g = fVar;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: sendHandOffOpenCommand */
    public void mo92944x810d70a9(byte[] tingItemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().mo11468x92b714fd(tingItemData).d();
        if (!il4.l.i(d17 != null ? d17.f115722e : 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "sendHandOffOpenCommand not file type");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 t17 = ((d73.i) i95.n0.c(d73.i.class)).t1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "sendHandOffOpenCommand handOffFile: " + t17);
        if (t17 != null) {
            ((d73.i) i95.n0.c(d73.i.class)).f6(t17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "sendHandOffOpenCommand handOffFile null");
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setNavigationBarColor */
    public void mo92945x8ef35546(long j17, yz5.l callback) {
        android.view.Window window;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f478350e;
        boolean z17 = activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            if (!com.p314xaae8f345.mm.ui.b4.c(activity)) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var)));
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 29 && (window = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).getWindow()) != null) {
                window.setNavigationBarContrastEnforced(false);
                new n3.m3(window, window.getDecorView()).b(!com.p314xaae8f345.mm.ui.uk.g((int) j17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNavigationBarColor color=");
            sb6.append(j17);
            sb6.append(", colorHexString=");
            int i17 = (int) j17;
            sb6.append(java.lang.Integer.toHexString(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", sb6.toString());
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo78578x8b18f126(i17);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setOnceOrientation */
    public void mo92946x72067fcd(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d;
        int i17 = (int) j17;
        if (java.lang.Integer.valueOf(i17).equals(0)) {
            rk4.k5.e("setOnceOrientation 0", "FlutterTingInteractPlugin");
            android.app.Activity activity = this.f478350e;
            activityC18699x6096e65d = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) activity : null;
            if (activityC18699x6096e65d != null) {
                activityC18699x6096e65d.setRequestedOrientation(1);
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z;
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z = 1;
            this.f478359q = true;
            this.f478358p = false;
            return;
        }
        if (i17 != 1) {
            rk4.k5.d("setOnceOrientation value error", "FlutterTingInteractPlugin");
            return;
        }
        rk4.k5.e("setOnceOrientation 0", "FlutterTingInteractPlugin");
        android.app.Activity activity2 = this.f478350e;
        activityC18699x6096e65d = activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) activity2 : null;
        if (activityC18699x6096e65d != null) {
            activityC18699x6096e65d.setRequestedOrientation(0);
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.f256152z = 0;
        this.f478358p = true;
        this.f478359q = false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setShowAudioRedDot */
    public void mo92947xb47e766f(boolean z17) {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ri(z17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: setWindowKeepScreenOn */
    public void mo92948x1dfb4622(boolean z17, yz5.l callback) {
        android.app.Activity activity;
        android.view.Window window;
        android.view.Window window2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            if (z17) {
                android.content.Context a17 = a();
                activity = a17 instanceof android.app.Activity ? (android.app.Activity) a17 : null;
                if (activity != null && (window2 = activity.getWindow()) != null) {
                    window2.addFlags(128);
                }
            } else {
                android.content.Context a18 = a();
                activity = a18 instanceof android.app.Activity ? (android.app.Activity) a18 : null;
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.clearFlags(128);
                }
            }
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FlutterTingInteractPlugin", e17, "keepScreenOn", new java.lang.Object[0]);
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareCategoryItem */
    public void mo92949xbd57cab0(byte[] itemData, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "shareCategoryItem shareScene: " + j17);
        android.app.Activity activity = this.f478350e;
        if (activity == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(itemData);
        if (j17 == 1) {
            cl4.v b17 = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            b17.i(activity, mo11468x92b714fd, null);
        } else if (j17 == 2) {
            cl4.v b18 = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            b18.j(activity, mo11468x92b714fd);
        } else if (j17 == 3) {
            cl4.v b19 = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            b19.b(activity, mo11468x92b714fd, 3);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareContent */
    public void mo92950x1fc9b39a(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25177xe9583a5 shareData, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25176x66a813 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareData, "shareData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        android.app.Activity activity = this.f478350e;
        if (activity == null) {
            return;
        }
        if (config.m93111xa121bd03() == com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25179xc7d2b44b.f45149xe25585c4.getRaw()) {
            if (shareData.m93126xd85898e1() != null) {
                byte[] m93126xd85898e1 = shareData.m93126xd85898e1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93126xd85898e1);
                if (m93126xd85898e1.length == 0) {
                    return;
                }
                ((ku5.t0) ku5.t0.f394148d).k(new rk4.m2(config, this, activity, new bw5.lp0().mo11468x92b714fd(shareData.m93126xd85898e1()), shareData), 200L);
                return;
            }
            return;
        }
        if (config.m93111xa121bd03() != com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25179xc7d2b44b.f45147xcfaeedb4.getRaw() || shareData.m93124x3047c7f1() == null) {
            return;
        }
        byte[] m93124x3047c7f1 = shareData.m93124x3047c7f1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93124x3047c7f1);
        if (m93124x3047c7f1.length == 0) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(shareData.m93124x3047c7f1());
        long m93110x82fda3e3 = config.m93110x82fda3e3();
        if (m93110x82fda3e3 == 1) {
            cl4.v b17 = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            b17.i(activity, mo11468x92b714fd, config);
        } else if (m93110x82fda3e3 == 2) {
            cl4.v b18 = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            b18.j(activity, mo11468x92b714fd);
        } else if (m93110x82fda3e3 == 3) {
            cl4.v b19 = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            b19.b(activity, mo11468x92b714fd, 3);
        }
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
        android.app.Activity activity = this.f478350e;
        if (activity == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(categoryItemData);
        cl4.v b17 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        b17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareHelper", "shareChatRoomToChat categoryId: " + mo11468x92b714fd.c() + ", categoryType: " + mo11468x92b714fd.f112497n);
        java.lang.String e17 = b17.e(activity, mo11468x92b714fd, null);
        if (e17 == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_content", e17);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, 1006);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareTingChatRoomForward */
    public void mo92953x56145bc5(byte[] categoryItemData, byte[] bArr, long j17, java.lang.String str, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItemData, "categoryItemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "shareTingChatRoomForward " + str);
        android.app.Activity activity = this.f478350e;
        if (activity == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(categoryItemData);
        bw5.v70 mo11468x92b714fd2 = new bw5.v70().mo11468x92b714fd(bArr);
        cl4.v b17 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        b17.getClass();
        if (str == null) {
            return;
        }
        android.content.Context baseContext = activity.getBaseContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseContext, "getBaseContext(...)");
        java.lang.String e17 = b17.e(baseContext, mo11468x92b714fd, mo11468x92b714fd2);
        if (e17 == null) {
            return;
        }
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        cl4.t tVar = new cl4.t(str, e17, activity);
        ((r35.k1) q1Var).getClass();
        r35.i1 i1Var = new r35.i1(activity);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(e17);
        il4.b bVar = (il4.b) v17.y(il4.b.class);
        if (bVar != null) {
            android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.enx, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 c18737x1ba35fc6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6) inflate.findViewById(com.p314xaae8f345.mm.R.id.vfa);
            c18737x1ba35fc6.m72286xefe20a96(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
            java.lang.String title = v17.f430187f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(title, "title");
            c18737x1ba35fc6.c(il4.d.d(activity, title, bVar.f373633f, bVar.f373634g));
            i1Var.c(inflate);
            i1Var.h(false);
        }
        i1Var.l(str);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.h(false);
        i1Var.j(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
        i1Var.a(tVar);
        i1Var.f450669c.show();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: shareTingItem */
    public void mo92954x81378020(byte[] tingItemData, byte[] bArr, byte[] bArr2, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItemData, "tingItemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterTingInteractPlugin", "shareTingItem shareScene: " + j17);
        bw5.lp0 mo11468x92b714fd = new bw5.lp0().mo11468x92b714fd(tingItemData);
        android.app.Activity activity = this.f478350e;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).k(new rk4.o2(j17, this, activity, mo11468x92b714fd, bArr), 200L);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showAudioRedDot */
    public boolean mo92955x99460b31() {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        rk4.p2 p2Var = new rk4.p2(c0Var);
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        p2Var.mo146xb9724478(java.lang.Boolean.valueOf(em4.b.f336745a));
        return c0Var.f391645d;
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
        android.app.Activity activity = this.f478350e;
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
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.r2(config, this, context, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showSessionSelectViewAndGetInfo */
    public void mo92959x2b768667(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.content.Context context = this.f478350e;
        if (context == null) {
            context = a();
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.t2(this, context, callback, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: showSharePreConfirmView */
    public void mo92960x6a3d2a64(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238 contactInfo, byte[] categoryItemData, byte[] listenItemData, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactInfo, "contactInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItemData, "categoryItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItemData, "listenItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f478350e;
        if (activity == null) {
            return;
        }
        bw5.o50 mo11468x92b714fd = new bw5.o50().mo11468x92b714fd(categoryItemData);
        bw5.v70 mo11468x92b714fd2 = new bw5.v70().mo11468x92b714fd(listenItemData);
        cl4.v b17 = b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
        java.lang.String e17 = b17.e(activity, mo11468x92b714fd, mo11468x92b714fd2);
        if (e17 == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
            return;
        }
        oe5.a aVar = new oe5.a();
        e15.k kVar = new e15.k();
        kVar.m126728xdc93280d(e17);
        aVar.k(kVar);
        n13.t tVar = new n13.t();
        tVar.f415667b = new rk4.v2(e17, contactInfo, this, callback);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new rk4.u2(activity, aVar, contactInfo, tVar, null), 3, null);
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
        d75.b.g(new rk4.a3(j17, j18, this, callback, this.f478354i));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: startRecordWithConfiguration */
    public void mo92963x76ed0abd(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24982xdc19259d configuration, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        d75.b.g(new rk4.f3(configuration, this, callback, this.f478354i));
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
        d75.b.g(new rk4.h3(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: stopVoiceInput */
    public void mo92967x1f63bf5a() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: updateCurrentMultiTaskId */
    public void mo92968x3e83cd89(java.lang.String str, boolean z17) {
        ia0.n nVar = (ia0.n) i95.n0.c(ia0.n.class);
        android.content.Context context = this.f478350e;
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
        java.lang.String m92582xfb83cc9b = localPhotoResult.m92582xfb83cc9b();
        if (m92582xfb83cc9b == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25195x977068c5(-1L, "empty image path", null, 4, null))));
            return;
        }
        dl4.j jVar = new dl4.j(new rk4.j3(callback));
        rk4.k5.e("uploadImage path:".concat(m92582xfb83cc9b), jVar.f316952b);
        dn.m mVar = new dn.m();
        mVar.f69592xf1ebe47b = 20303;
        mVar.f69580x454032b6 = com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd;
        mVar.f323322h = 3;
        mVar.f69601xaca5bdda = m92582xfb83cc9b;
        mVar.f69595x6d25b0d9 = com.p314xaae8f345.mm.vfs.w6.i(m92582xfb83cc9b, false);
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        v65.i.c(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ImageUploadTask", null, 0, 6, null), null, new dl4.i(aj6 != null ? aj6.e7(mVar) : null, jVar, null), 1, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25062x20c2ce41
    /* renamed from: uploadRecordFileToCdn */
    public void mo92971x1f921204(java.lang.String localFilePath, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localFilePath, "localFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        jm4.h5.h(localFilePath, new rk4.k3(callback));
    }
}

package lx;

/* loaded from: classes8.dex */
public final class r1 implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403460d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23149x178594ad f403461e;

    /* renamed from: f, reason: collision with root package name */
    public eq1.u f403462f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081 f403463g;

    public final boolean a() {
        if (ih.a.b("clicfg_feed_request_with_poi_preload_n_cache_android", 0) == 0) {
            return false;
        }
        boolean i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("__flutter_biz_mmkv__").i(gm0.j1.b().j() + "_biz_wesee_location_auth_dialog_showed", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchBizPOIInfoWhenEnter return for not showed: ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", sb6.toString());
        return mo85070xcda092b8() <= 0 || mo85069x2ccac7a6() >= 1 || i17 || ih.a.b("clicfg_biz_disable_k1k_location_auth_dialog_android", 0) == 0;
    }

    public final void b(yz5.l lVar) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync");
            android.content.Context context = this.f403460d;
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync no system permission");
                pm0.v.X(new lx.a1(lVar));
                return;
            }
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308700r)) {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new lx.e1(this, lVar, null), 2, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync no business permission");
                pm0.v.X(new lx.b1(lVar));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoAsync outer fail e:%s", e17.getMessage());
            pm0.v.X(new lx.f1(lVar));
        }
    }

    public final void c() {
        if (a()) {
            long mo85069x2ccac7a6 = mo85069x2ccac7a6();
            long mo85070xcda092b8 = mo85070xcda092b8();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "fetchBizPOIInfoWhenEnter");
            b(new lx.h1(this, mo85069x2ccac7a6, mo85070xcda092b8));
        }
    }

    public final void d(yz5.l lVar) {
        android.app.Activity activity = this.f403460d;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "activity is null");
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f308700r;
        if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "already has business location permission");
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Bi(activity, g0Var, f0Var, new lx.m1(this, lVar))) {
            return;
        }
        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: getBizPOIInfo */
    public void mo85065xd6a7d97b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        b(new lx.i1(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: getCacheLocationInfo */
    public void mo85066x9f1cedef(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!i95.n0.h(u60.g.class)) {
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new lx.k1(this, callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: getUserLocation */
    public com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081 mo85067xa47c8716() {
        long mo85069x2ccac7a6 = mo85069x2ccac7a6();
        long mo85070xcda092b8 = mo85070xcda092b8();
        com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081 c23259xb2dc8081 = this.f403463g;
        return c23259xb2dc8081 == null ? new com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), "", java.lang.Long.valueOf(mo85069x2ccac7a6), java.lang.Long.valueOf(mo85070xcda092b8)) : c23259xb2dc8081;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: gotoSystemLocationSettings */
    public void mo85068x50cd648a(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.content.Context context = this.f403460d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + context.getPackageName()));
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, true, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizLocationPlugin", "gotoSystemLocationSettings", "(Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizLocationPlugin", "gotoSystemLocationSettings", "(Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlutterBizLocationPlugin", e17, "gotoSystemLocationSettings startActivity failed", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizLocationPlugin", "gotoSystemLocationSettings intent not available");
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: isOpenK1kLocation */
    public long mo85069x2ccac7a6() {
        return ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308700r) ? 1L : 0L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: isOpenSystemLocation */
    public long mo85070xcda092b8() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f403460d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        ((sb0.f) jVar).getClass();
        return j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true) ? 1L : 0L;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: isUnderFreqControl */
    public void mo85071x93dc9b17(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("__flutter_biz_mmkv__").q(gm0.j1.b().j() + "_biz_wesee_last_fetch_poi_time_ms", 0L);
        boolean z17 = q17 <= 0 || (currentTimeMillis > q17 && currentTimeMillis - q17 >= 3600000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "isUnderFreqControl now=" + currentTimeMillis + " last=" + q17 + " delta=" + (currentTimeMillis > q17 ? currentTimeMillis - q17 : 0L) + " canFetch=" + z17);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: markLastGetPOITime */
    public void mo85072x2648f64(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("__flutter_biz_mmkv__").B(gm0.j1.b().j() + "_biz_wesee_last_fetch_poi_time_ms", currentTimeMillis);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markLastGetPOITime now=");
        sb6.append(currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", sb6.toString());
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403460d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        com.p314xaae8f345.p2845xc516c4b6.biz.C23149x178594ad c23149x178594ad;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion.m85076x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f403461e = new com.p314xaae8f345.p2845xc516c4b6.biz.C23149x178594ad(m137983x3b5b91dc2, null, 2, null);
        this.f403462f = new eq1.u();
        com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081 c23259xb2dc8081 = this.f403463g;
        if (c23259xb2dc8081 == null || (c23149x178594ad = this.f403461e) == null) {
            return;
        }
        c23149x178594ad.m85090x3171ce6e(c23259xb2dc8081, java.lang.System.currentTimeMillis(), lx.l1.f403378d);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403460d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403460d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion.m85076x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f403461e = null;
        eq1.u uVar = this.f403462f;
        if (uVar != null) {
            uVar.a();
        }
        this.f403462f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403460d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: requestLocationAuth */
    public void mo85073xd9edf72c(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f403460d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity activity = this.f403460d;
        ((sb0.f) jVar).getClass();
        if (j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", true)) {
            d(new lx.n1(callback));
            return;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "missing system location permission");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732
    /* renamed from: requestLocationWithSystemAuth */
    public void mo85074x2d79e661(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f403460d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        } else {
            lx.q1 q1Var = new lx.q1(callback, this);
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(this.f403460d, "android.permission.ACCESS_FINE_LOCATION", 155, "", "", q1Var)) {
                d(new lx.o1(callback));
            }
        }
    }
}

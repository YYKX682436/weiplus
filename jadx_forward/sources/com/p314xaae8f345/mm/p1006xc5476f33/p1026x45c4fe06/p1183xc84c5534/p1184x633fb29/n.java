package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public abstract class n {
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 config, java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onNewIntent", scene) ? 100 : 0;
        java.lang.String appId = config.f158811d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k(appId, config.f158814g);
        kVar.f169543d = i17;
        kVar.f169542c.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1774, kVar.f169543d + 0, 1));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        kVar.b(java.lang.System.currentTimeMillis() - config.I);
        kVar.a();
        if (kz5.z.F(tg1.n.f500676g, config.f128802b2.f169323f) || kz5.z.F(tg1.n.f500677h, config.f128802b2.f169323f)) {
            try {
                java.lang.String queryParameter = android.net.Uri.parse(config.f158816i).getQueryParameter("scancode_time");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(queryParameter);
                long parseLong = java.lang.Long.parseLong(queryParameter) * 1000;
                long b17 = c01.id.b();
                if (parseLong <= 0 || b17 <= 0) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIInvalidIntentTraceReport", "reportOnRuntimeLoad, appId:" + config.f158811d + ", appScene:" + config.f128802b2.f169323f + ", uiScene:" + scene + ", scanCodeTime:" + parseLong + ", serverSyncTime:" + b17);
                java.lang.String appId2 = config.f158811d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId2, "appId");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k kVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k(appId2, config.f158814g);
                kVar2.f169543d = i17 + 20;
                kVar2.f169542c.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1774, kVar2.f169543d + 0, 1));
                long j17 = b17 - parseLong;
                kVar2.b(j17);
                kVar2.a();
                long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_appbrand_ban_open_scancode_time_expired_span, 3600000L);
                if (Ui > 0 && j17 > Ui) {
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.a();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static final void b() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMainProcessName(...)");
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(str, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.m.f169594d, null);
    }
}

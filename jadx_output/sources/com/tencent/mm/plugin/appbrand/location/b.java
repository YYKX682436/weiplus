package com.tencent.mm.plugin.appbrand.location;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f85511a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f85512b = new java.lang.Object();

    public static boolean a(java.lang.String str) {
        synchronized (f85512b) {
            java.util.HashMap hashMap = f85511a;
            if (!hashMap.containsKey(str)) {
                return false;
            }
            return ((java.lang.Boolean) hashMap.get(str)).booleanValue();
        }
    }

    public static void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "notifyRemoteProcessReport appId:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "notify runtime");
        com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData appBrandLocationReport$LocationInfoData = new com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData();
        appBrandLocationReport$LocationInfoData.f85488d = com.tencent.mm.plugin.appbrand.location.a.f85500b;
        appBrandLocationReport$LocationInfoData.f85489e = com.tencent.mm.plugin.appbrand.location.a.f85501c;
        appBrandLocationReport$LocationInfoData.f85490f = com.tencent.mm.plugin.appbrand.location.a.f85502d;
        appBrandLocationReport$LocationInfoData.f85491g = com.tencent.mm.plugin.appbrand.location.a.f85504f;
        appBrandLocationReport$LocationInfoData.f85492h = com.tencent.mm.plugin.appbrand.location.a.f85503e;
        appBrandLocationReport$LocationInfoData.f85493i = com.tencent.mm.plugin.appbrand.location.a.f85505g;
        appBrandLocationReport$LocationInfoData.f85494m = com.tencent.mm.plugin.appbrand.location.a.f85506h;
        appBrandLocationReport$LocationInfoData.f85495n = com.tencent.mm.plugin.appbrand.location.a.f85507i;
        appBrandLocationReport$LocationInfoData.f85496o = com.tencent.mm.plugin.appbrand.location.a.f85508j;
        appBrandLocationReport$LocationInfoData.f85497p = com.tencent.mm.plugin.appbrand.location.a.f85509k;
        appBrandLocationReport$LocationInfoData.f85498q = true;
        com.tencent.mm.plugin.appbrand.ipc.m0.b(str, appBrandLocationReport$LocationInfoData);
    }

    public static void c(com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData appBrandLocationReport$LocationInfoData, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "reportLocationInfo appId:%s, username:%s, scene:%d, longitude:%f, latitude:%f, locType:%d, accuracy:%f, altitude:%f, sessionId:%s", appBrandLocationReport$LocationInfoData.f85488d, appBrandLocationReport$LocationInfoData.f85489e, java.lang.Integer.valueOf(appBrandLocationReport$LocationInfoData.f85490f), java.lang.Double.valueOf(appBrandLocationReport$LocationInfoData.f85492h), java.lang.Double.valueOf(appBrandLocationReport$LocationInfoData.f85491g), java.lang.Integer.valueOf(appBrandLocationReport$LocationInfoData.f85493i), java.lang.Double.valueOf(appBrandLocationReport$LocationInfoData.f85495n), java.lang.Double.valueOf(appBrandLocationReport$LocationInfoData.f85496o), str);
        com.tencent.mm.autogen.mmdata.rpt.WechatAppLaunchLocationStruct wechatAppLaunchLocationStruct = new com.tencent.mm.autogen.mmdata.rpt.WechatAppLaunchLocationStruct();
        wechatAppLaunchLocationStruct.f62966e = wechatAppLaunchLocationStruct.b("appid", appBrandLocationReport$LocationInfoData.f85488d, true);
        wechatAppLaunchLocationStruct.f62967f = appBrandLocationReport$LocationInfoData.f85490f;
        wechatAppLaunchLocationStruct.f62969h = wechatAppLaunchLocationStruct.b("latitude", "" + appBrandLocationReport$LocationInfoData.f85491g, true);
        wechatAppLaunchLocationStruct.f62968g = wechatAppLaunchLocationStruct.b("longitude", "" + appBrandLocationReport$LocationInfoData.f85492h, true);
        wechatAppLaunchLocationStruct.f62970i = wechatAppLaunchLocationStruct.b("accuracy", "" + appBrandLocationReport$LocationInfoData.f85495n, true);
        wechatAppLaunchLocationStruct.f62972k = wechatAppLaunchLocationStruct.b("altitude", "" + appBrandLocationReport$LocationInfoData.f85496o, true);
        wechatAppLaunchLocationStruct.f62971j = wechatAppLaunchLocationStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, "" + appBrandLocationReport$LocationInfoData.f85494m, true);
        wechatAppLaunchLocationStruct.f62965d = wechatAppLaunchLocationStruct.b("sessionid", str, true);
        wechatAppLaunchLocationStruct.f62973l = wechatAppLaunchLocationStruct.b("verticalAccuracy", "", true);
        wechatAppLaunchLocationStruct.f62974m = wechatAppLaunchLocationStruct.b("horizontalAccuracy", "", true);
        wechatAppLaunchLocationStruct.f62975n = appBrandLocationReport$LocationInfoData.f85497p;
        wechatAppLaunchLocationStruct.k();
    }

    public static void d(final java.lang.String str, int i17, final java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "requestReportLocation appId:%s, scene:%d, sessionId:%s", str, java.lang.Integer.valueOf(i17), str2);
        if (i17 == 1012 || i17 == 1013 || i17 == 1011 || i17 == 1048 || i17 == 1047 || i17 == 1049 || i17 == 1050 || i17 == 1104 || i17 == 1271 || i17 == 1089) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.location.d.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.appbrand.location.b$$a
                @Override // com.tencent.mm.ipcinvoker.r
                public final void a(java.lang.Object obj) {
                    com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData appBrandLocationReport$LocationInfoData = (com.tencent.mm.plugin.appbrand.location.AppBrandLocationReport$LocationInfoData) obj;
                    java.lang.String str3 = str;
                    boolean a17 = com.tencent.mm.plugin.appbrand.location.b.a(str3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "isReported:%b, canReport:%b", java.lang.Boolean.valueOf(a17), java.lang.Boolean.valueOf(appBrandLocationReport$LocationInfoData.f85498q));
                    if (!appBrandLocationReport$LocationInfoData.f85498q || a17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "not need report location");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationReport", "report location");
                    synchronized (com.tencent.mm.plugin.appbrand.location.b.f85512b) {
                        com.tencent.mm.plugin.appbrand.location.b.f85511a.put(str3, java.lang.Boolean.TRUE);
                    }
                    com.tencent.mm.plugin.appbrand.location.b.c(appBrandLocationReport$LocationInfoData, str2);
                }
            });
        }
    }
}

package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static long f76836a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.n f76837b = new com.tencent.mm.plugin.appbrand.launching.n();

    public static void a(java.util.Map map, com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var) {
        if (map == null || map.isEmpty() || u1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataInternal, no starAppMap or no callback");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            r45.yc ycVar = new r45.yc();
            ycVar.f390955d = (java.lang.String) entry.getKey();
            ycVar.f390959h = (java.lang.String) entry.getValue();
            ycVar.f390956e = 1;
            if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class) != null) {
                com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel = ((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).get(ycVar.f390955d);
                if (appBrandBackgroundFetchDataTokenParcel == null || com.tencent.mm.sdk.platformtools.t8.K0(appBrandBackgroundFetchDataTokenParcel.f76796e)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataInternal, app(%s) token is empty", ycVar.f390955d);
                } else {
                    ycVar.f390958g = appBrandBackgroundFetchDataTokenParcel.f76796e;
                }
            }
            linkedList.add(ycVar);
        }
        b(1, linkedList, null, u1Var);
    }

    public static void b(int i17, java.util.List list, com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var, com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var) {
        if (list == null || list.isEmpty() || u1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, requestList or callback is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, size:%d", java.lang.Integer.valueOf(list.size()));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.cd7 cd7Var = new r45.cd7();
        cd7Var.f371491d.addAll(list);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1733;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/fetchdata";
        lVar.f70664a = cd7Var;
        lVar.f70665b = new r45.dd7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.appbrand.backgroundfetch.f(i17, o0Var, currentTimeMillis, u1Var, cd7Var));
    }

    public static boolean c(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting;
        if (appBrandInitConfigWC != null && (wxaAttributes$WxaDynamicInfo$Setting = appBrandInitConfigWC.R) != null) {
            if (wxaAttributes$WxaDynamicInfo$Setting.f77428z && wxaAttributes$WxaDynamicInfo$Setting.A) {
                if (com.tencent.mm.plugin.appbrand.o6.f86162n3 || !i81.j.a(appBrandInitConfigWC)) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPreFetchWithLocation, app(%s_v%d) is ad, can not pre fetch data with location");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPreFetchWithLocation, app(%s_v%d) can not pre fetch data with location", appBrandInitConfigWC.f47278x, java.lang.Integer.valueOf(appBrandInitConfigWC.f77281g));
        }
        return false;
    }

    public static nm5.b d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = null;
        } else {
            int lastIndexOf = str.lastIndexOf(63);
            if (lastIndexOf > 0) {
                java.lang.String substring = str.substring(0, lastIndexOf);
                r1 = lastIndexOf < str.length() + (-1) ? str.substring(lastIndexOf + 1) : null;
                str = substring;
            }
        }
        return nm5.j.c(str, r1);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, com.tencent.mm.plugin.appbrand.backgroundfetch.g gVar, com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var, com.tencent.mm.plugin.appbrand.backgroundfetch.u1 u1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, app(%s) pre fetch data start, path:%s, query:%s, scene:%d", str2, str3, str4, java.lang.Integer.valueOf(i17));
        r45.yc ycVar = new r45.yc();
        ycVar.f390959h = str;
        ycVar.f390955d = str2;
        ycVar.f390956e = 0;
        r45.lb5 lb5Var = new r45.lb5();
        ycVar.f390957f = lb5Var;
        lb5Var.set(2, java.lang.Integer.valueOf(i17));
        k91.v5 n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str2, new java.lang.String[0]);
        java.lang.String str6 = (n17 == null || n17.w0() == null) ? "" : n17.w0().f77445e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "customVersionOfRun:%s, custom_version:%s", str5, str6);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            str5 = str6 == null ? "" : str6;
        }
        ycVar.f390957f.set(3, str5);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "appid:%s, custom_version:%s", str, str5);
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class) != null) {
            com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel = ((com.tencent.mm.plugin.appbrand.backgroundfetch.t1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.t1.class)).get(str2);
            if (appBrandBackgroundFetchDataTokenParcel == null || com.tencent.mm.sdk.platformtools.t8.K0(appBrandBackgroundFetchDataTokenParcel.f76796e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, token is empty, appid:%s", str);
            } else {
                ycVar.f390958g = appBrandBackgroundFetchDataTokenParcel.f76796e;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            ycVar.f390957f.set(0, str3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            ycVar.f390957f.set(1, str4);
        }
        if (gVar != null) {
            o0Var.f76874j = 1;
            ycVar.f390957f.set(4, java.lang.Double.valueOf(gVar.f76834a));
            ycVar.f390957f.set(5, java.lang.Double.valueOf(gVar.f76835b));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, longitude:%f, latitude:%f", java.lang.Float.valueOf(gVar.f76834a), java.lang.Float.valueOf(gVar.f76835b));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ycVar);
        b(0, linkedList, o0Var, u1Var);
    }
}

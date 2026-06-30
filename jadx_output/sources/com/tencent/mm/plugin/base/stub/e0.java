package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public abstract class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Intent f93732b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f93731a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f93733c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static int f93734d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f93735e = {-1};

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.app.s2 f93736f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f93737g = false;

    /* renamed from: h, reason: collision with root package name */
    public static long f93738h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f93739i = true;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String[] f93740j = {"sdk_openAppProfile", "sdk_openFeedback", "sdk_openGrowthCare", com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.p.NAME};

    /* renamed from: k, reason: collision with root package name */
    public static final kk.j f93741k = new kk.l(50);

    public static void a(android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(268435456);
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", o25.z.f342593a);
        intent.putExtra("showShare", false);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
        if (activity != null) {
            activity.finish();
        }
    }

    public static void b(boolean z17, int i17) {
        if (i17 == 1 || i17 == 2) {
            q(z17 ? 11 : 12);
        } else if (i17 == 3) {
            q(z17 ? 14 : 15);
        }
    }

    public static boolean c(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "bizPublishWithImage, context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str2 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str2, false);
            r2 = str2;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "bizPublishWithImage, packageName = %s, sig = %s", r2, str);
        if (strArr == null || strArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "bizPublishWithImage, args is null");
            return false;
        }
        java.lang.String str3 = strArr[0];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "bizPublishWithImage, appId is null");
            return false;
        }
        java.lang.String str4 = strArr[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "bizPublishWithImage, req is null");
            return false;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "weixin://dl/bizPublish/shareImages/?appid=%s", str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "bizPublishWithImage, req = %s", str4);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.addFlags(268435456);
        intent.setData(android.net.Uri.parse(format));
        intent.putExtra("key_package_name", r2);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_app_id", str3);
        intent.putExtra("key_command_id", 44);
        intent.putExtra("key_req", str4);
        t(intent, context);
        return true;
    }

    public static boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(str2);
        sb6.append(str3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            java.lang.String[] split = str4.split("\\?");
            if (split.length > 0) {
                sb6.append(split[0]);
            }
        }
        java.lang.String sb7 = sb6.toString();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object obj = f93741k;
        if (((com.tencent.mm.sdk.platformtools.r2) obj).m(sb7)) {
            long longValue = currentTimeMillis - ((java.lang.Long) ((com.tencent.mm.sdk.platformtools.r2) obj).get(sb7)).longValue();
            if (longValue < j17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WXBizLogic", "checkIfCanPreloadMiniProgram cannot preload, key:%s, interval duration:%d , intervalDuration:%d", sb7, java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j17));
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "checkIfCanPreloadMiniProgram can preload, key:%s, currentTimeMillis:%d , intervalDuration:%d", sb7, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
        ((com.tencent.mm.sdk.platformtools.r2) obj).put(sb7, java.lang.Long.valueOf(currentTimeMillis));
        return true;
    }

    public static void e() {
        if (f93736f == null) {
            com.tencent.mm.plugin.base.stub.c0 c0Var = new com.tencent.mm.plugin.base.stub.c0();
            f93736f = c0Var;
            c0Var.alive();
        }
        if (f93732b != null && gm0.j1.a() && l()) {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.base.stub.d0(), 50L);
        }
    }

    public static android.database.MatrixCursor f(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, int i19, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "doMiniProgramTranslateLink:packageName or signature null");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.y7 y7Var = new r45.y7();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "doMiniProgramTranslateLink package name = %s, cgiType=%d", str2, java.lang.Integer.valueOf(i19));
        y7Var.f390832e = str2;
        y7Var.f390831d = str3;
        linkedList.add(y7Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yp6();
        lVar.f70665b = new r45.zp6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/translatelink";
        lVar.f70667d = 1200;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.yp6 yp6Var = (r45.yp6) a17.f70710a.f70684a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(1 == i19 ? "&preload=1" : "");
        yp6Var.f391276d = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(yp6Var.f391276d);
        sb7.append(2 == i19 ? "&jsForReport=1" : "");
        yp6Var.f391276d = sb7.toString();
        yp6Var.f391277e = i17;
        yp6Var.f391279g = linkedList;
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(new java.lang.String[]{"downloadUrl", "fileMd5", "expireTime", "extraBytes"});
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.plugin.base.stub.w(i19, str, i17, str2, str3, i18, z17, matrixCursor, countDownLatch), false);
        if (z17) {
            try {
                countDownLatch.await(10L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", e17.getMessage());
            }
        }
        if (z17) {
            return matrixCursor;
        }
        return null;
    }

    public static boolean g() {
        int[] iArr = f93735e;
        if (-1 == iArr[0]) {
            synchronized (iArr) {
                if (-1 == iArr[0]) {
                    iArr[0] = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_opensdk_start_wxbizentry_after_launcher_ui, 0);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "ensureStartLauncherUIBeforeWXBizEntry %d", java.lang.Integer.valueOf(iArr[0]));
        return iArr[0] == 1;
    }

    public static boolean h(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "finderBind context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str2 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str2, false);
            r2 = str2;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderBind packageName = %s, sig = %s", r2, str);
        if (strArr == null || strArr.length < 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "findBind args is null or params num is not enough");
            return false;
        }
        java.lang.String u17 = u46.l.u(strArr[0]);
        if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "finderBind appId is null");
            return false;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "weixin://dl/channels/bind/?appid=%s", u17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderBind uri:%s", format);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.setData(android.net.Uri.parse(format));
        intent.addFlags(268435456);
        intent.putExtra("key_app_id", u17);
        intent.putExtra("key_package_name", r2);
        intent.putExtra("translate_link_scene", 1);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_command_id", 42);
        t(intent, context);
        return true;
    }

    public static boolean i(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "";
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str4 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str4, false);
            r4 = str4;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderOpenFeed packageName = %s, sig = %s", r4, str);
        if (strArr == null || strArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        java.lang.String str5 = strArr[0];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        java.lang.String str6 = strArr[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "username isEmpty");
            return false;
        }
        java.lang.String str7 = strArr[2];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "eventId isEmpty");
            return false;
        }
        if (strArr.length > 3) {
            java.lang.String str8 = strArr[3];
        }
        try {
            str2 = java.net.URLEncoder.encode(str6, com.tencent.mapsdk.internal.rv.f51270c);
            try {
                str3 = java.net.URLEncoder.encode(str7, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e17) {
                e = e17;
                com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", e.getMessage());
                java.lang.String format = java.lang.String.format("%s?appid=%s&username=%s&eventId=%s", "weixin://dl/channels/openEvent/", str5, str2, str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, username = %s, eventId = %s", str5, str6, str7);
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
                intent.setData(android.net.Uri.parse(format));
                intent.addFlags(268435456);
                intent.putExtra("key_app_id", str5);
                intent.putExtra("key_package_name", r4);
                intent.putExtra("translate_link_scene", 1);
                intent.putExtra("key_package_signature", str);
                intent.putExtra("key_command_id", 41);
                t(intent, context);
                return true;
            }
        } catch (java.io.UnsupportedEncodingException e18) {
            e = e18;
            str2 = "";
        }
        java.lang.String format2 = java.lang.String.format("%s?appid=%s&username=%s&eventId=%s", "weixin://dl/channels/openEvent/", str5, str2, str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, username = %s, eventId = %s", str5, str6, str7);
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent2.setData(android.net.Uri.parse(format2));
        intent2.addFlags(268435456);
        intent2.putExtra("key_app_id", str5);
        intent2.putExtra("key_package_name", r4);
        intent2.putExtra("translate_link_scene", 1);
        intent2.putExtra("key_package_signature", str);
        intent2.putExtra("key_command_id", 41);
        t(intent2, context);
        return true;
    }

    public static boolean j(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        java.lang.String str2;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str3 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str3, false);
            r3 = str3;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderOpenFeed packageName = %s, sig = %s", r3, str);
        if (strArr == null || strArr.length < 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        java.lang.String str4 = strArr[0];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        java.lang.String str5 = strArr[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "feedID isEmpty");
            return false;
        }
        java.lang.String str6 = strArr[2];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "nonceID isEmpty");
            return false;
        }
        java.lang.String str7 = "";
        java.lang.String str8 = strArr.length > 3 ? strArr[3] : "";
        boolean equals = str8.equals("true");
        try {
            str2 = java.net.URLEncoder.encode(str5, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException e17) {
            e = e17;
            str2 = "";
        }
        try {
            str7 = java.net.URLEncoder.encode(str6, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXBizLogic", e, "", new java.lang.Object[0]);
            java.lang.String format = java.lang.String.format("weixin://dl/channels/feed/?appid=%s&feedID=%s&nonceID=%s&nonGetRelatedList=%d", str4, str2, str7, java.lang.Integer.valueOf(equals ? 1 : 0));
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, feedID = %s, nonceID = %s, nonGetRelatedList", str4, str5, str6, str8);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
            intent.setData(android.net.Uri.parse(format));
            intent.addFlags(268435456);
            intent.putExtra("key_app_id", str4);
            intent.putExtra("key_package_name", r3);
            intent.putExtra("translate_link_scene", 1);
            intent.putExtra("key_package_signature", str);
            intent.putExtra("key_command_id", 36);
            t(intent, context);
            return true;
        }
        java.lang.String format2 = java.lang.String.format("weixin://dl/channels/feed/?appid=%s&feedID=%s&nonceID=%s&nonGetRelatedList=%d", str4, str2, str7, java.lang.Integer.valueOf(equals ? 1 : 0));
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, feedID = %s, nonceID = %s, nonGetRelatedList", str4, str5, str6, str8);
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent2.setData(android.net.Uri.parse(format2));
        intent2.addFlags(268435456);
        intent2.putExtra("key_app_id", str4);
        intent2.putExtra("key_package_name", r3);
        intent2.putExtra("translate_link_scene", 1);
        intent2.putExtra("key_package_signature", str);
        intent2.putExtra("key_command_id", 36);
        t(intent2, context);
        return true;
    }

    public static boolean k(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        java.lang.String str2;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str3 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str3, false);
            r2 = str3;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderStartLive packageName = %s, sig = %s", r2, str);
        if (strArr == null || strArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "args is null or params num is not enough");
            return false;
        }
        java.lang.String str4 = strArr[0];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        java.lang.String str5 = strArr[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "liveJsonInfo isEmpty");
            return false;
        }
        java.lang.String str6 = "";
        if (strArr.length > 2) {
            str2 = strArr[2];
            if (gm0.j1.a()) {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                com.tencent.mm.pluginsdk.model.app.w.j(str4, true, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "openid = %s", str2);
        } else {
            str2 = "";
        }
        try {
            str6 = java.net.URLEncoder.encode(str5, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", e17.getMessage());
        }
        java.lang.String format = java.lang.String.format("weixin://dl/channels/startLive/?appid=%s&liveInfoData=%s&openId=%s", str4, str6, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "finderOpenFeed: appid = %s, encodeLiveInfo = %s, openId = %s", str4, str6, str2);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.setData(android.net.Uri.parse(format));
        intent.addFlags(268435456);
        intent.putExtra("key_app_id", str4);
        intent.putExtra("key_package_name", r2);
        intent.putExtra("translate_link_scene", 1);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_command_id", 39);
        t(intent, context);
        return true;
    }

    public static boolean l() {
        int i17 = f93734d;
        if (i17 != -1) {
            return i17 == 1;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return false;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_jump_biz_entry_retry, 1);
        f93734d = Ni;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "reTryOpenWXBizEntry open %d", java.lang.Integer.valueOf(Ni));
        return f93734d == 1;
    }

    public static synchronized boolean m(android.content.Intent intent) {
        boolean contains;
        synchronized (com.tencent.mm.plugin.base.stub.e0.class) {
            long longExtra = intent.getLongExtra("__BIZ_ENTRY_ENTER_ID", 0L);
            contains = ((java.util.HashSet) f93733c).contains(java.lang.Long.valueOf(longExtra));
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry isInConsumedSet %d, ret:%b", java.lang.Long.valueOf(longExtra), java.lang.Boolean.valueOf(contains));
        }
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.database.MatrixCursor n(android.content.Context r22, java.lang.String[] r23, java.lang.String[] r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.e0.n(android.content.Context, java.lang.String[], java.lang.String[], boolean, boolean, boolean, boolean):android.database.MatrixCursor");
    }

    public static boolean o(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str2 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str2, false);
            r2 = str2;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "openCustomerServiceChat packageName = %s, sig = %s", r2, str);
        if (strArr == null || strArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        java.lang.String str3 = strArr[0];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "appId is null");
            return false;
        }
        java.lang.String str4 = strArr[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "corpId is null");
            return false;
        }
        java.lang.String str5 = strArr[2];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "url is null");
            return false;
        }
        java.lang.String format = java.lang.String.format("weixin://dl/customerService/?appid=%s&corpid=%s&kfurl=%s", str3, str4, java.net.URLEncoder.encode(str5));
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "openCustomerServiceChat uri: %s", format);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.setData(android.net.Uri.parse(format));
        intent.addFlags(268435456);
        intent.putExtra("key_app_id", str3);
        intent.putExtra("key_package_name", r2);
        intent.putExtra("translate_link_scene", 1);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_command_id", 37);
        t(intent, context);
        return true;
    }

    public static boolean p(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "openQRCodePay context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str2 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str2, false);
            r2 = str2;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "openQRCodePay packageName = %s, sig = %s", r2, str);
        if (strArr == null || strArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "args is null");
            return false;
        }
        java.lang.String str3 = strArr[0];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "openQRCodePay appId is null");
            return false;
        }
        java.lang.String str4 = strArr[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "openQRCodePay codeContent is null");
            return false;
        }
        java.lang.String str5 = strArr[2];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "extraMsg is null");
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("key_app_id", str3);
        intent.putExtra("key_package_name", r2);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_command_id", 38);
        intent.putExtra("key_qr_code_pay_code_centent", str4);
        intent.putExtra("key_qr_code_pay_extra_msg", str5);
        t(intent, context);
        return true;
    }

    public static void q(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1194L, i17, 1L, false);
    }

    public static void r(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1674L, i17, 1L, false);
    }

    public static void s(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1405, i17);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0063: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:30:0x0063 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[Catch: Exception -> 0x00b8, all -> 0x013e, TRY_ENTER, TryCatch #2 {Exception -> 0x00b8, blocks: (B:12:0x000d, B:14:0x0014, B:21:0x0049, B:32:0x0066, B:33:0x006d, B:37:0x006e, B:39:0x008b, B:40:0x00a5), top: B:11:0x000d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[Catch: Exception -> 0x00b8, all -> 0x013e, TryCatch #2 {Exception -> 0x00b8, blocks: (B:12:0x000d, B:14:0x0014, B:21:0x0049, B:32:0x0066, B:33:0x006d, B:37:0x006e, B:39:0x008b, B:40:0x00a5), top: B:11:0x000d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: Exception -> 0x00b8, all -> 0x013e, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b8, blocks: (B:12:0x000d, B:14:0x0014, B:21:0x0049, B:32:0x0066, B:33:0x006d, B:37:0x006e, B:39:0x008b, B:40:0x00a5), top: B:11:0x000d, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void t(android.content.Intent r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.e0.t(android.content.Intent, android.content.Context):void");
    }

    public static synchronized void u(android.content.Intent intent) {
        synchronized (com.tencent.mm.plugin.base.stub.e0.class) {
            if (l()) {
                q(31);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry saveWXBizEntryIntent enterId=%d", java.lang.Long.valueOf(currentTimeMillis));
                intent.putExtra("__BIZ_ENTRY_ENTER_ID", currentTimeMillis);
                f93732b = intent;
                if (f93736f == null) {
                    com.tencent.mm.plugin.base.stub.c0 c0Var = new com.tencent.mm.plugin.base.stub.c0();
                    f93736f = c0Var;
                    c0Var.alive();
                }
            }
        }
    }

    public static void v(android.content.Context context, com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Req req, java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Resp(android.os.Bundle.EMPTY);
        resp.invokeTicket = req.invokeTicket;
        resp.callbackActivity = req.callbackActivity;
        resp.errCode = i17;
        resp.errStr = str2;
        android.os.Bundle bundle = new android.os.Bundle();
        resp.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.opensdk.channel.MMessageActV2.send(context, args);
        if (context instanceof com.tencent.mm.plugin.base.stub.WXBizEntryActivity) {
            ((com.tencent.mm.plugin.base.stub.WXBizEntryActivity) context).finish();
        }
    }

    public static boolean w(android.content.Context context, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.lang.String str;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "startGetA8Key, context is null");
            return false;
        }
        if (strArr2 == null || strArr2.length <= 0) {
            str = null;
        } else {
            java.lang.String str2 = strArr2[0];
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str2, false);
            r2 = str2;
            str = a17 != null ? kk.k.g(a17[0].toByteArray()) : null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "startGetA8Key, packageName = %s, sig = %s", r2, str);
        if (strArr == null || strArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "startGetA8Key, args is null");
            return false;
        }
        java.lang.String str3 = strArr[0];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "startGetA8Key, appId is null");
            return false;
        }
        java.lang.String str4 = strArr[1];
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXBizLogic", "startGetA8Key, url is null");
            return false;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "weixin://dl/opensdkGeta8Key/?appid=%s&authUrl=%s", str3, java.net.URLEncoder.encode(str4));
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "startGetA8Key, uri = %s", format);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.base.stub.WXBizEntryActivity.class);
        intent.addFlags(268435456);
        intent.setData(android.net.Uri.parse(format));
        intent.putExtra("key_package_name", r2);
        intent.putExtra("key_package_signature", str);
        intent.putExtra("key_app_id", str3);
        intent.putExtra("key_command_id", 43);
        intent.putExtra("key_url", str4);
        t(intent, context);
        return true;
    }

    public static void x() {
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_opensdk_content_provider_use_getcallingpackage, 1);
            f93739i = Ni != 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "updateGetCallingPackageStatus config: %d, %b", java.lang.Integer.valueOf(Ni), java.lang.Boolean.valueOf(f93739i));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXBizLogic", e17, "updateGetCallingPackageStatus exception", new java.lang.Object[0]);
            f93739i = true;
        }
    }
}

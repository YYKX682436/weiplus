package com.tencent.mm.plugin.base.stub;

/* loaded from: classes15.dex */
public class WXCommProvider extends android.content.ContentProvider {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f93668g = com.tencent.mm.sdk.platformtools.x2.f193072b + "_comm_preferences";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f93669h;

    /* renamed from: i, reason: collision with root package name */
    public static final android.content.UriMatcher f93670i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f93671m;

    /* renamed from: d, reason: collision with root package name */
    public final android.database.MatrixCursor f93672d = new android.database.MatrixCursor(new java.lang.String[0]);

    /* renamed from: e, reason: collision with root package name */
    public android.content.SharedPreferences f93673e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f93674f;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + ".sdk.comm.provider";
        f93669h = new java.lang.String[]{com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA};
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f93670i = uriMatcher;
        uriMatcher.addURI(str, "pref", 1);
        uriMatcher.addURI(str, "openQRCodeScan", 18);
        uriMatcher.addURI(str, "batchAddShortcut", 19);
        uriMatcher.addURI(str, "getUnreadCount", 20);
        uriMatcher.addURI(str, "jumpToBizProfile", 21);
        uriMatcher.addURI(str, "jumpToBizTempSession", 27);
        uriMatcher.addURI(str, "registerMsgListener", 22);
        uriMatcher.addURI(str, "getAvatar", 23);
        uriMatcher.addURI(str, "regWatchAppId", 24);
        uriMatcher.addURI(str, "decodeVoice", 25);
        uriMatcher.addURI(str, "addCardToWX", 26);
        uriMatcher.addURI(str, "unReadMsgs", 9);
        uriMatcher.addURI(str, "to_chatting", 3);
        uriMatcher.addURI(str, "setReaded", 13);
        uriMatcher.addURI(str, "voiceControl", 29);
        uriMatcher.addURI(str, "openRankList", 28);
        uriMatcher.addURI(str, "openWebview", 30);
        uriMatcher.addURI(str, "openBusiLuckyMoney", 31);
        uriMatcher.addURI(str, "createChatroom", 32);
        uriMatcher.addURI(str, "joinChatroom", 33);
        uriMatcher.addURI(str, "sendSight", 34);
        uriMatcher.addURI(str, "redirectToChattingByPhoneNumber", 35);
        uriMatcher.addURI(str, "redirectToWechatOutByPhoneNumber", 36);
        uriMatcher.addURI(str, qf1.j.NAME, 37);
        uriMatcher.addURI(str, qf1.e.NAME, 38);
        uriMatcher.addURI(str, "chooseCardFromWX", 39);
        uriMatcher.addURI(str, "openOfflinePay", 42);
        uriMatcher.addURI(str, "setWechatSportStep", 40);
        uriMatcher.addURI(str, "getWechatSportConfig", 41);
        uriMatcher.addURI(str, "handleScanResult", 44);
        uriMatcher.addURI(str, "openTypeWebview", 45);
        uriMatcher.addURI(str, "openCleanUI", 46);
        uriMatcher.addURI(str, "launchWXMiniprogram", 47);
        uriMatcher.addURI(str, "preloadWXMiniprogram", 57);
        uriMatcher.addURI(str, "preloadWXMiniprogramEnvironment", 62);
        uriMatcher.addURI(str, com.tencent.mm.plugin.appbrand.jsapi.fakenative.h.NAME, 53);
        uriMatcher.addURI(str, "genTokenForOpenSdk", 43);
        uriMatcher.addURI(str, "qrcodeEvent", 48);
        uriMatcher.addURI(str, com.tencent.mm.plugin.appbrand.jsapi.u6.NAME, 49);
        uriMatcher.addURI(str, "openBusinessWebview", 50);
        uriMatcher.addURI(str, "getWxaInfo", 51);
        uriMatcher.addURI(str, "openWxaDesktopOrWxaMyFavorite", 52);
        uriMatcher.addURI(str, "openWxaListPage", 56);
        uriMatcher.addURI(str, "getSimpleWxaInfo", 54);
        uriMatcher.addURI(str, "launchWXMiniprogramWithToken", 55);
        uriMatcher.addURI(str, com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.URI_PATH, 58);
        uriMatcher.addURI(str, "checkSupportWxaOpenAPI", 59);
        uriMatcher.addURI(str, "getWCProbeWaid", 60);
        uriMatcher.addURI(str, "checkIfSupportWxaSDKFeature", 61);
        uriMatcher.addURI(str, "finderShareVideo", 63);
        uriMatcher.addURI(str, "finderOpenProfile", 64);
        uriMatcher.addURI(str, "finderOpenLive", 65);
        uriMatcher.addURI(str, "finderOpenFeed", 66);
        uriMatcher.addURI(str, "checkFacialRecognitionVerifyCapability", 67);
        uriMatcher.addURI(str, "openCustomerServiceChat", 68);
        uriMatcher.addURI(str, "QRCodePay", 69);
        uriMatcher.addURI(str, "finderOpenEvent", 70);
        uriMatcher.addURI(str, "finderStartLive", 71);
        uriMatcher.addURI(str, "finderBind", 72);
        uriMatcher.addURI(str, "getA8Key", 73);
        uriMatcher.addURI(str, "bizPublishWithImage", 74);
        f93671m = false;
    }

    public boolean a(boolean z17) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "checkIsLogin()");
            if (!f93671m && !((java.lang.Boolean) new com.tencent.mm.plugin.base.stub.k0(this, 4000L, java.lang.Boolean.FALSE, true).a(this.f93674f)).booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "checkIsLogin !syncTaskRet");
                f93671m = false;
                return false;
            }
            if (gm0.j1.a() && c01.d9.h() && !gm0.m.r()) {
                f93671m = true;
            } else {
                f93671m = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "hasLogin = " + f93671m);
            return f93671m;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WXCommProvider", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXCommProvider", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0631  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor b(android.net.Uri r31, java.lang.String[] r32, java.lang.String r33, java.lang.String[] r34, java.lang.String r35, int r36, java.lang.String[] r37) {
        /*
            Method dump skipped, instructions count: 3140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXCommProvider.b(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, int, java.lang.String[]):android.database.Cursor");
    }

    public final java.lang.String[] c(android.net.Uri uri, java.lang.String[] strArr) {
        try {
            com.tencent.mm.plugin.base.stub.e0.x();
            if (com.tencent.mm.plugin.base.stub.e0.f93739i) {
                java.lang.String callingPackage = getCallingPackage();
                com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "getCallingPackage %s", callingPackage);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(callingPackage)) {
                    return new java.lang.String[]{callingPackage};
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "reportGetCallingPackageNull");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1194L, 50L, 1L);
            }
            int callingUid = android.os.Binder.getCallingUid();
            java.lang.String[] packagesForUid = getContext().getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(callingUid);
            objArr[1] = java.lang.Integer.valueOf(packagesForUid == null ? 0 : packagesForUid.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "getCallingPackages, callingUid = %d, packages size = %d", objArr);
            if (packagesForUid != null && packagesForUid.length > 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "reportGetPackagesForUidMoreThanOne");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1194L, 51L, 1L);
            }
            if (packagesForUid == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WXCommProvider", "getCallingPackages fail, packages is null");
                return new java.lang.String[0];
            }
            for (java.lang.String str : packagesForUid) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "getCallingPackages = %s", str);
            }
            if (packagesForUid.length <= 1 || strArr == null || strArr.length <= 0) {
                return packagesForUid;
            }
            try {
                return d(f(uri, strArr), packagesForUid);
            } catch (java.lang.Exception e17) {
                e = e17;
                com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "getCallingPackages, ex = %s", e.getMessage());
                return new java.lang.String[0];
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public final java.lang.String[] d(java.lang.String str, java.lang.String[] strArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "getTargetPackageByAppId appId invalid");
            return strArr;
        }
        java.lang.String str2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "getPackageNameByAppId appId invalid");
        } else {
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
            if (h17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "getPackageNameByAppId appInfo is null");
            } else {
                str2 = h17.field_packageName;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "getCallingPackages, getPackageNameByAppId return null");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1194L, 52L, 1L);
        } else {
            int length = strArr.length;
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                if (str2.equals(strArr[i17])) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "getTargetPackageByAppId match: %s", str2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1194L, 55L, 1L);
                return new java.lang.String[]{str2};
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "getTargetPackageByAppId not match: %s", str2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1194L, 54L, 1L);
        }
        return strArr;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        if (uri != null) {
            return ((java.lang.Integer) new com.tencent.mm.plugin.base.stub.i0(this, 2000L, 0, uri, f93670i.match(uri), c(uri, strArr)).a(this.f93674f)).intValue();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "delete fail, uri is null");
        return 0;
    }

    public final void e(com.tencent.mm.pluginsdk.model.app.y5 y5Var) {
        if (y5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "hy: try to start to login failed: null model");
            return;
        }
        ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.y5.f189160h = y5Var;
        com.tencent.mm.pluginsdk.model.app.y5.f189161i = java.lang.System.currentTimeMillis();
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginUI.class);
        intent.addFlags(268435456);
        android.content.Context context = getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/WXCommProvider", "startToLoginWithQueryAction", "(Lcom/tencent/mm/pluginsdk/model/app/WxProviderQueryStubModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/base/stub/WXCommProvider", "startToLoginWithQueryAction", "(Lcom/tencent/mm/pluginsdk/model/app/WxProviderQueryStubModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final java.lang.String f(android.net.Uri uri, java.lang.String[] strArr) {
        java.lang.String queryParameter = uri.getQueryParameter("appid");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            queryParameter = uri.getQueryParameter("appId");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter) && strArr != null && strArr.length > 1) {
            queryParameter = strArr[0];
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter) || !queryParameter.startsWith("wx")) {
            return null;
        }
        return queryParameter;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f93674f = new com.tencent.mm.sdk.platformtools.n3();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "pid = " + android.os.Process.myPid() + ", tid : = " + android.os.Process.myTid());
        this.f93673e = getContext().getSharedPreferences(f93668g, 0);
        b4.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a).b(new com.tencent.mm.plugin.base.stub.f0(this), new android.content.IntentFilter(com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_REFRESH_WXAPP));
        return this.f93673e != null;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "uri:%s", uri);
        if (uri == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "query fail, uri is null return null");
            return null;
        }
        int match = f93670i.match(uri);
        if (!gm0.j1.i().f273208a.f273299d) {
            com.tencent.mm.plugin.base.stub.o0 o0Var = new com.tencent.mm.plugin.base.stub.o0(null);
            new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.base.stub.n0(o0Var), true).c(50L, 50L);
            try {
                synchronized (o0Var.f93779a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WXCommProvider", "Lock to wait for the first initialize of the Application.");
                    while (!o0Var.f93780b) {
                        o0Var.f93779a.wait();
                    }
                    o0Var.f93780b = false;
                }
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "the lock may have some problem," + e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXCommProvider", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.String[] c17 = c(uri, strArr2);
        if (c17 != null && c17.length > 0) {
            return b(uri, strArr, str, strArr2, str2, match, c17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "CallingPackages is null return null");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

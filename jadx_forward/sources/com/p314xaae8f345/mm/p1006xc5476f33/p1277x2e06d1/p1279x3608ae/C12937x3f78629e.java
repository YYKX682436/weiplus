package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider */
/* loaded from: classes15.dex */
public class C12937x3f78629e extends android.content.ContentProvider {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f175201g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "_comm_preferences";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f175202h;

    /* renamed from: i, reason: collision with root package name */
    public static final android.content.UriMatcher f175203i;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f175204m;

    /* renamed from: d, reason: collision with root package name */
    public final android.database.MatrixCursor f175205d = new android.database.MatrixCursor(new java.lang.String[0]);

    /* renamed from: e, reason: collision with root package name */
    public android.content.SharedPreferences f175206e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f175207f;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".sdk.comm.provider";
        f175202h = new java.lang.String[]{com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306};
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        f175203i = uriMatcher;
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
        uriMatcher.addURI(str, qf1.j.f76480x24728b, 37);
        uriMatcher.addURI(str, qf1.e.f76474x24728b, 38);
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
        uriMatcher.addURI(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h.f34168x24728b, 53);
        uriMatcher.addURI(str, "genTokenForOpenSdk", 43);
        uriMatcher.addURI(str, "qrcodeEvent", 48);
        uriMatcher.addURI(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6.f34901x24728b, 49);
        uriMatcher.addURI(str, "openBusinessWebview", 50);
        uriMatcher.addURI(str, "getWxaInfo", 51);
        uriMatcher.addURI(str, "openWxaDesktopOrWxaMyFavorite", 52);
        uriMatcher.addURI(str, "openWxaListPage", 56);
        uriMatcher.addURI(str, "getSimpleWxaInfo", 54);
        uriMatcher.addURI(str, "launchWXMiniprogramWithToken", 55);
        uriMatcher.addURI(str, com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.f32985xf174bb38, 58);
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
        f175204m = false;
    }

    public boolean a(boolean z17) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "checkIsLogin()");
            if (!f175204m && !((java.lang.Boolean) new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.k0(this, 4000L, java.lang.Boolean.FALSE, true).a(this.f175207f)).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "checkIsLogin !syncTaskRet");
                f175204m = false;
                return false;
            }
            if (gm0.j1.a() && c01.d9.h() && !gm0.m.r()) {
                f175204m = true;
            } else {
                f175204m = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "hasLogin = " + f175204m);
            return f175204m;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXCommProvider", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WXCommProvider", e17, "", new java.lang.Object[0]);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e.b(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, int, java.lang.String[]):android.database.Cursor");
    }

    public final java.lang.String[] c(android.net.Uri uri, java.lang.String[] strArr) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.x();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175272i) {
                java.lang.String callingPackage = getCallingPackage();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "getCallingPackage %s", callingPackage);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(callingPackage)) {
                    return new java.lang.String[]{callingPackage};
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "reportGetCallingPackageNull");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1194L, 50L, 1L);
            }
            int callingUid = android.os.Binder.getCallingUid();
            java.lang.String[] packagesForUid = getContext().getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(callingUid);
            objArr[1] = java.lang.Integer.valueOf(packagesForUid == null ? 0 : packagesForUid.length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "getCallingPackages, callingUid = %d, packages size = %d", objArr);
            if (packagesForUid != null && packagesForUid.length > 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "reportGetPackagesForUidMoreThanOne");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1194L, 51L, 1L);
            }
            if (packagesForUid == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXCommProvider", "getCallingPackages fail, packages is null");
                return new java.lang.String[0];
            }
            for (java.lang.String str : packagesForUid) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "getCallingPackages = %s", str);
            }
            if (packagesForUid.length <= 1 || strArr == null || strArr.length <= 0) {
                return packagesForUid;
            }
            try {
                return d(f(uri, strArr), packagesForUid);
            } catch (java.lang.Exception e17) {
                e = e17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "getCallingPackages, ex = %s", e.getMessage());
                return new java.lang.String[0];
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public final java.lang.String[] d(java.lang.String str, java.lang.String[] strArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "getTargetPackageByAppId appId invalid");
            return strArr;
        }
        java.lang.String str2 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "getPackageNameByAppId appId invalid");
        } else {
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
            if (h17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "getPackageNameByAppId appInfo is null");
            } else {
                str2 = h17.f67386xa1e9e82c;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "getCallingPackages, getPackageNameByAppId return null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1194L, 52L, 1L);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "getTargetPackageByAppId match: %s", str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1194L, 55L, 1L);
                return new java.lang.String[]{str2};
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "getTargetPackageByAppId not match: %s", str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1194L, 54L, 1L);
        }
        return strArr;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        if (uri != null) {
            return ((java.lang.Integer) new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.i0(this, 2000L, 0, uri, f175203i.match(uri), c(uri, strArr)).a(this.f175207f)).intValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "delete fail, uri is null");
        return 0;
    }

    public final void e(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5 y5Var) {
        if (y5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "hy: try to start to login failed: null model");
            return;
        }
        ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270693h = y5Var;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y5.f270694i = java.lang.System.currentTimeMillis();
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.class);
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
            queryParameter = uri.getQueryParameter("appId");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter) && strArr != null && strArr.length > 1) {
            queryParameter = strArr[0];
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter) || !queryParameter.startsWith("wx")) {
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
        this.f175207f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "pid = " + android.os.Process.myPid() + ", tid : = " + android.os.Process.myTid());
        this.f175206e = getContext().getSharedPreferences(f175201g, 0);
        b4.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).b(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.f0(this), new android.content.IntentFilter(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32759x8d5572b3));
        return this.f175206e != null;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "uri:%s", uri);
        if (uri == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "query fail, uri is null return null");
            return null;
        }
        int match = f175203i.match(uri);
        if (!gm0.j1.i().f354741a.f354832d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.o0(null);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.n0(o0Var), true).c(50L, 50L);
            try {
                synchronized (o0Var.f175312a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXCommProvider", "Lock to wait for the first initialize of the Application.");
                    while (!o0Var.f175313b) {
                        o0Var.f175312a.wait();
                    }
                    o0Var.f175313b = false;
                }
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "the lock may have some problem," + e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WXCommProvider", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.String[] c17 = c(uri, strArr2);
        if (c17 != null && c17.length > 0) {
            return b(uri, strArr, str, strArr2, str2, match, c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "CallingPackages is null return null");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

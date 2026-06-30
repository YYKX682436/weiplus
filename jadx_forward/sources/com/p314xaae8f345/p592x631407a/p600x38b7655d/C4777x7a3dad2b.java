package com.p314xaae8f345.p592x631407a.p600x38b7655d;

/* renamed from: com.tencent.midas.control.APMidasPayHelper */
/* loaded from: classes13.dex */
public class C4777x7a3dad2b implements com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00.Receiver {

    /* renamed from: MED_DISTRIBUTE_CALL */
    public static java.lang.String f20393x35cc569 = "openMidasCall";

    /* renamed from: MED_DISTRIBUTE_CALL2 */
    public static java.lang.String f20394x683be7e9 = "openMidasCall2";

    /* renamed from: MED_DISTRIBUTE_CALLBACK_FROM_MIDAS_PAY */
    public static final java.lang.String f20395xdd271b1d = "callbackFromMidasPay";

    /* renamed from: MED_DISTRIBUTE_DIRECT_PAY */
    public static java.lang.String f20396xf6ec75fd = "openMidasDirectPay";

    /* renamed from: MED_DISTRIBUTE_H5PAY */
    public static java.lang.String f20397x687cf6d0 = "openMidasH5Pay";

    /* renamed from: MED_DISTRIBUTE_HANDLE_QQ_WALLET_INTENT */
    public static java.lang.String f20398x8486e20f = "handleQQWalletIntent";

    /* renamed from: MED_DISTRIBUTE_HANDLE_WX_INTENT */
    public static java.lang.String f20399x855732ee = "handleWXIntent";

    /* renamed from: MED_DISTRIBUTE_HF_COUPONS_ROLLBACK */
    public static final java.lang.String f20400x5f88acac = "hfCouponsRollBack";

    /* renamed from: MED_DISTRIBUTE_INFO */
    public static java.lang.String f20401x35fafb9 = "openMidasInfo";

    /* renamed from: MED_DISTRIBUTE_INIT */
    public static java.lang.String f20402x35fb01b = "golbalInit";

    /* renamed from: MED_DISTRIBUTE_LongConnection */
    public static java.lang.String f20403x5e5c43e5 = "setLongConnection";

    /* renamed from: MED_DISTRIBUTE_NET */
    public static java.lang.String f20404xef97cd12 = "openMidasNet";

    /* renamed from: MED_DISTRIBUTE_PAY */
    public static java.lang.String f20405xef97d41d = "openMidasPay";

    /* renamed from: MED_DISTRIBUTE_PYA_SCORE_CONTRACT */
    public static java.lang.String f20406xcdca4bd1 = "openMidasPayScoreContract";

    /* renamed from: MED_DISTRIBUTE_RECEIVE */
    public static java.lang.String f20407x68b0cbd8 = "receiveMidas";

    /* renamed from: MED_DISTRIBUTE_RELEASE */
    public static java.lang.String f20408x692f80fc = "release";

    /* renamed from: MED_DISTRIBUTE_SIGN_PAY */
    public static java.lang.String f20409xf03ee891 = "openMidasSignPay";

    /* renamed from: MED_DISTRIBUTE_WEB */
    public static java.lang.String f20410xef97eec9 = "openMidasWeb";

    /* renamed from: MED_DISTRIBUTE_WECHATPAY */
    public static java.lang.String f20411xe9b07777 = "openMidasWechatPay";

    /* renamed from: MED_DISTRIBUTE_WX_MINIPROGRAM */
    public static final java.lang.String f20412x5740af1a = "launchWXMiniProgram";

    /* renamed from: MED_DISTRIBUTE_WX_MINIPROGRAM_ONRESPONSE */
    public static final java.lang.String f20413xc395d165 = "launchWXMiniProgram_OnResponse";

    /* renamed from: MED_DISTRIBUTE_XGAME_CONSUME */
    public static final java.lang.String f20414xee33863c = "consumeAsync";

    /* renamed from: MED_DISTRIBUTE_XGAME_QUERY */
    public static final java.lang.String f20415x823a3708 = "queryInventoryAsync";

    /* renamed from: MIDAS_INNER_WEBVIEW */
    public static int f20416x9faba3ab = 0;

    /* renamed from: MIDAS_OUT_WEBVIEW */
    public static int f20417xb2708363 = 1;

    /* renamed from: MIDAS_PLUGIN_NAME */
    public static java.lang.String f20418xb441bfb2 = "MidasPay";

    /* renamed from: MIDAS_PLUGIN_VERSION */
    public static final java.lang.String f20419x5d95f631 = "1.9.9m";

    /* renamed from: MIDAS_WEBVIEW */
    public static int f20420x94fcbcf4 = 0;

    /* renamed from: PKG_DISTRIBUTE */
    public static java.lang.String f20421x9d792e54 = "com.tencent.midas.pay.APMidasDistribute";

    /* renamed from: PLUGIN_INITFAIL */
    public static final int f20422x9dd9dbba = 2;

    /* renamed from: PLUGIN_INITIDLE */
    private static final int f20423x9ddb4470 = -1;

    /* renamed from: PLUGIN_INITING */
    public static final int f20424x3ee60ba6 = 0;

    /* renamed from: PLUGIN_INITSUCC */
    public static final int f20425x9de00ede = 1;

    /* renamed from: RET_CHANGE_H5 */
    private static final int f20426xf7fb519e = -100011;

    /* renamed from: RET_MSG_CHANGE_H5 */
    private static final java.lang.String f20427x1b8cc140 = "needChangeH5";
    private static final java.lang.String TAG = "APMidasPayHelper";

    /* renamed from: cutoutEnable */
    public static boolean f20428xef62766f = false;
    private static java.lang.String env = "release";

    /* renamed from: hasCheckedProcess */
    public static boolean f20430xb9131602 = false;

    /* renamed from: initCount */
    private static int f20431xef17a5df = 0;

    /* renamed from: initRequest */
    private static com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 f20433x8ffd535f = null;

    /* renamed from: initState */
    public static int f20434xeffb1961 = -1;

    /* renamed from: isInitSucc */
    private static boolean f20435xe0b782bc = false;

    /* renamed from: isNeedLocalUpdate */
    private static boolean f20436xbdafff14 = false;

    /* renamed from: isNewProcess */
    public static boolean f20437x926af579 = false;

    /* renamed from: isPayCenterSDK */
    public static boolean f20438x62193627 = false;

    /* renamed from: logCallbackClassName */
    private static java.lang.String f20440x212ba67a = "";

    /* renamed from: logEnable */
    private static boolean f20441x5c1d31e7 = false;

    /* renamed from: midasCallBack */
    public static com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab f20442x3161eff = null;

    /* renamed from: midasSoCallback */
    public static com.p314xaae8f345.p592x631407a.api.InterfaceC4734x6cdbbf52 f20443x55b0c2db = null;

    /* renamed from: netCallBack */
    public static com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 f20444x83c8b522 = null;

    /* renamed from: netCallBack_ReqType */
    private static java.lang.String f20445x8062eebb = "";

    /* renamed from: remotRecevier */
    private static com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00 f20446x93559f14;

    /* renamed from: requestObject */
    public static com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 f20447x4bd21aae;

    /* renamed from: sIWebView */
    public static com.p314xaae8f345.p592x631407a.api.InterfaceC4732x70d4bec1 f20448xe618f103;

    /* renamed from: staticActivityContext */
    public static android.content.Context f20449xb6a9b52;

    /* renamed from: webview */
    public static android.webkit.WebView f20450x48fb3bf9;

    /* renamed from: x5Webview */
    public static com.tencent.smtt.sdk.WebView f20451xade6267c;

    /* renamed from: _hellAccFlag_ */
    private byte f20452x7f11beae;

    /* renamed from: initObject */
    private static java.lang.Object f20432x79ae86f = new java.lang.Object();

    /* renamed from: dexloadObject */
    private static java.lang.Object f20429xeac7231c = new java.lang.Object();

    /* renamed from: loadingObject */
    private static java.lang.Object f20439x147f939b = new java.lang.Object();

    /* renamed from: saveType */
    public int f20454x8476be57 = 0;

    /* renamed from: screenType */
    public int f20455xe71fadc6 = 0;

    /* renamed from: retobj */
    java.lang.Object f20453xc84e24b6 = null;

    /* renamed from: access$508 */
    public static /* synthetic */ int m41761xbbd78dbd() {
        int i17 = f20431xef17a5df;
        f20431xef17a5df = i17 + 1;
        return i17;
    }

    /* renamed from: getJSContent */
    public static synchronized java.lang.String m41768xadb4c05a(android.content.Context context) {
        java.lang.String str;
        synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.class) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "getJSContent");
            m41772x316510(context, null);
            str = (java.lang.String) new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41800xfd6078cb(context, "getH5JS", new java.lang.Object[]{context});
        }
        return str;
    }

    /* renamed from: getLogCallbackClassName */
    public static java.lang.String m41769xcef762f0() {
        return f20440x212ba67a;
    }

    /* renamed from: h5Init */
    public static synchronized void m41770xb485b77d(final android.app.Activity activity, android.webkit.WebView webView, com.tencent.smtt.sdk.WebView webView2) {
        synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.class) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5Init");
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41940xebbf4a4d(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20601x9fac62f0, "");
            f20451xade6267c = webView2;
            f20450x48fb3bf9 = webView;
            f20437x926af579 = m41775x926af579(activity);
            if (f20431xef17a5df < 1) {
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42172x41012807();
                m41785xe9103abc(activity, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, new com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed() { // from class: com.tencent.midas.control.APMidasPayHelper.4
                    @Override // com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed
                    /* renamed from: result */
                    public void mo41814xc84dc81d(int i17, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "init ret:" + i17 + " msg:" + str);
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
                        if (i17 == 0) {
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
                            android.app.Activity activity2 = activity;
                            java.lang.String str3 = (java.lang.String) c4777x7a3dad2b.m41797x2e7a5e(activity2, "getH5JS", new java.lang.Object[]{activity2});
                            if (!android.text.TextUtils.isEmpty(str3)) {
                                try {
                                    android.webkit.WebView webView3 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20450x48fb3bf9;
                                    if (webView3 != null) {
                                        webView3.loadUrl("javascript:" + str3);
                                    }
                                    com.tencent.smtt.sdk.WebView webView4 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20451xade6267c;
                                    if (webView4 != null) {
                                        webView4.loadUrl("javascript:" + str3);
                                    }
                                    com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41940xebbf4a4d(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20602xfdbe6d62, "");
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "h5Init loadJS error:" + e17.toString());
                                }
                            }
                            boolean unused = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20435xe0b782bc = true;
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41761xbbd78dbd();
                        }
                    }
                });
            } else {
                java.lang.String str = (java.lang.String) new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41797x2e7a5e(activity, "getH5JS", new java.lang.Object[]{activity});
                if (!android.text.TextUtils.isEmpty(str)) {
                    try {
                        if (f20450x48fb3bf9 != null) {
                            webView.loadUrl("javascript:" + str);
                        }
                        com.tencent.smtt.sdk.WebView webView3 = f20451xade6267c;
                        if (webView3 != null) {
                            webView3.loadUrl("javascript:" + str);
                        }
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41940xebbf4a4d(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20602xfdbe6d62, "");
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "h5Init loadJS error:" + e17.toString());
                    }
                }
            }
        }
    }

    /* renamed from: h5InitUnifier */
    public static synchronized void m41771x1dffab63(final android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.InterfaceC4732x70d4bec1 interfaceC4732x70d4bec1) {
        synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.class) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5InitUnifier");
            f20448xe618f103 = interfaceC4732x70d4bec1;
            f20437x926af579 = m41775x926af579(activity);
            if (f20431xef17a5df < 1) {
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42172x41012807();
                m41785xe9103abc(activity, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, new com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed() { // from class: com.tencent.midas.control.APMidasPayHelper.3
                    @Override // com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed
                    /* renamed from: result */
                    public void mo41814xc84dc81d(int i17, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "h5InitUnifier ret:" + i17 + " msg:" + str);
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
                        if (i17 == 0) {
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
                            android.app.Activity activity2 = activity;
                            java.lang.String str3 = (java.lang.String) c4777x7a3dad2b.m41797x2e7a5e(activity2, "getH5JS", new java.lang.Object[]{activity2});
                            if (!android.text.TextUtils.isEmpty(str3)) {
                                try {
                                    com.p314xaae8f345.p592x631407a.api.InterfaceC4732x70d4bec1 interfaceC4732x70d4bec12 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20448xe618f103;
                                    if (interfaceC4732x70d4bec12 != null) {
                                        interfaceC4732x70d4bec12.m41421x141096a9("javascript:" + str3);
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "h5InitUnifier loadJS error:" + e17.toString());
                                }
                            }
                            boolean unused = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20435xe0b782bc = true;
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41761xbbd78dbd();
                        }
                    }
                });
            } else {
                java.lang.String str = (java.lang.String) new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41797x2e7a5e(activity, "getH5JS", new java.lang.Object[]{activity});
                if (!android.text.TextUtils.isEmpty(str)) {
                    try {
                        com.p314xaae8f345.p592x631407a.api.InterfaceC4732x70d4bec1 interfaceC4732x70d4bec12 = f20448xe618f103;
                        if (interfaceC4732x70d4bec12 != null) {
                            interfaceC4732x70d4bec12.m41421x141096a9("javascript:" + str);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "h5InitUnifier loadJS error:" + e17.toString());
                    }
                }
            }
        }
    }

    /* renamed from: init */
    public static synchronized void m41772x316510(android.content.Context context, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.class) {
            m41773x316510(context, abstractC4741xef9abf3, null);
        }
    }

    /* renamed from: isLogEnable */
    public static boolean m41774xa25a73dd() {
        return f20441x5c1d31e7;
    }

    /* renamed from: isNewProcess */
    public static boolean m41775x926af579(android.content.Context context) {
        if (f20430xb9131602) {
            return f20437x926af579;
        }
        try {
            f20430xb9131602 = true;
            android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
            android.content.pm.ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0).packageName, 1).activities;
            for (android.content.pm.ActivityInfo activityInfo : activityInfoArr) {
                if (activityInfo.name.equals("com.tencent.midas.proxyactivity.APMidasPayProxyActivity")) {
                    java.lang.String str = activityInfo.processName;
                    if (!android.text.TextUtils.isEmpty(str) && str.contains("midasPay")) {
                        return true;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            f20430xb9131602 = false;
        }
        return false;
    }

    /* renamed from: midasCallBack */
    public static void m41776x3161eff(com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec) {
        if (c4728x8ec3caec != null && c4728x8ec3caec.f20116xdde293aa == f20426xf7fb519e && f20427x1b8cc140.equals(c4728x8ec3caec.f20118x938b9624) && com.p314xaae8f345.p592x631407a.p603x745bd612.ActivityC4793x6b9f8206.m41984x81ab0241(f20449xb6a9b52, "", "change_h5_from_cgi")) {
            f20449xb6a9b52 = null;
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "midasCallBack resultCode :" + c4728x8ec3caec.f20116xdde293aa + " midasCallBack:" + f20442x3161eff);
        com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab = f20442x3161eff;
        if (interfaceC4731xabd5a6ab != null) {
            interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec);
            f20442x3161eff = null;
        }
        com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00 resultReceiverC4775xb0cccc00 = f20446x93559f14;
        if (resultReceiverC4775xb0cccc00 != null) {
            resultReceiverC4775xb0cccc00.m41750x465e8871(null);
            f20446x93559f14 = null;
        }
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3);
        f20447x4bd21aae = null;
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42172x41012807();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41601x4122ea2c();
        f20449xb6a9b52 = null;
    }

    /* renamed from: midasH5CallBack */
    public static void m41777x3ef9346c(java.lang.String str) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "midasH5CallBack params:" + str + " webview:" + f20450x48fb3bf9 + " x5Webview:" + f20451xade6267c);
        android.webkit.WebView webView = f20450x48fb3bf9;
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "midasH5CallBack error:" + e17.toString());
            }
        }
        com.tencent.smtt.sdk.WebView webView2 = f20451xade6267c;
        if (webView2 != null) {
            try {
                webView2.loadUrl(str);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "midasH5CallBack error:" + e18.toString());
            }
        }
        com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00 resultReceiverC4775xb0cccc00 = f20446x93559f14;
        if (resultReceiverC4775xb0cccc00 != null) {
            resultReceiverC4775xb0cccc00.m41750x465e8871(null);
            f20446x93559f14 = null;
        }
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3);
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42172x41012807();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41601x4122ea2c();
        f20449xb6a9b52 = null;
        f20447x4bd21aae = null;
    }

    /* renamed from: midasLoginExpire */
    public static void m41778x8f4c1d0e() {
        com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab = f20442x3161eff;
        if (interfaceC4731xabd5a6ab != null) {
            interfaceC4731xabd5a6ab.mo41390x9af5fe25();
            f20442x3161eff = null;
        }
        com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00 resultReceiverC4775xb0cccc00 = f20446x93559f14;
        if (resultReceiverC4775xb0cccc00 != null) {
            resultReceiverC4775xb0cccc00.m41750x465e8871(null);
            f20446x93559f14 = null;
        }
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3);
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42172x41012807();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41601x4122ea2c();
        f20449xb6a9b52 = null;
        f20447x4bd21aae = null;
    }

    /* renamed from: onNetError */
    public static void m41779xf0a4d56a(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0 = f20444x83c8b522;
        if (interfaceC4730x6ddbdaa0 != null) {
            interfaceC4730x6ddbdaa0.m41418x88926ce5(str, num.intValue(), str2);
            f20444x83c8b522 = null;
            f20445x8062eebb = "";
        }
        f20449xb6a9b52 = null;
    }

    /* renamed from: onNetFinish */
    public static void m41780x2529f571(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0 = f20444x83c8b522;
        if (interfaceC4730x6ddbdaa0 != null) {
            interfaceC4730x6ddbdaa0.m41419x8aef4d56(str, str2);
            f20444x83c8b522 = null;
            f20445x8062eebb = "";
        }
        f20449xb6a9b52 = null;
    }

    /* renamed from: onNetStop */
    public static void m41781xbd771060(java.lang.String str) {
        com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0 = f20444x83c8b522;
        if (interfaceC4730x6ddbdaa0 != null) {
            interfaceC4730x6ddbdaa0.m41420x780b1d85(str);
            f20444x83c8b522 = null;
            f20445x8062eebb = "";
        }
        f20449xb6a9b52 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openPlugin */
    public void m41782xf39221d(android.app.Activity activity, android.content.Intent intent, java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into openPlugin, method = " + str + " caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        try {
            obj = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42103x34971816(activity, f20418xb441bfb2, f20421x9d792e54, str, new java.lang.Object[]{activity, intent});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "openPlugin e:" + e17.toString());
            obj = null;
        }
        try {
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "openPlugin dataReport:" + e18.toString());
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "openPlugin obj:" + obj);
    }

    /* renamed from: pluginInitErrCallBack */
    private void m41783x3a906207(final android.app.Activity activity) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "pluginInitErrCallBack" + f20442x3161eff);
        if (com.p314xaae8f345.p592x631407a.p603x745bd612.ActivityC4793x6b9f8206.m41984x81ab0241(activity, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42157x3b470bff(), "pluginInitErrCallBack")) {
            return;
        }
        activity.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.14
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20598x46ddfef5, "", com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42157x3b470bff());
                android.widget.Toast.makeText(activity, "腾讯支付服务加载失败，请退出重试", 1).show();
                com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
                c4728x8ec3caec.f20116xdde293aa = -100;
                com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20442x3161eff;
                if (interfaceC4731xabd5a6ab != null) {
                    interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec);
                    com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20442x3161eff = null;
                    com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20447x4bd21aae = null;
                    com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20449xb6a9b52 = null;
                }
                com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20444x83c8b522;
                if (interfaceC4730x6ddbdaa0 != null) {
                    interfaceC4730x6ddbdaa0.m41418x88926ce5(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20445x8062eebb, -100, "腾讯支付服务加载失败，请退出重试");
                    com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20444x83c8b522 = null;
                    java.lang.String unused = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20445x8062eebb = "";
                    com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20447x4bd21aae = null;
                    com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20449xb6a9b52 = null;
                }
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preLoadMidasPay */
    public static void m41784xf2437b17(final android.content.Context context, final java.lang.String str, final com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed interfaceC4778x86a27ed) {
        int i17;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into preLoadMidasPay " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42149xc2865f44(context);
        if (f20438x62193627) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4754xfbd52878.m41599xa4917c9d(context);
        }
        java.lang.System.currentTimeMillis();
        if (f20436xbdafff14) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into preLoadMidasPay isNeedLocalUpdate == true");
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42094xf0162a86(context);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20612x16899b4f, java.lang.System.currentTimeMillis());
            f20436xbdafff14 = false;
        } else {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into preLoadMidasPay isNeedLocalUpdate == false");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int m42098x801ce676 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42098x801ce676(context, env);
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20613x8586e29c, currentTimeMillis);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "preLoadMidasPay isNeedUpdateFromAssets = " + m42098x801ce676);
        if (m42098x801ce676 > 0) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            i17 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42097x96d0a0ae(context, m42098x801ce676);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20611xa82433ff, currentTimeMillis2);
        } else {
            i17 = 0;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "preLoadMidasPay installPlugin ret:" + i17 + " initRequest:" + f20433x8ffd535f);
        synchronized (f20432x79ae86f) {
            if (i17 != 0) {
                f20431xef17a5df = 0;
                f20434xeffb1961 = 2;
                if (interfaceC4778x86a27ed != null) {
                    interfaceC4778x86a27ed.mo41814xc84dc81d(-1, com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42157x3b470bff(), str, null);
                }
            } else {
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                boolean m42070xe0eb54ff = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4805x86453513.m42070xe0eb54ff(context);
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20622x438b2f25, currentTimeMillis3);
                if (m42070xe0eb54ff) {
                    try {
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42110x290b00e8(context);
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20621xd41646f3, currentTimeMillis4);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "preLoadMidasPay preCreateClassLoaderByPath e: " + e17.toString());
                    }
                    final java.lang.String name = java.lang.Thread.currentThread().getName();
                    if (context instanceof android.app.Activity) {
                        ((android.app.Activity) context).runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.13
                            /* JADX WARN: Removed duplicated region for block: B:12:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public void run() {
                                /*
                                    r8 = this;
                                    android.content.Intent r0 = new android.content.Intent
                                    r0.<init>()
                                    java.lang.String r1 = "version"
                                    java.lang.String r2 = "1.9.9m"
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "req"
                                    com.tencent.midas.api.request.APMidasBaseRequest r2 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41758xbbd78272()
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "env"
                                    java.lang.String r2 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41759xbbd78633()
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "logEnable"
                                    boolean r2 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41760xbbd789f4()
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "launchInterfaceName"
                                    java.lang.String r2 = r1
                                    r0.putExtra(r1, r2)
                                    android.content.Context r1 = r2
                                    android.app.Activity r1 = (android.app.Activity) r1
                                    r2 = 0
                                    long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L5f
                                    java.lang.String r5 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20418xb441bfb2     // Catch: java.lang.Exception -> L5f
                                    java.lang.String r6 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20421x9d792e54     // Catch: java.lang.Exception -> L5f
                                    java.lang.String r7 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20402x35fb01b     // Catch: java.lang.Exception -> L5f
                                    java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Exception -> L5f
                                    java.lang.Object r0 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42103x34971816(r1, r5, r6, r7, r0)     // Catch: java.lang.Exception -> L5f
                                    com.tencent.midas.data.APPluginReportManager r1 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b()     // Catch: java.lang.Exception -> L5d
                                    java.lang.String r5 = r1     // Catch: java.lang.Exception -> L5d
                                    java.lang.String r6 = "sdk.plugin.init.kernel.totaltime"
                                    r1.m41937x21a232c3(r5, r6, r3)     // Catch: java.lang.Exception -> L5d
                                    com.tencent.midas.control.IAPInitCallBack r1 = r3     // Catch: java.lang.Exception -> L5d
                                    if (r1 == 0) goto L6f
                                    java.lang.String r3 = "succ"
                                    java.lang.String r4 = r4     // Catch: java.lang.Exception -> L5d
                                    r5 = 0
                                    r1.mo41814xc84dc81d(r5, r3, r4, r2)     // Catch: java.lang.Exception -> L5d
                                    goto L6f
                                L5d:
                                    r1 = move-exception
                                    goto L61
                                L5f:
                                    r1 = move-exception
                                    r0 = r2
                                L61:
                                    com.tencent.midas.control.IAPInitCallBack r3 = r3
                                    if (r3 == 0) goto L6f
                                    java.lang.String r1 = r1.toString()
                                    java.lang.String r4 = r4
                                    r5 = -2
                                    r3.mo41814xc84dc81d(r5, r1, r4, r2)
                                L6f:
                                    java.lang.String r1 = "APMidasPayHelper"
                                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                    java.lang.String r3 = "preLoadMidasPay openPlugin obj:"
                                    r2.<init>(r3)
                                    r2.append(r0)
                                    java.lang.String r0 = r2.toString()
                                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(r1, r0)
                                    com.tencent.midas.data.APPluginReportManager r0 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b()
                                    java.lang.String r1 = r1
                                    java.lang.String r2 = "sdk.plugin.init.totaltime"
                                    r0.m41935xd303e5f0(r1, r2)
                                    java.lang.String r0 = "APMidasPayHelper"
                                    java.lang.String r1 = "preLoadMidasPay initState = PLUGIN_INITSUCC"
                                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(r0, r1)
                                    r0 = 1
                                    com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20434xeffb1961 = r0
                                    java.lang.Object r0 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41762xbbd79176()
                                    monitor-enter(r0)
                                    java.lang.Object r1 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41762xbbd79176()     // Catch: java.lang.Throwable -> La5
                                    r1.notifyAll()     // Catch: java.lang.Throwable -> La5
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
                                    return
                                La5:
                                    r1 = move-exception
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.AnonymousClass13.run():void");
                            }
                        });
                    } else {
                        f20434xeffb1961 = 1;
                        synchronized (f20439x147f939b) {
                            f20439x147f939b.notifyAll();
                        }
                    }
                } else {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "preLoadMidasPay isPluginValid false");
                    com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42100xe5040295(context);
                    f20434xeffb1961 = -1;
                    if (interfaceC4778x86a27ed != null) {
                        f20431xef17a5df = 0;
                        interfaceC4778x86a27ed.mo41814xc84dc81d(-1, "支付插件校验失败", str, null);
                    }
                    synchronized (f20439x147f939b) {
                        f20439x147f939b.notifyAll();
                    }
                }
            }
        }
    }

    /* renamed from: preLoadPlugin */
    private static void m41785xe9103abc(final android.content.Context context, final java.lang.String str, final com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed interfaceC4778x86a27ed) {
        synchronized (f20432x79ae86f) {
            f20434xeffb1961 = 0;
        }
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.12
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41784xf2437b17(context, str, interfaceC4778x86a27ed);
            }
        });
        thread.setName(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490());
        thread.start();
    }

    /* renamed from: release */
    public static void m41786x41012807(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "release");
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42100xe5040295(context);
        synchronized (f20432x79ae86f) {
            f20434xeffb1961 = -1;
        }
    }

    /* renamed from: releaseSDK */
    public static void m41787xa59246b3(android.app.Activity activity) {
        f20443x55b0c2db = null;
        f20442x3161eff = null;
        f20444x83c8b522 = null;
        f20446x93559f14 = null;
        new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41797x2e7a5e(activity, f20408x692f80fc, new java.lang.Object[0]);
    }

    /* renamed from: setEnv */
    public static void m41788xca02612b(java.lang.String str) {
        if (!"release".equals(str) && !"test".equals(str) && !com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20061xcc101583.equals(str) && !"debug".equals(str) && !com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20064xc194547e.equals(str)) {
            str = "release";
        }
        env = str;
    }

    /* renamed from: setLogCallbackClassName */
    public static void m41789x494a91fc(java.lang.String str) {
        f20440x212ba67a = str;
    }

    /* renamed from: setLogEnable */
    public static void m41790xb7de63a5(boolean z17) {
        f20441x5c1d31e7 = z17;
    }

    /* renamed from: setLongConnection */
    public static synchronized void m41791xe9de6b7c(android.content.Context context, boolean z17) {
        synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.class) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "setLongConnection to open = " + z17);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("version", "1.9.9m");
            intent.putExtra("env", env);
            intent.putExtra("logEnable", f20441x5c1d31e7);
            intent.putExtra("openLongConnection", z17);
            intent.putExtra("launchInterfaceName", java.lang.Thread.currentThread().getName());
            try {
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42103x34971816(context, f20418xb441bfb2, f20421x9d792e54, f20403x5e5c43e5, new java.lang.Object[]{context, intent});
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "initcallback isInitSucc direct call init function e:" + e17.toString());
            }
        }
    }

    /* renamed from: toH5Midas */
    private int m41792x794494b2(final android.app.Activity activity, android.webkit.WebView webView, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "toH5Midas initState: " + f20434xeffb1961);
        synchronized (f20432x79ae86f) {
            final android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(activity);
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(0);
            progressDialog.setTitle("温馨提示");
            progressDialog.setMessage("腾讯支付服务初始化中");
            int i17 = f20434xeffb1961;
            if (i17 == -1 || i17 == 0) {
                try {
                    progressDialog.show();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (f20434xeffb1961 == -1) {
                m41785xe9103abc(activity, str4, null);
            }
            if (f20434xeffb1961 == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.10
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20439x147f939b) {
                                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20439x147f939b.wait();
                            }
                        } catch (java.lang.InterruptedException e17) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "toH5Midas e:" + e17.toString());
                        }
                        try {
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this.m41793x13d50e96(activity, str, str2, str3);
                    }
                }).start();
                return 0;
            }
            return m41793x13d50e96(activity, str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toH5MidasPay */
    public int m41793x13d50e96(final android.app.Activity activity, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        synchronized (f20432x79ae86f) {
            if (f20434xeffb1961 != 2) {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.11
                    @Override // java.lang.Runnable
                    public void run() {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("version", com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41356x83dbbdc1());
                        intent.putExtra("env", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.env);
                        intent.putExtra("screenType", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this.f20455xe71fadc6);
                        intent.putExtra("logEnable", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20441x5c1d31e7);
                        intent.putExtra("req", "H5Pay");
                        intent.putExtra("url", str);
                        intent.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str2);
                        intent.putExtra("reqType", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20445x8062eebb);
                        try {
                            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4784xfc88460f m41857xe5e0f983 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41857xe5e0f983();
                            if (m41857xe5e0f983 != null) {
                                intent.putExtra("launchPayGUID", m41857xe5e0f983.m41831xfb7ffeff());
                                intent.putExtra("launchPayTime", m41857xe5e0f983.m41833x74022754());
                                intent.putExtra("launchPayDataid", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4780x61b58b74.m41815x1548d95b());
                                intent.putExtra("launchIntervalTime", m41857xe5e0f983.m41832x36053a8());
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20437x926af579) {
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00 unused2 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20446x93559f14 = new com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00(new android.os.Handler());
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20446x93559f14.m41750x465e8871(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this);
                            intent.putExtra("remoteReceiver", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20446x93559f14);
                        }
                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this.m41782xf39221d(activity, intent, str3);
                    }
                });
                return 0;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "toH5MidasPay plugin init error");
            m41783x3a906207(activity);
            f20434xeffb1961 = -1;
            return -1;
        }
    }

    /* renamed from: toMidas */
    private int m41794xba2b16bf(final android.app.Activity activity, final com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, final java.lang.String str, final java.lang.String str2) {
        if (abstractC4741xef9abf3 == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "toMidas pay request is null");
            return -1;
        }
        f20447x4bd21aae = abstractC4741xef9abf3;
        f20449xb6a9b52 = activity.getApplicationContext();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "ToMidas initState = " + f20434xeffb1961);
        synchronized (f20432x79ae86f) {
            final android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(activity);
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(0);
            progressDialog.setTitle("温馨提示");
            progressDialog.setMessage("腾讯支付服务初始化中");
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean m42099x7015c218 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42099x7015c218(activity);
            f20436xbdafff14 = m42099x7015c218;
            if (m42099x7015c218) {
                synchronized (f20432x79ae86f) {
                    f20434xeffb1961 = -1;
                }
            }
            int i17 = f20434xeffb1961;
            if ((i17 == -1 || i17 == 0) && !f20404xef97cd12.equals(str) && !f20401x35fafb9.equals(str)) {
                try {
                    progressDialog.show();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (f20434xeffb1961 == 1 && !com.p314xaae8f345.p592x631407a.p604xc5476f33.C4805x86453513.m42069x20bfcfb9(activity)) {
                f20434xeffb1961 = -1;
            }
            if (f20434xeffb1961 == -1) {
                if (f20436xbdafff14) {
                    m41787xa59246b3(activity);
                }
                m41785xe9103abc(activity, str2, null);
            }
            if (f20434xeffb1961 == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20439x147f939b) {
                                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20439x147f939b.wait();
                            }
                        } catch (java.lang.InterruptedException e17) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, e17.toString());
                        }
                        try {
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20619x3aaed8db, currentTimeMillis);
                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this.m41795x9c4d3569(activity, abstractC4741xef9abf3, str, str2);
                    }
                }).start();
                return 0;
            }
            return m41795x9c4d3569(activity, abstractC4741xef9abf3, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toMidasPay */
    public int m41795x9c4d3569(final android.app.Activity activity, final com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, final java.lang.String str, java.lang.String str2) {
        synchronized (f20432x79ae86f) {
            if (f20434xeffb1961 == 2) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "toMidasPay plugin init error");
                m41783x3a906207(activity);
                f20434xeffb1961 = -1;
                return -1;
            }
            f20447x4bd21aae = abstractC4741xef9abf3;
            f20449xb6a9b52 = activity.getApplicationContext();
            f20437x926af579 = m41775x926af579(activity);
            try {
                this.f20455xe71fadc6 = activity.getResources().getConfiguration().orientation;
            } catch (java.lang.Exception unused) {
            }
            try {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.9
                    @Override // java.lang.Runnable
                    public void run() {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("version", com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41356x83dbbdc1());
                        intent.putExtra("env", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.env);
                        intent.putExtra("screenType", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this.f20455xe71fadc6);
                        intent.putExtra("logEnable", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20441x5c1d31e7);
                        intent.putExtra("req", abstractC4741xef9abf3);
                        intent.putExtra("reqType", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20445x8062eebb);
                        intent.putExtra(ya.b.f77491x8758c4e1, str);
                        if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20437x926af579) {
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00 unused2 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20446x93559f14 = new com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00(new android.os.Handler());
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20446x93559f14.m41750x465e8871(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this);
                            intent.putExtra("remoteReceiver", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20446x93559f14);
                        }
                        intent.putExtra("launchInterfaceName", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490());
                        try {
                            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4784xfc88460f m41857xe5e0f983 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41857xe5e0f983();
                            if (m41857xe5e0f983 != null) {
                                intent.putExtra("launchPayGUID", m41857xe5e0f983.m41831xfb7ffeff());
                                intent.putExtra("launchPayTime", m41857xe5e0f983.m41833x74022754());
                                intent.putExtra("launchPayDataid", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4780x61b58b74.m41815x1548d95b());
                                intent.putExtra("launchIntervalTime", m41857xe5e0f983.m41832x36053a8());
                            }
                        } catch (java.lang.Exception unused3) {
                        }
                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this.m41782xf39221d(activity, intent, str);
                    }
                });
                return 0;
            } catch (java.lang.Exception unused2) {
                return 0;
            }
        }
    }

    /* renamed from: waitingPluginReady */
    private void m41796xfd5511a3(android.content.Context context, final android.os.ResultReceiver resultReceiver) {
        if ("test".equals(env) && f20431xef17a5df < 1) {
            android.widget.Toast.makeText(context, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        if (f20437x926af579) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41665x64d2042b(context, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "launchpaycalling", "1");
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "ToMidas initState = " + f20434xeffb1961);
        synchronized (f20432x79ae86f) {
            final android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(context);
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(0);
            progressDialog.setTitle("温馨提示");
            progressDialog.setMessage("腾讯支付服务初始化中");
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean m42099x7015c218 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4808xfbd720f8.m42099x7015c218(context);
            f20436xbdafff14 = m42099x7015c218;
            if (m42099x7015c218) {
                synchronized (f20432x79ae86f) {
                    f20434xeffb1961 = -1;
                }
            }
            int i17 = f20434xeffb1961;
            if ((i17 == -1 || i17 == 0) && !f20404xef97cd12.equals("launchFunction") && !f20401x35fafb9.equals("launchFunction")) {
                try {
                    progressDialog.show();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (f20434xeffb1961 == -1) {
                if (f20436xbdafff14) {
                    m41786x41012807(context);
                }
                m41785xe9103abc(context, "launchFunction", null);
            }
            if (f20434xeffb1961 == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.6
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20439x147f939b) {
                                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20439x147f939b.wait();
                            }
                        } catch (java.lang.InterruptedException e17) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, e17.toString());
                        }
                        try {
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41937x21a232c3(java.lang.Thread.currentThread().getName(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20619x3aaed8db, currentTimeMillis);
                        resultReceiver.send(0, new android.os.Bundle());
                    }
                }).start();
            } else {
                resultReceiver.send(0, new android.os.Bundle());
            }
        }
    }

    /* renamed from: call */
    public java.lang.Object m41797x2e7a5e(android.app.Activity activity, java.lang.String str, java.lang.Object[] objArr) {
        return m41800xfd6078cb(activity, str, objArr);
    }

    /* renamed from: callWithContext */
    public java.lang.Object m41800xfd6078cb(android.content.Context context, java.lang.String str, java.lang.Object[] objArr) {
        try {
            return com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42103x34971816(context, f20418xb441bfb2, f20421x9d792e54, f20393x35cc569, new java.lang.Object[]{str, objArr});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "callWithContext error:" + e17.toString());
            return null;
        }
    }

    /* renamed from: directWxPay */
    public int m41802x9dc22f9e(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4742x2925229b c4742x2925229b, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "直接拉起微信支付, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && f20431xef17a5df < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        f20442x3161eff = interfaceC4731xabd5a6ab;
        if (f20437x926af579) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41665x64d2042b(activity, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "launchpaycalling", "1");
        }
        return m41794xba2b16bf(activity, c4742x2925229b, f20396xf6ec75fd, "directWxPay");
    }

    /* renamed from: getInfo */
    public int m41803xfb80cd24(android.app.Activity activity, java.lang.String str, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0) {
        f20444x83c8b522 = interfaceC4730x6ddbdaa0;
        f20445x8062eebb = str;
        return m41794xba2b16bf(activity, abstractC4741xef9abf3, f20401x35fafb9, "getInfo");
    }

    /* renamed from: h5Pay */
    public int m41804x5d2dc9b(android.app.Activity activity, android.webkit.WebView webView, com.tencent.smtt.sdk.WebView webView2, java.lang.String str, java.lang.String str2) {
        f20450x48fb3bf9 = webView;
        f20451xade6267c = webView2;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5Pay webview:" + f20450x48fb3bf9 + " x5Webview:" + f20451xade6267c + " msg:" + str2);
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7 m41926x9cf0d20b = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msg:");
        sb6.append(str2);
        m41926x9cf0d20b.m41940xebbf4a4d(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20603x9f631c5a, sb6.toString());
        if (android.text.TextUtils.isEmpty(str2) || !str2.startsWith("midas_js_bridge_")) {
            return -2;
        }
        return m41792x794494b2(activity, webView, str, str2, f20397x687cf6d0, "h5Pay");
    }

    /* renamed from: launchWXMiniProgram */
    public void m41805xdb77bfb9(android.content.Context context, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        m41799x2e7a5e(context, f20412x5740af1a, new java.lang.Class[]{android.content.Context.class, android.os.Bundle.class, android.os.ResultReceiver.class}, new java.lang.Object[]{context, bundle, resultReceiver});
    }

    /* renamed from: launchWXMiniProgram_OnResponse */
    public void m41806x866ccba6(android.content.Context context, int i17, android.os.Bundle bundle) {
        m41799x2e7a5e(context, f20413xc395d165, new java.lang.Class[]{java.lang.Integer.TYPE, android.os.Bundle.class}, new java.lang.Object[]{java.lang.Integer.valueOf(i17), bundle});
    }

    /* renamed from: launchWeChat */
    public int m41807x48533cd9(android.app.Activity activity, org.json.JSONObject jSONObject, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into pay, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && f20431xef17a5df < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        f20442x3161eff = interfaceC4731xabd5a6ab;
        if (f20437x926af579) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41665x64d2042b(activity, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "launchpaycalling", "1");
        }
        com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2 c4743x7dd68fb2 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2();
        try {
            c4743x7dd68fb2.f20190xc84d8cc9 = "H5PayParams=" + java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Exception unused) {
        }
        return m41794xba2b16bf(activity, c4743x7dd68fb2, f20411xe9b07777, "launchWeChat");
    }

    /* renamed from: launchWeb */
    public void m41808xd7c2aea1(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activity, com.p314xaae8f345.p592x631407a.p603x745bd612.ActivityC4793x6b9f8206.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/midas/control/APMidasPayHelper", "launchWeb", "(Landroid/app/Activity;Lcom/tencent/midas/api/request/APMidasBaseRequest;Lcom/tencent/midas/api/IAPMidasPayCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/midas/control/APMidasPayHelper", "launchWeb", "(Landroid/app/Activity;Lcom/tencent/midas/api/request/APMidasBaseRequest;Lcom/tencent/midas/api/IAPMidasPayCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int net(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4746x3fd7fe1d c4746x3fd7fe1d, com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0) {
        f20444x83c8b522 = interfaceC4730x6ddbdaa0;
        f20445x8062eebb = c4746x3fd7fe1d.f20243x41403cf8;
        return m41794xba2b16bf(activity, c4746x3fd7fe1d, f20404xef97cd12, "net");
    }

    @Override // com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00.Receiver
    /* renamed from: onReceiveResult */
    public void mo41751x8a4d1541(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "remotRecevier payHelper resultCode:" + i17);
        if (i17 == 0) {
            m41810x9bdbc821(bundle);
        }
    }

    public int pay(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into pay, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && f20431xef17a5df < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        f20442x3161eff = interfaceC4731xabd5a6ab;
        if (f20437x926af579) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41665x64d2042b(activity, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "launchpaycalling", "1");
        }
        return m41794xba2b16bf(activity, abstractC4741xef9abf3, f20405xef97d41d, "pay");
    }

    /* renamed from: payScoreContract */
    public int m41809x84e3d1fc(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "payScoreContract, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && f20431xef17a5df < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        f20442x3161eff = interfaceC4731xabd5a6ab;
        if (f20437x926af579) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41665x64d2042b(activity, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "launchpaycalling", "1");
        }
        return m41794xba2b16bf(activity, abstractC4741xef9abf3, f20406xcdca4bd1, "payScoreContract");
    }

    /* renamed from: progressRemoteInfo */
    public void m41810x9bdbc821(android.os.Bundle bundle) {
        com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250 c4749xc7cbd250;
        java.lang.String string = bundle.getString("type");
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "progressRemoteInfo type:" + string);
        if (!"callback".equals(string)) {
            if ("h5callback".equals(string)) {
                m41777x3ef9346c(bundle.getString("callbackinfo"));
                return;
            } else {
                if ("needlogin".equals(string)) {
                    m41778x8f4c1d0e();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
        c4728x8ec3caec.f20116xdde293aa = bundle.getInt("resultCode", -1);
        c4728x8ec3caec.f20117x7aa9acdc = bundle.getInt("resultInerCode");
        c4728x8ec3caec.f20115x8297754b = bundle.getInt("realSaveNum");
        c4728x8ec3caec.f20109xb6c1d73b = bundle.getInt("payChannel");
        c4728x8ec3caec.f20113x51024cc9 = bundle.getInt("payState");
        c4728x8ec3caec.f20114xe55f0270 = bundle.getInt("provideState");
        c4728x8ec3caec.f20118x938b9624 = bundle.getString("resultMsg");
        c4728x8ec3caec.f20107x93447ae8 = bundle.getString("extendInfo");
        c4728x8ec3caec.f20110xb73277bd = bundle.getString("payReserve1");
        c4728x8ec3caec.f20111xb73277be = bundle.getString("payReserve2");
        c4728x8ec3caec.f20112xb73277bf = bundle.getString("payReserve3");
        try {
            c4749xc7cbd250 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250(bundle.getString("purchaseJson"), bundle.getString("purchaseSign"));
        } catch (org.json.JSONException e17) {
            c4749xc7cbd250 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("progressRemoteInfo", "purchase creat fail1 " + e17.toString());
        } catch (java.lang.Exception e18) {
            c4749xc7cbd250 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w("progressRemoteInfo", "purchase creat fail2 " + e18.toString());
        }
        c4728x8ec3caec.f20108x2d2bee7d = c4749xc7cbd250;
        m41776x3161eff(c4728x8ec3caec);
    }

    /* renamed from: sendMidas */
    public void m41811x94f5d2(final android.content.Context context, final android.os.Bundle bundle, final android.os.ResultReceiver resultReceiver) {
        m41796xfd5511a3(context, new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.midas.control.APMidasPayHelper.5
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle2) {
                if (i17 == 0) {
                    try {
                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this;
                        android.content.Context context2 = context;
                        c4777x7a3dad2b.f20453xc84e24b6 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42104x34971816(context2, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20418xb441bfb2, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20421x9d792e54, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20407x68b0cbd8, new java.lang.Object[]{context2, bundle, resultReceiver}, new java.lang.Class[]{android.content.Context.class, android.os.Bundle.class, android.os.ResultReceiver.class});
                        return;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "sendMidas() e = " + e17.toString());
                        return;
                    }
                }
                if (resultReceiver != null) {
                    java.lang.String string = bundle.getString("__midas_ability_baseReq__postBack");
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString("midas_callback_ability_postBack", string);
                    bundle3.putInt("midas_callback_ability_code", -1999);
                    bundle3.putString("midas_callback_ability_msg", "MidasPlugin load failure");
                    bundle3.putBundle("midas_callback_ability_data", bundle2);
                    resultReceiver.send(-1, bundle3);
                }
            }
        });
    }

    /* renamed from: setScreenType */
    public void m41812x384b3c8(int i17) {
    }

    /* renamed from: signPay */
    public int m41813x7c7825ab(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "Calling into pay, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && f20431xef17a5df < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        f20442x3161eff = interfaceC4731xabd5a6ab;
        if (f20437x926af579) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41665x64d2042b(activity, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "launchpaycalling", "1");
        }
        return m41794xba2b16bf(activity, abstractC4741xef9abf3, f20409xf03ee891, "signPay");
    }

    public void web(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        f20442x3161eff = interfaceC4731xabd5a6ab;
        m41808xd7c2aea1(activity, abstractC4741xef9abf3, interfaceC4731xabd5a6ab);
    }

    /* renamed from: call */
    public java.lang.Object m41798x2e7a5e(android.app.Activity activity, java.lang.String str, java.lang.Object[] objArr, java.lang.Class<?>[] clsArr) {
        return m41801xfd6078cb(activity, str, objArr, clsArr);
    }

    /* renamed from: init */
    public static synchronized void m41773x316510(final android.content.Context context, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, final android.os.ResultReceiver resultReceiver) {
        synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.class) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "init initCount:" + f20431xef17a5df);
            f20437x926af579 = m41775x926af579(context);
            f20433x8ffd535f = abstractC4741xef9abf3;
            if (f20431xef17a5df < 1 && !f20435xe0b782bc) {
                com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42172x41012807();
                m41785xe9103abc(context, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, new com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed() { // from class: com.tencent.midas.control.APMidasPayHelper.1
                    @Override // com.p314xaae8f345.p592x631407a.p600x38b7655d.InterfaceC4778x86a27ed
                    /* renamed from: result */
                    public void mo41814xc84dc81d(int i17, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "initcallback ret:" + i17 + " msg:" + str);
                        synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20429xeac7231c) {
                            boolean unused = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20435xe0b782bc = true;
                            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20429xeac7231c.notifyAll();
                            android.os.ResultReceiver resultReceiver2 = resultReceiver;
                            if (resultReceiver2 != null) {
                                resultReceiver2.send(i17, bundle);
                            }
                        }
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
                    }
                });
            } else if (f20435xe0b782bc) {
                ((android.app.Activity) context).runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "initcallback isInitSucc direct call init function");
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("version", "1.9.9m");
                        intent.putExtra("req", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20433x8ffd535f);
                        intent.putExtra("env", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.env);
                        intent.putExtra("logEnable", com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20441x5c1d31e7);
                        intent.putExtra("launchInterfaceName", java.lang.Thread.currentThread().getName());
                        android.os.ResultReceiver resultReceiver2 = resultReceiver;
                        if (resultReceiver2 != null) {
                            intent.putExtra("receiver", resultReceiver2);
                        }
                        try {
                            android.content.Context context2 = context;
                            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42103x34971816(context2, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20418xb441bfb2, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20421x9d792e54, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20402x35fb01b, new java.lang.Object[]{context2, intent});
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.TAG, "initcallback isInitSucc direct call init function e:" + e17.toString());
                        }
                    }
                });
            }
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            f20431xef17a5df++;
        }
    }

    /* renamed from: call */
    public java.lang.Object m41799x2e7a5e(android.content.Context context, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Object[] objArr) {
        return m41801xfd6078cb(context, str, objArr, clsArr);
    }

    /* renamed from: callWithContext */
    public java.lang.Object m41801xfd6078cb(final android.content.Context context, final java.lang.String str, final java.lang.Object[] objArr, final java.lang.Class<?>[] clsArr) {
        synchronized (f20432x79ae86f) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("callWithContext ", "initState:" + f20434xeffb1961);
            if (f20434xeffb1961 == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.7
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("callWithContext ", "PLUGIN_INITING wait");
                            synchronized (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20429xeac7231c) {
                                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20429xeac7231c.wait();
                            }
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("callWithContext ", "PLUGIN_INITING go");
                            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.7.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.AnonymousClass7 anonymousClass7 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.AnonymousClass7.this;
                                        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.this.f20453xc84e24b6 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42105x5e4beadc(context, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20418xb441bfb2, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20421x9d792e54, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20394x683be7e9, new java.lang.Object[]{str, objArr, clsArr});
                                    } catch (java.lang.Exception e17) {
                                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("callWithContext", "error1 " + e17.toString());
                                    }
                                }
                            });
                        } catch (java.lang.InterruptedException e17) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("callWithContext", "error2 " + e17.toString());
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("callWithContext", "error3 " + e18.toString());
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("callWithContext", "error4 " + th6.toString());
                        }
                    }
                }).start();
            } else {
                try {
                    this.f20453xc84e24b6 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42105x5e4beadc(context, f20418xb441bfb2, f20421x9d792e54, f20394x683be7e9, new java.lang.Object[]{str, objArr, clsArr});
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("callWithContext", "error3 " + e17.toString());
                }
            }
        }
        return this.f20453xc84e24b6;
    }
}

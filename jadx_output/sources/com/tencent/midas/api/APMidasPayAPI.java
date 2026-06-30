package com.tencent.midas.api;

/* loaded from: classes13.dex */
public class APMidasPayAPI {
    public static final java.lang.String ACCOUNT_TYPE_COMMON = "common";
    public static final java.lang.String ACCOUNT_TYPE_SECURITY = "secrety";
    public static final java.lang.String ENV_DEV = "dev";
    public static final java.lang.String ENV_RELEASE = "release";
    public static final java.lang.String ENV_TEST = "test";
    public static final java.lang.String ENV_TESTING = "testing";
    public static final int LANDSCAPE = 0;
    public static final java.lang.String PAY_CHANNEL_BANK = "bank";
    public static final java.lang.String PAY_CHANNEL_ECOMMERCE_QQ = "wechat_ecommerce_qq";
    public static final java.lang.String PAY_CHANNEL_PAYSCORE = "wechat_payscore";
    public static final java.lang.String PAY_CHANNEL_QQWALLET = "qqwallet";
    public static final java.lang.String PAY_CHANNEL_UNIONPAY = "wechat_quickpass";
    public static final java.lang.String PAY_CHANNEL_WECHAT = "wechat";
    public static final int PORTRAINT = 1;
    private static final java.lang.String TAG = "APMidasPayAPI";
    public static final java.lang.String WX_COUPONS = "wechatAddCardToWXCardPackage";
    private static java.lang.String dataPath = "";
    public static java.lang.String env = "release";
    public static android.content.Context fromApplicationContext = null;
    private static java.lang.String logCallbackClassName = "";
    private static boolean logEnable = true;
    private static int screenType = -1;

    public static void H5Release() {
        if (com.tencent.midas.control.APMidasPayHelper.x5Webview != null) {
            com.tencent.midas.control.APMidasPayHelper.x5Webview = null;
        }
        if (com.tencent.midas.control.APMidasPayHelper.webview != null) {
            com.tencent.midas.control.APMidasPayHelper.webview = null;
        }
        if (com.tencent.midas.control.APMidasPayHelper.sIWebView != null) {
            com.tencent.midas.control.APMidasPayHelper.sIWebView = null;
        }
    }

    public static void InnerH5PayInit(android.app.Activity activity, android.webkit.WebView webView) {
        com.tencent.midas.comm.APLog.i(TAG, "InnerH5PayInit enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper.MIDAS_WEBVIEW = com.tencent.midas.control.APMidasPayHelper.MIDAS_INNER_WEBVIEW;
            com.tencent.midas.control.APMidasPayHelper.h5Init(activity, webView, null);
        }
    }

    public static void InnerH5PayInitX5(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView) {
        com.tencent.midas.comm.APLog.i(TAG, "InnerH5PayInit enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper.MIDAS_WEBVIEW = com.tencent.midas.control.APMidasPayHelper.MIDAS_INNER_WEBVIEW;
            com.tencent.midas.control.APMidasPayHelper.h5Init(activity, null, webView);
        }
    }

    private static boolean checkInitCommParam(android.content.Context context, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        if (!env.equals("release")) {
            try {
                if (ub.a.b().equals("com.tencent.unipay")) {
                    return true;
                }
                if (aPMidasBaseRequest == null) {
                    android.widget.Toast.makeText(context, "初始化request不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(aPMidasBaseRequest.offerId)) {
                    android.widget.Toast.makeText(context, "初始化offerid不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(aPMidasBaseRequest.openId)) {
                    android.widget.Toast.makeText(context, "初始化openId不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(aPMidasBaseRequest.openKey)) {
                    android.widget.Toast.makeText(context, "初始化openKey不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(aPMidasBaseRequest.sessionId)) {
                    android.widget.Toast.makeText(context, "初始化sessionId不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(aPMidasBaseRequest.sessionType)) {
                    android.widget.Toast.makeText(context, "初始化sessionType不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(aPMidasBaseRequest.f53140pf)) {
                    android.widget.Toast.makeText(context, "初始化pf不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(aPMidasBaseRequest.pfKey)) {
                    android.widget.Toast.makeText(context, "初始化pfKey不能为空", 1).show();
                    return false;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return true;
    }

    private static boolean checkParams(android.content.Context context) {
        if (context != null) {
            return true;
        }
        com.tencent.midas.comm.APLog.e(TAG, "checkParams() context/activity == Null");
        new java.lang.Throwable("APMidasPayAPI().checkParams() context/activity == Null");
        return false;
    }

    public static void closeAll() {
        com.tencent.midas.plugin.APPluginStatic.removeAll();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    public static void consumeAsync(android.app.Activity activity, java.util.List<com.tencent.midas.api.request.APPurchase> list, com.tencent.midas.api.request.OnAPConsumeFinishedListener onAPConsumeFinishedListener) {
        java.lang.Class<?> cls;
        com.tencent.midas.comm.APLog.i(TAG, "consumeAsync enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            try {
                cls = java.lang.Class.forName(java.util.List.class.getName());
            } catch (java.lang.ClassNotFoundException e17) {
                com.tencent.midas.comm.APLog.d(TAG, "consumeAsync setEnv e:" + e17.toString());
                cls = null;
            }
            java.lang.Object call = aPMidasPayHelper.call(activity, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_XGAME_CONSUME, new java.lang.Object[]{list, onAPConsumeFinishedListener}, new java.lang.Class[]{cls, com.tencent.midas.api.request.OnAPConsumeFinishedListener.class});
            com.tencent.midas.comm.APLog.i(TAG, "consumeAsync ret " + call);
            if (call == null) {
                onAPConsumeFinishedListener.onConsumeFinished(new java.util.ArrayList());
            }
        }
    }

    public static void directWxPay(android.app.Activity activity, com.tencent.midas.api.request.APMidasDirectRequest aPMidasDirectRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "directWxPay enter");
        com.tencent.midas.data.APPluginReportManager.getInstance().reportDirectRecord(aPMidasDirectRequest, "sdk.direct.pay.enter", aPMidasDirectRequest.payInfo);
        if (!checkParams(activity) || aPMidasDirectRequest.getPayInfo().isEmpty()) {
            com.tencent.midas.comm.APLog.e(TAG, "directWxPay params error");
            com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
            aPMidasResponse.resultCode = 3;
            aPMidasResponse.payChannel = -1;
            aPMidasResponse.payState = 2;
            aPMidasResponse.provideState = -1;
            aPMidasResponse.resultMsg = "参数错误";
            iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
            com.tencent.midas.data.APPluginReportManager.getInstance().reportDirectRecord(aPMidasDirectRequest, "sdk.direct.pay.failure", aPMidasDirectRequest.payInfo + "&resultCode=" + aPMidasResponse.resultCode + "&resultMsg=" + aPMidasResponse.resultMsg);
            return;
        }
        try {
            fromApplicationContext = activity.getApplicationContext();
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
        }
        if (!ub.b.d()) {
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            com.tencent.midas.control.APMidasPayHelper.setEnv(env);
            com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
            com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.setScreenType(screenType);
            aPMidasPayHelper.directWxPay(activity, aPMidasDirectRequest, iAPMidasPayCallBack);
            return;
        }
        com.tencent.midas.comm.APLog.e("directWxPay", "fast click");
        com.tencent.midas.api.APMidasResponse aPMidasResponse2 = new com.tencent.midas.api.APMidasResponse();
        aPMidasResponse2.resultCode = -1;
        aPMidasResponse2.payChannel = -1;
        aPMidasResponse2.payState = 2;
        aPMidasResponse2.provideState = -1;
        aPMidasResponse2.resultMsg = "fast click";
        iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse2);
        com.tencent.midas.data.APPluginReportManager.getInstance().reportDirectRecord(aPMidasDirectRequest, "sdk.direct.pay.failure", aPMidasDirectRequest.payInfo + "&resultCode=" + aPMidasResponse2.resultCode + "&resultMsg=" + aPMidasResponse2.resultMsg);
    }

    public static void getInfo(android.app.Activity activity, java.lang.String str, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "getInfo enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
            }
            com.tencent.midas.data.APPluginReportManager.payDataRelease();
            com.tencent.midas.data.APPluginReportManager.getInstance().payInterfaceInit(aPMidasBaseRequest, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_GETINFO);
            com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeData(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_GETINFO, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHINFO);
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            com.tencent.midas.control.APMidasPayHelper.setEnv(env);
            com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
            com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.getInfo(activity, str, aPMidasBaseRequest, iAPMidasNetCallBack);
        }
    }

    public static java.lang.String getJSContent(android.content.Context context) {
        com.tencent.midas.comm.APLog.i(TAG, "getJSContent enter");
        return !checkParams(context) ? "" : com.tencent.midas.control.APMidasPayHelper.getJSContent(context);
    }

    public static java.lang.String getMidasCoreVersion(android.app.Activity activity) {
        com.tencent.midas.comm.APLog.i(TAG, "getMidasCoreVersion enter");
        return !checkParams(activity) ? "" : com.tencent.midas.plugin.APPluginUtils.getMidasCoreVersionName(activity);
    }

    public static java.lang.String getMidasPluginVersion() {
        com.tencent.midas.comm.APLog.d(TAG, "getMidasPluginVersion enter " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if (!ub.a.b().equals("com.tencent.unipay")) {
            return "1.9.9m";
        }
        try {
            return fromApplicationContext.getPackageManager().getPackageInfo(fromApplicationContext.getPackageName(), 0).versionName;
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("APMidasCommMethod", "getApplicationVersion error:" + e17.toString());
            return "";
        }
    }

    public static java.lang.String getMidasSDKVersion(android.app.Activity activity) {
        com.tencent.midas.comm.APLog.i(TAG, "getMidasSDKVersion enter");
        return getMidasCoreVersion(activity);
    }

    public static java.lang.String getPath() {
        return dataPath;
    }

    public static int h5PayHook(android.app.Activity activity, android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        com.tencent.midas.comm.APLog.i(TAG, "h5PayHook enter");
        if (!checkParams(activity)) {
            return -33;
        }
        com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
        com.tencent.midas.control.APMidasPayHelper.setEnv(env);
        com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
        com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
        aPMidasPayHelper.setScreenType(screenType);
        return aPMidasPayHelper.h5Pay(activity, webView, null, str, str2);
    }

    public static int h5PayHookX5(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult) {
        com.tencent.midas.comm.APLog.i(TAG, "h5PayHookX5 enter");
        if (!checkParams(activity)) {
            return -33;
        }
        com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
        com.tencent.midas.control.APMidasPayHelper.setEnv(env);
        com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
        com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
        aPMidasPayHelper.setScreenType(screenType);
        return aPMidasPayHelper.h5Pay(activity, null, webView, str, str2);
    }

    public static void h5PayInit(android.app.Activity activity, android.webkit.WebView webView) {
        com.tencent.midas.comm.APLog.i(TAG, "h5PayInit enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper.MIDAS_WEBVIEW = com.tencent.midas.control.APMidasPayHelper.MIDAS_OUT_WEBVIEW;
            com.tencent.midas.control.APMidasPayHelper.h5Init(activity, webView, null);
        }
    }

    public static void h5PayInitUnifier(android.app.Activity activity, com.tencent.midas.api.IAPWebView iAPWebView) {
        com.tencent.midas.comm.APLog.i(TAG, "h5PayInitUnifier enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper.MIDAS_WEBVIEW = com.tencent.midas.control.APMidasPayHelper.MIDAS_OUT_WEBVIEW;
            com.tencent.midas.control.APMidasPayHelper.h5InitUnifier(activity, iAPWebView);
        }
    }

    public static void h5PayInitX5(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView) {
        com.tencent.midas.comm.APLog.i(TAG, "h5PayInitX5 enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper.h5Init(activity, null, webView);
        }
    }

    public static void hfCouponsRollBack(android.app.Activity activity, java.lang.String str) {
        com.tencent.midas.comm.APLog.i(TAG, "hfCouponsRollBack enter");
        if (checkParams(activity)) {
            new com.tencent.midas.control.APMidasPayHelper().call(activity, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_HF_COUPONS_ROLLBACK, new java.lang.Object[]{str});
        }
    }

    public static void init(android.content.Context context, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        if (context != null && aPMidasBaseRequest != null) {
            initCommon(context, aPMidasBaseRequest);
            if (checkInitCommParam(context, aPMidasBaseRequest)) {
                com.tencent.midas.control.APMidasPayHelper.init(context, aPMidasBaseRequest);
                return;
            } else {
                com.tencent.midas.control.APMidasPayHelper.isNewProcess = com.tencent.midas.control.APMidasPayHelper.isNewProcess(context);
                return;
            }
        }
        com.tencent.midas.comm.APLog.e(TAG, "init parameter is null!");
    }

    private static void initCommon(android.content.Context context, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        com.tencent.midas.data.APPluginReportManager.initDataRelease();
        com.tencent.midas.data.APPluginReportManager.getInstance().initInterfaceInit(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, aPMidasBaseRequest);
        com.tencent.midas.comm.APLogUtil.initAPLogInPlugin(context.getApplicationContext(), logEnable, logCallbackClassName);
        com.tencent.midas.comm.APLog.i(TAG, "init new enter");
        com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeData(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_INIT);
        com.tencent.midas.control.APMidasPayHelper.setEnv(env);
        com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
        com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
    }

    public static void launchAbility(android.content.Context context, com.tencent.midas.api.ability.MidasBaseAbility midasBaseAbility, final android.os.ResultReceiver resultReceiver) {
        com.tencent.midas.comm.APLog.i(TAG, "launchAbility enter : " + midasBaseAbility.toString());
        if (ub.b.d()) {
            com.tencent.midas.comm.APLog.i("launchAbility", "isfast");
            if (resultReceiver != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("midas_callback_ability_postBack", midasBaseAbility.postBack);
                bundle.putInt("midas_callback_ability_code", -999);
                bundle.putString("midas_callback_ability_msg", "fast click");
                bundle.putBundle("midas_callback_ability_data", new android.os.Bundle());
                resultReceiver.send(-1, bundle);
                return;
            }
            return;
        }
        if (checkParams(context)) {
            com.tencent.midas.data.APPluginReportManager.payDataRelease();
            com.tencent.midas.api.request.APMidasGameRequest aPMidasGameRequest = new com.tencent.midas.api.request.APMidasGameRequest();
            aPMidasGameRequest.offerId = midasBaseAbility.offerId;
            aPMidasGameRequest.openId = midasBaseAbility.openId;
            aPMidasGameRequest.openKey = midasBaseAbility.openKey;
            aPMidasGameRequest.sessionId = midasBaseAbility.sessionId;
            aPMidasGameRequest.sessionType = midasBaseAbility.sessionType;
            aPMidasGameRequest.f53140pf = midasBaseAbility.f53139pf;
            aPMidasGameRequest.pfKey = midasBaseAbility.pfKey;
            com.tencent.midas.data.APPluginReportManager.getInstance().payInterfaceInit(aPMidasGameRequest, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHFEATURE);
            com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeData(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHFEATURE, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHABILITY);
            com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHABILITY, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_ENTER_ABILITY, "MidasPlugin", midasBaseAbility.toString());
            new com.tencent.midas.control.APMidasPayHelper().sendMidas(context, midasBaseAbility.toBundle(), new android.os.ResultReceiver(new android.os.Handler()) { // from class: com.tencent.midas.api.APMidasPayAPI.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle2) {
                    com.tencent.midas.comm.APLog.i(com.tencent.midas.api.APMidasPayAPI.TAG, "launchAbility.onReceiveResult() resultCode=" + i17 + ", resultData=" + bundle2);
                    android.os.ResultReceiver resultReceiver2 = resultReceiver;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i17, bundle2);
                        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport("launchAbility");
                        com.tencent.midas.plugin.APPluginUtils.release();
                        com.tencent.midas.comm.APLog.closeLog();
                    }
                }
            });
        }
    }

    public static void launchNet(android.app.Activity activity, com.tencent.midas.api.request.APMidasNetRequest aPMidasNetRequest, com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "launchNet enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
            }
            com.tencent.midas.data.APPluginReportManager.payDataRelease();
            com.tencent.midas.data.APPluginReportManager.getInstance().payInterfaceInit(aPMidasNetRequest, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHNET);
            com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeData(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHNET, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHNET);
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            com.tencent.midas.control.APMidasPayHelper.setEnv(env);
            com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
            com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.net(activity, aPMidasNetRequest, iAPMidasNetCallBack);
        }
    }

    public static void launchPay(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "launchPay enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
            }
            if (!ub.b.d()) {
                com.tencent.midas.data.APPluginReportManager.payDataRelease();
                com.tencent.midas.data.APPluginReportManager.getInstance().payInterfaceInit(aPMidasBaseRequest, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
                com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeData(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHPAY);
                com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
                com.tencent.midas.control.APMidasPayHelper.setEnv(env);
                com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
                com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
                aPMidasPayHelper.setScreenType(screenType);
                aPMidasPayHelper.pay(activity, aPMidasBaseRequest, iAPMidasPayCallBack);
                return;
            }
            com.tencent.midas.comm.APLog.i("launchPay", "isfast");
            com.tencent.midas.comm.APLog.w(TAG, "launchPay enter fast:" + iAPMidasPayCallBack);
            com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
            aPMidasResponse.resultCode = -1;
            aPMidasResponse.payChannel = -1;
            aPMidasResponse.payState = 2;
            aPMidasResponse.provideState = -1;
            aPMidasResponse.resultMsg = "fast click";
            iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
        }
    }

    public static void launchPayScoreContract(android.app.Activity activity, com.tencent.midas.api.request.APMidasGoodsRequest aPMidasGoodsRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "launchPayScoreContract enter");
        if (!checkParams(activity) || aPMidasGoodsRequest == null || android.text.TextUtils.isEmpty(aPMidasGoodsRequest.extendInfo.contractDomain) || android.text.TextUtils.isEmpty(aPMidasGoodsRequest.extendInfo.ecOfferId) || android.text.TextUtils.isEmpty(aPMidasGoodsRequest.extendInfo.ecSubOfferId)) {
            com.tencent.midas.comm.APLog.e(TAG, "launchPayScoreContract params error");
            com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
            aPMidasResponse.resultCode = 3;
            aPMidasResponse.payChannel = -1;
            aPMidasResponse.payState = 2;
            aPMidasResponse.provideState = -1;
            aPMidasResponse.resultMsg = "签约参数错误";
            iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
            return;
        }
        try {
            fromApplicationContext = activity.getApplicationContext();
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
        }
        if (!ub.b.d()) {
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            com.tencent.midas.control.APMidasPayHelper.setEnv(env);
            com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
            com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.setScreenType(screenType);
            aPMidasPayHelper.payScoreContract(activity, aPMidasGoodsRequest, iAPMidasPayCallBack);
            return;
        }
        com.tencent.midas.comm.APLog.e("launchPayScoreContract", "fast click");
        com.tencent.midas.api.APMidasResponse aPMidasResponse2 = new com.tencent.midas.api.APMidasResponse();
        aPMidasResponse2.resultCode = -1;
        aPMidasResponse2.payChannel = -1;
        aPMidasResponse2.payState = 2;
        aPMidasResponse2.provideState = -1;
        aPMidasResponse2.resultMsg = "fast click";
        iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse2);
    }

    public static void launchPaySign(android.app.Activity activity, com.tencent.midas.api.request.APMidasGoodsRequest aPMidasGoodsRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "launchPaySign enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
            }
            if (ub.b.d()) {
                com.tencent.midas.comm.APLog.i("launchPaySign", "isfast");
                com.tencent.midas.comm.APLog.w(TAG, "launchPaySign enter fast:" + iAPMidasPayCallBack);
                com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
                aPMidasResponse.resultCode = -1;
                aPMidasResponse.payChannel = -1;
                aPMidasResponse.payState = 2;
                aPMidasResponse.provideState = -1;
                aPMidasResponse.resultMsg = "fast click";
                iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
                return;
            }
            if (android.text.TextUtils.isEmpty(aPMidasGoodsRequest.reserv)) {
                aPMidasGoodsRequest.reserv = "wechattype=sign";
            } else {
                aPMidasGoodsRequest.reserv += "&wechattype=sign";
            }
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            com.tencent.midas.control.APMidasPayHelper.setEnv(env);
            com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
            com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.setScreenType(screenType);
            aPMidasPayHelper.signPay(activity, aPMidasGoodsRequest, iAPMidasPayCallBack);
        }
    }

    public static void launchPurchaseFlow(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, final com.tencent.midas.api.APOnIabPurchaseFinished aPOnIabPurchaseFinished) {
        boolean z17;
        com.tencent.midas.comm.APLog.i(TAG, "launchPurchaseFlow enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper.setEnv(env);
            com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
            com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            if (aPMidasBaseRequest == null || !((z17 = aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasGoodsRequest))) {
                aPOnIabPurchaseFinished.onIabPurchaseFinished(new com.tencent.midas.api.request.APIabResult(3, ""), null);
                com.tencent.midas.comm.APLog.e("launchPurchaseFlow", "parameter is error");
                return;
            }
            if (z17) {
                ((com.tencent.midas.api.request.APMidasGoodsRequest) aPMidasBaseRequest).mIsReceiptMode = true;
            }
            com.tencent.midas.api.request.APMidasGoodsRequest aPMidasGoodsRequest = (com.tencent.midas.api.request.APMidasGoodsRequest) aPMidasBaseRequest;
            aPMidasGoodsRequest.isCanChange = false;
            aPMidasGoodsRequest.saveValue = "1";
            aPMidasGoodsRequest.tokenType = 2;
            launchPay(activity, aPMidasBaseRequest, new com.tencent.midas.api.IAPMidasPayCallBack() { // from class: com.tencent.midas.api.APMidasPayAPI.2
                @Override // com.tencent.midas.api.IAPMidasPayCallBack
                public void MidasPayCallBack(com.tencent.midas.api.APMidasResponse aPMidasResponse) {
                    int resultCode = aPMidasResponse.getResultCode();
                    if (aPMidasResponse.resultCode == 100) {
                        resultCode = 101;
                    }
                    com.tencent.midas.api.APOnIabPurchaseFinished.this.onIabPurchaseFinished(new com.tencent.midas.api.request.APIabResult(resultCode, aPMidasResponse.getResultMsg()), aPMidasResponse.getReceipt());
                }

                @Override // com.tencent.midas.api.IAPMidasPayCallBack
                public void MidasPayNeedLogin() {
                    com.tencent.midas.api.APOnIabPurchaseFinished.this.onIabyNeedLogin();
                }
            });
        }
    }

    public static void launchWXMiniProgram(android.content.Context context, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        com.tencent.midas.comm.APLog.i(TAG, "launchWXMiniProgram enter");
        if (checkParams(context)) {
            if (context instanceof android.app.Activity) {
                new com.tencent.midas.control.APMidasPayHelper().launchWXMiniProgram(context, bundle, resultReceiver);
                return;
            }
            com.tencent.midas.comm.APLog.e("launchAbility", "context is not Activity : " + context);
            if (!"release".equals(env)) {
                android.widget.Toast.makeText(context.getApplicationContext(), "Input context must be Activity", 1).show();
            }
            if (resultReceiver != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("midas_callback_ability_code", -998);
                bundle2.putString("midas_callback_ability_msg", "context is not Activity ");
                bundle2.putBundle("midas_callback_ability_data", new android.os.Bundle());
                resultReceiver.send(-101, bundle2);
            }
        }
    }

    public static void launchWXMiniProgram_OnResponse(android.content.Context context, int i17, android.os.Bundle bundle) {
        com.tencent.midas.comm.APLog.i(TAG, "launchWXMiniProgram_OnResponse enter");
        com.tencent.midas.comm.APLog.i(TAG, "launchWXMiniProgram_OnResponse enter: bundle = " + bundle);
        if (checkParams(context)) {
            if (context instanceof android.app.Activity) {
                new com.tencent.midas.control.APMidasPayHelper().launchWXMiniProgram_OnResponse(context, i17, bundle);
                return;
            }
            com.tencent.midas.comm.APLog.e("launchAbility", "context is not Activity : " + context);
            if ("release".equals(env)) {
                return;
            }
            android.widget.Toast.makeText(context.getApplicationContext(), "Input context must be Activity", 1).show();
        }
    }

    public static void launchWeChat(android.app.Activity activity, org.json.JSONObject jSONObject, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "launchWeChat enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
            }
            if (!ub.b.d()) {
                com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
                com.tencent.midas.control.APMidasPayHelper.setEnv(env);
                com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
                com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
                aPMidasPayHelper.setScreenType(screenType);
                aPMidasPayHelper.launchWeChat(activity, jSONObject, iAPMidasPayCallBack);
                return;
            }
            com.tencent.midas.comm.APLog.i("launchWeChat", "isfast");
            com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
            aPMidasResponse.resultCode = -1;
            aPMidasResponse.payChannel = -1;
            aPMidasResponse.payState = 2;
            aPMidasResponse.provideState = -1;
            aPMidasResponse.resultMsg = "fast click";
            iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
        }
    }

    public static void launchWeb(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.i(TAG, "launchWeb enter");
        if (checkParams(activity)) {
            try {
                fromApplicationContext = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.i("fromApplicationContext", e17.toString());
            }
            com.tencent.midas.data.APPluginReportManager.payDataRelease();
            com.tencent.midas.data.APPluginReportManager.getInstance().payInterfaceInit(aPMidasBaseRequest, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHWEB);
            com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeData(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHWEB, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHWEB);
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            com.tencent.midas.control.APMidasPayHelper.setEnv(env);
            com.tencent.midas.control.APMidasPayHelper.setLogEnable(logEnable);
            com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
            aPMidasPayHelper.setScreenType(screenType);
            aPMidasPayHelper.web(activity, aPMidasBaseRequest, iAPMidasPayCallBack);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 9 */
    public static void queryInventoryAsync(android.app.Activity activity, boolean z17, java.util.List<?> list, com.tencent.midas.api.request.APQueryInventoryFinishedListener aPQueryInventoryFinishedListener) {
        java.lang.Class<?> cls;
        com.tencent.midas.comm.APLog.i(TAG, "queryInventoryAsync enter");
        if (checkParams(activity)) {
            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
            try {
                cls = java.lang.Class.forName(java.util.List.class.getName());
            } catch (java.lang.ClassNotFoundException e17) {
                com.tencent.midas.comm.APLog.d(TAG, "queryInventoryAsync setEnv e:" + e17.toString());
                cls = null;
            }
            java.lang.Object call = aPMidasPayHelper.call(activity, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_XGAME_QUERY, new java.lang.Object[]{java.lang.Boolean.valueOf(z17), list, aPQueryInventoryFinishedListener}, new java.lang.Class[]{java.lang.Boolean.class, cls, com.tencent.midas.api.request.APQueryInventoryFinishedListener.class});
            com.tencent.midas.comm.APLog.i(TAG, "queryInventoryAsync ret " + call);
            if (call == null) {
                aPQueryInventoryFinishedListener.onQueryInventoryFinished(new com.tencent.midas.api.request.APIabResult(-1, ""), null);
            }
        }
    }

    public static void release(android.app.Activity activity) {
        com.tencent.midas.comm.APLog.i(TAG, "release() enter");
        com.tencent.midas.control.APMidasPayHelper.releaseSDK(activity);
    }

    public static void setCutoutEnable(boolean z17) {
        com.tencent.midas.control.APMidasPayHelper.cutoutEnable = z17;
    }

    public static void setEnv(java.lang.String str) {
        env = str;
        com.tencent.midas.control.APMidasPayHelper.setEnv(str);
        android.content.Context context = fromApplicationContext;
        if (context != null && (context instanceof android.app.Activity)) {
            new com.tencent.midas.control.APMidasPayHelper().call(fromApplicationContext, "setEnv", new java.lang.Class[]{java.lang.String.class}, new java.lang.Object[]{str});
        }
        com.tencent.midas.comm.APLog.d("MidasPluginSDK", "env= " + env);
    }

    public static <T extends com.tencent.midas.api.IMidasLogCallback> void setLogCallback(java.lang.Class<T> cls) {
        logCallbackClassName = cls.getName();
    }

    public static void setLogEnable(boolean z17) {
        logEnable = z17;
        com.tencent.midas.control.APMidasPayHelper.setLogEnable(z17);
        com.tencent.midas.control.APMidasPayHelper.setLogCallbackClassName(logCallbackClassName);
        android.content.Context context = fromApplicationContext;
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        new com.tencent.midas.control.APMidasPayHelper().call(fromApplicationContext, "setLogEnable", new java.lang.Class[]{java.lang.Boolean.TYPE}, new java.lang.Object[]{java.lang.Boolean.valueOf(z17)});
    }

    public static void setLongConnection(android.content.Context context, boolean z17) {
        com.tencent.midas.control.APMidasPayHelper.setLongConnection(context, z17);
    }

    public static void setParentClassloader(dalvik.system.DexClassLoader dexClassLoader) {
        com.tencent.midas.comm.APLog.i(TAG, "setParentClassloader enter classLoader:" + dexClassLoader);
        com.tencent.midas.plugin.APPluginLoader.setParentClassLoader(dexClassLoader);
    }

    public static void setPath(java.lang.String str) {
        com.tencent.midas.comm.APLog.i(TAG, "setPath enter path:" + str);
        dataPath = str;
    }

    public static void setScreenType(android.app.Activity activity, int i17) {
        screenType = i17;
    }

    public static void setSoMonitorCallback(com.tencent.midas.api.IMidasSoCallback iMidasSoCallback) {
        com.tencent.midas.control.APMidasPayHelper.midasSoCallback = iMidasSoCallback;
    }

    public static void init(android.content.Context context, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, android.os.ResultReceiver resultReceiver) {
        initCommon(context, aPMidasBaseRequest);
        if (checkInitCommParam(context, aPMidasBaseRequest)) {
            com.tencent.midas.control.APMidasPayHelper.init(context, aPMidasBaseRequest, resultReceiver);
        } else {
            com.tencent.midas.control.APMidasPayHelper.isNewProcess = com.tencent.midas.control.APMidasPayHelper.isNewProcess(context);
        }
    }
}

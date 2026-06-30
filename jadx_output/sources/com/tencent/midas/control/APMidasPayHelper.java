package com.tencent.midas.control;

/* loaded from: classes13.dex */
public class APMidasPayHelper implements com.tencent.midas.control.APCallBackResultReceiver.Receiver {
    public static java.lang.String MED_DISTRIBUTE_CALL = "openMidasCall";
    public static java.lang.String MED_DISTRIBUTE_CALL2 = "openMidasCall2";
    public static final java.lang.String MED_DISTRIBUTE_CALLBACK_FROM_MIDAS_PAY = "callbackFromMidasPay";
    public static java.lang.String MED_DISTRIBUTE_DIRECT_PAY = "openMidasDirectPay";
    public static java.lang.String MED_DISTRIBUTE_H5PAY = "openMidasH5Pay";
    public static java.lang.String MED_DISTRIBUTE_HANDLE_QQ_WALLET_INTENT = "handleQQWalletIntent";
    public static java.lang.String MED_DISTRIBUTE_HANDLE_WX_INTENT = "handleWXIntent";
    public static final java.lang.String MED_DISTRIBUTE_HF_COUPONS_ROLLBACK = "hfCouponsRollBack";
    public static java.lang.String MED_DISTRIBUTE_INFO = "openMidasInfo";
    public static java.lang.String MED_DISTRIBUTE_INIT = "golbalInit";
    public static java.lang.String MED_DISTRIBUTE_LongConnection = "setLongConnection";
    public static java.lang.String MED_DISTRIBUTE_NET = "openMidasNet";
    public static java.lang.String MED_DISTRIBUTE_PAY = "openMidasPay";
    public static java.lang.String MED_DISTRIBUTE_PYA_SCORE_CONTRACT = "openMidasPayScoreContract";
    public static java.lang.String MED_DISTRIBUTE_RECEIVE = "receiveMidas";
    public static java.lang.String MED_DISTRIBUTE_RELEASE = "release";
    public static java.lang.String MED_DISTRIBUTE_SIGN_PAY = "openMidasSignPay";
    public static java.lang.String MED_DISTRIBUTE_WEB = "openMidasWeb";
    public static java.lang.String MED_DISTRIBUTE_WECHATPAY = "openMidasWechatPay";
    public static final java.lang.String MED_DISTRIBUTE_WX_MINIPROGRAM = "launchWXMiniProgram";
    public static final java.lang.String MED_DISTRIBUTE_WX_MINIPROGRAM_ONRESPONSE = "launchWXMiniProgram_OnResponse";
    public static final java.lang.String MED_DISTRIBUTE_XGAME_CONSUME = "consumeAsync";
    public static final java.lang.String MED_DISTRIBUTE_XGAME_QUERY = "queryInventoryAsync";
    public static int MIDAS_INNER_WEBVIEW = 0;
    public static int MIDAS_OUT_WEBVIEW = 1;
    public static java.lang.String MIDAS_PLUGIN_NAME = "MidasPay";
    public static final java.lang.String MIDAS_PLUGIN_VERSION = "1.9.9m";
    public static int MIDAS_WEBVIEW = 0;
    public static java.lang.String PKG_DISTRIBUTE = "com.tencent.midas.pay.APMidasDistribute";
    public static final int PLUGIN_INITFAIL = 2;
    private static final int PLUGIN_INITIDLE = -1;
    public static final int PLUGIN_INITING = 0;
    public static final int PLUGIN_INITSUCC = 1;
    private static final int RET_CHANGE_H5 = -100011;
    private static final java.lang.String RET_MSG_CHANGE_H5 = "needChangeH5";
    private static final java.lang.String TAG = "APMidasPayHelper";
    public static boolean cutoutEnable = false;
    private static java.lang.String env = "release";
    public static boolean hasCheckedProcess = false;
    private static int initCount = 0;
    private static com.tencent.midas.api.request.APMidasBaseRequest initRequest = null;
    public static int initState = -1;
    private static boolean isInitSucc = false;
    private static boolean isNeedLocalUpdate = false;
    public static boolean isNewProcess = false;
    public static boolean isPayCenterSDK = false;
    private static java.lang.String logCallbackClassName = "";
    private static boolean logEnable = false;
    public static com.tencent.midas.api.IAPMidasPayCallBack midasCallBack = null;
    public static com.tencent.midas.api.IMidasSoCallback midasSoCallback = null;
    public static com.tencent.midas.api.IAPMidasNetCallBack netCallBack = null;
    private static java.lang.String netCallBack_ReqType = "";
    private static com.tencent.midas.control.APCallBackResultReceiver remotRecevier;
    public static com.tencent.midas.api.request.APMidasBaseRequest requestObject;
    public static com.tencent.midas.api.IAPWebView sIWebView;
    public static android.content.Context staticActivityContext;
    public static android.webkit.WebView webview;
    public static com.tencent.smtt.sdk.WebView x5Webview;
    private byte _hellAccFlag_;
    private static java.lang.Object initObject = new java.lang.Object();
    private static java.lang.Object dexloadObject = new java.lang.Object();
    private static java.lang.Object loadingObject = new java.lang.Object();
    public int saveType = 0;
    public int screenType = 0;
    java.lang.Object retobj = null;

    public static /* synthetic */ int access$508() {
        int i17 = initCount;
        initCount = i17 + 1;
        return i17;
    }

    public static synchronized java.lang.String getJSContent(android.content.Context context) {
        java.lang.String str;
        synchronized (com.tencent.midas.control.APMidasPayHelper.class) {
            com.tencent.midas.comm.APLog.i(TAG, "getJSContent");
            init(context, null);
            str = (java.lang.String) new com.tencent.midas.control.APMidasPayHelper().callWithContext(context, "getH5JS", new java.lang.Object[]{context});
        }
        return str;
    }

    public static java.lang.String getLogCallbackClassName() {
        return logCallbackClassName;
    }

    public static synchronized void h5Init(final android.app.Activity activity, android.webkit.WebView webView, com.tencent.smtt.sdk.WebView webView2) {
        synchronized (com.tencent.midas.control.APMidasPayHelper.class) {
            com.tencent.midas.comm.APLog.i(TAG, "h5Init");
            com.tencent.midas.data.APPluginReportManager.getInstance().reportImmediatelyOneRecord(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_H5_INIT, "");
            x5Webview = webView2;
            webview = webView;
            isNewProcess = isNewProcess(activity);
            if (initCount < 1) {
                com.tencent.midas.plugin.APPluginUtils.release();
                preLoadPlugin(activity, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new com.tencent.midas.control.IAPInitCallBack() { // from class: com.tencent.midas.control.APMidasPayHelper.4
                    @Override // com.tencent.midas.control.IAPInitCallBack
                    public void result(int i17, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
                        com.tencent.midas.comm.APLog.i(com.tencent.midas.control.APMidasPayHelper.TAG, "init ret:" + i17 + " msg:" + str);
                        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                        if (i17 == 0) {
                            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
                            android.app.Activity activity2 = activity;
                            java.lang.String str3 = (java.lang.String) aPMidasPayHelper.call(activity2, "getH5JS", new java.lang.Object[]{activity2});
                            if (!android.text.TextUtils.isEmpty(str3)) {
                                try {
                                    android.webkit.WebView webView3 = com.tencent.midas.control.APMidasPayHelper.webview;
                                    if (webView3 != null) {
                                        webView3.loadUrl("javascript:" + str3);
                                    }
                                    com.tencent.smtt.sdk.WebView webView4 = com.tencent.midas.control.APMidasPayHelper.x5Webview;
                                    if (webView4 != null) {
                                        webView4.loadUrl("javascript:" + str3);
                                    }
                                    com.tencent.midas.data.APPluginReportManager.getInstance().reportImmediatelyOneRecord(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_H5_LOAD_JS, "");
                                } catch (java.lang.Exception e17) {
                                    com.tencent.midas.comm.APLog.w(com.tencent.midas.control.APMidasPayHelper.TAG, "h5Init loadJS error:" + e17.toString());
                                }
                            }
                            boolean unused = com.tencent.midas.control.APMidasPayHelper.isInitSucc = true;
                            com.tencent.midas.control.APMidasPayHelper.access$508();
                        }
                    }
                });
            } else {
                java.lang.String str = (java.lang.String) new com.tencent.midas.control.APMidasPayHelper().call(activity, "getH5JS", new java.lang.Object[]{activity});
                if (!android.text.TextUtils.isEmpty(str)) {
                    try {
                        if (webview != null) {
                            webView.loadUrl("javascript:" + str);
                        }
                        com.tencent.smtt.sdk.WebView webView3 = x5Webview;
                        if (webView3 != null) {
                            webView3.loadUrl("javascript:" + str);
                        }
                        com.tencent.midas.data.APPluginReportManager.getInstance().reportImmediatelyOneRecord(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_H5_LOAD_JS, "");
                    } catch (java.lang.Exception e17) {
                        com.tencent.midas.comm.APLog.w(TAG, "h5Init loadJS error:" + e17.toString());
                    }
                }
            }
        }
    }

    public static synchronized void h5InitUnifier(final android.app.Activity activity, com.tencent.midas.api.IAPWebView iAPWebView) {
        synchronized (com.tencent.midas.control.APMidasPayHelper.class) {
            com.tencent.midas.comm.APLog.i(TAG, "h5InitUnifier");
            sIWebView = iAPWebView;
            isNewProcess = isNewProcess(activity);
            if (initCount < 1) {
                com.tencent.midas.plugin.APPluginUtils.release();
                preLoadPlugin(activity, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new com.tencent.midas.control.IAPInitCallBack() { // from class: com.tencent.midas.control.APMidasPayHelper.3
                    @Override // com.tencent.midas.control.IAPInitCallBack
                    public void result(int i17, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
                        com.tencent.midas.comm.APLog.i(com.tencent.midas.control.APMidasPayHelper.TAG, "h5InitUnifier ret:" + i17 + " msg:" + str);
                        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                        if (i17 == 0) {
                            com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = new com.tencent.midas.control.APMidasPayHelper();
                            android.app.Activity activity2 = activity;
                            java.lang.String str3 = (java.lang.String) aPMidasPayHelper.call(activity2, "getH5JS", new java.lang.Object[]{activity2});
                            if (!android.text.TextUtils.isEmpty(str3)) {
                                try {
                                    com.tencent.midas.api.IAPWebView iAPWebView2 = com.tencent.midas.control.APMidasPayHelper.sIWebView;
                                    if (iAPWebView2 != null) {
                                        iAPWebView2.loadUrl("javascript:" + str3);
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.tencent.midas.comm.APLog.w(com.tencent.midas.control.APMidasPayHelper.TAG, "h5InitUnifier loadJS error:" + e17.toString());
                                }
                            }
                            boolean unused = com.tencent.midas.control.APMidasPayHelper.isInitSucc = true;
                            com.tencent.midas.control.APMidasPayHelper.access$508();
                        }
                    }
                });
            } else {
                java.lang.String str = (java.lang.String) new com.tencent.midas.control.APMidasPayHelper().call(activity, "getH5JS", new java.lang.Object[]{activity});
                if (!android.text.TextUtils.isEmpty(str)) {
                    try {
                        com.tencent.midas.api.IAPWebView iAPWebView2 = sIWebView;
                        if (iAPWebView2 != null) {
                            iAPWebView2.loadUrl("javascript:" + str);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.midas.comm.APLog.w(TAG, "h5InitUnifier loadJS error:" + e17.toString());
                    }
                }
            }
        }
    }

    public static synchronized void init(android.content.Context context, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        synchronized (com.tencent.midas.control.APMidasPayHelper.class) {
            init(context, aPMidasBaseRequest, null);
        }
    }

    public static boolean isLogEnable() {
        return logEnable;
    }

    public static boolean isNewProcess(android.content.Context context) {
        if (hasCheckedProcess) {
            return isNewProcess;
        }
        try {
            hasCheckedProcess = true;
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
            hasCheckedProcess = false;
        }
        return false;
    }

    public static void midasCallBack(com.tencent.midas.api.APMidasResponse aPMidasResponse) {
        if (aPMidasResponse != null && aPMidasResponse.resultCode == RET_CHANGE_H5 && RET_MSG_CHANGE_H5.equals(aPMidasResponse.resultMsg) && com.tencent.midas.jsbridge.APWebJSBridgeActivity.startPureH5Pay(staticActivityContext, "", "change_h5_from_cgi")) {
            staticActivityContext = null;
            return;
        }
        com.tencent.midas.comm.APLog.i(TAG, "midasCallBack resultCode :" + aPMidasResponse.resultCode + " midasCallBack:" + midasCallBack);
        com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack = midasCallBack;
        if (iAPMidasPayCallBack != null) {
            iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
            midasCallBack = null;
        }
        com.tencent.midas.control.APCallBackResultReceiver aPCallBackResultReceiver = remotRecevier;
        if (aPCallBackResultReceiver != null) {
            aPCallBackResultReceiver.setReceiver(null);
            remotRecevier = null;
        }
        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
        requestObject = null;
        com.tencent.midas.plugin.APPluginUtils.release();
        com.tencent.midas.comm.APLog.closeLog();
        staticActivityContext = null;
    }

    public static void midasH5CallBack(java.lang.String str) {
        com.tencent.midas.comm.APLog.i(TAG, "midasH5CallBack params:" + str + " webview:" + webview + " x5Webview:" + x5Webview);
        android.webkit.WebView webView = webview;
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.w(TAG, "midasH5CallBack error:" + e17.toString());
            }
        }
        com.tencent.smtt.sdk.WebView webView2 = x5Webview;
        if (webView2 != null) {
            try {
                webView2.loadUrl(str);
            } catch (java.lang.Exception e18) {
                com.tencent.midas.comm.APLog.w(TAG, "midasH5CallBack error:" + e18.toString());
            }
        }
        com.tencent.midas.control.APCallBackResultReceiver aPCallBackResultReceiver = remotRecevier;
        if (aPCallBackResultReceiver != null) {
            aPCallBackResultReceiver.setReceiver(null);
            remotRecevier = null;
        }
        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
        com.tencent.midas.plugin.APPluginUtils.release();
        com.tencent.midas.comm.APLog.closeLog();
        staticActivityContext = null;
        requestObject = null;
    }

    public static void midasLoginExpire() {
        com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack = midasCallBack;
        if (iAPMidasPayCallBack != null) {
            iAPMidasPayCallBack.MidasPayNeedLogin();
            midasCallBack = null;
        }
        com.tencent.midas.control.APCallBackResultReceiver aPCallBackResultReceiver = remotRecevier;
        if (aPCallBackResultReceiver != null) {
            aPCallBackResultReceiver.setReceiver(null);
            remotRecevier = null;
        }
        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY);
        com.tencent.midas.plugin.APPluginUtils.release();
        com.tencent.midas.comm.APLog.closeLog();
        staticActivityContext = null;
        requestObject = null;
    }

    public static void onNetError(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack = netCallBack;
        if (iAPMidasNetCallBack != null) {
            iAPMidasNetCallBack.MidasNetError(str, num.intValue(), str2);
            netCallBack = null;
            netCallBack_ReqType = "";
        }
        staticActivityContext = null;
    }

    public static void onNetFinish(java.lang.String str, java.lang.String str2) {
        com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack = netCallBack;
        if (iAPMidasNetCallBack != null) {
            iAPMidasNetCallBack.MidasNetFinish(str, str2);
            netCallBack = null;
            netCallBack_ReqType = "";
        }
        staticActivityContext = null;
    }

    public static void onNetStop(java.lang.String str) {
        com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack = netCallBack;
        if (iAPMidasNetCallBack != null) {
            iAPMidasNetCallBack.MidasNetStop(str);
            netCallBack = null;
            netCallBack_ReqType = "";
        }
        staticActivityContext = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openPlugin(android.app.Activity activity, android.content.Intent intent, java.lang.String str) {
        java.lang.Object obj;
        com.tencent.midas.comm.APLog.d(TAG, "Calling into openPlugin, method = " + str + " caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        try {
            obj = com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(activity, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, str, new java.lang.Object[]{activity, intent});
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.e(TAG, "openPlugin e:" + e17.toString());
            obj = null;
        }
        try {
            com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface());
        } catch (java.lang.Exception e18) {
            com.tencent.midas.comm.APLog.i(TAG, "openPlugin dataReport:" + e18.toString());
        }
        com.tencent.midas.comm.APLog.i(TAG, "openPlugin obj:" + obj);
    }

    private void pluginInitErrCallBack(final android.app.Activity activity) {
        com.tencent.midas.comm.APLog.i(TAG, "pluginInitErrCallBack" + midasCallBack);
        if (com.tencent.midas.jsbridge.APWebJSBridgeActivity.startPureH5Pay(activity, com.tencent.midas.plugin.APPluginUtils.getInitErrorMsg(), "pluginInitErrCallBack")) {
            return;
        }
        activity.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.14
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_FORMAT_APKLOAD_ERROR, "", com.tencent.midas.plugin.APPluginUtils.getInitErrorMsg());
                android.widget.Toast.makeText(activity, "腾讯支付服务加载失败，请退出重试", 1).show();
                com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
                aPMidasResponse.resultCode = -100;
                com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack = com.tencent.midas.control.APMidasPayHelper.midasCallBack;
                if (iAPMidasPayCallBack != null) {
                    iAPMidasPayCallBack.MidasPayCallBack(aPMidasResponse);
                    com.tencent.midas.control.APMidasPayHelper.midasCallBack = null;
                    com.tencent.midas.control.APMidasPayHelper.requestObject = null;
                    com.tencent.midas.control.APMidasPayHelper.staticActivityContext = null;
                }
                com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack = com.tencent.midas.control.APMidasPayHelper.netCallBack;
                if (iAPMidasNetCallBack != null) {
                    iAPMidasNetCallBack.MidasNetError(com.tencent.midas.control.APMidasPayHelper.netCallBack_ReqType, -100, "腾讯支付服务加载失败，请退出重试");
                    com.tencent.midas.control.APMidasPayHelper.netCallBack = null;
                    java.lang.String unused = com.tencent.midas.control.APMidasPayHelper.netCallBack_ReqType = "";
                    com.tencent.midas.control.APMidasPayHelper.requestObject = null;
                    com.tencent.midas.control.APMidasPayHelper.staticActivityContext = null;
                }
                com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preLoadMidasPay(final android.content.Context context, final java.lang.String str, final com.tencent.midas.control.IAPInitCallBack iAPInitCallBack) {
        int i17;
        com.tencent.midas.comm.APLog.d(TAG, "Calling into preLoadMidasPay " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.tencent.midas.plugin.APPluginUtils.deletePluginOat(context);
        if (isPayCenterSDK) {
            com.tencent.midas.comm.APIPConfig.loadIPMappingFile(context);
        }
        java.lang.System.currentTimeMillis();
        if (isNeedLocalUpdate) {
            com.tencent.midas.comm.APLog.d(TAG, "Calling into preLoadMidasPay isNeedLocalUpdate == true");
            com.tencent.midas.plugin.APPluginInstallerAndUpdater.installFromLocal(context);
            com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_INSTALL_FROM_LOCAL, java.lang.System.currentTimeMillis());
            isNeedLocalUpdate = false;
        } else {
            com.tencent.midas.comm.APLog.d(TAG, "Calling into preLoadMidasPay isNeedLocalUpdate == false");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int isNeedUpdateFromAssets = com.tencent.midas.plugin.APPluginInstallerAndUpdater.isNeedUpdateFromAssets(context, env);
        com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_IS_NEED_ASSETS_UPDATE, currentTimeMillis);
        com.tencent.midas.comm.APLog.d(TAG, "preLoadMidasPay isNeedUpdateFromAssets = " + isNeedUpdateFromAssets);
        if (isNeedUpdateFromAssets > 0) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            i17 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.installPlugin(context, isNeedUpdateFromAssets);
            com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_INSTALL_FROM_ASSETS, currentTimeMillis2);
        } else {
            i17 = 0;
        }
        com.tencent.midas.comm.APLog.i(TAG, "preLoadMidasPay installPlugin ret:" + i17 + " initRequest:" + initRequest);
        synchronized (initObject) {
            if (i17 != 0) {
                initCount = 0;
                initState = 2;
                if (iAPInitCallBack != null) {
                    iAPInitCallBack.result(-1, com.tencent.midas.plugin.APPluginUtils.getInitErrorMsg(), str, null);
                }
            } else {
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                boolean isPluginValid = com.tencent.midas.plugin.APPluginChecker.isPluginValid(context);
                com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_PLUGIN_VALID, currentTimeMillis3);
                if (isPluginValid) {
                    try {
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        com.tencent.midas.plugin.APPluginLoader.preCreateClassLoaderByPath(context);
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LOAD_DEX, currentTimeMillis4);
                    } catch (java.lang.Exception e17) {
                        com.tencent.midas.comm.APLog.e(TAG, "preLoadMidasPay preCreateClassLoaderByPath e: " + e17.toString());
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
                                    com.tencent.midas.api.request.APMidasBaseRequest r2 = com.tencent.midas.control.APMidasPayHelper.access$200()
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "env"
                                    java.lang.String r2 = com.tencent.midas.control.APMidasPayHelper.access$300()
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "logEnable"
                                    boolean r2 = com.tencent.midas.control.APMidasPayHelper.access$400()
                                    r0.putExtra(r1, r2)
                                    java.lang.String r1 = "launchInterfaceName"
                                    java.lang.String r2 = r1
                                    r0.putExtra(r1, r2)
                                    android.content.Context r1 = r2
                                    android.app.Activity r1 = (android.app.Activity) r1
                                    r2 = 0
                                    long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L5f
                                    java.lang.String r5 = com.tencent.midas.control.APMidasPayHelper.MIDAS_PLUGIN_NAME     // Catch: java.lang.Exception -> L5f
                                    java.lang.String r6 = com.tencent.midas.control.APMidasPayHelper.PKG_DISTRIBUTE     // Catch: java.lang.Exception -> L5f
                                    java.lang.String r7 = com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_INIT     // Catch: java.lang.Exception -> L5f
                                    java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch: java.lang.Exception -> L5f
                                    java.lang.Object r0 = com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(r1, r5, r6, r7, r0)     // Catch: java.lang.Exception -> L5f
                                    com.tencent.midas.data.APPluginReportManager r1 = com.tencent.midas.data.APPluginReportManager.getInstance()     // Catch: java.lang.Exception -> L5d
                                    java.lang.String r5 = r1     // Catch: java.lang.Exception -> L5d
                                    java.lang.String r6 = "sdk.plugin.init.kernel.totaltime"
                                    r1.insertTimeDataEx(r5, r6, r3)     // Catch: java.lang.Exception -> L5d
                                    com.tencent.midas.control.IAPInitCallBack r1 = r3     // Catch: java.lang.Exception -> L5d
                                    if (r1 == 0) goto L6f
                                    java.lang.String r3 = "succ"
                                    java.lang.String r4 = r4     // Catch: java.lang.Exception -> L5d
                                    r5 = 0
                                    r1.result(r5, r3, r4, r2)     // Catch: java.lang.Exception -> L5d
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
                                    r3.result(r5, r1, r4, r2)
                                L6f:
                                    java.lang.String r1 = "APMidasPayHelper"
                                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                    java.lang.String r3 = "preLoadMidasPay openPlugin obj:"
                                    r2.<init>(r3)
                                    r2.append(r0)
                                    java.lang.String r0 = r2.toString()
                                    com.tencent.midas.comm.APLog.i(r1, r0)
                                    com.tencent.midas.data.APPluginReportManager r0 = com.tencent.midas.data.APPluginReportManager.getInstance()
                                    java.lang.String r1 = r1
                                    java.lang.String r2 = "sdk.plugin.init.totaltime"
                                    r0.insertTimeData(r1, r2)
                                    java.lang.String r0 = "APMidasPayHelper"
                                    java.lang.String r1 = "preLoadMidasPay initState = PLUGIN_INITSUCC"
                                    com.tencent.midas.comm.APLog.i(r0, r1)
                                    r0 = 1
                                    com.tencent.midas.control.APMidasPayHelper.initState = r0
                                    java.lang.Object r0 = com.tencent.midas.control.APMidasPayHelper.access$600()
                                    monitor-enter(r0)
                                    java.lang.Object r1 = com.tencent.midas.control.APMidasPayHelper.access$600()     // Catch: java.lang.Throwable -> La5
                                    r1.notifyAll()     // Catch: java.lang.Throwable -> La5
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
                                    return
                                La5:
                                    r1 = move-exception
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.control.APMidasPayHelper.AnonymousClass13.run():void");
                            }
                        });
                    } else {
                        initState = 1;
                        synchronized (loadingObject) {
                            loadingObject.notifyAll();
                        }
                    }
                } else {
                    com.tencent.midas.comm.APLog.i(TAG, "preLoadMidasPay isPluginValid false");
                    com.tencent.midas.plugin.APPluginInstallerAndUpdater.unInstallPlugin(context);
                    initState = -1;
                    if (iAPInitCallBack != null) {
                        initCount = 0;
                        iAPInitCallBack.result(-1, "支付插件校验失败", str, null);
                    }
                    synchronized (loadingObject) {
                        loadingObject.notifyAll();
                    }
                }
            }
        }
    }

    private static void preLoadPlugin(final android.content.Context context, final java.lang.String str, final com.tencent.midas.control.IAPInitCallBack iAPInitCallBack) {
        synchronized (initObject) {
            initState = 0;
        }
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.12
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.midas.control.APMidasPayHelper.preLoadMidasPay(context, str, iAPInitCallBack);
            }
        });
        thread.setName(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface());
        thread.start();
    }

    public static void release(android.content.Context context) {
        com.tencent.midas.comm.APLog.d(TAG, "release");
        com.tencent.midas.plugin.APPluginInstallerAndUpdater.unInstallPlugin(context);
        synchronized (initObject) {
            initState = -1;
        }
    }

    public static void releaseSDK(android.app.Activity activity) {
        midasSoCallback = null;
        midasCallBack = null;
        netCallBack = null;
        remotRecevier = null;
        new com.tencent.midas.control.APMidasPayHelper().call(activity, MED_DISTRIBUTE_RELEASE, new java.lang.Object[0]);
    }

    public static void setEnv(java.lang.String str) {
        if (!"release".equals(str) && !"test".equals(str) && !com.tencent.midas.api.APMidasPayAPI.ENV_DEV.equals(str) && !"debug".equals(str) && !com.tencent.midas.api.APMidasPayAPI.ENV_TESTING.equals(str)) {
            str = "release";
        }
        env = str;
    }

    public static void setLogCallbackClassName(java.lang.String str) {
        logCallbackClassName = str;
    }

    public static void setLogEnable(boolean z17) {
        logEnable = z17;
    }

    public static synchronized void setLongConnection(android.content.Context context, boolean z17) {
        synchronized (com.tencent.midas.control.APMidasPayHelper.class) {
            com.tencent.midas.comm.APLog.i(TAG, "setLongConnection to open = " + z17);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("version", "1.9.9m");
            intent.putExtra("env", env);
            intent.putExtra("logEnable", logEnable);
            intent.putExtra("openLongConnection", z17);
            intent.putExtra("launchInterfaceName", java.lang.Thread.currentThread().getName());
            try {
                com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(context, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, MED_DISTRIBUTE_LongConnection, new java.lang.Object[]{context, intent});
            } catch (java.lang.Exception e17) {
                com.tencent.midas.comm.APLog.i(TAG, "initcallback isInitSucc direct call init function e:" + e17.toString());
            }
        }
    }

    private int toH5Midas(final android.app.Activity activity, android.webkit.WebView webView, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        com.tencent.midas.comm.APLog.i(TAG, "toH5Midas initState: " + initState);
        synchronized (initObject) {
            final android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(activity);
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(0);
            progressDialog.setTitle("温馨提示");
            progressDialog.setMessage("腾讯支付服务初始化中");
            int i17 = initState;
            if (i17 == -1 || i17 == 0) {
                try {
                    progressDialog.show();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (initState == -1) {
                preLoadPlugin(activity, str4, null);
            }
            if (initState == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.10
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (com.tencent.midas.control.APMidasPayHelper.loadingObject) {
                                com.tencent.midas.control.APMidasPayHelper.loadingObject.wait();
                            }
                        } catch (java.lang.InterruptedException e17) {
                            com.tencent.midas.comm.APLog.w(com.tencent.midas.control.APMidasPayHelper.TAG, "toH5Midas e:" + e17.toString());
                        }
                        try {
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.tencent.midas.control.APMidasPayHelper.this.toH5MidasPay(activity, str, str2, str3);
                    }
                }).start();
                return 0;
            }
            return toH5MidasPay(activity, str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toH5MidasPay(final android.app.Activity activity, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        synchronized (initObject) {
            if (initState != 2) {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.11
                    @Override // java.lang.Runnable
                    public void run() {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("version", com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion());
                        intent.putExtra("env", com.tencent.midas.control.APMidasPayHelper.env);
                        intent.putExtra("screenType", com.tencent.midas.control.APMidasPayHelper.this.screenType);
                        intent.putExtra("logEnable", com.tencent.midas.control.APMidasPayHelper.logEnable);
                        intent.putExtra("req", "H5Pay");
                        intent.putExtra("url", str);
                        intent.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str2);
                        intent.putExtra("reqType", com.tencent.midas.control.APMidasPayHelper.netCallBack_ReqType);
                        try {
                            com.tencent.midas.data.APMultiProcessData processData = com.tencent.midas.data.APPluginDataInterface.singleton().getProcessData();
                            if (processData != null) {
                                intent.putExtra("launchPayGUID", processData.getGuid());
                                intent.putExtra("launchPayTime", processData.getPayInterfaceTime());
                                intent.putExtra("launchPayDataid", com.tencent.midas.data.APDataId.getDataId());
                                intent.putExtra("launchIntervalTime", processData.getIntervalTime());
                            }
                        } catch (java.lang.Exception unused) {
                        }
                        if (com.tencent.midas.control.APMidasPayHelper.isNewProcess) {
                            com.tencent.midas.control.APCallBackResultReceiver unused2 = com.tencent.midas.control.APMidasPayHelper.remotRecevier = new com.tencent.midas.control.APCallBackResultReceiver(new android.os.Handler());
                            com.tencent.midas.control.APMidasPayHelper.remotRecevier.setReceiver(com.tencent.midas.control.APMidasPayHelper.this);
                            intent.putExtra("remoteReceiver", com.tencent.midas.control.APMidasPayHelper.remotRecevier);
                        }
                        com.tencent.midas.control.APMidasPayHelper.this.openPlugin(activity, intent, str3);
                    }
                });
                return 0;
            }
            com.tencent.midas.comm.APLog.i(TAG, "toH5MidasPay plugin init error");
            pluginInitErrCallBack(activity);
            initState = -1;
            return -1;
        }
    }

    private int toMidas(final android.app.Activity activity, final com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, final java.lang.String str, final java.lang.String str2) {
        if (aPMidasBaseRequest == null) {
            com.tencent.midas.comm.APLog.w(TAG, "toMidas pay request is null");
            return -1;
        }
        requestObject = aPMidasBaseRequest;
        staticActivityContext = activity.getApplicationContext();
        com.tencent.midas.comm.APLog.i(TAG, "ToMidas initState = " + initState);
        synchronized (initObject) {
            final android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(activity);
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(0);
            progressDialog.setTitle("温馨提示");
            progressDialog.setMessage("腾讯支付服务初始化中");
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean isNeedUpdateFromLocal = com.tencent.midas.plugin.APPluginInstallerAndUpdater.isNeedUpdateFromLocal(activity);
            isNeedLocalUpdate = isNeedUpdateFromLocal;
            if (isNeedUpdateFromLocal) {
                synchronized (initObject) {
                    initState = -1;
                }
            }
            int i17 = initState;
            if ((i17 == -1 || i17 == 0) && !MED_DISTRIBUTE_NET.equals(str) && !MED_DISTRIBUTE_INFO.equals(str)) {
                try {
                    progressDialog.show();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (initState == 1 && !com.tencent.midas.plugin.APPluginChecker.isPluginExists(activity)) {
                initState = -1;
            }
            if (initState == -1) {
                if (isNeedLocalUpdate) {
                    releaseSDK(activity);
                }
                preLoadPlugin(activity, str2, null);
            }
            if (initState == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (com.tencent.midas.control.APMidasPayHelper.loadingObject) {
                                com.tencent.midas.control.APMidasPayHelper.loadingObject.wait();
                            }
                        } catch (java.lang.InterruptedException e17) {
                            com.tencent.midas.comm.APLog.w(com.tencent.midas.control.APMidasPayHelper.TAG, e17.toString());
                        }
                        try {
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHPAY_WAIT_INIT, currentTimeMillis);
                        com.tencent.midas.control.APMidasPayHelper.this.toMidasPay(activity, aPMidasBaseRequest, str, str2);
                    }
                }).start();
                return 0;
            }
            return toMidasPay(activity, aPMidasBaseRequest, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toMidasPay(final android.app.Activity activity, final com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, final java.lang.String str, java.lang.String str2) {
        synchronized (initObject) {
            if (initState == 2) {
                com.tencent.midas.comm.APLog.i(TAG, "toMidasPay plugin init error");
                pluginInitErrCallBack(activity);
                initState = -1;
                return -1;
            }
            requestObject = aPMidasBaseRequest;
            staticActivityContext = activity.getApplicationContext();
            isNewProcess = isNewProcess(activity);
            try {
                this.screenType = activity.getResources().getConfiguration().orientation;
            } catch (java.lang.Exception unused) {
            }
            try {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.9
                    @Override // java.lang.Runnable
                    public void run() {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("version", com.tencent.midas.api.APMidasPayAPI.getMidasPluginVersion());
                        intent.putExtra("env", com.tencent.midas.control.APMidasPayHelper.env);
                        intent.putExtra("screenType", com.tencent.midas.control.APMidasPayHelper.this.screenType);
                        intent.putExtra("logEnable", com.tencent.midas.control.APMidasPayHelper.logEnable);
                        intent.putExtra("req", aPMidasBaseRequest);
                        intent.putExtra("reqType", com.tencent.midas.control.APMidasPayHelper.netCallBack_ReqType);
                        intent.putExtra(ya.b.METHOD, str);
                        if (com.tencent.midas.control.APMidasPayHelper.isNewProcess) {
                            com.tencent.midas.control.APCallBackResultReceiver unused2 = com.tencent.midas.control.APMidasPayHelper.remotRecevier = new com.tencent.midas.control.APCallBackResultReceiver(new android.os.Handler());
                            com.tencent.midas.control.APMidasPayHelper.remotRecevier.setReceiver(com.tencent.midas.control.APMidasPayHelper.this);
                            intent.putExtra("remoteReceiver", com.tencent.midas.control.APMidasPayHelper.remotRecevier);
                        }
                        intent.putExtra("launchInterfaceName", com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface());
                        try {
                            com.tencent.midas.data.APMultiProcessData processData = com.tencent.midas.data.APPluginDataInterface.singleton().getProcessData();
                            if (processData != null) {
                                intent.putExtra("launchPayGUID", processData.getGuid());
                                intent.putExtra("launchPayTime", processData.getPayInterfaceTime());
                                intent.putExtra("launchPayDataid", com.tencent.midas.data.APDataId.getDataId());
                                intent.putExtra("launchIntervalTime", processData.getIntervalTime());
                            }
                        } catch (java.lang.Exception unused3) {
                        }
                        com.tencent.midas.control.APMidasPayHelper.this.openPlugin(activity, intent, str);
                    }
                });
                return 0;
            } catch (java.lang.Exception unused2) {
                return 0;
            }
        }
    }

    private void waitingPluginReady(android.content.Context context, final android.os.ResultReceiver resultReceiver) {
        if ("test".equals(env) && initCount < 1) {
            android.widget.Toast.makeText(context, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        if (isNewProcess) {
            com.tencent.midas.comm.APPluginDataStorage.storeData(context, com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "launchpaycalling", "1");
        }
        com.tencent.midas.comm.APLog.i(TAG, "ToMidas initState = " + initState);
        synchronized (initObject) {
            final android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(context);
            progressDialog.setIndeterminate(false);
            progressDialog.setProgressStyle(0);
            progressDialog.setTitle("温馨提示");
            progressDialog.setMessage("腾讯支付服务初始化中");
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean isNeedUpdateFromLocal = com.tencent.midas.plugin.APPluginInstallerAndUpdater.isNeedUpdateFromLocal(context);
            isNeedLocalUpdate = isNeedUpdateFromLocal;
            if (isNeedUpdateFromLocal) {
                synchronized (initObject) {
                    initState = -1;
                }
            }
            int i17 = initState;
            if ((i17 == -1 || i17 == 0) && !MED_DISTRIBUTE_NET.equals("launchFunction") && !MED_DISTRIBUTE_INFO.equals("launchFunction")) {
                try {
                    progressDialog.show();
                } catch (java.lang.Throwable unused) {
                }
            }
            if (initState == -1) {
                if (isNeedLocalUpdate) {
                    release(context);
                }
                preLoadPlugin(context, "launchFunction", null);
            }
            if (initState == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.6
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (com.tencent.midas.control.APMidasPayHelper.loadingObject) {
                                com.tencent.midas.control.APMidasPayHelper.loadingObject.wait();
                            }
                        } catch (java.lang.InterruptedException e17) {
                            com.tencent.midas.comm.APLog.w(com.tencent.midas.control.APMidasPayHelper.TAG, e17.toString());
                        }
                        try {
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        com.tencent.midas.data.APPluginReportManager.getInstance().insertTimeDataEx(java.lang.Thread.currentThread().getName(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_TIMENAME_LAUNCHPAY_WAIT_INIT, currentTimeMillis);
                        resultReceiver.send(0, new android.os.Bundle());
                    }
                }).start();
            } else {
                resultReceiver.send(0, new android.os.Bundle());
            }
        }
    }

    public java.lang.Object call(android.app.Activity activity, java.lang.String str, java.lang.Object[] objArr) {
        return callWithContext(activity, str, objArr);
    }

    public java.lang.Object callWithContext(android.content.Context context, java.lang.String str, java.lang.Object[] objArr) {
        try {
            return com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(context, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, MED_DISTRIBUTE_CALL, new java.lang.Object[]{str, objArr});
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i(TAG, "callWithContext error:" + e17.toString());
            return null;
        }
    }

    public int directWxPay(android.app.Activity activity, com.tencent.midas.api.request.APMidasDirectRequest aPMidasDirectRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.d(TAG, "直接拉起微信支付, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && initCount < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        midasCallBack = iAPMidasPayCallBack;
        if (isNewProcess) {
            com.tencent.midas.comm.APPluginDataStorage.storeData(activity, com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "launchpaycalling", "1");
        }
        return toMidas(activity, aPMidasDirectRequest, MED_DISTRIBUTE_DIRECT_PAY, "directWxPay");
    }

    public int getInfo(android.app.Activity activity, java.lang.String str, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack) {
        netCallBack = iAPMidasNetCallBack;
        netCallBack_ReqType = str;
        return toMidas(activity, aPMidasBaseRequest, MED_DISTRIBUTE_INFO, "getInfo");
    }

    public int h5Pay(android.app.Activity activity, android.webkit.WebView webView, com.tencent.smtt.sdk.WebView webView2, java.lang.String str, java.lang.String str2) {
        webview = webView;
        x5Webview = webView2;
        com.tencent.midas.comm.APLog.i(TAG, "h5Pay webview:" + webview + " x5Webview:" + x5Webview + " msg:" + str2);
        com.tencent.midas.data.APPluginReportManager aPPluginReportManager = com.tencent.midas.data.APPluginReportManager.getInstance();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msg:");
        sb6.append(str2);
        aPPluginReportManager.reportImmediatelyOneRecord(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_H5_PAY_HOOK, sb6.toString());
        if (android.text.TextUtils.isEmpty(str2) || !str2.startsWith("midas_js_bridge_")) {
            return -2;
        }
        return toH5Midas(activity, webView, str, str2, MED_DISTRIBUTE_H5PAY, "h5Pay");
    }

    public void launchWXMiniProgram(android.content.Context context, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        call(context, MED_DISTRIBUTE_WX_MINIPROGRAM, new java.lang.Class[]{android.content.Context.class, android.os.Bundle.class, android.os.ResultReceiver.class}, new java.lang.Object[]{context, bundle, resultReceiver});
    }

    public void launchWXMiniProgram_OnResponse(android.content.Context context, int i17, android.os.Bundle bundle) {
        call(context, MED_DISTRIBUTE_WX_MINIPROGRAM_ONRESPONSE, new java.lang.Class[]{java.lang.Integer.TYPE, android.os.Bundle.class}, new java.lang.Object[]{java.lang.Integer.valueOf(i17), bundle});
    }

    public int launchWeChat(android.app.Activity activity, org.json.JSONObject jSONObject, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.d(TAG, "Calling into pay, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && initCount < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        midasCallBack = iAPMidasPayCallBack;
        if (isNewProcess) {
            com.tencent.midas.comm.APPluginDataStorage.storeData(activity, com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "launchpaycalling", "1");
        }
        com.tencent.midas.api.request.APMidasGameRequest aPMidasGameRequest = new com.tencent.midas.api.request.APMidasGameRequest();
        try {
            aPMidasGameRequest.reserv = "H5PayParams=" + java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.lang.Exception unused) {
        }
        return toMidas(activity, aPMidasGameRequest, MED_DISTRIBUTE_WECHATPAY, "launchWeChat");
    }

    public void launchWeb(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activity, com.tencent.midas.jsbridge.APWebJSBridgeActivity.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/midas/control/APMidasPayHelper", "launchWeb", "(Landroid/app/Activity;Lcom/tencent/midas/api/request/APMidasBaseRequest;Lcom/tencent/midas/api/IAPMidasPayCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/midas/control/APMidasPayHelper", "launchWeb", "(Landroid/app/Activity;Lcom/tencent/midas/api/request/APMidasBaseRequest;Lcom/tencent/midas/api/IAPMidasPayCallBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int net(android.app.Activity activity, com.tencent.midas.api.request.APMidasNetRequest aPMidasNetRequest, com.tencent.midas.api.IAPMidasNetCallBack iAPMidasNetCallBack) {
        netCallBack = iAPMidasNetCallBack;
        netCallBack_ReqType = aPMidasNetRequest.reqType;
        return toMidas(activity, aPMidasNetRequest, MED_DISTRIBUTE_NET, "net");
    }

    @Override // com.tencent.midas.control.APCallBackResultReceiver.Receiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        com.tencent.midas.comm.APLog.i(TAG, "remotRecevier payHelper resultCode:" + i17);
        if (i17 == 0) {
            progressRemoteInfo(bundle);
        }
    }

    public int pay(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.d(TAG, "Calling into pay, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && initCount < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        midasCallBack = iAPMidasPayCallBack;
        if (isNewProcess) {
            com.tencent.midas.comm.APPluginDataStorage.storeData(activity, com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "launchpaycalling", "1");
        }
        return toMidas(activity, aPMidasBaseRequest, MED_DISTRIBUTE_PAY, "pay");
    }

    public int payScoreContract(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.d(TAG, "payScoreContract, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && initCount < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        midasCallBack = iAPMidasPayCallBack;
        if (isNewProcess) {
            com.tencent.midas.comm.APPluginDataStorage.storeData(activity, com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "launchpaycalling", "1");
        }
        return toMidas(activity, aPMidasBaseRequest, MED_DISTRIBUTE_PYA_SCORE_CONTRACT, "payScoreContract");
    }

    public void progressRemoteInfo(android.os.Bundle bundle) {
        com.tencent.midas.api.request.APPurchase aPPurchase;
        java.lang.String string = bundle.getString("type");
        com.tencent.midas.comm.APLog.i(TAG, "progressRemoteInfo type:" + string);
        if (!"callback".equals(string)) {
            if ("h5callback".equals(string)) {
                midasH5CallBack(bundle.getString("callbackinfo"));
                return;
            } else {
                if ("needlogin".equals(string)) {
                    midasLoginExpire();
                    return;
                }
                return;
            }
        }
        com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
        aPMidasResponse.resultCode = bundle.getInt("resultCode", -1);
        aPMidasResponse.resultInerCode = bundle.getInt("resultInerCode");
        aPMidasResponse.realSaveNum = bundle.getInt("realSaveNum");
        aPMidasResponse.payChannel = bundle.getInt("payChannel");
        aPMidasResponse.payState = bundle.getInt("payState");
        aPMidasResponse.provideState = bundle.getInt("provideState");
        aPMidasResponse.resultMsg = bundle.getString("resultMsg");
        aPMidasResponse.extendInfo = bundle.getString("extendInfo");
        aPMidasResponse.payReserve1 = bundle.getString("payReserve1");
        aPMidasResponse.payReserve2 = bundle.getString("payReserve2");
        aPMidasResponse.payReserve3 = bundle.getString("payReserve3");
        try {
            aPPurchase = new com.tencent.midas.api.request.APPurchase(bundle.getString("purchaseJson"), bundle.getString("purchaseSign"));
        } catch (org.json.JSONException e17) {
            aPPurchase = new com.tencent.midas.api.request.APPurchase();
            com.tencent.midas.comm.APLog.w("progressRemoteInfo", "purchase creat fail1 " + e17.toString());
        } catch (java.lang.Exception e18) {
            aPPurchase = new com.tencent.midas.api.request.APPurchase();
            com.tencent.midas.comm.APLog.w("progressRemoteInfo", "purchase creat fail2 " + e18.toString());
        }
        aPMidasResponse.mAPPurchase = aPPurchase;
        midasCallBack(aPMidasResponse);
    }

    public void sendMidas(final android.content.Context context, final android.os.Bundle bundle, final android.os.ResultReceiver resultReceiver) {
        waitingPluginReady(context, new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.midas.control.APMidasPayHelper.5
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle2) {
                if (i17 == 0) {
                    try {
                        com.tencent.midas.control.APMidasPayHelper aPMidasPayHelper = com.tencent.midas.control.APMidasPayHelper.this;
                        android.content.Context context2 = context;
                        aPMidasPayHelper.retobj = com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(context2, com.tencent.midas.control.APMidasPayHelper.MIDAS_PLUGIN_NAME, com.tencent.midas.control.APMidasPayHelper.PKG_DISTRIBUTE, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_RECEIVE, new java.lang.Object[]{context2, bundle, resultReceiver}, new java.lang.Class[]{android.content.Context.class, android.os.Bundle.class, android.os.ResultReceiver.class});
                        return;
                    } catch (java.lang.Exception e17) {
                        com.tencent.midas.comm.APLog.e(com.tencent.midas.control.APMidasPayHelper.TAG, "sendMidas() e = " + e17.toString());
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

    public void setScreenType(int i17) {
    }

    public int signPay(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        com.tencent.midas.comm.APLog.d(TAG, "Calling into pay, caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if ("test".equals(env) && initCount < 1) {
            android.widget.Toast.makeText(activity, "腾讯支付尚未初始化，请先调用初始化接口!", 1).show();
        }
        midasCallBack = iAPMidasPayCallBack;
        if (isNewProcess) {
            com.tencent.midas.comm.APPluginDataStorage.storeData(activity, com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "launchpaycalling", "1");
        }
        return toMidas(activity, aPMidasBaseRequest, MED_DISTRIBUTE_SIGN_PAY, "signPay");
    }

    public void web(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, com.tencent.midas.api.IAPMidasPayCallBack iAPMidasPayCallBack) {
        midasCallBack = iAPMidasPayCallBack;
        launchWeb(activity, aPMidasBaseRequest, iAPMidasPayCallBack);
    }

    public java.lang.Object call(android.app.Activity activity, java.lang.String str, java.lang.Object[] objArr, java.lang.Class<?>[] clsArr) {
        return callWithContext(activity, str, objArr, clsArr);
    }

    public static synchronized void init(final android.content.Context context, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest, final android.os.ResultReceiver resultReceiver) {
        synchronized (com.tencent.midas.control.APMidasPayHelper.class) {
            com.tencent.midas.comm.APLog.i(TAG, "init initCount:" + initCount);
            isNewProcess = isNewProcess(context);
            initRequest = aPMidasBaseRequest;
            if (initCount < 1 && !isInitSucc) {
                com.tencent.midas.plugin.APPluginUtils.release();
                preLoadPlugin(context, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new com.tencent.midas.control.IAPInitCallBack() { // from class: com.tencent.midas.control.APMidasPayHelper.1
                    @Override // com.tencent.midas.control.IAPInitCallBack
                    public void result(int i17, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
                        com.tencent.midas.comm.APLog.i(com.tencent.midas.control.APMidasPayHelper.TAG, "initcallback ret:" + i17 + " msg:" + str);
                        synchronized (com.tencent.midas.control.APMidasPayHelper.dexloadObject) {
                            boolean unused = com.tencent.midas.control.APMidasPayHelper.isInitSucc = true;
                            com.tencent.midas.control.APMidasPayHelper.dexloadObject.notifyAll();
                            android.os.ResultReceiver resultReceiver2 = resultReceiver;
                            if (resultReceiver2 != null) {
                                resultReceiver2.send(i17, bundle);
                            }
                        }
                        com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                    }
                });
            } else if (isInitSucc) {
                ((android.app.Activity) context).runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.midas.comm.APLog.i(com.tencent.midas.control.APMidasPayHelper.TAG, "initcallback isInitSucc direct call init function");
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("version", "1.9.9m");
                        intent.putExtra("req", com.tencent.midas.control.APMidasPayHelper.initRequest);
                        intent.putExtra("env", com.tencent.midas.control.APMidasPayHelper.env);
                        intent.putExtra("logEnable", com.tencent.midas.control.APMidasPayHelper.logEnable);
                        intent.putExtra("launchInterfaceName", java.lang.Thread.currentThread().getName());
                        android.os.ResultReceiver resultReceiver2 = resultReceiver;
                        if (resultReceiver2 != null) {
                            intent.putExtra("receiver", resultReceiver2);
                        }
                        try {
                            android.content.Context context2 = context;
                            com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface(context2, com.tencent.midas.control.APMidasPayHelper.MIDAS_PLUGIN_NAME, com.tencent.midas.control.APMidasPayHelper.PKG_DISTRIBUTE, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_INIT, new java.lang.Object[]{context2, intent});
                        } catch (java.lang.Exception e17) {
                            com.tencent.midas.comm.APLog.i(com.tencent.midas.control.APMidasPayHelper.TAG, "initcallback isInitSucc direct call init function e:" + e17.toString());
                        }
                    }
                });
            }
            com.tencent.midas.data.APPluginReportManager.getInstance().dataReport(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            initCount++;
        }
    }

    public java.lang.Object call(android.content.Context context, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Object[] objArr) {
        return callWithContext(context, str, objArr, clsArr);
    }

    public java.lang.Object callWithContext(final android.content.Context context, final java.lang.String str, final java.lang.Object[] objArr, final java.lang.Class<?>[] clsArr) {
        synchronized (initObject) {
            com.tencent.midas.comm.APLog.i("callWithContext ", "initState:" + initState);
            if (initState == 0) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.7
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.tencent.midas.comm.APLog.d("callWithContext ", "PLUGIN_INITING wait");
                            synchronized (com.tencent.midas.control.APMidasPayHelper.dexloadObject) {
                                com.tencent.midas.control.APMidasPayHelper.dexloadObject.wait();
                            }
                            com.tencent.midas.comm.APLog.d("callWithContext ", "PLUGIN_INITING go");
                            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.midas.control.APMidasPayHelper.7.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        com.tencent.midas.control.APMidasPayHelper.AnonymousClass7 anonymousClass7 = com.tencent.midas.control.APMidasPayHelper.AnonymousClass7.this;
                                        com.tencent.midas.control.APMidasPayHelper.this.retobj = com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface2(context, com.tencent.midas.control.APMidasPayHelper.MIDAS_PLUGIN_NAME, com.tencent.midas.control.APMidasPayHelper.PKG_DISTRIBUTE, com.tencent.midas.control.APMidasPayHelper.MED_DISTRIBUTE_CALL2, new java.lang.Object[]{str, objArr, clsArr});
                                    } catch (java.lang.Exception e17) {
                                        com.tencent.midas.comm.APLog.e("callWithContext", "error1 " + e17.toString());
                                    }
                                }
                            });
                        } catch (java.lang.InterruptedException e17) {
                            com.tencent.midas.comm.APLog.e("callWithContext", "error2 " + e17.toString());
                        } catch (java.lang.Exception e18) {
                            com.tencent.midas.comm.APLog.e("callWithContext", "error3 " + e18.toString());
                        } catch (java.lang.Throwable th6) {
                            com.tencent.midas.comm.APLog.e("callWithContext", "error4 " + th6.toString());
                        }
                    }
                }).start();
            } else {
                try {
                    this.retobj = com.tencent.midas.plugin.APPluginInterfaceManager.initPluginInterface2(context, MIDAS_PLUGIN_NAME, PKG_DISTRIBUTE, MED_DISTRIBUTE_CALL2, new java.lang.Object[]{str, objArr, clsArr});
                } catch (java.lang.Exception e17) {
                    com.tencent.midas.comm.APLog.e("callWithContext", "error3 " + e17.toString());
                }
            }
        }
        return this.retobj;
    }
}

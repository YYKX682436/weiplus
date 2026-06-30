package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public class APWebJSBridgeActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    private static final java.lang.String KEY_REQUEST = "key_request";
    private static final java.lang.String KEY_TYPE = "key_pure_h5_pay";
    private static final java.lang.String TAG = "APWebJSBridgeActivity";
    private static final java.lang.String VALUE_PURE_H5 = "value_pure_h5_pay";
    private static final java.lang.String WEB_URL_POST = "/index.html";
    private static final java.lang.String WEB_URL_PRE = "https://youxi.vip.qq.com/m/act/";
    private byte _hellAccFlag_;
    private com.tencent.midas.jsbridge.IAPWebPage webPage = null;

    private java.lang.String constructUrl() {
        java.lang.String discountUrl;
        if (android.text.TextUtils.isEmpty(com.tencent.midas.data.APPluginDataInterface.singleton().getDiscountUrl())) {
            discountUrl = WEB_URL_PRE + com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId() + WEB_URL_POST;
            this.webPage.initHead(this, ub.b.c(discountUrl, com.tencent.midas.jsbridge.APWebProtocol.URL_KEY_HEAD_CONTROL), ub.b.c(discountUrl, com.tencent.midas.jsbridge.APWebProtocol.URL_KEY_HEAD_TITLE));
            this.webPage.updateWebViewSize(discountUrl);
        } else {
            discountUrl = com.tencent.midas.data.APPluginDataInterface.singleton().getDiscountUrl();
            this.webPage.initHead(this, ub.b.c(discountUrl, com.tencent.midas.jsbridge.APWebProtocol.URL_KEY_HEAD_CONTROL), ub.b.c(discountUrl, com.tencent.midas.jsbridge.APWebProtocol.URL_KEY_HEAD_TITLE));
            this.webPage.updateWebViewSize(com.tencent.midas.data.APPluginDataInterface.singleton().getDiscountUrl());
        }
        com.tencent.midas.comm.APLog.e("constructUrl", discountUrl);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("offerId", com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId());
        hashMap.put("openId", com.tencent.midas.data.APPluginDataInterface.singleton().getOpenId());
        hashMap.put("openKey", com.tencent.midas.data.APPluginDataInterface.singleton().getOpenKey());
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, com.tencent.midas.data.APPluginDataInterface.singleton().getSessionId());
        hashMap.put("sessionType", com.tencent.midas.data.APPluginDataInterface.singleton().getSessionType());
        hashMap.put("pf", com.tencent.midas.data.APPluginDataInterface.singleton().getPf());
        hashMap.put("pfKey", com.tencent.midas.data.APPluginDataInterface.singleton().getPfKey());
        hashMap.put("zoneId", com.tencent.midas.data.APPluginDataInterface.singleton().getZoneId());
        if (!discountUrl.contains("?")) {
            discountUrl = discountUrl.concat("?");
        } else if (!discountUrl.endsWith("?")) {
            discountUrl = discountUrl.concat("&");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(discountUrl);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                stringBuffer.append((java.lang.String) entry.getKey());
                stringBuffer.append("=");
                stringBuffer.append((java.lang.String) entry.getValue());
                stringBuffer.append("&");
            }
            if (!android.text.TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        } catch (java.lang.Exception unused) {
        }
        sb6.append(stringBuffer.toString());
        java.lang.String sb7 = sb6.toString();
        com.tencent.midas.comm.APLog.i("constructUrl", sb7);
        return sb7;
    }

    private java.lang.String getPureH5PayURLParameters(com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("m", "buy");
        hashMap.put(com.tencent.mapsdk.internal.ep.f49375t, "v3");
        hashMap.put("appid", aPMidasBaseRequest.offerId);
        hashMap.put("pf", aPMidasBaseRequest.f53140pf);
        hashMap.put("n", aPMidasBaseRequest.saveValue);
        hashMap.put("sessionid", aPMidasBaseRequest.sessionId);
        hashMap.put("sessiontype", aPMidasBaseRequest.sessionType);
        hashMap.put(com.google.android.gms.common.Scopes.OPEN_ID, aPMidasBaseRequest.openId);
        hashMap.put("openkey", aPMidasBaseRequest.openKey);
        hashMap.put("zoneid", aPMidasBaseRequest.zoneId);
        hashMap.put("sdktype", com.eclipsesource.mmv8.Platform.ANDROID);
        java.lang.String midasCoreVersionName = com.tencent.midas.plugin.APPluginUtils.getMidasCoreVersionName(this);
        com.tencent.midas.comm.APLog.d(TAG, "app_version = " + midasCoreVersionName);
        hashMap.put("appversion", midasCoreVersionName);
        hashMap.put("request_from", com.tencent.map.tools.net.NetUtil.STR_UserAgent);
        hashMap.put("is_android_sdk_error_version", "1");
        hashMap.put("android_sdk_reserve", aPMidasBaseRequest.reserv);
        hashMap.put("android_sdk_mpinfo_discountType", aPMidasBaseRequest.mpInfo.discountType);
        hashMap.put("android_sdk_mpinfo_discountUrl", aPMidasBaseRequest.mpInfo.discountUrl);
        hashMap.put("android_sdk_mpinfo_discoutId", aPMidasBaseRequest.mpInfo.discoutId);
        hashMap.put("android_sdk_mpinfo_drmInfo", aPMidasBaseRequest.mpInfo.drmInfo);
        hashMap.put("android_sdk_mpinfo_extras", aPMidasBaseRequest.mpInfo.extras);
        hashMap.put("android_sdk_mpinfo_payChannel", aPMidasBaseRequest.mpInfo.payChannel);
        hashMap.put("android_sdk_extendInfo_unit", aPMidasBaseRequest.extendInfo.unit);
        hashMap.put("android_sdk_extendInfo_isShowListOtherNum", java.lang.String.valueOf(aPMidasBaseRequest.extendInfo.isShowListOtherNum));
        hashMap.put("android_sdk_extendInfo_isShowNum", java.lang.String.valueOf(aPMidasBaseRequest.extendInfo.isShowNum));
        if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasGameRequest) {
            if ("hy_gameid".equals(aPMidasBaseRequest.sessionId) && "wc_actoken".equals(aPMidasBaseRequest.sessionType)) {
                hashMap.put("c", "wechat_game");
            } else if ("itopid".equals(aPMidasBaseRequest.sessionId)) {
                hashMap.put("c", "itop_game");
            } else {
                hashMap.put("c", "game");
            }
            if (!android.text.TextUtils.isEmpty(aPMidasBaseRequest.saveValue)) {
                hashMap.put("as", "1");
            }
        } else if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasGoodsRequest) {
            com.tencent.midas.api.request.APMidasGoodsRequest aPMidasGoodsRequest = (com.tencent.midas.api.request.APMidasGoodsRequest) aPMidasBaseRequest;
            hashMap.put("c", "goods");
            if (aPMidasGoodsRequest.tokenType == 1) {
                hashMap.put("params", java.net.URLEncoder.encode(aPMidasGoodsRequest.goodsTokenUrl));
            } else {
                hashMap.put("productid", aPMidasGoodsRequest.prodcutId);
            }
        } else if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasSubscribeRequest) {
            com.tencent.midas.api.request.APMidasSubscribeRequest aPMidasSubscribeRequest = (com.tencent.midas.api.request.APMidasSubscribeRequest) aPMidasBaseRequest;
            if ("uin".equals(aPMidasBaseRequest.sessionId) || com.google.android.gms.common.Scopes.OPEN_ID.equals(aPMidasBaseRequest.sessionId)) {
                hashMap.put("c", "qqsubscribe");
            } else {
                hashMap.put("c", "subscribe");
            }
            if (!android.text.TextUtils.isEmpty(aPMidasSubscribeRequest.productId)) {
                hashMap.put("as", "1");
                hashMap.put("productid", aPMidasSubscribeRequest.productId);
            }
            hashMap.put("service", aPMidasSubscribeRequest.serviceCode);
            hashMap.put("aid", aPMidasSubscribeRequest.remark);
            if (aPMidasSubscribeRequest.autoPay) {
                hashMap.put("ap", "1");
            }
        } else if (aPMidasBaseRequest instanceof com.tencent.midas.api.request.APMidasMonthRequest) {
            com.tencent.midas.api.request.APMidasMonthRequest aPMidasMonthRequest = (com.tencent.midas.api.request.APMidasMonthRequest) aPMidasBaseRequest;
            hashMap.put("da", "1");
            hashMap.put("c", aPMidasMonthRequest.serviceCode.toLowerCase());
            hashMap.put("_newservice", "1");
            if (aPMidasMonthRequest.autoPay) {
                hashMap.put("ap", "1");
            }
            if (!android.text.TextUtils.isEmpty(aPMidasBaseRequest.saveValue)) {
                hashMap.put("as", "1");
            }
            hashMap.put("aid", aPMidasMonthRequest.remark);
        }
        java.lang.String str = com.tencent.midas.api.APMidasPayAPI.env;
        if (com.tencent.midas.api.APMidasPayAPI.ENV_DEV.equals(str)) {
            hashMap.put("sandbox", "2");
        } else if ("test".equals(str)) {
            hashMap.put("sandbox", "1");
        }
        return map2UrlParams(hashMap);
    }

    private void initUI() {
        this.webPage.initUI(this);
        this.webPage.loadUrl(constructUrl());
    }

    private void initWebPage() {
        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_INIT, "", "");
        if (com.tencent.midas.jsbridge.APX5.isX5Enabled(this)) {
            this.webPage = new com.tencent.midas.jsbridge.APX5WebPage();
            com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_X5, "", "");
        } else {
            this.webPage = new com.tencent.midas.jsbridge.APSystemWebPage();
            com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_SYSTEM, "", "");
        }
    }

    public static java.lang.String map2UrlParams(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : hashMap.entrySet()) {
                stringBuffer.append(entry.getKey());
                stringBuffer.append("=");
                stringBuffer.append(entry.getValue());
                stringBuffer.append("&");
            }
            if (!android.text.TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        } catch (java.lang.Exception unused) {
        }
        return stringBuffer.toString();
    }

    public static boolean startPureH5Pay(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.midas.comm.APLog.d(TAG, " Calling into startPureH5Pay caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.tencent.midas.data.APPluginReportManager.getInstance().reportImmediatelyOneRecord(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY, com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_LAUNCH_PURE_H5_ERROR_REASON, "scene=" + str2 + "&reason=" + str);
        if (context == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot start pure h5 pay with null context!");
            return false;
        }
        com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest = com.tencent.midas.control.APMidasPayHelper.requestObject;
        if (aPMidasBaseRequest == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot start pure h5 pay with null request object!");
            return false;
        }
        return startPureH5Pay(context, aPMidasBaseRequest);
    }

    private void toPureH5Pay(com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        this.webPage.toPureH5Pay(this, aPMidasBaseRequest);
        java.lang.String str = "https://pay.qq.com/h5/index.shtml?" + getPureH5PayURLParameters(aPMidasBaseRequest);
        com.tencent.midas.comm.APLog.d(TAG, "To pure h5 pay full url = " + str);
        this.webPage.loadUrl(str);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (ub.a.f425990a == null) {
                ub.a.f425990a = new java.util.Stack();
            }
            ub.a.f425990a.push(this);
            initWebPage();
            android.content.Intent intent = getIntent();
            if (intent == null || !VALUE_PURE_H5.equals(intent.getStringExtra(KEY_TYPE))) {
                initUI();
            } else {
                toPureH5Pay((com.tencent.midas.api.request.APMidasBaseRequest) intent.getSerializableExtra(KEY_REQUEST));
            }
        } catch (java.lang.Exception e17) {
            java.lang.String fullExceptionStacktrace = com.tencent.midas.plugin.APPluginUtils.getFullExceptionStacktrace(e17);
            if (!android.text.TextUtils.isEmpty(fullExceptionStacktrace) && (fullExceptionStacktrace.contains("webview") || fullExceptionStacktrace.contains("Webview"))) {
                android.widget.Toast.makeText(this, "系统组件缺失，请退出重试", 0).show();
            }
            com.tencent.midas.plugin.APPluginUtils.callbackInMidasPluginWithoutCaringAboutNewProcess(this, 100, "返回");
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.midas.comm.APLog.d(TAG, "onKey down = back!");
            com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
            aPMidasResponse.resultCode = 100;
            aPMidasResponse.resultMsg = "返回";
            com.tencent.midas.control.APMidasPayHelper.midasCallBack(aPMidasResponse);
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private static boolean startPureH5Pay(android.content.Context context, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest) {
        if (context == null) {
            com.tencent.midas.comm.APLog.e(TAG, "Cannot start pure h5 pay with null context!");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(268435456);
        intent.setClass(context, com.tencent.midas.jsbridge.APWebJSBridgeActivity.class);
        intent.putExtra(KEY_TYPE, VALUE_PURE_H5);
        intent.putExtra(KEY_REQUEST, aPMidasBaseRequest);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/midas/jsbridge/APWebJSBridgeActivity", "startPureH5Pay", "(Landroid/content/Context;Lcom/tencent/midas/api/request/APMidasBaseRequest;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/midas/jsbridge/APWebJSBridgeActivity", "startPureH5Pay", "(Landroid/content/Context;Lcom/tencent/midas/api/request/APMidasBaseRequest;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}

package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public class APWebProtocol {
    public static java.lang.String URL_KEY_HEAD_CONTROL = "midasheader";
    public static java.lang.String URL_KEY_HEAD_TITLE = "midastitle";
    public static java.lang.String WEBACTION_CLOSE = "closeWeb";
    public static java.lang.String WEBACTION_GETCGIEXTEND = "getCgiExtend";
    public static java.lang.String WEBACTION_HEAD = "setHead";

    public static void AnalyzeWebEntry(android.app.Activity activity, java.lang.Object obj, com.tencent.midas.jsbridge.IAPWebPage iAPWebPage, java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.String> url2Map = com.tencent.midas.plugin.APPluginUtils.url2Map(str);
        url2Map.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String str2 = url2Map.get("action");
        url2Map.get("saveNumber");
        url2Map.get("saveType");
        java.lang.String str3 = url2Map.get("callback");
        if (WEBACTION_GETCGIEXTEND.equals(str2)) {
            java.lang.String reserv = com.tencent.midas.data.APPluginDataInterface.singleton().getReserv();
            com.tencent.midas.comm.APLog.d("APWebResultPage", "sendCgiExtends() callback=" + str3 + ", extendStr=" + reserv);
            if (!android.text.TextUtils.isEmpty(reserv)) {
                try {
                    reserv = java.net.URLEncoder.encode(reserv, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.lang.Exception unused) {
                }
            }
            H5CallBack(obj, str3, reserv);
            return;
        }
        if (!WEBACTION_CLOSE.equals(str2)) {
            if (WEBACTION_HEAD.equals(str2)) {
                try {
                    iAPWebPage.initHead(activity, url2Map.get(URL_KEY_HEAD_CONTROL), url2Map.get(URL_KEY_HEAD_TITLE));
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
            }
            return;
        }
        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_WEBPAGE_WEBCLOSE, "", "");
        com.tencent.midas.api.APMidasResponse aPMidasResponse = new com.tencent.midas.api.APMidasResponse();
        aPMidasResponse.resultCode = 100;
        aPMidasResponse.resultMsg = "关闭";
        com.tencent.midas.control.APMidasPayHelper.midasCallBack(aPMidasResponse);
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0016, code lost:
    
        if ((r1 instanceof org.json.JSONArray) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H5CallBack(java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            org.json.JSONTokener r1 = new org.json.JSONTokener     // Catch: java.lang.Throwable -> L19
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.nextValue()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Ld
            goto L19
        Ld:
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L19
            r3 = 1
            if (r2 == 0) goto L14
        L12:
            r0 = r3
            goto L19
        L14:
            boolean r1 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L19
            goto L12
        L19:
            if (r0 == 0) goto L26
            java.lang.String r0 = "typeof window[\"%s\"]==='function' && window[\"%s\"](%s);"
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r5, r6}     // Catch: java.lang.Exception -> L68
            java.lang.String r6 = java.lang.String.format(r0, r6)     // Catch: java.lang.Exception -> L68
            goto L30
        L26:
            java.lang.String r0 = "typeof window[\"%s\"]==='function' && window[\"%s\"](\"%s\");"
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r5, r6}     // Catch: java.lang.Exception -> L68
            java.lang.String r6 = java.lang.String.format(r0, r6)     // Catch: java.lang.Exception -> L68
        L30:
            java.lang.String r0 = "callback"
            com.tencent.midas.comm.APLog.i(r0, r5)     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = "cb"
            com.tencent.midas.comm.APLog.i(r5, r6)     // Catch: java.lang.Exception -> L68
            boolean r5 = r4 instanceof android.webkit.WebView     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "javascript:"
            if (r5 == 0) goto L52
            android.webkit.WebView r4 = (android.webkit.WebView) r4     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r5.<init>(r0)     // Catch: java.lang.Exception -> L68
            r5.append(r6)     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L68
            r4.loadUrl(r5)     // Catch: java.lang.Exception -> L68
            goto L80
        L52:
            boolean r5 = r4 instanceof com.tencent.smtt.sdk.WebView     // Catch: java.lang.Exception -> L68
            if (r5 == 0) goto L80
            com.tencent.smtt.sdk.WebView r4 = (com.tencent.smtt.sdk.WebView) r4     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r5.<init>(r0)     // Catch: java.lang.Exception -> L68
            r5.append(r6)     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L68
            r4.loadUrl(r5)     // Catch: java.lang.Exception -> L68
            goto L80
        L68:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "H5CallBack() ex = "
            r5.<init>(r6)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "H5CallBack"
            com.tencent.midas.comm.APLog.d(r5, r4)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.jsbridge.APWebProtocol.H5CallBack(java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public static boolean hookH5Method(android.app.Activity activity, android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult, com.tencent.midas.jsbridge.IAPWebViewCallback iAPWebViewCallback) {
        if (android.text.TextUtils.isEmpty(str2) || !str2.startsWith("http://unipay.sdk.android/?")) {
            return false;
        }
        iAPWebViewCallback.WebChromeClientJsAlert(webView, str, str2, jsResult);
        return true;
    }

    public static boolean hookH5Method(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult, com.tencent.midas.jsbridge.IAPX5WebViewCallback iAPX5WebViewCallback) {
        if (android.text.TextUtils.isEmpty(str2) || !str2.startsWith("http://unipay.sdk.android/?")) {
            return false;
        }
        iAPX5WebViewCallback.WebChromeClientJsAlert(webView, str, str2, jsResult);
        return true;
    }
}

package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class lf {
    public static void a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.lang.String str, java.lang.String str2, int i17) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        str2.length();
        tVar.evaluateJavascript(java.lang.String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('%s', %s)", str, str2), new com.tencent.mm.plugin.appbrand.jsapi.kf());
    }
}

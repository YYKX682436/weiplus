package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class z2 implements com.tencent.mm.plugin.appbrand.jsapi.auth.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask f79808a;

    public z2(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask) {
        this.f79808a = jsApiOperateWXData$OperateWXDataTask;
    }

    public void a(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "onFailure !");
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = this.f79808a;
        jsApiOperateWXData$OperateWXDataTask.f79400z = "fail:" + str;
        jsApiOperateWXData$OperateWXDataTask.C = i17;
        jsApiOperateWXData$OperateWXDataTask.c();
    }

    public final void b(java.lang.String str) {
        boolean isEmpty;
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = this.f79808a;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append("");
            java.lang.String k17 = u46.l.k(new java.lang.String[]{jsApiOperateWXData$OperateWXDataTask.f79397y, jsApiOperateWXData$OperateWXDataTask.U + "", jsApiOperateWXData$OperateWXDataTask.f79379i + "", sb6.toString()}, "$");
            jsApiOperateWXData$OperateWXDataTask.f79384p = k17;
            o4Var = com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask.f79374z1;
            o4Var.putString(k17, str);
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "runInMainProcess::onSuccess, write to XProcessStore failed, appId[%s], callbackId[%d] e=%s", jsApiOperateWXData$OperateWXDataTask.f79397y, java.lang.Integer.valueOf(jsApiOperateWXData$OperateWXDataTask.f79379i), th6);
                jsApiOperateWXData$OperateWXDataTask.f79384p = null;
                jx3.f.INSTANCE.idkeyStat(1063L, 1L, 1L, false);
                if (!isEmpty) {
                    return;
                }
            } finally {
                if (android.text.TextUtils.isEmpty(jsApiOperateWXData$OperateWXDataTask.f79384p)) {
                    jsApiOperateWXData$OperateWXDataTask.f79383o = str;
                }
            }
        }
        if (android.text.TextUtils.isEmpty(o4Var.getString(jsApiOperateWXData$OperateWXDataTask.f79384p, null))) {
            throw new java.io.IOException("write data failed");
        }
        jx3.f.INSTANCE.idkeyStat(1063L, 0L, 1L, false);
        if (!android.text.TextUtils.isEmpty(jsApiOperateWXData$OperateWXDataTask.f79384p)) {
        }
    }
}

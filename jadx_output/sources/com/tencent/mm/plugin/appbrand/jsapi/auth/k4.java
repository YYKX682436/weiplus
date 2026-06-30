package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class k4 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n0 {
    public static final int CTRL_INDEX = 79;
    public static final java.lang.String NAME = "operateWXData";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f79623g;

    public k4() {
        new com.tencent.mm.plugin.appbrand.jsapi.auth.u4();
    }

    public static void J(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            java.lang.String[] b17 = com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask.f79374z1.b();
            if (b17 == null) {
                return;
            }
            for (java.lang.String str2 : b17) {
                if (!android.text.TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask.f79374z1.remove(str2);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "clear(%s) e=%s", str, th6);
        }
    }

    public static int K(java.lang.String str) {
        int valueActualSize;
        int i17 = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            java.lang.String[] b17 = com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask.f79374z1.b();
            if (b17 == null) {
                return 0;
            }
            int length = b17.length;
            int i18 = 0;
            while (i17 < length) {
                try {
                    java.lang.String str2 = b17[i17];
                    if (!android.text.TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask.f79374z1;
                        if (o4Var.U()) {
                            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f192901g;
                            readLock.lock();
                            o4Var.c(o4Var.f192899e);
                            valueActualSize = o4Var.f192898d.getValueActualSize(str2);
                            readLock.unlock();
                        } else {
                            valueActualSize = o4Var.f192898d.getValueActualSize(str2);
                        }
                        i18 += valueActualSize;
                    }
                    i17++;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    i17 = i18;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "clear(%s) e=%s", str, th);
                    return i17;
                }
            }
            return i18;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0
    public void C(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) ffVar.f81013b;
        org.json.JSONObject jSONObject = ffVar.f81014c;
        int i17 = ffVar.f81016e;
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jSONObject.put("wxdataDequeueTimestamp", java.lang.System.currentTimeMillis());
            java.lang.String string = jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            th1.c a17 = th1.c.a(jSONObject);
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask();
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = yVar.x();
            boolean z18 = false;
            jsApiOperateWXData$OperateWXDataTask.B = x17 != null ? x17.i() : 0;
            jsApiOperateWXData$OperateWXDataTask.A = x17 != null ? x17.W0() : "";
            jsApiOperateWXData$OperateWXDataTask.f79397y = yVar.getAppId();
            jsApiOperateWXData$OperateWXDataTask.f79381m = "operateWXData";
            k91.z0 E0 = yVar.getRuntime().E0();
            if (E0 != null) {
                jsApiOperateWXData$OperateWXDataTask.f79387q = E0.f305852r.f75399d;
            }
            try {
                z18 = yVar.getRuntime().V0(new org.json.JSONObject(string).optString("api_name"));
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "illegal arguments");
            }
            jsApiOperateWXData$OperateWXDataTask.W = z18;
            jsApiOperateWXData$OperateWXDataTask.f79376f = this;
            jsApiOperateWXData$OperateWXDataTask.f79377g = yVar;
            jsApiOperateWXData$OperateWXDataTask.f79382n = string;
            jsApiOperateWXData$OperateWXDataTask.V = a17;
            jsApiOperateWXData$OperateWXDataTask.f79379i = i17;
            jsApiOperateWXData$OperateWXDataTask.f79378h = new com.tencent.mm.plugin.appbrand.jsapi.auth.x2(jsApiOperateWXData$OperateWXDataTask, oVar);
            jsApiOperateWXData$OperateWXDataTask.H = new java.util.HashMap();
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject d17 = com.tencent.mm.plugin.appbrand.l.d(jsApiOperateWXData$OperateWXDataTask.f79397y);
            if (d17 != null) {
                jsApiOperateWXData$OperateWXDataTask.T = d17.f87790f;
            }
            if (yVar instanceof com.tencent.mm.plugin.appbrand.e9) {
                jsApiOperateWXData$OperateWXDataTask.U = 1;
            } else if (yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                jsApiOperateWXData$OperateWXDataTask.U = 2;
            }
            int optInt = jSONObject.optInt("queueLength", -1);
            long optLong = jSONObject.optLong("wxdataQueueTimestamp", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
            long optLong2 = jSONObject.optLong("wxdataDequeueTimestamp", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
            jsApiOperateWXData$OperateWXDataTask.Y = optInt;
            jsApiOperateWXData$OperateWXDataTask.Z = optLong;
            jsApiOperateWXData$OperateWXDataTask.f79385p0 = optLong2;
            jsApiOperateWXData$OperateWXDataTask.d();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "Exception %s", e17.getMessage());
            yVar.a(i17, o("fail"));
            oVar.a();
        }
    }
}

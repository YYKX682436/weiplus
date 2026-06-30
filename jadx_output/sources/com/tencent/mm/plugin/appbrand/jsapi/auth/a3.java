package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class a3 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f79405a;

    public a3(com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f3Var) {
        this.f79405a = f3Var;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList arrayList, int i18, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateWXData", "stev onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f3Var = this.f79405a;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask = f3Var.f79538e;
            jsApiOperateWXData$OperateWXDataTask.f79377g.a(jsApiOperateWXData$OperateWXDataTask.f79379i, jsApiOperateWXData$OperateWXDataTask.f79376f.o("fail auth cancel"));
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) f3Var.f79538e.f79378h).a();
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask2 = f3Var.f79538e;
        jsApiOperateWXData$OperateWXDataTask2.f79381m = "operateWXDataConfirm";
        jsApiOperateWXData$OperateWXDataTask2.F = arrayList.size() > 0 ? (java.lang.String) arrayList.get(0) : "";
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData$OperateWXDataTask jsApiOperateWXData$OperateWXDataTask3 = f3Var.f79538e;
        jsApiOperateWXData$OperateWXDataTask3.f79388r = i17;
        jsApiOperateWXData$OperateWXDataTask3.f79389s = i18;
        jsApiOperateWXData$OperateWXDataTask3.f79390t = z17;
        jsApiOperateWXData$OperateWXDataTask3.d();
        if (i17 == 2) {
            jsApiOperateWXData$OperateWXDataTask3.f79377g.a(jsApiOperateWXData$OperateWXDataTask3.f79379i, jsApiOperateWXData$OperateWXDataTask3.f79376f.o("fail auth deny"));
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.x2) jsApiOperateWXData$OperateWXDataTask3.f79378h).a();
        }
    }
}

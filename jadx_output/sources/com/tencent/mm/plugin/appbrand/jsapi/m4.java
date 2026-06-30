package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class m4 extends com.tencent.mm.plugin.appbrand.jsapi.l4 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.l4
    public android.graphics.Bitmap C(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) e9Var;
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCaptureScreenWC", "getBitmapFromView appId:%s, isGame:%b", t37.f74803n, java.lang.Boolean.valueOf(t37.q2()));
        if (!t37.q2()) {
            return super.C(c0Var);
        }
        ae.q qVar = (ae.q) c0Var.z1(ae.q.class);
        if (qVar != null) {
            return ((ae.a) qVar).w().f48591o.d();
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiCaptureScreenWC", new ae.s(), "hy: you're not on game service!", new java.lang.Object[0]);
        return null;
    }
}

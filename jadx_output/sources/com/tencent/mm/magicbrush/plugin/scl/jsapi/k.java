package com.tencent.mm.magicbrush.plugin.scl.jsapi;

@j95.b
/* loaded from: classes.dex */
public final class k extends i95.w implements com.tencent.mm.magicbrush.plugin.scl.jsapi.i {
    public void wi(com.tencent.mm.plugin.appbrand.jsapi.l env, yz5.l callback) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!(env instanceof jc3.p0)) {
            com.tencent.mars.xlog.Log.w("MBJsApiAdapterService", "only support fake app brand component");
            callback.invoke(null);
            return;
        }
        lc3.e y17 = ((jc3.p0) env).y();
        if (y17 instanceof hq0.i) {
            ((hq0.b0) ((hq0.i) y17)).O1("getAppBrandService", null, new com.tencent.mm.magicbrush.plugin.scl.jsapi.j(callback));
        } else {
            com.tencent.mars.xlog.Log.w("MBJsApiAdapterService", "only support starter biz");
            callback.invoke(null);
        }
    }
}

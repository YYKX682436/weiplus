package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class j4 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.w {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 79;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "operateWXData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0
    public void C(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        org.json.JSONObject jSONObject = invokeContext.f81014c;
        int optInt = jSONObject.optInt("queueLength", -1);
        long optLong = jSONObject.optLong("wxdataQueueTimestamp", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.appbrand.jsapi.auth.o0 o0Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.o0(optInt, optLong, java.lang.System.currentTimeMillis(), false, 0L, 0L, 0L, 0L, 0L, 504, null);
        kotlinx.coroutines.y0 a17 = com.tencent.mm.plugin.appbrand.utils.y.a(invokeContext.f81013b);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(a17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.appbrand.jsapi.auth.d4(this, invokeContext, o0Var, oVar, null), 2, null);
    }
}

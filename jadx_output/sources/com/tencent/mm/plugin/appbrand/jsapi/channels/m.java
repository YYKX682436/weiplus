package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public abstract class m extends com.tencent.mm.plugin.appbrand.jsapi.f implements com.tencent.mm.plugin.appbrand.jsapi.g {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public final void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
    }

    public abstract void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.g
    public final void h(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        C(invokeContext.f81013b, invokeContext.f81014c, invokeContext.f81015d, invokeContext.f81016e);
    }
}

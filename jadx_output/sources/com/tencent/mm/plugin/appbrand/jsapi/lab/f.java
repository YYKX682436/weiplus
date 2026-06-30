package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
final class f implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$IPCSetLabInfoRequest jsApiSetLabInfo$IPCSetLabInfoRequest = (com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$IPCSetLabInfoRequest) obj;
        uy4.v vVar = (uy4.v) i95.n0.c(uy4.v.class);
        if (jsApiSetLabInfo$IPCSetLabInfoRequest != null) {
            java.lang.String str = jsApiSetLabInfo$IPCSetLabInfoRequest.f81376d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && vVar != null) {
                ty4.n nVar = (ty4.n) vVar;
                if (!nVar.Ai(str)) {
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
                    return;
                } else {
                    nVar.Ni(str, jsApiSetLabInfo$IPCSetLabInfoRequest.f81377e);
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
                    return;
                }
            }
        }
        rVar.a(null);
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
final class c implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        uy4.v vVar = (uy4.v) i95.n0.c(uy4.v.class);
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d) || vVar == null) {
            rVar.a(null);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult jsApiGetLabInfo$GetLabInfoResult = new com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult();
        ty4.n nVar = (ty4.n) vVar;
        jsApiGetLabInfo$GetLabInfoResult.f81374d = nVar.Ai(iPCString.f68406d);
        jsApiGetLabInfo$GetLabInfoResult.f81375e = nVar.Bi(iPCString.f68406d);
        rVar.a(jsApiGetLabInfo$GetLabInfoResult);
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

@mk0.a
/* loaded from: classes4.dex */
class k0 implements com.tencent.mm.ipcinvoker.j {
    private k0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel openBusinessViewUtil$BusinessAppInfoParcel = (com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$BusinessAppInfoParcel) obj;
        boolean z07 = ((com.tencent.mm.plugin.appbrand.jsapi.fakenative.x) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.jsapi.fakenative.x.class)).z0(openBusinessViewUtil$BusinessAppInfoParcel.f80894d, openBusinessViewUtil$BusinessAppInfoParcel.f80897g, openBusinessViewUtil$BusinessAppInfoParcel.f80895e, openBusinessViewUtil$BusinessAppInfoParcel.f80896f);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "setBusinessAppInfoTask ret:%b", java.lang.Boolean.valueOf(z07));
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z07));
    }
}

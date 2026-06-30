package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

@mk0.a
/* loaded from: classes.dex */
class j0 implements com.tencent.mm.ipcinvoker.j {
    private j0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean d17 = ((com.tencent.mm.plugin.appbrand.jsapi.fakenative.x) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.jsapi.fakenative.x.class)).d(((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "deleteBusinessAppInfoTask ret:%b", java.lang.Boolean.valueOf(d17));
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(d17));
    }
}

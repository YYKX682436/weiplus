package com.tencent.mm.plugin.appbrand.jsapi;

@mk0.a
/* loaded from: classes8.dex */
final class ce implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCInteger> {
    private ce() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowImageOperateSheet", "IPCFav data null");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        java.lang.String str = iPCString.f68406d;
        ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 1, str);
        doFavoriteEvent.f54090g.f6327m = 32;
        doFavoriteEvent.e();
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(doFavoriteEvent.f54091h.f6433a));
        }
    }
}

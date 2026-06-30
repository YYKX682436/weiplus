package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/t;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class t implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCInteger, com.tencent.mm.ipcinvoker.type.IPCString> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        if (iPCInteger == null && rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(""));
        }
        int i17 = iPCInteger != null ? iPCInteger.f68404d : 1;
        rv.y2 y2Var = (rv.y2) i95.n0.c(rv.y2.class);
        com.tencent.mm.plugin.appbrand.jsapi.biz.s sVar = new com.tencent.mm.plugin.appbrand.jsapi.biz.s(rVar);
        vw.m mVar = (vw.m) y2Var;
        mVar.getClass();
        vw.l lVar = new vw.l(sVar);
        vw.k kVar = mVar.f440680d;
        kVar.getClass();
        kVar.a(i17).d(new vw.i(kVar, lVar));
    }
}

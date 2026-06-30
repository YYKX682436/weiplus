package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/b0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class b0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        com.tencent.mars.xlog.Log.i("WxaUserInfoListOperationController", "[DeleteUserTask#invoke]");
        if (iPCInteger == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            }
        } else {
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            int i17 = iPCInteger.f68404d;
            ((ce0.e) jVar).getClass();
            com.tencent.mm.modelsimple.d0 d0Var = new com.tencent.mm.modelsimple.d0(i17);
            gm0.j1.d().a(2700, new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.a0(d0Var, rVar));
            gm0.j1.d().g(d0Var);
        }
    }
}

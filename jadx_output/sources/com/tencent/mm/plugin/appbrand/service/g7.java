package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes6.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.a {
    public g7(com.tencent.mm.plugin.appbrand.service.j7 j7Var) {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.v6 v6Var = (qk.v6) i95.n0.c(qk.v6.class);
        if (v6Var != null) {
            return v6Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaServiceDevToolsLogicImpl", "devToolsService#get, devToolsService is null");
        return null;
    }
}

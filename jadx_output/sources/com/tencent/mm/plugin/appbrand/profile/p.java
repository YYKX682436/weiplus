package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes6.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {
    public p(com.tencent.mm.plugin.appbrand.profile.v vVar) {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.v6 v6Var = (qk.v6) i95.n0.c(qk.v6.class);
        if (v6Var != null) {
            return v6Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuggageProfileManagerWC", "devToolsService#get, devToolsService is null");
        return null;
    }
}

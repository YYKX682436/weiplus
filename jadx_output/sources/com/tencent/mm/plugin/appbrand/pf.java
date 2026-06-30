package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class pf implements uh1.p0 {
    @Override // uh1.p0
    public boolean a(java.lang.String str) {
        boolean contains;
        java.util.Set set = yh1.a.f462366a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            contains = true;
        } else {
            contains = ((java.util.HashSet) yh1.a.f462366a).contains(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        }
        if (!contains) {
            return com.tencent.mm.plugin.appbrand.vf.a(1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWssSwitchLogic", "isWcWssOpen : true for hardcode case");
        return true;
    }

    @Override // uh1.p0
    public boolean b(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.vf.b(1);
    }
}

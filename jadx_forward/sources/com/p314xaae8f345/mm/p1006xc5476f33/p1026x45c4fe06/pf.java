package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class pf implements uh1.p0 {
    @Override // uh1.p0
    public boolean a(java.lang.String str) {
        boolean contains;
        java.util.Set set = yh1.a.f543899a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            contains = true;
        } else {
            contains = ((java.util.HashSet) yh1.a.f543899a).contains(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        }
        if (!contains) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vf.a(1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcWssSwitchLogic", "isWcWssOpen : true for hardcode case");
        return true;
    }

    @Override // uh1.p0
    public boolean b(java.lang.String str) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vf.b(1);
    }
}

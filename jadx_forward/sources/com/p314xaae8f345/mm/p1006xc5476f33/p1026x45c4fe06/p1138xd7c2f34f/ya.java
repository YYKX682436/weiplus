package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes4.dex */
public final class ya extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f166975d = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa.f166951s, "PluginDevLaunchInfo")};

    public ya(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa.f166951s, "PluginDevLaunchInfo", dm.j9.f319399h);
    }

    public boolean D0(java.lang.String str, java.lang.String str2, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa xaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa();
        xaVar.f67152x28d45f97 = str;
        xaVar.f67154x94cabbc4 = str2;
        xaVar.f67153xf63ddcef = j17;
        if (!super.get(xaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa.f166950r)) {
            boolean mo880xb970c2b9 = super.mo880xb970c2b9(xaVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginDevLaunchInfoStorage", "setPluginInfo insert appId:%s,versionDesc:%s,devUin:%d ret:%b", str, str2, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(mo880xb970c2b9));
            return mo880xb970c2b9;
        }
        xaVar.f67153xf63ddcef = j17;
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(xaVar, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginDevLaunchInfoStorage", "setPluginInfo update appId:%s,versionDesc:%s,devUin:%d ret:%b", str, str2, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(mo9952xce0038c9));
        return mo9952xce0038c9;
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa xaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa();
        xaVar.f67152x28d45f97 = str;
        xaVar.f67154x94cabbc4 = str2;
        return super.mo9951xb06685ab(xaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa.f166950r);
    }

    public long z0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PluginDevLaunchInfoStorage", "getDevKey appId null");
            return 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa xaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa();
        xaVar.f67152x28d45f97 = str;
        xaVar.f67154x94cabbc4 = str2;
        if (super.get(xaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xa.f166950r)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginDevLaunchInfoStorage", "getDevKey appId:%s,versionDesc:%s success devKey:%d", str, str2, java.lang.Long.valueOf(xaVar.f67153xf63ddcef));
            return xaVar.f67153xf63ddcef;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginDevLaunchInfoStorage", "getDevKey appId:%s,versionDesc:%s fail", str, str2);
        return 0L;
    }
}

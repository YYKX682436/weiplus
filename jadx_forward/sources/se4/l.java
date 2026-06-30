package se4;

/* loaded from: classes9.dex */
public class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public km5.b f488464a = null;

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        this.f488464a = km5.u.b();
        if (!cu5.b.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterSaveDeviceInfoFunc", "not support soter");
            this.f488464a.a(nm5.j.c(2, "not support soter"));
            return java.lang.Boolean.TRUE;
        }
        if (!bool.booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        re4.u.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e());
        if (M != null) {
            java.lang.String string = M.getString("cpu_id", null);
            java.lang.String string2 = M.getString("uid", null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterDeviceInfoManager", "old cpuId: %s, old uid: %s", string, string2);
            zt5.r c17 = wt5.a.c();
            if (c17 != null) {
                java.lang.String str = c17.f557148c;
                java.lang.String valueOf = java.lang.String.valueOf(c17.f557147b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterDeviceInfoManager", "new cpuid: %s, uid: %s", str, valueOf);
                if (str.equals(string) && !valueOf.equals(string2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 20);
                }
                if (string2 != null && string2.equals("0")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 21);
                }
                if ("0".equals(valueOf) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 32);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(valueOf)) {
                    re4.u.b(str, valueOf);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 22);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public abstract class o2 {
    public static long a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MULTITALK_DISABLE_TIME_INT_SYNC;
        int intValue = ((java.lang.Integer) c17.m(u3Var, -1)).intValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MULTITALK_DISABLE_TIMESTAMP_LONG_SYNC;
        long longValue = ((java.lang.Long) c18.m(u3Var2, -1L)).longValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MULTITALK_CLEAR_DISABLE_TIMESTAMP_BOOLEAN_SYNC;
        boolean o17 = c19.o(u3Var3, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkUtil", "checkMultiTalkAvailable, clear:%s, disableTime: %s, disableTimestamp: %s", java.lang.Boolean.valueOf(o17), java.lang.Integer.valueOf(intValue), java.lang.Long.valueOf(longValue));
        if (o17 || intValue <= 0 || longValue <= 0) {
            gm0.j1.u().c().x(u3Var, -1);
            gm0.j1.u().c().x(u3Var2, -1L);
            gm0.j1.u().c().x(u3Var3, java.lang.Boolean.FALSE);
            return 0L;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
        long j17 = intValue * 1000;
        if (currentTimeMillis <= j17) {
            return j17 - currentTimeMillis;
        }
        gm0.j1.u().c().x(u3Var, -1);
        gm0.j1.u().c().x(u3Var2, -1L);
        return 0L;
    }

    public static java.lang.String b(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a) {
        if (c11142xe8e5c41a == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("->[usernamelist]");
        java.util.List<com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54> list = c11142xe8e5c41a.f153144i;
        if (list != null) {
            for (com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 : list) {
                stringBuffer.append(c11143x170c3f54.f153145d + "|");
                stringBuffer.append(c11143x170c3f54.f153147f + ", ");
            }
        }
        stringBuffer.append(" ->createname:" + c11142xe8e5c41a.f153143h);
        stringBuffer.append(" ->talkgroupId:" + c11142xe8e5c41a.f153139d);
        stringBuffer.append(" ->wxGroupId:" + c11142xe8e5c41a.f153141f);
        return stringBuffer.toString();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2 c() {
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2.WIFI : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2._4G : (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2._3GOr_2G : com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2.None;
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a) {
        java.lang.String str = null;
        for (int i17 = 0; i17 < c11142xe8e5c41a.f153144i.size(); i17++) {
            if (((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) c11142xe8e5c41a.f153144i.get(i17)).f153145d.equals(c01.z1.r())) {
                str = ((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) c11142xe8e5c41a.f153144i.get(i17)).f153146e;
            }
        }
        return str;
    }

    public static java.lang.String e(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a) {
        if (c11142xe8e5c41a == null) {
            return "";
        }
        java.lang.String str = c11142xe8e5c41a.f153139d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = c11142xe8e5c41a.f153140e;
        }
        return str == null ? "" : str;
    }

    public static boolean f(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a) {
        if (c11142xe8e5c41a == null) {
            return false;
        }
        boolean z17 = false;
        boolean z18 = false;
        for (com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 : c11142xe8e5c41a.f153144i) {
            if (c11143x170c3f54.f153145d.equals(c01.z1.r())) {
                if (c11143x170c3f54.f153147f != 10) {
                    continue;
                } else {
                    if (z18) {
                        return true;
                    }
                    z17 = true;
                }
            } else if (c11143x170c3f54.f153147f != 10) {
                continue;
            } else {
                if (z17) {
                    return true;
                }
                z18 = true;
            }
        }
        return false;
    }

    public static boolean g(int i17) {
        return i17 == 2 || i17 == 3;
    }
}

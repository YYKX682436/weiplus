package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes8.dex */
public abstract class u1 {
    public static void a(java.lang.String str) {
        java.lang.String[] split;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) && (split = b17.split(",")) != null) {
            int i17 = 0;
            for (int i18 = 0; i18 < split.length; i18++) {
                if (!str.equals(split[i18])) {
                    sb6.append(split[i18]);
                    sb6.append(",");
                    i17++;
                    if (i17 >= 4) {
                        break;
                    }
                }
            }
        }
        sb6.insert(0, ",");
        sb6.insert(0, str);
        sb6.deleteCharAt(sb6.length() - 1);
        gm0.j1.i();
        gm0.j1.u().c().w(327733, sb6.toString());
        gm0.j1.i();
        gm0.j1.u().c().i(true);
    }

    public static java.lang.String b() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(327733, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }
}

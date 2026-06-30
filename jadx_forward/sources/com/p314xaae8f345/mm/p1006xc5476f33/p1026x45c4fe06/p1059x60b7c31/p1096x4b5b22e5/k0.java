package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public abstract class k0 {
    public static void a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        if (c12559xbdae8559 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigatorAdReportHelper", "[rewardAD] addReportTask: appId: %s, adInfo: %s", str, c12559xbdae8559.f169327m);
        java.lang.String str3 = c12559xbdae8559.f169327m;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.j0(str, str2, str3, java.lang.System.currentTimeMillis(), c12559xbdae8559));
    }

    public static void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        int i18;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str3);
        sb6.append(",");
        sb6.append(str2);
        sb6.append(",");
        sb6.append(str);
        sb6.append(",");
        sb6.append(currentTimeMillis);
        sb6.append(",");
        sb6.append(j17);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        switch (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            case -1:
                i18 = 255;
                break;
            case 0:
                i18 = 1;
                break;
            case 1:
            case 6:
            case 8:
                i18 = 3;
                break;
            case 2:
            case 5:
            case 7:
                i18 = 2;
                break;
            case 3:
            case 4:
                i18 = 4;
                break;
            case 9:
            default:
                i18 = 6;
                break;
            case 10:
                i18 = 5;
                break;
        }
        sb6.append(i18);
        sb6.append(",,,,");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.f.a(16004, sb6.toString(), null);
    }
}

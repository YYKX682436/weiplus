package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public abstract class a {
    public static void a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:mm");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 31L, 1L, true);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:push");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 32L, 1L, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:other");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 33L, 1L, true);
        }
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashSecondReport", "secondReportCrash() process:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "mm")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 21L, 1L, true);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 22L, 1L, true);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "other")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1185L, 23L, 1L, true);
        }
    }
}

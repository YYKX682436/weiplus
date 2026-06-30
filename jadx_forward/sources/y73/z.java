package y73;

/* loaded from: classes5.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static long f541303a;

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15974, str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.FALSE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "CodeVersion:%s PatchVersion:%s TinkerId:%s Scene:%d Result:%d", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report download failed");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 41L, 1L, false);
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 42L, 1L, false);
        } else {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 3L, 1L, false);
        }
    }

    public static void c(int i17) {
        long j17 = f541303a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report report download cost = %d", java.lang.Long.valueOf(elapsedRealtime));
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 40L, 1L, false);
        }
        if (elapsedRealtime < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.HotPatchReportHelper", "hp_report report download cost failed, invalid cost");
            return;
        }
        if (elapsedRealtime <= 5000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 1, 43, false);
            return;
        }
        if (elapsedRealtime <= 60000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 1, 44, false);
        } else if (elapsedRealtime <= 180000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 1, 45, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 1, 46, false);
        }
    }

    public static void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report new hotpatch requested");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 0L, 1L, false);
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 20L, 1L, false);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 0L, 1L, false);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f541303a = android.os.SystemClock.elapsedRealtime();
    }

    public static java.lang.String e(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = stackTraceElementArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(" ");
            }
            sb6.append(stackTraceElementArr[i17].toString());
        }
        return sb6.toString();
    }
}

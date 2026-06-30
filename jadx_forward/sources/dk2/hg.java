package dk2;

/* loaded from: classes5.dex */
public final class hg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.hg f315128d = new dk2.hg();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("live_exception_monitor");
        long j17 = R.getLong("PARAM_LIVE_ID", 0L);
        boolean z17 = R.getBoolean("PARAM_IS_FOREGROUND", false);
        boolean z18 = R.getBoolean("PARAM_IS_FLOAT", false);
        int i17 = R.getInt("PARAM_THREAD_CNT_IN_PROCESS", 0);
        int i18 = R.getInt("PARAM_THREAD_CNT_IN_JAVA", 0);
        boolean z19 = R.getBoolean("PARAM_IS_SCREEN_OFF", false);
        int i19 = R.getInt("PARAM_LIVING_BATTERY", 0);
        java.lang.Integer a07 = zl2.r4.f555483a.a0();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getAbsolutePath() + "/crashFlag.live";
        boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(str);
        boolean h17 = com.p314xaae8f345.mm.vfs.w6.h(str);
        java.lang.String string = R.getString("PARAM_MEM_INFO", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveExceptionMonitor", "checkAndReportExceptionQuit [lastLiveId:" + j17 + ", isForeground:" + z17 + ", isFloat:" + z18 + ", screenOff:" + z19 + ", battery:" + i19 + ", curBattery:" + a07 + ", threadCntInProcess:" + i17 + ", threadCntInJava:" + i18 + ", meminfo:" + string + " hasStack:" + j18 + " deleteSuc:" + h17);
        pm0.z.b(xy2.b.f539688b, "liveKillByUserOrSys", j17 == 0, null, null, false, false, new dk2.gg(j17, z18, z17, i17, i18, z19, i19, a07, string, j18, h17), 60, null);
        dk2.qg.a(dk2.qg.f315523a);
    }
}

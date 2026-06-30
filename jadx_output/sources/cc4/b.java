package cc4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final cc4.b f40482a = new cc4.b();

    /* renamed from: b, reason: collision with root package name */
    public static int f40483b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static long f40484c;

    public final boolean a() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrowseEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        if (d()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            z17 = true;
        } else {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarConfig", "getBrowseEntrance >> " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrowseEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }

    public final boolean b() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSettingEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        if (d()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSettingEntranceConfig", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            z17 = true;
        } else {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarConfig", "getSettingEntrance >> " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSettingEntrance", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStarEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        boolean z17 = b() || a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStarEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarServerEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f40484c >= 60000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarConfig", "getStarServerEnable is time to update");
            f40484c = currentTimeMillis;
            f40483b = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_SERVER_STAR_ENABLE_INT, 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarConfig", "getStarServerEnable >> " + f40483b);
        boolean z17 = f40483b == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarServerEnable", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        return z17;
    }
}

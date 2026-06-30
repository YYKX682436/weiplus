package ob0;

/* loaded from: classes7.dex */
public abstract class r3 {
    public static boolean a() {
        int i17 = j62.e.g().i("clicfg_deep_background_process_reclaim", 0, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessReclaimSwitch", "isAppDeepBackgroundEnabled:" + i17);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return i17 == 0;
    }

    public static boolean b() {
        int i17 = j62.e.g().i("clicfg_exdevice_auto_release", 1, true, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessReclaimSwitch", "isExDeviceProcessReclaimDisabled:" + i17);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return i17 == 0;
    }
}

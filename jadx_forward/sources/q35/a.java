package q35;

/* loaded from: classes5.dex */
public abstract class a {
    public static void a() {
        if (fp.h.c(23)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            boolean z17 = false;
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sdcard_usable_report").getInt("ignore_battery_dialog_time", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtil", "getIgnoreBatteryOptimizationsDialogTime() time=%s", java.lang.Integer.valueOf(i17));
            if (i17 >= 3 || com.p314xaae8f345.mm.p642xad8b531f.o.b(context)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations()");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sdcard_usable_report");
            M.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (i17 == 0) {
                try {
                    com.p314xaae8f345.mm.p642xad8b531f.o.e();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", e17.getClass().toString(), e17.getMessage());
                    z17 = true;
                }
                if (z17) {
                    return;
                }
                M.putLong("last_ignore_battery_dialog_time", currentTimeMillis);
                M.putInt("ignore_battery_dialog_time", 1);
                return;
            }
            long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sdcard_usable_report").getLong("last_ignore_battery_dialog_time", currentTimeMillis);
            long j18 = currentTimeMillis - j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() last:%s diff:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            if (i17 == 1) {
                if (j18 >= 86400000) {
                    try {
                        com.p314xaae8f345.mm.p642xad8b531f.o.e();
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", e18.getClass().toString(), e18.getMessage());
                        z17 = true;
                    }
                    if (z17) {
                        return;
                    }
                    M.putLong("last_ignore_battery_dialog_time", currentTimeMillis);
                    M.putInt("ignore_battery_dialog_time", 2);
                    return;
                }
                return;
            }
            if (i17 != 2 || j18 < 604800000) {
                return;
            }
            try {
                com.p314xaae8f345.mm.p642xad8b531f.o.e();
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtil", "checkIgnoreBatteryOptimizations() Exception:%s %s", e19.getClass().toString(), e19.getMessage());
                z17 = true;
            }
            if (z17) {
                return;
            }
            M.putLong("last_ignore_battery_dialog_time", currentTimeMillis);
            M.putInt("ignore_battery_dialog_time", 3);
        }
    }
}

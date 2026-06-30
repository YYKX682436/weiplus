package com.tencent.matrix.manager;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/matrix/manager/BatteryLifecycleMonitorKt$watchBatteryChanged$receiver$1", "Landroid/content/BroadcastReceiver;", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BatteryLifecycleMonitorKt$watchBatteryChanged$receiver$1 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        jz5.l lVar = gi.d0.f272019a;
        int i17 = -1;
        if (intent != null) {
            int intExtra = intent.getIntExtra(ya.b.LEVEL, -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra2 > 0) {
                i17 = (intExtra * 100) / intExtra2;
            }
        }
        boolean z17 = false;
        if (i17 >= 0 && i17 < 1001) {
            z17 = true;
        }
        if (z17) {
            jz5.l lVar2 = gi.d0.f272019a;
            if (lVar2 != null) {
                kotlin.jvm.internal.o.d(lVar2);
                if (i17 == ((java.lang.Number) lVar2.f302833d).intValue()) {
                    return;
                }
            }
            gi.d0.f272019a = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }
}

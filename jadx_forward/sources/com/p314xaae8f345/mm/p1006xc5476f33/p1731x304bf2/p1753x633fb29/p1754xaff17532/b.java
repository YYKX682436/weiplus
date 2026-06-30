package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public abstract class b {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.a a() {
        boolean z17;
        android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.a();
        if (registerReceiver != null) {
            try {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z17 = false;
                    aVar.f221975a = z17;
                    aVar.f221976b = registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1) / registerReceiver.getIntExtra("scale", -1);
                }
                z17 = true;
                aVar.f221975a = z17;
                aVar.f221976b = registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1) / registerReceiver.getIntExtra("scale", -1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BatteryHelper", "err:%s", e17.getMessage());
            }
        }
        return aVar;
    }
}

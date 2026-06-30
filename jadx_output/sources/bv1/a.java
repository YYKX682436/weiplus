package bv1;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv1.b f24710d;

    public a(bv1.b bVar) {
        this.f24710d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bv1.b bVar = this.f24710d;
        android.os.BatteryManager batteryManager = bVar.f24714d;
        long longProperty = batteryManager.getLongProperty(5);
        int intProperty = batteryManager.getIntProperty(1);
        int intProperty2 = batteryManager.getIntProperty(2);
        int intProperty3 = batteryManager.getIntProperty(3);
        int intProperty4 = batteryManager.getIntProperty(4);
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryUtils", "mBatteryEnergyCounter=" + longProperty + " nanoWattHours ");
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryUtils", "mBatteryChargeCounter=" + intProperty + "  microAmpereHours");
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryUtils", "mBatteryCurrentNow=" + intProperty2 + "   microAmpere");
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryUtils", "mBatteryCurrentAverage=" + intProperty3 + "  microAmpere");
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryUtils", "mBatteryCapacity=" + intProperty4 + "  ");
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryUtils", "mBatteryEnergyCounter=" + longProperty + " nanoWattHours ");
        long j17 = bVar.f24711a;
        bVar.f24711a = j17 != 0 ? (j17 + intProperty3) / 2 : intProperty3;
        bVar.a();
    }
}

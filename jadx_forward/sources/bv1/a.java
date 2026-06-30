package bv1;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv1.b f106243d;

    public a(bv1.b bVar) {
        this.f106243d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bv1.b bVar = this.f106243d;
        android.os.BatteryManager batteryManager = bVar.f106247d;
        long longProperty = batteryManager.getLongProperty(5);
        int intProperty = batteryManager.getIntProperty(1);
        int intProperty2 = batteryManager.getIntProperty(2);
        int intProperty3 = batteryManager.getIntProperty(3);
        int intProperty4 = batteryManager.getIntProperty(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtils", "mBatteryEnergyCounter=" + longProperty + " nanoWattHours ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtils", "mBatteryChargeCounter=" + intProperty + "  microAmpereHours");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtils", "mBatteryCurrentNow=" + intProperty2 + "   microAmpere");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtils", "mBatteryCurrentAverage=" + intProperty3 + "  microAmpere");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtils", "mBatteryCapacity=" + intProperty4 + "  ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryUtils", "mBatteryEnergyCounter=" + longProperty + " nanoWattHours ");
        long j17 = bVar.f106244a;
        bVar.f106244a = j17 != 0 ? (j17 + intProperty3) / 2 : intProperty3;
        bVar.a();
    }
}

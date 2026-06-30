package com.tencent.matrix.batterycanary.stats;

/* loaded from: classes12.dex */
public final class k extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.matrix.batterycanary.stats.j f52621b;

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        int i17 = z17 ? 1 : 2;
        if (this.f52621b != null) {
            new com.tencent.matrix.batterycanary.stats.BatteryRecord.AppStatRecord().f52601f = i17;
        }
    }

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        this.f395294a.f363335d.getClass();
        this.f52621b = this.f395294a.f363335d.f363307z;
        com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord procStatRecord = new com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord();
        procStatRecord.f52607g = android.os.Process.myPid();
        procStatRecord.f52606f = 1;
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord procStatRecord = new com.tencent.matrix.batterycanary.stats.BatteryRecord.ProcStatRecord();
        procStatRecord.f52607g = android.os.Process.myPid();
        procStatRecord.f52606f = 2;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.BatteryStats";
    }

    public void k(java.lang.String str, int i17, java.util.Map map) {
        com.tencent.matrix.batterycanary.stats.j jVar = this.f52621b;
        if (jVar != null) {
            ((com.tencent.matrix.batterycanary.stats.i) jVar).getClass();
            com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord eventStatRecord = new com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord();
            eventStatRecord.f52603f = i17;
            eventStatRecord.f52604g = str;
            if (map.isEmpty()) {
                return;
            }
            eventStatRecord.f52605h = map;
        }
    }
}

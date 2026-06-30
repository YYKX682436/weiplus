package com.tencent.matrix.batterycanary.stats.ui;

/* loaded from: classes12.dex */
public class BatteryStatsAdapter$Item$EventDumpItem extends com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord implements vh.h {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord f52626p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f52627q = false;

    public BatteryStatsAdapter$Item$EventDumpItem(com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord reportRecord) {
        this.f52626p = reportRecord;
        this.f52600e = reportRecord.f52600e;
        this.f52603f = reportRecord.f52603f;
        this.f52604g = reportRecord.f52604g;
        this.f52605h = reportRecord.f52605h;
        this.f52608i = reportRecord.f52608i;
        this.f52609m = reportRecord.f52609m;
        this.f52610n = reportRecord.f52610n;
        this.f52611o = reportRecord.f52611o;
    }

    @Override // vh.h
    public int a() {
        return 1;
    }
}

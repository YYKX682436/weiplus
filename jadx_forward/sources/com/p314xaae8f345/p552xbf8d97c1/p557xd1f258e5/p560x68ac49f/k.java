package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f;

/* loaded from: classes12.dex */
public final class k extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.j f134154b;

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        int i17 = z17 ? 1 : 2;
        if (this.f134154b != null) {
            new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.AppStatRecord().f134134f = i17;
        }
    }

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        this.f476827a.f444868d.getClass();
        this.f134154b = this.f476827a.f444868d.f444840z;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord procStatRecord = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord();
        procStatRecord.f134140g = android.os.Process.myPid();
        procStatRecord.f134139f = 1;
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord procStatRecord = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ProcStatRecord();
        procStatRecord.f134140g = android.os.Process.myPid();
        procStatRecord.f134139f = 2;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.BatteryStats";
    }

    public void k(java.lang.String str, int i17, java.util.Map map) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.j jVar = this.f134154b;
        if (jVar != null) {
            ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.i) jVar).getClass();
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord eventStatRecord = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord();
            eventStatRecord.f134136f = i17;
            eventStatRecord.f134137g = str;
            if (map.isEmpty()) {
                return;
            }
            eventStatRecord.f134138h = map;
        }
    }
}

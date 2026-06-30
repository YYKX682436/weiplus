package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class l implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f180496d = 10;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o f180497e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o oVar) {
        this.f180497e = oVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o oVar = this.f180497e;
        if (oVar.f180539a == null) {
            long j17 = this.f180496d;
            this.f180496d = j17 - 1;
            if (j17 > 0) {
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "now retry count = %d", java.lang.Long.valueOf(this.f180496d));
        if (this.f180496d <= 0) {
            return false;
        }
        oVar.c();
        return false;
    }
}

package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class l implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f98963d = 10;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o f98964e;

    public l(com.tencent.mm.plugin.exdevice.model.o oVar) {
        this.f98964e = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.exdevice.model.o oVar = this.f98964e;
        if (oVar.f99006a == null) {
            long j17 = this.f98963d;
            this.f98963d = j17 - 1;
            if (j17 > 0) {
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "now retry count = %d", java.lang.Long.valueOf(this.f98963d));
        if (this.f98963d <= 0) {
            return false;
        }
        oVar.c();
        return false;
    }
}

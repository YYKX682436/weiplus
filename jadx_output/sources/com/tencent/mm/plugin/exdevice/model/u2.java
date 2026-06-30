package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class u2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.w2 f99070d;

    public u2(com.tencent.mm.plugin.exdevice.model.w2 w2Var) {
        this.f99070d = w2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ScanDeviceLogic", "Restart scanning...");
        com.tencent.mm.plugin.exdevice.model.l3.Bi().d(0, this.f99070d);
        return true;
    }
}

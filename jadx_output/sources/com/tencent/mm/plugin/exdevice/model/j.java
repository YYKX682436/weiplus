package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.k f98923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f98925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98927h;

    public j(com.tencent.mm.plugin.exdevice.model.k kVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f98923d = kVar;
        this.f98924e = str;
        this.f98925f = i17;
        this.f98926g = str2;
        this.f98927h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.exdevice.model.k kVar = this.f98923d;
        com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "send msgid %d", java.lang.Long.valueOf(kVar.f98944a));
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
        networkDeviceInfo.f66586d = this.f98924e;
        networkDeviceInfo.f66595p = this.f98925f;
        networkDeviceInfo.f66594o = true;
        r45.rf4 rf4Var = new r45.rf4();
        long j17 = kVar.f98944a;
        com.tencent.mm.modelbase.u0 u0Var = kVar.f98955l;
        if (j17 == -1) {
            com.tencent.mm.storage.b9 H6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().H6(this.f98926g);
            r45.tf4 tf4Var = new r45.tf4();
            tf4Var.f386373d = (float) H6.f193776b;
            tf4Var.f386374e = (float) H6.f193777c;
            tf4Var.f386375f = H6.f193778d;
            tf4Var.f386376g = H6.f193779e;
            tf4Var.f386377h = H6.f193780f;
            rf4Var.f384811f = tf4Var;
            rf4Var.f384809d = 2;
            if (kVar.a(rf4Var, networkDeviceInfo)) {
                return;
            }
            kVar.b(rf4Var, networkDeviceInfo, u0Var);
            return;
        }
        java.lang.String str = this.f98927h;
        if (str == null) {
            if (!com.tencent.mm.plugin.exdevice.model.p.b(rf4Var, null, j17, kVar.f98945b, "") || kVar.a(rf4Var, networkDeviceInfo)) {
                return;
            }
            kVar.b(rf4Var, networkDeviceInfo, u0Var);
            return;
        }
        if (!com.tencent.mm.plugin.exdevice.model.p.b(rf4Var, null, j17, kVar.f98945b, str)) {
            com.tencent.mars.xlog.Log.i("ExDeviceSendIotLogic", "genMsg failed");
        } else {
            if (kVar.a(rf4Var, networkDeviceInfo)) {
                return;
            }
            kVar.b(rf4Var, networkDeviceInfo, u0Var);
        }
    }
}

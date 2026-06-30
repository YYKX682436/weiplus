package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class n0 implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.p0 f76714a;

    public n0(com.tencent.mm.plugin.appbrand.av_device_usage.p0 p0Var) {
        this.f76714a = p0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "onPhoneCall: " + i17);
        com.tencent.mm.plugin.appbrand.av_device_usage.p0 p0Var = this.f76714a;
        boolean andSet = p0Var.f76728b.getAndSet(true);
        yz5.l lVar = p0Var.f76727a;
        if (andSet) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
            return;
        }
        if (((java.lang.Boolean) ((jz5.n) p0Var.f76729c).getValue()).booleanValue()) {
            boolean Bi = com.tencent.mm.sdk.platformtools.l5.Bi();
            com.tencent.mm.plugin.appbrand.av_device_usage.o oVar = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a;
            if (Bi == (2 == i17)) {
                lVar.invoke(java.lang.Integer.valueOf(i17));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "skip first.");
    }
}

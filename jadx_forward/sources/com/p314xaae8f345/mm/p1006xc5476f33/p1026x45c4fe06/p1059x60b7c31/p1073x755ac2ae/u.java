package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public final class u extends ib1.e {
    @Override // ib1.e
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, java.lang.String deviceId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiCreateBLEConnectionWC", "onCreateConnectionDone, deviceId: " + deviceId + ", isSuccess: " + z17);
        if (z17) {
            java.lang.String mo48798x74292566 = env.mo48798x74292566();
            if (mo48798x74292566 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiCreateBLEConnectionWC", "onCreateConnectionDone, appId is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a.d(mo48798x74292566, deviceId);
            }
        }
    }
}

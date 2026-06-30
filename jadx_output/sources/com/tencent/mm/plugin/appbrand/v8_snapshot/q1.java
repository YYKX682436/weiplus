package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class q1 implements com.tencent.mm.plugin.appbrand.appcache.w7 {
    @Override // com.tencent.mm.plugin.appbrand.appcache.w7
    public void J1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader) {
        kotlin.jvm.internal.o.g(reader, "reader");
        com.tencent.mm.plugin.appbrand.v8_snapshot.f3 f3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90760l) {
            if (com.tencent.mm.plugin.appbrand.v8_snapshot.q2.f90808a.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "onUpdateUsingVersion, block");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.v8_snapshot.e3(reader), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
        }
    }
}

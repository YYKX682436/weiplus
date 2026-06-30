package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f90690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(java.util.concurrent.atomic.AtomicInteger atomicInteger, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        super(0);
        this.f90690d = atomicInteger;
        this.f90691e = iCommLibReader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int decrementAndGet = this.f90690d.decrementAndGet();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "done#onCommLibUsingVersionUpdate, theCreatingCount: " + decrementAndGet);
        if (decrementAndGet <= 0) {
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.v8_snapshot.b3(this.f90691e), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
        }
        return jz5.f0.f302826a;
    }
}

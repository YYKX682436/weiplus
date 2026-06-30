package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class o0 extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mm.matrix.monitor.p0.f68792a = true;
        ((ku5.t0) ku5.t0.f312615d).l(com.tencent.mm.matrix.monitor.n0.f68787d, java.util.concurrent.TimeUnit.SECONDS.toMillis(70L), "MicroMsg.MemoryReportProcRecycleApplier");
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.MemoryReportProcRecycleApplier");
        com.tencent.mm.matrix.monitor.p0.f68792a = false;
    }
}

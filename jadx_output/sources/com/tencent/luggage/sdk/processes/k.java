package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.r f47647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.luggage.sdk.processes.r rVar) {
        super(1);
        this.f47647d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s record = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(record, "record");
        com.tencent.mm.plugin.appbrand.task.u0 u0Var = (com.tencent.mm.plugin.appbrand.task.u0) this.f47647d;
        u0Var.getClass();
        com.tencent.luggage.sdk.processes.h.q(u0Var.f(record), new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandCloseMessage(record.f47684a), null, 2, null);
        return jz5.f0.f302826a;
    }
}

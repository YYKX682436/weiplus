package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f47673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.r f47674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, com.tencent.luggage.sdk.processes.r rVar, java.lang.String str) {
        super(1);
        this.f47673d = z17;
        this.f47674e = rVar;
        this.f47675f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.h hVar;
        com.tencent.luggage.sdk.processes.s record = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(record, "record");
        boolean z17 = this.f47673d;
        com.tencent.luggage.sdk.processes.r rVar = this.f47674e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.task.u0 u0Var = (com.tencent.mm.plugin.appbrand.task.u0) rVar;
            u0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "sendFinishMessageSync record:" + record + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            ((com.tencent.mm.plugin.appbrand.task.k) u0Var.f(record)).r(new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage(record.f47684a, record.f47691h, true));
        } else {
            rVar.w(record);
        }
        if (record.f47688e) {
            rVar.getClass();
            java.lang.String appId = this.f47675f;
            kotlin.jvm.internal.o.g(appId, "appId");
            rVar.i(appId, -1, com.tencent.luggage.sdk.processes.q.f47680d);
        } else {
            rVar.getClass();
            try {
                hVar = rVar.f(record);
            } catch (com.tencent.luggage.sdk.processes.y unused) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.b(record);
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class d1 extends com.tencent.mm.plugin.appbrand.task.p {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f89010n = jz5.h.b(new com.tencent.mm.plugin.appbrand.task.c1(this));

    @Override // com.tencent.mm.plugin.appbrand.task.p, com.tencent.luggage.sdk.processes.r
    /* renamed from: Q */
    public com.tencent.mm.plugin.appbrand.task.k[] o() {
        com.tencent.mm.plugin.appbrand.task.k[] kVarArr = (com.tencent.mm.plugin.appbrand.task.k[]) ((jz5.n) this.f89010n).getValue();
        for (com.tencent.mm.plugin.appbrand.task.k kVar : kVarArr) {
            if (!kVar.u(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e) || !kVar.u(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f)) {
                throw new java.lang.IllegalStateException(("Incorrect declaration(" + kVar + ") for AppBrandThreeProcessesManager").toString());
            }
        }
        return kVarArr;
    }
}

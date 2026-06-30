package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class y0 extends com.tencent.mm.plugin.appbrand.task.z0 {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.task.k[] f89220o;

    public y0() {
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        arrayList.add(new com.tencent.mm.plugin.appbrand.task.n());
        Q(arrayList);
        this.f89220o = (com.tencent.mm.plugin.appbrand.task.k[]) arrayList.toArray(new com.tencent.mm.plugin.appbrand.task.k[0]);
    }

    @Override // com.tencent.mm.plugin.appbrand.task.z0, com.tencent.mm.plugin.appbrand.task.u0
    public com.tencent.mm.plugin.appbrand.task.k G(com.tencent.luggage.sdk.processes.LuggageServiceType serviceType) {
        kotlin.jvm.internal.o.g(serviceType, "serviceType");
        if (com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e == serviceType) {
            return null;
        }
        return super.G(serviceType);
    }

    @Override // com.tencent.mm.plugin.appbrand.task.z0
    /* renamed from: R */
    public com.tencent.mm.plugin.appbrand.task.k[] o() {
        return this.f89220o;
    }

    @Override // com.tencent.mm.plugin.appbrand.task.z0, com.tencent.luggage.sdk.processes.r
    public com.tencent.luggage.sdk.processes.h[] o() {
        return this.f89220o;
    }
}

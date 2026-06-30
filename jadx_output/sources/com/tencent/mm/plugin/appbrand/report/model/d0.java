package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public final class d0 implements m3.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Queue f87936a = new java.util.concurrent.ConcurrentLinkedQueue();

    public d0(com.tencent.mm.plugin.appbrand.report.model.z zVar) {
    }

    @Override // m3.e
    public java.lang.Object a() {
        com.tencent.mm.plugin.appbrand.report.model.c0 c0Var = (com.tencent.mm.plugin.appbrand.report.model.c0) ((java.util.concurrent.ConcurrentLinkedQueue) this.f87936a).poll();
        return c0Var == null ? new com.tencent.mm.plugin.appbrand.report.model.c0(null) : c0Var;
    }

    @Override // m3.e
    public boolean b(java.lang.Object obj) {
        return ((java.util.concurrent.ConcurrentLinkedQueue) this.f87936a).offer((com.tencent.mm.plugin.appbrand.report.model.c0) obj);
    }
}

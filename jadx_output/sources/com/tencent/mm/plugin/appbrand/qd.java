package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class qd implements com.tencent.mm.plugin.appbrand.sc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f87737a = new java.util.concurrent.ConcurrentSkipListSet(new com.tencent.mm.plugin.appbrand.pd(this));

    @Override // com.tencent.mm.plugin.appbrand.sc
    public void a() {
        java.util.Iterator it = new java.util.LinkedList(this.f87737a).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.sc) it.next()).a();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.sc
    public void b(com.tencent.mm.plugin.appbrand.hc hcVar) {
        java.util.Iterator it = new java.util.LinkedList(this.f87737a).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.sc) it.next()).b(hcVar);
        }
    }
}

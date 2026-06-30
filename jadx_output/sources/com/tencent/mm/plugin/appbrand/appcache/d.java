package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.e f75482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.appbrand.appcache.e eVar) {
        super(1);
        this.f75482d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String appId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.List list = (java.util.List) this.f75482d.f75499e.get(appId);
        if (list != null) {
            java.util.Iterator it = new java.util.ArrayList(list).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.launching.p2) ((com.tencent.mm.plugin.appbrand.service.c5) it.next())).a();
            }
        }
        return jz5.f0.f302826a;
    }
}

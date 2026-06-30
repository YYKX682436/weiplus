package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f84712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(yz5.l lVar, com.tencent.mm.plugin.appbrand.launching.q4 q4Var) {
        super(1);
        this.f84712d = lVar;
        this.f84713e = q4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress it = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f84712d.invoke(it);
        com.tencent.mm.plugin.appbrand.launching.j6 j6Var = com.tencent.mm.plugin.appbrand.launching.x6.f85412a;
        com.tencent.mm.plugin.appbrand.launching.o6 request = this.f84713e.f85059b;
        j6Var.getClass();
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
        com.tencent.mm.plugin.appbrand.app.r9.mj();
        java.util.Set d17 = com.tencent.mm.plugin.appbrand.launching.j6.f84696e.d(request);
        if (d17 != null) {
            java.util.Iterator it6 = d17.iterator();
            while (it6.hasNext()) {
                ((yz5.l) it6.next()).invoke(it);
            }
        }
        return jz5.f0.f302826a;
    }
}

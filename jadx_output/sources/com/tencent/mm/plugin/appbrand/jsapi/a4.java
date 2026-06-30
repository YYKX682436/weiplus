package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.b4 f78688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fh f78689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f78690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f78691g;

    public a4(com.tencent.mm.plugin.appbrand.jsapi.b4 b4Var, r45.fh fhVar, yz5.l lVar, yz5.l lVar2) {
        this.f78688d = b4Var;
        this.f78689e = fhVar;
        this.f78690f = lVar;
        this.f78691g = lVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.b4 b4Var = this.f78688d;
        km5.d e17 = b4Var.f79829d.e1("/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync", b4Var.f79826a, this.f78689e, r45.gh.class);
        final yz5.l lVar = this.f78690f;
        ((km5.q) e17.a(new km5.f(lVar) { // from class: com.tencent.mm.plugin.appbrand.jsapi.h4

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.l f81267a;

            {
                kotlin.jvm.internal.o.g(lVar, "function");
                this.f81267a = lVar;
            }

            @Override // km5.f
            public final /* synthetic */ void a(java.lang.Object obj) {
                this.f81267a.invoke(obj);
            }
        })).s(new com.tencent.mm.plugin.appbrand.jsapi.z3(this.f78691g));
    }
}

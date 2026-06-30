package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class c implements o31.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c f82323a = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f82324b = new java.util.concurrent.ConcurrentHashMap();

    @Override // o31.a
    public int a(o31.d rr6, o31.b bVar, o31.e scene) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.appbrand.networking.c0 c0Var = (com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class);
        if (c0Var == null) {
            return -1;
        }
        o31.c cVar = (o31.c) rr6;
        ((km5.q) c0Var.e1(cVar.f342670e, scene instanceof f31.f ? (java.lang.String) f82324b.get(((f31.f) scene).f259272a) : null, cVar.f342667b, cVar.f342668c.getClass()).a(new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.a(rr6, bVar, scene))).s(new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.b(bVar, scene));
        return 0;
    }
}

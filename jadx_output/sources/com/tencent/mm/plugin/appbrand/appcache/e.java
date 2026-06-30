package com.tencent.mm.plugin.appbrand.appcache;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public final class e extends i95.w implements com.tencent.mm.plugin.appbrand.service.d5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.c f75498d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f75499e;

    public e() {
        com.tencent.mm.plugin.appbrand.appcache.c cVar = new com.tencent.mm.plugin.appbrand.appcache.c();
        com.tencent.mm.plugin.appbrand.appcache.d dVar = new com.tencent.mm.plugin.appbrand.appcache.d(this);
        synchronized (cVar.f75458a) {
            cVar.f75460c = dVar;
        }
        this.f75498d = cVar;
        this.f75499e = new java.util.concurrent.ConcurrentHashMap();
    }
}

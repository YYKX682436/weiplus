package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public final class s3 extends com.tencent.mm.plugin.appbrand.jsapi.lbs.l1 {

    /* renamed from: v, reason: collision with root package name */
    public double f92184v = 0.1d;

    /* renamed from: w, reason: collision with root package name */
    public double f92185w = 0.1d;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f92186x = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f92187y = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f92188z = jz5.h.b(new com.tencent.mm.plugin.appbrand.wxassistant.cdp.r3(this));

    @Override // lf.e, lk1.c
    public void Pg(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        if (bVar != null) {
            bVar.j(0, "ok", f(str));
        }
    }

    public final lk1.a f(java.lang.String str) {
        lk1.a aVar = new lk1.a();
        aVar.f319007l = str;
        aVar.f318996a = this.f92184v;
        aVar.f318997b = this.f92185w;
        aVar.f319000e = 10.0d;
        aVar.f318998c = "network";
        return aVar;
    }

    @Override // lf.e, lk1.c
    public boolean ia(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantLocationManager", "unregisterLocation type:" + str + " locationListener:" + bVar);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f92187y;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet2 = this.f92186x;
        if (bVar != null) {
            if (kotlin.jvm.internal.o.b("wgs84", str)) {
                copyOnWriteArraySet2.remove(bVar);
            } else {
                copyOnWriteArraySet.remove(bVar);
            }
        }
        if (!copyOnWriteArraySet2.isEmpty() || !copyOnWriteArraySet.isEmpty()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantLocationManager", "unregisterLocation stopTimer");
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f92188z).getValue()).d();
        return true;
    }

    @Override // lf.e, lk1.c
    public boolean w9(java.lang.String str, lk1.b bVar, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantLocationManager", "registerLocation type:" + str + " locationListener:" + bVar);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f92187y;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet2 = this.f92186x;
        if (bVar != null) {
            if (kotlin.jvm.internal.o.b("wgs84", str)) {
                copyOnWriteArraySet2.add(bVar);
            } else {
                copyOnWriteArraySet.add(bVar);
            }
        }
        if ((!copyOnWriteArraySet2.isEmpty()) || (!copyOnWriteArraySet.isEmpty())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantLocationManager", "registerLocation startTimer");
            ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f92188z).getValue()).c(2000L, 2000L);
        }
        return true;
    }
}

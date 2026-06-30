package com.tencent.mm.plugin.appbrand.jsapi;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.if, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cif {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f81316a = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.hf.f81294d);

    /* renamed from: b, reason: collision with root package name */
    public boolean f81317b = true;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseLongArray f81318c = new android.util.SparseLongArray();

    public final synchronized void a(int i17, java.lang.String apiName) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        if (this.f81317b) {
            return;
        }
        long j17 = this.f81318c.get(i17, -1L);
        if (j17 >= 0) {
            b(apiName, java.lang.System.currentTimeMillis() - j17);
            return;
        }
        com.tencent.mars.xlog.Log.w("Luggage.JsInvokeCostManager", "get startTime fail, id:" + i17);
    }

    public final synchronized void b(java.lang.String apiName, long j17) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        if (this.f81317b) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.gf gfVar = (com.tencent.mm.plugin.appbrand.jsapi.gf) ((java.util.Map) ((jz5.n) this.f81316a).getValue()).get(apiName);
        if (gfVar == null) {
            ((java.util.Map) ((jz5.n) this.f81316a).getValue()).put(apiName, new com.tencent.mm.plugin.appbrand.jsapi.gf(1, j17));
        } else {
            gfVar.f81262a++;
            gfVar.f81263b += j17;
        }
    }
}

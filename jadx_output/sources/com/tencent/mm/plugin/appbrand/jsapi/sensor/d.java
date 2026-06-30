package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public class d implements com.tencent.mm.plugin.appbrand.utils.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.e f82995a;

    public d(com.tencent.mm.plugin.appbrand.jsapi.sensor.e eVar) {
        this.f82995a = eVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.j2
    public boolean onAction(java.lang.Object... objArr) {
        float[] fArr = (float[]) objArr[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("x", java.lang.Float.valueOf((-fArr[0]) / 10.0f));
        hashMap.put("y", java.lang.Float.valueOf((-fArr[1]) / 10.0f));
        hashMap.put("z", java.lang.Float.valueOf((-fArr[2]) / 10.0f));
        com.tencent.mm.plugin.appbrand.jsapi.sensor.f fVar = (com.tencent.mm.plugin.appbrand.jsapi.sensor.f) this.f82995a;
        com.tencent.mm.plugin.appbrand.jsapi.sensor.c cVar = fVar.f83001f;
        cVar.t(hashMap);
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.j0.f83014a.a(cVar, fVar.f83002g);
    }
}

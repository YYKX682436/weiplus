package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public class x implements com.tencent.mm.plugin.appbrand.utils.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.y f83050b;

    public x(com.tencent.mm.plugin.appbrand.jsapi.sensor.y yVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f83050b = yVar;
        this.f83049a = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.j2
    public boolean onAction(java.lang.Object... objArr) {
        float[] fArr = (float[]) objArr[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("x", java.lang.Float.valueOf(fArr[0]));
        hashMap.put("y", java.lang.Float.valueOf(fArr[1]));
        hashMap.put("z", java.lang.Float.valueOf(fArr[2]));
        com.tencent.mm.plugin.appbrand.jsapi.sensor.y yVar = this.f83050b;
        yVar.f83053f.t(hashMap);
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.j0.f83014a.a(yVar.f83053f, this.f83049a);
    }
}

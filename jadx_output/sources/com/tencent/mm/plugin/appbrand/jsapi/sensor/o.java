package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public class o implements com.tencent.mm.plugin.appbrand.utils.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.p f83033b;

    public o(com.tencent.mm.plugin.appbrand.jsapi.sensor.p pVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f83033b = pVar;
        this.f83032a = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.j2
    public boolean onAction(java.lang.Object... objArr) {
        float[] fArr = (float[]) objArr[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("alpha", java.lang.Float.valueOf(fArr[0]));
        hashMap.put("beta", java.lang.Float.valueOf(fArr[1]));
        hashMap.put("gamma", java.lang.Float.valueOf(fArr[2]));
        com.tencent.mm.plugin.appbrand.jsapi.sensor.p pVar = this.f83033b;
        pVar.f83036f.t(hashMap);
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.j0.f83014a.a(pVar.f83036f, this.f83032a);
    }
}

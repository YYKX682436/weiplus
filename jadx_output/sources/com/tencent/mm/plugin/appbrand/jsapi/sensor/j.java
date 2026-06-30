package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public class j implements com.tencent.mm.plugin.appbrand.utils.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.k f83013b;

    public j(com.tencent.mm.plugin.appbrand.jsapi.sensor.k kVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f83013b = kVar;
        this.f83012a = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.j2
    public boolean onAction(java.lang.Object... objArr) {
        float[] fArr = new float[9];
        com.tencent.mm.plugin.appbrand.jsapi.sensor.k kVar = this.f83013b;
        android.hardware.SensorManager.getRotationMatrix(fArr, null, kVar.f83016e, kVar.f83017f);
        android.hardware.SensorManager.getOrientation(fArr, new float[3]);
        java.util.HashMap hashMap = new java.util.HashMap();
        float degrees = (float) java.lang.Math.toDegrees(r6[0]);
        if (degrees < 0.0f) {
            degrees += 360.0f;
        }
        hashMap.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, java.lang.Float.valueOf(degrees));
        if (kVar.f83019h.equalsIgnoreCase("unknow")) {
            hashMap.put("accuracy", kVar.f83019h + "{value:" + kVar.f83020i + "}");
        } else {
            hashMap.put("accuracy", kVar.f83019h);
        }
        kVar.f83021m.t(hashMap);
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.j0.f83014a.a(kVar.f83021m, this.f83012a);
    }
}

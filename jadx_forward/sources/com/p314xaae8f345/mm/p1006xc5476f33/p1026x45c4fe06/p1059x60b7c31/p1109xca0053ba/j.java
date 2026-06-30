package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes13.dex */
public class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.k f164546b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f164546b = kVar;
        this.f164545a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j2
    /* renamed from: onAction */
    public boolean mo51264x3a2454f5(java.lang.Object... objArr) {
        float[] fArr = new float[9];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.k kVar = this.f164546b;
        android.hardware.SensorManager.getRotationMatrix(fArr, null, kVar.f164549e, kVar.f164550f);
        android.hardware.SensorManager.getOrientation(fArr, new float[3]);
        java.util.HashMap hashMap = new java.util.HashMap();
        float degrees = (float) java.lang.Math.toDegrees(r6[0]);
        if (degrees < 0.0f) {
            degrees += 360.0f;
        }
        hashMap.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, java.lang.Float.valueOf(degrees));
        if (kVar.f164552h.equalsIgnoreCase("unknow")) {
            hashMap.put("accuracy", kVar.f164552h + "{value:" + kVar.f164553i + "}");
        } else {
            hashMap.put("accuracy", kVar.f164552h);
        }
        kVar.f164554m.t(hashMap);
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.j0.f164547a.a(kVar.f164554m, this.f164545a);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes13.dex */
public class x implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.y f164583b;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f164583b = yVar;
        this.f164582a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j2
    /* renamed from: onAction */
    public boolean mo51264x3a2454f5(java.lang.Object... objArr) {
        float[] fArr = (float[]) objArr[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("x", java.lang.Float.valueOf(fArr[0]));
        hashMap.put("y", java.lang.Float.valueOf(fArr[1]));
        hashMap.put("z", java.lang.Float.valueOf(fArr[2]));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.y yVar = this.f164583b;
        yVar.f164586f.t(hashMap);
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.j0.f164547a.a(yVar.f164586f, this.f164582a);
    }
}

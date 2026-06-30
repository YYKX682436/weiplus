package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.d f162913f;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162913f = dVar;
        this.f162911d = lVar;
        this.f162912e = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.C12142xb5a8a4b0 c12142xb5a8a4b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.C12142xb5a8a4b0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.d dVar = this.f162913f;
        int i17 = this.f162912e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162911d;
        if (c12142xb5a8a4b0 == null) {
            lVar.a(i17, dVar.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("exist", java.lang.Boolean.valueOf(c12142xb5a8a4b0.f162907d));
        hashMap.put("enabled", java.lang.Boolean.valueOf(c12142xb5a8a4b0.f162908e));
        lVar.a(i17, dVar.p("ok", hashMap));
    }
}

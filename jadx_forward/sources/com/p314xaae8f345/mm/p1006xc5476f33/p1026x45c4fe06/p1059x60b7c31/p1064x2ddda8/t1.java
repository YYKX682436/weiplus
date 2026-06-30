package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class t1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1 f161269c;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1 v1Var) {
        this.f161267a = yVar;
        this.f161268b = i17;
        this.f161269c = v1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v4
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserCancel appId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161267a;
        sb6.append(yVar.mo48798x74292566());
        sb6.append(", callbackId:");
        int i17 = this.f161268b;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiChooseLicensePlate", sb6.toString());
        yVar.a(i17, this.f161269c.o("fail cancel"));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v4
    public void b(java.lang.String plateNo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plateNo, "plateNo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlateNoChosen plateNo:");
        sb6.append(plateNo);
        sb6.append(", appId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161267a;
        sb6.append(yVar.mo48798x74292566());
        sb6.append(", callbackId:");
        int i17 = this.f161268b;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiChooseLicensePlate", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("plateNumber", plateNo);
        yVar.a(i17, this.f161269c.p("ok", hashMap));
    }
}

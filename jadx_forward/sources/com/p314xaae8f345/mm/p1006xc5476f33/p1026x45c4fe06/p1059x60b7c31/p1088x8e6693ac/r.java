package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public final class r implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f162519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f162520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.v f162522d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.v vVar) {
        this.f162519a = o6Var;
        this.f162520b = c0Var;
        this.f162521c = i17;
        this.f162522d = vVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ye.a(this.f162519a);
        if (a17 == null || a17.isRecycled()) {
            km5.u.b().a(null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save failed, appId=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f162520b;
            sb6.append(c0Var.mo48798x74292566());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", sb6.toString());
            c0Var.a(this.f162521c, this.f162522d.o("fail"));
        }
        return a17;
    }
}

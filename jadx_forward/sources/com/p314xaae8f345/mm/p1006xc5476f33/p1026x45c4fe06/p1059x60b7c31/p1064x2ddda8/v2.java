package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class v2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o f161292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f161294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 f161295d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var) {
        this.f161292a = oVar;
        this.f161293b = yVar;
        this.f161294c = i17;
        this.f161295d = w2Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar = this.f161292a;
        if (oVar != null) {
            oVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onInterrupt, appId[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161293b;
        sb6.append(yVar.mo48798x74292566());
        sb6.append("], callbackId[");
        int i17 = this.f161294c;
        sb6.append(i17);
        sb6.append("], e[");
        sb6.append(obj != null ? obj.toString() : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.JsApiLoginLU", sb6.toString());
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s) {
            return;
        }
        boolean z17 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var = this.f161295d;
        if (z17) {
            yVar.a(i17, w2Var.o("fail " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p) obj).getMessage()));
        } else if (obj instanceof java.lang.Throwable) {
            yVar.a(i17, w2Var.o("fail " + ((java.lang.Throwable) obj).getMessage()));
        } else {
            if (obj == null) {
                yVar.a(i17, w2Var.o("fail:internal error"));
                return;
            }
            yVar.a(i17, w2Var.o("fail " + obj));
        }
    }
}

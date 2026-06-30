package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class r4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 f161256c;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 u4Var) {
        this.f161254a = yVar;
        this.f161255b = i17;
        this.f161256c = u4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.j14 j14Var;
        r45.n24 n24Var = (r45.n24) obj;
        jz5.f0 f0Var = null;
        java.lang.Integer valueOf = (n24Var == null || (j14Var = n24Var.f462548d) == null) ? null : java.lang.Integer.valueOf(j14Var.f459024d);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 u4Var = this.f161256c;
        int i17 = this.f161255b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161254a;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = n24Var.f462549e;
            if (gVar != null) {
                java.lang.String i18 = gVar.i();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, i18);
                yVar.a(i17, u4Var.p("ok", hashMap));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.JsApiOperateWXDataLU", "response ok but data is NULL, appId[" + yVar.mo48798x74292566() + "], callbackId[" + i17 + ']');
                yVar.a(i17, u4Var.o("fail invalid response"));
            }
        } else if (valueOf == null) {
            yVar.a(i17, u4Var.o("fail invalid response"));
        } else {
            yVar.a(i17, u4Var.o("fail response errcode=" + valueOf + " errmsg=" + n24Var.f462548d.f459025e));
        }
        return f0Var2;
    }
}

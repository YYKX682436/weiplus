package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class g9 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f159727b;

    public g9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, java.lang.String str) {
        this.f159727b = e9Var;
        this.f159726a = str;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        java.lang.Long valueOf = java.lang.Long.valueOf(k1Var.f124209b - k1Var.f124208a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f159727b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "injectConfig end by AddonV8, cost=%dms, hash=%d", valueOf, java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9(null);
        e9Var.f159531J = k9Var;
        k9Var.f165603a = this.f159726a;
        k9Var.f165604b = k1Var.f124208a;
        k9Var.f165605c = k1Var.f124209b;
        k9Var.f165606d = k1Var;
    }
}

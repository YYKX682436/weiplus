package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class i9 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f159870a;

    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f159870a = e9Var;
    }

    @Override // cl.j1
    public void a(java.lang.String str, cl.k1 k1Var) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f159870a;
        if (parseBoolean) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var = e9Var.f159531J;
            k9Var.f165604b = k1Var.f124208a;
            k9Var.f165605c = k1Var.f124209b;
            k9Var.f165606d = k1Var;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(parseBoolean);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e9Var.mo50260x9f1221c2());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var2 = e9Var.f159531J;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed end by AddonV8, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", valueOf, valueOf2, java.lang.Long.valueOf(k9Var2.f165605c - k9Var2.f165604b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = this.f159870a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 k9Var3 = e9Var2.f159531J;
        e9Var2.p1(k9Var3.f165603a, k9Var3.f165604b, k9Var3.f165605c, k9Var3.f165606d);
    }
}

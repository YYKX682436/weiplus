package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class x3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.me3[] f166924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 f166925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166926c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f166928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.c[] f166929f;

    public x3(r45.me3[] me3VarArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f4Var, m81.c[] cVarArr) {
        this.f166924a = me3VarArr;
        this.f166925b = z6Var;
        this.f166926c = q4Var;
        this.f166927d = i17;
        this.f166928e = f4Var;
        this.f166929f = cVarArr;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.me3[] me3VarArr = this.f166924a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(me3VarArr, "<this>");
        r45.me3 me3Var = me3VarArr[2];
        java.lang.String str = me3Var != null ? me3Var.f461932e : null;
        if (!(str == null || str.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(me3Var);
            km5.b c17 = km5.u.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Downloader.tryPatch with ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = this.f166925b;
            sb6.append(z6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", sb6.toString());
            m81.b[] bVarArr = new m81.b[1];
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var = this.f166926c;
            java.lang.String m49244x9616526c = q4Var.f166600j.m49244x9616526c();
            int i17 = z6Var.f167001n;
            int i18 = this.f166927d;
            java.lang.String str2 = me3Var.f461932e;
            r45.y50 y50Var = q4Var.f166594d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w3(q4Var, this.f166928e, this.f166929f, me3Var, c17, bVarArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8 p8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8(m49244x9616526c, i17, i18, str2, w3Var);
            p8Var.f406224o = y50Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8 p8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Ui(p8Var, w3Var) ? p8Var : null;
            bVarArr[0] = p8Var2;
            if (p8Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryPatch failed with " + z6Var);
                c17.mo143715xc84dc82d();
            } else {
                q4Var.f166604n.add(p8Var2);
            }
        }
        return jz5.f0.f384359a;
    }
}

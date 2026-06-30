package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.r2 f172344d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.r2();

    public r2() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.lang.String wxaPkgPath = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaPkgPath, "wxaPkgPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3.f172239d.i();
        if (i17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPathAllCategory, wxaPkgPath: ".concat(wxaPkgPath));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3();
            q3Var.f69481x2259747b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.f172353d;
            q3Var.f69494x680b2eb6 = wxaPkgPath;
            z17 = i17.mo9951xb06685ab(q3Var, "arch", "wxaPkgPath");
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

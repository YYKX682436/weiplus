package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class n9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s {
    public static final java.lang.String[] I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f157221J = dm.k0.m125156x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9.class);

    static {
        java.lang.String[] strArr = {"appId", "version", "debugType"};
        I = strArr;
        java.lang.String str = " PRIMARY KEY (";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f157221J;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.k0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f157221J;
    }
}

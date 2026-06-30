package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public final class d6 extends dm.g9 {

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f157020t = dm.g9.m125008x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d6.class);

    static {
        java.lang.String[] strArr = {"key", "version"};
        java.lang.String str = " PRIMARY KEY (";
        for (int i17 = 0; i17 < 2; i17++) {
            str = str + ", " + strArr[i17];
        }
        java.lang.String str2 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f157020t;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str2);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.g9, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f157020t;
    }
}

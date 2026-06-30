package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public class o6 extends dm.r9 implements qj1.d {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f157239v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f157240w = dm.r9.m125454x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o6.class);

    static {
        java.lang.String[] strArr = {"appId", "appVersion"};
        f157239v = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f157240w;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.r9, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f157240w;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f157239v;
    }
}

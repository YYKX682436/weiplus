package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public class m6 extends dm.o9 implements qj1.d {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f157208v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f157209w = dm.o9.m125371x3593deb(dm.o9.class);

    static {
        java.lang.String[] strArr = {"appId", "type", "version"};
        f157208v = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f157209w;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.o9, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f157209w;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f157208v;
    }

    public java.lang.String t0() {
        return java.lang.String.format(java.util.Locale.US, "EncryptPkgInfo[%s %d %d]", this.f67842x28d45f97, java.lang.Integer.valueOf(this.f67845x2262335f), java.lang.Integer.valueOf(this.f67846x8987ca93));
    }
}

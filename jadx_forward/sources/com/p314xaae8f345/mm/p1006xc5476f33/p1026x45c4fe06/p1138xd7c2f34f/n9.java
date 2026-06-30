package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes4.dex */
public class n9 extends dm.tc implements qj1.d {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f166344v = dm.tc.m125522x3593deb(dm.tc.class);

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f166345w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f166346x;

    static {
        java.lang.String[] strArr = {"appId", "appType", "versionType"};
        f166345w = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f166344v;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
        f166346x = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, "WxaAppidABTestInfo")};
    }

    @Override // dm.tc, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f166344v;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f166345w;
    }
}

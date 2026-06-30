package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public class i extends dm.g0 implements qj1.d {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f157112r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f157113s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f157114t = dm.g0.m124993x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i.class);

    static {
        java.lang.String[] strArr = {"appId", "appVersion"};
        f157112r = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f157114t;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
        f157113s = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, "AppBrandSeparatedPluginsCompatMarkTable")};
    }

    @Override // dm.g0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f157114t;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f157112r;
    }
}

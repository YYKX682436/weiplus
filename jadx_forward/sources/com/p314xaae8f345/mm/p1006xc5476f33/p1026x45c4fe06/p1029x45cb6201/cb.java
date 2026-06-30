package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public class cb extends dm.ad implements qj1.d {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f157012r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f157013s = dm.ad.m124800x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb.class);

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f157014t;

    static {
        java.lang.String[] strArr = {"pluginAppID", "pluginAppVersion"};
        f157012r = strArr;
        java.lang.String str = " PRIMARY KEY (";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f157013s;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
        f157014t = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, "WxaPluginCodeVersionInfo")};
    }

    @Override // dm.ad, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f157013s;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f157012r;
    }
}

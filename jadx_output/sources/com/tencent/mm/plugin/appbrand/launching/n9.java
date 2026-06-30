package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public class n9 extends dm.tc implements qj1.d {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f84811v = dm.tc.initAutoDBInfo(dm.tc.class);

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f84812w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f84813x;

    static {
        java.lang.String[] strArr = {"appId", "appType", "versionType"};
        f84812w = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f84811v;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
        f84813x = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, "WxaAppidABTestInfo")};
    }

    @Override // dm.tc, l75.f0
    public l75.e0 getDBInfo() {
        return f84811v;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f84812w;
    }
}

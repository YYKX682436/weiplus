package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class i extends dm.g0 implements qj1.d {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f75579r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f75580s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f75581t = dm.g0.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.i.class);

    static {
        java.lang.String[] strArr = {"appId", "appVersion"};
        f75579r = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f75581t;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
        f75580s = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, "AppBrandSeparatedPluginsCompatMarkTable")};
    }

    @Override // dm.g0, l75.f0
    public l75.e0 getDBInfo() {
        return f75581t;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f75579r;
    }
}

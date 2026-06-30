package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class cb extends dm.ad implements qj1.d {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f75479r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f75480s = dm.ad.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.cb.class);

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f75481t;

    static {
        java.lang.String[] strArr = {"pluginAppID", "pluginAppVersion"};
        f75479r = strArr;
        java.lang.String str = " PRIMARY KEY (";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f75480s;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
        f75481t = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, "WxaPluginCodeVersionInfo")};
    }

    @Override // dm.ad, l75.f0
    public l75.e0 getDBInfo() {
        return f75480s;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f75479r;
    }
}

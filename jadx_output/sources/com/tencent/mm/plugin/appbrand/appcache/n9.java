package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class n9 extends com.tencent.mm.plugin.appbrand.appcache.s {
    public static final java.lang.String[] I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f75688J = dm.k0.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.n9.class);

    static {
        java.lang.String[] strArr = {"appId", "version", "debugType"};
        I = strArr;
        java.lang.String str = " PRIMARY KEY (";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f75688J;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.k0, l75.f0
    public l75.e0 getDBInfo() {
        return f75688J;
    }
}

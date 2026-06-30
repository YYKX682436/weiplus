package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class l6 extends dm.i9 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f75643t;

    /* renamed from: u, reason: collision with root package name */
    public static final l75.e0 f75644u = dm.i9.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.l6.class);

    static {
        java.lang.String[] strArr = {"appId", "version"};
        f75643t = strArr;
        java.lang.String str = " PRIMARY KEY (";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f75644u;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.i9, l75.f0
    public l75.e0 getDBInfo() {
        return f75644u;
    }
}

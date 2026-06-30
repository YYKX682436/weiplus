package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public class o6 extends dm.r9 implements qj1.d {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f75706v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f75707w = dm.r9.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.o6.class);

    static {
        java.lang.String[] strArr = {"appId", "appVersion"};
        f75706v = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f75707w;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.r9, l75.f0
    public l75.e0 getDBInfo() {
        return f75707w;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f75706v;
    }
}

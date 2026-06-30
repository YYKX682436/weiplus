package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes4.dex */
public final class f1 extends dm.b0 {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f76429r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f76430s;

    static {
        java.lang.String[] strArr = {dm.i4.COL_USERNAME, "versionType"};
        f76429r = strArr;
        f76430s = dm.b0.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appusage.f1.class);
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f76430s;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.b0, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }
}

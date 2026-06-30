package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class t2 extends dm.h0 {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f76567v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f76568w;

    static {
        java.lang.String[] strArr = {dm.i4.COL_USERNAME, "versionType"};
        f76567v = strArr;
        f76568w = dm.h0.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appusage.t2.class);
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f76568w;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.h0, l75.f0
    public l75.e0 getDBInfo() {
        return f76568w;
    }
}

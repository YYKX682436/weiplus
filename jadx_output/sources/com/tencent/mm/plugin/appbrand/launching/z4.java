package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public final class z4 extends dm.l2 {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f85459r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f85460s = dm.l2.initAutoDBInfo(com.tencent.mm.plugin.appbrand.launching.z4.class);

    static {
        java.lang.String[] strArr = {"appId", "versionType"};
        f85459r = strArr;
        java.lang.String str = " PRIMARY KEY (";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f85460s;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.l2, l75.f0
    public l75.e0 getDBInfo() {
        return f85460s;
    }
}

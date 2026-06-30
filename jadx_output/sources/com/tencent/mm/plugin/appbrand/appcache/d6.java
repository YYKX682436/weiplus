package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class d6 extends dm.g9 {

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f75487t = dm.g9.initAutoDBInfo(com.tencent.mm.plugin.appbrand.appcache.d6.class);

    static {
        java.lang.String[] strArr = {"key", "version"};
        java.lang.String str = " PRIMARY KEY (";
        for (int i17 = 0; i17 < 2; i17++) {
            str = str + ", " + strArr[i17];
        }
        java.lang.String str2 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f75487t;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str2);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.g9, l75.f0
    public l75.e0 getDBInfo() {
        return f75487t;
    }
}

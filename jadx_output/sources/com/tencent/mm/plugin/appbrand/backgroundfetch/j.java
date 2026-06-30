package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes4.dex */
public class j extends dm.t {

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f76841z;

    static {
        java.lang.String[] strArr = {dm.i4.COL_USERNAME, "fetchType"};
        f76841z = dm.t.initAutoDBInfo(com.tencent.mm.plugin.appbrand.backgroundfetch.j.class);
        java.lang.String str = " PRIMARY KEY ( ";
        for (int i17 = 0; i17 < 2; i17++) {
            str = str + ", " + strArr[i17];
        }
        java.lang.String str2 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f76841z;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str2);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.t, l75.f0
    public l75.e0 getDBInfo() {
        return f76841z;
    }
}

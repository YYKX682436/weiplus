package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f295426a = "";

    /* renamed from: b, reason: collision with root package name */
    public static long f295427b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f295428c = "";

    public static java.lang.String a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f295426a) || z65.c.a()) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = f295428c;
            objArr[1] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(f295427b) > 300);
            objArr[2] = java.lang.Long.valueOf(f295427b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeStampHelper", "getTimeStamp is null from %s isOverdue %s update_time: %s", objArr);
        }
        return f295426a;
    }

    public static void b(java.lang.String str) {
        f295426a = str;
        f295427b = java.lang.System.currentTimeMillis() / 1000;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f295428c = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
    }
}

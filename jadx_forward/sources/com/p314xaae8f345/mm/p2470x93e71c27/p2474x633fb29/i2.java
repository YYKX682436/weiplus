package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes13.dex */
public abstract class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f270875a;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("content://");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".plugin.gwallet.queryprovider");
        f270875a = sb6.toString();
    }

    public static void a(android.content.Context context, java.lang.String[] strArr, ec0.e eVar) {
        if (eVar == null || strArr == null || strArr.length == 0) {
            throw new java.lang.IllegalArgumentException();
        }
        new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h2(context, strArr, eVar).execute(new java.lang.Void[0]);
    }
}

package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public abstract class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.l f270481a = new kk.l(10);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f270482b = new java.util.HashMap();

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h5 a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 i5Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token is null");
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h5.TOKEN_EMPTY;
        }
        if (i5Var == null || !i5Var.f270471e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult tokenData null");
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h5.TOKEN_DATA_NOT_MATCH;
        }
        java.lang.String str3 = i5Var.f270468b;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token check success");
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h5.OK;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token check fail %s/%s", str3, str2);
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h5.PACKAGE_NAME_INVALID;
    }
}

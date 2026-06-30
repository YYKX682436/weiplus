package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f270450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270451e;

    public h1(android.app.Activity activity, java.lang.String str) {
        this.f270450d = activity;
        this.f270451e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String encode;
        android.app.Activity activity = this.f270450d;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            java.lang.String c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.c(activity);
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17);
            java.lang.String str = this.f270451e;
            if (K0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    encode = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.io.UnsupportedEncodingException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "reportLaunchWechat parse fail");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17591, "", c17, encode, 0);
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtil", "reportLaunchWechat callPackage=%s, isCategoryHome = %b, url=%s, isCategoryHome= %b", c17, bool, encode, bool);
            }
            encode = "";
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17591, "", c17, encode, 0);
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtil", "reportLaunchWechat callPackage=%s, isCategoryHome = %b, url=%s, isCategoryHome= %b", c17, bool2, encode, bool2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "reportLaunchWechat ex:%s", e17.getMessage());
        }
    }
}

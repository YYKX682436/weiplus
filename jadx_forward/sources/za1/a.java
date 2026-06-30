package za1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final za1.a f552410d = new za1.a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APPBRAND_JSAPI_BIG_DATA_TRANSFER_MMKV_CHECK_CLEAN_TIMESTAMP_LONG;
            if (c17.t(u3Var, 0L) + za1.b.f552412b <= java.lang.System.currentTimeMillis()) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = za1.b.f552413c;
                    boolean z17 = o4Var.Y() >= 20971520;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiIpcBigDataTransfer", "do check  mmkv file too large, needClear[%b]", java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        o4Var.d();
                    }
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } catch (java.lang.Throwable th6) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiIpcBigDataTransfer", "do check  mmkv file too large, exception = %s", th6);
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APPBRAND_JSAPI_BIG_DATA_TRANSFER_MMKV_CHECK_CLEAN_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    } catch (java.lang.Throwable th7) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APPBRAND_JSAPI_BIG_DATA_TRANSFER_MMKV_CHECK_CLEAN_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        throw th7;
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}

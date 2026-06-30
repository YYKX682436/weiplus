package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f296382a = "";

    /* renamed from: b, reason: collision with root package name */
    public static int f296383b;

    public static void a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "current process name: " + bm5.f1.a());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("weixin_h5_debug_info", 2, null);
            if (N != null) {
                f296382a = N.getString("weixin_h5_debug_host", "");
                int i17 = N.getInt("weixin_h5_debug_port", 0);
                f296383b = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebDebugProxyUtil", "get mmkvName:%s, customIp:%s, customPort:%d", "weixin_h5_debug_info", f296382a, java.lang.Integer.valueOf(i17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XWeb.MM.XWebDebugProxyUtil", "mmkv is null,mmkvName:%s", "weixin_h5_debug_info");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("XWeb.MM.XWebDebugProxyUtil", e17, "get mmkv fail Exception", new java.lang.Object[0]);
        }
    }
}

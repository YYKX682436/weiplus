package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f2 f165519a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f165520b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.e2.f165518d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f165521c = "--enable-wasm-in-lite-mode --lite-mode";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f165522d = {":appbrand0", ":appbrand2", ":appbrand3"};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f165523e = {":appbrand1", ":appbrand4"};

    public final boolean a() {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            z17 = ((java.lang.Boolean) ((jz5.n) f165520b).mo141623x754a37bb()).booleanValue();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            if (L != null) {
                L.G("WeAppV8LiteStrategy#enableV8Lite", z17);
            }
        } else {
            if (c()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
                if (L2 != null ? L2.getBoolean("WeAppV8LiteStrategy#enableV8Lite", false) : false) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppV8LiteStrategy", "enable#get, " + z17);
        return z17;
    }

    public final boolean b() {
        boolean z17 = c() && a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppV8LiteStrategy", "enableForMe#get, " + z17);
        return z17;
    }

    public final boolean c() {
        java.lang.String str;
        java.lang.String[] strArr = f165522d;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                str = null;
                break;
            }
            str = strArr[i17];
            java.lang.String a17 = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (r26.i0.n(a17, str, false)) {
                break;
            }
            i17++;
        }
        return str != null;
    }
}

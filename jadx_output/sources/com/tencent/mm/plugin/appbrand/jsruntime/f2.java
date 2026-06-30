package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsruntime.f2 f83986a = new com.tencent.mm.plugin.appbrand.jsruntime.f2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f83987b = jz5.h.b(com.tencent.mm.plugin.appbrand.jsruntime.e2.f83985d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f83988c = "--enable-wasm-in-lite-mode --lite-mode";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f83989d = {":appbrand0", ":appbrand2", ":appbrand3"};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f83990e = {":appbrand1", ":appbrand4"};

    public final boolean a() {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            z17 = ((java.lang.Boolean) ((jz5.n) f83987b).getValue()).booleanValue();
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            if (L != null) {
                L.G("WeAppV8LiteStrategy#enableV8Lite", z17);
            }
        } else {
            if (c()) {
                com.tencent.mm.sdk.platformtools.o4 L2 = com.tencent.mm.sdk.platformtools.o4.L();
                if (L2 != null ? L2.getBoolean("WeAppV8LiteStrategy#enableV8Lite", false) : false) {
                    z17 = true;
                }
            }
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppV8LiteStrategy", "enable#get, " + z17);
        return z17;
    }

    public final boolean b() {
        boolean z17 = c() && a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppV8LiteStrategy", "enableForMe#get, " + z17);
        return z17;
    }

    public final boolean c() {
        java.lang.String str;
        java.lang.String[] strArr = f83989d;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                str = null;
                break;
            }
            str = strArr[i17];
            java.lang.String a17 = bm5.f1.a();
            kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
            kotlin.jvm.internal.o.d(str);
            if (r26.i0.n(a17, str, false)) {
                break;
            }
            i17++;
        }
        return str != null;
    }
}

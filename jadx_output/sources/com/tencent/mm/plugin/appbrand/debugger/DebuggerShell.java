package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public final class DebuggerShell extends android.content.BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final bm5.p1 f77582b = new com.tencent.mm.plugin.appbrand.debugger.d();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f77583c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f77584d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f77585a = new java.util.HashMap();

    static {
        a();
    }

    public static void a() {
        f77584d = false;
        if (!f77584d) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                f77584d = com.tencent.mm.sdk.platformtools.o4.M("ENABLE_APPBRAND_DEBUGGER").getBoolean("ENABLE_APPBRAND_DEBUGGER", false);
            }
        }
        if (f77584d) {
            f77583c = com.tencent.mm.sdk.platformtools.o4.M("ENABLE_APPBRAND_DEBUGGER").getBoolean("KEY_SKIP_APPBRAND_PROCESS_SUICIDE", true);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("action");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        java.util.Map map = this.f77585a;
        if (((java.util.HashMap) map).containsKey(stringExtra)) {
            ((com.tencent.mm.plugin.appbrand.debugger.e) ((java.util.HashMap) map).get(stringExtra)).a(intent);
        }
    }
}

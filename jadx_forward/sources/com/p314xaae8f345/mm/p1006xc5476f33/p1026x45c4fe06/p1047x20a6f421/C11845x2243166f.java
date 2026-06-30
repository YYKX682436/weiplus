package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.DebuggerShell */
/* loaded from: classes7.dex */
public final class C11845x2243166f extends android.content.BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final bm5.p1 f159115b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.d();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f159116c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f159117d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f159118a = new java.util.HashMap();

    static {
        a();
    }

    public static void a() {
        f159117d = false;
        if (!f159117d) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                f159117d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ENABLE_APPBRAND_DEBUGGER").getBoolean("ENABLE_APPBRAND_DEBUGGER", false);
            }
        }
        if (f159117d) {
            f159116c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ENABLE_APPBRAND_DEBUGGER").getBoolean("KEY_SKIP_APPBRAND_PROCESS_SUICIDE", true);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("action");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        java.util.Map map = this.f159118a;
        if (((java.util.HashMap) map).containsKey(stringExtra)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e) ((java.util.HashMap) map).get(stringExtra)).a(intent);
        }
    }
}

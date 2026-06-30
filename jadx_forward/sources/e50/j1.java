package e50;

/* loaded from: classes11.dex */
public final class j1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f331042b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f331043c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f331044d;

    /* renamed from: a, reason: collision with root package name */
    public static final e50.j1 f331041a = new e50.j1();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f331045e = jz5.h.b(e50.i1.f331037d);

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f331045e).mo141623x754a37bb()).booleanValue();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("flutter_vulkan_config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    public final void c() {
        if (f331042b) {
            return;
        }
        java.lang.String str = "";
        if (a()) {
            str = b().u(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52909x9bfe27d4, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "decodeString(...)");
            boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, android.os.Build.MODEL);
            f331043c = z17;
            f331044d = z17 || b().i("vulkan_test_result", true);
        }
        f331042b = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVulkanConfig", "readFromMMKV: modeInMMKV:" + str + ", vulkanEnableMMKV: " + f331044d + ", expt: " + a());
    }

    public final boolean d() {
        c();
        return a() && f331044d;
    }
}

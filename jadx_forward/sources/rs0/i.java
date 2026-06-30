package rs0;

/* loaded from: classes13.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static int f480830b = -1;

    /* renamed from: a, reason: collision with root package name */
    public static final rs0.g f480829a = new rs0.g(null);

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f480831c = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f480832d = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f480833e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f480834f = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0, 1, 12344};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f480835g = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};

    static {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            android.content.pm.ConfigurationInfo deviceConfigurationInfo = activityManager != null ? activityManager.getDeviceConfigurationInfo() : null;
            if (deviceConfigurationInfo != null) {
                int i17 = (deviceConfigurationInfo.reqGlEsVersion & (-65536)) >> 16;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gl_key");
                int o17 = M.o("support_egl_context_client_version", 3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "egl support version " + deviceConfigurationInfo.getGlEsVersion() + "   configurationInfo.reqGlEsVersion : " + deviceConfigurationInfo.reqGlEsVersion + "   major:" + i17 + "  curVersion:" + o17);
                int i18 = 2;
                if (o17 >= 3 && i17 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "markEglVersion2");
                    jx3.f.INSTANCE.w(985L, 11L, 1L);
                }
                if (!M.i("has_reported_egl_version", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "markEglVersion3");
                    jx3.f.INSTANCE.w(985L, 12L, 1L);
                    M.G("has_reported_egl_version", true);
                }
                if (i17 >= 3) {
                    i17 = 3;
                }
                if (i17 > 2) {
                    i18 = i17;
                }
                M.A("support_egl_context_client_version", i18);
            }
            if (deviceConfigurationInfo == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "configurationInfo == null");
            }
            if (j62.e.g().l("clicfg_gles_version_enable", true, true, true)) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gl_key").A("support_egl_context_client_version", 3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GLEnvironmentUtil", e17, "", new java.lang.Object[0]);
        }
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tf {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f51579a = "txmapengine";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f51580b = "release";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f51581c = "undefined";

    /* renamed from: d, reason: collision with root package name */
    public static boolean f51582d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f51583e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f51584f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f51585g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f51586h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f51587i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f51588j = "";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f51589k = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f51590l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f51591m = "";

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f51592n = "tms";

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f51593o = "undefined";

    /* renamed from: p, reason: collision with root package name */
    public static java.util.List<com.tencent.mapsdk.internal.tf.b> f51594p = new java.util.ArrayList(10);

    /* loaded from: classes13.dex */
    public interface a {
        void a(android.content.Context context, java.lang.String str);

        void i();
    }

    /* loaded from: classes6.dex */
    public enum b {
        PLUGIN("shell.adapter.LocPluginModular"),
        BUGLY("bugly.TMSBugly"),
        BEACON("beacon.TMSBeaconReport");


        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f51599d;

        b(java.lang.String str) {
            this.f51599d = str;
        }
    }

    /* loaded from: classes6.dex */
    public interface c {
        byte[] a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x00ff. Please report as an issue. */
    public static void a(android.content.Context context) {
        try {
            java.lang.String a17 = com.tencent.mapsdk.internal.hs.a(context, context.getPackageName() + "_ShellConfig");
            if (android.text.TextUtils.isEmpty(a17)) {
                a17 = com.tencent.mapsdk.internal.hs.a(context, "TMS_ShellConfig");
                if (android.text.TextUtils.isEmpty(a17)) {
                    try {
                        java.util.Properties properties = new java.util.Properties();
                        properties.load(context.getAssets().open("tencentmap/mapsdk_vector/sdkconfig.dat"));
                        a17 = properties.getProperty("classname");
                    } catch (java.io.IOException unused) {
                        a17 = "com.tencent.mapsdk.BuildConfig";
                    }
                }
            }
            java.lang.Class<?> cls = java.lang.Class.forName(a17);
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                char c17 = 1;
                field.setAccessible(true);
                java.lang.String name = field.getName();
                switch (name.hashCode()) {
                    case -2051118828:
                        if (name.equals("VERSION_CODE")) {
                            c17 = '\f';
                            break;
                        }
                        break;
                    case -2050804302:
                        if (name.equals("VERSION_NAME")) {
                            c17 = 7;
                            break;
                        }
                        break;
                    case -1781919750:
                        if (name.equals("SEARCH_ENABLE")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case -1256894524:
                        if (name.equals("BEACON_KEY")) {
                            c17 = '\t';
                            break;
                        }
                        break;
                    case -783990306:
                        if (name.equals("BEACON_ENABLE")) {
                            c17 = '\b';
                            break;
                        }
                        break;
                    case -758346991:
                        if (name.equals("SHEET_PROJECT_NAME")) {
                            c17 = 5;
                            break;
                        }
                        break;
                    case -368721951:
                        if (name.equals("BUGLY_KEY")) {
                            c17 = '\n';
                            break;
                        }
                        break;
                    case 44249739:
                        if (name.equals("BUILD_TYPE")) {
                            c17 = '\r';
                            break;
                        }
                        break;
                    case 64921139:
                        if (name.equals("DEBUG")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 196363279:
                        if (name.equals("PLUGIN_ENABLE")) {
                            c17 = 4;
                            break;
                        }
                        break;
                    case 1766588577:
                        if (name.equals("BUGLY_ENABLE")) {
                            break;
                        }
                        break;
                    case 2076249758:
                        if (name.equals("FLAVOR")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case 2095911147:
                        if (name.equals("REPO_VERSION")) {
                            c17 = 6;
                            break;
                        }
                        break;
                    case 2107919841:
                        if (name.equals("BUGLY_KEY_SHARE")) {
                            c17 = 11;
                            break;
                        }
                        break;
                }
                c17 = 65535;
                switch (c17) {
                    case 0:
                        f51582d = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[DEBUG]:" + f51582d);
                    case 1:
                        boolean booleanValue = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        f51583e = booleanValue;
                        if (booleanValue) {
                            f51594p.add(com.tencent.mapsdk.internal.tf.b.BUGLY);
                        }
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[BUGLY]:" + f51583e);
                    case 2:
                        f51581c = (java.lang.String) field.get(cls);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[FLAVOR]:" + f51581c);
                    case 3:
                        f51584f = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[SEARCH]:" + f51584f);
                    case 4:
                        boolean booleanValue2 = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        f51585g = booleanValue2;
                        if (booleanValue2) {
                            f51594p.add(com.tencent.mapsdk.internal.tf.b.PLUGIN);
                        }
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[PLUGIN]:" + f51585g);
                    case 5:
                        f51592n = (java.lang.String) field.get(cls);
                    case 6:
                        f51593o = (java.lang.String) field.get(cls);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[REPO]:" + f51593o);
                    case 7:
                        f51588j = (java.lang.String) field.get(cls);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[VER]:" + f51588j);
                    case '\b':
                        boolean booleanValue3 = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        f51586h = booleanValue3;
                        if (booleanValue3) {
                            f51594p.add(com.tencent.mapsdk.internal.tf.b.BEACON);
                        }
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[BEACON]:" + f51586h);
                    case '\t':
                        f51589k = (java.lang.String) field.get(cls);
                    case '\n':
                        f51590l = (java.lang.String) field.get(cls);
                    case 11:
                        f51591m = (java.lang.String) field.get(cls);
                    case '\f':
                        f51587i = ((java.lang.Integer) field.get(cls)).intValue();
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[VER_CODE]:" + f51587i);
                    case '\r':
                        f51580b = (java.lang.String) field.get(cls);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50223x, "[BUILD_TYPE]:" + f51580b);
                    default:
                }
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(e17.getMessage(), e17);
        } catch (java.lang.IllegalAccessException e18) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(e18.getMessage(), e18);
        }
    }

    private static java.lang.String b() {
        return f51581c + "-" + f51580b;
    }

    private static java.lang.String a() {
        return f51588j + "-" + f51593o;
    }

    private static java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f51581c + "-" + f51580b);
        sb6.append("!");
        sb6.append(str);
        return sb6.toString();
    }
}

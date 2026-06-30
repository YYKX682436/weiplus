package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tf {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f133112a = "txmapengine";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f133113b = "release";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f133114c = "undefined";

    /* renamed from: d, reason: collision with root package name */
    public static boolean f133115d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f133116e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f133117f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f133118g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f133119h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f133120i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f133121j = "";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f133122k = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f133123l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f133124m = "";

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f133125n = "tms";

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f133126o = "undefined";

    /* renamed from: p, reason: collision with root package name */
    public static java.util.List<com.tencent.mapsdk.internal.tf.b> f133127p = new java.util.ArrayList(10);

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
        public java.lang.String f133132d;

        b(java.lang.String str) {
            this.f133132d = str;
        }
    }

    /* loaded from: classes6.dex */
    public interface c {
        byte[] a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x00ff. Please report as an issue. */
    public static void a(android.content.Context context) {
        try {
            java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(context, context.getPackageName() + "_ShellConfig");
            if (android.text.TextUtils.isEmpty(a17)) {
                a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(context, "TMS_ShellConfig");
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
                        f133115d = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[DEBUG]:" + f133115d);
                    case 1:
                        boolean booleanValue = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        f133116e = booleanValue;
                        if (booleanValue) {
                            f133127p.add(com.tencent.mapsdk.internal.tf.b.BUGLY);
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[BUGLY]:" + f133116e);
                    case 2:
                        f133114c = (java.lang.String) field.get(cls);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[FLAVOR]:" + f133114c);
                    case 3:
                        f133117f = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[SEARCH]:" + f133117f);
                    case 4:
                        boolean booleanValue2 = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        f133118g = booleanValue2;
                        if (booleanValue2) {
                            f133127p.add(com.tencent.mapsdk.internal.tf.b.PLUGIN);
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[PLUGIN]:" + f133118g);
                    case 5:
                        f133125n = (java.lang.String) field.get(cls);
                    case 6:
                        f133126o = (java.lang.String) field.get(cls);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[REPO]:" + f133126o);
                    case 7:
                        f133121j = (java.lang.String) field.get(cls);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[VER]:" + f133121j);
                    case '\b':
                        boolean booleanValue3 = ((java.lang.Boolean) field.get(cls)).booleanValue();
                        f133119h = booleanValue3;
                        if (booleanValue3) {
                            f133127p.add(com.tencent.mapsdk.internal.tf.b.BEACON);
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[BEACON]:" + f133119h);
                    case '\t':
                        f133122k = (java.lang.String) field.get(cls);
                    case '\n':
                        f133123l = (java.lang.String) field.get(cls);
                    case 11:
                        f133124m = (java.lang.String) field.get(cls);
                    case '\f':
                        f133120i = ((java.lang.Integer) field.get(cls)).intValue();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[VER_CODE]:" + f133120i);
                    case '\r':
                        f133113b = (java.lang.String) field.get(cls);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131756x, "[BUILD_TYPE]:" + f133113b);
                    default:
                }
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(e17.getMessage(), e17);
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(e18.getMessage(), e18);
        }
    }

    private static java.lang.String b() {
        return f133114c + "-" + f133113b;
    }

    private static java.lang.String a() {
        return f133121j + "-" + f133126o;
    }

    private static java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f133114c + "-" + f133113b);
        sb6.append("!");
        sb6.append(str);
        return sb6.toString();
    }
}

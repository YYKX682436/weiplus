package by5;

/* loaded from: classes13.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static long f117972a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f117973b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f117974c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f117975d;

    public static java.lang.String a() {
        java.lang.String d17 = d();
        if (f(d17)) {
            by5.c4.a("XWebUpdateConfigUtil", "use test config url : ".concat(d17));
            return d17;
        }
        java.lang.String str = f117974c;
        if (!f(str)) {
            zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
            by5.c4.a("XWebUpdateConfigUtil", "use release config url = ".concat("https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig.xml"));
            return "https://dldir1v6.qq.com/weixin/android/wxweb/updateConfig.xml";
        }
        by5.c4.a("XWebUpdateConfigUtil", "use temp config url : " + str);
        return str;
    }

    public static java.lang.String b() {
        java.lang.String e17 = e();
        if (f(e17)) {
            by5.c4.a("XWebUpdateConfigUtil", "plugin use test config url: ".concat(e17));
            return e17;
        }
        java.lang.String str = f117975d;
        if (!f(str)) {
            zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
            by5.c4.a("XWebUpdateConfigUtil", "plugin use release config url: ".concat("https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml"));
            return "https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig.xml";
        }
        by5.c4.a("XWebUpdateConfigUtil", "plugin use temp config url: " + str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        by5.c4.a("XWebUpdateConfigUtil", "getPluginUpdatePeriod, use cmd period:" + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c() {
        /*
            int r0 = by5.e4.f117973b
            java.lang.String r1 = "XWebUpdateConfigUtil"
            if (r0 <= 0) goto L18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getPluginUpdatePeriod, use temp period:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            by5.c4.a(r1, r2)
            return r0
        L18:
            com.tencent.xweb.c r0 = com.p314xaae8f345.p3210x3857dc.c.z()
            r0.getClass()
            r2 = -1
            java.lang.String r3 = "setPluginConfigPeriod"
            java.lang.String r4 = "tools"
            java.lang.String r0 = r0.g(r3, r4)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L47
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L31
            goto L47
        L31:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L3f
            r3 = 30
            if (r0 >= r3) goto L3a
            goto L47
        L3a:
            int r0 = r0 * 60
            int r2 = r0 * 1000
            goto L47
        L3f:
            r0 = move-exception
            java.lang.String r3 = "CommandCfgPlugin"
            java.lang.String r4 = "getCmdPluginUpdatePeriod error"
            by5.c4.d(r3, r4, r0)
        L47:
            if (r2 <= 0) goto L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "getPluginUpdatePeriod, use cmd period:"
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            by5.c4.a(r1, r0)
            return r2
        L5b:
            java.lang.String r0 = "getPluginUpdatePeriod, use default period:90000000"
            by5.c4.a(r1, r0)
            r0 = 90000000(0x55d4a80, float:1.04050536E-35)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.e4.c():int");
    }

    public static java.lang.String d() {
        android.content.SharedPreferences e17 = by5.d4.e();
        if (e17 == null) {
            by5.c4.c("XWebUpdateConfigUtil", "getTestBaseConfigUrl, sp is null");
            return "";
        }
        java.lang.String string = e17.getString("XWEB_TEST_CONFIG_URL", "");
        return (string == null || string.trim().isEmpty()) ? "" : string;
    }

    public static java.lang.String e() {
        android.content.SharedPreferences e17 = by5.d4.e();
        if (e17 == null) {
            by5.c4.c("XWebUpdateConfigUtil", "getTestPluginConfigUrl, sp is null");
            return "";
        }
        java.lang.String string = e17.getString("XWEB_PLUGIN_TEST_CONFIG_URL", "");
        return (string == null || string.trim().isEmpty()) ? "" : string;
    }

    public static boolean f(java.lang.String str) {
        if (str != null && !android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str.trim())) {
            try {
                java.net.URI uri = new java.net.URI(str.trim());
                if (!uri.getScheme().equals("https")) {
                    return false;
                }
                if (!uri.getHost().equals("dldir1.qq.com") && !uri.getHost().equals("dldir1v6.qq.com")) {
                    return false;
                }
                by5.c4.f("XWebUpdateConfigUtil", "isValidConfigHost true, url:".concat(str));
                return true;
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebUpdateConfigUtil", "isValidConfigHost error", th6);
            }
        }
        return false;
    }

    public static boolean g(java.lang.String str) {
        android.content.SharedPreferences e17 = by5.d4.e();
        if (e17 == null) {
            by5.c4.c("XWebUpdateConfigUtil", "setTestBaseConfigUrl, sp is null");
            return false;
        }
        android.content.SharedPreferences.Editor edit = e17.edit();
        if (str == null || str.trim().isEmpty()) {
            edit.remove("XWEB_TEST_CONFIG_URL");
        } else {
            if (!f(str)) {
                by5.c4.c("XWebUpdateConfigUtil", "setTestBaseConfigUrl, url is invalid");
                return false;
            }
            edit.putString("XWEB_TEST_CONFIG_URL", str.trim());
        }
        return edit.commit();
    }

    public static boolean h(java.lang.String str) {
        android.content.SharedPreferences e17 = by5.d4.e();
        if (e17 == null) {
            by5.c4.c("XWebUpdateConfigUtil", "setTestPluginConfigUrl, sp is null");
            return false;
        }
        android.content.SharedPreferences.Editor edit = e17.edit();
        if (str == null || str.trim().isEmpty()) {
            edit.remove("XWEB_PLUGIN_TEST_CONFIG_URL");
        } else {
            if (!f(str)) {
                by5.c4.c("XWebUpdateConfigUtil", "setTestPluginConfigUrl, url is invalid");
                return false;
            }
            edit.putString("XWEB_PLUGIN_TEST_CONFIG_URL", str.trim());
        }
        return edit.commit();
    }
}

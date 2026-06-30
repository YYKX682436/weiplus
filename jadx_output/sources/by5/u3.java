package by5;

/* loaded from: classes13.dex */
public class u3 {

    /* renamed from: a, reason: collision with root package name */
    public int f36605a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f36606b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f36607c;

    public u3(int i17, java.lang.String str, java.lang.String str2) {
        this.f36605a = i17;
        this.f36606b = str;
        this.f36607c = str2;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return "back_core_" + str2 + "_for_" + str;
    }

    public static int b(android.content.Context context) {
        if (context == null) {
            by5.c4.g("XWebCoreInfo", "getInstalledNewestVersionForCurAbi, context is null, return -1");
            return -1;
        }
        org.xwalk.core.XWalkEnvironment.c(context);
        return by5.d4.g("XWALKINFOS").getInt(a(by5.a.b(), "version"), -1);
    }

    public static by5.u3 c(java.lang.String str) {
        by5.u3 u3Var = new by5.u3();
        android.content.SharedPreferences g17 = by5.d4.g("XWALKINFOS");
        u3Var.f36607c = str;
        u3Var.f36605a = g17.getInt(a(str, "version"), -1);
        u3Var.f36606b = g17.getString(a(str, "versionDetail"), "");
        return u3Var;
    }

    public static boolean d(int i17) {
        android.content.SharedPreferences g17 = by5.d4.g("xweb_using_core_version");
        if (g17 == null) {
            return false;
        }
        boolean contains = g17.contains("using_core_version_" + i17);
        by5.c4.f("XWebCoreInfo", "core version(" + i17 + ") is using:" + contains);
        return contains;
    }

    public static boolean e(int i17, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = by5.d4.g("XWALKINFOS").edit();
        edit.putInt(a(str2, "version"), i17);
        edit.putString(a(str2, "versionDetail"), str);
        boolean commit = edit.commit();
        if (commit && i17 > 0 && !by5.a.b().equalsIgnoreCase(str2)) {
            if ("armeabi-v7a".equalsIgnoreCase(str2)) {
                by5.s0.e(577L, 238L, 1L);
            } else if ("arm64-v8a".equalsIgnoreCase(str2)) {
                by5.s0.e(577L, 239L, 1L);
            }
        }
        by5.c4.a("XWebCoreInfo", "setVersionInfo, version:" + i17 + ", abi:" + str2 + ", detail:" + str);
        return commit;
    }

    public java.lang.String toString() {
        return "XWebCoreInfo{ver=" + this.f36605a + ", verDetail='" + this.f36606b + "', strAbi='" + this.f36607c + "'}";
    }
}

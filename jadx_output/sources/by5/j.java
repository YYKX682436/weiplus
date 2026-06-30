package by5;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f36488J;
    public java.lang.String K;
    public java.lang.String L;

    /* renamed from: a, reason: collision with root package name */
    public int f36489a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f36490b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f36491c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f36492d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f36493e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f36494f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f36495g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f36496h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f36497i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f36498j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f36499k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f36500l = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f36501m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f36502n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f36503o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f36504p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f36505q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f36506r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f36507s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f36508t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f36509u = -1;

    /* renamed from: v, reason: collision with root package name */
    public double f36510v = -1.0d;

    /* renamed from: w, reason: collision with root package name */
    public double f36511w = -1.0d;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f36512x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f36513y = "";

    /* renamed from: z, reason: collision with root package name */
    public int f36514z = -1;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public java.lang.String D = null;
    public java.lang.String E = null;
    public java.lang.String F = null;
    public java.lang.String G = null;
    public int H = -1;
    public int I = -1;
    public java.lang.String M = null;

    public static boolean d(int i17, int i18, int i19) {
        if (i19 <= 0 || i17 <= i19) {
            return i18 <= 0 || i17 >= i18;
        }
        return false;
    }

    public static boolean f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(by5.d.f36425a)) {
            by5.d.f36425a = android.os.Build.BRAND;
        }
        java.lang.String str2 = "";
        if (by5.d.f36425a != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            if (android.text.TextUtils.isEmpty(by5.d.f36425a)) {
                by5.d.f36425a = android.os.Build.BRAND;
            }
            sb6.append(by5.d.f36425a);
            str2 = sb6.toString();
        }
        if (by5.d.a() != null) {
            str2 = str2 + " " + by5.d.a();
        }
        if (android.text.TextUtils.isEmpty(by5.d.f36427c)) {
            by5.d.f36427c = android.os.Build.MANUFACTURER;
        }
        if (by5.d.f36427c != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str2);
            sb7.append(" ");
            if (android.text.TextUtils.isEmpty(by5.d.f36427c)) {
                by5.d.f36427c = android.os.Build.MANUFACTURER;
            }
            sb7.append(by5.d.f36427c);
            str2 = sb7.toString();
        }
        if (str == null || str2 == null || str.isEmpty()) {
            return false;
        }
        return g(str, str2);
    }

    public static boolean g(java.lang.String str, java.lang.String str2) {
        boolean z17 = false;
        if (str == null || str.isEmpty() || str.trim() == null || str.trim().isEmpty() || str2 == null || str2.isEmpty()) {
            return false;
        }
        try {
            z17 = java.util.regex.Pattern.compile(str.toUpperCase()).matcher(str2.toUpperCase()).find();
            by5.c4.g("ConfigDef", "isMatchRex, result:" + z17 + ", regex:" + str + ", content:" + str2);
            return z17;
        } catch (java.lang.Throwable unused) {
            by5.c4.c("ConfigDef", "_IsMatchRex, compile pattern failed, strRex:" + str + ", strContent:" + str2);
            return z17;
        }
    }

    public static boolean h(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split;
        if (str == null || (split = str.split("\\|")) == null || split.length < 0 || android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        java.lang.String trim = str2.trim();
        for (java.lang.String str3 : split) {
            if (!android.text.TextUtils.isEmpty(str3) && str3.trim().equalsIgnoreCase(trim)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(boolean z17, boolean z18, java.lang.String str) {
        int i17;
        this.L = str;
        int d17 = org.xwalk.core.XWalkEnvironment.d();
        int h17 = org.xwalk.core.XWalkEnvironment.h();
        int i18 = org.xwalk.core.XWalkEnvironment.i();
        int i19 = org.xwalk.core.XWalkEnvironment.f347970c.getApplicationInfo() != null ? org.xwalk.core.XWalkEnvironment.f347970c.getApplicationInfo().targetSdkVersion : 0;
        int b17 = by5.a4.b();
        boolean z19 = z17 || d(b17, this.f36503o, this.f36504p);
        java.lang.String b18 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMatch, ignoreGrayValue:");
        sb6.append(z17);
        sb6.append(", grayValue(");
        sb6.append(b17);
        sb6.append("):");
        sb6.append(d(b17, this.f36503o, this.f36504p));
        sb6.append(", apk(");
        sb6.append(h17);
        sb6.append("):");
        sb6.append(d(h17, this.f36491c, this.f36492d));
        sb6.append(", usingApk(");
        sb6.append(d17);
        sb6.append("):");
        sb6.append(d(d17, this.f36493e, this.f36494f));
        sb6.append(", preDownApk(");
        sb6.append(i18);
        sb6.append("):");
        sb6.append(d(i18, this.f36495g, this.f36496h));
        sb6.append(", sdk(20260502):");
        sb6.append(d(com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE, this.f36489a, this.f36490b));
        sb6.append(", api(");
        int i27 = android.os.Build.VERSION.SDK_INT;
        sb6.append(i27);
        sb6.append("):");
        sb6.append(d(i27, this.f36497i, this.f36498j));
        sb6.append(", targetApi(");
        sb6.append(i19);
        sb6.append("):");
        sb6.append(d(i19, this.f36499k, this.f36500l));
        sb6.append(", todayGrayValue(");
        sb6.append(by5.a4.c());
        sb6.append("):");
        sb6.append(d(by5.a4.c(), this.f36505q, this.f36506r));
        sb6.append(", forbidDeviceRegex(");
        sb6.append(this.f36501m);
        sb6.append("):");
        sb6.append(f(this.f36501m));
        sb6.append(", forbidAppRegex(");
        sb6.append(this.f36512x);
        sb6.append("):");
        sb6.append(g(this.f36512x, org.xwalk.core.XWalkEnvironment.l()));
        sb6.append(", timeRange:");
        sb6.append(e());
        sb6.append(", runtimeAbi:");
        sb6.append(by5.a.b());
        sb6.append(", targetRuntimeAbi:");
        sb6.append(c());
        by5.c4.f(b18, sb6.toString());
        if (!(z19 && d(h17, this.f36491c, this.f36492d) && d(d17, this.f36493e, this.f36494f) && d(i18, this.f36495g, this.f36496h) && d(com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE, this.f36489a, this.f36490b) && d(i27, this.f36497i, this.f36498j) && d(i19, this.f36499k, this.f36500l) && d(by5.a4.c(), this.f36505q, this.f36506r) && !f(this.f36501m) && !g(this.f36512x, org.xwalk.core.XWalkEnvironment.l()) && e())) {
            by5.c4.f(b(), "checkMatch, not match");
            return false;
        }
        if (this.f36509u > 0 && by5.d4.f().getInt("IP_TYPE", -2) != this.f36509u) {
            by5.c4.f(b(), "not match user type:" + this.f36509u);
            return false;
        }
        java.lang.String str2 = this.f36502n;
        if ((str2 == null || str2.trim() == null || this.f36502n.trim().isEmpty() || f(this.f36502n)) ? false : true) {
            by5.c4.f(b(), "not match white device regex:" + this.f36502n);
            return false;
        }
        java.lang.String str3 = this.f36513y;
        if ((str3 == null || str3.trim() == null || this.f36513y.trim().isEmpty() || g(this.f36513y, org.xwalk.core.XWalkEnvironment.l())) ? false : true) {
            by5.c4.f(b(), "not match white app regex:" + this.f36513y);
            return false;
        }
        if (this.f36507s > 0 || this.f36508t > 0) {
            int a17 = by5.e.a();
            if (!d(a17, this.f36507s, this.f36508t)) {
                by5.c4.f(b(), "not match chromium version(" + this.f36507s + ", " + this.f36508t + "), current version is:" + a17);
                return false;
            }
        }
        if ((z18 || !android.text.TextUtils.isEmpty(this.E)) && !h(this.E, c())) {
            by5.c4.f(b(), "not match whiteRuntimeAbis, white abis is:" + this.E + ", cur runtime abi is:" + by5.a.b() + ", target runtime abi:" + c());
            return false;
        }
        if ((android.text.TextUtils.isEmpty(this.D) || h(this.D, by5.a.a())) ? false : true) {
            by5.c4.f(b(), "not match whiteDeviceAbis, white abis is:" + this.D + ", cur device abi is:" + by5.a.a());
            return false;
        }
        if (!android.text.TextUtils.isEmpty(this.G) && h(this.G, c())) {
            by5.c4.f(b(), "not match in blackRuntimeAbis, black abis is:" + this.G + ", cur runtime abi is:" + by5.a.b() + ", target runtime abi:" + c());
            return false;
        }
        if (!android.text.TextUtils.isEmpty(this.F) && h(this.F, by5.a.a())) {
            by5.c4.f(b(), "not match in blackDeviceAbis, black abis is:" + this.F + ", cur device abi is:" + by5.a.a());
            return false;
        }
        android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347981n;
        synchronized (bundle) {
            i17 = bundle.getInt("clientVersion", 0);
        }
        if (i17 > 0 && !d(i17, this.H, this.I)) {
            by5.c4.f(b(), "not match AppClientVersion(" + this.H + ", " + this.I + "), cur client version is:" + i17);
            return false;
        }
        if ((android.text.TextUtils.isEmpty(this.f36488J) || org.xwalk.core.XWalkEnvironment.containsAppInfo(this.f36488J)) ? false : true) {
            by5.c4.f(b(), "not match appInfoWhiteList:" + this.f36488J);
            return false;
        }
        if (!(!android.text.TextUtils.isEmpty(this.K) && org.xwalk.core.XWalkEnvironment.containsAppInfo(this.K))) {
            return true;
        }
        by5.c4.f(b(), "not match in appInfoBlackList:" + this.K);
        return false;
    }

    public final java.lang.String b() {
        java.lang.String str = this.L;
        if (str == null || "".equals(str)) {
            return "ConfigFilter(" + hashCode() + ")";
        }
        return "ConfigFilter(" + this.L + "|" + hashCode() + ")";
    }

    public java.lang.String c() {
        return !android.text.TextUtils.isEmpty(this.M) ? this.M : by5.a.b();
    }

    public final boolean e() {
        double d17 = this.f36510v;
        if (!(d17 >= 0.0d && d17 < 24.0d)) {
            double d18 = this.f36511w;
            if (!(d18 >= 0.0d && d18 < 24.0d)) {
                return true;
            }
        }
        double a17 = by5.a0.a();
        double d19 = this.f36511w;
        if (d19 > 0.0d && a17 > d19) {
            return false;
        }
        double d27 = this.f36510v;
        return d27 <= 0.0d || a17 >= d27;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Filter{");
        if (this.f36489a != 0) {
            sb6.append("sdkMin=");
            sb6.append(this.f36489a);
        }
        if (this.f36490b != 0) {
            sb6.append(", sdkMax=");
            sb6.append(this.f36490b);
        }
        if (this.f36491c != 0) {
            sb6.append(", apkMin=");
            sb6.append(this.f36491c);
        }
        if (this.f36492d != 0) {
            sb6.append(", apkMax=");
            sb6.append(this.f36492d);
        }
        if (this.f36493e != 0) {
            sb6.append(", usingApkMin=");
            sb6.append(this.f36493e);
        }
        if (this.f36494f != 0) {
            sb6.append(", usingApkMax=");
            sb6.append(this.f36494f);
        }
        if (this.f36495g != 0) {
            sb6.append(", preDownApkMin=");
            sb6.append(this.f36495g);
        }
        if (this.f36496h != 0) {
            sb6.append(", preDownApkMax=");
            sb6.append(this.f36496h);
        }
        if (this.f36497i != 0) {
            sb6.append(", apiMin=");
            sb6.append(this.f36497i);
        }
        if (this.f36498j != 0) {
            sb6.append(", apiMax=");
            sb6.append(this.f36498j);
        }
        if (this.f36499k != 0) {
            sb6.append(", targetApiMin=");
            sb6.append(this.f36499k);
        }
        if (this.f36500l != 0) {
            sb6.append(", targetApiMax=");
            sb6.append(this.f36500l);
        }
        if (this.f36503o != 0) {
            sb6.append(", grayMin=");
            sb6.append(this.f36503o);
        }
        if (this.f36504p != 0) {
            sb6.append(", grayMax=");
            sb6.append(this.f36504p);
        }
        if (this.f36505q != 0) {
            sb6.append(", dayGrayMin=");
            sb6.append(this.f36505q);
        }
        if (this.f36506r != 0) {
            sb6.append(", dayGrayMax=");
            sb6.append(this.f36506r);
        }
        if (this.f36507s != 0) {
            sb6.append(", chromeMin=");
            sb6.append(this.f36507s);
        }
        if (this.f36508t != 0) {
            sb6.append(", chromeMax=");
            sb6.append(this.f36508t);
        }
        if (this.f36509u != 0) {
            sb6.append(", usertype=");
            sb6.append(this.f36509u);
        }
        if (this.f36510v != -1.0d) {
            sb6.append(", hoursStart=");
            sb6.append(this.f36510v);
        }
        if (this.f36511w != -1.0d) {
            sb6.append(", hoursEnd=");
            sb6.append(this.f36511w);
        }
        if (this.f36514z != 0) {
            sb6.append(", x5sdkmin=");
            sb6.append(this.f36514z);
        }
        if (this.A != 0) {
            sb6.append(", x5sdkmax=");
            sb6.append(this.A);
        }
        if (this.B != 0) {
            sb6.append(", x5coremin=");
            sb6.append(this.B);
        }
        if (this.C != 0) {
            sb6.append(", x5coremax=");
            sb6.append(this.C);
        }
        if (this.H != 0) {
            sb6.append(", appClientVerMin=");
            sb6.append(this.H);
        }
        if (this.I != 0) {
            sb6.append(", appClientVerMax=");
            sb6.append(this.I);
        }
        if (!android.text.TextUtils.isEmpty(this.f36501m)) {
            sb6.append(", forbidDeviceRegex='");
            sb6.append(this.f36501m);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.f36502n)) {
            sb6.append(", whiteDeviceRegex='");
            sb6.append(this.f36502n);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.f36512x)) {
            sb6.append(", forbidAppRegex='");
            sb6.append(this.f36512x);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.f36513y)) {
            sb6.append(", whiteAppRegex='");
            sb6.append(this.f36513y);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.D)) {
            sb6.append(", deviceAbis='");
            sb6.append(this.D);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.E)) {
            sb6.append(", runtimeAbis='");
            sb6.append(this.E);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.F)) {
            sb6.append(", blackDeviceAbis='");
            sb6.append(this.F);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.G)) {
            sb6.append(", blackRuntimeAbis='");
            sb6.append(this.G);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.f36488J)) {
            sb6.append(", appInfoWhiteList='");
            sb6.append(this.f36488J);
            sb6.append('\'');
        }
        if (!android.text.TextUtils.isEmpty(this.K)) {
            sb6.append(", appInfoBlackList='");
            sb6.append(this.K);
            sb6.append('\'');
        }
        sb6.append('}');
        return sb6.toString();
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hn {
    private static com.tencent.mapsdk.internal.hn.a A = null;
    private static final java.lang.String B;
    private static final java.lang.String C;
    private static java.lang.String D = null;
    private static java.lang.String E = null;
    private static java.lang.String F = null;
    private static java.lang.String G = null;
    private static java.lang.String H = null;
    private static java.lang.String I = null;

    /* renamed from: J, reason: collision with root package name */
    private static java.lang.String f49796J = null;
    private static int K = 0;
    private static java.lang.String L = null;
    private static java.lang.String M = null;
    private static float N = 0.0f;
    private static final int O = 100;
    private static final int P = 4000000;
    private static final int Q = 53500000;
    private static final int R = 73670000;
    private static final int S = 135100000;
    private static final int T = -85000000;
    private static final int U = 85000000;
    private static final int V = -180000000;
    private static final int W = 180000000;
    private static int X = 0;
    private static int Y = 0;
    private static float Z = 0.0f;

    /* renamed from: a, reason: collision with root package name */
    public static final java.io.File f49797a;

    /* renamed from: aa, reason: collision with root package name */
    private static final int f49798aa = 20;

    /* renamed from: ab, reason: collision with root package name */
    private static final double f49799ab = 6378137.0d;

    /* renamed from: ac, reason: collision with root package name */
    private static final double f49800ac = 4.007501668557849E7d;

    /* renamed from: ad, reason: collision with root package name */
    private static final double f49801ad = 0.017453292519943295d;

    /* renamed from: ae, reason: collision with root package name */
    private static final double f49802ae = 2.68435456E8d;

    /* renamed from: b, reason: collision with root package name */
    public static final java.io.File f49803b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.io.File f49804c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f49805d = "tencentmap/mapsdk_vector/";

    /* renamed from: e, reason: collision with root package name */
    public static final int f49806e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f49807f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f49808g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f49809h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static int f49810i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f49811j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static int f49812k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f49813l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f49814m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f49815n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f49816o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static int f49817p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f49818q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static int f49819r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static int f49820s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f49821t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.String f49822u = "Tencent";

    /* renamed from: v, reason: collision with root package name */
    private static final java.lang.String f49823v = "MapSDK";

    /* renamed from: w, reason: collision with root package name */
    private static final java.lang.String f49824w = "Caches";

    /* renamed from: x, reason: collision with root package name */
    private static java.lang.String f49825x;

    /* renamed from: y, reason: collision with root package name */
    private static java.lang.String f49826y;

    /* renamed from: z, reason: collision with root package name */
    private static java.lang.String f49827z;

    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final boolean f49828a;

        public /* synthetic */ a(boolean z17, byte b17) {
            this(z17);
        }

        private java.lang.String a() {
            return (this.f49828a || com.tencent.mapsdk.internal.hn.G == null) ? "" : com.tencent.mapsdk.internal.hn.G;
        }

        private java.lang.String b() {
            return (this.f49828a || com.tencent.mapsdk.internal.hn.H == null) ? "" : com.tencent.mapsdk.internal.hn.H;
        }

        private static java.lang.String c() {
            return com.tencent.map.tools.net.NetUtil.STR_UserAgent;
        }

        private java.lang.String d() {
            return (this.f49828a || com.tencent.mapsdk.internal.hn.L == null) ? "" : com.tencent.mapsdk.internal.hn.L;
        }

        private java.lang.String e() {
            return this.f49828a ? "" : com.tencent.mapsdk.internal.hn.M;
        }

        private int f() {
            if (this.f49828a) {
                return 0;
            }
            return com.tencent.mapsdk.internal.hn.K;
        }

        private java.lang.String g() {
            return (this.f49828a || com.tencent.mapsdk.internal.hn.F == null) ? "" : com.tencent.mapsdk.internal.hn.F;
        }

        private static int h() {
            return com.tencent.mapsdk.internal.hn.X;
        }

        private java.lang.String i() {
            return (this.f49828a || com.tencent.mapsdk.internal.hn.I == null) ? "" : com.tencent.mapsdk.internal.hn.I;
        }

        private static java.lang.String j() {
            java.lang.String str = com.tencent.mapsdk.internal.hn.f49827z;
            return (str == null || android.text.TextUtils.isEmpty(str) || str.equals(com.tencent.mapsdk.internal.hn.f49796J)) ? com.tencent.mapsdk.internal.hn.f49796J == null ? "" : com.tencent.mapsdk.internal.hn.f49796J : str;
        }

        private static java.lang.String k() {
            return com.tencent.mapsdk.internal.hn.B;
        }

        private static java.lang.String l() {
            return com.tencent.mapsdk.internal.hn.E == null ? "" : com.tencent.mapsdk.internal.hn.E;
        }

        private static java.lang.String m() {
            return com.tencent.mapsdk.internal.hn.C;
        }

        private static float n() {
            return com.tencent.mapsdk.internal.hn.N;
        }

        private static float o() {
            return com.tencent.mapsdk.internal.hn.Z;
        }

        private static java.lang.String p() {
            java.lang.String str = com.tencent.mapsdk.internal.hn.f49826y;
            return (str == null || str.equals(com.tencent.mapsdk.internal.hn.f49825x)) ? com.tencent.mapsdk.internal.hn.f49825x : str;
        }

        private a(boolean z17) {
            this.f49828a = z17;
        }
    }

    static {
        java.io.File file = new java.io.File("", f49822u);
        f49797a = file;
        java.io.File file2 = new java.io.File(file, f49823v);
        f49803b = file2;
        f49804c = new java.io.File(file2, f49824w);
        f49825x = null;
        f49826y = null;
        f49827z = null;
        java.lang.String str = com.tencent.mapsdk.internal.tf.f51588j;
        B = str;
        C = str;
        D = null;
        E = null;
        F = null;
        G = null;
        H = null;
        I = null;
        f49796J = null;
        K = 0;
        L = null;
        M = "undefined";
        N = 1.0f;
        f49810i = 2;
        f49811j = 0;
        f49812k = 0;
        f49813l = 0;
        f49817p = 2;
        f49818q = P;
        f49819r = Q;
        f49820s = R;
        f49821t = S;
        X = 0;
        Y = 160;
        Z = 0.0f;
    }

    private static java.util.Date J() {
        return java.util.Calendar.getInstance().getTime();
    }

    private static java.lang.String K() {
        return Q().f49828a ? "" : M;
    }

    private static void L() {
        int i17 = Y;
        if (i17 <= 120) {
            f49817p = 1;
            return;
        }
        if (i17 <= 160) {
            f49817p = 2;
        } else if (i17 <= 240) {
            f49817p = 3;
        } else {
            M();
        }
    }

    private static void M() {
        int i17 = X;
        if (i17 > 153600) {
            f49817p = 3;
        } else if (i17 < 153600) {
            f49817p = 1;
        } else {
            f49817p = 2;
        }
    }

    private static java.lang.String N() {
        return f49822u;
    }

    private static java.lang.String O() {
        return f49823v;
    }

    private static java.lang.String P() {
        return f49824w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.tencent.mapsdk.internal.hn.a Q() {
        com.tencent.mapsdk.internal.hn.a aVar = A;
        return aVar != null ? aVar : new com.tencent.mapsdk.internal.hn.a(false, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.tencent.mapsdk.internal.hn.a R() {
        return new com.tencent.mapsdk.internal.hn.a(false, 0 == true ? 1 : 0);
    }

    private static float a(int i17) {
        return i17 / 255.0f;
    }

    public static float b() {
        Q();
        return N;
    }

    public static java.lang.String c() {
        Q();
        return com.tencent.map.tools.net.NetUtil.STR_UserAgent;
    }

    public static java.lang.String d() {
        java.lang.String str;
        return (Q().f49828a || (str = G) == null) ? "" : str;
    }

    public static java.lang.String e() {
        java.lang.String str;
        return (Q().f49828a || (str = H) == null) ? "" : str;
    }

    public static int f() {
        Q();
        return X;
    }

    public static java.lang.String g() {
        java.lang.String str;
        return (Q().f49828a || (str = I) == null) ? "" : str;
    }

    public static java.lang.String h() {
        java.lang.String str;
        return (Q().f49828a || (str = L) == null) ? "" : str;
    }

    public static java.lang.String i() {
        Q();
        return B;
    }

    public static int j() {
        if (Q().f49828a) {
            return 0;
        }
        return K;
    }

    public static java.lang.String k() {
        Q();
        java.lang.String str = E;
        return str == null ? "" : str;
    }

    public static java.lang.String l() {
        java.lang.String str;
        return (Q().f49828a || (str = F) == null) ? "" : str;
    }

    public static java.lang.String m() {
        Q();
        java.lang.String str = f49827z;
        if (str != null && !android.text.TextUtils.isEmpty(str) && !str.equals(f49796J)) {
            return str;
        }
        java.lang.String str2 = f49796J;
        return str2 == null ? "" : str2;
    }

    public static java.lang.String n() {
        Q();
        return C;
    }

    public static float o() {
        Q();
        return Z;
    }

    public static int p() {
        return 687865856;
    }

    public static void q() {
        f49820s = R;
        f49821t = S;
        f49819r = Q;
        f49818q = P;
    }

    public static void r() {
        A = null;
        f49827z = null;
        f49826y = null;
    }

    public static java.lang.String a() {
        Q();
        java.lang.String str = f49826y;
        return (str == null || str.equals(f49825x)) ? f49825x : str;
    }

    private static java.lang.String c(java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (byte b17 : digest) {
                sb6.append(java.lang.Integer.toHexString(b17 & 255));
                sb6.append("");
            }
            return sb6.toString();
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    private static java.lang.String b(java.lang.String str) {
        return java.util.regex.Pattern.compile("[^a-zA-Z0-9]").matcher(str).replaceAll("").trim();
    }

    private static java.lang.String[] d(java.lang.String str) {
        java.lang.String[] strArr = new java.lang.String[3];
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            strArr[0] = jSONObject.optString("version");
            strArr[1] = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            strArr[2] = jSONObject.optString("otherDistrict");
        } catch (org.json.JSONException unused) {
        }
        return strArr;
    }

    private static void b(android.util.DisplayMetrics displayMetrics) {
        Y = displayMetrics.densityDpi;
        L();
    }

    private static java.lang.String a(java.lang.String str) {
        return str == null ? "" : str.replace("&", "").replace("#", "").replace("?", "");
    }

    private static java.lang.String b(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        if (context == null) {
            return "";
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        try {
            return java.net.URLEncoder.encode((applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.lang.Exception unused2) {
            return "can't find app name";
        }
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mapsdk.internal.ks.f50186d = f49804c;
        f49826y = str;
        f49827z = str2;
        M = str3;
        if (X == 0 && context != null) {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            X = displayMetrics.widthPixels * displayMetrics.heightPixels;
            Y = displayMetrics.densityDpi;
            L();
        }
        if (L == null) {
            try {
                java.lang.String b17 = com.tencent.mapsdk.internal.hs.b();
                L = b17;
                java.lang.String a17 = a(b17);
                L = a17;
                L = java.net.URLEncoder.encode(a17, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused) {
            }
        }
        if (K == 0) {
            K = android.os.Build.VERSION.SDK_INT;
        }
        if (f49796J == null) {
            try {
                java.lang.String packageName = context.getPackageName();
                f49796J = packageName;
                java.lang.String a18 = a(packageName);
                f49796J = a18;
                f49796J = java.net.URLEncoder.encode(a18, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused2) {
            }
        }
        if (D == null) {
            try {
                java.lang.String h17 = com.tencent.mapsdk.internal.hs.h(context);
                D = h17;
                java.lang.String a19 = a(h17);
                D = a19;
                D = java.net.URLEncoder.encode(a19, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused3) {
            }
        }
        if (E == null) {
            try {
                java.lang.String e17 = com.tencent.mapsdk.internal.hs.e(context);
                E = e17;
                java.lang.String a27 = a(e17);
                E = a27;
                E = java.net.URLEncoder.encode(a27, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused4) {
            }
        }
        if (F == null) {
            try {
                java.lang.String i17 = com.tencent.mapsdk.internal.hs.i(context);
                F = i17;
                java.lang.String a28 = a(i17);
                F = a28;
                F = java.net.URLEncoder.encode(a28, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused5) {
            }
        }
        if (G == null) {
            try {
                java.lang.String f17 = com.tencent.mapsdk.internal.hs.f(context);
                G = f17;
                java.lang.String a29 = a(f17);
                G = a29;
                G = java.net.URLEncoder.encode(a29, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused6) {
            }
        }
        if (android.text.TextUtils.isEmpty(H)) {
            try {
                java.lang.String g17 = com.tencent.mapsdk.internal.hs.g(context);
                H = g17;
                java.lang.String a37 = a(g17);
                H = a37;
                H = java.net.URLEncoder.encode(a37, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused7) {
            }
        }
        if (I == null) {
            try {
                java.lang.String netTypeStr = com.tencent.map.tools.net.NetUtil.getNetTypeStr(context);
                I = netTypeStr;
                java.lang.String a38 = a(netTypeStr);
                I = a38;
                I = java.net.URLEncoder.encode(a38, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused8) {
            }
        }
        if (f49825x == null) {
            try {
                java.lang.String a39 = com.tencent.mapsdk.internal.hs.a(context, "TencentMapSDK");
                f49825x = a39;
                f49825x = java.net.URLEncoder.encode(a39, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Exception unused9) {
            }
        }
        if (N == 1.0f) {
            N = 320.0f / context.getResources().getDisplayMetrics().densityDpi;
        }
        Z = context.getResources().getDisplayMetrics().density;
    }

    public static int b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mapsdk.internal.hr.a(str2)) {
            return 1;
        }
        if (com.tencent.mapsdk.internal.hr.a(str)) {
            return -1;
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int length = split.length;
        if (length > split2.length) {
            length = split2.length;
        }
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String str3 = split2[i17];
            java.lang.String str4 = split[i17];
            if (android.text.TextUtils.isEmpty(str3)) {
                str3 = "0";
            }
            if (android.text.TextUtils.isEmpty(str4)) {
                str4 = "0";
            }
            if (java.lang.Integer.valueOf(str3).intValue() < java.lang.Integer.valueOf(str4).intValue()) {
                return 1;
            }
            if (java.lang.Integer.valueOf(str3).intValue() > java.lang.Integer.valueOf(str4).intValue()) {
                return -1;
            }
        }
        if (split.length > split2.length) {
            return 1;
        }
        return split.length == split2.length ? 0 : -1;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String b17;
        if (com.tencent.mapsdk.internal.hr.a(str)) {
            str = "";
        }
        if (com.tencent.mapsdk.internal.hr.a(str2)) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("key=");
        sb6.append(a());
        sb6.append("&pid=");
        sb6.append(m());
        sb6.append("&key2=");
        sb6.append(str);
        sb6.append("&pid2=");
        sb6.append(str2);
        sb6.append("&psv=");
        sb6.append(k());
        sb6.append("&ver=");
        Q();
        sb6.append(C);
        sb6.append("&pf=androidsdk&hm=");
        Q();
        sb6.append(h());
        sb6.append("&suid=");
        sb6.append(d());
        sb6.append("&os=");
        sb6.append(j());
        sb6.append("&dip=");
        sb6.append(l());
        sb6.append("&nt=");
        sb6.append(g());
        sb6.append("&channel=1&output=json");
        java.lang.String str3 = M;
        if (!android.text.TextUtils.isEmpty(str3)) {
            try {
                b17 = java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException unused) {
                b17 = b(str3);
            }
            sb6.append("&cuid=");
            sb6.append(b17);
            sb6.append("&uuid=");
            sb6.append(b17);
        }
        return sb6.toString();
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        if (!android.text.TextUtils.isEmpty(G)) {
            sb6.append("&suid=");
            sb6.append(d());
        }
        if (!android.text.TextUtils.isEmpty(H)) {
            sb6.append("&duid=");
            sb6.append(e());
        }
        if (!android.text.TextUtils.isEmpty(f49796J)) {
            sb6.append("&appid=");
            sb6.append(m());
            sb6.append("&pid=");
            sb6.append(m());
        }
        java.lang.String str4 = B;
        if (!android.text.TextUtils.isEmpty(str4)) {
            sb6.append("&sdkver=");
            Q();
            sb6.append(str4);
            sb6.append("&ver=");
            Q();
            sb6.append(C);
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append("&ui=");
            sb6.append(str);
        }
        if (!android.text.TextUtils.isEmpty(M)) {
            sb6.append("&appsuid=");
            try {
                sb6.append(java.net.URLEncoder.encode(M, com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.io.UnsupportedEncodingException unused) {
                sb6.append(b(M));
            }
            sb6.append("&cuid=");
            sb6.append(M);
        }
        sb6.append("&api_key=" + a());
        sb6.append("&key=" + a());
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb6.append("&key2=");
            sb6.append(str2);
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            sb6.append("&pid2=");
            sb6.append(str3);
        }
        if (!android.text.TextUtils.isEmpty(k())) {
            sb6.append("&psv=");
            sb6.append(k());
        }
        Q();
        if (!android.text.TextUtils.isEmpty(com.tencent.map.tools.net.NetUtil.STR_UserAgent)) {
            sb6.append("&pf=androidsdk");
            Q();
        }
        if (!android.text.TextUtils.isEmpty(h())) {
            sb6.append("&hm=");
            sb6.append(h());
        }
        sb6.append("&os=");
        sb6.append(j());
        if (!android.text.TextUtils.isEmpty(l())) {
            sb6.append("&dip=");
            sb6.append(l());
        }
        if (!android.text.TextUtils.isEmpty(g())) {
            sb6.append("&nt=");
            sb6.append(g());
        }
        if (!android.text.TextUtils.isEmpty(com.tencent.mapsdk.internal.hs.a())) {
            sb6.append("&sessionid=");
            sb6.append(com.tencent.mapsdk.internal.hs.a());
        }
        return sb6.toString();
    }

    private static java.lang.String a(byte[] bArr, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (byte b17 : bArr) {
            sb6.append(java.lang.Integer.toHexString(b17 & 255));
            sb6.append(str);
        }
        return sb6.toString();
    }

    private static void a(android.util.DisplayMetrics displayMetrics) {
        java.lang.reflect.Field field;
        try {
            field = displayMetrics.getClass().getField("densityDpi");
        } catch (java.lang.NoSuchFieldException | java.lang.SecurityException unused) {
            field = null;
        }
        if (field != null) {
            try {
                Y = field.getInt(displayMetrics);
                L();
                return;
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException unused2) {
                return;
            }
        }
        M();
    }

    private static void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        X = displayMetrics.widthPixels * displayMetrics.heightPixels;
        Y = displayMetrics.densityDpi;
        L();
    }

    public static double a(double d17, double d18) {
        return (d17 * 6.698324247899813d) / java.lang.Math.cos(d18 * 0.017453292519943295d);
    }

    private static boolean a(android.content.Context context, byte[] bArr, java.lang.String str) {
        java.io.File fileStreamPath = context.getFileStreamPath("tecentmap");
        if (!fileStreamPath.exists()) {
            fileStreamPath.mkdirs();
        }
        java.lang.String str2 = fileStreamPath.getPath() + "/" + str;
        return (android.text.TextUtils.isEmpty(str2) ? 0 : com.tencent.mapsdk.internal.kt.a(bArr, new java.io.File(str2))) != 0;
    }

    private static byte[] a(android.content.Context context, java.lang.String str) {
        java.io.InputStream b17 = com.tencent.mapsdk.internal.kt.b(context.getFileStreamPath("tecentmap").getPath() + "/" + str);
        byte[] b18 = com.tencent.mapsdk.internal.kt.b(b17);
        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) b17);
        return b18;
    }

    public static void a(boolean z17) {
        A = new com.tencent.mapsdk.internal.hn.a(z17, (byte) 0);
    }
}

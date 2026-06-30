package wo;

/* loaded from: classes12.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f529372a;

    /* renamed from: b, reason: collision with root package name */
    public static final wo.r0 f529373b = new wo.h0(new wo.g0("a", 5));

    /* renamed from: c, reason: collision with root package name */
    public static final wo.r0 f529374c = new wo.i0(new wo.u0("c", 5));

    /* renamed from: d, reason: collision with root package name */
    public static final wo.r0 f529375d = new wo.j0(new wo.u0("d", 5));

    /* renamed from: e, reason: collision with root package name */
    public static final wo.r0 f529376e = new wo.k0(new wo.u0("e", 5));

    /* renamed from: f, reason: collision with root package name */
    public static final wo.r0 f529377f = new wo.m0(new wo.l0("f", 5));

    /* renamed from: g, reason: collision with root package name */
    public static final wo.r0 f529378g = new wo.n0(new wo.u0("g", 5));

    /* renamed from: h, reason: collision with root package name */
    public static final wo.r0 f529379h = new wo.o0(new wo.u0("h", 5));

    /* renamed from: i, reason: collision with root package name */
    public static final wo.r0 f529380i = new wo.x(new wo.u0("i", 5));

    /* renamed from: j, reason: collision with root package name */
    public static final wo.r0 f529381j = new wo.z(new wo.y("j", 5));

    /* renamed from: k, reason: collision with root package name */
    public static final wo.r0 f529382k = new wo.b0(new wo.a0("k", 5));

    /* renamed from: l, reason: collision with root package name */
    public static final wo.r0 f529383l = new wo.c0(new wo.u0("MODEL", 5));

    /* renamed from: m, reason: collision with root package name */
    public static final wo.r0 f529384m = new wo.e0(new wo.d0("DEVICE_ID", 5));

    /* renamed from: n, reason: collision with root package name */
    public static final wo.r0 f529385n = new wo.f0(new wo.u0("FIRST_INSTALL_TIMEl", 5));

    /* renamed from: o, reason: collision with root package name */
    public static final java.io.File f529386o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Boolean[] f529387p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f529388q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f529389r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f529390s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f529391t;

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f529392u;

    /* renamed from: v, reason: collision with root package name */
    public static final wo.v0 f529393v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile boolean f529394w;

    /* renamed from: x, reason: collision with root package name */
    public static volatile boolean f529395x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.Boolean[] f529396y;

    static {
        new java.io.File(lp0.b.e(), new java.lang.StringBuilder("midcdnu.").reverse().toString());
        f529386o = new java.io.File(lp0.b.e(), new java.lang.StringBuilder("midcdnd.").reverse().toString());
        f529387p = new java.lang.Boolean[]{null};
        f529388q = false;
        f529389r = null;
        f529390s = null;
        f529391t = null;
        f529392u = null;
        f529393v = new wo.v0("ddc_spin_" + android.os.Process.myUid());
        f529394w = false;
        f529395x = false;
        f529396y = new java.lang.Boolean[]{null};
    }

    public static boolean a() {
        return android.provider.Settings.Global.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "adb_enabled", 0) == 1;
    }

    public static boolean b() {
        return android.provider.Settings.Secure.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "development_settings_enabled", 0) == 1;
    }

    public static java.lang.String c() {
        boolean z17 = f529372a;
        wo.r0 r0Var = f529378g;
        if (!z17) {
            wo.v0 v0Var = r0Var.f529328b;
            try {
                v0Var.a();
                if (!(!android.text.TextUtils.isEmpty(r0Var.f529327a.a(null)))) {
                    return "";
                }
            } finally {
                v0Var.c();
            }
        }
        java.lang.String a17 = r0Var.a();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String d() {
        try {
            return java.lang.Long.toString(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageInfo(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, 0).firstInstallTime);
        } catch (java.lang.Exception unused) {
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
    }

    public static java.util.Map e() {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th6;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/cpuinfo"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!readLine.trim().isEmpty()) {
                        java.lang.String[] split = readLine.split(":");
                        if (split.length > 1) {
                            hashMap.put(split[0].trim().toLowerCase(), split[1].trim());
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th6, "getCPUInfoMap() failed.", new java.lang.Object[0]);
                        hashMap.clear();
                        return hashMap;
                    } finally {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                    }
                }
            }
        } catch (java.lang.Throwable th8) {
            bufferedReader = null;
            th6 = th8;
        }
        return hashMap;
    }

    public static java.lang.String[] f() {
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/cpuinfo"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String[] split = bufferedReader2.readLine().split("\\s+");
                for (int i17 = 2; i17 < split.length; i17++) {
                    sb6.append(split[i17]);
                    sb6.append(' ');
                }
                java.lang.String[] strArr = {sb6.toString(), bufferedReader2.readLine().split("\\s+")[2]};
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader2);
                return strArr;
            } catch (java.lang.Throwable th6) {
                th = th6;
                bufferedReader = bufferedReader2;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th, "getFirstCPUCoreDescs() failed.", new java.lang.Object[0]);
                    return new java.lang.String[]{"", "0"};
                } finally {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static java.lang.String g(boolean z17) {
        java.lang.String a17 = f529373b.a();
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? a17 : z17 ? "1234567890ABCDEF" : "";
    }

    public static java.lang.String h() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = (java.lang.String) yj0.a.j(telephonyManager, "com/tencent/mm/compatible/deviceinfo/DeviceInfo", "getIMSI", "()Ljava/lang/String;", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;");
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th6, "getIMSI", new java.lang.Object[0]);
            return "";
        }
    }

    public static java.lang.String i() {
        java.lang.String a17 = f529375d.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String j() {
        return k();
    }

    public static java.lang.String k() {
        java.lang.String a17 = f529379h.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String l() {
        return "android-" + m() + "-" + android.os.Build.VERSION.SDK_INT;
    }

    public static java.lang.String m() {
        java.lang.String a17 = f529383l.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String n() {
        java.lang.String a17 = f529382k.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return a17 == null ? "" : a17;
    }

    public static java.lang.String o() {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            java.lang.String simCountryIso = telephonyManager.getSimCountryIso();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return simCountryIso == null ? "" : simCountryIso;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th6, "getSimCountryIso", new java.lang.Object[0]);
            return "";
        }
    }

    public static java.lang.String p() {
        java.lang.String a17 = f529381j.a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return a17 == null ? "" : a17;
    }

    public static boolean q() {
        boolean booleanValue;
        java.lang.Boolean[] boolArr = f529396y;
        java.lang.Boolean bool = boolArr[0];
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (boolArr) {
            java.lang.Boolean bool2 = boolArr[0];
            if (bool2 == null) {
                bool2 = java.lang.Boolean.valueOf(android.os.Process.is64Bit());
                boolArr[0] = bool2;
            }
            booleanValue = bool2.booleanValue();
        }
        return booleanValue;
    }

    public static void r(wo.t0 t0Var) {
        if (!u()) {
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.DeviceInfo", "[+] new impl of device change detection is not enabled.", new java.lang.Object[0]);
            return;
        }
        if (!f529394w) {
            wo.v0 v0Var = f529393v;
            synchronized (v0Var) {
                if (!f529394w) {
                    try {
                        v0Var.a();
                        t(t0Var);
                        f529394w = true;
                        v0Var.c();
                        return;
                    } catch (java.lang.Throwable th6) {
                        f529393v.c();
                        throw th6;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.app.p5.f("MicroMsg.DeviceInfo", "[!] refreshWhenDeviceChanged called, skip this time.", new java.lang.Object[0]);
    }

    public static boolean s() {
        if (u()) {
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.DeviceInfo", "[+] legacy impl of device change detection was disabled.", new java.lang.Object[0]);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfo", "init DeviceInfo ");
        java.lang.String d17 = d();
        wo.r0 r0Var = f529385n;
        java.lang.String a17 = r0Var.a();
        f529389r = a17;
        if (!d17.equalsIgnoreCase(a17)) {
            wo.r0 r0Var2 = f529378g;
            java.lang.String a18 = r0Var2.a();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (a18 == null) {
                a18 = "";
            }
            f529390s = a18;
            android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("android_id");
            arrayList.add(contentResolver);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            if (!a18.equalsIgnoreCase((java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/DeviceInfo", "refreshWhenDeviceChangedLegacyIfEnabled", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"))) {
                f529391t = m();
                wo.r0 r0Var3 = f529384m;
                f529392u = r0Var3.a();
                r0Var.e();
                r0Var3.e();
                r0Var2.e();
                wo.r0 r0Var4 = f529383l;
                r0Var4.e();
                f529376e.f();
                f529380i.f();
                f529388q = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeviceInfo", java.lang.String.format("[!!] Reset DeviceInfo. InstallTime(%s -> %s), Model(%s -> %s), MMGUID(%s, %s -> %s), AndroidID(%s -> %s)", f529389r, d17, f529391t, r0Var4.a(), f529379h.a(), f529392u, r0Var3.a(), f529390s, r0Var2.a()));
                jz5.g gVar = fp.t.f346772a;
                try {
                    if (((java.lang.Boolean) ((jz5.n) fp.t.f346772a).mo141623x754a37bb()).booleanValue()) {
                        java.lang.String m139410xbca9ae01 = io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139410xbca9ae01(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m139410xbca9ae01, "getCacheDirectory(...)");
                        java.lang.String concat = m139410xbca9ae01.concat("/flutter_engine");
                        if (com.p314xaae8f345.mm.vfs.w6.j(concat)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterCacheUtil", "cleanFlutterCache");
                            com.p314xaae8f345.mm.vfs.w6.f(concat);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlutterCacheUtil", th6, "cleanFlutterCache error", new java.lang.Object[0]);
                }
                return f529388q;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeviceInfo", java.lang.String.format("No need to reset DeviceInfo as usual. [%s]", d17));
        return f529388q;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(wo.t0 r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.w0.t(wo.t0):void");
    }

    public static boolean u() {
        java.lang.Boolean[] boolArr = f529387p;
        synchronized (boolArr) {
            java.lang.Boolean bool = boolArr[0];
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z17 = true;
            try {
                z17 = true ^ f529386o.exists();
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Boolean[] boolArr2 = f529387p;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            boolArr2[0] = valueOf;
            return valueOf.booleanValue();
        }
    }
}

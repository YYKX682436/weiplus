package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.BuildInfo */
/* loaded from: classes13.dex */
public class C29285x23ebd81c {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73185x7118e671 = false;

    /* renamed from: MAX_FINGERPRINT_LENGTH */
    private static final int f73186x73cef99c = 128;
    private static final java.lang.String TAG = "BuildInfo";

    /* renamed from: sBrowserApplicationInfo */
    private static android.content.pm.ApplicationInfo f73187xb5f71229;

    /* renamed from: sBrowserPackageInfo */
    private static android.content.pm.PackageInfo f73188x2709939f;

    /* renamed from: sInitialized */
    private static boolean f73189x21c49861;

    /* renamed from: abiString */
    public final java.lang.String f73190x38c9d699;

    /* renamed from: androidBuildFingerprint */
    public final java.lang.String f73191xda0fd625;

    /* renamed from: customThemes */
    public final java.lang.String f73192x1822a29b;

    /* renamed from: gmsVersionCode */
    public final java.lang.String f73193x6f47e858;

    /* renamed from: hostPackageLabel */
    public final java.lang.String f73194xbc3c2416;

    /* renamed from: hostPackageName */
    public final java.lang.String f73195xab3ca929;

    /* renamed from: hostVersionCode */
    public final long f73196x9e1d2c1d;

    /* renamed from: installerPackageName */
    public final java.lang.String f73197x5e07b49;

    /* renamed from: isAutomotive */
    public final boolean f73198x96b45bbf;

    /* renamed from: isTV */
    public final boolean f73199x31752c;

    /* renamed from: packageName */
    public final java.lang.String f73200x362a8ff1;

    /* renamed from: resourcesVersion */
    public final java.lang.String f73201xb3bab2f3;

    /* renamed from: versionCode */
    public final long f73202x290b12e5;

    /* renamed from: versionName */
    public final java.lang.String f73203x290fdf83;

    /* renamed from: vulkanDeqpLevel */
    public final int f73204x595f1c19;

    /* renamed from: org.chromium.base.BuildInfo$Holder */
    /* loaded from: classes13.dex */
    public static class Holder {

        /* renamed from: INSTANCE */
        private static final org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c f73205x4fbc8495 = new org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c();

        private Holder() {
        }
    }

    /* renamed from: getAll */
    private static java.lang.String[] m152230xb5882a6b() {
        return m152232x9cf0d20b().m152231x6c11c9fe();
    }

    /* renamed from: getAllProperties */
    private java.lang.String[] m152231x6c11c9fe() {
        java.lang.String[] strArr = new java.lang.String[31];
        strArr[0] = android.os.Build.BRAND;
        strArr[1] = android.os.Build.DEVICE;
        strArr[2] = android.os.Build.ID;
        strArr[3] = android.os.Build.MANUFACTURER;
        strArr[4] = android.os.Build.MODEL;
        int i17 = android.os.Build.VERSION.SDK_INT;
        strArr[5] = java.lang.String.valueOf(i17);
        strArr[6] = android.os.Build.TYPE;
        strArr[7] = android.os.Build.BOARD;
        strArr[8] = this.f73195xab3ca929;
        strArr[9] = java.lang.String.valueOf(this.f73196x9e1d2c1d);
        strArr[10] = this.f73194xbc3c2416;
        strArr[11] = this.f73200x362a8ff1;
        strArr[12] = java.lang.String.valueOf(this.f73202x290b12e5);
        strArr[13] = this.f73203x290fdf83;
        strArr[14] = this.f73191xda0fd625;
        strArr[15] = this.f73193x6f47e858;
        strArr[16] = this.f73197x5e07b49;
        strArr[17] = this.f73190x38c9d699;
        strArr[18] = this.f73192x1822a29b;
        strArr[19] = this.f73201xb3bab2f3;
        strArr[20] = java.lang.String.valueOf(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo().targetSdkVersion);
        strArr[21] = m152234xd51bf6e6() ? "1" : "0";
        strArr[22] = this.f73199x31752c ? "1" : "0";
        strArr[23] = android.os.Build.VERSION.INCREMENTAL;
        strArr[24] = android.os.Build.HARDWARE;
        strArr[25] = m152233xacc9ec68() ? "1" : "0";
        strArr[26] = this.f73198x96b45bbf ? "1" : "0";
        strArr[27] = i17 >= 34 ? "1" : "0";
        strArr[28] = m152241x85744841() ? "1" : "0";
        strArr[29] = android.os.Build.VERSION.CODENAME;
        strArr[30] = java.lang.String.valueOf(this.f73204x595f1c19);
        return strArr;
    }

    /* renamed from: getInstance */
    public static org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c m152232x9cf0d20b() {
        return org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73672xfa59bddd ? new org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c() : org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c.Holder.f73205x4fbc8495;
    }

    @java.lang.Deprecated
    /* renamed from: isAtLeastT */
    public static boolean m152233xacc9ec68() {
        int i17 = j3.b.f378865a;
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 33) {
            if (i18 >= 32) {
                java.lang.String CODENAME = android.os.Build.VERSION.CODENAME;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CODENAME, "CODENAME");
                if (j3.b.a("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: isDebugAndroid */
    public static boolean m152234xd51bf6e6() {
        java.lang.String str = android.os.Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    /* renamed from: isDebugAndroidOrApp */
    public static boolean m152235x78f67df8() {
        return m152234xd51bf6e6() || m152236xf15e0e18();
    }

    /* renamed from: isDebugApp */
    public static boolean m152236xf15e0e18() {
        return (org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: nullToEmpty */
    private static java.lang.String m152237x1ca8380b(java.lang.CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* renamed from: packageVersionCode */
    public static long m152238x7b9a3ebf(android.content.pm.PackageInfo packageInfo) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152836xdd582093(packageInfo) : packageInfo.versionCode;
    }

    /* renamed from: setBrowserPackageInfo */
    public static void m152239x43d1ce(android.content.pm.PackageInfo packageInfo) {
        f73188x2709939f = packageInfo;
    }

    @java.lang.Deprecated
    /* renamed from: targetsAtLeastT */
    public static boolean m152240x85744840() {
        return org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo().targetSdkVersion >= 33;
    }

    /* renamed from: targetsAtLeastU */
    public static boolean m152241x85744841() {
        return org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getApplicationInfo().targetSdkVersion >= 34;
    }

    /* renamed from: getBrowserApplicationInfo */
    public android.content.pm.ApplicationInfo m152242x9c3504cc() {
        return f73187xb5f71229;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C29285x23ebd81c() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c.<init>():void");
    }
}

package io.p3277xa1c40a32.p3282x38e8d6d7;

/* renamed from: io.clipworks.corekit.HarmonyOSChecker */
/* loaded from: classes4.dex */
public final class C28523x6550670b {

    /* renamed from: HARMONY_OS */
    private static final java.lang.String f70373x14ac17dd = "harmony";
    private static final java.lang.String TAG = "HarmonyOSChecker";

    /* renamed from: isInitialized */
    private static boolean f70374xf582434a = false;

    /* renamed from: osBrand */
    private static java.lang.String f70375xb7e85c03 = "";

    /* renamed from: osVersion */
    private static java.lang.String f70376x6c00fe54 = "";

    /* renamed from: getMajorVer */
    public static synchronized int m136895x7d29d0a0() {
        synchronized (io.p3277xa1c40a32.p3282x38e8d6d7.C28523x6550670b.class) {
            if (!m136899xf582434a()) {
                throw new java.lang.IllegalStateException("Checker not inited");
            }
            if (android.text.TextUtils.isEmpty(f70376x6c00fe54)) {
                return -1;
            }
            java.lang.String[] split = f70376x6c00fe54.split("\\.");
            if (split.length <= 0) {
                return -1;
            }
            return java.lang.Integer.parseInt(split[0]);
        }
    }

    /* renamed from: getOsVersion */
    public static synchronized java.lang.String m136896x6b6e6f9e() {
        java.lang.String str;
        synchronized (io.p3277xa1c40a32.p3282x38e8d6d7.C28523x6550670b.class) {
            if (!m136899xf582434a()) {
                throw new java.lang.IllegalStateException("Checker not inited");
            }
            str = f70376x6c00fe54;
        }
        return str;
    }

    /* renamed from: init */
    public static synchronized void m136897x316510() {
        synchronized (io.p3277xa1c40a32.p3282x38e8d6d7.C28523x6550670b.class) {
            if (!f70374xf582434a) {
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("com.huawei.system.BuildEx");
                    f70375xb7e85c03 = (java.lang.String) cls.getMethod("getOsBrand", new java.lang.Class[0]).invoke(cls, new java.lang.Object[0]);
                    java.lang.Class<?> cls2 = java.lang.Class.forName("ohos.system.version.SystemVersion");
                    f70376x6c00fe54 = (java.lang.String) cls2.getMethod("getVersion", new java.lang.Class[0]).invoke(cls2, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
                f70374xf582434a = true;
            }
        }
    }

    /* renamed from: isHarmonyOS */
    public static synchronized boolean m136898x2d32fb60() {
        boolean equals;
        synchronized (io.p3277xa1c40a32.p3282x38e8d6d7.C28523x6550670b.class) {
            if (!m136899xf582434a()) {
                throw new java.lang.IllegalStateException("Checker not inited");
            }
            equals = f70373x14ac17dd.equals(f70375xb7e85c03);
        }
        return equals;
    }

    /* renamed from: isInitialized */
    public static synchronized boolean m136899xf582434a() {
        boolean z17;
        synchronized (io.p3277xa1c40a32.p3282x38e8d6d7.C28523x6550670b.class) {
            z17 = f70374xf582434a;
        }
        return z17;
    }
}

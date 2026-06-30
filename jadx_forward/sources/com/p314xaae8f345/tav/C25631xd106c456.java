package com.p314xaae8f345.tav;

/* renamed from: com.tencent.tav.ResourceLoadUtil */
/* loaded from: classes14.dex */
public class C25631xd106c456 {
    public static final java.lang.String TAG = "ResourceLoadUtil";

    /* renamed from: success */
    private static boolean f47044x90b54003;

    /* renamed from: isLoaded */
    public static boolean m96104xe6c221cf() {
        return f47044x90b54003;
    }

    /* renamed from: loadSoSync */
    public static boolean m96105xf2cefb9d(java.lang.String str) {
        boolean z17 = f47044x90b54003;
        if (z17) {
            return z17;
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                f47044x90b54003 = false;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "load so path is empty.");
                return f47044x90b54003;
            }
            try {
                try {
                    com.p314xaae8f345.cso.C2941xefde02d2.g(str);
                    f47044x90b54003 = true;
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "load " + str + ": " + f47044x90b54003);
                    return f47044x90b54003;
                } catch (java.lang.UnsatisfiedLinkError e17) {
                    f47044x90b54003 = false;
                    java.lang.String str2 = TAG;
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str2, "loadSoSync: load soPath = " + str, e17);
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str2, "load " + str + ": " + f47044x90b54003);
                    return f47044x90b54003;
                }
            } catch (java.lang.RuntimeException e18) {
                f47044x90b54003 = false;
                java.lang.String str3 = TAG;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str3, "loadSoSync: load soPath = " + str, e18);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str3, "load " + str + ": " + f47044x90b54003);
                return f47044x90b54003;
            } catch (java.lang.Exception e19) {
                f47044x90b54003 = false;
                java.lang.String str4 = TAG;
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str4, "loadSoSync: load soPath = " + str, e19);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str4, "load " + str + ": " + f47044x90b54003);
                return f47044x90b54003;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "load " + str + ": " + f47044x90b54003);
            return f47044x90b54003;
        }
    }

    /* renamed from: setLoaded */
    public static void m96106x16e18707(boolean z17) {
        f47044x90b54003 = z17;
    }
}

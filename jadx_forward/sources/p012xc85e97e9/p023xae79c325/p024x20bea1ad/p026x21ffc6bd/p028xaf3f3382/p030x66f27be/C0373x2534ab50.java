package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk */
/* loaded from: classes13.dex */
public class C0373x2534ab50 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {
    private static final java.lang.String TAG = "ExcludedSupportedSizesQuirk";

    /* renamed from: UNKNOWN_IMAGE_FORMAT */
    private static final int f702x7412b570 = -1;

    /* renamed from: getHuaweiP20LiteExcludedSizes */
    private java.util.List<android.util.Size> m3940xe28f5a49(java.lang.String str, int i17, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && (i17 == 34 || i17 == 35 || cls != null)) {
            arrayList.add(new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf));
            arrayList.add(new android.util.Size(400, 400));
        }
        return arrayList;
    }

    /* renamed from: getOnePlus6ExcludedSizes */
    private java.util.List<android.util.Size> m3941x2a817fbc(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && i17 == 256) {
            arrayList.add(new android.util.Size(4160, com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21567x85be6914));
            arrayList.add(new android.util.Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: getOnePlus6TExcludedSizes */
    private java.util.List<android.util.Size> m3942x6ddba880(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && i17 == 256) {
            arrayList.add(new android.util.Size(4160, com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21567x85be6914));
            arrayList.add(new android.util.Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: getRedmiNote9ProExcludedSizes */
    private java.util.List<android.util.Size> m3943x65e45feb(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && i17 == 256) {
            arrayList.add(new android.util.Size(9280, 6944));
        }
        return arrayList;
    }

    /* renamed from: getSamsungJ7Api27AboveExcludedSizes */
    private java.util.List<android.util.Size> m3944x1057cd59(java.lang.String str, int i17, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0")) {
            if (i17 == 34 || cls != null) {
                arrayList.add(new android.util.Size(4128, 3096));
                arrayList.add(new android.util.Size(4128, 2322));
                arrayList.add(new android.util.Size(3088, 3088));
                arrayList.add(new android.util.Size(3264, 2448));
                arrayList.add(new android.util.Size(3264, 1836));
                arrayList.add(new android.util.Size(2048, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de));
                arrayList.add(new android.util.Size(2048, dc1.e.f65819x366c91de));
                arrayList.add(new android.util.Size(1920, 1080));
            } else if (i17 == 35) {
                arrayList.add(new android.util.Size(2048, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de));
                arrayList.add(new android.util.Size(2048, dc1.e.f65819x366c91de));
                arrayList.add(new android.util.Size(1920, 1080));
            }
        } else if (str.equals("1") && (i17 == 34 || i17 == 35 || cls != null)) {
            arrayList.add(new android.util.Size(2576, 1932));
            arrayList.add(new android.util.Size(2560, 1440));
            arrayList.add(new android.util.Size(1920, 1920));
            arrayList.add(new android.util.Size(2048, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de));
            arrayList.add(new android.util.Size(2048, dc1.e.f65819x366c91de));
            arrayList.add(new android.util.Size(1920, 1080));
        }
        return arrayList;
    }

    /* renamed from: getSamsungJ7PrimeApi27AboveExcludedSizes */
    private java.util.List<android.util.Size> m3945xb814939c(java.lang.String str, int i17, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0")) {
            if (i17 == 34 || cls != null) {
                arrayList.add(new android.util.Size(4128, 3096));
                arrayList.add(new android.util.Size(4128, 2322));
                arrayList.add(new android.util.Size(3088, 3088));
                arrayList.add(new android.util.Size(3264, 2448));
                arrayList.add(new android.util.Size(3264, 1836));
                arrayList.add(new android.util.Size(2048, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de));
                arrayList.add(new android.util.Size(2048, dc1.e.f65819x366c91de));
                arrayList.add(new android.util.Size(1920, 1080));
            } else if (i17 == 35) {
                arrayList.add(new android.util.Size(4128, 2322));
                arrayList.add(new android.util.Size(3088, 3088));
                arrayList.add(new android.util.Size(3264, 2448));
                arrayList.add(new android.util.Size(3264, 1836));
                arrayList.add(new android.util.Size(2048, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de));
                arrayList.add(new android.util.Size(2048, dc1.e.f65819x366c91de));
                arrayList.add(new android.util.Size(1920, 1080));
            }
        } else if (str.equals("1") && (i17 == 34 || i17 == 35 || cls != null)) {
            arrayList.add(new android.util.Size(3264, 2448));
            arrayList.add(new android.util.Size(3264, 1836));
            arrayList.add(new android.util.Size(2448, 2448));
            arrayList.add(new android.util.Size(1920, 1920));
            arrayList.add(new android.util.Size(2048, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de));
            arrayList.add(new android.util.Size(2048, dc1.e.f65819x366c91de));
            arrayList.add(new android.util.Size(1920, 1080));
        }
        return arrayList;
    }

    /* renamed from: isHuaweiP20Lite */
    private static boolean m3946xddde738b() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "HWANE".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    /* renamed from: isOnePlus6 */
    private static boolean m3947x473b3e60() {
        return "OnePlus".equalsIgnoreCase(android.os.Build.BRAND) && "OnePlus6".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    /* renamed from: isOnePlus6T */
    private static boolean m3948xa02c8df4() {
        return "OnePlus".equalsIgnoreCase(android.os.Build.BRAND) && "OnePlus6T".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    /* renamed from: isRedmiNote9Pro */
    private static boolean m3949x1f66eea9() {
        return "REDMI".equalsIgnoreCase(android.os.Build.BRAND) && "joyeuse".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    /* renamed from: isSamsungJ7Api27Above */
    private static boolean m3950x911c957b() {
        return "SAMSUNG".equalsIgnoreCase(android.os.Build.BRAND) && "J7XELTE".equalsIgnoreCase(android.os.Build.DEVICE) && android.os.Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: isSamsungJ7PrimeApi27Above */
    private static boolean m3951xb78f3680() {
        return "SAMSUNG".equalsIgnoreCase(android.os.Build.BRAND) && "ON7XELTE".equalsIgnoreCase(android.os.Build.DEVICE) && android.os.Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: load */
    public static boolean m3952x32c4e6() {
        return m3947x473b3e60() || m3948xa02c8df4() || m3946xddde738b() || m3951xb78f3680() || m3950x911c957b() || m3949x1f66eea9();
    }

    /* renamed from: getExcludedSizes */
    public java.util.List<android.util.Size> m3953xfb3d1d32(java.lang.String str, int i17) {
        if (m3947x473b3e60()) {
            return m3941x2a817fbc(str, i17);
        }
        if (m3948xa02c8df4()) {
            return m3942x6ddba880(str, i17);
        }
        if (m3946xddde738b()) {
            return m3940xe28f5a49(str, i17, null);
        }
        if (m3951xb78f3680()) {
            return m3945xb814939c(str, i17, null);
        }
        if (m3950x911c957b()) {
            return m3944x1057cd59(str, i17, null);
        }
        if (m3949x1f66eea9()) {
            return m3943x65e45feb(str, i17);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return java.util.Collections.emptyList();
    }

    /* renamed from: getExcludedSizes */
    public java.util.List<android.util.Size> m3954xfb3d1d32(java.lang.String str, java.lang.Class<?> cls) {
        if (m3946xddde738b()) {
            return m3940xe28f5a49(str, -1, cls);
        }
        if (m3951xb78f3680()) {
            return m3945xb814939c(str, -1, cls);
        }
        if (m3950x911c957b()) {
            return m3944x1057cd59(str, -1, cls);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return java.util.Collections.emptyList();
    }
}

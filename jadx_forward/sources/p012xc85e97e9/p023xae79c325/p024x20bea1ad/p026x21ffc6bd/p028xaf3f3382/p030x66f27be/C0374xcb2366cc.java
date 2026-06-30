package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk */
/* loaded from: classes13.dex */
public class C0374xcb2366cc implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP */
    private static final java.util.Map<java.lang.String, android.util.Range<java.lang.Integer>> f703xb82f5930;

    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType */
        static final /* synthetic */ int[] f704xdfd6b8d4;

        static {
            int[] iArr = new int[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.m5693xcee59d22().length];
            f704xdfd6b8d4 = iArr;
            try {
                iArr[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f704xdfd6b8d4[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f704xdfd6b8d4[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f703xb82f5930 = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new android.util.Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new android.util.Range(21, 26));
    }

    /* renamed from: isSamsungDistortion */
    private static boolean m3956x52ffc82d() {
        if (!("samsung".equalsIgnoreCase(android.os.Build.BRAND) && f703xb82f5930.containsKey(android.os.Build.MODEL.toUpperCase(java.util.Locale.US)))) {
            return false;
        }
        android.util.Range<java.lang.Integer> range = f703xb82f5930.get(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
    }

    /* renamed from: load */
    public static boolean m3957x32c4e6() {
        return m3956x52ffc82d();
    }

    /* renamed from: getVerifiedResolution */
    public android.util.Size m3958xeb8dfb8a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType) {
        if (!m3956x52ffc82d()) {
            return null;
        }
        int i17 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be.C0374xcb2366cc.AnonymousClass1.f704xdfd6b8d4[configType.ordinal()];
        if (i17 == 1) {
            return new android.util.Size(1920, 1080);
        }
        if (i17 == 2) {
            return new android.util.Size(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf);
        }
        if (i17 != 3) {
            return null;
        }
        return new android.util.Size(3264, 1836);
    }
}

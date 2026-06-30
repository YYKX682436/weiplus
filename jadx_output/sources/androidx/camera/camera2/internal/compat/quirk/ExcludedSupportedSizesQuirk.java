package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ExcludedSupportedSizesQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String TAG = "ExcludedSupportedSizesQuirk";
    private static final int UNKNOWN_IMAGE_FORMAT = -1;

    private java.util.List<android.util.Size> getHuaweiP20LiteExcludedSizes(java.lang.String str, int i17, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && (i17 == 34 || i17 == 35 || cls != null)) {
            arrayList.add(new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH));
            arrayList.add(new android.util.Size(400, 400));
        }
        return arrayList;
    }

    private java.util.List<android.util.Size> getOnePlus6ExcludedSizes(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && i17 == 256) {
            arrayList.add(new android.util.Size(4160, com.tencent.mm.boot.BuildConfig.VERSION_CODE));
            arrayList.add(new android.util.Size(4000, 3000));
        }
        return arrayList;
    }

    private java.util.List<android.util.Size> getOnePlus6TExcludedSizes(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && i17 == 256) {
            arrayList.add(new android.util.Size(4160, com.tencent.mm.boot.BuildConfig.VERSION_CODE));
            arrayList.add(new android.util.Size(4000, 3000));
        }
        return arrayList;
    }

    private java.util.List<android.util.Size> getRedmiNote9ProExcludedSizes(java.lang.String str, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0") && i17 == 256) {
            arrayList.add(new android.util.Size(9280, 6944));
        }
        return arrayList;
    }

    private java.util.List<android.util.Size> getSamsungJ7Api27AboveExcludedSizes(java.lang.String str, int i17, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0")) {
            if (i17 == 34 || cls != null) {
                arrayList.add(new android.util.Size(4128, 3096));
                arrayList.add(new android.util.Size(4128, 2322));
                arrayList.add(new android.util.Size(3088, 3088));
                arrayList.add(new android.util.Size(3264, 2448));
                arrayList.add(new android.util.Size(3264, 1836));
                arrayList.add(new android.util.Size(2048, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX));
                arrayList.add(new android.util.Size(2048, dc1.e.CTRL_INDEX));
                arrayList.add(new android.util.Size(1920, 1080));
            } else if (i17 == 35) {
                arrayList.add(new android.util.Size(2048, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX));
                arrayList.add(new android.util.Size(2048, dc1.e.CTRL_INDEX));
                arrayList.add(new android.util.Size(1920, 1080));
            }
        } else if (str.equals("1") && (i17 == 34 || i17 == 35 || cls != null)) {
            arrayList.add(new android.util.Size(2576, 1932));
            arrayList.add(new android.util.Size(2560, 1440));
            arrayList.add(new android.util.Size(1920, 1920));
            arrayList.add(new android.util.Size(2048, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX));
            arrayList.add(new android.util.Size(2048, dc1.e.CTRL_INDEX));
            arrayList.add(new android.util.Size(1920, 1080));
        }
        return arrayList;
    }

    private java.util.List<android.util.Size> getSamsungJ7PrimeApi27AboveExcludedSizes(java.lang.String str, int i17, java.lang.Class<?> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("0")) {
            if (i17 == 34 || cls != null) {
                arrayList.add(new android.util.Size(4128, 3096));
                arrayList.add(new android.util.Size(4128, 2322));
                arrayList.add(new android.util.Size(3088, 3088));
                arrayList.add(new android.util.Size(3264, 2448));
                arrayList.add(new android.util.Size(3264, 1836));
                arrayList.add(new android.util.Size(2048, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX));
                arrayList.add(new android.util.Size(2048, dc1.e.CTRL_INDEX));
                arrayList.add(new android.util.Size(1920, 1080));
            } else if (i17 == 35) {
                arrayList.add(new android.util.Size(4128, 2322));
                arrayList.add(new android.util.Size(3088, 3088));
                arrayList.add(new android.util.Size(3264, 2448));
                arrayList.add(new android.util.Size(3264, 1836));
                arrayList.add(new android.util.Size(2048, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX));
                arrayList.add(new android.util.Size(2048, dc1.e.CTRL_INDEX));
                arrayList.add(new android.util.Size(1920, 1080));
            }
        } else if (str.equals("1") && (i17 == 34 || i17 == 35 || cls != null)) {
            arrayList.add(new android.util.Size(3264, 2448));
            arrayList.add(new android.util.Size(3264, 1836));
            arrayList.add(new android.util.Size(2448, 2448));
            arrayList.add(new android.util.Size(1920, 1920));
            arrayList.add(new android.util.Size(2048, com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX));
            arrayList.add(new android.util.Size(2048, dc1.e.CTRL_INDEX));
            arrayList.add(new android.util.Size(1920, 1080));
        }
        return arrayList;
    }

    private static boolean isHuaweiP20Lite() {
        return "HUAWEI".equalsIgnoreCase(android.os.Build.BRAND) && "HWANE".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    private static boolean isOnePlus6() {
        return "OnePlus".equalsIgnoreCase(android.os.Build.BRAND) && "OnePlus6".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    private static boolean isOnePlus6T() {
        return "OnePlus".equalsIgnoreCase(android.os.Build.BRAND) && "OnePlus6T".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    private static boolean isRedmiNote9Pro() {
        return "REDMI".equalsIgnoreCase(android.os.Build.BRAND) && "joyeuse".equalsIgnoreCase(android.os.Build.DEVICE);
    }

    private static boolean isSamsungJ7Api27Above() {
        return "SAMSUNG".equalsIgnoreCase(android.os.Build.BRAND) && "J7XELTE".equalsIgnoreCase(android.os.Build.DEVICE) && android.os.Build.VERSION.SDK_INT >= 27;
    }

    private static boolean isSamsungJ7PrimeApi27Above() {
        return "SAMSUNG".equalsIgnoreCase(android.os.Build.BRAND) && "ON7XELTE".equalsIgnoreCase(android.os.Build.DEVICE) && android.os.Build.VERSION.SDK_INT >= 27;
    }

    public static boolean load() {
        return isOnePlus6() || isOnePlus6T() || isHuaweiP20Lite() || isSamsungJ7PrimeApi27Above() || isSamsungJ7Api27Above() || isRedmiNote9Pro();
    }

    public java.util.List<android.util.Size> getExcludedSizes(java.lang.String str, int i17) {
        if (isOnePlus6()) {
            return getOnePlus6ExcludedSizes(str, i17);
        }
        if (isOnePlus6T()) {
            return getOnePlus6TExcludedSizes(str, i17);
        }
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, i17, null);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, i17, null);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, i17, null);
        }
        if (isRedmiNote9Pro()) {
            return getRedmiNote9ProExcludedSizes(str, i17);
        }
        androidx.camera.core.Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return java.util.Collections.emptyList();
    }

    public java.util.List<android.util.Size> getExcludedSizes(java.lang.String str, java.lang.Class<?> cls) {
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, -1, cls);
        }
        androidx.camera.core.Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return java.util.Collections.emptyList();
    }
}

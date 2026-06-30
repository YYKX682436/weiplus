package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk, androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk {
    public static boolean isBluStudioX10() {
        return "blu".equalsIgnoreCase(android.os.Build.BRAND) && "studio x10".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean isItelW6004() {
        return "itel".equalsIgnoreCase(android.os.Build.BRAND) && "itel w6004".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean isMotoE13() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto e13".equalsIgnoreCase(android.os.Build.MODEL);
    }

    private static boolean isPixel4XLApi29() {
        return "pixel 4 xl".equalsIgnoreCase(android.os.Build.MODEL) && android.os.Build.VERSION.SDK_INT == 29;
    }

    public static boolean isPositivoTwist2Pro() {
        return "positivo".equalsIgnoreCase(android.os.Build.BRAND) && "twist 2 pro".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean isSamsungTabA8() {
        if ("samsung".equalsIgnoreCase(android.os.Build.BRAND)) {
            java.lang.String str = android.os.Build.DEVICE;
            if ("gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVivo1805() {
        return "vivo".equalsIgnoreCase(android.os.Build.BRAND) && "vivo 1805".equalsIgnoreCase(android.os.Build.MODEL);
    }

    public static boolean load() {
        return isBluStudioX10() || isItelW6004() || isVivo1805() || isPositivoTwist2Pro() || isPixel4XLApi29() || isMotoE13() || isSamsungTabA8();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        return isBluStudioX10() || isItelW6004() || isVivo1805() || isPositivoTwist2Pro();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public boolean workaroundBySurfaceProcessing() {
        return isBluStudioX10() || isItelW6004() || isVivo1805() || isPositivoTwist2Pro() || isPixel4XLApi29() || isMotoE13() || isSamsungTabA8();
    }
}

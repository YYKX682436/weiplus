package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class StillCaptureFlashStopRepeatingQuirk implements androidx.camera.core.impl.Quirk {
    public static boolean load() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.util.Locale locale = java.util.Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && android.os.Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}

package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class CaptureSessionShouldUseMrirQuirk implements androidx.camera.core.impl.Quirk {
    public static boolean load() {
        return "google".equalsIgnoreCase(android.os.Build.BRAND) && android.os.Build.VERSION.SDK_INT >= 35;
    }
}

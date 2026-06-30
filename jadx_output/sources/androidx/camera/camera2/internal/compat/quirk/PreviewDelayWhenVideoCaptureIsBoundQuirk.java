package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class PreviewDelayWhenVideoCaptureIsBoundQuirk implements androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk, androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk {
    public static boolean load() {
        return "Huawei".equalsIgnoreCase(android.os.Build.MANUFACTURER);
    }
}

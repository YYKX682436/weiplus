package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class TemplateParamsOverride {
    private final boolean mWorkaroundByCaptureIntentPreview;
    private final boolean mWorkaroundByCaptureIntentStillCapture;

    public TemplateParamsOverride(androidx.camera.core.impl.Quirks quirks) {
        this.mWorkaroundByCaptureIntentPreview = androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk.workaroundByCaptureIntentPreview(quirks);
        this.mWorkaroundByCaptureIntentStillCapture = quirks.contains(androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getOverrideParams(int i17) {
        if (i17 == 3 && this.mWorkaroundByCaptureIntentPreview) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return java.util.Collections.unmodifiableMap(hashMap);
        }
        if (i17 != 4 || !this.mWorkaroundByCaptureIntentStillCapture) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return java.util.Collections.unmodifiableMap(hashMap2);
    }
}

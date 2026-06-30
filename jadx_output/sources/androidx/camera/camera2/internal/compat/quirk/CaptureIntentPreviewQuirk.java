package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public interface CaptureIntentPreviewQuirk extends androidx.camera.core.impl.Quirk {
    default boolean workaroundByCaptureIntentPreview() {
        return true;
    }

    static boolean workaroundByCaptureIntentPreview(androidx.camera.core.impl.Quirks quirks) {
        java.util.Iterator it = quirks.getAll(androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                return true;
            }
        }
        return false;
    }
}

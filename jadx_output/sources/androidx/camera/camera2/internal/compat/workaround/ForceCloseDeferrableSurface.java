package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class ForceCloseDeferrableSurface {
    private final boolean mHasConfigureSurfaceToSecondarySessionFailQuirk;
    private final boolean mHasPreviewOrientationIncorrectQuirk;
    private final boolean mHasTextureViewIsClosedQuirk;

    public ForceCloseDeferrableSurface(androidx.camera.core.impl.Quirks quirks, androidx.camera.core.impl.Quirks quirks2) {
        this.mHasTextureViewIsClosedQuirk = quirks2.contains(androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.class);
        this.mHasPreviewOrientationIncorrectQuirk = quirks.contains(androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class);
        this.mHasConfigureSurfaceToSecondarySessionFailQuirk = quirks.contains(androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void onSessionEnd(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        if (!shouldForceClose() || list == null) {
            return;
        }
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        androidx.camera.core.Logger.d("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean shouldForceClose() {
        return this.mHasTextureViewIsClosedQuirk || this.mHasPreviewOrientationIncorrectQuirk || this.mHasConfigureSurfaceToSecondarySessionFailQuirk;
    }
}

package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes14.dex */
public class SurfaceSorter {
    private static final int PRIORITY_MEDIA_CODEC_SURFACE = 2;
    private static final int PRIORITY_OTHERS = 1;
    private static final int PRIORITY_PREVIEW_SURFACE = 0;
    private final boolean mHasQuirk;

    public SurfaceSorter() {
        this.mHasQuirk = androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class) != null;
    }

    private int getSurfacePriority(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        if (deferrableSurface.getContainerClass() == android.media.MediaCodec.class) {
            return 2;
        }
        return deferrableSurface.getContainerClass() == androidx.camera.core.Preview.class ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$sort$0(androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig, androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig2) {
        return getSurfacePriority(outputConfig.getSurface()) - getSurfacePriority(outputConfig2.getSurface());
    }

    public void sort(java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> list) {
        if (this.mHasQuirk) {
            java.util.Collections.sort(list, new java.util.Comparator() { // from class: androidx.camera.core.internal.compat.workaround.SurfaceSorter$$a
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int lambda$sort$0;
                    lambda$sort$0 = androidx.camera.core.internal.compat.workaround.SurfaceSorter.this.lambda$sort$0((androidx.camera.core.impl.SessionConfig.OutputConfig) obj, (androidx.camera.core.impl.SessionConfig.OutputConfig) obj2);
                    return lambda$sort$0;
                }
            });
        }
    }
}

package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class MeteringRegionCorrection {
    private final androidx.camera.core.impl.Quirks mCameraQuirks;

    public MeteringRegionCorrection(androidx.camera.core.impl.Quirks quirks) {
        this.mCameraQuirks = quirks;
    }

    public android.graphics.PointF getCorrectedPoint(androidx.camera.core.MeteringPoint meteringPoint, int i17) {
        return (i17 == 1 && this.mCameraQuirks.contains(androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class)) ? new android.graphics.PointF(1.0f - meteringPoint.getX(), meteringPoint.getY()) : new android.graphics.PointF(meteringPoint.getX(), meteringPoint.getY());
    }
}

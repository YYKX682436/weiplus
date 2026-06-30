package androidx.camera.core.processing.util;

/* loaded from: classes14.dex */
public abstract class OutConfig {
    public static androidx.camera.core.processing.util.OutConfig of(androidx.camera.core.processing.SurfaceEdge surfaceEdge) {
        return of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    public abstract android.graphics.Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract android.util.Size getSize();

    public abstract int getTargets();

    public abstract java.util.UUID getUuid();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    public static androidx.camera.core.processing.util.OutConfig of(int i17, int i18, android.graphics.Rect rect, android.util.Size size, int i19, boolean z17) {
        return of(i17, i18, rect, size, i19, z17, false);
    }

    public static androidx.camera.core.processing.util.OutConfig of(int i17, int i18, android.graphics.Rect rect, android.util.Size size, int i19, boolean z17, boolean z18) {
        return new androidx.camera.core.processing.util.AutoValue_OutConfig(java.util.UUID.randomUUID(), i17, i18, rect, size, i19, z17, z18);
    }
}

package androidx.camera.core;

/* loaded from: classes14.dex */
public class SurfaceOrientedMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    private final float mHeight;
    private final float mWidth;

    public SurfaceOrientedMeteringPointFactory(float f17, float f18) {
        this.mWidth = f17;
        this.mHeight = f18;
    }

    private static android.util.Rational getUseCaseAspectRatio(androidx.camera.core.UseCase useCase) {
        if (useCase == null) {
            return null;
        }
        android.util.Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
        if (attachedSurfaceResolution != null) {
            return new android.util.Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        throw new java.lang.IllegalStateException("UseCase " + useCase + " is not bound.");
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public android.graphics.PointF convertPoint(float f17, float f18) {
        return new android.graphics.PointF(f17 / this.mWidth, f18 / this.mHeight);
    }

    public SurfaceOrientedMeteringPointFactory(float f17, float f18, androidx.camera.core.UseCase useCase) {
        super(getUseCaseAspectRatio(useCase));
        this.mWidth = f17;
        this.mHeight = f18;
    }
}

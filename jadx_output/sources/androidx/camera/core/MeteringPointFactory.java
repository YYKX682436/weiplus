package androidx.camera.core;

/* loaded from: classes14.dex */
public abstract class MeteringPointFactory {
    private android.util.Rational mSurfaceAspectRatio;

    public MeteringPointFactory() {
        this(null);
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    public abstract android.graphics.PointF convertPoint(float f17, float f18);

    public final androidx.camera.core.MeteringPoint createPoint(float f17, float f18) {
        return createPoint(f17, f18, getDefaultPointSize());
    }

    public void setSurfaceAspectRatio(android.util.Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public MeteringPointFactory(android.util.Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public final androidx.camera.core.MeteringPoint createPoint(float f17, float f18, float f19) {
        android.graphics.PointF convertPoint = convertPoint(f17, f18);
        return new androidx.camera.core.MeteringPoint(convertPoint.x, convertPoint.y, f19, this.mSurfaceAspectRatio);
    }
}

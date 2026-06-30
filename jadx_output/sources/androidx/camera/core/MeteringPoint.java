package androidx.camera.core;

/* loaded from: classes14.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;
    private android.util.Rational mSurfaceAspectRatio;

    public MeteringPoint(float f17, float f18, float f19, android.util.Rational rational) {
        this.mNormalizedX = f17;
        this.mNormalizedY = f18;
        this.mSize = f19;
        this.mSurfaceAspectRatio = rational;
    }

    public float getSize() {
        return this.mSize;
    }

    public android.util.Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }

    public float getX() {
        return this.mNormalizedX;
    }

    public float getY() {
        return this.mNormalizedY;
    }
}

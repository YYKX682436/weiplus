package androidx.camera.core;

/* loaded from: classes14.dex */
public final class ViewPort {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;
    private android.util.Rational mAspectRatio;
    private int mLayoutDirection;
    private int mRotation;
    private int mScaleType;

    /* loaded from: classes14.dex */
    public static final class Builder {
        private static final int DEFAULT_LAYOUT_DIRECTION = 0;
        private static final int DEFAULT_SCALE_TYPE = 1;
        private final android.util.Rational mAspectRatio;
        private final int mRotation;
        private int mScaleType = 1;
        private int mLayoutDirection = 0;

        public Builder(android.util.Rational rational, int i17) {
            this.mAspectRatio = rational;
            this.mRotation = i17;
        }

        public androidx.camera.core.ViewPort build() {
            m3.h.d(this.mAspectRatio, "The crop aspect ratio must be set.");
            return new androidx.camera.core.ViewPort(this.mScaleType, this.mAspectRatio, this.mRotation, this.mLayoutDirection);
        }

        public androidx.camera.core.ViewPort.Builder setLayoutDirection(int i17) {
            this.mLayoutDirection = i17;
            return this;
        }

        public androidx.camera.core.ViewPort.Builder setScaleType(int i17) {
            this.mScaleType = i17;
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface LayoutDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ScaleType {
    }

    public ViewPort(int i17, android.util.Rational rational, int i18, int i19) {
        this.mScaleType = i17;
        this.mAspectRatio = rational;
        this.mRotation = i18;
        this.mLayoutDirection = i19;
    }

    public android.util.Rational getAspectRatio() {
        return this.mAspectRatio;
    }

    public int getLayoutDirection() {
        return this.mLayoutDirection;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getScaleType() {
        return this.mScaleType;
    }
}

package androidx.camera.core;

/* loaded from: classes14.dex */
public class LayoutSettings {
    public static final androidx.camera.core.LayoutSettings DEFAULT = new androidx.camera.core.LayoutSettings.Builder().setAlpha(1.0f).setOffsetX(0.0f).setOffsetY(0.0f).setWidth(1.0f).setHeight(1.0f).build();
    private final float mAlpha;
    private final float mHeight;
    private final float mOffsetX;
    private final float mOffsetY;
    private final float mWidth;

    /* loaded from: classes14.dex */
    public static final class Builder {
        private float mAlpha = 1.0f;
        private float mOffsetX = 0.0f;
        private float mOffsetY = 0.0f;
        private float mWidth = 0.0f;
        private float mHeight = 0.0f;

        public androidx.camera.core.LayoutSettings build() {
            return new androidx.camera.core.LayoutSettings(this.mAlpha, this.mOffsetX, this.mOffsetY, this.mWidth, this.mHeight);
        }

        public androidx.camera.core.LayoutSettings.Builder setAlpha(float f17) {
            this.mAlpha = f17;
            return this;
        }

        public androidx.camera.core.LayoutSettings.Builder setHeight(float f17) {
            this.mHeight = f17;
            return this;
        }

        public androidx.camera.core.LayoutSettings.Builder setOffsetX(float f17) {
            this.mOffsetX = f17;
            return this;
        }

        public androidx.camera.core.LayoutSettings.Builder setOffsetY(float f17) {
            this.mOffsetY = f17;
            return this;
        }

        public androidx.camera.core.LayoutSettings.Builder setWidth(float f17) {
            this.mWidth = f17;
            return this;
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getOffsetX() {
        return this.mOffsetX;
    }

    public float getOffsetY() {
        return this.mOffsetY;
    }

    public float getWidth() {
        return this.mWidth;
    }

    private LayoutSettings(float f17, float f18, float f19, float f27, float f28) {
        this.mAlpha = f17;
        this.mOffsetX = f18;
        this.mOffsetY = f19;
        this.mWidth = f27;
        this.mHeight = f28;
    }
}

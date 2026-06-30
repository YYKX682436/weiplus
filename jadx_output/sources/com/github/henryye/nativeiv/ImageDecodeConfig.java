package com.github.henryye.nativeiv;

/* loaded from: classes7.dex */
public class ImageDecodeConfig {
    public android.graphics.Bitmap.Config mConfig = android.graphics.Bitmap.Config.ARGB_8888;
    public boolean mPremultiplyAlpha = true;
    public com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy mReferrerPolicy = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NOT_SET;
    public int mPreferredWidth = 0;
    public int mPreferredHeight = 0;
    public double mPreferredScale = 0.0d;

    /* loaded from: classes7.dex */
    public enum ReferrerPolicy {
        NOT_SET,
        NO_REFERRER,
        ORIGIN
    }

    public static com.github.henryye.nativeiv.ImageDecodeConfig createConfig(android.graphics.Bitmap.Config config, boolean z17) {
        com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig = new com.github.henryye.nativeiv.ImageDecodeConfig();
        imageDecodeConfig.mPremultiplyAlpha = z17;
        imageDecodeConfig.mConfig = config;
        return imageDecodeConfig;
    }

    public int getNativeConfig() {
        int i17 = com.github.henryye.nativeiv.a.f44070a[this.mConfig.ordinal()];
        if (i17 == 2) {
            return 4;
        }
        if (i17 != 3) {
            return i17 != 4 ? 1 : 8;
        }
        return 7;
    }

    public int getNativeReferrerPolicy() {
        int i17 = com.github.henryye.nativeiv.a.f44071b[this.mReferrerPolicy.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return i18;
    }

    public java.lang.String toString() {
        return "ImageDecodeConfig{mConfig=" + this.mConfig + ", mPremultiplyAlpha=" + this.mPremultiplyAlpha + ", mReferrerPolicy=" + this.mReferrerPolicy + ", mPreferredWidth=" + this.mPreferredWidth + ", mPreferredHeight=" + this.mPreferredHeight + ", mPreferredScale=" + this.mPreferredScale + '}';
    }

    public static java.lang.Object createConfig(int i17, boolean z17, int i18, int i19, int i27, double d17) {
        com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig = new com.github.henryye.nativeiv.ImageDecodeConfig();
        imageDecodeConfig.mPremultiplyAlpha = z17;
        if (i17 == 8) {
            imageDecodeConfig.mConfig = android.graphics.Bitmap.Config.ALPHA_8;
        } else if (i17 == 4) {
            imageDecodeConfig.mConfig = android.graphics.Bitmap.Config.RGB_565;
        } else if (i17 == 7) {
            imageDecodeConfig.mConfig = android.graphics.Bitmap.Config.ARGB_4444;
        } else if (i17 == 1) {
            imageDecodeConfig.mConfig = android.graphics.Bitmap.Config.ARGB_8888;
        } else {
            imageDecodeConfig.mConfig = android.graphics.Bitmap.Config.ARGB_8888;
        }
        if (i18 == 0) {
            imageDecodeConfig.mReferrerPolicy = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NOT_SET;
        } else if (i18 == 1) {
            imageDecodeConfig.mReferrerPolicy = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NO_REFERRER;
        } else if (i18 == 2) {
            imageDecodeConfig.mReferrerPolicy = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.ORIGIN;
        }
        imageDecodeConfig.mPreferredWidth = i19;
        imageDecodeConfig.mPreferredHeight = i27;
        imageDecodeConfig.mPreferredScale = d17;
        return imageDecodeConfig;
    }
}

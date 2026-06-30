package androidx.camera.core;

/* loaded from: classes14.dex */
public final class DynamicRange {
    public static final int BIT_DEPTH_10_BIT = 10;
    public static final int BIT_DEPTH_8_BIT = 8;
    public static final int BIT_DEPTH_UNSPECIFIED = 0;
    public static final int ENCODING_DOLBY_VISION = 6;
    public static final int ENCODING_HDR10 = 4;
    public static final int ENCODING_HDR10_PLUS = 5;
    public static final int ENCODING_HDR_UNSPECIFIED = 2;
    public static final int ENCODING_HLG = 3;
    public static final int ENCODING_SDR = 1;
    public static final int ENCODING_UNSPECIFIED = 0;
    private final int mBitDepth;
    private final int mEncoding;
    public static final androidx.camera.core.DynamicRange UNSPECIFIED = new androidx.camera.core.DynamicRange(0, 0);
    public static final androidx.camera.core.DynamicRange SDR = new androidx.camera.core.DynamicRange(1, 8);
    public static final androidx.camera.core.DynamicRange HDR_UNSPECIFIED_10_BIT = new androidx.camera.core.DynamicRange(2, 10);
    public static final androidx.camera.core.DynamicRange HLG_10_BIT = new androidx.camera.core.DynamicRange(3, 10);
    public static final androidx.camera.core.DynamicRange HDR10_10_BIT = new androidx.camera.core.DynamicRange(4, 10);
    public static final androidx.camera.core.DynamicRange HDR10_PLUS_10_BIT = new androidx.camera.core.DynamicRange(5, 10);
    public static final androidx.camera.core.DynamicRange DOLBY_VISION_10_BIT = new androidx.camera.core.DynamicRange(6, 10);
    public static final androidx.camera.core.DynamicRange DOLBY_VISION_8_BIT = new androidx.camera.core.DynamicRange(6, 8);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface BitDepth {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface DynamicRangeEncoding {
    }

    public DynamicRange(int i17, int i18) {
        this.mEncoding = i17;
        this.mBitDepth = i18;
    }

    private static java.lang.String getEncodingLabel(int i17) {
        switch (i17) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.DynamicRange)) {
            return false;
        }
        androidx.camera.core.DynamicRange dynamicRange = (androidx.camera.core.DynamicRange) obj;
        return this.mEncoding == dynamicRange.getEncoding() && this.mBitDepth == dynamicRange.getBitDepth();
    }

    public int getBitDepth() {
        return this.mBitDepth;
    }

    public int getEncoding() {
        return this.mEncoding;
    }

    public int hashCode() {
        return ((this.mEncoding ^ 1000003) * 1000003) ^ this.mBitDepth;
    }

    public boolean is10BitHdr() {
        return isFullySpecified() && getEncoding() != 1 && getBitDepth() == 10;
    }

    public boolean isFullySpecified() {
        return (getEncoding() == 0 || getEncoding() == 2 || getBitDepth() == 0) ? false : true;
    }

    public java.lang.String toString() {
        return "DynamicRange@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "{encoding=" + getEncodingLabel(this.mEncoding) + ", bitDepth=" + this.mBitDepth + "}";
    }
}

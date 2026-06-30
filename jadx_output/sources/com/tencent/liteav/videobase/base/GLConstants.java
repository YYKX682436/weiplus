package com.tencent.liteav.videobase.base;

/* loaded from: classes14.dex */
public interface GLConstants {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f46640a = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f46641b = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f46642c = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f46643d = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f46644e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f46645f = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f46646g = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f46647h = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* loaded from: classes14.dex */
    public enum ColorRange {
        UNKNOWN(0),
        VIDEO_RANGE(1),
        FULL_RANGE(2);

        private final int mJniValue;

        ColorRange(int i17) {
            this.mJniValue = i17;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    /* loaded from: classes14.dex */
    public enum ColorSpace {
        UNKNOWN(0),
        BT601(1),
        BT709(2);

        private final int mJniValue;

        ColorSpace(int i17) {
            this.mJniValue = i17;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    /* loaded from: classes14.dex */
    public enum GLScaleType {
        CENTER_CROP(0),
        FIT_CENTER(1),
        FILL(2);


        /* renamed from: d, reason: collision with root package name */
        private static final com.tencent.liteav.videobase.base.GLConstants.GLScaleType[] f46659d = values();
        public int mValue;

        GLScaleType(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videobase.base.GLConstants.GLScaleType a(int i17) {
            for (com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType : f46659d) {
                if (gLScaleType.mValue == i17) {
                    return gLScaleType;
                }
            }
            return FIT_CENTER;
        }
    }

    /* loaded from: classes14.dex */
    public enum PixelFormatType {
        I420(0),
        NV12(1),
        NV21(2),
        RGB(3),
        YUY2(4),
        RGBA(5),
        BGR(6),
        YV12(7),
        BGRA(8),
        ARGB(9),
        YUV422P(10),
        UYVY(11),
        YUYV(12),
        JPG(13),
        H264(14),
        MAX(100);


        /* renamed from: q, reason: collision with root package name */
        private static final com.tencent.liteav.videobase.base.GLConstants.PixelFormatType[] f46677q = values();
        private final int mJniValue;

        PixelFormatType(int i17) {
            this.mJniValue = i17;
        }

        public static com.tencent.liteav.videobase.base.GLConstants.PixelFormatType a(int i17) {
            for (com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType : f46677q) {
                if (pixelFormatType.mJniValue == i17) {
                    return pixelFormatType;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.mJniValue;
        }
    }

    /* loaded from: classes14.dex */
    public enum a {
        BYTE_BUFFER(0),
        TEXTURE_2D(1),
        TEXTURE_OES(2),
        BYTE_ARRAY(3);


        /* renamed from: e, reason: collision with root package name */
        private static final com.tencent.liteav.videobase.base.GLConstants.a[] f46683e = values();
        public int mValue;

        a(int i17) {
            this.mValue = i17;
        }

        public static com.tencent.liteav.videobase.base.GLConstants.a a(int i17) {
            for (com.tencent.liteav.videobase.base.GLConstants.a aVar : f46683e) {
                if (aVar.mValue == i17) {
                    return aVar;
                }
            }
            return TEXTURE_2D;
        }
    }
}

package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1;

/* renamed from: com.tencent.liteav.videobase.base.GLConstants */
/* loaded from: classes14.dex */
public interface InterfaceC3809x2f81d9ea {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f128173a = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f128174b = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f128175c = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f128176d = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f128177e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f128178f = {1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f128179g = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f128180h = {1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: com.tencent.liteav.videobase.base.GLConstants$ColorRange */
    /* loaded from: classes14.dex */
    public enum ColorRange {
        UNKNOWN(0),
        VIDEO_RANGE(1),
        FULL_RANGE(2);


        /* renamed from: mJniValue */
        private final int f14881x9b3e2c59;

        ColorRange(int i17) {
            this.f14881x9b3e2c59 = i17;
        }

        /* renamed from: getValue */
        public final int m30944x754a37bb() {
            return this.f14881x9b3e2c59;
        }
    }

    /* renamed from: com.tencent.liteav.videobase.base.GLConstants$ColorSpace */
    /* loaded from: classes14.dex */
    public enum ColorSpace {
        UNKNOWN(0),
        BT601(1),
        BT709(2);


        /* renamed from: mJniValue */
        private final int f14882x9b3e2c59;

        ColorSpace(int i17) {
            this.f14882x9b3e2c59 = i17;
        }

        /* renamed from: getValue */
        public final int m30948x754a37bb() {
            return this.f14882x9b3e2c59;
        }
    }

    /* renamed from: com.tencent.liteav.videobase.base.GLConstants$GLScaleType */
    /* loaded from: classes14.dex */
    public enum GLScaleType {
        CENTER_CROP(0),
        FIT_CENTER(1),
        FILL(2);


        /* renamed from: d, reason: collision with root package name */
        private static final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType[] f128192d = m30951xcee59d22();

        /* renamed from: mValue */
        public int f14883xbee9dd04;

        GLScaleType(int i17) {
            this.f14883xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType : f128192d) {
                if (gLScaleType.f14883xbee9dd04 == i17) {
                    return gLScaleType;
                }
            }
            return FIT_CENTER;
        }
    }

    /* renamed from: com.tencent.liteav.videobase.base.GLConstants$PixelFormatType */
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
        private static final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType[] f128210q = m30954xcee59d22();

        /* renamed from: mJniValue */
        private final int f14884x9b3e2c59;

        PixelFormatType(int i17) {
            this.f14884x9b3e2c59 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType : f128210q) {
                if (pixelFormatType.f14884x9b3e2c59 == i17) {
                    return pixelFormatType;
                }
            }
            return null;
        }

        /* renamed from: getValue */
        public final int m30955x754a37bb() {
            return this.f14884x9b3e2c59;
        }
    }

    /* renamed from: com.tencent.liteav.videobase.base.GLConstants$a */
    /* loaded from: classes14.dex */
    public enum a {
        BYTE_BUFFER(0),
        TEXTURE_2D(1),
        TEXTURE_OES(2),
        BYTE_ARRAY(3);


        /* renamed from: e, reason: collision with root package name */
        private static final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a[] f128216e = m30958xcee59d22();

        /* renamed from: mValue */
        public int f14885xbee9dd04;

        a(int i17) {
            this.f14885xbee9dd04 = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar : f128216e) {
                if (aVar.f14885xbee9dd04 == i17) {
                    return aVar;
                }
            }
            return TEXTURE_2D;
        }
    }
}

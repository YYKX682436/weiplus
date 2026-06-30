package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor */
/* loaded from: classes13.dex */
public final class C26010x4177761e {

    /* renamed from: bitmapFormator */
    private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator f49338xba649a69;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator */
    /* loaded from: classes13.dex */
    public interface BitmapFormator {

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator$BitmapFormatType */
        /* loaded from: classes6.dex */
        public @interface BitmapFormatType {

            /* renamed from: FORMAT_ASSET */
            public static final int f49339x46d12c88 = 2;

            /* renamed from: FORMAT_BITMAP */
            public static final int f49340x947ce277 = 7;

            /* renamed from: FORMAT_BITMAPS */
            public static final int f49341xfb1f6cbc = 10;

            /* renamed from: FORMAT_DEFAULT */
            public static final int f49342x5d4e0dd9 = 5;

            /* renamed from: FORMAT_DEFAULT_F */
            public static final int f49343x42020760 = 6;

            /* renamed from: FORMAT_FILE */
            public static final int f49344xd9009cc4 = 3;

            /* renamed from: FORMAT_FONT_TEXT */
            public static final int f49345x4184e8d5 = 9;

            /* renamed from: FORMAT_NONE */
            public static final int f49346xd9045680 = -1;

            /* renamed from: FORMAT_PATH */
            public static final int f49347xd9050b6d = 4;

            /* renamed from: FORMAT_RESOURCE */
            public static final int f49348x11b87f56 = 1;

            /* renamed from: FORMAT_URL */
            public static final int f49349x304a9107 = 8;
        }

        /* renamed from: activeSize */
        int mo36719x79d3e027();

        /* renamed from: getBitmap */
        android.graphics.Bitmap mo36720x12501425(android.content.Context context);

        /* renamed from: getBitmapId */
        java.lang.String mo36721xbe9ba820();

        /* renamed from: getFormateType */
        int mo36722x310cfa72();

        /* renamed from: getHeight */
        int mo36723x1c4fb41d();

        /* renamed from: getWidth */
        int mo36724x755bd410();

        /* renamed from: nextActiveIndex */
        int mo36725x26390479();

        /* renamed from: recycle */
        void mo36726x408b7293();

        /* renamed from: setScale */
        void mo36727x53aeca08(int i17);
    }

    public C26010x4177761e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator bitmapFormator) {
        this.f49338xba649a69 = bitmapFormator;
    }

    /* renamed from: getBDId */
    public final java.lang.String m99319xfb7cfd53() {
        return this.f49338xba649a69.mo36721xbe9ba820();
    }

    /* renamed from: getBitmap */
    public final android.graphics.Bitmap m99320x12501425(android.content.Context context) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator bitmapFormator = this.f49338xba649a69;
        if (bitmapFormator == null) {
            return null;
        }
        return bitmapFormator.mo36720x12501425(context);
    }

    /* renamed from: getFormater */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator m99321x981c205a() {
        return this.f49338xba649a69;
    }

    /* renamed from: getHeight */
    public final int m99322x1c4fb41d() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator bitmapFormator = this.f49338xba649a69;
        if (bitmapFormator == null) {
            return 0;
        }
        return bitmapFormator.mo36723x1c4fb41d();
    }

    /* renamed from: getWidth */
    public final int m99323x755bd410() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator bitmapFormator = this.f49338xba649a69;
        if (bitmapFormator == null) {
            return 0;
        }
        return bitmapFormator.mo36724x755bd410();
    }
}

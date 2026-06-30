package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.frame.PixelFrame */
/* loaded from: classes14.dex */
public class C3817x73c266a7 extends com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.i {

    /* renamed from: _hellAccFlag_ */
    private byte f14936x7f11beae;

    /* renamed from: mBuffer */
    protected java.nio.ByteBuffer f14937xfd47bb0d;

    /* renamed from: mColorRange */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange f14938x285137e7;

    /* renamed from: mColorSpace */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace f14939x2865efb0;

    /* renamed from: mConsumerChainTimestamp */
    protected com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b f14940xcf7391b8;

    /* renamed from: mData */
    protected byte[] f14941x62065b7;

    /* renamed from: mGLContext */
    protected java.lang.Object f14942x9509133d;

    /* renamed from: mHeight */
    protected int f14943x6a4b7f4;

    /* renamed from: mIsMirrorHorizontal */
    private boolean f14944xc7d489da;

    /* renamed from: mIsMirrorVertical */
    private boolean f14945x6cb5aac;

    /* renamed from: mMatrix */
    private float[] f14946xef9be8e;

    /* renamed from: mMetaData */
    protected com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3815x7ad56fbc f14947xa1c96dc;

    /* renamed from: mPixelBufferType */
    protected com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a f14948x53126693;

    /* renamed from: mPixelFormatType */
    protected com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType f14949xf4c016ca;

    /* renamed from: mProducerChainTimestamp */
    protected com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7 f14950x7e0c5c54;

    /* renamed from: mRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f14951x2296b70b;

    /* renamed from: mTextureId */
    protected int f14952x3e144da9;

    /* renamed from: mTimestamp */
    private long f14953x7e007329;

    /* renamed from: mWidth */
    protected int f14954xbefb7959;

    public C3817x73c266a7() {
        super(null);
        this.f14953x7e007329 = 0L;
        this.f14954xbefb7959 = -1;
        this.f14943x6a4b7f4 = -1;
        this.f14938x285137e7 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN;
        this.f14939x2865efb0 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.UNKNOWN;
        this.f14951x2296b70b = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        this.f14944xc7d489da = false;
        this.f14945x6cb5aac = false;
        this.f14946xef9be8e = null;
        this.f14941x62065b7 = null;
        this.f14937xfd47bb0d = null;
        this.f14952x3e144da9 = -1;
        this.f14942x9509133d = null;
        this.f14950x7e0c5c54 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7();
        this.f14940xcf7391b8 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b();
    }

    /* renamed from: createFromBitmap */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31058xcfd37f95(android.graphics.Bitmap bitmap) {
        int width = (bitmap.getWidth() / 2) * 2;
        int height = (bitmap.getHeight() / 2) * 2;
        if (width != 0 && height != 0 && (bitmap.getWidth() % 2 != 0 || bitmap.getHeight() % 2 != 0)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(bitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/liteav/videobase/frame/PixelFrame", "createFromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/liteav/videobase/frame/PixelFrame;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/liteav/videobase/frame/PixelFrame", "createFromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/liteav/videobase/frame/PixelFrame;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            bitmap = createBitmap;
        }
        java.nio.ByteBuffer b17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.b(bitmap.getWidth() * 4 * bitmap.getHeight());
        if (b17 == null) {
            return null;
        }
        bitmap.copyPixelsToBuffer(b17);
        b17.position(0);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7();
        c3817x73c266a7.m31091x627eb42(b17);
        c3817x73c266a7.m31108x53e9ee84(bitmap.getWidth());
        c3817x73c266a7.m31097xf84e829(bitmap.getHeight());
        c3817x73c266a7.m31102x9e9ca1fe(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER);
        c3817x73c266a7.m31103x404a5235(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA);
        return c3817x73c266a7;
    }

    /* renamed from: getColorRangeValue */
    private int m31059xe0a5e3c1() {
        return this.f14938x285137e7.m30944x754a37bb();
    }

    /* renamed from: getColorSpaceValue */
    private int m31060x6ae9a198() {
        return this.f14939x2865efb0.m30948x754a37bb();
    }

    /* renamed from: getPixelBufferTypeValue */
    private int m31061x1b255f07() {
        return this.f14948x53126693.f14885xbee9dd04;
    }

    /* renamed from: getPixelFormatTypeValue */
    private int m31062x30603930() {
        return this.f14949xf4c016ca.m30955x754a37bb();
    }

    /* renamed from: getRotationValue */
    private int m31063xcc044cdd() {
        return this.f14951x2296b70b.f14773xbee9dd04;
    }

    /* renamed from: releasePixelFrames */
    public static void m31064xc09bcc45(java.util.Collection<com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7> collection) {
        if (collection == null) {
            return;
        }
        for (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7 : collection) {
            if (c3817x73c266a7 != null) {
                c3817x73c266a7.mo31088x41012807();
            }
        }
        collection.clear();
    }

    /* renamed from: copy */
    public void m31065x2eaf75(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        this.f14953x7e007329 = c3817x73c266a7.f14953x7e007329;
        this.f14954xbefb7959 = c3817x73c266a7.f14954xbefb7959;
        this.f14943x6a4b7f4 = c3817x73c266a7.f14943x6a4b7f4;
        this.f14948x53126693 = c3817x73c266a7.f14948x53126693;
        this.f14949xf4c016ca = c3817x73c266a7.f14949xf4c016ca;
        this.f14951x2296b70b = c3817x73c266a7.f14951x2296b70b;
        this.f14944xc7d489da = c3817x73c266a7.f14944xc7d489da;
        this.f14945x6cb5aac = c3817x73c266a7.f14945x6cb5aac;
        if (c3817x73c266a7.f14946xef9be8e != null) {
            this.f14946xef9be8e = new float[16];
            float[] m31074x24a4bab7 = c3817x73c266a7.m31074x24a4bab7();
            float[] fArr = this.f14946xef9be8e;
            java.lang.System.arraycopy(m31074x24a4bab7, 0, fArr, 0, fArr.length);
        }
        this.f14946xef9be8e = c3817x73c266a7.f14946xef9be8e;
        this.f14941x62065b7 = c3817x73c266a7.f14941x62065b7;
        this.f14937xfd47bb0d = c3817x73c266a7.f14937xfd47bb0d;
        this.f14952x3e144da9 = c3817x73c266a7.f14952x3e144da9;
        this.f14942x9509133d = c3817x73c266a7.f14942x9509133d;
        this.f14947xa1c96dc = c3817x73c266a7.f14947xa1c96dc;
        this.f14940xcf7391b8 = c3817x73c266a7.f14940xcf7391b8;
        this.f14950x7e0c5c54 = c3817x73c266a7.f14950x7e0c5c54;
        this.f14939x2865efb0 = c3817x73c266a7.f14939x2865efb0;
        this.f14938x285137e7 = c3817x73c266a7.f14938x285137e7;
    }

    /* renamed from: getBuffer */
    public java.nio.ByteBuffer m31066x12f2b736() {
        return this.f14937xfd47bb0d;
    }

    /* renamed from: getColorRange */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange m31067x3a5ff790() {
        return this.f14938x285137e7;
    }

    /* renamed from: getColorSpace */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace m31068x3a74af59() {
        return this.f14939x2865efb0;
    }

    /* renamed from: getConsumerChainTimestamp */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b m31069x72db1be1() {
        if (this.f14940xcf7391b8 == null) {
            this.f14940xcf7391b8 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b();
        }
        return this.f14940xcf7391b8;
    }

    /* renamed from: getData */
    public byte[] m31070xfb7e5820() {
        return this.f14941x62065b7;
    }

    /* renamed from: getGLContext */
    public java.lang.Object m31071x19bf3a74() {
        return this.f14942x9509133d;
    }

    /* renamed from: getGLContextNativeHandle */
    public long m31072xbb3f7db3() {
        return com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31162xbb3f7db3(this.f14942x9509133d);
    }

    /* renamed from: getHeight */
    public int m31073x1c4fb41d() {
        return this.f14943x6a4b7f4;
    }

    /* renamed from: getMatrix */
    public float[] m31074x24a4bab7() {
        return this.f14946xef9be8e;
    }

    /* renamed from: getMetaData */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3815x7ad56fbc m31075x60f92cc5() {
        return this.f14947xa1c96dc;
    }

    /* renamed from: getPixelBufferType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a m31076x67c6088a() {
        return this.f14948x53126693;
    }

    /* renamed from: getPixelFormatType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType m31077x973b8c1() {
        return this.f14949xf4c016ca;
    }

    /* renamed from: getProducerChainTimestamp */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7 m31078x2173e67d() {
        if (this.f14950x7e0c5c54 == null) {
            this.f14950x7e0c5c54 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7();
        }
        return this.f14950x7e0c5c54;
    }

    /* renamed from: getRotation */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31079x79734cf4() {
        return this.f14951x2296b70b;
    }

    /* renamed from: getTextureId */
    public int m31080xc2ca74e0() {
        return this.f14952x3e144da9;
    }

    /* renamed from: getTimestamp */
    public long m31081x2b69a60() {
        return this.f14953x7e007329;
    }

    /* renamed from: getWidth */
    public int m31082x755bd410() {
        return this.f14954xbefb7959;
    }

    /* renamed from: hasTransformParams */
    public boolean m31083x56ed6e18() {
        return this.f14951x2296b70b != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL || this.f14944xc7d489da || this.f14945x6cb5aac || this.f14946xef9be8e != null;
    }

    /* renamed from: isFrameDataValid */
    public boolean m31084xed4e334f() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar = this.f14948x53126693;
        if (aVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D && this.f14952x3e144da9 == -1) {
            return false;
        }
        if (aVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER && this.f14937xfd47bb0d == null) {
            return false;
        }
        return (aVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY && this.f14941x62065b7 == null) ? false : true;
    }

    /* renamed from: isMirrorHorizontal */
    public boolean m31085xc8852e8d() {
        return this.f14944xc7d489da;
    }

    /* renamed from: isMirrorVertical */
    public boolean m31086xe0b3901f() {
        return this.f14945x6cb5aac;
    }

    /* renamed from: postRotate */
    public void m31087x5e876a1b(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        if (kVar == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90 || kVar == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270) {
            m31109xdfc8aafa();
        }
        m31105x742bae00(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a((this.f14951x2296b70b.f14773xbee9dd04 + kVar.f14773xbee9dd04) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.i
    /* renamed from: release */
    public void mo31088x41012807() {
        super.mo31088x41012807();
    }

    /* renamed from: reset */
    public void m31089x6761d4f() {
        this.f14953x7e007329 = 0L;
        this.f14951x2296b70b = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        this.f14944xc7d489da = false;
        this.f14945x6cb5aac = false;
        this.f14946xef9be8e = null;
        this.f14952x3e144da9 = -1;
        this.f14942x9509133d = null;
        this.f14947xa1c96dc = null;
        this.f14950x7e0c5c54 = null;
        this.f14940xcf7391b8 = null;
        this.f14938x285137e7 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN;
        this.f14939x2865efb0 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.UNKNOWN;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.i
    /* renamed from: retain */
    public int mo31090xc84df105() {
        return super.mo31090xc84df105();
    }

    /* renamed from: setBuffer */
    public void m31091x627eb42(java.nio.ByteBuffer byteBuffer) {
        this.f14937xfd47bb0d = byteBuffer;
    }

    /* renamed from: setColorRange */
    public void m31092x6884459c(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange colorRange) {
        this.f14938x285137e7 = colorRange;
    }

    /* renamed from: setColorSpace */
    public void m31093x6898fd65(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace colorSpace) {
        this.f14939x2865efb0 = colorSpace;
    }

    /* renamed from: setConsumerChainTimestamp */
    public void m31094xa51eb7ed(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b c3820x3855510b) {
        this.f14940xcf7391b8 = c3820x3855510b;
    }

    /* renamed from: setData */
    public void m31095x76491f2c(byte[] bArr) {
        this.f14941x62065b7 = bArr;
    }

    /* renamed from: setGLContext */
    public void m31096x7612fae8(java.lang.Object obj) {
        this.f14942x9509133d = obj;
    }

    /* renamed from: setHeight */
    public void m31097xf84e829(int i17) {
        this.f14943x6a4b7f4 = i17;
    }

    /* renamed from: setMatrix */
    public void m31098x17d9eec3(float[] fArr) {
        this.f14946xef9be8e = fArr;
    }

    /* renamed from: setMetaData */
    public void m31099x5bb18dd1(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3815x7ad56fbc c3815x7ad56fbc) {
        this.f14947xa1c96dc = c3815x7ad56fbc;
    }

    /* renamed from: setMirrorHorizontal */
    public void m31100x6a716dc5(boolean z17) {
        this.f14944xc7d489da = z17;
    }

    /* renamed from: setMirrorVertical */
    public void m31101xf0963d57(boolean z17) {
        this.f14945x6cb5aac = z17;
    }

    /* renamed from: setPixelBufferType */
    public void m31102x9e9ca1fe(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar) {
        this.f14948x53126693 = aVar;
    }

    /* renamed from: setPixelFormatType */
    public void m31103x404a5235(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType) {
        this.f14949xf4c016ca = pixelFormatType;
    }

    /* renamed from: setProducerChainTimestamp */
    public void m31104x53b78289(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7 c3823xe6ee1ba7) {
        this.f14950x7e0c5c54 = c3823xe6ee1ba7;
    }

    /* renamed from: setRotation */
    public void m31105x742bae00(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        this.f14951x2296b70b = kVar;
    }

    /* renamed from: setTextureId */
    public void mo31106x1f1e3554(int i17) {
        this.f14952x3e144da9 = i17;
    }

    /* renamed from: setTimestamp */
    public void m31107x5f0a5ad4(long j17) {
        this.f14953x7e007329 = j17;
    }

    /* renamed from: setWidth */
    public void m31108x53e9ee84(int i17) {
        this.f14954xbefb7959 = i17;
    }

    /* renamed from: swapWidthHeight */
    public void m31109xdfc8aafa() {
        int i17 = this.f14954xbefb7959;
        this.f14954xbefb7959 = this.f14943x6a4b7f4;
        this.f14943x6a4b7f4 = i17;
    }

    public C3817x73c266a7(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        super(null);
        this.f14953x7e007329 = 0L;
        this.f14954xbefb7959 = -1;
        this.f14943x6a4b7f4 = -1;
        this.f14938x285137e7 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN;
        this.f14939x2865efb0 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.UNKNOWN;
        this.f14951x2296b70b = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        this.f14944xc7d489da = false;
        this.f14945x6cb5aac = false;
        this.f14946xef9be8e = null;
        this.f14941x62065b7 = null;
        this.f14937xfd47bb0d = null;
        this.f14952x3e144da9 = -1;
        this.f14942x9509133d = null;
        this.f14950x7e0c5c54 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7();
        this.f14940xcf7391b8 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b();
        m31065x2eaf75(c3817x73c266a7);
    }

    public C3817x73c266a7(int i17, int i18, int i19, int i27, int i28) {
        this(null, i17, i18, i19, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.a(i27), com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.a(i28));
    }

    public C3817x73c266a7(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g<com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7> gVar, int i17, int i18, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType) {
        this(gVar, i17, i18, pixelFormatType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA ? i17 * i18 * 4 : ((i17 * i18) * 3) / 2, aVar, pixelFormatType);
    }

    public C3817x73c266a7(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g<com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7> gVar, int i17, int i18, int i19, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a aVar, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType) {
        super(gVar);
        this.f14953x7e007329 = 0L;
        this.f14954xbefb7959 = -1;
        this.f14943x6a4b7f4 = -1;
        this.f14938x285137e7 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN;
        this.f14939x2865efb0 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.UNKNOWN;
        this.f14951x2296b70b = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        this.f14944xc7d489da = false;
        this.f14945x6cb5aac = false;
        this.f14946xef9be8e = null;
        this.f14941x62065b7 = null;
        this.f14937xfd47bb0d = null;
        this.f14952x3e144da9 = -1;
        this.f14942x9509133d = null;
        this.f14950x7e0c5c54 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7();
        this.f14940xcf7391b8 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b();
        this.f14954xbefb7959 = i17;
        this.f14943x6a4b7f4 = i18;
        this.f14949xf4c016ca = pixelFormatType;
        this.f14948x53126693 = aVar;
        if (aVar == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY) {
            this.f14941x62065b7 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.a(i19);
        } else {
            this.f14937xfd47bb0d = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.b(i19);
        }
    }

    public C3817x73c266a7(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g<? extends com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7> gVar) {
        super(gVar);
        this.f14953x7e007329 = 0L;
        this.f14954xbefb7959 = -1;
        this.f14943x6a4b7f4 = -1;
        this.f14938x285137e7 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN;
        this.f14939x2865efb0 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.UNKNOWN;
        this.f14951x2296b70b = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        this.f14944xc7d489da = false;
        this.f14945x6cb5aac = false;
        this.f14946xef9be8e = null;
        this.f14941x62065b7 = null;
        this.f14937xfd47bb0d = null;
        this.f14952x3e144da9 = -1;
        this.f14942x9509133d = null;
        this.f14950x7e0c5c54 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7();
        this.f14940xcf7391b8 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b();
    }
}

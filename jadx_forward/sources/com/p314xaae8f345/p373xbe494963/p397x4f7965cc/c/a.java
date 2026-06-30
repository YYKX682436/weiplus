package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c;

/* loaded from: classes14.dex */
public final class a extends com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.e {

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f128218k = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f128219l = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f128220m = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.2132f, 2.1124f, 1.7927f, -0.5329f, 0.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f128221n = {1.0f, 1.0f, 1.0f, 0.0f, -0.1873f, 1.8556f, 1.5748f, -0.4681f, 0.0f};

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f128222o = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* renamed from: p, reason: collision with root package name */
    private static final float[] f128223p = {0.0f, -0.5019608f, -0.5019608f};

    /* renamed from: q, reason: collision with root package name */
    private int f128224q;

    /* renamed from: r, reason: collision with root package name */
    private int f128225r;

    /* renamed from: com.tencent.liteav.videobase.c.a$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128226a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.m30943xcee59d22().length];
            f128226a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128226a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128226a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange colorRange, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace colorSpace) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform\n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor;\n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}", colorRange, colorSpace);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.e, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public final void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e eVar) {
        super.a(eVar);
        this.f128224q = android.opengl.GLES20.glGetUniformLocation(this.f128164g, "convertMatrix");
        this.f128225r = android.opengl.GLES20.glGetUniformLocation(this.f128164g, "offset");
        java.lang.Runnable a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.b.a(this);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.a aVar = this.f128158a;
        synchronized (aVar.f128324a) {
            aVar.f128324a.add(a17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.e
    public final int e() {
        return 6409;
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.a aVar) {
        float[] fArr;
        float[] fArr2;
        android.opengl.GLES20.glUseProgram(aVar.f128164g);
        int i17 = aVar.f128225r;
        if (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.a.AnonymousClass1.f128226a[aVar.f128229j.ordinal()] != 1) {
            fArr = f128222o;
        } else {
            fArr = f128223p;
        }
        android.opengl.GLES20.glUniform3fv(i17, 1, fArr, 0);
        int i18 = aVar.f128224q;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace colorSpace = aVar.f128228i;
        if (colorSpace == null || colorSpace == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.UNKNOWN) {
            colorSpace = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.BT601;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange colorRange = aVar.f128229j;
        if (colorRange == null || colorRange == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN) {
            colorRange = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.VIDEO_RANGE;
        }
        if (colorSpace == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.BT601) {
            if (colorRange != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.VIDEO_RANGE && colorRange == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.FULL_RANGE) {
                fArr2 = f128219l;
            }
            fArr2 = f128218k;
        } else {
            if (colorSpace == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.BT709) {
                if (colorRange == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.VIDEO_RANGE) {
                    fArr2 = f128220m;
                } else if (colorRange == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.FULL_RANGE) {
                    fArr2 = f128221n;
                }
            }
            fArr2 = f128218k;
        }
        android.opengl.GLES20.glUniformMatrix3fv(i18, 1, false, fArr2, 0);
    }
}

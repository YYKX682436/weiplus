package com.tencent.liteav.videobase.c;

/* loaded from: classes14.dex */
public final class a extends com.tencent.liteav.videobase.c.e {

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f46685k = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f46686l = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f46687m = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.2132f, 2.1124f, 1.7927f, -0.5329f, 0.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f46688n = {1.0f, 1.0f, 1.0f, 0.0f, -0.1873f, 1.8556f, 1.5748f, -0.4681f, 0.0f};

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f46689o = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* renamed from: p, reason: collision with root package name */
    private static final float[] f46690p = {0.0f, -0.5019608f, -0.5019608f};

    /* renamed from: q, reason: collision with root package name */
    private int f46691q;

    /* renamed from: r, reason: collision with root package name */
    private int f46692r;

    /* renamed from: com.tencent.liteav.videobase.c.a$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46693a;

        static {
            int[] iArr = new int[com.tencent.liteav.videobase.base.GLConstants.ColorRange.values().length];
            f46693a = iArr;
            try {
                iArr[com.tencent.liteav.videobase.base.GLConstants.ColorRange.FULL_RANGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46693a[com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46693a[com.tencent.liteav.videobase.base.GLConstants.ColorRange.VIDEO_RANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public a(com.tencent.liteav.videobase.base.GLConstants.ColorRange colorRange, com.tencent.liteav.videobase.base.GLConstants.ColorSpace colorSpace) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform\n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor;\n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}", colorRange, colorSpace);
    }

    @Override // com.tencent.liteav.videobase.c.e, com.tencent.liteav.videobase.a.a
    public final void a(com.tencent.liteav.videobase.frame.e eVar) {
        super.a(eVar);
        this.f46691q = android.opengl.GLES20.glGetUniformLocation(this.f46631g, "convertMatrix");
        this.f46692r = android.opengl.GLES20.glGetUniformLocation(this.f46631g, "offset");
        java.lang.Runnable a17 = com.tencent.liteav.videobase.c.b.a(this);
        com.tencent.liteav.videobase.utils.a aVar = this.f46625a;
        synchronized (aVar.f46791a) {
            aVar.f46791a.add(a17);
        }
    }

    @Override // com.tencent.liteav.videobase.c.e
    public final int e() {
        return 6409;
    }

    public static /* synthetic */ void a(com.tencent.liteav.videobase.c.a aVar) {
        float[] fArr;
        float[] fArr2;
        android.opengl.GLES20.glUseProgram(aVar.f46631g);
        int i17 = aVar.f46692r;
        if (com.tencent.liteav.videobase.c.a.AnonymousClass1.f46693a[aVar.f46696j.ordinal()] != 1) {
            fArr = f46689o;
        } else {
            fArr = f46690p;
        }
        android.opengl.GLES20.glUniform3fv(i17, 1, fArr, 0);
        int i18 = aVar.f46691q;
        com.tencent.liteav.videobase.base.GLConstants.ColorSpace colorSpace = aVar.f46695i;
        if (colorSpace == null || colorSpace == com.tencent.liteav.videobase.base.GLConstants.ColorSpace.UNKNOWN) {
            colorSpace = com.tencent.liteav.videobase.base.GLConstants.ColorSpace.BT601;
        }
        com.tencent.liteav.videobase.base.GLConstants.ColorRange colorRange = aVar.f46696j;
        if (colorRange == null || colorRange == com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN) {
            colorRange = com.tencent.liteav.videobase.base.GLConstants.ColorRange.VIDEO_RANGE;
        }
        if (colorSpace == com.tencent.liteav.videobase.base.GLConstants.ColorSpace.BT601) {
            if (colorRange != com.tencent.liteav.videobase.base.GLConstants.ColorRange.VIDEO_RANGE && colorRange == com.tencent.liteav.videobase.base.GLConstants.ColorRange.FULL_RANGE) {
                fArr2 = f46686l;
            }
            fArr2 = f46685k;
        } else {
            if (colorSpace == com.tencent.liteav.videobase.base.GLConstants.ColorSpace.BT709) {
                if (colorRange == com.tencent.liteav.videobase.base.GLConstants.ColorRange.VIDEO_RANGE) {
                    fArr2 = f46687m;
                } else if (colorRange == com.tencent.liteav.videobase.base.GLConstants.ColorRange.FULL_RANGE) {
                    fArr2 = f46688n;
                }
            }
            fArr2 = f46685k;
        }
        android.opengl.GLES20.glUniformMatrix3fv(i18, 1, false, fArr2, 0);
    }
}

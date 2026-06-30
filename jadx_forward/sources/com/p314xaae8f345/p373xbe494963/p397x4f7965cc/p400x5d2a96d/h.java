package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f128308a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f128309b = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f128310c = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f128311d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    private int f128312e;

    /* renamed from: f, reason: collision with root package name */
    private int f128313f;

    /* renamed from: g, reason: collision with root package name */
    private final java.nio.FloatBuffer f128314g;

    /* renamed from: h, reason: collision with root package name */
    private final java.nio.FloatBuffer f128315h;

    /* renamed from: j, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType f128317j;

    /* renamed from: n, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.c f128321n;

    /* renamed from: i, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a[] f128316i = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a[com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.m30954xcee59d22().length];

    /* renamed from: k, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 f128318k = null;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.a f128319l = null;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a f128320m = null;

    /* renamed from: com.tencent.liteav.videobase.frame.h$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128322a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.m29578xcee59d22().length];
            f128322a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128322a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128322a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128322a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public h(int i17, int i18) {
        this.f128312e = i17;
        this.f128313f = i18;
        float[] fArr = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128176d;
        this.f128314g = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.f128315h = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31153xd04d1c1d(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL, false, false);
    }

    private static float a(float f17) {
        return f17 == 0.0f ? 1.0f : 0.0f;
    }

    private void b() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7 = this.f128318k;
        if (c3817x73c266a7 == null) {
            return;
        }
        boolean z17 = c3817x73c266a7.m31079x79734cf4() == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90 || this.f128318k.m31079x79734cf4() == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270;
        float max = java.lang.Math.max((this.f128312e * 1.0f) / this.f128318k.m31082x755bd410(), (this.f128313f * 1.0f) / this.f128318k.m31073x1c4fb41d());
        float round = (java.lang.Math.round(r2 * max) * 1.0f) / this.f128312e;
        float round2 = (java.lang.Math.round(r5 * max) * 1.0f) / this.f128313f;
        float[] fArr = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.f128176d;
        float[] fArr2 = new float[8];
        if (this.f128318k.m31076x67c6088a() == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_OES) {
            a(fArr2, this.f128318k.m31079x79734cf4(), this.f128318k.m31085xc8852e8d(), this.f128318k.m31086xe0b3901f());
        } else {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31165x7e679789(fArr2, this.f128318k.m31079x79734cf4(), this.f128318k.m31085xc8852e8d(), this.f128318k.m31086xe0b3901f());
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType = this.f128317j;
        if (gLScaleType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP) {
            float f17 = (1.0f - (z17 ? 1.0f / round2 : 1.0f / round)) / 2.0f;
            float f18 = (1.0f - (z17 ? 1.0f / round : 1.0f / round2)) / 2.0f;
            fArr2[0] = a(fArr2[0], f17);
            fArr2[1] = a(fArr2[1], f18);
            fArr2[2] = a(fArr2[2], f17);
            fArr2[3] = a(fArr2[3], f18);
            fArr2[4] = a(fArr2[4], f17);
            fArr2[5] = a(fArr2[5], f18);
            fArr2[6] = a(fArr2[6], f17);
            fArr2[7] = a(fArr2[7], f18);
        } else if (gLScaleType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER) {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        this.f128314g.clear();
        this.f128314g.put(fArr).position(0);
        this.f128315h.clear();
        this.f128315h.put(fArr2).position(0);
    }

    private void c() {
        if (this.f128320m != null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a aVar = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a();
        this.f128320m = aVar;
        aVar.a();
    }

    private void d() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.a aVar = this.f128319l;
        if (aVar != null) {
            aVar.c();
            this.f128319l = null;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a aVar2 = this.f128320m;
        if (aVar2 != null) {
            aVar2.c();
            this.f128320m = null;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.c cVar = this.f128321n;
        if (cVar != null) {
            cVar.d();
            this.f128321n = null;
        }
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a[] aVarArr = this.f128316i;
            if (i17 >= aVarArr.length) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("PixelFrameRenderer", "uninitialize GL components");
                return;
            }
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a aVar3 = aVarArr[i17];
            if (aVar3 != null) {
                aVar3.c();
                this.f128316i[i17] = null;
            }
            i17++;
        }
    }

    private static float a(float f17, float f18) {
        return f17 == 0.0f ? f18 : 1.0f - f18;
    }

    public final void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar) {
        if (c3817x73c266a7 != null && c3817x73c266a7.m31084xed4e334f()) {
            if (this.f128318k == null || a(c3817x73c266a7, gLScaleType)) {
                this.f128317j = gLScaleType;
                this.f128318k = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7(c3817x73c266a7);
                d();
                b();
            }
            if (gLScaleType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER) {
                a(dVar);
            }
            if (this.f128318k.m31076x67c6088a() == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER) {
                if (this.f128318k.m31077x973b8c1() != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA) {
                    a(this.f128318k.m31077x973b8c1(), dVar, c3817x73c266a7.m31066x12f2b736(), c3817x73c266a7.m31067x3a5ff790(), c3817x73c266a7.m31068x3a74af59());
                    return;
                } else {
                    a(dVar, c3817x73c266a7.m31066x12f2b736());
                    return;
                }
            }
            if (this.f128318k.m31076x67c6088a() == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY) {
                if (this.f128318k.m31077x973b8c1() != com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA) {
                    a(this.f128318k.m31077x973b8c1(), dVar, java.nio.ByteBuffer.wrap(c3817x73c266a7.m31070xfb7e5820()), c3817x73c266a7.m31067x3a5ff790(), c3817x73c266a7.m31068x3a74af59());
                    return;
                } else {
                    a(dVar, java.nio.ByteBuffer.wrap(c3817x73c266a7.m31070xfb7e5820()));
                    return;
                }
            }
            if (this.f128318k.m31076x67c6088a() == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_OES) {
                a(dVar, c3817x73c266a7.m31080xc2ca74e0(), c3817x73c266a7.m31074x24a4bab7());
                return;
            } else {
                if (this.f128318k.m31076x67c6088a() == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.TEXTURE_2D) {
                    a(dVar, c3817x73c266a7.m31080xc2ca74e0());
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("PixelFrameRenderer", "renderFrame: pixelFrame is not valid");
    }

    public final void a() {
        this.f128318k = null;
        d();
    }

    private boolean a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType) {
        return (gLScaleType == this.f128317j && c3817x73c266a7.m31082x755bd410() == this.f128318k.m31082x755bd410() && c3817x73c266a7.m31073x1c4fb41d() == this.f128318k.m31073x1c4fb41d() && c3817x73c266a7.m31076x67c6088a() == this.f128318k.m31076x67c6088a() && c3817x73c266a7.m31077x973b8c1() == this.f128318k.m31077x973b8c1() && c3817x73c266a7.m31085xc8852e8d() == this.f128318k.m31085xc8852e8d() && c3817x73c266a7.m31086xe0b3901f() == this.f128318k.m31086xe0b3901f() && c3817x73c266a7.m31079x79734cf4() == this.f128318k.m31079x79734cf4()) ? false : true;
    }

    private void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar, java.nio.Buffer buffer) {
        int ordinal = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.RGBA.ordinal();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a[] aVarArr = this.f128316i;
        if (aVarArr[ordinal] == null) {
            aVarArr[ordinal] = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.b();
            this.f128316i[ordinal].a();
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.b bVar = (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.b) this.f128316i[ordinal];
        bVar.a(this.f128312e, this.f128313f);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31164x2199b4ab(0, 0, this.f128312e, this.f128313f);
        if (this.f128318k.m31079x79734cf4() != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90 && this.f128318k.m31079x79734cf4() != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270) {
            bVar.a(buffer, this.f128318k.m31082x755bd410(), this.f128318k.m31073x1c4fb41d());
        } else {
            bVar.a(buffer, this.f128318k.m31073x1c4fb41d(), this.f128318k.m31082x755bd410());
        }
        bVar.a(-1, dVar, this.f128314g, this.f128315h);
    }

    private void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType pixelFormatType, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange colorRange, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace colorSpace) {
        int ordinal = pixelFormatType.ordinal();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a[] aVarArr = this.f128316i;
        if (aVarArr[ordinal] == null) {
            if (pixelFormatType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420) {
                aVarArr[ordinal] = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.a(colorRange, colorSpace);
            } else if (pixelFormatType == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.NV21) {
                aVarArr[ordinal] = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.d();
            } else {
                aVarArr[ordinal] = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.c();
            }
            this.f128316i[ordinal].a();
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.e eVar = (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c.e) this.f128316i[ordinal];
        eVar.a(this.f128312e, this.f128313f);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31164x2199b4ab(0, 0, this.f128312e, this.f128313f);
        if (this.f128318k.m31079x79734cf4() != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90 && this.f128318k.m31079x79734cf4() != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270) {
            eVar.a(byteBuffer, this.f128318k.m31082x755bd410(), this.f128318k.m31073x1c4fb41d());
        } else {
            eVar.a(byteBuffer, this.f128318k.m31073x1c4fb41d(), this.f128318k.m31082x755bd410());
        }
        eVar.a(-1, dVar, this.f128314g, this.f128315h);
    }

    private void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar, int i17, float[] fArr) {
        if (this.f128319l == null) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.a aVar = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.a();
            this.f128319l = aVar;
            aVar.a();
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31164x2199b4ab(0, 0, this.f128312e, this.f128313f);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b.a aVar2 = this.f128319l;
        aVar2.f128165h = fArr;
        aVar2.a(this.f128312e, this.f128313f);
        this.f128319l.a(i17, dVar, this.f128314g, this.f128315h);
    }

    private void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar, int i17) {
        c();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31164x2199b4ab(0, 0, this.f128312e, this.f128313f);
        this.f128320m.a(this.f128312e, this.f128313f);
        this.f128320m.a(i17, dVar, this.f128314g, this.f128315h);
    }

    private void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar) {
        if (this.f128321n == null) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.c cVar = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.c();
            this.f128321n = cVar;
            cVar.a();
        }
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (dVar == null) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glClear(16640);
            return;
        }
        this.f128321n.a(dVar.a());
        this.f128321n.b();
        android.opengl.GLES20.glClear(16640);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31147xfc642370(36160, 0);
        this.f128321n.c();
    }

    private static void a(float[] fArr, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar, boolean z17, boolean z18) {
        float[] fArr2 = f128308a;
        if (kVar != null) {
            int i17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h.AnonymousClass1.f128322a[kVar.ordinal()];
            if (i17 == 1) {
                fArr2 = f128309b;
            } else if (i17 == 2) {
                fArr2 = f128311d;
            } else if (i17 == 3) {
                fArr2 = f128310c;
            }
        }
        java.lang.System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z17) {
            fArr[0] = a(fArr[0]);
            fArr[2] = a(fArr[2]);
            fArr[4] = a(fArr[4]);
            fArr[6] = a(fArr[6]);
        }
        if (z18) {
            fArr[1] = a(fArr[1]);
            fArr[3] = a(fArr[3]);
            fArr[5] = a(fArr[5]);
            fArr[7] = a(fArr[7]);
        }
    }
}

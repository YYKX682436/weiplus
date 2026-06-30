package com.tencent.liteav.videobase.frame;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f46775a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f46776b = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f46777c = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f46778d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    private int f46779e;

    /* renamed from: f, reason: collision with root package name */
    private int f46780f;

    /* renamed from: g, reason: collision with root package name */
    private final java.nio.FloatBuffer f46781g;

    /* renamed from: h, reason: collision with root package name */
    private final java.nio.FloatBuffer f46782h;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.liteav.videobase.base.GLConstants.GLScaleType f46784j;

    /* renamed from: n, reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.c f46788n;

    /* renamed from: i, reason: collision with root package name */
    private final com.tencent.liteav.videobase.a.a[] f46783i = new com.tencent.liteav.videobase.a.a[com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.values().length];

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.liteav.videobase.frame.PixelFrame f46785k = null;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.liteav.videobase.b.a f46786l = null;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.liteav.videobase.a.a f46787m = null;

    /* renamed from: com.tencent.liteav.videobase.frame.h$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46789a;

        static {
            int[] iArr = new int[com.tencent.liteav.base.util.k.values().length];
            f46789a = iArr;
            try {
                iArr[com.tencent.liteav.base.util.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46789a[com.tencent.liteav.base.util.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46789a[com.tencent.liteav.base.util.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f46789a[com.tencent.liteav.base.util.k.NORMAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public h(int i17, int i18) {
        this.f46779e = i17;
        this.f46780f = i18;
        float[] fArr = com.tencent.liteav.videobase.base.GLConstants.f46643d;
        this.f46781g = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.f46782h = com.tencent.liteav.videobase.utils.OpenGlUtils.createTextureCoordsBuffer(com.tencent.liteav.base.util.k.NORMAL, false, false);
    }

    private static float a(float f17) {
        return f17 == 0.0f ? 1.0f : 0.0f;
    }

    private void b() {
        com.tencent.liteav.videobase.frame.PixelFrame pixelFrame = this.f46785k;
        if (pixelFrame == null) {
            return;
        }
        boolean z17 = pixelFrame.getRotation() == com.tencent.liteav.base.util.k.ROTATION_90 || this.f46785k.getRotation() == com.tencent.liteav.base.util.k.ROTATION_270;
        float max = java.lang.Math.max((this.f46779e * 1.0f) / this.f46785k.getWidth(), (this.f46780f * 1.0f) / this.f46785k.getHeight());
        float round = (java.lang.Math.round(r2 * max) * 1.0f) / this.f46779e;
        float round2 = (java.lang.Math.round(r5 * max) * 1.0f) / this.f46780f;
        float[] fArr = com.tencent.liteav.videobase.base.GLConstants.f46643d;
        float[] fArr2 = new float[8];
        if (this.f46785k.getPixelBufferType() == com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_OES) {
            a(fArr2, this.f46785k.getRotation(), this.f46785k.isMirrorHorizontal(), this.f46785k.isMirrorVertical());
        } else {
            com.tencent.liteav.videobase.utils.OpenGlUtils.initTextureCoordsBuffer(fArr2, this.f46785k.getRotation(), this.f46785k.isMirrorHorizontal(), this.f46785k.isMirrorVertical());
        }
        com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType = this.f46784j;
        if (gLScaleType == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP) {
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
        } else if (gLScaleType == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER) {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        this.f46781g.clear();
        this.f46781g.put(fArr).position(0);
        this.f46782h.clear();
        this.f46782h.put(fArr2).position(0);
    }

    private void c() {
        if (this.f46787m != null) {
            return;
        }
        com.tencent.liteav.videobase.a.a aVar = new com.tencent.liteav.videobase.a.a();
        this.f46787m = aVar;
        aVar.a();
    }

    private void d() {
        com.tencent.liteav.videobase.b.a aVar = this.f46786l;
        if (aVar != null) {
            aVar.c();
            this.f46786l = null;
        }
        com.tencent.liteav.videobase.a.a aVar2 = this.f46787m;
        if (aVar2 != null) {
            aVar2.c();
            this.f46787m = null;
        }
        com.tencent.liteav.videobase.frame.c cVar = this.f46788n;
        if (cVar != null) {
            cVar.d();
            this.f46788n = null;
        }
        int i17 = 0;
        while (true) {
            com.tencent.liteav.videobase.a.a[] aVarArr = this.f46783i;
            if (i17 >= aVarArr.length) {
                com.tencent.liteav.base.util.LiteavLog.i("PixelFrameRenderer", "uninitialize GL components");
                return;
            }
            com.tencent.liteav.videobase.a.a aVar3 = aVarArr[i17];
            if (aVar3 != null) {
                aVar3.c();
                this.f46783i[i17] = null;
            }
            i17++;
        }
    }

    private static float a(float f17, float f18) {
        return f17 == 0.0f ? f18 : 1.0f - f18;
    }

    public final void a(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame, com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType, com.tencent.liteav.videobase.frame.d dVar) {
        if (pixelFrame != null && pixelFrame.isFrameDataValid()) {
            if (this.f46785k == null || a(pixelFrame, gLScaleType)) {
                this.f46784j = gLScaleType;
                this.f46785k = new com.tencent.liteav.videobase.frame.PixelFrame(pixelFrame);
                d();
                b();
            }
            if (gLScaleType == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER) {
                a(dVar);
            }
            if (this.f46785k.getPixelBufferType() == com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER) {
                if (this.f46785k.getPixelFormatType() != com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA) {
                    a(this.f46785k.getPixelFormatType(), dVar, pixelFrame.getBuffer(), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                    return;
                } else {
                    a(dVar, pixelFrame.getBuffer());
                    return;
                }
            }
            if (this.f46785k.getPixelBufferType() == com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY) {
                if (this.f46785k.getPixelFormatType() != com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA) {
                    a(this.f46785k.getPixelFormatType(), dVar, java.nio.ByteBuffer.wrap(pixelFrame.getData()), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                    return;
                } else {
                    a(dVar, java.nio.ByteBuffer.wrap(pixelFrame.getData()));
                    return;
                }
            }
            if (this.f46785k.getPixelBufferType() == com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_OES) {
                a(dVar, pixelFrame.getTextureId(), pixelFrame.getMatrix());
                return;
            } else {
                if (this.f46785k.getPixelBufferType() == com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D) {
                    a(dVar, pixelFrame.getTextureId());
                    return;
                }
                return;
            }
        }
        com.tencent.liteav.base.util.LiteavLog.w("PixelFrameRenderer", "renderFrame: pixelFrame is not valid");
    }

    public final void a() {
        this.f46785k = null;
        d();
    }

    private boolean a(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame, com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType) {
        return (gLScaleType == this.f46784j && pixelFrame.getWidth() == this.f46785k.getWidth() && pixelFrame.getHeight() == this.f46785k.getHeight() && pixelFrame.getPixelBufferType() == this.f46785k.getPixelBufferType() && pixelFrame.getPixelFormatType() == this.f46785k.getPixelFormatType() && pixelFrame.isMirrorHorizontal() == this.f46785k.isMirrorHorizontal() && pixelFrame.isMirrorVertical() == this.f46785k.isMirrorVertical() && pixelFrame.getRotation() == this.f46785k.getRotation()) ? false : true;
    }

    private void a(com.tencent.liteav.videobase.frame.d dVar, java.nio.Buffer buffer) {
        int ordinal = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA.ordinal();
        com.tencent.liteav.videobase.a.a[] aVarArr = this.f46783i;
        if (aVarArr[ordinal] == null) {
            aVarArr[ordinal] = new com.tencent.liteav.videobase.b.b();
            this.f46783i[ordinal].a();
        }
        com.tencent.liteav.videobase.b.b bVar = (com.tencent.liteav.videobase.b.b) this.f46783i[ordinal];
        bVar.a(this.f46779e, this.f46780f);
        com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(0, 0, this.f46779e, this.f46780f);
        if (this.f46785k.getRotation() != com.tencent.liteav.base.util.k.ROTATION_90 && this.f46785k.getRotation() != com.tencent.liteav.base.util.k.ROTATION_270) {
            bVar.a(buffer, this.f46785k.getWidth(), this.f46785k.getHeight());
        } else {
            bVar.a(buffer, this.f46785k.getHeight(), this.f46785k.getWidth());
        }
        bVar.a(-1, dVar, this.f46781g, this.f46782h);
    }

    private void a(com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType, com.tencent.liteav.videobase.frame.d dVar, java.nio.ByteBuffer byteBuffer, com.tencent.liteav.videobase.base.GLConstants.ColorRange colorRange, com.tencent.liteav.videobase.base.GLConstants.ColorSpace colorSpace) {
        int ordinal = pixelFormatType.ordinal();
        com.tencent.liteav.videobase.a.a[] aVarArr = this.f46783i;
        if (aVarArr[ordinal] == null) {
            if (pixelFormatType == com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.I420) {
                aVarArr[ordinal] = new com.tencent.liteav.videobase.c.a(colorRange, colorSpace);
            } else if (pixelFormatType == com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.NV21) {
                aVarArr[ordinal] = new com.tencent.liteav.videobase.c.d();
            } else {
                aVarArr[ordinal] = new com.tencent.liteav.videobase.c.c();
            }
            this.f46783i[ordinal].a();
        }
        com.tencent.liteav.videobase.c.e eVar = (com.tencent.liteav.videobase.c.e) this.f46783i[ordinal];
        eVar.a(this.f46779e, this.f46780f);
        com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(0, 0, this.f46779e, this.f46780f);
        if (this.f46785k.getRotation() != com.tencent.liteav.base.util.k.ROTATION_90 && this.f46785k.getRotation() != com.tencent.liteav.base.util.k.ROTATION_270) {
            eVar.a(byteBuffer, this.f46785k.getWidth(), this.f46785k.getHeight());
        } else {
            eVar.a(byteBuffer, this.f46785k.getHeight(), this.f46785k.getWidth());
        }
        eVar.a(-1, dVar, this.f46781g, this.f46782h);
    }

    private void a(com.tencent.liteav.videobase.frame.d dVar, int i17, float[] fArr) {
        if (this.f46786l == null) {
            com.tencent.liteav.videobase.b.a aVar = new com.tencent.liteav.videobase.b.a();
            this.f46786l = aVar;
            aVar.a();
        }
        com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(0, 0, this.f46779e, this.f46780f);
        com.tencent.liteav.videobase.b.a aVar2 = this.f46786l;
        aVar2.f46632h = fArr;
        aVar2.a(this.f46779e, this.f46780f);
        this.f46786l.a(i17, dVar, this.f46781g, this.f46782h);
    }

    private void a(com.tencent.liteav.videobase.frame.d dVar, int i17) {
        c();
        com.tencent.liteav.videobase.utils.OpenGlUtils.glViewport(0, 0, this.f46779e, this.f46780f);
        this.f46787m.a(this.f46779e, this.f46780f);
        this.f46787m.a(i17, dVar, this.f46781g, this.f46782h);
    }

    private void a(com.tencent.liteav.videobase.frame.d dVar) {
        if (this.f46788n == null) {
            com.tencent.liteav.videobase.frame.c cVar = new com.tencent.liteav.videobase.frame.c();
            this.f46788n = cVar;
            cVar.a();
        }
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (dVar == null) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glClear(16640);
            return;
        }
        this.f46788n.a(dVar.a());
        this.f46788n.b();
        android.opengl.GLES20.glClear(16640);
        com.tencent.liteav.videobase.utils.OpenGlUtils.bindFramebuffer(36160, 0);
        this.f46788n.c();
    }

    private static void a(float[] fArr, com.tencent.liteav.base.util.k kVar, boolean z17, boolean z18) {
        float[] fArr2 = f46775a;
        if (kVar != null) {
            int i17 = com.tencent.liteav.videobase.frame.h.AnonymousClass1.f46789a[kVar.ordinal()];
            if (i17 == 1) {
                fArr2 = f46776b;
            } else if (i17 == 2) {
                fArr2 = f46778d;
            } else if (i17 == 3) {
                fArr2 = f46777c;
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

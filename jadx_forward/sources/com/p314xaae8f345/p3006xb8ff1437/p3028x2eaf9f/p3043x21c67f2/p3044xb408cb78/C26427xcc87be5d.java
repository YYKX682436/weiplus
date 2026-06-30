package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.filter.Hdr2SdrFilter */
/* loaded from: classes14.dex */
public class C26427xcc87be5d {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f53571x4d57ec70 = 4;

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f53572xb30c5cb4 = "#version 300 es\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D lookupTexture;\nuniform float uAlpha;\nuniform int uIsEnableLut;\nout vec4 outColor;\nvoid main() {\n   vec4 textureColor = texture(sTexture, vTextureCoord);\n  textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n  if(uIsEnableLut == 1) {\n     textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  }\n  outColor = textureColor;\n}\n";

    /* renamed from: TRIANGLE_VERTICES_DATA_POS_OFFSET */
    private static final int f53573x39646ac4 = 0;

    /* renamed from: TRIANGLE_VERTICES_DATA_STRIDE_BYTES */
    private static final int f53574x3d85cbab = 8;

    /* renamed from: VERTEX_SHADER */
    private static final java.lang.String f53575xeb40e2e0 = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";

    /* renamed from: _hellAccFlag_ */
    private byte f53576x7f11beae;

    /* renamed from: aPositionHandle */
    private int f53577x5a2cbf72;

    /* renamed from: mTextureid */
    private int f53583x3e145189;

    /* renamed from: program */
    protected int f53585xed8f1e84;

    /* renamed from: rendererHeight */
    private int f53586x988ddfca;

    /* renamed from: rendererWidth */
    private int f53587xe02fec3;

    /* renamed from: stMatrixHandle */
    private int f53590xe486364a;

    /* renamed from: triangleVertices */
    private java.nio.FloatBuffer f53591x8f564e21;

    /* renamed from: uAlphaHandle */
    private int f53592xfe4c4971;

    /* renamed from: uMatrixHandle */
    private int f53595x5c67aa5e;

    /* renamed from: uScreenSizeHandle */
    private int f53596x560535aa;

    /* renamed from: uTextureSizeHandle */
    private int f53597xd5f4590f;

    /* renamed from: uLookupTextureHandle */
    private int f53594x7814ad14 = -1;

    /* renamed from: uLookupEnableHandle */
    private int f53593xd5e2117a = -1;

    /* renamed from: lookupHDR10TextureId */
    private int f53581x1f80839b = -1;

    /* renamed from: lookupHLGTextureId */
    private int f53582x30e0598d = -1;

    /* renamed from: bgColor */
    private int f53578xf3ca161e = -16777216;

    /* renamed from: useLut */
    private boolean f53598xce2aa504 = false;

    /* renamed from: stMatrix */
    private final android.graphics.Matrix f53589x2b6c8582 = null;

    /* renamed from: matrix */
    private final android.graphics.Matrix f53584xbf8d97c1 = null;

    /* renamed from: shaderIndexes */
    private final int[] f53588xb4b1ad5b = new int[2];

    /* renamed from: frameBuffer */
    private int f53580xdab7a40d = -1;

    /* renamed from: defaultViewport */
    private int[] f53579xbe6c6207 = new int[4];

    /* renamed from: com.tencent.thumbplayer.core.postprocessor.filter.Hdr2SdrFilter$Rectangle */
    /* loaded from: classes14.dex */
    public static class Rectangle {

        /* renamed from: height */
        public float f53599xb7389127;

        /* renamed from: width */
        public float f53600x6be2dc6;

        /* renamed from: x, reason: collision with root package name */
        public float f297076x;

        /* renamed from: y, reason: collision with root package name */
        public float f297077y;

        public Rectangle() {
            this(0.0f, 0.0f, 0.0f, 0.0f);
        }

        public Rectangle(float f17, float f18, float f19, float f27) {
            this.f297076x = f17;
            this.f297077y = f18;
            this.f53600x6be2dc6 = f19;
            this.f53599xb7389127 = f27;
        }
    }

    public C26427xcc87be5d() {
        java.io.InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("assets/HDR_lut/HDR10.png");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(resourceAsStream);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
        yj0.a.e(obj, decodeStream, "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        resourceAsStream.close();
        java.io.InputStream resourceAsStream2 = getClass().getClassLoader().getResourceAsStream("assets/HDR_lut/HLG.png");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(resourceAsStream2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
        yj0.a.e(obj2, decodeStream2, "com/tencent/thumbplayer/core/postprocessor/filter/Hdr2SdrFilter", "<init>", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        resourceAsStream2.close();
        m102783xc918e5fe();
        m102778x6dfbe029(decodeStream, decodeStream2);
    }

    /* renamed from: initFrameBuffer */
    private void m102777x76a91cdd() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        this.f53583x3e145189 = i17;
        android.opengl.GLES20.glBindTexture(3553, i17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glTexParameter");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, this.f53587xe02fec3, this.f53586x988ddfca, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
        int i18 = iArr2[0];
        android.opengl.GLES20.glBindFramebuffer(36160, i18);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glBindFramebuffer frameBuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f53583x3e145189, 0);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glCheckFramebufferStatus frameBuffer");
        if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
            new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
        } else {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            this.f53580xdab7a40d = i18;
        }
    }

    /* renamed from: initLutInfo */
    private void m102778x6dfbe029(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        boolean z17 = (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) ? false : true;
        this.f53598xce2aa504 = z17;
        if (z17) {
            this.f53594x7814ad14 = android.opengl.GLES20.glGetUniformLocation(this.f53585xed8f1e84, "lookupTexture");
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetUniformLocation uLookupTextureHandle");
            if (this.f53594x7814ad14 == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uLookupTextureHandle");
                return;
            }
            this.f53593xd5e2117a = android.opengl.GLES20.glGetUniformLocation(this.f53585xed8f1e84, "uIsEnableLut");
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetUniformLocation uLookupTextureHandle");
            if (this.f53593xd5e2117a == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uLookupTextureHandle");
                return;
            }
            if (this.f53581x1f80839b == -1) {
                int[] iArr = {-1};
                android.opengl.GLES20.glGenTextures(1, iArr, 0);
                android.opengl.GLES20.glBindTexture(3553, iArr[0]);
                android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
                android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
                this.f53581x1f80839b = iArr[0];
            }
            if (this.f53582x30e0598d == -1) {
                int[] iArr2 = {-1};
                android.opengl.GLES20.glGenTextures(1, iArr2, 0);
                android.opengl.GLES20.glBindTexture(3553, iArr2[0]);
                android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
                android.opengl.GLUtils.texImage2D(3553, 0, bitmap2, 0);
                this.f53582x30e0598d = iArr2[0];
            }
        }
    }

    /* renamed from: swap */
    private static void m102779x361193(float[] fArr, int i17, int i18) {
        float f17 = fArr[i17];
        fArr[i17] = fArr[i18];
        fArr[i18] = f17;
    }

    /* renamed from: toOpenGL2DMatrix */
    private static float[] m102780xe11f11bd(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        if (matrix == null) {
            for (int i17 = 0; i17 < 9; i17++) {
                fArr[i17] = i17 % 4 == 0 ? 1.0f : 0.0f;
            }
        } else {
            matrix.getValues(fArr);
            m102779x361193(fArr, 1, 3);
            m102779x361193(fArr, 2, 6);
            m102779x361193(fArr, 5, 7);
        }
        return fArr;
    }

    /* renamed from: destroyBuffers */
    public void m102781xdd60ded9() {
        int i17 = this.f53580xdab7a40d;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.f53580xdab7a40d = -1;
        }
        int i18 = this.f53583x3e145189;
        if (i18 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i18}, 0);
            this.f53583x3e145189 = 0;
        }
        int i19 = this.f53581x1f80839b;
        if (i19 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i19}, 0);
        }
        int i27 = this.f53582x30e0598d;
        if (i27 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i27}, 0);
        }
        int i28 = this.f53585xed8f1e84;
        if (i28 > 0) {
            android.opengl.GLES20.glDeleteProgram(i28);
            this.f53585xed8f1e84 = 0;
        }
        int i29 = 0;
        while (true) {
            int[] iArr = this.f53588xb4b1ad5b;
            if (i29 >= iArr.length) {
                return;
            }
            int i37 = iArr[i29];
            if (i37 > 0) {
                android.opengl.GLES20.glDeleteShader(i37);
                this.f53588xb4b1ad5b[i29] = 0;
            }
            i29++;
        }
    }

    /* renamed from: finishDraw */
    public void m102782x449bac77() {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: initShaders */
    public void m102783xc918e5fe() {
        this.f53591x8f564e21 = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        int m102767x737641e8 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26425xfadaf929.m102767x737641e8(f53575xeb40e2e0, f53572xb30c5cb4, this.f53588xb4b1ad5b);
        this.f53585xed8f1e84 = m102767x737641e8;
        if (m102767x737641e8 == 0) {
            new java.lang.RuntimeException("failed creating program");
            return;
        }
        this.f53577x5a2cbf72 = android.opengl.GLES20.glGetAttribLocation(m102767x737641e8, "aPosition");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetAttribLocation aPosition");
        if (this.f53577x5a2cbf72 == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.f53595x5c67aa5e = android.opengl.GLES20.glGetUniformLocation(this.f53585xed8f1e84, "uMatrix");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetUniformLocation uMatrix");
        if (this.f53595x5c67aa5e == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMatrix");
            return;
        }
        this.f53592xfe4c4971 = android.opengl.GLES20.glGetUniformLocation(this.f53585xed8f1e84, "uAlpha");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetUniformLocation uAlpha");
        if (this.f53592xfe4c4971 == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uAlpha");
            return;
        }
        this.f53590xe486364a = android.opengl.GLES20.glGetUniformLocation(this.f53585xed8f1e84, "stMatrix");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetUniformLocation stMatrix");
        if (this.f53590xe486364a == -1) {
            new java.lang.RuntimeException("Could not get uniform location for stMatrix");
            return;
        }
        this.f53596x560535aa = android.opengl.GLES20.glGetUniformLocation(this.f53585xed8f1e84, "uScreenSize");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetUniformLocation uScreenSize");
        if (this.f53596x560535aa == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uScreenSize");
            return;
        }
        this.f53597xd5f4590f = android.opengl.GLES20.glGetUniformLocation(this.f53585xed8f1e84, "uTextureSize");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glGetUniformLocation uTextureSize");
        if (this.f53597xd5f4590f == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uTextureSize");
        }
    }

    /* renamed from: prepareDraw */
    public void m102784xb1bad2eb(int i17, int i18, float[] fArr, int i19, int i27) {
        int i28;
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i18);
        this.f53591x8f564e21.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f53577x5a2cbf72, 2, 5126, false, 8, (java.nio.Buffer) this.f53591x8f564e21);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f53577x5a2cbf72);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glEnableVertexAttribArray aPositionHandle");
        android.opengl.GLES20.glUniformMatrix3fv(this.f53595x5c67aa5e, 1, false, fArr, 0);
        android.opengl.GLES20.glUniform2f(this.f53597xd5f4590f, i19, i27);
        android.opengl.GLES20.glUniform2f(this.f53596x560535aa, this.f53587xe02fec3, this.f53586x988ddfca);
        int i29 = i17 == 2 ? this.f53581x1f80839b : i17 == 5 ? this.f53582x30e0598d : -1;
        if (!this.f53598xce2aa504 || (i28 = this.f53593xd5e2117a) == -1 || this.f53594x7814ad14 == -1) {
            return;
        }
        if (i29 == -1) {
            android.opengl.GLES20.glUniform1i(i28, 0);
            return;
        }
        android.opengl.GLES20.glUniform1i(i28, 1);
        android.opengl.GLES20.glActiveTexture(33987);
        android.opengl.GLES20.glBindTexture(3553, i29);
        android.opengl.GLES20.glUniform1i(this.f53594x7814ad14, 3);
    }

    /* renamed from: process */
    public int m102785xed8d1e6f(int i17, int i18, int i19, int i27) {
        if (this.f53587xe02fec3 != i19 || this.f53586x988ddfca != i27) {
            this.f53587xe02fec3 = i19;
            this.f53586x988ddfca = i27;
            m102777x76a91cdd();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26427xcc87be5d.Rectangle rectangle = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3044xb408cb78.C26427xcc87be5d.Rectangle(0.0f, 0.0f, i19, i27);
        float f17 = rectangle.f297076x;
        float f18 = rectangle.f297077y;
        float f19 = rectangle.f53599xb7389127;
        float f27 = rectangle.f53600x6be2dc6;
        this.f53591x8f564e21.rewind();
        this.f53591x8f564e21.put(new float[]{f17, f18 + f19, f17, f18, f17 + f27, f19 + f18, f17 + f27, f18});
        android.opengl.GLES20.glGetIntegerv(2978, this.f53579xbe6c6207, 0);
        int i28 = this.f53580xdab7a40d;
        if (i28 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i28);
            android.opengl.GLES20.glGetIntegerv(2978, this.f53579xbe6c6207, 0);
            android.opengl.GLES20.glViewport(0, 0, this.f53587xe02fec3, this.f53586x988ddfca);
        }
        android.opengl.GLES20.glUseProgram(this.f53585xed8f1e84);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.f53590xe486364a, 1, false, m102780xe11f11bd(this.f53589x2b6c8582), 0);
        android.opengl.GLES20.glUniform1f(this.f53592xfe4c4971, 1.0f);
        m102784xb1bad2eb(i17, i18, m102780xe11f11bd(this.f53584xbf8d97c1), i19, i27);
        int i29 = this.f53578xf3ca161e;
        android.opengl.GLES20.glClearColor(((16711680 & i29) >> 16) / 255.0f, ((65280 & i29) >> 8) / 255.0f, (i29 & 255) / 255.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("glDrawArrays");
        m102782x449bac77();
        if (this.f53580xdab7a40d != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.f53579xbe6c6207;
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        return this.f53583x3e145189;
    }
}

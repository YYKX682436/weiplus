package com.p314xaae8f345.tav.p2959x5befac44.ofs;

/* renamed from: com.tencent.tav.decoder.ofs.OESTextureBlitter */
/* loaded from: classes14.dex */
public class C25810x25c39e0e {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f48406x4d57ec70 = 4;

    /* renamed from: FRAGMENT_SHADER_OES */
    private static final java.lang.String f48407x67934332 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nvoid main() {\n  gl_FragColor = texture2D(sTextureOES, vTextureCoord);\n}\n";

    /* renamed from: FRAGMENT_SHADER_OES_LUT */
    private static final java.lang.String f48408x1926b15e = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform sampler2D lookupTexture;\nvoid main() {\n  vec4 textureColor = texture2D(sTextureOES, vTextureCoord);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture2D(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture2D(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  gl_FragColor = textureColor;\n}\n";

    /* renamed from: TRIANGLE_VERTICES_DATA_POS_OFFSET */
    private static final int f48409x39646ac4 = 0;

    /* renamed from: TRIANGLE_VERTICES_DATA_STRIDE_BYTES */
    private static final int f48410x3d85cbab = 20;

    /* renamed from: TRIANGLE_VERTICES_DATA_UV_OFFSET */
    private static final int f48411x67a9856b = 3;

    /* renamed from: VERTEX_SHADER */
    private static final java.lang.String f48412xeb40e2e0 = "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nuniform mat4 uSTMatrix;\nuniform mat4 uMVPMatrix;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: sVerticesData */
    private static final float[] f48413x33ad6756 = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: aPositionHandle */
    private int f48414x5a2cbf72;

    /* renamed from: aTextureCoordHandle */
    private int f48415xc805b3a3;

    /* renamed from: lutBitmap */
    private android.graphics.Bitmap f48420x75b90d1a;

    /* renamed from: mvpMatrixHandle */
    private int f48422x127fb6d0;

    /* renamed from: program */
    protected int f48423xed8f1e84;

    /* renamed from: stMatrixHandle */
    private int f48425xe486364a;

    /* renamed from: triangleVertices */
    private final java.nio.FloatBuffer f48426x8f564e21;

    /* renamed from: lookupTextureHandle */
    private int f48418x5069ebc9 = -1;

    /* renamed from: lookupTextureId */
    private int f48419xa141833c = -1;

    /* renamed from: mvpMatrix */
    private float[] f48421xb09a6288 = new float[16];

    /* renamed from: shaderIndexes */
    private final int[] f48424xb4b1ad5b = new int[2];

    /* renamed from: frameBuffer */
    private int f48417xdab7a40d = -1;

    /* renamed from: defaultViewport */
    private final int[] f48416xbe6c6207 = new int[4];

    public C25810x25c39e0e() {
        float[] fArr = f48413x33ad6756;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f48426x8f564e21 = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        android.opengl.Matrix.setIdentityM(this.f48421xb09a6288, 0);
    }

    /* renamed from: initFrameBuffer */
    private void m97849x76a91cdd() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        this.f48417xdab7a40d = iArr[0];
    }

    /* renamed from: isUseLut */
    private boolean m97850xf65796ce() {
        return this.f48419xa141833c > -1;
    }

    /* renamed from: applyScale */
    public void m97851x4a38a7c(float f17) {
        android.opengl.Matrix.scaleM(this.f48421xb09a6288, 0, f17, f17, f17);
    }

    /* renamed from: blitTo */
    public void m97852xad5e5050(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, float[] fArr, int i17) {
        m97853xad5e5050(c25745xc3945049, fArr, i17, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
    }

    /* renamed from: finishDraw */
    public void m97854x449bac77(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, 0);
    }

    /* renamed from: initShaders */
    public void m97855xc918e5fe(java.lang.String str, java.lang.String str2) {
        int m97614x737641e8 = com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.m97614x737641e8(str, str2, this.f48424xb4b1ad5b);
        this.f48423xed8f1e84 = m97614x737641e8;
        if (m97614x737641e8 == 0) {
            new java.lang.RuntimeException("failed creating program");
            return;
        }
        this.f48414x5a2cbf72 = android.opengl.GLES20.glGetAttribLocation(m97614x737641e8, "aPosition");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetAttribLocation aPosition");
        if (this.f48414x5a2cbf72 == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.f48415xc805b3a3 = android.opengl.GLES20.glGetAttribLocation(this.f48423xed8f1e84, "aTextureCoord");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetAttribLocation aTextureCoord");
        if (this.f48415xc805b3a3 == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aTextureCoord");
            return;
        }
        this.f48422x127fb6d0 = android.opengl.GLES20.glGetUniformLocation(this.f48423xed8f1e84, "uMVPMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uMVPMatrix");
        if (this.f48422x127fb6d0 == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMVPMatrix");
            return;
        }
        this.f48425xe486364a = android.opengl.GLES20.glGetUniformLocation(this.f48423xed8f1e84, "uSTMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uSTMatrix");
        if (this.f48425xe486364a == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uSTMatrix");
        } else {
            this.f48418x5069ebc9 = android.opengl.GLES20.glGetUniformLocation(this.f48423xed8f1e84, "lookupTexture");
        }
    }

    /* renamed from: release */
    public void m97856x41012807() {
        int i17 = this.f48417xdab7a40d;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.f48417xdab7a40d = -1;
        }
        int i18 = this.f48423xed8f1e84;
        if (i18 > 0) {
            android.opengl.GLES20.glDeleteProgram(i18);
            this.f48423xed8f1e84 = 0;
        }
        int i19 = this.f48419xa141833c;
        if (i19 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i19}, 0);
            this.f48419xa141833c = -1;
        }
        int i27 = 0;
        while (true) {
            int[] iArr = this.f48424xb4b1ad5b;
            if (i27 >= iArr.length) {
                return;
            }
            int i28 = iArr[i27];
            if (i28 > 0) {
                android.opengl.GLES20.glDeleteShader(i28);
                this.f48424xb4b1ad5b[i27] = 0;
            }
            i27++;
        }
    }

    /* renamed from: setLut */
    public void m97857xca027c49(android.graphics.Bitmap bitmap) {
        this.f48420x75b90d1a = bitmap;
        if (bitmap != null && bitmap.isRecycled()) {
            this.f48420x75b90d1a = null;
        }
        int i17 = this.f48423xed8f1e84;
        if (i17 > 0) {
            android.opengl.GLES20.glDeleteProgram(i17);
            this.f48423xed8f1e84 = 0;
        }
        if (this.f48420x75b90d1a == null) {
            int i18 = this.f48419xa141833c;
            if (i18 != -1) {
                android.opengl.GLES20.glDeleteTextures(1, new int[]{i18}, 0);
                this.f48419xa141833c = -1;
                return;
            }
            return;
        }
        if (this.f48419xa141833c == -1) {
            int[] iArr = {-1};
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            this.f48419xa141833c = iArr[0];
        }
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLUtils.texImage2D(3553, 0, this.f48420x75b90d1a, 0);
    }

    /* renamed from: setMVPMatrix */
    public void m97858x736e9046(float[] fArr) {
        this.f48421xb09a6288 = fArr;
    }

    /* renamed from: setRotationDegrees */
    public void m97859x61569507(int i17) {
        android.opengl.Matrix.setRotateM(this.f48421xb09a6288, 0, i17, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: blitTo */
    public void m97853xad5e5050(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, float[] fArr, int i17, int i18, int i19) {
        if (this.f48417xdab7a40d == -1 && i17 >= 0) {
            m97849x76a91cdd();
        }
        boolean m97850xf65796ce = m97850xf65796ce();
        if (this.f48423xed8f1e84 == 0) {
            m97855xc918e5fe(f48412xeb40e2e0, m97850xf65796ce ? f48408x1926b15e : f48407x67934332);
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("onDrawFrame start");
        android.opengl.GLES20.glGetIntegerv(2978, this.f48416xbe6c6207, 0);
        int i27 = this.f48417xdab7a40d;
        if (i27 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i27);
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindFramebuffer frameBuffer");
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glCheckFramebufferStatus frameBuffer");
            if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
                new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
                return;
            } else {
                android.opengl.GLES20.glGetIntegerv(2978, this.f48416xbe6c6207, 0);
                android.opengl.GLES20.glViewport(0, 0, i18, i19);
            }
        }
        android.opengl.GLES20.glUseProgram(this.f48423xed8f1e84);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glUseProgram");
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, c25745xc3945049.f47890xc35d0376);
        if (this.f48419xa141833c != -1) {
            android.opengl.GLES20.glActiveTexture(33987);
            android.opengl.GLES20.glBindTexture(3553, this.f48419xa141833c);
            android.opengl.GLES20.glUniform1i(this.f48418x5069ebc9, 3);
        }
        this.f48426x8f564e21.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f48414x5a2cbf72, 3, 5126, false, 20, (java.nio.Buffer) this.f48426x8f564e21);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glVertexAttribPointer aPositionHandle");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f48414x5a2cbf72);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glEnableVertexAttribArray aPositionHandle");
        this.f48426x8f564e21.position(3);
        android.opengl.GLES20.glVertexAttribPointer(this.f48415xc805b3a3, 2, 5126, false, 20, (java.nio.Buffer) this.f48426x8f564e21);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glVertexAttribPointer aTextureCoordHandle");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f48415xc805b3a3);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glEnableVertexAttribArray aTextureCoordHandle");
        android.opengl.GLES20.glUniformMatrix4fv(this.f48425xe486364a, 1, false, fArr, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f48422x127fb6d0, 1, false, this.f48421xb09a6288, 0);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glDrawArrays");
        m97854x449bac77(c25745xc3945049);
        android.opengl.GLES20.glFinish();
        if (this.f48417xdab7a40d != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.f48416xbe6c6207;
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
    }
}

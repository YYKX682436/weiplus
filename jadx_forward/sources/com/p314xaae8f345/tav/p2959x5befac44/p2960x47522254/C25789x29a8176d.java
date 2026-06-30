package com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254;

/* renamed from: com.tencent.tav.decoder.decodecache.CopyFilter */
/* loaded from: classes14.dex */
class C25789x29a8176d {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f48328x4d57ec70 = 4;

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f48329xb30c5cb4 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float uAlpha;\nvoid main() {\n   vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_OES */
    private static final java.lang.String f48330x67934332 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTextureOES, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String TAG = "MultiTextureFilter";

    /* renamed from: TRIANGLE_VERTICES_DATA_POS_OFFSET */
    private static final int f48331x39646ac4 = 0;

    /* renamed from: TRIANGLE_VERTICES_DATA_STRIDE_BYTES */
    private static final int f48332x3d85cbab = 8;

    /* renamed from: VERTEX_SHADER */
    private static final java.lang.String f48333xeb40e2e0 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";

    /* renamed from: aPositionHandle */
    private int f48335x5a2cbf72;

    /* renamed from: program */
    protected int f48338xed8f1e84;

    /* renamed from: rendererHeight */
    private int f48340x988ddfca;

    /* renamed from: rendererWidth */
    private int f48341xe02fec3;

    /* renamed from: stMatrixHandle */
    private int f48343xe486364a;

    /* renamed from: triangleVertices */
    private java.nio.FloatBuffer f48344x8f564e21;

    /* renamed from: uAlphaHandle */
    private int f48345xfe4c4971;

    /* renamed from: uMatrixHandle */
    private int f48346x5c67aa5e;

    /* renamed from: uScreenSizeHandle */
    private int f48347x560535aa;

    /* renamed from: uTextureSizeHandle */
    private int f48348xd5f4590f;

    /* renamed from: renderForScreen */
    private boolean f48339xdc00059f = false;

    /* renamed from: shaderIndexes */
    private final int[] f48342xb4b1ad5b = new int[2];

    /* renamed from: _textureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48334x3b1706aa = null;

    /* renamed from: frameBuffer */
    private int f48337xdab7a40d = -1;

    /* renamed from: defaultViewport */
    private int[] f48336xbe6c6207 = new int[4];

    /* renamed from: initFrameBuffer */
    private void m97776x76a91cdd(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (c25745xc3945049.f47893x602fd2f5 != 3553) {
            throw new java.lang.RuntimeException("纹理类型不可为OES");
        }
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, this.f48341xe02fec3, this.f48340x988ddfca, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        this.f48334x3b1706aa = c25745xc3945049;
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        int i17 = iArr[0];
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindFramebuffer frameBuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, c25745xc3945049.f47890xc35d0376, 0);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glCheckFramebufferStatus frameBuffer");
        if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
            new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
            return;
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        this.f48337xdab7a40d = i17;
        c25745xc3945049.m97287x4af35e4b(i17);
    }

    /* renamed from: applyFilter */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97777x79f87086(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        return m97778x79f87086(c25745xc3945049, null);
    }

    /* renamed from: clearBufferBuffer */
    public void m97779xca4e38d(int i17) {
        int i18 = this.f48337xdab7a40d;
        if (i18 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i18);
            android.opengl.GLES20.glClearColor(((16711680 & i17) >> 16) / 255.0f, ((65280 & i17) >> 8) / 255.0f, (i17 & 255) / 255.0f, 1.0f);
            android.opengl.GLES20.glClear(16384);
        }
    }

    /* renamed from: finishDraw */
    public void m97780x449bac77(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, 0);
    }

    /* renamed from: getRendererHeight */
    public int m97781x8725acc0() {
        return this.f48340x988ddfca;
    }

    /* renamed from: getRendererWidth */
    public int m97782xcb62bb0d() {
        return this.f48341xe02fec3;
    }

    /* renamed from: initShaderForTextureInfo */
    public void m97783x24d49c55(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (c25745xc3945049.f47893x602fd2f5 == 36197) {
            m97784xc918e5fe(f48333xeb40e2e0, f48330x67934332);
        } else {
            m97784xc918e5fe(f48333xeb40e2e0, f48329xb30c5cb4);
        }
    }

    /* renamed from: initShaders */
    public void m97784xc918e5fe(java.lang.String str, java.lang.String str2) {
        this.f48344x8f564e21 = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        int m97614x737641e8 = com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.m97614x737641e8(str, str2, this.f48342xb4b1ad5b);
        this.f48338xed8f1e84 = m97614x737641e8;
        if (m97614x737641e8 == 0) {
            new java.lang.RuntimeException("failed creating program");
            return;
        }
        this.f48335x5a2cbf72 = android.opengl.GLES20.glGetAttribLocation(m97614x737641e8, "aPosition");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetAttribLocation aPosition");
        if (this.f48335x5a2cbf72 == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.f48346x5c67aa5e = android.opengl.GLES20.glGetUniformLocation(this.f48338xed8f1e84, "uMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uMatrix");
        if (this.f48346x5c67aa5e == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMatrix");
            return;
        }
        this.f48345xfe4c4971 = android.opengl.GLES20.glGetUniformLocation(this.f48338xed8f1e84, "uAlpha");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uAlpha");
        if (this.f48345xfe4c4971 == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uAlpha");
            return;
        }
        this.f48343xe486364a = android.opengl.GLES20.glGetUniformLocation(this.f48338xed8f1e84, "stMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation stMatrix");
        if (this.f48343xe486364a == -1) {
            new java.lang.RuntimeException("Could not get uniform location for stMatrix");
            return;
        }
        this.f48347x560535aa = android.opengl.GLES20.glGetUniformLocation(this.f48338xed8f1e84, "uScreenSize");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uScreenSize");
        if (this.f48347x560535aa == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uScreenSize");
            return;
        }
        this.f48348xd5f4590f = android.opengl.GLES20.glGetUniformLocation(this.f48338xed8f1e84, "uTextureSize");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uTextureSize");
        if (this.f48348xd5f4590f == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uTextureSize");
        }
    }

    /* renamed from: prepareDraw */
    public void m97785xb1bad2eb(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, float[] fArr) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, c25745xc3945049.f47890xc35d0376);
        this.f48344x8f564e21.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f48335x5a2cbf72, 2, 5126, false, 8, (java.nio.Buffer) this.f48344x8f564e21);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f48335x5a2cbf72);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glEnableVertexAttribArray aPositionHandle");
        android.opengl.GLES20.glUniformMatrix3fv(this.f48346x5c67aa5e, 1, false, fArr, 0);
        android.opengl.GLES20.glUniform2f(this.f48348xd5f4590f, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        android.opengl.GLES20.glUniform2f(this.f48347x560535aa, this.f48341xe02fec3, this.f48340x988ddfca);
    }

    /* renamed from: release */
    public void m97786x41012807() {
        m97788xe0c07f14();
        m97787x22d1c87d();
        int i17 = 0;
        while (true) {
            int[] iArr = this.f48342xb4b1ad5b;
            if (i17 >= iArr.length) {
                return;
            }
            int i18 = iArr[i17];
            if (i18 > 0) {
                android.opengl.GLES20.glDeleteShader(i18);
                this.f48342xb4b1ad5b[i17] = 0;
            }
            i17++;
        }
    }

    /* renamed from: releaseProgram */
    public void m97787x22d1c87d() {
        int i17 = this.f48338xed8f1e84;
        if (i17 > 0) {
            android.opengl.GLES20.glDeleteProgram(i17);
            this.f48338xed8f1e84 = 0;
        }
    }

    /* renamed from: releaseTexture */
    public void m97788xe0c07f14() {
        int i17 = this.f48337xdab7a40d;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.f48337xdab7a40d = -1;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48334x3b1706aa;
        if (c25745xc3945049 != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{c25745xc3945049.f47890xc35d0376}, 0);
            this.f48334x3b1706aa = null;
        }
    }

    /* renamed from: setDesTextureInfo */
    public void m97789x434421f9(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (c25745xc3945049.m97277xb48dead7() == -1) {
            m97776x76a91cdd(c25745xc3945049);
        } else {
            this.f48337xdab7a40d = c25745xc3945049.m97277xb48dead7();
        }
        this.f48334x3b1706aa = c25745xc3945049;
    }

    /* renamed from: setRenderForScreen */
    public void m97790xf73870dd(boolean z17) {
        this.f48339xdc00059f = z17;
    }

    /* renamed from: setRendererHeight */
    public void m97791x4f1c14cc(int i17) {
        this.f48340x988ddfca = i17;
    }

    /* renamed from: setRendererWidth */
    public void m97792x5e392181(int i17) {
        this.f48341xe02fec3 = i17;
    }

    /* renamed from: textureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97793x602aa869() {
        return this.f48334x3b1706aa;
    }

    /* renamed from: applyFilter */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97778x79f87086(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, android.graphics.Matrix matrix) {
        if (!this.f48339xdc00059f && this.f48337xdab7a40d == -1) {
            m97776x76a91cdd(this.f48334x3b1706aa);
        }
        if (this.f48338xed8f1e84 == 0) {
            m97783x24d49c55(c25745xc3945049);
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("onDrawFrame start");
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468 = new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(0.0f, 0.0f, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        float f17 = c25731x76640468.f47829xc3e1af26.x + c25731x76640468.f47830x35e001.f47833x6be2dc6;
        int i17 = c25745xc3945049.f47894x6be2dc6;
        if (f17 > i17) {
            f17 = i17;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "applyFilter: crop right pixel exceed texture width");
        }
        float f18 = c25731x76640468.f47829xc3e1af26.y + c25731x76640468.f47830x35e001.f47832xb7389127;
        int i18 = c25745xc3945049.f47883xb7389127;
        if (f18 > i18) {
            f18 = i18;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "applyFilter: crop bottom pixel exceed texture height");
        }
        android.graphics.PointF pointF = c25731x76640468.f47829xc3e1af26;
        float f19 = pointF.x;
        float f27 = pointF.y;
        this.f48344x8f564e21.rewind();
        this.f48344x8f564e21.put(new float[]{f19, f18, f19, f27, f17, f18, f17, f27});
        android.opengl.GLES20.glGetIntegerv(2978, this.f48336xbe6c6207, 0);
        int i19 = this.f48337xdab7a40d;
        if (i19 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i19);
            android.opengl.GLES20.glGetIntegerv(2978, this.f48336xbe6c6207, 0);
            android.opengl.GLES20.glViewport(0, 0, this.f48341xe02fec3, this.f48340x988ddfca);
        }
        android.opengl.GLES20.glUseProgram(this.f48338xed8f1e84);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.f48343xe486364a, 1, false, com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97473xe11f11bd(matrix), 0);
        android.opengl.GLES20.glUniform1f(this.f48345xfe4c4971, 1.0f);
        m97785xb1bad2eb(c25745xc3945049, com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97473xe11f11bd(null));
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glDrawArrays");
        m97780x449bac77(c25745xc3945049);
        if (this.f48337xdab7a40d != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.f48336xbe6c6207;
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        if (this.f48339xdc00059f) {
            return null;
        }
        return this.f48334x3b1706aa;
    }
}

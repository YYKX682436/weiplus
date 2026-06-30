package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.Filter */
/* loaded from: classes14.dex */
public class C25765x7d6db798 {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f48073x4d57ec70 = 4;

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f48074xb30c5cb4 = "#version 300 es\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float uAlpha;\nout vec4 outColor;\nvoid main() {\n   vec4 color = texture(sTexture, vTextureCoord);\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_2 */
    private static final java.lang.String f48075x21680b67 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float uAlpha;\nvoid main() {\n   vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_OES */
    private static final java.lang.String f48076x67934332 = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_OES_EGL_image_external_essl3 : enable\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_OES_2 */
    private static final java.lang.String f48077xcfcf4a65 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTextureOES, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: TRIANGLE_VERTICES_DATA_POS_OFFSET */
    private static final int f48078x39646ac4 = 0;

    /* renamed from: TRIANGLE_VERTICES_DATA_STRIDE_BYTES */
    private static final int f48079x3d85cbab = 8;

    /* renamed from: VERTEX_SHADER */
    private static final java.lang.String f48080xeb40e2e0 = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";

    /* renamed from: VERTEX_SHADER_2 */
    private static final java.lang.String f48081x1e93b693 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";

    /* renamed from: aPositionHandle */
    private int f48083x5a2cbf72;

    /* renamed from: program */
    protected int f48087xed8f1e84;

    /* renamed from: rendererHeight */
    private int f48089x988ddfca;

    /* renamed from: rendererWidth */
    private int f48090xe02fec3;

    /* renamed from: stMatrixHandle */
    private int f48092xe486364a;

    /* renamed from: triangleVertices */
    private java.nio.FloatBuffer f48093x8f564e21;

    /* renamed from: uAlphaHandle */
    private int f48094xfe4c4971;

    /* renamed from: uMatrixHandle */
    private int f48097x5c67aa5e;

    /* renamed from: uScreenSizeHandle */
    private int f48098x560535aa;

    /* renamed from: uTextureSizeHandle */
    private int f48099xd5f4590f;

    /* renamed from: renderForScreen */
    private boolean f48088xdc00059f = true;

    /* renamed from: uCropHandle */
    private int f48095xb1fb772d = -1;

    /* renamed from: uCropRectHandle */
    private int f48096x4215b7b1 = -1;

    /* renamed from: bgColor */
    private int f48084xf3ca161e = -16777216;

    /* renamed from: shaderIndexes */
    private final int[] f48091xb4b1ad5b = new int[2];

    /* renamed from: _textureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48082x3b1706aa = null;

    /* renamed from: frameBuffer */
    private int f48086xdab7a40d = -1;

    /* renamed from: defaultViewport */
    private int[] f48085xbe6c6207 = new int[4];

    /* renamed from: initFrameBuffer */
    private void m97523x76a91cdd() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        android.opengl.GLES20.glBindTexture(3553, i17);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glTexParameter");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, this.f48090xe02fec3, this.f48089x988ddfca, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        this.f48082x3b1706aa = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(i17, 3553, this.f48090xe02fec3, this.f48089x988ddfca, null, 0);
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
        int i18 = iArr2[0];
        android.opengl.GLES20.glBindFramebuffer(36160, i18);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindFramebuffer frameBuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glCheckFramebufferStatus frameBuffer");
        if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
            new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
        } else {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            this.f48086xdab7a40d = i18;
        }
    }

    /* renamed from: initOESShaderExtraInfo */
    private void m97524x86cb248c() {
        this.f48095xb1fb772d = android.opengl.GLES20.glGetUniformLocation(this.f48087xed8f1e84, "uIsCrop");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uCropHandle");
        if (this.f48095xb1fb772d == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uCropHandle");
            return;
        }
        this.f48096x4215b7b1 = android.opengl.GLES20.glGetUniformLocation(this.f48087xed8f1e84, "uCropRect");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uCropRectHandle");
        if (this.f48096x4215b7b1 == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uCropRectHandle");
        }
    }

    /* renamed from: applyFilter */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97525x79f87086(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        return mo97527x79f87086(c25745xc3945049, null, null, 1.0f);
    }

    /* renamed from: equals */
    public boolean mo97530xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 c25765x7d6db798 = (com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798) obj;
        return this.f48089x988ddfca == c25765x7d6db798.f48089x988ddfca && this.f48090xe02fec3 == c25765x7d6db798.f48090xe02fec3 && this.f48088xdc00059f == c25765x7d6db798.f48088xdc00059f;
    }

    /* renamed from: finishDraw */
    public void mo97531x449bac77(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, 0);
    }

    /* renamed from: getFrameBuffer */
    public int mo97532xb48dead7() {
        return this.f48086xdab7a40d;
    }

    /* renamed from: getRendererHeight */
    public int mo97533x8725acc0() {
        return this.f48089x988ddfca;
    }

    /* renamed from: getRendererWidth */
    public int mo97534xcb62bb0d() {
        return this.f48090xe02fec3;
    }

    /* renamed from: hashCode */
    public int mo97535x8cdac1b() {
        return ((((((((((((((((((((((0 + this.f48087xed8f1e84) * 31) + this.f48098x560535aa) * 31) + this.f48099xd5f4590f) * 31) + this.f48097x5c67aa5e) * 31) + this.f48094xfe4c4971) * 31) + this.f48092xe486364a) * 31) + this.f48083x5a2cbf72) * 31) + this.f48090xe02fec3) * 31) + this.f48089x988ddfca) * 31) + (this.f48088xdc00059f ? 1 : 0)) * 31) + this.f48086xdab7a40d) * 31) + java.util.Arrays.hashCode(this.f48085xbe6c6207);
    }

    /* renamed from: initShaderForTextureInfo */
    public void mo97536x24d49c55(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        boolean z17 = c25745xc3945049.m97281x3a04e469() == null || com.p314xaae8f345.tav.C25632x4e42091.m96109x923ccc82();
        if (c25745xc3945049.f47893x602fd2f5 != 36197) {
            if (z17) {
                mo97537xc918e5fe(f48081x1e93b693, f48075x21680b67);
                return;
            } else {
                mo97537xc918e5fe(f48080xeb40e2e0, f48074xb30c5cb4);
                return;
            }
        }
        if (z17) {
            mo97537xc918e5fe(f48081x1e93b693, f48077xcfcf4a65);
        } else {
            mo97537xc918e5fe(f48080xeb40e2e0, f48076x67934332);
            m97524x86cb248c();
        }
    }

    /* renamed from: initShaders */
    public void mo97537xc918e5fe(java.lang.String str, java.lang.String str2) {
        this.f48093x8f564e21 = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        int m97614x737641e8 = com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.m97614x737641e8(str, str2, this.f48091xb4b1ad5b);
        this.f48087xed8f1e84 = m97614x737641e8;
        if (m97614x737641e8 == 0) {
            new java.lang.RuntimeException("failed creating program");
            return;
        }
        this.f48083x5a2cbf72 = android.opengl.GLES20.glGetAttribLocation(m97614x737641e8, "aPosition");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetAttribLocation aPosition");
        if (this.f48083x5a2cbf72 == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.f48097x5c67aa5e = android.opengl.GLES20.glGetUniformLocation(this.f48087xed8f1e84, "uMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uMatrix");
        if (this.f48097x5c67aa5e == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMatrix");
            return;
        }
        this.f48094xfe4c4971 = android.opengl.GLES20.glGetUniformLocation(this.f48087xed8f1e84, "uAlpha");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uAlpha");
        if (this.f48094xfe4c4971 == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uAlpha");
            return;
        }
        this.f48092xe486364a = android.opengl.GLES20.glGetUniformLocation(this.f48087xed8f1e84, "stMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation stMatrix");
        if (this.f48092xe486364a == -1) {
            new java.lang.RuntimeException("Could not get uniform location for stMatrix");
            return;
        }
        this.f48098x560535aa = android.opengl.GLES20.glGetUniformLocation(this.f48087xed8f1e84, "uScreenSize");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uScreenSize");
        if (this.f48098x560535aa == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uScreenSize");
            return;
        }
        this.f48099xd5f4590f = android.opengl.GLES20.glGetUniformLocation(this.f48087xed8f1e84, "uTextureSize");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uTextureSize");
        if (this.f48099xd5f4590f == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uTextureSize");
        }
    }

    /* renamed from: prepareDraw */
    public void mo97538xb1bad2eb(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, float[] fArr) {
        android.graphics.Rect m97281x3a04e469;
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, c25745xc3945049.f47890xc35d0376);
        this.f48093x8f564e21.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f48083x5a2cbf72, 2, 5126, false, 8, (java.nio.Buffer) this.f48093x8f564e21);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f48083x5a2cbf72);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glEnableVertexAttribArray aPositionHandle");
        android.opengl.GLES20.glUniformMatrix3fv(this.f48097x5c67aa5e, 1, false, fArr, 0);
        android.opengl.GLES20.glUniform2f(this.f48099xd5f4590f, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        android.opengl.GLES20.glUniform2f(this.f48098x560535aa, this.f48090xe02fec3, this.f48089x988ddfca);
        if (c25745xc3945049.f47893x602fd2f5 != 36197 || this.f48095xb1fb772d == -1 || this.f48096x4215b7b1 == -1 || (m97281x3a04e469 = c25745xc3945049.m97281x3a04e469()) == null || m97281x3a04e469.right <= m97281x3a04e469.left || m97281x3a04e469.bottom <= m97281x3a04e469.top) {
            return;
        }
        android.opengl.GLES20.glUniform1i(this.f48095xb1fb772d, 1);
        android.opengl.GLES20.glUniform4f(this.f48096x4215b7b1, m97281x3a04e469.left, m97281x3a04e469.top, m97281x3a04e469.right, m97281x3a04e469.bottom);
    }

    /* renamed from: release */
    public void mo97539x41012807() {
        int i17 = this.f48086xdab7a40d;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.f48086xdab7a40d = -1;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48082x3b1706aa;
        if (c25745xc3945049 != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{c25745xc3945049.f47890xc35d0376}, 0);
            this.f48082x3b1706aa = null;
        }
        int i18 = this.f48087xed8f1e84;
        if (i18 > 0) {
            android.opengl.GLES20.glDeleteProgram(i18);
            this.f48087xed8f1e84 = 0;
        }
        int i19 = 0;
        while (true) {
            int[] iArr = this.f48091xb4b1ad5b;
            if (i19 >= iArr.length) {
                return;
            }
            int i27 = iArr[i19];
            if (i27 > 0) {
                android.opengl.GLES20.glDeleteShader(i27);
                this.f48091xb4b1ad5b[i19] = 0;
            }
            i19++;
        }
    }

    /* renamed from: setBgColor */
    public void mo97540xa5089f5c(int i17) {
        this.f48084xf3ca161e = i17;
    }

    /* renamed from: setRenderForScreen */
    public void mo97541xf73870dd(boolean z17) {
        this.f48088xdc00059f = z17;
    }

    /* renamed from: setRendererHeight */
    public void mo97542x4f1c14cc(int i17) {
        this.f48089x988ddfca = i17;
    }

    /* renamed from: setRendererWidth */
    public void mo97543x5e392181(int i17) {
        this.f48090xe02fec3 = i17;
    }

    /* renamed from: textureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97544x602aa869() {
        return this.f48082x3b1706aa;
    }

    /* renamed from: applyFilter */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97526x79f87086(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        return mo97527x79f87086(c25745xc3945049, matrix, matrix2, 1.0f);
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 mo97529x5a5dd5d() {
        return new com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798();
    }

    /* renamed from: applyFilter */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo97527x79f87086(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17) {
        if (!this.f48088xdc00059f && this.f48086xdab7a40d == -1) {
            m97523x76a91cdd();
        }
        if (this.f48087xed8f1e84 == 0) {
            mo97536x24d49c55(c25745xc3945049);
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("onDrawFrame start");
        com.p314xaae8f345.tav.p2959x5befac44.C25778xba47cd4f c25778xba47cd4f = new com.p314xaae8f345.tav.p2959x5befac44.C25778xba47cd4f(0.0f, 0.0f, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        float f18 = c25778xba47cd4f.f296867x;
        float f19 = c25778xba47cd4f.f296868y;
        float f27 = c25778xba47cd4f.f48184xb7389127;
        float f28 = c25778xba47cd4f.f48185x6be2dc6;
        this.f48093x8f564e21.rewind();
        this.f48093x8f564e21.put(new float[]{f18, f19 + f27, f18, f19, f18 + f28, f27 + f19, f18 + f28, f19});
        android.opengl.GLES20.glGetIntegerv(2978, this.f48085xbe6c6207, 0);
        int i17 = this.f48086xdab7a40d;
        if (i17 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i17);
            android.opengl.GLES20.glGetIntegerv(2978, this.f48085xbe6c6207, 0);
            android.opengl.GLES20.glViewport(0, 0, this.f48090xe02fec3, this.f48089x988ddfca);
        }
        android.opengl.GLES20.glUseProgram(this.f48087xed8f1e84);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.f48092xe486364a, 1, false, com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97473xe11f11bd(matrix2), 0);
        android.opengl.GLES20.glUniform1f(this.f48094xfe4c4971, f17);
        mo97538xb1bad2eb(c25745xc3945049, com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97473xe11f11bd(matrix));
        int i18 = this.f48084xf3ca161e;
        android.opengl.GLES20.glClearColor(((16711680 & i18) >> 16) / 255.0f, ((65280 & i18) >> 8) / 255.0f, (i18 & 255) / 255.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glDrawArrays");
        mo97531x449bac77(c25745xc3945049);
        if (this.f48086xdab7a40d != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.f48085xbe6c6207;
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        if (this.f48088xdc00059f) {
            return null;
        }
        return this.f48082x3b1706aa;
    }
}

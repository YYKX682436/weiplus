package com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tavkit.ciimage.TextureFilter */
/* loaded from: classes14.dex */
public class C25863x2a5f3c53 {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f48826x4d57ec70 = 4;

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f48827xb30c5cb4 = "#version 300 es\nuniform sampler2D sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_2 */
    private static final java.lang.String f48828x21680b67 = "uniform sampler2D sTexture;\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_END */
    private static final java.lang.String f48829x67931eb0 = "precision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_END_2 */
    private static final java.lang.String f48830xcf463e63 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_OES */
    private static final java.lang.String f48831x67934332 = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_OES_EGL_image_external_essl3 : enable\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: FRAGMENT_SHADER_OES_2 */
    private static final java.lang.String f48832xcfcf4a65 = "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";

    /* renamed from: TRIANGLE_VERTICES_DATA_POS_OFFSET */
    private static final int f48833x39646ac4 = 0;

    /* renamed from: TRIANGLE_VERTICES_DATA_STRIDE_BYTES */
    private static final int f48834x3d85cbab = 8;

    /* renamed from: VERTEX_SHADER */
    private static final java.lang.String f48835xeb40e2e0 = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";

    /* renamed from: VERTEX_SHADER_2 */
    private static final java.lang.String f48836x1e93b693 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private final java.lang.String TAG;

    /* renamed from: aPositionHandle */
    private int f48837x5a2cbf72;

    /* renamed from: glBlendStateCache */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25861xc39760fd f48838xb0edcfd;

    /* renamed from: outputFrameBufferId */
    private int f48839xe51b5e87;

    /* renamed from: outputTextureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48840xdbbb3ca8;

    /* renamed from: program */
    protected int f48841xed8f1e84;

    /* renamed from: rendererHeight */
    private int f48842x988ddfca;

    /* renamed from: rendererWidth */
    private int f48843xe02fec3;

    /* renamed from: shaderIndexes */
    private final int[] f48844xb4b1ad5b;

    /* renamed from: stMatrixHandle */
    private int f48845xe486364a;

    /* renamed from: triangleVertices */
    private java.nio.FloatBuffer f48846x8f564e21;

    /* renamed from: uAlphaHandle */
    private int f48847xfe4c4971;

    /* renamed from: uCropHandle */
    private int f48848xb1fb772d;

    /* renamed from: uCropRectHandle */
    private int f48849x4215b7b1;

    /* renamed from: uMatrixHandle */
    private int f48850x5c67aa5e;

    /* renamed from: uScreenSizeHandle */
    private int f48851x560535aa;

    /* renamed from: uTextureSizeHandle */
    private int f48852xd5f4590f;

    public C25863x2a5f3c53() {
        java.lang.String str = "TextureFilter@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.f48848xb1fb772d = -1;
        this.f48849x4215b7b1 = -1;
        this.f48844xb4b1ad5b = new int[2];
        this.f48840xdbbb3ca8 = null;
        this.f48839xe51b5e87 = -1;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str, "TextureFilter() called");
    }

    /* renamed from: checkAndInitFrameBuffer */
    private void m98392xc3e6012e(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        int m97277xb48dead7 = c25745xc3945049.m97277xb48dead7();
        if (m97277xb48dead7 == -1) {
            android.opengl.GLES20.glBindTexture(3553, c25745xc3945049.f47890xc35d0376);
            android.opengl.GLES20.glTexImage2D(3553, 0, c25745xc3945049.m97276x19771aed(), c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127, 0, c25745xc3945049.m97276x19771aed(), com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
            m97277xb48dead7 = iArr[0];
            android.opengl.GLES20.glBindFramebuffer(36160, m97277xb48dead7);
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindFramebuffer outputFrameBufferId");
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, c25745xc3945049.f47890xc35d0376, 0);
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glCheckFramebufferStatus outputFrameBufferId");
            if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
                new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
                return;
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
        }
        this.f48839xe51b5e87 = m97277xb48dead7;
        c25745xc3945049.m97287x4af35e4b(m97277xb48dead7);
        this.f48840xdbbb3ca8 = c25745xc3945049;
    }

    /* renamed from: finishDraw */
    private void m98393x449bac77(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, 0);
    }

    /* renamed from: initShaderForTextureInfo */
    private void m98394x24d49c55(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        boolean z17 = c25745xc3945049.m97281x3a04e469() == null || com.p314xaae8f345.tav.C25632x4e42091.m96109x923ccc82();
        if (c25745xc3945049.f47893x602fd2f5 == 36197) {
            if (z17) {
                m98395xc918e5fe(f48836x1e93b693, f48832xcfcf4a65, true);
                return;
            } else {
                m98395xc918e5fe(f48835xeb40e2e0, f48831x67934332, false);
                return;
            }
        }
        if (z17) {
            m98395xc918e5fe(f48836x1e93b693, f48828x21680b67, true);
        } else {
            m98395xc918e5fe(f48835xeb40e2e0, f48827xb30c5cb4, false);
        }
    }

    /* renamed from: initShaders */
    private void m98395xc918e5fe(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f48846x8f564e21 = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        int m97614x737641e8 = com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.m97614x737641e8(str, str2, this.f48844xb4b1ad5b);
        this.f48841xed8f1e84 = m97614x737641e8;
        if (m97614x737641e8 == 0) {
            new java.lang.RuntimeException("failed creating program");
            return;
        }
        this.f48837x5a2cbf72 = android.opengl.GLES20.glGetAttribLocation(m97614x737641e8, "aPosition");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetAttribLocation aPosition");
        if (this.f48837x5a2cbf72 == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.f48850x5c67aa5e = android.opengl.GLES20.glGetUniformLocation(this.f48841xed8f1e84, "uMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uMatrix");
        if (this.f48850x5c67aa5e == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMatrix");
            return;
        }
        this.f48847xfe4c4971 = android.opengl.GLES20.glGetUniformLocation(this.f48841xed8f1e84, "uAlpha");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uAlpha");
        if (this.f48847xfe4c4971 == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uAlpha");
            return;
        }
        if (!z17) {
            this.f48848xb1fb772d = android.opengl.GLES20.glGetUniformLocation(this.f48841xed8f1e84, "uIsCrop");
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uCropHandle");
            if (this.f48848xb1fb772d == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uCropHandle");
                return;
            }
            this.f48849x4215b7b1 = android.opengl.GLES20.glGetUniformLocation(this.f48841xed8f1e84, "uCropRect");
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uCropRectHandle");
            if (this.f48849x4215b7b1 == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uCropRectHandle");
                return;
            }
        }
        this.f48845xe486364a = android.opengl.GLES20.glGetUniformLocation(this.f48841xed8f1e84, "stMatrix");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation stMatrix");
        if (this.f48845xe486364a == -1) {
            new java.lang.RuntimeException("Could not get uniform location for stMatrix");
            return;
        }
        this.f48851x560535aa = android.opengl.GLES20.glGetUniformLocation(this.f48841xed8f1e84, "uScreenSize");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uScreenSize");
        if (this.f48851x560535aa == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uScreenSize");
            return;
        }
        this.f48852xd5f4590f = android.opengl.GLES20.glGetUniformLocation(this.f48841xed8f1e84, "uTextureSize");
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glGetUniformLocation uTextureSize");
        if (this.f48852xd5f4590f == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uTextureSize");
        }
    }

    /* renamed from: isEqualsCurrentOutputTexture */
    private boolean m98396x713ec70a(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = this.f48840xdbbb3ca8;
        if (c25745xc39450492 == null) {
            return false;
        }
        if (c25745xc39450492.m97275xb2c87fbf(c25745xc3945049)) {
            return true;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450493 = this.f48840xdbbb3ca8;
        return c25745xc39450493.f47890xc35d0376 == c25745xc3945049.f47890xc35d0376 && c25745xc39450493.f47894x6be2dc6 == c25745xc3945049.f47894x6be2dc6 && c25745xc39450493.f47883xb7389127 == c25745xc3945049.f47883xb7389127;
    }

    /* renamed from: prepareDraw */
    private void m98397xb1bad2eb(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, float[] fArr) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(c25745xc3945049.f47893x602fd2f5, c25745xc3945049.f47890xc35d0376);
        this.f48846x8f564e21.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f48837x5a2cbf72, 2, 5126, false, 8, (java.nio.Buffer) this.f48846x8f564e21);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f48837x5a2cbf72);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glEnableVertexAttribArray aPositionHandle");
        android.opengl.GLES20.glUniformMatrix3fv(this.f48850x5c67aa5e, 1, false, fArr, 0);
        android.opengl.GLES20.glUniform2f(this.f48852xd5f4590f, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        android.opengl.GLES20.glUniform2f(this.f48851x560535aa, this.f48843xe02fec3, this.f48842x988ddfca);
    }

    /* renamed from: applyFilter */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo98380x79f87086(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x766404682 = c25731x76640468;
        if (c25745xc3945049 == null) {
            return null;
        }
        if (this.f48838xb0edcfd == null) {
            this.f48838xb0edcfd = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25861xc39760fd();
        }
        this.f48838xb0edcfd.m98385x5a0af82();
        if (this.f48841xed8f1e84 == 0) {
            m98394x24d49c55(c25745xc3945049);
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("onDrawFrame start");
        if (c25731x766404682 == null) {
            c25731x766404682 = new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(0.0f, 0.0f, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        } else {
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = c25731x766404682.f47830x35e001;
            c25732x76648a85.f47833x6be2dc6 = java.lang.Math.min(c25745xc3945049.f47894x6be2dc6, c25732x76648a85.f47833x6be2dc6);
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a852 = c25731x766404682.f47830x35e001;
            c25732x76648a852.f47832xb7389127 = java.lang.Math.min(c25745xc3945049.f47883xb7389127, c25732x76648a852.f47832xb7389127);
        }
        float f18 = c25731x766404682.f47829xc3e1af26.x + c25731x766404682.f47830x35e001.f47833x6be2dc6;
        int i17 = c25745xc3945049.f47894x6be2dc6;
        if (f18 > i17) {
            f18 = i17;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "applyFilter: crop right pixel exceed texture width");
        }
        float f19 = c25731x766404682.f47829xc3e1af26.y + c25731x766404682.f47830x35e001.f47832xb7389127;
        int i18 = c25745xc3945049.f47883xb7389127;
        if (f19 > i18) {
            f19 = i18;
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "applyFilter: crop bottom pixel exceed texture height");
        }
        android.graphics.PointF pointF = c25731x766404682.f47829xc3e1af26;
        float f27 = pointF.x;
        float f28 = pointF.y;
        this.f48846x8f564e21.rewind();
        this.f48846x8f564e21.put(new float[]{f27, f19, f27, f28, f18, f19, f18, f28});
        int[] iArr = new int[4];
        android.opengl.GLES20.glGetIntegerv(2978, iArr, 0);
        int i19 = this.f48839xe51b5e87;
        if (i19 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i19);
            android.opengl.GLES20.glGetIntegerv(2978, iArr, 0);
            android.opengl.GLES20.glViewport(0, 0, this.f48843xe02fec3, this.f48842x988ddfca);
        }
        android.opengl.GLES20.glUseProgram(this.f48841xed8f1e84);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.f48845xe486364a, 1, false, com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97473xe11f11bd(matrix2), 0);
        android.opengl.GLES20.glUniform1f(this.f48847xfe4c4971, f17);
        android.graphics.Rect m97281x3a04e469 = c25745xc3945049.m97281x3a04e469();
        if (m97281x3a04e469 != null && m97281x3a04e469.right > m97281x3a04e469.left && m97281x3a04e469.bottom > m97281x3a04e469.top) {
            android.opengl.GLES20.glUniform1i(this.f48848xb1fb772d, 1);
            android.opengl.GLES20.glUniform4f(this.f48849x4215b7b1, m97281x3a04e469.left, m97281x3a04e469.top, m97281x3a04e469.right, m97281x3a04e469.bottom);
        }
        android.opengl.GLES20.glEnable(3042);
        if (c25745xc3945049.m97282x8e925bac()) {
            android.opengl.GLES20.glBlendEquationSeparate(32774, 32774);
            android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        } else {
            android.opengl.GLES20.glBlendEquationSeparate(32774, 32774);
            android.opengl.GLES20.glBlendFuncSeparate(1, 771, 1, 771);
        }
        m98397xb1bad2eb(c25745xc3945049, com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97473xe11f11bd(matrix));
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glDrawArrays");
        m98393x449bac77(c25745xc3945049);
        if (this.f48839xe51b5e87 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        this.f48838xb0edcfd.m98386x416ad28e();
        return this.f48840xdbbb3ca8;
    }

    /* renamed from: clearBufferBuffer */
    public void mo98381xca4e38d(int i17) {
        m98398xca4e38d(i17, 0.0f);
    }

    /* renamed from: release */
    public void mo98382x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release: start, thread = " + java.lang.Thread.currentThread().getName() + ", egl = " + android.opengl.EGL14.eglGetCurrentContext());
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48840xdbbb3ca8;
        if (c25745xc3945049 != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{c25745xc3945049.f47890xc35d0376}, 0);
            this.f48840xdbbb3ca8 = null;
        }
        int i17 = this.f48839xe51b5e87;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.f48839xe51b5e87 = -1;
        }
        int i18 = this.f48841xed8f1e84;
        if (i18 > 0) {
            android.opengl.GLES20.glDeleteProgram(i18);
            this.f48841xed8f1e84 = 0;
        }
        int i19 = 0;
        while (true) {
            int[] iArr = this.f48844xb4b1ad5b;
            if (i19 >= iArr.length) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release: end");
                return;
            }
            int i27 = iArr[i19];
            if (i27 > 0) {
                android.opengl.GLES20.glDeleteShader(i27);
                this.f48844xb4b1ad5b[i19] = 0;
            }
            i19++;
        }
    }

    /* renamed from: setOutputTextureInfo */
    public void mo98383xa85d066(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (c25745xc3945049 == null) {
            throw new java.lang.RuntimeException("outputTextureInfo 为空");
        }
        if (c25745xc3945049.m97284xafdb8087()) {
            throw new java.lang.RuntimeException("outputTextureInfo 已经被释放了");
        }
        if (c25745xc3945049.f47893x602fd2f5 != 3553) {
            throw new java.lang.RuntimeException("目标纹理类型需要GLES20.GL_TEXTURE_2D");
        }
        this.f48843xe02fec3 = c25745xc3945049.f47894x6be2dc6;
        this.f48842x988ddfca = c25745xc3945049.f47883xb7389127;
        if (m98396x713ec70a(c25745xc3945049)) {
            return;
        }
        m98392xc3e6012e(c25745xc3945049);
    }

    /* renamed from: toString */
    public java.lang.String mo98384x9616526c() {
        return "TextureFilter{program=" + this.f48841xed8f1e84 + ", rendererWidth=" + this.f48843xe02fec3 + ", rendererHeight=" + this.f48842x988ddfca + ", outputTextureInfo=" + this.f48840xdbbb3ca8 + ", outputFrameBufferId=" + this.f48839xe51b5e87 + '}';
    }

    /* renamed from: clearBufferBuffer */
    public void m98398xca4e38d(int i17, float f17) {
        int i18 = this.f48839xe51b5e87;
        if (i18 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i18);
            android.opengl.GLES20.glClearColor(((16711680 & i17) >> 16) / 255.0f, ((65280 & i17) >> 8) / 255.0f, (i17 & 255) / 255.0f, f17);
            android.opengl.GLES20.glClear(16384);
        }
    }
}

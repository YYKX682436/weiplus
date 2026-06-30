package androidx.camera.core.processing.util;

/* loaded from: classes14.dex */
public final class GLUtils {
    public static final java.lang.String BLANK_FRAGMENT_SHADER = "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n";
    public static final java.lang.String BLANK_VERTEX_SHADER = "uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n";
    public static final java.lang.String DEFAULT_VERTEX_SHADER;
    public static final java.lang.String HDR_VERTEX_SHADER;
    public static final androidx.camera.core.processing.util.OutputSurface NO_OUTPUT_SURFACE;
    public static final int PIXEL_STRIDE = 4;
    private static final androidx.camera.core.processing.ShaderProvider SHADER_PROVIDER_DEFAULT;
    private static final androidx.camera.core.processing.ShaderProvider SHADER_PROVIDER_HDR_DEFAULT;
    private static final androidx.camera.core.processing.ShaderProvider SHADER_PROVIDER_HDR_YUV;
    public static final int SIZEOF_FLOAT = 4;
    public static final java.lang.String TAG = "GLUtils";
    public static final java.nio.FloatBuffer TEX_BUF;
    public static final float[] TEX_COORDS;
    public static final java.lang.String VAR_TEXTURE = "sTexture";
    public static final java.lang.String VAR_TEXTURE_COORD = "vTextureCoord";
    public static final java.lang.String VERSION_UNKNOWN = "0.0";
    public static final java.nio.FloatBuffer VERTEX_BUF;
    public static final float[] VERTEX_COORDS;
    public static final int[] EMPTY_ATTRIBS = {12344};
    public static final int EGL_GL_COLORSPACE_KHR = 12445;
    public static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    public static final int[] HLG_SURFACE_ATTRIBS = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344};

    /* loaded from: classes14.dex */
    public static class BlankShaderProgram extends androidx.camera.core.processing.util.GLUtils.Program2D {
        public BlankShaderProgram() {
            super(androidx.camera.core.processing.util.GLUtils.BLANK_VERTEX_SHADER, androidx.camera.core.processing.util.GLUtils.BLANK_FRAGMENT_SHADER);
        }
    }

    /* loaded from: classes14.dex */
    public enum InputFormat {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    /* loaded from: classes14.dex */
    public static abstract class Program2D {
        protected int mProgramHandle;
        protected int mTransMatrixLoc = -1;
        protected int mAlphaScaleLoc = -1;
        protected int mPositionLoc = -1;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Program2D(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                java.lang.String r0 = "glAttachShader"
                java.lang.String r1 = "Could not link program: "
                r7.<init>()
                r2 = -1
                r7.mTransMatrixLoc = r2
                r7.mAlphaScaleLoc = r2
                r7.mPositionLoc = r2
                r3 = 35633(0x8b31, float:4.9932E-41)
                int r8 = androidx.camera.core.processing.util.GLUtils.loadShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6c java.lang.IllegalStateException -> L6e
                r3 = 35632(0x8b30, float:4.9931E-41)
                int r9 = androidx.camera.core.processing.util.GLUtils.loadShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L69
                int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L64
                java.lang.String r4 = "glCreateProgram"
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r4)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r0 = 1
                int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r5 = 35714(0x8b82, float:5.0046E-41)
                r6 = 0
                android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                if (r4 != r0) goto L48
                r7.mProgramHandle = r3     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r7.loadLocations()
                return
            L48:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                throw r0     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            L5e:
                r0 = move-exception
                goto L72
            L60:
                r0 = move-exception
                goto L72
            L62:
                r0 = move-exception
                goto L65
            L64:
                r0 = move-exception
            L65:
                r3 = r2
                goto L72
            L67:
                r0 = move-exception
                goto L6a
            L69:
                r0 = move-exception
            L6a:
                r9 = r2
                goto L71
            L6c:
                r0 = move-exception
                goto L6f
            L6e:
                r0 = move-exception
            L6f:
                r8 = r2
                r9 = r8
            L71:
                r3 = r9
            L72:
                if (r8 == r2) goto L77
                android.opengl.GLES20.glDeleteShader(r8)
            L77:
                if (r9 == r2) goto L7c
                android.opengl.GLES20.glDeleteShader(r9)
            L7c:
                if (r3 == r2) goto L81
                android.opengl.GLES20.glDeleteProgram(r3)
            L81:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.processing.util.GLUtils.Program2D.<init>(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadLocations() {
            int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
            this.mPositionLoc = glGetAttribLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetAttribLocation, "aPosition");
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uTransMatrix");
            this.mTransMatrixLoc = glGetUniformLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation, "uTransMatrix");
            int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uAlphaScale");
            this.mAlphaScaleLoc = glGetUniformLocation2;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation2, "uAlphaScale");
        }

        public void delete() {
            android.opengl.GLES20.glDeleteProgram(this.mProgramHandle);
        }

        public void updateAlpha(float f17) {
            android.opengl.GLES20.glUniform1f(this.mAlphaScaleLoc, f17);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUniform1f");
        }

        public void updateTransformMatrix(float[] fArr) {
            android.opengl.GLES20.glUniformMatrix4fv(this.mTransMatrixLoc, 1, false, fArr, 0);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        public void use() {
            android.opengl.GLES20.glUseProgram(this.mProgramHandle);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUseProgram");
            android.opengl.GLES20.glEnableVertexAttribArray(this.mPositionLoc);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            android.opengl.GLES20.glVertexAttribPointer(this.mPositionLoc, 2, 5126, false, 0, (java.nio.Buffer) androidx.camera.core.processing.util.GLUtils.VERTEX_BUF);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
            updateTransformMatrix(androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix());
            updateAlpha(1.0f);
        }
    }

    /* loaded from: classes14.dex */
    public static class SamplerShaderProgram extends androidx.camera.core.processing.util.GLUtils.Program2D {
        private int mSamplerLoc;
        private int mTexCoordLoc;
        private int mTexMatrixLoc;

        public SamplerShaderProgram(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat) {
            this(dynamicRange, resolveDefaultShaderProvider(dynamicRange, inputFormat));
        }

        private void loadLocations() {
            loadLocations();
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, androidx.camera.core.processing.util.GLUtils.VAR_TEXTURE);
            this.mSamplerLoc = glGetUniformLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation, androidx.camera.core.processing.util.GLUtils.VAR_TEXTURE);
            int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
            this.mTexCoordLoc = glGetAttribLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetAttribLocation, "aTextureCoord");
            int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
            this.mTexMatrixLoc = glGetUniformLocation2;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation2, "uTexMatrix");
        }

        private static androidx.camera.core.processing.ShaderProvider resolveDefaultShaderProvider(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat) {
            if (!dynamicRange.is10BitHdr()) {
                return androidx.camera.core.processing.util.GLUtils.SHADER_PROVIDER_DEFAULT;
            }
            m3.h.b(inputFormat != androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN, "No default sampler shader available for" + inputFormat);
            return inputFormat == androidx.camera.core.processing.util.GLUtils.InputFormat.YUV ? androidx.camera.core.processing.util.GLUtils.SHADER_PROVIDER_HDR_YUV : androidx.camera.core.processing.util.GLUtils.SHADER_PROVIDER_HDR_DEFAULT;
        }

        public void updateTextureMatrix(float[] fArr) {
            android.opengl.GLES20.glUniformMatrix4fv(this.mTexMatrixLoc, 1, false, fArr, 0);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        @Override // androidx.camera.core.processing.util.GLUtils.Program2D
        public void use() {
            super.use();
            android.opengl.GLES20.glUniform1i(this.mSamplerLoc, 0);
            android.opengl.GLES20.glEnableVertexAttribArray(this.mTexCoordLoc);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            android.opengl.GLES20.glVertexAttribPointer(this.mTexCoordLoc, 2, 5126, false, 0, (java.nio.Buffer) androidx.camera.core.processing.util.GLUtils.TEX_BUF);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
        }

        public SamplerShaderProgram(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.processing.ShaderProvider shaderProvider) {
            super(dynamicRange.is10BitHdr() ? androidx.camera.core.processing.util.GLUtils.HDR_VERTEX_SHADER : androidx.camera.core.processing.util.GLUtils.DEFAULT_VERTEX_SHADER, androidx.camera.core.processing.util.GLUtils.getFragmentShaderSource(shaderProvider));
            this.mSamplerLoc = -1;
            this.mTexMatrixLoc = -1;
            this.mTexCoordLoc = -1;
            loadLocations();
        }
    }

    static {
        java.util.Locale locale = java.util.Locale.US;
        DEFAULT_VERTEX_SHADER = java.lang.String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
        HDR_VERTEX_SHADER = java.lang.String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
        SHADER_PROVIDER_DEFAULT = new androidx.camera.core.processing.ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.1
            @Override // androidx.camera.core.processing.ShaderProvider
            public java.lang.String createFragmentShader(java.lang.String str, java.lang.String str2) {
                return java.lang.String.format(java.util.Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
            }
        };
        SHADER_PROVIDER_HDR_DEFAULT = new androidx.camera.core.processing.ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.2
            @Override // androidx.camera.core.processing.ShaderProvider
            public java.lang.String createFragmentShader(java.lang.String str, java.lang.String str2) {
                return java.lang.String.format(java.util.Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
            }
        };
        SHADER_PROVIDER_HDR_YUV = new androidx.camera.core.processing.ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.3
            @Override // androidx.camera.core.processing.ShaderProvider
            public java.lang.String createFragmentShader(java.lang.String str, java.lang.String str2) {
                return java.lang.String.format(java.util.Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
            }
        };
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        VERTEX_COORDS = fArr;
        VERTEX_BUF = createFloatBuffer(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        TEX_COORDS = fArr2;
        TEX_BUF = createFloatBuffer(fArr2);
        NO_OUTPUT_SURFACE = androidx.camera.core.processing.util.OutputSurface.of(android.opengl.EGL14.EGL_NO_SURFACE, 0, 0);
    }

    private GLUtils() {
    }

    public static void checkEglErrorOrLog(java.lang.String str) {
        try {
            checkEglErrorOrThrow(str);
        } catch (java.lang.IllegalStateException e17) {
            androidx.camera.core.Logger.e(TAG, e17.toString(), e17);
        }
    }

    public static void checkEglErrorOrThrow(java.lang.String str) {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new java.lang.IllegalStateException(str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
    }

    public static void checkGlErrorOrThrow(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new java.lang.IllegalStateException(str + ": GL error 0x" + java.lang.Integer.toHexString(glGetError));
    }

    public static void checkGlThreadOrThrow(java.lang.Thread thread) {
        m3.h.e(thread == java.lang.Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void checkInitializedOrThrow(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z17) {
        m3.h.e(z17 == atomicBoolean.get(), z17 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void checkLocationOrThrow(int i17, java.lang.String str) {
        if (i17 >= 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static int[] chooseSurfaceAttrib(java.lang.String str, androidx.camera.core.DynamicRange dynamicRange) {
        int[] iArr = EMPTY_ATTRIBS;
        if (dynamicRange.getEncoding() != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return HLG_SURFACE_ATTRIBS;
        }
        androidx.camera.core.Logger.w(TAG, "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static java.nio.FloatBuffer createFloatBuffer(float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static android.opengl.EGLSurface createPBufferSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i17, int i18) {
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i17, 12374, i18, 12344}, 0);
        checkEglErrorOrThrow("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new java.lang.IllegalStateException("surface was null");
    }

    public static java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.util.GLUtils.Program2D> createPrograms(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        java.lang.Object samplerShaderProgram;
        androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat;
        java.util.HashMap hashMap = new java.util.HashMap();
        androidx.camera.core.processing.util.GLUtils.InputFormat[] values = androidx.camera.core.processing.util.GLUtils.InputFormat.values();
        int length = values.length;
        for (int i17 = 0; i17 < length; i17++) {
            androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat2 = values[i17];
            androidx.camera.core.processing.ShaderProvider shaderProvider = map.get(inputFormat2);
            if (shaderProvider != null) {
                samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, shaderProvider);
            } else if (inputFormat2 == androidx.camera.core.processing.util.GLUtils.InputFormat.YUV || inputFormat2 == (inputFormat = androidx.camera.core.processing.util.GLUtils.InputFormat.DEFAULT)) {
                samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, inputFormat2);
            } else {
                m3.h.e(inputFormat2 == androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN, "Unhandled input format: " + inputFormat2);
                if (dynamicRange.is10BitHdr()) {
                    samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.BlankShaderProgram();
                } else {
                    androidx.camera.core.processing.ShaderProvider shaderProvider2 = map.get(inputFormat);
                    samplerShaderProgram = shaderProvider2 != null ? new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, shaderProvider2) : new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, inputFormat);
                }
            }
            java.util.Objects.toString(inputFormat2);
            samplerShaderProgram.toString();
            hashMap.put(inputFormat2, samplerShaderProgram);
        }
        return hashMap;
    }

    public static int createTexture() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        int i17 = iArr[0];
        android.opengl.GLES20.glBindTexture(36197, i17);
        checkGlErrorOrThrow("glBindTexture " + i17);
        android.opengl.GLES20.glTexParameteri(36197, 10241, 9728);
        android.opengl.GLES20.glTexParameteri(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlErrorOrThrow("glTexParameter");
        return i17;
    }

    public static android.opengl.EGLSurface createWindowSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, android.view.Surface surface, int[] iArr) {
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        checkEglErrorOrThrow("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new java.lang.IllegalStateException("surface was null");
    }

    public static void deleteFbo(int i17) {
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
        checkGlErrorOrThrow("glDeleteFramebuffers");
    }

    public static void deleteTexture(int i17) {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
        checkGlErrorOrThrow("glDeleteTextures");
    }

    public static int generateFbo() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlErrorOrThrow("glGenFramebuffers");
        return iArr[0];
    }

    public static int generateTexture() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getFragmentShaderSource(androidx.camera.core.processing.ShaderProvider shaderProvider) {
        try {
            java.lang.String createFragmentShader = shaderProvider.createFragmentShader(VAR_TEXTURE, VAR_TEXTURE_COORD);
            if (createFragmentShader != null && createFragmentShader.contains(VAR_TEXTURE_COORD) && createFragmentShader.contains(VAR_TEXTURE)) {
                return createFragmentShader;
            }
            throw new java.lang.IllegalArgumentException("Invalid fragment shader");
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof java.lang.IllegalArgumentException) {
                throw th6;
            }
            throw new java.lang.IllegalArgumentException("Unable retrieve fragment shader source", th6);
        }
    }

    public static java.lang.String getGlVersionNumber() {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(android.opengl.GLES20.glGetString(7938));
        if (!matcher.find()) {
            return VERSION_UNKNOWN;
        }
        java.lang.String group = matcher.group(1);
        group.getClass();
        java.lang.String group2 = matcher.group(2);
        group2.getClass();
        return group + "." + group2;
    }

    public static android.util.Size getSurfaceSize(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface) {
        return new android.util.Size(querySurface(eGLDisplay, eGLSurface, 12375), querySurface(eGLDisplay, eGLSurface, 12374));
    }

    public static int loadShader(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        checkGlErrorOrThrow("glCreateShader type=" + i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        androidx.camera.core.Logger.w(TAG, "Could not compile shader: " + str);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        throw new java.lang.IllegalStateException("Could not compile shader type " + i17 + ":" + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public static int querySurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface, int i17) {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i17, iArr, 0);
        return iArr[0];
    }
}

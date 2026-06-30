package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002;

/* renamed from: androidx.camera.core.processing.util.GLUtils */
/* loaded from: classes14.dex */
public final class C0949x326edecc {

    /* renamed from: BLANK_FRAGMENT_SHADER */
    public static final java.lang.String f2268x2a2263a9 = "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n";

    /* renamed from: BLANK_VERTEX_SHADER */
    public static final java.lang.String f2269xa6a62315 = "uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n";

    /* renamed from: DEFAULT_VERTEX_SHADER */
    public static final java.lang.String f2270xe5234942;

    /* renamed from: HDR_VERTEX_SHADER */
    public static final java.lang.String f2274x1f5c1d37;

    /* renamed from: NO_OUTPUT_SURFACE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c f2276x86a2258d;

    /* renamed from: PIXEL_STRIDE */
    public static final int f2277xd71d16d2 = 4;

    /* renamed from: SHADER_PROVIDER_DEFAULT */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 f2278x33151aed;

    /* renamed from: SHADER_PROVIDER_HDR_DEFAULT */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 f2279xb035c84;

    /* renamed from: SHADER_PROVIDER_HDR_YUV */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 f2280x5affc9d;

    /* renamed from: SIZEOF_FLOAT */
    public static final int f2281xf79ee0d5 = 4;
    public static final java.lang.String TAG = "GLUtils";

    /* renamed from: TEX_BUF */
    public static final java.nio.FloatBuffer f2282xd64e1a1b;

    /* renamed from: TEX_COORDS */
    public static final float[] f2283xec358b56;

    /* renamed from: VAR_TEXTURE */
    public static final java.lang.String f2284xec3e5bc3 = "sTexture";

    /* renamed from: VAR_TEXTURE_COORD */
    public static final java.lang.String f2285xe1ee359 = "vTextureCoord";

    /* renamed from: VERSION_UNKNOWN */
    public static final java.lang.String f2286xa0294fa3 = "0.0";

    /* renamed from: VERTEX_BUF */
    public static final java.nio.FloatBuffer f2287x238c6538;

    /* renamed from: VERTEX_COORDS */
    public static final float[] f2288xd05c8f19;

    /* renamed from: EMPTY_ATTRIBS */
    public static final int[] f2273x643cedb7 = {12344};

    /* renamed from: EGL_GL_COLORSPACE_KHR */
    public static final int f2272xf24d195e = 12445;

    /* renamed from: EGL_GL_COLORSPACE_BT2020_HLG_EXT */
    public static final int f2271x603b5a2b = 13632;

    /* renamed from: HLG_SURFACE_ATTRIBS */
    public static final int[] f2275x2ba9009b = {f2272xf24d195e, f2271x603b5a2b, 12344};

    /* renamed from: androidx.camera.core.processing.util.GLUtils$BlankShaderProgram */
    /* loaded from: classes14.dex */
    public static class BlankShaderProgram extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D {
        public BlankShaderProgram() {
            super(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2269xa6a62315, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2268x2a2263a9);
        }
    }

    /* renamed from: androidx.camera.core.processing.util.GLUtils$InputFormat */
    /* loaded from: classes14.dex */
    public enum InputFormat {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    /* renamed from: androidx.camera.core.processing.util.GLUtils$Program2D */
    /* loaded from: classes14.dex */
    public static abstract class Program2D {

        /* renamed from: mProgramHandle */
        protected int f2294x636c8e5f;

        /* renamed from: mTransMatrixLoc */
        protected int f2295xecdfa3c4 = -1;

        /* renamed from: mAlphaScaleLoc */
        protected int f2292x582905a7 = -1;

        /* renamed from: mPositionLoc */
        protected int f2293xa1dba6aa = -1;

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
                r7.f2295xecdfa3c4 = r2
                r7.f2292x582905a7 = r2
                r7.f2293xa1dba6aa = r2
                r3 = 35633(0x8b31, float:4.9932E-41)
                int r8 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6478xf272646b(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6c java.lang.IllegalStateException -> L6e
                r3 = 35632(0x8b30, float:4.9931E-41)
                int r9 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6478xf272646b(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L69
                int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L64
                java.lang.String r4 = "glCreateProgram"
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048(r4)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r0 = 1
                int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r5 = 35714(0x8b82, float:5.0046E-41)
                r6 = 0
                android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                if (r4 != r0) goto L48
                r7.f2294x636c8e5f = r3     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
                r7.m6485xfcbbd518()
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
            throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D.<init>(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: loadLocations */
        public void m6485xfcbbd518() {
            int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f2294x636c8e5f, "aPosition");
            this.f2293xa1dba6aa = glGetAttribLocation;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6463x9be0d326(glGetAttribLocation, "aPosition");
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f2294x636c8e5f, "uTransMatrix");
            this.f2295xecdfa3c4 = glGetUniformLocation;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6463x9be0d326(glGetUniformLocation, "uTransMatrix");
            int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.f2294x636c8e5f, "uAlphaScale");
            this.f2292x582905a7 = glGetUniformLocation2;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6463x9be0d326(glGetUniformLocation2, "uAlphaScale");
        }

        /* renamed from: delete */
        public void m6486xb06685ab() {
            android.opengl.GLES20.glDeleteProgram(this.f2294x636c8e5f);
        }

        /* renamed from: updateAlpha */
        public void m6487xdc279e15(float f17) {
            android.opengl.GLES20.glUniform1f(this.f2292x582905a7, f17);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glUniform1f");
        }

        /* renamed from: updateTransformMatrix */
        public void m6488x7b86244(float[] fArr) {
            android.opengl.GLES20.glUniformMatrix4fv(this.f2295xecdfa3c4, 1, false, fArr, 0);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glUniformMatrix4fv");
        }

        public void use() {
            android.opengl.GLES20.glUseProgram(this.f2294x636c8e5f);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glUseProgram");
            android.opengl.GLES20.glEnableVertexAttribArray(this.f2293xa1dba6aa);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glEnableVertexAttribArray");
            android.opengl.GLES20.glVertexAttribPointer(this.f2293xa1dba6aa, 2, 5126, false, 0, (java.nio.Buffer) p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2287x238c6538);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glVertexAttribPointer");
            m6488x7b86244(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6465x27895eb3());
            m6487xdc279e15(1.0f);
        }
    }

    /* renamed from: androidx.camera.core.processing.util.GLUtils$SamplerShaderProgram */
    /* loaded from: classes14.dex */
    public static class SamplerShaderProgram extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D {

        /* renamed from: mSamplerLoc */
        private int f2296xe4c78665;

        /* renamed from: mTexCoordLoc */
        private int f2297xe65d2ea5;

        /* renamed from: mTexMatrixLoc */
        private int f2298xa7da465;

        public SamplerShaderProgram(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat inputFormat) {
            this(c0491x2bb48c5e, m6490xe160c30b(c0491x2bb48c5e, inputFormat));
        }

        /* renamed from: loadLocations */
        private void m6489xfcbbd518() {
            m6485xfcbbd518();
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f2294x636c8e5f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2284xec3e5bc3);
            this.f2296xe4c78665 = glGetUniformLocation;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6463x9be0d326(glGetUniformLocation, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2284xec3e5bc3);
            int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f2294x636c8e5f, "aTextureCoord");
            this.f2297xe65d2ea5 = glGetAttribLocation;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6463x9be0d326(glGetAttribLocation, "aTextureCoord");
            int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.f2294x636c8e5f, "uTexMatrix");
            this.f2298xa7da465 = glGetUniformLocation2;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6463x9be0d326(glGetUniformLocation2, "uTexMatrix");
        }

        /* renamed from: resolveDefaultShaderProvider */
        private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 m6490xe160c30b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat inputFormat) {
            if (!c0491x2bb48c5e.m4388x10bf48d2()) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2278x33151aed;
            }
            m3.h.b(inputFormat != p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.UNKNOWN, "No default sampler shader available for" + inputFormat);
            return inputFormat == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.YUV ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2280x5affc9d : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2279xb035c84;
        }

        /* renamed from: updateTextureMatrix */
        public void m6491x3221e73(float[] fArr) {
            android.opengl.GLES20.glUniformMatrix4fv(this.f2298xa7da465, 1, false, fArr, 0);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glUniformMatrix4fv");
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D
        public void use() {
            super.use();
            android.opengl.GLES20.glUniform1i(this.f2296xe4c78665, 0);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f2297xe65d2ea5);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glEnableVertexAttribArray");
            android.opengl.GLES20.glVertexAttribPointer(this.f2297xe65d2ea5, 2, 5126, false, 0, (java.nio.Buffer) p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2282xd64e1a1b);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glVertexAttribPointer");
        }

        public SamplerShaderProgram(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 interfaceC0904x6439f916) {
            super(c0491x2bb48c5e.m4388x10bf48d2() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2274x1f5c1d37 : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2270xe5234942, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6475xb1808746(interfaceC0904x6439f916));
            this.f2296xe4c78665 = -1;
            this.f2298xa7da465 = -1;
            this.f2297xe65d2ea5 = -1;
            m6489xfcbbd518();
        }
    }

    static {
        java.util.Locale locale = java.util.Locale.US;
        f2270xe5234942 = java.lang.String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", f2285xe1ee359, f2285xe1ee359);
        f2274x1f5c1d37 = java.lang.String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", f2285xe1ee359, f2285xe1ee359);
        f2278x33151aed = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916() { // from class: androidx.camera.core.processing.util.GLUtils.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916
            /* renamed from: createFragmentShader */
            public java.lang.String mo6319x6d3e4e71(java.lang.String str, java.lang.String str2) {
                return java.lang.String.format(java.util.Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
            }
        };
        f2279xb035c84 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916() { // from class: androidx.camera.core.processing.util.GLUtils.2
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916
            /* renamed from: createFragmentShader */
            public java.lang.String mo6319x6d3e4e71(java.lang.String str, java.lang.String str2) {
                return java.lang.String.format(java.util.Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
            }
        };
        f2280x5affc9d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916() { // from class: androidx.camera.core.processing.util.GLUtils.3
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916
            /* renamed from: createFragmentShader */
            public java.lang.String mo6319x6d3e4e71(java.lang.String str, java.lang.String str2) {
                return java.lang.String.format(java.util.Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
            }
        };
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f2288xd05c8f19 = fArr;
        f2287x238c6538 = m6466xa4cb3f20(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f2283xec358b56 = fArr2;
        f2282xd64e1a1b = m6466xa4cb3f20(fArr2);
        f2276x86a2258d = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c.of(android.opengl.EGL14.EGL_NO_SURFACE, 0, 0);
    }

    private C0949x326edecc() {
    }

    /* renamed from: checkEglErrorOrLog */
    public static void m6458xf94188bb(java.lang.String str) {
        try {
            m6459xaf700a9d(str);
        } catch (java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, e17.toString(), e17);
        }
    }

    /* renamed from: checkEglErrorOrThrow */
    public static void m6459xaf700a9d(java.lang.String str) {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new java.lang.IllegalStateException(str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
    }

    /* renamed from: checkGlErrorOrThrow */
    public static void m6460x14d94048(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new java.lang.IllegalStateException(str + ": GL error 0x" + java.lang.Integer.toHexString(glGetError));
    }

    /* renamed from: checkGlThreadOrThrow */
    public static void m6461x4bb38a4c(java.lang.Thread thread) {
        m3.h.e(thread == java.lang.Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    /* renamed from: checkInitializedOrThrow */
    public static void m6462xb935a877(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z17) {
        m3.h.e(z17 == atomicBoolean.get(), z17 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    /* renamed from: checkLocationOrThrow */
    public static void m6463x9be0d326(int i17, java.lang.String str) {
        if (i17 >= 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Unable to locate '" + str + "' in program");
    }

    /* renamed from: chooseSurfaceAttrib */
    public static int[] m6464xd041a900(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        int[] iArr = f2273x643cedb7;
        if (c0491x2bb48c5e.m4386xe1d96ac9() != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f2275x2ba9009b;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    /* renamed from: create4x4IdentityMatrix */
    public static float[] m6465x27895eb3() {
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    /* renamed from: createFloatBuffer */
    public static java.nio.FloatBuffer m6466xa4cb3f20(float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: createPBufferSurface */
    public static android.opengl.EGLSurface m6467xe6bc11d9(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i17, int i18) {
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i17, 12374, i18, 12344}, 0);
        m6459xaf700a9d("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new java.lang.IllegalStateException("surface was null");
    }

    /* renamed from: createPrograms */
    public static java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D> m6468xfb51fb8b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916> map) {
        java.lang.Object samplerShaderProgram;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat inputFormat;
        java.util.HashMap hashMap = new java.util.HashMap();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat[] m6483xcee59d22 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.m6483xcee59d22();
        int length = m6483xcee59d22.length;
        for (int i17 = 0; i17 < length; i17++) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat inputFormat2 = m6483xcee59d22[i17];
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 interfaceC0904x6439f916 = map.get(inputFormat2);
            if (interfaceC0904x6439f916 != null) {
                samplerShaderProgram = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram(c0491x2bb48c5e, interfaceC0904x6439f916);
            } else if (inputFormat2 == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.YUV || inputFormat2 == (inputFormat = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.DEFAULT)) {
                samplerShaderProgram = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram(c0491x2bb48c5e, inputFormat2);
            } else {
                m3.h.e(inputFormat2 == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.UNKNOWN, "Unhandled input format: " + inputFormat2);
                if (c0491x2bb48c5e.m4388x10bf48d2()) {
                    samplerShaderProgram = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.BlankShaderProgram();
                } else {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 interfaceC0904x6439f9162 = map.get(inputFormat);
                    samplerShaderProgram = interfaceC0904x6439f9162 != null ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram(c0491x2bb48c5e, interfaceC0904x6439f9162) : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram(c0491x2bb48c5e, inputFormat);
                }
            }
            java.util.Objects.toString(inputFormat2);
            samplerShaderProgram.toString();
            hashMap.put(inputFormat2, samplerShaderProgram);
        }
        return hashMap;
    }

    /* renamed from: createTexture */
    public static int m6469x3164f87f() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        m6460x14d94048("glGenTextures");
        int i17 = iArr[0];
        android.opengl.GLES20.glBindTexture(36197, i17);
        m6460x14d94048("glBindTexture " + i17);
        android.opengl.GLES20.glTexParameteri(36197, 10241, 9728);
        android.opengl.GLES20.glTexParameteri(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        m6460x14d94048("glTexParameter");
        return i17;
    }

    /* renamed from: createWindowSurface */
    public static android.opengl.EGLSurface m6470x56846301(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, android.view.Surface surface, int[] iArr) {
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        m6459xaf700a9d("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new java.lang.IllegalStateException("surface was null");
    }

    /* renamed from: deleteFbo */
    public static void m6471xea9e2988(int i17) {
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
        m6460x14d94048("glDeleteFramebuffers");
    }

    /* renamed from: deleteTexture */
    public static void m6472x9f4940f0(int i17) {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
        m6460x14d94048("glDeleteTextures");
    }

    /* renamed from: generateFbo */
    public static int m6473x34da0d7e() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        m6460x14d94048("glGenFramebuffers");
        return iArr[0];
    }

    /* renamed from: generateTexture */
    public static int m6474xe06639e6() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        m6460x14d94048("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFragmentShaderSource */
    public static java.lang.String m6475xb1808746(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916 interfaceC0904x6439f916) {
        try {
            java.lang.String mo6319x6d3e4e71 = interfaceC0904x6439f916.mo6319x6d3e4e71(f2284xec3e5bc3, f2285xe1ee359);
            if (mo6319x6d3e4e71 != null && mo6319x6d3e4e71.contains(f2285xe1ee359) && mo6319x6d3e4e71.contains(f2284xec3e5bc3)) {
                return mo6319x6d3e4e71;
            }
            throw new java.lang.IllegalArgumentException("Invalid fragment shader");
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof java.lang.IllegalArgumentException) {
                throw th6;
            }
            throw new java.lang.IllegalArgumentException("Unable retrieve fragment shader source", th6);
        }
    }

    /* renamed from: getGlVersionNumber */
    public static java.lang.String m6476xaa89b326() {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(android.opengl.GLES20.glGetString(7938));
        if (!matcher.find()) {
            return f2286xa0294fa3;
        }
        java.lang.String group = matcher.group(1);
        group.getClass();
        java.lang.String group2 = matcher.group(2);
        group2.getClass();
        return group + "." + group2;
    }

    /* renamed from: getSurfaceSize */
    public static android.util.Size m6477x86376918(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface) {
        return new android.util.Size(m6479xe7937ac5(eGLDisplay, eGLSurface, 12375), m6479xe7937ac5(eGLDisplay, eGLSurface, 12374));
    }

    /* renamed from: loadShader */
    public static int m6478xf272646b(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        m6460x14d94048("glCreateShader type=" + i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Could not compile shader: " + str);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        throw new java.lang.IllegalStateException("Could not compile shader type " + i17 + ":" + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
    }

    /* renamed from: querySurface */
    public static int m6479xe7937ac5(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface, int i17) {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i17, iArr, 0);
        return iArr[0];
    }
}

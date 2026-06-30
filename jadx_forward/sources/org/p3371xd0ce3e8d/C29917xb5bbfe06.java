package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.YuvConverter */
/* loaded from: classes14.dex */
public final class C29917xb5bbfe06 {

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f76157xb30c5cb4 = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private static final java.lang.String TAG = "YuvConverter";

    /* renamed from: drawer */
    private final org.p3371xd0ce3e8d.C29780x5172a8a3 f76158xb118f8f1;

    /* renamed from: i420TextureFrameBuffer */
    private final org.p3371xd0ce3e8d.C29783x806035d7 f76159x816203b;

    /* renamed from: shaderCallbacks */
    private final org.p3371xd0ce3e8d.C29917xb5bbfe06.ShaderCallbacks f76160x40dda269;

    /* renamed from: threadChecker */
    private final org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker f76161x33b65a4b;

    /* renamed from: videoFrameDrawer */
    private final org.p3371xd0ce3e8d.C29906x8db8d563 f76162xbff49143;

    /* renamed from: org.webrtc.YuvConverter$ShaderCallbacks */
    /* loaded from: classes14.dex */
    public static class ShaderCallbacks implements org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks {

        /* renamed from: coeffs */
        private float[] f76166xaf3b6b9a;

        /* renamed from: coeffsLoc */
        private int f76167xf3cfe146;

        /* renamed from: stepSize */
        private float f76168x552514ed;

        /* renamed from: xUnitLoc */
        private int f76169x3b15384;

        /* renamed from: yCoeffs */
        private static final float[] f76165x79725973 = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};

        /* renamed from: uCoeffs */
        private static final float[] f76163xa5d96c6f = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};

        /* renamed from: vCoeffs */
        private static final float[] f76164xdabfa7b0 = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        private ShaderCallbacks() {
        }

        @Override // org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks
        /* renamed from: onNewShader */
        public void mo155543xd9f79286(org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a) {
            this.f76169x3b15384 = c29782xb41dd54a.m155550xd5a6bb53("xUnit");
            this.f76167xf3cfe146 = c29782xb41dd54a.m155550xd5a6bb53("coeffs");
        }

        @Override // org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks
        /* renamed from: onPrepareShader */
        public void mo155544x7a6c342d(org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a, float[] fArr, int i17, int i18, int i19, int i27) {
            android.opengl.GLES20.glUniform4fv(this.f76167xf3cfe146, 1, this.f76166xaf3b6b9a, 0);
            int i28 = this.f76169x3b15384;
            float f17 = this.f76168x552514ed;
            float f18 = i17;
            android.opengl.GLES20.glUniform2f(i28, (fArr[0] * f17) / f18, (f17 * fArr[1]) / f18);
        }

        /* renamed from: setPlaneU */
        public void m156598x1d8ac87b() {
            this.f76166xaf3b6b9a = f76163xa5d96c6f;
            this.f76168x552514ed = 2.0f;
        }

        /* renamed from: setPlaneV */
        public void m156599x1d8ac87c() {
            this.f76166xaf3b6b9a = f76164xdabfa7b0;
            this.f76168x552514ed = 2.0f;
        }

        /* renamed from: setPlaneY */
        public void m156600x1d8ac87f() {
            this.f76166xaf3b6b9a = f76165x79725973;
            this.f76168x552514ed = 1.0f;
        }
    }

    public C29917xb5bbfe06() {
        this(new org.p3371xd0ce3e8d.C29906x8db8d563());
    }

    /* renamed from: convertInternal */
    private org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer m156593x92fee590(org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer) {
        org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer2 = (org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer) this.f76162xbff49143.m156561x886f1e09(textureBuffer, textureBuffer.mo155645x755bd410(), textureBuffer.mo155641x1c4fb41d());
        int mo155645x755bd410 = textureBuffer2.mo155645x755bd410();
        int mo155641x1c4fb41d = textureBuffer2.mo155641x1c4fb41d();
        int i17 = ((mo155645x755bd410 + 7) / 8) * 8;
        int i18 = (mo155641x1c4fb41d + 1) / 2;
        int i19 = mo155641x1c4fb41d + i18;
        final java.nio.ByteBuffer m155648xe88792fc = org.p3371xd0ce3e8d.C29797xa99bc1d0.m155648xe88792fc(i17 * i19);
        int i27 = i17 / 4;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        this.f76159x816203b.m155560x76500f83(i27, i19);
        android.opengl.GLES20.glBindFramebuffer(36160, this.f76159x816203b.m155555xc8be9a52());
        org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("glBindFramebuffer");
        this.f76160x40dda269.m156600x1d8ac87f();
        org.p3371xd0ce3e8d.C29906x8db8d563.m156557x785a8b37(this.f76158xb118f8f1, textureBuffer2, matrix, mo155645x755bd410, mo155641x1c4fb41d, 0, 0, i27, mo155641x1c4fb41d);
        this.f76160x40dda269.m156598x1d8ac87b();
        int i28 = i27 / 2;
        org.p3371xd0ce3e8d.C29906x8db8d563.m156557x785a8b37(this.f76158xb118f8f1, textureBuffer2, matrix, mo155645x755bd410, mo155641x1c4fb41d, 0, mo155641x1c4fb41d, i28, i18);
        this.f76160x40dda269.m156599x1d8ac87c();
        org.p3371xd0ce3e8d.C29906x8db8d563.m156557x785a8b37(this.f76158xb118f8f1, textureBuffer2, matrix, mo155645x755bd410, mo155641x1c4fb41d, i28, mo155641x1c4fb41d, i28, i18);
        android.opengl.GLES20.glReadPixels(0, 0, this.f76159x816203b.m155558x755bd410(), this.f76159x816203b.m155556x1c4fb41d(), com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, m155648xe88792fc);
        org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("YuvConverter.convert");
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        int i29 = (i17 * mo155641x1c4fb41d) + 0;
        int i37 = i17 / 2;
        int i38 = i29 + i37;
        m155648xe88792fc.position(0);
        m155648xe88792fc.limit(i29);
        java.nio.ByteBuffer slice = m155648xe88792fc.slice();
        m155648xe88792fc.position(i29);
        int i39 = ((i18 - 1) * i17) + i37;
        m155648xe88792fc.limit(i29 + i39);
        java.nio.ByteBuffer slice2 = m155648xe88792fc.slice();
        m155648xe88792fc.position(i38);
        m155648xe88792fc.limit(i38 + i39);
        java.nio.ByteBuffer slice3 = m155648xe88792fc.slice();
        textureBuffer2.mo155513x41012807();
        return org.p3371xd0ce3e8d.C29794x1389e1eb.m155636x37d04a(mo155645x755bd410, mo155641x1c4fb41d, slice, i17, slice2, i17, slice3, i17, new java.lang.Runnable() { // from class: org.webrtc.YuvConverter$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29797xa99bc1d0.m155649x41617eeb(m155648xe88792fc);
            }
        });
    }

    /* renamed from: convert */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer m156595x38b81db3(org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer) {
        try {
            return m156593x92fee590(textureBuffer);
        } catch (android.opengl.GLException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Failed to convert TextureBuffer", e17);
            return null;
        }
    }

    /* renamed from: release */
    public void m156596x41012807() {
        this.f76161x33b65a4b.m156480x23129e95();
        this.f76158xb118f8f1.mo155542x41012807();
        this.f76159x816203b.m155559x41012807();
        this.f76162xbff49143.m156562x41012807();
        this.f76161x33b65a4b.m156481xddb6d77d();
    }

    public C29917xb5bbfe06(org.p3371xd0ce3e8d.C29906x8db8d563 c29906x8db8d563) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker threadChecker = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker();
        this.f76161x33b65a4b = threadChecker;
        this.f76159x816203b = new org.p3371xd0ce3e8d.C29783x806035d7(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e);
        org.p3371xd0ce3e8d.C29917xb5bbfe06.ShaderCallbacks shaderCallbacks = new org.p3371xd0ce3e8d.C29917xb5bbfe06.ShaderCallbacks();
        this.f76160x40dda269 = shaderCallbacks;
        this.f76158xb118f8f1 = new org.p3371xd0ce3e8d.C29780x5172a8a3(f76157xb30c5cb4, shaderCallbacks);
        this.f76162xbff49143 = c29906x8db8d563;
        threadChecker.m156481xddb6d77d();
    }
}

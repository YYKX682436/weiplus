package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.VideoTexture */
/* loaded from: classes14.dex */
public class C25785xac83bc40 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "VideoTexture";

    /* renamed from: copyFilter */
    private com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 f48299xb2d63b4d;

    /* renamed from: cropInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25782x9e08c8d9 f48300x7e51cb5e;

    /* renamed from: frameAvailable */
    private boolean f48301x31144bdc;

    /* renamed from: frameSyncObject */
    private final java.lang.Object f48302xb30b6b07;

    /* renamed from: preferRotation */
    private int f48303xcc7d15ae;

    /* renamed from: quitFlag */
    private boolean f48304xc14ed65b;

    /* renamed from: renderContext */
    private com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f48305x399b739;

    /* renamed from: renderThread */
    private android.os.HandlerThread f48306x2d433340;

    /* renamed from: surfaceTexture */
    private android.graphics.SurfaceTexture f48307x299653ae;

    /* renamed from: surfaceTextureRotation */
    private int f48308x2b8a394c;

    /* renamed from: surfaceTextureTransform */
    private final float[] f48309xcef27b5e;

    /* renamed from: textureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48310x602aa869;

    /* renamed from: textureMatrix */
    private android.graphics.Matrix f48311x644d8bc;

    /* renamed from: textureType */
    private int f48312x602fd2f5;

    public C25785xac83bc40(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        this.f48302xb30b6b07 = new java.lang.Object();
        this.f48304xc14ed65b = false;
        float[] fArr = new float[16];
        this.f48309xcef27b5e = fArr;
        this.f48308x2b8a394c = 0;
        this.f48303xcc7d15ae = 0;
        this.f48310x602aa869 = c25745xc3945049;
        m97743x72f068de(c25745xc3945049.f47890xc35d0376);
        this.f48307x299653ae.getTransformMatrix(fArr);
        this.f48303xcc7d15ae = 0;
    }

    /* renamed from: getTextureMatrix */
    private android.graphics.Matrix m97742xc3a49506(android.graphics.SurfaceTexture surfaceTexture, int i17) {
        surfaceTexture.getTransformMatrix(this.f48309xcef27b5e);
        float[] fArr = this.f48309xcef27b5e;
        float f17 = fArr[0];
        float f18 = fArr[4];
        float f19 = fArr[12];
        float f27 = fArr[1];
        float f28 = fArr[5];
        float f29 = fArr[13];
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (i17 != 0) {
            com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97469xa52d49d5(matrix2, i17, 1.0f, 1.0f);
        }
        if (((int) f17) == f17 && ((int) f27) == f27 && ((int) f18) == f18 && ((int) f28) == f28) {
            matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
            if (i17 != 0) {
                matrix.preConcat(matrix2);
            }
        } else {
            matrix.setValues(new float[]{f17, f18, f19, f27, f28, f29, 0.0f, 0.0f, 1.0f});
        }
        if (i17 != 0) {
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            matrix2.invert(matrix3);
            matrix.postConcat(matrix3);
        }
        return matrix;
    }

    /* renamed from: initSurfaceTexture */
    private void m97743x72f068de(int i17) {
        this.f48307x299653ae = new android.graphics.SurfaceTexture(i17);
        this.f48307x299653ae.setOnFrameAvailableListener(this, this.f48306x2d433340 != null ? new android.os.Handler(this.f48306x2d433340.getLooper()) : new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    /* renamed from: isIdentity */
    private boolean m97744xc8a01808() {
        android.graphics.Matrix matrix = this.f48311x644d8bc;
        return matrix == null || matrix.isIdentity();
    }

    /* renamed from: isOES */
    private boolean m97745x5fd1bd3() {
        return this.f48312x602fd2f5 == 36197;
    }

    /* renamed from: reflectLooper */
    private void m97746xccf1bb6e() {
        java.lang.Class<?> cls;
        java.lang.Class<?>[] declaredClasses = android.graphics.SurfaceTexture.class.getDeclaredClasses();
        int length = declaredClasses.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                cls = null;
                break;
            }
            cls = declaredClasses[i17];
            if (cls.getName().toLowerCase().contains("handler")) {
                break;
            } else {
                i17++;
            }
        }
        if (cls == null) {
            return;
        }
        java.lang.Class<?>[] clsArr = {android.graphics.SurfaceTexture.class, android.os.Looper.class};
        try {
            android.os.HandlerThread handlerThread = this.f48306x2d433340;
            java.lang.Object newInstance = cls.getConstructor(clsArr).newInstance(this.f48307x299653ae, handlerThread != null ? handlerThread.getLooper() : android.os.Looper.getMainLooper());
            java.lang.reflect.Field declaredField = this.f48307x299653ae.getClass().getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            declaredField.set(this.f48307x299653ae, newInstance);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "reflectLooper", e17);
        }
    }

    /* renamed from: releaseFilter */
    private void m97747xa53c7e5f() {
        com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 c25765x7d6db798 = this.f48299xb2d63b4d;
        if (c25765x7d6db798 != null) {
            c25765x7d6db798.mo97539x41012807();
        }
    }

    /* renamed from: releaseTextureInfo */
    private void m97748x7fa5ade2() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48310x602aa869;
        if (c25745xc3945049 != null) {
            c25745xc3945049.m97285x41012807();
            this.f48310x602aa869 = null;
        }
    }

    /* renamed from: awaitNewImage */
    public boolean m97749x13bc3b11() {
        return m97750x13bc3b11(3000L);
    }

    /* renamed from: copyTexture */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97751x865e5fe6() {
        if (this.f48299xb2d63b4d == null) {
            com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 c25765x7d6db798 = new com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798();
            this.f48299xb2d63b4d = c25765x7d6db798;
            c25765x7d6db798.mo97543x5e392181(this.f48305x399b739.m97645x6be2dc6());
            this.f48299xb2d63b4d.mo97542x4f1c14cc(this.f48305x399b739.m97632xb7389127());
            this.f48299xb2d63b4d.mo97541xf73870dd(false);
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 c25765x7d6db7982 = this.f48299xb2d63b4d;
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48310x602aa869;
        return c25765x7d6db7982.mo97526x79f87086(c25745xc3945049, null, c25745xc3945049.m97280xc3a49506());
    }

    /* renamed from: getCropInfo */
    public com.p314xaae8f345.tav.p2959x5befac44.C25782x9e08c8d9 m97752xfa2c08d4() {
        return this.f48300x7e51cb5e;
    }

    /* renamed from: getPreferRotation */
    public int m97753xbb14e2a4() {
        return this.f48303xcc7d15ae;
    }

    /* renamed from: getRenderContext */
    public com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 m97754xc0f97383() {
        return this.f48305x399b739;
    }

    /* renamed from: getSurfaceTextureRotation */
    public int m97755x9558b042() {
        return this.f48308x2b8a394c;
    }

    /* renamed from: getSurfaceTextureTransform */
    public float[] m97756x9ef2e328() {
        return this.f48309xcef27b5e;
    }

    /* renamed from: getTextureInfo */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97757x3a00ef33() {
        return this.f48310x602aa869;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.f48302xb30b6b07) {
            if (this.f48301x31144bdc) {
                new java.lang.RuntimeException("frameAvailable already set, frame could be dropped");
            } else {
                this.f48301x31144bdc = true;
                this.f48302xb30b6b07.notifyAll();
            }
        }
    }

    /* renamed from: quitIfWaiting */
    public void m97758xe018bce1() {
        synchronized (this.f48302xb30b6b07) {
            this.f48304xc14ed65b = true;
            this.f48302xb30b6b07.notifyAll();
        }
    }

    /* renamed from: release */
    public void m97759x41012807() {
        m97748x7fa5ade2();
        m97760x96b82f95();
        m97747xa53c7e5f();
    }

    /* renamed from: releaseSurfaceTexture */
    public void m97760x96b82f95() {
        android.graphics.SurfaceTexture surfaceTexture = this.f48307x299653ae;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f48307x299653ae = null;
        }
    }

    /* renamed from: setCropInfo */
    public void m97761xf4e469e0(com.p314xaae8f345.tav.p2959x5befac44.C25782x9e08c8d9 c25782x9e08c8d9) {
        this.f48300x7e51cb5e = c25782x9e08c8d9;
        if (c25782x9e08c8d9 == null || c25782x9e08c8d9.f48215x6be2dc6 <= 0 || c25782x9e08c8d9.f48214xb7389127 <= 0) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48310x602aa869;
        int i17 = c25745xc3945049.f47890xc35d0376;
        int i18 = c25745xc3945049.f47893x602fd2f5;
        int i19 = c25782x9e08c8d9.f48215x6be2dc6;
        int i27 = c25782x9e08c8d9.f48214xb7389127;
        android.graphics.Matrix m97280xc3a49506 = c25745xc3945049.m97280xc3a49506();
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc39450492 = this.f48310x602aa869;
        this.f48310x602aa869 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(i17, i18, i19, i27, m97280xc3a49506, c25745xc39450492.f47886xcc7d15ae, c25745xc39450492.f47889xcef27b5e);
    }

    /* renamed from: setRenderContext */
    public void m97762x53cfd9f7(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
        this.f48305x399b739 = c25779x3338e719;
    }

    /* renamed from: setSurfaceTextureRotation */
    public void m97763xc79c4c4e(int i17) {
        this.f48308x2b8a394c = i17;
    }

    /* renamed from: surfaceTexture */
    public android.graphics.SurfaceTexture m97764x299653ae() {
        return this.f48307x299653ae;
    }

    /* renamed from: surfaceTextureMatrix */
    public android.graphics.Matrix m97765x43badd0f() {
        if (m97744xc8a01808() && m97745x5fd1bd3()) {
            this.f48311x644d8bc = m97742xc3a49506(this.f48307x299653ae, this.f48303xcc7d15ae);
        }
        return this.f48311x644d8bc;
    }

    /* renamed from: awaitNewImage */
    public boolean m97750x13bc3b11(long j17) {
        int ceil = (int) java.lang.Math.ceil((((float) j17) * 1.0f) / 50.0f);
        synchronized (this.f48302xb30b6b07) {
            while (!this.f48301x31144bdc && !this.f48304xc14ed65b && ceil > 0) {
                ceil--;
                try {
                    this.f48302xb30b6b07.wait(50L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
            this.f48301x31144bdc = false;
            if (ceil == 0) {
                return false;
            }
            if (this.f48304xc14ed65b) {
                this.f48304xc14ed65b = false;
                return false;
            }
            com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("before updateTexImage");
            this.f48307x299653ae.updateTexImage();
            this.f48310x602aa869.m97291x567afb7a(m97742xc3a49506(this.f48307x299653ae, this.f48303xcc7d15ae));
            this.f48310x602aa869.m97290xb522c89c(this.f48309xcef27b5e);
            this.f48310x602aa869.m97289xc79c4c4e(this.f48308x2b8a394c);
            com.p314xaae8f345.tav.p2959x5befac44.C25782x9e08c8d9 c25782x9e08c8d9 = this.f48300x7e51cb5e;
            if (c25782x9e08c8d9 == null) {
                return true;
            }
            if (c25782x9e08c8d9.f48212x4c64316c - c25782x9e08c8d9.f48211x7e5306b7 == c25782x9e08c8d9.f48215x6be2dc6 && c25782x9e08c8d9.f48210x252f14db - c25782x9e08c8d9.f48213x3de1c4a5 == c25782x9e08c8d9.f48214xb7389127) {
                return true;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48310x602aa869;
            com.p314xaae8f345.tav.p2959x5befac44.C25782x9e08c8d9 c25782x9e08c8d92 = this.f48300x7e51cb5e;
            c25745xc3945049.m97292xd06a57dd(new android.graphics.Rect(c25782x9e08c8d92.f48211x7e5306b7, c25782x9e08c8d92.f48213x3de1c4a5, c25782x9e08c8d92.f48212x4c64316c, c25782x9e08c8d92.f48210x252f14db));
            return true;
        }
    }

    public C25785xac83bc40(int i17, int i18) {
        this(i17, i18, 36197, 0, null);
    }

    public C25785xac83bc40(int i17, int i18, int i19, int i27, android.os.HandlerThread handlerThread) {
        this(i17, i18, i19, i27, com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(i19), handlerThread);
    }

    public C25785xac83bc40(int i17, int i18, int i19, int i27, int i28, android.os.HandlerThread handlerThread) {
        this.f48302xb30b6b07 = new java.lang.Object();
        this.f48304xc14ed65b = false;
        this.f48309xcef27b5e = new float[16];
        this.f48308x2b8a394c = 0;
        this.f48303xcc7d15ae = 0;
        this.f48312x602fd2f5 = i19;
        this.f48306x2d433340 = handlerThread;
        m97743x72f068de(i28);
        this.f48310x602aa869 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(i28, i19, i17, i18, null, i27);
        this.f48303xcc7d15ae = i27;
    }
}

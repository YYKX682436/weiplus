package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* renamed from: com.tencent.mm.rfx.inner.RfxVideoSurface */
/* loaded from: classes14.dex */
public class C20960x26a13e76 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: HandlerThreadCount */
    private static int f39159x851c039b;

    /* renamed from: handlerLock */
    private static final java.lang.Object f39160x59fedb95 = new java.lang.Object();

    /* renamed from: handlerThread */
    private static android.os.HandlerThread f39161xe30131f4;

    /* renamed from: outputSurface */
    private android.view.Surface f39165x10d4786c;

    /* renamed from: surfaceTexture */
    private android.graphics.SurfaceTexture f39168x299653ae;

    /* renamed from: width */
    private int f39169x6be2dc6 = 0;

    /* renamed from: height */
    private int f39164xb7389127 = 0;

    /* renamed from: frameSyncObject */
    private final java.lang.Object f39163xb30b6b07 = new java.lang.Object();

    /* renamed from: frameAvailable */
    private boolean f39162x31144bdc = false;

    /* renamed from: released */
    private boolean f39166xdf23d93d = false;

    /* renamed from: retainCount */
    private int f39167xac2d4b0a = 1;

    /* renamed from: Make */
    private static com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 m77643x247a0e(int i17, int i18) {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 c20960x26a13e76 = new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76();
        c20960x26a13e76.f39169x6be2dc6 = i17;
        c20960x26a13e76.f39164xb7389127 = i18;
        synchronized (f39160x59fedb95) {
            m77644x2f5f08d2();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                c20960x26a13e76.f39168x299653ae = new android.graphics.SurfaceTexture(false);
            } else {
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
                c20960x26a13e76.f39168x299653ae = surfaceTexture;
                surfaceTexture.detachFromGLContext();
            }
            c20960x26a13e76.f39168x299653ae.setOnFrameAvailableListener(c20960x26a13e76, new android.os.Handler(f39161xe30131f4.getLooper()));
        }
        c20960x26a13e76.f39165x10d4786c = new android.view.Surface(c20960x26a13e76.f39168x299653ae);
        return c20960x26a13e76;
    }

    /* renamed from: StartHandlerThread */
    private static synchronized void m77644x2f5f08d2() {
        synchronized (com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76.class) {
            f39159x851c039b++;
            if (f39161xe30131f4 == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("rfxpag_VideoSurface");
                f39161xe30131f4 = handlerThread;
                handlerThread.start();
            }
        }
    }

    /* renamed from: attachToGLContext */
    private boolean m77645xc868816a(int i17) {
        try {
            this.f39168x299653ae.attachToGLContext(i17);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: reflectLooper */
    private void m77646xccf1bb6e() {
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
        try {
            java.lang.Object newInstance = cls.getConstructor(android.graphics.SurfaceTexture.class, android.os.Looper.class).newInstance(this.f39168x299653ae, f39161xe30131f4.getLooper());
            java.lang.reflect.Field declaredField = this.f39168x299653ae.getClass().getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            declaredField.set(this.f39168x299653ae, newInstance);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: updateTexImage */
    private boolean m77647xf5b8bd5d() {
        synchronized (this.f39163xb30b6b07) {
            int i17 = 10;
            while (!this.f39162x31144bdc && i17 > 0) {
                i17--;
                try {
                    this.f39163xb30b6b07.wait(50L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
            this.f39162x31144bdc = false;
            if (i17 == 0) {
                return false;
            }
            try {
                this.f39168x299653ae.updateTexImage();
                return true;
            } catch (java.lang.Exception unused2) {
                return false;
            }
        }
    }

    /* renamed from: videoHeight */
    private int m77648x2a8d0982() {
        float[] fArr = new float[16];
        this.f39168x299653ae.getTransformMatrix(fArr);
        float abs = java.lang.Math.abs(fArr[5]);
        return abs > 0.0f ? java.lang.Math.round(this.f39164xb7389127 / (abs + ((fArr[13] - abs) * 2.0f))) : this.f39164xb7389127;
    }

    /* renamed from: videoWidth */
    private int m77649x9f1bbe0b() {
        float[] fArr = new float[16];
        this.f39168x299653ae.getTransformMatrix(fArr);
        float abs = java.lang.Math.abs(fArr[0]);
        return abs > 0.0f ? java.lang.Math.round(this.f39169x6be2dc6 / (abs + (fArr[12] * 2.0f))) : this.f39169x6be2dc6;
    }

    /* renamed from: getOutputSurface */
    public android.view.Surface m77650xce3434b6() {
        return this.f39165x10d4786c;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.f39163xb30b6b07) {
            if (this.f39162x31144bdc) {
                new java.lang.RuntimeException("frameAvailable already set, frame could be dropped");
            } else {
                this.f39162x31144bdc = true;
                this.f39163xb30b6b07.notifyAll();
            }
        }
    }

    /* renamed from: release */
    public void m77651x41012807() {
        int i17 = this.f39167xac2d4b0a - 1;
        this.f39167xac2d4b0a = i17;
        if (this.f39166xdf23d93d || i17 > 0) {
            return;
        }
        this.f39166xdf23d93d = true;
        synchronized (f39160x59fedb95) {
            int i18 = f39159x851c039b - 1;
            f39159x851c039b = i18;
            if (i18 == 0) {
                f39161xe30131f4.quit();
                f39161xe30131f4 = null;
            }
        }
        android.view.Surface surface = this.f39165x10d4786c;
        if (surface != null) {
            surface.release();
            this.f39165x10d4786c = null;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f39168x299653ae;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f39168x299653ae = null;
        }
    }

    /* renamed from: retain */
    public void m77652xc84df105() {
        this.f39167xac2d4b0a++;
    }
}

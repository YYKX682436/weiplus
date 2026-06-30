package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.ProcessSurface */
/* loaded from: classes14.dex */
public class C26424x50c0e75e implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private static final java.lang.String TAG = "sifeng: ProcessSurface";

    /* renamed from: mFrameAvailable */
    private boolean f53536x37c755a9;

    /* renamed from: mFrameSyncObject */
    private java.lang.Object f53537x82b99ada = new java.lang.Object();

    /* renamed from: mHeight */
    private int f53538x6a4b7f4;

    /* renamed from: mSurface */
    private android.view.Surface f53539x2fa29f80;

    /* renamed from: mSurfaceTexture */
    private android.graphics.SurfaceTexture f53540x30495d7b;

    /* renamed from: mTextureRender */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de f53541x6a108b24;

    /* renamed from: mWidth */
    private int f53542xbefb7959;

    /* renamed from: renderHandler */
    private android.os.Handler f53543xf42dd8d4;

    /* renamed from: renderThread */
    private android.os.HandlerThread f53544x2d433340;

    /* renamed from: com.tencent.thumbplayer.core.postprocessor.ProcessSurface$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$thumbplayer$core$postprocessor$ProcessSurface$TPProcessType */
        static final /* synthetic */ int[] f53545x945a352f;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.m102764xcee59d22().length];
            f53545x945a352f = iArr;
            try {
                iArr[com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_SHARPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f53545x945a352f[com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_HDR2SDR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.postprocessor.ProcessSurface$TPProcessType */
    /* loaded from: classes14.dex */
    public enum TPProcessType {
        TP_PROCESS_UNKNOWN,
        TP_PROCESS_SHARPEN,
        TP_PROCESS_HDR2SDR
    }

    public C26424x50c0e75e(int i17, int i18, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType tPProcessType) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("TP-ProcessSurface-RenderThread");
        this.f53544x2d433340 = handlerThread;
        handlerThread.start();
        this.f53543xf42dd8d4 = new android.os.Handler(this.f53544x2d433340.getLooper());
        this.f53542xbefb7959 = i17;
        this.f53538x6a4b7f4 = i18;
        m102756x6843a7d(str, tPProcessType);
    }

    /* renamed from: setup */
    private void m102756x6843a7d(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType tPProcessType) {
        int i17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.AnonymousClass1.f53545x945a352f[tPProcessType.ordinal()];
        if (i17 == 1) {
            this.f53541x6a108b24 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.C26433x626305f4(str);
        } else if (i17 != 2) {
            return;
        } else {
            this.f53541x6a108b24 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.C26431xcb6fba22(str);
        }
        this.f53541x6a108b24.mo102810xfe6786e();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("Render surface create");
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.f53541x6a108b24.mo102811x473c490f());
        this.f53540x30495d7b = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this, this.f53543xf42dd8d4);
        this.f53539x2fa29f80 = new android.view.Surface(this.f53540x30495d7b);
    }

    /* renamed from: awaitNewImage */
    public boolean m102757x13bc3b11() {
        synchronized (this.f53537x82b99ada) {
            do {
                if (this.f53536x37c755a9) {
                    this.f53536x37c755a9 = false;
                } else {
                    try {
                        this.f53537x82b99ada.wait(16L);
                    } catch (java.lang.InterruptedException unused) {
                        return false;
                    }
                }
            } while (this.f53536x37c755a9);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "sifeng: Surface frame wait timed out");
            throw new java.lang.RuntimeException("sifeng: Surface frame wait timed out");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.p3045x5e0f67f.InterfaceC26432x5eb375de.m102813x15195fb("before updateTexImage");
        this.f53540x30495d7b.updateTexImage();
        return true;
    }

    /* renamed from: drawImage */
    public void m102758x7863677(int i17, int i18, int i19, int i27, boolean z17, int i28) {
        this.f53542xbefb7959 = i17;
        this.f53538x6a4b7f4 = i18;
        this.f53541x6a108b24.mo102812xed8d1e6f(this.f53540x30495d7b, i17, i18, i19, i27, z17, i28);
    }

    /* renamed from: getSurface */
    public android.view.Surface m102759xcf572877() {
        return this.f53539x2fa29f80;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this.f53537x82b99ada) {
            if (this.f53536x37c755a9) {
                throw new java.lang.RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.f53536x37c755a9 = true;
            this.f53537x82b99ada.notifyAll();
        }
    }

    /* renamed from: release */
    public void m102760x41012807() {
        this.f53541x6a108b24.mo102809xdd60ded9();
        this.f53541x6a108b24 = null;
        android.view.Surface surface = this.f53539x2fa29f80;
        if (surface != null) {
            surface.release();
            this.f53539x2fa29f80 = null;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f53540x30495d7b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f53540x30495d7b = null;
        }
        android.os.HandlerThread handlerThread = this.f53544x2d433340;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }
}

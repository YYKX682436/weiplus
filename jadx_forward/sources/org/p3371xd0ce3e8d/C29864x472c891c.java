package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.SurfaceTextureHelper */
/* loaded from: classes16.dex */
public class C29864x472c891c {
    private static final java.lang.String TAG = "SurfaceTextureHelper";

    /* renamed from: eglBase */
    private final org.p3371xd0ce3e8d.InterfaceC29759xf7e285db f75963x94a9edfb;

    /* renamed from: frameRefMonitor */
    private final org.p3371xd0ce3e8d.C29864x472c891c.FrameRefMonitor f75964x95dac294;

    /* renamed from: frameRotation */
    private int f75965x63b0600b;

    /* renamed from: handler */
    private final android.os.Handler f75966x294b574a;

    /* renamed from: hasPendingTexture */
    private boolean f75967x835a04be;

    /* renamed from: isQuitting */
    private boolean f75968x921b5d07;

    /* renamed from: isTextureInUse */
    private volatile boolean f75969x77c91811;

    /* renamed from: listener */
    private org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e f75970x503cc4b4;

    /* renamed from: oesTextureId */
    private final int f75971xc0e2eb9;

    /* renamed from: pendingListener */
    private org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e f75972xef2c2b6b;

    /* renamed from: setListenerRunnable */
    final java.lang.Runnable f75973x7a760473;

    /* renamed from: surfaceTexture */
    private final android.graphics.SurfaceTexture f75974x299653ae;

    /* renamed from: textureHeight */
    private int f75975xfdefd222;

    /* renamed from: textureRefCountMonitor */
    private final org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor f75976xc6ef6e3;

    /* renamed from: textureWidth */
    private int f75977xa5ed616b;

    /* renamed from: timestampAligner */
    private final org.p3371xd0ce3e8d.C29883x609d649c f75978x92d9207c;

    /* renamed from: yuvConverter */
    private final org.p3371xd0ce3e8d.C29917xb5bbfe06 f75979xabf0a9e6;

    /* renamed from: org.webrtc.SurfaceTextureHelper$FrameRefMonitor */
    /* loaded from: classes16.dex */
    public interface FrameRefMonitor {
        /* renamed from: onDestroyBuffer */
        void m156417x8485a13b(org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer);

        /* renamed from: onNewBuffer */
        void m156418xbdaeaee1(org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer);

        /* renamed from: onReleaseBuffer */
        void m156419xd21e2b88(org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer);

        /* renamed from: onRetainBuffer */
        void m156420x4d576524(org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer);
    }

    /* renamed from: create */
    public static org.p3371xd0ce3e8d.C29864x472c891c m156391xaf65a0fc(final java.lang.String str, final org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, final boolean z17, final org.p3371xd0ce3e8d.C29917xb5bbfe06 c29917xb5bbfe06, final org.p3371xd0ce3e8d.C29864x472c891c.FrameRefMonitor frameRefMonitor) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str);
        handlerThread.start();
        final android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        return (org.p3371xd0ce3e8d.C29864x472c891c) org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156476x29214152(handler, new java.util.concurrent.Callable<org.p3371xd0ce3e8d.C29864x472c891c>() { // from class: org.webrtc.SurfaceTextureHelper.1
            @Override // java.util.concurrent.Callable
            public org.p3371xd0ce3e8d.C29864x472c891c call() {
                try {
                    return new org.p3371xd0ce3e8d.C29864x472c891c(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context.this, handler, z17, c29917xb5bbfe06, frameRefMonitor);
                } catch (java.lang.RuntimeException e17) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.C29864x472c891c.TAG, str + " create failure", e17);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispose$6 */
    public /* synthetic */ void m156392x84988e54() {
        this.f75968x921b5d07 = true;
        if (this.f75969x77c91811) {
            return;
        }
        m156399x41012807();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$forceFrame$3 */
    public /* synthetic */ void m156393x2478370e() {
        this.f75967x835a04be = true;
        m156402x344ba91c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ void m156394x51ef5f0f(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.f75967x835a04be) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "A frame is already pending, dropping frame.");
        }
        this.f75967x835a04be = true;
        m156402x344ba91c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$returnTextureFrame$5 */
    public /* synthetic */ void m156395xd5cc3f30() {
        this.f75969x77c91811 = false;
        if (this.f75968x921b5d07) {
            m156399x41012807();
        } else {
            m156402x344ba91c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setFrameRotation$4 */
    public /* synthetic */ void m156396x47a02916(int i17) {
        this.f75965x63b0600b = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setTextureSize$2 */
    public /* synthetic */ void m156397xd9905745(int i17, int i18) {
        this.f75977xa5ed616b = i17;
        this.f75975xfdefd222 = i18;
        m156402x344ba91c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$stopListening$1 */
    public /* synthetic */ void m156398x2546a649() {
        this.f75970x503cc4b4 = null;
        this.f75972xef2c2b6b = null;
    }

    /* renamed from: release */
    private void m156399x41012807() {
        if (this.f75966x294b574a.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Wrong thread.");
        }
        if (this.f75969x77c91811 || !this.f75968x921b5d07) {
            throw new java.lang.IllegalStateException("Unexpected release.");
        }
        this.f75979xabf0a9e6.m156596x41012807();
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f75971xc0e2eb9}, 0);
        this.f75974x299653ae.release();
        this.f75963x94a9edfb.mo155416x41012807();
        this.f75966x294b574a.getLooper().quit();
        org.p3371xd0ce3e8d.C29883x609d649c c29883x609d649c = this.f75978x92d9207c;
        if (c29883x609d649c != null) {
            c29883x609d649c.m156488x63a5261f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: returnTextureFrame */
    public void m156400x63392662() {
        this.f75966x294b574a.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$g
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29864x472c891c.this.m156395xd5cc3f30();
            }
        });
    }

    /* renamed from: setOnFrameAvailableListener */
    private static void m156401xdd9eabf1(android.graphics.SurfaceTexture surfaceTexture, android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, android.os.Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* renamed from: tryDeliverTextureFrame */
    private void m156402x344ba91c() {
        if (this.f75966x294b574a.getLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Wrong thread.");
        }
        if (this.f75968x921b5d07 || !this.f75967x835a04be || this.f75969x77c91811 || this.f75970x503cc4b4 == null) {
            return;
        }
        if (this.f75977xa5ed616b == 0 || this.f75975xfdefd222 == 0) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Texture size has not been set.");
            return;
        }
        this.f75969x77c91811 = true;
        this.f75967x835a04be = false;
        m156403xf5b8bd5d();
        float[] fArr = new float[16];
        this.f75974x299653ae.getTransformMatrix(fArr);
        long timestamp = this.f75974x299653ae.getTimestamp();
        org.p3371xd0ce3e8d.C29883x609d649c c29883x609d649c = this.f75978x92d9207c;
        if (c29883x609d649c != null) {
            timestamp = c29883x609d649c.m156489x65d9ef68(timestamp);
        }
        org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db = new org.p3371xd0ce3e8d.C29875x346d5db(this.f75977xa5ed616b, this.f75975xfdefd222, org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer.Type.OES, this.f75971xc0e2eb9, org.p3371xd0ce3e8d.C29847x54db44ae.m156229x48aaa4cc(fArr), this.f75966x294b574a, this.f75979xabf0a9e6, this.f75976xc6ef6e3);
        org.p3371xd0ce3e8d.C29864x472c891c.FrameRefMonitor frameRefMonitor = this.f75964x95dac294;
        if (frameRefMonitor != null) {
            frameRefMonitor.m156418xbdaeaee1(c29875x346d5db);
        }
        org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2 = new org.p3371xd0ce3e8d.C29904x150215d2(c29875x346d5db, this.f75965x63b0600b, timestamp);
        this.f75970x503cc4b4.mo155128xaf987ece(c29904x150215d2);
        c29904x150215d2.mo155513x41012807();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateTexImage */
    public void m156403xf5b8bd5d() {
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            this.f75974x299653ae.updateTexImage();
        }
    }

    /* renamed from: dispose */
    public void m156404x63a5261f() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "dispose()");
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156477x29214152(this.f75966x294b574a, new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29864x472c891c.this.m156392x84988e54();
            }
        });
    }

    /* renamed from: forceFrame */
    public void m156405x6a74942() {
        this.f75966x294b574a.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29864x472c891c.this.m156393x2478370e();
            }
        });
    }

    /* renamed from: getHandler */
    public android.os.Handler m156406x67189314() {
        return this.f75966x294b574a;
    }

    /* renamed from: getSurfaceTexture */
    public android.graphics.SurfaceTexture m156407x182e20a4() {
        return this.f75974x299653ae;
    }

    /* renamed from: isTextureInUse */
    public boolean m156408x77c91811() {
        return this.f75969x77c91811;
    }

    /* renamed from: setFrameRotation */
    public void m156409xb3e682c9(final int i17) {
        this.f75966x294b574a.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$e
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29864x472c891c.this.m156396x47a02916(i17);
            }
        });
    }

    /* renamed from: setTextureSize */
    public void m156410xd06addfa(final int i17, final int i18) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("Texture width must be positive, but was " + i17);
        }
        if (i18 > 0) {
            this.f75974x299653ae.setDefaultBufferSize(i17, i18);
            this.f75966x294b574a.post(new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$c
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.C29864x472c891c.this.m156397xd9905745(i17, i18);
                }
            });
        } else {
            throw new java.lang.IllegalArgumentException("Texture height must be positive, but was " + i18);
        }
    }

    /* renamed from: startListening */
    public void m156411xa23d0a79(org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e interfaceC29908xc6e4d18e) {
        if (this.f75970x503cc4b4 != null || this.f75972xef2c2b6b != null) {
            throw new java.lang.IllegalStateException("SurfaceTextureHelper listener has already been set.");
        }
        this.f75972xef2c2b6b = interfaceC29908xc6e4d18e;
        this.f75966x294b574a.post(this.f75973x7a760473);
    }

    /* renamed from: stopListening */
    public void m156412x3f73dad9() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "stopListening()");
        this.f75966x294b574a.removeCallbacks(this.f75973x7a760473);
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156477x29214152(this.f75966x294b574a, new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper$$d
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29864x472c891c.this.m156398x2546a649();
            }
        });
    }

    @java.lang.Deprecated
    /* renamed from: textureToYuv */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer m156413xa5c5ac04(org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer textureBuffer) {
        return textureBuffer.mo155646xcc305184();
    }

    private C29864x472c891c(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, android.os.Handler handler, boolean z17, org.p3371xd0ce3e8d.C29917xb5bbfe06 c29917xb5bbfe06, org.p3371xd0ce3e8d.C29864x472c891c.FrameRefMonitor frameRefMonitor) {
        this.f75976xc6ef6e3 = new org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor() { // from class: org.webrtc.SurfaceTextureHelper.2
            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onDestroy */
            public void mo156414xac79a11b(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
                org.p3371xd0ce3e8d.C29864x472c891c.this.m156400x63392662();
                if (org.p3371xd0ce3e8d.C29864x472c891c.this.f75964x95dac294 != null) {
                    org.p3371xd0ce3e8d.C29864x472c891c.this.f75964x95dac294.m156417x8485a13b(c29875x346d5db);
                }
            }

            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onRelease */
            public void mo156415x90a72928(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
                if (org.p3371xd0ce3e8d.C29864x472c891c.this.f75964x95dac294 != null) {
                    org.p3371xd0ce3e8d.C29864x472c891c.this.f75964x95dac294.m156419xd21e2b88(c29875x346d5db);
                }
            }

            @Override // org.p3371xd0ce3e8d.C29875x346d5db.RefCountMonitor
            /* renamed from: onRetain */
            public void mo156416x5742c7c4(org.p3371xd0ce3e8d.C29875x346d5db c29875x346d5db) {
                if (org.p3371xd0ce3e8d.C29864x472c891c.this.f75964x95dac294 != null) {
                    org.p3371xd0ce3e8d.C29864x472c891c.this.f75964x95dac294.m156420x4d576524(c29875x346d5db);
                }
            }
        };
        this.f75973x7a760473 = new java.lang.Runnable() { // from class: org.webrtc.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29864x472c891c.TAG, "Setting listener to " + org.p3371xd0ce3e8d.C29864x472c891c.this.f75972xef2c2b6b);
                org.p3371xd0ce3e8d.C29864x472c891c c29864x472c891c = org.p3371xd0ce3e8d.C29864x472c891c.this;
                c29864x472c891c.f75970x503cc4b4 = c29864x472c891c.f75972xef2c2b6b;
                org.p3371xd0ce3e8d.C29864x472c891c.this.f75972xef2c2b6b = null;
                if (org.p3371xd0ce3e8d.C29864x472c891c.this.f75967x835a04be) {
                    org.p3371xd0ce3e8d.C29864x472c891c.this.m156403xf5b8bd5d();
                    org.p3371xd0ce3e8d.C29864x472c891c.this.f75967x835a04be = false;
                }
            }
        };
        if (handler.getLooper().getThread() == java.lang.Thread.currentThread()) {
            this.f75966x294b574a = handler;
            this.f75978x92d9207c = z17 ? new org.p3371xd0ce3e8d.C29883x609d649c() : null;
            this.f75979xabf0a9e6 = c29917xb5bbfe06;
            this.f75964x95dac294 = frameRefMonitor;
            org.p3371xd0ce3e8d.InterfaceC29759xf7e285db m155431xaf65a0fc = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155431xaf65a0fc(context, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75302x3f179a16);
            this.f75963x94a9edfb = m155431xaf65a0fc;
            try {
                m155431xaf65a0fc.mo155408xc7ea9609();
                m155431xaf65a0fc.mo155415x900967ab();
                int m155563xe06639e6 = org.p3371xd0ce3e8d.C29784x7f4262a7.m155563xe06639e6(36197);
                this.f75971xc0e2eb9 = m155563xe06639e6;
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(m155563xe06639e6);
                this.f75974x299653ae = surfaceTexture;
                m156401xdd9eabf1(surfaceTexture, new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.SurfaceTextureHelper$$f
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                        org.p3371xd0ce3e8d.C29864x472c891c.this.m156394x51ef5f0f(surfaceTexture2);
                    }
                }, handler);
                return;
            } catch (java.lang.RuntimeException e17) {
                this.f75963x94a9edfb.mo155416x41012807();
                handler.getLooper().quit();
                throw e17;
            }
        }
        throw new java.lang.IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    /* renamed from: create */
    public static org.p3371xd0ce3e8d.C29864x472c891c m156388xaf65a0fc(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context) {
        return m156391xaf65a0fc(str, context, false, new org.p3371xd0ce3e8d.C29917xb5bbfe06(), null);
    }

    /* renamed from: create */
    public static org.p3371xd0ce3e8d.C29864x472c891c m156389xaf65a0fc(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, boolean z17) {
        return m156391xaf65a0fc(str, context, z17, new org.p3371xd0ce3e8d.C29917xb5bbfe06(), null);
    }

    /* renamed from: create */
    public static org.p3371xd0ce3e8d.C29864x472c891c m156390xaf65a0fc(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, boolean z17, org.p3371xd0ce3e8d.C29917xb5bbfe06 c29917xb5bbfe06) {
        return m156391xaf65a0fc(str, context, z17, c29917xb5bbfe06, null);
    }
}

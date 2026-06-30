package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoFileRenderer */
/* loaded from: classes16.dex */
public class C29899xdfa2265a implements org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e {
    private static final java.lang.String TAG = "VideoFileRenderer";

    /* renamed from: eglBase */
    private org.p3371xd0ce3e8d.InterfaceC29759xf7e285db f76093x94a9edfb;

    /* renamed from: fileThread */
    private final android.os.HandlerThread f76094x6c6ee2a6;

    /* renamed from: fileThreadHandler */
    private final android.os.Handler f76095xdf5e5c4;

    /* renamed from: frameCount */
    private int f76096xee5393a2;

    /* renamed from: outputFileHeight */
    private final int f76097x5bc2cda4;

    /* renamed from: outputFileName */
    private final java.lang.String f76098x3e2cb248;

    /* renamed from: outputFileWidth */
    private final int f76099x87ebeda9;

    /* renamed from: outputFrameBuffer */
    private final java.nio.ByteBuffer f76100x5648384c;

    /* renamed from: outputFrameSize */
    private final int f76101xf754170d;

    /* renamed from: renderThread */
    private final android.os.HandlerThread f76102x2d433340;

    /* renamed from: renderThreadHandler */
    private final android.os.Handler f76103x521c93ea;

    /* renamed from: videoOutFile */
    private final java.io.FileOutputStream f76104xb53954ef;

    /* renamed from: yuvConverter */
    private org.p3371xd0ce3e8d.C29917xb5bbfe06 f76105xabf0a9e6;

    public C29899xdfa2265a(java.lang.String str, int i17, int i18, final org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context) {
        if (i17 % 2 == 1 || i18 % 2 == 1) {
            throw new java.lang.IllegalArgumentException("Does not support uneven width or height");
        }
        this.f76098x3e2cb248 = str;
        this.f76099x87ebeda9 = i17;
        this.f76097x5bc2cda4 = i18;
        int i19 = ((i17 * i18) * 3) / 2;
        this.f76101xf754170d = i19;
        this.f76100x5648384c = java.nio.ByteBuffer.allocateDirect(i19);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str);
        this.f76104xb53954ef = fileOutputStream;
        fileOutputStream.write(("YUV4MPEG2 C420 W" + i17 + " H" + i18 + " Ip F30:1 A1:1\n").getBytes(java.nio.charset.Charset.forName("US-ASCII")));
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("VideoFileRendererRenderThread");
        this.f76102x2d433340 = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f76103x521c93ea = handler;
        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("VideoFileRendererFileThread");
        this.f76094x6c6ee2a6 = handlerThread2;
        handlerThread2.start();
        this.f76095xdf5e5c4 = new android.os.Handler(handlerThread2.getLooper());
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156477x29214152(handler, new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.f76093x94a9edfb = org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.EglBaseStatic.m155431xaf65a0fc(context, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75302x3f179a16);
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.f76093x94a9edfb.mo155408xc7ea9609();
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.f76093x94a9edfb.mo155415x900967ab();
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.f76105xabf0a9e6 = new org.p3371xd0ce3e8d.C29917xb5bbfe06();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$2 */
    public /* synthetic */ void m156539x7afbb638(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f76105xabf0a9e6.m156596x41012807();
        this.f76093x94a9edfb.mo155416x41012807();
        this.f76102x2d433340.quit();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$3 */
    public /* synthetic */ void m156540x7afbb639() {
        try {
            this.f76104xb53954ef.close();
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Video written to disk as " + this.f76098x3e2cb248 + ". The number of frames is " + this.f76096xee5393a2 + " and the dimensions of the frames are " + this.f76099x87ebeda9 + "x" + this.f76097x5bc2cda4 + ".");
            this.f76094x6c6ee2a6.quit();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Error closing output file", e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$renderFrameOnRenderThread$1 */
    public /* synthetic */ void m156541xd9a807c6(org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer i420Buffer, org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        org.p3371xd0ce3e8d.C29919xe8726508.m156604x8e3d7744(i420Buffer.mo155640x744cac39(), i420Buffer.mo155644xcda3b86a(), i420Buffer.mo155638x744cac35(), i420Buffer.mo155642xcda3b866(), i420Buffer.mo155639x744cac36(), i420Buffer.mo155643xcda3b867(), this.f76100x5648384c, i420Buffer.mo155645x755bd410(), i420Buffer.mo155641x1c4fb41d(), c29904x150215d2.m156547x79734cf4());
        i420Buffer.mo155513x41012807();
        try {
            this.f76104xb53954ef.write("FRAME\n".getBytes(java.nio.charset.Charset.forName("US-ASCII")));
            this.f76104xb53954ef.write(this.f76100x5648384c.array(), this.f76100x5648384c.arrayOffset(), this.f76101xf754170d);
            this.f76096xee5393a2++;
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException("Error writing video to disk", e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderFrameOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void m156538xa118773d(final org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        org.p3371xd0ce3e8d.C29904x150215d2.Buffer m156544x12f2b736 = c29904x150215d2.m156544x12f2b736();
        int i17 = c29904x150215d2.m156547x79734cf4() % 180 == 0 ? this.f76099x87ebeda9 : this.f76097x5bc2cda4;
        int i18 = c29904x150215d2.m156547x79734cf4() % 180 == 0 ? this.f76097x5bc2cda4 : this.f76099x87ebeda9;
        float mo155645x755bd410 = m156544x12f2b736.mo155645x755bd410() / m156544x12f2b736.mo155641x1c4fb41d();
        float f17 = i17 / i18;
        int mo155645x755bd4102 = m156544x12f2b736.mo155645x755bd410();
        int mo155641x1c4fb41d = m156544x12f2b736.mo155641x1c4fb41d();
        if (f17 > mo155645x755bd410) {
            mo155641x1c4fb41d = (int) (mo155641x1c4fb41d * (mo155645x755bd410 / f17));
        } else {
            mo155645x755bd4102 = (int) (mo155645x755bd4102 * (f17 / mo155645x755bd410));
        }
        org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63 = m156544x12f2b736.mo155637xdbd1bc63((m156544x12f2b736.mo155645x755bd410() - mo155645x755bd4102) / 2, (m156544x12f2b736.mo155641x1c4fb41d() - mo155641x1c4fb41d) / 2, mo155645x755bd4102, mo155641x1c4fb41d, i17, i18);
        c29904x150215d2.mo155513x41012807();
        final org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184 = mo155637xdbd1bc63.mo155646xcc305184();
        mo155637xdbd1bc63.mo155513x41012807();
        this.f76095xdf5e5c4.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$d
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.m156541xd9a807c6(mo155646xcc305184, c29904x150215d2);
            }
        });
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(final org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        c29904x150215d2.mo155514xc84df105();
        this.f76103x521c93ea.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$c
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.m156538xa118773d(c29904x150215d2);
            }
        });
    }

    /* renamed from: release */
    public void m156543x41012807() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.f76103x521c93ea.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.m156539x7afbb638(countDownLatch);
            }
        });
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156471x3f10571a(countDownLatch);
        this.f76095xdf5e5c4.post(new java.lang.Runnable() { // from class: org.webrtc.VideoFileRenderer$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29899xdfa2265a.this.m156540x7afbb639();
            }
        });
        try {
            this.f76094x6c6ee2a6.join();
        } catch (java.lang.InterruptedException e17) {
            java.lang.Thread.currentThread().interrupt();
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Interrupted while waiting for the write to disk to complete.", e17);
        }
    }
}

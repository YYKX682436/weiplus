package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetWriterInput */
/* loaded from: classes16.dex */
public class C25667x9a895e27 {

    /* renamed from: assetWriter */
    private com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25682xe68c577a f47380x517a8783;

    /* renamed from: handler */
    private android.os.Handler f47381x294b574a;

    /* renamed from: handlerThread */
    private android.os.HandlerThread f47382xe30131f4;

    /* renamed from: indicatorInfo */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb f47383xec76f75d;

    /* renamed from: isEnableNewTextureBlitting */
    private boolean f47384x3527020b;

    /* renamed from: lutBitmap */
    private android.graphics.Bitmap f47386x75b90d1a;

    /* renamed from: matrixFilter */
    public com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798 f47387x4dc0ba99;

    /* renamed from: mediaType */
    private int f47388x7f94e13e;

    /* renamed from: metadata */
    private java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> f47389xe52d7b2f;

    /* renamed from: oesTextureBlitTexture */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f47390xdff34088;

    /* renamed from: oesTextureBlitter */
    public com.p314xaae8f345.tav.p2959x5befac44.ofs.C25810x25c39e0e f47391xa8a8622e;

    /* renamed from: progressListener */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener f47392x70916e01;

    /* renamed from: readyForMoreMediaData */
    private boolean f47393xc7d5ff53;

    /* renamed from: statusListener */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.StatusListener f47396x8056e6c6;

    /* renamed from: transform */
    private android.graphics.Matrix f47399x3ebe6b6c;

    /* renamed from: writer */
    private com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f f47400xd188a473;

    /* renamed from: writerHandler */
    private android.os.Handler f47401x5ce1f357;

    /* renamed from: writerThread */
    private android.os.HandlerThread f47402x62303c5d;
    private final java.lang.String TAG = "AssetWriterInput" + hashCode();

    /* renamed from: surfaceTextureRotateBackTransform */
    private final float[] f47398x7d94821c = new float[16];

    /* renamed from: started */
    private boolean f47395x8eeb4081 = false;

    /* renamed from: stop */
    private boolean f47397x360802 = false;

    /* renamed from: logger */
    private final com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f47385xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();

    /* renamed from: renderCost */
    private long f47394x4724aa83 = 0;

    /* renamed from: com.tencent.tav.core.AssetWriterInput$StatusListener */
    /* loaded from: classes16.dex */
    public interface StatusListener {
        /* renamed from: statusChanged */
        void mo96603xb9fbb662(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 enumC25668xc8009535);
    }

    /* renamed from: com.tencent.tav.core.AssetWriterInput$WriterAudioRunnable */
    /* loaded from: classes16.dex */
    public class WriterAudioRunnable implements java.lang.Runnable {

        /* renamed from: isEndBuffer */
        private final boolean f47408x892dfaf1;

        /* renamed from: sampleBuffer */
        private final com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f47409xe9bf8e8a;

        @Override // java.lang.Runnable
        public void run() {
            if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47381x294b574a == null || com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97508xafdb8087()) {
                return;
            }
            long j17 = -1;
            try {
                if (this.f47408x892dfaf1) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97500x6affabc();
                } else {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97521x1ba943c1(this.f47409xe9bf8e8a.m97195xfb85bb43().m97232x31040141(), this.f47409xe9bf8e8a.m97192x1d62828());
                    j17 = com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97502x93724445();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96770x949a2ee4 = th6 instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b ? th6.m96770x949a2ee4() : new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-122, th6);
                if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 = com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this;
                    m96770x949a2ee4.f47511xec76f75d = c25667x9a895e27.f47383xec76f75d;
                    c25667x9a895e27.f47392x70916e01.mo96421xaf8aa769(m96770x949a2ee4);
                    return;
                }
            }
            if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01.mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this, j17);
            }
        }

        private WriterAudioRunnable(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, boolean z17) {
            this.f47409xe9bf8e8a = c25734xcdff9c14;
            this.f47408x892dfaf1 = z17;
        }
    }

    /* renamed from: com.tencent.tav.core.AssetWriterInput$WriterProgressListener */
    /* loaded from: classes16.dex */
    public interface WriterProgressListener {
        /* renamed from: onError */
        void mo96421xaf8aa769(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6);

        /* renamed from: onProgressChanged */
        void mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, long j17);
    }

    /* renamed from: com.tencent.tav.core.AssetWriterInput$WriterVideoRunnable */
    /* loaded from: classes16.dex */
    public class WriterVideoRunnable implements java.lang.Runnable {

        /* renamed from: sampleBuffer */
        private final com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 f47411xe9bf8e8a;

        @Override // java.lang.Runnable
        public void run() {
            if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47381x294b574a != null) {
                try {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97522x3f75eca6(this.f47411xe9bf8e8a);
                    com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = this.f47411xe9bf8e8a;
                    if (c25734xcdff9c14 != null && c25734xcdff9c14.m97193x75286adb().m97214x36f88ac9(-1)) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97501x2a7ca3a1(this.f47411xe9bf8e8a);
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96770x949a2ee4 = th6 instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b ? th6.m96770x949a2ee4() : new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-121, th6);
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27 = com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this;
                        m96770x949a2ee4.f47511xec76f75d = c25667x9a895e27.f47383xec76f75d;
                        c25667x9a895e27.f47392x70916e01.mo96421xaf8aa769(m96770x949a2ee4);
                        return;
                    }
                }
                if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener writerProgressListener = com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01;
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e272 = com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this;
                    writerProgressListener.mo96422x95ed2be8(c25667x9a895e272, c25667x9a895e272.f47400xd188a473.m97507xbcb7bdaa());
                }
            }
        }

        private WriterVideoRunnable(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
            this.f47411xe9bf8e8a = c25734xcdff9c14;
        }
    }

    public C25667x9a895e27(int i17, boolean z17) {
        this.f47384x3527020b = false;
        this.f47388x7f94e13e = i17;
        this.f47384x3527020b = z17;
    }

    /* renamed from: appendAudioSampleBuffer */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96608xb417b586(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        android.os.HandlerThread handlerThread;
        if (this.f47397x360802 || this.f47401x5ce1f357 == null) {
            this.f47385xbe97f590.w(this.TAG, "appendAudioSampleBuffer: writer is stopped or handler is null");
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6.f47496xc0092790);
        }
        boolean m97238x9f3f7b48 = c25734xcdff9c14.m97195xfb85bb43().m97238x9f3f7b48(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
        if (!m97238x9f3f7b48) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(c25734xcdff9c14.m97192x1d62828().limit());
            allocate.order(c25734xcdff9c14.m97192x1d62828().order());
            allocate.put(c25734xcdff9c14.m97192x1d62828());
            allocate.flip();
            c25734xcdff9c14 = new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25734xcdff9c14.m97195xfb85bb43(), allocate);
        }
        if (this.f47401x5ce1f357 == null || (handlerThread = this.f47402x62303c5d) == null || !handlerThread.isAlive()) {
            this.f47385xbe97f590.w(this.TAG, "appendAudioSampleBuffer: writer thread not available");
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6.f47496xc0092790);
        }
        this.f47401x5ce1f357.post(new com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterAudioRunnable(c25734xcdff9c14, m97238x9f3f7b48));
        return null;
    }

    /* renamed from: appendVideoSampleBuffer */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96609x37b95eab(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        return m96610x37b95eab(c25734xcdff9c14, false);
    }

    /* renamed from: calculateFillingMVP */
    private static float[] m96611xb625cfee(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, int i17, int i18) {
        int i19;
        int i27;
        float f17;
        float f18;
        if (c25745xc3945049.m97281x3a04e469() != null) {
            i19 = c25745xc3945049.m97281x3a04e469().width();
            i27 = c25745xc3945049.m97281x3a04e469().height();
        } else {
            i19 = c25745xc3945049.f47894x6be2dc6;
            i27 = c25745xc3945049.f47883xb7389127;
        }
        if (c25745xc3945049.m97278x9558b042() % 180 != 0) {
            int i28 = i27;
            i27 = i19;
            i19 = i28;
        }
        float f19 = i17 / i18;
        float f27 = i19 / i27;
        if (f19 > f27) {
            f18 = f19 / f27;
            f17 = 1.0f;
        } else {
            f17 = f27 / f19;
            f18 = 1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f17, f18, 1.0f);
        return fArr;
    }

    /* renamed from: createBlitTexture */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m96612x2c7741ca(int i17, int i18) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i19 = iArr[0];
        android.opengl.GLES20.glBindTexture(3553, i19);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97620x90b29146("glTexParameter");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, i17, i18, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(i19, 3553, i17, i18, null, 0);
    }

    /* renamed from: onStartError */
    private void m96613x67e9ea05(java.lang.Exception exc, int i17) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6;
        if (exc instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b) {
            c25680x8a5723a6 = ((com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b) exc).m96770x949a2ee4();
        } else {
            c25680x8a5723a6 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(i17 == 1 ? -101 : -102, exc);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener writerProgressListener = this.f47392x70916e01;
        if (writerProgressListener != null) {
            c25680x8a5723a6.f47511xec76f75d = this.f47383xec76f75d;
            writerProgressListener.mo96421xaf8aa769(c25680x8a5723a6);
        }
    }

    /* renamed from: renderSampleBuffer */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m96614xa8c27340(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97194x3a00ef33 = c25734xcdff9c14.m97194x3a00ef33();
        if (m97194x3a00ef33 == null) {
            return null;
        }
        boolean z17 = !this.f47400xd188a473.m97509x3764a7a6();
        if (!this.f47384x3527020b || m97194x3a00ef33.m97279x9ef2e328() == null) {
            if (this.f47387x4dc0ba99 == null) {
                android.graphics.Bitmap bitmap = this.f47386x75b90d1a;
                if (bitmap == null || bitmap.isRecycled()) {
                    this.f47387x4dc0ba99 = new com.p314xaae8f345.tav.p2959x5befac44.C25765x7d6db798();
                } else {
                    this.f47387x4dc0ba99 = new com.p314xaae8f345.tav.p2959x5befac44.C25772xdc4495d2(this.f47386x75b90d1a);
                }
                this.f47387x4dc0ba99.mo97543x5e392181(this.f47380x517a8783.mo96593x399b739().m97645x6be2dc6());
                this.f47387x4dc0ba99.mo97542x4f1c14cc(this.f47380x517a8783.mo96593x399b739().m97632xb7389127());
                this.f47387x4dc0ba99.mo97541xf73870dd(z17);
            }
            return this.f47387x4dc0ba99.mo97526x79f87086(m97194x3a00ef33, this.f47399x3ebe6b6c, m97194x3a00ef33.m97280xc3a49506());
        }
        if (this.f47391xa8a8622e == null) {
            com.p314xaae8f345.tav.p2959x5befac44.ofs.C25810x25c39e0e c25810x25c39e0e = new com.p314xaae8f345.tav.p2959x5befac44.ofs.C25810x25c39e0e();
            this.f47391xa8a8622e = c25810x25c39e0e;
            c25810x25c39e0e.m97857xca027c49(this.f47386x75b90d1a);
            int m97645x6be2dc6 = this.f47380x517a8783.mo96593x399b739().m97645x6be2dc6();
            int m97632xb7389127 = this.f47380x517a8783.mo96593x399b739().m97632xb7389127();
            this.f47391xa8a8622e.m97858x736e9046(m96611xb625cfee(m97194x3a00ef33, m97645x6be2dc6, m97632xb7389127));
            this.f47390xdff34088 = m96612x2c7741ca(m97645x6be2dc6, m97632xb7389127);
        }
        com.p314xaae8f345.tav.p2959x5befac44.ofs.C25810x25c39e0e c25810x25c39e0e2 = this.f47391xa8a8622e;
        float[] m97279x9ef2e328 = m97194x3a00ef33.m97279x9ef2e328();
        int i17 = z17 ? -1 : this.f47390xdff34088.f47890xc35d0376;
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f47390xdff34088;
        c25810x25c39e0e2.m97853xad5e5050(m97194x3a00ef33, m97279x9ef2e328, i17, c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        if (z17) {
            return null;
        }
        return this.f47390xdff34088;
    }

    /* renamed from: addStatusListener */
    public void m96615xbaafdc7(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.StatusListener statusListener) {
        this.f47396x8056e6c6 = statusListener;
    }

    /* renamed from: appendSampleBuffer */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96616x14ffdac4(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        return m96617x14ffdac4(c25734xcdff9c14, false);
    }

    /* renamed from: close */
    public synchronized void m96618x5a5ddf8() {
        this.f47385xbe97f590.i(this.TAG, "close");
        this.f47397x360802 = true;
        this.f47393xc7d5ff53 = false;
        android.os.HandlerThread handlerThread = this.f47382xe30131f4;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f47382xe30131f4 = null;
            this.f47381x294b574a = null;
            this.f47385xbe97f590.i(this.TAG, "quit handlerThread");
        }
        if (this.f47402x62303c5d != null) {
            this.f47401x5ce1f357.removeCallbacksAndMessages(null);
            this.f47402x62303c5d.quit();
            this.f47385xbe97f590.i(this.TAG, "quit writerThread");
            this.f47402x62303c5d = null;
            this.f47401x5ce1f357 = null;
        }
    }

    /* renamed from: getLogStatus */
    public java.lang.String m96619x73c34da0() {
        return "readyForMoreMediaData: " + this.f47393xc7d5ff53 + " videoTrackWritable: " + this.f47400xd188a473.m97520x522ca950() + " audioTrackWritable: " + this.f47400xd188a473.m97498x61992dd5();
    }

    /* renamed from: getMediaType */
    public int m96620x7f025288() {
        return this.f47388x7f94e13e;
    }

    /* renamed from: getMetadata */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> m96621x6107b8a5() {
        return this.f47389xe52d7b2f;
    }

    /* renamed from: initConfig */
    public void m96622xf3d9c872(com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25682xe68c577a interfaceC25682xe68c577a) {
        this.f47380x517a8783 = interfaceC25682xe68c577a;
        this.f47400xd188a473 = interfaceC25682xe68c577a.mo96577xf855d0af();
    }

    /* renamed from: isReadyForMoreMediaData */
    public boolean m96623x11220049() {
        if (this.f47393xc7d5ff53) {
            if (this.f47388x7f94e13e == 1) {
                if (this.f47400xd188a473.m97520x522ca950()) {
                    return true;
                }
            } else if (this.f47400xd188a473.m97498x61992dd5()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: markAsFinished */
    public void m96624xb0dd6571() {
        this.f47401x5ce1f357.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetWriterInput.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47388x7f94e13e == 1) {
                    try {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97501x2a7ca3a1(null);
                    } catch (java.lang.Throwable th6) {
                        if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                            com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01.mo96421xaf8aa769(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-123, th6, "", com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47383xec76f75d));
                            return;
                        }
                    }
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01.mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this, -1L);
                        return;
                    }
                    return;
                }
                try {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47400xd188a473.m97500x6affabc();
                } catch (java.lang.Throwable th7) {
                    if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                        com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01.mo96421xaf8aa769(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-124, th7, "", com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47383xec76f75d));
                        return;
                    }
                }
                if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01 != null) {
                    com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.f47392x70916e01.mo96422x95ed2be8(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this, -1L);
                }
            }
        });
    }

    /* renamed from: postRunnable */
    public void m96625xe2c2fdd(java.lang.Runnable runnable) {
        if (this.f47381x294b574a == null || !this.f47382xe30131f4.isAlive()) {
            return;
        }
        this.f47381x294b574a.post(runnable);
    }

    /* renamed from: requestMediaDataWhenReadyOnQueue */
    public synchronized void m96626x7ed09da8(android.os.HandlerThread handlerThread, final java.lang.Runnable runnable) {
        if (this.f47381x294b574a != null) {
            this.f47385xbe97f590.e(this.TAG, "正在处理上一次的request请求，无法重复发起");
            return;
        }
        if (this.f47380x517a8783 == null) {
            this.f47385xbe97f590.e(this.TAG, "还没有与AssetWriter关联，无法发起request请求");
            return;
        }
        this.f47382xe30131f4 = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f47381x294b574a = handler;
        handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetWriterInput.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.m96633x68ac462()) {
                    runnable.run();
                }
            }
        });
        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("writerThread");
        this.f47402x62303c5d = handlerThread2;
        handlerThread2.start();
        this.f47401x5ce1f357 = new android.os.Handler(this.f47402x62303c5d.getLooper());
    }

    /* renamed from: reset */
    public void m96627x6761d4f(final java.lang.Runnable runnable) {
        this.f47381x294b574a.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetWriterInput.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.this.m96633x68ac462()) {
                    runnable.run();
                }
            }
        });
    }

    /* renamed from: setEnableLut */
    public void m96628x361aa546(android.graphics.Bitmap bitmap) {
        this.f47386x75b90d1a = bitmap;
    }

    /* renamed from: setLoggerConfig */
    public void m96629x596d8674(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73) {
        this.f47385xbe97f590.m97816x78bda44(c25800x8b670e73);
    }

    /* renamed from: setMetadata */
    public void m96630x5bc019b1(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25643x587c8f02> list) {
        this.f47389xe52d7b2f = list;
    }

    /* renamed from: setTransform */
    public void m96631x9a7f9d2a(android.graphics.Matrix matrix) {
        this.f47399x3ebe6b6c = matrix;
    }

    /* renamed from: setWriterProgressListener */
    public void m96632xaa772396(com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterProgressListener writerProgressListener) {
        this.f47392x70916e01 = writerProgressListener;
    }

    /* renamed from: start */
    public boolean m96633x68ac462() {
        this.f47385xbe97f590.i(this.TAG, "start");
        if (this.f47395x8eeb4081) {
            return true;
        }
        try {
            if (this.f47388x7f94e13e == 1) {
                this.f47400xd188a473.m97517xc7e4ada3();
                this.f47400xd188a473.m97515xd49e03b6(this.f47380x517a8783.mo96593x399b739());
            } else {
                this.f47400xd188a473.m97516x721c39e8();
            }
            this.f47393xc7d5ff53 = true;
            this.f47395x8eeb4081 = true;
        } catch (java.lang.Exception e17) {
            this.f47385xbe97f590.e(this.TAG, "start: ", e17);
            m96613x67e9ea05(e17, this.f47388x7f94e13e);
        }
        return this.f47395x8eeb4081;
    }

    /* renamed from: stop */
    public void m96634x360802() {
        this.f47397x360802 = true;
        this.f47393xc7d5ff53 = false;
    }

    /* renamed from: appendVideoSampleBuffer */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96610x37b95eab(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, boolean z17) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 c25680x8a5723a6;
        android.os.Handler handler;
        android.os.HandlerThread handlerThread;
        com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.ENCODE_RENDER_CLEAR);
        c25733xc7e62966.m97184xc75a0595();
        try {
            this.f47380x517a8783.mo96593x399b739().m97635x900967ab(z17);
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClear(16640);
            c25733xc7e62966.m97183x32057ace();
            if (c25734xcdff9c14 == null || c25734xcdff9c14.m97195xfb85bb43().m97232x31040141() < 0) {
                c25680x8a5723a6 = null;
            } else {
                this.f47385xbe97f590.m97814x5d2a96d(this.TAG, "appendSampleBuffer: start " + c25734xcdff9c14.m97195xfb85bb43());
                com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e629662 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.ENCODE_RENDER);
                c25733xc7e629662.m97180x5eb42364(c25733xc7e62966);
                c25733xc7e629662.m97184xc75a0595();
                try {
                    com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m96614xa8c27340 = m96614xa8c27340(c25734xcdff9c14);
                    if (this.f47400xd188a473.m97509x3764a7a6()) {
                        android.opengl.GLES20.glFinish();
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    this.f47400xd188a473.m97511x7423ac2f(m96614xa8c27340, c25734xcdff9c14.m97195xfb85bb43());
                    this.f47394x4724aa83 += java.lang.System.currentTimeMillis() - currentTimeMillis;
                    c25680x8a5723a6 = null;
                } catch (java.lang.Exception e17) {
                    c25680x8a5723a6 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-112, e17);
                }
                c25733xc7e629662.m97183x32057ace();
                com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e629663 = new com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.ENCODE_SWAP_BUFFER);
                c25733xc7e629663.m97180x5eb42364(c25733xc7e629662);
                c25733xc7e629663.m97184xc75a0595();
                try {
                    this.f47380x517a8783.mo96593x399b739().m97638xab5ea589(c25734xcdff9c14.m97195xfb85bb43().m97232x31040141());
                    this.f47380x517a8783.mo96593x399b739().m97641x82211f20();
                } catch (java.lang.Exception e18) {
                    c25680x8a5723a6 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-113, e18);
                }
                c25733xc7e629663.m97183x32057ace();
                c25734xcdff9c14.m97193x75286adb().f47857xa7c31030 = c25733xc7e629663;
                this.f47385xbe97f590.v(this.TAG, "appendSampleBuffer: end " + c25734xcdff9c14.m97195xfb85bb43());
            }
            if (this.f47397x360802 || (handler = this.f47401x5ce1f357) == null) {
                this.f47385xbe97f590.w(this.TAG, "appendVideoSampleBuffer: writer is stopped or handler is null");
                return new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6.f47496xc0092790);
            }
            if (handler != null && (handlerThread = this.f47402x62303c5d) != null && handlerThread.isAlive()) {
                this.f47401x5ce1f357.post(new com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.WriterVideoRunnable(c25734xcdff9c14));
                return c25680x8a5723a6;
            }
            this.f47385xbe97f590.w(this.TAG, "appendVideoSampleBuffer: writer thread not available");
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6.f47496xc0092790);
        } catch (java.lang.Exception e19) {
            return new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-111, e19);
        }
    }

    /* renamed from: appendSampleBuffer */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 m96617x14ffdac4(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, boolean z17) {
        if (!this.f47397x360802) {
            try {
                this.f47385xbe97f590.m97814x5d2a96d(this.TAG, "appendSampleBuffer: start " + c25734xcdff9c14.m97195xfb85bb43() + " type: " + this.f47388x7f94e13e);
                if (this.f47388x7f94e13e == 1 && this.f47380x517a8783.mo96593x399b739() != null) {
                    return m96610x37b95eab(c25734xcdff9c14, z17);
                }
                if (this.f47388x7f94e13e == 2) {
                    return m96608xb417b586(c25734xcdff9c14);
                }
            } catch (java.lang.Throwable th6) {
                this.f47385xbe97f590.e(this.TAG, "appendSampleBuffer: error", th6);
                com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27.StatusListener statusListener = this.f47396x8056e6c6;
                if (statusListener != null) {
                    statusListener.mo96603xb9fbb662(this, com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusFailed);
                }
                return new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-110, th6);
            }
        }
        this.f47385xbe97f590.e(this.TAG, "appendSampleBuffer abort, thread already stop");
        return new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-11);
    }
}

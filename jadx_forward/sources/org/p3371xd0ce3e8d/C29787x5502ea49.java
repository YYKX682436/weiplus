package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.HardwareVideoEncoder */
/* loaded from: classes16.dex */
public class C29787x5502ea49 implements org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 {

    /* renamed from: DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US */
    private static final int f75434x8fdf644c = 100000;

    /* renamed from: KEY_BITRATE_MODE */
    private static final java.lang.String f75435xa4779155 = "bitrate-mode";

    /* renamed from: MAX_ENCODER_Q_SIZE */
    private static final int f75436x5176482d = 2;

    /* renamed from: MAX_VIDEO_FRAMERATE */
    private static final int f75437x9aea9fce = 30;

    /* renamed from: MEDIA_CODEC_RELEASE_TIMEOUT_MS */
    private static final int f75438x79cbebc0 = 5000;
    private static final java.lang.String TAG = "HardwareVideoEncoder";

    /* renamed from: VIDEO_AVC_LEVEL_3 */
    private static final int f75439x83e47a3 = 256;

    /* renamed from: VIDEO_AVC_PROFILE_HIGH */
    private static final int f75440x40bbe3ed = 8;

    /* renamed from: VIDEO_ControlRateConstant */
    private static final int f75441x8813009d = 2;

    /* renamed from: adjustedBitrate */
    private int f75442x91503f1f;

    /* renamed from: automaticResizeOn */
    private boolean f75443xb62284fe;

    /* renamed from: bitrateAdjuster */
    private final org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9 f75444xeb03bf09;

    /* renamed from: callback */
    private org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Callback f75445xf5bc2045;

    /* renamed from: codec */
    private org.p3371xd0ce3e8d.InterfaceC29809xcbb53581 f75446x5a71016;

    /* renamed from: codecName */
    private final java.lang.String f75447xbcfa03c1;

    /* renamed from: codecType */
    private final org.p3371xd0ce3e8d.EnumC29887xf25c2329 f75448xbcfd1870;

    /* renamed from: configBuffer */
    private java.nio.ByteBuffer f75449xeeed0a22;

    /* renamed from: encodeThreadChecker */
    private final org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker f75450x34635fd5;

    /* renamed from: forcedKeyFrameNs */
    private final long f75451x4315a06c;

    /* renamed from: height */
    private int f75452xb7389127;

    /* renamed from: keyFrameIntervalSec */
    private final int f75453x769a7a1e;

    /* renamed from: lastKeyFrameNs */
    private long f75454xfe9d97e9;

    /* renamed from: mediaCodecWrapperFactory */
    private final org.p3371xd0ce3e8d.InterfaceC29810xa7909049 f75455x27c26c29;

    /* renamed from: nextPresentationTimestampUs */
    private long f75456xdc00667;

    /* renamed from: outputBuffers */
    private java.nio.ByteBuffer[] f75457x8ce17ff2;

    /* renamed from: outputBuffersBusyCount */
    private final org.p3371xd0ce3e8d.C29787x5502ea49.BusyCount f75458x623d2c4;

    /* renamed from: outputThread */
    private java.lang.Thread f75460xf9468e6b;

    /* renamed from: outputThreadChecker */
    private final org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker f75461xd72daca;

    /* renamed from: params */
    private final java.util.Map<java.lang.String, java.lang.String> f75462xc4aaf986;

    /* renamed from: running */
    private volatile boolean f75463x5c6f15bf;

    /* renamed from: sharedContext */
    private final org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context f75464x2748558a;

    /* renamed from: shutdownException */
    private volatile java.lang.Exception f75465xc82caa99;

    /* renamed from: surfaceColorFormat */
    private final java.lang.Integer f75466xcdd6ba4d;

    /* renamed from: textureEglBase */
    private org.p3371xd0ce3e8d.InterfaceC29762x8958813e f75468x24dacc60;

    /* renamed from: textureInputSurface */
    private android.view.Surface f75469x5a580e3e;

    /* renamed from: useSurfaceMode */
    private boolean f75470x781773e9;

    /* renamed from: width */
    private int f75472x6be2dc6;

    /* renamed from: yuvColorFormat */
    private final java.lang.Integer f75473xd717e400;

    /* renamed from: yuvFormat */
    private final org.p3371xd0ce3e8d.C29787x5502ea49.YuvFormat f75474x6e262d71;

    /* renamed from: textureDrawer */
    private final org.p3371xd0ce3e8d.C29781x502b66da f75467xf7d039ec = new org.p3371xd0ce3e8d.C29781x502b66da();

    /* renamed from: videoFrameDrawer */
    private final org.p3371xd0ce3e8d.C29906x8db8d563 f75471xbff49143 = new org.p3371xd0ce3e8d.C29906x8db8d563();

    /* renamed from: outputBuilders */
    private final java.util.concurrent.BlockingDeque<org.p3371xd0ce3e8d.C29774xf0e0810d.Builder> f75459x14c0f059 = new java.util.concurrent.LinkedBlockingDeque();

    /* renamed from: org.webrtc.HardwareVideoEncoder$BusyCount */
    /* loaded from: classes16.dex */
    public static class BusyCount {

        /* renamed from: count */
        private int f75476x5a7510f;

        /* renamed from: countLock */
        private final java.lang.Object f75477x508e6ada;

        private BusyCount() {
            this.f75477x508e6ada = new java.lang.Object();
        }

        /* renamed from: decrement */
        public void m155592x23e5cc93() {
            synchronized (this.f75477x508e6ada) {
                int i17 = this.f75476x5a7510f - 1;
                this.f75476x5a7510f = i17;
                if (i17 == 0) {
                    this.f75477x508e6ada.notifyAll();
                }
            }
        }

        /* renamed from: increment */
        public void m155593xb0268b6f() {
            synchronized (this.f75477x508e6ada) {
                this.f75476x5a7510f++;
            }
        }

        /* renamed from: waitForZero */
        public void m155594xe30bdbdc() {
            boolean z17;
            synchronized (this.f75477x508e6ada) {
                z17 = false;
                while (this.f75476x5a7510f > 0) {
                    try {
                        this.f75477x508e6ada.wait();
                    } catch (java.lang.InterruptedException e17) {
                        org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.C29787x5502ea49.TAG, "Interrupted while waiting on busy count", e17);
                        z17 = true;
                    }
                }
            }
            if (z17) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: org.webrtc.HardwareVideoEncoder$YuvFormat */
    /* loaded from: classes16.dex */
    public enum YuvFormat {
        I420 { // from class: org.webrtc.HardwareVideoEncoder.YuvFormat.1
            @Override // org.p3371xd0ce3e8d.C29787x5502ea49.YuvFormat
            /* renamed from: fillBuffer */
            public void mo155599xc0b507a3(java.nio.ByteBuffer byteBuffer, org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer) {
                org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184 = buffer.mo155646xcc305184();
                org.p3371xd0ce3e8d.C29919xe8726508.m156602xb610af9e(mo155646xcc305184.mo155640x744cac39(), mo155646xcc305184.mo155644xcda3b86a(), mo155646xcc305184.mo155638x744cac35(), mo155646xcc305184.mo155642xcda3b866(), mo155646xcc305184.mo155639x744cac36(), mo155646xcc305184.mo155643xcda3b867(), byteBuffer, mo155646xcc305184.mo155645x755bd410(), mo155646xcc305184.mo155641x1c4fb41d());
                mo155646xcc305184.mo155513x41012807();
            }
        },
        NV12 { // from class: org.webrtc.HardwareVideoEncoder.YuvFormat.2
            @Override // org.p3371xd0ce3e8d.C29787x5502ea49.YuvFormat
            /* renamed from: fillBuffer */
            public void mo155599xc0b507a3(java.nio.ByteBuffer byteBuffer, org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer) {
                org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184 = buffer.mo155646xcc305184();
                org.p3371xd0ce3e8d.C29919xe8726508.m156606x9195b0cd(mo155646xcc305184.mo155640x744cac39(), mo155646xcc305184.mo155644xcda3b86a(), mo155646xcc305184.mo155638x744cac35(), mo155646xcc305184.mo155642xcda3b866(), mo155646xcc305184.mo155639x744cac36(), mo155646xcc305184.mo155643xcda3b867(), byteBuffer, mo155646xcc305184.mo155645x755bd410(), mo155646xcc305184.mo155641x1c4fb41d());
                mo155646xcc305184.mo155513x41012807();
            }
        };

        /* renamed from: fillBuffer */
        public abstract void mo155599xc0b507a3(java.nio.ByteBuffer byteBuffer, org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer);

        /* renamed from: valueOf */
        public static org.p3371xd0ce3e8d.C29787x5502ea49.YuvFormat m155596xdce0328(int i17) {
            if (i17 == 19) {
                return I420;
            }
            if (i17 != 21 && i17 != 2141391872 && i17 != 2141391876) {
                throw new java.lang.IllegalArgumentException("Unsupported colorFormat: " + i17);
            }
            return NV12;
        }
    }

    public C29787x5502ea49(org.p3371xd0ce3e8d.InterfaceC29810xa7909049 interfaceC29810xa7909049, java.lang.String str, org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329, java.lang.Integer num, java.lang.Integer num2, java.util.Map<java.lang.String, java.lang.String> map, int i17, int i18, org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9 interfaceC29729xaf9676e9, org.p3371xd0ce3e8d.InterfaceC29762x8958813e.Context context) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker threadChecker = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker();
        this.f75450x34635fd5 = threadChecker;
        this.f75461xd72daca = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker();
        this.f75458x623d2c4 = new org.p3371xd0ce3e8d.C29787x5502ea49.BusyCount();
        this.f75455x27c26c29 = interfaceC29810xa7909049;
        this.f75447xbcfa03c1 = str;
        this.f75448xbcfd1870 = enumC29887xf25c2329;
        this.f75466xcdd6ba4d = num;
        this.f75473xd717e400 = num2;
        this.f75474x6e262d71 = org.p3371xd0ce3e8d.C29787x5502ea49.YuvFormat.m155596xdce0328(num2.intValue());
        this.f75462xc4aaf986 = map;
        this.f75453x769a7a1e = i17;
        this.f75451x4315a06c = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(i18);
        this.f75444xeb03bf09 = interfaceC29729xaf9676e9;
        this.f75464x2748558a = context;
        threadChecker.m156481xddb6d77d();
    }

    /* renamed from: canUseSurface */
    private boolean m155572xc8f9a116() {
        return (this.f75464x2748558a == null || this.f75466xcdd6ba4d == null) ? false : true;
    }

    /* renamed from: createOutputThread */
    private java.lang.Thread m155573x7001e987() {
        return new java.lang.Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (org.p3371xd0ce3e8d.C29787x5502ea49.this.f75463x5c6f15bf) {
                    org.p3371xd0ce3e8d.C29787x5502ea49.this.m155583x1f76fab2();
                }
                org.p3371xd0ce3e8d.C29787x5502ea49.this.m155578x16b49419();
            }
        };
    }

    /* renamed from: encodeByteBuffer */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155574x956df21e(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, long j17, org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer, int i17) {
        this.f75450x34635fd5.m156480x23129e95();
        try {
            int mo155705x9a572d5a = this.f75446x5a71016.mo155705x9a572d5a(0L);
            if (mo155705x9a572d5a == -1) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Dropped frame, no input buffers available");
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.NO_OUTPUT;
            }
            try {
                m155585x83cf8b27(this.f75446x5a71016.mo155708xa9544f7f()[mo155705x9a572d5a], buffer);
                try {
                    this.f75446x5a71016.mo155711xfe5642d9(mo155705x9a572d5a, 0, i17, j17, 0);
                    return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
                } catch (java.lang.IllegalStateException e17) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "queueInputBuffer failed", e17);
                    return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
                }
            } catch (java.lang.IllegalStateException e18) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "getInputBuffers failed", e18);
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
            }
        } catch (java.lang.IllegalStateException e19) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "dequeueInputBuffer failed", e19);
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
        }
    }

    /* renamed from: encodeTextureBuffer */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155575xf53fdac5(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, long j17) {
        this.f75450x34635fd5.m156480x23129e95();
        try {
            android.opengl.GLES20.glClear(16384);
            this.f75471xbff49143.m156559x75e3689(new org.p3371xd0ce3e8d.C29904x150215d2(c29904x150215d2.m156544x12f2b736(), 0, c29904x150215d2.m156548x2f798c45()), this.f75467xf7d039ec, null);
            this.f75468x24dacc60.mo155421x82211f20(java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(j17));
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
        } catch (java.lang.RuntimeException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "encodeTexture failed", e17);
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: IllegalStateException -> 0x0104, TryCatch #1 {IllegalStateException -> 0x0104, blocks: (B:9:0x002a, B:11:0x0064, B:15:0x0073, B:23:0x0099, B:24:0x00a1, B:25:0x0082, B:28:0x008c, B:31:0x00af, B:33:0x00c8, B:34:0x00e4), top: B:8:0x002a }] */
    /* renamed from: initEncodeInternal */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155576x7c8e0823() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3371xd0ce3e8d.C29787x5502ea49.m155576x7c8e0823():org.webrtc.VideoCodecStatus");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deliverEncodedImage$0 */
    public /* synthetic */ void m155577x49c48da1(int i17) {
        try {
            this.f75446x5a71016.mo155713xab26be48(i17, false);
        } catch (java.lang.Exception e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "releaseOutputBuffer failed", e17);
        }
        this.f75458x623d2c4.m155592x23e5cc93();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: releaseCodecOnOutputThread */
    public void m155578x16b49419() {
        this.f75461xd72daca.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Releasing MediaCodec on output thread");
        this.f75458x623d2c4.m155594xe30bdbdc();
        try {
            this.f75446x5a71016.mo155716x360802();
        } catch (java.lang.Exception e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media encoder stop failed", e17);
        }
        try {
            this.f75446x5a71016.mo155712x41012807();
        } catch (java.lang.Exception e18) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media encoder release failed", e18);
            this.f75465xc82caa99 = e18;
        }
        this.f75449xeeed0a22 = null;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Release on output thread done");
    }

    /* renamed from: requestKeyFrame */
    private void m155579xb6ce95fd(long j17) {
        this.f75450x34635fd5.m156480x23129e95();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("request-sync", 0);
            this.f75446x5a71016.mo155714x37bcc7ec(bundle);
            this.f75454xfe9d97e9 = j17;
        } catch (java.lang.IllegalStateException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "requestKeyFrame failed", e17);
        }
    }

    /* renamed from: resetCodec */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155580x9a86fc07(int i17, int i18, boolean z17) {
        this.f75450x34635fd5.m156480x23129e95();
        org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155589x41012807 = mo155589x41012807();
        if (mo155589x41012807 != org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK) {
            return mo155589x41012807;
        }
        this.f75472x6be2dc6 = i17;
        this.f75452xb7389127 = i18;
        this.f75470x781773e9 = z17;
        return m155576x7c8e0823();
    }

    /* renamed from: shouldForceKeyFrame */
    private boolean m155581x66c34766(long j17) {
        this.f75450x34635fd5.m156480x23129e95();
        long j18 = this.f75451x4315a06c;
        return j18 > 0 && j17 > this.f75454xfe9d97e9 + j18;
    }

    /* renamed from: updateBitrate */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155582xa0bd1664() {
        this.f75461xd72daca.m156480x23129e95();
        this.f75442x91503f1f = this.f75444xeb03bf09.mo155138x5cbee03c();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("video-bitrate", this.f75442x91503f1f);
            this.f75446x5a71016.mo155714x37bcc7ec(bundle);
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
        } catch (java.lang.IllegalStateException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "updateBitrate failed", e17);
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
        }
    }

    /* renamed from: deliverEncodedImage */
    public void m155583x1f76fab2() {
        java.nio.ByteBuffer slice;
        this.f75461xd72daca.m156480x23129e95();
        try {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            final int mo155706x436dd5f1 = this.f75446x5a71016.mo155706x436dd5f1(bufferInfo, 100000L);
            if (mo155706x436dd5f1 < 0) {
                if (mo155706x436dd5f1 == -3) {
                    this.f75458x623d2c4.m155594xe30bdbdc();
                    this.f75457x8ce17ff2 = this.f75446x5a71016.mo155709x4a413c3c();
                    return;
                }
                return;
            }
            java.nio.ByteBuffer byteBuffer = this.f75457x8ce17ff2[mo155706x436dd5f1];
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bufferInfo.size);
                this.f75449xeeed0a22 = allocateDirect;
                allocateDirect.put(byteBuffer);
                return;
            }
            this.f75444xeb03bf09.mo155140x9acaa853(bufferInfo.size);
            if (this.f75442x91503f1f != this.f75444xeb03bf09.mo155138x5cbee03c()) {
                m155582xa0bd1664();
            }
            boolean z17 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z17 = false;
            }
            if (z17) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Sync frame generated");
            }
            if (z17 && this.f75448xbcfd1870 == org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Prepending config frame of size " + this.f75449xeeed0a22.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                slice = java.nio.ByteBuffer.allocateDirect(bufferInfo.size + this.f75449xeeed0a22.capacity());
                this.f75449xeeed0a22.rewind();
                slice.put(this.f75449xeeed0a22);
                slice.put(byteBuffer);
                slice.rewind();
            } else {
                slice = byteBuffer.slice();
            }
            org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType frameType = z17 ? org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType.VideoFrameKey : org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType.VideoFrameDelta;
            this.f75458x623d2c4.m155593xb0268b6f();
            org.p3371xd0ce3e8d.C29774xf0e0810d m155515x5dd08809 = this.f75459x14c0f059.poll().m155516x627eb42(slice, new java.lang.Runnable() { // from class: org.webrtc.HardwareVideoEncoder$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.C29787x5502ea49.this.m155577x49c48da1(mo155706x436dd5f1);
                }
            }).m155521x7c3f6005(frameType).m155515x5dd08809();
            this.f75445xf5bc2045.mo156516x5c2fb87e(m155515x5dd08809, new org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.CodecSpecificInfo());
            m155515x5dd08809.mo155513x41012807();
        } catch (java.lang.IllegalStateException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "deliverOutput failed", e17);
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: encode */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155584xb2963e16(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.EncodeInfo encodeInfo) {
        org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155580x9a86fc07;
        this.f75450x34635fd5.m156480x23129e95();
        if (this.f75446x5a71016 == null) {
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.UNINITIALIZED;
        }
        org.p3371xd0ce3e8d.C29904x150215d2.Buffer m156544x12f2b736 = c29904x150215d2.m156544x12f2b736();
        boolean z17 = m156544x12f2b736 instanceof org.p3371xd0ce3e8d.C29904x150215d2.TextureBuffer;
        int mo155645x755bd410 = c29904x150215d2.m156544x12f2b736().mo155645x755bd410();
        int mo155641x1c4fb41d = c29904x150215d2.m156544x12f2b736().mo155641x1c4fb41d();
        boolean z18 = m155572xc8f9a116() && z17;
        if ((mo155645x755bd410 != this.f75472x6be2dc6 || mo155641x1c4fb41d != this.f75452xb7389127 || z18 != this.f75470x781773e9) && (m155580x9a86fc07 = m155580x9a86fc07(mo155645x755bd410, mo155641x1c4fb41d, z18)) != org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK) {
            return m155580x9a86fc07;
        }
        if (this.f75459x14c0f059.size() > 2) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Dropped frame, encoder queue full");
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.NO_OUTPUT;
        }
        boolean z19 = false;
        for (org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType frameType : encodeInfo.f76075xef479b0c) {
            if (frameType == org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType.VideoFrameKey) {
                z19 = true;
            }
        }
        if (z19 || m155581x66c34766(c29904x150215d2.m156548x2f798c45())) {
            m155579xb6ce95fd(c29904x150215d2.m156548x2f798c45());
        }
        int mo155641x1c4fb41d2 = ((m156544x12f2b736.mo155641x1c4fb41d() * m156544x12f2b736.mo155645x755bd410()) * 3) / 2;
        this.f75459x14c0f059.offer(org.p3371xd0ce3e8d.C29774xf0e0810d.m155505xdc3ef9b().m155518xc63aa716(c29904x150215d2.m156548x2f798c45()).m155520x7f143eda(c29904x150215d2.m156544x12f2b736().mo155645x755bd410()).m155519x49a4a293(c29904x150215d2.m156544x12f2b736().mo155641x1c4fb41d()).m155523x742bae00(c29904x150215d2.m156547x79734cf4()));
        long j17 = this.f75456xdc00667;
        this.f75456xdc00667 += (long) (java.util.concurrent.TimeUnit.SECONDS.toMicros(1L) / this.f75444xeb03bf09.mo155139xae2ee5e0());
        org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155575xf53fdac5 = this.f75470x781773e9 ? m155575xf53fdac5(c29904x150215d2, j17) : m155574x956df21e(c29904x150215d2, j17, m156544x12f2b736, mo155641x1c4fb41d2);
        if (m155575xf53fdac5 != org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK) {
            this.f75459x14c0f059.pollLast();
        }
        return m155575xf53fdac5;
    }

    /* renamed from: fillInputBuffer */
    public void m155585x83cf8b27(java.nio.ByteBuffer byteBuffer, org.p3371xd0ce3e8d.C29904x150215d2.Buffer buffer) {
        this.f75474x6e262d71.mo155599xc0b507a3(byteBuffer, buffer);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: getImplementationName */
    public java.lang.String mo155586xb8d5d353() {
        return "HWEncoder";
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: getScalingSettings */
    public org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings mo155587x43907694() {
        this.f75450x34635fd5.m156480x23129e95();
        if (this.f75443xb62284fe) {
            org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329 = this.f75448xbcfd1870;
            if (enumC29887xf25c2329 == org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8) {
                return new org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings(29, 95);
            }
            if (enumC29887xf25c2329 == org.p3371xd0ce3e8d.EnumC29887xf25c2329.H264) {
                return new org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings(24, 37);
            }
        }
        return org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.ScalingSettings.OFF;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: initEncode */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155588xf7308346(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Settings settings, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.Callback callback) {
        int i17;
        this.f75450x34635fd5.m156480x23129e95();
        this.f75445xf5bc2045 = callback;
        this.f75443xb62284fe = settings.f76083xb62284fe;
        this.f75472x6be2dc6 = settings.f76090x6be2dc6;
        this.f75452xb7389127 = settings.f76085xb7389127;
        this.f75470x781773e9 = m155572xc8f9a116();
        int i18 = settings.f76089xf1e3fcab;
        if (i18 != 0 && (i17 = settings.f76086xcbb5c2c9) != 0) {
            this.f75444xeb03bf09.mo155141x558e4a40(i18 * 1000, i17);
        }
        this.f75442x91503f1f = this.f75444xeb03bf09.mo155138x5cbee03c();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "initEncode: " + this.f75472x6be2dc6 + " x " + this.f75452xb7389127 + ". @ " + settings.f76089xf1e3fcab + "kbps. Fps: " + settings.f76086xcbb5c2c9 + " Use surface mode: " + this.f75470x781773e9);
        return m155576x7c8e0823();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: release */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155589x41012807() {
        org.p3371xd0ce3e8d.EnumC29888x1fdab04d enumC29888x1fdab04d;
        this.f75450x34635fd5.m156480x23129e95();
        if (this.f75460xf9468e6b == null) {
            enumC29888x1fdab04d = org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
        } else {
            this.f75463x5c6f15bf = false;
            if (!org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156479x7fa650c6(this.f75460xf9468e6b, 5000L)) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media encoder release timeout");
                enumC29888x1fdab04d = org.p3371xd0ce3e8d.EnumC29888x1fdab04d.TIMEOUT;
            } else if (this.f75465xc82caa99 != null) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media encoder release exception", this.f75465xc82caa99);
                enumC29888x1fdab04d = org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
            } else {
                enumC29888x1fdab04d = org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
            }
        }
        this.f75467xf7d039ec.mo155542x41012807();
        this.f75471xbff49143.m156562x41012807();
        org.p3371xd0ce3e8d.InterfaceC29762x8958813e interfaceC29762x8958813e = this.f75468x24dacc60;
        if (interfaceC29762x8958813e != null) {
            interfaceC29762x8958813e.mo155416x41012807();
            this.f75468x24dacc60 = null;
        }
        android.view.Surface surface = this.f75469x5a580e3e;
        if (surface != null) {
            surface.release();
            this.f75469x5a580e3e = null;
        }
        this.f75459x14c0f059.clear();
        this.f75446x5a71016 = null;
        this.f75457x8ce17ff2 = null;
        this.f75460xf9468e6b = null;
        this.f75450x34635fd5.m156481xddb6d77d();
        return enumC29888x1fdab04d;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: setRateAllocation */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155590xea8516e2(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.BitrateAllocation bitrateAllocation, int i17) {
        this.f75450x34635fd5.m156480x23129e95();
        if (i17 > 30) {
            i17 = 30;
        }
        this.f75444xeb03bf09.mo155141x558e4a40(bitrateAllocation.m156515xb5886f15(), i17);
        return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: setRates */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155591x53a01051(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41.RateControlParameters rateControlParameters) {
        this.f75450x34635fd5.m156480x23129e95();
        this.f75444xeb03bf09.mo155141x558e4a40(rateControlParameters.f76076xf9e77b6d.m156515xb5886f15(), rateControlParameters.f76077x460b6ddc);
        return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
    }
}

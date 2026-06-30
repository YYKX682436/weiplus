package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26;

/* renamed from: com.tencent.thumbplayer.tmediacodec.TMediaCodec */
/* loaded from: classes14.dex */
public final class C26485xc3ef8206 implements com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb {
    public static final java.lang.String TAG = "TMediaCodec";

    /* renamed from: codecCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b f54036x6d0f1e7b;

    /* renamed from: codecFinalReuseEnable */
    public boolean f54037x735d79f7;

    /* renamed from: codecWrapper */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd f54038x62f2e79d;

    /* renamed from: createBy */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.CreateBy f54039x6c815a73;

    /* renamed from: isReUsed */
    public boolean f54040xf06d0e5a;

    /* renamed from: mConfigureCalled */
    private boolean f54042xc361a1d6;

    /* renamed from: nameOrType */
    private final java.lang.String f54043xcc6f7a28;

    /* renamed from: reUseEnable */
    private boolean f54044xee80b0f7 = true;

    /* renamed from: mCodecStatistics */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3067xfa5cb123.C26511xd44f3175 f54041xb89729ac = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3067xfa5cb123.C26511xd44f3175(m103343x7b98c171());

    /* renamed from: com.tencent.thumbplayer.tmediacodec.TMediaCodec$Callback */
    /* loaded from: classes14.dex */
    public static abstract class Callback {
        /* renamed from: onError */
        public abstract void mo102101xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, android.media.MediaCodec.CodecException codecException);

        /* renamed from: onInputBufferAvailable */
        public abstract void mo102102x8e2d0dbe(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17);

        /* renamed from: onOutputBufferAvailable */
        public abstract void mo102103x4e722e89(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo);

        /* renamed from: onOutputFormatChanged */
        public abstract void mo102104xa0df46dd(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, android.media.MediaFormat mediaFormat);
    }

    /* renamed from: com.tencent.thumbplayer.tmediacodec.TMediaCodec$CreateBy */
    /* loaded from: classes6.dex */
    public enum CreateBy {
        CreateByName,
        CreateByType
    }

    /* renamed from: com.tencent.thumbplayer.tmediacodec.TMediaCodec$HookCallback */
    /* loaded from: classes14.dex */
    public static final class HookCallback extends android.media.MediaCodec.Callback {

        /* renamed from: callback */
        private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback f54050xf5bc2045;

        /* renamed from: tMediaCodec */
        private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 f54051x6085da26;

        public HookCallback(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback callback) {
            this.f54051x6085da26 = c26485xc3ef8206;
            this.f54050xf5bc2045 = callback;
        }

        /* renamed from: getCallback */
        public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback m103355x71965dbb() {
            return this.f54050xf5bc2045;
        }

        /* renamed from: getTMediaCodec */
        public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 m103356x3a5c20f0() {
            return this.f54051x6085da26;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback callback = this.f54050xf5bc2045;
            if (callback != null) {
                callback.mo102101xaf8aa769(this.f54051x6085da26, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback callback = this.f54050xf5bc2045;
            if (callback != null) {
                callback.mo102102x8e2d0dbe(this.f54051x6085da26, i17);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback callback = this.f54050xf5bc2045;
            if (callback != null) {
                callback.mo102103x4e722e89(this.f54051x6085da26, i17, bufferInfo);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback callback = this.f54050xf5bc2045;
            if (callback != null) {
                callback.mo102104xa0df46dd(this.f54051x6085da26, mediaFormat);
            }
        }
    }

    private C26485xc3ef8206(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.CreateBy createBy) {
        this.f54043xcc6f7a28 = str;
        this.f54039x6c815a73 = createBy;
    }

    /* renamed from: createByCodecName */
    public static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 m103323xd7cdda8e(java.lang.String str) {
        return new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.CreateBy.CreateByName);
    }

    /* renamed from: createDecoderByType */
    public static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 m103324x1c769f9(java.lang.String str) {
        return new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206(str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.CreateBy.CreateByType);
    }

    /* renamed from: onAfterConfigure */
    private void m103325x16f8fc29() {
        this.f54041xb89729ac.m103504xed58647(this.f54040xf06d0e5a);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26517x68dfca23.m103556x2c27b08b(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.TMediaCodec.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54038x62f2e79d != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54038x62f2e79d.mo103377xbd454139(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54036x6d0f1e7b);
                }
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54036x6d0f1e7b != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54036x6d0f1e7b.mo103357x3e5a77bb(java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54040xf06d0e5a));
                }
            }
        });
    }

    /* renamed from: onAfterStart */
    private void m103326x22637725() {
        this.f54041xb89729ac.m103509xd3dda767();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26517x68dfca23.m103556x2c27b08b(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.TMediaCodec.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54036x6d0f1e7b != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54036x6d0f1e7b.mo102100xde9141a2(java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54040xf06d0e5a), com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.this.f54041xb89729ac.m103508xfb7e5820());
                }
            }
        });
    }

    /* renamed from: onBeforeConfigure */
    private void m103327x81f29248(android.view.Surface surface) {
        this.f54037x735d79f7 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103314x770e9117(this, surface);
        this.f54041xb89729ac.m103507x223c64bf();
        this.f54041xb89729ac.m103506xd5699c78();
        this.f54041xb89729ac.m103505xb05516ce(this.f54037x735d79f7);
    }

    /* renamed from: onBeforeStart */
    private void m103328xdaa2f4c4() {
        this.f54041xb89729ac.m103510x53d96fee();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: configure */
    public void mo103283xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        if (this.f54042xc361a1d6) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i17 + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        this.f54042xc361a1d6 = true;
        m103327x81f29248(surface);
        try {
            this.f54038x62f2e79d = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103306xd00d62e6(mediaFormat, surface, mediaCrypto, i17, this);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(TAG, "createCodec mediaFormat:" + mediaFormat, e17);
        }
        m103325x16f8fc29();
    }

    /* renamed from: dequeueInputBuffer */
    public final int m103329x9a572d5a(long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            return interfaceC26491x6cbe3bbd.mo103367x9a572d5a(j17);
        }
        return -1000;
    }

    /* renamed from: dequeueOutputBuffer */
    public final int m103330x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            return interfaceC26491x6cbe3bbd.mo103368x436dd5f1(bufferInfo, j17);
        }
        return -1000;
    }

    /* renamed from: flush */
    public final void m103331x5d03b04() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103369x5d03b04();
        }
    }

    /* renamed from: getCodecCallback */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b m103332x2a6edac5() {
        return this.f54036x6d0f1e7b;
    }

    /* renamed from: getCodecWrapper */
    public final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd m103333xc3e57a13() {
        return this.f54038x62f2e79d;
    }

    /* renamed from: getCreateBy */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.CreateBy m103334xe85b97e9() {
        return this.f54039x6c815a73;
    }

    /* renamed from: getInputBuffer */
    public final java.nio.ByteBuffer m103335xaa9f9f74(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            return interfaceC26491x6cbe3bbd.mo103370x6053b688().getInputBuffer(i17);
        }
        return null;
    }

    /* renamed from: getInputBuffers */
    public final java.nio.ByteBuffer[] m103336xa9544f7f() {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return null;
        }
        return mo103370x6053b688.getInputBuffers();
    }

    /* renamed from: getNameOrType */
    public final java.lang.String m103337xbab0321e() {
        return this.f54043xcc6f7a28;
    }

    /* renamed from: getOutputBuffer */
    public final java.nio.ByteBuffer m103338x3c33a717(int i17) {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return null;
        }
        return mo103370x6053b688.getOutputBuffer(i17);
    }

    /* renamed from: getOutputBuffers */
    public final java.nio.ByteBuffer[] m103339x4a413c3c() {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return null;
        }
        return mo103370x6053b688.getOutputBuffers();
    }

    /* renamed from: getOutputFormat */
    public final android.media.MediaFormat m103340x42b80ace() {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return null;
        }
        return mo103370x6053b688.getOutputFormat();
    }

    /* renamed from: getOutputImage */
    public final android.media.Image m103341xa7795fa4(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            return interfaceC26491x6cbe3bbd.mo103370x6053b688().getOutputImage(i17);
        }
        return null;
    }

    /* renamed from: isReuseEnable */
    public final boolean m103342x23032d8d() {
        return this.f54044xee80b0f7;
    }

    /* renamed from: isVideo */
    public final boolean m103343x7b98c171() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103552x7b98c171(this.f54043xcc6f7a28);
    }

    /* renamed from: queueInputBuffer */
    public final void m103344xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103372xfe5642d9(i17, i18, i19, j17, i27);
        }
    }

    /* renamed from: queueSecureInputBuffer */
    public final void m103345xa5aeefa2(int i17, int i18, android.media.MediaCodec.CryptoInfo cryptoInfo, long j17, int i19) {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return;
        }
        mo103370x6053b688.queueSecureInputBuffer(i17, i18, cryptoInfo, j17, i19);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: release */
    public void mo103284x41012807() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103373x41012807();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: releaseOutputBuffer */
    public void mo103286xab26be48(int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103375xab26be48(i17, z17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: reset */
    public void mo103287x6761d4f() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103376x6761d4f();
        }
    }

    /* renamed from: setCallback */
    public final void m103346x6c4ebec7(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback callback) {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return;
        }
        mo103370x6053b688.setCallback(new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.HookCallback(this, callback));
    }

    /* renamed from: setCodecCallback */
    public final void m103348xbd454139(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b interfaceC26486x9cae4e5b) {
        this.f54036x6d0f1e7b = interfaceC26486x9cae4e5b;
    }

    /* renamed from: setOutputSurface */
    public final void m103349x610a9b2a(android.view.Surface surface) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103378x610a9b2a(surface);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: setParameters */
    public void mo103288x37bcc7ec(android.os.Bundle bundle) {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return;
        }
        mo103370x6053b688.setParameters(bundle);
    }

    /* renamed from: setReuseEnable */
    public final void m103350xe74a4b55(boolean z17) {
        this.f54044xee80b0f7 = z17;
    }

    /* renamed from: setVideoScalingMode */
    public final void m103351xfdd812d1(int i17) {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return;
        }
        mo103370x6053b688.setVideoScalingMode(i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: start */
    public void mo103289x68ac462() {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "start codecWrapper:" + this.f54038x62f2e79d);
        }
        m103328xdaa2f4c4();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103379x68ac462();
        }
        m103326x22637725();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: stop */
    public void mo103290x360802() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103380x360802();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: releaseOutputBuffer */
    public void mo103285xab26be48(int i17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd != null) {
            interfaceC26491x6cbe3bbd.mo103374xab26be48(i17, j17);
        }
    }

    /* renamed from: setCallback */
    public final void m103347x6c4ebec7(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback callback, android.os.Handler handler) {
        android.media.MediaCodec mo103370x6053b688;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd interfaceC26491x6cbe3bbd = this.f54038x62f2e79d;
        if (interfaceC26491x6cbe3bbd == null || (mo103370x6053b688 = interfaceC26491x6cbe3bbd.mo103370x6053b688()) == null) {
            return;
        }
        mo103370x6053b688.setCallback(new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.HookCallback(this, callback), handler);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.InterfaceC26483x5e1bd3bb
    /* renamed from: configure */
    public void mo103282xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        if (this.f54042xc361a1d6) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " flags:" + i17 + " descrambler:" + mediaDescrambler + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        this.f54042xc361a1d6 = true;
        m103327x81f29248(surface);
        try {
            this.f54038x62f2e79d = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103305xd00d62e6(mediaFormat, surface, i17, mediaDescrambler, this);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(TAG, "createCodec mediaFormat:" + mediaFormat, e17);
        }
        m103325x16f8fc29();
    }
}

package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.MediaCodecAssetWriterVideoEncoder */
/* loaded from: classes16.dex */
public class C25773x4e53dc32 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 {

    /* renamed from: SCENE */
    public static final java.lang.String f48151x4b1206c = "tav-encoder-assetwriter";

    /* renamed from: WAIT_TRANSIENT_MS */
    private static final long f48152x979f5225 = 20;

    /* renamed from: encodeOption */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f48153xc5684a2b;

    /* renamed from: encodeSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48154xe2a49737;

    /* renamed from: inputSurface */
    private android.view.Surface f48155xcc54b583;

    /* renamed from: mediaFormat */
    private android.media.MediaFormat f48157xd571d8fb;

    /* renamed from: muxer */
    private com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 f48158x637007d;

    /* renamed from: outHeight */
    private int f48159x3c85fa15;

    /* renamed from: outWidth */
    private int f48160x2c8ef18;

    /* renamed from: videoEncoder */
    private com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 f48163x976c1821;
    private final java.lang.String TAG = "MediaCodecAssetWriterVideoEncoder@" + hashCode();

    /* renamed from: videoBufferInfo */
    private volatile android.media.MediaCodec.BufferInfo f48161xbaf51fe9 = new android.media.MediaCodec.BufferInfo();

    /* renamed from: videoEncodeFormat */
    private volatile android.media.MediaFormat f48162x13ef41c8 = null;

    /* renamed from: videoPresentationTimeUs */
    private long f48164xecb755e0 = 0;

    /* renamed from: isEncodeToEndOfStream */
    private boolean f48156xa79748b7 = false;

    /* renamed from: dequeueOutputBuffer */
    private int m97579x436dd5f1(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
            return c25653x39170d61.mo96251x436dd5f1(bufferInfo, 1000L);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "dequeueOutputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97583xe9f95e2(20L);
                    return m97579x436dd5f1(c25653x39170d61, bufferInfo);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getOutputBuffer */
    private java.nio.ByteBuffer m97580x3c33a717(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17) {
        try {
            return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97467x3c33a717(c25653x39170d61, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97583xe9f95e2(20L);
                    return m97580x3c33a717(c25653x39170d61, i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: releaseOutputBuffer */
    private void m97581xab26be48(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17, boolean z17) {
        try {
            c25653x39170d61.mo96260xab26be48(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97583xe9f95e2(20L);
                    m97581xab26be48(c25653x39170d61, i17, z17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: validAndCorrectBufferInfo */
    private boolean m97582xbf49921d(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && (bufferInfo.flags & 4) == 0;
    }

    /* renamed from: waitTime */
    private void m97583xe9f95e2(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: createInputSurface */
    public android.view.Surface mo72496x4310109f() {
        if (this.f48163x976c1821 != null && this.f48155xcc54b583 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "createInputSurface");
            this.f48155xcc54b583 = this.f48163x976c1821.mo96249x4310109f();
        }
        return this.f48155xcc54b583;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: flush */
    public void mo72497x5d03b04() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48163x976c1821;
        if (c25653x39170d61 != null) {
            this.f48156xa79748b7 = false;
            c25653x39170d61.mo96252x5d03b04();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: getEncodeFormat */
    public android.media.MediaFormat mo72498x16f04c23() {
        return this.f48162x13ef41c8;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: getEncodePresentationTimeUs */
    public long mo72499xaafb0031() {
        return this.f48164xecb755e0;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: getEncodeSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 mo72500xd0e54f2d() {
        return this.f48154xe2a49737;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: isEncodeToEndOfStream */
    public boolean mo72501xa79748b7() {
        return this.f48156xa79748b7;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: isNeedVideoOutputTexture */
    public boolean mo72502x5836851f() {
        return false;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: prepare */
    public boolean mo72503xed060d07(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036, android.media.MediaFormat mediaFormat) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96740xa252bc98 = c25679xbb204036.m96740xa252bc98();
        this.f48159x3c85fa15 = (int) m96740xa252bc98.f47832xb7389127;
        this.f48160x2c8ef18 = (int) m96740xa252bc98.f47833x6be2dc6;
        this.f48154xe2a49737 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(this.f48160x2c8ef18, this.f48159x3c85fa15);
        this.f48153xc5684a2b = c25679xbb204036;
        this.f48157xd571d8fb = mediaFormat;
        try {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "prepareVideoEncoder: format = " + mediaFormat);
            com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 m96272x358940d1 = com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61.m96272x358940d1(mediaFormat.containsKey("mime") ? mediaFormat.getString("mime") : "video/avc", f48151x4b1206c);
            this.f48163x976c1821 = m96272x358940d1;
            m96272x358940d1.mo96248xd00d62e6(mediaFormat, null, null, 1);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "prepareVideoEncoder: 失败，准备重试。format = " + mediaFormat, e17);
            mediaFormat.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, 0);
            mediaFormat.setInteger(ya.b.f77487x44fa364, 0);
            try {
                com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 m96272x358940d12 = com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61.m96272x358940d1("video/avc", f48151x4b1206c);
                this.f48163x976c1821 = m96272x358940d12;
                m96272x358940d12.mo96248xd00d62e6(mediaFormat, null, null, 1);
                return true;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "prepareVideoEncoder: retry 失败 format = " + mediaFormat, e18);
                throw new com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-103, e18, mediaFormat.toString()));
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: processVideoTexture */
    public void mo72504x7423ac2f(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: release */
    public void mo72505x41012807() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48163x976c1821;
        if (c25653x39170d61 != null) {
            c25653x39170d61.mo96259x41012807();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: reset */
    public void mo72506x6761d4f() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48163x976c1821;
        if (c25653x39170d61 != null) {
            this.f48156xa79748b7 = false;
            c25653x39170d61.mo96261x6761d4f();
            this.f48163x976c1821.mo96248xd00d62e6(this.f48157xd571d8fb, null, null, 1);
            this.f48155xcc54b583 = null;
            this.f48163x976c1821.mo96264x68ac462();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: setMediaMuxer */
    public void mo72507x8f07f4fb(com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422) {
        this.f48158x637007d = interfaceC25803x5eabc422;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: setVideoSampleRenderContext */
    public void mo72508xd49e03b6(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: signalEndOfInputStream */
    public void mo72509x4cb1f740() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48163x976c1821;
        if (c25653x39170d61 != null) {
            c25653x39170d61.mo96263x4cb1f740();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: start */
    public boolean mo72510x68ac462() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48163x976c1821;
        if (c25653x39170d61 == null) {
            return false;
        }
        c25653x39170d61.mo96264x68ac462();
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: stop */
    public void mo72511x360802() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48163x976c1821;
        if (c25653x39170d61 != null) {
            c25653x39170d61.mo96265x360802();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: writeVideoSample */
    public boolean mo72512x3f75eca6(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422 = this.f48158x637007d;
        boolean isStarted = interfaceC25803x5eabc422 != null ? interfaceC25803x5eabc422.getIsStarted() : false;
        java.lang.System.currentTimeMillis();
        if (isStarted || this.f48162x13ef41c8 == null) {
            int m97579x436dd5f1 = m97579x436dd5f1(this.f48163x976c1821, this.f48161xbaf51fe9);
            if (m97579x436dd5f1 == -1) {
                if (z17) {
                    return false;
                }
            } else {
                if (m97579x436dd5f1 == -2) {
                    this.f48162x13ef41c8 = this.f48163x976c1821.mo96256x42b80ace();
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "encoder output format changed:" + this.f48162x13ef41c8);
                    return false;
                }
                if (m97579x436dd5f1 < 0) {
                    return false;
                }
                java.nio.ByteBuffer m97580x3c33a717 = m97580x3c33a717(this.f48163x976c1821, m97579x436dd5f1);
                if ((this.f48161xbaf51fe9.flags & 2) != 0 && this.f48158x637007d.mo72384xf2d0a6ff()) {
                    this.f48161xbaf51fe9.size = 0;
                }
                if (isStarted && m97582xbf49921d(this.f48161xbaf51fe9)) {
                    try {
                        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                        bufferInfo.set(this.f48161xbaf51fe9.offset, this.f48161xbaf51fe9.size, this.f48161xbaf51fe9.presentationTimeUs, this.f48161xbaf51fe9.flags);
                        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc4222 = this.f48158x637007d;
                        interfaceC25803x5eabc4222.mo72400xe78c1db3(interfaceC25803x5eabc4222.getVideoId(), m97580x3c33a717, bufferInfo);
                        this.f48164xecb755e0 = this.f48161xbaf51fe9.presentationTimeUs;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(this.TAG, "writeVideoFrame: ", e17);
                    }
                }
                m97581xab26be48(this.f48163x976c1821, m97579x436dd5f1, false);
                if ((this.f48161xbaf51fe9.flags & 4) == 0) {
                    return false;
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "writeVideoFrame: BUFFER_FLAG_END_OF_STREAM");
                this.f48164xecb755e0 = -1L;
                this.f48156xa79748b7 = true;
            }
        } else if (z17) {
            return false;
        }
        return true;
    }
}

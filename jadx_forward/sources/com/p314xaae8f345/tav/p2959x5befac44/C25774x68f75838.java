package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.MediaCodecAudioEncoder */
/* loaded from: classes16.dex */
public class C25774x68f75838 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 {

    /* renamed from: OUTPUT_AUDIO_MIME_TYPE */
    public static final java.lang.String f48165xfb84d7de = "audio/mp4a-latm";

    /* renamed from: SCENE */
    public static final java.lang.String f48166x4b1206c = "audio-encode";
    private static final java.lang.String TAG = "MediaCodecAudioEncoder";

    /* renamed from: WAIT_TRANSIENT_MS */
    private static final long f48167x979f5225 = 20;

    /* renamed from: WRITER_FINISH */
    public static final long f48168x7c5d0ddf = -1;

    /* renamed from: audioEncoder */
    private com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 f48171x41a3a466;

    /* renamed from: audioPresentationTimeUs */
    private long f48172xc371dc7b;

    /* renamed from: encodeOption */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f48173xc5684a2b;

    /* renamed from: muxer */
    private com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 f48175x637007d;

    /* renamed from: audioEncodeFormat */
    private volatile android.media.MediaFormat f48170x904d98a3 = null;

    /* renamed from: audioBufferInfo */
    private volatile android.media.MediaCodec.BufferInfo f48169x11217184 = new android.media.MediaCodec.BufferInfo();

    /* renamed from: isEncodeToEndOfStream */
    private boolean f48174xa79748b7 = false;

    /* renamed from: dequeueInputBuffer */
    private int m97584x9a572d5a(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61) {
        try {
            return c25653x39170d61.mo96250x9a572d5a(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "dequeueInputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97591xe9f95e2(20L);
                    return m97584x9a572d5a(c25653x39170d61);
                }
            }
            throw e17;
        }
    }

    /* renamed from: dequeueOutputBuffer */
    private int m97585x436dd5f1(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
            return c25653x39170d61.mo96251x436dd5f1(bufferInfo, 1000L);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "dequeueOutputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97591xe9f95e2(20L);
                    return m97585x436dd5f1(c25653x39170d61, bufferInfo);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getInputBuffer */
    private java.nio.ByteBuffer m97586xaa9f9f74(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17) {
        try {
            return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97465xaa9f9f74(c25653x39170d61, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "getInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97591xe9f95e2(20L);
                    return m97586xaa9f9f74(c25653x39170d61, i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getOutputBuffer */
    private java.nio.ByteBuffer m97587x3c33a717(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17) {
        try {
            return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97467x3c33a717(c25653x39170d61, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97591xe9f95e2(20L);
                    return m97587x3c33a717(c25653x39170d61, i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: queueInputBuffer */
    private void m97588xfe5642d9(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17, int i18, int i19, long j17, int i27) {
        try {
            c25653x39170d61.mo96258xfe5642d9(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "queueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97591xe9f95e2(20L);
                    m97588xfe5642d9(c25653x39170d61, i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    /* renamed from: releaseOutputBuffer */
    private void m97589xab26be48(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17, boolean z17) {
        try {
            c25653x39170d61.mo96260xab26be48(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97591xe9f95e2(20L);
                    m97589xab26be48(c25653x39170d61, i17, z17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: validAndCorrectBufferInfo */
    private boolean m97590xbf49921d(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && (bufferInfo.flags & 4) == 0;
    }

    /* renamed from: waitTime */
    private void m97591xe9f95e2(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: endWriteAudioSample */
    public boolean mo97320x6affabc() {
        try {
            int m97584x9a572d5a = m97584x9a572d5a(this.f48171x41a3a466);
            if (m97584x9a572d5a < 0) {
                return false;
            }
            m97588xfe5642d9(this.f48171x41a3a466, m97584x9a572d5a, 0, 0, 0L, 4);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "endWriteAudioSample failed", th6);
            return false;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: getEncodeFormat */
    public android.media.MediaFormat mo97321x16f04c23() {
        return this.f48170x904d98a3;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: getEncodePresentationTimeUs */
    public long mo97322xaafb0031() {
        return this.f48172xc371dc7b;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: isEncodeToEndOfStream */
    public boolean mo97323xa79748b7() {
        return this.f48174xa79748b7;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: prepare */
    public boolean mo97324xed060d07(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036, android.media.MediaFormat mediaFormat) {
        this.f48173xc5684a2b = c25679xbb204036;
        try {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "prepareAudioEncoder: format = " + mediaFormat);
            com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 m96272x358940d1 = com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61.m96272x358940d1("audio/mp4a-latm", f48166x4b1206c);
            this.f48171x41a3a466 = m96272x358940d1;
            m96272x358940d1.mo96248xd00d62e6(mediaFormat, null, null, 1);
            return true;
        } catch (java.lang.Exception e17) {
            throw new com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-104, e17, mediaFormat.toString()));
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: release */
    public void mo97325x41012807() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48171x41a3a466;
        if (c25653x39170d61 != null) {
            c25653x39170d61.mo96259x41012807();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: setMediaMuxer */
    public void mo97326x8f07f4fb(com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422) {
        this.f48175x637007d = interfaceC25803x5eabc422;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: start */
    public boolean mo97327x68ac462() {
        this.f48171x41a3a466.mo96264x68ac462();
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: stop */
    public void mo97328x360802() {
        com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61 = this.f48171x41a3a466;
        if (c25653x39170d61 != null) {
            c25653x39170d61.mo96265x360802();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: writeAudioFrame */
    public boolean mo97329x3a033c76(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422 = this.f48175x637007d;
        boolean isStarted = interfaceC25803x5eabc422 != null ? interfaceC25803x5eabc422.getIsStarted() : false;
        if (isStarted || this.f48170x904d98a3 == null) {
            int m97585x436dd5f1 = m97585x436dd5f1(this.f48171x41a3a466, this.f48169x11217184);
            if (m97585x436dd5f1 == -1) {
                if (z17) {
                    return false;
                }
            } else {
                if (m97585x436dd5f1 == -2) {
                    this.f48170x904d98a3 = this.f48171x41a3a466.mo96256x42b80ace();
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "audio format changed " + this.f48170x904d98a3);
                    return false;
                }
                if (m97585x436dd5f1 < 0) {
                    return false;
                }
                java.nio.ByteBuffer m97587x3c33a717 = m97587x3c33a717(this.f48171x41a3a466, m97585x436dd5f1);
                if ((this.f48169x11217184.flags & 2) != 0) {
                    this.f48169x11217184.size = 0;
                }
                m97587x3c33a717.position(this.f48169x11217184.offset);
                m97587x3c33a717.limit(this.f48169x11217184.offset + this.f48169x11217184.size);
                if (m97590xbf49921d(this.f48169x11217184) && isStarted) {
                    try {
                        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                        bufferInfo.set(this.f48169x11217184.offset, this.f48169x11217184.size, this.f48169x11217184.presentationTimeUs, this.f48169x11217184.flags);
                        if (this.f48169x11217184.presentationTimeUs >= 0) {
                            this.f48175x637007d.mo72401xe437d320(false, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97220x7905b775((float) this.f48169x11217184.presentationTimeUs));
                        }
                        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc4222 = this.f48175x637007d;
                        interfaceC25803x5eabc4222.mo72400xe78c1db3(interfaceC25803x5eabc4222.getAudioId(), m97587x3c33a717, bufferInfo);
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "writeAudioFrame:  " + this.f48169x11217184.presentationTimeUs);
                        this.f48172xc371dc7b = this.f48169x11217184.presentationTimeUs;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "writeAudioFrame: ", e17);
                    }
                }
                m97589xab26be48(this.f48171x41a3a466, m97585x436dd5f1, false);
                if ((this.f48169x11217184.flags & 4) == 0) {
                    return false;
                }
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM");
                this.f48172xc371dc7b = -1L;
                this.f48174xa79748b7 = true;
            }
        } else if (z17) {
            return false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: writeAudioSample */
    public long mo97330x1ba943c1(long j17, java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int m97584x9a572d5a = m97584x9a572d5a(this.f48171x41a3a466);
        if (m97584x9a572d5a < 0) {
            return 0L;
        }
        java.nio.ByteBuffer m97586xaa9f9f74 = m97586xaa9f9f74(this.f48171x41a3a466, m97584x9a572d5a);
        int min = java.lang.Math.min(limit - position, m97586xaa9f9f74.capacity());
        int i17 = position + min;
        byteBuffer.limit(i17);
        byteBuffer.position(position);
        m97586xaa9f9f74.put(byteBuffer);
        m97588xfe5642d9(this.f48171x41a3a466, m97584x9a572d5a, 0, min, j17, 0);
        byteBuffer.position(i17);
        return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97459xd375d3d4(min, this.f48173xc5684a2b.m96733x2721f40c(), this.f48173xc5684a2b.m96735x317dfe9c());
    }
}

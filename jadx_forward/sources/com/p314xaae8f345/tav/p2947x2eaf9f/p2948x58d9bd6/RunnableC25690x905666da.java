package com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6;

/* renamed from: com.tencent.tav.core.audio.AudioExportRunner */
/* loaded from: classes16.dex */
public class RunnableC25690x905666da implements java.lang.Runnable {

    /* renamed from: EDGE_DURATION_MS */
    static final int f47563xd72e68af = 200;

    /* renamed from: MAX_INPUT_SIZE */
    private static final int f47564xd63ce551 = 8192;

    /* renamed from: MIME */
    private static java.lang.String f47565x241c34 = "audio/mp4a-latm";

    /* renamed from: PACKET_FPS */
    static final int f47566x263ffc92 = 44;
    public static final java.lang.String TAG = "AudioEncoder";

    /* renamed from: WAIT_TRANSIENT_MS */
    private static final long f47567x979f5225 = 20;

    /* renamed from: mAudioAsset */
    com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<? extends com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> f47569x36e44d07;

    /* renamed from: mAudioDecoder */
    com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 f47570x94f6e49b;

    /* renamed from: mAudioEncoder */
    private android.media.MediaCodec f47571xd938bd73;

    /* renamed from: mCallback */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25696x8c617039 f47572x1ab9c7d2;

    /* renamed from: mFos */
    private java.io.FileOutputStream f47575x32a11d;

    /* renamed from: mSavePath */
    private java.lang.String f47579xa9723acf;

    /* renamed from: mSelectedTimeRange */
    com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47580x39c52128;

    /* renamed from: mThread */
    private java.lang.Thread f47583x1b4d34d7;

    /* renamed from: mMime */
    private java.lang.String f47576x6249a41 = f47565x241c34;

    /* renamed from: mRate */
    private int f47577x626c2ed = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259;

    /* renamed from: mSampleRate */
    private int f47578xe4b949f7 = 44100;

    /* renamed from: mChannelCount */
    private int f47574x9132a6d9 = 1;

    /* renamed from: mStatus */
    private int f47581x1a39f6bf = 0;

    /* renamed from: mStop */
    private java.util.concurrent.atomic.AtomicBoolean f47582x6277e0f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: mCancel */
    private boolean f47573xfde65547 = false;

    /* renamed from: enOfAudioInputStream */
    private boolean f47568x9ba792b4 = false;

    public RunnableC25690x905666da(com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<? extends com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> interfaceC25698xaf2a0788, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47569x36e44d07 = interfaceC25698xaf2a0788;
        if (c25738xead39d26 == null) {
            this.f47580x39c52128 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, interfaceC25698xaf2a0788.mo96879x51e8b0a());
        } else {
            this.f47580x39c52128 = c25738xead39d26;
        }
    }

    /* renamed from: dequeueInputBuffer */
    private int m96827x9a572d5a(android.media.MediaCodec mediaCodec) {
        try {
            return mediaCodec.dequeueInputBuffer(1000L);
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
                    return m96827x9a572d5a(mediaCodec);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getInputBuffer */
    private java.nio.ByteBuffer m96828xaa9f9f74(int i17) {
        return this.f47571xd938bd73.getInputBuffer(i17);
    }

    /* renamed from: getOutputBuffer */
    private java.nio.ByteBuffer m96829x3c33a717(int i17) {
        return this.f47571xd938bd73.getOutputBuffer(i17);
    }

    /* renamed from: initAudioDecoder */
    private void m96830xdf9f6cbe() {
        try {
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 mo96880xef8f993f = this.f47569x36e44d07.mo96880xef8f993f(this.f47580x39c52128);
            this.f47570x94f6e49b = mo96880xef8f993f;
            mo96880xef8f993f.mo96672x68ac462();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = this.f47580x39c52128.m97260x75286aac();
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50 interfaceC25767xc9028e50 = this.f47570x94f6e49b;
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            if (m97260x75286aac.m97222xf922bec1(c25736x76b98a57)) {
                c25736x76b98a57 = m97260x75286aac.sub(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.m97219xb488def0(200L));
            }
            interfaceC25767xc9028e50.mo96663xc9fc1b13(c25736x76b98a57, false, false);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: initAudioEncoder */
    private void m96831x23e14596() {
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat(f47565x241c34, this.f47578xe4b949f7, this.f47574x9132a6d9);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f47577x626c2ed);
        createAudioFormat.setInteger("max-input-size", 8192);
        android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType(this.f47576x6249a41);
        this.f47571xd938bd73 = createEncoderByType;
        createEncoderByType.configure(createAudioFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
    }

    /* renamed from: isFinish */
    private boolean m96832xdc367e5d(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.presentationTimeUs >= this.f47580x39c52128.m97259x74606f23();
    }

    /* renamed from: isValidBuffer */
    private boolean m96833x269cbfd2(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && bufferInfo.presentationTimeUs >= this.f47580x39c52128.m97261xccb87a6a() && bufferInfo.presentationTimeUs <= this.f47580x39c52128.m97259x74606f23() && (bufferInfo.flags & 2) == 0;
    }

    /* renamed from: notifyProgressUpdate */
    private void m96834x8b6440ff(long j17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26;
        if (this.f47572x1ab9c7d2 == null || (c25738xead39d26 = this.f47580x39c52128) == null) {
            return;
        }
        this.f47572x1ab9c7d2.mo96870x696ee52c(this.f47581x1a39f6bf, (((float) (j17 - c25738xead39d26.m97261xccb87a6a())) * 1.0f) / ((float) this.f47580x39c52128.m97257x37a7fb48()));
    }

    /* renamed from: queueInputBuffer */
    private void m96835xfe5642d9(android.media.MediaCodec mediaCodec, int i17, int i18, int i19, long j17, int i27) {
        try {
            mediaCodec.queueInputBuffer(i17, i18, i19, j17, i27);
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
                    m96839xe9f95e2(20L);
                    m96835xfe5642d9(mediaCodec, i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    /* renamed from: readNextSample */
    private void m96836xec875cb3() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 mo96659xe121b2e0 = this.f47570x94f6e49b.mo96659xe121b2e0();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97195xfb85bb43 = mo96659xe121b2e0.m97195xfb85bb43();
        if (m97195xfb85bb43.f47870x6ac9171 > 0 && m97195xfb85bb43.m97232x31040141() <= this.f47580x39c52128.m97259x74606f23()) {
            java.nio.ByteBuffer m97192x1d62828 = mo96659xe121b2e0.m97192x1d62828();
            int limit = m97192x1d62828.limit() - m97192x1d62828.position();
            byte[] bArr = new byte[limit];
            m97192x1d62828.get(bArr);
            m96842x1ba943c1(m97195xfb85bb43, limit, bArr);
            return;
        }
        long m97206x8311a768 = mo96659xe121b2e0.m97193x75286adb().m97206x8311a768();
        if (m97206x8311a768 >= -1 && !this.f47568x9ba792b4) {
            m96837x794c024c();
            this.f47568x9ba792b4 = true;
        }
        this.f47581x1a39f6bf = m97206x8311a768 < -1 ? 255 : this.f47581x1a39f6bf;
    }

    /* renamed from: signalEndOfAudioStream */
    private void m96837x794c024c() {
        try {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "signalEndOfAudioStream: ");
            int m96827x9a572d5a = m96827x9a572d5a(this.f47571xd938bd73);
            if (m96827x9a572d5a >= 0) {
                m96835xfe5642d9(this.f47571xd938bd73, m96827x9a572d5a, 0, 0, 0L, 4);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "signalEndOfAudioStream failed", th6);
        }
    }

    /* renamed from: stop */
    private synchronized void m96838x360802() {
        if (!this.f47582x6277e0f.get()) {
            this.f47582x6277e0f.set(true);
            try {
                this.f47570x94f6e49b.mo96661x41012807();
                this.f47571xd938bd73.stop();
                this.f47571xd938bd73.release();
                this.f47575x32a11d.flush();
                this.f47575x32a11d.close();
            } catch (java.lang.Exception unused) {
            }
        }
        m96834x8b6440ff(this.f47580x39c52128.m97259x74606f23());
        this.f47573xfde65547 = false;
    }

    /* renamed from: waitTime */
    private void m96839xe9f95e2(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    /* renamed from: write */
    private void m96840x6c257df(byte[] bArr) {
        if (this.f47575x32a11d == null) {
            this.f47575x32a11d = new java.io.FileOutputStream(this.f47579xa9723acf);
        }
        this.f47575x32a11d.write(bArr);
    }

    /* renamed from: writeAudioSample */
    private void m96842x1ba943c1(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, int i17, byte[] bArr) {
        int i18 = 0;
        while (i17 - i18 > 0) {
            int dequeueInputBuffer = this.f47571xd938bd73.dequeueInputBuffer(-1L);
            if (dequeueInputBuffer >= 0) {
                java.nio.ByteBuffer m96828xaa9f9f74 = m96828xaa9f9f74(dequeueInputBuffer);
                m96828xaa9f9f74.clear();
                int min = java.lang.Math.min(m96828xaa9f9f74.capacity(), i17);
                m96828xaa9f9f74.put(bArr, i18, min);
                i18 += min;
                this.f47571xd938bd73.queueInputBuffer(dequeueInputBuffer, 0, min, c25736x76b98a57.m97232x31040141(), 1);
            }
        }
    }

    /* renamed from: cancel */
    public synchronized void m96843xae7a2e7a() {
        this.f47573xfde65547 = true;
    }

    /* renamed from: getRate */
    public int m96844xfb84b556() {
        return this.f47577x626c2ed;
    }

    /* renamed from: getSampleRate */
    public int m96845xf6c809a0() {
        return this.f47578xe4b949f7;
    }

    /* renamed from: getSavePath */
    public java.lang.String m96846x4ed0b8() {
        return this.f47579xa9723acf;
    }

    /* renamed from: getSelectedTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m96847xf018215f() {
        return this.f47580x39c52128;
    }

    /* renamed from: prepare */
    public void m96848xed060d07() {
        m96830xdf9f6cbe();
        m96831x23e14596();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "encoder start - " + this);
        while (this.f47581x1a39f6bf <= 1 && !this.f47573xfde65547) {
            try {
                m96836xec875cb3();
                m96841x1ba943c1();
            } catch (java.lang.Throwable unused) {
                this.f47581x1a39f6bf = 255;
            }
        }
        if (this.f47573xfde65547) {
            this.f47581x1a39f6bf = 4;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "encoder finish - " + this + "  mStatus = " + this.f47581x1a39f6bf);
        m96838x360802();
    }

    /* renamed from: setAsset */
    public void m96849x52b8abae(com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<? extends com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50> interfaceC25698xaf2a0788) {
        this.f47569x36e44d07 = interfaceC25698xaf2a0788;
    }

    /* renamed from: setCallback */
    public void m96850x6c4ebec7(com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25696x8c617039 interfaceC25696x8c617039) {
        this.f47572x1ab9c7d2 = interfaceC25696x8c617039;
    }

    /* renamed from: setMime */
    public void m96851x764d53b6(java.lang.String str) {
        this.f47576x6249a41 = str;
    }

    /* renamed from: setRate */
    public void m96852x764f7c62(int i17) {
        this.f47577x626c2ed = i17;
    }

    /* renamed from: setSampleRate */
    public void m96853x24ec57ac(int i17) {
        this.f47578xe4b949f7 = i17;
    }

    /* renamed from: setSavePath */
    public void m96854xfb0731c4(java.lang.String str) {
        this.f47579xa9723acf = str;
    }

    /* renamed from: setSelectedTimeRange */
    public void m96855xcbae2dd3(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47580x39c52128 = c25738xead39d26;
    }

    /* renamed from: start */
    public synchronized void m96856x68ac462() {
        if (this.f47583x1b4d34d7 == null) {
            this.f47571xd938bd73.start();
            java.lang.Thread thread = new java.lang.Thread(this);
            this.f47583x1b4d34d7 = thread;
            thread.start();
            this.f47582x6277e0f.set(false);
            this.f47573xfde65547 = false;
            this.f47568x9ba792b4 = false;
            this.f47581x1a39f6bf = 1;
        }
    }

    /* renamed from: writeAudioSample */
    private void m96841x1ba943c1() {
        int dequeueOutputBuffer;
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        do {
            dequeueOutputBuffer = this.f47571xd938bd73.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0 && m96833x269cbfd2(bufferInfo) && this.f47581x1a39f6bf != 2) {
                if ((bufferInfo.flags & 4) != 0) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM ");
                    this.f47581x1a39f6bf = 2;
                }
                java.nio.ByteBuffer m96829x3c33a717 = m96829x3c33a717(dequeueOutputBuffer);
                m96829x3c33a717.position(bufferInfo.offset);
                int i17 = bufferInfo.size;
                byte[] bArr = new byte[i17 + 7];
                m96829x3c33a717.get(bArr, 7, i17);
                com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.C25695x970c115.m96883xbcfd61e6(bArr, this.f47574x9132a6d9);
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "dequeue finish - " + bufferInfo.presentationTimeUs + "--" + bufferInfo.flags + " -- " + bufferInfo.size + "  -  " + dequeueOutputBuffer + " endUs = " + this.f47580x39c52128.m97259x74606f23());
                m96840x6c257df(bArr);
                this.f47571xd938bd73.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (this.f47581x1a39f6bf != 2) {
                    m96834x8b6440ff(bufferInfo.presentationTimeUs);
                } else {
                    m96834x8b6440ff(this.f47580x39c52128.m97259x74606f23());
                }
            } else if (m96832xdc367e5d(bufferInfo)) {
                this.f47581x1a39f6bf = 2;
            } else if (dequeueOutputBuffer != -1 && dequeueOutputBuffer != -2) {
                if ((bufferInfo.flags & 4) != 0) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM " + bufferInfo.size + "/" + bufferInfo.presentationTimeUs);
                    this.f47581x1a39f6bf = 2;
                    this.f47571xd938bd73.releaseOutputBuffer(dequeueOutputBuffer, false);
                } else {
                    this.f47571xd938bd73.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        } while (dequeueOutputBuffer >= 0);
    }
}

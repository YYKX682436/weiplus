package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44;

/* renamed from: com.tencent.thumbplayer.core.decoder.TPMediaCodecAudioDecoder */
/* loaded from: classes14.dex */
public class C26345x4b844dc extends com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65 {
    private static final java.lang.String TAG = "TPMediaCodecAudioDecoder";

    /* renamed from: mAudioFormat */
    private int f52565xadf4d8c0;

    /* renamed from: mChannelCount */
    private int f52566x9132a6d9;

    /* renamed from: mCsd0Data */
    private byte[] f52567xc1e80a13;

    /* renamed from: mEnableAudioPassThrough */
    private boolean f52568xae65942e;

    /* renamed from: mIsAdts */
    private boolean f52569x90ca0f9;

    /* renamed from: mMimeCandidates */
    private java.util.ArrayList<java.lang.String> f52570x2d707471;

    /* renamed from: mSampleRate */
    private int f52571xe4b949f7;

    public C26345x4b844dc(int i17) {
        super(i17);
        this.f52570x2d707471 = new java.util.ArrayList<>();
        this.f52571xe4b949f7 = 0;
        this.f52566x9132a6d9 = 0;
        this.f52565xadf4d8c0 = 0;
        this.f52567xc1e80a13 = null;
        this.f52569x90ca0f9 = false;
        this.f52568xae65942e = false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: configCodec */
    public void mo102089xff7e55f4(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "configCodec: ");
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat(str, this.f52571xe4b949f7, this.f52566x9132a6d9);
        byte[] bArr = this.f52567xc1e80a13;
        if (bArr != null) {
            createAudioFormat.setByteBuffer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.f54292x3d6ec85, java.nio.ByteBuffer.wrap(bArr));
        }
        if (this.f52569x90ca0f9) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "configCodec: set is adts");
            createAudioFormat.setInteger("is-adts", 1);
        }
        c26485xc3ef8206.mo103283xd00d62e6(createAudioFormat, (android.view.Surface) null, this.f52538x7a8de318, 0);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: getCodecName */
    public java.lang.String mo102090xbc67750b(java.lang.String str, boolean z17) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101712x21f31fb9(str, z17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: getLogTag */
    public java.lang.String mo102091x23aed0ac() {
        return TAG;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: initDecoder */
    public boolean mo102037xaa9e0d14(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface, int i27, int i28, int i29) {
        return false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processMediaCodecException */
    public void mo102095x786112ee(java.lang.Exception exc) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processOutputBuffer */
    public void mo102096xacac58b0(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f) {
        byte[] bArr;
        c26344xc9e9249f.f52562x88751aa = this.f52571xe4b949f7;
        c26344xc9e9249f.f52550xf99d8dcc = this.f52566x9132a6d9;
        c26344xc9e9249f.f52557xb45ff7f7 = this.f52565xadf4d8c0;
        java.nio.ByteBuffer m103338x3c33a717 = c26485xc3ef8206.m103338x3c33a717(i17);
        if (m103338x3c33a717 != null) {
            int i18 = bufferInfo.size;
            bArr = new byte[i18];
            m103338x3c33a717.get(bArr, bufferInfo.offset, i18);
        } else {
            bArr = null;
        }
        c26344xc9e9249f.f52555x2eefaa = bArr;
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            c26344xc9e9249f.f52556xa7c470f2 = 2;
        }
        c26485xc3ef8206.mo103286xab26be48(i17, false);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processOutputConfigData */
    public void mo102097x1881827c(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f) {
        c26485xc3ef8206.mo103286xab26be48(i17, false);
        c26344xc9e9249f.f52556xa7c470f2 = 1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processOutputFormatChanged */
    public void mo102098xea0cc4d(android.media.MediaFormat mediaFormat) {
        int i17;
        int i18;
        try {
            if (mediaFormat.containsKey("sample-rate")) {
                this.f52571xe4b949f7 = mediaFormat.getInteger("sample-rate");
            }
            if (mediaFormat.containsKey("channel-count")) {
                this.f52566x9132a6d9 = mediaFormat.getInteger("channel-count");
            }
            if (mediaFormat.containsKey("pcm-encoding")) {
                i18 = mediaFormat.getInteger("pcm-encoding");
                try {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "processOutputFormatChanged: MediaFormat.KEY_PCM_ENCODING: " + i18);
                } catch (java.lang.Exception e17) {
                    i17 = i18;
                    e = e17;
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "processOutputFormatChanged got one exception: " + m102093x67074b93(e));
                    i18 = i17;
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.f52568xae65942e + ", mSampleRate: " + this.f52571xe4b949f7 + ", mChannelCount: " + this.f52566x9132a6d9 + " mAudioFormat: " + this.f52565xadf4d8c0 + " pcmFormat:" + i18);
                }
            } else {
                i18 = 2;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            i17 = 2;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.f52568xae65942e + ", mSampleRate: " + this.f52571xe4b949f7 + ", mChannelCount: " + this.f52566x9132a6d9 + " mAudioFormat: " + this.f52565xadf4d8c0 + " pcmFormat:" + i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setOperateRate */
    public int mo102041x77b122c2(float f17) {
        return super.mo102041x77b122c2(f17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamBool */
    public boolean mo102043xd02fead5(int i17, boolean z17) {
        if (i17 == 2) {
            this.f52569x90ca0f9 = z17;
            return true;
        }
        if (i17 != 3) {
            return super.mo102043xd02fead5(i17, z17);
        }
        this.f52568xae65942e = z17;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "setParamBool mEnableAudioPassThrough:" + this.f52568xae65942e);
        return true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamBytes */
    public boolean mo102044x35d20de0(int i17, byte[] bArr) {
        if (i17 == 200) {
            this.f52567xc1e80a13 = bArr;
        }
        return super.mo102044x35d20de0(i17, bArr);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamObject */
    public boolean mo102047x9956046a(int i17, java.lang.Object obj) {
        return super.mo102047x9956046a(i17, obj);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: getMimeCandidates */
    public java.util.ArrayList<java.lang.String> mo102092x1555379a() {
        return this.f52570x2d707471;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: initDecoder */
    public boolean mo102036xaa9e0d14(java.lang.String str, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "initDecoder, mimeType:" + str + " sampleRate:" + i17 + " channelCount:" + i18 + " drmType:" + i19 + " audioFormat:" + i27);
        this.f52571xe4b949f7 = i17;
        this.f52566x9132a6d9 = i18;
        this.f52525x10b8544c = i19;
        this.f52565xadf4d8c0 = i27;
        this.f52570x2d707471.clear();
        this.f52570x2d707471.add(str);
        return true;
    }
}

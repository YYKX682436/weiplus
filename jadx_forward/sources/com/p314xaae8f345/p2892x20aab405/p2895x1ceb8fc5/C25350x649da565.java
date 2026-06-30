package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent */
/* loaded from: classes16.dex */
class C25350x649da565 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 {

    /* renamed from: MAX_AUDIO_TRACK_BUFFER_TIME */
    private static final int f45720xa1c18014 = 1;

    /* renamed from: MIN_AUDIO_TRACK_BUFFER_TIMES */
    private static final int f45721x4e79c991 = 1;
    private static final java.lang.String TAG = "StreamDecodeDataComponent";

    /* renamed from: USE_AUDIO_TRACK_TIME_THRESHOLD */
    private static final int f45722x493cc1ae = 5000;

    /* renamed from: mCurrentFrameCount */
    private long f45723xc382f10e;

    /* renamed from: mNeedFlush */
    private boolean f45724xb97cfa21;

    /* renamed from: mSeekRecord */
    private final java.util.Stack<java.lang.Integer> f45725xc1ec6536;

    /* renamed from: mTrackBufferSizeInByte */
    private int f45726xb554f48c;

    public C25350x649da565(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25346x5c2e8560 c25346x5c2e8560, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 interfaceC25340xe0077a66, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback handleDecodeDataCallback, android.os.Handler handler, int i17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce12) {
        super(runnableC25325xe8a39f80, c25346x5c2e8560, c25316x94782396, interfaceC25340xe0077a66, handleDecodeDataCallback, handler, i17, interfaceC25354x74ec3ce1, interfaceC25354x74ec3ce12);
        this.f45725xc1ec6536 = new java.util.Stack<>();
        this.f45723xc382f10e = 0L;
        this.f45724xb97cfa21 = false;
    }

    /* renamed from: addSeekRecord */
    private void m93858xe6ec2c6a(int i17) {
        synchronized (this.f45725xc1ec6536) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "add seek: " + i17);
            this.f45725xc1ec6536.push(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: createAudioTrack */
    private boolean m93859xc88ccd31() {
        int i17;
        int i18;
        int i19;
        int state;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("createAudioTrack"));
        if (!this.f45519xef6e3074.m93850x7aad142a(3)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "mState is not preparing");
            m93580x2ddea2f6(91, 54);
            return false;
        }
        if (this.f45513x1f63867f.m93542xf6c809a0() <= 0) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "mInformation.getSampleRate() failed");
            m93580x2ddea2f6(91, 64);
            return false;
        }
        int m93539xd13e6146 = this.f45513x1f63867f.m93539xd13e6146();
        if (m93539xd13e6146 == 1) {
            i17 = 4;
        } else {
            int i27 = 12;
            if (m93539xd13e6146 != 2) {
                if (m93539xd13e6146 == 6) {
                    i27 = 252;
                } else if (m93539xd13e6146 == 8) {
                    i27 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c;
                }
            }
            i17 = i27;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9(this.f45513x1f63867f.m93555x9616526c()));
        this.f45521x48a8ccfc = this.f45513x1f63867f.m93542xf6c809a0();
        while (this.f45521x48a8ccfc > m93587x8e4ec24b()) {
            this.f45521x48a8ccfc /= 2;
        }
        int m93537xbc5bbb2c = this.f45513x1f63867f.m93537xbc5bbb2c();
        int i28 = m93537xbc5bbb2c == 0 ? 2 : m93537xbc5bbb2c;
        if (m93605x5b3b595d() && this.f45513x1f63867f.m93537xbc5bbb2c() >= 3) {
            this.f45520xe84f3c34 = i28;
            this.f45496x44ff4577 = true;
            if (this.f45521x48a8ccfc != this.f45513x1f63867f.m93542xf6c809a0()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use float resampled pcm for Hi-Res, bitDept: " + this.f45513x1f63867f.m93537xbc5bbb2c() + ", origin sample rate: " + this.f45513x1f63867f.m93542xf6c809a0() + ", target sample rate: " + this.f45521x48a8ccfc));
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use float pcm for Hi-Res, bitDept: " + this.f45513x1f63867f.m93537xbc5bbb2c() + ", sample rate: " + this.f45521x48a8ccfc));
            }
        } else if (m93605x5b3b595d() || this.f45513x1f63867f.m93537xbc5bbb2c() < 3) {
            this.f45520xe84f3c34 = i28;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use byte pcm resampled, bitDept: " + this.f45513x1f63867f.m93537xbc5bbb2c() + ", origin sample rate: " + this.f45513x1f63867f.m93542xf6c809a0() + ", target sample rate: " + this.f45521x48a8ccfc));
        } else {
            this.f45520xe84f3c34 = 2;
            if (this.f45521x48a8ccfc != this.f45513x1f63867f.m93542xf6c809a0()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use byte pcm resampled and bitDept converted, origin bitDept: " + this.f45513x1f63867f.m93537xbc5bbb2c() + ", target bitDept: " + this.f45520xe84f3c34 + ", origin sample rate: " + this.f45513x1f63867f.m93542xf6c809a0() + ", target sample rate: " + this.f45521x48a8ccfc));
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use byte pcm with bitDept converted, origin bitDept: " + this.f45513x1f63867f.m93537xbc5bbb2c() + ", target bitDept: " + this.f45520xe84f3c34));
            }
        }
        int i29 = i28 == 1 ? 3 : (i28 != 2 && this.f45496x44ff4577) ? 4 : 2;
        int mo93624x6bb4d31f = (int) this.f45509xb9c978f2.mo93624x6bb4d31f();
        int m93588x55bbc89d = m93588x55bbc89d(this.f45521x48a8ccfc, i17, i29, m93539xd13e6146, i28);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("[createAudioTrack] playback_bufsize:" + m93588x55bbc89d + " decoderBufsizeInByte:" + mo93624x6bb4d31f));
        int i37 = this.f45514xd84d5637;
        if (i37 > 1) {
            m93588x55bbc89d = m93862xb58852a0(i37, m93588x55bbc89d);
        }
        if (m93588x55bbc89d > mo93624x6bb4d31f) {
            mo93624x6bb4d31f = m93588x55bbc89d;
        }
        this.f45501xca3cea81 = mo93624x6bb4d31f;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9(java.lang.String.format("playback_bufsize: %d, mBuffSize: %d, mTargetPlaySample: %d, playChannel: %d, pcmEncoding: %d", java.lang.Integer.valueOf(m93588x55bbc89d), java.lang.Integer.valueOf(this.f45501xca3cea81), java.lang.Long.valueOf(this.f45521x48a8ccfc), java.lang.Integer.valueOf(m93539xd13e6146), java.lang.Integer.valueOf(i29))));
        int max = java.lang.Math.max((int) (java.lang.Math.floor((((this.f45521x48a8ccfc * 1) * m93539xd13e6146) * 2) / m93588x55bbc89d) + 1.0d), 1);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("times: " + max + ", MIN_AUDIO_TRACK_BUFFER_TIMES: 1"));
        int i38 = max;
        while (i38 >= 1) {
            int i39 = m93588x55bbc89d * i38;
            try {
                this.f45726xb554f48c = i39;
                i18 = i28;
                i19 = i17;
                try {
                    m93615x78226117(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.m93576xa200ca01(this.f45499x27fee723, (int) this.f45521x48a8ccfc, i17, i29, i39, 1));
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("[createAudioTrack] new AudioTrack, sampleRate: " + this.f45521x48a8ccfc + ", channels: " + i19 + ", bitDepth: " + i18 + ", buffer: " + this.f45726xb554f48c));
                    state = this.f45500x37ef5362.getState();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th);
                    i38 -= 2;
                    i28 = i18;
                    i17 = i19;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                i18 = i28;
                i19 = i17;
            }
            if (state == 1) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("new AudioTrack succeed"));
                break;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("audioTrack create fail!!! state = " + state));
            this.f45500x37ef5362.release();
            i38 -= 2;
            i28 = i18;
            i17 = i19;
        }
        android.media.AudioTrack audioTrack = this.f45500x37ef5362;
        if (audioTrack == null || audioTrack.getState() != 1) {
            this.f45504x5717d3fc = true;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("create audioTrack fail mCreateAudioTrackFail = true"));
            m93615x78226117(null);
            m93580x2ddea2f6(92, 66);
            return false;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("create audioTrack success times = " + i38));
        this.f45519xef6e3074.m93851x78226117(this.f45500x37ef5362);
        return true;
    }

    /* renamed from: getCalcBitMinSize */
    private long m93860xfa1040d1(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396) {
        if (c25316x94782396 != null) {
            return (((float) ((c25316x94782396.m93542xf6c809a0() * c25316x94782396.m93539xd13e6146()) * c25316x94782396.m93537xbc5bbb2c())) * 5.0f) / 1000.0f;
        }
        return 0L;
    }

    /* renamed from: getGcd */
    private int m93861xb5883fd2(int i17, int i18) {
        while (true) {
            int i19 = i18;
            int i27 = i17;
            i17 = i19;
            if (i17 <= 0) {
                return i27;
            }
            i18 = i27 % i17;
        }
    }

    /* renamed from: getLcm */
    private int m93862xb58852a0(int i17, int i18) {
        return (i17 * i18) / m93861xb5883fd2(i17, i18);
    }

    /* renamed from: initTempBufferInfoIfNeeded */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e m93863xd4f79284(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, int i17) {
        if (c25321xe86c292e != null) {
            return c25321xe86c292e;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e();
        c25321xe86c292e2.m93671xbc8d7044(i17);
        return c25321xe86c292e2;
    }

    /* renamed from: initTempFloatBufferInfoIfNeeded */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a m93864xadb5838(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a, int i17) {
        if (c25328x90bcc06a != null) {
            return c25328x90bcc06a;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a2 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a();
        c25328x90bcc06a2.m93790xb77506d4(i17);
        return c25328x90bcc06a2;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: flush */
    public void mo93584x5d03b04() {
        this.f45724xb97cfa21 = true;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: getAudioStreamType */
    public int mo93585x3cb2891a() {
        return 3;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: getCurPosition */
    public long mo93586x4abe8653() {
        android.media.AudioTrack audioTrack = this.f45500x37ef5362;
        if (audioTrack == null || audioTrack.getState() == 0) {
            return this.f45505x1af550dc;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396 = this.f45513x1f63867f;
        if (c25316x94782396 == null) {
            return this.f45505x1af550dc;
        }
        long mo93759xbf6cb171 = this.f45498x5fa7c92e.mo93759xbf6cb171(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.m93575xf98d554(this.f45723xc382f10e, audioTrack));
        long m93539xd13e6146 = c25316x94782396.m93539xd13e6146() * this.f45520xe84f3c34 * c25316x94782396.m93541x4b916df4();
        long mo93623xa242feda = this.f45509xb9c978f2.mo93623xa242feda() - java.lang.Math.max(0L, m93539xd13e6146 > 0 ? (this.f45726xb554f48c / m93539xd13e6146) * 1000 : 0L);
        if (mo93623xa242feda < 0) {
            this.f45505x1af550dc = mo93759xbf6cb171;
        } else if (mo93759xbf6cb171 <= 0 || java.lang.Math.abs(mo93759xbf6cb171 - mo93623xa242feda) >= 5000) {
            this.f45505x1af550dc = mo93623xa242feda;
        } else {
            this.f45505x1af550dc = mo93759xbf6cb171;
        }
        return this.f45505x1af550dc;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0709  */
    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: handleDecodeData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo93592x13cb0700() {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25350x649da565.mo93592x13cb0700():void");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: pause */
    public void mo93607x65825f6(boolean z17) {
        android.media.AudioTrack audioTrack;
        super.mo93607x65825f6(z17);
        if (!z17 || (audioTrack = this.f45500x37ef5362) == null) {
            return;
        }
        try {
            if (audioTrack.getState() != 1 || audioTrack.getPlayState() == 2) {
                return;
            }
            audioTrack.pause();
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: release */
    public void mo93611x41012807() {
        super.mo93611x41012807();
        this.f45723xc382f10e = 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: seek */
    public void mo93613x35ce78(int i17) {
        m93858xe6ec2c6a(i17);
        m93610x54f7fc98(i17);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: setAudioStreamType */
    public void mo93614x7389228e(int i17) {
        if (i17 == this.f45499x27fee723) {
            return;
        }
        try {
            this.f45499x27fee723 = i17;
            android.media.AudioTrack audioTrack = this.f45500x37ef5362;
            if (audioTrack != null) {
                android.media.AudioTrack m93576xa200ca01 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.m93576xa200ca01(i17, audioTrack.getSampleRate(), this.f45500x37ef5362.getChannelConfiguration(), this.f45500x37ef5362.getAudioFormat(), this.f45726xb554f48c, 1);
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("[setAudioStreamType] new AudioTrack, sampleRate: " + this.f45500x37ef5362.getSampleRate() + ", channels: " + this.f45500x37ef5362.getChannelConfiguration() + ", bitDepth: " + this.f45500x37ef5362.getAudioFormat() + ", buffer: " + this.f45726xb554f48c));
                int playState = this.f45500x37ef5362.getPlayState();
                if (playState == 3) {
                    mo93607x65825f6(false);
                }
                this.f45500x37ef5362.release();
                m93615x78226117(m93576xa200ca01);
                this.f45519xef6e3074.m93851x78226117(this.f45500x37ef5362);
                if (playState == 3) {
                    m93608x348b34();
                }
            }
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "failed in setting audio stream type to :" + i17, e17);
        }
    }
}

package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent */
/* loaded from: classes16.dex */
abstract class AbstractC25319xfa8eda74 {

    /* renamed from: CALL_PREPARED_DELAY_TIME */
    static final int f45493x6025860a = 20;
    private static final java.lang.String TAG = "BaseDecodeDataComponent";

    /* renamed from: WRITE_ZERO_THRESHOLD */
    static final int f45494x4ea56bf4 = 5;

    /* renamed from: sSessionId */
    private static volatile int f45495x58aa2f1e = -1;

    /* renamed from: leftVolume */
    volatile float f45497x83161201;

    /* renamed from: mAudioEffectListener */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 f45498x5fa7c92e;

    /* renamed from: mAudioTrack */
    android.media.AudioTrack f45500x37ef5362;

    /* renamed from: mBuffSize */
    int f45501xca3cea81;

    /* renamed from: mCallback */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 f45502x1ab9c7d2;

    /* renamed from: mCorePlayer */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 f45503x4e03bbad;

    /* renamed from: mEventHandler */
    private final android.os.Handler f45507xf703545d;

    /* renamed from: mHandleDecodeDataCallback */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback f45509xb9c978f2;

    /* renamed from: mInformation */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 f45513x1f63867f;

    /* renamed from: mPlayerID */
    private final int f45516x95011749;

    /* renamed from: mStateRunner */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25346x5c2e8560 f45519xef6e3074;

    /* renamed from: mTargetPlaySample */
    long f45521x48a8ccfc;

    /* renamed from: mTerminalAudioEffectListener */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 f45522xb64c9212;

    /* renamed from: rightVolume */
    volatile float f45525xec5c9056;

    /* renamed from: mCurPosition */
    long f45505x1af550dc = 0;

    /* renamed from: mHasDecodeSuccess */
    boolean f45511xacbd048 = false;

    /* renamed from: mHasDecode */
    boolean f45510x500a7f3b = false;

    /* renamed from: mHasInit */
    boolean f45512xc79e419d = false;

    /* renamed from: mCreateAudioTrackFail */
    boolean f45504x5717d3fc = false;

    /* renamed from: needSetVolume */
    volatile boolean f45523x4fb71e26 = false;

    /* renamed from: mTargetBitDepth */
    int f45520xe84f3c34 = 2;

    /* renamed from: mDecodeBufferInfo */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e f45506x22437429 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e();

    /* renamed from: mFloatBufferInfo */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a f45508x9bd8385d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a();

    /* renamed from: mAudioStreamType */
    int f45499x27fee723 = mo93585x3cb2891a();

    /* renamed from: mSignalControl */
    final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e f45517x24364a28 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e();

    /* renamed from: performanceTracer */
    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd f45524x6e2d501d = null;

    /* renamed from: mNeedChangePlayThreadPriority */
    volatile boolean f45515x8f195bb5 = false;

    /* renamed from: isUseFloatForHighDepth */
    boolean f45496x44ff4577 = false;

    /* renamed from: mLeastCommonMultiple */
    int f45514xd84d5637 = 1;

    /* renamed from: mSpeedToSet */
    java.lang.Float f45518x1447c2d = null;

    /* renamed from: com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent$HandleDecodeDataCallback */
    /* loaded from: classes16.dex */
    public interface HandleDecodeDataCallback {
        /* renamed from: getCurPositionByDecoder */
        long mo93623xa242feda();

        /* renamed from: getMinPcmBufferSize */
        long mo93624x6bb4d31f();

        /* renamed from: onAudioTrackChanged */
        void mo93625x13a6b9c0(android.media.AudioTrack audioTrack);

        /* renamed from: onPullDecodeDataEndOrFailed */
        void mo93626xbe21b9bf(int i17, int i18);

        /* renamed from: pullDecodeData */
        int mo93627x111586dd(int i17, byte[] bArr);

        /* renamed from: seekTo */
        int mo93628xc9fc1b13(int i17);
    }

    public AbstractC25319xfa8eda74(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25346x5c2e8560 c25346x5c2e8560, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 interfaceC25340xe0077a66, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback handleDecodeDataCallback, android.os.Handler handler, int i17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce12) {
        this.f45503x4e03bbad = runnableC25325xe8a39f80;
        this.f45519xef6e3074 = c25346x5c2e8560;
        this.f45513x1f63867f = c25316x94782396;
        this.f45502x1ab9c7d2 = interfaceC25340xe0077a66;
        this.f45509xb9c978f2 = handleDecodeDataCallback;
        this.f45507xf703545d = handler;
        this.f45516x95011749 = i17;
        this.f45498x5fa7c92e = interfaceC25354x74ec3ce1;
        this.f45522xb64c9212 = interfaceC25354x74ec3ce12;
    }

    /* renamed from: destroyAudioListeners */
    private void m93574x7fe135a3() {
        this.f45498x5fa7c92e.mo93767x60dfa40d();
        this.f45522xb64c9212.mo93767x60dfa40d();
    }

    /* renamed from: getAudioTrackPosition */
    public static int m93575xf98d554(long j17, android.media.AudioTrack audioTrack) {
        long round;
        if (audioTrack != null) {
            try {
                round = java.lang.Math.round(((j17 + audioTrack.getPlaybackHeadPosition()) / audioTrack.getSampleRate()) * 1000.0d);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getAudioTrackPosition", e17);
            }
            return (int) round;
        }
        round = 0;
        return (int) round;
    }

    /* renamed from: instantiateAudioTrackCompat */
    public static android.media.AudioTrack m93576xa200ca01(int i17, int i18, int i19, int i27, int i28, int i29) {
        android.media.AudioTrack m93792xaf65a0fc;
        if (f45495x58aa2f1e == -1) {
            f45495x58aa2f1e = 0;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25329x8ef3c60e m93560xe9ca92a1 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.m93560xe9ca92a1();
        if (m93560xe9ca92a1 != null && (m93792xaf65a0fc = m93560xe9ca92a1.m93792xaf65a0fc(i17, i18, i19, i27, i28, i29, f45495x58aa2f1e)) != null) {
            return m93792xaf65a0fc;
        }
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        builder.setLegacyStreamType(i17);
        android.media.AudioFormat.Builder builder2 = new android.media.AudioFormat.Builder();
        builder2.setSampleRate(i18);
        builder2.setEncoding(i27);
        builder2.setChannelMask(i19);
        return new android.media.AudioTrack.Builder().setAudioAttributes(builder.build()).setAudioFormat(builder2.build()).setBufferSizeInBytes(i28).setTransferMode(i29).setSessionId(f45495x58aa2f1e).build();
    }

    /* renamed from: axiliary */
    public java.lang.String m93577xe18dbff9(java.lang.String str) {
        return "ID: " + this.f45516x95011749 + ". " + str;
    }

    /* renamed from: calculatePcmPlayTime */
    public long m93578xe6f2dbd5(byte[] bArr, int i17, int i18, long j17) {
        if (i17 == 0 || i18 == 0 || j17 == 0) {
            return 0L;
        }
        return (((bArr.length * 1000.0f) / i17) / i18) / ((float) j17);
    }

    /* renamed from: callExceptionCallback */
    public void m93580x2ddea2f6(int i17, int i18) {
        m93573x2ddea2f6(i17, i18, 0);
    }

    /* renamed from: changePlayThreadPriorityImmediately */
    public void m93581xbb55c7ac() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("changePlayThreadPriorityImmediately"));
        this.f45515x8f195bb5 = true;
    }

    /* renamed from: convertBytePcmToFloatPcm */
    public void m93582x5a04cf58(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a) {
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25459x1a0f9271.m94399x58bba86(c25321xe86c292e, c25328x90bcc06a, this.f45513x1f63867f.m93537xbc5bbb2c());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
        }
    }

    /* renamed from: doWaitForPaused */
    public void m93583x76bc1697() {
        this.f45517x24364a28.m94414xb0e9d4a0(2000L, 5, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e.WaitListener() { // from class: com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.1
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e.WaitListener
            /* renamed from: keepWaiting */
            public boolean mo93622x33d5f308() {
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.this.m93602xecd98af8();
            }
        });
    }

    /* renamed from: flush */
    public void mo93584x5d03b04() {
    }

    /* renamed from: getAudioStreamType */
    public abstract int mo93585x3cb2891a();

    /* renamed from: getCurPosition */
    public abstract long mo93586x4abe8653();

    /* renamed from: getMaxSupportSampleRate */
    public int m93587x8e4ec24b() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("can't reflect max sample rate, use default sample rate"));
        return 192000;
    }

    /* renamed from: getMinBufferSize */
    public int m93588x55bbc89d(long j17, int i17, int i18, int i19, int i27) {
        int minBufferSize = android.media.AudioTrack.getMinBufferSize((int) j17, i17, i18);
        if (minBufferSize >= 0) {
            return minBufferSize;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("minBufferSize = " + minBufferSize + " mTargetPlaySample = " + j17 + "  channelConfiguration = " + i17 + "   pcmEncoding = " + i18));
        return i19 * 3536 * i27;
    }

    /* renamed from: getPlayerState */
    public int m93589xfa6224fa() {
        return this.f45519xef6e3074.get().intValue();
    }

    /* renamed from: getSessionId */
    public int m93590x23a7af9b() {
        android.media.AudioTrack audioTrack = this.f45500x37ef5362;
        if (audioTrack != null) {
            return audioTrack.getAudioSessionId();
        }
        return 0;
    }

    /* renamed from: getSpeed */
    public float m93591x7526a691() {
        java.lang.Float f17 = this.f45518x1447c2d;
        if (f17 != null) {
            return f17.floatValue();
        }
        android.media.AudioTrack audioTrack = this.f45500x37ef5362;
        if (audioTrack != null) {
            return audioTrack.getPlaybackParams().getSpeed();
        }
        return 1.0f;
    }

    /* renamed from: handleDecodeData */
    public abstract void mo93592x13cb0700();

    /* renamed from: handleHighBitDepth */
    public void m93593xdabfc3c0(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2) {
        if (this.f45496x44ff4577) {
            c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
            return;
        }
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25459x1a0f9271.m94398x8f850609(c25321xe86c292e, c25321xe86c292e2, this.f45513x1f63867f.m93537xbc5bbb2c());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
        }
    }

    /* renamed from: handleHighSample */
    public void m93594x4613b634(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2) {
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25459x1a0f9271.m94405xb447bdbd(c25321xe86c292e, c25321xe86c292e2, this.f45513x1f63867f.m93542xf6c809a0(), this.f45521x48a8ccfc, this.f45520xe84f3c34);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
        }
    }

    /* renamed from: hasDecodeData */
    public synchronized boolean m93595xe104c4f2() {
        return this.f45510x500a7f3b;
    }

    /* renamed from: hasDecodeDataSuccess */
    public synchronized boolean m93596x3fa0feb1() {
        return this.f45511xacbd048;
    }

    /* renamed from: initAudioListeners */
    public void m93597xe1d5c39(int i17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396, long j17) {
        this.f45498x5fa7c92e.mo93765x3d057be3(i17, c25316x94782396, j17);
        this.f45522xb64c9212.mo93765x3d057be3(i17, c25316x94782396, j17);
    }

    /* renamed from: isCompleted */
    public synchronized boolean m93598xf29e3841() {
        return this.f45519xef6e3074.m93850x7aad142a(7);
    }

    /* renamed from: isError */
    public synchronized boolean m93599x7aad7efe() {
        return this.f45519xef6e3074.m93850x7aad142a(9);
    }

    /* renamed from: isIdle */
    public synchronized boolean m93600xb9a41c1e() {
        return this.f45519xef6e3074.m93850x7aad142a(0);
    }

    /* renamed from: isInit */
    public boolean m93601xb9a4415a() {
        return this.f45512xc79e419d;
    }

    /* renamed from: isPaused */
    public synchronized boolean m93602xecd98af8() {
        return this.f45519xef6e3074.m93850x7aad142a(5);
    }

    /* renamed from: isPlaying */
    public synchronized boolean m93603xc00617a4() {
        return this.f45519xef6e3074.m93850x7aad142a(4);
    }

    /* renamed from: isStopped */
    public synchronized boolean m93604x6d20d943() {
        return this.f45519xef6e3074.m93850x7aad142a(6);
    }

    /* renamed from: isSupportHighBitDepth */
    public boolean m93605x5b3b595d() {
        return true;
    }

    /* renamed from: notifySeekCompleteForAudioListeners */
    public void m93606x2e870598(long j17) {
        this.f45498x5fa7c92e.mo93766xfdfcc191(j17);
        this.f45522xb64c9212.mo93766xfdfcc191(j17);
    }

    /* renamed from: pause */
    public void mo93607x65825f6(boolean z17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("pause"));
        this.f45519xef6e3074.m93853x4c58b7eb(5, 4, 2);
    }

    /* renamed from: play */
    public void m93608x348b34() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27));
        this.f45519xef6e3074.m93853x4c58b7eb(4, 5, 2, 6, 4);
        if (this.f45517x24364a28.m94415x1ffaddc3()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("lock is Waiting, event: play, doNotify"));
            this.f45517x24364a28.m94412xf35bbb4();
        }
    }

    /* renamed from: postRunnable */
    public void m93609xe2c2fdd(java.lang.Runnable runnable, int i17) {
        this.f45507xf703545d.postDelayed(runnable, i17);
    }

    /* renamed from: refreshTimeAndNotify */
    public void m93610x54f7fc98(int i17) {
        if (this.f45517x24364a28.m94415x1ffaddc3() && m93603xc00617a4()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("lock is Waiting, event: seek, doNotify"));
            this.f45517x24364a28.m94412xf35bbb4();
        }
    }

    /* renamed from: release */
    public void mo93611x41012807() {
        android.media.AudioTrack audioTrack = this.f45500x37ef5362;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
            }
            try {
                this.f45500x37ef5362.flush();
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th7);
            }
            try {
                this.f45500x37ef5362.release();
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th8);
            }
            try {
                m93574x7fe135a3();
            } catch (java.lang.Throwable th9) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[run] failed to destroyAudioListeners!", th9);
            }
            m93615x78226117(null);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("finally release audioTrack"));
        }
        if (this.f45503x4e03bbad.f45574x90ebc35) {
            return;
        }
        if (this.f45519xef6e3074.m93850x7aad142a(7)) {
            this.f45502x1ab9c7d2.mo93711x1fc3e459(this.f45503x4e03bbad);
        } else {
            this.f45502x1ab9c7d2.mo93717x2dd0bfac(this.f45503x4e03bbad);
        }
    }

    /* renamed from: releaseNotify */
    public void m93612xb33b4a30() {
        if (this.f45517x24364a28.m94415x1ffaddc3()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("lock is Waiting, event: release, doNotify"));
            this.f45517x24364a28.m94412xf35bbb4();
        }
    }

    /* renamed from: seek */
    public void mo93613x35ce78(int i17) {
    }

    /* renamed from: setAudioStreamType */
    public void mo93614x7389228e(int i17) {
        if (i17 == this.f45499x27fee723) {
            return;
        }
        this.f45499x27fee723 = i17;
    }

    /* renamed from: setAudioTrack */
    public void m93615x78226117(android.media.AudioTrack audioTrack) {
        this.f45500x37ef5362 = audioTrack;
        this.f45509xb9c978f2.mo93625x13a6b9c0(audioTrack);
    }

    /* renamed from: setLeastCommonMultiple */
    public void m93616x9425e422(int i17) {
        if (i17 >= 1) {
            this.f45514xd84d5637 = i17;
            return;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "wrong least common multiple: " + i17);
    }

    /* renamed from: setPerformanceTracer */
    public void m93617x9cf7e3db(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd c25401x58f18ffd) {
        this.f45524x6e2d501d = c25401x58f18ffd;
    }

    /* renamed from: setSpeed */
    public void m93618x53b4c105(float f17) {
        this.f45518x1447c2d = java.lang.Float.valueOf(f17);
    }

    /* renamed from: setVolume */
    public void m93619x27f73e1c(float f17, float f18) {
        android.media.AudioTrack audioTrack = this.f45500x37ef5362;
        if (audioTrack != null) {
            try {
                audioTrack.setStereoVolume(f17, f18);
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, be1.x0.f4239x24728b, e17);
            }
        }
    }

    /* renamed from: setVolumeForHuawei */
    public void m93620x4b1a154(float f17, float f18) {
        this.f45497x83161201 = f17;
        this.f45525xec5c9056 = f18;
        this.f45523x4fb71e26 = true;
    }

    /* renamed from: stop */
    public void m93621x360802() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("stop"));
        if (this.f45519xef6e3074.m93853x4c58b7eb(6, 4, 5, 2) && this.f45517x24364a28.m94415x1ffaddc3()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("lock is Waiting, event: stop, doNotify"));
            this.f45517x24364a28.m94412xf35bbb4();
        }
    }

    /* renamed from: callExceptionCallback */
    private void m93573x2ddea2f6(int i17, int i18, int i19) {
        this.f45502x1ab9c7d2.mo93712xf2dd026e(this.f45503x4e03bbad, i17, i18, i19);
    }

    /* renamed from: calculatePcmPlayTime */
    public long m93579xe6f2dbd5(float[] fArr, int i17, long j17) {
        if (i17 == 0 || j17 == 0) {
            return 0L;
        }
        return ((fArr.length * 1000.0f) / i17) / ((float) j17);
    }
}

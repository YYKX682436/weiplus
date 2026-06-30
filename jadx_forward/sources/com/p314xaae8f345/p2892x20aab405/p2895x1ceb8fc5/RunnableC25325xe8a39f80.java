package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.qqmusic.mediaplayer.CorePlayer */
/* loaded from: classes13.dex */
public class RunnableC25325xe8a39f80 implements java.lang.Runnable, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback {

    /* renamed from: PLAYER_ID_CREATOR */
    private static final java.util.concurrent.atomic.AtomicInteger f45565x8412d106 = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final java.lang.String TAG = "CorePlayer";

    /* renamed from: mAudioEffectList */
    final java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> f45566xd5770218;

    /* renamed from: mCallback */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 f45567x1ab9c7d2;

    /* renamed from: mDataSource */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f45568x280a54b2;

    /* renamed from: mDecoder */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813 f45569xfa085f17;

    /* renamed from: mEventHandler */
    private final android.os.Handler f45570xf703545d;

    /* renamed from: mExecutor */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639 f45571x9ec3a060;

    /* renamed from: mInformation */
    protected com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 f45572x1f63867f;

    /* renamed from: mIsExit */
    volatile boolean f45574x90ebc35;

    /* renamed from: mNativeDataSource */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 f45575x57ec6269;

    /* renamed from: mPcmCompnent */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 f45576x47c5c599;

    /* renamed from: mPlayPath */
    private java.lang.String f45577x94f75106;

    /* renamed from: mPlayerID */
    private int f45578x95011749;

    /* renamed from: mPlayerMode */
    private int f45579x591ae871;

    /* renamed from: mSpeedToSet */
    private java.lang.Float f45580x1447c2d;

    /* renamed from: mStateRunner */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25346x5c2e8560 f45581xef6e3074;

    /* renamed from: mTerminalAudioEffectList */
    final java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> f45583x498bdcfc;

    /* renamed from: mThreadName */
    private java.lang.String f45584x958de002;

    /* renamed from: performanceTracer */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd f45585x6e2d501d;

    /* renamed from: mTargetBitDepth */
    private int f45582xe84f3c34 = 2;

    /* renamed from: mIsAudioEffectParamPrepared */
    private boolean f45573x80ac8fba = false;

    public RunnableC25325xe8a39f80(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 interfaceC25441x92a45, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 interfaceC25340xe0077a66, android.os.Looper looper, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813 abstractC25371x4886c813, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639 interfaceC25347x8bacb639) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25346x5c2e8560 c25346x5c2e8560 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25346x5c2e8560(0);
        this.f45581xef6e3074 = c25346x5c2e8560;
        this.f45578x95011749 = f45565x8412d106.addAndGet(1);
        this.f45566xd5770218 = new java.util.concurrent.CopyOnWriteArrayList();
        this.f45583x498bdcfc = new java.util.concurrent.CopyOnWriteArrayList();
        this.f45580x1447c2d = null;
        this.f45584x958de002 = "Unnamed";
        this.f45579x591ae871 = 0;
        this.f45574x90ebc35 = false;
        this.f45585x6e2d501d = null;
        this.f45577x94f75106 = null;
        if (interfaceC25439x37e1318e != null && interfaceC25441x92a45 != null) {
            throw new java.lang.IllegalArgumentException("you can't set IDataSource and INativeDataSource at the same time!");
        }
        if (interfaceC25439x37e1318e == null && interfaceC25441x92a45 == null) {
            throw new java.lang.IllegalArgumentException("at least on data source is required!");
        }
        this.f45570xf703545d = new android.os.Handler(looper);
        this.f45569xfa085f17 = abstractC25371x4886c813;
        this.f45568x280a54b2 = interfaceC25439x37e1318e;
        this.f45575x57ec6269 = interfaceC25441x92a45;
        this.f45567x1ab9c7d2 = interfaceC25340xe0077a66;
        c25346x5c2e8560.m93852x4c58b7eb(1);
        this.f45571x9ec3a060 = interfaceC25347x8bacb639;
    }

    /* renamed from: axiliary */
    private java.lang.String m93724xe18dbff9(java.lang.String str) {
        return "ID: " + this.f45578x95011749 + ". " + str;
    }

    /* renamed from: callExceptionCallback */
    private void m93725x2ddea2f6(int i17, int i18) {
        m93726x2ddea2f6(i17, i18, 0);
    }

    /* renamed from: decodeEndOrFailed */
    private void m93727x821d6f2d(int i17, int i18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93724xe18dbff9("decodeEndOrFailed"));
        try {
            if (this.f45576x47c5c599 == null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93724xe18dbff9("mPcmCompnent null! Exiting"));
                return;
            }
            if (this.f45572x1f63867f != null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9(java.lang.String.format("current: %d, duration: %d, isExit: %b, decodeSucc: %b", java.lang.Long.valueOf(this.f45569xfa085f17.mo93988xfdac66b0()), java.lang.Long.valueOf(this.f45572x1f63867f.m93540x51e8b0a()), java.lang.Boolean.valueOf(this.f45574x90ebc35), java.lang.Boolean.valueOf(this.f45576x47c5c599.m93596x3fa0feb1()))));
                i17 &= this.f45569xfa085f17.mo93990x5470d4eb();
            }
            int i19 = 68;
            if (!this.f45574x90ebc35 && this.f45576x47c5c599.m93596x3fa0feb1()) {
                if (mo93623xa242feda() >= m93736x51e8b0a() - 5000) {
                    if (i18 == 92) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9("Decode ended! Exiting."));
                        this.f45581xef6e3074.m93852x4c58b7eb(7);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93724xe18dbff9("Decode failed! Exiting."));
                if (android.text.TextUtils.isEmpty(this.f45577x94f75106) || !m93729x96fb57c1(this.f45577x94f75106)) {
                    i19 = 67;
                }
                m93726x2ddea2f6(i18, i19, i17);
                this.f45581xef6e3074.m93852x4c58b7eb(6);
                return;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9("不留痕迹的退出 时机：解码时退出  step = 4"));
            m93728x15e35c3a();
            this.f45581xef6e3074.m93852x4c58b7eb(9);
            if (android.text.TextUtils.isEmpty(this.f45577x94f75106) || !m93729x96fb57c1(this.f45577x94f75106)) {
                i19 = 67;
            }
            m93726x2ddea2f6(i18, i19, i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
        }
    }

    /* renamed from: exitNotCallback */
    private void m93728x15e35c3a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9("exitNotCallback"));
        this.f45574x90ebc35 = true;
    }

    /* renamed from: isPathExternalStorage */
    private boolean m93729x96fb57c1(java.lang.String str) {
        return (str.contains("emulated/0") || str.contains("sdcard0")) ? false : true;
    }

    /* renamed from: addAudioListener */
    public void m93730xd94b1389(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1) {
        long j17;
        if (interfaceC25354x74ec3ce1.mo93762x8a4f39c6()) {
            if (!this.f45583x498bdcfc.contains(interfaceC25354x74ec3ce1)) {
                this.f45583x498bdcfc.add(interfaceC25354x74ec3ce1);
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[addAudioListener] terminal audio added: " + interfaceC25354x74ec3ce1);
            }
        } else if (!this.f45566xd5770218.contains(interfaceC25354x74ec3ce1)) {
            this.f45566xd5770218.add(interfaceC25354x74ec3ce1);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[addAudioListener] audio added: " + interfaceC25354x74ec3ce1);
        }
        if (!this.f45573x80ac8fba) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[addAudioListener] audio information not ready. init will be delayed.");
            return;
        }
        try {
            j17 = interfaceC25354x74ec3ce1.mo93765x3d057be3(this.f45582xe84f3c34, this.f45572x1f63867f, mo93734x4abe8653());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[addAudioListener] failed to init audio: " + interfaceC25354x74ec3ce1, th6);
            j17 = 0L;
        }
        if (j17 != 0) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[addAudioListener] failed to init audio %s, ret: %d", interfaceC25354x74ec3ce1, java.lang.Long.valueOf(j17));
        }
    }

    /* renamed from: changePlayThreadPriorityImmediately */
    public void m93731xbb55c7ac() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93724xe18dbff9("changePlayThreadPriorityImmediately"));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return;
        }
        abstractC25319xfa8eda74.m93581xbb55c7ac();
    }

    /* renamed from: createSeekTable */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 m93732xd979a29a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.AbstractC25371x4886c813 abstractC25371x4886c813 = this.f45569xfa085f17;
        if (abstractC25371x4886c813 != null) {
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25407xdbc379bf(abstractC25371x4886c813);
        }
        throw new java.lang.IllegalStateException("please setDataSource before creating seek table!");
    }

    /* renamed from: flush */
    public void m93733x5d03b04() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            abstractC25319xfa8eda74.mo93584x5d03b04();
        }
    }

    /* renamed from: getCurPosition */
    public long mo93734x4abe8653() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return 0L;
        }
        return abstractC25319xfa8eda74.mo93586x4abe8653();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback
    /* renamed from: getCurPositionByDecoder */
    public long mo93623xa242feda() {
        try {
            return this.f45569xfa085f17.mo93988xfdac66b0();
        } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25348x546f251f e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Strange Exception!", th6);
            return 0L;
        }
    }

    /* renamed from: getCurrentAudioInformation */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 m93735x7ad436d9() {
        return this.f45572x1f63867f;
    }

    /* renamed from: getDuration */
    public long m93736x51e8b0a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396 = this.f45572x1f63867f;
        if (c25316x94782396 == null) {
            return 0L;
        }
        try {
            return c25316x94782396.m93540x51e8b0a();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback
    /* renamed from: getMinPcmBufferSize */
    public long mo93624x6bb4d31f() {
        return this.f45569xfa085f17.mo93991x55bbc89d();
    }

    /* renamed from: getPlayerMode */
    public int m93737x6b29a81a() {
        return this.f45579x591ae871;
    }

    /* renamed from: getPlayerState */
    public int m93738xfa6224fa() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return 0;
        }
        return abstractC25319xfa8eda74.m93589xfa6224fa();
    }

    /* renamed from: getSessionId */
    public int m93739x23a7af9b() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            return abstractC25319xfa8eda74.m93590x23a7af9b();
        }
        return 0;
    }

    /* renamed from: getSpeed */
    public float m93740x7526a691() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            return abstractC25319xfa8eda74.m93591x7526a691();
        }
        java.lang.Float f17 = this.f45580x1447c2d;
        if (f17 != null) {
            return f17.floatValue();
        }
        return 1.0f;
    }

    /* renamed from: hasDecodeData */
    public synchronized boolean m93741xe104c4f2() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return false;
        }
        return abstractC25319xfa8eda74.m93595xe104c4f2();
    }

    /* renamed from: hasDecodeDataSuccess */
    public synchronized boolean m93742x3fa0feb1() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return false;
        }
        return abstractC25319xfa8eda74.m93596x3fa0feb1();
    }

    /* renamed from: isInit */
    public boolean m93743xb9a4415a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return false;
        }
        return abstractC25319xfa8eda74.m93601xb9a4415a();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback
    /* renamed from: onAudioTrackChanged */
    public void mo93625x13a6b9c0(android.media.AudioTrack audioTrack) {
        this.f45569xfa085f17.mo93998x78226117(audioTrack);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback
    /* renamed from: onPullDecodeDataEndOrFailed */
    public void mo93626xbe21b9bf(int i17, int i18) {
        m93727x821d6f2d(i17, i18);
    }

    /* renamed from: pause */
    public void m93744x65825f6(boolean z17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9("pause"));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return;
        }
        abstractC25319xfa8eda74.mo93607x65825f6(z17);
    }

    /* renamed from: play */
    public void m93745x348b34() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            return;
        }
        abstractC25319xfa8eda74.m93608x348b34();
    }

    /* renamed from: prepare */
    public void m93746xed060d07() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9("prepare"));
        this.f45581xef6e3074.m93852x4c58b7eb(3);
        this.f45571x9ec3a060.mo93697xb158f775(this, null);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback
    /* renamed from: pullDecodeData */
    public int mo93627x111586dd(int i17, byte[] bArr) {
        return this.f45569xfa085f17.mo93984xb7ec4eb8(i17, bArr);
    }

    /* renamed from: release */
    public void m93747x41012807() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9("release"));
        this.f45570xf703545d.removeCallbacksAndMessages(null);
        m93728x15e35c3a();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            abstractC25319xfa8eda74.m93612xb33b4a30();
        }
        this.f45581xef6e3074.m93852x4c58b7eb(8);
    }

    /* renamed from: removeAudioListener */
    public void m93748xde51bc86(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1) {
        if (this.f45566xd5770218.remove(interfaceC25354x74ec3ce1)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[removeAudioListener] audio removed: " + interfaceC25354x74ec3ce1);
        }
        if (this.f45583x498bdcfc.remove(interfaceC25354x74ec3ce1)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[removeAudioListener] terminal audio removed: " + interfaceC25354x74ec3ce1);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:2|3|(1:5)(2:163|(1:165)(1:166))|6|(2:8|(1:128)(1:12))(1:(14:130|(2:132|(1:160)(1:136))(1:161)|137|138|(1:140)(1:159)|141|142|143|144|(2:151|152)|146|(1:148)|149|150)(1:162))|(3:13|14|15)|(3:46|47|(21:51|(22:56|57|58|59|60|61|62|(1:64)|18|(1:20)|22|(1:24)(1:45)|25|26|27|28|(2:37|38)|30|(1:32)|33|34|35)|118|(1:120)|121|62|(0)|18|(0)|22|(0)(0)|25|26|27|28|(0)|30|(0)|33|34|35))|17|18|(0)|22|(0)(0)|25|26|27|28|(0)|30|(0)|33|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0260, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0261, code lost:
    
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(r1, m93724xe18dbff9("release throw a exception = " + r0.getMessage()), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x022d A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #4 {all -> 0x02ab, blocks: (B:61:0x01cc, B:62:0x0207, B:64:0x020b, B:18:0x0229, B:20:0x022d, B:118:0x01da, B:120:0x01e5, B:121:0x01e7), top: B:15:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b A[Catch: all -> 0x02ab, TryCatch #4 {all -> 0x02ab, blocks: (B:61:0x01cc, B:62:0x0207, B:64:0x020b, B:18:0x0229, B:20:0x022d, B:118:0x01da, B:120:0x01e5, B:121:0x01e7), top: B:15:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038e  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.run():void");
    }

    /* renamed from: seek */
    public void mo93749x35ce78(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            abstractC25319xfa8eda74.mo93613x35ce78(i17);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback
    /* renamed from: seekTo */
    public int mo93628xc9fc1b13(int i17) {
        return this.f45569xfa085f17.mo93997xc9fc1b13(i17);
    }

    /* renamed from: setAudioStreamType */
    public void m93750x7389228e(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            abstractC25319xfa8eda74.mo93614x7389228e(i17);
        }
    }

    /* renamed from: setLeastCommonMultiple */
    public void m93751x9425e422(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            abstractC25319xfa8eda74.m93616x9425e422(i17);
        }
    }

    /* renamed from: setPlayPath */
    public void m93752xe68c47fb(java.lang.String str) {
        this.f45577x94f75106 = str;
    }

    /* renamed from: setPlayerMode */
    public void m93753x994df626(int i17) {
        this.f45579x591ae871 = i17;
    }

    /* renamed from: setSpeed */
    public void m93754x53b4c105(float f17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            this.f45580x1447c2d = java.lang.Float.valueOf(f17);
        } else {
            abstractC25319xfa8eda74.m93618x53b4c105(f17);
        }
    }

    /* renamed from: setThreadName */
    public void m93755xd5c0edb7(java.lang.String str) {
        this.f45584x958de002 = str;
    }

    /* renamed from: setVolume */
    public void m93756x27f73e1c(float f17, float f18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            abstractC25319xfa8eda74.m93619x27f73e1c(f17, f18);
        }
    }

    /* renamed from: setVolumeForHuawei */
    public void m93757x4b1a154(float f17, float f18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 != null) {
            abstractC25319xfa8eda74.m93620x4b1a154(f17, f18);
        }
    }

    /* renamed from: stop */
    public void m93758x360802() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93724xe18dbff9("stop"));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 abstractC25319xfa8eda74 = this.f45576x47c5c599;
        if (abstractC25319xfa8eda74 == null) {
            m93728x15e35c3a();
        } else {
            abstractC25319xfa8eda74.m93621x360802();
        }
    }

    /* renamed from: callExceptionCallback */
    private void m93726x2ddea2f6(int i17, int i18, int i19) {
        this.f45567x1ab9c7d2.mo93712xf2dd026e(this, i17, i18, i19);
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.CorePlayer$AudioListenerDelegate */
    /* loaded from: classes13.dex */
    public class AudioListenerDelegate implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 {

        /* renamed from: mIsTerminal */
        private final boolean f45586x66813213;

        public AudioListenerDelegate(boolean z17) {
            this.f45586x66813213 = z17;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: getActualTime */
        public long mo93759xbf6cb171(long j17) {
            java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> it = m93760xb35b13ff().iterator();
            while (it.hasNext()) {
                j17 = it.next().mo93759xbf6cb171(j17);
            }
            return j17;
        }

        /* renamed from: getAudioListeners */
        public java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> m93760xb35b13ff() {
            return this.f45586x66813213 ? com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45583x498bdcfc : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45566xd5770218;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: isEnabled */
        public boolean mo93761x7d80d2b7() {
            java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> it = m93760xb35b13ff().iterator();
            while (it.hasNext()) {
                if (it.next().mo93761x7d80d2b7()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: isTerminal */
        public boolean mo93762x8a4f39c6() {
            return this.f45586x66813213;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: onPcm */
        public boolean mo93763x64f6a7b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, long j17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e3;
            boolean z17;
            boolean z18 = false;
            if (!this.f45586x66813213) {
                java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> list = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45566xd5770218;
                if (list.size() == 0) {
                    c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
                } else {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e4 = c25321xe86c292e;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e5 = c25321xe86c292e2;
                    for (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1 : list) {
                        if (interfaceC25354x74ec3ce1.mo93761x7d80d2b7()) {
                            try {
                                c25321xe86c292e5.m93671xbc8d7044(c25321xe86c292e4.f45534x719ec861);
                                z17 = interfaceC25354x74ec3ce1.mo93763x64f6a7b(c25321xe86c292e4, c25321xe86c292e5, j17);
                            } catch (java.lang.Throwable th6) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.TAG, "[onPcm] failed. audio: " + interfaceC25354x74ec3ce1 + " e: " + th6);
                                z17 = false;
                            }
                            if (z17) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e6 = c25321xe86c292e5;
                                c25321xe86c292e5 = c25321xe86c292e4;
                                c25321xe86c292e4 = c25321xe86c292e6;
                            } else {
                                c25321xe86c292e4.m93670xd4865683(c25321xe86c292e5);
                            }
                        } else {
                            c25321xe86c292e4.m93670xd4865683(c25321xe86c292e5);
                        }
                        int i17 = c25321xe86c292e5.f45534x719ec861;
                    }
                    if (c25321xe86c292e4 == c25321xe86c292e) {
                        c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
                    }
                }
            } else {
                java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> list2 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45583x498bdcfc;
                if (list2.size() == 0) {
                    c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
                } else {
                    int size = list2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce12 = list2.get(size);
                        if (interfaceC25354x74ec3ce12.mo93761x7d80d2b7()) {
                            try {
                                c25321xe86c292e2.m93671xbc8d7044(c25321xe86c292e.f45534x719ec861);
                                z18 = interfaceC25354x74ec3ce12.mo93763x64f6a7b(c25321xe86c292e, c25321xe86c292e2, j17);
                            } catch (java.lang.Throwable th7) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.TAG, "[onPcm] failed. audio: " + interfaceC25354x74ec3ce12 + " e: " + th7);
                            }
                            if (z18) {
                                c25321xe86c292e3 = c25321xe86c292e2;
                            } else {
                                c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
                            }
                        } else {
                            c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
                            size--;
                        }
                    }
                    c25321xe86c292e3 = c25321xe86c292e;
                    if (c25321xe86c292e3 == c25321xe86c292e) {
                        c25321xe86c292e.m93670xd4865683(c25321xe86c292e2);
                    }
                }
            }
            return true;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: onPlayerReady */
        public long mo93765x3d057be3(int i17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396, long j17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45582xe84f3c34 = i17;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45573x80ac8fba = true;
            java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> it = m93760xb35b13ff().iterator();
            while (it.hasNext()) {
                it.next().mo93765x3d057be3(i17, c25316x94782396, j17);
            }
            return 0L;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: onPlayerSeekComplete */
        public void mo93766xfdfcc191(long j17) {
            java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> it = m93760xb35b13ff().iterator();
            while (it.hasNext()) {
                it.next().mo93766xfdfcc191(j17);
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: onPlayerStopped */
        public void mo93767x60dfa40d() {
            java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> it = m93760xb35b13ff().iterator();
            while (it.hasNext()) {
                it.next().mo93767x60dfa40d();
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
        /* renamed from: onPcm */
        public boolean mo93764x64f6a7b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a2, long j17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a3;
            boolean z17;
            boolean z18 = false;
            if (!this.f45586x66813213) {
                java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> list = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45566xd5770218;
                if (list.size() == 0) {
                    c25328x90bcc06a.m93788x2eaf75(c25328x90bcc06a2);
                } else {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a4 = c25328x90bcc06a;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a5 = c25328x90bcc06a2;
                    for (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1 : list) {
                        if (interfaceC25354x74ec3ce1.mo93761x7d80d2b7()) {
                            try {
                                c25328x90bcc06a5.m93790xb77506d4(c25328x90bcc06a4.f45599x719ec861);
                                z17 = interfaceC25354x74ec3ce1.mo93764x64f6a7b(c25328x90bcc06a4, c25328x90bcc06a5, j17);
                            } catch (java.lang.Throwable th6) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.TAG, "[onPcm] failed. audio: " + interfaceC25354x74ec3ce1 + " e: " + th6);
                                z17 = false;
                            }
                            if (z17) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a6 = c25328x90bcc06a5;
                                c25328x90bcc06a5 = c25328x90bcc06a4;
                                c25328x90bcc06a4 = c25328x90bcc06a6;
                            } else {
                                c25328x90bcc06a4.m93788x2eaf75(c25328x90bcc06a5);
                            }
                        } else {
                            c25328x90bcc06a4.m93788x2eaf75(c25328x90bcc06a5);
                        }
                        int i17 = c25328x90bcc06a5.f45599x719ec861;
                    }
                    if (c25328x90bcc06a4 == c25328x90bcc06a) {
                        c25328x90bcc06a.m93788x2eaf75(c25328x90bcc06a2);
                    }
                }
            } else {
                java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1> list2 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.this.f45583x498bdcfc;
                if (list2.size() == 0) {
                    c25328x90bcc06a.m93788x2eaf75(c25328x90bcc06a2);
                } else {
                    int size = list2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce12 = list2.get(size);
                        if (interfaceC25354x74ec3ce12.mo93761x7d80d2b7()) {
                            try {
                                c25328x90bcc06a2.m93790xb77506d4(c25328x90bcc06a.f45599x719ec861);
                                z18 = interfaceC25354x74ec3ce12.mo93764x64f6a7b(c25328x90bcc06a, c25328x90bcc06a2, j17);
                            } catch (java.lang.Throwable th7) {
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80.TAG, "[onPcm] failed. audio: " + interfaceC25354x74ec3ce12 + " e: " + th7);
                            }
                            if (z18) {
                                c25328x90bcc06a3 = c25328x90bcc06a2;
                            } else {
                                c25328x90bcc06a.m93788x2eaf75(c25328x90bcc06a2);
                            }
                        } else {
                            c25328x90bcc06a.m93788x2eaf75(c25328x90bcc06a2);
                            size--;
                        }
                    }
                    c25328x90bcc06a3 = c25328x90bcc06a;
                    if (c25328x90bcc06a3 == c25328x90bcc06a) {
                        c25328x90bcc06a.m93788x2eaf75(c25328x90bcc06a2);
                    }
                }
            }
            return true;
        }
    }
}

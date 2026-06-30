package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent */
/* loaded from: classes16.dex */
class C25349xb19db3b7 extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74 {
    private static final java.lang.String TAG = "StaticDecodeDataComponent";

    /* renamed from: mAllBufferSize */
    private int f45711xb2915175;

    /* renamed from: mAllPcmBufferList */
    private java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e> f45712xa0f14be4;

    /* renamed from: mHasTerminal */
    private boolean f45713xef96089;

    /* renamed from: mIsfirstStarted */
    private boolean f45714x59ba47a8;

    public C25349xb19db3b7(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25346x5c2e8560 c25346x5c2e8560, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 interfaceC25340xe0077a66, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.HandleDecodeDataCallback handleDecodeDataCallback, android.os.Handler handler, int i17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce12) {
        super(runnableC25325xe8a39f80, c25346x5c2e8560, c25316x94782396, interfaceC25340xe0077a66, handleDecodeDataCallback, handler, i17, interfaceC25354x74ec3ce1, interfaceC25354x74ec3ce12);
        this.f45713xef96089 = false;
        this.f45501xca3cea81 = 8192;
    }

    /* renamed from: createAudioTrack */
    private boolean m93854xc88ccd31() {
        int i17;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("createAudioTrack"));
        if (this.f45513x1f63867f == null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("不留痕迹的退出 时机：获取Information时 step = 3"));
            this.f45519xef6e3074.m93852x4c58b7eb(9);
            m93580x2ddea2f6(91, 63);
            return false;
        }
        if (!this.f45519xef6e3074.m93850x7aad142a(3)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("mState is not preparing"));
            m93580x2ddea2f6(91, 54);
            return false;
        }
        if (this.f45513x1f63867f.m93542xf6c809a0() <= 0) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("mInformation.getSampleRate() failed"));
            m93580x2ddea2f6(91, 64);
            return false;
        }
        int m93539xd13e6146 = this.f45513x1f63867f.m93539xd13e6146();
        if (m93539xd13e6146 == 1) {
            i17 = 4;
        } else {
            int i18 = 12;
            if (m93539xd13e6146 != 2) {
                if (m93539xd13e6146 == 6) {
                    i18 = 252;
                } else if (m93539xd13e6146 == 8) {
                    i18 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c;
                }
            }
            i17 = i18;
        }
        this.f45521x48a8ccfc = this.f45513x1f63867f.m93542xf6c809a0();
        int m93537xbc5bbb2c = this.f45513x1f63867f.m93537xbc5bbb2c();
        while (this.f45521x48a8ccfc > m93587x8e4ec24b()) {
            this.f45521x48a8ccfc /= 2;
        }
        if (m93605x5b3b595d() && m93537xbc5bbb2c >= 3) {
            this.f45520xe84f3c34 = m93537xbc5bbb2c;
            this.f45496x44ff4577 = true;
            if (this.f45521x48a8ccfc != this.f45513x1f63867f.m93542xf6c809a0()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use float resampled pcm for Hi-Res, bitDept: " + m93537xbc5bbb2c + ", origin sample rate: " + this.f45513x1f63867f.m93542xf6c809a0() + ", target sample rate: " + this.f45521x48a8ccfc));
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use float pcm for Hi-Res, bitDept: " + m93537xbc5bbb2c + ", sample rate: " + this.f45521x48a8ccfc));
            }
        } else if (m93605x5b3b595d() || m93537xbc5bbb2c < 3) {
            this.f45520xe84f3c34 = m93537xbc5bbb2c;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use byte pcm resampled, bitDept: " + m93537xbc5bbb2c + ", origin sample rate: " + this.f45513x1f63867f.m93542xf6c809a0() + ", target sample rate: " + this.f45521x48a8ccfc));
        } else {
            this.f45520xe84f3c34 = 2;
            if (this.f45521x48a8ccfc != this.f45513x1f63867f.m93542xf6c809a0()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use byte pcm resampled and bitDept converted, origin bitDept: " + m93537xbc5bbb2c + ", target bitDept: " + this.f45520xe84f3c34 + ", origin sample rate: " + this.f45513x1f63867f.m93542xf6c809a0() + ", target sample rate: " + this.f45521x48a8ccfc));
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("will use byte pcm with bitDept converted, origin bitDept: " + m93537xbc5bbb2c + ", target bitDept: " + this.f45520xe84f3c34));
            }
        }
        int i19 = m93537xbc5bbb2c == 1 ? 3 : (m93537xbc5bbb2c != 2 && this.f45496x44ff4577) ? 4 : 2;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9(java.lang.String.format("mTargetPlaySample: %d, playChannel: %d", java.lang.Long.valueOf(this.f45521x48a8ccfc), java.lang.Integer.valueOf(m93539xd13e6146))));
        try {
            m93615x78226117(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.m93576xa200ca01(this.f45499x27fee723, (int) this.f45521x48a8ccfc, i17, i19, this.f45711xb2915175, 0));
            if (this.f45518x1447c2d != null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("setSpeed:" + this.f45518x1447c2d));
                android.media.PlaybackParams playbackParams = this.f45500x37ef5362.getPlaybackParams();
                playbackParams.setSpeed(this.f45518x1447c2d.floatValue());
                this.f45518x1447c2d = null;
                this.f45500x37ef5362.setPlaybackParams(playbackParams);
            }
            if (this.f45500x37ef5362.getState() == 2) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("new AudioTrack succeed"));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
        }
        android.media.AudioTrack audioTrack = this.f45500x37ef5362;
        if (audioTrack != null && audioTrack.getState() == 2) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, m93577xe18dbff9("create audioTrack success"));
            return true;
        }
        this.f45504x5717d3fc = true;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("create audioTrack fail mCreateAudioTrackFail = true"));
        m93615x78226117(null);
        this.f45519xef6e3074.m93852x4c58b7eb(9);
        m93580x2ddea2f6(91, 66);
        return false;
    }

    /* renamed from: decodeAllData */
    private boolean m93855xc7f2c31d() {
        this.f45712xa0f14be4 = new java.util.ArrayList();
        while (true) {
            if (this.f45503x4e03bbad.f45574x90ebc35) {
                break;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e();
            c25321xe86c292e.m93671xbc8d7044(this.f45501xca3cea81);
            try {
                int mo93627x111586dd = this.f45509xb9c978f2.mo93627x111586dd(this.f45501xca3cea81, c25321xe86c292e.f45535x93fb68);
                this.f45510x500a7f3b = true;
                if (mo93627x111586dd > 0) {
                    c25321xe86c292e.f45534x719ec861 = mo93627x111586dd;
                    this.f45712xa0f14be4.add(c25321xe86c292e);
                    if (!this.f45511xacbd048) {
                        this.f45511xacbd048 = true;
                    }
                } else {
                    if (mo93627x111586dd != 0) {
                        this.f45509xb9c978f2.mo93626xbe21b9bf(mo93627x111586dd, 91);
                        return false;
                    }
                    c25321xe86c292e.f45534x719ec861 = this.f45501xca3cea81;
                    this.f45712xa0f14be4.add(c25321xe86c292e);
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "static decode end");
                }
            } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25348x546f251f e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
                this.f45519xef6e3074.m93852x4c58b7eb(9);
                m93580x2ddea2f6(91, 62);
                return false;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
                this.f45519xef6e3074.m93852x4c58b7eb(9);
                m93580x2ddea2f6(91, 67);
                return false;
            }
        }
        if (!this.f45712xa0f14be4.isEmpty()) {
            java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e> it = this.f45712xa0f14be4.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i17 += it.next().f45534x719ec861;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "static totalBufferSize = " + i17);
            this.f45506x22437429.m93671xbc8d7044(i17);
            int i18 = 0;
            for (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2 : this.f45712xa0f14be4) {
                java.lang.System.arraycopy(c25321xe86c292e2.f45535x93fb68, 0, this.f45506x22437429.f45535x93fb68, i18, c25321xe86c292e2.f45534x719ec861);
                int i19 = c25321xe86c292e2.f45534x719ec861;
                i18 += i19;
                this.f45506x22437429.f45534x719ec861 += i19;
                this.f45711xb2915175 += c25321xe86c292e2.f45534x719ec861;
            }
        }
        return true;
    }

    /* renamed from: playAudioTrack */
    private void m93856x8d465169() {
        this.f45500x37ef5362.reloadStaticData();
        while (!this.f45503x4e03bbad.f45574x90ebc35) {
            if (m93602xecd98af8()) {
                if (this.f45500x37ef5362.getPlayState() != 2) {
                    this.f45500x37ef5362.pause();
                }
                m93609xe2c2fdd(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7 c25349xb19db3b7 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7.this;
                        c25349xb19db3b7.f45502x1ab9c7d2.mo93713xeaceb36f(c25349xb19db3b7.f45503x4e03bbad);
                    }
                }, 20);
                m93583x76bc1697();
            } else {
                if (m93600xb9a41c1e()) {
                    return;
                }
                if (m93599x7aad7efe()) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "static play error");
                    return;
                }
                if (m93604x6d20d943()) {
                    if (this.f45500x37ef5362.getPlayState() != 1) {
                        this.f45500x37ef5362.stop();
                    }
                    m93609xe2c2fdd(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.4
                        @Override // java.lang.Runnable
                        public void run() {
                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7 c25349xb19db3b7 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7.this;
                            c25349xb19db3b7.f45502x1ab9c7d2.mo93717x2dd0bfac(c25349xb19db3b7.f45503x4e03bbad);
                        }
                    }, 20);
                    return;
                } else {
                    if (m93598xf29e3841()) {
                        this.f45503x4e03bbad.f45574x90ebc35 = true;
                        return;
                    }
                    if (m93603xc00617a4()) {
                        if (this.f45500x37ef5362.getPlayState() == 2) {
                            this.f45500x37ef5362.play();
                        } else if (this.f45500x37ef5362.getPlayState() == 1) {
                            if (!this.f45714x59ba47a8) {
                                this.f45714x59ba47a8 = true;
                                this.f45500x37ef5362.play();
                                this.f45502x1ab9c7d2.mo93716x2d0c6e60(this.f45503x4e03bbad);
                            }
                        } else if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2916x6a710b1.C25464x82aa44d8.m94420x5e709fd4(this.f45500x37ef5362) * this.f45513x1f63867f.m93539xd13e6146() * this.f45520xe84f3c34 >= this.f45711xb2915175) {
                            this.f45519xef6e3074.m93852x4c58b7eb(7);
                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "static play completed");
                            m93609xe2c2fdd(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7 c25349xb19db3b7 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7.this;
                                    c25349xb19db3b7.f45502x1ab9c7d2.mo93711x1fc3e459(c25349xb19db3b7.f45503x4e03bbad);
                                }
                            }, 20);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: writeAudioTrack */
    private boolean m93857x3ac88454() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e();
        if (this.f45506x22437429.f45535x93fb68 != null && this.f45500x37ef5362 != null) {
            if (this.f45520xe84f3c34 != this.f45513x1f63867f.m93537xbc5bbb2c()) {
                m93593xdabfc3c0(this.f45506x22437429, c25321xe86c292e);
                this.f45506x22437429.m93670xd4865683(c25321xe86c292e);
            }
            if (this.f45521x48a8ccfc != this.f45513x1f63867f.m93542xf6c809a0()) {
                m93594x4613b634(this.f45506x22437429, c25321xe86c292e);
                this.f45506x22437429.m93670xd4865683(c25321xe86c292e);
            }
            if (this.f45496x44ff4577) {
                m93582x5a04cf58(this.f45506x22437429, this.f45508x9bd8385d);
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1 = this.f45498x5fa7c92e;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a = this.f45508x9bd8385d;
                interfaceC25354x74ec3ce1.mo93764x64f6a7b(c25328x90bcc06a, c25328x90bcc06a, this.f45503x4e03bbad.mo93623xa242feda());
            } else {
                this.f45498x5fa7c92e.mo93763x64f6a7b(this.f45506x22437429, c25321xe86c292e, this.f45503x4e03bbad.mo93623xa242feda());
                this.f45506x22437429.m93670xd4865683(c25321xe86c292e);
            }
            this.f45713xef96089 = false;
            if (this.f45522xb64c9212.mo93761x7d80d2b7()) {
                if (this.f45496x44ff4577) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce12 = this.f45522xb64c9212;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a2 = this.f45508x9bd8385d;
                    interfaceC25354x74ec3ce12.mo93764x64f6a7b(c25328x90bcc06a2, c25328x90bcc06a2, this.f45503x4e03bbad.mo93623xa242feda());
                } else {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce13 = this.f45522xb64c9212;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2 = this.f45506x22437429;
                    interfaceC25354x74ec3ce13.mo93763x64f6a7b(c25321xe86c292e2, c25321xe86c292e2, this.f45503x4e03bbad.mo93623xa242feda());
                }
                this.f45713xef96089 = true;
            }
            if (!this.f45713xef96089) {
                if (this.f45496x44ff4577) {
                    android.media.AudioTrack audioTrack = this.f45500x37ef5362;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a3 = this.f45508x9bd8385d;
                    int write = audioTrack.write(c25328x90bcc06a3.f45600x77ac6dbc, 0, c25328x90bcc06a3.f45599x719ec861, 0);
                    if (write < 0) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("mAudioTrack write float failed: " + write + ", expect: " + this.f45508x9bd8385d.f45599x719ec861));
                        this.f45519xef6e3074.m93852x4c58b7eb(9);
                        m93580x2ddea2f6(91, 102);
                        return false;
                    }
                    if (write != this.f45508x9bd8385d.f45599x719ec861) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, m93577xe18dbff9("mAudioTrack write float not equal: " + write + ", expect: " + this.f45508x9bd8385d.f45599x719ec861));
                    }
                    int i17 = this.f45508x9bd8385d.f45599x719ec861;
                } else {
                    android.media.AudioTrack audioTrack2 = this.f45500x37ef5362;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e3 = this.f45506x22437429;
                    int write2 = audioTrack2.write(c25321xe86c292e3.f45535x93fb68, 0, c25321xe86c292e3.f45534x719ec861);
                    if (write2 < 0) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("mAudioTrack write bytes failed: " + write2 + ", expect: " + this.f45506x22437429.f45534x719ec861));
                        this.f45519xef6e3074.m93852x4c58b7eb(9);
                        m93580x2ddea2f6(91, 102);
                        return false;
                    }
                    if (write2 != this.f45506x22437429.f45534x719ec861) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, m93577xe18dbff9("mAudioTrack write bytes not equal: " + write2 + ", expect: " + this.f45506x22437429.f45534x719ec861));
                    }
                    int i18 = this.f45506x22437429.f45534x719ec861;
                }
                return true;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "mTerminalAudioEffectList has blocked");
        }
        return false;
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
        long m93575xf98d554 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74.m93575xf98d554(0L, audioTrack);
        this.f45505x1af550dc = m93575xf98d554;
        return m93575xf98d554;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25319xfa8eda74
    /* renamed from: handleDecodeData */
    public void mo93592x13cb0700() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396 = this.f45513x1f63867f;
        if (c25316x94782396 == null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, m93577xe18dbff9("不留痕迹的退出 时机：获取Information时 step = 3"));
            this.f45519xef6e3074.m93852x4c58b7eb(9);
            m93580x2ddea2f6(91, 63);
            return;
        }
        try {
        } catch (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25348x546f251f e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
        if (0 >= c25316x94782396.m93542xf6c809a0()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "failed to getSampleRate");
            this.f45519xef6e3074.m93852x4c58b7eb(9);
            m93580x2ddea2f6(91, 63);
            return;
        }
        if (this.f45513x1f63867f.m93539xd13e6146() <= 0) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "failed to getChannels");
            this.f45519xef6e3074.m93852x4c58b7eb(9);
            m93580x2ddea2f6(91, 63);
            return;
        }
        this.f45512xc79e419d = true;
        if (!m93855xc7f2c31d()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "failed to decodeAllData");
            this.f45519xef6e3074.m93852x4c58b7eb(9);
            return;
        }
        if (!m93854xc88ccd31()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "failed to createAudioTrack");
            this.f45519xef6e3074.m93852x4c58b7eb(9);
            return;
        }
        m93597xe1d5c39(this.f45520xe84f3c34, this.f45513x1f63867f, mo93586x4abe8653());
        if (!m93857x3ac88454() && !this.f45713xef96089) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "failed to writeAudioTrack");
            this.f45519xef6e3074.m93852x4c58b7eb(9);
            return;
        }
        if (this.f45713xef96089) {
            this.f45519xef6e3074.m93852x4c58b7eb(7);
            return;
        }
        if (!this.f45519xef6e3074.m93853x4c58b7eb(2, 3)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "failed to transfer to PREPARED because cur State is NOT PREPARING!!");
            return;
        }
        this.f45714x59ba47a8 = false;
        m93609xe2c2fdd(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7.this.m93589xfa6224fa() == 8) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7.TAG, "[run] state changed to END during postRunnable!");
                } else {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7 c25349xb19db3b7 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7.this;
                    c25349xb19db3b7.f45502x1ab9c7d2.mo93714xd9c0223e(c25349xb19db3b7.f45503x4e03bbad);
                }
            }
        }, 0);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("prepared. waiting..."));
        this.f45517x24364a28.m94414xb0e9d4a0(20L, 100, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e.WaitListener() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.2
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e.WaitListener
            /* renamed from: keepWaiting */
            public boolean mo93622x33d5f308() {
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25349xb19db3b7.this.m93589xfa6224fa() == 2;
            }
        });
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93577xe18dbff9("woke after preparing"));
        m93856x8d465169();
    }
}

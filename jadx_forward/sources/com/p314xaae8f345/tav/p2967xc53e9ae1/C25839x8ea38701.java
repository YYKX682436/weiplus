package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.Player */
/* loaded from: classes16.dex */
public class C25839x8ea38701 implements com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a, android.os.Handler.Callback {

    /* renamed from: DEFAULT_MAX_CACHE_SIZE */
    private static final int f48595xc7bc0677 = 60;
    public static final java.lang.String TAG = "PlayerThreadMain";

    /* renamed from: TYPE_PROGRESS */
    public static final int f48596x4763dd92 = 2;

    /* renamed from: TYPE_STATES */
    public static final int f48597x517782a7 = 1;

    /* renamed from: TYPE_VIEWPORT_UPDATE */
    public static final int f48598x956e837d = 3;

    /* renamed from: time */
    public static java.lang.String f48599x3652cd = "time";

    /* renamed from: actionAtItemEnd */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701.AVPlayerActionAtItemEnd f48600xbf9f937f;

    /* renamed from: asset */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f48601x58ceaf0;

    /* renamed from: bgColor */
    private int f48602xf3ca161e;

    /* renamed from: currentItem */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 f48603x23d1482c;

    /* renamed from: errMsg */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25833x57112479 f48604xb2d4efdc;

    /* renamed from: loop */
    private boolean f48605x32c6a4;

    /* renamed from: mAudioFocuser */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10 f48606xfd6c3dc;

    /* renamed from: mHasPostedSeek */
    private boolean f48607x2700724;

    /* renamed from: mLastSeekTargetTimeUs */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48608x3706e097;

    /* renamed from: mMainHandler */
    android.os.Handler f48609x9e97c8a4;

    /* renamed from: mPlayRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48610xa0ee87c;

    /* renamed from: mPlayThread */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b f48611x3b9c46ab;

    /* renamed from: mPlayerListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener f48612x7cf45c82;

    /* renamed from: mPlayerStatus */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus f48613x88850340;

    /* renamed from: mPosition */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48614x519040b6;

    /* renamed from: mSeekTargetTimeUs */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48615xa61e0461;

    /* renamed from: muted */
    private boolean f48616x636f16b;

    /* renamed from: onCompositionUpdateListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 f48617xae0f87c8;

    /* renamed from: playerLayer */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 f48618x2020eef0;

    /* renamed from: rate */
    private float f48619x354ce0;

    /* renamed from: released */
    private volatile boolean f48620xdf23d93d;

    /* renamed from: status */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701.PlayerStatus f48621xcacdcff2;

    /* renamed from: viewportUpdateListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25838x6abdcfc2 f48622x95aa32e3;

    /* renamed from: volume */
    private float f48623xcfaae71a;

    /* renamed from: com.tencent.tav.player.Player$AVPlayerActionAtItemEnd */
    /* loaded from: classes3.dex */
    public enum AVPlayerActionAtItemEnd {
        AVPlayerActionAtItemEndAdvance,
        AVPlayerActionAtItemEndPause,
        AVPlayerActionAtItemEndNone
    }

    /* renamed from: com.tencent.tav.player.Player$PlayerStatus */
    /* loaded from: classes3.dex */
    public enum PlayerStatus {
        PlayerStatusUnknown,
        PlayerStatusReadyToPlay,
        PlayerStatusFailed
    }

    public C25839x8ea38701(java.lang.String str) {
        this(new com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4(str));
    }

    /* renamed from: checkAndReady */
    private synchronized void m98062x5683bf34() {
        if (this.f48613x88850340 == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.IDLE) {
            this.f48611x3b9c46ab.m98241x2936bf5f(1, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
        }
    }

    /* renamed from: bindLayer */
    public void m98063xc77cdf14(com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0 c25845x838a96d0) {
        this.f48618x2020eef0 = c25845x838a96d0;
        this.f48603x23d1482c.m98104xc77cdf14(c25845x838a96d0);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: currentStatus */
    public synchronized com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus mo98030x85aebacb() {
        return this.f48613x88850340;
    }

    /* renamed from: currentTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98064x23d61fe6() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48611x3b9c46ab;
        return c25849xfbce7c6b == null ? com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f : c25849xfbce7c6b.m98234xa86cd69f();
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: duration */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98031x89444d94() {
        com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0;
        abstractC25633x3c9fad0 = this.f48601x58ceaf0;
        return abstractC25633x3c9fad0 == null ? com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f : abstractC25633x3c9fad0.m96116x51e8b0a();
    }

    /* renamed from: enAbleAudioFocus */
    public void m98065x1141c4a5(android.content.Context context, boolean z17) {
        if (z17) {
            if (this.f48606xfd6c3dc == null) {
                this.f48606xfd6c3dc = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10(context, this);
            }
        } else {
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10 c25830x7284fd10 = this.f48606xfd6c3dc;
            if (c25830x7284fd10 != null) {
                c25830x7284fd10.m98015x41012807();
            }
        }
    }

    /* renamed from: getBgColor */
    public int m98066x319751e8() {
        return this.f48602xf3ca161e;
    }

    /* renamed from: getCurrentItem */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 m98067xfda78ef6() {
        return this.f48603x23d1482c;
    }

    /* renamed from: getErrMsg */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25833x57112479 m98068x17ec12d2() {
        return this.f48604xb2d4efdc;
    }

    /* renamed from: getGlViewport */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m98069xfda6ca1() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48611x3b9c46ab;
        if (c25849xfbce7c6b == null) {
            return null;
        }
        return c25849xfbce7c6b.m98232x8dc80225();
    }

    /* renamed from: getRate */
    public float m98070xfb84b556() {
        return this.f48619x354ce0;
    }

    /* renamed from: getRenderContextParams */
    public com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m98071x6eb76ae9() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48611x3b9c46ab;
        if (c25849xfbce7c6b != null) {
            return c25849xfbce7c6b.m98235x6eb76ae9();
        }
        return null;
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701.PlayerStatus m98072x2fe4f2e8() {
        return this.f48621xcacdcff2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (this.f48620xdf23d93d) {
            return false;
        }
        int i17 = message.what;
        if (i17 == 1) {
            com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus = this.f48613x88850340;
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25848xe3baec2e c25848xe3baec2e = (com.p314xaae8f345.tav.p2967xc53e9ae1.C25848xe3baec2e) message.obj;
            com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus m98183x51e27ca9 = c25848xe3baec2e.m98183x51e27ca9();
            this.f48613x88850340 = m98183x51e27ca9;
            if (playerStatus == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.PLAYING && ((m98183x51e27ca9 == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.FINISHED || m98183x51e27ca9 == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.ERROR) && this.f48605x32c6a4)) {
                synchronized (this) {
                    if (!this.f48611x3b9c46ab.m98236xb20ec40d(3) && !this.f48611x3b9c46ab.m98236xb20ec40d(6) && !this.f48611x3b9c46ab.m98236xb20ec40d(4) && !this.f48611x3b9c46ab.m98236xb20ec40d(11) && !this.f48609x9e97c8a4.hasMessages(1)) {
                        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f48610xa0ee87c;
                        if (c25738xead39d26 == null || c25738xead39d26.m97256x51e8b0a().m97233x754a37bb() <= 0) {
                            m98078xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
                        } else {
                            m98078xe9aa2080(this.f48610xa0ee87c.m97260x75286aac());
                        }
                        com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener playerListener = this.f48612x7cf45c82;
                        if (playerListener != null) {
                            playerListener.mo98052xed0a9ac3(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.REPLAY);
                        }
                        mo98034x348b34();
                    }
                }
            } else {
                com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener playerListener2 = this.f48612x7cf45c82;
                if (playerListener2 != null) {
                    playerListener2.mo98052xed0a9ac3(m98183x51e27ca9);
                }
                if (this.f48613x88850340 == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.ERROR) {
                    this.f48604xb2d4efdc = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25833x57112479(-1, c25848xe3baec2e.m98182xcf10fdcf());
                }
            }
        } else if (i17 == 2) {
            this.f48614x519040b6 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) message.obj;
            if (this.f48612x7cf45c82 != null && !this.f48609x9e97c8a4.hasMessages(2)) {
                this.f48612x7cf45c82.mo98051x5c3ac16c(this.f48614x519040b6);
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262 = this.f48610xa0ee87c;
            if (c25738xead39d262 != null && !this.f48614x519040b6.m97238x9f3f7b48(c25738xead39d262.m97258xb58839a5()) && mo98032xc00617a4()) {
                if (this.f48605x32c6a4) {
                    com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener playerListener3 = this.f48612x7cf45c82;
                    if (playerListener3 != null) {
                        playerListener3.mo98052xed0a9ac3(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.REPLAY);
                    }
                    m98078xe9aa2080(this.f48610xa0ee87c.m97260x75286aac());
                } else {
                    mo98033x65825f6();
                }
            }
        } else {
            if (i17 != 3) {
                return false;
            }
            com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25838x6abdcfc2 interfaceC25838x6abdcfc2 = this.f48622x95aa32e3;
            if (interfaceC25838x6abdcfc2 != null) {
                java.lang.Object obj = message.obj;
                if (obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468) {
                    interfaceC25838x6abdcfc2.m98060x59f730ce(((com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468) obj).m97172x5a5dd5d());
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: isPlaying */
    public synchronized boolean mo98032xc00617a4() {
        return this.f48613x88850340 == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.PLAYING;
    }

    /* renamed from: isReleased */
    public synchronized boolean m98073xafdb8087() {
        return this.f48620xdf23d93d;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: pause */
    public synchronized void mo98033x65825f6() {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98238x81dc8e3();
        this.f48611x3b9c46ab.m98231xc71fbb4d(false);
        this.f48611x3b9c46ab.m98241x2936bf5f(3, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: play */
    public synchronized void mo98034x348b34() {
        if (this.f48620xdf23d93d) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = this.f48610xa0ee87c;
        if (c25738xead39d26 != null && !c25738xead39d26.m97253x805f158c(m98064x23d61fe6())) {
            m98078xe9aa2080(this.f48610xa0ee87c.m97260x75286aac());
        }
        this.f48611x3b9c46ab.m98241x2936bf5f(2, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10 c25830x7284fd10 = this.f48606xfd6c3dc;
        if (c25830x7284fd10 != null) {
            c25830x7284fd10.m98016x4c4bb389();
        }
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: position */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98035x2c929929() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b;
        c25849xfbce7c6b = this.f48611x3b9c46ab;
        return c25849xfbce7c6b == null ? com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f : c25849xfbce7c6b.m98234xa86cd69f();
    }

    /* renamed from: prepare */
    public void m98074xed060d07(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25847xebc16d9a interfaceC25847xebc16d9a) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus = com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.IDLE;
    }

    /* renamed from: readSnapShootBitmap */
    public void m98075x4cea38e(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25837x38d52694 interfaceC25837x38d52694) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48611x3b9c46ab;
        if (c25849xfbce7c6b == null) {
            return;
        }
        c25849xfbce7c6b.m98239x2936bf5f(24, interfaceC25837x38d52694, "readSnapShootBitmap");
    }

    /* renamed from: refreshSurface */
    public void m98076x31091552(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465) {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98239x2936bf5f(26, interfaceC25832xf9968465, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: release */
    public synchronized void mo98036x41012807() {
        mo98037x41012807(null);
    }

    /* renamed from: replaceCurrentItemWithPlayerItem */
    public void m98077x89bbb5f2(com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4) {
        mo98045xce0038c9(c25841xf3b90db4, mo98035x2c929929());
    }

    /* renamed from: seekToTime */
    public void m98078xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        mo98038xe9aa2080(c25736x76b98a57, null);
    }

    /* renamed from: setBgColor */
    public void m98081xa5089f5c(int i17) {
        this.f48602xf3ca161e = i17;
    }

    /* renamed from: setGetTavExtraListener */
    public void m98082x53b49b6f(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25836x62b1a6b2 interfaceC25836x62b1a6b2) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48611x3b9c46ab;
        if (c25849xfbce7c6b != null) {
            c25849xfbce7c6b.m98239x2936bf5f(25, interfaceC25836x62b1a6b2, "setGetTavExtraListener");
        }
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: setLoop */
    public synchronized void mo98039x764cf626(boolean z17) {
        this.f48605x32c6a4 = z17;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: setOnCompositionUpdateListener */
    public void mo98040x3cbb0606(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 interfaceC25835x83ed6fa8) {
        this.f48617xae0f87c8 = interfaceC25835x83ed6fa8;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: setPlayRange */
    public synchronized void mo98041xeb18d027(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f48610xa0ee87c = c25738xead39d26;
        if (c25738xead39d26 != null && !c25738xead39d26.m97253x805f158c(m98064x23d61fe6()) && mo98032xc00617a4()) {
            m98078xe9aa2080(c25738xead39d26.m97260x75286aac());
        }
        this.f48611x3b9c46ab.m98245xeb18d027(c25738xead39d26);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: setPlayerListener */
    public void mo98042x2ccf87b7(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener playerListener) {
        this.f48612x7cf45c82 = playerListener;
    }

    /* renamed from: setRate */
    public void m98083x764f7c62(float f17) {
        m98084x764f7c62(f17, 60);
    }

    /* renamed from: setRateAtTimeAndHostTime */
    public void m98085x54c758a(float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
    }

    /* renamed from: setRenderContextParams */
    public void m98086xbcfc2a5d(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25849xfbce7c6b c25849xfbce7c6b = this.f48611x3b9c46ab;
        if (c25849xfbce7c6b != null) {
            c25849xfbce7c6b.m98247xbcfc2a5d(c25780x613b55ff);
        }
    }

    /* renamed from: setViewportUpdateListener */
    public void m98087x31bc45e5(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25838x6abdcfc2 interfaceC25838x6abdcfc2) {
        this.f48622x95aa32e3 = interfaceC25838x6abdcfc2;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: setVolume */
    public synchronized void mo98043x27f73e1c(float f17) {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98239x2936bf5f(7, java.lang.Float.valueOf(f17), com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: stop */
    public synchronized void mo98044x360802() {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98239x2936bf5f(4, java.lang.Boolean.TRUE, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: update */
    public synchronized void mo98045xce0038c9(com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48603x23d1482c = c25841xf3b90db4;
        this.f48601x58ceaf0 = c25841xf3b90db4.m98107x742a913a();
        this.f48603x23d1482c.m98151x81f206d0();
        this.f48609x9e97c8a4.removeMessages(2);
        this.f48611x3b9c46ab.m98237x843bf739();
        this.f48611x3b9c46ab.m98248x12b50238(c25736x76b98a57);
        this.f48611x3b9c46ab.m98238x81dc8e3();
        this.f48611x3b9c46ab.m98231xc71fbb4d(false);
        this.f48611x3b9c46ab.m98239x2936bf5f(11, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25852xc31b13c6(c25841xf3b90db4, this.f48617xae0f87c8), "update clips");
        this.f48608x3706e097 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
    }

    /* renamed from: updateAllProperties */
    public synchronized void m98089xab8f536b() {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98241x2936bf5f(20, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: updateAudioClipsProperties */
    public synchronized void mo98046xc57a4469() {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98241x2936bf5f(22, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: updateAudioVolumeProperties */
    public synchronized void mo98047x1ebeca9a() {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98241x2936bf5f(23, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    /* renamed from: updateProperties */
    public synchronized void m98090x7c49fadc() {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98241x2936bf5f(10, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    /* renamed from: updateViewport */
    public void m98091x7b31bc8f(int i17, int i18) {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48611x3b9c46ab.m98239x2936bf5f(21, new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(i17, i18), com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: videoHeight */
    public int mo98048x2a8d0982() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4 = this.f48603x23d1482c;
        if (c25841xf3b90db4 == null) {
            return 0;
        }
        return (int) c25841xf3b90db4.m98121x7619db1().f47832xb7389127;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: videoWidth */
    public int mo98049x9f1bbe0b() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4 = this.f48603x23d1482c;
        if (c25841xf3b90db4 == null) {
            return 0;
        }
        return (int) c25841xf3b90db4.m98121x7619db1().f47833x6be2dc6;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: waitForRelease */
    public synchronized void mo98050xf97cce53(long j17) {
    }

    public C25839x8ea38701(com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4) {
        this.f48613x88850340 = com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.IDLE;
        this.f48605x32c6a4 = false;
        this.f48620xdf23d93d = false;
        this.f48602xf3ca161e = -16777216;
        this.f48603x23d1482c = c25841xf3b90db4;
        this.f48609x9e97c8a4 = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        this.f48601x58ceaf0 = this.f48603x23d1482c.m98107x742a913a();
        this.f48603x23d1482c.m98149x68ac462(this);
        this.f48611x3b9c46ab = this.f48603x23d1482c.m98120x184cec1a();
    }

    /* renamed from: seekToTime */
    public void m98079xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573) {
        m98080xe9aa2080(c25736x76b98a57, c25736x76b98a572, c25736x76b98a573, null);
    }

    /* renamed from: setRate */
    public void m98084x764f7c62(float f17, int i17) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus = this.f48613x88850340;
        if (playerStatus == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.PLAYING || playerStatus == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.PAUSED) {
            return;
        }
        this.f48619x354ce0 = f17;
        this.f48603x23d1482c.m98143x764f7c62(f17, i17);
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: release */
    public synchronized void mo98037x41012807(java.lang.Runnable runnable) {
        if (!this.f48620xdf23d93d) {
            this.f48620xdf23d93d = true;
            this.f48609x9e97c8a4.removeCallbacksAndMessages(null);
            this.f48609x9e97c8a4 = null;
            this.f48611x3b9c46ab.m98241x2936bf5f(4, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
            this.f48611x3b9c46ab.m98239x2936bf5f(6, runnable, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
            this.f48611x3b9c46ab = null;
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10 c25830x7284fd10 = this.f48606xfd6c3dc;
            if (c25830x7284fd10 != null) {
                c25830x7284fd10.m98015x41012807();
            }
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4 = this.f48603x23d1482c;
            if (c25841xf3b90db4 != null) {
                c25841xf3b90db4.m98132x41012807();
            }
            this.f48603x23d1482c = null;
        }
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a
    /* renamed from: seekToTime */
    public void mo98038xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        m98080xe9aa2080(c25736x76b98a57, c25736x76b98a572, c25736x76b98a572, interfaceC25832xf9968465);
    }

    /* renamed from: seekToTime */
    public void m98080xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573, com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 interfaceC25832xf9968465) {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48615xa61e0461 = c25736x76b98a57;
        this.f48608x3706e097 = c25736x76b98a57;
        this.f48611x3b9c46ab.m98248x12b50238(c25736x76b98a57);
        this.f48611x3b9c46ab.m98231xc71fbb4d(true);
        this.f48611x3b9c46ab.m98230xd00ad80b();
        this.f48611x3b9c46ab.m98240x2936bf5f(5, this.f48615xa61e0461, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, interfaceC25832xf9968465);
    }

    /* renamed from: update */
    public synchronized void m98088xce0038c9(com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, final com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 interfaceC25835x83ed6fa8) {
        if (this.f48620xdf23d93d) {
            return;
        }
        this.f48603x23d1482c = c25841xf3b90db4;
        this.f48601x58ceaf0 = c25841xf3b90db4.m98107x742a913a();
        this.f48603x23d1482c.m98151x81f206d0();
        this.f48609x9e97c8a4.removeMessages(2);
        this.f48611x3b9c46ab.m98237x843bf739();
        this.f48611x3b9c46ab.m98248x12b50238(c25736x76b98a57);
        this.f48611x3b9c46ab.m98238x81dc8e3();
        this.f48611x3b9c46ab.m98231xc71fbb4d(false);
        this.f48611x3b9c46ab.m98239x2936bf5f(11, new com.p314xaae8f345.tav.p2967xc53e9ae1.C25852xc31b13c6(c25841xf3b90db4, new com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8() { // from class: com.tencent.tav.player.Player.1
            @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8
            /* renamed from: onUpdated */
            public void mo98057x41ace1dc(com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701, boolean z17) {
                com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 interfaceC25835x83ed6fa82 = interfaceC25835x83ed6fa8;
                if (interfaceC25835x83ed6fa82 != null) {
                    interfaceC25835x83ed6fa82.mo98057x41ace1dc(c25839x8ea38701, z17);
                }
                if (com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701.this.f48617xae0f87c8 != null) {
                    com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701.this.f48617xae0f87c8.mo98057x41ace1dc(c25839x8ea38701, z17);
                }
            }
        }), "update clips");
        this.f48608x3706e097 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
    }
}

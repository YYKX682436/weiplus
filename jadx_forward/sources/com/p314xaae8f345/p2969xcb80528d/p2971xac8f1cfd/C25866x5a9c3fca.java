package com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd;

/* renamed from: com.tencent.tavkit.component.TAVPlayer */
/* loaded from: classes16.dex */
public class C25866x5a9c3fca {

    /* renamed from: VIDEO_PLAYER_HEIGHT */
    public static final int f48865xd4605761 = 960;

    /* renamed from: VIDEO_PLAYER_WIDTH */
    public static final int f48866x28b7342c = 540;

    /* renamed from: audioManager */
    private android.media.AudioManager f48868xd33b2ef7;

    /* renamed from: compositionUpdateListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 f48871x8e912ce7;

    /* renamed from: context */
    private android.content.Context f48872x38b735af;

    /* renamed from: mPlayerLayout */
    private android.widget.FrameLayout f48877x7b922e78;

    /* renamed from: playRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48878x8f579e69;

    /* renamed from: player */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 f48879xc53e9ae1;

    /* renamed from: playerListener */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener f48880x764152b5;

    /* renamed from: postUpdateThread */
    private com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.PostUpdateThread f48882x2c0b4f3;

    /* renamed from: surface */
    private android.view.Surface f48884x9189ecad;

    /* renamed from: surfaceHeight */
    private int f48885x59c7434;

    /* renamed from: surfaceWidth */
    private int f48886xdffb3519;

    /* renamed from: tavComposition */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 f48887x756fbe41;
    private final java.lang.String TAG = "GameTemplatePlayer@" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: isAllowInterrupt */
    private boolean f48873xcca7d4e4 = true;

    /* renamed from: isAutoPlay */
    private boolean f48874x267714cd = true;

    /* renamed from: loopPlay */
    private boolean f48876x868cd3f8 = false;

    /* renamed from: volume */
    private float f48889xcfaae71a = 1.0f;

    /* renamed from: position */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f48881x2c929929 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;

    /* renamed from: videoTracksMerge */
    private boolean f48888x613c1915 = true;

    /* renamed from: audioTracksMerge */
    private boolean f48869xd099fada = true;

    /* renamed from: rate */
    private float f48883x354ce0 = 1.0f;

    /* renamed from: bgColor */
    private int f48870xf3ca161e = -16777216;

    /* renamed from: isResetting */
    private boolean f48875xbeec72b3 = false;

    /* renamed from: audioFocusChangeListener */
    private android.media.AudioManager.OnAudioFocusChangeListener f48867xada9d3c6 = new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: com.tencent.tavkit.component.TAVPlayer.4
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i17) {
            if (i17 == -2 || i17 == -1) {
                if (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48873xcca7d4e4 && com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1 != null) {
                    com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1.mo98033x65825f6();
                    return;
                }
                return;
            }
            if (i17 == 1 && com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1 != null) {
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1.mo98034x348b34();
            }
        }
    };

    /* renamed from: com.tencent.tavkit.component.TAVPlayer$ICompositionBuilder */
    /* loaded from: classes16.dex */
    public interface ICompositionBuilder extends com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 {
        /* renamed from: buildComposition */
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 mo98464xe12a3a5c();
    }

    /* renamed from: com.tencent.tavkit.component.TAVPlayer$PlayerListener */
    /* loaded from: classes16.dex */
    public interface PlayerListener {
        /* renamed from: onPositionChanged */
        void m98465x5c3ac16c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572);

        /* renamed from: onStatusChanged */
        void m98466xed0a9ac3(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus, com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701);
    }

    /* renamed from: com.tencent.tavkit.component.TAVPlayer$PostUpdateThread */
    /* loaded from: classes16.dex */
    public class PostUpdateThread extends android.os.HandlerThread implements android.os.Handler.Callback {

        /* renamed from: MSG_UNLOCK */
        private static final int f48899x92a545e2 = 95;

        /* renamed from: MSG_UPDATE */
        private static final int f48900x92bd9f67 = 223;

        /* renamed from: autoPlay */
        private boolean f48901x55bf6d83;

        /* renamed from: handler */
        private android.os.Handler f48902x294b574a;

        /* renamed from: msgLock */
        private volatile boolean f48903x5014384c;

        /* renamed from: templateSource */
        private com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.ICompositionBuilder f48904x9e9f5d35;

        /* renamed from: doUnlockMsg */
        private void m98469x6d7d952() {
            if (this.f48903x5014384c) {
                this.f48903x5014384c = false;
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.ICompositionBuilder iCompositionBuilder = this.f48904x9e9f5d35;
                if (iCompositionBuilder != null) {
                    m98473xce0038c9(iCompositionBuilder, this.f48901x55bf6d83);
                }
            }
        }

        /* renamed from: doUpdateComposition */
        private void m98470x6a3cbd6(final com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.ICompositionBuilder iCompositionBuilder, boolean z17) {
            m98472x7a37d99d(1000);
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.m98462x8a105121(iCompositionBuilder.mo98464xe12a3a5c(), com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, z17, new com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8() { // from class: com.tencent.tavkit.component.TAVPlayer.PostUpdateThread.1
                @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8
                /* renamed from: onUpdated */
                public void mo98057x41ace1dc(com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701, boolean z18) {
                    iCompositionBuilder.mo98057x41ace1dc(c25839x8ea38701, z18);
                    com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.PostUpdateThread.this.m98472x7a37d99d(0);
                }
            });
        }

        /* renamed from: doUpdateMsg */
        private void m98471x187155ad() {
            if (this.f48903x5014384c || this.f48904x9e9f5d35 == null) {
                return;
            }
            java.lang.String unused = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.TAG;
            this.f48903x5014384c = true;
            m98470x6a3cbd6(this.f48904x9e9f5d35, this.f48901x55bf6d83);
            this.f48904x9e9f5d35 = null;
            this.f48901x55bf6d83 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: unlockMsg */
        public synchronized void m98472x7a37d99d(int i17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.TAG, "unlockMsg() called thread = " + java.lang.Thread.currentThread().getName());
            this.f48902x294b574a.removeMessages(95);
            this.f48902x294b574a.sendEmptyMessageDelayed(95, (long) i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: update */
        public synchronized void m98473xce0038c9(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.ICompositionBuilder iCompositionBuilder, boolean z17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.TAG, "update() called with: thread = " + java.lang.Thread.currentThread().getName() + ", templateSource = [" + iCompositionBuilder + "], autoPlay = [" + z17 + "]");
            this.f48904x9e9f5d35 = iCompositionBuilder;
            this.f48901x55bf6d83 = z17;
            this.f48902x294b574a.removeMessages(223);
            this.f48902x294b574a.sendEmptyMessage(223);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.TAG, "handleMessage() called with: msg = [" + message + "] msgLock = " + this.f48903x5014384c + ",templateSource = " + this.f48904x9e9f5d35);
            int i17 = message.what;
            if (i17 == 95) {
                m98469x6d7d952();
                return true;
            }
            if (i17 != 223) {
                return true;
            }
            m98471x187155ad();
            return true;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
        }

        /* renamed from: release */
        public void m98474x41012807() {
            this.f48904x9e9f5d35 = null;
            android.os.Handler handler = this.f48902x294b574a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f48902x294b574a = null;
            }
            quit();
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            super.start();
            this.f48902x294b574a = new android.os.Handler(getLooper(), this);
        }

        private PostUpdateThread(java.lang.String str) {
            super(str);
            this.f48903x5014384c = false;
        }
    }

    public C25866x5a9c3fca() {
    }

    /* renamed from: abandonAudioFocus */
    private void m98425x50e69af7() {
        android.media.AudioManager audioManager = this.f48868xd33b2ef7;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocus(this.f48867xada9d3c6);
    }

    /* renamed from: buildPlayerItem */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 m98430xd01a22a2(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "buildPlayerItem() called with: tavComposition = [" + c25875x73210e61 + "]");
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25889x1381b9fa c25889x1381b9fa = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25889x1381b9fa(c25875x73210e61);
        c25889x1381b9fa.m98648xad111597(this.f48888x613c1915);
        c25889x1381b9fa.m98646x1c6ef75c(this.f48869xd099fada);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 m98645x86121029 = c25889x1381b9fa.m98645x86121029();
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4 = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4(m98645x86121029.m98593x742a913a());
        c25841xf3b90db4.m98148xfbd38eb1(m98645x86121029.m98595x57d6f9a5());
        c25841xf3b90db4.m98136xb0bd9928(m98645x86121029.m98594xb605381c());
        return c25841xf3b90db4;
    }

    /* renamed from: initContentView */
    private void m98431x84c0778e() {
        android.widget.FrameLayout frameLayout = this.f48877x7b922e78;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        android.view.TextureView textureView = new android.view.TextureView(this.f48872x38b735af);
        textureView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f48877x7b922e78.addView(textureView);
        textureView.setSurfaceTextureListener(new android.view.TextureView.SurfaceTextureListener() { // from class: com.tencent.tavkit.component.TAVPlayer.1
            private final java.lang.String TAG = "GameTextureView@" + java.lang.Integer.toHexString(hashCode());

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.m98441x30d8686a(new android.view.Surface(surfaceTexture), i18, i17);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.m98442x9b9bb66();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.m98443x2e79f4c5(i17, i18);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
            }
        });
    }

    /* renamed from: newPlayer */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 m98432xd6e778a1(com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 c25841xf3b90db4, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "newPlayer() called with: playerItem = [" + c25841xf3b90db4 + "], position = [" + c25736x76b98a57 + "], autoPlay = [" + z17 + "]");
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701(c25841xf3b90db4);
        c25839x8ea38701.mo98042x2ccf87b7(this.f48880x764152b5);
        c25839x8ea38701.mo98039x764cf626(this.f48876x868cd3f8);
        c25839x8ea38701.m98083x764f7c62(this.f48883x354ce0);
        c25839x8ea38701.m98081xa5089f5c(this.f48870xf3ca161e);
        c25839x8ea38701.mo98041xeb18d027(this.f48878x8f579e69);
        c25839x8ea38701.mo98043x27f73e1c(this.f48889xcfaae71a);
        c25839x8ea38701.m98078xe9aa2080(c25736x76b98a57);
        new com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0(this.f48884x9189ecad, this.f48886xdffb3519, this.f48885x59c7434).m98176x1d8af1e3(c25839x8ea38701);
        if (z17 && m98433xa650e691()) {
            c25839x8ea38701.mo98034x348b34();
        }
        com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 interfaceC25835x83ed6fa8 = this.f48871x8e912ce7;
        if (interfaceC25835x83ed6fa8 != null) {
            interfaceC25835x83ed6fa8.mo98057x41ace1dc(c25839x8ea38701, false);
        }
        this.f48875xbeec72b3 = false;
        return c25839x8ea38701;
    }

    /* renamed from: requestAudioFocus */
    private boolean m98433xa650e691() {
        android.content.Context context = this.f48872x38b735af;
        if (context == null) {
            return true;
        }
        if (this.f48868xd33b2ef7 == null) {
            this.f48868xd33b2ef7 = (android.media.AudioManager) context.getSystemService("audio");
        }
        return this.f48868xd33b2ef7.requestAudioFocus(this.f48867xada9d3c6, 3, 1) == 1;
    }

    /* renamed from: getCurrentStatus */
    public synchronized com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus m98435x430e7715() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 == null) {
            return com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.ERROR;
        }
        return c25839x8ea38701.mo98030x85aebacb();
    }

    /* renamed from: getDuration */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98436x51e8b0a() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            return c25839x8ea38701.mo98031x89444d94();
        }
        return com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
    }

    /* renamed from: getPosition */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98437xa86cd69f() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            return c25839x8ea38701.mo98035x2c929929();
        }
        return com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
    }

    /* renamed from: getVolume */
    public synchronized float m98438x34c20a10() {
        return this.f48889xcfaae71a;
    }

    /* renamed from: isPlaying */
    public synchronized boolean m98439xc00617a4() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 == null) {
            return false;
        }
        return c25839x8ea38701.mo98032xc00617a4();
    }

    /* renamed from: isResetting */
    public boolean m98440xbeec72b3() {
        return this.f48875xbeec72b3;
    }

    /* renamed from: onSurfaceCreate */
    public void m98441x30d8686a(android.view.Surface surface, int i17, int i18) {
        this.f48886xdffb3519 = i18;
        this.f48885x59c7434 = i17;
        this.f48884x9189ecad = surface;
        m98462x8a105121(this.f48887x756fbe41, this.f48881x2c929929, this.f48874x267714cd, this.f48871x8e912ce7);
    }

    /* renamed from: onSurfaceDestory */
    public void m98442x9b9bb66() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null && !c25839x8ea38701.m98073xafdb8087()) {
            this.f48881x2c929929 = this.f48879xc53e9ae1.mo98035x2c929929();
            this.f48879xc53e9ae1.mo98036x41012807();
        }
        this.f48884x9189ecad = null;
    }

    /* renamed from: onSurfaceSizeChanged */
    public void m98443x2e79f4c5(int i17, int i18) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.m98091x7b31bc8f(i17, i18);
        }
    }

    /* renamed from: pause */
    public synchronized void m98444x65825f6() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "pause: player = " + this.f48879xc53e9ae1);
        if (this.f48879xc53e9ae1 != null) {
            m98425x50e69af7();
            this.f48879xc53e9ae1.mo98033x65825f6();
        } else {
            this.f48874x267714cd = false;
        }
    }

    /* renamed from: play */
    public synchronized void m98445x348b34() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "play: player = " + this.f48879xc53e9ae1);
        if (this.f48879xc53e9ae1 == null) {
            this.f48874x267714cd = true;
        } else if (m98433xa650e691()) {
            this.f48879xc53e9ae1.mo98034x348b34();
        }
    }

    /* renamed from: postUpdate */
    public synchronized void m98447x63acc589(final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61, boolean z17) {
        m98446x63acc589(new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.ICompositionBuilder() { // from class: com.tencent.tavkit.component.TAVPlayer.5
            @Override // com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.ICompositionBuilder
            /* renamed from: buildComposition */
            public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 mo98464xe12a3a5c() {
                return c25875x73210e61;
            }

            @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8
            /* renamed from: onUpdated */
            public void mo98057x41ace1dc(com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701, boolean z18) {
            }
        }, z17);
    }

    /* renamed from: release */
    public synchronized void m98448x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release: player = " + this.f48879xc53e9ae1);
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            this.f48881x2c929929 = c25839x8ea38701.mo98035x2c929929();
            m98425x50e69af7();
            this.f48879xc53e9ae1.mo98036x41012807();
            this.f48879xc53e9ae1 = null;
        }
        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.PostUpdateThread postUpdateThread = this.f48882x2c0b4f3;
        if (postUpdateThread != null) {
            postUpdateThread.quit();
            this.f48882x2c0b4f3 = null;
        }
        this.f48875xbeec72b3 = false;
    }

    /* renamed from: reset */
    public synchronized void m98449x6761d4f() {
        this.f48875xbeec72b3 = true;
        m98431x84c0778e();
    }

    /* renamed from: seekToTime */
    public void m98450xe9aa2080(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "seekToTime() called with: cmTime = [" + c25736x76b98a57 + "],player = " + this.f48879xc53e9ae1);
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.m98078xe9aa2080(c25736x76b98a57);
        }
    }

    /* renamed from: setAllowInterrupt */
    public void m98451xdc8a821c(boolean z17) {
        this.f48873xcca7d4e4 = z17;
    }

    /* renamed from: setAudioTracksMerge */
    public void m98452x1c6ef75c(boolean z17) {
        this.f48869xd099fada = z17;
    }

    /* renamed from: setAutoPlay */
    public synchronized void m98453xcc520c05(boolean z17) {
        this.f48874x267714cd = z17;
    }

    /* renamed from: setBgColor */
    public void m98454xa5089f5c(int i17) {
        this.f48870xf3ca161e = i17;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.m98081xa5089f5c(i17);
        }
    }

    /* renamed from: setLoopPlay */
    public synchronized void m98455xfd1f727a(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "setLoopPlay() called with: loopPlay = [" + z17 + "],player = " + this.f48879xc53e9ae1);
        this.f48876x868cd3f8 = z17;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.mo98039x764cf626(z17);
        }
    }

    /* renamed from: setPlayRange */
    public synchronized void m98456xeb18d027(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "setPlayRange() called with: playRange = [" + c25738xead39d26 + "],player = " + this.f48879xc53e9ae1);
        this.f48878x8f579e69 = c25738xead39d26;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.mo98041xeb18d027(c25738xead39d26);
        }
    }

    /* renamed from: setPlayerListener */
    public void m98457x2ccf87b7(final com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.PlayerListener playerListener) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "setPlayerListener() called with: playerListener = [" + playerListener + "],player = " + this.f48879xc53e9ae1);
        m98434x2ccf87b7(new com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener() { // from class: com.tencent.tavkit.component.TAVPlayer.2
            @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener
            /* renamed from: onPositionChanged */
            public void mo98051x5c3ac16c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
                if (playerListener == null || com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1 == null) {
                    return;
                }
                playerListener.m98465x5c3ac16c(c25736x76b98a57, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1.mo98031x89444d94());
            }

            @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener
            /* renamed from: onStatusChanged */
            public void mo98052xed0a9ac3(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus) {
                if (playerListener == null || com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1 == null) {
                    return;
                }
                playerListener.m98466xed0a9ac3(playerStatus, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48879xc53e9ae1);
            }
        });
    }

    /* renamed from: setRate */
    public synchronized void m98458x764f7c62(float f17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "setLoopPlay() called with: loopPlay = [" + this.f48876x868cd3f8 + "],player = " + this.f48879xc53e9ae1);
        this.f48883x354ce0 = f17;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.m98083x764f7c62(f17);
        }
    }

    /* renamed from: setVideoTracksMerge */
    public void m98459xad111597(boolean z17) {
        this.f48888x613c1915 = z17;
    }

    /* renamed from: setVolume */
    public synchronized void m98460x27f73e1c(float f17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "setVolume() called with: volume = [" + f17 + "],player = " + this.f48879xc53e9ae1);
        this.f48889xcfaae71a = f17;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.mo98043x27f73e1c(f17);
        }
    }

    /* renamed from: updateComposition */
    public void m98463x8a105121(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61, boolean z17) {
        m98461x8a105121(c25875x73210e61, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, z17);
    }

    /* renamed from: updateComposition */
    public void m98461x8a105121(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        m98462x8a105121(c25875x73210e61, c25736x76b98a57, z17, null);
    }

    /* renamed from: setPlayerListener */
    private void m98434x2ccf87b7(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener playerListener) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "setPlayerListener() called with: playerListener = [" + playerListener + "],player = " + this.f48879xc53e9ae1);
        this.f48880x764152b5 = playerListener;
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.mo98042x2ccf87b7(playerListener);
        }
    }

    /* renamed from: postUpdate */
    public synchronized void m98446x63acc589(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.ICompositionBuilder iCompositionBuilder, boolean z17) {
        if (this.f48882x2c0b4f3 == null) {
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.PostUpdateThread postUpdateThread = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.PostUpdateThread("PostUpdateThread");
            this.f48882x2c0b4f3 = postUpdateThread;
            postUpdateThread.start();
        }
        this.f48882x2c0b4f3.m98473xce0038c9(iCompositionBuilder, z17);
    }

    /* renamed from: updateComposition */
    public void m98462x8a105121(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61, final com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, final boolean z17, com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 interfaceC25835x83ed6fa8) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "updateComposition() called with: tavComposition = [" + c25875x73210e61 + "], position = [" + c25736x76b98a57 + "], autoPlay = [" + z17 + "]");
        this.f48887x756fbe41 = c25875x73210e61;
        this.f48881x2c929929 = c25736x76b98a57;
        this.f48871x8e912ce7 = interfaceC25835x83ed6fa8;
        if (c25875x73210e61 == null) {
            this.f48875xbeec72b3 = false;
            return;
        }
        if (this.f48884x9189ecad == null) {
            this.f48874x267714cd = z17;
            this.f48875xbeec72b3 = false;
            return;
        }
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25841xf3b90db4 m98430xd01a22a2 = m98430xd01a22a2(c25875x73210e61);
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48879xc53e9ae1;
        if (c25839x8ea38701 != null && !c25839x8ea38701.m98073xafdb8087()) {
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea387012 = this.f48879xc53e9ae1;
            if (interfaceC25835x83ed6fa8 == null) {
                interfaceC25835x83ed6fa8 = new com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8() { // from class: com.tencent.tavkit.component.TAVPlayer.3
                    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8
                    /* renamed from: onUpdated */
                    public void mo98057x41ace1dc(com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea387013, boolean z18) {
                        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.m98450xe9aa2080(c25736x76b98a57);
                        if (z17 && z18) {
                            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.m98445x348b34();
                        }
                        com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.this.f48875xbeec72b3 = false;
                    }
                };
            }
            c25839x8ea387012.m98088xce0038c9(m98430xd01a22a2, c25736x76b98a57, interfaceC25835x83ed6fa8);
            this.f48871x8e912ce7 = null;
            return;
        }
        this.f48879xc53e9ae1 = m98432xd6e778a1(m98430xd01a22a2, c25736x76b98a57, z17);
    }

    public C25866x5a9c3fca(android.view.Surface surface, int i17, int i18) {
        m98441x30d8686a(surface, i18, i17);
    }

    public C25866x5a9c3fca(android.widget.FrameLayout frameLayout) {
        this.f48872x38b735af = frameLayout.getContext();
        this.f48877x7b922e78 = frameLayout;
        m98431x84c0778e();
    }
}

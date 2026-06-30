package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f;

/* renamed from: com.tencent.thumbplayer.adapter.TPPlayerAdapter */
/* loaded from: classes16.dex */
public class C26132x9a7ae012 implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener {

    /* renamed from: PLAYER_REOPEN_TYPE_ERROR_RETRY */
    private static final int f49939xf6703d90 = 1;

    /* renamed from: PLAYER_REOPEN_TYPE_UNKNOWN */
    private static final int f49940xe1cc03c9 = 0;

    /* renamed from: PLAYER_REOPEN_TYPE_USER_FORCE_REOPEN */
    private static final int f49941xb558efc4 = 2;
    private static final java.lang.String TAG = "TPPlayerAdapter";

    /* renamed from: mContext */
    private android.content.Context f49943xd6cfe882;

    /* renamed from: mIsReopening */
    private boolean f49944xa74fcb0e;

    /* renamed from: mLogger */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d f49945xe041c5d;

    /* renamed from: mPlayerBase */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 f49946x5915b59f;

    /* renamed from: mPlayerCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.TPPlayerBaseCallback f49947x2273b813;

    /* renamed from: mPlayerInitParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d f49948xe6761b04;

    /* renamed from: mPlayerListeners */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 f49949x21973431;

    /* renamed from: mPlayerState */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 f49950xca98ef83;

    /* renamed from: mPlayerType */
    private int f49951x591e3e08;

    /* renamed from: mRichMediaProcessor */
    private com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59 f49953x3d1c7c57;

    /* renamed from: mStateChecker */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26137xc88409a7 f49954xce27a6f1;

    /* renamed from: mTPLoggerContext */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 f49955xd01bfcd6;

    /* renamed from: mTPPlaybackInfo */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 f49956x42b5ebb2;

    /* renamed from: mTpStrategy */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18 f49957xd9d3d25c;

    /* renamed from: mReopenType */
    private int f49952x5d21824 = 0;

    /* renamed from: apiCallGetCurrentPositionMs */
    private int f49942xca599e0a = 0;

    /* renamed from: com.tencent.thumbplayer.adapter.TPPlayerAdapter$TPPlayerBaseCallback */
    /* loaded from: classes16.dex */
    public class TPPlayerBaseCallback implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener {
        private TPPlayerBaseCallback() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener
        /* renamed from: onAudioPcmOut */
        public void mo100458x30daf82b(com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100363x33455db0(c26169xaecce4f3);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener
        /* renamed from: onAudioProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100459xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100364xbf937c41(c26188x7aa7007a);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener
        /* renamed from: onCompletion */
        public void mo100460xa6db431b() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100365xdd3e0c80();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener
        /* renamed from: onDetailInfo */
        public void mo100461x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100366x68658626(c26183xfc0748fc);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener
        /* renamed from: onDrmInfo */
        public void mo100462xc240780e(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100367xff0596c6(c26174xf2a580d1);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener
        /* renamed from: onError */
        public void mo100463xaf8aa769(int i17, int i18, long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100368xd1f81421(i17, i18, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener
        /* renamed from: onInfo */
        public void mo100464xc39adf2d(int i17, long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100369xabf0fb75(i17, j17, j18, obj);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener
        /* renamed from: onPrepared */
        public void mo100465x58d5b73c() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100370xb4b46f84();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener
        /* renamed from: onSdpExchange */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b mo100466xc45f8823(java.lang.String str, int i17) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100371xc7868adb(str, i17);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener
        /* renamed from: onSeekComplete */
        public void mo100467xe1fdf750() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100372x43b74b98();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener
        /* renamed from: onSubtitleData */
        public void mo100468xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100373x5d17c3a9(c26193x359f687e);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener
        /* renamed from: onSubtitleFrameOut */
        public void mo100469x715e46d8(com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100374xf2443720(c26194x3ac954b9);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener
        /* renamed from: onVideoFrameOut */
        public void mo100470xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100375x968b6155(c26203x3f6f032e);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener
        /* renamed from: onVideoProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100471x18d178b4(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100376xd93604fc(c26188x7aa7007a);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener
        /* renamed from: onVideoSizeChanged */
        public void mo100472xdc9583f7(long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.m100377x97a924c5(j17, j18);
        }
    }

    public C26132x9a7ae012(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e32 = new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, TAG);
        this.f49955xd01bfcd6 = c26478xc50084e32;
        this.f49945xe041c5d = new com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d(c26478xc50084e32);
        this.f49943xd6cfe882 = context;
        com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614 = new com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614();
        this.f49950xca98ef83 = c26187x2e775614;
        c26187x2e775614.m101149xa23b7bf3(this);
        this.f49948xe6761b04 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d();
        this.f49947x2273b813 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.TPPlayerBaseCallback();
        this.f49949x21973431 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1(this.f49955xd01bfcd6.m103238xb5887064());
        this.f49954xce27a6f1 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26137xc88409a7(this.f49950xca98ef83);
        this.f49956x42b5ebb2 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05();
    }

    /* renamed from: backupVideoInfo */
    private void m100360x227b3c27() {
        if (m100378x2e589ccd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 m100262x92b86201 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05.m100262x92b86201(mo100406x7e95833c(0));
            this.f49956x42b5ebb2 = m100262x92b86201;
            m100262x92b86201.m100301xbae431cb((int) this.f49946x5915b59f.mo100405x2d67b867(204));
            this.f49956x42b5ebb2.m100302x7c04aa30((int) this.f49946x5915b59f.mo100405x2d67b867(203));
            this.f49956x42b5ebb2.m100286x263c3675((int) this.f49946x5915b59f.mo100405x2d67b867(102));
            this.f49956x42b5ebb2.m100299xc6999019((int) this.f49946x5915b59f.mo100405x2d67b867(201));
            this.f49956x42b5ebb2.m100300xb0c7357c((int) this.f49946x5915b59f.mo100405x2d67b867(210));
        }
        if (this.f49956x42b5ebb2 == null) {
            this.f49956x42b5ebb2 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05();
        }
        this.f49956x42b5ebb2.m100293x65cc485c(this.f49946x5915b59f.mo100400x37a7fa50());
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m100314xe432b557 = this.f49948xe6761b04.m100314xe432b557(100);
        if (m100314xe432b557 != null) {
            this.f49956x42b5ebb2.m100290xb96966c6(m100314xe432b557.m101073x73e0b5f3().f50734x6ac9171);
        }
    }

    /* renamed from: createPlayerBase */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100361xe9b32f6e(int i17, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7;
        try {
        } catch (java.lang.Exception e17) {
            this.f49945xe041c5d.mo100757x3164ae("to create Player," + e17.toString());
        }
        if (i17 == 1) {
            this.f49945xe041c5d.mo100757x3164ae("to create androidPlayer");
            interfaceC26139x4d493b7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26141x4864c83c.m100555x394d049a(this.f49943xd6cfe882, this.f49948xe6761b04.m100341x91a017bf(), c26478xc50084e3);
        } else if (i17 == 2) {
            this.f49945xe041c5d.mo100757x3164ae("to create thumbPlayer");
            interfaceC26139x4d493b7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26141x4864c83c.m100556xaf82d1bb(this.f49943xd6cfe882, c26478xc50084e3);
        } else if (i17 == 3) {
            this.f49945xe041c5d.mo100757x3164ae("to create thumbPlayer software dec");
            interfaceC26139x4d493b7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26141x4864c83c.m100556xaf82d1bb(this.f49943xd6cfe882, c26478xc50084e3);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("to create no Player");
            interfaceC26139x4d493b7 = null;
        }
        if (interfaceC26139x4d493b7 == null) {
            this.f49945xe041c5d.mo100757x3164ae("play is null!");
            return null;
        }
        this.f49951x591e3e08 = i17;
        m100383x1404083e(interfaceC26139x4d493b7);
        return interfaceC26139x4d493b7;
    }

    /* renamed from: createPlayerStrategy */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18 m100362x45e53590(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d c26131x1fd6491d) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26158xb3cf3e31 c26158xb3cf3e31;
        try {
            c26158xb3cf3e31 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26158xb3cf3e31(c26131x1fd6491d);
        } catch (java.lang.IllegalArgumentException unused) {
            c26158xb3cf3e31 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26158xb3cf3e31(null);
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.C26157x4c52d3fb.m100812xa18cec8f(c26158xb3cf3e31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnAudioFrameOut */
    public void m100363x33455db0(com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
        if (this.f49954xce27a6f1.m100552xd045a15a(7)) {
            this.f49949x21973431.mo100458x30daf82b(c26169xaecce4f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnAudioProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m100364xbf937c41(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        if (this.f49954xce27a6f1.m100552xd045a15a(7)) {
            return this.f49949x21973431.mo100459xff2eeff9(c26188x7aa7007a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnComplete */
    public void m100365xdd3e0c80() {
        if (!this.f49954xce27a6f1.m100552xd045a15a(2)) {
            this.f49945xe041c5d.mo100757x3164ae("handleOnComplete, invalid state");
        } else {
            this.f49950xca98ef83.m101143x9cb98ec1(7);
            this.f49949x21973431.mo100460xa6db431b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnDetailInfo */
    public void m100366x68658626(com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
        this.f49949x21973431.mo100461x8953bfde(c26183xfc0748fc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnDrmInfo */
    public void m100367xff0596c6(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
        this.f49949x21973431.mo100462xc240780e(c26174xf2a580d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnError */
    public void m100368xd1f81421(int i17, int i18, long j17, long j18) {
        if (this.f49954xce27a6f1.m100552xd045a15a(4)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18 interfaceC26153x611ccf18 = this.f49957xd9d3d25c;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
            int mo100807xb79c1ff2 = interfaceC26153x611ccf18.mo100807xb79c1ff2(c26130x49ae05, new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26159xc61ed8a0(this.f49951x591e3e08, i17, i18, c26130x49ae05.m100271xb1c9ed49()));
            if (mo100807xb79c1ff2 == 0) {
                this.f49950xca98ef83.m101143x9cb98ec1(10);
                this.f49949x21973431.mo100463xaf8aa769(i17, i18, j17, j18);
                return;
            }
            try {
                m100380x3a86783e(mo100807xb79c1ff2, 1);
            } catch (java.io.IOException e17) {
                this.f49945xe041c5d.mo103227xaa8bf022(e17);
                this.f49950xca98ef83.m101143x9cb98ec1(10);
                this.f49949x21973431.mo100463xaf8aa769(i17, i18, j17, j18);
            } catch (java.lang.IllegalStateException e18) {
                this.f49945xe041c5d.mo103227xaa8bf022(e18);
                this.f49950xca98ef83.m101143x9cb98ec1(10);
                this.f49949x21973431.mo100463xaf8aa769(i17, i18, j17, j18);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnInfo */
    public void m100369xabf0fb75(int i17, long j17, long j18, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05;
        if (this.f49944xa74fcb0e) {
            this.f49945xe041c5d.mo100757x3164ae("handleOnInfo, mIsReopening");
            return;
        }
        if (i17 == 152 && (c26130x49ae05 = this.f49956x42b5ebb2) != null) {
            c26130x49ae05.m100289xa9b4c39c(((int) j17) + 1);
        }
        this.f49949x21973431.mo100464xc39adf2d(i17, j17, j18, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnPrepared */
    public void m100370xb4b46f84() {
        this.f49949x21973431.mo100464xc39adf2d(1000, this.f49951x591e3e08, 0L, null);
        if (this.f49944xa74fcb0e) {
            if (this.f49950xca98ef83.m101144xfc68bc07() != 3) {
                this.f49945xe041c5d.mo100758x379286("handleOnPrepared, invalid state, mIsRetrying.");
                return;
            }
        } else if (!this.f49954xce27a6f1.m100552xd045a15a(1)) {
            this.f49945xe041c5d.mo100757x3164ae("handleOnPrepared, invalid state");
            return;
        }
        m100360x227b3c27();
        m100382x3256a1ef(this.f49946x5915b59f);
        if (!this.f49944xa74fcb0e) {
            this.f49950xca98ef83.m101147xadb2108(4);
            this.f49950xca98ef83.m101143x9cb98ec1(4);
            this.f49949x21973431.mo100465x58d5b73c();
            return;
        }
        this.f49944xa74fcb0e = false;
        this.f49945xe041c5d.mo100757x3164ae("handleOnPrepared, mIsRetrying, recoverState, state:" + this.f49950xca98ef83.m101150x68ac491());
        int m101150x68ac491 = this.f49950xca98ef83.m101150x68ac491();
        this.f49950xca98ef83.m101143x9cb98ec1(4);
        if (this.f49950xca98ef83.m101145x77576f9b() == 3) {
            this.f49949x21973431.mo100465x58d5b73c();
        }
        if (this.f49952x5d21824 == 1) {
            this.f49949x21973431.mo100464xc39adf2d(1014, 0L, 0L, null);
        } else {
            this.f49949x21973431.mo100464xc39adf2d(201, 0L, 0L, null);
        }
        this.f49952x5d21824 = 0;
        m100379x30441965(m101150x68ac491);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnSdpExchange */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b m100371xc7868adb(java.lang.String str, int i17) {
        return this.f49949x21973431.mo100466xc45f8823(str, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnSeekComplete */
    public void m100372x43b74b98() {
        if (this.f49954xce27a6f1.m100552xd045a15a(5)) {
            this.f49949x21973431.mo100467xe1fdf750();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnSubtitleData */
    public void m100373x5d17c3a9(com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
        if (this.f49954xce27a6f1.m100552xd045a15a(7)) {
            this.f49949x21973431.mo100468xfb5e6f61(c26193x359f687e);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("handleOnSubtitleData, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnSubtitleFrameOut */
    public void m100374xf2443720(com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9) {
        if (this.f49954xce27a6f1.m100552xd045a15a(7)) {
            this.f49949x21973431.mo100469x715e46d8(c26194x3ac954b9);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("handleOnSubtitleFrameOut, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnVideoFrameOut */
    public void m100375x968b6155(com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
        if (this.f49954xce27a6f1.m100552xd045a15a(7)) {
            this.f49949x21973431.mo100470xc11a2c9d(c26203x3f6f032e);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("handleOnVideoFrameOut, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnVideoProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m100376xd93604fc(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        if (this.f49954xce27a6f1.m100552xd045a15a(7)) {
            return this.f49949x21973431.mo100471x18d178b4(c26188x7aa7007a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnVideoSizeChange */
    public void m100377x97a924c5(long j17, long j18) {
        if (!this.f49954xce27a6f1.m100552xd045a15a(6)) {
            this.f49945xe041c5d.mo100757x3164ae("handleOnVideoSizeChange, invalid state");
            return;
        }
        this.f49956x42b5ebb2.m100294xf84e829(j18);
        this.f49956x42b5ebb2.m100303x53e9ee84(j17);
        this.f49949x21973431.mo100472xdc9583f7(j17, j18);
    }

    /* renamed from: isThumbPlayer */
    private boolean m100378x2e589ccd() {
        int i17 = this.f49951x591e3e08;
        return i17 == 2 || i17 == 3;
    }

    /* renamed from: recoverPlayer */
    private void m100379x30441965(int i17) {
        if (i17 != 5) {
            return;
        }
        try {
            this.f49946x5915b59f.mo100450x68ac462();
            this.f49950xca98ef83.m101143x9cb98ec1(5);
        } catch (java.lang.IllegalStateException e17) {
            this.f49945xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    /* renamed from: selectPlayer */
    private int m100381x740e0efd() {
        if (this.f49957xd9d3d25c == null) {
            this.f49957xd9d3d25c = m100362x45e53590(this.f49948xe6761b04);
        }
        return this.f49957xd9d3d25c.mo100806xab1457c0(this.f49956x42b5ebb2);
    }

    /* renamed from: setPlayerParamAfterPrepared */
    private void m100382x3256a1ef(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7) {
        com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36 m100315xebec5a00;
        com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36 c26189x4a228d36;
        com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100404x160d5c1c = mo100404x160d5c1c();
        if (mo100404x160d5c1c == null || (m100315xebec5a00 = this.f49948xe6761b04.m100315xebec5a00()) == null) {
            return;
        }
        for (int i17 = 0; i17 < mo100404x160d5c1c.length; i17++) {
            if (!android.text.TextUtils.isEmpty(m100315xebec5a00.url) && (c26189x4a228d36 = mo100404x160d5c1c[i17]) != null && m100315xebec5a00.url.equals(c26189x4a228d36.url)) {
                interfaceC26139x4d493b7.mo100418x18ae2de8(i17, -1L);
                return;
            }
        }
    }

    /* renamed from: setPlayerParamBeforePrepare */
    private void m100383x1404083e(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7) {
        interfaceC26139x4d493b7.mo100436x40f8c003(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100437x5dd7c812(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100431xa4560c71(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100434x6954c27b(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100438xe1a2e326(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100443x2d6d87cd(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100439x8796ba37(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100440xa679d9ae(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100433xa4b31634(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100435x5e0339be(this.f49947x2273b813);
        interfaceC26139x4d493b7.mo100432xa8a04d4f(this.f49947x2273b813);
        if (m100378x2e589ccd()) {
            interfaceC26139x4d493b7.mo100441xf26db5af(this.f49947x2273b813);
            interfaceC26139x4d493b7.mo100429x3282865a(this.f49947x2273b813);
            interfaceC26139x4d493b7.mo100442x7e05de2a(this.f49947x2273b813);
            interfaceC26139x4d493b7.mo100430xb23c0daf(this.f49947x2273b813);
        }
        if (1 == this.f49948xe6761b04.m100313x4bd85c65().m100515xfb85f7b0()) {
            interfaceC26139x4d493b7.mo100423x683d6267(this.f49948xe6761b04.m100313x4bd85c65().m100519xc3e78274());
        } else if (4 == this.f49948xe6761b04.m100313x4bd85c65().m100515xfb85f7b0()) {
            interfaceC26139x4d493b7.mo100422x683d6267(this.f49948xe6761b04.m100313x4bd85c65().m100513xb24cd1b());
        } else if (3 == this.f49948xe6761b04.m100313x4bd85c65().m100515xfb85f7b0()) {
            int i17 = this.f49951x591e3e08;
            if (i17 == 2) {
                interfaceC26139x4d493b7.mo100426x683d6267(this.f49948xe6761b04.m100313x4bd85c65().m100514x9e989be2().m100557x18ed3d2c(), this.f49948xe6761b04.m100313x4bd85c65().m100516x6255d5de());
            } else if (i17 == 1) {
                interfaceC26139x4d493b7.mo100426x683d6267(this.f49948xe6761b04.m100313x4bd85c65().m100514x9e989be2().m100558x6e7e3f29(), this.f49948xe6761b04.m100313x4bd85c65().m100516x6255d5de());
            }
        } else if (2 == this.f49948xe6761b04.m100313x4bd85c65().m100515xfb85f7b0()) {
            interfaceC26139x4d493b7.mo100424x683d6267(this.f49948xe6761b04.m100313x4bd85c65().m100518x71f8d96c());
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> it = this.f49948xe6761b04.m100320xb38c2906().iterator();
        while (it.hasNext()) {
            interfaceC26139x4d493b7.mo100447x1ba09fea(it.next());
        }
        for (int i18 = 0; i18 < this.f49948xe6761b04.m100318x322b1ef0().size(); i18++) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = this.f49948xe6761b04.m100318x322b1ef0().get(i18);
            int i19 = c26201xd4eb4d7d.f51066x2b805725;
            if (i19 == 3) {
                java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute> it6 = this.f49948xe6761b04.m100340x99149c80().iterator();
                while (true) {
                    if (it6.hasNext()) {
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute next = it6.next();
                        if (!android.text.TextUtils.isEmpty(next.f49938x337a8b) && next.f49938x337a8b.equals(c26201xd4eb4d7d.f51065x337a8b)) {
                            interfaceC26139x4d493b7.mo100387x14654554(next.url, next.f49936x24345135, next.f49937xad05ed8e, next.f49938x337a8b);
                            break;
                        }
                    }
                }
            } else if (i19 == 2) {
                java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute> it7 = this.f49948xe6761b04.m100312xe0c426e3().iterator();
                while (true) {
                    if (it7.hasNext()) {
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute next2 = it7.next();
                        if (!android.text.TextUtils.isEmpty(next2.f49929x337a8b) && next2.f49929x337a8b.equals(c26201xd4eb4d7d.f51065x337a8b)) {
                            interfaceC26139x4d493b7.mo100385xa28fa651(next2.url, next2.f49928x24345135, next2.f49929x337a8b, next2.f49927x95ffdcfb);
                            break;
                        }
                    }
                }
            }
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute> it8 = this.f49948xe6761b04.m100316x525d2b0().iterator();
        while (it8.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SelectTrackAttribute next3 = it8.next();
            if (next3.f49935x2b7b2c99.f51064x17bd99e5) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3 = interfaceC26139x4d493b7.mo100407x2ae89de3();
                if (mo100407x2ae89de3 == null) {
                    this.f49945xe041c5d.mo100756x5c4d208("playerTrackInfoList is null.");
                } else {
                    for (int i27 = 0; i27 < mo100407x2ae89de3.length; i27++) {
                        if (next3.f49935x2b7b2c99.f51065x337a8b.equals(mo100407x2ae89de3[i27].f51065x337a8b)) {
                            interfaceC26139x4d493b7.mo100419xc3b89af(i27, next3.f49933xc3c20421);
                        }
                    }
                }
            }
        }
        if (this.f49948xe6761b04.m100319x8694d98b() != null) {
            interfaceC26139x4d493b7.mo100428xfd27780d(this.f49948xe6761b04.m100319x8694d98b().f49931x574c80d5, this.f49948xe6761b04.m100319x8694d98b().f49932xc3950ab1, this.f49948xe6761b04.m100319x8694d98b().f49930x5a7f4bea);
        }
        interfaceC26139x4d493b7.mo100444xd0747cbc(this.f49948xe6761b04.m100321xb40f76ba());
        if (this.f49948xe6761b04.m100310x8416e096() != 0.0f) {
            interfaceC26139x4d493b7.mo100420x3aa51598(this.f49948xe6761b04.m100310x8416e096());
        }
        if (this.f49948xe6761b04.m100339x24f07404() != 0.0f) {
            interfaceC26139x4d493b7.mo100446xd079f5a(this.f49948xe6761b04.m100339x24f07404());
        }
        if (!"".equals(this.f49948xe6761b04.m100311xcf46aeb7())) {
            interfaceC26139x4d493b7.mo100421x1e3370b9(this.f49948xe6761b04.m100311xcf46aeb7());
        }
        if (this.f49948xe6761b04.m100342x9189ecad() instanceof android.view.SurfaceHolder) {
            interfaceC26139x4d493b7.mo100449x5660d377((android.view.SurfaceHolder) this.f49948xe6761b04.m100342x9189ecad());
        } else if (this.f49948xe6761b04.m100342x9189ecad() instanceof android.view.Surface) {
            interfaceC26139x4d493b7.mo100448x42c875eb((android.view.Surface) this.f49948xe6761b04.m100342x9189ecad(), this.f49948xe6761b04.m100343xac61d187());
        }
        interfaceC26139x4d493b7.mo100447x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101065x9c4efdac(204, this.f49957xd9d3d25c.mo100805xdc3a4bcc()));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addAudioTrackSource */
    public void mo100384xa28fa651(java.lang.String str, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list) {
        mo100385xa28fa651(str, null, str2, list);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addSubtitleSource */
    public void mo100386x14654554(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        mo100387x14654554(str, null, str2, str3);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: captureVideo */
    public void mo100388x2d34f8d5(com.p314xaae8f345.p3006xb8ff1437.api.C26171xafafaf50 c26171xafafaf50, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100388x2d34f8d5(c26171xafafaf50, interfaceC26170x325bffaf);
        } else {
            throw new java.lang.IllegalStateException("error , no player for capture :" + this.f49950xca98ef83);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: configBufferDurationAsync */
    public int mo100389x59e24e46(int i17, long j17, long j18, long j19) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100389x59e24e46(i17, j17, j18, j19);
        }
        this.f49945xe041c5d.mo100758x379286("configBufferDurationAsync, mPlayerBase = null, return !");
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: deselectTrack */
    public void mo100390x4080528e(int i17, long j17) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("error : deselectTrack , state invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3 = mo100407x2ae89de3();
        if (mo100407x2ae89de3 == null) {
            this.f49945xe041c5d.mo100756x5c4d208("fatal err, tpTrackInfos is null");
            return;
        }
        if (i17 < 0 || i17 > mo100407x2ae89de3.length - 1) {
            throw new java.lang.IllegalArgumentException("error : track not found");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100390x4080528e(i17, j17);
        }
        this.f49948xe6761b04.m100331xbac5c81a(i17, j17, mo100407x2ae89de3[i17]);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getAutoExpendBufferCount */
    public int mo100391xa42b888c() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100391xa42b888c();
        }
        this.f49945xe041c5d.mo100758x379286("getAutoExpendBufferCount, mPlayerBase = null, return !");
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxReadDurationPosMs */
    public long mo100392xdc51b7e8() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100392xdc51b7e8();
        }
        this.f49945xe041c5d.mo100758x379286("getBufferIOMaxReadDurationPosMs, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxReadFileOffset */
    public long mo100393x69f9266d() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100393x69f9266d();
        }
        this.f49945xe041c5d.mo100758x379286("getBufferIOMaxReadFileOffset, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    public long mo100394xed03e74f() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100394xed03e74f();
        }
        this.f49945xe041c5d.mo100758x379286("getBufferIOMaxWriteDurationPosMs, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxWriteFileOffset */
    public long mo100395x1e708866() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100395x1e708866();
        }
        this.f49945xe041c5d.mo100758x379286("getBufferIOMaxWriteFileOffset, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferedDurationMs */
    public long mo100396x23e0c68f() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100396x23e0c68f();
        }
        this.f49945xe041c5d.mo100758x379286("getBufferedDuration, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferedSize */
    public long mo100397x45feff6() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100397x45feff6();
        }
        this.f49945xe041c5d.mo100758x379286("getBufferedSize, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: getCurrentPlayClipNo */
    public int mo100248xce1eb728() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
        if (c26130x49ae05 != null) {
            return c26130x49ae05.m100269xce1eb728();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getCurrentPositionMs */
    public long mo100398xddd35a52() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(12)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
            if (c26130x49ae05 != null) {
                return c26130x49ae05.m100270xddd35a52();
            }
            return 0L;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null && this.f49942xca599e0a % 10 == 0) {
            this.f49945xe041c5d.mo100758x379286("getCurrentPositionMs, mPlayerBase = null, return 0! apiCallGetCurrentPositionMs:" + this.f49942xca599e0a);
            return 0L;
        }
        long mo100398xddd35a52 = interfaceC26139x4d493b7.mo100398xddd35a52();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae052 = this.f49956x42b5ebb2;
        if (c26130x49ae052 != null) {
            c26130x49ae052.m100290xb96966c6(mo100398xddd35a52);
        }
        return mo100398xddd35a52;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: getCurrentState */
    public int mo100249xb7d72d0e() {
        return this.f49950xca98ef83.m101150x68ac491();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDemuxerOffsetInFile */
    public long mo100399x37da763a() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(19)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
            if (c26130x49ae05 != null) {
                return c26130x49ae05.m100272x93a2c499();
            }
            return -1L;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            this.f49945xe041c5d.mo100758x379286("getDemuxerOffsetInFile, mPlayerBase = null, return 0!");
            return -1L;
        }
        long mo100399x37da763a = interfaceC26139x4d493b7.mo100399x37da763a();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae052 = this.f49956x42b5ebb2;
        if (c26130x49ae052 != null) {
            c26130x49ae052.m100292x26792b0d(mo100399x37da763a);
        }
        return mo100399x37da763a;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDurationMs */
    public long mo100400x37a7fa50() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
        if (c26130x49ae05 != null && c26130x49ae05.m100273x37a7fa50() > 0) {
            return this.f49956x42b5ebb2.m100273x37a7fa50();
        }
        if (!this.f49954xce27a6f1.m100551x3465cdf3(11)) {
            return 0L;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            this.f49945xe041c5d.mo100758x379286("getDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long mo100400x37a7fa50 = interfaceC26139x4d493b7.mo100400x37a7fa50();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae052 = this.f49956x42b5ebb2;
        if (c26130x49ae052 != null) {
            c26130x49ae052.m100293x65cc485c(mo100400x37a7fa50);
        }
        return mo100400x37a7fa50;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDynamicStatisticParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            return null;
        }
        return interfaceC26139x4d493b7.mo100401x55ab8bad(z17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getGeneralPlayFlowParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            return null;
        }
        return interfaceC26139x4d493b7.mo100402xc0f8b3fa();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPlayableDurationMs */
    public long mo100403xac6a8d7e() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(12)) {
            return 0L;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            this.f49945xe041c5d.mo100758x379286("getBufferedDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long mo100403xac6a8d7e = interfaceC26139x4d493b7.mo100403xac6a8d7e();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
        if (c26130x49ae05 != null) {
            c26130x49ae05.m100295x43960f8a(mo100403xac6a8d7e);
        }
        return mo100403xac6a8d7e;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: getPlaybackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 mo100250xb1b8bbdf() {
        return this.f49956x42b5ebb2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: getPlayerType */
    public int mo100251x6b2cfdb1() {
        return this.f49951x591e3e08;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100404x160d5c1c() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        return (interfaceC26139x4d493b7 == null || interfaceC26139x4d493b7.mo100404x160d5c1c() == null) ? new com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[0] : this.f49946x5915b59f.mo100404x160d5c1c();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyLong */
    public long mo100405x2d67b867(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100405x2d67b867(i17);
        }
        this.f49945xe041c5d.mo100758x379286("getPropertyLong, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyString */
    public java.lang.String mo100406x7e95833c(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100406x7e95833c(i17);
        }
        this.f49945xe041c5d.mo100758x379286("getPropertyString, mPlayerBase = null, return !");
        return "";
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getTrackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        return interfaceC26139x4d493b7 != null ? interfaceC26139x4d493b7.mo100407x2ae89de3() : (com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[]) this.f49948xe6761b04.m100318x322b1ef0().toArray(new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[0]);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoHeight */
    public int mo100408x463504c() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
        if (c26130x49ae05 != null && c26130x49ae05.m100274x1c4fb41d() > 0) {
            return (int) this.f49956x42b5ebb2.m100274x1c4fb41d();
        }
        if (!this.f49954xce27a6f1.m100551x3465cdf3(13)) {
            this.f49945xe041c5d.mo100758x379286("getVideoHeight, state error!");
            return 0;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            this.f49945xe041c5d.mo100758x379286("getVideoHeight, mPlayerBase = null, return 0!");
            return 0;
        }
        int mo100408x463504c = interfaceC26139x4d493b7.mo100408x463504c();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae052 = this.f49956x42b5ebb2;
        if (c26130x49ae052 != null) {
            c26130x49ae052.m100294xf84e829(mo100408x463504c);
        }
        return mo100408x463504c;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoWidth */
    public int mo100409x8d5c7601() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
        if (c26130x49ae05 != null && c26130x49ae05.m100283x755bd410() > 0) {
            return (int) this.f49956x42b5ebb2.m100283x755bd410();
        }
        if (!this.f49954xce27a6f1.m100551x3465cdf3(13)) {
            this.f49945xe041c5d.mo100758x379286("getVideoWidth, state error!");
            return 0;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            this.f49945xe041c5d.mo100758x379286("getVideoWidth, mPlayerBase = null, return 0!");
            return 0;
        }
        int mo100409x8d5c7601 = interfaceC26139x4d493b7.mo100409x8d5c7601();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae052 = this.f49956x42b5ebb2;
        if (c26130x49ae052 != null) {
            c26130x49ae052.m100303x53e9ee84(mo100409x8d5c7601);
        }
        return mo100409x8d5c7601;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: isPlaying */
    public boolean mo100252xc00617a4() {
        com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614 = this.f49950xca98ef83;
        return c26187x2e775614 != null && c26187x2e775614.m101150x68ac491() == 5;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo100410x4799dc42(int i17, int i18) {
        this.f49949x21973431.mo100410x4799dc42(i17, i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: pause */
    public void mo100411x65825f6() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(6)) {
            throw new java.lang.IllegalStateException("error , pause , state invalid , current state :" + this.f49950xca98ef83);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            throw new java.lang.IllegalStateException("error , pause , player is null");
        }
        if (this.f49944xa74fcb0e) {
            this.f49950xca98ef83.m101143x9cb98ec1(6);
            return;
        }
        try {
            interfaceC26139x4d493b7.mo100411x65825f6();
            this.f49950xca98ef83.m101143x9cb98ec1(6);
        } catch (java.lang.IllegalStateException unused) {
            throw new java.lang.IllegalStateException("error , pause ,state invalid");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepare */
    public void mo100412xed060d07() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(1)) {
            throw new java.lang.IllegalStateException("error , prepare , state invalid , current state :" + this.f49950xca98ef83);
        }
        if (!this.f49948xe6761b04.m100344xb34ffd81()) {
            throw new java.io.IOException("error , prepare , data source invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100415x6761d4f();
            this.f49946x5915b59f.mo100414x41012807();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100361xe9b32f6e = m100361xe9b32f6e(m100381x740e0efd(), this.f49955xd01bfcd6);
        this.f49946x5915b59f = m100361xe9b32f6e;
        if (m100361xe9b32f6e == null) {
            throw new java.lang.RuntimeException("error , create player failed");
        }
        this.f49950xca98ef83.m101147xadb2108(3);
        this.f49950xca98ef83.m101143x9cb98ec1(3);
        this.f49946x5915b59f.mo100412xed060d07();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepareAsync */
    public void mo100413x857611b5() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(1)) {
            throw new java.lang.IllegalStateException("error , prepare , state invalid , current state :" + this.f49950xca98ef83);
        }
        if (!this.f49948xe6761b04.m100344xb34ffd81()) {
            throw new java.lang.IllegalStateException("error , prepare , state invalid , data source invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100415x6761d4f();
            this.f49946x5915b59f.mo100414x41012807();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100361xe9b32f6e = m100361xe9b32f6e(m100381x740e0efd(), this.f49955xd01bfcd6);
        this.f49946x5915b59f = m100361xe9b32f6e;
        if (m100361xe9b32f6e == null) {
            throw new java.lang.RuntimeException("error , create player failed");
        }
        this.f49950xca98ef83.m101147xadb2108(3);
        this.f49950xca98ef83.m101143x9cb98ec1(3);
        this.f49946x5915b59f.mo100413x857611b5();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: release */
    public void mo100414x41012807() {
        this.f49945xe041c5d.mo100757x3164ae("release, current state :" + this.f49950xca98ef83);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100414x41012807();
            this.f49946x5915b59f = null;
        }
        this.f49948xe6761b04.m100322x6761d4f();
        this.f49949x21973431.m100494x5a5b64d();
        this.f49957xd9d3d25c = null;
        this.f49944xa74fcb0e = false;
        this.f49950xca98ef83.m101143x9cb98ec1(11);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: reopenPlayer */
    public void mo100253x3a86783e() {
        m100380x3a86783e(this.f49951x591e3e08, 2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: reset */
    public void mo100415x6761d4f() {
        this.f49945xe041c5d.mo100757x3164ae("reset, current state :" + this.f49950xca98ef83);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100415x6761d4f();
            this.f49946x5915b59f.mo100414x41012807();
            this.f49946x5915b59f = null;
        }
        this.f49948xe6761b04.m100322x6761d4f();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f49956x42b5ebb2;
        if (c26130x49ae05 != null) {
            c26130x49ae05.m100263x5a5b64d();
        }
        this.f49957xd9d3d25c = null;
        this.f49944xa74fcb0e = false;
        this.f49950xca98ef83.m101143x9cb98ec1(1);
        this.f49950xca98ef83.m101148xd318a159(1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100416xc9fc1b13(int i17) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(9)) {
            if (this.f49946x5915b59f != null) {
                if (this.f49950xca98ef83.m101150x68ac491() == 7) {
                    this.f49950xca98ef83.m101143x9cb98ec1(5);
                }
                this.f49946x5915b59f.mo100416xc9fc1b13(i17);
                com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59 interfaceC26479xff169d59 = this.f49953x3d1c7c57;
                if (interfaceC26479xff169d59 != null) {
                    try {
                        interfaceC26479xff169d59.mo103244x35ce78(i17);
                        return;
                    } catch (java.lang.Exception unused) {
                        this.f49945xe041c5d.mo100758x379286("seekTo, rich media processor seek err.");
                        return;
                    }
                }
                return;
            }
            this.f49945xe041c5d.mo100758x379286("seekTo, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , seek to , state invalid , current state :" + this.f49950xca98ef83);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectProgram */
    public void mo100418x18ae2de8(int i17, long j17) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(18)) {
            throw new java.lang.IllegalStateException("error : selectProgram , state invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100404x160d5c1c = mo100404x160d5c1c();
        if (mo100404x160d5c1c == null) {
            mo100404x160d5c1c = new com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[0];
        }
        if (i17 < 0 || i17 > mo100404x160d5c1c.length - 1) {
            throw new java.lang.IllegalArgumentException("error : program index not found");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100418x18ae2de8(i17, j17);
        }
        this.f49948xe6761b04.m100335xc7826674(mo100404x160d5c1c[i17]);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectTrack */
    public void mo100419xc3b89af(int i17, long j17) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("error : selectTrack , state invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3 = mo100407x2ae89de3();
        if (mo100407x2ae89de3 == null) {
            this.f49945xe041c5d.mo100756x5c4d208("fatal err, tpTrackInfos is null");
            return;
        }
        if (i17 < 0 || i17 > mo100407x2ae89de3.length - 1) {
            throw new java.lang.IllegalArgumentException("error : track not found");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100419xc3b89af(i17, j17);
        }
        this.f49948xe6761b04.m100308x9590159d(i17, j17, mo100407x2ae89de3[i17]);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioGainRatio */
    public void mo100420x3aa51598(float f17) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("error , setAudioGainRatio , state invalid , current state :" + this.f49950xca98ef83);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100420x3aa51598(f17);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("setAudioGainRatio, mPlayerBase = null!");
        }
        this.f49948xe6761b04.m100323x3aa51598(f17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioNormalizeVolumeParams */
    public void mo100421x1e3370b9(java.lang.String str) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("error , setAudioNormalizeVolumeParams , state invalid , current state :" + this.f49950xca98ef83);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100421x1e3370b9(str);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("setAudioGainRatio, mPlayerBase = null!");
        }
        this.f49948xe6761b04.m100324x1e3370b9(str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100425x683d6267(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100427xfd27780d(boolean z17) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100427xfd27780d(z17);
            } else {
                this.f49945xe041c5d.mo100757x3164ae("setLoopback, mPlayerBase = null!");
            }
            this.f49948xe6761b04.m100332xfd27780d(z17);
            return;
        }
        throw new java.lang.IllegalStateException("error , setLoopback , state invalid , current state :" + this.f49950xca98ef83);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnAudioPcmOutputListener */
    public void mo100429x3282865a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        this.f49949x21973431.m100495x19b74abd(iOnAudioPcmOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnAudioProcessOutputListener */
    public void mo100430xb23c0daf(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        this.f49949x21973431.m100496xadcfb527(iOnAudioProcessOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnCompletionListener */
    public void mo100431xa4560c71(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener iOnCompletionListener) {
        this.f49949x21973431.m100497xa4560c71(iOnCompletionListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnDemuxerListener */
    public void mo100432xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener iOnDemuxerListener) {
        this.f49949x21973431.m100498xa8a04d4f(iOnDemuxerListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnDetailInfoListener */
    public void mo100433xa4b31634(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener iOnDetailInfoListener) {
        this.f49949x21973431.m100499xa4b31634(iOnDetailInfoListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnErrorListener */
    public void mo100434x6954c27b(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener) {
        this.f49949x21973431.m100500x6954c27b(iOnErrorListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnEventRecordListener */
    public void mo100435x5e0339be(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener iOnEventRecordListener) {
        this.f49949x21973431.m100501x5e0339be(iOnEventRecordListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnInfoListener */
    public void mo100436x40f8c003(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener) {
        this.f49949x21973431.m100502x40f8c003(iOnInfoListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: setOnPlayerStateChangeListener */
    public void mo100256xa23b7bf3(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener iOnStateChangeListener) {
        this.f49949x21973431.m100505xd77827d4(iOnStateChangeListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnPreparedListener */
    public void mo100437x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener) {
        this.f49949x21973431.m100503x5dd7c812(iOnPreparedListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSeekCompleteListener */
    public void mo100438xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f49949x21973431.m100504xe1a2e326(iOnSeekCompleteListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleDataListener */
    public void mo100439x8796ba37(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.f49949x21973431.m100506x8796ba37(iOnSubtitleDataListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleFrameOutListener */
    public void mo100440xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.f49949x21973431.m100507xa679d9ae(iOnSubtitleFrameOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoFrameOutListener */
    public void mo100441xf26db5af(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.f49949x21973431.m100508xf26db5af(iOnVideoFrameOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoProcessOutputListener */
    public void mo100442x7e05de2a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        this.f49949x21973431.m100509x9b9c694c(iOnVideoProcessOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoSizeChangedListener */
    public void mo100443x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.f49949x21973431.m100510x2d6d87cd(iOnVideoSizeChangedListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOutputMute */
    public void mo100444xd0747cbc(boolean z17) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("error , setOutputMute , state invalid , current state :" + this.f49950xca98ef83);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100444xd0747cbc(z17);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("setOutputMute, mPlayerBase = null!");
        }
        this.f49948xe6761b04.m100334xd0747cbc(z17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySharpenSwitch */
    public void mo100445x41b4a011() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("error , setSharpenSwitch , state invalid , current state :" + this.f49950xca98ef83);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100445x41b4a011();
        } else {
            this.f49945xe041c5d.mo100757x3164ae("setSharpenSwitch, mPlayerBase = null!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySpeedRatio */
    public void mo100446xd079f5a(float f17) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("error , setPlaySpeedRatio , state invalid , current state :" + this.f49950xca98ef83);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100446xd079f5a(f17);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("setPlaySpeedRatio, mPlayerBase = null!");
        }
        this.f49948xe6761b04.m100336x41557a06(f17);
        com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59 interfaceC26479xff169d59 = this.f49953x3d1c7c57;
        if (interfaceC26479xff169d59 != null) {
            try {
                interfaceC26479xff169d59.mo103246xe8059f1d(f17);
            } catch (java.lang.Exception unused) {
                this.f49945xe041c5d.mo100758x379286("setPlaySpeedRatio, rich media processor setPlaySpeedRatio err.");
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlayerOptionalParam */
    public void mo100447x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            throw new java.lang.IllegalStateException("setPlayerOptionalParam , state invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100447x1ba09fea(c26182x67c007f1);
        }
        this.f49948xe6761b04.m100307x3ee04007(c26182x67c007f1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: setRichMediaSynchronizer */
    public void mo100257xeebc4268(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625 interfaceC26248xbe616625) {
        if (interfaceC26248xbe616625 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59 interfaceC26479xff169d59 = this.f49953x3d1c7c57;
            if (interfaceC26479xff169d59 != null) {
                interfaceC26479xff169d59.mo103245x2817e3e8(null);
            }
            this.f49953x3d1c7c57 = null;
            return;
        }
        if (interfaceC26248xbe616625 instanceof com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59) {
            com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59 interfaceC26479xff169d592 = (com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59) interfaceC26248xbe616625;
            this.f49953x3d1c7c57 = interfaceC26479xff169d592;
            interfaceC26479xff169d592.mo103245x2817e3e8(new com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59.ITPRichMediaInnerSynchronizerListener() { // from class: com.tencent.thumbplayer.adapter.TPPlayerAdapter.1
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59.ITPRichMediaInnerSynchronizerListener
                /* renamed from: onGetCurrentPositionMs */
                public long mo100457xa74df6d1(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625 interfaceC26248xbe6166252) {
                    return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012.this.mo100398xddd35a52();
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurface */
    public void mo100448x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(4)) {
            throw new java.lang.IllegalStateException("setSurface , state invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100448x42c875eb(surface, i17);
        }
        this.f49948xe6761b04.m100337x42c875eb(surface, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurfaceHolder */
    public void mo100449x5660d377(android.view.SurfaceHolder surfaceHolder) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100449x5660d377(surfaceHolder);
        }
        this.f49948xe6761b04.m100338x5660d377(surfaceHolder);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: setVideoInfo */
    public void mo100258xab2f6987(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(2)) {
            this.f49945xe041c5d.mo100756x5c4d208("setVideoInfo state invalid");
        }
        if (c26204xf8de58ad != null) {
            this.f49956x42b5ebb2.m100294xf84e829(c26204xf8de58ad.m101212x1c4fb41d());
            this.f49956x42b5ebb2.m100303x53e9ee84(c26204xf8de58ad.m101215x755bd410());
            this.f49956x42b5ebb2.m100291xdfee3b55(c26204xf8de58ad.m101210xb1c9ed49());
            this.f49956x42b5ebb2.m100299xc6999019(c26204xf8de58ad.m101214x9050914c());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: start */
    public void mo100450x68ac462() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(5)) {
            throw new java.lang.IllegalStateException("error , start , state invalid , current state :" + this.f49950xca98ef83);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            throw new java.lang.IllegalStateException("error , start , player is null");
        }
        try {
            interfaceC26139x4d493b7.mo100450x68ac462();
            this.f49950xca98ef83.m101143x9cb98ec1(5);
        } catch (java.lang.IllegalStateException unused) {
            throw new java.lang.IllegalStateException("error , start ,state invalid");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: stop */
    public void mo100451x360802() {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(7)) {
            throw new java.lang.IllegalStateException("error , stop , state invalid , current state :" + this.f49950xca98ef83);
        }
        if (this.f49946x5915b59f == null) {
            throw new java.lang.IllegalStateException("error , stop , player is null");
        }
        try {
            try {
                this.f49950xca98ef83.m101143x9cb98ec1(8);
                this.f49946x5915b59f.mo100451x360802();
            } catch (java.lang.IllegalStateException unused) {
                throw new java.lang.IllegalStateException("error , stop ,state invalid");
            }
        } finally {
            this.f49950xca98ef83.m101143x9cb98ec1(9);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100453x81d257a7(java.lang.String str, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchHdrModeWithSurface */
    public void mo100455x40944be2(android.view.Surface surface, int i17, int i18) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100455x40944be2(surface, i17, i18);
        } else {
            this.f49945xe041c5d.mo100757x3164ae("setOutputMute, mPlayerBase = null!");
        }
        this.f49948xe6761b04.m100337x42c875eb(surface, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: updateLoggerContext */
    public void mo100456x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f49955xd01bfcd6.m103242xce0038c9(c26478xc50084e3, TAG);
        this.f49945xe041c5d.mo103228xdf8cd0a6(this.f49955xd01bfcd6);
        this.f49949x21973431.m100511x8bd16e11(this.f49955xd01bfcd6.m103238xb5887064());
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100456x80f0bbb6(this.f49955xd01bfcd6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: updateVideoInfo */
    public void mo100261x9748f100(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            this.f49945xe041c5d.mo100756x5c4d208("updateVideoInfo state invalid");
        }
        if (c26204xf8de58ad != null) {
            this.f49956x42b5ebb2.m100294xf84e829(c26204xf8de58ad.m101212x1c4fb41d());
            this.f49956x42b5ebb2.m100303x53e9ee84(c26204xf8de58ad.m101215x755bd410());
            this.f49956x42b5ebb2.m100291xdfee3b55(c26204xf8de58ad.m101210xb1c9ed49());
            this.f49956x42b5ebb2.m100299xc6999019(c26204xf8de58ad.m101214x9050914c());
        }
    }

    /* renamed from: reopenPlayer */
    private void m100380x3a86783e(int i17, int i18) {
        if (i18 == 1) {
            this.f49949x21973431.mo100464xc39adf2d(1013, i17, 0L, null);
        } else {
            this.f49949x21973431.mo100464xc39adf2d(200, 0L, 0L, null);
        }
        this.f49952x5d21824 = i18;
        com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 c26187x2e775614 = this.f49950xca98ef83;
        c26187x2e775614.m101148xd318a159(c26187x2e775614.m101150x68ac491());
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            long mo100398xddd35a52 = interfaceC26139x4d493b7.mo100398xddd35a52();
            this.f49945xe041c5d.mo100757x3164ae("switchPlayer, current position:" + mo100398xddd35a52);
            this.f49956x42b5ebb2.m100290xb96966c6(mo100398xddd35a52);
            this.f49956x42b5ebb2.m100295x43960f8a(this.f49946x5915b59f.mo100403xac6a8d7e());
            this.f49946x5915b59f.mo100415x6761d4f();
            this.f49946x5915b59f.mo100414x41012807();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100361xe9b32f6e = m100361xe9b32f6e(i17, this.f49955xd01bfcd6);
        this.f49946x5915b59f = m100361xe9b32f6e;
        if (m100361xe9b32f6e != null) {
            this.f49944xa74fcb0e = true;
            this.f49945xe041c5d.mo100757x3164ae("switch player to type:" + this.f49951x591e3e08);
            if (this.f49956x42b5ebb2 != null) {
                this.f49946x5915b59f.mo100447x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(100, this.f49956x42b5ebb2.m100270xddd35a52()));
            }
            this.f49950xca98ef83.m101147xadb2108(3);
            this.f49946x5915b59f.mo100413x857611b5();
            return;
        }
        throw new java.lang.RuntimeException("error , create player failed");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addAudioTrackSource */
    public void mo100385xa28fa651(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100385xa28fa651(str, map, str2, list);
            }
            this.f49948xe6761b04.m100306xa28fa651(str, map, str2, list);
            return;
        }
        throw new java.lang.IllegalStateException("error : addAudioTrackSource, state invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addSubtitleSource */
    public void mo100387x14654554(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100387x14654554(str, map, str2, str3);
            }
            this.f49948xe6761b04.m100309x14654554(str, map, str2, str3);
            return;
        }
        throw new java.lang.IllegalStateException("error : addSubtitleSource, state invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100426x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100454x81d257a7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, int i17, long j17) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: setDataSource */
    public void mo100254x683d6267(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18) {
        mo100255x683d6267(c26142x43104e18, (java.util.Map<java.lang.String, java.lang.String>) null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: switchDefinition */
    public void mo100259x81d257a7(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18, int i17, long j17) {
        java.lang.String m100558x6e7e3f29;
        if (this.f49954xce27a6f1.m100551x3465cdf3(17)) {
            this.f49948xe6761b04.m100327x683d6267(c26142x43104e18, (java.util.Map<java.lang.String, java.lang.String>) null);
            if (this.f49946x5915b59f != null) {
                int i18 = this.f49951x591e3e08;
                if (i18 == 2) {
                    m100558x6e7e3f29 = c26142x43104e18.m100557x18ed3d2c();
                } else {
                    m100558x6e7e3f29 = i18 == 1 ? c26142x43104e18.m100558x6e7e3f29() : "";
                }
                this.f49946x5915b59f.mo100453x81d257a7(m100558x6e7e3f29, i17, j17);
                return;
            }
            this.f49945xe041c5d.mo100758x379286("switchDefinition, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , switch definition , state invalid , current state :" + this.f49950xca98ef83);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: setDataSource */
    public void mo100255x683d6267(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18, java.util.Map<java.lang.String, java.lang.String> map) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(2)) {
            this.f49948xe6761b04.m100327x683d6267(c26142x43104e18, map);
            this.f49950xca98ef83.m101143x9cb98ec1(2);
            return;
        }
        throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100428xfd27780d(boolean z17, long j17, long j18) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100428xfd27780d(z17, j17, j18);
            } else {
                this.f49945xe041c5d.mo100757x3164ae("setLoopback, mPlayerBase = null!");
            }
            this.f49948xe6761b04.m100333xfd27780d(z17, j17, j18);
            return;
        }
        throw new java.lang.IllegalStateException("error , setLoopback , state invalid , current state :" + this.f49950xca98ef83);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100423x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(2)) {
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
        }
        if (parcelFileDescriptor != null) {
            this.f49948xe6761b04.m100326x683d6267(parcelFileDescriptor);
            this.f49950xca98ef83.m101143x9cb98ec1(2);
            return;
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , pfd invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100417xc9fc1b13(int i17, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSeekMode int i18) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(9)) {
            if (this.f49946x5915b59f != null) {
                if (this.f49950xca98ef83.m101150x68ac491() == 7) {
                    this.f49950xca98ef83.m101143x9cb98ec1(5);
                }
                this.f49946x5915b59f.mo100417xc9fc1b13(i17, i18);
                com.p314xaae8f345.p3006xb8ff1437.p3056xce853088.InterfaceC26479xff169d59 interfaceC26479xff169d59 = this.f49953x3d1c7c57;
                if (interfaceC26479xff169d59 != null) {
                    try {
                        interfaceC26479xff169d59.mo103244x35ce78(i17);
                        return;
                    } catch (java.lang.Exception unused) {
                        this.f49945xe041c5d.mo100758x379286("seekTo, rich media processor seek err.");
                        return;
                    }
                }
                return;
            }
            this.f49945xe041c5d.mo100758x379286("seekTo, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , seek to , state invalid , current state :" + this.f49950xca98ef83);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9
    /* renamed from: switchDefinition */
    public void mo100260x81d257a7(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18, java.util.Map<java.lang.String, java.lang.String> map, int i17, long j17) {
        java.lang.String m100558x6e7e3f29;
        if (this.f49954xce27a6f1.m100551x3465cdf3(17)) {
            this.f49948xe6761b04.m100327x683d6267(c26142x43104e18, map);
            if (this.f49946x5915b59f != null) {
                int i18 = this.f49951x591e3e08;
                if (i18 == 2) {
                    m100558x6e7e3f29 = c26142x43104e18.m100557x18ed3d2c();
                } else {
                    m100558x6e7e3f29 = i18 == 1 ? c26142x43104e18.m100558x6e7e3f29() : "";
                }
                this.f49946x5915b59f.mo100454x81d257a7(m100558x6e7e3f29, map, i17, j17);
                return;
            }
            this.f49945xe041c5d.mo100758x379286("switchDefinition, mPlayerBase = null!");
            return;
        }
        throw new java.lang.IllegalStateException("error , switch definition , state invalid , current state :" + this.f49950xca98ef83);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100422x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(2)) {
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
        }
        if (assetFileDescriptor != null) {
            this.f49948xe6761b04.m100325x683d6267(assetFileDescriptor);
            this.f49950xca98ef83.m101143x9cb98ec1(2);
            return;
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , afd invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100424x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        if (!this.f49954xce27a6f1.m100551x3465cdf3(2)) {
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid");
        }
        if (interfaceC26214xf9e9afd1 != null) {
            this.f49948xe6761b04.m100328x683d6267(interfaceC26214xf9e9afd1);
            this.f49950xca98ef83.m101143x9cb98ec1(2);
            return;
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , mediaAsset invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100452x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
        if (this.f49954xce27a6f1.m100551x3465cdf3(17)) {
            this.f49948xe6761b04.m100328x683d6267(interfaceC26214xf9e9afd1);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f49946x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100452x81d257a7(interfaceC26214xf9e9afd1, i17, j17);
                return;
            } else {
                this.f49945xe041c5d.mo100758x379286("switchDefinition, mPlayerBase = null!");
                return;
            }
        }
        throw new java.lang.IllegalStateException("error , switch definition , state invalid , current state :" + this.f49950xca98ef83);
    }
}

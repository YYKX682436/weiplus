package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0;

/* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer */
/* loaded from: classes16.dex */
public class C26147x133ae47c implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 {
    private static final java.lang.String TAG = "TPSystemClipPlayer";

    /* renamed from: isPlayingClip */
    private boolean f50083x9a49bd14;

    /* renamed from: isSwitchingDef */
    private boolean f50084x41e44341;

    /* renamed from: mClipList */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> f50085x5bae479b;

    /* renamed from: mContext */
    private android.content.Context f50086xd6cfe882;

    /* renamed from: mCurrentClip */
    private int f50087xcddb81bc = 0;

    /* renamed from: mLogger */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d f50088xe041c5d;

    /* renamed from: mPlayerBase */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 f50089x5915b59f;

    /* renamed from: mPlayerCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.TPPlayerBaseCallback f50090x2273b813;

    /* renamed from: mPlayerInitParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d f50091xe6761b04;

    /* renamed from: mPlayerListeners */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 f50092x21973431;

    /* renamed from: mPlayerState */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614 f50093xca98ef83;

    /* renamed from: mStateChecker */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26137xc88409a7 f50094xce27a6f1;

    /* renamed from: mSwitchingDefTagQueue */
    private java.util.LinkedList<java.lang.Long> f50095x970a3bb;

    /* renamed from: mTPLoggerContext */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 f50096xd01bfcd6;

    /* renamed from: mTPPlaybackInfo */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 f50097x42b5ebb2;

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemClipPlayer$TPPlayerBaseCallback */
    /* loaded from: classes16.dex */
    public class TPPlayerBaseCallback implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener {
        private TPPlayerBaseCallback() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener
        /* renamed from: onAudioPcmOut */
        public void mo100458x30daf82b(com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100626x33455db0(c26169xaecce4f3);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener
        /* renamed from: onAudioProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100459xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100627xbf937c41(c26188x7aa7007a);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener
        /* renamed from: onCompletion */
        public void mo100460xa6db431b() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100628xdd3e0c80();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener
        /* renamed from: onError */
        public void mo100463xaf8aa769(int i17, int i18, long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100629xd1f81421(i17, i18, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener
        /* renamed from: onInfo */
        public void mo100464xc39adf2d(int i17, long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100630xabf0fb75(i17, j17, j18, obj);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener
        /* renamed from: onPrepared */
        public void mo100465x58d5b73c() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100631xb4b46f84();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener
        /* renamed from: onSeekComplete */
        public void mo100467xe1fdf750() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100632x43b74b98();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener
        /* renamed from: onSubtitleData */
        public void mo100468xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100633x5d17c3a9(c26193x359f687e);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener
        /* renamed from: onVideoFrameOut */
        public void mo100470xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100634x968b6155(c26203x3f6f032e);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener
        /* renamed from: onVideoProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100471x18d178b4(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100635xd93604fc(c26188x7aa7007a);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener
        /* renamed from: onVideoSizeChanged */
        public void mo100472xdc9583f7(long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.this.m100636x97a924c5(j17, j18);
        }
    }

    public C26147x133ae47c(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e32 = new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, TAG);
        this.f50096xd01bfcd6 = c26478xc50084e32;
        this.f50088xe041c5d = new com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d(c26478xc50084e32);
        this.f50086xd6cfe882 = context;
        this.f50093xca98ef83 = new com.p314xaae8f345.p3006xb8ff1437.api.C26187x2e775614();
        this.f50091xe6761b04 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d();
        this.f50090x2273b813 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26147x133ae47c.TPPlayerBaseCallback();
        this.f50092x21973431 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1(this.f50088xe041c5d.mo103226xb5887064());
        this.f50094xce27a6f1 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26137xc88409a7(this.f50093xca98ef83);
        this.f50085x5bae479b = new java.util.ArrayList();
    }

    /* renamed from: createPlayerBase */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100623xe9b32f6e() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a c26148xea2cb1a = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a(this.f50086xd6cfe882, this.f50096xd01bfcd6);
        if (this.f50097x42b5ebb2 == null) {
            this.f50097x42b5ebb2 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05();
        }
        m100639x1404083e(c26148xea2cb1a);
        return c26148xea2cb1a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getClipListWithAsset */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> m100624x916e0ca6(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        java.util.List list;
        boolean z17 = interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26270x2b7d01c2;
        if (!z17 && !(interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9) && !(interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399)) {
            throw new java.lang.IllegalStateException("system mediaPlayer : media asset is illegal source!");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101292x9ba80088 = ((com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26270x2b7d01c2) interfaceC26214xf9e9afd1).mo101292x9ba80088();
            if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(mo101292x9ba80088) || mo101292x9ba80088.get(0) == null) {
                throw new java.lang.IllegalStateException("empty av tracks when set data source!");
            }
            list = mo101292x9ba80088.get(0).mo101313xe6d93963();
        } else if (interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9) {
            list = ((com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9) interfaceC26214xf9e9afd1).mo101313xe6d93963();
        } else {
            arrayList.add((com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c) interfaceC26214xf9e9afd1);
            list = arrayList;
        }
        long j17 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            ((com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c) list.get(i17)).mo101330xdecd75ef(j17);
            j17 += ((com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c) list.get(i17)).mo101325x81a6b901();
        }
        return list;
    }

    /* renamed from: getCurrentClip */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c m100625xfda4b733() {
        return this.f50085x5bae479b.get(this.f50087xcddb81bc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnAudioFrameOut */
    public void m100626x33455db0(com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
        if (this.f50094xce27a6f1.m100552xd045a15a(7)) {
            this.f50092x21973431.mo100458x30daf82b(c26169xaecce4f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnAudioProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m100627xbf937c41(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        if (this.f50094xce27a6f1.m100552xd045a15a(7)) {
            return this.f50092x21973431.mo100459xff2eeff9(c26188x7aa7007a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnComplete */
    public void m100628xdd3e0c80() {
        if (this.f50094xce27a6f1.m100552xd045a15a(2)) {
            if (this.f50087xcddb81bc >= this.f50085x5bae479b.size() - 1) {
                this.f50093xca98ef83.m101143x9cb98ec1(7);
                this.f50092x21973431.mo100460xa6db431b();
                return;
            }
            try {
                m100640x447e0735(this.f50087xcddb81bc + 1, 0L);
            } catch (java.io.IOException e17) {
                this.f50088xe041c5d.mo100757x3164ae("handleOnComplete:" + e17.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnError */
    public void m100629xd1f81421(int i17, int i18, long j17, long j18) {
        if (this.f50094xce27a6f1.m100552xd045a15a(4)) {
            this.f50092x21973431.mo100463xaf8aa769(i17, i18, j17, j18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnInfo */
    public void m100630xabf0fb75(int i17, long j17, long j18, java.lang.Object obj) {
        if (this.f50094xce27a6f1.m100552xd045a15a(3)) {
            this.f50092x21973431.mo100464xc39adf2d(i17, j17, j18, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnPrepared */
    public void m100631xb4b46f84() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 c26135xc8cc64f1 = this.f50092x21973431;
        if (c26135xc8cc64f1 != null) {
            c26135xc8cc64f1.mo100464xc39adf2d(152, this.f50087xcddb81bc, 0L, null);
        }
        if (!this.f50083x9a49bd14) {
            if (this.f50094xce27a6f1.m100552xd045a15a(1)) {
                this.f50093xca98ef83.m101143x9cb98ec1(4);
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 c26135xc8cc64f12 = this.f50092x21973431;
                if (c26135xc8cc64f12 != null) {
                    c26135xc8cc64f12.mo100465x58d5b73c();
                }
                m100638x3256a1ef(this.f50089x5915b59f);
                return;
            }
            return;
        }
        mo100450x68ac462();
        if (!this.f50084x41e44341 || this.f50092x21973431 == null || com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f50095x970a3bb)) {
            return;
        }
        java.lang.Long poll = this.f50095x970a3bb.poll();
        if (poll != null) {
            this.f50092x21973431.mo100464xc39adf2d(3, poll.longValue(), 0L, null);
        }
        this.f50084x41e44341 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnSeekComplete */
    public void m100632x43b74b98() {
        if (this.f50094xce27a6f1.m100552xd045a15a(5)) {
            if (this.f50093xca98ef83.is(7)) {
                mo100450x68ac462();
            }
            this.f50092x21973431.mo100467xe1fdf750();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnSubtitleData */
    public void m100633x5d17c3a9(com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
        if (this.f50094xce27a6f1.m100552xd045a15a(7)) {
            this.f50092x21973431.mo100468xfb5e6f61(c26193x359f687e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnVideoFrameOut */
    public void m100634x968b6155(com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
        if (this.f50094xce27a6f1.m100552xd045a15a(7)) {
            this.f50092x21973431.mo100470xc11a2c9d(c26203x3f6f032e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnVideoProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m100635xd93604fc(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        if (this.f50094xce27a6f1.m100552xd045a15a(7)) {
            return this.f50092x21973431.mo100471x18d178b4(c26188x7aa7007a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnVideoSizeChange */
    public void m100636x97a924c5(long j17, long j18) {
        if (this.f50094xce27a6f1.m100552xd045a15a(6)) {
            this.f50097x42b5ebb2.m100294xf84e829(j18);
            this.f50097x42b5ebb2.m100303x53e9ee84(j17);
            this.f50092x21973431.mo100472xdc9583f7(j17, j18);
        }
    }

    /* renamed from: selectClipPlayer */
    private void m100637x677e746d(int i17) {
        for (int i18 = 0; i18 < this.f50085x5bae479b.size(); i18++) {
            long j17 = i17;
            if (this.f50085x5bae479b.get(i18).mo101326xa7f6dc7b() <= j17 && j17 <= this.f50085x5bae479b.get(i18).mo101326xa7f6dc7b() + this.f50085x5bae479b.get(i18).mo101325x81a6b901()) {
                try {
                    m100640x447e0735(i18, j17 - this.f50085x5bae479b.get(i18).mo101326xa7f6dc7b());
                } catch (java.io.IOException e17) {
                    this.f50088xe041c5d.mo100757x3164ae("selectClipPlayer:" + e17.toString());
                }
            }
        }
    }

    /* renamed from: setPlayerParamAfterPrepared */
    private void m100638x3256a1ef(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7) {
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3 = mo100407x2ae89de3();
        if (mo100407x2ae89de3 == null) {
            return;
        }
        for (int i17 = 0; i17 < mo100407x2ae89de3.length; i17++) {
            if (mo100407x2ae89de3[i17].m101183xb2c87fbf(this.f50091xe6761b04.m100317xeed65ff4(mo100407x2ae89de3[i17].m101187x2aedc86f()))) {
                interfaceC26139x4d493b7.mo100419xc3b89af(i17, -1L);
            }
        }
    }

    /* renamed from: setPlayerParamBeforePrepare */
    private void m100639x1404083e(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7) {
        if (1 == this.f50091xe6761b04.m100313x4bd85c65().m100515xfb85f7b0()) {
            interfaceC26139x4d493b7.mo100423x683d6267(this.f50091xe6761b04.m100313x4bd85c65().m100519xc3e78274());
        } else if (4 == this.f50091xe6761b04.m100313x4bd85c65().m100515xfb85f7b0()) {
            interfaceC26139x4d493b7.mo100422x683d6267(this.f50091xe6761b04.m100313x4bd85c65().m100513xb24cd1b());
        }
        if (this.f50091xe6761b04.m100313x4bd85c65().m100515xfb85f7b0() == 0) {
            interfaceC26139x4d493b7.mo100426x683d6267(this.f50091xe6761b04.m100313x4bd85c65().url(), this.f50091xe6761b04.m100313x4bd85c65().m100516x6255d5de());
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> it = this.f50091xe6761b04.m100320xb38c2906().iterator();
        while (it.hasNext()) {
            interfaceC26139x4d493b7.mo100447x1ba09fea(it.next());
        }
        for (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.SubtitleAttribute subtitleAttribute : this.f50091xe6761b04.m100340x99149c80()) {
            interfaceC26139x4d493b7.mo100387x14654554(subtitleAttribute.url, subtitleAttribute.f49936x24345135, subtitleAttribute.f49937xad05ed8e, subtitleAttribute.f49938x337a8b);
        }
        for (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d.AudioTrackAttribute audioTrackAttribute : this.f50091xe6761b04.m100312xe0c426e3()) {
            interfaceC26139x4d493b7.mo100385xa28fa651(audioTrackAttribute.url, audioTrackAttribute.f49928x24345135, audioTrackAttribute.f49929x337a8b, audioTrackAttribute.f49927x95ffdcfb);
        }
        if (this.f50091xe6761b04.m100319x8694d98b() != null) {
            interfaceC26139x4d493b7.mo100428xfd27780d(this.f50091xe6761b04.m100319x8694d98b().f49931x574c80d5, this.f50091xe6761b04.m100319x8694d98b().f49932xc3950ab1, this.f50091xe6761b04.m100319x8694d98b().f49930x5a7f4bea);
        }
        interfaceC26139x4d493b7.mo100444xd0747cbc(this.f50091xe6761b04.m100321xb40f76ba());
        if (this.f50091xe6761b04.m100310x8416e096() != 0.0f) {
            interfaceC26139x4d493b7.mo100420x3aa51598(this.f50091xe6761b04.m100310x8416e096());
        }
        if (this.f50091xe6761b04.m100339x24f07404() != 0.0f) {
            interfaceC26139x4d493b7.mo100446xd079f5a(this.f50091xe6761b04.m100339x24f07404());
        }
        if (this.f50091xe6761b04.m100342x9189ecad() instanceof android.view.SurfaceHolder) {
            interfaceC26139x4d493b7.mo100449x5660d377((android.view.SurfaceHolder) this.f50091xe6761b04.m100342x9189ecad());
        } else if (this.f50091xe6761b04.m100342x9189ecad() instanceof android.view.Surface) {
            interfaceC26139x4d493b7.mo100448x42c875eb((android.view.Surface) this.f50091xe6761b04.m100342x9189ecad(), this.f50091xe6761b04.m100343xac61d187());
        }
        interfaceC26139x4d493b7.mo100436x40f8c003(this.f50090x2273b813);
        interfaceC26139x4d493b7.mo100437x5dd7c812(this.f50090x2273b813);
        interfaceC26139x4d493b7.mo100431xa4560c71(this.f50090x2273b813);
        interfaceC26139x4d493b7.mo100434x6954c27b(this.f50090x2273b813);
        interfaceC26139x4d493b7.mo100438xe1a2e326(this.f50090x2273b813);
        interfaceC26139x4d493b7.mo100443x2d6d87cd(this.f50090x2273b813);
        interfaceC26139x4d493b7.mo100439x8796ba37(this.f50090x2273b813);
    }

    /* renamed from: switchPlayer */
    private void m100640x447e0735(int i17, long j17) {
        this.f50088xe041c5d.mo103225x5b09653("switchPlayer: clipNo:" + i17 + "   startPostion:" + j17);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100414x41012807();
        }
        this.f50083x9a49bd14 = true;
        this.f50087xcddb81bc = i17;
        this.f50091xe6761b04.m100330x683d6267(this.f50085x5bae479b.get(i17).mo101324x5000ed37(), this.f50085x5bae479b.get(this.f50087xcddb81bc).mo101276x1275092b());
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100623xe9b32f6e = m100623xe9b32f6e();
        this.f50089x5915b59f = m100623xe9b32f6e;
        if (m100623xe9b32f6e == null) {
            throw new java.lang.RuntimeException("error , create player failed");
        }
        this.f50089x5915b59f.mo100447x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(100, j17));
        this.f50089x5915b59f.mo100412xed060d07();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addAudioTrackSource */
    public void mo100384xa28fa651(java.lang.String str, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list) {
        this.f50088xe041c5d.mo100756x5c4d208("addAudioTrackSource not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addSubtitleSource */
    public void mo100386x14654554(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f50088xe041c5d.mo100756x5c4d208("addSubtitleSource not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: captureVideo */
    public void mo100388x2d34f8d5(com.p314xaae8f345.p3006xb8ff1437.api.C26171xafafaf50 c26171xafafaf50, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100388x2d34f8d5(c26171xafafaf50, interfaceC26170x325bffaf);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: configBufferDurationAsync */
    public int mo100389x59e24e46(int i17, long j17, long j18, long j19) {
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: deselectTrack */
    public void mo100390x4080528e(int i17, long j17) {
        this.f50088xe041c5d.mo100756x5c4d208("deselectTrack not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getAutoExpendBufferCount */
    public int mo100391xa42b888c() {
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxReadDurationPosMs */
    public long mo100392xdc51b7e8() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxReadFileOffset */
    public long mo100393x69f9266d() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    public long mo100394xed03e74f() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxWriteFileOffset */
    public long mo100395x1e708866() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferedDurationMs */
    public long mo100396x23e0c68f() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferedSize */
    public long mo100397x45feff6() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getCurrentPositionMs */
    public long mo100398xddd35a52() {
        long j17 = 0;
        for (int i17 = 0; i17 < this.f50085x5bae479b.size() && i17 < this.f50087xcddb81bc; i17++) {
            j17 += this.f50085x5bae479b.get(i17).mo101325x81a6b901();
        }
        return !this.f50094xce27a6f1.m100551x3465cdf3(12) ? j17 : j17 + this.f50089x5915b59f.mo100398xddd35a52();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDemuxerOffsetInFile */
    public long mo100399x37da763a() {
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDurationMs */
    public long mo100400x37a7fa50() {
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> it = this.f50085x5bae479b.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += it.next().mo101325x81a6b901();
        }
        return j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDynamicStatisticParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad(boolean z17) {
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getGeneralPlayFlowParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa() {
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPlayableDurationMs */
    public long mo100403xac6a8d7e() {
        if (this.f50094xce27a6f1.m100551x3465cdf3(15)) {
            return this.f50089x5915b59f.mo100403xac6a8d7e();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f50097x42b5ebb2;
        if (c26130x49ae05 != null) {
            return c26130x49ae05.m100275xac6a8d7e();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100404x160d5c1c() {
        this.f50088xe041c5d.mo100756x5c4d208("getProgramInfo not supported.");
        return new com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[0];
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyLong */
    public long mo100405x2d67b867(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            return interfaceC26139x4d493b7.mo100405x2d67b867(i17);
        }
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyString */
    public java.lang.String mo100406x7e95833c(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        return interfaceC26139x4d493b7 != null ? interfaceC26139x4d493b7.mo100406x7e95833c(i17) : "";
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getTrackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3() {
        this.f50088xe041c5d.mo100756x5c4d208("getTrackInfo not supported.");
        return new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[0];
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoHeight */
    public int mo100408x463504c() {
        long m100274x1c4fb41d;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f50097x42b5ebb2;
        if (c26130x49ae05 == null) {
            return 0;
        }
        if (c26130x49ae05.m100274x1c4fb41d() > 0) {
            m100274x1c4fb41d = this.f50097x42b5ebb2.m100274x1c4fb41d();
        } else {
            if (!this.f50094xce27a6f1.m100551x3465cdf3(13)) {
                return 0;
            }
            this.f50097x42b5ebb2.m100294xf84e829(this.f50089x5915b59f.mo100408x463504c());
            m100274x1c4fb41d = this.f50097x42b5ebb2.m100274x1c4fb41d();
        }
        return (int) m100274x1c4fb41d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoWidth */
    public int mo100409x8d5c7601() {
        long m100283x755bd410;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05 = this.f50097x42b5ebb2;
        if (c26130x49ae05 == null) {
            return 0;
        }
        if (c26130x49ae05.m100283x755bd410() > 0) {
            m100283x755bd410 = this.f50097x42b5ebb2.m100283x755bd410();
        } else {
            if (!this.f50094xce27a6f1.m100551x3465cdf3(13)) {
                return 0;
            }
            this.f50097x42b5ebb2.m100303x53e9ee84(this.f50089x5915b59f.mo100409x8d5c7601());
            m100283x755bd410 = this.f50097x42b5ebb2.m100283x755bd410();
        }
        return (int) m100283x755bd410;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: pause */
    public void mo100411x65825f6() {
        if (this.f50094xce27a6f1.m100551x3465cdf3(6)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
            if (interfaceC26139x4d493b7 == null) {
                throw new java.lang.IllegalStateException("error , pause , player is null");
            }
            try {
                interfaceC26139x4d493b7.mo100411x65825f6();
                this.f50093xca98ef83.m101143x9cb98ec1(6);
            } catch (java.lang.IllegalStateException unused) {
                throw new java.lang.IllegalStateException("error , pause ,state invalid");
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepare */
    public void mo100412xed060d07() {
        if (this.f50094xce27a6f1.m100551x3465cdf3(1)) {
            if (!this.f50091xe6761b04.m100344xb34ffd81()) {
                throw new java.io.IOException("error , prepare , data source invalid");
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100623xe9b32f6e = m100623xe9b32f6e();
            this.f50089x5915b59f = m100623xe9b32f6e;
            if (m100623xe9b32f6e == null) {
                throw new java.lang.RuntimeException("error , create player failed");
            }
            this.f50093xca98ef83.m101143x9cb98ec1(3);
            this.f50089x5915b59f.mo100412xed060d07();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepareAsync */
    public void mo100413x857611b5() {
        if (this.f50094xce27a6f1.m100551x3465cdf3(1)) {
            if (!this.f50091xe6761b04.m100344xb34ffd81()) {
                throw new java.lang.IllegalStateException("error , prepare , state invalid , data source invalid");
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 m100623xe9b32f6e = m100623xe9b32f6e();
            this.f50089x5915b59f = m100623xe9b32f6e;
            if (m100623xe9b32f6e == null) {
                throw new java.lang.RuntimeException("error , create player failed");
            }
            this.f50093xca98ef83.m101143x9cb98ec1(3);
            this.f50089x5915b59f.mo100413x857611b5();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: release */
    public void mo100414x41012807() {
        this.f50088xe041c5d.mo100757x3164ae("release, current state:" + this.f50093xca98ef83);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100414x41012807();
            this.f50089x5915b59f = null;
        }
        this.f50091xe6761b04.m100322x6761d4f();
        this.f50092x21973431.m100494x5a5b64d();
        this.f50093xca98ef83.m101143x9cb98ec1(11);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: reset */
    public void mo100415x6761d4f() {
        this.f50088xe041c5d.mo100757x3164ae("reset, current state:" + this.f50093xca98ef83);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100415x6761d4f();
        }
        this.f50091xe6761b04.m100322x6761d4f();
        this.f50092x21973431.m100494x5a5b64d();
        this.f50093xca98ef83.m101143x9cb98ec1(1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100416xc9fc1b13(int i17) {
        if (this.f50094xce27a6f1.m100551x3465cdf3(9)) {
            long j17 = i17;
            if (j17 >= m100625xfda4b733().mo101326xa7f6dc7b() && j17 <= m100625xfda4b733().mo101326xa7f6dc7b() + m100625xfda4b733().mo101325x81a6b901()) {
                if (this.f50089x5915b59f != null) {
                    this.f50088xe041c5d.mo103225x5b09653("seek to:" + i17);
                    this.f50089x5915b59f.mo100416xc9fc1b13((int) (j17 - m100625xfda4b733().mo101326xa7f6dc7b()));
                    return;
                }
                return;
            }
            m100637x677e746d(i17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectProgram */
    public void mo100418x18ae2de8(int i17, long j17) {
        this.f50088xe041c5d.mo100756x5c4d208("selectProgram not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectTrack */
    public void mo100419xc3b89af(int i17, long j17) {
        this.f50088xe041c5d.mo100756x5c4d208("selectTrack not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioGainRatio */
    public void mo100420x3aa51598(float f17) {
        if (this.f50094xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100420x3aa51598(f17);
            }
            this.f50091xe6761b04.m100323x3aa51598(f17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioNormalizeVolumeParams */
    public void mo100421x1e3370b9(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100425x683d6267(java.lang.String str) {
        mo100426x683d6267(str, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100427xfd27780d(boolean z17) {
        if (this.f50094xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100427xfd27780d(z17);
            }
            this.f50091xe6761b04.m100332xfd27780d(z17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnAudioPcmOutputListener */
    public void mo100429x3282865a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnAudioProcessOutputListener */
    public void mo100430xb23c0daf(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnCompletionListener */
    public void mo100431xa4560c71(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener iOnCompletionListener) {
        this.f50092x21973431.m100497xa4560c71(iOnCompletionListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnDemuxerListener */
    public void mo100432xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener iOnDemuxerListener) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnDetailInfoListener */
    public void mo100433xa4b31634(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener iOnDetailInfoListener) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnErrorListener */
    public void mo100434x6954c27b(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener) {
        this.f50092x21973431.m100500x6954c27b(iOnErrorListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnEventRecordListener */
    public void mo100435x5e0339be(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener iOnEventRecordListener) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnInfoListener */
    public void mo100436x40f8c003(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener) {
        this.f50092x21973431.m100502x40f8c003(iOnInfoListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnPreparedListener */
    public void mo100437x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener) {
        this.f50092x21973431.m100503x5dd7c812(iOnPreparedListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSeekCompleteListener */
    public void mo100438xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f50092x21973431.m100504xe1a2e326(iOnSeekCompleteListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleDataListener */
    public void mo100439x8796ba37(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.f50092x21973431.m100506x8796ba37(iOnSubtitleDataListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleFrameOutListener */
    public void mo100440xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoFrameOutListener */
    public void mo100441xf26db5af(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoProcessOutputListener */
    public void mo100442x7e05de2a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoSizeChangedListener */
    public void mo100443x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.f50092x21973431.m100510x2d6d87cd(iOnVideoSizeChangedListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOutputMute */
    public void mo100444xd0747cbc(boolean z17) {
        if (this.f50094xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100444xd0747cbc(z17);
            }
            this.f50091xe6761b04.m100334xd0747cbc(z17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySharpenSwitch */
    public void mo100445x41b4a011() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySpeedRatio */
    public void mo100446xd079f5a(float f17) {
        if (this.f50094xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100446xd079f5a(f17);
            }
            this.f50091xe6761b04.m100336x41557a06(f17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlayerOptionalParam */
    public void mo100447x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        if (c26182x67c007f1.m101069xb5884f29() == 100) {
            int i17 = (int) c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            this.f50088xe041c5d.mo103225x5b09653("start position:" + i17);
            for (int i18 = 0; i18 < this.f50085x5bae479b.size(); i18++) {
                long j17 = i17;
                if (this.f50085x5bae479b.get(i18).mo101326xa7f6dc7b() <= j17 && j17 <= this.f50085x5bae479b.get(i18).mo101326xa7f6dc7b() + this.f50085x5bae479b.get(i18).mo101325x81a6b901()) {
                    this.f50087xcddb81bc = i18;
                    this.f50091xe6761b04.m100329x683d6267(this.f50085x5bae479b.get(i18).mo101324x5000ed37());
                    c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171 = j17 - this.f50085x5bae479b.get(i18).mo101326xa7f6dc7b();
                }
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100447x1ba09fea(c26182x67c007f1);
        }
        this.f50091xe6761b04.m100307x3ee04007(c26182x67c007f1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurface */
    public void mo100448x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17) {
        if (!this.f50094xce27a6f1.m100551x3465cdf3(4)) {
            throw new java.lang.IllegalStateException("setSurface , state invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100448x42c875eb(surface, i17);
        }
        this.f50091xe6761b04.m100337x42c875eb(surface, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurfaceHolder */
    public void mo100449x5660d377(android.view.SurfaceHolder surfaceHolder) {
        if (!this.f50094xce27a6f1.m100551x3465cdf3(4)) {
            throw new java.lang.IllegalStateException("setSurfaceHolder , state invalid");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100449x5660d377(surfaceHolder);
        }
        this.f50091xe6761b04.m100338x5660d377(surfaceHolder);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: start */
    public void mo100450x68ac462() {
        if (this.f50094xce27a6f1.m100551x3465cdf3(5)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
            if (interfaceC26139x4d493b7 == null) {
                throw new java.lang.IllegalStateException("error , start , player is null");
            }
            try {
                interfaceC26139x4d493b7.mo100450x68ac462();
                this.f50093xca98ef83.m101143x9cb98ec1(5);
            } catch (java.lang.IllegalStateException unused) {
                throw new java.lang.IllegalStateException("error , start ,state invalid");
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: stop */
    public void mo100451x360802() {
        if (this.f50094xce27a6f1.m100551x3465cdf3(7)) {
            if (this.f50089x5915b59f == null) {
                throw new java.lang.IllegalStateException("error , stop , player is null");
            }
            try {
                try {
                    this.f50093xca98ef83.m101143x9cb98ec1(8);
                    this.f50089x5915b59f.mo100451x360802();
                } catch (java.lang.IllegalStateException unused) {
                    throw new java.lang.IllegalStateException("error , pause ,state invalid");
                }
            } finally {
                this.f50093xca98ef83.m101143x9cb98ec1(9);
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100453x81d257a7(java.lang.String str, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchHdrModeWithSurface */
    public void mo100455x40944be2(android.view.Surface surface, int i17, int i18) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
        if (interfaceC26139x4d493b7 != null) {
            interfaceC26139x4d493b7.mo100455x40944be2(surface, i17, i18);
        }
        this.f50091xe6761b04.m100337x42c875eb(surface, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: updateLoggerContext */
    public void mo100456x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f50088xe041c5d.mo103228xdf8cd0a6(new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, TAG));
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 c26135xc8cc64f1 = this.f50092x21973431;
        if (c26135xc8cc64f1 == null || c26478xc50084e3 == null) {
            return;
        }
        c26135xc8cc64f1.m100511x8bd16e11(this.f50088xe041c5d.m103231xe4cf9ecd().m103238xb5887064());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addAudioTrackSource */
    public void mo100385xa28fa651(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list) {
        this.f50088xe041c5d.mo100756x5c4d208("addAudioTrackSource not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addSubtitleSource */
    public void mo100387x14654554(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        this.f50088xe041c5d.mo100756x5c4d208("addSubtitleSource not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100426x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f50091xe6761b04.m100330x683d6267(str, map);
        this.f50093xca98ef83.m101143x9cb98ec1(2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100454x81d257a7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100452x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> m100624x916e0ca6 = m100624x916e0ca6(interfaceC26214xf9e9afd1);
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(m100624x916e0ca6)) {
            long mo100398xddd35a52 = mo100398xddd35a52();
            try {
                this.f50085x5bae479b = m100624x916e0ca6;
                this.f50084x41e44341 = true;
                if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f50095x970a3bb)) {
                    this.f50095x970a3bb = new java.util.LinkedList<>();
                }
                this.f50095x970a3bb.offer(java.lang.Long.valueOf(j17));
                this.f50088xe041c5d.mo100757x3164ae("try to switch definition with system clip player, current clipNo:" + this.f50087xcddb81bc);
                m100637x677e746d((int) mo100398xddd35a52);
                return;
            } catch (java.lang.Exception e17) {
                this.f50088xe041c5d.mo103227xaa8bf022(e17);
                throw new java.lang.IllegalStateException("exception when system clip player switch definition!");
            }
        }
        throw new java.lang.IllegalStateException("exception when switch Definition with clip mediaAsset empty source!");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100423x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f50091xe6761b04.m100326x683d6267(parcelFileDescriptor);
        this.f50093xca98ef83.m101143x9cb98ec1(2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100428xfd27780d(boolean z17, long j17, long j18) {
        if (this.f50094xce27a6f1.m100551x3465cdf3(3)) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f50089x5915b59f;
            if (interfaceC26139x4d493b7 != null) {
                interfaceC26139x4d493b7.mo100428xfd27780d(z17, j17, j18);
            }
            this.f50091xe6761b04.m100333xfd27780d(z17, j17, j18);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100422x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.f50091xe6761b04.m100325x683d6267(assetFileDescriptor);
        this.f50093xca98ef83.m101143x9cb98ec1(2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100417xc9fc1b13(int i17, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSeekMode int i18) {
        if (this.f50094xce27a6f1.m100551x3465cdf3(9)) {
            long j17 = i17;
            if (j17 >= m100625xfda4b733().mo101326xa7f6dc7b() && j17 <= m100625xfda4b733().mo101326xa7f6dc7b() + m100625xfda4b733().mo101325x81a6b901()) {
                if (this.f50089x5915b59f != null) {
                    this.f50088xe041c5d.mo103225x5b09653("seek to:" + i17 + "/mode=" + i18);
                    this.f50089x5915b59f.mo100417xc9fc1b13((int) (j17 - m100625xfda4b733().mo101326xa7f6dc7b()), i18);
                    return;
                }
                return;
            }
            m100637x677e746d(i17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100424x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> m100624x916e0ca6 = m100624x916e0ca6(interfaceC26214xf9e9afd1);
        try {
            this.f50085x5bae479b = m100624x916e0ca6;
            this.f50091xe6761b04.m100330x683d6267(m100624x916e0ca6.get(this.f50087xcddb81bc).mo101324x5000ed37(), this.f50085x5bae479b.get(this.f50087xcddb81bc).mo101276x1275092b());
            this.f50093xca98ef83.m101143x9cb98ec1(2);
        } catch (java.lang.Exception e17) {
            this.f50088xe041c5d.mo103227xaa8bf022(e17);
            throw new java.lang.IllegalStateException("exception when system clip player set data source!");
        }
    }
}

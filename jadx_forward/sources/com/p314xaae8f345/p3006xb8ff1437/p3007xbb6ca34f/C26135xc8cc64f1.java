package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f;

/* renamed from: com.tencent.thumbplayer.adapter.TPPlayerBaseListeners */
/* loaded from: classes16.dex */
public class C26135xc8cc64f1 implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener {
    private static final java.lang.String TAG = "TPPlayerListenerS";

    /* renamed from: EMPTY_LISTENERS */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1.TPPlayerListenersEmptyImpl f49980xff4c958d;

    /* renamed from: mOnAudioFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener f49981xf805869f;

    /* renamed from: mOnAudioProcessFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener f49982x30fedf9a;

    /* renamed from: mOnCompletionListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener f49983xe51cdcfc;

    /* renamed from: mOnDemuxerListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener f49984x16b740a4;

    /* renamed from: mOnDetailInfoListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener f49985xe579e6bf;

    /* renamed from: mOnErrorListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener f49986x1dca8710;

    /* renamed from: mOnEventRecordListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener f49987x36167a93;

    /* renamed from: mOnInfoListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener f49988x911d94ce;

    /* renamed from: mOnPreparedListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener f49989xb29f3f5d;

    /* renamed from: mOnSeekCompleteListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener f49990xbf7bcf1;

    /* renamed from: mOnStateChangeListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener f49991xaf8b68a9;

    /* renamed from: mOnSubtitleDataListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener f49992xb1eb9402;

    /* renamed from: mOnSubtitleFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener f49993x83e6d5f9;

    /* renamed from: mOnVideoFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener f49994x12b41544;

    /* renamed from: mOnVideoProcessFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener f49995x31967d55;

    /* renamed from: mOnVideoSizeChangedListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener f49996xada8418;

    /* renamed from: mTag */
    private java.lang.String f49997x32d3ed = TAG;

    /* renamed from: com.tencent.thumbplayer.adapter.TPPlayerBaseListeners$TPPlayerListenersEmptyImpl */
    /* loaded from: classes16.dex */
    public static class TPPlayerListenersEmptyImpl implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener {

        /* renamed from: mTag */
        private java.lang.String f49998x32d3ed;

        public TPPlayerListenersEmptyImpl(java.lang.String str) {
            this.f49998x32d3ed = str;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener
        /* renamed from: onAudioPcmOut */
        public void mo100458x30daf82b(com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onAudioFrameOut");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener
        /* renamed from: onAudioProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100459xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onAudioProcessFrameOut");
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener
        /* renamed from: onCompletion */
        public void mo100460xa6db431b() {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onCompletion");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener
        /* renamed from: onDetailInfo */
        public void mo100461x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onDetailInfo");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener
        /* renamed from: onDrmInfo */
        public void mo100462xc240780e(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onEventRecord");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener
        /* renamed from: onError */
        public void mo100463xaf8aa769(int i17, int i18, long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onError");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener
        /* renamed from: onInfo */
        public void mo100464xc39adf2d(int i17, long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onInfo");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener
        /* renamed from: onPrepared */
        public void mo100465x58d5b73c() {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onPrepared");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener
        /* renamed from: onSdpExchange */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b mo100466xc45f8823(java.lang.String str, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onSdpExchange");
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener
        /* renamed from: onSeekComplete */
        public void mo100467xe1fdf750() {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onSeekComplete");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener
        /* renamed from: onStateChange */
        public void mo100410x4799dc42(int i17, int i18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onStateChange");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener
        /* renamed from: onSubtitleData */
        public void mo100468xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onSubtitleData");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener
        /* renamed from: onSubtitleFrameOut */
        public void mo100469x715e46d8(com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , TPSubtitleFrameBuffer");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener
        /* renamed from: onVideoFrameOut */
        public void mo100470xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onVideoFrameOut");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener
        /* renamed from: onVideoProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100471x18d178b4(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onVideoProcessFrameOut");
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener
        /* renamed from: onVideoSizeChanged */
        public void mo100472xdc9583f7(long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f49998x32d3ed, " empty base listener , notify , onVideoSizeChanged");
        }
    }

    public C26135xc8cc64f1(java.lang.String str) {
        m100511x8bd16e11(str);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1.TPPlayerListenersEmptyImpl(this.f49997x32d3ed);
        this.f49980xff4c958d = tPPlayerListenersEmptyImpl;
        this.f49989xb29f3f5d = tPPlayerListenersEmptyImpl;
        this.f49983xe51cdcfc = tPPlayerListenersEmptyImpl;
        this.f49988x911d94ce = tPPlayerListenersEmptyImpl;
        this.f49986x1dca8710 = tPPlayerListenersEmptyImpl;
        this.f49990xbf7bcf1 = tPPlayerListenersEmptyImpl;
        this.f49996xada8418 = tPPlayerListenersEmptyImpl;
        this.f49992xb1eb9402 = tPPlayerListenersEmptyImpl;
        this.f49994x12b41544 = tPPlayerListenersEmptyImpl;
        this.f49981xf805869f = tPPlayerListenersEmptyImpl;
        this.f49993x83e6d5f9 = tPPlayerListenersEmptyImpl;
        this.f49995x31967d55 = tPPlayerListenersEmptyImpl;
        this.f49982x30fedf9a = tPPlayerListenersEmptyImpl;
        this.f49991xaf8b68a9 = tPPlayerListenersEmptyImpl;
        this.f49985xe579e6bf = tPPlayerListenersEmptyImpl;
        this.f49987x36167a93 = tPPlayerListenersEmptyImpl;
        this.f49984x16b740a4 = tPPlayerListenersEmptyImpl;
    }

    /* renamed from: clear */
    public void m100494x5a5b64d() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.f49980xff4c958d;
        this.f49989xb29f3f5d = tPPlayerListenersEmptyImpl;
        this.f49983xe51cdcfc = tPPlayerListenersEmptyImpl;
        this.f49988x911d94ce = tPPlayerListenersEmptyImpl;
        this.f49986x1dca8710 = tPPlayerListenersEmptyImpl;
        this.f49990xbf7bcf1 = tPPlayerListenersEmptyImpl;
        this.f49996xada8418 = tPPlayerListenersEmptyImpl;
        this.f49992xb1eb9402 = tPPlayerListenersEmptyImpl;
        this.f49994x12b41544 = tPPlayerListenersEmptyImpl;
        this.f49981xf805869f = tPPlayerListenersEmptyImpl;
        this.f49993x83e6d5f9 = tPPlayerListenersEmptyImpl;
        this.f49991xaf8b68a9 = tPPlayerListenersEmptyImpl;
        this.f49995x31967d55 = tPPlayerListenersEmptyImpl;
        this.f49982x30fedf9a = tPPlayerListenersEmptyImpl;
        this.f49985xe579e6bf = tPPlayerListenersEmptyImpl;
        this.f49987x36167a93 = tPPlayerListenersEmptyImpl;
        this.f49984x16b740a4 = tPPlayerListenersEmptyImpl;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener
    /* renamed from: onAudioPcmOut */
    public void mo100458x30daf82b(com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
        this.f49981xf805869f.mo100458x30daf82b(c26169xaecce4f3);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener
    /* renamed from: onAudioProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100459xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        return this.f49982x30fedf9a.mo100459xff2eeff9(c26188x7aa7007a);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo100460xa6db431b() {
        this.f49983xe51cdcfc.mo100460xa6db431b();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener
    /* renamed from: onDetailInfo */
    public void mo100461x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
        this.f49985xe579e6bf.mo100461x8953bfde(c26183xfc0748fc);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener
    /* renamed from: onDrmInfo */
    public void mo100462xc240780e(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
        this.f49987x36167a93.mo100462xc240780e(c26174xf2a580d1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener
    /* renamed from: onError */
    public void mo100463xaf8aa769(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPErrorType int i17, int i18, long j17, long j18) {
        this.f49986x1dca8710.mo100463xaf8aa769(i17, i18, j17, j18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener
    /* renamed from: onInfo */
    public void mo100464xc39adf2d(int i17, long j17, long j18, java.lang.Object obj) {
        this.f49988x911d94ce.mo100464xc39adf2d(i17, j17, j18, obj);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo100465x58d5b73c() {
        this.f49989xb29f3f5d.mo100465x58d5b73c();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener
    /* renamed from: onSdpExchange */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b mo100466xc45f8823(java.lang.String str, int i17) {
        return this.f49984x16b740a4.mo100466xc45f8823(str, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo100467xe1fdf750() {
        this.f49990xbf7bcf1.mo100467xe1fdf750();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo100410x4799dc42(int i17, int i18) {
        this.f49991xaf8b68a9.mo100410x4799dc42(i17, i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener
    /* renamed from: onSubtitleData */
    public void mo100468xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
        this.f49992xb1eb9402.mo100468xfb5e6f61(c26193x359f687e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener
    /* renamed from: onSubtitleFrameOut */
    public void mo100469x715e46d8(com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9) {
        this.f49993x83e6d5f9.mo100469x715e46d8(c26194x3ac954b9);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener
    /* renamed from: onVideoFrameOut */
    public void mo100470xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
        this.f49994x12b41544.mo100470xc11a2c9d(c26203x3f6f032e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener
    /* renamed from: onVideoProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100471x18d178b4(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        return this.f49995x31967d55.mo100471x18d178b4(c26188x7aa7007a);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo100472xdc9583f7(long j17, long j18) {
        this.f49996xada8418.mo100472xdc9583f7(j17, j18);
    }

    /* renamed from: setOnAudioPcmOutListener */
    public void m100495x19b74abd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        if (iOnAudioPcmOutListener == null) {
            iOnAudioPcmOutListener = this.f49980xff4c958d;
        }
        this.f49981xf805869f = iOnAudioPcmOutListener;
    }

    /* renamed from: setOnAudioProcessFrameListener */
    public void m100496xadcfb527(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        if (iOnAudioProcessOutListener == null) {
            iOnAudioProcessOutListener = this.f49980xff4c958d;
        }
        this.f49982x30fedf9a = iOnAudioProcessOutListener;
    }

    /* renamed from: setOnCompletionListener */
    public void m100497xa4560c71(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.f49980xff4c958d;
        }
        this.f49983xe51cdcfc = iOnCompletionListener;
    }

    /* renamed from: setOnDemuxerListener */
    public void m100498xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.f49980xff4c958d;
        }
        this.f49984x16b740a4 = iOnDemuxerListener;
    }

    /* renamed from: setOnDetailInfoListener */
    public void m100499xa4b31634(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.f49980xff4c958d;
        }
        this.f49985xe579e6bf = iOnDetailInfoListener;
    }

    /* renamed from: setOnErrorListener */
    public void m100500x6954c27b(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.f49980xff4c958d;
        }
        this.f49986x1dca8710 = iOnErrorListener;
    }

    /* renamed from: setOnEventRecordListener */
    public void m100501x5e0339be(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener iOnEventRecordListener) {
        if (iOnEventRecordListener == null) {
            iOnEventRecordListener = this.f49980xff4c958d;
        }
        this.f49987x36167a93 = iOnEventRecordListener;
    }

    /* renamed from: setOnInfoListener */
    public void m100502x40f8c003(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.f49980xff4c958d;
        }
        this.f49988x911d94ce = iOnInfoListener;
    }

    /* renamed from: setOnPreparedListener */
    public void m100503x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.f49980xff4c958d;
        }
        this.f49989xb29f3f5d = iOnPreparedListener;
    }

    /* renamed from: setOnSeekCompleteListener */
    public void m100504xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.f49980xff4c958d;
        }
        this.f49990xbf7bcf1 = iOnSeekCompleteListener;
    }

    /* renamed from: setOnStateChangeListener */
    public void m100505xd77827d4(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.f49980xff4c958d;
        }
        this.f49991xaf8b68a9 = iOnStateChangeListener;
    }

    /* renamed from: setOnSubtitleDataListener */
    public void m100506x8796ba37(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.f49980xff4c958d;
        }
        this.f49992xb1eb9402 = iOnSubtitleDataListener;
    }

    /* renamed from: setOnSubtitleFrameOutListener */
    public void m100507xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.f49980xff4c958d;
        }
        this.f49993x83e6d5f9 = iOnSubtitleFrameOutListener;
    }

    /* renamed from: setOnVideoFrameOutListener */
    public void m100508xf26db5af(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.f49980xff4c958d;
        }
        this.f49994x12b41544 = iOnVideoFrameOutListener;
    }

    /* renamed from: setOnVideoProcessFrameListener */
    public void m100509x9b9c694c(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        if (iOnVideoProcessOutListener == null) {
            iOnVideoProcessOutListener = this.f49980xff4c958d;
        }
        this.f49995x31967d55 = iOnVideoProcessOutListener;
    }

    /* renamed from: setOnVideoSizeChangedListener */
    public void m100510x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        if (iOnVideoSizeChangedListener == null) {
            iOnVideoSizeChangedListener = this.f49980xff4c958d;
        }
        this.f49996xada8418 = iOnVideoSizeChangedListener;
    }

    /* renamed from: updateTag */
    public void m100511x8bd16e11(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f49997x32d3ed = TAG;
        } else {
            this.f49997x32d3ed = str;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.f49980xff4c958d;
        if (tPPlayerListenersEmptyImpl != null) {
            tPPlayerListenersEmptyImpl.f49998x32d3ed = this.f49997x32d3ed;
        }
    }
}

package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455;

/* renamed from: com.tencent.thumbplayer.tplayer.TPPlayerListeners */
/* loaded from: classes16.dex */
public class C26521xbcdea42 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener {
    private static final java.lang.String TAG = "TPPlayerListenerS";

    /* renamed from: EMPTY_LISTENERS */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42.TPPlayerListenersEmptyImpl f54367xff4c958d;

    /* renamed from: mOnAudioFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener f54368xf805869f;

    /* renamed from: mOnAudioProcessFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener f54369x30fedf9a;

    /* renamed from: mOnCompletionListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener f54370xe51cdcfc;

    /* renamed from: mOnDemuxerListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener f54371x16b740a4;

    /* renamed from: mOnDetailInfoListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener f54372xe579e6bf;

    /* renamed from: mOnErrorListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener f54373x1dca8710;

    /* renamed from: mOnInfoListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener f54374x911d94ce;

    /* renamed from: mOnPlayerStateChangeListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener f54375x726e0908;

    /* renamed from: mOnPreparedListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener f54376xb29f3f5d;

    /* renamed from: mOnSeekCompleteListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener f54377xbf7bcf1;

    /* renamed from: mOnStopAsyncCompleteListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener f54378x3ad502fb;

    /* renamed from: mOnSubtitleDataListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener f54379xb1eb9402;

    /* renamed from: mOnSubtitleFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener f54380x83e6d5f9;

    /* renamed from: mOnVideoFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener f54381x12b41544;

    /* renamed from: mOnVideoProcessFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener f54382x31967d55;

    /* renamed from: mOnVideoSizeChangedListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener f54383xada8418;

    /* renamed from: mTag */
    private java.lang.String f54384x32d3ed = TAG;

    /* renamed from: com.tencent.thumbplayer.tplayer.TPPlayerListeners$TPPlayerListenersEmptyImpl */
    /* loaded from: classes16.dex */
    public static class TPPlayerListenersEmptyImpl implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener {

        /* renamed from: mTag */
        private java.lang.String f54385x32d3ed;

        public TPPlayerListenersEmptyImpl(java.lang.String str) {
            this.f54385x32d3ed = str;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener
        /* renamed from: onAudioFrameOut */
        public void mo100986x5dd428f8(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onAudioFrameOut");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener
        /* renamed from: onAudioProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100987xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onPostProcessFrameOut");
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
        /* renamed from: onCompletion */
        public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onCompletion");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener
        /* renamed from: onDetailInfo */
        public void mo100989x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onDetailInfo");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
        /* renamed from: onError */
        public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onError");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
        /* renamed from: onInfo */
        public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onInfo");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
        /* renamed from: onPrepared */
        public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onPrepared");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener
        /* renamed from: onSdpExchange */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b mo100988xc45f8823(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, java.lang.String str, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onSdpExchange");
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
        /* renamed from: onSeekComplete */
        public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onSeekComplete");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
        /* renamed from: onStateChange */
        public void mo53282x4799dc42(int i17, int i18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onStateChange");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener
        /* renamed from: onStopAsyncComplete */
        public void mo83876x5a35e2d4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onStopAsyncComplete");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener
        /* renamed from: onSubtitleData */
        public void mo53279xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onSubtitleData");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener
        /* renamed from: onSubtitleFrameOut */
        public void mo100990x715e46d8(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onSubtitleFrameOut");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener
        /* renamed from: onVideoFrameOut */
        public void mo100991xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onVideoFrameOut");
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener
        /* renamed from: onVideoProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100992x18d178b4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onPostProcessFrameOut");
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
        /* renamed from: onVideoSizeChanged */
        public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54385x32d3ed, " empty player listener , notify , onVideoSizeChanged");
        }
    }

    public C26521xbcdea42(java.lang.String str) {
        m103633x8bd16e11(str);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42.TPPlayerListenersEmptyImpl(this.f54384x32d3ed);
        this.f54367xff4c958d = tPPlayerListenersEmptyImpl;
        this.f54376xb29f3f5d = tPPlayerListenersEmptyImpl;
        this.f54370xe51cdcfc = tPPlayerListenersEmptyImpl;
        this.f54374x911d94ce = tPPlayerListenersEmptyImpl;
        this.f54373x1dca8710 = tPPlayerListenersEmptyImpl;
        this.f54377xbf7bcf1 = tPPlayerListenersEmptyImpl;
        this.f54383xada8418 = tPPlayerListenersEmptyImpl;
        this.f54379xb1eb9402 = tPPlayerListenersEmptyImpl;
        this.f54380x83e6d5f9 = tPPlayerListenersEmptyImpl;
        this.f54381x12b41544 = tPPlayerListenersEmptyImpl;
        this.f54368xf805869f = tPPlayerListenersEmptyImpl;
        this.f54382x31967d55 = tPPlayerListenersEmptyImpl;
        this.f54369x30fedf9a = tPPlayerListenersEmptyImpl;
        this.f54375x726e0908 = tPPlayerListenersEmptyImpl;
        this.f54378x3ad502fb = tPPlayerListenersEmptyImpl;
        this.f54372xe579e6bf = tPPlayerListenersEmptyImpl;
        this.f54371x16b740a4 = tPPlayerListenersEmptyImpl;
    }

    /* renamed from: clear */
    public void m103616x5a5b64d() {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.f54367xff4c958d;
        this.f54376xb29f3f5d = tPPlayerListenersEmptyImpl;
        this.f54370xe51cdcfc = tPPlayerListenersEmptyImpl;
        this.f54374x911d94ce = tPPlayerListenersEmptyImpl;
        this.f54373x1dca8710 = tPPlayerListenersEmptyImpl;
        this.f54377xbf7bcf1 = tPPlayerListenersEmptyImpl;
        this.f54383xada8418 = tPPlayerListenersEmptyImpl;
        this.f54379xb1eb9402 = tPPlayerListenersEmptyImpl;
        this.f54381x12b41544 = tPPlayerListenersEmptyImpl;
        this.f54368xf805869f = tPPlayerListenersEmptyImpl;
        this.f54375x726e0908 = tPPlayerListenersEmptyImpl;
        this.f54378x3ad502fb = tPPlayerListenersEmptyImpl;
        this.f54372xe579e6bf = tPPlayerListenersEmptyImpl;
        this.f54371x16b740a4 = tPPlayerListenersEmptyImpl;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener
    /* renamed from: onAudioFrameOut */
    public void mo100986x5dd428f8(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
        this.f54368xf805869f.mo100986x5dd428f8(interfaceC26164x73fc6bc6, c26169xaecce4f3);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener
    /* renamed from: onAudioProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100987xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        return this.f54369x30fedf9a.mo100987xff2eeff9(interfaceC26164x73fc6bc6, c26188x7aa7007a);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f54370xe51cdcfc.mo53280xa6db431b(interfaceC26164x73fc6bc6);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener
    /* renamed from: onDetailInfo */
    public void mo100989x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
        this.f54372xe579e6bf.mo100989x8953bfde(interfaceC26164x73fc6bc6, c26183xfc0748fc);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        this.f54373x1dca8710.mo53281xaf8aa769(interfaceC26164x73fc6bc6, i17, i18, j17, j18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        this.f54374x911d94ce.mo53278xc39adf2d(interfaceC26164x73fc6bc6, i17, j17, j18, obj);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f54376xb29f3f5d.mo53283x58d5b73c(interfaceC26164x73fc6bc6);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener
    /* renamed from: onSdpExchange */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b mo100988xc45f8823(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, java.lang.String str, int i17) {
        return this.f54371x16b740a4.mo100988xc45f8823(interfaceC26164x73fc6bc6, str, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f54377xbf7bcf1.mo53284xe1fdf750(interfaceC26164x73fc6bc6);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        this.f54375x726e0908.mo53282x4799dc42(i17, i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener
    /* renamed from: onStopAsyncComplete */
    public void mo83876x5a35e2d4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f54378x3ad502fb.mo83876x5a35e2d4(interfaceC26164x73fc6bc6);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener
    /* renamed from: onSubtitleData */
    public void mo53279xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
        this.f54379xb1eb9402.mo53279xfb5e6f61(interfaceC26164x73fc6bc6, c26193x359f687e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener
    /* renamed from: onSubtitleFrameOut */
    public void mo100990x715e46d8(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9) {
        this.f54380x83e6d5f9.mo100990x715e46d8(interfaceC26164x73fc6bc6, c26194x3ac954b9);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener
    /* renamed from: onVideoFrameOut */
    public void mo100991xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
        this.f54381x12b41544.mo100991xc11a2c9d(interfaceC26164x73fc6bc6, c26203x3f6f032e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener
    /* renamed from: onVideoProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100992x18d178b4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        return this.f54382x31967d55.mo100992x18d178b4(interfaceC26164x73fc6bc6, c26188x7aa7007a);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        this.f54383xada8418.mo53285xdc9583f7(interfaceC26164x73fc6bc6, j17, j18);
    }

    /* renamed from: setOnAudioPcmOutputListener */
    public void m103617x3282865a(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        if (iOnAudioFrameOutputListener == null) {
            iOnAudioFrameOutputListener = this.f54367xff4c958d;
        }
        this.f54368xf805869f = iOnAudioFrameOutputListener;
    }

    /* renamed from: setOnAudioProcessOutputListener */
    public void m103618xb23c0daf(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        if (iOnAudioProcessFrameOutputListener == null) {
            iOnAudioProcessFrameOutputListener = this.f54367xff4c958d;
        }
        this.f54369x30fedf9a = iOnAudioProcessFrameOutputListener;
    }

    /* renamed from: setOnCompletionListener */
    public void m103619xa4560c71(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener iOnCompletionListener) {
        if (iOnCompletionListener == null) {
            iOnCompletionListener = this.f54367xff4c958d;
        }
        this.f54370xe51cdcfc = iOnCompletionListener;
    }

    /* renamed from: setOnDemuxerListener */
    public void m103620xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener iOnDemuxerListener) {
        if (iOnDemuxerListener == null) {
            iOnDemuxerListener = this.f54367xff4c958d;
        }
        this.f54371x16b740a4 = iOnDemuxerListener;
    }

    /* renamed from: setOnDetailInfoListener */
    public void m103621xa4b31634(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener iOnDetailInfoListener) {
        if (iOnDetailInfoListener == null) {
            iOnDetailInfoListener = this.f54367xff4c958d;
        }
        this.f54372xe579e6bf = iOnDetailInfoListener;
    }

    /* renamed from: setOnErrorListener */
    public void m103622x6954c27b(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener iOnErrorListener) {
        if (iOnErrorListener == null) {
            iOnErrorListener = this.f54367xff4c958d;
        }
        this.f54373x1dca8710 = iOnErrorListener;
    }

    /* renamed from: setOnInfoListener */
    public void m103623x40f8c003(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener iOnInfoListener) {
        if (iOnInfoListener == null) {
            iOnInfoListener = this.f54367xff4c958d;
        }
        this.f54374x911d94ce = iOnInfoListener;
    }

    /* renamed from: setOnPlayerStateChangeListener */
    public void m103624xa23b7bf3(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener iOnStateChangeListener) {
        if (iOnStateChangeListener == null) {
            iOnStateChangeListener = this.f54367xff4c958d;
        }
        this.f54375x726e0908 = iOnStateChangeListener;
    }

    /* renamed from: setOnPreparedListener */
    public void m103625x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener iOnPreparedListener) {
        if (iOnPreparedListener == null) {
            iOnPreparedListener = this.f54367xff4c958d;
        }
        this.f54376xb29f3f5d = iOnPreparedListener;
    }

    /* renamed from: setOnSeekCompleteListener */
    public void m103626xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener iOnSeekCompleteListener) {
        if (iOnSeekCompleteListener == null) {
            iOnSeekCompleteListener = this.f54367xff4c958d;
        }
        this.f54377xbf7bcf1 = iOnSeekCompleteListener;
    }

    /* renamed from: setOnStopAsyncCompleteListener */
    public void m103627x6aa275e6(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        if (iOnStopAsyncCompleteListener == null) {
            iOnStopAsyncCompleteListener = this.f54367xff4c958d;
        }
        this.f54378x3ad502fb = iOnStopAsyncCompleteListener;
    }

    /* renamed from: setOnSubtitleDataListener */
    public void m103628x8796ba37(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener iOnSubtitleDataListener) {
        if (iOnSubtitleDataListener == null) {
            iOnSubtitleDataListener = this.f54367xff4c958d;
        }
        this.f54379xb1eb9402 = iOnSubtitleDataListener;
    }

    /* renamed from: setOnSubtitleFrameOutListener */
    public void m103629xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        if (iOnSubtitleFrameOutListener == null) {
            iOnSubtitleFrameOutListener = this.f54367xff4c958d;
        }
        this.f54380x83e6d5f9 = iOnSubtitleFrameOutListener;
    }

    /* renamed from: setOnVideoFrameOutListener */
    public void m103630xf26db5af(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        if (iOnVideoFrameOutListener == null) {
            iOnVideoFrameOutListener = this.f54367xff4c958d;
        }
        this.f54381x12b41544 = iOnVideoFrameOutListener;
    }

    /* renamed from: setOnVideoProcessOutputListener */
    public void m103631x7e05de2a(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        if (iOnVideoProcessFrameOutputListener == null) {
            iOnVideoProcessFrameOutputListener = this.f54367xff4c958d;
        }
        this.f54382x31967d55 = iOnVideoProcessFrameOutputListener;
    }

    /* renamed from: setOnVideoSizeChangedListener */
    public void m103632x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        if (iOnVideoSizeChangedListener == null) {
            iOnVideoSizeChangedListener = this.f54367xff4c958d;
        }
        this.f54383xada8418 = iOnVideoSizeChangedListener;
    }

    /* renamed from: updateTag */
    public void m103633x8bd16e11(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f54384x32d3ed = TAG;
        } else {
            this.f54384x32d3ed = str;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42.TPPlayerListenersEmptyImpl tPPlayerListenersEmptyImpl = this.f54367xff4c958d;
        if (tPPlayerListenersEmptyImpl != null) {
            tPPlayerListenersEmptyImpl.f54385x32d3ed = str;
        }
    }
}

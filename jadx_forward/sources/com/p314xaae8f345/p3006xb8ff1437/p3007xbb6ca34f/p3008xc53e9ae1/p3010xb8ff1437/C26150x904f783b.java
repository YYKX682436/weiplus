package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437;

/* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer */
/* loaded from: classes16.dex */
public class C26150x904f783b implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 {

    /* renamed from: EVENT_MSG_ASYNC_CALL */
    private static final int f50206xe47f9e64 = 1;

    /* renamed from: EVENT_MSG_ON_DETAIL_INFO */
    private static final int f50207xb60e4fff = 5;

    /* renamed from: EVENT_MSG_ON_ERROR */
    private static final int f50208xffdac4b = 4;

    /* renamed from: EVENT_MSG_ON_INFO_LONG */
    private static final int f50209x7d05c050 = 2;

    /* renamed from: EVENT_MSG_ON_INFO_OBJECT */
    private static final int f50210x56fc7413 = 3;
    private static final java.lang.String TAG = "TPThumbPlayer";

    /* renamed from: sVerboseObjectInfoTypes */
    static final java.util.Set<java.lang.Integer> f50211xd7e3c25d = new java.util.HashSet<java.lang.Integer>() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.9
        {
            add(503);
        }
    };

    /* renamed from: mEventHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.EventHandler f50212xf703545d;

    /* renamed from: mImageGenerator */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301 f50213xf44e7185;

    /* renamed from: mLogger */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d f50214xe041c5d;

    /* renamed from: mNativeInitConfig */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26409xd9e7d206 f50218xffedce76;

    /* renamed from: mPlayer */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 f50223x14aac1ae;

    /* renamed from: mPlayerListenerReps */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 f50224xfab51b18;

    /* renamed from: mSubtitleData */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e f50225x1db0fcef = new com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e();

    /* renamed from: mNativeMessageCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af f50219xc9b3a9e8 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.2
        /* renamed from: sendMessage */
        private void m100759x2936bf5f(int i17, java.lang.Object obj) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50212xf703545d != null) {
                android.os.Message.obtain(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50212xf703545d, i17, obj).sendToTarget();
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af
        /* renamed from: onASyncCallResult */
        public void mo100760x63a07ff8(int i17, long j17, int i18, int i19) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100757x3164ae("onASyncCallResult, callType:" + i17 + ", opaque:" + j17 + ", errorType:" + i18 + ", errorCode:" + i19);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnASyncCallResultInfo onASyncCallResultInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnASyncCallResultInfo();
            onASyncCallResultInfo.f50236xf5b61eb8 = i17;
            onASyncCallResultInfo.f50239xc3c20421 = j17;
            onASyncCallResultInfo.f50238x13a49162 = i18;
            onASyncCallResultInfo.f50237x139cb015 = i19;
            m100759x2936bf5f(1, onASyncCallResultInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af
        /* renamed from: onDetailInfo */
        public void mo100761x8953bfde(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26297x46ca5c3b c26297x46ca5c3b) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100757x3164ae("onDetailInfo, type:" + c26297x46ca5c3b.f51901x368f3a + ", time:" + c26297x46ca5c3b.f51900x81b5142c);
            m100759x2936bf5f(5, c26297x46ca5c3b);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af
        /* renamed from: onError */
        public void mo100762xaf8aa769(int i17, int i18) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100757x3164ae("onError, msgType:" + i17 + ", errorCode:" + i18);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnErrorInfo onErrorInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnErrorInfo();
            onErrorInfo.f50241x5018025b = i17;
            onErrorInfo.f50240x139cb015 = i18;
            m100759x2936bf5f(4, onErrorInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af
        /* renamed from: onInfoLong */
        public void mo100763xafb1bb49(int i17, long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100757x3164ae("onInfoLong, infoType:" + i17 + ", lParam1:" + j17 + ", lParam2:" + j18);
            if (i17 == 253) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.m100715x6f630d7f(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapDrmType.class, (int) j17));
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoLongInfo onInfoLongInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoLongInfo();
            onInfoLongInfo.f50242xa9b6108 = i17;
            onInfoLongInfo.f50243xdf30e4d0 = j17;
            onInfoLongInfo.f50244xdf30e4d1 = j18;
            m100759x2936bf5f(2, onInfoLongInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af
        /* renamed from: onInfoObject */
        public void mo100764x8e9598cc(int i17, java.lang.Object obj) {
            if (!com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100740x383e4711(i17)) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100757x3164ae("onInfoObject, infoType:" + i17 + ", objParam:" + obj);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoObjectInfo onInfoObjectInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoObjectInfo();
            onInfoObjectInfo.f50245xa9b6108 = i17;
            onInfoObjectInfo.f50246x43bfdd6 = obj;
            m100759x2936bf5f(3, onInfoObjectInfo);
        }
    };

    /* renamed from: mNativeAudioFrameCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26397xc5894279 f50215x6f3f32a0 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26397xc5894279() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.3
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26397xc5894279
        /* renamed from: onAudioFrame */
        public void mo100765x22157276(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26283xdf8c0ed3 c26283xdf8c0ed3, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100458x30daf82b(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100778x1cda412(c26283xdf8c0ed3));
        }
    };

    /* renamed from: mNativeVideoFrameCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26403xb61cbdf4 f50222x5fd2ae1b = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26403xb61cbdf4() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.4
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26403xb61cbdf4
        /* renamed from: onVideoFrame */
        public void mo100766x654d98f1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26334x22c4354e c26334x22c4354e, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100470xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100797x926fc24d(c26334x22c4354e));
        }
    };

    /* renamed from: mNativeSubtitleFrameCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26401x6c06c09d f50221xd75c8b16 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26401x6c06c09d() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.5
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26401x6c06c09d
        /* renamed from: onSubtitleFrame */
        public void mo100767x70932096(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26327x7e714b19 c26327x7e714b19, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100469x715e46d8(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100794x5eaa4d3a(c26327x7e714b19));
        }
    };

    /* renamed from: mNativePostProcessFrameCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26400x83922380 f50220x38271a67 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26400x83922380() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.6
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26400x83922380
        /* renamed from: onPostProcessFrame */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26323x31e71b9a mo100768x6131f8fd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26323x31e71b9a c26323x31e71b9a, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m100793xbbbdac59 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100793xbbbdac59(c26323x31e71b9a);
            m100793xbbbdac59.f50934x1d90926 = i17;
            int i18 = c26323x31e71b9a.f52316x7f94e13e;
            if (i18 == 0) {
                return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100792x84e7dab9(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100471x18d178b4(m100793xbbbdac59));
            }
            if (i18 == 1) {
                return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100792x84e7dab9(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100459xff2eeff9(m100793xbbbdac59));
            }
            return null;
        }
    };

    /* renamed from: mNativeDemuxerCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.InterfaceC26350x1052c465 f50216x18c0e17d = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.InterfaceC26350x1052c465() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.7
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.InterfaceC26350x1052c465
        /* renamed from: onSdpExchange */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26352x61a9374 mo100769xc45f8823(java.lang.String str, int i17) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100786x29fb8bf5(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100466xc45f8823(str, i17));
        }
    };

    /* renamed from: mNativeEventRecordCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26398x266422b3 f50217xb36c376c = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26398x266422b3() { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.8
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26398x266422b3
        /* renamed from: onDrmInfo */
        public void mo100770xc240780e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerDrmParams tPPlayerDrmParams) {
            if (tPPlayerDrmParams == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100756x5c4d208("Native DrmInfo is null!");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100757x3164ae("onDrmInfo");
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100462xc240780e(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100781x5fde72d2(tPPlayerDrmParams));
        }
    };

    /* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer$EventHandler */
    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {

        /* renamed from: mWeakRef */
        private java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b> f50234xe70080ce;

        public EventHandler(android.os.Looper looper, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b c26150x904f783b) {
            super(looper);
            this.f50234xe70080ce = new java.lang.ref.WeakReference<>(c26150x904f783b);
        }

        /* renamed from: handleOnAsyncCallResult */
        private void m100771xdd509a90(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnASyncCallResultInfo onASyncCallResultInfo) {
            int i17 = onASyncCallResultInfo.f50236xf5b61eb8;
            if (i17 == 1) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100737xb4b46f84();
            } else if (i17 != 2) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100733xfbd11524(onASyncCallResultInfo);
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100738x43b74b98();
            }
        }

        /* renamed from: handleOnDetailInfo */
        private void m100772x68658626(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26297x46ca5c3b c26297x46ca5c3b) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100461x8953bfde(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100789x4f08081b(c26297x46ca5c3b));
        }

        /* renamed from: handleOnError */
        private void m100773xd1f81421(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.NativeErrorType int i17, int i18) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100463xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapErrorType.class, i17), i18, 0L, 0L);
        }

        /* renamed from: handleOnInfoLong */
        private void m100774xb907391(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoLongInfo onInfoLongInfo) {
            int i17 = onInfoLongInfo.f50242xa9b6108;
            if (i17 == 154) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100734xdd3e0c80();
            } else if (i17 != 250) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100735xdd136f50(i17, onInfoLongInfo);
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100739x5d7b743f(onInfoLongInfo.f50243xdf30e4d0, onInfoLongInfo.f50244xdf30e4d1);
            }
        }

        /* renamed from: handleOnInfoObject */
        private void m100775x6da75f14(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoObjectInfo onInfoObjectInfo) {
            int i17 = onInfoObjectInfo.f50245xa9b6108;
            if (i17 != 502) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.m100736xbed756ed(i17, onInfoObjectInfo);
            } else if (onInfoObjectInfo.f50246x43bfdd6 instanceof java.lang.String) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50225x1db0fcef.f50983x861be3e2 = (java.lang.String) onInfoObjectInfo.f50246x43bfdd6;
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50224xfab51b18.mo100468xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50225x1db0fcef);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (this.f50234xe70080ce.get() == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100756x5c4d208("mWeakRef is null");
                return;
            }
            int i17 = message.what;
            if (i17 == 1) {
                m100771xdd509a90((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnASyncCallResultInfo) message.obj);
                return;
            }
            if (i17 == 2) {
                m100774xb907391((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoLongInfo) message.obj);
                return;
            }
            if (i17 == 3) {
                m100775x6da75f14((com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoObjectInfo) message.obj);
                return;
            }
            if (i17 == 4) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnErrorInfo onErrorInfo = (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnErrorInfo) message.obj;
                m100773xd1f81421(onErrorInfo.f50241x5018025b, onErrorInfo.f50240x139cb015);
            } else {
                if (i17 == 5) {
                    m100772x68658626((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26297x46ca5c3b) message.obj);
                    return;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.f50214xe041c5d.mo100758x379286("message :" + message.what + "  not recognition");
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer$OnASyncCallResultInfo */
    /* loaded from: classes16.dex */
    public static class OnASyncCallResultInfo {

        /* renamed from: callType */
        @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.NativeMsgInfo
        int f50236xf5b61eb8;

        /* renamed from: errorCode */
        int f50237x139cb015;

        /* renamed from: errorType */
        int f50238x13a49162;

        /* renamed from: opaque */
        long f50239xc3c20421;
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer$OnErrorInfo */
    /* loaded from: classes16.dex */
    public static class OnErrorInfo {

        /* renamed from: errorCode */
        int f50240x139cb015;

        /* renamed from: msgType */
        int f50241x5018025b;
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer$OnInfoLongInfo */
    /* loaded from: classes16.dex */
    public static class OnInfoLongInfo {

        /* renamed from: infoType */
        int f50242xa9b6108;

        /* renamed from: lParam1 */
        long f50243xdf30e4d0;

        /* renamed from: lParam2 */
        long f50244xdf30e4d1;
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer$OnInfoObjectInfo */
    /* loaded from: classes16.dex */
    public static class OnInfoObjectInfo {

        /* renamed from: infoType */
        int f50245xa9b6108;

        /* renamed from: objParam */
        java.lang.Object f50246x43bfdd6;
    }

    public C26150x904f783b(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f50214xe041c5d = new com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d(c26478xc50084e3, TAG) { // from class: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d, com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
            /* renamed from: error */
            public void mo100756x5c4d208(java.lang.String str) {
                super.mo100756x5c4d208("tp@" + com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.hashCode() + " " + str);
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d, com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
            /* renamed from: info */
            public void mo100757x3164ae(java.lang.String str) {
                super.mo100757x3164ae("tp@" + com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.hashCode() + " " + str);
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d, com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
            /* renamed from: warn */
            public void mo100758x379286(java.lang.String str) {
                super.mo100758x379286("tp@" + com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.this.hashCode() + " " + str);
            }
        };
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74(context);
        this.f50223x14aac1ae = c26406x391cae74;
        c26406x391cae74.m102708x4098f8aa(this.f50219xc9b3a9e8);
        this.f50223x14aac1ae.m102697x7607549e(this.f50215x6f3f32a0);
        this.f50223x14aac1ae.m102715x669ad019(this.f50222x5fd2ae1b);
        this.f50223x14aac1ae.m102714xb084058(this.f50221xd75c8b16);
        this.f50223x14aac1ae.m102713x330145e5(this.f50220x38271a67);
        this.f50223x14aac1ae.m102704x8fa6303f(this.f50216x18c0e17d);
        this.f50223x14aac1ae.m102705x85a8552e(this.f50217xb36c376c);
        this.f50218xffedce76 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26409xd9e7d206();
        this.f50224xfab51b18 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1(this.f50214xe041c5d.mo103226xb5887064());
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            this.f50212xf703545d = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.EventHandler(myLooper, this);
        } else {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                this.f50212xf703545d = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.EventHandler(mainLooper, this);
            } else {
                this.f50212xf703545d = null;
            }
        }
        java.util.concurrent.ConcurrentSkipListMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d> concurrentSkipListMap = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d.f50247x4da4fdb4;
        if (concurrentSkipListMap.size() > 100) {
            concurrentSkipListMap.remove(concurrentSkipListMap.firstEntry().getKey());
        }
        java.lang.String m103237x752868d2 = c26478xc50084e3.m103237x752868d2();
        java.lang.String m103234x8fadefe3 = c26478xc50084e3.m103234x8fadefe3();
        int hashCode = hashCode();
        concurrentSkipListMap.put(java.lang.Integer.valueOf(hashCode), new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d(hashCode, this, m103234x8fadefe3, m103237x752868d2));
        com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d c26477x4798c35d = this.f50214xe041c5d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableStackTrace add:");
        sb6.append(hashCode);
        sb6.append(" size:");
        sb6.append(concurrentSkipListMap.size());
        sb6.append(" scene:");
        sb6.append(m103234x8fadefe3);
        sb6.append(" stack:");
        sb6.append(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51528x6acacd80 ? m103237x752868d2 : "disabled");
        c26477x4798c35d.mo100758x379286(sb6.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCommonASyncCallResult */
    public void m100733xfbd11524(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnASyncCallResultInfo onASyncCallResultInfo) {
        this.f50224xfab51b18.mo100464xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapMsgInfo.class, onASyncCallResultInfo.f50236xf5b61eb8), onASyncCallResultInfo.f50238x13a49162, onASyncCallResultInfo.f50237x139cb015, java.lang.Long.valueOf(onASyncCallResultInfo.f50239xc3c20421));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnComplete */
    public void m100734xdd3e0c80() {
        this.f50224xfab51b18.mo100460xa6db431b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnInfoLongNoConvertToListener */
    public void m100735xdd136f50(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.NativeErrorType int i17, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoLongInfo onInfoLongInfo) {
        int m100888xae234a19;
        long j17;
        int m100888xae234a192 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapMsgInfo.class, i17);
        if (m100888xae234a192 < 0) {
            this.f50214xe041c5d.mo100758x379286("msgType:" + i17 + ", cannot convert to thumbPlayer Info");
            return;
        }
        long j18 = onInfoLongInfo.f50243xdf30e4d0;
        long j19 = onInfoLongInfo.f50244xdf30e4d1;
        if (m100888xae234a192 == 203) {
            m100888xae234a19 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapAudioDecoderType.class, (int) j18);
        } else {
            if (m100888xae234a192 != 204) {
                this.f50214xe041c5d.mo100758x379286("unhandled thumbPlayerInfo=" + m100888xae234a192);
                j17 = j18;
                this.f50224xfab51b18.mo100464xc39adf2d(m100888xae234a192, j17, j19, null);
            }
            m100888xae234a19 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapVideoDecoderType.class, (int) j18);
        }
        j17 = m100888xae234a19;
        this.f50224xfab51b18.mo100464xc39adf2d(m100888xae234a192, j17, j19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnInfoObjectNoConvertToListener */
    public void m100736xbed756ed(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.NativeMsgInfo int i17, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.OnInfoObjectInfo onInfoObjectInfo) {
        java.lang.Object obj;
        java.lang.Object m100795x2b78551e;
        java.lang.Object obj2;
        int m100888xae234a19 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapMsgInfo.class, i17);
        if (m100888xae234a19 < 0 || (obj = onInfoObjectInfo.f50246x43bfdd6) == null) {
            this.f50214xe041c5d.mo100758x379286("msgType:" + i17 + ", cannot convert to thumbPlayer Info");
            return;
        }
        if (m100888xae234a19 != 500) {
            if (m100888xae234a19 == 602) {
                if (obj != null) {
                    m100795x2b78551e = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100779xfe32d7bd((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.BufferDurationInfo) obj);
                }
                obj2 = obj;
            } else if (m100888xae234a19 == 502) {
                m100795x2b78551e = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100782x15906db((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.MediaCodecInfo) obj);
            } else if (m100888xae234a19 == 503) {
                if (obj != null) {
                    m100795x2b78551e = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100799x28b1cfe5((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.VideoSeiInfo) obj);
                }
                obj2 = obj;
            } else if (m100888xae234a19 != 505) {
                if (m100888xae234a19 == 506) {
                    obj = (java.lang.String) obj;
                    this.f50214xe041c5d.mo100757x3164ae("TP_PLAYER_INFO_OBJECT_SUBTITLE_NOTE:" + obj);
                }
                obj2 = obj;
            } else {
                m100795x2b78551e = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100783x2f8b61a4((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.MediaDrmInfo) obj);
            }
            this.f50224xfab51b18.mo100464xc39adf2d(m100888xae234a19, 0L, 0L, obj2);
        }
        m100795x2b78551e = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100795x2b78551e((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.VideoCropInfo) obj);
        obj2 = m100795x2b78551e;
        this.f50224xfab51b18.mo100464xc39adf2d(m100888xae234a19, 0L, 0L, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnPrepared */
    public void m100737xb4b46f84() {
        this.f50224xfab51b18.mo100465x58d5b73c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnSeekComplete */
    public void m100738x43b74b98() {
        this.f50224xfab51b18.mo100467xe1fdf750();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnVideoSizeChanged */
    public void m100739x5d7b743f(long j17, long j18) {
        this.f50224xfab51b18.mo100472xdc9583f7(j17, j18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isObjectInfoTypeVerbose */
    public boolean m100740x383e4711(int i17) {
        return f50211xd7e3c25d.contains(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: programInfoConvert */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36 m100741x42a86001(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26411x17ea3e3e c26411x17ea3e3e) {
        if (c26411x17ea3e3e == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36 c26189x4a228d36 = new com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36();
        c26189x4a228d36.url = c26411x17ea3e3e.url;
        c26189x4a228d36.f50948x8ad4c0b1 = c26411x17ea3e3e.f53460x8ad4c0b1;
        c26189x4a228d36.f50950xa0a178ac = c26411x17ea3e3e.f53462xa0a178ac;
        c26189x4a228d36.f50949xc64196bf = c26411x17ea3e3e.f53461xc64196bf;
        c26189x4a228d36.f50947xbac0621e = c26411x17ea3e3e.f53459xbac0621e;
        return c26189x4a228d36;
    }

    /* renamed from: setPlayerInitConfigWithParamBoolean */
    private void m100742xbc82bf96(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamBoolean optionalParamBoolean) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping boolean is invalid, not found in array, id: " + i17);
            return;
        }
        if (m100877x151827c0.m100803x948c174b() == 3) {
            this.f50218xffedce76.m102734x76486a6c(m100877x151827c0.m100802x92760b69(), optionalParamBoolean.f50727x6ac9171);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: setPlayerInitConfigWithParamFloat */
    private void m100743x2171794a(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamFloat optionalParamFloat) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping float is invalid, not found in array, id: " + i17);
            return;
        }
        if (7 == m100877x151827c0.m100803x948c174b()) {
            this.f50218xffedce76.m102735x52fbe31a(m100877x151827c0.m100802x92760b69(), optionalParamFloat.f50730x6ac9171);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID:" + m100877x151827c0.m100802x92760b69() + " is not float");
    }

    /* renamed from: setPlayerInitConfigWithParamInt */
    private void m100744x1447d25d(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamInt optionalParamInt) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0 == null) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping int is invalid, not found in array, id: " + i17);
            return;
        }
        if (4 == m100877x151827c0.m100803x948c174b()) {
            this.f50218xffedce76.m102736xca02702d(m100877x151827c0.m100802x92760b69(), optionalParamInt.f50731x6ac9171);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID:" + m100877x151827c0.m100802x92760b69() + " is not int");
    }

    /* renamed from: setPlayerInitConfigWithParamLong */
    private void m100745x74b3d9ce(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong optionalParamLong) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping long is invalid, not found in array, id: " + i17);
            return;
        }
        int m100803x948c174b = m100877x151827c0.m100803x948c174b();
        if (m100803x948c174b == 1) {
            this.f50218xffedce76.m102737x764cf5fe(m100877x151827c0.m100802x92760b69(), optionalParamLong.f50734x6ac9171);
            return;
        }
        if (m100803x948c174b == 3) {
            this.f50218xffedce76.m102734x76486a6c(m100877x151827c0.m100802x92760b69(), optionalParamLong.f50734x6ac9171 > 0);
            return;
        }
        if (m100803x948c174b == 4) {
            this.f50218xffedce76.m102736xca02702d(m100877x151827c0.m100802x92760b69(), (int) optionalParamLong.f50734x6ac9171);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: setPlayerInitConfigWithParamObject */
    private void m100746x1b8a2a11(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamObject optionalParamObject) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0 == null) {
            this.f50214xe041c5d.mo100756x5c4d208("convertToNativeOptionalId failed, key: " + i17);
            return;
        }
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping object is invalid, not found in array, id: " + i17);
            return;
        }
        int m100802x92760b69 = m100877x151827c0.m100802x92760b69();
        if (m100802x92760b69 == 126) {
            this.f50218xffedce76.m102738x1b4cfa41(m100877x151827c0.m100802x92760b69(), com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100784xbd52054((com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a) optionalParamObject.f50735xb3582d72));
        } else {
            if (m100802x92760b69 == 414) {
                this.f50218xffedce76.m102738x1b4cfa41(m100877x151827c0.m100802x92760b69(), com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100801x8b55e84c((com.p314xaae8f345.p3006xb8ff1437.api.C26168x7199b3b1) optionalParamObject.f50735xb3582d72));
                return;
            }
            this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
        }
    }

    /* renamed from: setPlayerInitConfigWithParamQueueInt */
    private void m100747x16da3b70(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueInt optionalParamQueueInt) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping queue_int is invalid, not found in array, id: " + i17);
            return;
        }
        int[] iArr = optionalParamQueueInt.f50736x72048ae0;
        if (iArr == null || iArr.length == 0) {
            this.f50214xe041c5d.mo100756x5c4d208("queueint params is empty in" + i17);
            return;
        }
        if (m100877x151827c0.m100803x948c174b() == 5) {
            for (int i18 = 0; i18 < optionalParamQueueInt.f50736x72048ae0.length; i18++) {
                this.f50218xffedce76.m102724x8084ccdf(m100877x151827c0.m100802x92760b69(), optionalParamQueueInt.f50736x72048ae0[i18]);
            }
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: setPlayerInitConfigWithParamQueueString */
    private void m100748x6f5080f0(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamQueueString optionalParamQueueString) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping queue_string is invalid, not found in array, id: " + i17);
            return;
        }
        java.lang.String[] strArr = optionalParamQueueString.f50737x72048ae0;
        if (strArr == null || strArr.length == 0) {
            this.f50214xe041c5d.mo100756x5c4d208("queue String params is empty in" + i17);
            return;
        }
        if (m100877x151827c0.m100803x948c174b() == 6) {
            for (int i18 = 0; i18 < optionalParamQueueString.f50737x72048ae0.length; i18++) {
                this.f50218xffedce76.m102725xef82c521(m100877x151827c0.m100802x92760b69(), optionalParamQueueString.f50737x72048ae0[i18]);
            }
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: setPlayerInitConfigWithParamString */
    private void m100749x235ee6e3(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString optionalParamString) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0 == null) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping int is invalid, not found in array, id: " + i17);
            return;
        }
        if (2 == m100877x151827c0.m100803x948c174b()) {
            this.f50218xffedce76.m102739x2321b713(m100877x151827c0.m100802x92760b69(), optionalParamString.f50740x6ac9171);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID:" + m100877x151827c0.m100802x92760b69() + " is not string");
    }

    /* renamed from: setPlayerOptionWithParamBoolean */
    private void m100750xdbfdb319(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamBoolean optionalParamBoolean) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping string is invalid, not found in array, id: " + i17);
            return;
        }
        if (m100877x151827c0.m100803x948c174b() == 3) {
            this.f50223x14aac1ae.m102709x6e408693(m100877x151827c0.m100802x92760b69(), optionalParamBoolean.f50727x6ac9171 ? 1L : 0L, 0L);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: setPlayerOptionWithParamLong */
    private void m100751x75ea4d2b(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamLong optionalParamLong) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping long is invalid, not found in array, id: " + i17);
            return;
        }
        int m100803x948c174b = m100877x151827c0.m100803x948c174b();
        if (m100803x948c174b == 1 || m100803x948c174b == 3 || m100803x948c174b == 4) {
            this.f50223x14aac1ae.m102709x6e408693(m100877x151827c0.m100802x92760b69(), optionalParamLong.f50734x6ac9171, optionalParamLong.f50732xc4aaf944);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: setPlayerOptionWithParamObject */
    private void m100752xa8f13a2e(int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamObject optionalParamObject) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0 == null) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionaIdMapping object is invalid, not found in array, id: " + i17);
            return;
        }
        if (m100877x151827c0.m100802x92760b69() == 1001) {
            this.f50223x14aac1ae.m102710xe49eb996(m100877x151827c0.m100802x92760b69(), com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100788x1e0cd5a6((com.p314xaae8f345.p3006xb8ff1437.api.C26195xfe0f07df) optionalParamObject.f50735xb3582d72));
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: setPlayerOptionWithParamString */
    private void m100753xb0c5f700(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPOptionalId int i17, com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1.OptionalParamString optionalParamString) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.OptionIdMapping m100877x151827c0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100877x151827c0(i17);
        if (m100877x151827c0.m100804x4e4c5aec()) {
            this.f50214xe041c5d.mo100756x5c4d208("player optionalIdMapping string is invalid, not found in array, id: " + i17);
            return;
        }
        if (m100877x151827c0.m100803x948c174b() == 2) {
            this.f50223x14aac1ae.m102710xe49eb996(m100877x151827c0.m100802x92760b69(), optionalParamString.f50740x6ac9171);
            return;
        }
        this.f50214xe041c5d.mo100756x5c4d208("optionID type:" + m100877x151827c0.m100803x948c174b() + " is not implement");
    }

    /* renamed from: throwExceptionIfPlayerReleased */
    private void m100754x307947e4() {
        if (this.f50223x14aac1ae == null) {
            throw new java.lang.IllegalStateException("player has release");
        }
    }

    /* renamed from: trackInfoConvert */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d m100755x695fdada(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1 c26311x67c84ab1) {
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d();
        c26201xd4eb4d7d.f51065x337a8b = c26311x67c84ab1.f52217x2b7d4276;
        c26201xd4eb4d7d.f51066x2b805725 = c26311x67c84ab1.f52218x2b805725;
        int i17 = c26311x67c84ab1.f52211xd857386b;
        c26201xd4eb4d7d.f51059x753d275b = i17;
        if (i17 == 1) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26177x1ed9a2c7 c26177x1ed9a2c7 = c26201xd4eb4d7d.f51061xb79f792b;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26310x9514ea6e c26310x9514ea6e = c26311x67c84ab1.f52213xb79f792b;
            c26177x1ed9a2c7.f50571x337a8b = c26310x9514ea6e.f52202x337a8b;
            c26177x1ed9a2c7.f50566x8ad4c0b1 = c26310x9514ea6e.f52197x8ad4c0b1;
            c26177x1ed9a2c7.f50572xa0a178ac = c26310x9514ea6e.f52203xa0a178ac;
            c26177x1ed9a2c7.f50568x208b77cd = c26310x9514ea6e.f52199x208b77cd;
            c26177x1ed9a2c7.f50567xaf3af31d = c26310x9514ea6e.f52198xaf3af31d;
            c26177x1ed9a2c7.f50569x117d5bfa = c26310x9514ea6e.f52200x117d5bfa;
            c26177x1ed9a2c7.f50570x9fd29358 = c26310x9514ea6e.f52201x9fd29358;
        } else if (i17 == 2) {
            c26201xd4eb4d7d.f51060x40125e29 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100780x1a709c24(c26311x67c84ab1.f52212x40125e29);
        }
        c26201xd4eb4d7d.f51062xaac50094 = c26311x67c84ab1.f52214xaac50094;
        c26201xd4eb4d7d.f51064x17bd99e5 = c26311x67c84ab1.f52216x17bd99e5;
        c26201xd4eb4d7d.f51063xf2b76e07 = c26311x67c84ab1.f52215xf2b76e07;
        return c26201xd4eb4d7d;
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
        this.f50214xe041c5d.mo100757x3164ae("captureVideo, params" + c26171xafafaf50);
        if (this.f50213xf44e7185 == null) {
            interfaceC26170x325bffaf.m101026x3c4b75b1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51915x8a22277d);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa();
        c26396x622fcbfa.f53132x6be2dc6 = c26171xafafaf50.f50408x6be2dc6;
        c26396x622fcbfa.f53129xb7389127 = c26171xafafaf50.f50405xb7389127;
        c26396x622fcbfa.f53128xb45ff7f7 = c26171xafafaf50.f50404xb45ff7f7;
        c26396x622fcbfa.f53130xe0bfca90 = c26171xafafaf50.f50406xe0bfca90;
        c26396x622fcbfa.f53131x38da114b = c26171xafafaf50.f50407x38da114b;
        this.f50213xf44e7185.mo100553xbf439a76(mo100398xddd35a52(), c26396x622fcbfa, interfaceC26170x325bffaf);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: configBufferDurationAsync */
    public int mo100389x59e24e46(int i17, long j17, long j18, long j19) {
        this.f50214xe041c5d.mo100757x3164ae("configBufferDurationAsync");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102666x59e24e46(i17, j17, j18, j19);
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: deselectTrack */
    public void mo100390x4080528e(int i17, long j17) {
        this.f50214xe041c5d.mo100757x3164ae("selectTrack");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102667xf2fd288e(i17, j17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getAutoExpendBufferCount */
    public int mo100391xa42b888c() {
        this.f50214xe041c5d.mo100757x3164ae("getAutoExpendBufferCount");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102668xa42b888c();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxReadDurationPosMs */
    public long mo100392xdc51b7e8() {
        this.f50214xe041c5d.mo100757x3164ae("getBufferIOMaxReadDurationPosMs");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102669xdc51b7e8();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxReadFileOffset */
    public long mo100393x69f9266d() {
        this.f50214xe041c5d.mo100757x3164ae("getBufferIOMaxReadFileOffset");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102670x69f9266d();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    public long mo100394xed03e74f() {
        this.f50214xe041c5d.mo100757x3164ae("getBufferIOMaxWriteDurationPosMs");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102671xed03e74f();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferIOMaxWriteFileOffset */
    public long mo100395x1e708866() {
        this.f50214xe041c5d.mo100757x3164ae("getBufferIOMaxWriteFileOffset");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102672x1e708866();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferedDurationMs */
    public long mo100396x23e0c68f() {
        this.f50214xe041c5d.mo100757x3164ae("getBufferedDuration");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102673x23e0c68f();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getBufferedSize */
    public long mo100397x45feff6() {
        this.f50214xe041c5d.mo100757x3164ae("getBufferedSize");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102674x45feff6();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getCurrentPositionMs */
    public long mo100398xddd35a52() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102675xddd35a52();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDemuxerOffsetInFile */
    public long mo100399x37da763a() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102676x37da763a();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return -1");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDurationMs */
    public long mo100400x37a7fa50() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102677x37a7fa50();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDynamicStatisticParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            return null;
        }
        return c26406x391cae74.m102678x55ab8bad(z17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getGeneralPlayFlowParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            return null;
        }
        return c26406x391cae74.m102679xc0f8b3fa();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPlayableDurationMs */
    public long mo100403xac6a8d7e() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102673x23e0c68f() + this.f50223x14aac1ae.m102675xddd35a52();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100404x160d5c1c() {
        this.f50214xe041c5d.mo100757x3164ae("getProgramInfo");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] c26189x4a228d36Arr = null;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26411x17ea3e3e[] m102683x160d5c1c = c26406x391cae74.m102683x160d5c1c();
        if (m102683x160d5c1c != null && m102683x160d5c1c.length >= 1) {
            c26189x4a228d36Arr = new com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[m102683x160d5c1c.length];
            for (int i17 = 0; i17 < m102683x160d5c1c.length; i17++) {
                c26189x4a228d36Arr[i17] = m100741x42a86001(m102683x160d5c1c[i17]);
            }
        }
        return c26189x4a228d36Arr;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyLong */
    public long mo100405x2d67b867(int i17) {
        this.f50214xe041c5d.mo100757x3164ae("getPropertyLong:" + i17);
        m100754x307947e4();
        int m100886x2999bb54 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapPropertyId.class, i17);
        if (m100886x2999bb54 >= 0) {
            return this.f50223x14aac1ae.m102684x2d67b867(m100886x2999bb54);
        }
        this.f50214xe041c5d.mo100758x379286("paramId not found, return -1");
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyString */
    public java.lang.String mo100406x7e95833c(int i17) {
        this.f50214xe041c5d.mo100757x3164ae("getPropertyString:" + i17);
        m100754x307947e4();
        try {
            int m100886x2999bb54 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapPropertyId.class, i17);
            if (m100886x2999bb54 >= 0) {
                return this.f50223x14aac1ae.m102685x7e95833c(m100886x2999bb54);
            }
            this.f50214xe041c5d.mo100758x379286("getPropertyString, tpToNativeValue(TPNativeKeyMap.MapPropertyId.class," + i17 + "), return" + m100886x2999bb54);
            return "";
        } catch (java.lang.IllegalArgumentException unused) {
            this.f50214xe041c5d.mo100758x379286("paramId not found, return");
            return "";
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getTrackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3() {
        this.f50214xe041c5d.mo100757x3164ae("getTrackInfo");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] c26201xd4eb4d7dArr = null;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[] m102686x2ae89de3 = c26406x391cae74.m102686x2ae89de3();
        if (m102686x2ae89de3 != null && m102686x2ae89de3.length >= 1) {
            c26201xd4eb4d7dArr = new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[m102686x2ae89de3.length];
            for (int i17 = 0; i17 < m102686x2ae89de3.length; i17++) {
                c26201xd4eb4d7dArr[i17] = m100755x695fdada(m102686x2ae89de3[i17]);
            }
        }
        return c26201xd4eb4d7dArr;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoHeight */
    public int mo100408x463504c() {
        this.f50214xe041c5d.mo100757x3164ae("getVideoHeight");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102687x463504c();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoWidth */
    public int mo100409x8d5c7601() {
        this.f50214xe041c5d.mo100757x3164ae("getVideoWidth");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            return c26406x391cae74.m102688x8d5c7601();
        }
        this.f50214xe041c5d.mo100757x3164ae("player has released, return 0");
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: pause */
    public void mo100411x65825f6() {
        this.f50214xe041c5d.mo100757x3164ae("pause");
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102689x65825f6() != 0) {
            throw new java.lang.IllegalStateException("pause failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepare */
    public void mo100412xed060d07() {
        this.f50214xe041c5d.mo100757x3164ae("prepare");
        m100754x307947e4();
        this.f50223x14aac1ae.m102706x103ece74(this.f50218xffedce76);
        if (this.f50223x14aac1ae.m102690xed060d07() != 0) {
            throw new java.lang.IllegalStateException("prepare failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepareAsync */
    public void mo100413x857611b5() {
        this.f50214xe041c5d.mo100757x3164ae("prepareAsync");
        m100754x307947e4();
        this.f50223x14aac1ae.m102706x103ece74(this.f50218xffedce76);
        if (this.f50223x14aac1ae.m102691x857611b5() != 0) {
            throw new java.lang.IllegalStateException("prepareAsync failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: release */
    public void mo100414x41012807() {
        this.f50214xe041c5d.mo100757x3164ae("release");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 != null) {
            c26406x391cae74.m102692x41012807();
            this.f50223x14aac1ae = null;
            java.util.concurrent.ConcurrentSkipListMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d> concurrentSkipListMap = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d.f50247x4da4fdb4;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d remove = concurrentSkipListMap.remove(java.lang.Integer.valueOf(hashCode()));
            java.lang.String str = remove == null ? "null" : remove.f50249x683188c;
            java.lang.String str2 = remove != null ? remove.f50250x68ac288 : "null";
            com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d c26477x4798c35d = this.f50214xe041c5d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableStackTrace remove:");
            sb6.append(hashCode());
            sb6.append(" size:");
            sb6.append(concurrentSkipListMap.size());
            sb6.append(" scene:");
            sb6.append(str);
            sb6.append(" stack:");
            if (!com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51528x6acacd80) {
                str2 = "disabled";
            }
            sb6.append(str2);
            c26477x4798c35d.mo100758x379286(sb6.toString());
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301 interfaceC26138x49ec1301 = this.f50213xf44e7185;
        if (interfaceC26138x49ec1301 != null) {
            interfaceC26138x49ec1301.mo100554x41012807();
            this.f50213xf44e7185 = null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.EventHandler eventHandler = this.f50212xf703545d;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
            this.f50212xf703545d = null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: reset */
    public void mo100415x6761d4f() {
        this.f50214xe041c5d.mo100757x3164ae("reset");
        if (this.f50223x14aac1ae == null) {
            this.f50214xe041c5d.mo100758x379286("reset, player has released.");
            return;
        }
        this.f50214xe041c5d.mo100757x3164ae("reset before");
        this.f50223x14aac1ae.m102693x6761d4f();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26150x904f783b.EventHandler eventHandler = this.f50212xf703545d;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
        this.f50214xe041c5d.mo100757x3164ae("reset after");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100416xc9fc1b13(int i17) {
        this.f50214xe041c5d.mo100757x3164ae("seekTo:" + i17);
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102694x4a92eb29(i17, 1, 0L) == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("seek to position:" + i17 + " failed!!");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectProgram */
    public void mo100418x18ae2de8(int i17, long j17) {
        this.f50214xe041c5d.mo100757x3164ae("selectProgram, programIndex:" + i17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102695x7dd45574(i17, j17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectTrack */
    public void mo100419xc3b89af(int i17, long j17) {
        this.f50214xe041c5d.mo100757x3164ae("selectTrack");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102696x56fc3e0d(i17, j17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioGainRatio */
    public void mo100420x3aa51598(float f17) {
        this.f50214xe041c5d.mo100757x3164ae("setAudioGainRatio:" + f17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102700x8f6e70ce(f17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioNormalizeVolumeParams */
    public void mo100421x1e3370b9(java.lang.String str) {
        this.f50214xe041c5d.mo100757x3164ae("setAudioNormalizeVolumeParams:" + str);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102699x1e3370b9(str);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100425x683d6267(java.lang.String str) {
        this.f50214xe041c5d.mo100757x3164ae("setDataSource: " + str);
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102702x683d6267(str) == 0) {
            this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(str);
            return;
        }
        throw new java.lang.IllegalStateException("setDataSource url failed!!");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100427xfd27780d(boolean z17) {
        this.f50214xe041c5d.mo100757x3164ae("setLoopback:" + z17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102707xfd27780d(z17, 0L, -1L);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnAudioPcmOutputListener */
    public void mo100429x3282865a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        this.f50224xfab51b18.m100495x19b74abd(iOnAudioPcmOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnAudioProcessOutputListener */
    public void mo100430xb23c0daf(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        this.f50224xfab51b18.m100496xadcfb527(iOnAudioProcessOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnCompletionListener */
    public void mo100431xa4560c71(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener iOnCompletionListener) {
        this.f50224xfab51b18.m100497xa4560c71(iOnCompletionListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnDemuxerListener */
    public void mo100432xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener iOnDemuxerListener) {
        this.f50224xfab51b18.m100498xa8a04d4f(iOnDemuxerListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnDetailInfoListener */
    public void mo100433xa4b31634(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener iOnDetailInfoListener) {
        this.f50224xfab51b18.m100499xa4b31634(iOnDetailInfoListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnErrorListener */
    public void mo100434x6954c27b(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener) {
        this.f50224xfab51b18.m100500x6954c27b(iOnErrorListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnEventRecordListener */
    public void mo100435x5e0339be(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener iOnEventRecordListener) {
        this.f50224xfab51b18.m100501x5e0339be(iOnEventRecordListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnInfoListener */
    public void mo100436x40f8c003(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener) {
        this.f50224xfab51b18.m100502x40f8c003(iOnInfoListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnPreparedListener */
    public void mo100437x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener) {
        this.f50224xfab51b18.m100503x5dd7c812(iOnPreparedListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSeekCompleteListener */
    public void mo100438xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f50224xfab51b18.m100504xe1a2e326(iOnSeekCompleteListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleDataListener */
    public void mo100439x8796ba37(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.f50224xfab51b18.m100506x8796ba37(iOnSubtitleDataListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleFrameOutListener */
    public void mo100440xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.f50224xfab51b18.m100507xa679d9ae(iOnSubtitleFrameOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoFrameOutListener */
    public void mo100441xf26db5af(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.f50224xfab51b18.m100508xf26db5af(iOnVideoFrameOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoProcessOutputListener */
    public void mo100442x7e05de2a(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        this.f50224xfab51b18.m100509x9b9c694c(iOnVideoProcessOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnVideoSizeChangedListener */
    public void mo100443x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.f50224xfab51b18.m100510x2d6d87cd(iOnVideoSizeChangedListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOutputMute */
    public void mo100444xd0747cbc(boolean z17) {
        this.f50214xe041c5d.mo100757x3164ae("setOutputMute:" + z17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102698x66f5b8cd(z17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySharpenSwitch */
    public void mo100445x41b4a011() {
        this.f50214xe041c5d.mo100757x3164ae("setPlaySharpenSwitch");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102711x41b4a011();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySpeedRatio */
    public void mo100446xd079f5a(float f17) {
        this.f50214xe041c5d.mo100757x3164ae("setPlaySpeedRatio:" + f17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102712xe8059f1d(f17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlayerOptionalParam */
    public void mo100447x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        this.f50214xe041c5d.mo100757x3164ae("setPlayerOptionalParam:" + c26182x67c007f1);
        if (this.f50223x14aac1ae == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
            return;
        }
        if (c26182x67c007f1.m101078x73e47eb1() == 1) {
            if (c26182x67c007f1.m101069xb5884f29() < 500) {
                m100742xbc82bf96(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101070xc1e93551());
                return;
            } else {
                m100750xdbfdb319(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101070xc1e93551());
                return;
            }
        }
        if (c26182x67c007f1.m101078x73e47eb1() == 2) {
            if (c26182x67c007f1.m101069xb5884f29() < 500) {
                m100745x74b3d9ce(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101073x73e0b5f3());
                return;
            } else {
                m100751x75ea4d2b(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101073x73e0b5f3());
                return;
            }
        }
        if (c26182x67c007f1.m101078x73e47eb1() == 6) {
            if (c26182x67c007f1.m101069xb5884f29() < 500) {
                m100743x2171794a(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101071x7e021c5());
                return;
            }
            return;
        }
        if (c26182x67c007f1.m101078x73e47eb1() == 8) {
            if (c26182x67c007f1.m101069xb5884f29() < 500) {
                m100744x1447d25d(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101072xc1ac5d98());
                return;
            }
            return;
        }
        if (c26182x67c007f1.m101078x73e47eb1() == 3) {
            if (c26182x67c007f1.m101069xb5884f29() < 500) {
                m100749x235ee6e3(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101077xac54dc8());
                return;
            } else {
                m100753xb0c5f700(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101077xac54dc8());
                return;
            }
        }
        if (c26182x67c007f1.m101078x73e47eb1() == 4) {
            if (c26182x67c007f1.m101069xb5884f29() < 500) {
                m100747x16da3b70(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101075xbe427d15());
            }
        } else if (c26182x67c007f1.m101078x73e47eb1() == 5) {
            if (c26182x67c007f1.m101069xb5884f29() < 500) {
                m100748x6f5080f0(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101076xccbfa12b());
            }
        } else if (c26182x67c007f1.m101078x73e47eb1() != 7) {
            this.f50214xe041c5d.mo100758x379286("optionalParam param type is unknown, return");
        } else if (c26182x67c007f1.m101069xb5884f29() < 500) {
            m100746x1b8a2a11(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101074x2f090f6());
        } else {
            m100752xa8f13a2e(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101074x2f090f6());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurface */
    public void mo100448x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17) {
        com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d c26477x4798c35d = this.f50214xe041c5d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface, surface is null ? : ");
        sb6.append(surface == null);
        c26477x4798c35d.mo100757x3164ae(sb6.toString());
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else if (c26406x391cae74.m102717x8351de74(surface, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100878x4f940b02(i17)) != 0) {
            throw new java.lang.IllegalStateException("setSurface failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurfaceHolder */
    public void mo100449x5660d377(android.view.SurfaceHolder surfaceHolder) {
        com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d c26477x4798c35d = this.f50214xe041c5d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SurfaceHolder, surfaceHolder is null ? : ");
        sb6.append(surfaceHolder == null);
        c26477x4798c35d.mo100757x3164ae(sb6.toString());
        if (this.f50223x14aac1ae == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else if (surfaceHolder != null && surfaceHolder.getSurface() == null) {
            this.f50214xe041c5d.mo100756x5c4d208("SurfaceHolder，err.");
        } else {
            if (this.f50223x14aac1ae.m102716x20000d34(surfaceHolder == null ? null : surfaceHolder.getSurface()) != 0) {
                throw new java.lang.IllegalStateException("setSurface failed!!");
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: start */
    public void mo100450x68ac462() {
        this.f50214xe041c5d.mo100757x3164ae("start");
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102718x68ac462() != 0) {
            throw new java.lang.IllegalStateException("start failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: stop */
    public void mo100451x360802() {
        this.f50214xe041c5d.mo100757x3164ae("stop");
        m100754x307947e4();
        this.f50214xe041c5d.mo100757x3164ae("stop before");
        int m102719x360802 = this.f50223x14aac1ae.m102719x360802();
        this.f50214xe041c5d.mo100757x3164ae("stop after");
        if (m102719x360802 != 0) {
            throw new java.lang.IllegalStateException("stop failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100453x81d257a7(java.lang.String str, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
        this.f50214xe041c5d.mo100757x3164ae("switchDefinition url:" + str + " opaque:" + j17);
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102720x67cf6b15(str, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSwitchDefMode.class, i17), j17) == 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301 interfaceC26138x49ec1301 = this.f50213xf44e7185;
            if (interfaceC26138x49ec1301 != null) {
                interfaceC26138x49ec1301.mo100554x41012807();
                this.f50213xf44e7185 = null;
            }
            this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(str);
            return;
        }
        throw new java.lang.IllegalStateException("switchDefinition in invalid state");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchHdrModeWithSurface */
    public void mo100455x40944be2(android.view.Surface surface, int i17, int i18) {
        com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d c26477x4798c35d = this.f50214xe041c5d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface, surface is null ? : ");
        sb6.append(surface == null);
        c26477x4798c35d.mo100757x3164ae(sb6.toString());
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else if (c26406x391cae74.m102723x40944be2(surface, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100878x4f940b02(i17), i18) != 0) {
            throw new java.lang.IllegalStateException("setSurface failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: updateLoggerContext */
    public void mo100456x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f50214xe041c5d.mo103228xdf8cd0a6(new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, TAG));
        if (c26478xc50084e3 != null) {
            this.f50224xfab51b18.m100511x8bd16e11(this.f50214xe041c5d.m103231xe4cf9ecd().m103238xb5887064());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addAudioTrackSource */
    public void mo100385xa28fa651(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list) {
        this.f50214xe041c5d.mo100757x3164ae("addAudioTrackSource");
        if (this.f50223x14aac1ae == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo tPAudioTrackInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo();
        tPAudioTrackInfo.f50859xd88b9e1a = str;
        tPAudioTrackInfo.f50861x746f6dd7 = list;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 c26135xc8cc64f1 = this.f50224xfab51b18;
        if (c26135xc8cc64f1 != null) {
            c26135xc8cc64f1.mo100464xc39adf2d(1012, 0L, 0L, tPAudioTrackInfo);
        }
        if (android.text.TextUtils.isEmpty(tPAudioTrackInfo.f50862xc5474421)) {
            this.f50223x14aac1ae.m102663xa28fa651(tPAudioTrackInfo.f50859xd88b9e1a, str2, tPAudioTrackInfo.f50860x24345135);
        } else {
            this.f50223x14aac1ae.m102663xa28fa651(tPAudioTrackInfo.f50862xc5474421, str2, tPAudioTrackInfo.f50860x24345135);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addSubtitleSource */
    public void mo100387x14654554(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        this.f50214xe041c5d.mo100757x3164ae("addSubtitleSource");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else {
            c26406x391cae74.m102665x85795fad(str, str3, map);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100417xc9fc1b13(int i17, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSeekMode int i18) {
        this.f50214xe041c5d.mo100757x3164ae("seekTo:" + i17 + " mode:" + i18);
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102694x4a92eb29(i17, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSeekMode.class, i18), 0L) == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("seek to position:" + i17 + " failed!!");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100428xfd27780d(boolean z17, long j17, long j18) {
        this.f50214xe041c5d.mo100757x3164ae("setLoopback:" + z17 + " loopStartPositionMs:" + j17 + " loopEndPositionMs:" + j18);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74 = this.f50223x14aac1ae;
        if (c26406x391cae74 == null) {
            this.f50214xe041c5d.mo100758x379286("player has released, return");
        } else if (c26406x391cae74.m102707xfd27780d(z17, j17, j18) != 0) {
            throw new java.lang.IllegalStateException("set loopback failed!!");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100426x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f50214xe041c5d.mo100757x3164ae("setDataSource: " + str);
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102703x683d6267(str, map) == 0) {
            this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(str);
            return;
        }
        throw new java.lang.IllegalStateException("setDataSource url and header failed!!");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100423x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            int detachFd = parcelFileDescriptor.detachFd();
            android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(detachFd);
            int detachFd2 = fromFd.detachFd();
            fromFd.close();
            parcelFileDescriptor.close();
            this.f50214xe041c5d.mo100757x3164ae("setDataSource: " + parcelFileDescriptor + ", playFd:" + detachFd + ", captureFd: " + detachFd2);
            m100754x307947e4();
            if (this.f50223x14aac1ae.m102701x683d6267(detachFd, 0L, 0L) == 0) {
                this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(detachFd2);
                return;
            }
            throw new java.lang.IllegalStateException("setDataSource url pfd failed!!");
        }
        throw new java.lang.IllegalStateException("setDataSource url pfd is null!!");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100454x81d257a7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
        this.f50214xe041c5d.mo100757x3164ae("switchDefinition url:" + str + "httpHeader:" + map + " opaque:" + j17);
        m100754x307947e4();
        if (this.f50223x14aac1ae.m102722x67cf6b15(str, map, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSwitchDefMode.class, i17), j17) == 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26138x49ec1301 interfaceC26138x49ec1301 = this.f50213xf44e7185;
            if (interfaceC26138x49ec1301 != null) {
                interfaceC26138x49ec1301.mo100554x41012807();
                this.f50213xf44e7185 = null;
            }
            this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(str);
            return;
        }
        throw new java.lang.IllegalStateException("switchDefinition in invalid state");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100452x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
        int m102722x67cf6b15;
        this.f50214xe041c5d.mo100757x3164ae("switchDefinition mediaAsset:" + interfaceC26214xf9e9afd1 + " opaque:" + j17);
        m100754x307947e4();
        if (interfaceC26214xf9e9afd1 != null) {
            int m100886x2999bb54 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSwitchDefMode.class, i17);
            java.util.Map<java.lang.String, java.lang.String> mo101276x1275092b = interfaceC26214xf9e9afd1.mo101276x1275092b();
            if (mo101276x1275092b == null) {
                m102722x67cf6b15 = this.f50223x14aac1ae.m102720x67cf6b15(interfaceC26214xf9e9afd1.mo101278xb5887639(), m100886x2999bb54, j17);
            } else {
                m102722x67cf6b15 = this.f50223x14aac1ae.m102722x67cf6b15(interfaceC26214xf9e9afd1.mo101278xb5887639(), mo101276x1275092b, m100886x2999bb54, j17);
            }
            if (m102722x67cf6b15 == 0) {
                this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(interfaceC26214xf9e9afd1.mo101278xb5887639());
                return;
            }
            throw new java.lang.IllegalStateException("switchDefinition in invalid state");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100422x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            int detachFd = assetFileDescriptor.getParcelFileDescriptor().detachFd();
            long startOffset = assetFileDescriptor.getStartOffset();
            long length = assetFileDescriptor.getLength();
            android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(detachFd);
            int detachFd2 = fromFd.detachFd();
            fromFd.close();
            assetFileDescriptor.close();
            this.f50214xe041c5d.mo100757x3164ae("setDataSource: " + assetFileDescriptor + ", playFd: " + detachFd + ", offset: " + startOffset + ", length: " + length + ", captureFd: " + detachFd2);
            m100754x307947e4();
            if (this.f50223x14aac1ae.m102701x683d6267(detachFd, startOffset, length) == 0) {
                this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(detachFd2, startOffset, length);
                return;
            }
            throw new java.lang.IllegalStateException("setDataSource url afd failed!!");
        }
        throw new java.lang.IllegalStateException("setDataSource url afd is null!!");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100424x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        int m102703x683d6267;
        this.f50214xe041c5d.mo100757x3164ae("setDataSource: " + interfaceC26214xf9e9afd1);
        m100754x307947e4();
        if (interfaceC26214xf9e9afd1 != null) {
            java.lang.String mo101278xb5887639 = interfaceC26214xf9e9afd1.mo101278xb5887639();
            java.util.Map<java.lang.String, java.lang.String> mo101276x1275092b = interfaceC26214xf9e9afd1.mo101276x1275092b();
            if (mo101276x1275092b == null) {
                m102703x683d6267 = this.f50223x14aac1ae.m102702x683d6267(mo101278xb5887639);
            } else {
                m102703x683d6267 = this.f50223x14aac1ae.m102703x683d6267(mo101278xb5887639, mo101276x1275092b);
            }
            if (m102703x683d6267 == 0) {
                this.f50213xf44e7185 = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26257xb7fa952c(mo101278xb5887639);
                return;
            }
            throw new java.lang.IllegalStateException("setDataSource mediaAsset failed!!");
        }
        throw new java.lang.IllegalStateException("media asset is null!");
    }
}

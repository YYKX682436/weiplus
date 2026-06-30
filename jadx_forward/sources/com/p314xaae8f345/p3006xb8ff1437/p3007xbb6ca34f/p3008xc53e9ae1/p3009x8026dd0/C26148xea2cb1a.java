package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0;

/* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer */
/* loaded from: classes16.dex */
public class C26148xea2cb1a implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 {

    /* renamed from: RESET_TYPE_SEL_AUDIO_TRACK */
    private static final int f50099xb17f78e8 = 2;

    /* renamed from: RESET_TYPE_SWITCH_URL */
    private static final int f50100x35218cd9 = 1;
    private static final java.lang.String TAG = "TPSystemMediaPlayer";

    /* renamed from: TP_SYSTEM_PLAYER_INNER_RESTORE_STATE_ERR */
    private static final int f50101x6202ff4c = -10004;

    /* renamed from: TP_SYSTEM_PLAYER_INNER_SEL_TRACK_EXCEPTION */
    private static final int f50102x9a6329fc = -10000;

    /* renamed from: TP_SYSTEM_PLAYER_INNER_SEL_TRACK_NOT_SUPPORT */
    private static final int f50103x39ea88b0 = -10001;

    /* renamed from: TP_SYSTEM_PLAYER_INNER_TRACK_INDEX_ERR */
    private static final int f50104x45850f0a = -10002;

    /* renamed from: TP_SYSTEM_PLAYER_INNER_TRACK_TYPE_NOT_SUPPORT */
    private static final int f50105xd81fa18c = -10003;

    /* renamed from: mIntervalCheckBuffering */
    private static final int f50106xc43d606c = 400;

    /* renamed from: mAssetFd */
    private android.content.res.AssetFileDescriptor f50107x7416aaa1;

    /* renamed from: mBufferCheck */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.BufferCheck f50112x6b6519fb;

    /* renamed from: mContext */
    private android.content.Context f50123xd6cfe882;

    /* renamed from: mExtSub */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c f50127x296a32c;
    private java.io.FileDescriptor mFd;

    /* renamed from: mHeader */
    private java.util.Map<java.lang.String, java.lang.String> f50128x6a1095a;

    /* renamed from: mInnerPlayerListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.InnerPlayerListener f50129xa1f4acfe;

    /* renamed from: mLogger */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d f50138xe041c5d;

    /* renamed from: mMediaPlayer */
    private volatile android.media.MediaPlayer f50141x905d8d38;

    /* renamed from: mMediaPlayerState */
    private volatile com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState f50142x2169ca39;

    /* renamed from: mOnCompletionListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener f50144xe51cdcfc;

    /* renamed from: mOnErrorListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener f50145x1dca8710;

    /* renamed from: mOnInfoListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener f50146x911d94ce;

    /* renamed from: mOnPreparedListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener f50147xb29f3f5d;

    /* renamed from: mOnSeekCompleteListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener f50148xbf7bcf1;

    /* renamed from: mOnSubtitleDataListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener f50149xb1eb9402;

    /* renamed from: mOnSubtitleFrameOutListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener f50150x83e6d5f9;

    /* renamed from: mOnVideoSizeChangedListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener f50152xada8418;

    /* renamed from: mState */
    private volatile com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState f50158xbec81024;

    /* renamed from: mSurfaceObj */
    private java.lang.Object f50160x5da06557;

    /* renamed from: mTpSystemCapture */
    private com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26256xdacbf8fb f50162x21a0a4ce;

    /* renamed from: mUrl */
    private java.lang.String f50163x32d9c2;

    /* renamed from: mIsLoopback */
    private boolean f50134x337e7922 = false;

    /* renamed from: mLoopStartPositionMs */
    private long f50140x1b5e6dc0 = 0;

    /* renamed from: mLoopEndPositionMs */
    private long f50139xc41426b9 = 0;

    /* renamed from: mMute */
    private boolean f50143x624c826 = false;

    /* renamed from: mAudioGain */
    private float f50109x85e8ca88 = 1.0f;

    /* renamed from: mPlaySpeed */
    private float f50153xa23af86 = 1.0f;

    /* renamed from: mStartPositionMs */
    private int f50157x93433a84 = 0;

    /* renamed from: mSkipEndPositionMs */
    private long f50156x574d43be = -1;

    /* renamed from: mIsLive */
    private boolean f50133x911b403 = false;

    /* renamed from: mCgiDuration */
    private long f50113xe53aee8c = -1;

    /* renamed from: mCgiVideoHeight */
    private int f50114xc03258a = -1;

    /* renamed from: mCgiVideoWidth */
    private int f50115xd7ee0103 = -1;

    /* renamed from: mAttributes */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26168x7199b3b1 f50108xf45fa1a4 = null;

    /* renamed from: mIsAllowCheckBuffingByPosition */
    private boolean f50131x7b799439 = true;

    /* renamed from: mCheckPrepareTimeoutTask */
    private java.util.concurrent.Future<?> f50122x44867afa = null;

    /* renamed from: mCheckPrepareTimeoutLock */
    private final java.lang.Object f50121x44830aa0 = new java.lang.Object();

    /* renamed from: mIntervalCheckPreparingTimeOut */
    private long f50130x5ebec093 = 25000;

    /* renamed from: mCheckBuffingTimerLock */
    private final java.lang.Object f50120xb219a6dc = new java.lang.Object();

    /* renamed from: mCheckBufferFrequent */
    private int f50116x9d31dca9 = 3;

    /* renamed from: mCheckBufferTimeroutFrequent */
    private int f50119xab8de2b2 = 30;

    /* renamed from: mCheckBufferTimerOutByInfoLock */
    private final java.lang.Object f50118x57899734 = new java.lang.Object();

    /* renamed from: mCheckBufferTimeOutBySystemInfoTimer */
    private java.util.concurrent.Future<?> f50117x17551d0b = null;

    /* renamed from: mIsNotSeekable */
    private boolean f50135x5b6398ce = false;

    /* renamed from: mSuspend */
    private boolean f50161x2fb5530f = false;

    /* renamed from: mBaseDuration */
    private long f50111xbd5a7092 = 0;

    /* renamed from: mLastCheckPos */
    private long f50136x8ca3f1ef = -1;

    /* renamed from: mVideoWidth */
    private int f50165x7b4db658 = 0;

    /* renamed from: mVideoHeight */
    private int f50164xd49a1ad5 = 0;

    /* renamed from: mIsBuffering */
    private volatile boolean f50132xf3f4eeeb = false;

    /* renamed from: mcheckBufferPosNoChangeCount */
    private int f50166x23873fc5 = 0;

    /* renamed from: mSelectSubtitleIndex */
    private int f50155x678fbe51 = -1;

    /* renamed from: mCurAudioTrackIndex */
    private int f50124xfc554baa = 0;

    /* renamed from: mCurSubTrackIndex */
    private int f50126x9a8048d4 = -1;

    /* renamed from: mCurInnerAudioTrackIndex */
    private int f50125x9fe978ba = -1;

    /* renamed from: mAudioTrackInfo */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo> f50110x3f95ab30 = new java.util.ArrayList();

    /* renamed from: mSubTrackInfo */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo> f50159x3ff2af46 = new java.util.ArrayList();

    /* renamed from: mPosChangeCount */
    private long f50154xb6981e18 = 0;

    /* renamed from: mLastestAction */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo f50137xeb63619 = null;

    /* renamed from: mOnTimedTextListener */
    private android.media.MediaPlayer.OnTimedTextListener f50151x5ee30c0c = new android.media.MediaPlayer.OnTimedTextListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.8
        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(android.media.MediaPlayer mediaPlayer, android.media.TimedText timedText) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50149xb1eb9402 != null) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e = new com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e();
                c26193x359f687e.f50983x861be3e2 = timedText != null ? timedText.getText() : "";
                c26193x359f687e.f50984x43ea5e47 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50155x678fbe51;
                c26193x359f687e.f50982xc3950ab1 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.mo100398xddd35a52();
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50149xb1eb9402.mo100468xfb5e6f61(c26193x359f687e);
            }
        }
    };

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$BufferCheck */
    /* loaded from: classes16.dex */
    public static class BufferCheck {

        /* renamed from: mCheckAbort */
        boolean f50176xbb9e2b55;

        /* renamed from: mCheckBuffingTimer */
        java.util.concurrent.Future<?> f50177x6aa4de11;

        private BufferCheck() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ExternalTrackInfo */
    /* loaded from: classes16.dex */
    public static class ExternalTrackInfo {

        /* renamed from: httpHeader */
        public java.util.Map<java.lang.String, java.lang.String> f50178x24345135;

        /* renamed from: info */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d f50179x3164ae;

        /* renamed from: paramData */
        public java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> f50180x746f6dd7;
        public java.lang.String url;

        private ExternalTrackInfo() {
            this.url = "";
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$HookCallback */
    /* loaded from: classes13.dex */
    public static class HookCallback implements android.os.Handler.Callback {

        /* renamed from: impl */
        private android.os.Handler f50181x316220;

        public HookCallback(android.os.Handler handler) {
            this.f50181x316220 = handler;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            try {
                this.f50181x316220.handleMessage(message);
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.TAG, "mediaPlayerExceptionHook, HookCallback, " + android.util.Log.getStackTraceString(e17));
                return true;
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$InnerPlayerListener */
    /* loaded from: classes16.dex */
    public class InnerPlayerListener implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.media.MediaPlayer.OnBufferingUpdateListener {
        private InnerPlayerListener() {
        }

        /* renamed from: heightToCgiHeight */
        private int m100706x73f39a2a(int i17) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50114xc03258a > 0 ? com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50114xc03258a : i17;
        }

        /* renamed from: widthToCgiWidth */
        private int m100707x300a1a42(int i17) {
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50115xd7ee0103 > 0 ? com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50115xd7ee0103 : i17;
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i17) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer mediaPlayer) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50133x911b403) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100758x379286("onCompletion, unknown err.");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100757x3164ae("onCompletion.");
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50142x2169ca39 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.COMPLETE;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100679xcdfcaa24();
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener iOnCompletionListener = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50144xe51cdcfc;
            if (iOnCompletionListener != null) {
                iOnCompletionListener.mo100460xa6db431b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        
            if (r12 == 100) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        @Override // android.media.MediaPlayer.OnErrorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onError(android.media.MediaPlayer r11, int r12, int r13) {
            /*
                r10 = this;
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100672xbbd79176(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.COMPLETE
                r1 = 1
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100672xbbd79176(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STOPPED
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100672xbbd79176(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.RELEASE
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100672xbbd79176(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.IDLE
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100672xbbd79176(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.ERROR
                if (r11 != r0) goto L34
                goto L97
            L34:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.log.TPBaseLogger r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100670xbbd789f4(r11)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "onError, what: "
                r2.<init>(r3)
                r2.append(r12)
                java.lang.String r3 = ", extra: "
                r2.append(r3)
                r2.append(r13)
                java.lang.String r2 = r2.toString()
                r11.mo100757x3164ae(r2)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100642xbf185b60(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100656xbf18d741(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100673xbbd79178(r11, r0)
                r11 = -1010(0xfffffffffffffc0e, float:NaN)
                r0 = 2000(0x7d0, float:2.803E-42)
                if (r13 == r11) goto L7e
                r11 = -1007(0xfffffffffffffc11, float:NaN)
                if (r13 == r11) goto L7e
                r11 = -110(0xffffffffffffff92, float:NaN)
                r2 = 2001(0x7d1, float:2.804E-42)
                if (r13 == r11) goto L7c
                switch(r13) {
                    case -1005: goto L7c;
                    case -1004: goto L7c;
                    case -1003: goto L7c;
                    default: goto L75;
                }
            L75:
                if (r12 == r1) goto L7e
                r11 = 100
                if (r12 == r11) goto L7c
                goto L7e
            L7c:
                r4 = r2
                goto L7f
            L7e:
                r4 = r0
            L7f:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100641xbf18579f(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener$IOnErrorListener r3 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100643xbf185f21(r11)
                if (r3 == 0) goto L96
                int r5 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100675xbbd798f8(r12)
                long r6 = (long) r13
                r8 = 0
                r3.mo100463xaf8aa769(r4, r5, r6, r8)
            L96:
                return r1
            L97:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.log.TPBaseLogger r11 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100670xbbd789f4(r11)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "onError, illegal state:"
                r0.<init>(r2)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r2 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100672xbbd79176(r2)
                r0.append(r2)
                java.lang.String r2 = ", what:"
                r0.append(r2)
                r0.append(r12)
                java.lang.String r12 = ", extra:"
                r0.append(r12)
                r0.append(r13)
                java.lang.String r12 = r0.toString()
                r11.mo100757x3164ae(r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.InnerPlayerListener.onError(android.media.MediaPlayer, int, int):boolean");
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
            int i19;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100757x3164ae("mediaplayer, onInfo. what:" + i17 + ", extra:" + i18);
            if (i17 != 3) {
                if (i17 == 801) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50135x5b6398ce = true;
                } else if (i17 == 701) {
                    i19 = 200;
                } else if (i17 == 702) {
                    i19 = 201;
                }
                i19 = -1;
            } else {
                i19 = 106;
            }
            if (i19 != -1) {
                if (200 == i19 || 201 == i19) {
                    if (!com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100685xe18ae929()) {
                        if (200 == i19) {
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50132xf3f4eeeb = true;
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100701xbdcf4a40();
                        } else {
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50132xf3f4eeeb = false;
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100678x8aa4ddd8();
                        }
                        if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce != null) {
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce.mo100464xc39adf2d(i19, 0L, 0L, null);
                        }
                    }
                } else if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce.mo100464xc39adf2d(i19, 0L, 0L, null);
                }
            }
            if (i19 == 106) {
                int m100707x300a1a42 = m100707x300a1a42(mediaPlayer.getVideoWidth());
                int m100706x73f39a2a = m100706x73f39a2a(mediaPlayer.getVideoHeight());
                if ((m100706x73f39a2a != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50164xd49a1ad5 || m100707x300a1a42 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50165x7b4db658) && m100706x73f39a2a > 0 && m100707x300a1a42 > 0) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50164xd49a1ad5 = m100706x73f39a2a;
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50165x7b4db658 = m100707x300a1a42;
                    if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50152xada8418 != null) {
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50152xada8418.mo100472xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50165x7b4db658, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50164xd49a1ad5);
                    }
                }
            }
            return true;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer mediaPlayer) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARING) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100757x3164ae("onPrepared() is called in a wrong situation, mState = " + com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024);
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50142x2169ca39 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED;
            long duration = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50141x905d8d38.getDuration();
            if (duration <= 0) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50135x5b6398ce = true;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100757x3164ae("onPrepared() , mStartPositionMs=" + com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50157x93433a84 + ", duration:" + duration + ", mIsLive:" + com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50133x911b403);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100680xee8d78fd();
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100694x11224b0d();
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50141x905d8d38 == null) {
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100757x3164ae("onSeekComplete().");
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState2 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED;
            if (playerState == playerState2 && com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50142x2169ca39 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.COMPLETE) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 = playerState2;
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50142x2169ca39 = playerState2;
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50141x905d8d38.start();
            }
            if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 || com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50148xbf7bcf1 == null) {
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50148xbf7bcf1.mo100467xe1fdf750();
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
            if (i17 == 0 || i18 == 0) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100756x5c4d208("onVideoSizeChanged() size error, width:" + i17 + " height:" + i18);
                return;
            }
            int m100707x300a1a42 = m100707x300a1a42(i17);
            int m100706x73f39a2a = m100706x73f39a2a(i18);
            try {
                if ((m100707x300a1a42 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50165x7b4db658 || m100706x73f39a2a != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50164xd49a1ad5) && m100706x73f39a2a > 0 && m100707x300a1a42 > 0) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50152xada8418.mo100472xdc9583f7(m100707x300a1a42, m100706x73f39a2a);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100758x379286(e17.toString());
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50165x7b4db658 = m100707x300a1a42;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50164xd49a1ad5 = m100706x73f39a2a;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100757x3164ae("onVideoSizeChanged(), width:" + m100707x300a1a42 + " height:" + m100706x73f39a2a);
        }
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState */
    /* loaded from: classes16.dex */
    public enum PlayerState {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED,
        STARTED,
        PAUSED,
        STOPPED,
        COMPLETE,
        ERROR,
        RELEASE
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$ResetActionInfo */
    /* loaded from: classes16.dex */
    public static class ResetActionInfo {

        /* renamed from: externalAudioTrackIndex */
        int f50194xdae36772;

        /* renamed from: innerAudioTrackIndex */
        int f50195xc543b587;

        /* renamed from: innerSubtitleTrackIndex */
        int f50196xb7b1a975;

        /* renamed from: mResetType */
        int f50197xf3582b3c;

        /* renamed from: opaque */
        long f50198xc3c20421;

        /* renamed from: position */
        long f50199x2c929929;

        /* renamed from: state */
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState f50200x68ac491;
        java.lang.String url;

        private ResetActionInfo() {
        }
    }

    public C26148xea2cb1a(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f50138xe041c5d = new com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d(c26478xc50084e3, TAG);
        this.f50123xd6cfe882 = context;
        this.f50129xa1f4acfe = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.InnerPlayerListener();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo externalTrackInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo();
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d();
        externalTrackInfo.f50179x3164ae = c26201xd4eb4d7d;
        c26201xd4eb4d7d.f51064x17bd99e5 = true;
        c26201xd4eb4d7d.f51065x337a8b = "audio_1";
        this.f50110x3f95ab30.add(externalTrackInfo);
        m100684x8241f4b5();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215 c26146xe7089215 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215();
        this.f50127x296a32c = c26146xe7089215;
        c26146xe7089215.mo100567xfdcea4cd(new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener
            /* renamed from: onEventInfo */
            public void mo100575x4ab49() {
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener
            /* renamed from: onSubtitleFrameData */
            public void mo100576xba654960(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26327x7e714b19 c26327x7e714b19) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 m100794x5eaa4d3a = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100794x5eaa4d3a(c26327x7e714b19);
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50150x83e6d5f9;
                if (iOnSubtitleFrameOutListener != null) {
                    iOnSubtitleFrameOutListener.mo100469x715e46d8(m100794x5eaa4d3a);
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener
            /* renamed from: onSubtitleInfo */
            public void mo100577xfb60e465(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.SubtitleData subtitleData) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e = new com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e();
                c26193x359f687e.f50983x861be3e2 = subtitleData.f50039x36452d;
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener iOnSubtitleDataListener = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50149xb1eb9402;
                if (iOnSubtitleDataListener != null) {
                    iOnSubtitleDataListener.mo100468xfb5e6f61(c26193x359f687e);
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener
            /* renamed from: onSubtitleNote */
            public void mo100578xfb632fa9(java.lang.String str) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100757x3164ae("onSubtitleNote, " + str);
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce;
                if (iOnInfoListener != null) {
                    iOnInfoListener.mo100464xc39adf2d(506, 0L, 0L, str);
                }
            }
        });
        this.f50127x296a32c.mo100568x7be39900(new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IPlayPositionListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.2
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IPlayPositionListener
            /* renamed from: getCurrentPosition */
            public long mo100582x9746038c() {
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED || com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED) {
                    return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.mo100398xddd35a52();
                }
                return -1L;
            }
        });
        this.f50127x296a32c.mo100572x8615c39(new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnTrackSelectListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.3
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnTrackSelectListener
            /* renamed from: onTrackSelectFailure */
            public void mo100580xf3b1e1a2(int i17, long j17) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce.mo100464xc39adf2d(4, 2000L, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100681xe090ddde(i17), java.lang.Long.valueOf(j17));
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnTrackSelectListener
            /* renamed from: onTrackSelectSuccess */
            public void mo100581xc52af01b(long j17) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50127x296a32c.mo100573xa094bb3a();
                }
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce.mo100464xc39adf2d(4, 1000L, 0L, java.lang.Long.valueOf(j17));
                }
            }
        });
        this.f50127x296a32c.mo100569xca424262(new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubtitleErrorListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.4
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubtitleErrorListener
            /* renamed from: onSubtitleError */
            public void mo100579x70854931(int i17, int i18) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50146x911d94ce.mo100464xc39adf2d(254, i17, i18, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkBuffingEvent */
    public void m100676xccf5c253() {
        long mo100398xddd35a52 = mo100398xddd35a52();
        long j17 = this.f50136x8ca3f1ef;
        this.f50136x8ca3f1ef = mo100398xddd35a52;
        if (this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED) {
            if (this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED && this.f50132xf3f4eeeb) {
                this.f50138xe041c5d.mo100757x3164ae("checkBuffingEvent, pause state and send end buffering");
                this.f50132xf3f4eeeb = false;
                this.f50166x23873fc5 = 0;
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener = this.f50146x911d94ce;
                if (iOnInfoListener != null) {
                    iOnInfoListener.mo100464xc39adf2d(201, 0L, 0L, null);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f50134x337e7922) {
            long j18 = this.f50139xc41426b9;
            if (j18 > 0 && mo100398xddd35a52 >= j18 && !this.f50135x5b6398ce) {
                this.f50138xe041c5d.mo100757x3164ae("checkBuffingEvent, loopback skip end, curPosition:" + mo100398xddd35a52 + ", mLoopStartPositionMs:" + this.f50140x1b5e6dc0);
                this.f50141x905d8d38.seekTo((int) this.f50140x1b5e6dc0);
            }
        } else if (this.f50156x574d43be > 0 && mo100398xddd35a52 >= mo100400x37a7fa50() - this.f50156x574d43be) {
            this.f50138xe041c5d.mo100757x3164ae("checkBuffingEvent, skip end, mBaseDuration: " + this.f50111xbd5a7092 + ", curPosition:" + mo100398xddd35a52 + ", mSkipEndMilsec:" + this.f50156x574d43be);
            this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.COMPLETE;
            m100692x243c3317();
            m100679xcdfcaa24();
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener iOnCompletionListener = this.f50144xe51cdcfc;
            if (iOnCompletionListener != null) {
                iOnCompletionListener.mo100460xa6db431b();
                return;
            }
            return;
        }
        if (mo100398xddd35a52 != j17) {
            this.f50154xb6981e18++;
        }
        if (mo100398xddd35a52 != j17 || mo100398xddd35a52 <= 0) {
            if (this.f50132xf3f4eeeb) {
                this.f50138xe041c5d.mo100757x3164ae("checkBuffingEvent, position change, send end buffering");
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener2 = this.f50146x911d94ce;
                if (iOnInfoListener2 != null) {
                    iOnInfoListener2.mo100464xc39adf2d(201, mo100398xddd35a52, this.f50111xbd5a7092, java.lang.Long.valueOf(this.f50154xb6981e18));
                }
            }
            this.f50132xf3f4eeeb = false;
            this.f50166x23873fc5 = 0;
            return;
        }
        int i17 = this.f50166x23873fc5 + 1;
        this.f50166x23873fc5 = i17;
        if (i17 >= this.f50116x9d31dca9 && !this.f50132xf3f4eeeb) {
            this.f50132xf3f4eeeb = true;
            this.f50138xe041c5d.mo100757x3164ae("checkBuffingEvent, position no change,send start buffering");
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener3 = this.f50146x911d94ce;
            if (iOnInfoListener3 != null) {
                iOnInfoListener3.mo100464xc39adf2d(200, mo100398xddd35a52, this.f50111xbd5a7092, java.lang.Long.valueOf(this.f50154xb6981e18));
            }
        }
        if (this.f50166x23873fc5 >= this.f50119xab8de2b2) {
            this.f50138xe041c5d.mo100756x5c4d208("checkBuffingEvent post error");
            this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.ERROR;
            m100692x243c3317();
            this.f50132xf3f4eeeb = false;
            m100679xcdfcaa24();
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener = this.f50145x1dca8710;
            if (iOnErrorListener != null) {
                iOnErrorListener.mo100463xaf8aa769(2001, m100681xe090ddde(-110), 0L, 0L);
            }
        }
    }

    /* renamed from: deselectSubTrack */
    private void m100677x4cbe9ec8(int i17, long j17) {
        this.f50138xe041c5d.mo100757x3164ae("deselectSubTrack, trackIndex:" + i17 + ", opaque:" + j17);
        this.f50127x296a32c.mo100564x6761d4f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destroyCheckBufferTimeOutByInfo */
    public synchronized void m100678x8aa4ddd8() {
        synchronized (this.f50118x57899734) {
            java.util.concurrent.Future<?> future = this.f50117x17551d0b;
            if (future != null) {
                future.cancel(true);
                this.f50117x17551d0b = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destroyCheckBuffingTimer */
    public synchronized void m100679xcdfcaa24() {
        synchronized (this.f50120xb219a6dc) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.BufferCheck bufferCheck = this.f50112x6b6519fb;
            if (bufferCheck != null) {
                bufferCheck.f50176xbb9e2b55 = true;
                java.util.concurrent.Future<?> future = bufferCheck.f50177x6aa4de11;
                if (future != null) {
                    future.cancel(true);
                }
                this.f50112x6b6519fb.f50177x6aa4de11 = null;
                this.f50112x6b6519fb = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destroyCheckPrepareTimeoutTimer */
    public synchronized void m100680xee8d78fd() {
        synchronized (this.f50121x44830aa0) {
            java.util.concurrent.Future<?> future = this.f50122x44867afa;
            if (future != null) {
                future.cancel(true);
                this.f50122x44867afa = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: formatErrorCode */
    public static int m100681xe090ddde(int i17) {
        long j17 = i17 < 0 ? 10000000 - i17 : 10000000 + i17;
        if (j17 >= 2147483647L) {
            j17 = 2147483647L;
        }
        return (int) j17;
    }

    /* renamed from: handleDataSource */
    private void m100682xa7b714ad(int i17) {
        if (i17 <= 0) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo externalTrackInfo = this.f50110x3f95ab30.get(i17);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener = this.f50146x911d94ce;
        if (iOnInfoListener != null) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo tPAudioTrackInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo();
            tPAudioTrackInfo.f50859xd88b9e1a = externalTrackInfo.url;
            tPAudioTrackInfo.f50861x746f6dd7 = externalTrackInfo.f50180x746f6dd7;
            this.f50138xe041c5d.mo100757x3164ae("handleDataSource, audioTrack url:" + tPAudioTrackInfo.f50859xd88b9e1a);
            iOnInfoListener.mo100464xc39adf2d(1011, 0L, 0L, tPAudioTrackInfo);
        }
    }

    /* renamed from: handleSetDataSourceWithAfd */
    private void m100683xdb12541a(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.f50141x905d8d38.setDataSource(assetFileDescriptor);
    }

    /* renamed from: initMediaPlayer */
    private void m100684x8241f4b5() {
        this.f50141x905d8d38 = m100688x5385c941();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.IDLE;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isAllowCheckBufferByPosition */
    public boolean m100685xe18ae929() {
        if (this.f50133x911b403) {
            return false;
        }
        return this.f50131x7b799439;
    }

    /* renamed from: isValidRelease */
    private boolean m100686xe0656eb5(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState) {
        return playerState != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.RELEASE;
    }

    /* renamed from: isValidStop */
    private boolean m100687x410f014(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState) {
        return playerState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED || playerState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED || playerState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED;
    }

    /* renamed from: mediaPlayerCreate */
    private android.media.MediaPlayer m100688x5385c941() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9 c26145xf43bf3c9 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9();
        c26145xf43bf3c9.setOnPreparedListener(this.f50129xa1f4acfe);
        c26145xf43bf3c9.setOnCompletionListener(this.f50129xa1f4acfe);
        c26145xf43bf3c9.setOnErrorListener(this.f50129xa1f4acfe);
        c26145xf43bf3c9.setOnInfoListener(this.f50129xa1f4acfe);
        c26145xf43bf3c9.setOnBufferingUpdateListener(this.f50129xa1f4acfe);
        c26145xf43bf3c9.setOnSeekCompleteListener(this.f50129xa1f4acfe);
        c26145xf43bf3c9.setOnVideoSizeChangedListener(this.f50129xa1f4acfe);
        c26145xf43bf3c9.setOnTimedTextListener(this.f50151x5ee30c0c);
        return c26145xf43bf3c9;
    }

    /* renamed from: mediaPlayerExceptionHook */
    private void m100689xb6f76a2d(android.media.MediaPlayer mediaPlayer) {
        try {
            java.lang.reflect.Field declaredField = android.media.MediaPlayer.class.getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            android.os.Handler handler = (android.os.Handler) declaredField.get(mediaPlayer);
            java.lang.reflect.Field declaredField2 = android.os.Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            if (((android.os.Handler.Callback) declaredField2.get(handler)) == null) {
                declaredField2.set(handler, new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.HookCallback(handler));
            }
        } catch (java.lang.Exception e17) {
            this.f50138xe041c5d.mo100756x5c4d208("mediaPlayerExceptionHook, " + android.util.Log.getStackTraceString(e17));
        }
    }

    /* renamed from: mediaPlayerRelease */
    private void m100690x20e60862() {
        if (m100686xe0656eb5(this.f50142x2169ca39)) {
            this.f50142x2169ca39 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.RELEASE;
            this.f50138xe041c5d.mo100757x3164ae("MediaPlayer release.");
            this.f50141x905d8d38.release();
        }
    }

    /* renamed from: mediaPlayerReset */
    private void m100691xfb3d586a() {
        m100680xee8d78fd();
        m100679xcdfcaa24();
        m100678x8aa4ddd8();
        m100692x243c3317();
        this.f50141x905d8d38 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9();
        this.f50141x905d8d38.setOnPreparedListener(this.f50129xa1f4acfe);
        this.f50141x905d8d38.setOnCompletionListener(this.f50129xa1f4acfe);
        this.f50141x905d8d38.setOnErrorListener(this.f50129xa1f4acfe);
        this.f50141x905d8d38.setOnInfoListener(this.f50129xa1f4acfe);
        this.f50141x905d8d38.setOnBufferingUpdateListener(this.f50129xa1f4acfe);
        this.f50141x905d8d38.setOnSeekCompleteListener(this.f50129xa1f4acfe);
        this.f50141x905d8d38.setOnVideoSizeChangedListener(this.f50129xa1f4acfe);
        this.f50141x905d8d38.setOnTimedTextListener(this.f50151x5ee30c0c);
        if (this.f50143x624c826) {
            this.f50141x905d8d38.setVolume(0.0f, 0.0f);
        } else if (this.f50109x85e8ca88 != 1.0f) {
            android.media.MediaPlayer mediaPlayer = this.f50141x905d8d38;
            float f17 = this.f50109x85e8ca88;
            mediaPlayer.setVolume(f17, f17);
        }
        float f18 = this.f50153xa23af86;
        if (f18 != 1.0d) {
            mo100446xd079f5a(f18);
        }
        if (this.f50134x337e7922) {
            this.f50141x905d8d38.setLooping(this.f50134x337e7922);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mediaPlayerStopAndRelease */
    public void m100692x243c3317() {
        m100705x8fe60530();
        m100693x106c0967();
        m100690x20e60862();
    }

    /* renamed from: mediaPlayerstop */
    private void m100693x106c0967() {
        if (m100687x410f014(this.f50142x2169ca39)) {
            this.f50142x2169ca39 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STOPPED;
            this.f50138xe041c5d.mo100757x3164ae("MediaPlayer stop.");
            this.f50141x905d8d38.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: playerResetEnd */
    public synchronized void m100694x11224b0d() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = this.f50137xeb63619;
        this.f50138xe041c5d.mo100757x3164ae("playerResetEnd, actionInfo:" + resetActionInfo + ", mSuspend:" + this.f50161x2fb5530f);
        if (resetActionInfo == null || !this.f50161x2fb5530f) {
            if (this.f50157x93433a84 > 0 && !this.f50135x5b6398ce) {
                this.f50138xe041c5d.mo100757x3164ae("onPrepared(), and seekto:" + this.f50157x93433a84);
                try {
                    this.f50141x905d8d38.seekTo(this.f50157x93433a84);
                } catch (java.lang.Exception e17) {
                    this.f50138xe041c5d.mo103227xaa8bf022(e17);
                }
            }
            this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener = this.f50147xb29f3f5d;
            if (iOnPreparedListener != null) {
                iOnPreparedListener.mo100465x58d5b73c();
            }
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener = this.f50146x911d94ce;
        int i17 = resetActionInfo.f50197xf3582b3c == 1 ? 3 : 4;
        if (iOnInfoListener != null) {
            iOnInfoListener.mo100464xc39adf2d(i17, 1000L, 0L, java.lang.Long.valueOf(resetActionInfo.f50198xc3c20421));
        }
        if (resetActionInfo.f50195xc543b587 > 0) {
            this.f50141x905d8d38.selectTrack(resetActionInfo.f50195xc543b587);
        }
        if (resetActionInfo.f50196xb7b1a975 > 0) {
            this.f50141x905d8d38.selectTrack(resetActionInfo.f50196xb7b1a975);
        }
        if (resetActionInfo.f50199x2c929929 > 0 && !this.f50135x5b6398ce) {
            this.f50138xe041c5d.mo100757x3164ae("playerResetEnd, onPrepared(), and seek to:" + resetActionInfo.f50199x2c929929);
            try {
                this.f50141x905d8d38.seekTo((int) resetActionInfo.f50199x2c929929);
            } catch (java.lang.Exception e18) {
                this.f50138xe041c5d.mo103227xaa8bf022(e18);
            }
        }
        this.f50138xe041c5d.mo100757x3164ae("playerResetEnd, restore state:" + resetActionInfo.f50200x68ac491);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = resetActionInfo.f50200x68ac491;
        if (playerState != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.IDLE && playerState != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.INITIALIZED && playerState != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARING) {
            if (playerState != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED && playerState != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState2 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED;
                if (playerState == playerState2) {
                    this.f50138xe041c5d.mo100757x3164ae("playerResetEnd,  MediaPlayer.start().");
                    this.f50141x905d8d38.start();
                    this.f50158xbec81024 = resetActionInfo.f50200x68ac491;
                    this.f50142x2169ca39 = playerState2;
                    m100702xbc904829();
                } else {
                    this.f50138xe041c5d.mo100756x5c4d208("illegal state, state:" + resetActionInfo.f50200x68ac491);
                    this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.ERROR;
                    m100692x243c3317();
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener = this.f50145x1dca8710;
                    if (iOnErrorListener != null) {
                        iOnErrorListener.mo100463xaf8aa769(2000, m100681xe090ddde(f50101x6202ff4c), 0L, 0L);
                    }
                }
                this.f50161x2fb5530f = false;
                this.f50137xeb63619 = null;
                return;
            }
            this.f50158xbec81024 = playerState;
            this.f50161x2fb5530f = false;
            this.f50137xeb63619 = null;
            return;
        }
        this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener2 = this.f50147xb29f3f5d;
        if (iOnPreparedListener2 != null) {
            iOnPreparedListener2.mo100465x58d5b73c();
        }
        this.f50161x2fb5530f = false;
        this.f50137xeb63619 = null;
        return;
    }

    /* renamed from: playerResetStart */
    private synchronized void m100695x5283c214(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo) {
        int i17;
        java.lang.String str = resetActionInfo.url;
        resetActionInfo.f50199x2c929929 = mo100398xddd35a52();
        resetActionInfo.f50200x68ac491 = this.f50158xbec81024;
        resetActionInfo.f50195xc543b587 = this.f50125x9fe978ba;
        resetActionInfo.f50196xb7b1a975 = this.f50155x678fbe51;
        this.f50138xe041c5d.mo100757x3164ae("playerResetStart, pos:" + resetActionInfo.f50199x2c929929 + ", state:" + resetActionInfo.f50200x68ac491);
        this.f50161x2fb5530f = true;
        m100691xfb3d586a();
        this.f50142x2169ca39 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.IDLE;
        if (this.mFd != null) {
            this.f50141x905d8d38.setDataSource(this.mFd);
        } else {
            android.content.res.AssetFileDescriptor assetFileDescriptor = this.f50107x7416aaa1;
            if (assetFileDescriptor != null) {
                m100683xdb12541a(assetFileDescriptor);
            } else {
                m100682xa7b714ad(resetActionInfo.f50194xdae36772);
                java.util.Map<java.lang.String, java.lang.String> map = this.f50128x6a1095a;
                if (map == null || map.isEmpty()) {
                    this.f50141x905d8d38.setDataSource(str);
                } else {
                    this.f50141x905d8d38.setDataSource(this.f50123xd6cfe882, android.net.Uri.parse(str), this.f50128x6a1095a);
                }
            }
        }
        this.f50142x2169ca39 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.INITIALIZED;
        java.lang.Object obj = this.f50160x5da06557;
        if (obj == null) {
            this.f50141x905d8d38.setDisplay(null);
        } else if (obj instanceof android.view.SurfaceHolder) {
            this.f50141x905d8d38.setDisplay((android.view.SurfaceHolder) this.f50160x5da06557);
        } else if (obj instanceof android.view.Surface) {
            this.f50141x905d8d38.setSurface((android.view.Surface) this.f50160x5da06557);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo2 = this.f50137xeb63619;
        if (resetActionInfo2 != null && (i17 = resetActionInfo2.f50197xf3582b3c) != resetActionInfo.f50197xf3582b3c) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener = this.f50146x911d94ce;
            int i18 = i17 == 1 ? 3 : 4;
            if (iOnInfoListener != null) {
                iOnInfoListener.mo100464xc39adf2d(i18, resetActionInfo2.f50198xc3c20421, 0L, null);
            }
            resetActionInfo.f50200x68ac491 = resetActionInfo2.f50200x68ac491;
            resetActionInfo.f50199x2c929929 = resetActionInfo2.f50199x2c929929;
        }
        this.f50137xeb63619 = resetActionInfo;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = resetActionInfo.f50200x68ac491;
        if (playerState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARING || playerState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED || playerState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED || playerState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED) {
            mo100413x857611b5();
        }
    }

    /* renamed from: seekToComm */
    private void m100696xe9a27cbf(android.media.MediaPlayer mediaPlayer, int i17, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSeekMode int i18) {
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 < 26) {
            this.f50138xe041c5d.mo100757x3164ae("os ver is too low, current sdk int:" + i19 + ", is less than 26, use seekTo(int positionMs) instead");
            mediaPlayer.seekTo(i17);
            return;
        }
        int i27 = 1;
        try {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 3) {
                        i27 = 2;
                    }
                }
                mediaPlayer.seekTo(i17, i27);
                return;
            }
            mediaPlayer.seekTo(i17, i27);
            return;
        } catch (java.lang.Exception e17) {
            this.f50138xe041c5d.mo103227xaa8bf022(e17);
            try {
                if (this.f50142x2169ca39 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.COMPLETE) {
                    this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED;
                }
                mediaPlayer.seekTo(i17);
                return;
            } catch (java.lang.Exception e18) {
                this.f50138xe041c5d.mo103227xaa8bf022(e18);
                return;
            }
        }
        i27 = 0;
    }

    /* renamed from: selectAudioTrack */
    private void m100697x6f3d6131(int i17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo();
        resetActionInfo.f50198xc3c20421 = j17;
        resetActionInfo.f50194xdae36772 = i17;
        resetActionInfo.f50197xf3582b3c = 2;
        resetActionInfo.url = this.f50163x32d9c2;
        m100695x5283c214(resetActionInfo);
    }

    /* renamed from: selectSubTrack */
    private void m100698xbc330807(int i17, long j17) {
        this.f50127x296a32c.mo100564x6761d4f();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo externalTrackInfo = this.f50159x3ff2af46.get(i17);
        this.f50127x296a32c.mo100566x683d6267(externalTrackInfo.url, externalTrackInfo.f50178x24345135, j17);
        this.f50127x296a32c.mo100562xed060d07();
    }

    /* renamed from: setAudioAttributes */
    private void m100699xd2ed390b(com.p314xaae8f345.p3006xb8ff1437.api.C26168x7199b3b1 c26168x7199b3b1) {
        if (c26168x7199b3b1 == null) {
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.f50141x905d8d38.setAudioAttributes(this.f50108xf45fa1a4.m101011x3e9252dd());
        this.f50138xe041c5d.mo100757x3164ae("set audio attributes into MediaPlayer, API:" + i17 + ">=21, " + this.f50108xf45fa1a4.m101012x9616526c());
    }

    /* renamed from: setInitParamsBeforePrepare */
    private void m100700x37f11eb0() {
        m100699xd2ed390b(this.f50108xf45fa1a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startCheckBufferTimeOutByInfo */
    public void m100701xbdcf4a40() {
        synchronized (this.f50118x57899734) {
            if (this.f50117x17551d0b == null) {
                this.f50117x17551d0b = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104410x2b7e2fba().schedule(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED || !com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50132xf3f4eeeb) {
                            return;
                        }
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100756x5c4d208("startCheckBufferTimeOutByInfo, buffer last too long");
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.ERROR;
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100692x243c3317();
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50132xf3f4eeeb = false;
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100678x8aa4ddd8();
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50145x1dca8710;
                        if (iOnErrorListener != null) {
                            iOnErrorListener.mo100463xaf8aa769(2001, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100681xe090ddde(-110), 0L, 0L);
                        }
                    }
                }, this.f50119xab8de2b2 * 400, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: startCheckBufferingTimer */
    private void m100702xbc904829() {
        synchronized (this.f50120xb219a6dc) {
            if (!m100685xe18ae929()) {
                this.f50138xe041c5d.mo100757x3164ae("startCheckBufferingTimer, forbidden check buffer by position");
                return;
            }
            if (this.f50112x6b6519fb == null) {
                final com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.BufferCheck bufferCheck = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.BufferCheck();
                this.f50112x6b6519fb = bufferCheck;
                bufferCheck.f50176xbb9e2b55 = false;
                bufferCheck.f50177x6aa4de11 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104410x2b7e2fba().schedule(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        while (!bufferCheck.f50176xbb9e2b55) {
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100676xccf5c253();
                            try {
                                java.lang.Thread.sleep(400L);
                            } catch (java.lang.InterruptedException unused) {
                            }
                        }
                    }
                }, 0L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: startCheckPrepareTimeoutTimer */
    private void m100703x21b7e565() {
        this.f50138xe041c5d.mo100757x3164ae("startCheckPrepareTimeoutTimer");
        synchronized (this.f50121x44830aa0) {
            if (this.f50122x44867afa == null) {
                this.f50122x44867afa = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104410x2b7e2fba().schedule(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARING) {
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50138xe041c5d.mo100756x5c4d208("startCheckPrepareTimeoutTimer, post error");
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.ERROR;
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100692x243c3317();
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.m100680xee8d78fd();
                            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener iOnErrorListener = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.this.f50145x1dca8710;
                            if (iOnErrorListener != null) {
                                iOnErrorListener.mo100463xaf8aa769(2001, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.m100681xe090ddde(-110), 0L, 0L);
                            }
                        }
                    }
                }, this.f50130x5ebec093, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: systemTrackType2TPTrackType */
    private int m100704x6c35ed4d(int i17) {
        if (2 == i17) {
            return 2;
        }
        if (1 == i17) {
            return 1;
        }
        return 4 == i17 ? 3 : 0;
    }

    /* renamed from: unRegisterListener */
    private void m100705x8fe60530() {
        this.f50141x905d8d38.setOnPreparedListener(null);
        this.f50141x905d8d38.setOnCompletionListener(null);
        this.f50141x905d8d38.setOnErrorListener(null);
        this.f50141x905d8d38.setOnInfoListener(null);
        this.f50141x905d8d38.setOnBufferingUpdateListener(null);
        this.f50141x905d8d38.setOnSeekCompleteListener(null);
        this.f50141x905d8d38.setOnVideoSizeChangedListener(null);
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
        if (this.f50162x21a0a4ce == null) {
            interfaceC26170x325bffaf.m101026x3c4b75b1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51915x8a22277d);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa c26396x622fcbfa = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3041x762947d8.C26396x622fcbfa();
        c26396x622fcbfa.f53132x6be2dc6 = c26171xafafaf50.f50408x6be2dc6;
        c26396x622fcbfa.f53129xb7389127 = c26171xafafaf50.f50405xb7389127;
        c26396x622fcbfa.f53128xb45ff7f7 = c26171xafafaf50.f50404xb45ff7f7;
        c26396x622fcbfa.f53131x38da114b = c26171xafafaf50.f50407x38da114b;
        c26396x622fcbfa.f53130xe0bfca90 = c26171xafafaf50.f50406xe0bfca90;
        this.f50162x21a0a4ce.mo100553xbf439a76(mo100398xddd35a52(), c26396x622fcbfa, interfaceC26170x325bffaf);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: configBufferDurationAsync */
    public int mo100389x59e24e46(int i17, long j17, long j18, long j19) {
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: deselectTrack */
    public void mo100390x4080528e(int i17, long j17) {
        this.f50138xe041c5d.mo100757x3164ae("deselectTrack, trackID " + i17);
        int size = this.f50110x3f95ab30.size();
        int size2 = this.f50159x3ff2af46.size();
        if (i17 < size || i17 >= size2 + size) {
            this.f50141x905d8d38.deselectTrack(i17);
            return;
        }
        int i18 = i17 - size;
        try {
            m100677x4cbe9ec8(i18, j17);
        } catch (java.lang.Exception e17) {
            this.f50138xe041c5d.mo103227xaa8bf022(e17);
        }
        this.f50159x3ff2af46.get(i18).f50179x3164ae.f51064x17bd99e5 = false;
        this.f50126x9a8048d4 = -1;
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
        if (this.f50133x911b403) {
            return 0L;
        }
        if (!this.f50161x2fb5530f && this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.ERROR) {
            return (this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.IDLE || this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.INITIALIZED || this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARING || this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STOPPED || this.f50158xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED) ? this.f50157x93433a84 : this.f50141x905d8d38.getCurrentPosition();
        }
        long j17 = this.f50136x8ca3f1ef;
        return j17 == -1 ? this.f50157x93433a84 : j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDemuxerOffsetInFile */
    public long mo100399x37da763a() {
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getDurationMs */
    public long mo100400x37a7fa50() {
        if (this.f50133x911b403) {
            return 0L;
        }
        if (this.f50161x2fb5530f) {
            return this.f50111xbd5a7092;
        }
        if (this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED && this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED && this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED) {
            return -1L;
        }
        if (this.f50111xbd5a7092 <= 0) {
            this.f50111xbd5a7092 = this.f50141x905d8d38.getDuration();
        }
        long j17 = this.f50113xe53aee8c;
        if (j17 > 0) {
            long j18 = this.f50111xbd5a7092;
            if (j18 <= 0) {
                this.f50111xbd5a7092 = j17;
            } else {
                long abs = java.lang.Math.abs(j17 - j18) * 100;
                long j19 = this.f50113xe53aee8c;
                if (abs / j19 > 1) {
                    this.f50111xbd5a7092 = j19;
                }
            }
        }
        return this.f50111xbd5a7092;
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
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100404x160d5c1c() {
        return new com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[0];
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyLong */
    public long mo100405x2d67b867(int i17) {
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getPropertyString */
    public java.lang.String mo100406x7e95833c(int i17) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[LOOP:0: B:21:0x0059->B:23:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[LOOP:1: B:26:0x0073->B:28:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[LOOP:2: B:34:0x008e->B:35:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getTrackInfo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.mo100407x2ae89de3():com.tencent.thumbplayer.api.TPTrackInfo[]");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoHeight */
    public int mo100408x463504c() {
        this.f50138xe041c5d.mo100757x3164ae("getVideoHeight, height:" + this.f50164xd49a1ad5);
        return this.f50164xd49a1ad5;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: getVideoWidth */
    public int mo100409x8d5c7601() {
        this.f50138xe041c5d.mo100757x3164ae("getVideoWidth, width:" + this.f50165x7b4db658);
        return this.f50165x7b4db658;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: pause */
    public synchronized void mo100411x65825f6() {
        this.f50138xe041c5d.mo100757x3164ae("pause ");
        if (this.f50161x2fb5530f) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = this.f50137xeb63619;
            if (resetActionInfo != null) {
                resetActionInfo.f50200x68ac491 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED;
            }
            this.f50138xe041c5d.mo100758x379286("system player is busy.");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c interfaceC26143x92a3ac2c = this.f50127x296a32c;
        if (interfaceC26143x92a3ac2c != null) {
            interfaceC26143x92a3ac2c.mo100561xfb893626();
        }
        this.f50141x905d8d38.pause();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepare */
    public void mo100412xed060d07() {
        if (this.f50142x2169ca39 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.COMPLETE) {
            this.f50138xe041c5d.mo100758x379286("call prepare() on mMediaPlayerState==COMPLETE");
            return;
        }
        m100700x37f11eb0();
        this.f50138xe041c5d.mo100757x3164ae("prepare ");
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARING;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
        this.f50141x905d8d38.prepare();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: prepareAsync */
    public void mo100413x857611b5() {
        m100700x37f11eb0();
        this.f50138xe041c5d.mo100757x3164ae("prepareAsync ");
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARING;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
        this.f50141x905d8d38.prepareAsync();
        m100703x21b7e565();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: release */
    public synchronized void mo100414x41012807() {
        this.f50138xe041c5d.mo100757x3164ae("release ");
        this.f50127x296a32c.mo100563x41012807();
        m100680xee8d78fd();
        m100679xcdfcaa24();
        m100678x8aa4ddd8();
        this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.RELEASE;
        m100692x243c3317();
        this.f50147xb29f3f5d = null;
        this.f50144xe51cdcfc = null;
        this.f50146x911d94ce = null;
        this.f50145x1dca8710 = null;
        this.f50148xbf7bcf1 = null;
        this.f50152xada8418 = null;
        this.f50149xb1eb9402 = null;
        this.f50160x5da06557 = null;
        this.f50138xe041c5d.mo100757x3164ae("release over.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: reset */
    public synchronized void mo100415x6761d4f() {
        this.f50138xe041c5d.mo100757x3164ae("reset ");
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.IDLE;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
        this.f50127x296a32c.mo100564x6761d4f();
        this.f50141x905d8d38.reset();
        this.f50157x93433a84 = 0;
        this.f50156x574d43be = -1L;
        this.f50133x911b403 = false;
        this.f50113xe53aee8c = -1L;
        this.f50114xc03258a = -1;
        this.f50115xd7ee0103 = -1;
        this.f50108xf45fa1a4 = null;
        m100680xee8d78fd();
        m100679xcdfcaa24();
        m100678x8aa4ddd8();
        this.f50138xe041c5d.mo100757x3164ae("reset over.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100416xc9fc1b13(int i17) {
        this.f50138xe041c5d.mo100757x3164ae("seekTo, position: " + i17);
        if (this.f50135x5b6398ce) {
            this.f50138xe041c5d.mo100757x3164ae("current media is not seekable, ignore");
            return;
        }
        if (this.f50161x2fb5530f) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = this.f50137xeb63619;
            if (resetActionInfo != null) {
                resetActionInfo.f50199x2c929929 = i17;
                return;
            }
            return;
        }
        if (this.f50142x2169ca39 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.COMPLETE) {
            this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED;
        }
        this.f50141x905d8d38.seekTo(i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectProgram */
    public void mo100418x18ae2de8(int i17, long j17) {
        this.f50138xe041c5d.mo100756x5c4d208("selectProgram, android mediaplayer not support");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: selectTrack */
    public void mo100419xc3b89af(int i17, long j17) {
        android.media.MediaPlayer.TrackInfo[] trackInfoArr;
        this.f50138xe041c5d.mo100757x3164ae("selectTrack, trackID:" + i17 + ", opaque:" + j17);
        int size = this.f50110x3f95ab30.size();
        int size2 = this.f50159x3ff2af46.size();
        this.f50110x3f95ab30.size();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener = this.f50146x911d94ce;
        if (i17 >= 0 && i17 < size) {
            try {
                m100697x6f3d6131(i17, j17);
                this.f50110x3f95ab30.get(this.f50124xfc554baa).f50179x3164ae.f51064x17bd99e5 = false;
                this.f50110x3f95ab30.get(i17).f50179x3164ae.f51064x17bd99e5 = true;
                this.f50124xfc554baa = i17;
                return;
            } catch (java.lang.Exception e17) {
                this.f50138xe041c5d.mo103227xaa8bf022(e17);
                if (iOnInfoListener != null) {
                    iOnInfoListener.mo100464xc39adf2d(4, 2000L, m100681xe090ddde(-10000), java.lang.Long.valueOf(j17));
                    return;
                }
                return;
            }
        }
        if (i17 >= size && i17 < size + size2) {
            int i18 = i17 - size;
            try {
                m100698xbc330807(i18, j17);
            } catch (java.lang.Exception e18) {
                this.f50138xe041c5d.mo103227xaa8bf022(e18);
                if (iOnInfoListener != null) {
                    iOnInfoListener.mo100464xc39adf2d(4, 2000L, m100681xe090ddde(-10000), java.lang.Long.valueOf(j17));
                }
            }
            int i19 = this.f50126x9a8048d4;
            if (i19 >= 0 && i19 < size2) {
                this.f50159x3ff2af46.get(i19).f50179x3164ae.f51064x17bd99e5 = false;
            }
            this.f50159x3ff2af46.get(i18).f50179x3164ae.f51064x17bd99e5 = true;
            this.f50126x9a8048d4 = i17;
            return;
        }
        int i27 = i17 - (size + size2);
        if (this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED && this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED && this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED) {
            this.f50138xe041c5d.mo100756x5c4d208("selectTrack, illegal state:" + this.f50158xbec81024);
            return;
        }
        try {
            trackInfoArr = this.f50141x905d8d38.getTrackInfo();
        } catch (java.lang.Exception unused) {
            this.f50138xe041c5d.mo100756x5c4d208("getTrackInfo, android getTrackInfo crash");
            trackInfoArr = null;
        }
        if (trackInfoArr == null || trackInfoArr.length <= i27) {
            if (iOnInfoListener != null) {
                iOnInfoListener.mo100464xc39adf2d(4, 2000L, m100681xe090ddde(f50104x45850f0a), java.lang.Long.valueOf(j17));
                return;
            }
            return;
        }
        android.media.MediaPlayer.TrackInfo trackInfo = trackInfoArr[i27];
        if (trackInfo.getTrackType() == 2) {
            this.f50125x9fe978ba = i27;
        } else {
            if (trackInfo.getTrackType() != 4) {
                if (iOnInfoListener != null) {
                    iOnInfoListener.mo100464xc39adf2d(4, 2000L, m100681xe090ddde(f50105xd81fa18c), java.lang.Long.valueOf(j17));
                    return;
                }
                return;
            }
            this.f50155x678fbe51 = i27;
        }
        this.f50141x905d8d38.selectTrack(i27);
        if (iOnInfoListener != null) {
            iOnInfoListener.mo100464xc39adf2d(4, 1000L, 0L, java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioGainRatio */
    public void mo100420x3aa51598(float f17) {
        this.f50138xe041c5d.mo100757x3164ae("setAudioGainRatio, : " + f17);
        this.f50109x85e8ca88 = f17;
        try {
            if (this.f50141x905d8d38 != null) {
                android.media.MediaPlayer mediaPlayer = this.f50141x905d8d38;
                float f18 = this.f50109x85e8ca88;
                mediaPlayer.setVolume(f18, f18);
            }
        } catch (java.lang.IllegalStateException e17) {
            this.f50138xe041c5d.mo100757x3164ae("setAudioGainRatio ex : " + e17.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setAudioNormalizeVolumeParams */
    public void mo100421x1e3370b9(java.lang.String str) {
        this.f50138xe041c5d.mo100757x3164ae("setAudioNormalizeVolumeParams not supported.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100425x683d6267(java.lang.String str) {
        this.f50138xe041c5d.mo100757x3164ae("setDataSource， url: " + str);
        this.f50163x32d9c2 = str;
        this.f50141x905d8d38.setDataSource(str);
        this.f50162x21a0a4ce = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26256xdacbf8fb(str);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.INITIALIZED;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100427xfd27780d(boolean z17) {
        this.f50138xe041c5d.mo100757x3164ae("setLoopback, : " + z17);
        this.f50134x337e7922 = z17;
        this.f50141x905d8d38.setLooping(z17);
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
        this.f50144xe51cdcfc = iOnCompletionListener;
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
        this.f50145x1dca8710 = iOnErrorListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnEventRecordListener */
    public void mo100435x5e0339be(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener iOnEventRecordListener) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnInfoListener */
    public void mo100436x40f8c003(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener iOnInfoListener) {
        this.f50146x911d94ce = iOnInfoListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnPreparedListener */
    public void mo100437x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener iOnPreparedListener) {
        this.f50147xb29f3f5d = iOnPreparedListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSeekCompleteListener */
    public void mo100438xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f50148xbf7bcf1 = iOnSeekCompleteListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleDataListener */
    public void mo100439x8796ba37(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.f50149xb1eb9402 = iOnSubtitleDataListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOnSubtitleFrameOutListener */
    public void mo100440xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.f50150x83e6d5f9 = iOnSubtitleFrameOutListener;
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
        this.f50152xada8418 = iOnVideoSizeChangedListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setOutputMute */
    public void mo100444xd0747cbc(boolean z17) {
        this.f50138xe041c5d.mo100757x3164ae("setOutputMute, : " + z17);
        this.f50143x624c826 = z17;
        try {
            if (z17) {
                this.f50141x905d8d38.setVolume(0.0f, 0.0f);
                this.f50138xe041c5d.mo100757x3164ae("setOutputMute, true");
            } else {
                android.media.MediaPlayer mediaPlayer = this.f50141x905d8d38;
                float f17 = this.f50109x85e8ca88;
                mediaPlayer.setVolume(f17, f17);
                this.f50138xe041c5d.mo100757x3164ae("setOutputMute, false, mAudioGain: " + this.f50109x85e8ca88);
            }
        } catch (java.lang.Exception e17) {
            this.f50138xe041c5d.mo100757x3164ae("setOutputMute, Exception: " + e17.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySharpenSwitch */
    public void mo100445x41b4a011() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlaySpeedRatio */
    public void mo100446xd079f5a(float f17) {
        this.f50138xe041c5d.mo100757x3164ae("setPlaySpeedRatio, : " + f17);
        this.f50153xa23af86 = f17;
        this.f50138xe041c5d.mo100757x3164ae("setPlaySpeedRatio play speed:" + f17);
        try {
            android.media.PlaybackParams playbackParams = this.f50141x905d8d38.getPlaybackParams();
            if (playbackParams.getSpeed() != f17) {
                playbackParams.setSpeed(f17);
                this.f50141x905d8d38.setPlaybackParams(playbackParams);
            }
        } catch (java.lang.Exception e17) {
            this.f50138xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setPlayerOptionalParam */
    public void mo100447x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        int m101069xb5884f29 = c26182x67c007f1.m101069xb5884f29();
        if (m101069xb5884f29 == 1) {
            this.f50113xe53aee8c = c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            return;
        }
        if (m101069xb5884f29 == 2) {
            this.f50115xd7ee0103 = (int) c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, video width:" + this.f50115xd7ee0103);
            return;
        }
        if (m101069xb5884f29 == 3) {
            this.f50114xc03258a = (int) c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, video height:" + this.f50114xc03258a);
            return;
        }
        if (m101069xb5884f29 == 4) {
            this.f50133x911b403 = c26182x67c007f1.m101070xc1e93551().f50727x6ac9171;
            this.f50135x5b6398ce = true;
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, is live:" + this.f50133x911b403);
            return;
        }
        if (m101069xb5884f29 == 5) {
            this.f50131x7b799439 = c26182x67c007f1.m101070xc1e93551().f50727x6ac9171;
            return;
        }
        if (m101069xb5884f29 == 7) {
            this.f50116x9d31dca9 = (int) (c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171 / 400);
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, on buffer timeout:" + c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171 + "(ms)");
            return;
        }
        if (m101069xb5884f29 == 100) {
            this.f50157x93433a84 = (int) c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, start position:" + this.f50157x93433a84);
            return;
        }
        if (m101069xb5884f29 == 107) {
            this.f50119xab8de2b2 = (int) ((c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171 + 400) / 400);
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, buffer timeout:" + c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171 + "(ms)");
            return;
        }
        if (m101069xb5884f29 == 128) {
            this.f50130x5ebec093 = c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, prepare timeout:" + this.f50130x5ebec093 + "(ms)");
            return;
        }
        if (m101069xb5884f29 == 414) {
            this.f50108xf45fa1a4 = (com.p314xaae8f345.p3006xb8ff1437.api.C26168x7199b3b1) c26182x67c007f1.m101074x2f090f6().f50735xb3582d72;
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, " + this.f50108xf45fa1a4.m101012x9616526c());
            return;
        }
        if (m101069xb5884f29 == 450) {
            int i17 = (int) c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c interfaceC26143x92a3ac2c = this.f50127x296a32c;
            if (interfaceC26143x92a3ac2c != null) {
                interfaceC26143x92a3ac2c.mo100571x1d5f10f4(i17);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "setPlayerOptionalParam, subtitle type:" + c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171);
            return;
        }
        if (m101069xb5884f29 == 500) {
            this.f50156x574d43be = c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            this.f50138xe041c5d.mo100757x3164ae("setPlayerOptionalParam, skip end position:" + this.f50156x574d43be);
            return;
        }
        if (m101069xb5884f29 != 507) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26195xfe0f07df c26195xfe0f07df = (com.p314xaae8f345.p3006xb8ff1437.api.C26195xfe0f07df) c26182x67c007f1.m101074x2f090f6().f50735xb3582d72;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c interfaceC26143x92a3ac2c2 = this.f50127x296a32c;
        if (interfaceC26143x92a3ac2c2 != null) {
            interfaceC26143x92a3ac2c2.mo100570xd50c5039(c26195xfe0f07df);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "setPlayerOptionalParam, subtitle render model");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurface */
    public void mo100448x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17) {
        this.f50138xe041c5d.mo100757x3164ae("setSurface, surface: " + surface);
        this.f50160x5da06557 = surface;
        this.f50141x905d8d38.setSurface(surface);
        this.f50138xe041c5d.mo100757x3164ae("setSurface over, surface: " + surface);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setSurfaceHolder */
    public void mo100449x5660d377(android.view.SurfaceHolder surfaceHolder) {
        this.f50138xe041c5d.mo100757x3164ae("setSurfaceHolder, sh: " + surfaceHolder);
        this.f50160x5da06557 = surfaceHolder;
        this.f50141x905d8d38.setDisplay(surfaceHolder);
        this.f50138xe041c5d.mo100757x3164ae("setSurfaceHolder over, sh: " + surfaceHolder);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: start */
    public void mo100450x68ac462() {
        this.f50138xe041c5d.mo100757x3164ae("start ");
        if (this.f50161x2fb5530f) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = this.f50137xeb63619;
            if (resetActionInfo != null) {
                resetActionInfo.f50200x68ac491 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED;
            }
            this.f50138xe041c5d.mo100758x379286("system player is busy.");
            return;
        }
        if (this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PREPARED && this.f50158xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.PAUSED) {
            this.f50138xe041c5d.mo100758x379286("start(), illegal state, state:" + this.f50158xbec81024);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c interfaceC26143x92a3ac2c = this.f50127x296a32c;
        if (interfaceC26143x92a3ac2c != null) {
            interfaceC26143x92a3ac2c.mo100573xa094bb3a();
        }
        this.f50141x905d8d38.start();
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STARTED;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
        float f17 = this.f50153xa23af86;
        if (f17 != 1.0d) {
            mo100446xd079f5a(f17);
        }
        m100702xbc904829();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: stop */
    public synchronized void mo100451x360802() {
        this.f50138xe041c5d.mo100757x3164ae("stop ");
        m100680xee8d78fd();
        m100679xcdfcaa24();
        m100678x8aa4ddd8();
        this.f50158xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.STOPPED;
        m100693x106c0967();
        this.f50124xfc554baa = 0;
        this.f50126x9a8048d4 = -1;
        this.f50137xeb63619 = null;
        this.f50155x678fbe51 = -1;
        this.f50125x9fe978ba = -1;
        this.f50127x296a32c.mo100574x360802();
        this.f50154xb6981e18 = 0L;
        this.f50138xe041c5d.mo100757x3164ae("stop over.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100452x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchHdrModeWithSurface */
    public void mo100455x40944be2(android.view.Surface surface, int i17, int i18) {
        this.f50160x5da06557 = surface;
        this.f50141x905d8d38.setSurface(surface);
        this.f50138xe041c5d.mo100757x3164ae("setSurface over, surface: " + surface);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: updateLoggerContext */
    public void mo100456x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f50138xe041c5d.mo103228xdf8cd0a6(new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, TAG));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addAudioTrackSource */
    public void mo100385xa28fa651(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> list) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d();
            c26201xd4eb4d7d.f51065x337a8b = str2;
            c26201xd4eb4d7d.f51062xaac50094 = true;
            c26201xd4eb4d7d.f51063xf2b76e07 = false;
            c26201xd4eb4d7d.f51064x17bd99e5 = false;
            c26201xd4eb4d7d.f51066x2b805725 = 2;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo externalTrackInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo();
            externalTrackInfo.f50179x3164ae = c26201xd4eb4d7d;
            externalTrackInfo.url = str;
            externalTrackInfo.f50178x24345135 = map;
            externalTrackInfo.f50180x746f6dd7 = list;
            this.f50138xe041c5d.mo100757x3164ae("addAudioTrackSource, name:" + c26201xd4eb4d7d.f51065x337a8b + ", url:" + str2);
            this.f50110x3f95ab30.add(externalTrackInfo);
            return;
        }
        this.f50138xe041c5d.mo100756x5c4d208("addAudioTrackSource, illegal argument.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: addSubtitleSource */
    public void mo100387x14654554(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = new com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d();
            c26201xd4eb4d7d.f51065x337a8b = str3;
            c26201xd4eb4d7d.f51062xaac50094 = true;
            c26201xd4eb4d7d.f51063xf2b76e07 = false;
            c26201xd4eb4d7d.f51064x17bd99e5 = false;
            c26201xd4eb4d7d.f51066x2b805725 = 3;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo externalTrackInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ExternalTrackInfo();
            externalTrackInfo.f50179x3164ae = c26201xd4eb4d7d;
            externalTrackInfo.url = str;
            externalTrackInfo.f50178x24345135 = map;
            this.f50138xe041c5d.mo100757x3164ae("addSubtitleSource, name:" + c26201xd4eb4d7d.f51065x337a8b + ", url:" + str3);
            this.f50159x3ff2af46.add(externalTrackInfo);
            return;
        }
        this.f50138xe041c5d.mo100756x5c4d208("addSubtitleSource, illegal argument.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100453x81d257a7(java.lang.String str, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
        this.f50138xe041c5d.mo100757x3164ae("switchDefinition, defUrl: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            this.f50138xe041c5d.mo100757x3164ae("switchDefinition, defUrl is null");
            return;
        }
        this.f50163x32d9c2 = str;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo();
        resetActionInfo.f50198xc3c20421 = j17;
        resetActionInfo.f50194xdae36772 = this.f50124xfc554baa;
        resetActionInfo.f50197xf3582b3c = 1;
        resetActionInfo.url = str;
        try {
            m100695x5283c214(resetActionInfo);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("playerResetStart");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setLoopback */
    public void mo100428xfd27780d(boolean z17, long j17, long j18) {
        this.f50138xe041c5d.mo100757x3164ae("setLoopback, : " + z17 + ", loopStart: " + j17 + ", loopEnd: " + j18);
        if (j17 >= 0) {
            long j19 = this.f50111xbd5a7092;
            if (j17 <= j19 && j18 <= j19) {
                this.f50134x337e7922 = z17;
                this.f50140x1b5e6dc0 = j17;
                this.f50139xc41426b9 = j18;
                this.f50141x905d8d38.setLooping(z17);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("position error, must more than 0 and less than duration");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100426x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f50138xe041c5d.mo100757x3164ae("setDataSource httpHeader, url: " + str);
        this.f50163x32d9c2 = str;
        this.f50128x6a1095a = map;
        this.f50141x905d8d38.setDataSource(this.f50123xd6cfe882, android.net.Uri.parse(str), this.f50128x6a1095a);
        this.f50162x21a0a4ce = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26256xdacbf8fb(str);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.INITIALIZED;
        this.f50158xbec81024 = playerState;
        this.f50142x2169ca39 = playerState;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: seekTo */
    public void mo100417xc9fc1b13(int i17, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSeekMode int i18) {
        this.f50138xe041c5d.mo100757x3164ae("seekTo, position: " + i17 + ", mode: " + i18);
        if (this.f50135x5b6398ce) {
            this.f50138xe041c5d.mo100757x3164ae("current media is not seekable, ignore");
            return;
        }
        if (this.f50161x2fb5530f) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = this.f50137xeb63619;
            if (resetActionInfo != null) {
                resetActionInfo.f50199x2c929929 = i17;
                return;
            }
            return;
        }
        m100696xe9a27cbf(this.f50141x905d8d38, i17, i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: switchDefinition */
    public void mo100454x81d257a7(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSwitchDefMode int i17, long j17) {
        this.f50138xe041c5d.mo100757x3164ae("switchDefinition, defUrl: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            this.f50138xe041c5d.mo100757x3164ae("switchDefinition, defUrl is null");
            return;
        }
        this.f50163x32d9c2 = str;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo resetActionInfo = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.ResetActionInfo();
        resetActionInfo.f50198xc3c20421 = j17;
        resetActionInfo.f50194xdae36772 = this.f50124xfc554baa;
        resetActionInfo.f50197xf3582b3c = 1;
        resetActionInfo.url = str;
        try {
            m100695x5283c214(resetActionInfo);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("playerResetStart");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100423x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            this.f50138xe041c5d.mo100757x3164ae("setDataSource pfd， pfd: " + parcelFileDescriptor.toString());
            this.mFd = parcelFileDescriptor.getFileDescriptor();
            this.f50141x905d8d38.setDataSource(parcelFileDescriptor.getFileDescriptor());
            this.f50162x21a0a4ce = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26256xdacbf8fb(parcelFileDescriptor.getFileDescriptor());
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.INITIALIZED;
            this.f50158xbec81024 = playerState;
            this.f50142x2169ca39 = playerState;
            return;
        }
        this.f50138xe041c5d.mo100757x3164ae("setDataSource pfd is null ");
        throw new java.lang.IllegalArgumentException("pfd is null");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100422x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            this.f50138xe041c5d.mo100757x3164ae("setDataSource afd， afd: " + assetFileDescriptor.toString());
            this.f50107x7416aaa1 = assetFileDescriptor;
            m100683xdb12541a(assetFileDescriptor);
            this.f50162x21a0a4ce = new com.p314xaae8f345.p3006xb8ff1437.p3022xfd16d1d7.C26256xdacbf8fb(assetFileDescriptor);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState playerState = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26148xea2cb1a.PlayerState.INITIALIZED;
            this.f50158xbec81024 = playerState;
            this.f50142x2169ca39 = playerState;
            return;
        }
        this.f50138xe041c5d.mo100757x3164ae("setDataSource afd is null ");
        throw new java.lang.IllegalArgumentException("afd is null");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7
    /* renamed from: setDataSource */
    public void mo100424x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        throw new java.lang.IllegalArgumentException("setDataSource by asset, android mediaplayer not support");
    }
}

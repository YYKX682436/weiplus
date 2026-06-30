package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0;

/* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer */
/* loaded from: classes15.dex */
public class C26144xda1bd265 extends com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9 {
    private static final java.lang.String TAG = "TPThumbPlayer[TPAsyncMediaPlayer.java]";

    /* renamed from: TP_MEDIAPLAYER_MSG_PAUSE */
    private static final int f50040xa24e89db = 3;

    /* renamed from: TP_MEDIAPLAYER_MSG_RELEASE */
    private static final int f50041xb8ee22ac = 8;

    /* renamed from: TP_MEDIAPLAYER_MSG_RESET */
    private static final int f50042xa26c8134 = 7;

    /* renamed from: TP_MEDIAPLAYER_MSG_SEEK */
    private static final int f50043x4f9055d3 = 4;

    /* renamed from: TP_MEDIAPLAYER_MSG_SEEK_BY_MODE */
    private static final int f50044x79fbfa1f = 5;

    /* renamed from: TP_MEDIAPLAYER_MSG_SETSURFACE */
    private static final int f50045xc2132926 = 1;

    /* renamed from: TP_MEDIAPLAYER_MSG_SET_PLAY_PARAM */
    private static final int f50046x9ecde15a = 9;

    /* renamed from: TP_MEDIAPLAYER_MSG_START */
    private static final int f50047xa2812847 = 2;

    /* renamed from: TP_MEDIAPLAYER_MSG_STOP */
    private static final int f50048x4f908f5d = 6;

    /* renamed from: WAIT_STOP_TIMEOUT */
    private static final int f50049x6975048e = 2500;

    /* renamed from: mOnSeekCompleteListener */
    private android.media.MediaPlayer.OnSeekCompleteListener f50054xbf7bcf1;

    /* renamed from: mStopCondition */
    private final java.lang.Object f50059xafcf6fcc = new java.lang.Object();

    /* renamed from: mResetCondition */
    private final java.lang.Object f50057xdd930259 = new java.lang.Object();

    /* renamed from: mReleaseCondition */
    private final java.lang.Object f50056xe2014761 = new java.lang.Object();

    /* renamed from: mLastSeekPos */
    private long f50053x8fe25a99 = 0;

    /* renamed from: mIsSeeking */
    private boolean f50052xcdb027f3 = false;

    /* renamed from: mStateLock */
    private final java.lang.Object f50058xfe5f976f = new java.lang.Object();

    /* renamed from: mOnSeekCompleteListenerInner */
    private android.media.MediaPlayer.OnSeekCompleteListener f50055x44f60fe5 = new android.media.MediaPlayer.OnSeekCompleteListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer.1
        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.this.f50058xfe5f976f) {
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.this.f50052xcdb027f3 = false;
            }
            android.media.MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.this.f50054xbf7bcf1;
            if (onSeekCompleteListener != null) {
                onSeekCompleteListener.onSeekComplete(mediaPlayer);
            }
        }
    };

    /* renamed from: mHandlerThread */
    private android.os.HandlerThread f50051x3e0f3a87 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104411x2a51c4e4();

    /* renamed from: mEventHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.EventHandler f50050xf703545d = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.EventHandler(this.f50051x3e0f3a87.getLooper(), this);

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPAsyncMediaPlayer$EventHandler */
    /* loaded from: classes15.dex */
    public static class EventHandler extends android.os.Handler {

        /* renamed from: mWeakRef */
        private java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265> f50061xe70080ce;

        public EventHandler(android.os.Looper looper, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265 c26144xda1bd265) {
            super(looper);
            this.f50061xe70080ce = new java.lang.ref.WeakReference<>(c26144xda1bd265);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.TAG, "EventHandler msg msg.what: " + message.what + ", value: " + message.what + ", arg1: " + message.arg1 + ", arg2: " + message.arg2);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265 c26144xda1bd265 = this.f50061xe70080ce.get();
            if (c26144xda1bd265 == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.TAG, "mWeakRef is null");
                return;
            }
            switch (message.what) {
                case 1:
                    c26144xda1bd265.m100592x9ea72e33(message);
                    return;
                case 2:
                    c26144xda1bd265.m100593x585bff1a();
                    return;
                case 3:
                    c26144xda1bd265.m100586x582960ae();
                    return;
                case 4:
                    c26144xda1bd265.m100589xb252375b(message);
                    return;
                case 5:
                    c26144xda1bd265.m100590xe8d1a9d5(message);
                    return;
                case 6:
                    c26144xda1bd265.m100594x7676964a();
                    return;
                case 7:
                    c26144xda1bd265.m100588x58475807();
                    return;
                case 8:
                    c26144xda1bd265.m100587x636e94bf();
                    return;
                case 9:
                    c26144xda1bd265.m100591x37a6973b(message);
                    return;
                default:
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26144xda1bd265.TAG, "eventHandler unknow msg");
                    return;
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9, android.media.MediaPlayer
    public int getCurrentPosition() {
        return this.f50052xcdb027f3 ? (int) this.f50053x8fe25a99 : super.getCurrentPosition();
    }

    /* renamed from: handlePause */
    public void m100586x582960ae() {
        try {
            super.pause();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: handleRelease */
    public void m100587x636e94bf() {
        try {
            super.release();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104417x408b7293(this.f50051x3e0f3a87, this.f50050xf703545d);
        this.f50051x3e0f3a87 = null;
        this.f50050xf703545d = null;
        synchronized (this.f50056xe2014761) {
            this.f50056xe2014761.notify();
        }
    }

    /* renamed from: handleReset */
    public void m100588x58475807() {
        try {
            super.reset();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
        synchronized (this.f50057xdd930259) {
            this.f50057xdd930259.notify();
        }
    }

    /* renamed from: handleSeekTo */
    public void m100589xb252375b(android.os.Message message) {
        synchronized (this.f50058xfe5f976f) {
            try {
                super.seekTo(message.arg1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    /* renamed from: handleSeekToByMode */
    public void m100590xe8d1a9d5(android.os.Message message) {
        synchronized (this.f50058xfe5f976f) {
            try {
                super.seekTo(((java.lang.Long) message.obj).longValue(), message.arg1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    /* renamed from: handleSetPlaybackParams */
    public void m100591x37a6973b(android.os.Message message) {
        try {
            super.setPlaybackParams((android.media.PlaybackParams) message.obj);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: handleSetSurface */
    public void m100592x9ea72e33(android.os.Message message) {
        super.setSurface((android.view.Surface) message.obj);
    }

    /* renamed from: handleStart */
    public void m100593x585bff1a() {
        try {
            super.start();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: handleStop */
    public void m100594x7676964a() {
        try {
            super.stop();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
        synchronized (this.f50059xafcf6fcc) {
            this.f50059xafcf6fcc.notify();
        }
    }

    @Override // android.media.MediaPlayer
    public void pause() {
        this.f50050xf703545d.sendEmptyMessage(3);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9, android.media.MediaPlayer
    public void release() {
        synchronized (this.f50056xe2014761) {
            this.f50050xf703545d.sendEmptyMessage(8);
            try {
                this.f50056xe2014761.wait(2500L);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9, android.media.MediaPlayer
    public void reset() {
        synchronized (this.f50057xdd930259) {
            this.f50050xf703545d.sendEmptyMessage(7);
            try {
                this.f50057xdd930259.wait(2500L);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    @Override // android.media.MediaPlayer
    public void seekTo(int i17) {
        synchronized (this.f50058xfe5f976f) {
            this.f50053x8fe25a99 = i17;
            this.f50052xcdb027f3 = true;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 4;
            obtain.arg1 = i17;
            this.f50050xf703545d.sendMessage(obtain);
        }
    }

    @Override // android.media.MediaPlayer
    public void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f50054xbf7bcf1 = onSeekCompleteListener;
        super.setOnSeekCompleteListener(this.f50055x44f60fe5);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9, android.media.MediaPlayer
    public void setPlaybackParams(android.media.PlaybackParams playbackParams) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 9;
        obtain.obj = playbackParams;
        this.f50050xf703545d.sendMessage(obtain);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9, android.media.MediaPlayer
    public void setSurface(android.view.Surface surface) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = surface;
        this.f50050xf703545d.sendMessage(obtain);
    }

    @Override // android.media.MediaPlayer
    public void start() {
        this.f50050xf703545d.sendEmptyMessage(2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26145xf43bf3c9, android.media.MediaPlayer
    public void stop() {
        synchronized (this.f50059xafcf6fcc) {
            this.f50050xf703545d.sendEmptyMessage(6);
            try {
                this.f50059xafcf6fcc.wait(2500L);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    @Override // android.media.MediaPlayer
    public void seekTo(long j17, int i17) {
        synchronized (this.f50058xfe5f976f) {
            this.f50053x8fe25a99 = j17;
            this.f50052xcdb027f3 = true;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 5;
            obtain.arg1 = i17;
            obtain.obj = java.lang.Long.valueOf(j17);
            this.f50050xf703545d.sendMessage(obtain);
        }
    }
}

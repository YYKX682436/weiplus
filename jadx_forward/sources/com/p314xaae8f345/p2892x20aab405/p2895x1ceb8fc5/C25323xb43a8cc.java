package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.CommonPlayer */
/* loaded from: classes13.dex */
public class C25323xb43a8cc extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 {

    /* renamed from: INIT_STATE_CHECK_TIME */
    private static final int f45543xcd8ab7a1 = 5000;
    private static final java.lang.String TAG = "CommonPlayer";

    /* renamed from: currentState */
    private int f45544x56e49a98;

    /* renamed from: eventLooper */
    private android.os.Looper f45545xfa293d8b;

    /* renamed from: isMatchHuawei */
    private boolean f45546xfb42dc82;

    /* renamed from: mAudioPlayer */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 f45547xbed37baa;

    /* renamed from: mBufferPercentage */
    private int f45548x2e96dd87;

    /* renamed from: mCallback */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25443x2591e078 f45549x1ab9c7d2;

    /* renamed from: mDuration */
    private long f45550xae41f521;

    /* renamed from: mExecutor */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639 f45551x9ec3a060;

    /* renamed from: mLocalPlayPath */
    private java.lang.String f45552x75535a97;

    /* renamed from: mPreferMediaCodecDecode */
    private boolean f45553x92b8a1d;

    /* renamed from: mSpeedToSet */
    private java.lang.Float f45554x1447c2d;

    /* renamed from: openedResources */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.OpenedResources f45555x5b5b7bbc;

    /* renamed from: com.tencent.qqmusic.mediaplayer.CommonPlayer$BufferListener */
    /* loaded from: classes13.dex */
    public class BufferListener implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener {
        private BufferListener() {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener
        /* renamed from: onBufferEnded */
        public void mo93700xde0576fb() {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93682x2d1350c6("buffer ended."));
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener
        /* renamed from: onBufferStarted */
        public void mo93701x6133e082(long j17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93682x2d1350c6("buffer started."));
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25451x9c5f09df
        /* renamed from: onBytesTransferError */
        public void mo93702x72b8ca71(long j17, long j18, long j19) {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25451x9c5f09df
        /* renamed from: onBytesTransferred */
        public void mo93703x573b2f5a(long j17, long j18) {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25451x9c5f09df
        /* renamed from: onBytesTransferring */
        public void mo93704x902acc87(long j17, long j18) {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener
        /* renamed from: onStreamingError */
        public long mo93705x9f295e85(java.io.IOException iOException) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93682x2d1350c6("streaming error!"), iOException);
            return -1L;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener
        /* renamed from: onStreamingFinished */
        public void mo93706x53d186d5() {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45548x2e96dd87 = 100;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93682x2d1350c6("streaming finished"));
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25451x9c5f09df
        /* renamed from: onTransferEnd */
        public void mo93707xa4d25591() {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25451x9c5f09df
        /* renamed from: onTransferStart */
        public void mo93708xba5b3b98() {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener
        /* renamed from: onUpStreamTransfer */
        public void mo93709x94734f05(long j17, long j18) {
            int round;
            if ((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.mo93639xfa6224fa() == 2 || com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.mo93639xfa6224fa() == 4) && (round = (int) java.lang.Math.round((j17 / j18) * 100.0d)) != com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45548x2e96dd87) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45548x2e96dd87 = round;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25443x2591e078 c25443x2591e078 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45549x1ab9c7d2;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this;
                c25443x2591e078.mo93843x3e084f2c(c25323xb43a8cc, c25323xb43a8cc.f45548x2e96dd87);
            }
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.CommonPlayer$CorePlayerCallback */
    /* loaded from: classes13.dex */
    public class CorePlayerCallback implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 {

        /* renamed from: mDataSource */
        private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f45559x280a54b2;

        /* renamed from: mFactory */
        private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c f45560x5d03e3dd;

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playThreadStart */
        public void mo93710x7205d0a4(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playerEnded */
        public void mo93711x1fc3e459(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa != runnableC25325xe8a39f80) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "different playerEnded");
                return;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "playerEnded() callback ended");
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.mo93629xaa26d861(7);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45549x1ab9c7d2.mo93844xa6db431b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this);
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playerException */
        public void mo93712xf2dd026e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80, int i17, int i18, int i19) {
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa != runnableC25325xe8a39f80) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "different playerException");
                return;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "playerException() callback exception what = " + i17 + ",extra = " + i18 + " mAudioPlayer:" + com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa);
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa != null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "handleMessage state = " + com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa.m93738xfa6224fa());
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "handleMessage isInit = " + com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa.m93743xb9a4415a() + ",isStartDecode = " + com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa.m93741xe104c4f2() + ",decodeSuccess = " + com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa.m93742x3fa0feb1());
            }
            if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45553x92b8a1d || i17 != 91) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93686xaf8aa769(i17, i18, i19);
                return;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45553x92b8a1d = false;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c interfaceC25440x33a05b9c = this.f45560x5d03e3dd;
            if (interfaceC25440x33a05b9c != null) {
                try {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.mo93657x683d6267(interfaceC25440x33a05b9c);
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.mo93646xed060d07();
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "retry nativeDecoder", e17);
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93686xaf8aa769(i17, i18, i19);
                    return;
                }
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f45559x280a54b2;
            if (interfaceC25439x37e1318e == null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93686xaf8aa769(i17, i18, i19);
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.m93688xdb1e3644(interfaceC25439x37e1318e);
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.mo93646xed060d07();
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playerPaused */
        public void mo93713xeaceb36f(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa == runnableC25325xe8a39f80) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "playerPaused() callback paused");
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "different playerPaused");
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playerPrepared */
        public void mo93714xd9c0223e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa != runnableC25325xe8a39f80) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "different playerPrepared");
                return;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "playerPrepared() callback prepared");
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.mo93629xaa26d861(2);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45549x1ab9c7d2.mo93846x58d5b73c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this);
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playerSeekCompletion */
        public void mo93715xa85821b5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80, int i17) {
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa != runnableC25325xe8a39f80) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "different playerSeekCompletion");
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "playerSeekCompletion() callback seek completion");
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45549x1ab9c7d2.mo93847xe1fdf750(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this, i17);
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playerStarted */
        public void mo93716x2d0c6e60(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa != runnableC25325xe8a39f80) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "different playerStarted");
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "playerStarted() callback started");
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45549x1ab9c7d2.mo93848xde9141a2(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this);
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66
        /* renamed from: playerStopped */
        public void mo93717x2dd0bfac(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45547xbed37baa == runnableC25325xe8a39f80) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "playerStopped() callback stopped");
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "different playerStopped");
            }
        }

        private CorePlayerCallback(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c interfaceC25440x33a05b9c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
            this.f45560x5d03e3dd = interfaceC25440x33a05b9c;
            this.f45559x280a54b2 = interfaceC25439x37e1318e;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.CommonPlayer$OpenedResources */
    /* loaded from: classes13.dex */
    public static class OpenedResources {

        /* renamed from: bufferFile */
        private java.io.File f45562x7198dddc;

        /* renamed from: dataSource */
        private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 f45563x4bd85c65;

        private OpenedResources() {
        }

        /* renamed from: release */
        public void m93720x41012807() {
            java.io.File file = this.f45562x7198dddc;
            if (file != null && !file.delete()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.TAG, "[release] failed to delete buffer file: " + this.f45562x7198dddc);
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 c25429xf731a567 = this.f45563x4bd85c65;
            if (c25429xf731a567 != null) {
                c25429xf731a567.m94267xc6cf6336(null);
                this.f45563x4bd85c65.m94265xcb405d2();
            }
        }
    }

    public C25323xb43a8cc() {
        this(null, null, false, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639() { // from class: com.tencent.qqmusic.mediaplayer.CommonPlayer.1
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639
            /* renamed from: execute */
            public void mo93697xb158f775(java.lang.Runnable runnable, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
                java.lang.Thread thread = new java.lang.Thread(runnable, "decoder");
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                thread.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: auxiliary */
    public java.lang.String m93682x2d1350c6(java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        java.lang.String str2 = this.f45553x92b8a1d ? "[MediaCodec]" : "";
        if (runnableC25325xe8a39f80 == null) {
            return "null";
        }
        return "[" + runnableC25325xe8a39f80 + "]" + str2 + str;
    }

    /* renamed from: checkToRelease */
    private void m93683x4b89e4e4() {
        if (this.f45544x56e49a98 == 8) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[checkToRelease]"));
            m93687xd801892c();
            this.f45549x1ab9c7d2.m94312x5a5b64d();
        }
    }

    /* renamed from: insureEventLooper */
    private android.os.Looper m93684x37494e71() {
        if (this.f45545xfa293d8b == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("CommonPlayer_EventHandler_" + hashCode());
            handlerThread.start();
            this.f45545xfa293d8b = handlerThread.getLooper();
        }
        return this.f45545xfa293d8b;
    }

    /* renamed from: onError */
    private void m93685xaf8aa769(int i17, int i18) {
        m93686xaf8aa769(i17, i18, 0);
    }

    /* renamed from: resetInternal */
    private synchronized void m93687xd801892c() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.OpenedResources openedResources = this.f45555x5b5b7bbc;
        if (openedResources != null) {
            openedResources.m93720x41012807();
            this.f45555x5b5b7bbc = null;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93747x41012807();
            this.f45547xbed37baa = null;
        }
        android.os.Looper looper = this.f45545xfa293d8b;
        if (looper != null && looper != android.os.Looper.getMainLooper()) {
            this.f45545xfa293d8b.quitSafely();
            this.f45545xfa293d8b = null;
        }
        this.f45550xae41f521 = 0L;
        this.f45548x2e96dd87 = 0;
        this.f45554x1447c2d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setDataSourceInternal */
    public void m93688xdb1e3644(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        mo93629xaa26d861(1);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25449xf2df1832(interfaceC25439x37e1318e), null, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.CorePlayerCallback(null, interfaceC25439x37e1318e), m93684x37494e71(), this.f45553x92b8a1d ? new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32() : new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d(), this.f45551x9ec3a060);
        this.f45547xbed37baa = runnableC25325xe8a39f80;
        runnableC25325xe8a39f80.m93755xd5c0edb7(interfaceC25439x37e1318e.toString());
        m93689xa6580132(this.f45547xbed37baa);
    }

    /* renamed from: setSpeedToCorePlayerIfNeeded */
    private void m93689xa6580132(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
        java.lang.Float f17 = this.f45554x1447c2d;
        if (f17 != null) {
            runnableC25325xe8a39f80.m93754x53b4c105(f17.floatValue());
            this.f45554x1447c2d = null;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: TransferStateTo */
    public void mo93629xaa26d861(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("CommonPlayer StateRunner", this.f45544x56e49a98 + " -> " + i17);
        this.f45544x56e49a98 = i17;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25443x2591e078 c25443x2591e078 = this.f45549x1ab9c7d2;
        if (c25443x2591e078 != null) {
            c25443x2591e078.mo93849xaba1ac62(this, i17);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: addAudioListener */
    public void mo93630xd94b1389(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93730xd94b1389(interfaceC25354x74ec3ce1);
        }
    }

    /* renamed from: addPlayerListenerCallback */
    public void m93690x1059d81b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a) {
        this.f45549x1ab9c7d2.add(interfaceC25343x8e10fe3a);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: createSeekTable */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 mo93631xd979a29a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 == null) {
            return null;
        }
        return runnableC25325xe8a39f80.m93732xd979a29a();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: flush */
    public void mo93632x5d03b04() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 == null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[getCurrentFrame] mAudioPlayer is null!");
        } else {
            runnableC25325xe8a39f80.m93733x5d03b04();
        }
    }

    /* renamed from: getBufferedPercentage */
    public int m93691xa38776cf() {
        return this.f45548x2e96dd87;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: getCurrentAudioInformation */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93634x7ad436d9() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            return runnableC25325xe8a39f80.m93735x7ad436d9();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: getCurrentPosition */
    public long mo93635x9746038c() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            return runnableC25325xe8a39f80.mo93734x4abe8653();
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getCurrentPosition() mAudioPlayer is null!");
        return 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: getCurrentPositionFromFile */
    public long mo93636x8da3b7f2() {
        return 0L;
    }

    /* renamed from: getDecodePosition */
    public long m93692xe7e58e2d() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            return runnableC25325xe8a39f80.mo93623xa242feda();
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getDecodePosition() ERROR : mAudioPlayer is null!");
        return 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: getDecoderType */
    public int mo93637x21f63468() {
        return this.f45553x92b8a1d ? 2 : 1;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: getDuration */
    public int mo93638x51e8b0a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            long m93736x51e8b0a = runnableC25325xe8a39f80.m93736x51e8b0a();
            this.f45550xae41f521 = m93736x51e8b0a;
            return (int) m93736x51e8b0a;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "getDuration() mAudioPlayer is null!");
        long j17 = this.f45550xae41f521;
        if (j17 <= 0) {
            j17 = 0;
        }
        return (int) j17;
    }

    /* renamed from: getPlayerMode */
    public int m93693x6b29a81a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            return runnableC25325xe8a39f80.m93737x6b29a81a();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: getPlayerState */
    public int mo93639xfa6224fa() {
        return this.f45544x56e49a98;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: getSessionId */
    public int mo93640x23a7af9b() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            return runnableC25325xe8a39f80.m93739x23a7af9b();
        }
        return 0;
    }

    /* renamed from: getSpeed */
    public float m93694x7526a691() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            return runnableC25325xe8a39f80.m93740x7526a691();
        }
        java.lang.Float f17 = this.f45554x1447c2d;
        if (f17 != null) {
            return f17.floatValue();
        }
        return 1.0f;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: isPlaying */
    public boolean mo93641xc00617a4() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            return runnableC25325xe8a39f80.m93738xfa6224fa() == 4;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "isPlaying() mAudioPlayer is null!");
        return false;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: pause */
    public void mo93644x65825f6() {
        mo93629xaa26d861(5);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[pause]"));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93744x65825f6(false);
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "pause() mAudioPlayer is null!");
        }
        m93642x39654ee2();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: pauseRealTime */
    public void mo93645x5cbb55a1() {
        mo93629xaa26d861(5);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[pauseRealTime]"));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93744x65825f6(true);
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "pauseRealTime() mAudioPlayer is null!");
        }
        m93642x39654ee2();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: prepare */
    public void mo93646xed060d07() {
        if (this.f45544x56e49a98 == 8) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "prepare already released!");
            return;
        }
        mo93629xaa26d861(3);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[prepare]"));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93746xed060d07();
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "prepare() null mAudioPlayer!");
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: prepareAsync */
    public void mo93647x857611b5() {
        throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25352xbe1442b8("Soft decode player cannot support prepareAsync");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: release */
    public void mo93648x41012807() {
        mo93629xaa26d861(8);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[release]"));
        m93687xd801892c();
        this.f45549x1ab9c7d2.m94312x5a5b64d();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: removeAudioListener */
    public void mo93649xde51bc86(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93748xde51bc86(interfaceC25354x74ec3ce1);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: reset */
    public void mo93650x6761d4f() {
        mo93629xaa26d861(0);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[reset]"));
        m93687xd801892c();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: seekTo */
    public void mo93651xc9fc1b13(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.mo93749x35ce78(i17);
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "seekTo() mAudioPlayer is null!");
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setAudioStreamType */
    public void mo93652x7389228e(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93750x7389228e(i17);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setDataSource */
    public void mo93659x683d6267(java.lang.String str) {
        if (str != null) {
            mo93629xaa26d861(1);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "setDataSource, path: " + str);
            this.f45548x2e96dd87 = 100;
            m93688xdb1e3644(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(str));
            m93683x4b89e4e4();
            return;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "setDataSource() ERROR:the path is null!");
        throw new java.lang.IllegalArgumentException("the path is null!");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setLeastCommonMultiple */
    public void mo93660x9425e422(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93751x9425e422(i17);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setPlayLocalPath */
    public void mo93662xf9731c1a(java.lang.String str) {
        this.f45552x75535a97 = str;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93752xe68c47fb(str);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setPlayerListenerCallback */
    public void mo93663xfada651c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a) {
        this.f45549x1ab9c7d2.m94312x5a5b64d();
        this.f45549x1ab9c7d2.add(interfaceC25343x8e10fe3a);
    }

    /* renamed from: setPlayerMode */
    public void m93695x994df626(int i17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93753x994df626(i17);
        }
    }

    /* renamed from: setSpeed */
    public void m93696x53b4c105(float f17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93754x53b4c105(f17);
        } else {
            this.f45554x1447c2d = java.lang.Float.valueOf(f17);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setVolume */
    public void mo93664x27f73e1c(float f17, float f18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93756x27f73e1c(f17, f18);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setWakeMode */
    public void mo93665x87c56be9(android.content.Context context, int i17) {
        throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25352xbe1442b8("Soft decode player cannot support setWakeMode");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: start */
    public void mo93666x68ac462() {
        mo93629xaa26d861(4);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[start]"));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
        if (runnableC25325xe8a39f80 != null) {
            runnableC25325xe8a39f80.m93745x348b34();
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "start() mAudioPlayer is null!");
        }
        m93643xe2b25822();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: stop */
    public void mo93667x360802() {
        try {
            mo93629xaa26d861(6);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, m93682x2d1350c6("[stop]"));
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80 = this.f45547xbed37baa;
            if (runnableC25325xe8a39f80 != null) {
                runnableC25325xe8a39f80.m93758x360802();
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "stop() mAudioPlayer is null!");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    public C25323xb43a8cc(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a) {
        this(interfaceC25343x8e10fe3a, null, false, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639() { // from class: com.tencent.qqmusic.mediaplayer.CommonPlayer.2
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639
            /* renamed from: execute */
            public void mo93697xb158f775(java.lang.Runnable runnable, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
                java.lang.Thread thread = new java.lang.Thread(runnable, "decoder");
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                thread.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onError */
    public void m93686xaf8aa769(int i17, int i18, int i19) {
        mo93629xaa26d861(9);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "onError prefer MediaCodec " + this.f45553x92b8a1d);
        this.f45549x1ab9c7d2.mo93845xaf8aa769(this, i17, i18, i19);
    }

    public C25323xb43a8cc(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a, android.os.Looper looper, boolean z17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639 interfaceC25347x8bacb639) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25443x2591e078 c25443x2591e078 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25443x2591e078();
        this.f45549x1ab9c7d2 = c25443x2591e078;
        this.f45547xbed37baa = null;
        boolean z18 = false;
        this.f45544x56e49a98 = 0;
        this.f45554x1447c2d = null;
        this.f45553x92b8a1d = false;
        this.f45552x75535a97 = null;
        this.f45546xfb42dc82 = false;
        if (interfaceC25343x8e10fe3a != null) {
            c25443x2591e078.add(interfaceC25343x8e10fe3a);
        }
        this.f45545xfa293d8b = looper;
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.f45553x92b8a1d = z17;
        this.f45551x9ec3a060 = interfaceC25347x8bacb639;
        if ((android.os.Build.MANUFACTURER + android.os.Build.BRAND + android.os.Build.MODEL).toLowerCase().contains("huawei") && i17 >= 26) {
            z18 = true;
        }
        this.f45546xfb42dc82 = z18;
        mo93650x6761d4f();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setDataSource */
    public void mo93658x683d6267(java.io.FileDescriptor fileDescriptor) {
        throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25352xbe1442b8("Soft decode player cannot support setDataSource by FileDescriptor");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setDataSource */
    public void mo93653x683d6267(android.content.Context context, android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        if (android.text.TextUtils.isEmpty(scheme)) {
            mo93659x683d6267(uri.toString());
            return;
        }
        if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) {
            if (scheme.equalsIgnoreCase("content")) {
                return;
            }
            scheme.equalsIgnoreCase("file");
            return;
        }
        mo93656x683d6267(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.C25395x4e70feea(), uri);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setDataSource */
    public void mo93656x683d6267(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25397x444b4112 interfaceC25397x444b4112, android.net.Uri uri) {
        java.io.File createTempFile;
        try {
            java.lang.String str = this.f45532xb26bd38;
            if (str != null && !str.isEmpty()) {
                createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp", new java.io.File(this.f45532xb26bd38));
            } else {
                createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp");
            }
            createTempFile.delete();
            if (!createTempFile.createNewFile()) {
                m93686xaf8aa769(90, 103, 0);
                return;
            }
            java.lang.String absolutePath = createTempFile.getAbsolutePath();
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 c25429xf731a567 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25438xfcf7032d(uri, null, interfaceC25397x444b4112), new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(absolutePath), new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.C25391x28d8cf19(absolutePath), m93684x37494e71());
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.OpenedResources openedResources = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.OpenedResources();
            this.f45555x5b5b7bbc = openedResources;
            openedResources.f45562x7198dddc = createTempFile;
            this.f45555x5b5b7bbc.f45563x4bd85c65 = c25429xf731a567;
            c25429xf731a567.m94267xc6cf6336(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.BufferListener());
            m93688xdb1e3644(c25429xf731a567);
            m93683x4b89e4e4();
        } catch (java.io.IOException unused) {
            m93686xaf8aa769(90, 103, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setDataSource */
    public void mo93657x683d6267(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c interfaceC25440x33a05b9c) {
        if (interfaceC25440x33a05b9c != null) {
            mo93629xaa26d861(1);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.CorePlayerCallback corePlayerCallback = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.CorePlayerCallback(interfaceC25440x33a05b9c, null);
            if (this.f45553x92b8a1d) {
                this.f45547xbed37baa = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80(interfaceC25440x33a05b9c.mo93698xb8a7ce81(), null, corePlayerCallback, m93684x37494e71(), new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25374xc88b5d32(), this.f45551x9ec3a060);
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 mo93699xd6f504f8 = interfaceC25440x33a05b9c.mo93699xd6f504f8();
                if (mo93699xd6f504f8 != null) {
                    this.f45547xbed37baa = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80(null, mo93699xd6f504f8, corePlayerCallback, m93684x37494e71(), new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d(), this.f45551x9ec3a060);
                } else {
                    this.f45547xbed37baa = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80(interfaceC25440x33a05b9c.mo93698xb8a7ce81(), null, corePlayerCallback, m93684x37494e71(), new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d(), this.f45551x9ec3a060);
                }
            }
            this.f45547xbed37baa.m93755xd5c0edb7(interfaceC25440x33a05b9c.toString());
            m93689xa6580132(this.f45547xbed37baa);
            java.lang.String str = this.f45552x75535a97;
            if (str != null) {
                this.f45547xbed37baa.m93752xe68c47fb(str);
            }
            m93683x4b89e4e4();
            return;
        }
        throw new java.lang.IllegalArgumentException("dataSourceFactory is null!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setDataSource */
    public void mo93655x683d6267(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79) {
        mo93629xaa26d861(1);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "setDataSource, trackInfo.getUri: " + c25358xa2ed4c79.m93897xb5887636());
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "setDataSource, trackInfo.range: " + c25358xa2ed4c79.m93895x7511df87().toString());
        this.f45548x2e96dd87 = 100;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0 c25450x685bfff0 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0(c25358xa2ed4c79);
        java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> m94314x1aaffb79 = this.f45549x1ab9c7d2.m94314x1aaffb79();
        this.f45549x1ab9c7d2.m94312x5a5b64d();
        this.f45549x1ab9c7d2.add(c25450x685bfff0);
        this.f45549x1ab9c7d2.m94311xab35b940(m94314x1aaffb79);
        mo93629xaa26d861(1);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25449xf2df1832 c25449xf2df1832 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25449xf2df1832(c25450x685bfff0);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25351x8e5566eb c25351x8e5566eb = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25351x8e5566eb(c25449xf2df1832, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.CorePlayerCallback(null, c25449xf2df1832), m93684x37494e71(), this.f45551x9ec3a060);
        this.f45547xbed37baa = c25351x8e5566eb;
        c25450x685bfff0.m94326xad98fc6d(c25351x8e5566eb);
        this.f45547xbed37baa.m93755xd5c0edb7(c25450x685bfff0.toString());
        m93689xa6580132(this.f45547xbed37baa);
        m93683x4b89e4e4();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834
    /* renamed from: setDataSource */
    public void mo93654x683d6267(android.content.Context context, final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f interfaceC25452xb767407f) {
        mo93657x683d6267(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c() { // from class: com.tencent.qqmusic.mediaplayer.CommonPlayer.3
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c
            /* renamed from: createDataSource */
            public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e mo93698xb8a7ce81() {
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Factory.m94275x1fd63079(interfaceC25452xb767407f, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc.this.f45532xb26bd38);
            }

            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c
            /* renamed from: createNativeDataSource */
            public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 mo93699xd6f504f8() {
                return null;
            }
        });
    }
}

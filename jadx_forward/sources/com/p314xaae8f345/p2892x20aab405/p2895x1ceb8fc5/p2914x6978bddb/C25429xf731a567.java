package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource */
/* loaded from: classes13.dex */
public class C25429xf731a567 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25398xd1e5f964 {

    /* renamed from: CHUNK_LOAD_BUFFER_SIZE */
    private static final int f46050x5e7d9e79 = 8192;

    /* renamed from: DISCONTINUITY_THRESHOLD */
    private static final int f46051x8a8050aa = 8192;

    /* renamed from: NO_RESET_PENDING */
    static final long f46052x12607869 = Long.MIN_VALUE;

    /* renamed from: PROFILE_ending */
    private static final int f46053x129be89d = 10;

    /* renamed from: PROFILE_isCached */
    private static final int f46054x4a8278e2 = 8;

    /* renamed from: PROFILE_lock */
    private static final int f46055xd4e07621 = 5;

    /* renamed from: PROFILE_onBufferEnd */
    private static final int f46056xa1c1bfa6 = 7;

    /* renamed from: PROFILE_onBufferStarted */
    private static final int f46057x54cd19cc = 4;

    /* renamed from: PROFILE_onBytesTransferred */
    private static final int f46058x2b0cf9d0 = 9;

    /* renamed from: PROFILE_onBytesTransferring */
    private static final int f46059x369250d1 = 3;

    /* renamed from: PROFILE_onReadContinuity */
    private static final int f46060xfde1065b = 1;

    /* renamed from: PROFILE_onReadDiscontinuity */
    private static final int f46061xe1b251b3 = 2;

    /* renamed from: PROFILE_readAt */
    private static final int f46062x284a9fdf = 6;

    /* renamed from: PROFILE_total */
    private static final int f46063xc79f490e = 0;

    /* renamed from: READ_WAIT_TIMEOUT */
    private static final int f46064x18d9a080 = 30000;
    private static final java.lang.String TAG = "CacheDataSource";

    /* renamed from: profiles */
    private static final java.lang.String[] f46065xc442abea = {"total", "onReadContinuity", "onReadDiscontinuity", "onBytesTransferring", "onBufferStarted", "lock", "readAt", "onBufferEnd", "isCached", "onBytesTransferred", "ending"};

    /* renamed from: cacheSource */
    protected final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f46066x2100da3d;

    /* renamed from: cachedDataTracker */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025 f46067x128129ac;

    /* renamed from: costs */
    private long[] f46068x5a74a46;

    /* renamed from: currentLoadStartPosition */
    private long f46069x205253ec;

    /* renamed from: currentLoadingChunk */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d f46070xaec95aaa;

    /* renamed from: isToReleaseLock */
    private volatile boolean f46071x5ac2ab4d;

    /* renamed from: isWaitingForFirstPiece */
    private volatile boolean f46072xf15abec4;

    /* renamed from: listener */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener f46073x503cc4b4;

    /* renamed from: loadFinished */
    private boolean f46074x245da378;

    /* renamed from: loader */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 f46075xbe953013;

    /* renamed from: loaderListener */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.LoaderListener f46076x839095e7;

    /* renamed from: nextContinuousPosition */
    private long f46077x3f28e1ab;

    /* renamed from: opened */
    private boolean f46078xc3c3c869;

    /* renamed from: pendingRestartPositionByte */
    protected long f46079xa3781669;

    /* renamed from: pendingStartPositionByte */
    protected long f46080xd3fb7e7c;

    /* renamed from: pendingTask */
    private java.util.TimerTask f46081x425b8fbc;

    /* renamed from: restartHandler */
    private java.util.Timer f46082xcfbd323b;

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$Listener */
    /* loaded from: classes13.dex */
    public interface Listener extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25451x9c5f09df {
        /* renamed from: onBufferEnded */
        void mo93700xde0576fb();

        /* renamed from: onBufferStarted */
        void mo93701x6133e082(long j17);

        /* renamed from: onStreamingError */
        long mo93705x9f295e85(java.io.IOException iOException);

        /* renamed from: onStreamingFinished */
        void mo93706x53d186d5();

        /* renamed from: onUpStreamTransfer */
        void mo93709x94734f05(long j17, long j18);
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$LoaderListener */
    /* loaded from: classes13.dex */
    public class LoaderListener implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener {

        /* renamed from: loadedPosition */
        private long f46094x4428584e;

        private LoaderListener() {
            this.f46094x4428584e = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.f46052x12607869;
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener
        /* renamed from: onLoadCancelled */
        public synchronized void mo94278x938e8b6c(boolean z17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.TAG, "[onLoadCancelled] enter. terminated: " + z17);
            if (z17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93771x2cffc540();
            } else {
                try {
                    if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.m94255xc7f263cc()) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93771x2cffc540();
                    }
                } catch (java.lang.IllegalStateException e17) {
                    mo94280x4f8e79a3(new java.io.IOException("failed to start load after cancelling", e17));
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93771x2cffc540();
                }
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener
        /* renamed from: onLoadCompleted */
        public void mo94279x23875866() {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46069x205253ec = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.f46052x12607869;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46070xaec95aaa = null;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46074x245da378 = true;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93771x2cffc540();
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46073x503cc4b4 != null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46073x503cc4b4.mo93706x53d186d5();
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener
        /* renamed from: onLoadError */
        public void mo94280x4f8e79a3(java.io.IOException iOException) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.TAG, "[onLoadError] enter.", iOException);
            long j17 = this.f46094x4428584e;
            long j18 = j17 == com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.f46052x12607869 ? 0L : j17;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 c25429xf731a567 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this;
            c25429xf731a567.f46079xa3781669 = j17;
            if (c25429xf731a567.f46073x503cc4b4 == null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46069x205253ec = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.f46052x12607869;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46070xaec95aaa = null;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93771x2cffc540();
                return;
            }
            long mo93705x9f295e85 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46073x503cc4b4.mo93705x9f295e85(iOException);
            if (mo93705x9f295e85 >= 0) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.m94254xa0e5db78(j18, mo93705x9f295e85);
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46079xa3781669 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.f46052x12607869;
            } else {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46069x205253ec = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.f46052x12607869;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46070xaec95aaa = null;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93771x2cffc540();
            }
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener
        /* renamed from: onLoadProgress */
        public void mo94281x861c30b2(long j17, long j18) {
            this.f46094x4428584e = j18;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93772xb5970d1c(j17, j18, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46072xf15abec4);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 interfaceC25444x87fa1c33 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46075xbe953013;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46073x503cc4b4;
            if (listener == null || interfaceC25444x87fa1c33 == null) {
                return;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46067x128129ac.m93780x6c5a607(interfaceC25444x87fa1c33.mo94294xc1fa3ef2(), true);
            listener.mo93709x94734f05(j18, interfaceC25444x87fa1c33.mo94294xc1fa3ef2());
        }
    }

    public C25429xf731a567(final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e2, final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 interfaceC25392xb60068c6, final android.os.Looper looper) {
        this(interfaceC25439x37e1318e2, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Factory() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.1
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Factory
            /* renamed from: createLoader */
            public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 mo94269x4f4a102f(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener listener) {
                return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94(looper, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25436xdaecc4f7(null), listener) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.1.1
                    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94
                    /* renamed from: createCacheSink */
                    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 mo94270x87ac4b99(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed) {
                        return interfaceC25392xb60068c6;
                    }

                    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94
                    /* renamed from: createUpStream */
                    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e mo94271x69daf317(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed) {
                        return interfaceC25439x37e1318e;
                    }
                };
            }
        });
    }

    /* renamed from: clearState */
    private void m94248xd3a90644() {
        this.f46074x245da378 = false;
    }

    /* renamed from: isCached */
    private boolean m94249xd6a232ec(long j17, int i17) {
        long mo94294xc1fa3ef2 = this.f46075xbe953013.mo94294xc1fa3ef2();
        if (mo94294xc1fa3ef2 > 0 && i17 + j17 > mo94294xc1fa3ef2 - 1 && (i17 = (int) ((mo94294xc1fa3ef2 - j17) - 1)) < 0) {
            j17 += i17;
            i17 = 0;
        }
        return this.f46067x128129ac.m93778xd6a232ec(j17, i17);
    }

    /* renamed from: onReadContinuity */
    private void m94250x7e531665(long j17) {
    }

    /* renamed from: onReadDiscontinuity */
    private void m94251x3b4acd69(long j17, boolean z17) {
        long max;
        long j18 = this.f46069x205253ec;
        if (j17 == j18) {
            return;
        }
        long j19 = j17 - j18;
        if (j19 < 0 || j19 >= 8192) {
            synchronized (this.f46067x128129ac) {
                max = java.lang.Math.max(j17, this.f46067x128129ac.m93775x18f98a29(j17));
            }
            long j27 = this.f46069x205253ec;
            if (j27 == max) {
                return;
            }
            long j28 = max - j27;
            if ((j28 < 0 || j28 >= 8192) && max != mo94260xfb854877()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d c25430x3e1324d = this.f46070xaec95aaa;
                if (z17 && c25430x3e1324d != null && c25430x3e1324d.m94282xde2d761f(max)) {
                    return;
                }
                m94253xba82bc2d(max);
            }
        }
    }

    /* renamed from: reportProfiling */
    private void m94252xa334552() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: restartLoading */
    public synchronized void m94253xba82bc2d(long j17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[restartLoading] from: " + j17);
        this.f46080xd3fb7e7c = j17;
        this.f46074x245da378 = false;
        if (this.f46075xbe953013.mo94295xf18228b2()) {
            this.f46067x128129ac.m93773x597c48d();
            this.f46075xbe953013.mo94293x62eeed62();
        } else {
            m94248xd3a90644();
            m94255xc7f263cc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scheduleRestart */
    public synchronized void m94254xa0e5db78(final long j17, long j18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, java.lang.String.format("[scheduleRestart] position: %d, delay: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
        if (this.f46082xcfbd323b == null) {
            this.f46082xcfbd323b = new java.util.Timer("CacheDataSource.Restart");
        }
        java.util.TimerTask timerTask = this.f46081x425b8fbc;
        if (timerTask != null) {
            timerTask.cancel();
            this.f46082xcfbd323b.purge();
        }
        java.util.TimerTask timerTask2 = new java.util.TimerTask() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.TAG, "[scheduleRestart] restart loading from position: " + j17);
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.m94253xba82bc2d(j17);
            }
        };
        this.f46081x425b8fbc = timerTask2;
        this.f46082xcfbd323b.schedule(timerTask2, j18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startLoadingIfNeeded */
    public synchronized boolean m94255xc7f263cc() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d c25430x3e1324d;
        if (this.f46074x245da378) {
            return false;
        }
        long j17 = this.f46080xd3fb7e7c;
        this.f46080xd3fb7e7c = f46052x12607869;
        if (this.f46078xc3c3c869) {
            if (j17 == f46052x12607869) {
                throw new java.lang.IllegalStateException("pendingStartPositionByte must be set!");
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[startLoadingIfNeeded] restart a pending load: " + j17);
            c25430x3e1324d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d(8192, j17, -1L);
        } else if (j17 == f46052x12607869) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[startLoadingIfNeeded] start a fresh load");
            c25430x3e1324d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d(8192, 0L, -1L);
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[startLoadingIfNeeded] start a pending load: " + j17);
            c25430x3e1324d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d(8192, j17, -1L);
        }
        this.f46070xaec95aaa = c25430x3e1324d;
        this.f46069x205253ec = c25430x3e1324d.f46098x68ac462;
        this.f46067x128129ac.m93781xee85ed94();
        this.f46075xbe953013.mo94298xc0d627a(c25430x3e1324d);
        return true;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25398xd1e5f964
    /* renamed from: accept */
    public void mo94098xab27b508(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25399x554ed884 interfaceC25399x554ed884) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[close] enter.");
        if (!this.f46078xc3c3c869) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[close] not opened. return");
            return;
        }
        this.f46067x128129ac.m93771x2cffc540();
        try {
            this.f46075xbe953013.mo94297xf5e80656();
        } catch (java.lang.InterruptedException unused) {
        }
        this.f46066x2100da3d.close();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener = this.f46073x503cc4b4;
        if (listener != null) {
            listener.mo93707xa4d25591();
        }
        m94252xa334552();
        this.f46078xc3c3c869 = false;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[close] exit");
    }

    /* renamed from: continueLoadIfNeeded */
    public synchronized boolean m94256xc988587f() {
        if (!this.f46078xc3c3c869) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "[continueLoadIfNeeded] not opened!");
            return false;
        }
        long j17 = this.f46079xa3781669;
        if (j17 == f46052x12607869) {
            return false;
        }
        if (this.f46074x245da378) {
            return false;
        }
        this.f46079xa3781669 = f46052x12607869;
        m94254xa0e5db78(j17, 0L);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[continueLoadIfNeeded] schedule restart from: " + j17);
        return true;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2907x38fb28bd.C25393x11c58fd.m94078xddbe0e37((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e) this, false);
    }

    /* renamed from: getBufferTimeout */
    public long m94258xe48c54b(long j17, int i17) {
        return 30000L;
    }

    /* renamed from: getLoader */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 m94259x23ac5309() {
        return this.f46075xbe953013;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 interfaceC25444x87fa1c33 = this.f46075xbe953013;
        if (interfaceC25444x87fa1c33 != null) {
            return interfaceC25444x87fa1c33.mo94294xc1fa3ef2();
        }
        return 0L;
    }

    /* renamed from: initDataSourceSize */
    public void m94261xff5b0b36(long j17, long j18) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.LoaderListener loaderListener = this.f46076x839095e7;
        if (loaderListener != null) {
            loaderListener.mo94281x861c30b2(j17, j18);
        }
    }

    /* renamed from: isCacheFileComplete */
    public boolean m94262x73460b6d() {
        long m93777x59b5645d = this.f46067x128129ac.m93777x59b5645d();
        long m93776x5fb9eb96 = this.f46067x128129ac.m93776x5fb9eb96();
        return m93776x5fb9eb96 != -1 && m93776x5fb9eb96 == this.f46075xbe953013.mo94294xc1fa3ef2() - 1 && m93777x59b5645d == 0;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[open] enter.");
        if (this.f46078xc3c3c869) {
            return;
        }
        this.f46077x3f28e1ab = 0L;
        this.f46079xa3781669 = f46052x12607869;
        this.f46066x2100da3d.mo94263x34264a();
        this.f46075xbe953013.mo94296xed060d07();
        m94255xc7f263cc();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener = this.f46073x503cc4b4;
        if (listener != null) {
            listener.mo93708xba5b3b98();
        }
        this.f46078xc3c3c869 = true;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[open] opened = true;");
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[open] exit");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        java.lang.String str;
        try {
            try {
                if (!this.f46078xc3c3c869) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[readAt] not opened!");
                    this.f46067x128129ac.m93771x2cffc540();
                    throw new java.io.IOException("[readAt] not opened!");
                }
                if (j17 < 0) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[readAt] invalid position: " + j17);
                    throw new java.io.IOException("invalid position: " + j17);
                }
                boolean m94249xd6a232ec = m94249xd6a232ec(j17, i18);
                if (j17 == this.f46077x3f28e1ab) {
                    m94250x7e531665(j17);
                } else {
                    m94251x3b4acd69(j17, m94249xd6a232ec);
                }
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener = this.f46073x503cc4b4;
                if (listener != null) {
                    listener.mo93704x902acc87(j17, i18);
                }
                int mo94264xc8455469 = m94249xd6a232ec ? this.f46066x2100da3d.mo94264xc8455469(j17, bArr, i17, i18) : -1;
                if (mo94264xc8455469 < 0) {
                    if (this.f46075xbe953013.mo94295xf18228b2()) {
                        str = "[readAt] error occurred: ";
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "[readAt] load has started, lock util data has been downloaded : " + j17 + ", size: " + i18 + ", read: " + mo94264xc8455469);
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener2 = this.f46073x503cc4b4;
                        if (listener2 != null) {
                            listener2.mo93701x6133e082(j17);
                        }
                        try {
                            this.f46067x128129ac.m93779x32c52b(j17, i18, m94258xe48c54b(j17, i18), new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.LockJudgerCallback() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.2
                                @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025.LockJudgerCallback
                                /* renamed from: isToAbandonLock */
                                public boolean mo93782x7b0e6abb() {
                                    return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.this.f46071x5ac2ab4d;
                                }
                            });
                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener3 = this.f46073x503cc4b4;
                            if (listener3 != null) {
                                listener3.mo93700xde0576fb();
                            }
                            mo94264xc8455469 = this.f46066x2100da3d.mo94264xc8455469(j17, bArr, i17, i18);
                        } catch (java.lang.InterruptedException e17) {
                            throw new java.io.IOException("interrupted!", e17);
                        }
                    } else {
                        mo94264xc8455469 = this.f46066x2100da3d.mo94264xc8455469(j17, bArr, i17, i18);
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[readAt] load not started: " + j17 + ", size: " + i18 + ", read: " + mo94264xc8455469);
                    }
                }
                int i19 = mo94264xc8455469;
                if (i19 > 0) {
                    this.f46077x3f28e1ab = i19 + j17;
                } else if (i19 < 0) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[readAt]: read error! read < 0， read = " + i19);
                    r2 = true;
                } else {
                    r2 = i18 != 0;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[readAt]: read error! read = 0, hasError = " + r2);
                }
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener4 = this.f46073x503cc4b4;
                if (listener4 != null) {
                    if (r2) {
                        listener4.mo93702x72b8ca71(j17, i18, i19);
                    } else {
                        listener4.mo93703x573b2f5a(j17, i19);
                    }
                }
                return i19;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, str + j17, th);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str = "[readAt] error occurred: ";
        }
    }

    /* renamed from: releaseLock */
    public void m94265xcb405d2() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[releaseLock]");
        this.f46071x5ac2ab4d = true;
    }

    /* renamed from: setFileTotalSize */
    public void m94266x6c5a607(long j17) {
        this.f46067x128129ac.m93780x6c5a607(j17, false);
    }

    /* renamed from: setListener */
    public void m94267xc6cf6336(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.Listener listener) {
        this.f46073x503cc4b4 = listener;
    }

    /* renamed from: waitForFirstPiece */
    public boolean m94268x72cf1c52(int i17, long j17) {
        this.f46072xf15abec4 = true;
        boolean m93779x32c52b = this.f46067x128129ac.m93779x32c52b(0L, i17, j17, null);
        this.f46072xf15abec4 = false;
        return m93779x32c52b;
    }

    public C25429xf731a567(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Factory factory) {
        this.f46069x205253ec = f46052x12607869;
        this.f46076x839095e7 = null;
        this.f46072xf15abec4 = false;
        this.f46068x5a74a46 = new long[f46065xc442abea.length];
        this.f46071x5ac2ab4d = false;
        this.f46066x2100da3d = interfaceC25439x37e1318e;
        this.f46067x128129ac = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25326x4f1d2025();
        this.f46078xc3c3c869 = false;
        this.f46074x245da378 = false;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.LoaderListener loaderListener = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.LoaderListener();
        this.f46076x839095e7 = loaderListener;
        this.f46075xbe953013 = factory.mo94269x4f4a102f(loaderListener);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25398xd1e5f964
    /* renamed from: accept */
    public void mo94099xab27b508(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.InterfaceC25402xe1ccbdfe interfaceC25402xe1ccbdfe) {
        int i17 = 1;
        long j17 = 0;
        for (int i18 = 1; i18 < f46065xc442abea.length; i18++) {
            j17 += this.f46068x5a74a46[i18];
        }
        long[] jArr = this.f46068x5a74a46;
        double length = (jArr[0] - j17) / jArr.length;
        int length2 = jArr.length;
        long[] jArr2 = new long[length2];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        for (int i19 = 1; i19 < length2; i19++) {
            jArr2[i19] = java.lang.Math.max(jArr2[i19] - ((long) length), 0L);
        }
        while (true) {
            java.lang.String[] strArr = f46065xc442abea;
            if (i17 >= strArr.length) {
                return;
            }
            interfaceC25402xe1ccbdfe.mo94130xf2e7ce2b("CacheDataSource." + strArr[i17], jArr2[i17] / 1000000);
            i17++;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource$Factory */
    /* loaded from: classes13.dex */
    public static class Factory {
        /* renamed from: createDefaultLoaderFactory */
        private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Factory m94272xd102b7d2(final java.io.File file, final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f interfaceC25452xb767407f) {
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Factory() { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.2
                @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Factory
                /* renamed from: createLoader */
                public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 mo94269x4f4a102f(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener listener) {
                    return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94(android.os.Looper.getMainLooper(), com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f.this, listener) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.2.1
                        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94
                        /* renamed from: createCacheSink */
                        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 mo94270x87ac4b99(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed) {
                            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.C25391x28d8cf19(file.getAbsolutePath());
                        }

                        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94
                        /* renamed from: createUpStream */
                        public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e mo94271x69daf317(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed) {
                            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25438xfcf7032d(c25448x2f83e3ed.uri, c25448x2f83e3ed.f46149x2f676f86, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.C25395x4e70feea());
                        }
                    };
                }
            };
        }

        /* renamed from: createFromLoader */
        public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 m94273xe12fbe79(java.io.File file, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Factory factory) {
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(file.getAbsolutePath()), factory);
        }

        /* renamed from: createFromUri */
        public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 m94274x627a40c6(java.io.File file, android.net.Uri uri) {
            return m94276x1fd63079(file, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25436xdaecc4f7(uri));
        }

        /* renamed from: createFromUriLoader */
        public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 m94275x1fd63079(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f interfaceC25452xb767407f, java.lang.String str) {
            final java.io.File createTempFile;
            if (str != null) {
                try {
                    if (!str.isEmpty()) {
                        createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp", new java.io.File(str));
                        m94277xb5fab6da(createTempFile);
                        return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(createTempFile.getAbsolutePath()) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.1
                            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21, java.io.Closeable, java.lang.AutoCloseable
                            public void close() {
                                try {
                                    super.close();
                                } catch (java.io.IOException unused) {
                                }
                                if (createTempFile.delete()) {
                                    return;
                                }
                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.TAG, "failed to delete buffer file: " + createTempFile);
                            }
                        }, m94272xd102b7d2(createTempFile, interfaceC25452xb767407f));
                    }
                } catch (java.io.IOException e17) {
                    throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25432x673e7d4a(-8, "failed to ensure buffer file!", e17);
                }
            }
            createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp");
            m94277xb5fab6da(createTempFile);
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(createTempFile.getAbsolutePath()) { // from class: com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.1
                @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    try {
                        super.close();
                    } catch (java.io.IOException unused) {
                    }
                    if (createTempFile.delete()) {
                        return;
                    }
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567.TAG, "failed to delete buffer file: " + createTempFile);
                }
            }, m94272xd102b7d2(createTempFile, interfaceC25452xb767407f));
        }

        /* renamed from: ensureFile */
        private static void m94277xb5fab6da(java.io.File file) {
            file.delete();
            if (!file.createNewFile()) {
                throw new java.io.IOException("failed to create file!");
            }
        }

        /* renamed from: createFromUriLoader */
        public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567 m94276x1fd63079(java.io.File file, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f interfaceC25452xb767407f) {
            return new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25429xf731a567(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(file.getAbsolutePath()), m94272xd102b7d2(file, interfaceC25452xb767407f));
        }
    }
}

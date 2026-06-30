package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader */
/* loaded from: classes13.dex */
public abstract class AbstractC25434x5d69ad94 extends java.lang.Thread implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 {

    /* renamed from: MSG_LOAD_CANCELLED */
    private static final int f46109xc1b77db6 = 5;

    /* renamed from: MSG_LOAD_COMPLETED */
    private static final int f46110x51b04ab0 = 3;

    /* renamed from: MSG_LOAD_ERROR */
    private static final int f46111x1a328ed = 4;

    /* renamed from: MSG_LOAD_PROGRESS */
    private static final int f46112xfb364908 = 2;

    /* renamed from: MSG_LOAD_STARTED */
    private static final int f46113xc8f6e26 = 1;

    /* renamed from: SIZE_UNSET */
    private static final int f46114xe979f94b = -1;
    private static final java.lang.String TAG = "DefaultLoader";

    /* renamed from: cacheSink */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 f46116xdf007135;

    /* renamed from: eventHandler */
    private final android.os.Handler f46119x5f6e3b50;

    /* renamed from: shutdown */
    private volatile boolean f46121xf5e80656;

    /* renamed from: upstream */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f46122x6978bddb;

    /* renamed from: uriLoader */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f f46124x3ff5209f;

    /* renamed from: END_OF_QUEUE */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d f46115x85a1d78d = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d(0, 0, 0);

    /* renamed from: isLoading */
    private volatile boolean f46120xf18228b2 = false;

    /* renamed from: cancelled */
    private volatile boolean f46117x1c682951 = false;

    /* renamed from: upstreamSize */
    private long f46123x6107ac7c = -1;

    /* renamed from: chunks */
    private final java.util.concurrent.BlockingQueue<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d> f46118xaee02ba6 = new java.util.concurrent.LinkedBlockingQueue(1);

    public AbstractC25434x5d69ad94(android.os.Looper looper, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f interfaceC25452xb767407f, final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener listener) {
        this.f46124x3ff5209f = interfaceC25452xb767407f;
        this.f46119x5f6e3b50 = new android.os.Handler(looper, new android.os.Handler.Callback() { // from class: com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener listener2 = listener;
                if (listener2 == null) {
                    return false;
                }
                if (message.what == 2) {
                    listener2.mo94281x861c30b2(message.arg1, message.arg2);
                    return true;
                }
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46120xf18228b2 = false;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.TAG, "[handleMessage] loading = false");
                int i17 = message.what;
                if (i17 == 3) {
                    listener.mo94279x23875866();
                    return true;
                }
                if (i17 == 4) {
                    listener.mo94280x4f8e79a3((java.io.IOException) message.obj);
                    return true;
                }
                if (i17 != 5) {
                    return false;
                }
                listener.mo94278x938e8b6c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46121xf5e80656);
                return true;
            }
        });
    }

    /* renamed from: loadChunk */
    private boolean m94292x51438d27(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d c25430x3e1324d) {
        if (this.f46122x6978bddb == null || this.f46116xdf007135 == null) {
            throw new java.lang.IllegalStateException("loader must be prepared first!");
        }
        long j17 = c25430x3e1324d.f46098x68ac462;
        long j18 = c25430x3e1324d.f46097x35e001;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "[loadChunk] enter. startPosition: " + j17 + ", chunkSize: " + j18);
        int i17 = c25430x3e1324d.f46096x719ec861;
        byte[] bArr = new byte[i17];
        boolean z17 = j18 == -1;
        if (!z17) {
            i17 = (int) java.lang.Math.min(i17, j18);
        }
        long j19 = 0;
        boolean z18 = false;
        while (true) {
            long j27 = j17 + j19;
            try {
                int mo94264xc8455469 = this.f46122x6978bddb.mo94264xc8455469(j27, bArr, 0, i17);
                if (mo94264xc8455469 == -1) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[loadChunk] read EOF.");
                    break;
                }
                if (mo94264xc8455469 == 0) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "[loadChunk] read none.");
                    break;
                }
                if (mo94264xc8455469 < 0) {
                    throw new java.io.IOException(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25447x2c98d2de("read error: " + mo94264xc8455469, ""));
                }
                try {
                    j19 += mo94264xc8455469;
                    this.f46119x5f6e3b50.removeMessages(2);
                    this.f46119x5f6e3b50.obtainMessage(2, (int) j17, (int) ((j27 + this.f46116xdf007135.mo94076x6c257df(j27, bArr, 0, mo94264xc8455469)) - 1)).sendToTarget();
                    z18 = this.f46117x1c682951 || this.f46121xf5e80656;
                    if (z18 || (!z17 && j19 >= j18)) {
                        break;
                    }
                } catch (java.io.IOException e17) {
                    throw new java.io.IOException(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25446x154cecc3(e17));
                }
            } catch (java.io.IOException e18) {
                throw new java.io.IOException(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25447x2c98d2de(e18, ""));
            }
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "[loadChunk] exit. startPosition: " + j17 + ", loadedBytes: " + j19 + ", this.cancelled: " + this.f46117x1c682951 + ", shutdown: " + this.f46121xf5e80656);
        return !z18;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33
    /* renamed from: cancelLoading */
    public void mo94293x62eeed62() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[cancelLoading] cancel");
        this.f46124x3ff5209f.mo94305x62eeed62();
        this.f46117x1c682951 = true;
    }

    /* renamed from: createCacheSink */
    public abstract com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 mo94270x87ac4b99(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed);

    /* renamed from: createUpStream */
    public abstract com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e mo94271x69daf317(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed);

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33
    /* renamed from: getUpstreamSize */
    public long mo94294xc1fa3ef2() {
        return this.f46123x6107ac7c;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33
    /* renamed from: isLoading */
    public boolean mo94295xf18228b2() {
        if (this.f46124x3ff5209f.mo94306xf18228b2()) {
            return true;
        }
        return this.f46120xf18228b2 && !this.f46121xf5e80656;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33
    /* renamed from: prepare */
    public void mo94296xed060d07() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f46122x6978bddb;
        if (interfaceC25439x37e1318e != null) {
            interfaceC25439x37e1318e.close();
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 interfaceC25392xb60068c6 = this.f46116xdf007135;
        if (interfaceC25392xb60068c6 != null) {
            interfaceC25392xb60068c6.close();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            if (this.f46121xf5e80656) {
                break;
            }
            try {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d take = this.f46118xaee02ba6.take();
                if (this.f46115x85a1d78d == take) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[run] end of queue!");
                    break;
                }
                try {
                    if (m94292x51438d27(take)) {
                        this.f46119x5f6e3b50.obtainMessage(3).sendToTarget();
                    } else {
                        this.f46119x5f6e3b50.obtainMessage(5).sendToTarget();
                    }
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "[run] got error!", e17);
                    this.f46119x5f6e3b50.obtainMessage(4, e17).sendToTarget();
                }
            } catch (java.lang.InterruptedException unused) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "[run] interrupted when taking chunk");
            }
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[run] exit. this.cancelled: " + this.f46117x1c682951 + ", shutdown: " + this.f46121xf5e80656);
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f46122x6978bddb;
            if (interfaceC25439x37e1318e != null) {
                interfaceC25439x37e1318e.close();
            }
        } catch (java.io.IOException unused2) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "[shutdown] failed to close upstream");
        }
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 interfaceC25392xb60068c6 = this.f46116xdf007135;
            if (interfaceC25392xb60068c6 != null) {
                interfaceC25392xb60068c6.close();
            }
        } catch (java.io.IOException unused3) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(TAG, "[shutdown] failed to close cacheSink");
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33
    /* renamed from: shutdown */
    public void mo94297xf5e80656() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[shutdown] enter");
        this.f46121xf5e80656 = true;
        this.f46118xaee02ba6.offer(this.f46115x85a1d78d);
        mo94293x62eeed62();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[shutdown] exit");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33
    /* renamed from: startLoading */
    public void mo94298xc0d627a(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d c25430x3e1324d) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[startLoading] chunk: " + c25430x3e1324d);
        this.f46118xaee02ba6.clear();
        if (!this.f46118xaee02ba6.offer(c25430x3e1324d)) {
            throw new java.lang.IllegalStateException("exceeds maximum of queue!");
        }
        this.f46120xf18228b2 = true;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "[handleMessage] loading = true");
        this.f46117x1c682951 = false;
        if (getState() == java.lang.Thread.State.NEW) {
            this.f46124x3ff5209f.mo94307xc0d627a(0, java.util.concurrent.TimeUnit.MILLISECONDS, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f.Callback() { // from class: com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.2
                @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f.Callback
                /* renamed from: onCancelled */
                public void mo94299x1a926632() {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46119x5f6e3b50.obtainMessage(5).sendToTarget();
                }

                @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f.Callback
                /* renamed from: onFailed */
                public void mo94300x428b6afc(java.lang.Throwable th6) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46119x5f6e3b50.obtainMessage(4, new java.io.IOException("failed to load uri", th6)).sendToTarget();
                }

                @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f.Callback
                /* renamed from: onSucceed */
                public void mo94301xe05b3f63(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.TAG, "[startLoading] uriLoader.startLoading onSucceed");
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e mo94271x69daf317 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.mo94271x69daf317(c25448x2f83e3ed);
                    try {
                        mo94271x69daf317.mo94263x34264a();
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46123x6107ac7c = mo94271x69daf317.mo94260xfb854877();
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46119x5f6e3b50.obtainMessage(4, e17).sendToTarget();
                    }
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2906x85caf2a2.InterfaceC25392xb60068c6 mo94270x87ac4b99 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.mo94270x87ac4b99(c25448x2f83e3ed);
                    try {
                        mo94270x87ac4b99.mo94075x34264a();
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46119x5f6e3b50.obtainMessage(4, e18).sendToTarget();
                    }
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46116xdf007135 = mo94270x87ac4b99;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.f46122x6978bddb = mo94271x69daf317;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.AbstractC25434x5d69ad94.this.start();
                }
            });
        }
    }
}

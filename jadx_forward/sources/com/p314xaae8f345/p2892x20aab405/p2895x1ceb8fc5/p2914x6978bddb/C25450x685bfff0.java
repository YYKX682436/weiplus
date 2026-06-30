package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource */
/* loaded from: classes13.dex */
public class C25450x685bfff0 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a {
    private static final java.lang.String TAG = "TrackDataSource";

    /* renamed from: mDataSource */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f46151x280a54b2;

    /* renamed from: mEndBytePosition */
    private long f46152x3853729f;

    /* renamed from: mStartBytePosition */
    private long f46153x8027f2e6;

    /* renamed from: mStartTimePosition */
    private long f46154xe584fab;

    /* renamed from: mTrackInfo */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 f46155xa63276ac;

    /* renamed from: mTrackStateCallback */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0.TrackStateCallback f46156x26073b8;

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource$TrackStateCallback */
    /* loaded from: classes13.dex */
    public interface TrackStateCallback {
        /* renamed from: onTrackPrepared */
        void mo93865x46c85309(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79);
    }

    public C25450x685bfff0(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79) {
        java.lang.String m93897xb5887636 = c25358xa2ed4c79.m93897xb5887636();
        if (android.text.TextUtils.isEmpty(c25358xa2ed4c79.m93897xb5887636())) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25432x673e7d4a(-1, "track info has no media file path!", null);
        }
        if (!new java.io.File(m93897xb5887636).exists()) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25432x673e7d4a(-1, "track info's media file not exists!", null);
        }
        this.f46151x280a54b2 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25437x56394f21(c25358xa2ed4c79.m93897xb5887636());
        this.f46155xa63276ac = c25358xa2ed4c79;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46151x280a54b2.close();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType mo94257xaa5357a() {
        return this.f46151x280a54b2.mo94257xaa5357a();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: getSize */
    public long mo94260xfb854877() {
        return this.f46151x280a54b2.mo94260xfb854877();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onBufferingUpdate */
    public void mo93843x3e084f2c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onCompletion */
    public void mo93844xa6db431b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onError */
    public void mo93845xaf8aa769(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onPrepared */
    public void mo93846x58d5b73c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 interfaceC25410xa83fe816;
        try {
            this.f46151x280a54b2.mo94263x34264a();
            long mo94260xfb854877 = this.f46151x280a54b2.mo94260xfb854877();
            try {
                interfaceC25410xa83fe816 = abstractC25320x37471834.mo93631xd979a29a();
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "createSeekTable ex occurred!!", e17);
                interfaceC25410xa83fe816 = null;
            }
            if (interfaceC25410xa83fe816 == null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "createSeekTable is null, return");
                return;
            }
            android.util.Pair<java.lang.Long, java.lang.Long> m93895x7511df87 = this.f46155xa63276ac.m93895x7511df87();
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "start time: " + m93895x7511df87.first + ", end time: " + m93895x7511df87.second);
            if (((java.lang.Long) m93895x7511df87.first).longValue() > ((java.lang.Long) m93895x7511df87.second).longValue()) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "start range larger, return");
                return;
            }
            this.f46154xe584fab = ((java.lang.Long) m93895x7511df87.first).longValue();
            long mo94148x35ce78 = interfaceC25410xa83fe816.mo94148x35ce78(((java.lang.Long) m93895x7511df87.first).longValue());
            long mo94148x35ce782 = interfaceC25410xa83fe816.mo94148x35ce78(((java.lang.Long) m93895x7511df87.second).longValue());
            if (mo94260xfb854877 > 0 && mo94148x35ce78 > mo94260xfb854877) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "startBytePosition larger than size!");
                return;
            }
            if (mo94260xfb854877 <= 0 || mo94148x35ce782 <= mo94260xfb854877) {
                mo94260xfb854877 = mo94148x35ce782;
            }
            this.f46153x8027f2e6 = mo94148x35ce78;
            this.f46152x3853729f = mo94260xfb854877;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "start byte: " + this.f46153x8027f2e6 + ", end byte: " + this.f46152x3853729f);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0.TrackStateCallback trackStateCallback = this.f46156x26073b8;
            if (trackStateCallback != null) {
                trackStateCallback.mo93865x46c85309(this.f46155xa63276ac);
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "dataSource open failed!", e18);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onSeekComplete */
    public void mo93847xe1fdf750(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStarted */
    public void mo93848xde9141a2(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        abstractC25320x37471834.mo93651xc9fc1b13(0);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStateChanged */
    public void mo93849xaba1ac62(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: open */
    public void mo94263x34264a() {
        this.f46151x280a54b2.mo94263x34264a();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e
    /* renamed from: readAt */
    public int mo94264xc8455469(long j17, byte[] bArr, int i17, int i18) {
        long j18 = this.f46152x3853729f;
        if (j18 <= 0 || j17 <= j18) {
            return this.f46151x280a54b2.mo94264xc8455469(j17, bArr, i17, i18);
        }
        return -1;
    }

    /* renamed from: setEndBytePosition */
    public void m94325x83ddae0a(long j17) {
        this.f46152x3853729f = j17;
    }

    /* renamed from: setTrackStateCallback */
    public void m94326xad98fc6d(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0.TrackStateCallback trackStateCallback) {
        this.f46156x26073b8 = trackStateCallback;
    }
}

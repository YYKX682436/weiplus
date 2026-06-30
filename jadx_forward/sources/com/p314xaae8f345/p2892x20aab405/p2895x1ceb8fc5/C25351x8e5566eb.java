package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.TrackCorePlayer */
/* loaded from: classes13.dex */
class C25351x8e5566eb extends com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0.TrackStateCallback {
    private static final java.lang.String TAG = "TrackCorePlayer";

    /* renamed from: mStartPosition */
    private long f45730x8f34483e;

    public C25351x8e5566eb(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25340xe0077a66 interfaceC25340xe0077a66, android.os.Looper looper, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25347x8bacb639 interfaceC25347x8bacb639) {
        super(interfaceC25439x37e1318e, null, interfaceC25340xe0077a66, looper, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016.C25375x52862c0d(), interfaceC25347x8bacb639);
        this.f45730x8f34483e = 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80
    /* renamed from: getCurPosition */
    public long mo93734x4abe8653() {
        return super.mo93734x4abe8653() - this.f45730x8f34483e;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25450x685bfff0.TrackStateCallback
    /* renamed from: onTrackPrepared */
    public void mo93865x46c85309(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79) {
        this.f45730x8f34483e = ((java.lang.Long) c25358xa2ed4c79.m93895x7511df87().first).longValue();
        long longValue = ((java.lang.Long) c25358xa2ed4c79.m93895x7511df87().second).longValue();
        long longValue2 = ((java.lang.Long) c25358xa2ed4c79.m93895x7511df87().first).longValue();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "onTrackPrepared, start byte: " + longValue2 + ", end byte: " + longValue);
        this.f45572x1f63867f.m93552xffd6ec16(longValue - longValue2);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80
    /* renamed from: seek */
    public void mo93749x35ce78(int i17) {
        int i18 = (int) (i17 + this.f45730x8f34483e);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "seek, position: " + i17 + " ,realseek: " + i18);
        super.mo93749x35ce78(i18);
    }
}

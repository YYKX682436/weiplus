package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource */
/* loaded from: classes13.dex */
class C25417x658b1af9 {

    /* renamed from: mDataSource */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f46017x280a54b2;

    /* renamed from: mPosition */
    private long f46018x519040b6 = 0;

    public C25417x658b1af9(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        this.f46017x280a54b2 = interfaceC25439x37e1318e;
    }

    /* renamed from: getCurPosition */
    public long m94198x4abe8653() {
        return this.f46018x519040b6;
    }

    /* renamed from: getSize */
    public long m94199xfb854877() {
        return this.f46017x280a54b2.mo94260xfb854877();
    }

    /* renamed from: read */
    public int m94200x355996(byte[] bArr, int i17) {
        int mo94264xc8455469 = this.f46017x280a54b2.mo94264xc8455469(this.f46018x519040b6, bArr, 0, i17);
        this.f46018x519040b6 += mo94264xc8455469;
        return mo94264xc8455469;
    }

    /* renamed from: seek */
    public long m94201x35ce78(long j17) {
        if (j17 >= this.f46017x280a54b2.mo94260xfb854877()) {
            return -1L;
        }
        this.f46018x519040b6 = j17;
        return j17;
    }
}

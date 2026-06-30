package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* renamed from: com.tencent.wechat.aff.ilink_stream.ZIDL_VE9_HaSDB */
/* loaded from: classes12.dex */
class C27343x8ddda0fb extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.q {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.r f298745a;

    /* renamed from: ZIDL_AX */
    private native void m113184x1964d17f(long j17, long j18, int i17);

    /* renamed from: ZIDL_AV */
    public void m113185x1964d17d(long j17) {
        zv5.a aVar = (zv5.a) this.f298745a;
        aVar.getClass();
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.c("IlinkStreamPlatformCommon", "getCurrentNetworkTypeAsync called", new java.lang.Object[0]);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) zv5.a.f558016b.getSystemService("connectivity");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w wVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeUnknown;
        if (connectivityManager == null) {
            aVar.a(j17, wVar);
            return;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            aVar.a(j17, wVar);
            return;
        }
        try {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    aVar.a(j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeWiFi);
                } else if (type != 2 && type != 3 && type != 4 && type != 5) {
                    aVar.a(j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeEthernet);
                }
            }
            aVar.a(j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w.kStreamNetworkTypeCellular);
        } catch (java.lang.Exception unused) {
            aVar.a(j17, wVar);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.r rVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.r) obj;
        this.f298745a = rVar;
        ((zv5.a) rVar).f558017a = this;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.q
    public void l0(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w wVar) {
        m113184x1964d17f(this.f60633xf042a733, j17, wVar.f298863d);
    }
}

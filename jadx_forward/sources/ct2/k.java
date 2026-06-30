package ct2;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct2.m f303816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gn1 f303819g;

    public k(ct2.m mVar, java.lang.String str, java.lang.String str2, r45.gn1 gn1Var) {
        this.f303816d = mVar;
        this.f303817e = str;
        this.f303818f = str2;
        this.f303819g = gn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String preloadUrl = this.f303818f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(preloadUrl, "$preloadUrl");
        long m75939xb282bd08 = this.f303819g.m75939xb282bd08(2);
        ct2.m mVar = this.f303816d;
        mVar.getClass();
        com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26230xad9d9b0a m101477xd9011180 = com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26232xd00268e.m101477xd9011180(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 100);
        com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13 = new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(0);
        c26231xafaedb13.url = preloadUrl;
        java.lang.String id6 = this.f303817e;
        c26231xafaedb13.m101437xc62ff341(id6);
        c26231xafaedb13.m101461x49ff4fe8(m75939xb282bd08);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        c26231xafaedb13.m101463xfb0731c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183669e + id6);
        com.p314xaae8f345.mm.vfs.w6.e(c26231xafaedb13.m101404x4ed0b8());
        m101477xd9011180.mo101366xb66de91b(new ct2.l(mVar, id6));
        mVar.f303823e = m101477xd9011180.mo101368xe500ef47(id6, c26231xafaedb13);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer:" + preloadUrl + "  fileId(replayTransitionId):" + id6 + "  preloadSize bytes:" + m75939xb282bd08 + " savePath:" + c26231xafaedb13.m101404x4ed0b8() + " videoType:-1,preloadId:" + mVar.f303823e);
    }
}

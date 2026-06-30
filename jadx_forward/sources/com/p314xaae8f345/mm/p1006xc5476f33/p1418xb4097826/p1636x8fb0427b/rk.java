package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class rk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.rk f209030d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.rk();

    public rk() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(10000, "直播和附近预拉取超时时间", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_nearby_waiting_preload_timeout_ms, false, 2, null);
        aVar.a("NEARBY_WAITING_PRELOAD_TIMEOUT_MS", kz5.c0.i(5000, 10000, 30000, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8)), kz5.c0.i("默认(10s)", "5s", "10s", "30s", "1min"));
        return aVar;
    }
}

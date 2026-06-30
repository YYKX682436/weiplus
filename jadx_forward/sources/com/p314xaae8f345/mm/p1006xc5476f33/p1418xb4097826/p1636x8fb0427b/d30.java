package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class d30 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d30 f208156d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d30();

    public d30() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(5000, "统计网络情况时间间隔MS", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_network_statistic_interval_ms, false, 2, null);
        aVar.a("NETWORK_STATISTIC_INTERVAL_MS", kz5.c0.i(-1, 5000, 10000), kz5.c0.i("不统计", "5s", "10s"));
        return aVar;
    }
}

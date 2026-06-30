package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class bf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bf f208059d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bf();

    public bf() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(300000, "分享场景展示历史 feed有效时间(ms)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_history_valid_period_time_ms, false, 2, null);
        aVar.a("FINDER_HISTORY_VALID_PERIOD_TIME_MS", kz5.c0.i(10000, 30000, 300000), kz5.c0.i("10s", "30s", "5min"));
        return aVar;
    }
}

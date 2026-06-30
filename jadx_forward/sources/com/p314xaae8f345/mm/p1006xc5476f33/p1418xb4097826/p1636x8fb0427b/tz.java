package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class tz extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tz f209638d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tz();

    public tz() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(600000, "getUserAgent调用时间间隔", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_get_user_agent_call_interval, false, 2, null);
        aVar.a("FinderGetUserAgentIntervalMs", kz5.c0.i(600000, 30000, 0), kz5.c0.i("10分钟", "30秒", "不限制"));
        return aVar;
    }
}

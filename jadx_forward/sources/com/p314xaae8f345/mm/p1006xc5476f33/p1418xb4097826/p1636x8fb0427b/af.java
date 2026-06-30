package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class af extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.af f207963d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.af();

    public af() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(90, "播放上报时间间隔(单位秒)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_heart_report_timer_interval, false, 2, null);
        aVar.a("FINDER_HEART_REPORT_TIMER_INTERVAL", kz5.c0.i(0, 10, 30, 90), kz5.c0.i("0s", "10s", "30s", "90s"));
        return aVar;
    }
}

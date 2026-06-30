package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class yh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yh f209922d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yh();

    public yh() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(1L);
        pb2.a aVar = new pb2.a(millis, "锁屏播放器自动消失时间", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_lock_screen_player_hide_time_millis, false, 2, null);
        aVar.a("FINDER_LOCK_SCREEN_PLAYER_HIDE_TIME_MILLIS", kz5.c0.i(-1L, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(10L)), java.lang.Long.valueOf(millis)), kz5.c0.i("不消失", "10秒", "1分钟"));
        return aVar;
    }
}

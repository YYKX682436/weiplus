package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class xh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xh f209844d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xh();

    public xh() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pb2.a aVar = new pb2.a(0L, "视频时长大于或等于n秒才出锁屏播放器", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_lock_screen_player_feed_duration_threshold, false, 2, null);
        aVar.a("FINDER_LOCK_SCREEN_PLAYER_FEED_DURATION_THRESHOLD", kz5.c0.i(0L, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toSeconds(5L))), kz5.c0.i("0秒", "5分钟"));
        return aVar;
    }
}

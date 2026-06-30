package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class nx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.nx f208808d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.nx();

    public nx() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(30000, "退后台回收所有播放器时间间隔", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_trim_all_video_view_background_interval_ms, false, 2, null);
        aVar.a("FINDER_TRIM_ALL_VIDEO_VIEW_BACKGROUND_INTERVAL_MS", kz5.c0.i(-1, 0, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8), 180000), kz5.c0.i("不回收", "立即回收", "退后台1分钟", "退后台3分钟"));
        return aVar;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class gu extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.gu f208388d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.gu();

    public gu() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pb2.a aVar = new pb2.a(60000L, "视频静默播放时长限制", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_silent_play_limit_duration, false, 2, null);
        aVar.a("FINDER_SILENT_PLAY_LIMIT_TIME", kz5.c0.i(0L, 15000L, 60000L, 600000L), kz5.c0.i("无限制", "15s", "1min", "10min"));
        return aVar;
    }
}

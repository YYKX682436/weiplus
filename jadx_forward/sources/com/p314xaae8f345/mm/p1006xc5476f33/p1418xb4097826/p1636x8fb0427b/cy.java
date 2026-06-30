package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class cy extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cy f208141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cy();

    public cy() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mb2.d dVar = new mb2.d(0.1f, "视频宽高resize宽高比阈值");
        lb2.j.d(dVar, e42.c0.clicfg_finder_video_resize_ratio_delta_threshold, false, 2, null);
        dVar.a("FINDER_VIDEO_RESIZE_RATIO_DELTA_THRESHOLD", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.05f), java.lang.Float.valueOf(0.1f), java.lang.Float.valueOf(0.2f)), kz5.c0.i("0f", "0.05f", "0.1f", "0.2f"));
        return dVar;
    }
}

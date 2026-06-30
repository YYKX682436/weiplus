package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.e4 f208221d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.e4();

    public e4() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mb2.d dVar = new mb2.d(0.45f, "音量控制阈值");
        lb2.j.d(dVar, e42.c0.clicfg_finder_audio_volume_change_threshold, false, 2, null);
        dVar.a("FINDER_AUDIO_VOLUME_CHANGE_THRESHOLD", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.1f), java.lang.Float.valueOf(0.3f), java.lang.Float.valueOf(0.45f), java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.6f), java.lang.Float.valueOf(0.7f), java.lang.Float.valueOf(1.0f)), kz5.c0.i("0", "0.1", "0.3", "0.45", "0.5", "0.6", "0.7", "1"));
        return dVar;
    }
}

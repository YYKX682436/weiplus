package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class hr extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.hr f208440d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.hr();

    public hr() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mb2.d dVar = new mb2.d(0.25f, "视频号滑动帧率采样控制");
        lb2.j.d(dVar, e42.d0.clicfg_finder_scroll_fps_enable, false, 2, null);
        dVar.a("FinderScrollFps", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f)), kz5.c0.i("关闭", "打开"));
        return dVar;
    }
}

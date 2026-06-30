package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.n4 f208759d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.n4();

    public n4() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(86400, "视频本地续播距离上次播放间隔s", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_auto_seek_local_interval, false, 2, null);
        aVar.a("FINDER_AUTO_SEEK_LOCAL_INTERVAL", kz5.c0.i(0, 86400, 60, 10), kz5.c0.i("不判断", "24小时", "1分钟", "10s"));
        return aVar;
    }
}

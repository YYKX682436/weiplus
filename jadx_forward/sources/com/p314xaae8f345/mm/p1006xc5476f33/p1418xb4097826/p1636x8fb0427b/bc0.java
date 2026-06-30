package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class bc0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bc0 f208054d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.bc0();

    public bc0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(5, "发表N秒后提示文案变化", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_post_next_tips_interval, false);
        aVar.a("FINDER_POST_NEXT_TIPS_INTERVAL", kz5.c0.i(5, 3, 10), kz5.c0.i("5秒(默认)", "3秒", "10秒"));
        return aVar;
    }
}

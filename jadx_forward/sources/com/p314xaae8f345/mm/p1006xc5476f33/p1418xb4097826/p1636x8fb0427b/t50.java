package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class t50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t50 f209118d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t50();

    public t50() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(172800000, "2天不出阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_2_day_threshold, false, 2, null);
        aVar.a("TWO_DAY_THRESHOLD", new java.util.ArrayList(kz5.c0.i(172800000, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059), 120000)), kz5.c0.i("2天", "20 秒", "2 分钟"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_like_comment_edu, false, 2, null);
        aVar.a("DEBUG_SELF_LIKE_EDU", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "支持"));
        return aVar;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class hh implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f106923a;

    public hh(zy2.i5 i5Var) {
        this.f106923a = i5Var;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        kotlin.jvm.internal.o.g(noticeList, "noticeList");
        com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
        com.tencent.mm.plugin.finder.feed.jh.f107104d = 11;
        com.tencent.mm.plugin.finder.feed.jh.f107103c = null;
        this.f106923a.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
        com.tencent.mars.xlog.Log.i("FinderLiveForMiniAppLauncher", "more list dismissed, totalReserveCnt=" + i17);
    }
}

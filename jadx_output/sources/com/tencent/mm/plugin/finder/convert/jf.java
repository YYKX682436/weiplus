package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class jf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f103748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f103749e;

    public jf(com.tencent.mm.plugin.finder.convert.zf zfVar, long j17) {
        this.f103748d = zfVar;
        this.f103749e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f103748d.f105110p1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteLiveFeed send FeedDeleteEvent feedId: ");
        long j17 = this.f103749e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
        com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
        am.da daVar = feedDeleteEvent.f54247g;
        daVar.f6437a = j17;
        daVar.f6439c = true;
        feedDeleteEvent.e();
    }
}

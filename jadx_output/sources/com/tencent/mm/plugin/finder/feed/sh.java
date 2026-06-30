package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class sh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uh f108986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f108987e;

    public sh(com.tencent.mm.plugin.finder.feed.uh uhVar, com.tencent.mm.plugin.finder.feed.li liVar) {
        this.f108986d = uhVar;
        this.f108987e = liVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f108986d.f109191p.isEmpty()) {
            com.tencent.mm.plugin.finder.feed.li liVar = this.f108987e;
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ki(liVar.getResources().getString(com.tencent.mm.R.string.f491654ns3), liVar, true, liVar.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
        }
    }
}

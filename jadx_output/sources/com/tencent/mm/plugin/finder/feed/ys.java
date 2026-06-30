package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ys implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ww2 f111192d;

    /* renamed from: e, reason: collision with root package name */
    public final int f111193e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f111194f;

    /* renamed from: g, reason: collision with root package name */
    public long f111195g;

    /* renamed from: h, reason: collision with root package name */
    public int f111196h;

    public ys(r45.ww2 card, int i17, java.util.LinkedList rvFeedList) {
        kotlin.jvm.internal.o.g(card, "card");
        kotlin.jvm.internal.o.g(rvFeedList, "rvFeedList");
        this.f111192d = card;
        this.f111193e = i17;
        this.f111194f = rvFeedList;
        this.f111195g = c01.id.c();
        com.tencent.mars.xlog.Log.i("FinderStreamCardFeed", "#init");
        this.f111196h = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof r45.ww2)) {
            return -1;
        }
        r45.ww2 ww2Var = (r45.ww2) obj;
        return (ww2Var.getLong(0) == this.f111192d.getLong(0) && ww2Var.getInteger(7) == this.f111192d.getInteger(7)) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f111192d.getLong(14);
    }

    @Override // in5.c
    public int h() {
        int i17 = this.f111193e;
        return i17 != 0 ? i17 != 2 ? i17 != 4 ? 0 : 4 : com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED : com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC;
    }
}

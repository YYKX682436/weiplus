package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zs implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.rx2 f111290d;

    public zs(r45.rx2 card) {
        kotlin.jvm.internal.o.g(card, "card");
        this.f111290d = card;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof r45.ww2)) {
            return -1;
        }
        r45.ww2 ww2Var = (r45.ww2) obj;
        long j17 = ww2Var.getLong(0);
        r45.rx2 rx2Var = this.f111290d;
        return (j17 == rx2Var.getLong(0) && ww2Var.getInteger(7) == rx2Var.getInteger(1)) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return ("FinderStreamCardTxtFeed#" + this.f111290d.getLong(0)).hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_LOADING_END;
    }
}

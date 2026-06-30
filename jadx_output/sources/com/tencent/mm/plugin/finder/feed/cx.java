package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderStreamReRankEvent f106514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.autogen.events.FinderStreamReRankEvent finderStreamReRankEvent) {
        super(0);
        this.f106513d = pzVar;
        this.f106514e = finderStreamReRankEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderStreamReRankEvent finderStreamReRankEvent = this.f106514e;
        java.util.List feedIdsList = finderStreamReRankEvent.f54326g.f6672a;
        kotlin.jvm.internal.o.f(feedIdsList, "feedIdsList");
        r45.lx2 resp = finderStreamReRankEvent.f54326g.f6673b;
        kotlin.jvm.internal.o.f(resp, "resp");
        com.tencent.mm.plugin.finder.feed.ew ewVar = com.tencent.mm.plugin.finder.feed.pz.M1;
        this.f106513d.f1(feedIdsList, resp, true);
        return jz5.f0.f302826a;
    }
}

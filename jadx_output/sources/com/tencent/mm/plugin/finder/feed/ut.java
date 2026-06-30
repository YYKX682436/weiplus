package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ut extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f110834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(com.tencent.mm.plugin.finder.feed.yt ytVar) {
        super(0);
        this.f110834d = ytVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f110834d;
        if (!ytVar.f111204n) {
            ytVar.f111204n = true;
            pm0.v.L("LbsPresenter_requestLbs", true, new com.tencent.mm.plugin.finder.feed.tt(ytVar));
        }
        return jz5.f0.f302826a;
    }
}

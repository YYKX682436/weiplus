package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f108849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt(com.tencent.mm.plugin.finder.feed.yt ytVar) {
        super(0);
        this.f108849d = ytVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f108849d;
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = ytVar.h().f();
        if (f17 != null) {
            f17.postDelayed(new com.tencent.mm.plugin.finder.feed.pt(ytVar), 200L);
        }
        return jz5.f0.f302826a;
    }
}

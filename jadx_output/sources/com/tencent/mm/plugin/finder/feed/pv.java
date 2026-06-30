package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xv f108747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(com.tencent.mm.plugin.finder.feed.xv xvVar) {
        super(0);
        this.f108747d = xvVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout j17 = ((com.tencent.mm.plugin.finder.feed.cw) this.f108747d.c()).j();
        j17.postDelayed(new com.tencent.mm.plugin.finder.feed.kv(j17, false), 0L);
        return jz5.f0.f302826a;
    }
}

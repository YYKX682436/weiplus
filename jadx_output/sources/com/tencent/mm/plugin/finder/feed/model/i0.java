package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f107928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f107929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, int i17) {
        super(1);
        this.f107928d = l0Var;
        this.f107929e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var != null) {
            int i17 = this.f107929e;
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                long id6 = baseFinderFeed.getFeedObject().getId();
                java.lang.String w17 = baseFinderFeed.w();
                java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
                com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f107928d;
                l0Var.O0(id6, w17, objectNonceId, l0Var.f108129n, baseFinderFeed.getFeedObject().isOldVersion(), baseFinderFeed.getFeedObject().getUserName(), (i19 & 64) != 0 ? -1 : i17, (i19 & 128) != 0 ? com.tencent.mm.plugin.finder.feed.model.z.f108496d : null);
            }
        }
        return jz5.f0.f302826a;
    }
}

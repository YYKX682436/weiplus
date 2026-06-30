package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.u8 f108373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f108374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.y0 f108376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f108377h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f108378i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f108379m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.tencent.mm.plugin.finder.feed.model.u8 u8Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, boolean z17, com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var, ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, yz5.l lVar) {
        super(0);
        this.f108373d = u8Var;
        this.f108374e = iResponse;
        this.f108375f = z17;
        this.f108376g = y0Var;
        this.f108377h = s3Var;
        this.f108378i = finderTimelineFeedLoader;
        this.f108379m = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.u8 u8Var = this.f108373d;
        u8Var.getClass();
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f108374e;
        java.util.List incrementList = iResponse.getIncrementList();
        if (incrementList != null && (!incrementList.isEmpty())) {
            boolean z17 = false;
            so2.j5 j5Var = (so2.j5) incrementList.get(0);
            if (this.f108375f) {
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = u8Var.f108400b;
                eb2.f0 f0Var = finderTimelineFeedLoader.f107650f;
                if (f0Var != null && j5Var.getItemId() == f0Var.f250745d) {
                    z17 = true;
                }
                if (!z17) {
                    if (!finderTimelineFeedLoader.getDataList().isEmpty()) {
                        finderTimelineFeedLoader.getDataList().clear();
                        finderTimelineFeedLoader.getDispatcher().a();
                    }
                    eb2.f0 f0Var2 = finderTimelineFeedLoader.f107650f;
                    long j17 = f0Var2 != null ? f0Var2.f250745d : 0L;
                    com.tencent.mars.xlog.Log.i(finderTimelineFeedLoader.getF123427d(), "finder stream no return share feed feedId=" + j17);
                    pm0.z.b(xy2.b.f458155b, "ShareFeedNoReturnError", false, null, null, false, false, new com.tencent.mm.plugin.finder.feed.model.p8(j17), 60, null);
                }
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = this.f108376g;
        ym5.s3 s3Var = this.f108377h;
        u8Var.convertOpToReason(y0Var, s3Var);
        this.f108378i.getDispatcher().g(s3Var);
        yz5.l lVar = this.f108379m;
        if (lVar != null) {
            lVar.invoke(iResponse);
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qp implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f108843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108844f;

    public qp(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f108842d = baseFinderFeed;
        this.f108843e = krVar;
        this.f108844f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108842d;
        if (!baseFinderFeed.getFeedObject().checkIsEnableShare(102) || hc2.o0.A(baseFinderFeed.getFeedObject().getFeedObject())) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f108843e;
        com.tencent.mm.ui.MMActivity mMActivity = krVar.f107230d;
        o25.y1 y1Var = krVar.D;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f108842d;
        kotlin.jvm.internal.o.d(g4Var);
        n7Var.d(mMActivity, y1Var, baseFinderFeed2, g4Var, this.f108844f);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.u1 u1Var = ml2.u1.f328076q;
        com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b92.d1) zbVar).sj(u1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
    }
}

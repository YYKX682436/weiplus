package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gx implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f106869f;

    public gx(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f106867d = baseFinderFeed;
        this.f106868e = pzVar;
        this.f106869f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f106867d;
        if (!baseFinderFeed.getFeedObject().checkIsEnableShare(102) || hc2.o0.A(baseFinderFeed.getFeedObject().getFeedObject())) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106868e;
        com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
        o25.y1 y1Var = pzVar.f108766r;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f106867d;
        kotlin.jvm.internal.o.d(g4Var);
        n7Var.d(mMActivity, y1Var, baseFinderFeed2, g4Var, this.f106869f);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.u1 u1Var = ml2.u1.f328076q;
        com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b92.d1) zbVar).sj(u1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
    }
}

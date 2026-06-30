package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f109019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f109020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f109021f;

    public t(com.tencent.mm.plugin.finder.feed.c0 c0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f109019d = c0Var;
        this.f109020e = baseFinderFeed;
        this.f109021f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f109019d;
        c0Var.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f109020e;
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.widget.dialog.k0 sheet = this.f109021f;
        kotlin.jvm.internal.o.g(sheet, "sheet");
        if (!feed.getFeedObject().checkIsEnableShare(102) || hc2.o0.A(feed.getFeedObject().getFeedObject())) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.n7.f102406a.d(c0Var.f106421d, c0Var.f106428n, feed, g4Var, sheet);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.u1 u1Var = ml2.u1.f328076q;
        com.tencent.mm.ui.MMActivity activity = c0Var.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b92.d1) zbVar).sj(u1Var, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
    }
}

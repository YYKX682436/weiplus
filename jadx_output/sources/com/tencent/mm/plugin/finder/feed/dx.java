package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dx extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f106590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f106594h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(db5.g4 g4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(1);
        this.f106590d = g4Var;
        this.f106591e = baseFinderFeed;
        this.f106592f = i17;
        this.f106593g = pzVar;
        this.f106594h = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((java.util.ArrayList) this.f106590d.f228344d).clear();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f106591e;
        if (baseFinderFeed instanceof so2.h1) {
            int i17 = this.f106592f;
            if (i17 == 1) {
                baseFinderFeed.getFeedObject().setShareScene(7);
            } else if (i17 == 3) {
                baseFinderFeed.getFeedObject().setShareScene(1);
            }
        }
        boolean z17 = !baseFinderFeed.getFeedObject().checkIsEnableShare(103);
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106593g;
        if (z17) {
            this.f106590d.j(103, (java.lang.CharSequence) it.f302842e, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f328065n;
            com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((b92.d1) zbVar).sj(u1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        } else {
            this.f106590d.j(103, pzVar.f108755g.getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
        }
        boolean checkIsEnableShare = baseFinderFeed.getFeedObject().checkIsEnableShare(102);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f106594h;
        if (!checkIsEnableShare) {
            o25.y1 y1Var = pzVar.f108766r;
            db5.g4 zeroLineMenu = k0Var.P;
            kotlin.jvm.internal.o.f(zeroLineMenu, "zeroLineMenu");
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).Ri(k0Var, zeroLineMenu);
        }
        hc2.f1.C(k0Var, pzVar.f108755g);
        return jz5.f0.f302826a;
    }
}

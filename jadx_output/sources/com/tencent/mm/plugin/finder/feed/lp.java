package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f107317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f107318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f107319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f107320g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(db5.g4 g4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(1);
        this.f107317d = g4Var;
        this.f107318e = baseFinderFeed;
        this.f107319f = krVar;
        this.f107320g = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((java.util.ArrayList) this.f107317d.f228344d).clear();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f107318e;
        boolean z17 = !baseFinderFeed.getFeedObject().checkIsEnableShare(103);
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f107319f;
        if (z17) {
            this.f107317d.j(103, (java.lang.CharSequence) it.f302842e, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
        } else {
            this.f107317d.j(103, krVar.f107230d.getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
        }
        boolean checkIsEnableShare = baseFinderFeed.getFeedObject().checkIsEnableShare(102);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f107320g;
        if (!checkIsEnableShare) {
            o25.y1 y1Var = krVar.D;
            db5.g4 zeroLineMenu = k0Var.P;
            kotlin.jvm.internal.o.f(zeroLineMenu, "zeroLineMenu");
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).Ri(k0Var, zeroLineMenu);
        }
        com.tencent.mm.plugin.finder.feed.kr.i(krVar, k0Var);
        return jz5.f0.f302826a;
    }
}

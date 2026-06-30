package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class np extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f108590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f108592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108593g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(db5.g4 g4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(1);
        this.f108590d = g4Var;
        this.f108591e = baseFinderFeed;
        this.f108592f = krVar;
        this.f108593g = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((java.util.ArrayList) this.f108590d.f228344d).clear();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108591e;
        boolean z17 = !baseFinderFeed.getFeedObject().checkIsEnableShare(103);
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f108592f;
        if (z17) {
            this.f108590d.j(103, (java.lang.CharSequence) it.f302842e, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
        } else {
            this.f108590d.j(103, krVar.f107230d.getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
        }
        boolean checkIsEnableShare = baseFinderFeed.getFeedObject().checkIsEnableShare(102);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f108593g;
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

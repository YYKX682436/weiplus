package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class up extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f110829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f110830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f110831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f110832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.kr krVar, in5.s0 s0Var) {
        super(0);
        this.f110829d = z17;
        this.f110830e = baseFinderFeed;
        this.f110831f = krVar;
        this.f110832g = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f110829d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f110830e;
        if (z17) {
            baseFinderFeed.getFeedObject().getFeedObject().setPermissionFlag(baseFinderFeed.getFeedObject().getFeedObject().getPermissionFlag() | 2048);
        } else {
            baseFinderFeed.getFeedObject().getFeedObject().setPermissionFlag(baseFinderFeed.getFeedObject().getFeedObject().getPermissionFlag() & (-2049));
        }
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f110831f;
        com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.u4 u4Var = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A;
        in5.s0 s0Var = this.f110832g;
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a17).O6(s0Var, krVar, true);
        bb2.p0 p0Var = bb2.p0.f18940a;
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        bb2.a1 a18 = p0Var.a(itemView);
        if (a18 != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.lifecycle.c1 a19 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            kotlin.jvm.internal.o.f(a19, "get(...)");
            java.lang.Object obj = s0Var.f293125i;
            kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a19).e7(s0Var, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj, false);
            a18.a(krVar.B);
        }
        return jz5.f0.f302826a;
    }
}

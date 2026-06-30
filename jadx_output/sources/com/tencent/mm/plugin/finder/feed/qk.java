package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qk implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f108829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f108832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f108833h;

    public qk(yz5.a aVar, com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, in5.s0 s0Var) {
        this.f108829d = aVar;
        this.f108830e = tlVar;
        this.f108831f = baseFinderFeed;
        this.f108832g = i17;
        this.f108833h = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yz5.a aVar = this.f108829d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108830e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108831f;
        kotlin.jvm.internal.o.d(menuItem);
        tlVar.c(baseFinderFeed, menuItem, i17, this.f108832g, this.f108833h);
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f111016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f111017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f111018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f111019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f111020h;

    public x(yz5.a aVar, com.tencent.mm.plugin.finder.feed.c0 c0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, in5.s0 s0Var) {
        this.f111016d = aVar;
        this.f111017e = c0Var;
        this.f111018f = baseFinderFeed;
        this.f111019g = i17;
        this.f111020h = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yz5.a aVar = this.f111016d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f111017e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f111018f;
        kotlin.jvm.internal.o.d(menuItem);
        c0Var.p(baseFinderFeed, menuItem, i17, this.f111019g, this.f111020h);
    }
}

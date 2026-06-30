package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f111216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f111217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f111218f;

    public z(com.tencent.mm.plugin.finder.feed.c0 c0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f111216d = c0Var;
        this.f111217e = baseFinderFeed;
        this.f111218f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f111216d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f111217e;
        kotlin.jvm.internal.o.d(menuItem);
        c0Var.p(baseFinderFeed, menuItem, i17, 3, this.f111218f);
    }
}

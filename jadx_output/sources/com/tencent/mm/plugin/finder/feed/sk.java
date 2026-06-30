package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class sk implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f108996f;

    public sk(com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f108994d = tlVar;
        this.f108995e = baseFinderFeed;
        this.f108996f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108994d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f108995e;
        kotlin.jvm.internal.o.d(menuItem);
        tlVar.c(baseFinderFeed, menuItem, i17, 3, this.f108996f);
    }
}

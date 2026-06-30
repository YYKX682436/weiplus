package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rk implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108923b;

    public rk(com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f108922a = tlVar;
        this.f108923b = baseFinderFeed;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f108922a.f109069d;
        kotlin.jvm.internal.o.d(view);
        kotlin.jvm.internal.o.d(menuItem);
        y4Var.W(mMActivity, view, i17, menuItem, this.f108923b);
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pk implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f108731d;

    public pk(com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f108728a = tlVar;
        this.f108729b = baseFinderFeed;
        this.f108730c = k0Var;
        this.f108731d = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        if (h4Var != null) {
            o25.y1 quickMenuHelper = this.f108728a.f109073h;
            kotlin.jvm.internal.o.f(this.f108731d.f293121e, "getContext(...)");
            kotlin.jvm.internal.o.g(quickMenuHelper, "quickMenuHelper");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f108729b;
            kotlin.jvm.internal.o.g(feed, "feed");
            com.tencent.mm.ui.widget.dialog.k0 sheet = this.f108730c;
            kotlin.jvm.internal.o.g(sheet, "sheet");
            ((com.tencent.mm.pluginsdk.forward.m) quickMenuHelper).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "getMoreMenuItemLongSelectedListener :" + obj);
    }
}

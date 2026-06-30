package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class w implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f110939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f110940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f110941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f110942d;

    public w(com.tencent.mm.plugin.finder.feed.c0 c0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f110939a = c0Var;
        this.f110940b = baseFinderFeed;
        this.f110941c = k0Var;
        this.f110942d = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f110939a;
        if (h4Var != null) {
            o25.y1 quickMenuHelper = c0Var.f106428n;
            kotlin.jvm.internal.o.f(this.f110942d.f293121e, "getContext(...)");
            kotlin.jvm.internal.o.g(quickMenuHelper, "quickMenuHelper");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f110940b;
            kotlin.jvm.internal.o.g(feed, "feed");
            com.tencent.mm.ui.widget.dialog.k0 sheet = this.f110941c;
            kotlin.jvm.internal.o.g(sheet, "sheet");
            ((com.tencent.mm.pluginsdk.forward.m) quickMenuHelper).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.tencent.mars.xlog.Log.i(c0Var.v(), "getMoreMenuItemLongSelectedListener :" + obj);
    }
}

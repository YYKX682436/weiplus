package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tp implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f109101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f109102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f109103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f109104d;

    public tp(com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f109101a = krVar;
        this.f109102b = baseFinderFeed;
        this.f109103c = k0Var;
        this.f109104d = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f109101a;
        if (h4Var != null) {
            o25.y1 quickMenuHelper = krVar.D;
            kotlin.jvm.internal.o.f(this.f109104d.f293121e, "getContext(...)");
            kotlin.jvm.internal.o.g(quickMenuHelper, "quickMenuHelper");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f109102b;
            kotlin.jvm.internal.o.g(feed, "feed");
            com.tencent.mm.ui.widget.dialog.k0 sheet = this.f109103c;
            kotlin.jvm.internal.o.g(sheet, "sheet");
            ((com.tencent.mm.pluginsdk.forward.m) quickMenuHelper).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.tencent.mars.xlog.Log.i(krVar.f107243t, "getMoreMenuItemLongSelectedListener :" + obj);
    }
}

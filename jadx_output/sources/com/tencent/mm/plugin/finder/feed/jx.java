package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jx implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f107147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f107148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f107149e;

    public jx(com.tencent.mm.plugin.finder.feed.pz pzVar, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var, in5.s0 s0Var) {
        this.f107145a = pzVar;
        this.f107146b = i17;
        this.f107147c = baseFinderFeed;
        this.f107148d = k0Var;
        this.f107149e = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f107145a;
        if (h4Var != null) {
            o25.y1 quickMenuHelper = pzVar.f108766r;
            kotlin.jvm.internal.o.f(this.f107149e.f293121e, "getContext(...)");
            kotlin.jvm.internal.o.g(quickMenuHelper, "quickMenuHelper");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f107147c;
            kotlin.jvm.internal.o.g(feed, "feed");
            com.tencent.mm.ui.widget.dialog.k0 sheet = this.f107148d;
            kotlin.jvm.internal.o.g(sheet, "sheet");
            ((com.tencent.mm.pluginsdk.forward.m) quickMenuHelper).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.tencent.mars.xlog.Log.i(pzVar.U, "getMoreMenuItemLongSelectedListener :" + obj + ' ' + this.f107146b);
    }
}

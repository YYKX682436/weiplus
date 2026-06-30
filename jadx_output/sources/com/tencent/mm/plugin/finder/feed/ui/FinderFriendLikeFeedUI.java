package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/eb;", "Lcom/tencent/mm/plugin/finder/feed/db;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFriendLikeFeedUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI<com.tencent.mm.plugin.finder.feed.eb, com.tencent.mm.plugin.finder.feed.db> {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f109254t = "Finder.FinderFriendLikeFeedUI";

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.db f109255u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.eb f109256v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f109257w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f109258x;

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.k0 c7() {
        com.tencent.mm.plugin.finder.feed.db dbVar = this.f109255u;
        if (dbVar != null) {
            return dbVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.a1 d7() {
        com.tencent.mm.plugin.finder.feed.eb ebVar = this.f109256v;
        if (ebVar != null) {
            return ebVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void e7() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void f7() {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f109257w = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_NICKNAME");
        this.f109258x = stringExtra2 != null ? stringExtra2 : "";
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        java.lang.String g76 = g7();
        java.lang.String str = this.f109258x;
        if (str == null) {
            kotlin.jvm.internal.o.o("targetNickname");
            throw null;
        }
        this.f109258x = c61.yb.md(ybVar, g76, str, false, 4, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initOnCreate ");
        sb6.append(g7());
        sb6.append(", ");
        java.lang.String str2 = this.f109258x;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("targetNickname");
            throw null;
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(this.f109254t, sb6.toString());
        if (g7().length() > 0) {
            lm0.a s17 = gm0.j1.s(vg3.x3.class);
            kotlin.jvm.internal.o.e(s17, "null cannot be cast to non-null type com.tencent.mm.plugin.messenger.foundation.api.IMessengerStorage");
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) s17)).Bi().n(g7(), true);
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.d0p);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.f57);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            if (n17 != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (n17.I != 1) {
                    string = string2;
                }
                objArr[0] = string;
                java.lang.String string3 = getString(com.tencent.mm.R.string.cvm, objArr);
                ((ke0.e) xVar).getClass();
                setMMTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string3));
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                java.lang.String string4 = getString(com.tencent.mm.R.string.cvm, string);
                ((ke0.e) xVar2).getClass();
                setMMTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, string4));
            }
        }
        com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader(g7(), ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderFriendLikeLoader.f107458e = new com.tencent.mm.plugin.finder.feed.ui.b3(finderFriendLikeLoader, this);
        this.f109255u = new com.tencent.mm.plugin.finder.feed.db(this, 0, 0, finderFriendLikeLoader);
        com.tencent.mm.plugin.finder.feed.eb ebVar = new com.tencent.mm.plugin.finder.feed.eb(this, 0, 0, true);
        this.f109256v = ebVar;
        com.tencent.mm.plugin.finder.feed.db dbVar = this.f109255u;
        if (dbVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        ebVar.f106182o = dbVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(g7())) {
            finish();
        }
    }

    public final java.lang.String g7() {
        java.lang.String str = this.f109257w;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("targetUsername");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aj6;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }
}

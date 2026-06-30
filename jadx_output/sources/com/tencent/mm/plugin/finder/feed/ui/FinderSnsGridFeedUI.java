package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/xs;", "Lcom/tencent/mm/plugin/finder/feed/vs;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSnsGridFeedUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI<com.tencent.mm.plugin.finder.feed.xs, com.tencent.mm.plugin.finder.feed.vs> {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.vs f109552t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xs f109553u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f109554v;

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.k0 c7() {
        com.tencent.mm.plugin.finder.feed.vs vsVar = this.f109552t;
        if (vsVar != null) {
            return vsVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.a1 d7() {
        com.tencent.mm.plugin.finder.feed.xs xsVar = this.f109553u;
        if (xsVar != null) {
            return xsVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void f7() {
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
        hideTitleView();
        findViewById(com.tencent.mm.R.id.f482434eh).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.kl(this));
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108024q;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader(m0Var, xy2.c.e(context), ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, false, 0, null, false, 0L, null, 0, null, null, 8184, null);
        finderProfileFeedLoader.setNeedToFilterLiveData(true);
        finderProfileFeedLoader.setFetchEndCallback(new com.tencent.mm.plugin.finder.feed.ui.ll(finderProfileFeedLoader, this));
        this.f109552t = new com.tencent.mm.plugin.finder.feed.vs(this, 0, 0, finderProfileFeedLoader);
        com.tencent.mm.plugin.finder.feed.xs xsVar = new com.tencent.mm.plugin.finder.feed.xs(this, 0, 0, false);
        this.f109553u = xsVar;
        com.tencent.mm.plugin.finder.feed.vs vsVar = this.f109552t;
        if (vsVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        xsVar.f106182o = vsVar;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context2))) {
            com.tencent.mm.plugin.finder.feed.xs xsVar2 = this.f109553u;
            if (xsVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View t17 = xsVar2.t();
            if (t17 != null) {
                android.view.View findViewById = t17.findViewById(com.tencent.mm.R.id.dfl);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.dfy)).setText(t17.getContext().getString(com.tencent.mm.R.string.f5m));
                ((android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.dfz)).setText(t17.getContext().getString(com.tencent.mm.R.string.f5n));
                t17.findViewById(com.tencent.mm.R.id.f484223df5).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ml(this));
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482437ek);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI", "initOnCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void g7(boolean z17) {
        java.lang.String str;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context));
        int i17 = K0 ? com.tencent.mm.R.string.f5n : com.tencent.mm.R.string.f5p;
        com.tencent.mm.plugin.finder.report.o4 o4Var = com.tencent.mm.plugin.finder.report.o4.f125220a;
        if (z17) {
            int i18 = K0 ? 5 : 7;
            java.lang.String str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q;
            str = str2 != null ? str2 : "";
            java.lang.String string = getContext().getString(i17);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.finder.report.o4.a(o4Var, str, i18, string, K0, false, 0L, 32, null);
        } else {
            com.tencent.mm.plugin.finder.feed.xs xsVar = this.f109553u;
            if (xsVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View t17 = xsVar.t();
            boolean z18 = false;
            if (t17 != null && t17.getVisibility() == 0) {
                z18 = true;
            }
            if (z18) {
                int i19 = K0 ? 6 : 8;
                java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q;
                str = str3 != null ? str3 : "";
                java.lang.String string2 = getContext().getString(i17);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                com.tencent.mm.plugin.finder.report.o4.a(o4Var, str, i19, string2, K0, false, 0L, 32, null);
            } else {
                java.lang.String str4 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q;
                com.tencent.mm.plugin.finder.report.o4.a(o4Var, str4 == null ? "" : str4, 4, null, false, false, 0L, 60, null);
            }
        }
        finish();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b9k;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        g7(false);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f109554v) {
            finish();
        }
    }
}

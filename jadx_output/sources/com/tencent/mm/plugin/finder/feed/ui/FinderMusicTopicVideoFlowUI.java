package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderMusicTopicVideoFlowUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/x10;", "Lcom/tencent/mm/plugin/finder/feed/r10;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderMusicTopicVideoFlowUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI<com.tencent.mm.plugin.finder.feed.x10, com.tencent.mm.plugin.finder.feed.r10> {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.r10 f109463t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.x10 f109464u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f109465v = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.rg(this));

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 138;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.k0 c7() {
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f109463t;
        if (r10Var != null) {
            return r10Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.a1 d7() {
        com.tencent.mm.plugin.finder.feed.x10 x10Var = this.f109464u;
        if (x10Var != null) {
            return x10Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void f7() {
        setMMTitle(g7() ? com.tencent.mm.R.string.ezd : com.tencent.mm.R.string.eqe);
        if (g7()) {
            int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479673ca);
            findViewById(com.tencent.mm.R.id.oh8).setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        }
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        int intExtra = getIntent().getIntExtra("KEY_INNER_TAB_TYPE", 3);
        final java.lang.String stringExtra = getIntent().getStringExtra("key_activity_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        final r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        final java.lang.String stringExtra2 = getIntent().getStringExtra("key_by_pass_info");
        com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader(stringExtra, V6, stringExtra2) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderMusicTopicVideoFlowUI$initOnCreate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(15, stringExtra, V6, stringExtra2, 0, 16, null);
                kotlin.jvm.internal.o.d(stringExtra);
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
            public boolean interceptPostStart() {
                return true;
            }
        };
        finderTopicFeedLoader.initFromCache(getIntent());
        finderTopicFeedLoader.f107680s = getIntent().getLongExtra("key_activity_id", 0L);
        finderTopicFeedLoader.f107681t = getIntent().getStringExtra("key_encrypted_topic_id");
        finderTopicFeedLoader.f107682u = intExtra;
        finderTopicFeedLoader.f107675n = java.lang.Long.valueOf(getIntent().getLongExtra("key_feed_ref_id", 0L));
        finderTopicFeedLoader.f107684w = true;
        com.tencent.mm.plugin.finder.feed.ui.pg pgVar = new com.tencent.mm.plugin.finder.feed.ui.pg(this, 138, finderTopicFeedLoader);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_topic_title");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        pgVar.f108868o = stringExtra3;
        pgVar.f108866m = 15;
        pgVar.f108867n = getIntent().getLongExtra("key_activity_id", 0L);
        this.f109463t = pgVar;
        com.tencent.mm.plugin.finder.feed.ui.qg qgVar = new com.tencent.mm.plugin.finder.feed.ui.qg(this, 138);
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_topic_title");
        qgVar.F = stringExtra4 != null ? stringExtra4 : "";
        qgVar.I = getIntent().getLongExtra("key_activity_id", 0L);
        qgVar.D = 15;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        qgVar.f106180m = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        qgVar.f111023J = intExtra;
        qgVar.N = false;
        this.f109464u = qgVar;
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f109463t;
        if (r10Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        qgVar.f106182o = r10Var;
        com.tencent.mm.plugin.finder.feed.x10 x10Var = this.f109464u;
        if (x10Var != null) {
            x10Var.f106180m.setEnableRefresh(false);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    public final boolean g7() {
        return ((java.lang.Boolean) ((jz5.n) this.f109465v).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489043b45;
    }
}

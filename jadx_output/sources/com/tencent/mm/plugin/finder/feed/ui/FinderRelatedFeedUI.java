package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRelatedFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/fs;", "Lcom/tencent/mm/plugin/finder/feed/es;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderRelatedFeedUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI<com.tencent.mm.plugin.finder.feed.fs, com.tencent.mm.plugin.finder.feed.es> {

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.es f109523t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.fs f109524u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109525v;

    /* renamed from: x, reason: collision with root package name */
    public r45.z91 f109527x;

    /* renamed from: y, reason: collision with root package name */
    public r45.aa1 f109528y;

    /* renamed from: w, reason: collision with root package name */
    public final int f109526w = 2;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f109529z = "";

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        if (intExtra != 1) {
            return intExtra != 2 ? 0 : 28;
        }
        return 30;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        return (intExtra == 1 || intExtra == 2) ? 3 : 0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.k0 c7() {
        com.tencent.mm.plugin.finder.feed.es esVar = this.f109523t;
        if (esVar != null) {
            return esVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public com.tencent.mm.plugin.finder.feed.a1 d7() {
        com.tencent.mm.plugin.finder.feed.fs fsVar = this.f109524u;
        if (fsVar != null) {
            return fsVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    public void e7() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d A[ADDED_TO_REGION] */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseGridFeedUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f7() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedFeedUI.f7():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b86;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (i17 == 501 && i18 == -1 && intent != null) {
            com.tencent.mm.plugin.finder.feed.es esVar = this.f109523t;
            if (esVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.a1 a1Var = esVar.f107157f;
            if (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) {
                return;
            }
            hc2.f1.v(recyclerView, intent, esVar.f107156e, true, null);
        }
    }
}

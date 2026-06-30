package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoNewFormUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/cc;", "Lcom/tencent/mm/plugin/finder/feed/bc;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHorizontalVideoNewFormUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.cc, com.tencent.mm.plugin.finder.feed.bc> {

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.bc f109295x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.cc f109296y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderEmptyFeedLoader f109297z = new com.tencent.mm.plugin.finder.feed.model.FinderEmptyFeedLoader();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 162;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        return this.f109297z;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.bc bcVar = this.f109295x;
        if (bcVar != null) {
            return bcVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.cc ccVar = this.f109296y;
        if (ccVar != null) {
            return ccVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ake;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0500, code lost:
    
        if (r1 == false) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0508  */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [as2.b] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7() {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI.h7():void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = (com.tencent.mm.plugin.finder.viewmodel.component.mn) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.mn.class);
        mnVar.S6().unregister((com.tencent.mm.plugin.finder.viewmodel.component.rm) ((jz5.n) mnVar.f135191s).getValue());
        super.onDestroy();
    }
}

package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileLongFeedTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderProfileTimeLineUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileLongFeedTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI {
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI, com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 203;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI
    public com.tencent.mm.plugin.finder.feed.kr c7(com.tencent.mm.ui.MMActivity context, java.lang.String username, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        return new com.tencent.mm.plugin.finder.feed.ui.ti(context, username, z17, j17, this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI
    public void f7() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f109506u;
        if (krVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m17 = krVar.m();
        com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader = m17 instanceof com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader) m17 : null;
        if (finderProfileLiveUserPageTimeLineLoader == null || (arrayList = finderProfileLiveUserPageTimeLineLoader.f107593g) == null) {
            return;
        }
        android.content.Intent intent = getIntent();
        com.tencent.mm.plugin.finder.feed.kr krVar2 = this.f109506u;
        if (krVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        hc2.e0.b(intent, 0, arrayList, krVar2.m().getLastBuffer(), null);
        setResult(-1, getIntent());
    }
}

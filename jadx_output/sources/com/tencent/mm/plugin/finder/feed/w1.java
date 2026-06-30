package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class w1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c2 f110946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110947b;

    public w1(com.tencent.mm.plugin.finder.feed.c2 c2Var, int i17) {
        this.f110946a = c2Var;
        this.f110947b = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.feed.c2 c2Var = this.f110946a;
            java.util.List P6 = c2Var.f106613e.P6(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            int i17 = this.f110947b;
            if (i17 >= 0) {
                java.util.ArrayList arrayList = (java.util.ArrayList) P6;
                if (i17 < arrayList.size()) {
                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) arrayList.get(i17)).getFeedObject();
                    mu2.b bVar = mu2.b.f331394a;
                    com.tencent.mm.ui.MMActivity mMActivity = c2Var.f106612d;
                    long id6 = feedObject.getId();
                    c2Var.getClass();
                    bVar.a(mMActivity, "video_card", 0, id6, 0L, c2Var.f106446m);
                }
            }
        }
    }
}

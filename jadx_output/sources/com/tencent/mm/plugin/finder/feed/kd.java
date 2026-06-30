package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class kd extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f107182u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f107183v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kd(com.tencent.mm.ui.MMActivity r12, androidx.fragment.app.Fragment r13, int r14, int r15, boolean r16, int r17, kotlin.jvm.internal.i r18) {
        /*
            r11 = this;
            r9 = r11
            r10 = r13
            r0 = r17 & 16
            if (r0 == 0) goto L9
            r0 = 0
            r4 = r0
            goto Lb
        L9:
            r4 = r16
        Lb:
            java.lang.String r0 = "context"
            r1 = r12
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.g(r13, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r11
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f107182u = r10
            java.lang.String r0 = "Finder.FinderLikeFeedUIContract.LikeFeedViewCallback"
            r9.f107183v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.kd.<init>(com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        w04.l.INSTANCE.b(540999705);
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            sb6.append(baseFinderFeed.getFeedObject().getId());
            sb6.append(", pos:");
            sb6.append(a07);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = this.f107183v;
            com.tencent.mars.xlog.Log.i(str, sb7);
            boolean isLiveFeed = baseFinderFeed.getFeedObject().isLiveFeed();
            com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
            if (isLiveFeed) {
                r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
                if (liveInfo != null && liveInfo.getInteger(2) == 2) {
                    com.tencent.mars.xlog.Log.i(str, "[checkLiveStatusAndEnterTimeLine] live end");
                    db5.e1.i(mMActivity, com.tencent.mm.R.string.nls, 0);
                    return;
                }
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent, a07, null, 4, null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(mMActivity, intent);
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f444181d, getRecyclerView(), baseFinderFeed.getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), null, 8, null), 14, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i0Var.Dj(context, intent);
            androidx.fragment.app.Fragment fragment = this.f107182u;
            kotlin.jvm.internal.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long itemId = baseFinderFeed.getItemId();
            java.lang.String w17 = baseFinderFeed.w();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
            java.lang.String jSONObject = baseFinderFeed.getUdfKv().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, itemId, w17, recyclerView, 0, jSONObject, 0L, null, 208, null);
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, baseFinderFeed, 18);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
        if (z().f107156e.getSize() <= this.f106179i * 3) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z().f107156e;
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader");
            if (((com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader) baseFeedLoader).f107474f) {
                com.tencent.mm.view.RefreshLoadMoreLayout.K(this.f106180m, false, 1, null);
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = z().f107156e;
        kotlin.jvm.internal.o.e(baseFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader");
        com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader finderLikedFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader) baseFeedLoader2;
        int i17 = finderLikedFeedLoader.f107473e - 1;
        finderLikedFeedLoader.f107473e = i17;
        android.view.View view = this.f106185r;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2) : null;
        if (textView == null) {
            return;
        }
        textView.setText(this.f106174d.getResources().getString(com.tencent.mm.R.string.cuu, java.lang.Integer.valueOf(i17)));
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        fc2.o Z6;
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        androidx.fragment.app.Fragment fragment = this.f107182u;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(getRecyclerView());
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return this.f106174d.findViewById(com.tencent.mm.R.id.f484229dg3);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f106184q.d(context);
    }
}

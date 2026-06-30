package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gp extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f106856d;

    public gp(com.tencent.mm.plugin.finder.feed.kr krVar) {
        this.f106856d = krVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$adFeedFocusScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$adFeedFocusScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0103 A[LOOP:0: B:11:0x006a->B:56:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111 A[EDGE_INSN: B:57:0x0111->B:58:0x0111 BREAK  A[LOOP:0: B:11:0x006a->B:56:0x0103], SYNTHETIC] */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.gp.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

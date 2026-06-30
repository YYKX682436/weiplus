package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f110879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.w8 f110880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110881f;

    public v8(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.feed.w8 w8Var, java.lang.String str) {
        this.f110879d = baseFinderFeed;
        this.f110880e = w8Var;
        this.f110881f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback$refreshMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        boolean isReplayVideo = this.f110879d.getFeedObject().isReplayVideo();
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f110880e;
        com.tencent.mm.plugin.finder.feed.c0 c0Var = w8Var.f106969e;
        com.tencent.mm.plugin.finder.feed.t8 t8Var = c0Var instanceof com.tencent.mm.plugin.finder.feed.t8 ? (com.tencent.mm.plugin.finder.feed.t8) c0Var : null;
        int i17 = t8Var != null ? t8Var.M : 0;
        if (i17 == 1 || i17 == 2) {
            if (isReplayVideo) {
                intent.putExtra("key_member_inlet_source", 1);
            } else {
                intent.putExtra("key_member_inlet_source", 3);
            }
        } else if (i17 == 3) {
            if (isReplayVideo) {
                intent.putExtra("key_member_inlet_source", 2);
            } else {
                intent.putExtra("key_member_inlet_source", 4);
            }
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Kk(w8Var.f106968d, intent, this.f110881f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback$refreshMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

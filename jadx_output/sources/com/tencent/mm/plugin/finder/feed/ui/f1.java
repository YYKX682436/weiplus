package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f109996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f109997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f109998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI f109999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f110000h;

    public f1(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, long j17, int i17, com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI, android.content.Context context) {
        this.f109996d = finderItem;
        this.f109997e = j17;
        this.f109998f = i17;
        this.f109999g = finderCommentUI;
        this.f110000h = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f109996d;
        intent.putExtra("feed_object_id", finderItem.getId());
        intent.putExtra("mention_id", this.f109997e);
        intent.putExtra("mention_create_time", this.f109998f);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI.G;
        com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI = this.f109999g;
        finderCommentUI.getClass();
        intent.putExtra("from_scene", hc2.o0.H(finderItem.getFeedObject()) ? 1 : com.tencent.mm.plugin.finder.storage.t70.f127590a.u2());
        intent.putExtra("from_comment_ui", true);
        com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(this.f110000h, intent);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Xj(finderCommentUI, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

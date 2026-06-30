package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ap implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 f109687d;

    public ap(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34) {
        this.f109687d = occupyFinderUI34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$refreshInfoLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_router_to_profile", false);
        intent.putExtra("key_create_scene", 5);
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34 = this.f109687d;
        intent.setClass(occupyFinderUI34.getContext(), com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.class);
        occupyFinderUI34.getContext().startActivityForResult(intent, 1000085);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$refreshInfoLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

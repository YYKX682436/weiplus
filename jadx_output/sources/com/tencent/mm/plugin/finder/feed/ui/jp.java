package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class jp implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 f110204d;

    public jp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39) {
        this.f110204d = occupyFinderUI39;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent(this.f110204d, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40.class);
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39 = this.f110204d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(occupyFinderUI39, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39$initSearch$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        occupyFinderUI39.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(occupyFinderUI39, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39$initSearch$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class jp implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f f191737d;

    public jp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f activityC14121xff3e46f) {
        this.f191737d = activityC14121xff3e46f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent(this.f191737d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14122xff3e485.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f activityC14121xff3e46f = this.f191737d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC14121xff3e46f, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39$initSearch$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC14121xff3e46f.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC14121xff3e46f, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39$initSearch$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}

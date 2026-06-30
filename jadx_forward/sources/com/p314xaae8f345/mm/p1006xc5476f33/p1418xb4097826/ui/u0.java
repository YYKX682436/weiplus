package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d f211425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f211426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b f211427f;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d activityC15010xb447a21d, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b) {
        this.f211425d = activityC15010xb447a21d;
        this.f211426e = y1Var;
        this.f211427f = c15635xf0ea441b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d.L2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d activityC15010xb447a21d = this.f211425d;
        activityC15010xb447a21d.getClass();
        boolean z17 = java.lang.System.currentTimeMillis() - activityC15010xb447a21d.f210039w2 < 1000;
        activityC15010xb447a21d.f210039w2 = java.lang.System.currentTimeMillis();
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "onSendItemClick: long video btn hit double click check");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC15010xb447a21d.f210040x2 = true;
        this.f211426e.q();
        activityC15010xb447a21d.F2.getClass();
        android.content.Intent intent = activityC15010xb447a21d.getIntent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = this.f211427f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15053x15a6cfc3.Q.a(activityC15010xb447a21d, intent, c15635xf0ea441b.f219963e, c15635xf0ea441b.f219981z, c15635xf0ea441b.f219980y, activityC15010xb447a21d.f210037u2, true, 5);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class wf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15060xd397f524 f211521d;

    public wf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15060xd397f524 activityC15060xd397f524) {
        this.f211521d = activityC15060xd397f524;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15060xd397f524.f210222m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("complete location ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15060xd397f524 activityC15060xd397f524 = this.f211521d;
        sb6.append(activityC15060xd397f524.f210224e);
        sb6.append(' ');
        sb6.append(activityC15060xd397f524.f210225f);
        sb6.append(' ');
        sb6.append(activityC15060xd397f524.f210226g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15060xd397f524.f210223d, sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Country", activityC15060xd397f524.f210224e);
        intent.putExtra("Contact_Province", activityC15060xd397f524.f210225f);
        intent.putExtra("Contact_City", activityC15060xd397f524.f210226g);
        activityC15060xd397f524.setResult(-1, intent);
        activityC15060xd397f524.finish();
        return true;
    }
}

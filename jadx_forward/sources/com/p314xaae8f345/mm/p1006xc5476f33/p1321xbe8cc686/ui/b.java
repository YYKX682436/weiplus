package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 f177146d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 activityC13096xe0b615b8) {
        this.f177146d = activityC13096xe0b615b8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ERRMSG", "cancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 activityC13096xe0b615b8 = this.f177146d;
        activityC13096xe0b615b8.setResult(1, intent);
        activityC13096xe0b615b8.finish();
        activityC13096xe0b615b8.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes.dex */
public class a3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 f180932d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 activityC13469x6a5106b4) {
        this.f180932d = activityC13469x6a5106b4;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 activityC13469x6a5106b4 = this.f180932d;
        android.content.Intent intent = new android.content.Intent(activityC13469x6a5106b4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7.class);
        intent.putExtra("app_username", activityC13469x6a5106b4.f180817e);
        intent.putExtra("rank_id", "#");
        intent.putExtra("key_is_latest", true);
        intent.putExtra("device_type", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 activityC13469x6a5106b42 = this.f180932d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC13469x6a5106b42, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13469x6a5106b42.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC13469x6a5106b42, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13469x6a5106b4.finish();
        return false;
    }
}

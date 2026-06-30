package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes.dex */
public class a3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI f99399d;

    public a3(com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI) {
        this.f99399d = exdeviceLikeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI = this.f99399d;
        android.content.Intent intent = new android.content.Intent(exdeviceLikeUI, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.class);
        intent.putExtra("app_username", exdeviceLikeUI.f99284e);
        intent.putExtra("rank_id", "#");
        intent.putExtra("key_is_latest", true);
        intent.putExtra("device_type", 1);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI2 = this.f99399d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(exdeviceLikeUI2, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exdeviceLikeUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(exdeviceLikeUI2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exdeviceLikeUI.finish();
        return false;
    }
}

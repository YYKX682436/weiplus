package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes3.dex */
public class f4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d f222919d;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d) {
        this.f222919d = activityC15977x7ee4409d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent(this.f222919d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e.class);
        intent.putExtra("game_report_from_scene", 1109);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d = this.f222919d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC15977x7ee4409d, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC15977x7ee4409d.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC15977x7ee4409d, "com/tencent/mm/plugin/game/ui/GameLibraryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}

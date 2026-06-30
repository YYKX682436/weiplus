package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes3.dex */
public class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 f222601d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 activityC15944xcd1fadc4) {
        this.f222601d = activityC15944xcd1fadc4;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 activityC15944xcd1fadc4 = this.f222601d;
        android.content.Intent intent = new android.content.Intent(activityC15944xcd1fadc4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e.class);
        int i17 = activityC15944xcd1fadc4.f222225n;
        if (i17 == 1) {
            intent.putExtra("game_report_from_scene", 1602);
        } else if (i17 == 2) {
            intent.putExtra("game_report_from_scene", 1502);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 activityC15944xcd1fadc42 = this.f222601d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC15944xcd1fadc42, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC15944xcd1fadc42.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC15944xcd1fadc42, "com/tencent/mm/plugin/game/ui/GameCategoryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}

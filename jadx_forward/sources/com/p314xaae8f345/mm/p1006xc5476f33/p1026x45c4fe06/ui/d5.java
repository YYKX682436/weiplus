package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class d5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168 f171192d;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168 activityC12644x463f8168) {
        this.f171192d = activityC12644x463f8168;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168 activityC12644x463f8168 = this.f171192d;
        if (activityC12644x463f8168.f170890e) {
            android.content.Intent intent = new android.content.Intent(activityC12644x463f8168, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.class);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            intent.putExtra("extra_start_activity_click_timestamp_ms", java.lang.System.currentTimeMillis());
            intent.putExtra("extra_enter_scene", 6);
            intent.putExtra("extra_show_recommend", false);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC12644x463f8168, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI", "dealWidgetBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12644x463f8168.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC12644x463f8168, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI", "dealWidgetBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12644x463f8168.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292618h);
        }
        activityC12644x463f8168.finish();
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class c3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171154d;

    public c3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f171154d = appBrandDebugUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d.Ni("AppBrandDebugUI");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f171154d;
        intent.putExtra("Intro_Need_Clear_Top ", true);
        intent.addFlags(67108864);
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.f278359y;
        intent.setClass(context, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(appBrandDebugUI, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appBrandDebugUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(appBrandDebugUI, "com/tencent/mm/plugin/appbrand/ui/AppBrandDebugUI$onPostCreate$58$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b3());
        this.f171154d.finish();
    }
}

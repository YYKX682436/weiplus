package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes.dex */
public class z4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa f171896d;

    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa activityC12641x975e69aa) {
        this.f171896d = activityC12641x975e69aa;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa activityC12641x975e69aa = this.f171896d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa activityC12641x975e69aa2 = this.f171896d;
        android.content.Intent putExtra = new android.content.Intent(activityC12641x975e69aa2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.class).putExtra("extra_enter_scene", 11);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC12641x975e69aa, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC12641x975e69aa.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC12641x975e69aa, "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        jx3.f.INSTANCE.d(14750, 3, "");
        activityC12641x975e69aa2.finish();
    }
}

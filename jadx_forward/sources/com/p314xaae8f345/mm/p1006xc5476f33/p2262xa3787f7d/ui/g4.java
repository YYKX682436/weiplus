package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 f254544d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9) {
        this.f254544d = activityC18580x3cc47ed9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = this.f254544d;
        activityC18580x3cc47ed9.getClass();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).Ib()) {
            android.content.Intent intent = new android.content.Intent(activityC18580x3cc47ed9, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18585xdf1eb87f.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed92 = this.f254544d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC18580x3cc47ed92, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18580x3cc47ed92.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC18580x3cc47ed92, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(activityC18580x3cc47ed9, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18588x97356fb7.class);
        intent2.putExtra("biz_type", 10);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed93 = this.f254544d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent2);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(activityC18580x3cc47ed93, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18580x3cc47ed93.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(activityC18580x3cc47ed93, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

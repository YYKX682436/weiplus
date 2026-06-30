package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 f254665d;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9) {
        this.f254665d = activityC18580x3cc47ed9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean a07 = c01.e2.a0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = this.f254665d;
        if (a07) {
            android.content.Intent intent = new android.content.Intent(activityC18580x3cc47ed9, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18588x97356fb7.class);
            intent.putExtra("biz_type", 13);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed92 = this.f254665d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC18580x3cc47ed92, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18580x3cc47ed92.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC18580x3cc47ed92, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent(activityC18580x3cc47ed9, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18586x3f849c5f.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed93 = this.f254665d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC18580x3cc47ed93, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18580x3cc47ed93.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC18580x3cc47ed93, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

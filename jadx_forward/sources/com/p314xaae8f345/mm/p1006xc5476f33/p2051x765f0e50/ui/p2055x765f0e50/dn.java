package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public final class dn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17464x86570215 f242488d;

    public dn(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17464x86570215 activityC17464x86570215) {
        this.f242488d = activityC17464x86570215;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17464x86570215 activityC17464x86570215 = this.f242488d;
        android.content.Intent intent = new android.content.Intent(this.f242488d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.ActivityC17494xd9fba53d.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC17464x86570215, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17464x86570215.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC17464x86570215, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

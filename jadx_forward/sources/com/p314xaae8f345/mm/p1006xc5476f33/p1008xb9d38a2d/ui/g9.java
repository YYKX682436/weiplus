package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class g9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e f155414d;

    public g9(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e activityC11449xcdfa582e) {
        this.f155414d = activityC11449xcdfa582e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11449xcdfa582e activityC11449xcdfa582e = this.f155414d;
        android.content.Intent intent = new android.content.Intent(this.f155414d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC11449xcdfa582e, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11449xcdfa582e.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC11449xcdfa582e, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MMFBFriendUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

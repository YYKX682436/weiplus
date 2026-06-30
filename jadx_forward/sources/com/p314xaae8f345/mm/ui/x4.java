package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class x4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f294076d;

    public x4(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb) {
        this.f294076d = c21357x5e7365bb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/FindMoreFriendsUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f294076d;
        android.content.Intent intent = new android.content.Intent(this.f294076d.mo7438x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17434x64616b86.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c21357x5e7365bb, arrayList2.toArray(), "com/tencent/mm/ui/FindMoreFriendsUI$19", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c21357x5e7365bb.mo7585xa4df9991((android.content.Intent) arrayList2.get(0));
        yj0.a.f(c21357x5e7365bb, "com/tencent/mm/ui/FindMoreFriendsUI$19", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

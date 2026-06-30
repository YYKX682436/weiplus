package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes3.dex */
public class d implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11338x9bb0fc0a f154130a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11338x9bb0fc0a activityC11338x9bb0fc0a) {
        this.f154130a = activityC11338x9bb0fc0a;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        android.content.Intent intent = new android.content.Intent(this.f154130a.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a.class);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11338x9bb0fc0a activityC11338x9bb0fc0a = this.f154130a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11338x9bb0fc0a, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AAEntranceUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11338x9bb0fc0a.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11338x9bb0fc0a, "com/tencent/mm/plugin/aa/ui/AAEntranceUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

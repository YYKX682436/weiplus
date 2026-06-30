package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f236021d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var) {
        this.f236021d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u0) this.f236021d.f236082c).f236136a;
        java.lang.String d17 = m0Var.f235992n.d1();
        android.content.Intent intent = new android.content.Intent(m0Var.f235989h, (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19646xabcfe59e.class);
        intent.putExtra(dm.i4.f66875xa013b0d5, d17);
        intent.putExtra("brand_icon_url", m0Var.f235993o);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m0Var.f235989h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "doEnterAvatar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "doEnterAvatar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

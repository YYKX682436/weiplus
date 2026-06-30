package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f236222d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        this.f236222d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = this.f236222d;
        m0Var.getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m0Var.f235989h;
        android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf.getIntent());
        intent.removeExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39701x5f6db9dd);
        intent.removeExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39702x6ee5c4af);
        intent.removeExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39697xfa441f0a);
        intent.removeExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39699xc6812768);
        intent.putExtra("Contact_Scene", 232);
        j45.l.j(abstractActivityC21394xb3d2c0cf, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

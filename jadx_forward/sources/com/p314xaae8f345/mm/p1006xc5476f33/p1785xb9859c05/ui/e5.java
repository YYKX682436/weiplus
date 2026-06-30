package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 f224332d;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14) {
        this.f224332d = activityC16146xeed29e14;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_MSG_CENTER_SHOW_REDDOT_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue()) {
            q83.h.a(4, -1, ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT, -1)).intValue());
        }
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT, -1);
        c01.d9.b().p().x(u3Var, bool);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14 = this.f224332d;
        activityC16146xeed29e14.f224232p.setVisibility(8);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC16146xeed29e14.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16146xeed29e14.mo55332x76847179();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

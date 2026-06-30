package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224310d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var) {
        this.f224310d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue();
        if (booleanValue) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p18 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_TYPE_INT;
            int intValue = ((java.lang.Integer) p18.m(u3Var2, -1)).intValue();
            q83.h.a(2, intValue, -1);
            c01.d9.b().p().x(u3Var2, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAddressController", "set red dot type from %d to -1", java.lang.Integer.valueOf(intValue));
        }
        java.lang.String str = booleanValue ? "true" : "false";
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p19 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAddressController", "set show red dot from %s to false, set account string from %s to null", str, (java.lang.String) p19.m(u3Var3, ""));
        c01.d9.b().p().x(u3Var, bool);
        c01.d9.b().p().x(u3Var3, "");
        if (((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_CLEAR_TYPE_INT, 0)).intValue() != 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p27 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAddressController", "set account activity string from %s to null", (java.lang.String) p27.m(u3Var4, ""));
            c01.d9.b().p().x(u3Var4, "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12061, 0, 0, 1, 0, 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224310d;
        m0Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i0(m0Var));
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(m0Var.f224465d, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16128x168466e3 activityC16128x168466e3 = m0Var.f224465d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16128x168466e3, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16128x168466e3.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16128x168466e3, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

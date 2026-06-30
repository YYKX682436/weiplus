package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f224313d;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f3Var) {
        this.f224313d = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f3 f3Var = this.f224313d;
        r45.p57 p57Var = (r45.p57) f3Var.getItem(intValue);
        if (p57Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p57Var.f464314m)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallPackageUI", "buyBtnClick: proToBuy is null");
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        f3Var.f224359e.f224182n.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b5 = f3Var.f224359e;
        q83.e eVar = activityC16141x4dcd32b5.f224182n;
        eVar.f442290c++;
        eVar.f442294g = p57Var.f464314m;
        db5.e1.C(activityC16141x4dcd32b5, activityC16141x4dcd32b5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5p, p57Var.f464309e, p57Var.f464308d), f3Var.f224359e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5q), f3Var.f224359e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5n), f3Var.f224359e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5o), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b3(this, p57Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c3(this));
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

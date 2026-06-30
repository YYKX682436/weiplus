package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i5 f180960d;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i5 i5Var) {
        this.f180960d = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankAdapter", "hy: user clicked on the content");
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i5 i5Var = this.f180960d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7 e7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) i5Var.f181038e.get(intValue);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7) i5Var.f181042i).X6(e7Var.f180980a.f67224xdec927b);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

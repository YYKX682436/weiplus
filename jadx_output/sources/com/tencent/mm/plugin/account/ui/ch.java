package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ch implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f73784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f73785e;

    public ch(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI, java.lang.String[] strArr) {
        this.f73785e = regSetInfoUI;
        this.f73784d = strArr;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$22", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f73785e;
        db5.d5 d5Var = regSetInfoUI.I;
        if (d5Var != null) {
            d5Var.dismiss();
            regSetInfoUI.I = null;
        }
        regSetInfoUI.f73630e.setText(this.f73784d[i17]);
        regSetInfoUI.f73630e.postDelayed(new com.tencent.mm.plugin.account.ui.bh(this), 50L);
        regSetInfoUI.f73640r.setText(regSetInfoUI.getString(com.tencent.mm.R.string.hxy));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$22", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes4.dex */
public class e0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI f96295d;

    public e0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI) {
        this.f96295d = qrRewardSelectMoneyUI;
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
        yj0.a.b("com/tencent/mm/plugin/collect/reward/ui/QrRewardSelectMoneyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI.U6(this.f96295d, ((java.lang.Integer) adapterView.getAdapter().getItem(i17)).intValue(), 1);
        yj0.a.h(this, "com/tencent/mm/plugin/collect/reward/ui/QrRewardSelectMoneyUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes3.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f181062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13475x54dd56d1 f181063e;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13475x54dd56d1 c13475x54dd56d1, android.content.Context context) {
        this.f181063e = c13475x54dd56d1;
        this.f181062d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13475x54dd56d1 c13475x54dd56d1 = this.f181063e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13475x54dd56d1.f180859f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankChampionInfoView", "username is null.");
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f181062d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714.class);
        intent.putExtra(dm.i4.f66875xa013b0d5, c13475x54dd56d1.f180859f);
        android.content.Context context = this.f181062d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes3.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f99529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView f99530e;

    public j5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView exdeviceRankChampionInfoView, android.content.Context context) {
        this.f99530e = exdeviceRankChampionInfoView;
        this.f99529d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView exdeviceRankChampionInfoView = this.f99530e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(exdeviceRankChampionInfoView.f99326f)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankChampionInfoView", "username is null.");
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f99529d, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.class);
        intent.putExtra(dm.i4.COL_USERNAME, exdeviceRankChampionInfoView.f99326f);
        android.content.Context context = this.f99529d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class c3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI f99417d;

    public c3(com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI) {
        this.f99417d = exdeviceLikeUI;
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
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI = this.f99417d;
        r32.e eVar = (r32.e) exdeviceLikeUI.f99287h.getItem(i17);
        android.content.Intent intent = new android.content.Intent(exdeviceLikeUI, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.class);
        intent.putExtra("app_username", eVar.field_appusername);
        intent.putExtra("rank_id", eVar.field_rankID);
        intent.putExtra("device_type", 1);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI2 = this.f99417d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(exdeviceLikeUI2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exdeviceLikeUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(exdeviceLikeUI2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exdeviceLikeUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class d3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI f99425d;

    public d3(com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI) {
        this.f99425d = exdeviceLikeUI;
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
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI = this.f99425d;
        r32.e eVar = (r32.e) exdeviceLikeUI.f99283d.get(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rank_id", eVar.field_rankID);
        intent.putExtra("device_type", 1);
        intent.putExtra("locate_to_username", eVar.field_username);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("app_username", c01.a2.e("gh_43f2581f6fd6"));
        j45.l.j(exdeviceLikeUI, "exdevice", ".ui.ExdeviceRankInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

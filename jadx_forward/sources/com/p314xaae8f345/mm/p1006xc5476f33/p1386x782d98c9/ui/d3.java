package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class d3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 f180958d;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 activityC13469x6a5106b4) {
        this.f180958d = activityC13469x6a5106b4;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13469x6a5106b4 activityC13469x6a5106b4 = this.f180958d;
        r32.e eVar = (r32.e) activityC13469x6a5106b4.f180816d.get(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rank_id", eVar.f66782xde6292c);
        intent.putExtra("device_type", 1);
        intent.putExtra("locate_to_username", eVar.f66784xdec927b);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("app_username", c01.a2.e("gh_43f2581f6fd6"));
        j45.l.j(activityC13469x6a5106b4, "exdevice", ".ui.ExdeviceRankInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class z implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAQueryListUI f72902d;

    public z(com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI) {
        this.f72902d = aAQueryListUI;
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
        yj0.a.b("com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI = this.f72902d;
        com.tencent.mm.plugin.aa.ui.w wVar = aAQueryListUI.f72445i;
        if (wVar != null) {
            if (i17 < 0 || i17 >= wVar.getCount()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "click out of bound! %s", java.lang.Integer.valueOf(i17));
                yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int top = view.getTop();
            r45.p pVar = (r45.p) aAQueryListUI.f72445i.getItem(i17);
            if (pVar != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(pVar.f382638m)) {
                    com.tencent.mm.wallet_core.ui.r1.V(aAQueryListUI.getContext(), pVar.f382638m, true);
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(pVar.f382632d)) {
                    java.lang.String r17 = pVar.f382637i == 2 ? c01.z1.r() : null;
                    android.content.Intent intent = new android.content.Intent(aAQueryListUI, (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.PaylistAAUI.class);
                    intent.putExtra("bill_no", pVar.f382632d);
                    intent.putExtra("launcher_user_name", r17);
                    intent.putExtra("enter_scene", 4);
                    intent.putExtra("chatroom", pVar.f382639n);
                    intent.putExtra("item_position", i17);
                    intent.putExtra("item_offset", top);
                    aAQueryListUI.startActivityForResult(intent, 1);
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 5, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

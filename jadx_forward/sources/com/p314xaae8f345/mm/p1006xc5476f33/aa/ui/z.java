package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class z implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a f154435d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a) {
        this.f154435d = activityC11342x8f12a65a;
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
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a = this.f154435d;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w wVar = activityC11342x8f12a65a.f153978i;
        if (wVar != null) {
            if (i17 < 0 || i17 >= wVar.getCount()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "click out of bound! %s", java.lang.Integer.valueOf(i17));
                yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int top = view.getTop();
            r45.p pVar = (r45.p) activityC11342x8f12a65a.f153978i.getItem(i17);
            if (pVar != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pVar.f464171m)) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC11342x8f12a65a.mo55332x76847179(), pVar.f464171m, true);
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pVar.f464165d)) {
                    java.lang.String r17 = pVar.f464170i == 2 ? c01.z1.r() : null;
                    android.content.Intent intent = new android.content.Intent(activityC11342x8f12a65a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.class);
                    intent.putExtra("bill_no", pVar.f464165d);
                    intent.putExtra("launcher_user_name", r17);
                    intent.putExtra("enter_scene", 4);
                    intent.putExtra("chatroom", pVar.f464172n);
                    intent.putExtra("item_position", i17);
                    intent.putExtra("item_offset", top);
                    activityC11342x8f12a65a.startActivityForResult(intent, 1);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 5, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

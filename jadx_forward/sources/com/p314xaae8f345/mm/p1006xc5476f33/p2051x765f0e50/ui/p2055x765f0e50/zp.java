package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class zp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq f243369d;

    public zp(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq bqVar, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7) {
        this.f243369d = bqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq bqVar = this.f243369d;
        bqVar.f242422m.setChecked(!r1.isChecked());
        if (bqVar.f242422m.isChecked()) {
            bqVar.f242425p.f242313u.add(java.lang.Integer.valueOf(intValue));
        } else {
            bqVar.f242425p.f242313u.remove(java.lang.Integer.valueOf(intValue));
        }
        if (bqVar.f242425p.f242313u.size() == 0) {
            bqVar.f242425p.f242306n.setEnabled(false);
            bqVar.f242425p.f242305m.setEnabled(false);
        } else {
            bqVar.f242425p.f242306n.setEnabled(true);
            bqVar.f242425p.f242305m.setEnabled(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

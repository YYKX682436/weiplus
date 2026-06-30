package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class tp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 f243119d;

    public tp(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7) {
        this.f243119d = activityC17486x3b418ac7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = this.f243119d;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) activityC17486x3b418ac7.f242307o.findViewById(com.p314xaae8f345.mm.R.id.btf);
        checkBox.setChecked(!checkBox.isChecked());
        if (checkBox.isChecked()) {
            for (int i17 = 0; i17 < activityC17486x3b418ac7.f242312t.size(); i17++) {
                activityC17486x3b418ac7.f242313u.add(java.lang.Integer.valueOf(i17));
            }
        } else {
            activityC17486x3b418ac7.f242313u.clear();
        }
        if (activityC17486x3b418ac7.f242313u.size() > 0) {
            activityC17486x3b418ac7.f242306n.setEnabled(true);
            activityC17486x3b418ac7.f242305m.setEnabled(true);
        } else {
            activityC17486x3b418ac7.f242306n.setEnabled(false);
            activityC17486x3b418ac7.f242305m.setEnabled(false);
        }
        activityC17486x3b418ac7.f242302g.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sp(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

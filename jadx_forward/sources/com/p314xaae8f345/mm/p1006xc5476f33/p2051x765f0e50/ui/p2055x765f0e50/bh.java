package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class bh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 f242406e;

    public bh(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47, java.lang.String str) {
        this.f242406e = activityC17437x244fdb47;
        this.f242405d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47.f242052u;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47 = this.f242406e;
        activityC17437x244fdb47.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList2 = activityC17437x244fdb47.f242063r;
        if (arrayList2 != null && activityC17437x244fdb47.f242064s != null && arrayList2.size() == activityC17437x244fdb47.f242064s.size()) {
            for (int i18 = 0; i18 < activityC17437x244fdb47.f242063r.size(); i18++) {
                hashMap.put((java.lang.Integer) activityC17437x244fdb47.f242063r.get(i18), (java.lang.String) activityC17437x244fdb47.f242064s.get(i18));
            }
        }
        activityC17437x244fdb47.f242062q = new k14.y(1, this.f242405d, hashMap);
        activityC17437x244fdb47.f242060o = db5.e1.Q(activityC17437x244fdb47.mo55332x76847179(), activityC17437x244fdb47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyb), activityC17437x244fdb47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gy7), false, false, null);
        gm0.j1.d().g(activityC17437x244fdb47.f242062q);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743 c6746x43f2e743 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743();
        c6746x43f2e743.p(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321.f241849r);
        c6746x43f2e743.f140772e = 6L;
        c6746x43f2e743.k();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

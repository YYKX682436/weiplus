package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321 f243310d;

    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321 activityC17413x56438321) {
        this.f243310d = activityC17413x56438321;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321 activityC17413x56438321 = this.f243310d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAliasUI", "click next, allPass %s", java.lang.Boolean.valueOf(activityC17413x56438321.f241853h));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743 c6746x43f2e743 = activityC17413x56438321.f241859q;
        c6746x43f2e743.f140772e = 1L;
        if (activityC17413x56438321.f241853h) {
            c6746x43f2e743.k();
            activityC17413x56438321.a7();
        } else {
            java.util.List list = activityC17413x56438321.f241851f;
            if (list == null || list.isEmpty()) {
                activityC17413x56438321.f241854i = true;
                activityC17413x56438321.Z6(true);
            } else {
                int i17 = 0;
                int i18 = 0;
                while (i17 < ((java.util.LinkedList) activityC17413x56438321.f241851f).size()) {
                    if (!((r45.e00) ((java.util.LinkedList) activityC17413x56438321.f241851f).get(i17)).f454422g) {
                        i18 = i17 == 0 ? i18 | 1 : i18 | 2;
                    }
                    i17++;
                }
                c6746x43f2e743.f140773f = i18;
                c6746x43f2e743.k();
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC17413x56438321, new android.content.Intent(activityC17413x56438321, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17436xe5fd0ca9.class));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

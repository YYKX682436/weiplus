package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class pc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 f242967d;

    public pc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592) {
        this.f242967d = activityC17424x53509592;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592 = this.f242967d;
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(activityC17424x53509592);
        wd0.g1 g1Var = activityC17424x53509592.f241947d;
        if (g1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finalMode");
            throw null;
        }
        ((u14.t) l1Var).fj(b17, g1Var);
        com.p314xaae8f345.p3210x3857dc.a3.D(true, ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di(), ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni(), null);
        android.content.Intent intent = new android.content.Intent(activityC17424x53509592, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f.class);
        intent.putExtra("result_code", -1);
        intent.addFlags(603979776);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x535095922 = this.f242967d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC17424x535095922, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17424x535095922.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC17424x535095922, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17424x53509592.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class yc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f f243316d;

    public yc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f activityC17426xe0b6118f) {
        this.f243316d = activityC17426xe0b6118f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f.f241957r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f activityC17426xe0b6118f = this.f243316d;
        activityC17426xe0b6118f.getClass();
        f25.m0 m0Var = activityC17426xe0b6118f.f241966o;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        activityC17426xe0b6118f.f241966o = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.s.f340644c, activityC17426xe0b6118f.f241967p);
        f25.m0 m0Var2 = activityC17426xe0b6118f.f241966o;
        boolean z17 = false;
        if (m0Var2 != null && ((g25.e) m0Var2).f349513c) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus: gain focus");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus: not gain focus");
            if (!j65.e.g()) {
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "requestAudioFocus: not gain focus but because of muteMode");
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        if (j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f.T6(activityC17426xe0b6118f);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(80, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xc(activityC17426xe0b6118f), "android.permission.RECORD_AUDIO");
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}

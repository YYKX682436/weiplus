package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class qg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a f243008d;

    public qg(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a) {
        this.f243008d = activityC17435x7d616a9a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindOtherServiceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a = this.f243008d;
        java.util.Iterator it = activityC17435x7d616a9a.f242027f.keySet().iterator();
        long j17 = 0;
        long j18 = 0;
        boolean z17 = false;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue == 3) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).h("settings_search_switch");
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_search_switch")) {
                    j17 |= 2097152;
                    if (c21541x1c1b08fe.N()) {
                        z17 = true;
                    } else {
                        j18 |= 2097152;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_search_switch " + c21541x1c1b08fe.N());
                }
            } else if (intValue == 10) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_look_switch")) {
                    j17 |= 67108864;
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).h("settings_look_switch");
                    if (c21541x1c1b08fe2.N()) {
                        z17 = true;
                    } else {
                        j18 |= 67108864;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_look_switch " + c21541x1c1b08fe2.N());
                }
            } else if (intValue == 11) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_finder_switch")) {
                    j17 |= 34359738368L;
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).h("settings_finder_switch");
                    if (c21541x1c1b08fe3.N()) {
                        z17 = true;
                    } else {
                        j18 |= 34359738368L;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_finder_switch = " + c21541x1c1b08fe3.N());
                }
            } else if (intValue == 13) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q(activityC17435x7d616a9a.f242044s)) {
                    j17 |= 9007199254740992L;
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).h(activityC17435x7d616a9a.f242044s);
                    if (c21541x1c1b08fe4.N()) {
                        z17 = true;
                    } else {
                        j18 |= 9007199254740992L;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_finder_live_switch = " + c21541x1c1b08fe4.N());
                }
            } else if (intValue == 8) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_miniprogram_switch")) {
                    j17 |= 16777216;
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).h("settings_miniprogram_switch");
                    if (c21541x1c1b08fe5.N()) {
                        z17 = true;
                    } else {
                        j18 |= 16777216;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_miniprogram_switch = " + c21541x1c1b08fe5.N());
                }
            } else if (intValue == 7 && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_game_switch")) {
                j17 |= 8388608;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe6 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).h("settings_game_switch");
                if (c21541x1c1b08fe6.N()) {
                    z17 = true;
                } else {
                    j18 |= 8388608;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, settings_game_switch = " + c21541x1c1b08fe6.N());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "finishBtn, switchValue = " + j18 + ", WhichExtFunctionSwitch = " + j17 + ", hasOpen = " + z17);
        if (z17) {
            v24.o0.k(activityC17435x7d616a9a, activityC17435x7d616a9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijp), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.og(this, j17, j18), false);
        } else {
            v24.o0.a(this.f243008d, 1, 2, j17, j18, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pg(this), false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageFindOtherServiceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

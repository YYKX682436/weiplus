package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class ng implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.og f242894a;

    public ng(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.og ogVar) {
        this.f242894a = ogVar;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.og ogVar = this.f242894a;
        if (en0Var == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, response no.");
            v24.o0.l(ogVar.f242927c.f243008d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, response yes.");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a = ogVar.f242927c.f243008d;
        activityC17435x7d616a9a.f242046u.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sg(activityC17435x7d616a9a), 1000L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qg qgVar = ogVar.f242927c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a2 = qgVar.f243008d;
        java.util.Iterator it = activityC17435x7d616a9a2.f242027f.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue != 3) {
                if (intValue != 10) {
                    if (intValue != 11) {
                        if (intValue != 7) {
                            if (intValue != 13) {
                                if (intValue == 8 && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).q("settings_miniprogram_switch") && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).h("settings_miniprogram_switch")).N()) {
                                    z18 = true;
                                    break;
                                }
                            } else {
                                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).q(activityC17435x7d616a9a2.f242044s)) {
                                    if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).h(activityC17435x7d616a9a2.f242044s)).N()) {
                                        z18 = true;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).q("settings_game_switch") && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).h("settings_game_switch")).N()) {
                            z18 = true;
                            break;
                        }
                    } else if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).q("settings_finder_switch") && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).h("settings_finder_switch")).N()) {
                        z18 = true;
                        break;
                    }
                } else if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).q("settings_look_switch") && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).h("settings_look_switch")).N()) {
                    z18 = true;
                    break;
                }
            } else if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).q("settings_search_switch") && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a2.m79336x8b97809d()).h("settings_search_switch")).N()) {
                z18 = true;
                break;
            }
        }
        z18 = false;
        if (z18) {
            qgVar.f243008d.f242046u.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mg(this), 500L);
        }
    }
}

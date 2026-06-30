package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class kg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lg f242772d;

    public kg(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lg lgVar) {
        this.f242772d = lgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a = this.f242772d.f242828d;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a.f242042w;
        activityC17435x7d616a9a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave.");
        java.util.Iterator it = activityC17435x7d616a9a.f242027f.keySet().iterator();
        long j18 = 0;
        long j19 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue == 3) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_search_switch")) {
                    j17 = 2097152;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 10) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_look_switch")) {
                    j17 = 67108864;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 11) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_finder_switch")) {
                    j17 = 34359738368L;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 13) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q(activityC17435x7d616a9a.f242044s)) {
                    j17 = 9007199254740992L;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 8) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_miniprogram_switch")) {
                    j17 = 16777216;
                    j18 |= j17;
                    j19 |= j17;
                }
            } else if (intValue == 7 && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17435x7d616a9a.m79336x8b97809d()).q("settings_game_switch")) {
                j17 = 8388608;
                j18 |= j17;
                j19 |= j17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. switchValue = " + j19 + ", WhichExtFunctionSwitch= " + j18);
        v24.o0.a(activityC17435x7d616a9a, 1, 2, j18, j19, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rg(activityC17435x7d616a9a), false);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class pg implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qg f242976a;

    public pg(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qg qgVar) {
        this.f242976a = qgVar;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qg qgVar = this.f242976a;
        if (en0Var == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = no");
            qgVar.f243008d.finish();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = yes");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a = qgVar.f243008d;
            activityC17435x7d616a9a.f242046u.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sg(activityC17435x7d616a9a), 1000L);
        }
    }
}

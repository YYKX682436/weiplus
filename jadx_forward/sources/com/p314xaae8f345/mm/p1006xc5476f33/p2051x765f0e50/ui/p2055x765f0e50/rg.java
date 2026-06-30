package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class rg implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a f243043a;

    public rg(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a) {
        this.f243043a = activityC17435x7d616a9a;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a activityC17435x7d616a9a = this.f243043a;
        if (en0Var == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = no");
            activityC17435x7d616a9a.finish();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = yes");
            activityC17435x7d616a9a.f242046u.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sg(activityC17435x7d616a9a), 1000L);
        }
    }
}

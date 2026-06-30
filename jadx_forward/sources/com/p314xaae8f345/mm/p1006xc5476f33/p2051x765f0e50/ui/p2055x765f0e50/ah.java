package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class ah implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f242369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 f242370e;

    public ah(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47, int i17) {
        this.f242370e = activityC17437x244fdb47;
        this.f242369d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47 = this.f242370e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC17437x244fdb47.f242053e.getHeight());
        int i17 = this.f242369d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyAliasUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (activityC17437x244fdb47.f242053e.getHeight() > i17) {
            activityC17437x244fdb47.f242059n.scrollBy(0, activityC17437x244fdb47.f242053e.getHeight() - i17);
        }
    }
}

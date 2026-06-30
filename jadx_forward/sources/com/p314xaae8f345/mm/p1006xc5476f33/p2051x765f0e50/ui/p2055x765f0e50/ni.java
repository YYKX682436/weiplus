package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class ni implements xg3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c f242895a;

    public ni(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c activityC17441xe7fa79c) {
        this.f242895a = activityC17441xe7fa79c;
    }

    @Override // xg3.n0
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsModifyNameUI", "updateChatBotRemarkName op ret :" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c activityC17441xe7fa79c = this.f242895a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC17441xe7fa79c.f242080e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC17441xe7fa79c.finish();
    }
}

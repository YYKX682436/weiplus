package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class km extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea f242777a;

    public km(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea) {
        this.f242777a = activityC17463xb337a9ea;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "onReceive %s", intent.getAction());
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea = this.f242777a;
        activityC17463xb337a9ea.unregisterReceiver(activityC17463xb337a9ea.f242233w);
        java.lang.String action = intent.getAction();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (action == null) {
            action = "";
        }
        if (action.equals("action_kill_mm_process")) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
            gm0.j1.b();
            gm0.m.o();
            gm0.j1.i().l("switch account ,delay logout");
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
            if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
                com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
            activityC17463xb337a9ea.finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6144xb4040e42().e();
        }
    }
}

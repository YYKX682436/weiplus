package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes12.dex */
public class o7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f155621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d f155622e;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f155622e = activityC11438x77a05b9d;
        this.f155621d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String valueOf;
        android.content.Intent intent;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginUI", "onSceneEnd, in runnable start Launcher");
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = this.f155622e;
        android.content.Intent b17 = y7Var.b(activityC11438x77a05b9d);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = (com.p314xaae8f345.mm.p957x53236a1b.v0) this.f155621d;
        b17.putExtra("kstyle_show_bind_mobile_afterauth", v0Var.O());
        b17.putExtra("kstyle_bind_wording", v0Var.Q());
        b17.putExtra("kstyle_bind_recommend_show", v0Var.P());
        x11.d0 d0Var = x11.f0.f532892m;
        try {
            if (w11.a1.b()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d2 = activityC11438x77a05b9d instanceof android.app.Activity ? activityC11438x77a05b9d : null;
                android.content.Intent intent2 = activityC11438x77a05b9d2 != null ? activityC11438x77a05b9d2.getIntent() : null;
                long longExtra = intent2 != null ? intent2.getLongExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME", 0L) : 0L;
                if (intent2 != null) {
                    intent2.removeExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME");
                }
                if (longExtra != 0) {
                    valueOf = java.lang.String.valueOf(longExtra);
                    d0Var.c(valueOf, longExtra);
                } else {
                    valueOf = java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime());
                }
                b17.putExtra("KEY_NEWINIT_LOGIN_IN_SESSION_ID", valueOf);
                int a17 = d0Var.a();
                long b18 = d0Var.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "recordJumpLauncher() called sessionId:" + valueOf + " cpuCoreNum:" + a17 + " memorySize:" + b18);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55 c6790x79ba4f55 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55();
                c6790x79ba4f55.f141220d = c6790x79ba4f55.b("reversion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
                c6790x79ba4f55.f141233q = c6790x79ba4f55.b("sessionid", valueOf, true);
                c6790x79ba4f55.f141234r = (long) a17;
                c6790x79ba4f55.f141235s = b18;
                x11.e0[] e0VarArr = x11.e0.f532890d;
                c6790x79ba4f55.f141232p = 3;
                x11.b0.f532883a.a(c6790x79ba4f55, null);
                c6790x79ba4f55.k();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d3 = activityC11438x77a05b9d instanceof android.app.Activity ? activityC11438x77a05b9d : null;
                if (activityC11438x77a05b9d3 != null && (intent = activityC11438x77a05b9d3.getIntent()) != null) {
                    intent.removeExtra("KEY_NEWINIT_LOGIN_IN_CLICK_AUTH_TIME");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "recordJumpLauncher() not need init");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d4 = this.f155622e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11438x77a05b9d4, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginUI$20", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11438x77a05b9d4.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11438x77a05b9d4, "com/tencent/mm/plugin/account/ui/LoginUI$20", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11438x77a05b9d.finish();
    }
}

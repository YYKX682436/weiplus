package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f290604d = 2000;

    public l8(com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this);
        if (c01.d9.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck done uin[%d]", java.lang.Integer.valueOf(gm0.j1.b().h()));
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
        if (z17 || z65.c.f551988a) {
            long j17 = this.f290604d + 2000;
            this.f290604d = j17;
            if (j17 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                this.f290604d = 2000L;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck isAppOnForeground[%b] foreground[%b] trigger next [%d]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z65.c.f551988a), java.lang.Long.valueOf(this.f290604d));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this, this.f290604d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit!!!");
        if (com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45967x2c52560f()) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.k8(this), "terminateApp");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit app done");
    }
}

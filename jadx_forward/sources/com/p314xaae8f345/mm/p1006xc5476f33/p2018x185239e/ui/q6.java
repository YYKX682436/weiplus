package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class q6 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 f239433d;

    public q6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 activityC17134x89ac8704, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j6 j6Var) {
        this.f239433d = activityC17134x89ac8704;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 activityC17134x89ac8704 = this.f239433d;
        if (activityC17134x89ac8704.D) {
            return true;
        }
        activityC17134x89ac8704.E = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "do get dynamic code %s", activityC17134x89ac8704.f238931n);
        activityC17134x89ac8704.D = true;
        activityC17134x89ac8704.m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v(activityC17134x89ac8704.f238925e, activityC17134x89ac8704.f238926f, activityC17134x89ac8704.f238927g, activityC17134x89ac8704.f238928h, activityC17134x89ac8704.f238929i, activityC17134x89ac8704.f238930m, activityC17134x89ac8704.f238931n, activityC17134x89ac8704.f238932o, activityC17134x89ac8704.f238933p), false);
        return true;
    }
}

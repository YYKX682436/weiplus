package aq1;

/* loaded from: classes11.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq1.q0 f94591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f94592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f94593f;

    public k0(aq1.q0 q0Var, long j17, long j18) {
        this.f94591d = q0Var;
        this.f94592e = j17;
        this.f94593f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aq1.q0 q0Var = this.f94591d;
        q0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("voip-invite-");
        long j17 = this.f94592e;
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.api.C19576x6601f2ed a17 = q0Var.Bi().f(sb7) ? com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.api.C19576x6601f2ed.a(q0Var.Bi().j(sb7)) : null;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect miss voipInviteInfo: " + j17);
            return;
        }
        if (a17.f270155e == j17) {
            java.util.Map map = (java.util.Map) q0Var.f94613e.mo141623x754a37bb();
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(a17.f270156f);
            long j18 = this.f94593f;
            map.put(valueOf, new jz5.l(valueOf2, java.lang.Long.valueOf(j18)));
            long j19 = j18 - a17.f270156f;
            if (j19 >= 5000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect slow: slowMs=" + j19);
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = java.lang.String.valueOf(j19);
                strArr[1] = java.lang.String.valueOf(a17.f270155e);
                strArr[2] = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Ri() ? "1" : "0";
                ap.a.a(1, "voipInviteSlow", null, null, strArr);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect clear last voipInviteInfo: " + a17.f270155e);
        q0Var.Bi().remove("voip-invite-" + j17);
    }
}

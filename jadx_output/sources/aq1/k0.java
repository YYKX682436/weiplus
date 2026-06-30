package aq1;

/* loaded from: classes11.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq1.q0 f13058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f13060f;

    public k0(aq1.q0 q0Var, long j17, long j18) {
        this.f13058d = q0Var;
        this.f13059e = j17;
        this.f13060f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aq1.q0 q0Var = this.f13058d;
        q0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("voip-invite-");
        long j17 = this.f13059e;
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo a17 = q0Var.Bi().f(sb7) ? com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo.a(q0Var.Bi().j(sb7)) : null;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect miss voipInviteInfo: " + j17);
            return;
        }
        if (a17.f188622e == j17) {
            java.util.Map map = (java.util.Map) q0Var.f13080e.getValue();
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(a17.f188623f);
            long j18 = this.f13060f;
            map.put(valueOf, new jz5.l(valueOf2, java.lang.Long.valueOf(j18)));
            long j19 = j18 - a17.f188623f;
            if (j19 >= 5000) {
                com.tencent.mars.xlog.Log.w("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect slow: slowMs=" + j19);
                java.lang.String[] strArr = new java.lang.String[3];
                strArr[0] = java.lang.String.valueOf(j19);
                strArr[1] = java.lang.String.valueOf(a17.f188622e);
                strArr[2] = ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Ri() ? "1" : "0";
                ap.a.a(1, "voipInviteSlow", null, null, strArr);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.LightPushServiceImpl", "voipInviteInspect clear last voipInviteInfo: " + a17.f188622e);
        q0Var.Bi().remove("voip-invite-" + j17);
    }
}

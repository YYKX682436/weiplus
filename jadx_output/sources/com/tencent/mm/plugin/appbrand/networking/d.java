package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public abstract class d extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public long f86081m;

    /* renamed from: n, reason: collision with root package name */
    public long f86082n;

    public r45.y50 A() {
        return null;
    }

    public java.lang.String B() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        java.lang.String appId = y();
        kotlin.jvm.internal.o.g(appId, "appId");
        try {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(appId, true);
            str = b17 != null ? b17.f88134d : null;
        } catch (java.lang.IllegalStateException unused) {
        }
        return str == null ? "" : str;
    }

    public java.lang.String C() {
        return "";
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiWithSpeedReport", "run() url:" + this.f70646f.f70712c + ", cmdid:" + this.f70646f.f70713d);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f86081m = java.lang.System.currentTimeMillis();
        this.f86082n = android.os.SystemClock.elapsedRealtime();
        pq5.g u17 = u();
        if (u17 != null) {
            return u17;
        }
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }

    public final void s(r45.y50 y50Var) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            kotlin.jvm.internal.o.d(y50Var);
        }
    }

    public com.tencent.mm.modelbase.f t() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f86081m = java.lang.System.currentTimeMillis();
        this.f86082n = android.os.SystemClock.elapsedRealtime();
        return com.tencent.mm.modelbase.l3.a(this);
    }

    public pq5.g u() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        if (fVar instanceof r45.xc7) {
            s(((r45.xc7) fVar).f389987i);
            return null;
        }
        if (fVar instanceof r45.u54) {
            s(((r45.u54) fVar).f387071w);
            return null;
        }
        if (fVar instanceof r45.zd7) {
            s(((r45.zd7) fVar).f391946e);
            return null;
        }
        if (fVar instanceof r45.os3) {
            s(((r45.os3) fVar).f382495v);
            return null;
        }
        if (!(fVar instanceof r45.jf)) {
            return null;
        }
        s(((r45.jf) fVar).f377777f);
        return null;
    }

    @Override // com.tencent.mm.modelbase.i
    public void x(int i17, int i18, java.lang.String str, r45.js5 js5Var, com.tencent.mm.modelbase.m1 m1Var) {
        long j17;
        long j18;
        long j19;
        com.tencent.mm.network.v0 reqResp;
        o45.ah respObj;
        r45.xw profile = (m1Var == null || (reqResp = m1Var.getReqResp()) == null || (respObj = reqResp.getRespObj()) == null) ? null : respObj.getProfile();
        if (m1Var != null) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.networking.c(this, js5Var, i18, m1Var, profile, i17));
        }
        if (profile != null) {
            com.tencent.mm.network.v0 reqResp2 = m1Var.getReqResp();
            com.tencent.mm.modelbase.o oVar = reqResp2 instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp2 : null;
            int cmdId = oVar != null ? oVar.f70713d : m1Var.getReqResp().getReqObj().getCmdId();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                com.tencent.mm.plugin.appbrand.networking.b.f86072a.a(profile);
                long j27 = profile.f390549s;
                if (j27 == 2) {
                    j18 = profile.f390544n;
                    j19 = profile.f390537d;
                } else {
                    if (j27 != 1) {
                        j17 = 0;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiWithSpeedReport", "report profile, url:" + m1Var.getReqResp().getUri() + ", cmdid:" + cmdId + ", businessCgiSendTime:" + this.f86081m + ", businessCgiFinishTime:" + currentTimeMillis + ", businessCgiCostTime:" + (currentTimeMillis - this.f86081m) + ", profile: profileCostTime:" + j17 + ", NetSceneDispatchTime:" + m1Var.getLastDispatchTimestamp() + ", startConnectTime:" + profile.f390537d + ", connectSuccessfulTime:" + profile.f390538e + ", startHandshakeTime:" + profile.f390539f + ", handshakeSuccessfulTime:" + profile.f390540g + ", startSendPacketTime:" + profile.f390541h + ", startReadPacketTime:" + profile.f390543m + ", readPacketFinishedTime:" + profile.f390544n + ", taskStartTime:" + profile.f390547q + ", rtt:" + profile.f390548r + ", channelType:" + profile.f390549s);
                    }
                    j18 = profile.f390544n;
                    j19 = profile.f390547q;
                }
                j17 = j18 - j19;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCgiWithSpeedReport", "report profile, url:" + m1Var.getReqResp().getUri() + ", cmdid:" + cmdId + ", businessCgiSendTime:" + this.f86081m + ", businessCgiFinishTime:" + currentTimeMillis + ", businessCgiCostTime:" + (currentTimeMillis - this.f86081m) + ", profile: profileCostTime:" + j17 + ", NetSceneDispatchTime:" + m1Var.getLastDispatchTimestamp() + ", startConnectTime:" + profile.f390537d + ", connectSuccessfulTime:" + profile.f390538e + ", startHandshakeTime:" + profile.f390539f + ", handshakeSuccessfulTime:" + profile.f390540g + ", startSendPacketTime:" + profile.f390541h + ", startReadPacketTime:" + profile.f390543m + ", readPacketFinishedTime:" + profile.f390544n + ", taskStartTime:" + profile.f390547q + ", rtt:" + profile.f390548r + ", channelType:" + profile.f390549s);
            } catch (iz5.b unused) {
            }
        }
    }

    public java.lang.String y() {
        return "";
    }
}

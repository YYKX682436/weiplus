package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public abstract class d extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public long f167614m;

    /* renamed from: n, reason: collision with root package name */
    public long f167615n;

    public r45.y50 A() {
        return null;
    }

    public java.lang.String B() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a;
        java.lang.String appId = y();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(appId, true);
            str = b17 != null ? b17.f169667d : null;
        } catch (java.lang.IllegalStateException unused) {
        }
        return str == null ? "" : str;
    }

    public java.lang.String C() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCgiWithSpeedReport", "run() url:" + this.f152179f.f152245c + ", cmdid:" + this.f152179f.f152246d);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f167614m = java.lang.System.currentTimeMillis();
        this.f167615n = android.os.SystemClock.elapsedRealtime();
        pq5.g u17 = u();
        if (u17 != null) {
            return u17;
        }
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }

    public final void s(r45.y50 y50Var) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y50Var);
        }
    }

    public com.p314xaae8f345.mm.p944x882e457a.f t() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f167614m = java.lang.System.currentTimeMillis();
        this.f167615n = android.os.SystemClock.elapsedRealtime();
        return com.p314xaae8f345.mm.p944x882e457a.l3.a(this);
    }

    public pq5.g u() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152243a.f152217a;
        if (fVar instanceof r45.xc7) {
            s(((r45.xc7) fVar).f471520i);
            return null;
        }
        if (fVar instanceof r45.u54) {
            s(((r45.u54) fVar).f468604w);
            return null;
        }
        if (fVar instanceof r45.zd7) {
            s(((r45.zd7) fVar).f473479e);
            return null;
        }
        if (fVar instanceof r45.os3) {
            s(((r45.os3) fVar).f464028v);
            return null;
        }
        if (!(fVar instanceof r45.jf)) {
            return null;
        }
        s(((r45.jf) fVar).f459310f);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public void x(int i17, int i18, java.lang.String str, r45.js5 js5Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        long j17;
        long j18;
        long j19;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558;
        o45.ah mo13821x7f35c2d1;
        r45.xw m150576x2b5bc573 = (m1Var == null || (mo47948x7f0c4558 = m1Var.mo47948x7f0c4558()) == null || (mo13821x7f35c2d1 = mo47948x7f0c4558.mo13821x7f35c2d1()) == null) ? null : mo13821x7f35c2d1.m150576x2b5bc573();
        if (m1Var != null) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c(this, js5Var, i18, m1Var, m150576x2b5bc573, i17));
        }
        if (m150576x2b5bc573 != null) {
            com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c45582 = m1Var.mo47948x7f0c4558();
            com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c45582 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c45582 : null;
            int mo13850x7443ca3f = oVar != null ? oVar.f152246d : m1Var.mo47948x7f0c4558().mo47979x2d63726f().mo13850x7443ca3f();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.b.f167605a.a(m150576x2b5bc573);
                long j27 = m150576x2b5bc573.f472082s;
                if (j27 == 2) {
                    j18 = m150576x2b5bc573.f472077n;
                    j19 = m150576x2b5bc573.f472070d;
                } else {
                    if (j27 != 1) {
                        j17 = 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCgiWithSpeedReport", "report profile, url:" + m1Var.mo47948x7f0c4558().mo13823xb5887636() + ", cmdid:" + mo13850x7443ca3f + ", businessCgiSendTime:" + this.f167614m + ", businessCgiFinishTime:" + currentTimeMillis + ", businessCgiCostTime:" + (currentTimeMillis - this.f167614m) + ", profile: profileCostTime:" + j17 + ", NetSceneDispatchTime:" + m1Var.m47999xdfdcac10() + ", startConnectTime:" + m150576x2b5bc573.f472070d + ", connectSuccessfulTime:" + m150576x2b5bc573.f472071e + ", startHandshakeTime:" + m150576x2b5bc573.f472072f + ", handshakeSuccessfulTime:" + m150576x2b5bc573.f472073g + ", startSendPacketTime:" + m150576x2b5bc573.f472074h + ", startReadPacketTime:" + m150576x2b5bc573.f472076m + ", readPacketFinishedTime:" + m150576x2b5bc573.f472077n + ", taskStartTime:" + m150576x2b5bc573.f472080q + ", rtt:" + m150576x2b5bc573.f472081r + ", channelType:" + m150576x2b5bc573.f472082s);
                    }
                    j18 = m150576x2b5bc573.f472077n;
                    j19 = m150576x2b5bc573.f472080q;
                }
                j17 = j18 - j19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCgiWithSpeedReport", "report profile, url:" + m1Var.mo47948x7f0c4558().mo13823xb5887636() + ", cmdid:" + mo13850x7443ca3f + ", businessCgiSendTime:" + this.f167614m + ", businessCgiFinishTime:" + currentTimeMillis + ", businessCgiCostTime:" + (currentTimeMillis - this.f167614m) + ", profile: profileCostTime:" + j17 + ", NetSceneDispatchTime:" + m1Var.m47999xdfdcac10() + ", startConnectTime:" + m150576x2b5bc573.f472070d + ", connectSuccessfulTime:" + m150576x2b5bc573.f472071e + ", startHandshakeTime:" + m150576x2b5bc573.f472072f + ", handshakeSuccessfulTime:" + m150576x2b5bc573.f472073g + ", startSendPacketTime:" + m150576x2b5bc573.f472074h + ", startReadPacketTime:" + m150576x2b5bc573.f472076m + ", readPacketFinishedTime:" + m150576x2b5bc573.f472077n + ", taskStartTime:" + m150576x2b5bc573.f472080q + ", rtt:" + m150576x2b5bc573.f472081r + ", channelType:" + m150576x2b5bc573.f472082s);
            } catch (iz5.b unused) {
            }
        }
    }

    public java.lang.String y() {
        return "";
    }
}

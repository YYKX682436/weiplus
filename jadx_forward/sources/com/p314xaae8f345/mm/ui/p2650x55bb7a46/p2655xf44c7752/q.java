package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public final class q implements fk4.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282811a;

    /* renamed from: b, reason: collision with root package name */
    public t21.v2 f282812b;

    /* renamed from: c, reason: collision with root package name */
    public final ok4.c f282813c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f282814d;

    /* renamed from: e, reason: collision with root package name */
    public final dn.o f282815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f282816f;

    /* renamed from: g, reason: collision with root package name */
    public final int f282817g;

    /* renamed from: h, reason: collision with root package name */
    public final int f282818h;

    /* renamed from: i, reason: collision with root package name */
    public final int f282819i;

    /* renamed from: j, reason: collision with root package name */
    public int f282820j;

    public q(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, t21.v2 videoInfo, ok4.c reporter, yz5.l onGotTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGotTask, "onGotTask");
        this.f282811a = msg;
        this.f282812b = videoInfo;
        this.f282813c = reporter;
        this.f282814d = onGotTask;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoDownloadTask", "create c2c online task: filename=" + msg.z0());
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        dn.o j17 = t21.o2.Di().j(msg.z0(), true);
        if (j17 == null && msg.M2()) {
            j17 = new dn.o();
            j17.f323318d = "task_OnlineVideoUIHelper";
            t21.v2 v2Var = this.f282812b;
            j17.f69601xaca5bdda = com.p314xaae8f345.mm.p947xba6de98f.i2.b("downvideo", v2Var.f496545j, v2Var.h(), this.f282812b.d());
            t21.v2 v2Var2 = this.f282812b;
            j17.M1 = v2Var2.E.f468866d;
            j17.H1 = 1;
            j17.Z = 7;
            j17.f323342y0 = 4;
            j17.E1 = v2Var2.d();
            j17.f69595x6d25b0d9 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(msg, bm5.f0.f104104s, this.f282812b.d(), true);
            j17.G1 = this.f282812b.f496541f;
        }
        this.f282815e = j17;
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidOnlineVideoArgs");
        boolean z17 = false;
        if (!(d17 == null || d17.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoDownloadTask", "online video config : " + d17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            java.lang.String[] strArr = (java.lang.String[]) new r26.t(";").g(d17, 0).toArray(new java.lang.String[0]);
            if (strArr.length >= 4) {
                this.f282817g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[0], 5);
                this.f282818h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[1], 1);
                this.f282820j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 75);
                this.f282819i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[3], 1) * 1048576;
                z17 = true;
            }
        }
        if (!z17) {
            this.f282817g = 5;
            this.f282818h = 1;
            this.f282820j = 75;
            this.f282819i = 1048576;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoDownloadTask", "parseConfig preload[%d] downloadSec[%d], needFinish[%d], minStreamSize[%d]", java.lang.Integer.valueOf(this.f282817g), java.lang.Integer.valueOf(this.f282818h), java.lang.Integer.valueOf(this.f282820j), java.lang.Integer.valueOf(this.f282819i));
    }

    @Override // fk4.p
    public void a() {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String e17 = e();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(e17);
        if (h17 != null) {
            this.f282812b = h17;
        }
    }

    @Override // fk4.p
    public java.lang.Long c() {
        return java.lang.Long.valueOf(this.f282811a.m124847x74d37ac6());
    }

    @Override // fk4.p
    public int d() {
        return this.f282820j;
    }

    @Override // fk4.p
    public java.lang.String e() {
        dn.o oVar = this.f282815e;
        if (oVar != null) {
            return oVar.E1;
        }
        return null;
    }

    @Override // fk4.p
    public void f(int i17) {
        dn.o oVar = this.f282815e;
        if (oVar == null) {
            return;
        }
        oVar.H1 = i17;
    }

    @Override // fk4.p
    public boolean g() {
        return false;
    }

    @Override // fk4.p
    /* renamed from: getLength */
    public long mo79594x23255ddc() {
        return this.f282815e != null ? r0.G1 : this.f282812b.f496548m;
    }

    @Override // fk4.p
    public boolean h() {
        return this.f282816f;
    }

    @Override // fk4.p
    public java.lang.String i() {
        dn.o oVar = this.f282815e;
        if (oVar != null) {
            return oVar.f69601xaca5bdda;
        }
        return null;
    }

    @Override // fk4.p
    /* renamed from: isFinished */
    public boolean mo79595xa89067bc() {
        return this.f282812b.i() || this.f282812b.f496544i == 123;
    }

    @Override // fk4.p
    public java.lang.String j() {
        return ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).Zi(this.f282811a);
    }

    @Override // fk4.p
    public java.lang.String k() {
        return null;
    }

    @Override // fk4.p
    public void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoDownloadTask", "finishRemaining()");
        dn.o oVar = this.f282815e;
        t21.d3.J(oVar != null ? oVar.E1 : null, 2);
    }

    @Override // fk4.p
    /* renamed from: start */
    public boolean mo79596x68ac462() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoDownloadTask", "start task: path=" + j());
        boolean aj6 = ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).aj();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282811a;
        if (aj6) {
            if (f9Var.A0() == 1 && !f9Var.M2() && !f9Var.z2() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f282812b.L)) {
                return false;
            }
        } else if (f9Var.A0() == 1 && !f9Var.M2() && !f9Var.z2()) {
            return false;
        }
        dn.o oVar = this.f282815e;
        if (oVar == null) {
            return false;
        }
        if (oVar != null) {
            this.f282814d.mo146xb9724478(oVar);
        }
        java.lang.String i17 = i();
        if (i17 == null || i17.length() == 0) {
            return false;
        }
        long j17 = this.f282812b.f496541f;
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoDownloadTask", "video size[" + j17 + "] less than config size[0], do not stream video");
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            t21.v2 v2Var = this.f282812b;
            ((vf0.y1) x1Var).getClass();
            t21.d3.F(v2Var, 9);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 17L, 1L, false);
            return false;
        }
        this.f282816f = true;
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.M(f9Var);
        boolean i18 = t21.o2.Zi().i();
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().e(oVar, i18);
        wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
        t21.v2 v2Var2 = this.f282812b;
        ((vf0.y1) x1Var2).getClass();
        t21.d3.F(v2Var2, 1);
        return true;
    }

    @Override // fk4.p
    /* renamed from: stop */
    public void mo79597x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoDownloadTask", "stop()");
        this.f282816f = false;
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
        java.lang.String i17 = i();
        ok4.b v17 = this.f282813c.v();
        Di.g(i17, new java.lang.Integer[]{java.lang.Integer.valueOf(v17.f427499a), java.lang.Integer.valueOf(v17.f427500b), java.lang.Integer.valueOf(v17.f427501c), java.lang.Integer.valueOf(v17.f427502d), java.lang.Integer.valueOf(v17.f427503e), java.lang.Integer.valueOf(v17.f427504f), java.lang.Integer.valueOf(v17.f427505g)});
    }
}

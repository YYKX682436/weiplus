package ly3;

/* loaded from: classes13.dex */
public final class l implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f403797n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f403798o;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f403799d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f403801f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f403805m;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f403800e = "";

    /* renamed from: g, reason: collision with root package name */
    public final ky3.a f403802g = new ky3.a();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f403803h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f403804i = new java.util.concurrent.locks.ReentrantLock();

    static {
        java.lang.String str = ly3.g.f403787a;
        f403797n = "wechat_rtos_service";
        f403798o = ly3.g.f403787a;
    }

    public l(boolean z17) {
        this.f403799d = z17;
    }

    public final void a() {
        java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("patch_id", ""));
        this.f403800e = valueOf;
        ly3.m mVar = ly3.m.f403806a;
        java.lang.String str = f403797n;
        java.lang.String a17 = mVar.a(str, valueOf);
        java.lang.String str2 = mVar.b(str, this.f403800e) + "config.json";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkLocalResource patchId:" + this.f403800e + ", so:" + a17 + ", config:" + str2);
        ((ku5.t0) ku5.t0.f394148d).g(new ly3.j(a17, str2, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskFailed taskId:" + j17 + ", errCode" + i17);
            e(-4);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskFinished taskId:" + j17 + ", savedFilePath" + str);
            ((ku5.t0) ku5.t0.f394148d).g(new ly3.k(this, str));
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdateFail");
        if (this.f403799d) {
            g(-1);
        } else {
            a();
        }
    }

    public final void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "downloadFail. errorCode:" + i17);
        if (this.f403799d) {
            g(i17);
        } else {
            a();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskMd5Checking taskId:" + j17);
        }
    }

    public final void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onCheckCallback errorCode:%d", java.lang.Integer.valueOf(i17));
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f403804i;
        reentrantLock.lock();
        gm0.j1.d().q(3899, this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this);
        ky3.a aVar = this.f403802g;
        aVar.f395145h = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "report " + aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26515, java.lang.Integer.valueOf(aVar.f395138a), aVar.f395139b, java.lang.Integer.valueOf(aVar.f395140c), java.lang.Integer.valueOf(aVar.f395141d), java.lang.Integer.valueOf(aVar.f395142e), java.lang.Integer.valueOf(aVar.f395143f), aVar.f395144g, java.lang.Integer.valueOf(aVar.f395145h), aVar.f395146i);
        java.util.ArrayList arrayList = this.f403803h;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onSoResCheck errCode " + i17);
            my3.q qVar = ((my3.i) ((fy3.h) next)).f414340a;
            if (i17 == 0) {
                fy3.f fVar = qVar.f414366s;
                if (fVar != null) {
                    ((oy3.t) fVar).a(true);
                }
                my3.q.Di(qVar, qVar.f414371x);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosServiceImpl", "onSoResCheck Fail");
                qVar.Ri(fy3.i.f348779e);
                fy3.f fVar2 = qVar.f414366s;
                if (fVar2 != null) {
                    ((oy3.t) fVar2).a(false);
                }
            }
        }
        arrayList.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "isChecking = false");
        this.f403805m = false;
        reentrantLock.unlock();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskProgressChanged taskId:" + j17 + " recvLen:" + j18 + " totalLen:" + j19);
            int i17 = (int) ((j18 * ((long) 100)) / j19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onCheckCallback process:%d", java.lang.Integer.valueOf(i17));
            java.util.Iterator it = this.f403803h.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "so download progress " + i17);
                fy3.f fVar = ((my3.i) ((fy3.h) next)).f414340a.f414366s;
                if (fVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "so download progress " + i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = ((oy3.t) fVar).f431577a;
                    activityC17256xc70b42d4.D.mo77785xc570fb34(new oy3.s(activityC17256xc70b42d4, i17));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskResumed taskId:" + j17);
        }
    }

    public final void j(fy3.h hVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f403804i;
        reentrantLock.lock();
        if (this.f403805m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "isChecking ignore add listener and check remote update.");
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(this);
            gm0.j1.d().a(3899, this);
            this.f403800e = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("patch_id", ""));
            ky3.a aVar = this.f403802g;
            aVar.getClass();
            java.lang.String str = f403798o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            aVar.f395139b = str;
            java.lang.String str2 = this.f403800e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            aVar.f395146i = str2;
            boolean z17 = this.f403799d;
            aVar.f395138a = !z17 ? 1 : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdate baseId:" + str + " patchId:" + this.f403800e + " scene:" + aVar.f395138a);
            xv.g0 g0Var = (xv.g0) i95.n0.c(xv.g0.class);
            java.lang.String str3 = this.f403800e;
            ((wv.a) g0Var).getClass();
            gm0.j1.d().g(new ly3.f(str, str3, z17));
            if (hVar != null) {
                this.f403803h.add(hVar);
            }
            this.f403805m = true;
        }
        reentrantLock.unlock();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskPaused taskId:" + j17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskStarted taskId:" + j17 + ", savedFilePath" + str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        java.lang.Long l17 = this.f403801f;
        if (l17 != null && l17.longValue() == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskRemoved taskId:" + j17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String Url;
        if (!(m1Var instanceof ly3.e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "ignore other check scene");
            return;
        }
        ky3.a aVar = this.f403802g;
        aVar.f395140c = i17;
        aVar.f395141d = i18;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "check fail");
            d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "check so cgi success");
        r45.g35 g35Var = (r45.g35) ((ly3.f) ((ly3.e) m1Var)).f552100d.f152244b.f152233a;
        r45.j35 j35Var = g35Var.f456386d;
        aVar.f395143f = g35Var.f456391i;
        java.lang.String str2 = str == null ? "" : str;
        aVar.getClass();
        aVar.f395144g = str2;
        if (j35Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "check error code:" + g35Var.f456391i + ", error msg:" + str);
            d();
            return;
        }
        int i19 = j35Var.f459067e;
        aVar.f395142e = i19;
        if (i19 != 1) {
            if (i19 == 2) {
                r45.bs5 bs5Var = j35Var.f459071i;
                if (bs5Var == null || (Url = bs5Var.f452560f) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "node url is null.");
                    d();
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
                java.lang.String MD5 = j35Var.f459071i.f452558d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MD5, "MD5");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdateSuccessAndStartDownload and start download:".concat(Url));
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
                t0Var.f178683a = Url;
                ly3.m mVar = ly3.m.f403806a;
                java.lang.String soName = f403797n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soName, "soName");
                t0Var.f178686d = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + soName + ".so";
                t0Var.f178687e = MD5;
                t0Var.f178691i = false;
                t0Var.f178693k = true;
                t0Var.f178688f = 2;
                t0Var.f178692j = false;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                this.f403801f = java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var));
                return;
            }
            if (i19 != 3 && i19 != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "unknown state: " + j35Var.f459067e);
                d();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.SoResCheckProcessor", "node state: " + j35Var.f459067e);
        d();
    }
}

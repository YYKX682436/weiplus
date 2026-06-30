package rh;

/* loaded from: classes12.dex */
public final class w extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public int f477058b = 1024;

    /* renamed from: c, reason: collision with root package name */
    public int f477059c = 1024;

    /* renamed from: d, reason: collision with root package name */
    public int f477060d = 100;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f477061e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f477062f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f477063g = new rh.n(this);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k f477064h = new rh.o(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k f477065i = new rh.p(this);

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        int e17 = wh.m.e(this.f476827a.d(), z17);
        wh.k kVar = (wh.k) wh.m.t();
        synchronized (kVar) {
            kVar.f527351c = new wh.h(java.lang.Integer.valueOf(e17), 5000);
        }
        m(e17);
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "updateAppImportance when app ".concat(z17 ? "foreground" : "background"), new java.lang.Object[0]);
        n();
    }

    @Override // rh.e3
    public int b() {
        return Integer.MAX_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        java.lang.String str;
        super.c();
        wh.f2 f2Var = new wh.f2(java.lang.String.valueOf(1));
        qh.f0 f0Var = this.f476827a;
        f0Var.getClass();
        try {
            str = (java.lang.String) f0Var.f444873i.call();
        } catch (java.lang.Exception unused) {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        wh.f2 f2Var2 = new wh.f2(str);
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f477061e = arrayList;
            arrayList.add(0, f2Var);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.f477062f = arrayList2;
            arrayList2.add(0, f2Var2);
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495.mo40966xc74540ab(this.f477064h);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495.mo40966xc74540ab(this.f477065i);
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495.mo40970xb5bdeb7a(this.f477064h);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495.mo40970xb5bdeb7a(this.f477065i);
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            this.f477061e.clear();
            this.f477062f.clear();
        }
    }

    @Override // rh.a, rh.e3
    public void g(long j17) {
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices;
        super.g(j17);
        oj.j.c("Matrix.battery.AppStatMonitorFeature", "#onBackgroundCheck, during = " + j17, new java.lang.Object[0]);
        int i17 = this.f477059c;
        int i18 = this.f477060d;
        if (i17 > i18 || this.f477058b > i18) {
            android.content.Context d17 = this.f476827a.d();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) d17.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
                return;
            }
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (!android.text.TextUtils.isEmpty(runningServiceInfo.process) && runningServiceInfo.process.startsWith(d17.getPackageName()) && runningServiceInfo.foreground) {
                    oj.j.c("Matrix.battery.AppStatMonitorFeature", "checkForegroundService whether app importance is low, during = " + j17, new java.lang.Object[0]);
                    if (this.f477059c > this.f477060d) {
                        oj.j.f("Matrix.battery.AppStatMonitorFeature", "foreground service detected with low global importance: " + this.f477058b + ", " + this.f477059c + ", " + runningServiceInfo.service, new java.lang.Object[0]);
                        this.f476827a.e(false, this.f477058b, this.f477059c, runningServiceInfo.service, j17);
                    }
                    if (this.f477058b > this.f477060d && runningServiceInfo.process.equals(d17.getPackageName())) {
                        oj.j.f("Matrix.battery.AppStatMonitorFeature", "foreground service detected with low app importance: " + this.f477058b + ", " + this.f477059c + ", " + runningServiceInfo.service, new java.lang.Object[0]);
                        this.f476827a.e(true, this.f477058b, this.f477059c, runningServiceInfo.service, j17);
                    }
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f477060d = java.lang.Math.max(f0Var.f444868d.f444823i, 100);
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.AppStatMonitorFeature";
    }

    public rh.v k(long j17) {
        try {
            wh.i2 a17 = wh.j2.a(this.f477061e, j17, 10L, new rh.r(this));
            rh.v vVar = new rh.v();
            vVar.f476898c = a17.f527337c;
            vVar.f477051d = rh.x2.b(java.lang.Long.valueOf(a17.f527335a));
            vVar.f477052e = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(1))));
            vVar.f477053f = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(2))));
            vVar.f477054g = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(3))));
            vVar.f477055h = rh.x2.b(java.lang.Long.valueOf(a17.a(java.lang.String.valueOf(4))));
            return vVar;
        } catch (java.lang.Throwable th6) {
            oj.j.f("Matrix.battery.AppStatMonitorFeature", "configureSnapshot fail: " + th6.getMessage(), new java.lang.Object[0]);
            rh.v vVar2 = new rh.v();
            vVar2.f476898c = false;
            return vVar2;
        }
    }

    public wh.i2 l(long j17) {
        try {
            return wh.j2.a(this.f477062f, j17, 10L, new rh.s(this));
        } catch (java.lang.Throwable th6) {
            oj.j.f("Matrix.battery.AppStatMonitorFeature", "currentSceneSnapshot fail: " + th6.getMessage(), new java.lang.Object[0]);
            wh.i2 i2Var = new wh.i2();
            i2Var.f527337c = false;
            return i2Var;
        }
    }

    public void m(int i17) {
        synchronized ("Matrix.battery.AppStatMonitorFeature") {
            if (this.f477061e != java.util.Collections.EMPTY_LIST) {
                java.lang.Integer num = wh.m.f527363a;
                oj.j.c("Matrix.battery.LifeCycle", "onStat >> ".concat(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "float" : "fgSrv" : "bg" : "fg"), new java.lang.Object[0]);
                this.f477061e.add(0, new wh.f2(java.lang.String.valueOf(i17)));
                android.os.Handler handler = this.f476827a.f444870f;
                java.lang.Runnable runnable = this.f477063g;
                handler.removeCallbacks(runnable);
                this.f476827a.f444870f.postDelayed(runnable, 1000L);
            }
        }
    }

    public final void n() {
        int i17 = this.f477058b;
        int i18 = this.f477060d;
        if (i17 > i18 || this.f477059c > i18) {
            rh.q qVar = new rh.q(this);
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                this.f476827a.f444870f.post(qVar);
            } else {
                qVar.run();
            }
        }
    }
}

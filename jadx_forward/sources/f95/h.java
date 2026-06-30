package f95;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f342094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342095e;

    public h(l75.k0 k0Var, java.lang.String str) {
        this.f342094d = k0Var;
        this.f342095e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long e17 = this.f342094d.e();
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            long h17 = this.f342094d.h(e17);
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes();
            long k17 = this.f342094d.k();
            jx3.f fVar = jx3.f.INSTANCE;
            int i17 = f95.j.f342098b;
            fVar.d(i17, this.f342095e, this.f342094d.mo70515xfb83cc9b(), java.lang.Long.valueOf(k17), java.lang.Long.valueOf(java.lang.Math.min(availableBytes, availableBytes2)), java.lang.Long.valueOf(e17), "s-before", 0, java.lang.Long.valueOf(h17), 0, 0, 0, 0, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "start vacuum, dbPath = " + this.f342094d.mo70515xfb83cc9b());
            wu5.c k18 = ((ku5.t0) ku5.t0.f394148d).k(new f95.g(this.f342094d, this.f342095e, k17, availableBytes, availableBytes2, e17, h17), 2700000L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "executeDelay(...)");
            if (e17 <= 209715200) {
                fVar.d(i17, this.f342095e, this.f342094d.mo70515xfb83cc9b(), java.lang.Long.valueOf(k17), java.lang.Long.valueOf(java.lang.Math.min(availableBytes, availableBytes2)), java.lang.Long.valueOf(e17), "s-check-return", 0, java.lang.Long.valueOf(h17), 0, 0, 0, 0, 0);
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            d95.f.f309203p = true;
            try {
                boolean u17 = this.f342094d.u();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                k18.cancel(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", "vacuum finished, duration = " + currentTimeMillis2);
                long k19 = this.f342094d.k();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vacuum finished, dbFileSizeAfterVacuum = ");
                sb6.append(k19);
                sb6.append(", trimmedSize = ");
                long j17 = k17 - k19;
                sb6.append(j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCDBPerformance", sb6.toString());
                long j18 = 0;
                if (currentTimeMillis2 != 0) {
                    j18 = h17 / currentTimeMillis2;
                }
                fVar.d(i17, this.f342095e, this.f342094d.mo70515xfb83cc9b(), java.lang.Long.valueOf(k17), java.lang.Long.valueOf(java.lang.Math.min(availableBytes, availableBytes2)), java.lang.Long.valueOf(e17), "s-" + u17, java.lang.Long.valueOf(k19), java.lang.Long.valueOf(h17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2), 0, 1, java.lang.Long.valueOf(j18));
                d95.f.f309203p = false;
            } catch (java.lang.Throwable th6) {
                java.util.Set set = f95.j.f342097a;
                d95.f.f309203p = false;
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            java.util.Set set2 = f95.j.f342097a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WCDBPerformance", "sf or sdsf is null : " + th7.getMessage());
        }
    }
}

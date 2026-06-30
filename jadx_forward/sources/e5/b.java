package e5;

/* loaded from: classes13.dex */
public class b implements b5.f {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f331002h = a5.a0.e("SystemJobScheduler");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f331003d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.job.JobScheduler f331004e;

    /* renamed from: f, reason: collision with root package name */
    public final b5.w f331005f;

    /* renamed from: g, reason: collision with root package name */
    public final e5.a f331006g;

    public b(android.content.Context context, b5.w wVar) {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        e5.a aVar = new e5.a(context);
        this.f331003d = context;
        this.f331005f = wVar;
        this.f331004e = jobScheduler;
        this.f331006g = aVar;
    }

    public static void a(android.app.job.JobScheduler jobScheduler, int i17) {
        try {
            jobScheduler.cancel(i17);
        } catch (java.lang.Throwable th6) {
            a5.a0.c().b(f331002h, java.lang.String.format(java.util.Locale.getDefault(), "Exception while trying to cancel job (%d)", java.lang.Integer.valueOf(i17)), th6);
        }
    }

    public static java.util.List d(android.content.Context context, android.app.job.JobScheduler jobScheduler) {
        java.util.List<android.app.job.JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (java.lang.Throwable th6) {
            a5.a0.c().b(f331002h, "getAllPendingJobs() is not reliable on this device.", th6);
            list = null;
        }
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p129x434d472e.JobServiceC1274x180d67e7.class);
        for (android.app.job.JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0018 A[SYNTHETIC] */
    @Override // b5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f331003d
            android.app.job.JobScheduler r1 = r8.f331004e
            java.util.List r0 = d(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L4b
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L37
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L37
            if (r7 == 0) goto L37
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L37
            goto L38
        L37:
            r5 = r2
        L38:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L18
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L18
        L4a:
            r2 = r3
        L4b:
            if (r2 == 0) goto L78
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L78
            java.util.Iterator r0 = r2.iterator()
        L57:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            a(r1, r2)
            goto L57
        L6b:
            b5.w r0 = r8.f331005f
            androidx.work.impl.WorkDatabase r0 = r0.f99430c
            j5.j r0 = r0.k()
            j5.m r0 = (j5.m) r0
            r0.b(r9)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.b.b(java.lang.String):void");
    }

    @Override // b5.f
    public boolean c() {
        return true;
    }

    @Override // b5.f
    public void e(j5.w... wVarArr) {
        int i17;
        int i18;
        b5.w wVar = this.f331005f;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = wVar.f99430c;
        int length = wVarArr.length;
        int i19 = 0;
        int i27 = 0;
        while (i27 < length) {
            j5.w wVar2 = wVarArr[i27];
            abstractC1265x5c5aefcc.c();
            try {
                j5.w i28 = ((j5.g0) abstractC1265x5c5aefcc.n()).i(wVar2.f379297a);
                java.lang.String str = f331002h;
                if (i28 == null) {
                    a5.a0.c().f(str, "Skipping scheduling " + wVar2.f379297a + " because it's no longer in the DB", new java.lang.Throwable[i19]);
                    abstractC1265x5c5aefcc.h();
                } else if (i28.f379298b != a5.q0.ENQUEUED) {
                    a5.a0.c().f(str, "Skipping scheduling " + wVar2.f379297a + " because it is no longer enqueued", new java.lang.Throwable[i19]);
                    abstractC1265x5c5aefcc.h();
                } else {
                    j5.i a17 = ((j5.m) abstractC1265x5c5aefcc.k()).a(wVar2.f379297a);
                    if (a17 != null) {
                        i18 = a17.f379281b;
                        i17 = i27;
                    } else {
                        wVar.f99429b.getClass();
                        int i29 = wVar.f99429b.f82914g;
                        synchronized (k5.g.class) {
                            abstractC1265x5c5aefcc.c();
                            try {
                                java.lang.Long a18 = ((j5.h) abstractC1265x5c5aefcc.j()).a("next_job_scheduler_id");
                                int intValue = a18 != null ? a18.intValue() : i19;
                                i17 = i27;
                                ((j5.h) abstractC1265x5c5aefcc.j()).b(new j5.e("next_job_scheduler_id", intValue == Integer.MAX_VALUE ? i19 : intValue + 1));
                                abstractC1265x5c5aefcc.h();
                                i18 = (intValue >= 0 && intValue <= i29) ? intValue : 0;
                                ((j5.h) abstractC1265x5c5aefcc.j()).b(new j5.e("next_job_scheduler_id", 1));
                            } finally {
                            }
                        }
                    }
                    if (a17 == null) {
                        j5.i iVar = new j5.i(wVar2.f379297a, i18);
                        j5.m mVar = (j5.m) wVar.f99430c.k();
                        l4.q qVar = mVar.f379284a;
                        qVar.b();
                        qVar.c();
                        try {
                            mVar.f379285b.e(iVar);
                            qVar.h();
                            qVar.f();
                        } catch (java.lang.Throwable th6) {
                            qVar.f();
                            throw th6;
                        }
                    }
                    f(wVar2, i18);
                    abstractC1265x5c5aefcc.h();
                    abstractC1265x5c5aefcc.f();
                    i27 = i17 + 1;
                    i19 = 0;
                }
                i17 = i27;
                abstractC1265x5c5aefcc.f();
                i27 = i17 + 1;
                i19 = 0;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(j5.w wVar, int i17) {
        int i18;
        android.app.job.JobScheduler jobScheduler = this.f331004e;
        e5.a aVar = this.f331006g;
        aVar.getClass();
        a5.f fVar = wVar.f379306j;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", wVar.f379297a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", wVar.c());
        android.app.job.JobInfo.Builder extras = new android.app.job.JobInfo.Builder(i17, aVar.f331001a).setRequiresCharging(fVar.f82919b).setRequiresDeviceIdle(fVar.f82920c).setExtras(persistableBundle);
        a5.b0 b0Var = fVar.f82918a;
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 < 30 || b0Var != a5.b0.TEMPORARILY_UNMETERED) {
            int ordinal = b0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    i18 = 2;
                    if (ordinal != 2) {
                        i18 = 3;
                        if (ordinal != 3) {
                            i18 = 4;
                            if (ordinal != 4 || i19 < 26) {
                                a5.a0.c().a(e5.a.f331000b, java.lang.String.format("API version too low. Cannot convert network type value %s", b0Var), new java.lang.Throwable[0]);
                            }
                        }
                    }
                }
                i18 = 1;
            } else {
                i18 = 0;
            }
            extras.setRequiredNetworkType(i18);
        } else {
            extras.setRequiredNetwork(new android.net.NetworkRequest.Builder().addCapability(25).build());
        }
        if (!fVar.f82920c) {
            extras.setBackoffCriteria(wVar.f379309m, wVar.f379308l == a5.a.LINEAR ? 0 : 1);
        }
        long max = java.lang.Math.max(wVar.a() - java.lang.System.currentTimeMillis(), 0L);
        if (i19 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!wVar.f379313q) {
            extras.setImportantWhileForeground(true);
        }
        if ((((java.util.HashSet) fVar.f82925h.f82929a).size() > 0) != false) {
            java.util.Iterator it = ((java.util.HashSet) fVar.f82925h.f82929a).iterator();
            while (it.hasNext()) {
                a5.g gVar = (a5.g) it.next();
                extras.addTriggerContentUri(new android.app.job.JobInfo.TriggerContentUri(gVar.f82927a, gVar.f82928b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(fVar.f82923f);
            extras.setTriggerContentMaxDelay(fVar.f82924g);
        }
        extras.setPersisted(false);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(fVar.f82921d);
            extras.setRequiresStorageNotLow(fVar.f82922e);
        }
        boolean z17 = wVar.f379307k > 0;
        boolean z18 = max > 0;
        if (j3.b.b() && wVar.f379313q && !z17 && !z18) {
            extras.setExpedited(true);
        }
        android.app.job.JobInfo build = extras.build();
        java.lang.String str = f331002h;
        a5.a0.c().a(str, java.lang.String.format("Scheduling work ID %s Job ID %s", wVar.f379297a, java.lang.Integer.valueOf(i17)), new java.lang.Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                a5.a0.c().f(str, java.lang.String.format("Unable to schedule work ID %s", wVar.f379297a), new java.lang.Throwable[0]);
                if (wVar.f379313q && wVar.f379314r == a5.k0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    wVar.f379313q = false;
                    a5.a0.c().a(str, java.lang.String.format("Scheduling a non-expedited job (work ID %s)", wVar.f379297a), new java.lang.Throwable[0]);
                    f(wVar, i17);
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            java.util.List d17 = d(this.f331003d, jobScheduler);
            int size = d17 != null ? ((java.util.ArrayList) d17).size() : 0;
            java.util.Locale locale = java.util.Locale.getDefault();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(size);
            b5.w wVar2 = this.f331005f;
            java.lang.String format = java.lang.String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, java.lang.Integer.valueOf(((java.util.ArrayList) ((j5.g0) wVar2.f99430c.n()).e()).size()), java.lang.Integer.valueOf(wVar2.f99429b.f82915h));
            a5.a0.c().b(str, format, new java.lang.Throwable[0]);
            throw new java.lang.IllegalStateException(format, e17);
        } catch (java.lang.Throwable th6) {
            a5.a0.c().b(str, java.lang.String.format("Unable to schedule %s", wVar), th6);
        }
    }
}

package androidx.work.impl.background.systemjob;

/* loaded from: classes13.dex */
public class SystemJobService extends android.app.job.JobService implements b5.b {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f12487f = a5.a0.e("SystemJobService");

    /* renamed from: d, reason: collision with root package name */
    public b5.w f12488d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f12489e = new java.util.HashMap();

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        android.app.job.JobParameters jobParameters;
        a5.a0.c().a(f12487f, java.lang.String.format("%s executed on JobScheduler", str), new java.lang.Throwable[0]);
        synchronized (this.f12489e) {
            jobParameters = (android.app.job.JobParameters) ((java.util.HashMap) this.f12489e).remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z17);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            b5.w c17 = b5.w.c(getApplicationContext());
            this.f12488d = c17;
            c17.f17900f.a(this);
        } catch (java.lang.IllegalStateException unused) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            a5.a0.c().f(f12487f, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new java.lang.Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b5.w wVar = this.f12488d;
        if (wVar != null) {
            b5.e eVar = wVar.f17900f;
            synchronized (eVar.f17868q) {
                ((java.util.ArrayList) eVar.f17867p).remove(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            b5.w r0 = r8.f12488d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            a5.a0 r0 = a5.a0.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f12487f
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L17:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L2a
            if (r3 == 0) goto L2a
            boolean r4 = r3.containsKey(r0)     // Catch: java.lang.NullPointerException -> L2a
            if (r4 == 0) goto L2a
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.NullPointerException -> L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L3f
            a5.a0 r9 = a5.a0.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f12487f
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L3f:
            java.util.Map r3 = r8.f12489e
            monitor-enter(r3)
            java.util.Map r4 = r8.f12489e     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lae
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L63
            a5.a0 r9 = a5.a0.c()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f12487f     // Catch: java.lang.Throwable -> Lae
            java.lang.String r4 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = java.lang.String.format(r4, r0)     // Catch: java.lang.Throwable -> Lae
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lae
            r9.a(r1, r0, r4)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            return r2
        L63:
            a5.a0 r4 = a5.a0.c()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = androidx.work.impl.background.systemjob.SystemJobService.f12487f     // Catch: java.lang.Throwable -> Lae
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lae
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> Lae
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lae
            r4.a(r5, r6, r2)     // Catch: java.lang.Throwable -> Lae
            java.util.Map r2 = r8.f12489e     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> Lae
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            int r2 = android.os.Build.VERSION.SDK_INT
            a5.x0 r3 = new a5.x0
            r3.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L94
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.Arrays.asList(r4)
        L94:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto La1
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.Arrays.asList(r4)
        La1:
            r4 = 28
            if (r2 < r4) goto La8
            r9.getNetwork()
        La8:
            b5.w r9 = r8.f12488d
            r9.g(r0, r3)
            return r1
        Lae:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            b5.w r0 = r6.f12488d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            a5.a0 r7 = a5.a0.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f12487f
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r7 == 0) goto L27
            boolean r3 = r7.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r7 = r7.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r7 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L3c
            a5.a0 r7 = a5.a0.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f12487f
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.b(r0, r1, r3)
            return r2
        L3c:
            a5.a0 r0 = a5.a0.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f12487f
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r7}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r2)
            java.util.Map r0 = r6.f12489e
            monitor-enter(r0)
            java.util.Map r2 = r6.f12489e     // Catch: java.lang.Throwable -> L76
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L76
            r2.remove(r7)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            b5.w r0 = r6.f12488d
            r0.h(r7)
            b5.w r0 = r6.f12488d
            b5.e r0 = r0.f17900f
            java.lang.Object r2 = r0.f17868q
            monitor-enter(r2)
            java.util.Set r0 = r0.f17866o     // Catch: java.lang.Throwable -> L73
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L73
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            r7 = r7 ^ r1
            return r7
        L73:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            throw r7
        L76:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}

package b5;

/* loaded from: classes13.dex */
public class w extends a5.r0 {

    /* renamed from: j, reason: collision with root package name */
    public static b5.w f17892j;

    /* renamed from: k, reason: collision with root package name */
    public static b5.w f17893k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.Object f17894l;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f17895a;

    /* renamed from: b, reason: collision with root package name */
    public a5.d f17896b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.impl.WorkDatabase f17897c;

    /* renamed from: d, reason: collision with root package name */
    public m5.a f17898d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f17899e;

    /* renamed from: f, reason: collision with root package name */
    public b5.e f17900f;

    /* renamed from: g, reason: collision with root package name */
    public k5.i f17901g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17902h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.BroadcastReceiver.PendingResult f17903i;

    static {
        a5.a0.e("WorkManagerImpl");
        f17892j = null;
        f17893k = null;
        f17894l = new java.lang.Object();
    }

    public w(android.content.Context context, a5.d dVar, m5.a aVar) {
        l4.m mVar;
        java.util.concurrent.Executor executor;
        java.lang.String str;
        boolean z17 = context.getResources().getBoolean(com.tencent.mm.R.bool.f478488f);
        android.content.Context applicationContext = context.getApplicationContext();
        k5.l lVar = ((m5.c) aVar).f323470a;
        int i17 = androidx.work.impl.WorkDatabase.f12473k;
        if (z17) {
            mVar = new l4.m(applicationContext, androidx.work.impl.WorkDatabase.class, null);
            mVar.f315737h = true;
        } else {
            java.lang.String str2 = b5.u.f17889a;
            mVar = new l4.m(applicationContext, androidx.work.impl.WorkDatabase.class, "androidx.work.workdb");
            mVar.f315736g = new b5.i(applicationContext);
        }
        mVar.f315734e = lVar;
        b5.j jVar = new b5.j();
        if (mVar.f315733d == null) {
            mVar.f315733d = new java.util.ArrayList();
        }
        mVar.f315733d.add(jVar);
        mVar.a(b5.t.f17882a);
        mVar.a(new b5.r(applicationContext, 2, 3));
        mVar.a(b5.t.f17883b);
        mVar.a(b5.t.f17884c);
        mVar.a(new b5.r(applicationContext, 5, 6));
        mVar.a(b5.t.f17885d);
        mVar.a(b5.t.f17886e);
        mVar.a(b5.t.f17887f);
        mVar.a(new b5.s(applicationContext));
        mVar.a(new b5.r(applicationContext, 10, 11));
        mVar.a(b5.t.f17888g);
        mVar.f315738i = false;
        mVar.f315739j = true;
        android.content.Context context2 = mVar.f315732c;
        if (context2 == null) {
            throw new java.lang.IllegalArgumentException("Cannot provide null context for the database.");
        }
        java.lang.Class cls = mVar.f315730a;
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        java.util.concurrent.Executor executor2 = mVar.f315734e;
        if (executor2 == null && mVar.f315735f == null) {
            java.util.concurrent.Executor executor3 = p.b.f350334c;
            mVar.f315735f = executor3;
            mVar.f315734e = executor3;
        } else if (executor2 != null && mVar.f315735f == null) {
            mVar.f315735f = executor2;
        } else if (executor2 == null && (executor = mVar.f315735f) != null) {
            mVar.f315734e = executor;
        }
        if (mVar.f315736g == null) {
            mVar.f315736g = new q4.g();
        }
        java.lang.String str3 = mVar.f315731b;
        p4.e eVar = mVar.f315736g;
        l4.p pVar = mVar.f315740k;
        java.util.ArrayList arrayList = mVar.f315733d;
        boolean z18 = mVar.f315737h;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context2.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        l4.o oVar = l4.o.WRITE_AHEAD_LOGGING;
        l4.o oVar2 = (activityManager == null || activityManager.isLowRamDevice()) ? l4.o.TRUNCATE : oVar;
        java.util.concurrent.Executor executor4 = mVar.f315734e;
        l4.a aVar2 = new l4.a(context2, str3, eVar, pVar, arrayList, z18, oVar2, executor4, mVar.f315735f, false, mVar.f315738i, mVar.f315739j, null, null, null);
        java.lang.String name = cls.getPackage().getName();
        java.lang.String canonicalName = cls.getCanonicalName();
        java.lang.String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            l4.q qVar = (l4.q) java.lang.Class.forName(str).newInstance();
            p4.f e17 = qVar.e(aVar2);
            qVar.f315748c = e17;
            if (e17 instanceof l4.v) {
                ((l4.v) e17).getClass();
            }
            boolean z19 = oVar2 == oVar;
            e17.setWriteAheadLoggingEnabled(z19);
            qVar.f315752g = arrayList;
            qVar.f315747b = executor4;
            new java.util.ArrayDeque();
            qVar.f315750e = z18;
            qVar.f315751f = z19;
            androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) qVar;
            android.content.Context applicationContext2 = context.getApplicationContext();
            a5.z zVar = new a5.z(dVar.f1380f);
            synchronized (a5.a0.class) {
                a5.a0.f1363a = zVar;
            }
            java.lang.String str5 = b5.g.f17869a;
            e5.b bVar = new e5.b(applicationContext2, this);
            k5.h.a(applicationContext2, androidx.work.impl.background.systemjob.SystemJobService.class, true);
            a5.a0.c().a(b5.g.f17869a, "Created SystemJobScheduler and enabled SystemJobService", new java.lang.Throwable[0]);
            java.util.List asList = java.util.Arrays.asList(bVar, new c5.c(applicationContext2, dVar, aVar, this));
            b5.e eVar2 = new b5.e(context, dVar, aVar, workDatabase, asList);
            android.content.Context applicationContext3 = context.getApplicationContext();
            this.f17895a = applicationContext3;
            this.f17896b = dVar;
            this.f17898d = aVar;
            this.f17897c = workDatabase;
            this.f17899e = asList;
            this.f17900f = eVar2;
            this.f17901g = new k5.i(workDatabase);
            this.f17902h = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new java.lang.IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            ((m5.c) this.f17898d).a(new k5.f(applicationContext3, this));
        } catch (java.lang.ClassNotFoundException unused) {
            throw new java.lang.RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (java.lang.IllegalAccessException unused2) {
            throw new java.lang.RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (java.lang.InstantiationException unused3) {
            throw new java.lang.RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static b5.w c(android.content.Context context) {
        b5.w wVar;
        java.lang.Object obj = f17894l;
        synchronized (obj) {
            synchronized (obj) {
                wVar = f17892j;
                if (wVar == null) {
                    wVar = f17893k;
                }
            }
            return wVar;
        }
        if (wVar != null) {
            return wVar;
        }
        context.getApplicationContext();
        throw new java.lang.IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (b5.w.f17893k != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        b5.w.f17893k = new b5.w(r4, r5, new m5.c(r5.f1376b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        b5.w.f17892j = b5.w.f17893k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r4, a5.d r5) {
        /*
            java.lang.Object r0 = b5.w.f17894l
            monitor-enter(r0)
            b5.w r1 = b5.w.f17892j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            b5.w r2 = b5.w.f17893k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            b5.w r1 = b5.w.f17893k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            b5.w r1 = new b5.w     // Catch: java.lang.Throwable -> L32
            m5.c r2 = new m5.c     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Executor r3 = r5.f1376b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            b5.w.f17893k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            b5.w r4 = b5.w.f17893k     // Catch: java.lang.Throwable -> L32
            b5.w.f17892j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.w.d(android.content.Context, a5.d):void");
    }

    public a5.j0 b(java.lang.String str) {
        k5.b bVar = new k5.b(this, str);
        ((m5.c) this.f17898d).a(bVar);
        return bVar.f304122d;
    }

    public void e() {
        synchronized (f17894l) {
            this.f17902h = true;
            android.content.BroadcastReceiver.PendingResult pendingResult = this.f17903i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f17903i = null;
            }
        }
    }

    public void f() {
        java.util.List d17;
        android.content.Context context = this.f17895a;
        java.lang.String str = e5.b.f249469h;
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d17 = e5.b.d(context, jobScheduler)) != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) d17;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e5.b.a(jobScheduler, ((android.app.job.JobInfo) it.next()).getId());
                }
            }
        }
        j5.g0 g0Var = (j5.g0) this.f17897c.n();
        l4.q qVar = g0Var.f297734a;
        qVar.b();
        l4.w wVar = g0Var.f297742i;
        p4.i a17 = wVar.a();
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
            b5.g.a(this.f17896b, this.f17897c, this.f17899e);
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }

    public void g(java.lang.String str, a5.x0 x0Var) {
        ((m5.c) this.f17898d).a(new k5.m(this, str, x0Var));
    }

    public void h(java.lang.String str) {
        ((m5.c) this.f17898d).a(new k5.n(this, str, false));
    }
}

package b5;

/* loaded from: classes13.dex */
public class w extends a5.r0 {

    /* renamed from: j, reason: collision with root package name */
    public static b5.w f99425j;

    /* renamed from: k, reason: collision with root package name */
    public static b5.w f99426k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.Object f99427l;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f99428a;

    /* renamed from: b, reason: collision with root package name */
    public a5.d f99429b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc f99430c;

    /* renamed from: d, reason: collision with root package name */
    public m5.a f99431d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f99432e;

    /* renamed from: f, reason: collision with root package name */
    public b5.e f99433f;

    /* renamed from: g, reason: collision with root package name */
    public k5.i f99434g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f99435h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.BroadcastReceiver.PendingResult f99436i;

    static {
        a5.a0.e("WorkManagerImpl");
        f99425j = null;
        f99426k = null;
        f99427l = new java.lang.Object();
    }

    public w(android.content.Context context, a5.d dVar, m5.a aVar) {
        l4.m mVar;
        java.util.concurrent.Executor executor;
        java.lang.String str;
        boolean z17 = context.getResources().getBoolean(com.p314xaae8f345.mm.R.C30858x2e3aea.f560021f);
        android.content.Context applicationContext = context.getApplicationContext();
        k5.l lVar = ((m5.c) aVar).f405003a;
        int i17 = p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc.f94006k;
        if (z17) {
            mVar = new l4.m(applicationContext, p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc.class, null);
            mVar.f397270h = true;
        } else {
            java.lang.String str2 = b5.u.f99422a;
            mVar = new l4.m(applicationContext, p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc.class, "androidx.work.workdb");
            mVar.f397269g = new b5.i(applicationContext);
        }
        mVar.f397267e = lVar;
        b5.j jVar = new b5.j();
        if (mVar.f397266d == null) {
            mVar.f397266d = new java.util.ArrayList();
        }
        mVar.f397266d.add(jVar);
        mVar.a(b5.t.f99415a);
        mVar.a(new b5.r(applicationContext, 2, 3));
        mVar.a(b5.t.f99416b);
        mVar.a(b5.t.f99417c);
        mVar.a(new b5.r(applicationContext, 5, 6));
        mVar.a(b5.t.f99418d);
        mVar.a(b5.t.f99419e);
        mVar.a(b5.t.f99420f);
        mVar.a(new b5.s(applicationContext));
        mVar.a(new b5.r(applicationContext, 10, 11));
        mVar.a(b5.t.f99421g);
        mVar.f397271i = false;
        mVar.f397272j = true;
        android.content.Context context2 = mVar.f397265c;
        if (context2 == null) {
            throw new java.lang.IllegalArgumentException("Cannot provide null context for the database.");
        }
        java.lang.Class cls = mVar.f397263a;
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        java.util.concurrent.Executor executor2 = mVar.f397267e;
        if (executor2 == null && mVar.f397268f == null) {
            java.util.concurrent.Executor executor3 = p.b.f431867c;
            mVar.f397268f = executor3;
            mVar.f397267e = executor3;
        } else if (executor2 != null && mVar.f397268f == null) {
            mVar.f397268f = executor2;
        } else if (executor2 == null && (executor = mVar.f397268f) != null) {
            mVar.f397267e = executor;
        }
        if (mVar.f397269g == null) {
            mVar.f397269g = new q4.g();
        }
        java.lang.String str3 = mVar.f397264b;
        p4.e eVar = mVar.f397269g;
        l4.p pVar = mVar.f397273k;
        java.util.ArrayList arrayList = mVar.f397266d;
        boolean z18 = mVar.f397270h;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context2.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        l4.o oVar = l4.o.WRITE_AHEAD_LOGGING;
        l4.o oVar2 = (activityManager == null || activityManager.isLowRamDevice()) ? l4.o.TRUNCATE : oVar;
        java.util.concurrent.Executor executor4 = mVar.f397267e;
        l4.a aVar2 = new l4.a(context2, str3, eVar, pVar, arrayList, z18, oVar2, executor4, mVar.f397268f, false, mVar.f397271i, mVar.f397272j, null, null, null);
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
            qVar.f397281c = e17;
            if (e17 instanceof l4.v) {
                ((l4.v) e17).getClass();
            }
            boolean z19 = oVar2 == oVar;
            e17.mo157823xfbbea326(z19);
            qVar.f397285g = arrayList;
            qVar.f397280b = executor4;
            new java.util.ArrayDeque();
            qVar.f397283e = z18;
            qVar.f397284f = z19;
            p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = (p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc) qVar;
            android.content.Context applicationContext2 = context.getApplicationContext();
            a5.z zVar = new a5.z(dVar.f82913f);
            synchronized (a5.a0.class) {
                a5.a0.f82896a = zVar;
            }
            java.lang.String str5 = b5.g.f99402a;
            e5.b bVar = new e5.b(applicationContext2, this);
            k5.h.a(applicationContext2, p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p129x434d472e.JobServiceC1274x180d67e7.class, true);
            a5.a0.c().a(b5.g.f99402a, "Created SystemJobScheduler and enabled SystemJobService", new java.lang.Throwable[0]);
            java.util.List asList = java.util.Arrays.asList(bVar, new c5.c(applicationContext2, dVar, aVar, this));
            b5.e eVar2 = new b5.e(context, dVar, aVar, abstractC1265x5c5aefcc, asList);
            android.content.Context applicationContext3 = context.getApplicationContext();
            this.f99428a = applicationContext3;
            this.f99429b = dVar;
            this.f99431d = aVar;
            this.f99430c = abstractC1265x5c5aefcc;
            this.f99432e = asList;
            this.f99433f = eVar2;
            this.f99434g = new k5.i(abstractC1265x5c5aefcc);
            this.f99435h = false;
            if (applicationContext3.isDeviceProtectedStorage()) {
                throw new java.lang.IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            ((m5.c) this.f99431d).a(new k5.f(applicationContext3, this));
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
        java.lang.Object obj = f99427l;
        synchronized (obj) {
            synchronized (obj) {
                wVar = f99425j;
                if (wVar == null) {
                    wVar = f99426k;
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
    
        if (b5.w.f99426k != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        b5.w.f99426k = new b5.w(r4, r5, new m5.c(r5.f82909b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        b5.w.f99425j = b5.w.f99426k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r4, a5.d r5) {
        /*
            java.lang.Object r0 = b5.w.f99427l
            monitor-enter(r0)
            b5.w r1 = b5.w.f99425j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            b5.w r2 = b5.w.f99426k     // Catch: java.lang.Throwable -> L32
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
            b5.w r1 = b5.w.f99426k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            b5.w r1 = new b5.w     // Catch: java.lang.Throwable -> L32
            m5.c r2 = new m5.c     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Executor r3 = r5.f82909b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            b5.w.f99426k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            b5.w r4 = b5.w.f99426k     // Catch: java.lang.Throwable -> L32
            b5.w.f99425j = r4     // Catch: java.lang.Throwable -> L32
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
        ((m5.c) this.f99431d).a(bVar);
        return bVar.f385655d;
    }

    public void e() {
        synchronized (f99427l) {
            this.f99435h = true;
            android.content.BroadcastReceiver.PendingResult pendingResult = this.f99436i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f99436i = null;
            }
        }
    }

    public void f() {
        java.util.List d17;
        android.content.Context context = this.f99428a;
        java.lang.String str = e5.b.f331002h;
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
        j5.g0 g0Var = (j5.g0) this.f99430c.n();
        l4.q qVar = g0Var.f379267a;
        qVar.b();
        l4.w wVar = g0Var.f379275i;
        p4.i a17 = wVar.a();
        qVar.c();
        try {
            q4.i iVar = (q4.i) a17;
            iVar.a();
            qVar.h();
            qVar.f();
            wVar.c(iVar);
            b5.g.a(this.f99429b, this.f99430c, this.f99432e);
        } catch (java.lang.Throwable th6) {
            qVar.f();
            wVar.c(a17);
            throw th6;
        }
    }

    public void g(java.lang.String str, a5.x0 x0Var) {
        ((m5.c) this.f99431d).a(new k5.m(this, str, x0Var));
    }

    public void h(java.lang.String str) {
        ((m5.c) this.f99431d).a(new k5.n(this, str, false));
    }
}

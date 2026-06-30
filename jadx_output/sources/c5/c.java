package c5;

/* loaded from: classes13.dex */
public class c implements b5.f, f5.c, b5.b {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f38576o = a5.a0.e("GreedyScheduler");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f38577d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.w f38578e;

    /* renamed from: f, reason: collision with root package name */
    public final f5.d f38579f;

    /* renamed from: h, reason: collision with root package name */
    public final c5.b f38581h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f38582i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f38584n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f38580g = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f38583m = new java.lang.Object();

    public c(android.content.Context context, a5.d dVar, m5.a aVar, b5.w wVar) {
        this.f38577d = context;
        this.f38578e = wVar;
        this.f38579f = new f5.d(context, aVar, this);
        this.f38581h = new c5.b(this, dVar.f1379e);
    }

    @Override // f5.c
    public void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a5.a0.c().a(f38576o, java.lang.String.format("Constraints not met: Cancelling work ID %s", str), new java.lang.Throwable[0]);
            this.f38578e.h(str);
        }
    }

    @Override // b5.f
    public void b(java.lang.String str) {
        java.lang.Runnable runnable;
        java.lang.Boolean bool = this.f38584n;
        b5.w wVar = this.f38578e;
        if (bool == null) {
            this.f38584n = java.lang.Boolean.valueOf(k5.j.a(this.f38577d, wVar.f17896b));
        }
        boolean booleanValue = this.f38584n.booleanValue();
        java.lang.String str2 = f38576o;
        if (!booleanValue) {
            a5.a0.c().d(str2, "Ignoring schedule request in non-main process", new java.lang.Throwable[0]);
            return;
        }
        if (!this.f38582i) {
            wVar.f17900f.a(this);
            this.f38582i = true;
        }
        a5.a0.c().a(str2, java.lang.String.format("Cancelling work ID %s", str), new java.lang.Throwable[0]);
        c5.b bVar = this.f38581h;
        if (bVar != null && (runnable = (java.lang.Runnable) ((java.util.HashMap) bVar.f38575c).remove(str)) != null) {
            ((b5.a) bVar.f38574b).f17831a.removeCallbacks(runnable);
        }
        wVar.h(str);
    }

    @Override // b5.f
    public boolean c() {
        return false;
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        synchronized (this.f38583m) {
            java.util.Iterator it = ((java.util.HashSet) this.f38580g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j5.w wVar = (j5.w) it.next();
                if (wVar.f297764a.equals(str)) {
                    a5.a0.c().a(f38576o, java.lang.String.format("Stopping tracking for %s", str), new java.lang.Throwable[0]);
                    ((java.util.HashSet) this.f38580g).remove(wVar);
                    this.f38579f.b(this.f38580g);
                    break;
                }
            }
        }
    }

    @Override // b5.f
    public void e(j5.w... wVarArr) {
        if (this.f38584n == null) {
            this.f38584n = java.lang.Boolean.valueOf(k5.j.a(this.f38577d, this.f38578e.f17896b));
        }
        if (!this.f38584n.booleanValue()) {
            a5.a0.c().d(f38576o, "Ignoring schedule request in a secondary process", new java.lang.Throwable[0]);
            return;
        }
        if (!this.f38582i) {
            this.f38578e.f17900f.a(this);
            this.f38582i = true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (j5.w wVar : wVarArr) {
            long a17 = wVar.a();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (wVar.f297765b == a5.q0.ENQUEUED) {
                if (currentTimeMillis < a17) {
                    c5.b bVar = this.f38581h;
                    if (bVar != null) {
                        java.util.HashMap hashMap = (java.util.HashMap) bVar.f38575c;
                        java.lang.Runnable runnable = (java.lang.Runnable) hashMap.remove(wVar.f297764a);
                        a5.o0 o0Var = bVar.f38574b;
                        if (runnable != null) {
                            ((b5.a) o0Var).f17831a.removeCallbacks(runnable);
                        }
                        c5.a aVar = new c5.a(bVar, wVar);
                        hashMap.put(wVar.f297764a, aVar);
                        ((b5.a) o0Var).f17831a.postDelayed(aVar, wVar.a() - java.lang.System.currentTimeMillis());
                    }
                } else if (wVar.b()) {
                    a5.f fVar = wVar.f297773j;
                    if (fVar.f1387c) {
                        a5.a0.c().a(f38576o, java.lang.String.format("Ignoring WorkSpec %s, Requires device idle.", wVar), new java.lang.Throwable[0]);
                    } else if (((java.util.HashSet) fVar.f1392h.f1396a).size() > 0) {
                        a5.a0.c().a(f38576o, java.lang.String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", wVar), new java.lang.Throwable[0]);
                    } else {
                        hashSet.add(wVar);
                        hashSet2.add(wVar.f297764a);
                    }
                } else {
                    a5.a0.c().a(f38576o, java.lang.String.format("Starting work for %s", wVar.f297764a), new java.lang.Throwable[0]);
                    this.f38578e.g(wVar.f297764a, null);
                }
            }
        }
        synchronized (this.f38583m) {
            if (!hashSet.isEmpty()) {
                a5.a0.c().a(f38576o, java.lang.String.format("Starting tracking for [%s]", android.text.TextUtils.join(",", hashSet2)), new java.lang.Throwable[0]);
                this.f38580g.addAll(hashSet);
                this.f38579f.b(this.f38580g);
            }
        }
    }

    @Override // f5.c
    public void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a5.a0.c().a(f38576o, java.lang.String.format("Constraints met: Scheduling work ID %s", str), new java.lang.Throwable[0]);
            this.f38578e.g(str, null);
        }
    }
}

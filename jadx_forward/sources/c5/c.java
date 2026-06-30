package c5;

/* loaded from: classes13.dex */
public class c implements b5.f, f5.c, b5.b {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f120109o = a5.a0.e("GreedyScheduler");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f120110d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.w f120111e;

    /* renamed from: f, reason: collision with root package name */
    public final f5.d f120112f;

    /* renamed from: h, reason: collision with root package name */
    public final c5.b f120114h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120115i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f120117n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f120113g = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f120116m = new java.lang.Object();

    public c(android.content.Context context, a5.d dVar, m5.a aVar, b5.w wVar) {
        this.f120110d = context;
        this.f120111e = wVar;
        this.f120112f = new f5.d(context, aVar, this);
        this.f120114h = new c5.b(this, dVar.f82912e);
    }

    @Override // f5.c
    public void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a5.a0.c().a(f120109o, java.lang.String.format("Constraints not met: Cancelling work ID %s", str), new java.lang.Throwable[0]);
            this.f120111e.h(str);
        }
    }

    @Override // b5.f
    public void b(java.lang.String str) {
        java.lang.Runnable runnable;
        java.lang.Boolean bool = this.f120117n;
        b5.w wVar = this.f120111e;
        if (bool == null) {
            this.f120117n = java.lang.Boolean.valueOf(k5.j.a(this.f120110d, wVar.f99429b));
        }
        boolean booleanValue = this.f120117n.booleanValue();
        java.lang.String str2 = f120109o;
        if (!booleanValue) {
            a5.a0.c().d(str2, "Ignoring schedule request in non-main process", new java.lang.Throwable[0]);
            return;
        }
        if (!this.f120115i) {
            wVar.f99433f.a(this);
            this.f120115i = true;
        }
        a5.a0.c().a(str2, java.lang.String.format("Cancelling work ID %s", str), new java.lang.Throwable[0]);
        c5.b bVar = this.f120114h;
        if (bVar != null && (runnable = (java.lang.Runnable) ((java.util.HashMap) bVar.f120108c).remove(str)) != null) {
            ((b5.a) bVar.f120107b).f99364a.removeCallbacks(runnable);
        }
        wVar.h(str);
    }

    @Override // b5.f
    public boolean c() {
        return false;
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        synchronized (this.f120116m) {
            java.util.Iterator it = ((java.util.HashSet) this.f120113g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j5.w wVar = (j5.w) it.next();
                if (wVar.f379297a.equals(str)) {
                    a5.a0.c().a(f120109o, java.lang.String.format("Stopping tracking for %s", str), new java.lang.Throwable[0]);
                    ((java.util.HashSet) this.f120113g).remove(wVar);
                    this.f120112f.b(this.f120113g);
                    break;
                }
            }
        }
    }

    @Override // b5.f
    public void e(j5.w... wVarArr) {
        if (this.f120117n == null) {
            this.f120117n = java.lang.Boolean.valueOf(k5.j.a(this.f120110d, this.f120111e.f99429b));
        }
        if (!this.f120117n.booleanValue()) {
            a5.a0.c().d(f120109o, "Ignoring schedule request in a secondary process", new java.lang.Throwable[0]);
            return;
        }
        if (!this.f120115i) {
            this.f120111e.f99433f.a(this);
            this.f120115i = true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (j5.w wVar : wVarArr) {
            long a17 = wVar.a();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (wVar.f379298b == a5.q0.ENQUEUED) {
                if (currentTimeMillis < a17) {
                    c5.b bVar = this.f120114h;
                    if (bVar != null) {
                        java.util.HashMap hashMap = (java.util.HashMap) bVar.f120108c;
                        java.lang.Runnable runnable = (java.lang.Runnable) hashMap.remove(wVar.f379297a);
                        a5.o0 o0Var = bVar.f120107b;
                        if (runnable != null) {
                            ((b5.a) o0Var).f99364a.removeCallbacks(runnable);
                        }
                        c5.a aVar = new c5.a(bVar, wVar);
                        hashMap.put(wVar.f379297a, aVar);
                        ((b5.a) o0Var).f99364a.postDelayed(aVar, wVar.a() - java.lang.System.currentTimeMillis());
                    }
                } else if (wVar.b()) {
                    a5.f fVar = wVar.f379306j;
                    if (fVar.f82920c) {
                        a5.a0.c().a(f120109o, java.lang.String.format("Ignoring WorkSpec %s, Requires device idle.", wVar), new java.lang.Throwable[0]);
                    } else if (((java.util.HashSet) fVar.f82925h.f82929a).size() > 0) {
                        a5.a0.c().a(f120109o, java.lang.String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", wVar), new java.lang.Throwable[0]);
                    } else {
                        hashSet.add(wVar);
                        hashSet2.add(wVar.f379297a);
                    }
                } else {
                    a5.a0.c().a(f120109o, java.lang.String.format("Starting work for %s", wVar.f379297a), new java.lang.Throwable[0]);
                    this.f120111e.g(wVar.f379297a, null);
                }
            }
        }
        synchronized (this.f120116m) {
            if (!hashSet.isEmpty()) {
                a5.a0.c().a(f120109o, java.lang.String.format("Starting tracking for [%s]", android.text.TextUtils.join(",", hashSet2)), new java.lang.Throwable[0]);
                this.f120113g.addAll(hashSet);
                this.f120112f.b(this.f120113g);
            }
        }
    }

    @Override // f5.c
    public void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a5.a0.c().a(f120109o, java.lang.String.format("Constraints met: Scheduling work ID %s", str), new java.lang.Throwable[0]);
            this.f120111e.g(str, null);
        }
    }
}

package m7;

/* loaded from: classes13.dex */
public final class h implements m7.b, n7.g, m7.f {
    public static final boolean A = android.util.Log.isLoggable("Request", 2);

    /* renamed from: a, reason: collision with root package name */
    public final r7.k f405969a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f405970b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f405971c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p147xb1cd08cc.p148x5de23a5.f f405972d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f405973e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f405974f;

    /* renamed from: g, reason: collision with root package name */
    public final m7.a f405975g;

    /* renamed from: h, reason: collision with root package name */
    public final int f405976h;

    /* renamed from: i, reason: collision with root package name */
    public final int f405977i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p147xb1cd08cc.p148x5de23a5.g f405978j;

    /* renamed from: k, reason: collision with root package name */
    public final n7.h f405979k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f405980l;

    /* renamed from: m, reason: collision with root package name */
    public final o7.d f405981m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.Executor f405982n;

    /* renamed from: o, reason: collision with root package name */
    public w6.z0 f405983o;

    /* renamed from: p, reason: collision with root package name */
    public w6.f0 f405984p;

    /* renamed from: q, reason: collision with root package name */
    public long f405985q;

    /* renamed from: r, reason: collision with root package name */
    public volatile w6.g0 f405986r;

    /* renamed from: s, reason: collision with root package name */
    public m7.g f405987s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.Drawable f405988t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f405989u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f405990v;

    /* renamed from: w, reason: collision with root package name */
    public int f405991w;

    /* renamed from: x, reason: collision with root package name */
    public int f405992x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f405993y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.RuntimeException f405994z;

    public h(android.content.Context context, com.p147xb1cd08cc.p148x5de23a5.f fVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Class cls, m7.a aVar, int i17, int i18, com.p147xb1cd08cc.p148x5de23a5.g gVar, n7.h hVar, m7.d dVar, java.util.List list, m7.c cVar, w6.g0 g0Var, o7.d dVar2, java.util.concurrent.Executor executor) {
        if (A) {
            java.lang.String.valueOf(hashCode());
        }
        this.f405969a = new r7.j();
        this.f405970b = obj;
        this.f405971c = context;
        this.f405972d = fVar;
        this.f405973e = obj2;
        this.f405974f = cls;
        this.f405975g = aVar;
        this.f405976h = i17;
        this.f405977i = i18;
        this.f405978j = gVar;
        this.f405979k = hVar;
        this.f405980l = list;
        this.f405986r = g0Var;
        this.f405981m = dVar2;
        this.f405982n = executor;
        this.f405987s = m7.g.PENDING;
        if (this.f405994z == null && fVar.f125485h) {
            this.f405994z = new java.lang.RuntimeException("Glide request origin trace");
        }
    }

    public void a() {
        int i17;
        synchronized (this.f405970b) {
            try {
                if (this.f405993y) {
                    throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f405969a.a();
                int i18 = q7.j.f441834b;
                this.f405985q = android.os.SystemClock.elapsedRealtimeNanos();
                if (this.f405973e == null) {
                    if (q7.p.f(this.f405976h, this.f405977i)) {
                        this.f405991w = this.f405976h;
                        this.f405992x = this.f405977i;
                    }
                    if (this.f405990v == null) {
                        m7.a aVar = this.f405975g;
                        android.graphics.drawable.Drawable drawable = aVar.f405956u;
                        this.f405990v = drawable;
                        if (drawable == null && (i17 = aVar.f405957v) > 0) {
                            this.f405990v = h(i17);
                        }
                    }
                    i(new w6.t0("Received null model"), this.f405990v == null ? 5 : 3);
                    return;
                }
                m7.g gVar = this.f405987s;
                m7.g gVar2 = m7.g.RUNNING;
                if (gVar == gVar2) {
                    throw new java.lang.IllegalArgumentException("Cannot restart a running request");
                }
                if (gVar == m7.g.COMPLETE) {
                    k(this.f405983o, t6.a.MEMORY_CACHE);
                    return;
                }
                m7.g gVar3 = m7.g.WAITING_FOR_SIZE;
                this.f405987s = gVar3;
                if (q7.p.f(this.f405976h, this.f405977i)) {
                    l(this.f405976h, this.f405977i);
                } else {
                    this.f405979k.f(this);
                }
                m7.g gVar4 = this.f405987s;
                if (gVar4 == gVar2 || gVar4 == gVar3) {
                    this.f405979k.g(d());
                }
                if (A) {
                    q7.j.a(this.f405985q);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public final void b() {
        if (this.f405993y) {
            throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f405969a.a();
        this.f405979k.e(this);
        w6.f0 f0Var = this.f405984p;
        if (f0Var != null) {
            synchronized (f0Var.f524637c) {
                f0Var.f524635a.g(f0Var.f524636b);
            }
            this.f405984p = null;
        }
    }

    public void c() {
        synchronized (this.f405970b) {
            if (this.f405993y) {
                throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.f405969a.a();
            m7.g gVar = this.f405987s;
            m7.g gVar2 = m7.g.CLEARED;
            if (gVar == gVar2) {
                return;
            }
            b();
            w6.z0 z0Var = this.f405983o;
            if (z0Var != null) {
                this.f405983o = null;
            } else {
                z0Var = null;
            }
            this.f405979k.b(d());
            this.f405987s = gVar2;
            if (z0Var != null) {
                this.f405986r.d(z0Var);
            }
        }
    }

    public final android.graphics.drawable.Drawable d() {
        int i17;
        if (this.f405989u == null) {
            m7.a aVar = this.f405975g;
            android.graphics.drawable.Drawable drawable = aVar.f405948m;
            this.f405989u = drawable;
            if (drawable == null && (i17 = aVar.f405949n) > 0) {
                this.f405989u = h(i17);
            }
        }
        return this.f405989u;
    }

    public boolean e() {
        boolean z17;
        synchronized (this.f405970b) {
            z17 = this.f405987s == m7.g.COMPLETE;
        }
        return z17;
    }

    public boolean f(m7.b bVar) {
        int i17;
        int i18;
        java.lang.Object obj;
        java.lang.Class cls;
        m7.a aVar;
        com.p147xb1cd08cc.p148x5de23a5.g gVar;
        int size;
        int i19;
        int i27;
        java.lang.Object obj2;
        java.lang.Class cls2;
        m7.a aVar2;
        com.p147xb1cd08cc.p148x5de23a5.g gVar2;
        int size2;
        if (!(bVar instanceof m7.h)) {
            return false;
        }
        synchronized (this.f405970b) {
            i17 = this.f405976h;
            i18 = this.f405977i;
            obj = this.f405973e;
            cls = this.f405974f;
            aVar = this.f405975g;
            gVar = this.f405978j;
            java.util.List list = this.f405980l;
            size = list != null ? list.size() : 0;
        }
        m7.h hVar = (m7.h) bVar;
        synchronized (hVar.f405970b) {
            i19 = hVar.f405976h;
            i27 = hVar.f405977i;
            obj2 = hVar.f405973e;
            cls2 = hVar.f405974f;
            aVar2 = hVar.f405975g;
            gVar2 = hVar.f405978j;
            java.util.List list2 = hVar.f405980l;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i17 == i19 && i18 == i27) {
            char[] cArr = q7.p.f441843a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2) && aVar.m146892xb2c87fbf(aVar2) && gVar == gVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        boolean z17;
        synchronized (this.f405970b) {
            m7.g gVar = this.f405987s;
            z17 = gVar == m7.g.RUNNING || gVar == m7.g.WAITING_FOR_SIZE;
        }
        return z17;
    }

    public final android.graphics.drawable.Drawable h(int i17) {
        android.content.res.Resources.Theme theme = this.f405975g.A;
        if (theme == null) {
            theme = this.f405971c.getTheme();
        }
        com.p147xb1cd08cc.p148x5de23a5.f fVar = this.f405972d;
        return f7.a.a(fVar, fVar, i17, theme);
    }

    public final void i(w6.t0 t0Var, int i17) {
        int i18;
        int i19;
        this.f405969a.a();
        synchronized (this.f405970b) {
            t0Var.getClass();
            int i27 = this.f405972d.f125486i;
            if (i27 <= i17) {
                java.util.Objects.toString(this.f405973e);
                if (i27 <= 4) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    t0Var.a(t0Var, arrayList);
                    int size = arrayList.size();
                    int i28 = 0;
                    while (i28 < size) {
                        int i29 = i28 + 1;
                        i28 = i29;
                    }
                }
            }
            android.graphics.drawable.Drawable drawable = null;
            this.f405984p = null;
            this.f405987s = m7.g.FAILED;
            this.f405993y = true;
            try {
                java.util.List list = this.f405980l;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    if (it.hasNext()) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                        throw null;
                    }
                }
                if (this.f405973e == null) {
                    if (this.f405990v == null) {
                        m7.a aVar = this.f405975g;
                        android.graphics.drawable.Drawable drawable2 = aVar.f405956u;
                        this.f405990v = drawable2;
                        if (drawable2 == null && (i19 = aVar.f405957v) > 0) {
                            this.f405990v = h(i19);
                        }
                    }
                    drawable = this.f405990v;
                }
                if (drawable == null) {
                    if (this.f405988t == null) {
                        m7.a aVar2 = this.f405975g;
                        android.graphics.drawable.Drawable drawable3 = aVar2.f405946h;
                        this.f405988t = drawable3;
                        if (drawable3 == null && (i18 = aVar2.f405947i) > 0) {
                            this.f405988t = h(i18);
                        }
                    }
                    drawable = this.f405988t;
                }
                if (drawable == null) {
                    drawable = d();
                }
                this.f405979k.h(drawable);
                this.f405993y = false;
            } finally {
                this.f405993y = false;
            }
        }
    }

    public final void j(w6.z0 z0Var, java.lang.Object obj, t6.a aVar) {
        this.f405987s = m7.g.COMPLETE;
        this.f405983o = z0Var;
        if (this.f405972d.f125486i <= 3) {
            obj.getClass();
            java.util.Objects.toString(aVar);
            java.util.Objects.toString(this.f405973e);
            q7.j.a(this.f405985q);
        }
        this.f405993y = true;
        try {
            java.util.List list = this.f405980l;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                if (it.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                    throw null;
                }
            }
            this.f405981m.getClass();
            this.f405979k.c(obj, o7.b.f424759a);
        } finally {
            this.f405993y = false;
        }
    }

    public void k(w6.z0 z0Var, t6.a aVar) {
        this.f405969a.a();
        w6.z0 z0Var2 = null;
        try {
            synchronized (this.f405970b) {
                try {
                    this.f405984p = null;
                    if (z0Var == null) {
                        i(new w6.t0("Expected to receive a Resource<R> with an object of " + this.f405974f + " inside, but instead got null."), 5);
                        return;
                    }
                    java.lang.Object obj = z0Var.get();
                    if (obj != null && this.f405974f.isAssignableFrom(obj.getClass())) {
                        j(z0Var, obj, aVar);
                        return;
                    }
                    try {
                        this.f405983o = null;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Expected to receive an object of ");
                        sb6.append(this.f405974f);
                        sb6.append(" but instead got ");
                        sb6.append(obj != null ? obj.getClass() : "");
                        sb6.append("{");
                        sb6.append(obj);
                        sb6.append("} inside Resource{");
                        sb6.append(z0Var);
                        sb6.append("}.");
                        sb6.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        i(new w6.t0(sb6.toString()), 5);
                        this.f405986r.d(z0Var);
                    } catch (java.lang.Throwable th6) {
                        z0Var2 = z0Var;
                        th = th6;
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }
        } catch (java.lang.Throwable th8) {
            if (z0Var2 != null) {
                this.f405986r.d(z0Var2);
            }
            throw th8;
        }
    }

    public void l(int i17, int i18) {
        java.lang.Object obj;
        int i19 = i17;
        this.f405969a.a();
        java.lang.Object obj2 = this.f405970b;
        synchronized (obj2) {
            try {
                boolean z17 = A;
                if (z17) {
                    q7.j.a(this.f405985q);
                }
                if (this.f405987s == m7.g.WAITING_FOR_SIZE) {
                    m7.g gVar = m7.g.RUNNING;
                    this.f405987s = gVar;
                    float f17 = this.f405975g.f405943e;
                    if (i19 != Integer.MIN_VALUE) {
                        i19 = java.lang.Math.round(i19 * f17);
                    }
                    this.f405991w = i19;
                    this.f405992x = i18 == Integer.MIN_VALUE ? i18 : java.lang.Math.round(f17 * i18);
                    if (z17) {
                        q7.j.a(this.f405985q);
                    }
                    w6.g0 g0Var = this.f405986r;
                    com.p147xb1cd08cc.p148x5de23a5.f fVar = this.f405972d;
                    java.lang.Object obj3 = this.f405973e;
                    m7.a aVar = this.f405975g;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f405984p = g0Var.a(fVar, obj3, aVar.f405953r, this.f405991w, this.f405992x, aVar.f405960y, this.f405974f, this.f405978j, aVar.f405944f, aVar.f405959x, aVar.f405954s, aVar.E, aVar.f405958w, aVar.f405950o, aVar.C, aVar.F, aVar.D, this, this.f405982n);
                                if (this.f405987s != gVar) {
                                    this.f405984p = null;
                                }
                                if (z17) {
                                    q7.j.a(this.f405985q);
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                while (true) {
                                    try {
                                        break;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                    }
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        obj = obj2;
                    }
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                obj = obj2;
            }
        }
    }
}

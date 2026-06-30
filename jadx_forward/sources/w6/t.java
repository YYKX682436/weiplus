package w6;

/* loaded from: classes13.dex */
public class t implements w6.j, java.lang.Runnable, java.lang.Comparable, r7.f {
    public boolean A;
    public java.lang.Object B;
    public java.lang.Thread C;
    public t6.h D;
    public t6.h E;
    public java.lang.Object F;
    public t6.a G;
    public u6.e H;
    public volatile w6.k I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f524742J;
    public volatile boolean K;

    /* renamed from: g, reason: collision with root package name */
    public final w6.p f524746g;

    /* renamed from: h, reason: collision with root package name */
    public final m3.e f524747h;

    /* renamed from: n, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.f f524750n;

    /* renamed from: o, reason: collision with root package name */
    public t6.h f524751o;

    /* renamed from: p, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.g f524752p;

    /* renamed from: q, reason: collision with root package name */
    public w6.o0 f524753q;

    /* renamed from: r, reason: collision with root package name */
    public int f524754r;

    /* renamed from: s, reason: collision with root package name */
    public int f524755s;

    /* renamed from: t, reason: collision with root package name */
    public w6.z f524756t;

    /* renamed from: u, reason: collision with root package name */
    public t6.l f524757u;

    /* renamed from: v, reason: collision with root package name */
    public w6.m f524758v;

    /* renamed from: w, reason: collision with root package name */
    public int f524759w;

    /* renamed from: x, reason: collision with root package name */
    public w6.s f524760x;

    /* renamed from: y, reason: collision with root package name */
    public w6.r f524761y;

    /* renamed from: z, reason: collision with root package name */
    public long f524762z;

    /* renamed from: d, reason: collision with root package name */
    public final w6.l f524743d = new w6.l();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f524744e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final r7.k f524745f = new r7.j();

    /* renamed from: i, reason: collision with root package name */
    public final w6.o f524748i = new w6.o();

    /* renamed from: m, reason: collision with root package name */
    public final w6.q f524749m = new w6.q();

    public t(w6.p pVar, m3.e eVar) {
        this.f524746g = pVar;
        this.f524747h = eVar;
    }

    public final w6.z0 a(u6.e eVar, java.lang.Object obj, t6.a aVar) {
        if (obj == null) {
            eVar.h();
            return null;
        }
        try {
            int i17 = q7.j.f441834b;
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            w6.z0 d17 = d(obj, aVar);
            if (android.util.Log.isLoggable("DecodeJob", 2)) {
                d17.toString();
                q7.j.a(elapsedRealtimeNanos);
                java.util.Objects.toString(this.f524753q);
                java.lang.Thread.currentThread().getName();
            }
            return d17;
        } finally {
            eVar.h();
        }
    }

    @Override // w6.j
    public void b(t6.h hVar, java.lang.Object obj, u6.e eVar, t6.a aVar, t6.h hVar2) {
        this.D = hVar;
        this.F = obj;
        this.H = eVar;
        this.G = aVar;
        this.E = hVar2;
        if (java.lang.Thread.currentThread() == this.C) {
            k();
            return;
        }
        this.f524761y = w6.r.DECODE_DATA;
        w6.m0 m0Var = (w6.m0) this.f524758v;
        (m0Var.f524698t ? m0Var.f524693o : m0Var.f524699u ? m0Var.f524694p : m0Var.f524692n).execute(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w6.t tVar = (w6.t) obj;
        int ordinal = this.f524752p.ordinal() - tVar.f524752p.ordinal();
        return ordinal == 0 ? this.f524759w - tVar.f524759w : ordinal;
    }

    public final w6.z0 d(java.lang.Object obj, t6.a aVar) {
        u6.g b17;
        w6.w0 c17 = this.f524743d.c(obj.getClass());
        t6.l lVar = this.f524757u;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            boolean z17 = aVar == t6.a.RESOURCE_DISK_CACHE || this.f524743d.f524683r;
            t6.k kVar = d7.y.f308387i;
            java.lang.Boolean bool = (java.lang.Boolean) lVar.c(kVar);
            if (bool == null || (bool.booleanValue() && !z17)) {
                lVar = new t6.l();
                lVar.f497506b.i(this.f524757u.f497506b);
                lVar.f497506b.put(kVar, java.lang.Boolean.valueOf(z17));
            }
        }
        t6.l lVar2 = lVar;
        u6.j jVar = this.f524750n.f125479b.f125496e;
        synchronized (jVar) {
            u6.f fVar = (u6.f) ((java.util.HashMap) jVar.f506382a).get(obj.getClass());
            if (fVar == null) {
                java.util.Iterator it = ((java.util.HashMap) jVar.f506382a).values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u6.f fVar2 = (u6.f) it.next();
                    if (fVar2.a().isAssignableFrom(obj.getClass())) {
                        fVar = fVar2;
                        break;
                    }
                }
            }
            if (fVar == null) {
                fVar = u6.j.f506381b;
            }
            b17 = fVar.b(obj);
        }
        try {
            return c17.a(b17, lVar2, this.f524754r, this.f524755s, new w6.n(this, aVar));
        } finally {
            b17.h();
        }
    }

    @Override // r7.f
    public r7.k h() {
        return this.f524745f;
    }

    @Override // w6.j
    public void i() {
        this.f524761y = w6.r.SWITCH_TO_SOURCE_SERVICE;
        w6.m0 m0Var = (w6.m0) this.f524758v;
        (m0Var.f524698t ? m0Var.f524693o : m0Var.f524699u ? m0Var.f524694p : m0Var.f524692n).execute(this);
    }

    @Override // w6.j
    public void j(t6.h hVar, java.lang.Exception exc, u6.e eVar, t6.a aVar) {
        eVar.h();
        w6.t0 t0Var = new w6.t0("Fetching data failed", java.util.Collections.singletonList(exc));
        java.lang.Class a17 = eVar.a();
        t0Var.f524765e = hVar;
        t0Var.f524766f = aVar;
        t0Var.f524767g = a17;
        ((java.util.ArrayList) this.f524744e).add(t0Var);
        if (java.lang.Thread.currentThread() == this.C) {
            p();
            return;
        }
        this.f524761y = w6.r.SWITCH_TO_SOURCE_SERVICE;
        w6.m0 m0Var = (w6.m0) this.f524758v;
        (m0Var.f524698t ? m0Var.f524693o : m0Var.f524699u ? m0Var.f524694p : m0Var.f524692n).execute(this);
    }

    public final void k() {
        w6.z0 z0Var;
        boolean a17;
        if (android.util.Log.isLoggable("DecodeJob", 2)) {
            long j17 = this.f524762z;
            java.lang.String str = "data: " + this.F + ", cache key: " + this.D + ", fetcher: " + this.H;
            q7.j.a(j17);
            java.util.Objects.toString(this.f524753q);
            if (str != null) {
                ", ".concat(str);
            }
            java.lang.Thread.currentThread().getName();
        }
        w6.y0 y0Var = null;
        try {
            z0Var = a(this.H, this.F, this.G);
        } catch (w6.t0 e17) {
            t6.h hVar = this.E;
            t6.a aVar = this.G;
            e17.f524765e = hVar;
            e17.f524766f = aVar;
            e17.f524767g = null;
            ((java.util.ArrayList) this.f524744e).add(e17);
            z0Var = null;
        }
        if (z0Var == null) {
            p();
            return;
        }
        t6.a aVar2 = this.G;
        if (z0Var instanceof w6.u0) {
            ((w6.u0) z0Var).mo123606x33ebcb90();
        }
        if (this.f524748i.f524709c != null) {
            y0Var = (w6.y0) ((r7.e) w6.y0.f524779h).a();
            q7.n.b(y0Var);
            y0Var.f524783g = false;
            y0Var.f524782f = true;
            y0Var.f524781e = z0Var;
            z0Var = y0Var;
        }
        s();
        w6.m0 m0Var = (w6.m0) this.f524758v;
        synchronized (m0Var) {
            m0Var.f524701w = z0Var;
            m0Var.f524702x = aVar2;
        }
        synchronized (m0Var) {
            m0Var.f524686e.a();
            if (m0Var.D) {
                m0Var.f524701w.mo14474x408b7293();
                m0Var.f();
            } else {
                if (m0Var.f524685d.f524684d.isEmpty()) {
                    throw new java.lang.IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (m0Var.f524703y) {
                    throw new java.lang.IllegalStateException("Already have resource");
                }
                w6.j0 j0Var = m0Var.f524689h;
                w6.z0 z0Var2 = m0Var.f524701w;
                boolean z17 = m0Var.f524697s;
                t6.h hVar2 = m0Var.f524696r;
                w6.q0 q0Var = m0Var.f524687f;
                j0Var.getClass();
                m0Var.B = new w6.r0(z0Var2, z17, true, hVar2, q0Var);
                m0Var.f524703y = true;
                w6.l0 l0Var = m0Var.f524685d;
                l0Var.getClass();
                java.util.ArrayList<w6.k0> arrayList = new java.util.ArrayList(l0Var.f524684d);
                m0Var.d(arrayList.size() + 1);
                t6.h hVar3 = m0Var.f524696r;
                w6.r0 r0Var = m0Var.B;
                w6.g0 g0Var = (w6.g0) m0Var.f524690i;
                synchronized (g0Var) {
                    if (r0Var != null) {
                        if (r0Var.f524726d) {
                            g0Var.f524654g.a(hVar3, r0Var);
                        }
                    }
                    w6.v0 v0Var = g0Var.f524648a;
                    v0Var.getClass();
                    java.util.Map map = m0Var.f524700v ? v0Var.f524775b : v0Var.f524774a;
                    if (m0Var.equals(map.get(hVar3))) {
                        map.remove(hVar3);
                    }
                }
                for (w6.k0 k0Var : arrayList) {
                    k0Var.f524665b.execute(new w6.i0(m0Var, k0Var.f524664a));
                }
                m0Var.c();
            }
        }
        this.f524760x = w6.s.ENCODE;
        try {
            w6.o oVar = this.f524748i;
            if (oVar.f524709c != null) {
                w6.p pVar = this.f524746g;
                t6.l lVar = this.f524757u;
                oVar.getClass();
                try {
                    ((w6.e0) pVar).a().b(oVar.f524707a, new w6.i(oVar.f524708b, oVar.f524709c, lVar));
                    oVar.f524709c.b();
                } catch (java.lang.Throwable th6) {
                    oVar.f524709c.b();
                    throw th6;
                }
            }
            w6.q qVar = this.f524749m;
            synchronized (qVar) {
                qVar.f524720b = true;
                a17 = qVar.a(false);
            }
            if (a17) {
                o();
            }
        } finally {
            if (y0Var != null) {
                y0Var.b();
            }
        }
    }

    public final w6.k l() {
        int ordinal = this.f524760x.ordinal();
        w6.l lVar = this.f524743d;
        if (ordinal == 1) {
            return new w6.a1(lVar, this);
        }
        if (ordinal == 2) {
            return new w6.g(lVar.a(), lVar, this);
        }
        if (ordinal == 3) {
            return new w6.e1(lVar, this);
        }
        if (ordinal == 5) {
            return null;
        }
        throw new java.lang.IllegalStateException("Unrecognized stage: " + this.f524760x);
    }

    public final w6.s m(w6.s sVar) {
        int ordinal = sVar.ordinal();
        if (ordinal == 0) {
            boolean b17 = this.f524756t.b();
            w6.s sVar2 = w6.s.RESOURCE_CACHE;
            return b17 ? sVar2 : m(sVar2);
        }
        if (ordinal == 1) {
            boolean a17 = this.f524756t.a();
            w6.s sVar3 = w6.s.DATA_CACHE;
            return a17 ? sVar3 : m(sVar3);
        }
        w6.s sVar4 = w6.s.FINISHED;
        if (ordinal == 2) {
            return this.A ? sVar4 : w6.s.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return sVar4;
        }
        throw new java.lang.IllegalArgumentException("Unrecognized stage: " + sVar);
    }

    public final void n() {
        boolean a17;
        s();
        w6.t0 t0Var = new w6.t0("Failed to load resource", new java.util.ArrayList(this.f524744e));
        w6.m0 m0Var = (w6.m0) this.f524758v;
        synchronized (m0Var) {
            m0Var.f524704z = t0Var;
        }
        synchronized (m0Var) {
            m0Var.f524686e.a();
            if (m0Var.D) {
                m0Var.f();
            } else {
                if (m0Var.f524685d.f524684d.isEmpty()) {
                    throw new java.lang.IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (m0Var.A) {
                    throw new java.lang.IllegalStateException("Already failed once");
                }
                m0Var.A = true;
                t6.h hVar = m0Var.f524696r;
                w6.l0 l0Var = m0Var.f524685d;
                l0Var.getClass();
                java.util.ArrayList<w6.k0> arrayList = new java.util.ArrayList(l0Var.f524684d);
                m0Var.d(arrayList.size() + 1);
                w6.g0 g0Var = (w6.g0) m0Var.f524690i;
                synchronized (g0Var) {
                    w6.v0 v0Var = g0Var.f524648a;
                    v0Var.getClass();
                    java.util.Map map = m0Var.f524700v ? v0Var.f524775b : v0Var.f524774a;
                    if (m0Var.equals(map.get(hVar))) {
                        map.remove(hVar);
                    }
                }
                for (w6.k0 k0Var : arrayList) {
                    k0Var.f524665b.execute(new w6.h0(m0Var, k0Var.f524664a));
                }
                m0Var.c();
            }
        }
        w6.q qVar = this.f524749m;
        synchronized (qVar) {
            qVar.f524721c = true;
            a17 = qVar.a(false);
        }
        if (a17) {
            o();
        }
    }

    public final void o() {
        w6.q qVar = this.f524749m;
        synchronized (qVar) {
            qVar.f524720b = false;
            qVar.f524719a = false;
            qVar.f524721c = false;
        }
        w6.o oVar = this.f524748i;
        oVar.f524707a = null;
        oVar.f524708b = null;
        oVar.f524709c = null;
        w6.l lVar = this.f524743d;
        lVar.f524668c = null;
        lVar.f524669d = null;
        lVar.f524679n = null;
        lVar.f524672g = null;
        lVar.f524676k = null;
        lVar.f524674i = null;
        lVar.f524680o = null;
        lVar.f524675j = null;
        lVar.f524681p = null;
        ((java.util.ArrayList) lVar.f524666a).clear();
        lVar.f524677l = false;
        ((java.util.ArrayList) lVar.f524667b).clear();
        lVar.f524678m = false;
        this.f524742J = false;
        this.f524750n = null;
        this.f524751o = null;
        this.f524757u = null;
        this.f524752p = null;
        this.f524753q = null;
        this.f524758v = null;
        this.f524760x = null;
        this.I = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.f524762z = 0L;
        this.K = false;
        this.B = null;
        ((java.util.ArrayList) this.f524744e).clear();
        this.f524747h.b(this);
    }

    public final void p() {
        this.C = java.lang.Thread.currentThread();
        int i17 = q7.j.f441834b;
        this.f524762z = android.os.SystemClock.elapsedRealtimeNanos();
        boolean z17 = false;
        while (!this.K && this.I != null && !(z17 = this.I.a())) {
            this.f524760x = m(this.f524760x);
            this.I = l();
            if (this.f524760x == w6.s.SOURCE) {
                i();
                return;
            }
        }
        if ((this.f524760x == w6.s.FINISHED || this.K) && !z17) {
            n();
        }
    }

    public final void r() {
        int ordinal = this.f524761y.ordinal();
        if (ordinal == 0) {
            this.f524760x = m(w6.s.INITIALIZE);
            this.I = l();
            p();
        } else if (ordinal == 1) {
            p();
        } else if (ordinal == 2) {
            k();
        } else {
            throw new java.lang.IllegalStateException("Unrecognized run reason: " + this.f524761y);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        u6.e eVar = this.H;
        try {
            try {
                if (this.K) {
                    n();
                } else {
                    r();
                    if (eVar != null) {
                        eVar.h();
                    }
                }
            } finally {
                if (eVar != null) {
                    eVar.h();
                }
            }
        } catch (w6.f e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            if (android.util.Log.isLoggable("DecodeJob", 3)) {
                java.util.Objects.toString(this.f524760x);
            }
            if (this.f524760x != w6.s.ENCODE) {
                ((java.util.ArrayList) this.f524744e).add(th6);
                n();
            }
            if (!this.K) {
                throw th6;
            }
            throw th6;
        }
    }

    public final void s() {
        java.lang.Throwable th6;
        this.f524745f.a();
        if (!this.f524742J) {
            this.f524742J = true;
            return;
        }
        if (((java.util.ArrayList) this.f524744e).isEmpty()) {
            th6 = null;
        } else {
            java.util.List list = this.f524744e;
            th6 = (java.lang.Throwable) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1);
        }
        throw new java.lang.IllegalStateException("Already notified", th6);
    }
}

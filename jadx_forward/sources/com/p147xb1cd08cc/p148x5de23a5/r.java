package com.p147xb1cd08cc.p148x5de23a5;

/* loaded from: classes13.dex */
public class r implements android.content.ComponentCallbacks2, j7.k {

    /* renamed from: r, reason: collision with root package name */
    public static final m7.e f125514r;

    /* renamed from: d, reason: collision with root package name */
    public final com.p147xb1cd08cc.p148x5de23a5.c f125515d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f125516e;

    /* renamed from: f, reason: collision with root package name */
    public final j7.j f125517f;

    /* renamed from: g, reason: collision with root package name */
    public final j7.s f125518g;

    /* renamed from: h, reason: collision with root package name */
    public final j7.r f125519h;

    /* renamed from: i, reason: collision with root package name */
    public final j7.u f125520i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f125521m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f125522n;

    /* renamed from: o, reason: collision with root package name */
    public final j7.d f125523o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f125524p;

    /* renamed from: q, reason: collision with root package name */
    public m7.e f125525q;

    static {
        m7.e eVar = (m7.e) new m7.e().c(android.graphics.Bitmap.class);
        eVar.f405961z = true;
        f125514r = eVar;
        ((m7.e) new m7.e().c(h7.f.class)).f405961z = true;
    }

    public r(com.p147xb1cd08cc.p148x5de23a5.c cVar, j7.j jVar, j7.r rVar, android.content.Context context) {
        m7.e eVar;
        j7.s sVar = new j7.s();
        j7.e eVar2 = cVar.f125461m;
        this.f125520i = new j7.u();
        com.p147xb1cd08cc.p148x5de23a5.p pVar = new com.p147xb1cd08cc.p148x5de23a5.p(this);
        this.f125521m = pVar;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f125522n = handler;
        this.f125515d = cVar;
        this.f125517f = jVar;
        this.f125519h = rVar;
        this.f125518g = sVar;
        this.f125516e = context;
        android.content.Context applicationContext = context.getApplicationContext();
        com.p147xb1cd08cc.p148x5de23a5.q qVar = new com.p147xb1cd08cc.p148x5de23a5.q(this, sVar);
        ((j7.h) eVar2).getClass();
        boolean z17 = b3.l.m9698x3fed0563(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        android.util.Log.isLoggable("ConnectivityMonitor", 3);
        j7.d gVar = z17 ? new j7.g(applicationContext, qVar) : new j7.l();
        this.f125523o = gVar;
        char[] cArr = q7.p.f441843a;
        if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
            handler.post(pVar);
        } else {
            jVar.b(this);
        }
        jVar.b(gVar);
        this.f125524p = new java.util.concurrent.CopyOnWriteArrayList(cVar.f125457f.f125482e);
        com.p147xb1cd08cc.p148x5de23a5.f fVar = cVar.f125457f;
        synchronized (fVar) {
            if (fVar.f125487j == null) {
                ((com.p147xb1cd08cc.p148x5de23a5.d) fVar.f125481d).getClass();
                m7.e eVar3 = new m7.e();
                eVar3.f405961z = true;
                fVar.f125487j = eVar3;
            }
            eVar = fVar.f125487j;
        }
        synchronized (this) {
            m7.e eVar4 = (m7.e) eVar.mo15459x5a5dd5d();
            if (eVar4.f405961z && !eVar4.B) {
                throw new java.lang.IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar4.B = true;
            eVar4.f405961z = true;
            this.f125525q = eVar4;
        }
        synchronized (cVar.f125462n) {
            if (((java.util.ArrayList) cVar.f125462n).contains(this)) {
                throw new java.lang.IllegalStateException("Cannot register already registered manager");
            }
            ((java.util.ArrayList) cVar.f125462n).add(this);
        }
    }

    public void i(n7.h hVar) {
        boolean z17;
        if (hVar == null) {
            return;
        }
        boolean k17 = k(hVar);
        m7.b a17 = hVar.a();
        if (k17) {
            return;
        }
        com.p147xb1cd08cc.p148x5de23a5.c cVar = this.f125515d;
        synchronized (cVar.f125462n) {
            java.util.Iterator it = ((java.util.ArrayList) cVar.f125462n).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (((com.p147xb1cd08cc.p148x5de23a5.r) it.next()).k(hVar)) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17 || a17 == null) {
            return;
        }
        hVar.d(null);
        ((m7.h) a17).c();
    }

    public synchronized void j() {
        j7.s sVar = this.f125518g;
        sVar.f379559c = true;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(sVar.f379557a)).iterator();
        while (it.hasNext()) {
            m7.h hVar = (m7.h) ((m7.b) it.next());
            if (hVar.g()) {
                synchronized (hVar.f405970b) {
                    if (hVar.g()) {
                        hVar.c();
                    }
                }
                ((java.util.ArrayList) sVar.f379558b).add(hVar);
            }
        }
    }

    public synchronized boolean k(n7.h hVar) {
        m7.b a17 = hVar.a();
        if (a17 == null) {
            return true;
        }
        if (!this.f125518g.a(a17)) {
            return false;
        }
        this.f125520i.f379561d.remove(hVar);
        hVar.d(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // j7.k
    /* renamed from: onDestroy */
    public synchronized void mo15461xac79a11b() {
        this.f125520i.mo15461xac79a11b();
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f125520i.f379561d)).iterator();
        while (it.hasNext()) {
            i((n7.h) it.next());
        }
        this.f125520i.f379561d.clear();
        j7.s sVar = this.f125518g;
        java.util.Iterator it6 = ((java.util.ArrayList) q7.p.d(sVar.f379557a)).iterator();
        while (it6.hasNext()) {
            sVar.a((m7.b) it6.next());
        }
        ((java.util.ArrayList) sVar.f379558b).clear();
        this.f125517f.a(this);
        this.f125517f.a(this.f125523o);
        this.f125522n.removeCallbacks(this.f125521m);
        this.f125515d.c(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // j7.k
    /* renamed from: onStart */
    public synchronized void mo15462xb05099c3() {
        synchronized (this) {
            this.f125518g.c();
        }
        this.f125520i.mo15462xb05099c3();
    }

    @Override // j7.k
    /* renamed from: onStop */
    public synchronized void mo15463xc39f8281() {
        j();
        this.f125520i.mo15463xc39f8281();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
    }

    /* renamed from: toString */
    public synchronized java.lang.String m15464x9616526c() {
        return super.toString() + "{tracker=" + this.f125518g + ", treeNode=" + this.f125519h + "}";
    }
}

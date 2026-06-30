package com.bumptech.glide;

/* loaded from: classes13.dex */
public class r implements android.content.ComponentCallbacks2, j7.k {

    /* renamed from: r, reason: collision with root package name */
    public static final m7.e f43981r;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.c f43982d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f43983e;

    /* renamed from: f, reason: collision with root package name */
    public final j7.j f43984f;

    /* renamed from: g, reason: collision with root package name */
    public final j7.s f43985g;

    /* renamed from: h, reason: collision with root package name */
    public final j7.r f43986h;

    /* renamed from: i, reason: collision with root package name */
    public final j7.u f43987i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f43988m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f43989n;

    /* renamed from: o, reason: collision with root package name */
    public final j7.d f43990o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f43991p;

    /* renamed from: q, reason: collision with root package name */
    public m7.e f43992q;

    static {
        m7.e eVar = (m7.e) new m7.e().c(android.graphics.Bitmap.class);
        eVar.f324428z = true;
        f43981r = eVar;
        ((m7.e) new m7.e().c(h7.f.class)).f324428z = true;
    }

    public r(com.bumptech.glide.c cVar, j7.j jVar, j7.r rVar, android.content.Context context) {
        m7.e eVar;
        j7.s sVar = new j7.s();
        j7.e eVar2 = cVar.f43928m;
        this.f43987i = new j7.u();
        com.bumptech.glide.p pVar = new com.bumptech.glide.p(this);
        this.f43988m = pVar;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f43989n = handler;
        this.f43982d = cVar;
        this.f43984f = jVar;
        this.f43986h = rVar;
        this.f43985g = sVar;
        this.f43983e = context;
        android.content.Context applicationContext = context.getApplicationContext();
        com.bumptech.glide.q qVar = new com.bumptech.glide.q(this, sVar);
        ((j7.h) eVar2).getClass();
        boolean z17 = b3.l.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        android.util.Log.isLoggable("ConnectivityMonitor", 3);
        j7.d gVar = z17 ? new j7.g(applicationContext, qVar) : new j7.l();
        this.f43990o = gVar;
        char[] cArr = q7.p.f360310a;
        if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
            handler.post(pVar);
        } else {
            jVar.b(this);
        }
        jVar.b(gVar);
        this.f43991p = new java.util.concurrent.CopyOnWriteArrayList(cVar.f43924f.f43949e);
        com.bumptech.glide.f fVar = cVar.f43924f;
        synchronized (fVar) {
            if (fVar.f43954j == null) {
                ((com.bumptech.glide.d) fVar.f43948d).getClass();
                m7.e eVar3 = new m7.e();
                eVar3.f324428z = true;
                fVar.f43954j = eVar3;
            }
            eVar = fVar.f43954j;
        }
        synchronized (this) {
            m7.e eVar4 = (m7.e) eVar.clone();
            if (eVar4.f324428z && !eVar4.B) {
                throw new java.lang.IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar4.B = true;
            eVar4.f324428z = true;
            this.f43992q = eVar4;
        }
        synchronized (cVar.f43929n) {
            if (((java.util.ArrayList) cVar.f43929n).contains(this)) {
                throw new java.lang.IllegalStateException("Cannot register already registered manager");
            }
            ((java.util.ArrayList) cVar.f43929n).add(this);
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
        com.bumptech.glide.c cVar = this.f43982d;
        synchronized (cVar.f43929n) {
            java.util.Iterator it = ((java.util.ArrayList) cVar.f43929n).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (((com.bumptech.glide.r) it.next()).k(hVar)) {
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
        j7.s sVar = this.f43985g;
        sVar.f298026c = true;
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(sVar.f298024a)).iterator();
        while (it.hasNext()) {
            m7.h hVar = (m7.h) ((m7.b) it.next());
            if (hVar.g()) {
                synchronized (hVar.f324437b) {
                    if (hVar.g()) {
                        hVar.c();
                    }
                }
                ((java.util.ArrayList) sVar.f298025b).add(hVar);
            }
        }
    }

    public synchronized boolean k(n7.h hVar) {
        m7.b a17 = hVar.a();
        if (a17 == null) {
            return true;
        }
        if (!this.f43985g.a(a17)) {
            return false;
        }
        this.f43987i.f298028d.remove(hVar);
        hVar.d(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // j7.k
    public synchronized void onDestroy() {
        this.f43987i.onDestroy();
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f43987i.f298028d)).iterator();
        while (it.hasNext()) {
            i((n7.h) it.next());
        }
        this.f43987i.f298028d.clear();
        j7.s sVar = this.f43985g;
        java.util.Iterator it6 = ((java.util.ArrayList) q7.p.d(sVar.f298024a)).iterator();
        while (it6.hasNext()) {
            sVar.a((m7.b) it6.next());
        }
        ((java.util.ArrayList) sVar.f298025b).clear();
        this.f43984f.a(this);
        this.f43984f.a(this.f43990o);
        this.f43989n.removeCallbacks(this.f43988m);
        this.f43982d.c(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // j7.k
    public synchronized void onStart() {
        synchronized (this) {
            this.f43985g.c();
        }
        this.f43987i.onStart();
    }

    @Override // j7.k
    public synchronized void onStop() {
        j();
        this.f43987i.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
    }

    public synchronized java.lang.String toString() {
        return super.toString() + "{tracker=" + this.f43985g + ", treeNode=" + this.f43986h + "}";
    }
}

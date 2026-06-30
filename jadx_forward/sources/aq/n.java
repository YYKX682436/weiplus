package aq;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public int f94441c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f94443e;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f94445g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f94446h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f94447i;

    /* renamed from: j, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f94448j;

    /* renamed from: a, reason: collision with root package name */
    public volatile aq.b f94439a = aq.b.f94368d;

    /* renamed from: b, reason: collision with root package name */
    public volatile fn5.p0 f94440b = fn5.p0.f346280d;

    /* renamed from: d, reason: collision with root package name */
    public int f94442d = -2;

    /* renamed from: f, reason: collision with root package name */
    public final o75.a f94444f = new aq.e(this);

    public n() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(aq.c.f94375d);
        this.f94445g = j0Var;
        this.f94446h = j0Var;
    }

    public final void a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f94441c = 0;
        this.f94442d = -2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addClsDbObserver >> dataType: ");
        sb6.append(this.f94439a);
        sb6.append(", currentIdentifyType: ");
        aq.r0 r0Var = aq.r0.f94473a;
        sb6.append(aq.r0.f94486n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", sb6.toString());
        if (this.f94439a == aq.b.f94369e || aq.r0.f94486n == aq.c.f94378g) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "go to addClsDbObserver");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class)).Q6(activity, this.f94444f);
    }

    public final void b(o75.c cVar) {
        java.util.HashMap hashMap;
        p012xc85e97e9.p093xedfae76a.c1 a17;
        o75.b bVar = cVar.f425120a;
        o75.b bVar2 = o75.b.f425114b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425115c)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.g3 g3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g3) cVar.f425123d;
            if (g3Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "observe insert cls >> labelId: " + g3Var.f66224xa8fb27eb + ", cropLabelId: " + g3Var.f66221x22f9ac90);
                return;
            }
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425116d)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425117e)) {
                return;
            } else {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar, o75.b.f425118f) || (hashMap = cVar.f425124e) == null) {
                    return;
                }
                java.util.Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    b((o75.c) ((java.util.Map.Entry) it.next()).getValue());
                }
                return;
            }
        }
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.g3) cVar.f425123d) != null) {
            java.lang.String str = aq.o.f94454b;
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
            }
            java.util.List Y6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class)).Y6(str, "0", 0, 1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isExitNoRecImage >> ");
            sb6.append(str);
            sb6.append(' ');
            java.util.ArrayList arrayList = (java.util.ArrayList) Y6;
            sb6.append(!arrayList.isEmpty());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", sb6.toString());
            pm0.v.X(new aq.k(this, !arrayList.isEmpty()));
        }
    }

    public final java.lang.Object c(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17 = this.f94443e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "startIdentify >> isDoingWork");
            return f0Var;
        }
        this.f94443e = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f65.p.f341468b = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setStartTimeStamp >> " + currentTimeMillis);
        f65.m.f341430b = currentTimeMillis;
        f65.p.f341483q = (long) 2;
        f65.p.f341472f = arrayList.size();
        f65.p.f341473g = arrayList2.size();
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "startIdentifyWithNoRecData >> no new image need to rec");
            this.f94439a = aq.b.f94369e;
            this.f94445g.mo7808x76db6cb1(aq.c.f94378g);
            f65.p.f341467a.a(6, 0, 0L);
            return f0Var;
        }
        this.f94439a = aq.b.f94370f;
        this.f94445g.mo7808x76db6cb1(aq.c.f94376e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "startIdentifyWithNoRecData >> data: " + arrayList.size() + " oldNoRecData: " + arrayList2.size() + ", " + java.lang.Thread.currentThread());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.c((com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next(), aq.o.f94454b);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new aq.l(arrayList, arrayList2, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : f0Var;
    }

    public final void d() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "stopCurrentRoomIdentify");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.n8.class);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h3 h3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.h3) ((com.p314xaae8f345.mm.p2621x8fb0427b.n8) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.h3.class);
        if (h3Var.P6().m127122xc01c0f90()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "removeClsDbObserver");
            o75.a observer = this.f94444f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
            h3Var.P6().mo127128xb5bdeb7a(observer);
        }
        this.f94447i = null;
        this.f94448j = null;
    }
}

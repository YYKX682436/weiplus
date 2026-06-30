package ye1;

/* loaded from: classes15.dex */
public abstract class a implements ye1.r {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f542696b;

    /* renamed from: c, reason: collision with root package name */
    public ye1.l f542697c;

    /* renamed from: d, reason: collision with root package name */
    public ye1.j f542698d;

    /* renamed from: e, reason: collision with root package name */
    public ye1.m f542699e;

    /* renamed from: f, reason: collision with root package name */
    public ye1.g f542700f;

    /* renamed from: g, reason: collision with root package name */
    public ye1.n f542701g;

    /* renamed from: h, reason: collision with root package name */
    public ye1.f f542702h;

    /* renamed from: i, reason: collision with root package name */
    public ye1.q f542703i;

    /* renamed from: j, reason: collision with root package name */
    public ye1.p f542704j;

    /* renamed from: k, reason: collision with root package name */
    public ye1.i f542705k;

    /* renamed from: l, reason: collision with root package name */
    public ye1.k f542706l;

    /* renamed from: m, reason: collision with root package name */
    public ye1.o f542707m;

    /* renamed from: a, reason: collision with root package name */
    public int f542695a = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f542708n = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f542709o = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Set f542710p = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    @Override // ye1.r
    public void A(ye1.n nVar) {
        this.f542709o.add(nVar);
    }

    @Override // ye1.e
    public void B(ye1.m mVar) {
        this.f542699e = mVar;
    }

    @Override // ye1.s
    public void C(long j17) {
    }

    public void D(int i17) {
        synchronized (this) {
            if (this.f542696b) {
                return;
            }
            ye1.f fVar = this.f542702h;
            if (fVar != null) {
                fVar.a(this, i17);
            }
        }
    }

    public void E() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnCompletion");
        synchronized (this) {
            if (this.f542696b) {
                return;
            }
            ye1.g gVar = this.f542700f;
            if (gVar != null) {
                gVar.a(this);
            }
            java.util.Iterator it = this.f542710p.iterator();
            while (it.hasNext()) {
                ((ye1.g) it.next()).a(this);
            }
        }
    }

    public void F(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnDownStreamChanged, selectIndex:%s", str);
        synchronized (this) {
            if (this.f542696b) {
                return;
            }
            ye1.i iVar = this.f542705k;
            if (iVar != null) {
                ((dy4.h0) iVar).a(str);
            }
        }
    }

    public boolean G(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            if (this.f542696b) {
                return false;
            }
            ye1.j jVar = this.f542698d;
            return jVar != null && jVar.a(this, i17, i18);
        }
    }

    public void H(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnHitPreloadChange");
        synchronized (this) {
            if (this.f542696b) {
                return;
            }
            ye1.k kVar = this.f542706l;
            if (kVar != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                boolean booleanValue = valueOf.booleanValue();
                dy4.f1 f1Var = ((dy4.i0) kVar).f326199a;
                java.lang.String x17 = f1Var.x();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHitPreload:");
                sb6.append(booleanValue);
                sb6.append("  fileId:");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a;
                sb6.append(pVar.a(f1Var.D));
                sb6.append("   preloadSize:");
                sb6.append(pVar.b(pVar.a(f1Var.D)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x17, sb6.toString());
                if (booleanValue) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 54L, 1L, false);
                    return;
                }
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 55L, 1L, false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 56L, 1L, false);
                }
                if (pVar.b(pVar.a(f1Var.D)) > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 57L, 1L, false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 58L, 1L, false);
                }
            }
        }
    }

    public boolean I(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnInfo, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            if (this.f542696b) {
                return false;
            }
            ye1.l lVar = this.f542697c;
            return lVar != null && lVar.a(this, i17, i18);
        }
    }

    public void J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnPrepared");
        synchronized (this) {
            if (this.f542696b) {
                return;
            }
            ye1.m mVar = this.f542699e;
            if (mVar != null) {
                mVar.a(this);
            }
            java.util.Iterator it = this.f542708n.iterator();
            while (it.hasNext()) {
                ((ye1.m) it.next()).a(this);
            }
        }
    }

    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnSeekComplete");
        synchronized (this) {
            if (this.f542696b) {
                return;
            }
            ye1.n nVar = this.f542701g;
            if (nVar != null) {
                nVar.a(this);
            }
            java.util.Iterator it = this.f542709o.iterator();
            while (it.hasNext()) {
                ((ye1.n) it.next()).a(this);
            }
        }
    }

    public void L(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnVideoSizeChanged, width:%d, height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            if (this.f542696b) {
                return;
            }
            ye1.q qVar = this.f542703i;
            if (qVar != null) {
                qVar.a(this, i17, i18);
            }
        }
    }

    @Override // ye1.r
    public void a(ye1.m mVar) {
        this.f542708n.add(mVar);
    }

    @Override // ye1.e
    public void d(ye1.f fVar) {
        this.f542702h = fVar;
    }

    @Override // ye1.r
    public void e(ye1.g gVar) {
        this.f542710p.add(gVar);
    }

    @Override // ye1.e
    public void g(ye1.q qVar) {
        this.f542703i = qVar;
    }

    @Override // ye1.e
    /* renamed from: getState */
    public int mo53293x75286adb() {
        return this.f542695a;
    }

    @Override // ye1.e
    public void h(ye1.n nVar) {
        this.f542701g = nVar;
    }

    @Override // ye1.e
    public void i(ye1.o oVar) {
        this.f542707m = oVar;
    }

    @Override // ye1.e
    public void j(boolean z17) {
        G(-1010, -1010);
    }

    @Override // ye1.e
    public void k(ye1.k kVar) {
        this.f542706l = kVar;
    }

    @Override // ye1.e
    public void n(double d17) {
        G(-1010, -1010);
    }

    @Override // ye1.s
    public void o(org.json.JSONObject jSONObject) {
    }

    @Override // ye1.e
    public void p(ye1.l lVar) {
        this.f542697c = lVar;
    }

    @Override // ye1.e
    public void q(ye1.i iVar) {
        this.f542705k = iVar;
    }

    @Override // ye1.e
    public void r(ye1.j jVar) {
        this.f542698d = jVar;
    }

    @Override // ye1.e
    public void s(ye1.p pVar) {
        this.f542704j = pVar;
    }

    @Override // ye1.s
    /* renamed from: setAppId */
    public void mo53294x52b73fda(java.lang.String str) {
    }

    @Override // ye1.e
    public void t(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        G(-1010, -1010);
    }

    @Override // ye1.e
    public void u(java.lang.String str, java.lang.String str2, ye1.h hVar) {
        m(str, str2);
        if (hVar != null) {
            ((ff1.i) hVar).a();
        }
    }

    @Override // ye1.s
    public void v(long j17) {
    }

    @Override // ye1.e
    public void w(java.lang.String str) {
        G(-1010, -1010);
    }

    @Override // ye1.e
    public void x(java.lang.String str, java.lang.String str2, int i17) {
        m(str, str2);
    }

    @Override // ye1.e
    public void z(ye1.g gVar) {
        this.f542700f = gVar;
    }
}

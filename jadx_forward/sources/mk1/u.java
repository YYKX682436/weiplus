package mk1;

/* loaded from: classes7.dex */
public final class u implements ye1.r, ye1.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f408651a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f408652b;

    /* renamed from: c, reason: collision with root package name */
    public ye1.r f408653c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f408654d;

    public u(java.util.List providers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(providers, "providers");
        this.f408651a = providers;
        this.f408652b = new java.lang.Object();
    }

    @Override // ye1.r
    public void A(ye1.n listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        D("addOnSeekCompleteListener", new mk1.e(listener));
    }

    @Override // ye1.e
    public void B(ye1.m mVar) {
        D("setOnPreparedListener", new mk1.n(mVar));
    }

    @Override // ye1.s
    public void C(long j17) {
        ye1.r E = E(null);
        if (E != null) {
            E.C(j17);
        }
    }

    public final void D(java.lang.String str, yz5.l lVar) {
        ye1.r E = E(null);
        if (E != null) {
            lVar.mo146xb9724478(E);
            return;
        }
        synchronized (this.f408652b) {
            if (this.f408654d == null) {
                this.f408654d = new java.util.ArrayList();
            }
            java.util.List list = this.f408654d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            ((java.util.ArrayList) list).add(lVar);
        }
    }

    public final ye1.r E(mk1.b0 b0Var) {
        ye1.r rVar;
        synchronized (this.f408652b) {
            if (b0Var == null) {
                rVar = this.f408653c;
            } else {
                ye1.r rVar2 = this.f408653c;
                if (rVar2 == null) {
                    java.util.Iterator it = this.f408651a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            rVar = null;
                            break;
                        }
                        ye1.r a17 = ((mk1.v) it.next()).a(b0Var);
                        this.f408653c = a17;
                        if (a17 != null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                            java.util.List list = this.f408654d;
                            if (list != null) {
                                java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                                while (it6.hasNext()) {
                                    ((yz5.l) it6.next()).mo146xb9724478(a17);
                                }
                            }
                            java.util.List list2 = this.f408654d;
                            if (list2 != null) {
                                ((java.util.ArrayList) list2).clear();
                            }
                            this.f408654d = null;
                            rVar = this.f408653c;
                        }
                    }
                } else {
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    @Override // ye1.r
    public void a(ye1.m listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        D("addOnPreparedListener", new mk1.d(listener));
    }

    @Override // ye1.e
    public void b(boolean z17) {
        D("setLooping", new mk1.f(z17));
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        D(be1.x0.f4239x24728b, new mk1.t(f17, f18));
    }

    @Override // ye1.e
    public void d(ye1.f fVar) {
        D("setOnBufferingUpdateListener", new mk1.h(fVar));
    }

    @Override // ye1.r
    public void e(ye1.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        D("addOnCompletionListener", new mk1.c(listener));
    }

    @Override // ye1.e
    public boolean f(float f17) {
        ye1.r E = E(null);
        if (E != null) {
            return E.f(f17);
        }
        return false;
    }

    @Override // ye1.e
    public void g(ye1.q qVar) {
        D("setOnVideoSizeChangedListener", new mk1.q(qVar));
    }

    @Override // ye1.e
    /* renamed from: getCurrentPosition */
    public int mo1851x9746038c() {
        ye1.r E = E(null);
        if (E != null) {
            return E.mo1851x9746038c();
        }
        return 0;
    }

    @Override // ye1.e
    /* renamed from: getDuration */
    public int mo1852x51e8b0a() {
        ye1.r E = E(null);
        if (E != null) {
            return E.mo1852x51e8b0a();
        }
        return 0;
    }

    @Override // ye1.e
    /* renamed from: getPlayerType */
    public int mo1853x6b2cfdb1() {
        ye1.r E = E(null);
        if (E != null) {
            return E.mo1853x6b2cfdb1();
        }
        return 4;
    }

    @Override // ye1.e
    /* renamed from: getState */
    public int mo53293x75286adb() {
        ye1.r E = E(null);
        if (E != null) {
            return E.mo53293x75286adb();
        }
        return 0;
    }

    @Override // ye1.e
    /* renamed from: getVideoHeight */
    public int mo1854x463504c() {
        ye1.r E = E(null);
        if (E != null) {
            return E.mo1854x463504c();
        }
        return 0;
    }

    @Override // ye1.e
    /* renamed from: getVideoWidth */
    public int mo1855x8d5c7601() {
        ye1.r E = E(null);
        if (E != null) {
            return E.mo1855x8d5c7601();
        }
        return 0;
    }

    @Override // ye1.e
    public void h(ye1.n nVar) {
        D("setOnSeekCompleteListener", new mk1.o(nVar));
    }

    @Override // ye1.e
    public void i(ye1.o oVar) {
        D("setOnSubtitleDataListener", new mk1.p(oVar));
    }

    @Override // ye1.e
    /* renamed from: isPlaying */
    public boolean mo1856xc00617a4() {
        ye1.r E = E(null);
        if (E != null) {
            return E.mo1856xc00617a4();
        }
        return false;
    }

    @Override // ye1.e
    public void j(boolean z17) {
        ye1.r E = E(null);
        if (E != null) {
            E.j(z17);
        }
    }

    @Override // ye1.e
    public void k(ye1.k kVar) {
        D("setOnHitPreloadListener", new mk1.l(kVar));
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class playerClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerClass, "playerClass");
        ye1.r E = E(null);
        if (E != null) {
            return E.l(playerClass);
        }
        return null;
    }

    @Override // ye1.e
    public void m(java.lang.String str, java.lang.String str2) {
        mk1.a0 b17;
        ye1.r E;
        if (str == null || (E = E((b17 = mk1.b0.f408628d.b(str)))) == null) {
            return;
        }
        E.x(b17.f408629a, str2, b17.f408625e ? 2 : 0);
    }

    @Override // ye1.e
    public void n(double d17) {
        D("setPreferredPeakBitRate", new mk1.r(d17));
    }

    @Override // ye1.s
    public void o(org.json.JSONObject jSONObject) {
        ye1.r E = E(null);
        if (E != null) {
            E.o(jSONObject);
        }
    }

    @Override // ye1.e
    public void p(ye1.l lVar) {
        D("setOnInfoListener", new mk1.m(lVar));
    }

    @Override // ye1.e
    /* renamed from: pause */
    public void mo1857x65825f6() {
        ye1.r E = E(null);
        if (E != null) {
            E.mo1857x65825f6();
        }
    }

    @Override // ye1.e
    /* renamed from: prepareAsync */
    public void mo1858x857611b5() {
        ye1.r E = E(null);
        if (E != null) {
            E.mo1858x857611b5();
        }
    }

    @Override // ye1.e
    public void q(ye1.i iVar) {
        D("setOnDownstreamChangedListener", new mk1.j(iVar));
    }

    @Override // ye1.e
    public void r(ye1.j jVar) {
        D("setOnErrorListener", new mk1.k(jVar));
    }

    @Override // ye1.e
    /* renamed from: release */
    public void mo1859x41012807() {
        ye1.r E = E(null);
        if (E != null) {
            E.mo1859x41012807();
        }
        synchronized (this.f408652b) {
            this.f408653c = null;
        }
    }

    @Override // ye1.e
    /* renamed from: reset */
    public void mo1860x6761d4f() {
        ye1.r E = E(null);
        if (E != null) {
            E.mo1860x6761d4f();
        }
    }

    @Override // ye1.e
    /* renamed from: seekTo */
    public void mo1861xc9fc1b13(long j17) {
        ye1.r E = E(null);
        if (E != null) {
            E.mo1861xc9fc1b13(j17);
        }
    }

    @Override // ye1.s
    /* renamed from: setAppId */
    public void mo53294x52b73fda(java.lang.String str) {
        ye1.r E = E(null);
        if (E != null) {
            E.mo53294x52b73fda(str);
        }
    }

    @Override // ye1.e
    /* renamed from: setDataSource */
    public void mo1862x683d6267(java.lang.String str) {
        mk1.a0 b17;
        ye1.r E;
        if (str == null || (E = E((b17 = mk1.b0.f408628d.b(str)))) == null) {
            return;
        }
        E.y(b17.f408629a, b17.f408625e ? 2 : 0);
    }

    @Override // ye1.e
    /* renamed from: setMute */
    public void mo1863x764d819b(boolean z17) {
        D("setMute", new mk1.g(z17));
    }

    @Override // ye1.e
    /* renamed from: setSurface */
    public void mo1864x42c875eb(android.view.Surface surface) {
        D(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15457x14b68192, new mk1.s(surface));
    }

    @Override // ye1.e
    /* renamed from: start */
    public void mo1865x68ac462() {
        ye1.r E = E(null);
        if (E != null) {
            E.mo1865x68ac462();
        }
    }

    @Override // ye1.e
    /* renamed from: stop */
    public void mo1866x360802() {
        ye1.r E = E(null);
        if (E != null) {
            E.mo1866x360802();
        }
    }

    @Override // ye1.e
    public void t(java.lang.String sourceUrl, java.lang.String str, java.lang.String str2, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceUrl, "sourceUrl");
        mk1.w a17 = mk1.b0.f408628d.a(sourceUrl, true);
        java.lang.String str3 = a17.f408655a;
        java.lang.String str4 = a17.f408656b;
        ye1.r E = E(new mk1.z(str3, str4, a17.f408658d, a17.f408659e, a17.f408660f));
        if (E != null) {
            E.t(str4, str, str2, z17);
        }
    }

    @Override // ye1.s
    public void v(long j17) {
        ye1.r E = E(null);
        if (E != null) {
            E.v(j17);
        }
    }

    @Override // ye1.e
    public void w(java.lang.String str) {
        ye1.r E = E(null);
        if (E != null) {
            E.w(str);
        }
    }

    @Override // ye1.e
    public void x(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            return;
        }
        ye1.r E = E(new mk1.a0(str, str, "", "", 0L, i17 == 2));
        if (E != null) {
            E.x(str, str2, i17);
        }
    }

    @Override // ye1.e
    public void z(ye1.g gVar) {
        D("setOnCompletionListener", new mk1.i(gVar));
    }
}

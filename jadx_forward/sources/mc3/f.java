package mc3;

/* loaded from: classes7.dex */
public abstract class f extends lc3.e implements jc3.i0, jc3.h0, jc3.u, qp0.a {

    /* renamed from: d, reason: collision with root package name */
    public final nc3.a f407158d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f407159e;

    /* renamed from: f, reason: collision with root package name */
    public qp0.c f407160f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f407161g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f407162h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f407163i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f407164m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f407165n;

    /* renamed from: o, reason: collision with root package name */
    public bf3.p f407166o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f407167p;

    /* renamed from: q, reason: collision with root package name */
    public jc3.j0 f407168q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f407169r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f407170s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f407171t;

    /* renamed from: u, reason: collision with root package name */
    public final mc3.d f407172u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f407173v;

    public f(nc3.a bizConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        this.f407158d = bizConfig;
        java.lang.String str = bizConfig.f417642a;
        this.f407159e = str;
        this.f407160f = bizConfig.f417643b;
        this.f407163i = new java.util.HashSet();
        this.f407165n = jz5.h.b(new mc3.c(this));
        this.f407170s = new java.util.concurrent.CopyOnWriteArrayList();
        this.f407171t = new java.util.concurrent.CopyOnWriteArrayList();
        this.f407172u = new mc3.d(this);
        this.f407173v = "MagicBaseBiz." + str;
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.f407162h;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    public final qp0.b C0() {
        return (qp0.b) ((jz5.n) this.f407165n).mo141623x754a37bb();
    }

    public final jc3.r0 E0(long j17) {
        int i17 = s26.a.f483901f;
        if (j17 == 0) {
            return jc3.r0.f380513f;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "preload runtime, cacheTime: " + ((java.lang.Object) s26.a.h(j17)));
        G0();
        H0(false);
        ((rp0.e) C0()).c(true, j17);
        return jc3.r0.f380511d;
    }

    public final void F0(java.lang.String str, java.lang.String event, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int length = str2.length();
        if (length > 500) {
            length = 500;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "send event," + str + " event: " + event + ", data: " + length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (r3 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mc3.f.G0():void");
    }

    public final void H0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "setActiveStatus, before: " + this.f407161g + ", after: " + z17);
        this.f407161g = z17;
        qp0.b.a(C0(), false, 1, null);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f407173v, "on js exception, envId: " + envId + ", msg: " + msg);
    }

    @Override // jc3.i0
    public final void S(jc3.l0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ((java.util.HashSet) this.f407163i).add(listener);
    }

    @Override // jc3.i0
    public synchronized void V(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "activate");
        rp0.e eVar = (rp0.e) C0();
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "cancel try destroy");
        java.lang.Runnable runnable = eVar.f479882i;
        if (runnable != null) {
            eVar.f479878e.mo50300x3fa464aa(runnable);
            eVar.f479882i = null;
        }
        this.f407162h = new java.lang.ref.WeakReference(activity);
        G0();
        H0(true);
    }

    @Override // jc3.u
    public void b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on connection exception");
        java.util.Iterator it = this.f407163i.iterator();
        while (it.hasNext()) {
            ((jc3.l0) it.next()).b1();
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40976xa01141ab(this.f407172u);
        rp0.e eVar = (rp0.e) C0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "tryRecreateBiz, foreground: " + eVar.f479879f);
        if (!eVar.f479879f) {
            eVar.f479884k = new rp0.d(eVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAutoLifecycleExt", "exceptionListener invoke, try to recreate biz");
        qp0.a aVar = eVar.f479874a;
        int i17 = eVar.f479883j;
        eVar.f479883j = i17 + 1;
        boolean z17 = i17 >= eVar.f479877d;
        mc3.f fVar = (mc3.f) aVar;
        synchronized (fVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f407173v, "recreateBiz, isOutOfLimit=" + z17);
            if (!z17) {
                pm0.v.X(new mc3.e(fVar));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(fVar.f407173v, "biz recreate too much times, destroy it.");
            java.util.Iterator it6 = ((java.util.HashSet) fVar.f407163i).iterator();
            while (it6.hasNext()) {
                ((jc3.l0) it6.next()).d0(true);
            }
            fVar.f407164m = true;
            fVar.mo147148x5cd39ffa();
            fVar.f407164m = false;
        }
    }

    @Override // jc3.i0
    /* renamed from: deactivate */
    public synchronized void mo133869x88fbd074() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "deActivated");
        H0(false);
        rp0.e eVar = (rp0.e) C0();
        eVar.getClass();
        int i17 = s26.a.f483901f;
        eVar.c(false, s26.c.d(eVar.f479876c, s26.d.f483905g));
    }

    /* renamed from: destroy */
    public abstract void mo147148x5cd39ffa();

    @Override // jc3.i0
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d event) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String event2 = event.f229414d;
        java.lang.String data = event.f229415e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event2, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        jc3.j0 j0Var = this.f407168q;
        if (j0Var != null) {
            synchronized (j0Var) {
                if (!this.f407169r) {
                    this.f407170s.add(new mc3.a(event2, data));
                    F0("but pending, ", event2, data);
                    return;
                }
                ((rp0.e) C0()).e(true);
                jc3.j0 j0Var2 = this.f407168q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var2);
                ((rc3.w0) j0Var2).k(event2, data);
                F0("", event2, data);
                f0Var = jz5.f0.f384359a;
            }
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f407173v, "send event, but mb biz is null");
        }
    }

    @Override // jc3.u
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on main script is injected");
        jc3.j0 j0Var = this.f407168q;
        if (j0Var != null) {
            synchronized (j0Var) {
                ((rp0.e) C0()).e(true);
                for (mc3.a aVar : this.f407170s) {
                    ((rc3.w0) j0Var).k(aVar.f407151a, aVar.f407152b);
                    F0("pending over", aVar.f407151a, aVar.f407152b);
                }
                this.f407170s.clear();
                this.f407169r = true;
                if (!this.f407171t.isEmpty()) {
                    for (mc3.b bVar : this.f407171t) {
                        ((rc3.w0) j0Var).l(bVar.f407153a, bVar.f407154b);
                    }
                    this.f407171t.clear();
                }
            }
        }
    }

    @Override // jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40973x40b15f2e(this.f407172u);
    }

    @Override // jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on destroy, reason: " + i17);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40976xa01141ab(this.f407172u);
    }

    @Override // jc3.u
    /* renamed from: onPause */
    public void mo127084xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on pause");
    }

    @Override // jc3.u
    /* renamed from: onResume */
    public void mo127085x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on resume");
    }

    @Override // jc3.i0
    /* renamed from: pause */
    public void mo133870x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "pause");
        ((rp0.e) C0()).d();
    }

    @Override // jc3.i0
    /* renamed from: resume */
    public void mo133871xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "resume");
        qp0.b.a(C0(), false, 1, null);
    }

    @Override // jc3.i0
    public void t0(java.lang.String script, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        if (!z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f407173v, "test evaluate script blocked, not in debug environment");
            if (lVar != null) {
                lVar.mo146xb9724478("not in debug environment");
                return;
            }
            return;
        }
        jc3.j0 j0Var = this.f407168q;
        if (j0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f407173v, "test evaluate script, but mb biz is null");
            if (lVar != null) {
                lVar.mo146xb9724478("mb biz is null");
                return;
            }
            return;
        }
        if (this.f407169r) {
            ((rc3.w0) j0Var).l(script, lVar);
            return;
        }
        synchronized (j0Var) {
            if (this.f407169r) {
                ((rc3.w0) j0Var).l(script, lVar);
                return;
            }
            this.f407171t.add(new mc3.b(script, lVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "test evaluate script, but main script is not injected, pending. size=" + this.f407171t.size());
        }
    }

    @Override // jc3.u
    public void x5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on service ready");
    }
}

package rc3;

/* loaded from: classes7.dex */
public final class w0 extends qc3.b implements jc3.j0, jc3.o {
    public qc3.f A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f475619d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f475620e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f475621f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f475622g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f475623h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b f475624i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f475625m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f475626n;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f475627o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f475628p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f475629q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f475630r;

    /* renamed from: s, reason: collision with root package name */
    public int f475631s;

    /* renamed from: t, reason: collision with root package name */
    public int f475632t;

    /* renamed from: u, reason: collision with root package name */
    public final kz5.q f475633u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f475634v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f475635w;

    /* renamed from: x, reason: collision with root package name */
    public je3.o f475636x;

    /* renamed from: y, reason: collision with root package name */
    public final oc3.c f475637y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f475638z;

    public w0(android.content.Context context, java.lang.String instanceName, android.os.HandlerThread stateThread, yz5.l needConnectCb, yz5.l disconnectCb) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateThread, "stateThread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(needConnectCb, "needConnectCb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(disconnectCb, "disconnectCb");
        this.f475619d = context;
        this.f475620e = instanceName;
        this.f475621f = stateThread;
        this.f475622g = needConnectCb;
        this.f475623h = disconnectCb;
        this.f475625m = new java.util.HashSet();
        this.f475626n = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f475627o = new android.os.Handler(stateThread.getLooper());
        this.f475628p = new java.util.HashMap();
        this.f475629q = new java.util.HashMap();
        this.f475630r = new java.util.HashMap();
        this.f475632t = 1;
        this.f475633u = new kz5.q(16);
        this.f475635w = r26.n0.s0(instanceName, "-", instanceName);
        this.f475637y = new oc3.c(instanceName, null, 2, null);
        this.f475638z = "MBBizClient_" + r26.n0.s0(instanceName, "-", instanceName).concat(r26.p0.F0(r26.n0.p0(instanceName, "-", ""), 5));
    }

    public static final void e(rc3.w0 w0Var) {
        w0Var.f475632t = 16;
        java.util.Iterator it = w0Var.f475625m.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).mo123043xac79a11b(3);
        }
        w0Var.j();
    }

    public void A() {
        M(new rc3.o0(this));
    }

    @Override // qc3.c
    public void B8(int i17, int i18, int i19, int i27, int i28, int i29) {
        M(new rc3.u(this, i17, i18, i19, i27, i28));
    }

    @Override // qc3.c
    public void Bi(int i17, float[] left, float[] top, float[] width, float[] height) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(left, "left");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(top, "top");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(width, "width");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(height, "height");
        M(new rc3.s(this, i17, left, top, width, height));
    }

    @Override // qc3.c
    public void C3(int i17, int i18, int i19, int i27, int i28, int i29) {
        M(new rc3.n(this, i17, i18, i19, i27, i28));
    }

    @Override // qc3.c
    public void Da(boolean z17) {
        T(new rc3.x(this, z17));
    }

    @Override // qc3.c
    public void F2(int i17, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        T(new rc3.y(this, i17, msg));
    }

    @Override // qc3.c
    public void K3(int i17) {
        M(new rc3.r(this, i17));
    }

    @Override // qc3.c
    public void Ke(java.lang.String logStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logStr, "logStr");
        T(new rc3.b0(this, logStr));
    }

    public final void M(yz5.a aVar) {
        if (this.f475632t == 16) {
            return;
        }
        this.f475627o.post(new rc3.p0(this, aVar));
    }

    @Override // qc3.c
    public void Oe() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f475638z, "onPing localStatus:" + this.f475632t + ", isPending:" + this.f475634v + " instanceName:" + this.f475620e);
    }

    public final void S(yz5.a aVar) {
        this.f475626n.post(new rc3.r0(aVar));
    }

    public final void T(yz5.a aVar) {
        if (this.f475632t == 16) {
            return;
        }
        this.f475627o.post(new rc3.r0(aVar));
    }

    public final void V(yz5.a aVar) {
        if (this.f475632t == 16) {
            return;
        }
        this.f475627o.post(new rc3.q0(this, aVar));
    }

    public void W(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        synchronized (this) {
            if (this.f475624i != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f475638z, "duplicate setup");
                return;
            }
            this.f475624i = config;
            if (config.f229359p.length() > 0) {
                byte[] bytes = config.f229359p.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                int length = bytes.length;
                if (length > 102400) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f475638z, "customEnvParams size=" + length + " exceeds limit=102400, biz:" + this.f475635w);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            }
            if (config.f229365v) {
                je3.o oVar = new je3.o(this.f475635w, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, null);
                java.lang.String str2 = oVar.f380839b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                config.f229352f = str2;
                this.f475636x = oVar;
            }
            java.lang.String a17 = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
            config.f229353g = a17;
            T(new rc3.a(this));
            M(new rc3.t0(this, config));
        }
    }

    @Override // qc3.c
    public void c(int i17, boolean z17) {
        M(new rc3.p(this, i17, z17));
    }

    /* renamed from: destroy */
    public void m162151x5cd39ffa() {
        T(new rc3.e(this));
    }

    @Override // qc3.c
    public void h(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        T(new rc3.a0(this, msg, envId));
    }

    @Override // qc3.c
    public java.lang.String ih(java.lang.String event, java.lang.String data, java.lang.String privateData) {
        lc3.c0 c0Var;
        java.lang.String a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(privateData, "privateData");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475624i;
            if (c16416x87606a7b == null || (c0Var = (lc3.c0) c16416x87606a7b.f229360q.get(event)) == null) {
                return "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
            }
            lc3.d0 d0Var = (lc3.d0) c0Var;
            d0Var.f399423a = c16416x87606a7b.b();
            d0Var.o(this.f475637y);
            d0Var.f399425c = privateData;
            lc3.a0 a0Var = new lc3.a0(data);
            if (d0Var.n()) {
                hh.h hVar = new hh.h(new rc3.k(d0Var, a0Var));
                this.f475626n.post(hVar);
                a17 = ((lc3.a0) hVar.b()).a();
            } else {
                a17 = d0Var.r(a0Var).a();
            }
            d0Var.f399423a = null;
            return a17;
        } catch (java.lang.Exception e17) {
            je3.k kVar = je3.k.f380831e;
            java.lang.String str = this.f475635w;
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            kVar.T5(str, "jsapi-exception", stackTraceString, event + ':' + data, 1.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f475638z, e17, this.f475635w + ": catch jsapi exception " + event + ", data = " + data, new java.lang.Object[0]);
            d75.b.g(new rc3.l(e17));
            return "{\"errMsg\":\"jsapi exception\", \"errCode\": -4}";
        }
    }

    public final void j() {
        java.lang.String str = this.f475638z;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cleanup");
        this.f475634v = false;
        this.f475624i = null;
        this.A = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pendingTaskRemove ");
        kz5.q qVar = this.f475633u;
        sb6.append(qVar.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        qVar.clear();
        this.f475630r.clear();
        S(new rc3.b(this));
        this.f475625m.clear();
        this.f475621f.quit();
        this.f475623h.mo146xb9724478(this.f475620e);
    }

    @Override // qc3.c
    public void j6(java.lang.String event, java.lang.String data, java.lang.String privateData, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(privateData, "privateData");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475624i;
            if (c16416x87606a7b == null) {
                return;
            }
            lc3.c0 c0Var = (lc3.c0) c16416x87606a7b.f229360q.get(event);
            if (c0Var != null) {
                lc3.b0 r17 = ((lc3.b0) c0Var).r();
                r17.f399423a = c16416x87606a7b.b();
                r17.o(this.f475637y);
                r17.f399425c = privateData;
                r17.f399419d = new rc3.h(this, i17, r17);
                lc3.a0 a0Var = new lc3.a0(data);
                if (r17.n()) {
                    this.f475626n.post(new rc3.i(r17, a0Var));
                } else {
                    r17.t(a0Var);
                }
            }
        } catch (java.lang.Exception e17) {
            je3.k kVar = je3.k.f380831e;
            java.lang.String str = this.f475635w;
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            kVar.T5(str, "jsapi-exception", stackTraceString, event + ':' + data, 1.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f475638z, e17, this.f475635w + ": catch jsapi exception " + event + ", data = " + data, new java.lang.Object[0]);
            d75.b.g(new rc3.j(e17));
        }
    }

    public void k(java.lang.String event, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        M(new rc3.f(this, event, data));
    }

    public void l(java.lang.String script, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        M(new rc3.g(this, lVar, script));
    }

    @Override // qc3.c
    public void n() {
        V(new rc3.c0(this));
    }

    @Override // qc3.c
    /* renamed from: onCreated */
    public void mo159828x8cf48009() {
        V(new rc3.v(this));
    }

    @Override // qc3.c
    /* renamed from: onDestroy */
    public void mo159829xac79a11b() {
        V(new rc3.w(this));
    }

    public void p(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerIds, "pointerIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y17, "y");
        M(new rc3.m0(this, i17, i18, i19, j17, pointerIds, x17, y17));
    }

    /* renamed from: pause */
    public void m162152x65825f6() {
        M(new rc3.g0(this));
    }

    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        M(new rc3.i0(this, i17, i18, i19, surface));
    }

    /* renamed from: start */
    public void m162153x68ac462() {
        M(new rc3.u0(this));
    }

    public void w(jc3.u listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        T(new rc3.n0(this, listener));
    }
}

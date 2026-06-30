package nr0;

/* loaded from: classes14.dex */
public abstract class x implements nr0.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f420648d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f420649e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f420650f;

    /* renamed from: g, reason: collision with root package name */
    public is0.c f420651g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.SurfaceTexture f420652h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f420653i;

    /* renamed from: m, reason: collision with root package name */
    public final xr0.k f420654m;

    /* renamed from: n, reason: collision with root package name */
    public final zr0.p f420655n;

    /* renamed from: o, reason: collision with root package name */
    public rs0.h f420656o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f420657p;

    /* renamed from: q, reason: collision with root package name */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f420658q;

    /* renamed from: r, reason: collision with root package name */
    public final nr0.c0 f420659r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f420660s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f420661t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f420662u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f420663v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f420664w;

    /* renamed from: x, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f420665x;

    /* renamed from: y, reason: collision with root package name */
    public int f420666y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f420667z;

    public x(int i17) {
        this.f420648d = i17;
        xr0.k kVar = new xr0.k(null, null, null, 0, false, 31, null);
        this.f420654m = kVar;
        this.f420655n = new zr0.p(i17, kVar);
        this.f420659r = new nr0.c0(nr0.m.f420626d);
        this.f420664w = true;
        this.f420666y = 3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "setUpGLEnv hash:" + hashCode());
        int i18 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("CameraKit-GLThread", 10);
        this.f420649e = a17;
        a17.start();
        android.os.Handler handler = new android.os.Handler(a17.getLooper());
        this.f420650f = handler;
        this.f420657p = p3325xe03a0797.p3326xc267989b.z0.a(t26.e.b(handler, null, 1, null));
        l(new nr0.r(this, null));
        this.f420667z = new nr0.e(this);
    }

    public java.lang.Object i(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "jumpNextFrame");
        l(new nr0.l(this, nVar, null));
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    public java.lang.Object j(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("makeSureEnvSetup valid:");
        sb6.append(this.f420656o != null);
        sb6.append(" screenSize:");
        sb6.append(this.f420654m.f537708a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        boolean z17 = this.f420656o != null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17 || this.f420654m.f537708a.f537706a <= 0) {
            this.f420658q = nVar;
        } else {
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        }
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f440719d ? a17 : f0Var;
    }

    public java.lang.Object k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return m("camera-render", new nr0.n(this, null), interfaceC29045xdcb5ca57);
    }

    public final void l(yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f420657p;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, block, 3, null);
        }
    }

    public final java.lang.Object m(java.lang.String str, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.os.Handler handler = this.f420650f;
        if (handler != null) {
            int i17 = t26.e.f496887a;
            return p3325xe03a0797.p3326xc267989b.l.g(new t26.a(handler, str, false), pVar, interfaceC29045xdcb5ca57);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "renderHandler already release,name:" + str + " will not execute");
        return null;
    }

    public java.lang.Object n(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return m("camera-render", new nr0.o(this, null), interfaceC29045xdcb5ca57);
    }

    @Override // nr0.b0
    /* renamed from: setCustomRender */
    public void mo9385xabce2de9(nr0.c cVar) {
        l(new nr0.q(this, cVar, null));
    }
}

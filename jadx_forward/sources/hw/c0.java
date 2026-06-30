package hw;

/* loaded from: classes7.dex */
public abstract class c0 extends hq0.i0 {
    public final java.util.HashMap A;
    public yz5.a B;
    public boolean C;
    public final java.util.HashSet D;
    public final java.util.HashSet E;
    public final hw.x F;

    /* renamed from: x, reason: collision with root package name */
    public final fw.v f366895x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f366896y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.ref.WeakReference f366897z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(fw.v flutterPlugin) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPlugin, "flutterPlugin");
        this.f366895x = flutterPlugin;
        this.f366896y = new java.util.concurrent.CopyOnWriteArrayList();
        this.A = new java.util.HashMap(2);
        java.lang.String bizName = O0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        java.util.Set e17 = kz5.p1.e(new ce3.a(bizName), new ce3.d(bizName), new vd3.f(), new vd3.d(), new md3.t(), new rd3.j(), new rd3.k(), new sd3.c(), new sd3.b(), new md3.c(), new vd3.c(), new md3.q(), new md3.u(), new md3.l(), new mw.b(), new mw.a(), new lw.a(), new jw.b(), new kw.b(), new iw.a());
        kz5.n0.O0(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class))).Ni(bizName), e17);
        java.util.HashSet d17 = kz5.p1.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(763).getClass().getName());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 Vc = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(508);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        java.lang.String O0 = O0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5 m5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 Vc2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(408);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Vc2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        java.lang.String O02 = O0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5 m5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 Vc3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(764);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Vc3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        java.util.HashSet d18 = kz5.p1.d(m5Var.Ni((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) Vc, O0), m5Var2.Ni((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) Vc2, O02), ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class))).Ni((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) Vc3, O0()));
        d18.addAll(e17);
        this.D = d18;
        java.lang.String name = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o8.f34570x366c91de).getClass().getName();
        java.lang.String name2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(66505).getClass().getName();
        java.lang.String name3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(66506).getClass().getName();
        java.lang.String name4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Vc(66648).getClass().getName();
        new be1.a1();
        java.util.HashSet d19 = kz5.p1.d(name, name2, name3, name4, be1.a1.class.getName());
        d19.addAll(d17);
        this.E = d19;
        flutterPlugin.f348570r = new java.lang.ref.WeakReference(this);
        ((ku5.t0) ku5.t0.f394148d).q(new hw.q(this));
        this.F = new hw.x(this);
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.f366897z;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return new hw.w(this);
    }

    @Override // hq0.i0
    public void G1(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        super.G1(key, value);
    }

    @Override // hq0.i0
    public void I1(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b buildConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buildConfig, "buildConfig");
        buildConfig.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        buildConfig.a(kz5.p1.d(new sp0.g(), new sp0.e(), new sp0.f()));
        buildConfig.a(this.D);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(buildConfig, this.E);
        super.I1(buildConfig);
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        hq0.e0 H0 = H0(this, context, O0(), "frames", "", true);
        fw.v vVar = this.f366895x;
        vVar.getClass();
        vVar.f323822e.put(H0.f364517e, H0);
        this.A.put("frames", H0);
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        java.lang.ref.WeakReference weakReference;
        android.app.Activity activity;
        this.f364531m.f364561a.clear();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6 c4678x1d1a4af6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495;
        boolean mo40975xf7b3660d = c4678x1d1a4af6.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsTLBaseBiz", "onConnException foreground: " + mo40975xf7b3660d + ", bizName:" + O0());
        super.b1();
        if (z65.c.a() && (weakReference = this.f366897z) != null && (activity = (android.app.Activity) weakReference.get()) != null) {
            pm0.v.X(new hw.b0(activity));
        }
        if (!mo40975xf7b3660d) {
            hw.x xVar = this.F;
            c4678x1d1a4af6.mo40976xa01141ab(xVar);
            c4678x1d1a4af6.mo40973x40b15f2e(xVar);
        } else {
            yz5.a aVar = this.B;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }

    @Override // hq0.i0
    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MagicEcsTLBaseBiz", "destroy", new java.lang.Object[0]);
        fw.v vVar = this.f366895x;
        vVar.getClass();
        d75.b.g(new dq0.v(vVar));
        java.util.HashMap hashMap = this.A;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            hq0.e0 e0Var = (hq0.e0) ((java.util.Map.Entry) it.next()).getValue();
            if (e0Var != null && (str = e0Var.f364517e) != null) {
                vVar.i(str);
            }
        }
        hashMap.clear();
        super.mo123041x5cd39ffa();
        if (z65.c.a()) {
            this.f366896y.clear();
        }
    }

    @Override // hq0.i0
    public boolean g1() {
        java.lang.ref.WeakReference weakReference = this.f366897z;
        if (weakReference != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(weakReference);
            if (weakReference.get() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        jc3.j0 j0Var;
        if (z65.c.a() && (j0Var = this.f364528g) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            synchronized (j0Var) {
                java.util.Iterator it = this.f366896y.iterator();
                if (it.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f364528g);
                    throw null;
                }
            }
        }
        super.n();
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        super.mo123042x8cf48009();
    }

    @Override // hq0.i0
    public void w1(hq0.e0 root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        super.w1(root);
    }
}

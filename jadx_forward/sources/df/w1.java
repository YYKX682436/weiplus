package df;

/* loaded from: classes7.dex */
public final class w1 implements ni1.f {
    public boolean A;
    public ff.e B;

    /* renamed from: e, reason: collision with root package name */
    public ze.n f311114e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2936x80def495.C25587x226dda3 f311115f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f311116g;

    /* renamed from: h, reason: collision with root package name */
    public df.i f311117h;

    /* renamed from: i, reason: collision with root package name */
    public df.a0 f311118i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f311119m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f311122p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f311124r;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f311126t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f311128v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.Context f311129w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f311131y;

    /* renamed from: d, reason: collision with root package name */
    public int f311113d = -1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f311120n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f311121o = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f311123q = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f311125s = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.p447x80def495.C3954x5b0f9575 f311127u = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.luggage.skyline.SkylineView$mAttachedActivityLifecycleListener$1
        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
        /* renamed from: onStop */
        public final void m32254xc39f8281() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
            df.w1 w1Var = df.w1.this;
            sb6.append(w1Var.f311113d);
            sb6.append(", attached activity onStop");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
            w1Var.f311124r = true;
            df.a0 a0Var = w1Var.f311118i;
            if (a0Var == null) {
                return;
            }
            a0Var.h(true);
            df.p0 p0Var = a0Var instanceof df.p0 ? (df.p0) a0Var : null;
            if (p0Var == null) {
                return;
            }
            p0Var.f311068d = true;
        }
    };

    /* renamed from: x, reason: collision with root package name */
    public final df.o1 f311130x = new df.o1(this);

    /* renamed from: z, reason: collision with root package name */
    public final df.p1 f311132z = new df.p1();

    @Override // ni1.f
    public void P() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "SkylineView(" + this.f311113d + ") restoreRendering", new java.lang.Object[0]);
        df.a0 a0Var = this.f311118i;
        if (a0Var != null) {
            a0Var.b(true);
        }
    }

    @Override // ni1.f
    public void V() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "SkylineView(" + this.f311113d + ") pauseRendering", new java.lang.Object[0]);
        df.a0 a0Var = this.f311118i;
        if (a0Var != null) {
            a0Var.b(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(android.content.Context context) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object obj = this.f311129w;
        if (obj == null) {
            obj = null;
        } else if (obj == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        this.f311129w = context;
        df.a0 a0Var = this.f311118i;
        if (a0Var != null) {
            a0Var.i(context);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, context)) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.y yVar = obj instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj : null;
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.C3954x5b0f9575 c3954x5b0f9575 = this.f311127u;
        if (yVar != null && (mo273xed6858b42 = yVar.mo273xed6858b4()) != null) {
            mo273xed6858b42.c(c3954x5b0f9575);
        }
        p012xc85e97e9.p093xedfae76a.y yVar2 = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar2 == null || (mo273xed6858b4 = yVar2.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(c3954x5b0f9575);
    }

    public final void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "id:" + this.f311113d + " detachFromActivity platformPlugin:" + this.B, new java.lang.Object[0]);
        ff.e eVar = this.B;
        if (eVar != null) {
            eVar.f343113b.m138206xde722b98(null);
        }
        this.B = null;
        df.a0 a0Var = this.f311118i;
        if (a0Var != null) {
            a0Var.h(true);
        }
    }

    public final void s() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a;
        if (this.A) {
            return;
        }
        df.i iVar = this.f311117h;
        if (iVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineView", "initFlutterEngine fail, skylineConstructArgs is null ", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "initFlutterEngine", new java.lang.Object[0]);
        this.A = true;
        df.a1 a1Var = df.a1.f310954a;
        int i17 = this.f311113d;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        df.n1 n1Var = new df.n1(this);
        synchronized (a1Var) {
            java.lang.Object obj = df.a1.f310956c.get(java.lang.Long.valueOf(iVar.f311015a));
            if (obj == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SkylineManager", "waitFlutterReady id:" + i17 + " context:" + context + " args:" + iVar + ", may be release return");
                return;
            }
            synchronized (a1Var) {
                if (((df.x0) obj).f311141f.contains(java.lang.Integer.valueOf(i17))) {
                    if (((df.x0) obj).f311142g.contains(java.lang.Integer.valueOf(i17))) {
                        n1Var.mo146xb9724478(java.lang.Boolean.TRUE);
                    } else {
                        df.a1.f310958e.put(java.lang.Integer.valueOf(i17), n1Var);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "waitFlutterReady id:" + i17 + " context:" + context + " args:" + iVar + ", already preload");
                    return;
                }
                df.a1.f310957d.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(iVar.f311015a));
                df.x0 x0Var = (df.x0) obj;
                if (x0Var.f311139d) {
                    df.y0 y0Var = x0Var.f311137b;
                    y0Var.getClass();
                    y0Var.f311146a = java.lang.System.currentTimeMillis();
                } else {
                    java.util.HashMap hashMap = x0Var.f311138c;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    df.y0 y0Var2 = new df.y0();
                    y0Var2.f311146a = java.lang.System.currentTimeMillis();
                    hashMap.put(valueOf, y0Var2);
                }
                com.p314xaae8f345.p2936x80def495.C25575xc51c1017 c25575xc51c1017 = new com.p314xaae8f345.p2936x80def495.C25575xc51c1017();
                c25575xc51c1017.m95735x684351d(i17);
                c25575xc51c1017.m95740xfcd041f8(iVar.f311015a);
                c25575xc51c1017.m95731x328f15fa(iVar.f311016b);
                c25575xc51c1017.m95739xd6a2afbc(true);
                android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                double d17 = iVar.f311017c;
                double d18 = displayMetrics.density;
                c25575xc51c1017.m95746xe1e711f4(d17 / d18);
                c25575xc51c1017.m95745x412c32b9(iVar.f311018d / d18);
                c25575xc51c1017.m95736xfa30acb3("");
                yz5.a aVar = df.a1.f310959f;
                if (aVar != null) {
                    c25575xc51c1017.m95738xe3c9896e((com.p314xaae8f345.p2936x80def495.C25586x27051081) aVar.mo152xb9724478());
                }
                java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i("wcf://WxaSkylineCache/", true);
                if (i18 != null) {
                    c25575xc51c1017.m95727x5cbbb42d(i18);
                }
                c25575xc51c1017.m95730xa9d2b526(iVar.f311022h);
                f06.v[] vVarArr = gf.m0.f352658b;
                f06.v vVar = vVarArr[0];
                nf.r rVar = gf.m0.f352659c;
                gf.m0 m0Var = gf.m0.f352657a;
                c25575xc51c1017.m95732x2dc26ddb(((java.lang.Boolean) rVar.b(m0Var, vVar)).booleanValue());
                c25575xc51c1017.m95741xf57bfadf(((java.lang.Boolean) gf.m0.f352660d.b(m0Var, vVarArr[1])).booleanValue());
                c25575xc51c1017.m95729x82f1e14a(((java.lang.Boolean) gf.m0.f352661e.b(m0Var, vVarArr[2])).booleanValue());
                c25575xc51c1017.m95728x738c416a(((java.lang.Boolean) gf.m0.f352662f.b(m0Var, vVarArr[3])).booleanValue());
                c25575xc51c1017.m95742x6a3889ef(((java.lang.Boolean) gf.m0.f352663g.b(m0Var, vVarArr[4])).booleanValue());
                c25575xc51c1017.m95744xa7182a56(iVar.f311019e);
                c25575xc51c1017.m95726x52b73fda(iVar.f311020f);
                c25575xc51c1017.m95737x764e93a7(iVar.f311021g);
                c25575xc51c1017.m95733x9432bd7f(true);
                boolean m95766x9affa1e2 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95766x9affa1e2(context, c25575xc51c1017);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "waitFlutterReady id:" + i17 + " args:" + iVar + " isOk:" + m95766x9affa1e2);
                if (m95766x9affa1e2) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95771xf7af55c8 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95771xf7af55c8(i17);
                    if (df.a1.f310955b && m95771xf7af55c8 != null) {
                        m95771xf7af55c8.m137459x1de78823(new df.z0(m95771xf7af55c8), false);
                    }
                    if (m95771xf7af55c8 != null && (m137439x2173b36a = m95771xf7af55c8.m137439x2173b36a()) != null) {
                        m137439x2173b36a.add(new hf.d());
                        m137439x2173b36a.add(new vt5.a());
                    }
                    if (((df.x0) obj).f311139d) {
                        ((df.x0) obj).f311140e = i17;
                        ((df.x0) obj).f311139d = false;
                    }
                    ((df.x0) obj).f311141f.add(java.lang.Integer.valueOf(i17));
                    df.a1.f310958e.put(java.lang.Integer.valueOf(i17), n1Var);
                }
            }
        }
    }

    public final void t(java.lang.Integer num) {
        java.util.ArrayList arrayList = this.f311121o;
        if (num != null && arrayList.contains(num)) {
            arrayList.remove(num);
        }
        boolean z17 = this.f311122p & (arrayList.size() <= 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "id:" + this.f311113d + " call pause ,mResumedPages =" + arrayList + " switchPause=" + z17, new java.lang.Object[0]);
        if (z17) {
            this.f311122p = false;
            df.w0 w0Var = df.w0.f311102a;
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(df.w0.f311111j).remove(this.f311130x);
            df.a0 a0Var = this.f311118i;
            if (a0Var != null) {
                df.a0.c(a0Var, false, 1, null);
            }
            y(new df.i1(this));
        }
    }

    public final void u(boolean z17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1;
        this.f311131y = z17;
        ze.n nVar = this.f311114e;
        boolean c17 = (nVar == null || (u07 = nVar.u0()) == null || (c11816x5915d2c1 = u07.L1) == null) ? false : c11816x5915d2c1.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "SkylineView(" + this.f311113d + ") change isAnimating:" + this.f311131y + ", isResumed:" + this.f311122p + ", halfScreenEnable:" + c17, new java.lang.Object[0]);
        df.a0 a0Var = this.f311118i;
        if (a0Var != null && this.f311122p) {
            if (this.f311131y || c17) {
                df.a0.c(a0Var, false, 1, null);
            } else {
                a0Var.a(false);
            }
        }
    }

    public final void y(yz5.a aVar) {
        if (this.f311119m) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                aVar.mo152xb9724478();
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new df.s1(aVar));
            return;
        }
        synchronized (this) {
            if (!this.f311119m) {
                this.f311120n.add(new df.v1(this, aVar));
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                aVar.mo152xb9724478();
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new df.s1(aVar));
            }
        }
    }
}

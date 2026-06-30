package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l {

    /* renamed from: f, reason: collision with root package name */
    public qu5.a f163109f;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k f163111h;

    /* renamed from: q, reason: collision with root package name */
    public boolean f163117q;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t[] f163107d = {null};

    /* renamed from: g, reason: collision with root package name */
    public final bm5.o f163110g = new bm5.o();

    /* renamed from: i, reason: collision with root package name */
    public final bm5.x0 f163112i = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C12154x321856());

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f163113m = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif f163116p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif();

    /* renamed from: r, reason: collision with root package name */
    public final android.util.SparseArray f163118r = new android.util.SparseArray(5);

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i f163119s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r(this);

    /* renamed from: t, reason: collision with root package name */
    public boolean f163120t = false;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f163121u = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedHashSet f163114n = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i0 f163108e = f0();

    /* renamed from: o, reason: collision with root package name */
    public final lm0.e f163115o = new lm0.e();

    public m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n(this);
        pd.c cVar = pd.e.f434970a;
        if (cVar != null) {
            cVar.a(nVar);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f163117q = false;
    }

    public static org.json.JSONObject c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, java.lang.String str) {
        mVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return new org.json.JSONObject();
        }
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", e17.getMessage());
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void a(int i17, java.lang.String str) {
        d0(i17, str, null);
    }

    public final boolean a0() {
        return this.f163117q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> T b(java.lang.Class<T> cls) {
        T t17;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f163113m;
        java.util.Iterator descendingIterator = concurrentLinkedDeque.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                t17 = null;
                break;
            }
            t17 = (T) descendingIterator.next();
            if (cls.isInstance(t17)) {
                break;
            }
        }
        if (t17 == null && (t17 = (T) t0(cls)) != null) {
            concurrentLinkedDeque.add(t17);
        }
        if (t17 != null) {
            return t17;
        }
        try {
            T t18 = (T) new d56.b(cls, cls).c().f308165b;
            if (t18 != null) {
                try {
                    r(t18);
                } catch (java.lang.Exception unused) {
                    t17 = t18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "Make sure %s has default constructor", cls.getName());
                    return t17;
                }
            }
            return t18;
        } catch (java.lang.Exception unused2) {
        }
    }

    public java.lang.String b0() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public final boolean c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        if (c0Var == null) {
            c0Var = mo50357xcd94f799();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i iVar = this.f163119s;
        if (iVar != null) {
            return iVar.c(str, c0Var);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        e(str, str2, mo50260x9f1221c2());
    }

    public void d0(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var2;
        if (c0Var == null) {
            synchronized (this.f163118r) {
                int indexOfKey = this.f163118r.indexOfKey(i17);
                if (indexOfKey >= 0) {
                    c0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0) this.f163118r.valueAt(indexOfKey);
                    this.f163118r.removeAt(indexOfKey);
                } else {
                    c0Var2 = null;
                }
            }
            c0Var = c0Var2 != null ? c0Var2 : mo50357xcd94f799();
        }
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "callback but get NULL JsRuntime, callbackId:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (!c(null, c0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "callback but destroyed, callbackId %d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "{}";
        }
        if (this.f163121u.containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar = this.f163111h;
            if (kVar == null) {
                return;
            }
            kVar.d(i17, str);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0 b0Var = c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) c0Var).h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0.class) : null;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) b0Var;
            ((cl.a) nVar.c0()).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l(nVar, i17, str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.b(null)), false);
        } else {
            c0Var.mo14660x738236e6(java.lang.String.format(java.util.Locale.US, "typeof %s !== 'undefined' && %s.invokeCallbackHandler(%d, %s, %s)", "WeixinJSCoreAndroid", "WeixinJSCoreAndroid", java.lang.Integer.valueOf(i17), str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.b(null)), null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar2 = this.f163111h;
        if (kVar2 == null) {
            return;
        }
        kVar2.d(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        if (s(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.a(mo50357xcd94f799(), str, str2, i17, 0);
        }
    }

    public void e0(java.util.Map map) {
        map.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f(java.lang.String str) {
        java.util.Map map = (java.util.Map) this.f163110g.a();
        if (map != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) map.get(str);
        }
        if (a0() && mo50262x39e05d35()) {
            throw null;
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i0 f0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public final void g(java.lang.String str, java.lang.String str2) {
        e(str, str2, 0);
    }

    public abstract java.util.Map g0();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppId */
    public abstract /* synthetic */ java.lang.String mo48798x74292566();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppState */
    public abstract /* synthetic */ u81.b mo48799xc0ccc466();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getAsyncHandler */
    public final qu5.a mo50350x12b4fba4() {
        return j0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getAuthorizeDialogContainer */
    public /* bridge */ /* synthetic */ fl1.g2 mo50351x14ed3266() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getComponentId */
    public int mo50260x9f1221c2() {
        return hashCode();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getContext */
    public abstract /* synthetic */ android.content.Context mo50352x76847179();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getDialogContainer */
    public fl1.g2 mo50353x784fb1e3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "getDialogContainer return dummy impl");
        return fl1.g2.I0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getFileSystem */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "getFileSystem return dummy impl");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) this.f163112i.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getInterceptor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k mo50355x4b454cef() {
        return this.f163111h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getInvokeCostManager */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif mo50356x8f2ff6d2() {
        return this.f163116p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getJsRuntime */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t[] tVarArr = this.f163107d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar2 = tVarArr[0];
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (tVarArr) {
            tVar = this.f163107d[0];
        }
        return tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getLifecycleOwner */
    public /* bridge */ /* synthetic */ p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getWindowAndroid */
    public /* bridge */ /* synthetic */ xi1.g mo50261xee5260a9() {
        return null;
    }

    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar;
        qu5.a aVar = this.f163109f;
        if (aVar != null) {
            aVar.mo50302x6b17ad39(null);
            this.f163109f.mo50280x23b2dd47().quit();
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i0 i0Var = this.f163108e;
            if (i0Var != null) {
                i0Var.f162828a = null;
            }
            this.f163108e = null;
            bm5.o oVar = this.f163110g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C12152x321854 c12152x321854 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C12152x321854(this);
            oVar.f104243c.set(true);
            final bm5.t tVar2 = (bm5.t) oVar.f104242b;
            java.lang.Object andUpdate = tVar2.f104267b.getAndUpdate(new java.util.function.UnaryOperator() { // from class: bm5.t$$a
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    bm5.t.this.f104266a.set(false);
                    return null;
                }
            });
            if (andUpdate != null) {
                e0((java.util.Map) andUpdate);
            } else {
                oVar.f104244d = c12152x321854;
            }
            this.f163111h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ef.f162344a;
            this.f163119s = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m1.f163126a;
            synchronized (this.f163107d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t[] tVarArr = this.f163107d;
                tVar = tVarArr[0];
                tVarArr[0] = null;
            }
            if (tVar != null) {
                tVar.mo14659x5cd39ffa();
            }
        } catch (java.lang.Throwable th6) {
            this.f163108e = null;
            throw th6;
        }
    }

    public boolean h0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, int[] iArr) {
        d(n5Var.k(), n5Var.o(), iArr);
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t i0();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: isRunning */
    public abstract /* synthetic */ boolean mo50262x39e05d35();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void j(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        if (j17 < 0) {
            j17 = 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, j17);
    }

    public final qu5.a j0() {
        if (this.f163109f == null) {
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("AppBrandAsyncJSThread", 5);
            a17.start();
            this.f163109f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        }
        return this.f163109f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0> T k(java.lang.Class<T> cls) {
        if (cls == null) {
            return null;
        }
        synchronized (this.f163114n) {
            java.util.Iterator it = this.f163114n.iterator();
            while (it.hasNext()) {
                T t17 = (T) it.next();
                if (cls.isInstance(t17)) {
                    return t17;
                }
            }
            return null;
        }
    }

    public java.lang.String[] k0() {
        java.util.ArrayList arrayList = new java.util.ArrayList(500);
        java.util.Map map = (java.util.Map) this.f163110g.a();
        if (map == null) {
            if (a0() && mo50262x39e05d35()) {
                throw null;
            }
            return new java.lang.String[0];
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if ((entry.getValue() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) entry.getValue()).z()) {
                arrayList.add((java.lang.String) entry.getKey());
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public boolean l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0 h0Var) {
        if (h0Var == null) {
            return false;
        }
        synchronized (this.f163114n) {
            this.f163114n.add(h0Var);
        }
        return true;
    }

    public void l0() {
        n0();
        m0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void m(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
    }

    public final void m0() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C12153x321855 c12153x321855 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C12153x321855(this);
        if (h0()) {
            final bm5.o oVar = this.f163110g;
            if (((bm5.t) oVar.f104242b).f104266a.get()) {
                return;
            }
            java.util.concurrent.Future[] futureArr = oVar.f104241a;
            if (futureArr[0] == null) {
                synchronized (futureArr) {
                    java.util.concurrent.Future[] futureArr2 = oVar.f104241a;
                    if (futureArr2[0] == null) {
                        futureArr2[0] = ((ku5.t0) ku5.t0.f394148d).c(new java.util.concurrent.Callable() { // from class: bm5.o$$a
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                                bm5.o oVar2 = bm5.o.this;
                                bm5.q qVar = c12153x321855;
                                oVar2.getClass();
                                try {
                                    if (oVar2.f104243c.get()) {
                                        return null;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C12153x321855) qVar).f163123a;
                                    mVar.getClass();
                                    try {
                                        concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(mVar.g0());
                                    } catch (java.lang.NullPointerException unused) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "!! get NULL jsApiPool when createJsApiPool() called, make sure your logic !!");
                                        concurrentHashMap = null;
                                    }
                                    if (!oVar2.f104243c.get()) {
                                        bm5.t tVar = (bm5.t) oVar2.f104242b;
                                        tVar.f104267b.getAndUpdate(new bm5.C1344x3546ee(tVar, concurrentHashMap));
                                        return concurrentHashMap;
                                    }
                                    if (concurrentHashMap == null || oVar2.f104244d == null) {
                                        return null;
                                    }
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C12152x321854) oVar2.f104244d).f163122a.e0(concurrentHashMap);
                                    return null;
                                } catch (java.lang.Exception e17) {
                                    if ((e17 instanceof java.util.concurrent.CancellationException) || (e17 instanceof java.lang.InterruptedException)) {
                                        return null;
                                    }
                                    throw e17;
                                }
                            }
                        });
                    }
                }
                return;
            }
            return;
        }
        bm5.o oVar2 = this.f163110g;
        if (((bm5.t) oVar2.f104242b).f104266a.get()) {
            return;
        }
        java.util.concurrent.Future[] futureArr3 = oVar2.f104241a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
        if (futureArr3[0] != null) {
            synchronized (futureArr3) {
                java.util.concurrent.Future future = oVar2.f104241a[0];
                if (future != null) {
                    future.cancel(true);
                    oVar2.f104241a[0] = null;
                }
            }
        }
        bm5.s sVar = oVar2.f104242b;
        try {
            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(g0());
        } catch (java.lang.NullPointerException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "!! get NULL jsApiPool when createJsApiPool() called, make sure your logic !!");
        }
        bm5.t tVar = (bm5.t) sVar;
        tVar.f104267b.getAndUpdate(new bm5.C1344x3546ee(tVar, concurrentHashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public android.content.Context n() {
        return mo50352x76847179();
    }

    public final void n0() {
        synchronized (this.f163107d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t[] tVarArr = this.f163107d;
            if (tVarArr[0] == null) {
                tVarArr[0] = i0();
                this.f163107d[0].mo14658x74041feb(this.f163108e, "WeixinJSCore");
                if (!android.text.TextUtils.isEmpty("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);")) {
                    this.f163107d[0].mo14660x738236e6("(function (global) {\n        if (!Object.assign) {\n            Object.defineProperty(Object, \"assign\", {\n                enumerable: false,\n                configurable: true,\n                writable: true,\n                value: function (target, firstSource) {\n                    \"use strict\";\n                    if (target === undefined || target === null)\n                        throw new TypeError(\"Cannot convert first argument to object\");\n                    var to = Object(target);\n                    for (var i = 1; i < arguments.length; i++) {\n                        var nextSource = arguments[i];\n                        if (nextSource === undefined || nextSource === null) continue;\n                        var keysArray = Object.keys(Object(nextSource));\n                        for (var nextIndex = 0, len = keysArray.length; nextIndex < len; nextIndex++) {\n                            var nextKey = keysArray[nextIndex];\n                            var desc = Object.getOwnPropertyDescriptor(nextSource, nextKey);\n                            if (desc !== undefined && desc.enumerable) to[nextKey] = nextSource[nextKey];\n                        }\n                    }\n                    return to;\n                }\n            });\n        }\n})(this);", null);
                }
                v0();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).g(runnable);
    }

    public final java.lang.String o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, android.os.Looper looper) {
        if (!c(k0Var.k(), c0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "invoke log[%s] api[%s], callbackId[%d], component not running", b0(), k0Var.k(), java.lang.Integer.valueOf(i17));
            return s0(k0Var.k(), "fail:interrupted");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q(this, str, k0Var, str2, i17, c0Var, looper);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar = this.f163111h;
        if (!(kVar != null && kVar.c(k0Var, str, str2, i17, qVar))) {
            qVar.a();
        }
        return !android.text.TextUtils.isEmpty(qVar.f165032a) ? qVar.f165032a : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public final void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var) {
        n5Var.p(this).m();
    }

    public final java.lang.String p0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        return q0(str, str2, str3, i17, false, null, -1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        if (cls == null) {
            return null;
        }
        nd.b bVar = (nd.b) this.f163115o.b(cls);
        if (bVar != null || (bVar = nd.f.a(cls)) == null || cls.isAssignableFrom(bVar.getClass())) {
            return (T) bVar;
        }
        return null;
    }

    /* JADX WARN: Finally extract failed */
    public java.lang.String q0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, int i18) {
        java.lang.reflect.Field field;
        java.lang.String str4 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f17 = f(str);
        if (f17 == null) {
            a(i17, s0(str, "fail:not supported"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "invokeHandler, api: %s not support", str);
            return "fail:not supported";
        }
        java.lang.System.currentTimeMillis();
        boolean z18 = f17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f;
        b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 mo50357xcd94f799 = c0Var == null ? mo50357xcd94f799() : c0Var;
        if (z18) {
            if (c0Var != null) {
                synchronized (this.f163118r) {
                    this.f163118r.put(i17, c0Var);
                }
            }
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) f17).z()) {
                if (z17) {
                    boolean z19 = true;
                    if (!this.f163120t) {
                        try {
                            try {
                                try {
                                    field = (java.lang.reflect.Field) d56.b.a(android.os.Looper.class.getField("sThreadLocal"));
                                } catch (java.lang.NoSuchFieldException e17) {
                                    java.lang.Class cls = android.os.Looper.class;
                                    do {
                                        try {
                                            field = (java.lang.reflect.Field) d56.b.a(cls.getDeclaredField("sThreadLocal"));
                                        } catch (java.lang.NoSuchFieldException unused) {
                                            cls = cls.getSuperclass();
                                            if (cls == null) {
                                                throw new d56.c(e17);
                                            }
                                        }
                                    } while (cls == null);
                                    throw new d56.c(e17);
                                }
                                field.getType();
                                java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) field.get(android.os.Looper.class);
                                if (threadLocal.get() == null) {
                                    threadLocal.set(mo50350x12b4fba4().mo50280x23b2dd47());
                                }
                                this.f163120t = true;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                            } catch (java.lang.Exception e18) {
                                throw new d56.c(e18);
                            }
                        } catch (java.lang.Throwable th6) {
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "hookLooper, t=%s", th6);
                                if (this.f163120t) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                                }
                                z19 = false;
                            } catch (java.lang.Throwable th7) {
                                if (this.f163120t) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComponentImpl", "[+] hookLooper succeed");
                                }
                                throw th7;
                            }
                        }
                    }
                    if (z19) {
                        this.f163116p.b(str, i18);
                        o0(f17, str2, str3, i17, mo50357xcd94f799, j0().mo50280x23b2dd47());
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif cif = this.f163116p;
                synchronized (cif) {
                    if (!cif.f162850b) {
                        cif.f162851c.put(i17, java.lang.System.currentTimeMillis());
                    }
                }
                j0().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o(this, i17, str, f17, str2, str3, i17, mo50357xcd94f799));
            } else {
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "hy: should be called in js thread but called in async thread");
                    return "";
                }
                o0(f17, str2, str3, i17, mo50357xcd94f799, null);
                str4 = "";
            }
        } else {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "hy: is sync but called in async thread");
                return "";
            }
            str4 = o0(f17, str2, str3, i17, mo50357xcd94f799, null);
        }
        b0();
        java.lang.System.currentTimeMillis();
        return str4;
    }

    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 g0Var) {
        this.f163113m.add(g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String r0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        try {
            if (k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) {
                return k0Var.m() ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) k0Var).A(this, jSONObject, c0Var) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) k0Var).z(this, jSONObject);
            }
            if (!(k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f)) {
                return "";
            }
            java.lang.String u07 = u0(k0Var, jSONObject);
            if (u07 == null) {
                if (k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g) k0Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff(c0Var, this, jSONObject, jSONObject2, i17));
                } else if (k0Var.m()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) k0Var).B(this, jSONObject, i17, c0Var);
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) k0Var).A(this, jSONObject, i17);
                }
            }
            return u07;
        } catch (java.lang.ClassCastException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandComponentImpl", e17, e17.getMessage(), new java.lang.Object[0]);
            return k0Var.o("fail:internal error invalid js component");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "invokeTheJsApi with name[%s], get exception %s", k0Var, th6);
            throw th6;
        }
    }

    public final boolean s(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i iVar = this.f163119s;
        if (iVar != null) {
            return iVar.c(str, mo50357xcd94f799());
        }
        return true;
    }

    public java.lang.String s0(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errMsg", str + ":" + str2);
        return new org.json.JSONObject(hashMap).toString();
    }

    /* renamed from: setEvalInterceptor */
    public void m51033x1e742f27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i iVar) {
        this.f163119s = iVar;
    }

    /* renamed from: setInterceptor */
    public void m51034xe1aac063(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar) {
        this.f163111h = kVar;
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 t0(java.lang.Class cls) {
        return null;
    }

    public void u(java.util.Collection<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> collection) {
        this.f163113m.addAll(collection);
    }

    public final java.lang.String u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, org.json.JSONObject jSONObject) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.c(mo50357xcd94f799(), k0Var, jSONObject, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT) {
            return k0Var.o("fail:convert native buffer parameter fail. native buffer exceed size limit.");
        }
        return null;
    }

    public void v0() {
    }

    public final <T extends nd.b> void w0(java.lang.Class<T> cls, T t17) {
        lm0.e eVar = this.f163115o;
        eVar.getClass();
        eVar.a(cls, new lm0.f(t17));
    }

    public final void x0(java.lang.Class<? extends lm0.a> cls) {
        this.f163115o.c(cls);
    }
}

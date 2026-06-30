package si1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f489756d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f489757e;

    /* renamed from: f, reason: collision with root package name */
    public final vd1.b f489758f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseIntArray f489759g;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        super(o6Var, d0Var, o6Var.X1);
        this.f489759g = new android.util.SparseIntArray();
        this.f489756d = o6Var;
        this.f489757e = d0Var;
        this.f489758f = o6Var.f167709k2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        synchronized (this.f489759g) {
            this.f489759g.delete(i17);
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if ((o45.wf.f424567l || o45.wf.f424566k) && "fail:internal error invalid js component".equals(str3)) {
            throw new java.lang.ClassCastException(java.lang.String.format("Mismatch api(%s) component", k0Var.k()));
        }
        this.f489758f.b(i17, str3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 api, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar) {
        vd1.b bVar = this.f489758f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 component = this.f489757e;
        java.lang.String str3 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f489756d;
        if (o6Var.q2()) {
            try {
                java.lang.String str4 = o6Var.u0().f158816i;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str4 != null) {
                    str3 = str4;
                }
            } catch (java.lang.Exception unused) {
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = o6Var.x0();
            str3 = x07 == null ? null : x07.m52170xad58292c();
        }
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        if (!((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.e0.f169470a).contains(api.k())) {
            vd1.g gVar = (vd1.g) bVar.f517096b.f517093a.poll();
            if (gVar == null) {
                gVar = new vd1.g();
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            gVar.f517113a = component;
            gVar.f517114b = api;
            gVar.f517115c = str;
            gVar.f517116d = elapsedRealtime;
            gVar.f517117e = str3;
            gVar.f517118f = 0;
            android.util.SparseArray sparseArray = bVar.f517095a;
            synchronized (sparseArray) {
                sparseArray.put(i17, gVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 env = this.f489757e;
        java.util.LinkedList linkedList = si1.q1.f489819a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (si1.q1.f489819a.contains(api.k()) ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.PaymentAppbrandJsb.l(env.getF229340d(), new si1.p1(jVar, api, env)) : false) {
            return true;
        }
        return super.c(api, str, str2, i17, jVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k
    public void d(int i17, java.lang.String str) {
        this.f489758f.b(i17, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.Object obj;
        android.util.SparseArray sparseArray = this.f489758f.f517095a;
        synchronized (sparseArray) {
            obj = sparseArray.get(i17, null);
        }
        vd1.g gVar = (vd1.g) obj;
        if (gVar != null) {
            gVar.f517118f = i18;
        }
        if (4 == i18) {
            java.util.HashSet hashSet = m05.f.f404093a;
            java.lang.String apiName = k0Var.k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
            if (m05.f.f404093a.contains(apiName)) {
                java.lang.String functionId = "AppBrand-".concat(apiName);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionId, "functionId");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "4", functionId, "3", "", "", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0), java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) > 1.0f ? 1 : 0));
                r11 = 1;
            }
            if (r11 != 0) {
                synchronized (this.f489759g) {
                    this.f489759g.delete(i17);
                }
            }
        }
    }

    public void g(final java.lang.String str, final int i17) {
        this.f489757e.mo50350x12b4fba4().mo50293x3498a0(new java.lang.Runnable() { // from class: si1.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                boolean z17;
                si1.a aVar = si1.a.this;
                int i18 = i17;
                java.lang.String apiName = str;
                synchronized (aVar.f489759g) {
                    z17 = aVar.f489759g.get(i18, 0) == 1;
                }
                java.util.HashSet hashSet = m05.f.f404093a;
                boolean z18 = !z17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
                if (z18 || !m05.f.f404093a.contains(apiName)) {
                    return;
                }
                m05.i.f404103a.c("AppBrand-".concat(apiName), "2", "maybe not invoked");
            }
        });
    }

    public boolean h(java.lang.String apiName, int i17) {
        java.util.HashSet hashSet = m05.f.f404093a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        if (!m05.f.f404093a.contains(apiName)) {
            return false;
        }
        synchronized (this.f489759g) {
            this.f489759g.put(i17, 1);
        }
        return true;
    }
}

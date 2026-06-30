package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9;

/* loaded from: classes7.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f169240o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f169241p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.q f169242q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f169243r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.e f169244s;

    public v() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f169240o = new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date(currentTimeMillis));
        this.f169241p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.p(this));
        this.f169242q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.q(this);
        this.f169244s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.u();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d
    public void I() {
        super.I();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f169243r;
        if (b4Var != null) {
            b4Var.c(500L, 500L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d
    public java.lang.String L1() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f169243r;
        if (b4Var != null) {
            b4Var.d();
        }
        return super.L1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 A1;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e O;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init isEnable:");
        boolean z17 = this.f169228d;
        sb6.append(z17);
        sb6.append(" service:");
        sb6.append(e9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", sb6.toString());
        if (z17 && e9Var != null) {
            nd.f.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.d.class, this);
            this.f169229e = e9Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = e9Var.mo50357xcd94f799();
            if (mo50357xcd94f799 != null) {
                mo50357xcd94f799.mo14658x74041feb(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.w(this), "ProfileGlobal");
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50357xcd94f799);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = this.f169229e;
            com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f151 = null;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = e9Var2 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y ? (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) e9Var2 : null;
            if (yVar != null && (A1 = yVar.A1()) != null && (O = A1.O()) != null) {
                c5128x72a3f151 = O.f128931a;
            }
            this.f169230f = c5128x72a3f151;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageProfileManager", "installCommonBindingJni waService:" + this.f169229e + " inspectorAccessible:" + this.f169230f);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class)).k0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.k(this, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h07 = mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h07, "getAddon(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) h07).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.l(this));
        }
        if (z17) {
            qk.v6 v6Var = (qk.v6) ((jz5.n) this.f169241p).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v6Var);
            ((xz1.k) v6Var).Ai(this.f169242q);
            this.f169243r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.s(this), true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o
    public void b(java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.e eVar = this.f169244s;
        boolean z17 = false;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.u) eVar;
            org.json.JSONObject jSONObject = new org.json.JSONObject(msg);
            java.lang.String optString = jSONObject.optString(ya.b.f77491x8758c4e1, "");
            int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (r26.n0.B(optString, "HeapProfiler", false) || uVar.f169239a.contains(java.lang.Integer.valueOf(optInt))) {
                z17 = true;
            }
        }
        if (z17) {
            this.f169242q.b(msg);
            return;
        }
        if (this.f169228d) {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onInspectMessage('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(msg)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f169229e;
            if (e9Var == null || (mo50357xcd94f799 = e9Var.mo50357xcd94f799()) == null) {
                return;
            }
            mo50357xcd94f799.mo14660x738236e6(format, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.m(msg));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.o
    public void d() {
        super.d();
        qk.v6 v6Var = (qk.v6) ((jz5.n) this.f169241p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v6Var);
        ((xz1.k) v6Var).Bi(this.f169242q);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f169243r;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.b
    public void s(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f169242q.b(data);
    }
}

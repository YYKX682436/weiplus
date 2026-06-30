package pf1;

/* loaded from: classes7.dex */
public final class v implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l {

    /* renamed from: d, reason: collision with root package name */
    public final pf1.c f435331d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f435332e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f435333f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f435334g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f435335h;

    /* renamed from: i, reason: collision with root package name */
    public final pf1.h f435336i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f435337m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gf f435338n;

    public v(pf1.c view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f435331d = view;
        this.f435332e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f435333f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f435334g = jz5.h.b(new pf1.t(this));
        this.f435335h = jz5.h.b(new pf1.u(this));
        this.f435336i = new pf1.h(view);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var : kz5.b0.c(new pf1.f())) {
            java.lang.String k17 = k0Var.k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getName(...)");
            hashMap.put(k17, k0Var);
        }
        this.f435337m = hashMap;
        this.f435338n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gf();
    }

    public final java.lang.String B(java.lang.String apiName, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) this.f435337m.get(apiName);
        if (k0Var == null) {
            return pf1.a.f435301a;
        }
        org.json.JSONObject jSONObject = null;
        if (!(k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f)) {
            if (!(k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1)) {
                return pf1.a.f435303c;
            }
            if (!(str == null || str.length() == 0)) {
                try {
                    jSONObject = new org.json.JSONObject(str);
                } catch (org.json.JSONException unused) {
                }
            }
            return jSONObject == null ? pf1.a.f435302b : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) k0Var).z(this, jSONObject);
        }
        if (!(str == null || str.length() == 0)) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused2) {
            }
        }
        if (jSONObject == null) {
            return pf1.a.f435302b;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) k0Var;
        if (fVar.z()) {
            fVar.A(this, jSONObject, i17);
        } else {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f435334g).mo141623x754a37bb()).mo50293x3498a0(new pf1.s(k0Var, this, jSONObject, i17));
        }
        return "";
    }

    public final void L() {
        g("sys:init", "{}");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void a(int i17, java.lang.String str) {
        pf1.h hVar = this.f435336i;
        hVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.invokeCallbackHandler(");
        sb6.append(i17);
        sb6.append(", ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "{}";
        }
        sb6.append(str);
        sb6.append(')');
        pf1.h.a(hVar, sb6.toString(), null, 2, null);
    }

    public final java.lang.String a0() {
        return ((pf1.q) this.f435331d).m158331x74292566();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> T b(java.lang.Class<T> cls) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0;
        if (cls == null || (C0 = ((pf1.q) this.f435331d).m158335x9a3f0ba2().C0()) == null) {
            return null;
        }
        return (T) C0.b(cls);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.gf b0() {
        return this.f435338n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public boolean c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        return true;
    }

    public final pf1.c c0() {
        return this.f435331d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        g(str, str2);
    }

    public final void d0() {
        pf1.r rVar = new pf1.r();
        rVar.s("active", java.lang.Boolean.FALSE);
        p(rVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        pf1.h hVar = this.f435336i;
        hVar.getClass();
        if (str == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('");
        sb6.append(str);
        sb6.append("', ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "{}";
        }
        sb6.append(str2);
        sb6.append(')');
        pf1.h.a(hVar, sb6.toString(), null, 2, null);
    }

    public final void e0() {
        pf1.r rVar = new pf1.r();
        rVar.s("active", java.lang.Boolean.TRUE);
        p(rVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void g(java.lang.String str, java.lang.String str2) {
        e(str, str2, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppId */
    public java.lang.String mo48798x74292566() {
        return ((pf1.q) this.f435331d).m158331x74292566();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppState */
    public u81.b mo48799xc0ccc466() {
        return ((pf1.q) this.f435331d).m158335x9a3f0ba2().N.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getAsyncHandler */
    public qu5.a mo50350x12b4fba4() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f435334g).mo141623x754a37bb();
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
    public android.content.Context mo50352x76847179() {
        return ((pf1.q) this.f435331d).m158330x3af91936();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getDialogContainer */
    public fl1.g2 mo50353x784fb1e3() {
        return ((pf1.q) this.f435331d).m158335x9a3f0ba2().m48801x784fb1e3();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getFileSystem */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getInterceptor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k mo50355x4b454cef() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getInvokeCostManager */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif mo50356x8f2ff6d2() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getJsRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) ((jz5.n) this.f435335h).mo141623x754a37bb();
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
        this.f435332e.mo50302x6b17ad39(null);
        if (this.f435333f.get()) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f435334g).mo141623x754a37bb()).mo50280x23b2dd47().quit();
        }
        this.f435336i.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) ((jz5.n) this.f435335h).mo141623x754a37bb()).mo14659x5cd39ffa();
        this.f435338n.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, int[] iArr) {
        if (n5Var == null) {
            return;
        }
        if (!(n5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b)) {
            p(n5Var);
            return;
        }
        pf1.c cVar = this.f435331d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = ((pf1.q) cVar).m158335x9a3f0ba2().C0();
        if (C0 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b) n5Var;
        bVar.s("webviewId", java.lang.Integer.valueOf(cVar.hashCode()));
        bVar.s("htmlId", java.lang.Integer.valueOf(((pf1.q) cVar).m158333x1d24f51c()));
        bVar.v(C0, cVar.hashCode());
        bVar.m();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: isRunning */
    public boolean mo50262x39e05d35() {
        return !((pf1.q) this.f435331d).m158335x9a3f0ba2().L0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void j(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        ((pf1.q) this.f435331d).m158335x9a3f0ba2().j(runnable, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0> T k(java.lang.Class<T> clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        return (T) ((pf1.q) this.f435331d).m158335x9a3f0ba2().k(clazz);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public boolean l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0 h0Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void m(java.lang.Runnable runnable) {
        ((pf1.q) this.f435331d).m158335x9a3f0ba2().m(runnable);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public android.content.Context n() {
        return mo50352x76847179();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).g(runnable);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var) {
        if (n5Var == null) {
            return;
        }
        g(n5Var.k(), n5Var.o());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        return (T) ((pf1.q) this.f435331d).m158335x9a3f0ba2().K1(cls);
    }

    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 g0Var) {
    }

    public boolean s(java.lang.String str) {
        return true;
    }

    /* renamed from: setEvalInterceptor */
    public void m158336x1e742f27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i iVar) {
    }

    /* renamed from: setInterceptor */
    public void m158337xe1aac063(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar) {
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    public void u(java.util.Collection<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> collection) {
    }
}

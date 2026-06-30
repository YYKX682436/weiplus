package o93;

/* loaded from: classes7.dex */
public final class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 {

    /* renamed from: g, reason: collision with root package name */
    public o93.f f425250g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f425251h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f425252i;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f425247d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final o93.d f425248e = new o93.d();

    /* renamed from: f, reason: collision with root package name */
    public final o93.b f425249f = new o93.b();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f425253m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f425254n = "liteapp";

    /* renamed from: o, reason: collision with root package name */
    public long f425255o = 1;

    public final void B(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
    }

    public final void L(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f425254n = appId;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "callback callbackId:%s dst:%s", java.lang.Integer.valueOf(i17), str);
        o93.i.b().a(i17, str);
    }

    public final void a0(long j17) {
        this.f425255o = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> T b(java.lang.Class<T> cls) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = cls != null ? cls.getName() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getConfig clazz name:%s", objArr);
        o93.b bVar = this.f425249f;
        if (bVar != null) {
            return bVar;
        }
        try {
            T t17 = (T) new d56.b(cls, cls).c().f308165b;
            if (t17 != null) {
                try {
                    r(t17);
                } catch (java.lang.Exception unused) {
                    bVar = t17;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaLiteApp.LiteAppAppBrandComponent", "Make sure %s has default constructor", cls.getName());
                    return bVar;
                }
            }
            return t17;
        } catch (java.lang.Exception unused2) {
        }
    }

    public final void b0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f425251h = new java.lang.ref.WeakReference(context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public boolean c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "checkIsActivatedForEval %s", str);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "publish event:%s data:%s dst:%d", str, str2, iArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s data:%s src:%d", str, str2, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void g(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s data:%s", str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppId */
    public java.lang.String mo48798x74292566() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getAppId");
        return this.f425254n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppState */
    public u81.b mo48799xc0ccc466() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getAppState");
        return u81.b.FOREGROUND;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getAsyncHandler */
    public qu5.a mo50350x12b4fba4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getAsyncHandler");
        return this.f425247d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getAuthorizeDialogContainer */
    public /* bridge */ /* synthetic */ fl1.g2 mo50351x14ed3266() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getComponentId */
    public int mo50260x9f1221c2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getComponentId");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getContext */
    public android.content.Context mo50352x76847179() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getContext");
        java.lang.ref.WeakReference weakReference = this.f425251h;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context != null) {
            return context;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        return context2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getDialogContainer */
    public fl1.g2 mo50353x784fb1e3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getDialogContainer");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getFileSystem */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getFileSystem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = this.f425252i;
        if (u1Var == null) {
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.g(), "luggage/liteapp/objects").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            this.f425253m = o17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "tmpDirPath: " + this.f425253m);
            this.f425252i = new o93.c(this.f425253m, this.f425254n, this.f425255o);
        } else {
            if (u1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFS");
                throw null;
            }
            ((o93.c) u1Var).f425257e = this.f425254n;
            if (u1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFS");
                throw null;
            }
            ((o93.c) u1Var).f425258f = this.f425255o;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var2 = this.f425252i;
        if (u1Var2 != null) {
            return u1Var2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFS");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getInterceptor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k mo50355x4b454cef() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getInterceptor");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getInvokeCostManager */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif mo50356x8f2ff6d2() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getJsRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getJsRuntime");
        return this.f425248e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getLifecycleOwner */
    public /* bridge */ /* synthetic */ p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t3() {
        java.lang.ref.WeakReference weakReference = this.f425251h;
        if ((weakReference != null ? (android.content.Context) weakReference.get() : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WxaLiteApp.LiteAppAppBrandComponent", "not call setContext");
            return null;
        }
        java.lang.ref.WeakReference weakReference2 = this.f425251h;
        android.content.Context context = weakReference2 != null ? (android.content.Context) weakReference2.get() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f425250g = new o93.f(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "context: " + mo50352x76847179());
        o93.f fVar = this.f425250g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        return fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getWindowAndroid */
    public /* bridge */ /* synthetic */ xi1.g mo50261xee5260a9() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "cleanup");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, int[] iArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = n5Var != null ? n5Var.k() : null;
        objArr[1] = java.lang.String.valueOf(iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "publish event:%s dst:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: isRunning */
    public boolean mo50262x39e05d35() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "isRunning");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void j(java.lang.Runnable runnable, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "scheduleToUiThreadDelayed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0> T k(java.lang.Class<T> clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public boolean l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0 h0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "attachEnvContext");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void m(java.lang.Runnable runnable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "scheduleToUiThread");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public android.content.Context n() {
        java.lang.ref.WeakReference weakReference = this.f425251h;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        return context instanceof android.app.Activity ? context : mo50352x76847179();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).g(runnable);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = n5Var != null ? n5Var.k() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "customize");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 g0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "attachConfig");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public boolean s(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "checkIsActivatedForEval %s", str);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: setEvalInterceptor */
    public void mo50359x1e742f27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "setEvalInterceptor");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: setInterceptor */
    public void mo50360xe1aac063(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(kVar != null ? kVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "setInterceptor interceptor:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void u(java.util.Collection<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> collection) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "attachConfig");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x() {
        return null;
    }

    public final long y() {
        return this.f425255o;
    }
}

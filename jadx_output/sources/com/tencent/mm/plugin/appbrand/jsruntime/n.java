package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public abstract class n implements com.tencent.mm.plugin.appbrand.jsruntime.r, com.tencent.mm.plugin.appbrand.jsruntime.v, com.tencent.mm.plugin.appbrand.jsruntime.k0, com.tencent.mm.plugin.appbrand.jsruntime.f0, com.tencent.mm.plugin.appbrand.jsruntime.b0, com.tencent.mm.plugin.appbrand.jsruntime.l0, com.tencent.mm.plugin.appbrand.jsruntime.w, com.tencent.mm.plugin.appbrand.jsruntime.h0, com.tencent.mm.plugin.appbrand.jsruntime.i0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsruntime.d1 f84019d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding f84020e;

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void B(com.tencent.mm.plugin.appbrand.jsruntime.d1 d1Var) {
        this.f84019d = d1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void C(int i17) {
        ((cl.a) c0()).i(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long G() {
        return n0().e();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public com.tencent.mm.plugin.appbrand.jsruntime.d1 H() {
        return this.f84019d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public int K() {
        return n0().f42725c.generateId();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long L() {
        return ((cl.a) c0()).f42568a.getIsolatePtr();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        com.tencent.mm.plugin.appbrand.jsruntime.j jVar = valueCallback == null ? null : new com.tencent.mm.plugin.appbrand.jsruntime.j(this, valueCallback);
        cl.q0 n07 = n0();
        java.lang.String url2 = url != null ? url.toString() : null;
        n07.getClass();
        ((cl.a) n07.f42724b).h(new cl.g1(n07, jVar, i17, str3, url2, str, str2), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void Q(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, cl.j1 j1Var) {
        cl.q0 n07 = n0();
        java.lang.String url2 = url == null ? null : url.toString();
        n07.getClass();
        ((cl.a) n07.f42724b).h(new cl.g1(n07, j1Var, i17, str3, url2, str, str2), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (url == null) {
            evaluateJavascript(str, valueCallback);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.i iVar = valueCallback == null ? null : new com.tencent.mm.plugin.appbrand.jsruntime.i(this, valueCallback);
        cl.q0 n07 = n0();
        java.lang.String url2 = url.toString();
        n07.getClass();
        ((cl.a) n07.f42724b).h(new cl.f1(n07, iVar, str, url2), false);
    }

    public int T(int i17) {
        cl.n0 n0Var = (cl.n0) n0().f42726d;
        int addAndGet = n0Var.f42702a.addAndGet(1);
        cl.m0 m0Var = new cl.m0(i17, n0Var.f42704c);
        ((java.util.HashMap) n0Var.f42703b).put(java.lang.Integer.valueOf(addAndGet), m0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "create capacity:%d, id:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(addAndGet));
        return addAndGet;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void U(int i17, java.nio.ByteBuffer byteBuffer) {
        n0().f42725c.setBuffer(i17, byteBuffer);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void W(final java.util.ArrayList arrayList, final java.lang.String str, final java.lang.Runnable runnable) {
        final cl.q0 n07 = n0();
        n07.getClass();
        ((cl.a) n07.f42724b).h(new java.lang.Runnable() { // from class: cl.q0$$b
            @Override // java.lang.Runnable
            public final void run() {
                cl.q0.this.f().batchCompileAndGenCodeCacheForScripts(arrayList, str);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public java.lang.String a() {
        return ((cl.a) c0()).f42569b.a();
    }

    public void a0(int i17) {
        java.util.HashMap hashMap = (java.util.HashMap) ((cl.n0) n0().f42726d).f42703b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SharedV8ArrayBufferMgr", "destroy: id %d not exist", java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "destroy id:%d", java.lang.Integer.valueOf(i17));
        cl.m0 m0Var = (cl.m0) hashMap.get(java.lang.Integer.valueOf(i17));
        ((cl.a) m0Var.f42692a.f42724b).h(new cl.l0(m0Var), false);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        cl.q0 n07 = n0();
        n07.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((cl.a) n07.f42724b).h(new cl.t0(n07, obj, str, android.webkit.JavascriptInterface.class), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public void bufferStoreBindTo(long j17, long j18) {
        n0().f42725c.bufferStoreBindTo(j17, j18);
    }

    public abstract cl.p c0();

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        ((cl.a) c0()).h(new com.tencent.mm.plugin.appbrand.jsruntime.k(this), false);
        n0().c();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void e() {
        ((cl.a) c0()).f42569b.e();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        n0().d(str, valueCallback == null ? null : new com.tencent.mm.plugin.appbrand.jsruntime.h(this, valueCallback));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public boolean g() {
        return ((cl.a) c0()).f42569b.k();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void h(boolean z17) {
        ((cl.a) c0()).f42569b.h(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        if (cls.isInstance(this)) {
            return this;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public boolean j() {
        return ((cl.a) c0()).f42569b.j();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public java.nio.ByteBuffer j0(int i17, boolean z17) {
        return n0().f42725c.getBuffer(i17, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void k(java.lang.Runnable runnable, boolean z17) {
        cl.a aVar = (cl.a) c0();
        aVar.c();
        aVar.f42569b.l(runnable, 0L, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void l0(java.util.ArrayList arrayList, java.lang.String str, cl.j1 j1Var) {
        n0().b(arrayList, str, j1Var);
    }

    public java.nio.ByteBuffer m0(int i17) {
        java.util.HashMap hashMap = (java.util.HashMap) ((cl.n0) n0().f42726d).f42703b;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return ((cl.m0) hashMap.get(java.lang.Integer.valueOf(i17))).f42694c;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SharedV8ArrayBufferMgr", "getBackingStore: id %d not exist", java.lang.Integer.valueOf(i17));
        return null;
    }

    public abstract cl.q0 n0();

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.k0
    public void pause() {
        cl.a aVar = (cl.a) c0();
        aVar.f42569b.pause();
        cl.a.f42567z.b(aVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.f0
    public void post(java.lang.Runnable runnable) {
        k(runnable, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void precompile(final java.lang.String str, final java.lang.String str2) {
        final cl.q0 n07 = n0();
        n07.getClass();
        ((cl.a) n07.f42724b).h(new java.lang.Runnable() { // from class: cl.q0$$c
            @Override // java.lang.Runnable
            public final void run() {
                cl.q0.this.f().precompile(str, str2);
            }
        }, false);
    }

    public void q0(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str) {
        if (!(rVar instanceof com.tencent.mm.plugin.appbrand.jsruntime.n)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = rVar == null ? null : rVar.getClass().getName();
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJ2V8Context", "shareObject with unsupported implementation %s", objArr);
        } else {
            cl.q0 n07 = n0();
            cl.q0 n08 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).n0();
            n07.getClass();
            ((cl.a) n07.f42724b).h(new cl.v0(n07, str, n08), false);
        }
    }

    public void r0(int i17) {
        ((cl.j0) n0().f42727e).b(i17);
    }

    public void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer) {
        n0().f42725c.releaseDirectByteBuffer(byteBuffer);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.k0
    public void resume() {
        cl.a aVar = (cl.a) c0();
        aVar.f42569b.resume();
        cl.a.f42567z.a(aVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void saveEntryPagePathToCachePath() {
        final cl.q0 n07 = n0();
        n07.getClass();
        ((cl.a) n07.f42724b).h(new java.lang.Runnable() { // from class: cl.q0$$d
            @Override // java.lang.Runnable
            public final void run() {
                cl.q0.this.f().saveEntryPagePathToCachePath();
            }
        }, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.v
    public boolean supportBufferStoreBindTo() {
        return n0().f42725c.supportBufferStoreBindTo();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public void v() {
        com.eclipsesource.mmv8.MultiContextV8 multiContextV8 = ((cl.a) c0()).f42568a;
        if (multiContextV8 != null) {
            multiContextV8.markSnapshotNotNeed();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.l0
    public long z() {
        return ((cl.a) c0()).f42568a.getUVLoopPtr();
    }
}

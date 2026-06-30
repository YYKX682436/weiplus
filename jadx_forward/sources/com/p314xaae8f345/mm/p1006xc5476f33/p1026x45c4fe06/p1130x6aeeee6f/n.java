package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public abstract class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.i0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 f165552d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5130x9c70410d f165553e;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 d1Var) {
        this.f165552d = d1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public void C(int i17) {
        ((cl.a) c0()).i(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public long G() {
        return n0().e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 H() {
        return this.f165552d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public int K() {
        return n0().f124258c.mo15017x12389570();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public long L() {
        return ((cl.a) c0()).f124101a.m15872xc2f94e39();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j jVar = valueCallback == null ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j(this, valueCallback);
        cl.q0 n07 = n0();
        java.lang.String url2 = url != null ? url.toString() : null;
        n07.getClass();
        ((cl.a) n07.f124257b).h(new cl.g1(n07, jVar, i17, str3, url2, str, str2), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public void Q(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, cl.j1 j1Var) {
        cl.q0 n07 = n0();
        java.lang.String url2 = url == null ? null : url.toString();
        n07.getClass();
        ((cl.a) n07.f124257b).h(new cl.g1(n07, j1Var, i17, str3, url2, str, str2), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (url == null) {
            mo14660x738236e6(str, valueCallback);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.i iVar = valueCallback == null ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.i(this, valueCallback);
        cl.q0 n07 = n0();
        java.lang.String url2 = url.toString();
        n07.getClass();
        ((cl.a) n07.f124257b).h(new cl.f1(n07, iVar, str, url2), false);
    }

    public int T(int i17) {
        cl.n0 n0Var = (cl.n0) n0().f124259d;
        int addAndGet = n0Var.f124235a.addAndGet(1);
        cl.m0 m0Var = new cl.m0(i17, n0Var.f124237c);
        ((java.util.HashMap) n0Var.f124236b).put(java.lang.Integer.valueOf(addAndGet), m0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "create capacity:%d, id:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(addAndGet));
        return addAndGet;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public void U(int i17, java.nio.ByteBuffer byteBuffer) {
        n0().f124258c.mo15020x627eb42(i17, byteBuffer);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public void W(final java.util.ArrayList arrayList, final java.lang.String str, final java.lang.Runnable runnable) {
        final cl.q0 n07 = n0();
        n07.getClass();
        ((cl.a) n07.f124257b).h(new java.lang.Runnable() { // from class: cl.q0$$b
            @Override // java.lang.Runnable
            public final void run() {
                cl.q0.this.f().mo16344x45b0ad22(arrayList, str);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public java.lang.String a() {
        return ((cl.a) c0()).f124102b.a();
    }

    public void a0(int i17) {
        java.util.HashMap hashMap = (java.util.HashMap) ((cl.n0) n0().f124259d).f124236b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SharedV8ArrayBufferMgr", "destroy: id %d not exist", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SharedV8ArrayBufferMgr", "destroy id:%d", java.lang.Integer.valueOf(i17));
        cl.m0 m0Var = (cl.m0) hashMap.get(java.lang.Integer.valueOf(i17));
        ((cl.a) m0Var.f124225a.f124257b).h(new cl.l0(m0Var), false);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: addJavascriptInterface */
    public void mo14658x74041feb(java.lang.Object obj, java.lang.String str) {
        cl.q0 n07 = n0();
        n07.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((cl.a) n07.f124257b).h(new cl.t0(n07, obj, str, android.webkit.JavascriptInterface.class), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    /* renamed from: bufferStoreBindTo */
    public void mo51554x2418f779(long j17, long j18) {
        n0().f124258c.mo15016x2418f779(j17, j18);
    }

    public abstract cl.p c0();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        ((cl.a) c0()).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k(this), false);
        n0().c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public void e() {
        ((cl.a) c0()).f124102b.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        n0().d(str, valueCallback == null ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h(this, valueCallback));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public boolean g() {
        return ((cl.a) c0()).f124102b.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public void h(boolean z17) {
        ((cl.a) c0()).f124102b.h(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        if (cls.isInstance(this)) {
            return this;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public boolean j() {
        return ((cl.a) c0()).f124102b.j();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public java.nio.ByteBuffer j0(int i17, boolean z17) {
        return n0().f124258c.mo15018x12f2b736(i17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public void k(java.lang.Runnable runnable, boolean z17) {
        cl.a aVar = (cl.a) c0();
        aVar.c();
        aVar.f124102b.l(runnable, 0L, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public void l0(java.util.ArrayList arrayList, java.lang.String str, cl.j1 j1Var) {
        n0().b(arrayList, str, j1Var);
    }

    public java.nio.ByteBuffer m0(int i17) {
        java.util.HashMap hashMap = (java.util.HashMap) ((cl.n0) n0().f124259d).f124236b;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return ((cl.m0) hashMap.get(java.lang.Integer.valueOf(i17))).f124227c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SharedV8ArrayBufferMgr", "getBackingStore: id %d not exist", java.lang.Integer.valueOf(i17));
        return null;
    }

    public abstract cl.q0 n0();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0
    /* renamed from: pause */
    public void mo51548x65825f6() {
        cl.a aVar = (cl.a) c0();
        aVar.f124102b.mo15038x65825f6();
        cl.a.f124100z.b(aVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    /* renamed from: post */
    public void mo51545x3498a0(java.lang.Runnable runnable) {
        k(runnable, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    /* renamed from: precompile */
    public void mo51552x1b18fa30(final java.lang.String str, final java.lang.String str2) {
        final cl.q0 n07 = n0();
        n07.getClass();
        ((cl.a) n07.f124257b).h(new java.lang.Runnable() { // from class: cl.q0$$c
            @Override // java.lang.Runnable
            public final void run() {
                cl.q0.this.f().mo16402x1b18fa30(str, str2);
            }
        }, false);
    }

    public void q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str) {
        if (!(rVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = rVar == null ? null : rVar.getClass().getName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJ2V8Context", "shareObject with unsupported implementation %s", objArr);
        } else {
            cl.q0 n07 = n0();
            cl.q0 n08 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) rVar).n0();
            n07.getClass();
            ((cl.a) n07.f124257b).h(new cl.v0(n07, str, n08), false);
        }
    }

    public void r0(int i17) {
        ((cl.j0) n0().f124260e).b(i17);
    }

    /* renamed from: releaseDirectByteBuffer */
    public void mo51547x3b42e258(java.nio.ByteBuffer byteBuffer) {
        n0().f124258c.mo15019x3b42e258(byteBuffer);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0
    /* renamed from: resume */
    public void mo51549xc84dc82d() {
        cl.a aVar = (cl.a) c0();
        aVar.f124102b.mo15040xc84dc82d();
        cl.a.f124100z.a(aVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    /* renamed from: saveEntryPagePathToCachePath */
    public void mo51553xeeaa8763() {
        final cl.q0 n07 = n0();
        n07.getClass();
        ((cl.a) n07.f124257b).h(new java.lang.Runnable() { // from class: cl.q0$$d
            @Override // java.lang.Runnable
            public final void run() {
                cl.q0.this.f().mo16408xeeaa8763();
            }
        }, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    /* renamed from: supportBufferStoreBindTo */
    public boolean mo51555xa0ce6f6a() {
        return n0().f124258c.mo15021xa0ce6f6a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public void v() {
        com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778 = ((cl.a) c0()).f124101a;
        if (c1460x397c7778 != null) {
            c1460x397c7778.m15876x8b9b2118();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public long z() {
        return ((cl.a) c0()).f124101a.m15873x206d1933();
    }
}

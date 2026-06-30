package fj1;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g, uh1.u {

    /* renamed from: d, reason: collision with root package name */
    public final fj1.y f344645d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f344646e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f344647f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f344648g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f344649h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f344650i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f344651m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.SparseArray f344652n;

    public h(fj1.y runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f344645d = runtime;
        this.f344646e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o1.a("MicroMsg.WAMagicBrushFrameJsApiInvokeComponentAdapter.dummyJsRuntime", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t.class);
        this.f344647f = jz5.h.b(fj1.e.f344642d);
        this.f344648g = jz5.h.b(new fj1.f(this));
        this.f344649h = new java.util.concurrent.ConcurrentSkipListSet(fj1.d.f344641d);
        this.f344650i = jz5.h.b(new fj1.g(this));
        this.f344651m = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f344652n = new android.util.SparseArray();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h B() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l) ((jz5.n) this.f344648g).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h L() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f) ((jz5.n) this.f344647f).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: Exception -> 0x0046, TryCatch #1 {Exception -> 0x0046, blocks: (B:22:0x0021, B:12:0x002d, B:14:0x003a, B:20:0x0040), top: B:21:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #1 {Exception -> 0x0046, blocks: (B:22:0x0021, B:12:0x002d, B:14:0x003a, B:20:0x0040), top: B:21:0x0021 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            android.util.SparseArray r0 = r3.f344652n
            monitor-enter(r0)
            android.util.SparseArray r1 = r3.f344652n     // Catch: java.lang.Throwable -> L51
            int r4 = r1.indexOfKey(r4)     // Catch: java.lang.Throwable -> L51
            if (r4 < 0) goto L1c
            android.util.SparseArray r1 = r3.f344652n     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r1.valueAt(r4)     // Catch: java.lang.Throwable -> L51
            r2 = r1
            yz5.l r2 = (yz5.l) r2     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r2 = r3.f344652n     // Catch: java.lang.Throwable -> L51
            r2.removeAt(r4)     // Catch: java.lang.Throwable -> L51
            yz5.l r1 = (yz5.l) r1     // Catch: java.lang.Throwable -> L51
            goto L1d
        L1c:
            r1 = 0
        L1d:
            monitor-exit(r0)
            r4 = 0
            if (r5 == 0) goto L2a
            int r0 = r5.length()     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto L28
            goto L2a
        L28:
            r0 = r4
            goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 != 0) goto L40
            lc3.a0 r0 = new lc3.a0     // Catch: java.lang.Exception -> L46
            r0.<init>(r5)     // Catch: java.lang.Exception -> L46
            java.lang.String r5 = "errCode"
            boolean r5 = r0.has(r5)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L4b
            java.lang.String r5 = "errCode"
            r0.put(r5, r4)     // Catch: java.lang.Exception -> L46
            goto L4b
        L40:
            lc3.a0 r0 = new lc3.a0     // Catch: java.lang.Exception -> L46
            r0.<init>()     // Catch: java.lang.Exception -> L46
            goto L4b
        L46:
            lc3.a0 r0 = new lc3.a0
            r0.<init>()
        L4b:
            if (r1 == 0) goto L50
            r1.mo146xb9724478(r0)
        L50:
            return
        L51:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fj1.h.a(int, java.lang.String):void");
    }

    public final void a0(fj1.k cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        this.f344649h.add(cb6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> T b(java.lang.Class<T> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isAssignableFrom(k91.z0.class)) {
            return this.f344645d.e();
        }
        if (!cls.isAssignableFrom(uh1.a.class)) {
            return null;
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f344650i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (uh1.a) mo141623x754a37bb;
    }

    public final int b0(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int incrementAndGet = this.f344651m.incrementAndGet();
        synchronized (this.f344652n) {
            this.f344652n.put(incrementAndGet, callback);
        }
        return incrementAndGet;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public boolean c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        return mo50262x39e05d35();
    }

    public final void c0(fj1.k cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        this.f344649h.remove(cb6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        g(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        g(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void g(java.lang.String event, java.lang.String str) {
        if (event == null || event.length() == 0) {
            return;
        }
        java.util.Iterator it = this.f344649h.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            fh1.z zVar = (fh1.z) ((fj1.k) it.next());
            zVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            zVar.e(new fh1.j(zVar, event, str));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppId */
    public java.lang.String mo48798x74292566() {
        return this.f344645d.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppState */
    public u81.b mo48799xc0ccc466() {
        int ordinal = this.f344645d.f334811a.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return u81.b.FOREGROUND;
        }
        if (ordinal == 3) {
            return u81.b.BACKGROUND;
        }
        if (ordinal == 4) {
            return u81.b.DESTROYED;
        }
        throw new jz5.j();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getAsyncHandler */
    public /* bridge */ /* synthetic */ qu5.a mo50350x12b4fba4() {
        return null;
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
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getDialogContainer */
    public fl1.g2 mo50353x784fb1e3() {
        return null;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t dummyJsRuntime = this.f344646e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dummyJsRuntime, "dummyJsRuntime");
        return dummyJsRuntime;
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
        this.f344649h.clear();
        synchronized (this.f344652n) {
            this.f344652n.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 event, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        d(event.k(), event.o(), iArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: isRunning */
    public boolean mo50262x39e05d35() {
        return (ej1.g.CREATED == this.f344645d.f334811a || ej1.g.DESTROYED == this.f344645d.f334811a) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void j(java.lang.Runnable runnable, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0> T k(java.lang.Class<T> clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public boolean l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0 h0Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void m(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
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
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        g(event.k(), event.o());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.m0.INSTANCE;
        }
        return null;
    }

    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 g0Var) {
    }

    public boolean s(java.lang.String str) {
        return mo50262x39e05d35();
    }

    /* renamed from: setEvalInterceptor */
    public void m129600x1e742f27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i iVar) {
    }

    /* renamed from: setInterceptor */
    public void m129601xe1aac063(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar) {
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    public void u(java.util.Collection<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0> collection) {
    }
}

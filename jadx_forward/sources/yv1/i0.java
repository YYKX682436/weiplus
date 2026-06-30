package yv1;

/* loaded from: classes12.dex */
public final class i0 implements aw1.f0 {

    /* renamed from: a */
    public volatile yv1.g1 f547602a;

    /* renamed from: c */
    public bw1.f f547604c;

    /* renamed from: f */
    public long f547607f;

    /* renamed from: g */
    public long f547608g;

    /* renamed from: h */
    public long f547609h;

    /* renamed from: i */
    public long f547610i;

    /* renamed from: j */
    public long f547611j;

    /* renamed from: k */
    public long f547612k;

    /* renamed from: o */
    public boolean f547616o;

    /* renamed from: q */
    public final /* synthetic */ yv1.b1 f547618q;

    /* renamed from: b */
    public final java.util.ArrayList f547603b = new java.util.ArrayList();

    /* renamed from: d */
    public final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f547605d = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();

    /* renamed from: e */
    public final java.util.HashSet f547606e = new java.util.HashSet();

    /* renamed from: l */
    public java.lang.String f547613l = "";

    /* renamed from: m */
    public java.lang.String f547614m = "";

    /* renamed from: n */
    public final java.util.concurrent.atomic.AtomicBoolean f547615n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: p */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f547617p = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("mmkv_compress_original_media_unfinished", gm0.j1.b().h(), 1);

    public i0(yv1.b1 b1Var) {
        this.f547618q = b1Var;
    }

    public static /* synthetic */ void e(yv1.i0 i0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        i0Var.d(z17, z18);
    }

    @Override // aw1.f0
    public void a(float f17, long j17, long j18, long j19, long j27, long j28, boolean z17) {
        yv1.h1.g(2, null, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "progress from CompressOriginalMediaService: compressedSize: " + j17 + ", finished: " + z17);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "CleanPersistOriginalMedia task done.");
            bw1.f fVar = this.f547604c;
            if (fVar != null) {
                fVar.a(jz5.f0.f384359a);
            }
            aw1.l0 l0Var = aw1.l0.f96101a;
            aw1.l0.f96109i.remove(this);
            this.f547604c = null;
        }
        synchronized (this) {
            long j29 = j27 - this.f547610i;
            long j37 = j28 - this.f547611j;
            long j38 = j29 + j37;
            this.f547608g = j18;
            this.f547609h = j19;
            this.f547610i = j27;
            this.f547611j = j28;
            yv1.g1 g1Var = this.f547602a;
            if (g1Var != null) {
                synchronized (g1Var) {
                    g1Var.f547577c -= j38;
                    g1Var.f547579e -= j38;
                    g1Var.f547584j -= j29;
                    g1Var.f547585k -= j37;
                    if (z17) {
                        g1Var.f547589o = null;
                    }
                }
            }
        }
        d(z17, false);
    }

    public final void b(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        bw1.f fVar = new bw1.f();
        ((ku5.t0) ku5.t0.f394148d).a(new yv1.d0(c26987xeef691ab, fVar, this));
        synchronized (this.f547603b) {
            this.f547603b.add(fVar);
        }
    }

    public final boolean c() {
        boolean z17;
        synchronized (this.f547603b) {
            java.util.ArrayList arrayList = this.f547603b;
            z17 = true;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((java.util.concurrent.Future) it.next()).isDone()) {
                        z17 = false;
                        break;
                    }
                }
            }
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0 A[LOOP:0: B:41:0x01ba->B:43:0x01c0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.i0.d(boolean, boolean):void");
    }

    public final void f() {
        synchronized (this) {
            this.f547615n.set(this.f547617p.h("clean_cache_reported"));
            this.f547607f = this.f547617p.q("clean_cache_last_clean_size", 0L);
            this.f547612k = this.f547617p.q("clean_cache_estimated_size", 0L);
            aw1.o0 h17 = aw1.l0.f96101a.h();
            this.f547608g = h17.f96158b;
            this.f547609h = h17.f96159c;
            this.f547610i = h17.f96160d;
            this.f547611j = h17.f96161e;
            java.lang.String t17 = this.f547617p.t("clean_cache_session_id");
            if (t17 == null) {
                t17 = "";
            }
            this.f547614m = t17;
            java.lang.String t18 = this.f547617p.t("storage_session_id");
            if (t18 == null) {
                t18 = "";
            }
            this.f547613l = t18;
            this.f547616o = false;
        }
        bw1.f fVar = new bw1.f();
        this.f547604c = fVar;
        synchronized (this.f547603b) {
            this.f547603b.add(fVar);
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = aw1.l0.f96109i;
        concurrentLinkedDeque.add(this);
        if (aw1.l0.f96107g) {
            return;
        }
        concurrentLinkedDeque.remove(this);
        this.f547604c = null;
        fVar.a(jz5.f0.f384359a);
        d(true, true);
    }
}

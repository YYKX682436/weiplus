package e50;

@j95.b
/* loaded from: classes11.dex */
public final class z0 extends i95.w implements f50.y {

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f331089r;

    /* renamed from: e, reason: collision with root package name */
    public pi0.q f331091e;

    /* renamed from: f, reason: collision with root package name */
    public b03.l f331092f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f331093g;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f331090d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f331094h = jz5.h.b(e50.d0.f331018d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f331095i = jz5.h.b(new e50.c0(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f331096m = jz5.h.b(new e50.e0(this));

    /* renamed from: n, reason: collision with root package name */
    public boolean f331097n = true;

    /* renamed from: o, reason: collision with root package name */
    public final e50.b0 f331098o = new e50.b0();

    /* renamed from: p, reason: collision with root package name */
    public final e50.u0 f331099p = new e50.u0();

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f331100q = new java.lang.Object();

    static {
        new e50.t(null);
        f331089r = jz5.h.b(e50.s.f331066d);
    }

    public z0() {
        jz5.h.b(e50.j0.f331040d);
    }

    public int Ai() {
        java.lang.String str;
        boolean z17;
        boolean z18 = false;
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8()) {
            return 0;
        }
        pi0.q qVar = this.f331091e;
        if (qVar == null) {
            return 2;
        }
        bj0.p pVar = bj0.s.f102662f;
        if (qVar == null || (str = qVar.f436237h) == null) {
            str = "";
        }
        bj0.s a17 = pVar.a(str);
        if (a17 != null) {
            synchronized (a17.f102664a) {
                java.util.ArrayList arrayList = a17.f102664a;
                if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bj0.q qVar2 = (bj0.q) it.next();
                        if (qVar2.f102660e && !qVar2.f102659d) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
            }
            if (z17) {
                z18 = true;
            }
        }
        return z18 ? 1 : 2;
    }

    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24543xfc330919 Bi() {
        Zi();
        return (com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24543xfc330919) ((jz5.n) this.f331095i).mo141623x754a37bb();
    }

    public final e50.m1 Di() {
        return (e50.m1) ((jz5.n) this.f331094h).mo141623x754a37bb();
    }

    public java.util.List Ni() {
        int K;
        b03.l lVar = this.f331092f;
        if (lVar == null) {
            return kz5.p0.f395529d;
        }
        java.util.LinkedList linkedList = lVar.f98371a.f436235f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((pi0.u0) it.next()).f436267e;
            if (str != null && (K = r26.n0.K(str, '/', 0, false, 6, null)) > 0) {
                str = str.substring(0, K);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return kz5.n0.D0(arrayList);
    }

    public int Ri() {
        pi0.q qVar = this.f331091e;
        if (qVar != null) {
            return qVar.e();
        }
        return 0;
    }

    public pi0.q Ui() {
        Zi();
        pi0.q qVar = this.f331091e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        return qVar;
    }

    public boolean Vi() {
        return this.f331091e != null;
    }

    public final void Zi() {
        bm5.v1.a("launchInitEngineGroup", new e50.k0(this));
    }

    public void aj(boolean z17) {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("flutter_mem_cache"), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        java.lang.String concat = i17.concat("/memcache.bin");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = Ui().f436234e;
        if (c28580x69eec95e != null) {
            c28580x69eec95e.m137462x1d91eda8(concat, z17, true);
        }
    }

    public void bj(boolean z17) {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("flutter_mem_cache"), true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        java.lang.String concat = i17.concat("/memcache.bin");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = Ui().f436234e;
        if (c28580x69eec95e != null) {
            c28580x69eec95e.m137463xb3410479(concat, z17, true);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        fp.d0.n("aff_biz");
        fp.d0.n("flutter");
        fp.d0.n("mm_foundation_lib");
        new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.Factory().m137772xf9e7376a().m137693xeb57c8f5(context);
        pi0.r.f436251b = new a03.m();
        pi0.r.f436252c = e50.l0.f331050d;
        i95.n0.c(e70.q.class);
        java.util.HashMap hashMap = f50.u.f341124a;
        f50.w wVar = f50.w.f341127a;
        java.util.HashMap hashMap2 = f50.u.f341124a;
        hashMap2.put("engine_kv", wVar);
        hashMap2.put("engine_params", f50.v.f341125a);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.f.f298932c = e50.m0.f331054a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.f.f298930a = e50.n0.f331060a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.f.f298931b = e50.o0.f331061a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.f.f298933d = e50.p0.f331063a;
        com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1.C10701x817fcf12.Companion companion = com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1.C10701x817fcf12.INSTANCE;
        e50.q0 q0Var = new e50.q0();
        companion.getClass();
        com.p314xaae8f345.mm.p775xd2ae381c.p776x2e06d1.C10701x817fcf12.f28942xdf045a50 = q0Var;
        a03.g.f81956b = new e50.r0();
        this.f331097n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_engine_sync_to_file_in_background, true);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120 c4679x33de8120 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495;
        c4679x33de8120.mo40973x40b15f2e(this.f331098o);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9 c4670x2e7549c9 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495;
        c4670x2e7549c9.mo40966xc74540ab(this.f331099p);
        if (c4679x33de8120.mo40975xf7b3660d()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.FOREGROUND);
        } else if (c4670x2e7549c9.m41037x57bab7e6()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.FLOAT_WINDOW_FOREGROUND);
        } else {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137637x90960956(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AppForegroundState.BACKGROUND);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_engine_create_on_start, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "onCreate: createOnStart");
            ((ku5.t0) ku5.t0.f394148d).B(new e50.s0(this));
        }
        ((ku5.t0) ku5.t0.f394148d).a(e50.t0.f331068d);
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2531xd2ae381c.C20186x5fc8b653()) == 1;
        si0.f.f489600h = z17;
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterPAGPlugin", "setUseRfxPag:" + z17);
    }

    public java.lang.String[] wi() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_bind_cpu_cores, true);
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70951x9e13a959;
        strArr[1] = fj6 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70903xecaa9ac4 : null;
        return (java.lang.String[]) kz5.z.I(strArr).toArray(new java.lang.String[0]);
    }
}

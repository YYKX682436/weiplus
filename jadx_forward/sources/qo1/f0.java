package qo1;

/* loaded from: classes5.dex */
public abstract class f0 implements qo1.j0 {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.Object f447007v = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f447008a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 f447009b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f447010c;

    /* renamed from: d, reason: collision with root package name */
    public long f447011d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 f447012e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f447013f;

    /* renamed from: g, reason: collision with root package name */
    public long f447014g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f447015h;

    /* renamed from: i, reason: collision with root package name */
    public final long f447016i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Object f447017j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f447018k;

    /* renamed from: l, reason: collision with root package name */
    public qo1.i0 f447019l;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f447020m;

    /* renamed from: n, reason: collision with root package name */
    public long f447021n;

    /* renamed from: o, reason: collision with root package name */
    public long f447022o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f447023p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f447024q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f447025r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f447026s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f447027t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f447028u;

    public f0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 taskType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskType, "taskType");
        this.f447008a = pkgInfo;
        this.f447009b = taskType;
        this.f447011d = -1L;
        this.f447014g = -1L;
        this.f447016i = pkgInfo.f297362d;
        this.f447017j = new java.lang.Object();
        this.f447018k = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_INITED;
        this.f447019l = qo1.i0.f447035f;
        this.f447026s = true;
    }

    @Override // qo1.j0
    public long a() {
        return this.f447016i;
    }

    @Override // qo1.j0
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 c() {
        return this.f447012e;
    }

    @Override // qo1.j0
    public jz5.l d() {
        jz5.l lVar;
        synchronized (this.f447017j) {
            lVar = new jz5.l(this.f447018k, this.f447019l);
        }
        return lVar;
    }

    @Override // qo1.j0
    public boolean e() {
        boolean z17;
        synchronized (this.f447017j) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f447018k;
            if (n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_INITED && n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_QUIT) {
                z17 = n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PAUSED;
            }
        }
        return z17;
    }

    @Override // qo1.j0
    public boolean f() {
        boolean z17;
        synchronized (this.f447017j) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f447018k;
            if (n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED) {
                z17 = n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED;
            }
        }
        return z17;
    }

    public final void g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var, qo1.i0 i0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var2 = this.f447018k;
        int ordinal = n0Var.ordinal();
        if (ordinal == 1) {
            this.f447028u = false;
            y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.A1;
        } else if (ordinal == 2) {
            y1Var = (n0Var2 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PAUSED || n0Var2 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_QUIT) ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.E1 : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.G1;
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 7) {
                        y1Var = null;
                    } else {
                        if (this.f447028u) {
                            return;
                        }
                        this.f447028u = true;
                        y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.C1;
                    }
                } else {
                    if (this.f447028u) {
                        return;
                    }
                    this.f447028u = true;
                    y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.F1;
                }
            } else {
                if (this.f447028u) {
                    return;
                }
                this.f447028u = true;
                y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.B1;
            }
        } else {
            if (this.f447028u) {
                return;
            }
            this.f447028u = true;
            y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.D1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var2 = y1Var;
        if (y1Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, y1Var2, this.f447008a, this, null, null, new qo1.a(this, i0Var), 24, null);
        }
    }

    @Override // qo1.j0
    /* renamed from: getStartTime */
    public long mo160576x8082fb99() {
        return this.f447011d;
    }

    public int h() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 a17;
        java.lang.Object obj = this.f447025r;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 m0Var = obj instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 ? (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0) obj : null;
        if (m0Var == null) {
            return 256;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = this.f447012e;
        if (a2Var != null && (a17 = a2Var.a()) != null) {
            n0Var = a17.f297438g;
        }
        if (n0Var == null) {
            n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_INITED;
        }
        if (n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING && n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_RUNNING) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_IMPORTING;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2();
        this.f447012e = a2Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[+] New task, pkgId=" + this.f447016i + " isBackupTask=" + this.f447009b);
        int d17 = a2Var2.d(m0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[+] Initialize task, ret = ");
        sb6.append(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", sb6.toString());
        if (d17 != 0) {
            return 258;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "taskInit pkgId=" + this.f447016i + ", taskType=" + this.f447009b);
        a2Var2.j("taskInit@Progress", new qo1.m(this));
        a2Var2.k("taskInit@StateChanged", new qo1.p(this));
        a2Var2.l("taskInit@TaskCompleted", new qo1.s(this));
        this.f447010c = 0L;
        a2Var2.h("taskInit@ConversationCompleted", new qo1.t(this));
        a2Var2.i("taskInit@Downgrade", new qo1.v(this));
        this.f447025r = a2Var2;
        this.f447024q = new qo1.b(this);
        return 0;
    }

    public final void i() {
        qo1.i0 i0Var;
        if (!this.f447026s) {
            g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED, qo1.i0.f447035f);
            return;
        }
        yz5.a aVar = this.f447024q;
        this.f447024q = null;
        if (aVar == null) {
            return;
        }
        int intValue = ((java.lang.Number) aVar.mo152xb9724478()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "Run next=" + aVar.getClass().getName() + ", exitCode=" + intValue);
        if (this.f447024q != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: qo1.c
                @Override // java.lang.Runnable
                public final void run() {
                    qo1.f0.this.i();
                }
            }, n());
            return;
        }
        if (intValue == 1) {
            ((ku5.t0) ku5.t0.f394148d).h(new qo1.d(this), n());
            return;
        }
        if (intValue != 0) {
            if (intValue != 104) {
                switch (intValue) {
                    case 256:
                        i0Var = qo1.i0.f447046t;
                        break;
                    case 257:
                        i0Var = qo1.i0.f447047u;
                        break;
                    case 258:
                        i0Var = qo1.i0.f447048v;
                        break;
                    case f18263x2b3a4fa4:
                        i0Var = qo1.i0.f447049w;
                        break;
                    default:
                        i0Var = qo1.i0.f447045s;
                        break;
                }
            } else {
                i0Var = qo1.i0.f447050x;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new qo1.e(this, i0Var), n());
        }
    }

    public final void j() {
        java.lang.String str = this.f447008a.f297365g.f297522e;
        oo1.o oVar = oo1.o.f428684a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        oVar.a(str);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.c(str);
        if (c17 != null) {
            c17.a(new qo1.g(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseRoamTask", "Fail to get device manager, try start task directly.");
            s();
        }
    }

    public final boolean k() {
        long j17;
        java.lang.Object obj;
        if (this.f447024q != null) {
            i();
            return true;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = this.f447012e;
        if (a2Var != null) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = a2Var.a().f297438g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "Find a exist task with state = " + n0Var);
            if (n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PAUSED || n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_QUIT) {
                this.f447023p = true;
                this.f447025r = a2Var;
                this.f447024q = new qo1.h(this);
                i();
                return true;
            }
        }
        java.util.ArrayList c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        java.util.Iterator it = c17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j17 = this.f447016i;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 m0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0) obj;
            if (m0Var.f297444p == this.f447009b && m0Var.f297436e == j17) {
                break;
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 m0Var2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start backup task, pkgId=");
        sb6.append(j17);
        sb6.append(", taskInfo=");
        sb6.append(m0Var2 != null ? m0Var2.f297435d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", sb6.toString());
        if (m0Var2 == null) {
            return false;
        }
        this.f447023p = true;
        this.f447025r = m0Var2;
        this.f447024q = new qo1.i(this);
        i();
        return true;
    }

    public int l() {
        java.lang.Object obj = this.f447025r;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = obj instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 ? (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2) obj : null;
        if (a2Var == null) {
            return 256;
        }
        qo1.k kVar = new qo1.k(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[+] Do task, pkgId=" + this.f447016i + ", isResume=" + this.f447023p + " isBackupTask=" + this.f447009b + ", sessionId = " + a2Var.a().f297435d);
        this.f447020m = 0;
        synchronized (f447007v) {
            if (this.f447023p) {
                a2Var.e(new qo1.x(kVar));
            } else {
                a2Var.f(new qo1.y(kVar));
            }
        }
        this.f447025r = null;
        this.f447024q = null;
        return 0;
    }

    public final long m() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.b(this.f447016i);
        if (b17 == null) {
            return -1L;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = this.f447012e;
        if (a2Var == null) {
            return -2L;
        }
        return b17.c(a2Var.a().f297435d);
    }

    public abstract java.lang.String n();

    public final boolean o() {
        return this.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
    }

    public final synchronized boolean p() {
        java.lang.Boolean bool = this.f447013f;
        if (bool != null) {
            return bool.booleanValue();
        }
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().h(this.f447016i).f297426m;
        boolean z17 = j17 > 0 && (java.lang.System.currentTimeMillis() / ((long) 1000)) - j17 > 604800;
        this.f447013f = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "isConsecutiveFailures=" + z17 + ", lastSuccessTime=" + j17);
        return z17;
    }

    public final void q(int i17) {
        boolean z17 = this.f447027t;
        long j17 = this.f447016i;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[sendStatusNotifyToPc] StatusNotify has already sent. pkgId=" + j17);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("packageId", j17);
        java.lang.String str = this.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_RESTORE ? "roamLiteStartRestoreResult" : "roamLiteStartBackupResult";
        this.f447027t = true;
        mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) yVar).Di(str, jSONObject2);
    }

    public final void r(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 old = this.f447018k;
        this.f447018k = value;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(old, "old");
        if (old == value) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "onStateChanged, state changed from " + old + " to " + value + ", pkgId=" + this.f447016i);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING;
        if (value == n0Var) {
            this.f447021n = java.lang.System.currentTimeMillis();
        }
        if (old == n0Var && value == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_RUNNING) {
            this.f447022o = java.lang.System.currentTimeMillis() - this.f447021n;
        }
    }

    public abstract void s();

    @Override // qo1.j0
    /* renamed from: start */
    public final void mo160577x68ac462() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "start task, pkgId=" + this.f447016i + ", isBackupTask=" + this.f447009b + ", pkgName=" + go1.d.f355477a.a(this.f447008a) + ", this=" + hashCode());
        ((ku5.t0) ku5.t0.f394148d).j(new qo1.z(this), n());
    }

    @Override // qo1.j0
    /* renamed from: stop */
    public final void mo160578x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "stop task, pkgId=" + this.f447016i + ", isBackupTask=" + this.f447009b + ", this=" + hashCode());
        ((ku5.t0) ku5.t0.f394148d).j(new java.lang.Runnable() { // from class: qo1.a0
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var;
                qo1.i0 i0Var;
                qo1.f0 f0Var = qo1.f0.this;
                ((ku5.t0) ku5.t0.f394148d).A(f0Var.n());
                f0Var.f447026s = false;
                f0Var.f447025r = null;
                f0Var.f447024q = null;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = f0Var.f447012e;
                if (a2Var == null) {
                    synchronized (f0Var.f447017j) {
                        n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED;
                        i0Var = qo1.i0.f447035f;
                        f0Var.g(n0Var, i0Var);
                        f0Var.f447019l = i0Var;
                        f0Var.r(n0Var);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.o(f0Var, n0Var, i0Var);
                    return;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var2 = a2Var.a().f297438g;
                if (n0Var2 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED || n0Var2 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseRoamTask", "Task has stopped already. state=" + n0Var2);
                    nf.e.f(new qo1.b0(f0Var));
                    return;
                }
                if (f0Var.f447018k != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_ERROR) {
                    a2Var.g(new qo1.e0(f0Var));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "Falsely stop task. nativeState=" + n0Var2 + ", state=" + f0Var.f447018k + ", error=" + f0Var.f447019l);
                ((ku5.t0) ku5.t0.f394148d).h(new qo1.c0(f0Var), f0Var.n());
            }
        }, n());
    }
}

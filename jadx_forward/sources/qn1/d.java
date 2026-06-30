package qn1;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: u, reason: collision with root package name */
    public static int f446493u = 2;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f446495b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f446496c;

    /* renamed from: d, reason: collision with root package name */
    public int f446497d;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f446503j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f446505l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f446506m;

    /* renamed from: n, reason: collision with root package name */
    public int f446507n;

    /* renamed from: a, reason: collision with root package name */
    public int f446494a = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f446498e = java.lang.Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public int f446499f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f446500g = 3;

    /* renamed from: h, reason: collision with root package name */
    public boolean f446501h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f446502i = java.util.UUID.randomUUID().toString();

    /* renamed from: k, reason: collision with root package name */
    public boolean f446504k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f446508o = true;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f446509p = new qn1.f(this);

    /* renamed from: q, reason: collision with root package name */
    public final sn1.h f446510q = new qn1.g(this);

    /* renamed from: r, reason: collision with root package name */
    public final sn1.r0 f446511r = new qn1.j(this);

    /* renamed from: s, reason: collision with root package name */
    public final sn1.n0 f446512s = new qn1.k(this);

    /* renamed from: t, reason: collision with root package name */
    public final sn1.g f446513t = new qn1.l(this);

    public static void a(qn1.d dVar) {
        java.lang.String str = dVar.f446495b;
        java.lang.String str2 = dVar.f446496c;
        java.lang.String z17 = kn1.k.z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        qn1.c.i().h().e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupPcProcessMgr", "tryConnectFailed thisWifiName:%s, pcWifiName:%s, pcIpAddress:%s, tryCount:%d", z17, str, str2, java.lang.Integer.valueOf(f446493u));
        if (z17 == null || z17.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(400L, 1L, 1L, false);
            g0Var.d(13736, 1, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
            qn1.c.i().e().f391142a = -1;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            qn1.c.i().l().g(-1);
            return;
        }
        if (str == null || !str.equals(z17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(400L, 2L, 1L, false);
            g0Var2.d(13736, 2, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
            qn1.c.i().e().f391142a = -2;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            qn1.c.i().l().g(-2);
            return;
        }
        if (!kn1.k.E(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var3.mo68477x336bdfd8(400L, 3L, 1L, false);
            g0Var3.d(13736, 3, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
            qn1.c.i().e().f391142a = -3;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            qn1.c.i().l().g(-3);
            return;
        }
        int i17 = f446493u;
        if (i17 > 0) {
            f446493u = i17 - 1;
            dVar.i();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var4.mo68477x336bdfd8(400L, 63L, 1L, false);
        g0Var4.d(13736, 6, str, z17, 0, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
        qn1.c.i().e().f391142a = -5;
        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        qn1.c.i().l().g(-5);
    }

    public static void b(qn1.d dVar, int i17, int i18) {
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "newBackup, command[%d]", java.lang.Integer.valueOf(i17));
        dVar.f446494a = 1;
        if (dVar.h()) {
            qn1.c i19 = qn1.c.i();
            synchronized (i19) {
                i19.f391140e = null;
            }
        }
        qn1.c.i().l().e(dVar.g());
        qn1.c0 l17 = qn1.c.i().l();
        l17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "clearContinueBackupData.");
        l17.f446484c.b(false);
        java.util.LinkedList linkedList = l17.f446482a;
        if (linkedList != null) {
            linkedList.clear();
        }
        dVar.f(i17, i18);
        qn1.c0 l18 = qn1.c.i().l();
        l18.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qn1.y(l18, new java.util.HashSet(l18.f446485d)));
    }

    public static void c(qn1.d dVar, int i17, int i18) {
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "newRecover, command[%d]", java.lang.Integer.valueOf(i17));
        dVar.f446494a = 2;
        if (!dVar.h()) {
            qn1.c i19 = qn1.c.i();
            synchronized (i19) {
                i19.f391140e = null;
            }
        }
        qn1.c.i().k().f();
        ((ku5.t0) ku5.t0.f394148d).g(new qn1.h(dVar, i17, i18));
        qn1.t k17 = qn1.c.i().k();
        k17.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qn1.p(k17, new java.util.HashSet(k17.f446547h)));
        sn1.i.f491552p.a();
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "backupSendCancelRequest.");
        wn1.d dVar = new wn1.d();
        dVar.f528947d = qn1.c.i().f391137b;
        try {
            sn1.i.R(dVar.mo14344x5f01b1f6(), 5);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcProcessMgr", e17, "BackupCancelRequest to buf err.", new java.lang.Object[0]);
        }
    }

    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandRequest cmd:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 12 || i17 == 16) {
            this.f446502i = java.util.UUID.randomUUID().toString();
        }
        wn1.e eVar = new wn1.e();
        eVar.f528948d = i17;
        if (i17 == 9) {
            eVar.f528949e = this.f446506m;
        }
        try {
            sn1.i.R(eVar.mo14344x5f01b1f6(), 17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcProcessMgr", e17, "BackupCommandRequest to buf err.", new java.lang.Object[0]);
        }
    }

    public void f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "backupSendCommandResponse cmd:%d", java.lang.Integer.valueOf(i17));
        wn1.f fVar = new wn1.f();
        fVar.f528950d = i17;
        try {
            sn1.i.S(fVar.mo14344x5f01b1f6(), 18, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupPcProcessMgr", e17, "BackupCommandResponse to buf err.", new java.lang.Object[0]);
        }
    }

    public boolean g() {
        return this.f446498e.booleanValue();
    }

    public boolean h() {
        int i17 = this.f446500g;
        return i17 == 100 || i17 == 101;
    }

    public final void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "tryConnect, isNewBackup = " + this.f446508o);
        if (this.f446508o) {
            xn1.b.c(xn1.b.f536987a, 1, 0, null, null, null, null, null, null, 252, null);
        }
        ln1.g h17 = qn1.c.i().h();
        java.lang.String str = this.f446496c;
        int i17 = this.f446497d;
        h17.f401289a.set(2);
        h17.f401290b = str;
        h17.f401291c = i17;
        sm0.b.f490844a = new ln1.a(h17);
        java.util.Map map = sn1.i.f491545f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "BackupBaseScene clear.");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f491546g;
        synchronized (concurrentHashMap) {
            concurrentHashMap.clear();
        }
        java.util.Map map2 = sn1.i.f491545f;
        synchronized (map2) {
            ((java.util.HashMap) map2).clear();
        }
        sn1.i.I(1, this.f446509p);
        sn1.a aVar = new sn1.a(qn1.c.i().f391138c, qn1.c.i().f391139d, kn1.f.f391135h, qn1.c.i().f391137b, 0, 1, false);
        aVar.b0(true, true, true, false, false, true);
        aVar.f491499u.f529015m = 1;
        aVar.K();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcProcessMgr", "tryConnect start backupConnectTimerHandler.");
        if (this.f446503j == null) {
            this.f446503j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new qn1.e(this), false);
        }
        long Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_backup_connect_overtime_and, 30) * 1000;
        this.f446503j.c(Ni, Ni);
    }
}

package dh4;

/* loaded from: classes15.dex */
public class f0 implements com.p314xaae8f345.mm.p944x882e457a.u0, p21.a, c01.a8, p21.c {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f314049h;

    /* renamed from: i, reason: collision with root package name */
    public int f314050i;

    /* renamed from: m, reason: collision with root package name */
    public long f314051m;

    /* renamed from: n, reason: collision with root package name */
    public int f314052n;

    /* renamed from: o, reason: collision with root package name */
    public int f314053o;

    /* renamed from: p, reason: collision with root package name */
    public int f314054p;

    /* renamed from: r, reason: collision with root package name */
    public ah4.c f314056r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b f314057s;

    /* renamed from: t, reason: collision with root package name */
    public ah4.n f314058t;

    /* renamed from: u, reason: collision with root package name */
    public ah4.k f314059u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.u2 f314060v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f314061w;

    /* renamed from: d, reason: collision with root package name */
    public int f314045d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f314046e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f314047f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f314048g = false;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f314055q = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final dh4.t0 f314062x = new dh4.t0();

    /* renamed from: y, reason: collision with root package name */
    public final android.content.ServiceConnection f314063y = new dh4.x(this);

    /* renamed from: z, reason: collision with root package name */
    public boolean f314064z = false;

    public f0() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2256x633fb29.C18549xf106eed6.f253981a;
        dh4.u uVar = new dh4.u();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.f274540i = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.f274539h = uVar;
    }

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str.equals(this.f314049h)) {
            dh4.t0 t0Var = this.f314062x;
            t0Var.getClass();
            dh4.q0 q0Var = new dh4.q0(t0Var, str2, str3);
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                q0Var.run();
            } else {
                t0Var.f314120b.mo50293x3498a0(q0Var);
            }
        }
    }

    public void a(p21.d dVar) {
        dh4.t0 t0Var = this.f314062x;
        t0Var.getClass();
        synchronized (dVar) {
            if (!((java.util.LinkedList) t0Var.f314119a).contains(dVar)) {
                ((java.util.LinkedList) t0Var.f314119a).add(dVar);
            }
        }
        this.f314062x.a(j());
    }

    @Override // c01.a8
    public void b() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314049h)) {
            g();
        }
        this.f314064z = false;
        dh4.t0 t0Var = this.f314062x;
        t0Var.getClass();
        dh4.i0 i0Var = new dh4.i0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            i0Var.run();
        } else {
            t0Var.f314120b.mo50293x3498a0(i0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dh4.f0.c():void");
    }

    @Override // c01.a8
    public void d() {
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314049h)) {
                ah4.k kVar = this.f314059u;
                if (kVar != null) {
                    kVar.bf();
                }
                ah4.n nVar = this.f314058t;
                if (nVar != null) {
                    nVar.a1();
                }
                this.f314047f = 2;
            }
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
        }
        this.f314064z = true;
        dh4.t0 t0Var = this.f314062x;
        t0Var.getClass();
        dh4.h0 h0Var = new dh4.h0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            h0Var.run();
        } else {
            t0Var.f314120b.mo50293x3498a0(h0Var);
        }
    }

    public final void e() {
        this.f314047f = 1;
        this.f314048g = false;
        if (m()) {
            q();
            c();
            n();
            if (this.f314060v != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomServer", "enter talkroom not first time");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u2 u2Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.u2(new dh4.d0(this), true);
            this.f314060v = u2Var;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.f274541j = true;
            u2Var.f274545d = 50000L;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            u2Var.f274544c = android.os.SystemClock.elapsedRealtime();
            long j17 = u2Var.f274545d;
            java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.f274538g;
            java.util.Iterator it = hashMap.entrySet().iterator();
            long j18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u2 u2Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.u2) ((java.util.Map.Entry) it.next()).getValue();
                if (u2Var2 != null) {
                    long j19 = u2Var2.f274544c;
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j19;
                    if (elapsedRealtime < 0) {
                        elapsedRealtime = 0;
                    }
                    long j27 = u2Var2.f274545d;
                    if (elapsedRealtime <= j27) {
                        j27 -= elapsedRealtime;
                        if (j27 < j18) {
                        }
                    }
                    j18 = j27;
                }
            }
            boolean z19 = j18 > j17;
            java.util.Map map = com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.f274538g;
            int i17 = u2Var.f274542a;
            ((java.util.HashMap) map).remove(java.lang.Integer.valueOf(i17));
            hashMap.put(java.lang.Integer.valueOf(i17), u2Var);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t2 t2Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.f274539h;
            if (t2Var == null || !z19) {
                return;
            }
            t2Var.mo43378xed060d07();
        }
    }

    public final void f(int i17) {
        if (this.f314056r != null) {
            try {
                e();
                return;
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 0) {
            this.f314062x.b("bind talkroomService timeout", 3, -1);
        } else {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new dh4.c0(this, i17), 50L);
        }
    }

    public final void g() {
        try {
            dh4.l.Bi().a();
            ah4.k kVar = this.f314059u;
            if (kVar != null) {
                kVar.bf();
            }
            ah4.n nVar = this.f314058t;
            if (nVar != null) {
                nVar.u();
            }
            this.f314047f = 2;
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
        }
    }

    public void h(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "enterTalkRoom %s scene %d", str, java.lang.Integer.valueOf(i17));
        this.f314045d = i17;
        if (l(str) == 1) {
            r(dh4.l.Ai());
        } else {
            a(dh4.l.Ai());
        }
        if (this.f314046e > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "addListener has init before");
        } else {
            c01.d9.e().a(332, this);
            c01.d9.e().a(334, this);
            c01.d9.e().a(336, this);
            c01.d9.e().a(335, this);
            dh4.l.Ni().a(this);
            com.p314xaae8f345.mm.p642xad8b531f.b bVar = (com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c();
            bVar.getClass();
            ((java.util.ArrayList) bVar.f144838a).add(this);
            this.f314046e = 1;
            ah4.c cVar = this.f314056r;
            if (cVar != null) {
                try {
                    cVar.Nh();
                    this.f314056r.F8();
                } catch (android.os.RemoteException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
                }
            }
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.ServiceC18547xe2b108ee.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            l85.r0 r0Var = l85.s0.f398741d;
            android.content.ServiceConnection serviceConnection = this.f314063y;
            r0Var.a(intent, serviceConnection);
            context.bindService(intent, serviceConnection, 1);
            this.f314057s = new dh4.a0(this);
        }
        boolean equals = str.equals(this.f314049h);
        dh4.t0 t0Var = this.f314062x;
        if (equals) {
            if (this.f314047f == 2) {
                t0Var.getClass();
                dh4.k0 k0Var = new dh4.k0(t0Var);
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    k0Var.run();
                    return;
                } else {
                    t0Var.f314120b.mo50293x3498a0(k0Var);
                    return;
                }
            }
            return;
        }
        this.f314049h = str;
        c01.d9.e().g(new eh4.a(str, l(str)));
        dh4.l.wi().f314077g = new dh4.v();
        dh4.v Bi = dh4.l.Bi();
        Bi.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        Bi.A = android.os.SystemClock.elapsedRealtime();
        dh4.l.Bi().f314142v = str;
        if (l(str) == 0) {
            dh4.l.Ai().f314093e = true;
        }
        t0Var.getClass();
        dh4.r0 r0Var2 = new dh4.r0(t0Var, str);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            r0Var2.run();
        } else {
            t0Var.f314120b.mo50293x3498a0(r0Var2);
        }
    }

    public void i() {
        int i17;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "exitTalkRoom");
        u(false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314049h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "exitTalkRoom: has exited");
            return;
        }
        dh4.v Bi = dh4.l.Bi();
        long j17 = Bi.A;
        if (j17 != 0) {
            Bi.f314125e = (int) ((android.os.SystemClock.elapsedRealtime() - j17) / 1000);
        }
        this.f314047f = 0;
        this.f314048g = false;
        int i19 = this.f314050i;
        c01.d9.e().g(new eh4.b(i19, this.f314051m, i19 != 0 ? this.f314049h : "", l(this.f314049h)));
        ah4.c cVar = this.f314056r;
        int i27 = -99999;
        if (cVar != null) {
            try {
                i17 = cVar.Nh();
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
                i17 = -99999;
            }
            if (i17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkRoomServer", "engine.Close error %d", java.lang.Integer.valueOf(i17));
            }
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f314049h;
            ((sg3.a) v0Var).getClass();
            java.lang.String e18 = c01.a2.e(str);
            ah4.c cVar2 = this.f314056r;
            if (cVar2 != null) {
                int[] iArr = new int[1];
                try {
                    c19764x527bffc1.f38861x6ac9171 = cVar2.C1(iArr, e18);
                } catch (android.os.RemoteException e19) {
                    iArr[0] = -99999;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e19, "", new java.lang.Object[0]);
                }
                i18 = iArr[0];
            } else {
                i18 = -99;
            }
            if (i18 == 0) {
                java.lang.String str2 = new java.lang.String(c19764x527bffc1.f38861x6ac9171);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "getStatis==> pba.len %d, info: %s", java.lang.Integer.valueOf(c19764x527bffc1.f38861x6ac9171.length), str2);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.ok6 ok6Var = new r45.ok6();
                ok6Var.f463864d = 10402;
                r45.du5 du5Var = new r45.du5();
                du5Var.f454289d = str2;
                du5Var.f454290e = true;
                ok6Var.f463865e = du5Var;
                r45.ok6 ok6Var2 = new r45.ok6();
                ok6Var2.f463864d = 10404;
                r45.du5 du5Var2 = new r45.du5();
                du5Var2.f454289d = dh4.l.Bi().m124420x9616526c();
                du5Var2.f454290e = true;
                ok6Var2.f463865e = du5Var2;
                linkedList.add(ok6Var);
                linkedList.add(ok6Var2);
                c01.d9.e().g(new eh4.g(linkedList, l(this.f314049h)));
            }
        }
        this.f314049h = "";
        this.f314050i = 0;
        this.f314051m = 0L;
        this.f314052n = 0;
        this.f314053o = 0;
        this.f314054p = 0;
        this.f314055q.clear();
        q();
        dh4.t0 t0Var = this.f314062x;
        t0Var.getClass();
        dh4.s0 s0Var = new dh4.s0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            s0Var.run();
        } else {
            t0Var.f314120b.mo50293x3498a0(s0Var);
        }
        dh4.p Ai = dh4.l.Ai();
        Ai.f314095g.mo50293x3498a0(new dh4.o(Ai));
        this.f314046e = 0;
        c01.d9.e().q(332, this);
        c01.d9.e().q(334, this);
        c01.d9.e().q(336, this);
        c01.d9.e().q(335, this);
        dh4.l.Ni().f(this);
        ((java.util.ArrayList) ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).f144838a).remove(this);
        r(dh4.l.Ai());
        ah4.c cVar3 = this.f314056r;
        if (cVar3 != null) {
            try {
                i27 = cVar3.F8();
            } catch (android.os.RemoteException e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e27, "", new java.lang.Object[0]);
            }
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(this.f314063y);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.ServiceC18547xe2b108ee.class));
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e28, "unbindService err", new java.lang.Object[0]);
        }
        this.f314056r = null;
        if (i27 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkRoomServer", "engine.uninitLive error %d", java.lang.Integer.valueOf(i27));
        }
    }

    public java.lang.String j() {
        java.util.Iterator it = dh4.l.Ni().d(this.f314049h).iterator();
        while (it.hasNext()) {
            r45.nk6 nk6Var = (r45.nk6) it.next();
            if (nk6Var.f463006d == this.f314054p) {
                return nk6Var.f463007e;
            }
        }
        return null;
    }

    public java.util.List k() {
        return dh4.l.Ni().d(this.f314049h);
    }

    public int l(java.lang.String str) {
        if (this.f314045d == 1) {
            return 1;
        }
        if (q21.d.a() != null) {
            if (((va3.z0) q21.d.a()).f(this.f314049h)) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean m() {
        int i17;
        try {
            i17 = this.f314056r.I7();
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            i17 = -99999;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "engine.protocalInit");
        if (i17 >= 0 || i17 == -3) {
            return true;
        }
        this.f314056r = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.TalkRoomServer", "engine.protocalInit error %d", java.lang.Integer.valueOf(i17));
        this.f314062x.b("enterTalkRoom protocalInit failed", 3, -1);
        return false;
    }

    public final void n() {
        ah4.c cVar = this.f314056r;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkRoomServer", "the engine should not be null.");
            return;
        }
        ah4.n Pb = cVar.Pb(new dh4.e0(this));
        this.f314058t = Pb;
        Pb.mo2060x68ac462();
        ah4.k H4 = this.f314056r.H4();
        this.f314059u = H4;
        H4.mo2064x68ac462();
    }

    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "putAwayMic");
        dh4.v Bi = dh4.l.Bi();
        if (Bi.F && !Bi.E) {
            Bi.f314146z++;
        }
        Bi.E = false;
        Bi.F = false;
        if (this.f314047f < 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomServer", "putAwayMic  err, isnot getting or has not got mic");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f314061w;
        if (b4Var != null) {
            b4Var.d();
            this.f314061w = null;
        }
        g();
        int i17 = this.f314050i;
        long j17 = this.f314051m;
        java.lang.String str = this.f314049h;
        c01.d9.e().g(new eh4.d(i17, j17, 2, str, l(str)));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "type:%d  errType:%d  errCode:%d", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        eh4.f fVar = (eh4.f) m1Var;
        if (fVar.H() == null || !fVar.H().equals(this.f314049h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomServer", "%s, now :%s this is the old sceneEnd, abandon it!!", fVar.H(), this.f314049h);
            return;
        }
        dh4.t0 t0Var = this.f314062x;
        if (i17 != 0 || i18 != 0) {
            if (m1Var.mo808xfb85f7b0() == 332) {
                dh4.v Bi = dh4.l.Bi();
                long j17 = Bi.A;
                if (j17 != 0) {
                    Bi.f314121a = 2;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    Bi.f314122b = android.os.SystemClock.elapsedRealtime() - j17;
                }
                if (i17 == 4) {
                    dh4.l.Bi().f314145y = i18;
                }
                t0Var.b("cgi enter failed : errType:" + i17 + " errCode:" + i18, i17, i18);
                i();
                return;
            }
            if (m1Var.mo808xfb85f7b0() == 334) {
                if (((eh4.d) m1Var).f334475g != 1) {
                    return;
                }
                dh4.v Bi2 = dh4.l.Bi();
                Bi2.f314128h++;
                Bi2.C = 0L;
                g();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomServer", "onSceneEnd SeizeMicFailed");
                if (i17 == 4 && (i18 == 311 || i18 == 340)) {
                    t0Var.d(i18);
                    return;
                } else {
                    t0Var.c(i17, i18, "TalkMicAction failed!!");
                    return;
                }
            }
            if (m1Var.mo808xfb85f7b0() == 336) {
                this.f314048g = false;
                t0Var.c(i17, i18, "TalkGetMember failed!!");
                i();
                return;
            } else if (m1Var.mo808xfb85f7b0() == 335) {
                t0Var.c(i17, i18, "TalkNoop failed!!");
                i();
                return;
            }
        }
        if (m1Var.mo808xfb85f7b0() == 332) {
            dh4.v Bi3 = dh4.l.Bi();
            long j18 = Bi3.A;
            if (j18 != 0) {
                Bi3.f314121a = 1;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                Bi3.f314122b = android.os.SystemClock.elapsedRealtime() - j18;
            }
            eh4.a aVar = (eh4.a) m1Var;
            this.f314050i = aVar.f334457g;
            this.f314051m = aVar.f334458h;
            this.f314052n = aVar.f334459i;
            this.f314053o = aVar.f334460m;
            this.f314055q = aVar.f334462o;
            dh4.v Bi4 = dh4.l.Bi();
            int i27 = this.f314050i;
            long j19 = this.f314051m;
            Bi4.f314143w = i27;
            Bi4.f314144x = j19;
            dh4.l.Ni().g(this.f314049h, aVar.f334461n, null, null, fVar.I());
            f(100);
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 334) {
            if (m1Var.mo808xfb85f7b0() == 336) {
                eh4.c cVar = (eh4.c) m1Var;
                dh4.l.Ni().g(this.f314049h, cVar.f334470h, null, null, fVar.I());
                int i28 = cVar.f334469g;
                if (i28 > this.f314052n) {
                    this.f314052n = i28;
                    if (this.f314047f >= 3) {
                        t0Var.d(311);
                    }
                    g();
                }
                this.f314048g = false;
                t0Var.a(j());
            }
            if (m1Var.mo808xfb85f7b0() == 335 && this.f314047f == 0) {
                t0Var.c(3, -1, "talknoop success but in outside room state");
                return;
            }
            return;
        }
        eh4.d dVar = (eh4.d) m1Var;
        if (dVar.f334475g != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "putaway Mic successFul");
            return;
        }
        dh4.v Bi5 = dh4.l.Bi();
        long j27 = Bi5.C;
        if (j27 != 0) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j27;
            long j28 = Bi5.f314126f;
            int i29 = Bi5.B;
            long j29 = (j28 * i29) + elapsedRealtime;
            int i37 = i29 + 1;
            Bi5.f314126f = j29 / i37;
            Bi5.B = i37;
            Bi5.f314127g++;
            Bi5.C = 0L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic seize Mic successFul");
        int i38 = dVar.f334476h;
        if (i38 < this.f314052n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomServer", "micSeq is smaller seizeSeq %d, now %d", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(this.f314052n));
            g();
            t0Var.d(311);
            return;
        }
        this.f314052n = i38;
        try {
            i19 = this.f314056r.yh(i38);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            i19 = -99999;
        }
        if (this.f314047f != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic not in getting mic state");
            return;
        }
        t0Var.getClass();
        dh4.m0 m0Var = new dh4.m0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            m0Var.run();
        } else {
            t0Var.f314120b.mo50293x3498a0(m0Var);
        }
        this.f314047f = 4;
        if (i19 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkRoomServer", "SetCurrentMicId err: %d ", java.lang.Integer.valueOf(i19));
        }
        if (this.f314061w != null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new dh4.b0(this), true);
        this.f314061w = b4Var;
        b4Var.c(5000L, 5000L);
    }

    public void p(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "reConnect talkRoomUsername: %s", this.f314049h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314049h) || this.f314047f < 2) {
            return;
        }
        dh4.l.Bi().f314129i++;
        if (z17) {
            if (!m()) {
                return;
            }
            try {
                n();
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkRoomServer", e17.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            }
        }
        g();
        this.f314047f = 1;
        try {
            ah4.c cVar = this.f314056r;
            if (cVar != null) {
                cVar.Nh();
            }
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e18, "", new java.lang.Object[0]);
        }
        if (this.f314050i != 0) {
            c();
        }
        if (z17) {
            return;
        }
        dh4.t0 t0Var = this.f314062x;
        t0Var.getClass();
        dh4.j0 j0Var = new dh4.j0(t0Var);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            j0Var.run();
        } else {
            t0Var.f314120b.mo50293x3498a0(j0Var);
        }
    }

    public final void q() {
        ah4.n nVar = this.f314058t;
        if (nVar != null) {
            try {
                nVar.mo2059x41012807();
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            }
            this.f314058t = null;
        }
        ah4.k kVar = this.f314059u;
        if (kVar != null) {
            try {
                kVar.mo2063x41012807();
            } catch (android.os.RemoteException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e18, "", new java.lang.Object[0]);
            }
            this.f314059u = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u2 u2Var = this.f314060v;
        if (u2Var != null) {
            ((java.util.HashMap) com.p314xaae8f345.mm.sdk.p2603x2137b148.u2.f274538g).remove(java.lang.Integer.valueOf(u2Var.f274542a));
            this.f314060v = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f314061w;
        if (b4Var != null) {
            b4Var.d();
            this.f314061w = null;
        }
    }

    public void r(p21.d dVar) {
        dh4.t0 t0Var = this.f314062x;
        t0Var.getClass();
        synchronized (dVar) {
            ((java.util.LinkedList) t0Var.f314119a).remove(dVar);
        }
    }

    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "resumeRecord in state %d", java.lang.Integer.valueOf(this.f314047f));
        if (this.f314047f != 4) {
            return;
        }
        dh4.v Bi = dh4.l.Bi();
        Bi.E = true;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        Bi.D = android.os.SystemClock.elapsedRealtime();
        try {
            this.f314059u.Pe();
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
        }
    }

    public boolean t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "seizeMic");
        if (this.f314047f != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomServer", "seizeMic  not int the appropriate state");
            if (this.f314047f == 0) {
                this.f314062x.c(3, -1, "seizeMic in outside room state");
            }
            return false;
        }
        ah4.n nVar = this.f314058t;
        if (nVar != null) {
            try {
                nVar.a1();
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomServer", e17, "", new java.lang.Object[0]);
            }
        }
        this.f314047f = 3;
        int i17 = this.f314050i;
        long j17 = this.f314051m;
        java.lang.String str = this.f314049h;
        c01.d9.e().g(new eh4.d(i17, j17, 1, str, l(str)));
        dh4.v Bi = dh4.l.Bi();
        Bi.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        Bi.C = android.os.SystemClock.elapsedRealtime();
        dh4.l.Bi().F = true;
        return true;
    }

    public final void u(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314049h)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(this.f314049h);
        if (p17 == null) {
            return;
        }
        p17.z1(xg3.b.b(p17, z17 ? 5 : 6, p17.w0()));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(p17, this.f314049h);
    }
}

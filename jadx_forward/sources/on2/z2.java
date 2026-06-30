package on2;

/* loaded from: classes3.dex */
public final class z2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final int f428621f;

    /* renamed from: g, reason: collision with root package name */
    public final zg2.d f428622g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f428623h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f428624i;

    /* renamed from: m, reason: collision with root package name */
    public km2.z f428625m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.concurrent.ConcurrentLinkedDeque f428626n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ht1 f428627o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f428628p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f428629q;

    /* renamed from: r, reason: collision with root package name */
    public r45.a94 f428630r;

    /* renamed from: s, reason: collision with root package name */
    public km2.z f428631s;

    /* renamed from: t, reason: collision with root package name */
    public r45.k74 f428632t;

    /* renamed from: u, reason: collision with root package name */
    public final int f428633u;

    /* renamed from: v, reason: collision with root package name */
    public final int f428634v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f428621f = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85317j5).mo141623x754a37bb()).r()).intValue();
        zg2.d dVar = new zg2.d(null, 1, null);
        dVar.f554355d = new on2.k2(dVar);
        this.f428622g = dVar;
        this.f428623h = dVar;
        this.f428624i = new java.util.LinkedList();
        this.f428626n = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f428628p = new p012xc85e97e9.p093xedfae76a.j0(java.lang.Boolean.FALSE);
        this.f428630r = new r45.a94();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85344m2).mo141623x754a37bb()).r()).intValue();
        this.f428633u = intValue;
        this.f428634v = intValue / 2;
    }

    public static /* synthetic */ java.lang.Object R6(on2.z2 z2Var, boolean z17, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            context = null;
        }
        return z2Var.Q6(z17, context, interfaceC29045xdcb5ca57);
    }

    public final java.lang.Object N6(r45.dz1 dz1Var, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String m75945x2fec8307;
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        long m75942xfb822ef2 = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j17 = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410516m;
        java.lang.String str = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410525v;
        int m75939xb282bd08 = dz1Var.m75939xb282bd08(1);
        java.lang.String m75945x2fec83072 = dz1Var.m75945x2fec8307(2);
        java.lang.String str2 = "";
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        r45.xy1 xy1Var = (r45.xy1) dz1Var.m75936x14adae67(3);
        int m75939xb282bd082 = xy1Var != null ? xy1Var.m75939xb282bd08(0) : 0;
        r45.xy1 xy1Var2 = (r45.xy1) dz1Var.m75936x14adae67(3);
        if (xy1Var2 != null && (m75945x2fec8307 = xy1Var2.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        int m75939xb282bd083 = dz1Var.m75939xb282bd08(4);
        long m75942xfb822ef22 = dz1Var.m75942xfb822ef2(5);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410518o);
        r45.yy1 yy1Var = (r45.yy1) dz1Var.m75936x14adae67(6);
        int m75939xb282bd084 = dz1Var.m75939xb282bd08(0);
        r45.gz1 gz1Var = (r45.gz1) dz1Var.m75936x14adae67(9);
        r45.xy1 xy1Var3 = (r45.xy1) dz1Var.m75936x14adae67(3);
        ek2.s0 s0Var = new ek2.s0(new ek2.t0(m75942xfb822ef2, j17, str, m75939xb282bd08, m75945x2fec83072, m75939xb282bd082, str2, 0, m75939xb282bd083, m75942xfb822ef22, b17, yy1Var, m75939xb282bd084, gz1Var, xy1Var3 != null ? xy1Var3.m75945x2fec8307(3) : null));
        az2.j.u(s0Var, context, null, 0L, 6, null);
        pq5.g l17 = s0Var.l();
        l17.K(new on2.n2(this, nVar));
        l17.f(this);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 O6() {
        return this.f428628p;
    }

    public final java.util.concurrent.ConcurrentLinkedDeque P6() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_LOTTERYID_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = new java.util.concurrent.ConcurrentLinkedDeque();
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList lotteryList is empty!");
        } else {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"|"}, false, 0, 6, null);
            int size = f07.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String str2 = (java.lang.String) f07.get(i17);
                java.util.List f08 = r26.n0.f0(str2, new java.lang.String[]{":"}, false, 0, 6, null);
                if (f08.size() == 2) {
                    long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) f08.get(0));
                    java.lang.String str3 = (java.lang.String) f08.get(1);
                    if (E1 != 0) {
                        if (!(str3 == null || str3.length() == 0)) {
                            concurrentLinkedDeque.add(new jz5.l(java.lang.Long.valueOf(E1), str3));
                        }
                    }
                    if (zl2.q4.f555466a.E()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList invalid liveId lotteryInfo:" + str2);
                    }
                } else if (zl2.q4.f555466a.E()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList invalid lotteryInfo:" + str2);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList lotteryList:" + concurrentLinkedDeque);
        }
        return concurrentLinkedDeque;
    }

    public final java.lang.Object Q6(boolean z17, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        r45.ct1 ct1Var = new r45.ct1();
        ct1Var.set(1, db2.t4.f309704a.a(8605));
        ct1Var.set(2, java.lang.Long.valueOf(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410516m));
        ct1Var.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410518o));
        ct1Var.set(4, ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410525v);
        ct1Var.set(5, ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410385o);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8605;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetlotterypanel";
        lVar.f152197a = ct1Var;
        lVar.f152198b = new r45.dt1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        az2.j jVar = (az2.j) wi6;
        if (z17) {
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            android.content.Context context2 = context;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            az2.j.u(jVar, context2, null, 0L, 6, null);
        }
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            l17.K(new on2.p2(this, nVar));
            l17.f(this);
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a18;
    }

    public final boolean S6() {
        r45.cz1 cz1Var;
        km2.z zVar = this.f428625m;
        boolean z17 = pm0.v.z((zVar == null || (cz1Var = zVar.f390765d) == null) ? 0 : cz1Var.m75939xb282bd08(9), 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "haveParticipated :" + z17);
        return z17;
    }

    public final boolean T6() {
        km2.z zVar = this.f428625m;
        return zVar != null && zVar.f390762a == 2;
    }

    public final boolean U6(r45.cz1 cz1Var, r45.cz1 cz1Var2) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cz1Var.m75945x2fec8307(0), cz1Var2.m75945x2fec8307(0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "isRemoteItemValid invalid id:" + cz1Var.m75945x2fec8307(0) + ',' + cz1Var2.m75945x2fec8307(0));
            return false;
        }
        int m75939xb282bd08 = cz1Var2.m75939xb282bd08(8);
        int m75939xb282bd082 = cz1Var.m75939xb282bd08(8);
        int m75939xb282bd083 = cz1Var2.m75939xb282bd08(3);
        int m75939xb282bd084 = cz1Var.m75939xb282bd08(3);
        if (m75939xb282bd084 >= m75939xb282bd083) {
            if (m75939xb282bd083 < m75939xb282bd084) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "printLotteryInfoList RemoteItem:" + pm0.b0.g(java.lang.Integer.valueOf(m75939xb282bd082)) + " invalid");
                return false;
            }
            if ((m75939xb282bd082 == 1 && m75939xb282bd08 != 1) || (m75939xb282bd082 == 2 && m75939xb282bd08 == 3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "printLotteryInfoList RemoteItem:" + pm0.b0.g(java.lang.Integer.valueOf(m75939xb282bd082)) + " invalid");
                return false;
            }
        }
        return true;
    }

    public final boolean V6() {
        km2.z zVar = this.f428625m;
        return zVar != null && zVar.f390762a == 1;
    }

    public final boolean W6(java.lang.String lotteryId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        if (this.f428626n.isEmpty()) {
            this.f428626n = P6();
        }
        java.util.Iterator it = this.f428626n.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            jz5.l lVar = (jz5.l) it.next();
            r45.nw1 nw1Var = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r;
            if (nw1Var != null && ((java.lang.Number) lVar.f384366d).longValue() == nw1Var.m75942xfb822ef2(0)) {
                z17 = true;
            }
            if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.f384367e, lotteryId)) {
                return true;
            }
        }
    }

    public final void X6(r45.ht1 ht1Var) {
        pm0.v.X(new on2.q2(ht1Var, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y6(int r26, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r27) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.z2.Y6(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Z6(java.lang.String prefix, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("printLotteryInfoList(" + prefix + ",fromJoinLive:" + z17 + ")：");
        int i17 = 0;
        for (java.lang.Object obj : this.f428624i) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("index:" + i17 + ',' + ((km2.z) obj) + "};");
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
    }

    public final void a7(r45.yy1 yy1Var) {
        r45.cz1 cz1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yy1Var, "new");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceClaimMethod from ");
        km2.z zVar = this.f428625m;
        java.lang.Object obj = (zVar == null || (cz1Var = zVar.f390765d) == null) ? null : (r45.yy1) cz1Var.m75936x14adae67(13);
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        sb6.append(" to ");
        sb6.append(pm0.b0.g(yy1Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
        km2.z zVar2 = this.f428625m;
        r45.cz1 cz1Var2 = zVar2 != null ? zVar2.f390765d : null;
        if (cz1Var2 == null) {
            return;
        }
        cz1Var2.set(13, yy1Var);
    }

    public final void b7(java.util.LinkedList liveMsgLotteryInfoList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsgLotteryInfoList, "liveMsgLotteryInfoList");
        pm0.v.X(new on2.v2(z17, this, liveMsgLotteryInfoList));
    }

    public final void c7(java.lang.String str) {
        r45.nw1 nw1Var = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r;
        if (str != null) {
            if (this.f428626n.isEmpty()) {
                this.f428626n = P6();
            }
            java.util.Iterator it = this.f428626n.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jz5.l lVar = (jz5.l) it.next();
                r45.nw1 nw1Var2 = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r;
                if (nw1Var2 != null && ((java.lang.Number) lVar.f384366d).longValue() == nw1Var2.m75942xfb822ef2(0)) {
                    it.remove();
                    break;
                }
            }
            int size = this.f428626n.size();
            int i17 = this.f428634v;
            int i18 = this.f428633u;
            if (size > i18) {
                for (int i19 = 0; i19 < i17; i19++) {
                    this.f428626n.removeLast();
                }
            }
            this.f428626n.add(new jz5.l(java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)), str));
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f428626n;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it6 = concurrentLinkedDeque.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                jz5.l lVar2 = (jz5.l) it6.next();
                sb6.append(((java.lang.Number) lVar2.f384366d).longValue() + ':' + ((java.lang.String) lVar2.f384367e));
                sb6.append("|");
            }
            if (!(sb6.length() == 0)) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_LOTTERYID_STRING_SYNC, sb7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "saveLastWinLotteryId MAX_LOTTERY_ID_LIST:" + i18 + ",DROP_LIST_SIZE:" + i17 + ",liveId:" + nw1Var.m75942xfb822ef2(0) + ",lotteryId:" + str + ",lotteryList:" + this.f428626n + ",cacheListStr:" + sb7);
        }
    }

    public final void d7(boolean z17) {
        boolean z18 = pm0.v.z(((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).Q1, 262144);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", "isSecurityDisable = " + z18);
        if (z18) {
            this.f428629q = false;
        } else {
            this.f428629q = z17;
        }
    }

    public final void e7(r45.ht1 ht1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set lotteryRecord:");
        java.lang.Object obj = this.f428627o;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
        this.f428627o = ht1Var;
    }

    public final void f7() {
        ae2.in inVar = ae2.in.f85221a;
        d7((((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85304i2).mo141623x754a37bb()).r()).intValue() == 1) || zl2.q4.f555466a.E());
    }

    public final void g7(r45.cz1 cz1Var) {
        pm0.v.X(new on2.y2(cz1Var, this));
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        pm0.v.X(new on2.w2(this));
        pm0.v.X(new on2.m2(this));
        this.f428626n = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f428631s = null;
        d7(false);
        e7(null);
        this.f428630r = new r45.a94();
    }
}

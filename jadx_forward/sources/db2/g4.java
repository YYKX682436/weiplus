package db2;

/* loaded from: classes2.dex */
public final class g4 extends az2.o {
    public final java.lang.String A;
    public final boolean B;
    public final boolean C;
    public final java.lang.String D;
    public final int E;
    public final r45.u32 F;
    public final boolean G;
    public final r45.sf6 H;
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f309514J;
    public final r45.a34 K;
    public final java.lang.String L;
    public final int M;
    public final java.lang.String N;
    public final r45.nv2 P;
    public final r45.tj2 Q;
    public final long R;
    public java.lang.String S;
    public long T;
    public cz2.f U;

    /* renamed from: t, reason: collision with root package name */
    public final long f309515t;

    /* renamed from: u, reason: collision with root package name */
    public final int f309516u;

    /* renamed from: v, reason: collision with root package name */
    public final int f309517v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f309518w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f309519x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f309520y;

    /* renamed from: z, reason: collision with root package name */
    public final long f309521z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, long j18, java.lang.String str2, boolean z18, boolean z19, java.lang.String str3, r45.qt2 qt2Var, int i19, r45.u32 u32Var, boolean z27, r45.sf6 sf6Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.lang.String str4, r45.a34 a34Var, java.lang.String str5, int i27, int i28, java.lang.String str6, r45.nv2 nv2Var, boolean z28, java.lang.String str7, r45.tj2 tj2Var, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var, null, 2, null);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3;
        r45.sf6 sf6Var2;
        r45.sf6 sf6Var3;
        java.lang.String clientUdfKv;
        java.util.LinkedList<r45.fl2> m75941xfb821914;
        r45.kv0 kv0Var;
        boolean z29 = (i29 & 32) != 0 ? false : z17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i29 & 64) != 0 ? null : gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2 = (i29 & 128) != 0 ? null : yj0Var;
        long j19 = (i29 & 256) != 0 ? 0L : j18;
        java.lang.String username = (i29 & 512) != 0 ? "" : str2;
        boolean z37 = (i29 & 1024) != 0 ? true : z18;
        boolean z38 = (i29 & 2048) != 0 ? false : z19;
        java.lang.String encryptedObjectId = (i29 & 4096) != 0 ? "" : str3;
        int i37 = (i29 & 16384) != 0 ? 6 : i19;
        r45.u32 u32Var2 = (i29 & 32768) != 0 ? null : u32Var;
        boolean z39 = (i29 & 65536) != 0 ? true : z27;
        if ((i29 & 131072) != 0) {
            gVar3 = gVar4;
            sf6Var2 = null;
        } else {
            gVar3 = gVar4;
            sf6Var2 = sf6Var;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = (i29 & 262144) != 0 ? null : gVar2;
        if ((i29 & 524288) != 0) {
            sf6Var3 = sf6Var2;
            clientUdfKv = "";
        } else {
            sf6Var3 = sf6Var2;
            clientUdfKv = str4;
        }
        r45.a34 a34Var2 = (i29 & 1048576) != 0 ? null : a34Var;
        java.lang.String str8 = (i29 & 2097152) != 0 ? null : str5;
        int i38 = (i29 & 8388608) != 0 ? 0 : i28;
        java.lang.String str9 = (i29 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? null : str6;
        r45.nv2 nv2Var2 = (i29 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? null : nv2Var;
        boolean z47 = (i29 & 67108864) != 0 ? false : z28;
        java.lang.String str10 = (i29 & 134217728) != 0 ? null : str7;
        r45.tj2 tj2Var2 = (i29 & 268435456) != 0 ? null : tj2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedObjectId, "encryptedObjectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientUdfKv, "clientUdfKv");
        this.f309515t = j17;
        this.f309516u = i17;
        this.f309517v = i18;
        this.f309518w = feedUsername;
        this.f309519x = z29;
        this.f309520y = yj0Var2;
        this.f309521z = j19;
        this.A = username;
        this.B = z37;
        this.C = z38;
        this.D = encryptedObjectId;
        this.E = i37;
        this.F = u32Var2;
        this.G = z39;
        this.H = sf6Var3;
        this.I = gVar5;
        this.f309514J = clientUdfKv;
        r45.a34 a34Var3 = a34Var2;
        this.K = a34Var3;
        java.lang.String str11 = str8;
        this.L = str11;
        this.M = i38;
        this.N = str9;
        this.P = nv2Var2;
        r45.tj2 tj2Var3 = tj2Var2;
        this.Q = tj2Var3;
        this.R = yj0Var2 != null ? yj0Var2.t0() : 0L;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g51 g51Var = new r45.g51();
        g51Var.set(1, java.lang.Long.valueOf(j17));
        g51Var.set(11, str);
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 b17 = t4Var.b(3763, qt2Var);
        if (z47) {
            cq.k1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209252ge).mo141623x754a37bb()).r()).booleanValue()) {
                b17.set(8, java.lang.Integer.valueOf(b17.m75939xb282bd08(8) | 4));
            }
        }
        g51Var.set(12, b17);
        t4Var.h((r45.kv0) g51Var.m75936x14adae67(12), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str10)));
        t4Var.k((r45.kv0) g51Var.m75936x14adae67(12), a34Var3);
        if (!(str11 == null || str11.length() == 0) && (kv0Var = (r45.kv0) g51Var.m75936x14adae67(12)) != null) {
            kv0Var.set(14, str11);
        }
        r45.kv0 kv0Var2 = (r45.kv0) g51Var.m75936x14adae67(12);
        if (kv0Var2 != null) {
            kv0Var2.set(15, tj2Var3);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dramaSessionBuffer CgiGetFinderFeedComment ");
        sb6.append(pm0.v.u(tj2Var3 != null ? tj2Var3.m75942xfb822ef2(0) : 0L));
        sb6.append(' ');
        sb6.append(tj2Var3 != null ? tj2Var3.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", sb6.toString());
        r45.kv0 kv0Var3 = (r45.kv0) g51Var.m75936x14adae67(12);
        if (kv0Var3 != null && (m75941xfb821914 = kv0Var3.m75941xfb821914(7)) != null) {
            for (r45.fl2 fl2Var : m75941xfb821914) {
                if (fl2Var.m75942xfb822ef2(0) == this.f309515t) {
                    fl2Var.set(7, this.I);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("objectBaseInfo.id:");
                    sb7.append(pm0.v.u(fl2Var.m75942xfb822ef2(0)));
                    sb7.append(", shareBypData.size:");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.I;
                    sb7.append(gVar6 != null ? java.lang.Integer.valueOf(gVar6.f273689a.length) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", sb7.toString());
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f309514J)) {
                        fl2Var.set(5, this.f309514J);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "objectBaseInfo.clientUdfKv:" + fl2Var.m75945x2fec8307(5));
                    }
                }
            }
        }
        g51Var.set(3, java.lang.Integer.valueOf(this.f309519x ? 1 : 0));
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = gVar3;
        g51Var.set(4, gVar7);
        g51Var.set(2, 0L);
        g51Var.set(10, this.D);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            g51Var.set(6, xy2.c.f(qt2Var));
        } else {
            g51Var.set(6, this.A);
        }
        long j27 = this.f309521z;
        if (j27 != 0) {
            g51Var.set(7, java.lang.Long.valueOf(j27));
        }
        g51Var.set(5, java.lang.Long.valueOf(this.R));
        g51Var.set(9, java.lang.Integer.valueOf(this.B ? 2 : 1));
        g51Var.set(8, java.lang.Integer.valueOf(this.f309516u));
        g51Var.set(25, this.H);
        int i39 = this.f309517v;
        int i47 = this.f309516u;
        java.lang.String feedUsername2 = this.f309518w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername2, "feedUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "getIdScene scene:" + i39 + ", commentScene:" + i47);
        int i48 = 1;
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j().r()).intValue() == 1 || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M != 1) {
            if (i47 != 7) {
                i48 = (i47 == 8 && i39 == 1) ? 1 : 2;
            }
        } else if (!hc2.l.g(feedUsername2)) {
            i48 = 3;
        }
        g51Var.set(13, java.lang.Integer.valueOf(i48));
        g51Var.set(14, java.lang.Integer.valueOf(this.E));
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        g51Var.set(18, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        g51Var.set(19, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        r45.u32 u32Var3 = this.F;
        if (u32Var3 != null) {
            g51Var.set(21, u32Var3);
        }
        g51Var.set(20, db2.t4.f309704a.n());
        g51Var.set(28, java.lang.Integer.valueOf(this.M));
        g51Var.set(29, this.N);
        g51Var.set(27, this.P);
        lVar.f152197a = g51Var;
        r45.h51 h51Var = new r45.h51();
        h51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h51Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = h51Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcommentdetail";
        lVar.f152200d = 3763;
        p(lVar.a());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("CgiGetFinderFeedComment init pullScene:");
        sb8.append(this.E);
        sb8.append(" identityScene:");
        sb8.append(g51Var.m75939xb282bd08(13));
        sb8.append(", feedId=");
        sb8.append(this.f309515t);
        sb8.append(" lastBuffer=");
        sb8.append(gVar7 != null);
        sb8.append(" isSecondCommentFetch=");
        sb8.append(this.f309520y != null);
        sb8.append(" scene ");
        sb8.append(g51Var.m75939xb282bd08(8));
        sb8.append(", justUpdateObjectStatus:");
        sb8.append(this.C);
        sb8.append(", encryptedObjectid:");
        sb8.append(this.D);
        sb8.append(", commentScene:");
        sb8.append(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        sb8.append(", source_type:");
        r45.a34 a34Var4 = this.K;
        sb8.append(a34Var4 != null ? java.lang.Integer.valueOf(a34Var4.m75939xb282bd08(0)) : null);
        sb8.append(" , source_buffer:");
        r45.a34 a34Var5 = this.K;
        sb8.append(a34Var5 != null ? a34Var5.m75945x2fec8307(1) : null);
        sb8.append(", lastgmsgid: ");
        sb8.append(this.L);
        sb8.append(", shareUserInfo: ");
        sb8.append(this.P);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", sb8.toString());
        this.U = cz2.f.f306537f;
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        db2.g4 g4Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        java.lang.Object obj;
        jz5.f0 f0Var;
        r45.nw1 m76794xd0557130;
        java.lang.String str2;
        cq.k kVar;
        r45.h51 resp = (r45.h51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" resp=");
        sb6.append(resp);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" isNeedLoadJumperInfo: ");
        boolean z17 = this.G;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", sb6.toString());
        if (i17 >= 4) {
            this.U = cz2.f.f306535d;
        }
        if (((i17 == 0 && i18 == 0) || hc2.p.b(i17, i18)) && this.f309519x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "need fetch object");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                r45.qt2 qt2Var = this.f97668n;
                if (qt2Var != null) {
                    java.lang.String str3 = this.S;
                    if (str3 == null || str3.length() == 0) {
                        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(c19792x256d2725, qt2Var.m75939xb282bd08(5), null);
                    } else {
                        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
                        int m75939xb282bd08 = qt2Var.m75939xb282bd08(5);
                        java.lang.String str4 = this.S;
                        if (str4 == null) {
                            str4 = "";
                        }
                        o3Var.uk(c19792x256d2725);
                        if (o3Var.ek(c19792x256d2725.m76784x5db1b11(), null, m75939xb282bd08).length() == 0) {
                            long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                            java.lang.String m76829x97edf6c0 = c19792x256d2725.m76829x97edf6c0();
                            if (!(!(m76829x97edf6c0 == null || m76829x97edf6c0.length() == 0))) {
                                m76829x97edf6c0 = null;
                            }
                            java.lang.String str5 = m76829x97edf6c0 == null ? str4 : m76829x97edf6c0;
                            r45.hl2 m76756xf0f8a852 = c19792x256d2725.m76756xf0f8a852();
                            o3Var.qk(m76784x5db1b11, null, m75939xb282bd08, str5, m76756xf0f8a852 != null ? m76756xf0f8a852.m75942xfb822ef2(0) : 0L, null);
                        }
                        long m76784x5db1b112 = c19792x256d2725.m76784x5db1b11();
                        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
                        java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
                        java.lang.String m76829x97edf6c02 = c19792x256d2725.m76829x97edf6c0();
                        if (!(!(m76829x97edf6c02 == null || m76829x97edf6c02.length() == 0))) {
                            m76829x97edf6c02 = null;
                        }
                        java.lang.String str6 = m76829x97edf6c02 == null ? str4 : m76829x97edf6c02;
                        r45.hl2 m76756xf0f8a8522 = c19792x256d2725.m76756xf0f8a852();
                        o3Var.qk(m76784x5db1b112, m75945x2fec8307, m75939xb282bd08, str6, m76756xf0f8a8522 != null ? m76756xf0f8a8522.m75942xfb822ef2(0) : 0L, null);
                        ((cq.k) i95.n0.c(cq.k.class)).Ri(c19792x256d2725, m75939xb282bd08);
                    }
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).uk(c19792x256d2725);
                }
                g4Var = this;
                java.lang.String str7 = g4Var.D;
                if (!(str7.length() > 0)) {
                    str7 = null;
                }
                if (str7 != null && (kVar = (cq.k) i95.n0.c(cq.k.class)) != null) {
                    kVar.f302757e.d(str7, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contextObj.extraInfo: ");
                sb7.append(qt2Var != null ? qt2Var.m75945x2fec8307(11) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", sb7.toString());
                if (z17) {
                    p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    xc2.k0.e7((xc2.k0) a17, c19792x256d2725, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, g4Var.f97668n, 0, resp.m75934xbce7f2f(14), g4Var.Q, 8, null);
                }
                if (hc2.o0.j(c19792x256d2725) == 9) {
                    r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
                    java.lang.String m75945x2fec83072 = m76794xd05571302 != null ? m76794xd05571302.m75945x2fec8307(3) : null;
                    if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0) && g4Var.T > 0 && (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) != null) {
                        zy2.z7 z7Var = (zy2.z7) i95.n0.c(zy2.z7.class);
                        r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
                        if (m76794xd05571303 == null || (str2 = m76794xd05571303.m75945x2fec8307(3)) == null) {
                            str2 = "";
                        }
                        m76794xd0557130.set(3, ((b92.v1) z7Var).Ai("FinderGetCommentDetail", str2, g4Var.T));
                    }
                }
                if (i17 == 0 || i18 != 0) {
                }
                java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m75941xfb821914 = resp.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCommentInfo(...)");
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : m75941xfb821914) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) obj).m76058xa6514d24() == c19781xd1c47b87.m76058xa6514d24()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj == null) {
                        linkedList.add(c19781xd1c47b87);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFeedCgi", "filterDuplicate " + c19781xd1c47b87.m76058xa6514d24() + " content " + c19781xd1c47b87.m76060x76847043() + " username " + c19781xd1c47b87.m76102x6c03c64c());
                    }
                }
                resp.set(1, linkedList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = g4Var.f309520y;
                if (yj0Var != null) {
                    yj0Var.u0().m76129x73095078(resp.m75934xbce7f2f(3));
                    if (g4Var.B) {
                        yj0Var.u0().m76114x6a498235(resp.m75939xb282bd08(6));
                    } else {
                        yj0Var.u0().m76152x27177bf0(resp.m75939xb282bd08(5));
                    }
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(2);
                if (c19792x256d27252 != null && (m76760x76845fea = c19792x256d27252.m76760x76845fea()) != null) {
                    ya2.g.m(ya2.h.f542017a, m76760x76845fea, false, 2, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "[onCgiBack] feedId=" + g4Var.f309515t + "  size=" + resp.m75941xfb821914(1).size() + " commentCount=" + resp.m75939xb282bd08(4));
                return;
            }
        }
        g4Var = this;
        if (i17 == 0) {
        }
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.h51 resp = (r45.h51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(2);
        return c19792x256d2725 != null ? kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0)) : kz5.p0.f395529d;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152179f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(oVar, "getReqResp(...)");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        r45.g51 g51Var = fVar instanceof r45.g51 ? (r45.g51) fVar : null;
        if (g51Var == null || (kv0Var = (r45.kv0) g51Var.m75936x14adae67(12)) == null) {
            return 0L;
        }
        return kv0Var.m75942xfb822ef2(5);
    }

    @Override // az2.j, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        this.T = android.os.SystemClock.elapsedRealtime();
        return super.l();
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return this.U;
    }
}

package bq;

/* loaded from: classes2.dex */
public final class z1 extends az2.o implements h81.b {
    public boolean A;
    public final int B;
    public java.util.LinkedList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f105074J;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f105075t;

    /* renamed from: u, reason: collision with root package name */
    public final long f105076u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f105077v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f105078w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f105079x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f105080y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f105081z;

    public /* synthetic */ z1(java.lang.String str, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var, int i18, long j18, boolean z17, java.lang.String str2, long j19, java.lang.Integer num, java.lang.Long l17, java.lang.String str3, boolean z18, boolean z19, java.lang.Long l18, boolean z27, r45.a34 a34Var, r45.y13 y13Var, java.lang.String str4, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i19 & 2) != 0 ? 0L : j17, (i19 & 4) != 0 ? null : gVar, (i19 & 8) != 0 ? 0 : i17, qt2Var, (i19 & 32) != 0 ? 0 : i18, (i19 & 64) != 0 ? 0L : j18, (i19 & 128) != 0 ? false : z17, (i19 & 256) != 0 ? "" : str2, (i19 & 512) != 0 ? 0L : j19, (i19 & 1024) != 0 ? 0 : num, (i19 & 2048) != 0 ? 0L : l17, (i19 & 4096) != 0 ? "" : str3, (i19 & 8192) != 0 ? false : z18, (i19 & 16384) != 0 ? false : z19, (32768 & i19) != 0 ? 0L : l18, (65536 & i19) != 0 ? false : z27, (131072 & i19) != 0 ? null : a34Var, (262144 & i19) != 0 ? null : y13Var, (i19 & 524288) != 0 ? null : str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
    @Override // az2.o, az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r32, int r33, java.lang.String r34, com.p314xaae8f345.mm.p2495xc50a8b8b.f r35, com.p314xaae8f345.mm.p944x882e457a.m1 r36) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.z1.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 resp = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.List K = K();
        java.util.ArrayList arrayList = null;
        if (K != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(K, 10));
            java.util.Iterator it = K.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 0, 2, null));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? kz5.p0.f395529d : arrayList;
    }

    @Override // az2.o
    public long D() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.z13) fVar).m75936x14adae67(6);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.g E() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar).m77053x44e5026c();
    }

    public final long F() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageRequest");
        return ((r45.z13) fVar).m75942xfb822ef2(2);
    }

    public final java.lang.String G() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar).m77071xcc91c42c();
    }

    public final java.util.LinkedList H() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        java.util.LinkedList<r45.r03> m77081xa9bb4a90 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar).m77081xa9bb4a90();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77081xa9bb4a90, "getUsualTopics(...)");
        return m77081xa9bb4a90;
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g I() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar).m77079xeb17c2c4();
    }

    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa J() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar).m77035x76845fea();
    }

    public final java.util.List K() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar).m77066x2817c635();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(java.lang.String req_username, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var, int i18, long j18, boolean z17, java.lang.String biz_username, long j19, java.lang.Integer num, java.lang.Long l17, java.lang.String liveNoticeId, boolean z18, boolean z19, java.lang.Long l18, boolean z27, r45.a34 a34Var, r45.y13 y13Var, java.lang.String str) {
        super(qt2Var, null, 2, null);
        java.lang.String str2;
        boolean z28;
        boolean z29;
        java.lang.String str3;
        java.util.LinkedList m75941xfb821914;
        r45.fl2 fl2Var;
        r45.kv0 kv0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req_username, "req_username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz_username, "biz_username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveNoticeId, "liveNoticeId");
        this.f105075t = req_username;
        this.f105076u = j18;
        this.f105077v = z17;
        this.f105078w = biz_username;
        this.f105079x = z27;
        this.f105081z = true;
        this.C = new java.util.LinkedList();
        ya2.b2 b17 = ya2.h.f542017a.b(req_username);
        java.lang.String str4 = b17 != null ? b17.f69311xd78e96e4 : null;
        str4 = str4 == null ? "" : str4;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuserpage";
        lVar.f152200d = 3736;
        r45.z13 z13Var = new r45.z13();
        z13Var.set(1, req_username);
        z13Var.set(2, java.lang.Long.valueOf(j17));
        z13Var.set(3, str4);
        z13Var.set(4, xy2.c.f(qt2Var));
        z13Var.set(11, java.lang.Integer.valueOf(i18));
        z13Var.set(10, java.lang.Long.valueOf(j18));
        db2.t4 t4Var = db2.t4.f309704a;
        z13Var.set(6, t4Var.b(3736, qt2Var));
        r45.kv0 kv0Var2 = (r45.kv0) z13Var.m75936x14adae67(6);
        if (kv0Var2 == null) {
            str2 = str4;
        } else {
            str2 = str4;
            kv0Var2.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0));
        }
        z13Var.set(21, java.lang.Integer.valueOf(z27 ? 1 : 0));
        if (z18 && (kv0Var = (r45.kv0) z13Var.m75936x14adae67(6)) != null) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(3) | 524288));
        }
        z13Var.set(5, java.lang.Integer.valueOf((r26.i0.q(z13Var.m75945x2fec8307(1), z13Var.m75945x2fec8307(4), false, 2, null) || ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F1().r()).booleanValue()) ? 1 : 0));
        z13Var.set(7, gVar);
        z13Var.set(9, t4Var.n());
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jz5.l ck6 = ((c61.l7) ((zy2.b6) c17)).ck(false);
        z13Var.set(14, java.lang.Float.valueOf(((java.lang.Number) ck6.f384366d).floatValue()));
        z13Var.set(15, java.lang.Float.valueOf(((java.lang.Number) ck6.f384367e).floatValue()));
        z13Var.set(16, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        long j27 = 0;
        z13Var.set(17, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        z13Var.set(19, liveNoticeId);
        z13Var.set(20, java.lang.Long.valueOf(l18 != null ? l18.longValue() : 0L));
        if (j19 != 0) {
            j27 = j19;
        } else if (l17 != null) {
            j27 = l17.longValue();
        }
        z13Var.set(12, java.lang.Long.valueOf(j27));
        if (biz_username.length() > 0) {
            z13Var.set(8, java.lang.Integer.valueOf(j19 != 0 ? 23 : 24));
            z13Var.set(13, biz_username);
        }
        if (z19) {
            z13Var.set(8, 33);
        }
        if (y13Var != null) {
            z13Var.set(22, y13Var);
        }
        if (z13Var.m75939xb282bd08(8) == 0) {
            z13Var.set(8, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(8) : 0));
        }
        long j28 = (!t4Var.q() || j19 == 0 || j19 == -1) ? j18 : j19;
        r45.kv0 kv0Var3 = (r45.kv0) z13Var.m75936x14adae67(6);
        r45.kv0 kv0Var4 = (r45.kv0) z13Var.m75936x14adae67(6);
        t4Var.h(kv0Var3, qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var4 != null ? kv0Var4.m75939xb282bd08(1) : 0), java.lang.Long.valueOf(j28), str)));
        t4Var.k((r45.kv0) z13Var.m75936x14adae67(6), a34Var);
        z13Var.set(26, 1L);
        if (i17 == 98) {
            z28 = false;
            z13Var.set(24, 2);
        } else if (i17 != 99) {
            z28 = false;
            z13Var.set(24, 0);
            z13Var.set(7, gVar);
        } else {
            z28 = false;
            z13Var.set(24, 1);
            z13Var.set(25, gVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        t70Var.j1().l();
        if (((java.lang.Boolean) t70Var.j1().r()).booleanValue() && z27) {
            z13Var.set(26, java.lang.Long.valueOf(z13Var.m75942xfb822ef2(26) | 4));
        }
        if (((java.lang.Boolean) t70Var.s0().r()).booleanValue()) {
            z13Var.set(26, java.lang.Long.valueOf(z13Var.m75942xfb822ef2(26) | 8));
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 c19796x6abb1fc1 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1();
        lVar.f152197a = z13Var;
        lVar.f152198b = c19796x6abb1fc1;
        p(lVar.a());
        this.B = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init maxId ");
        sb6.append(j17);
        sb6.append(" username ");
        sb6.append(req_username);
        sb6.append(" pullType ");
        sb6.append(i17);
        sb6.append(" fpMD5 ");
        sb6.append(str2);
        sb6.append(" scene ");
        sb6.append(num);
        sb6.append(",clickFeedId:");
        sb6.append(pm0.v.u(j19));
        sb6.append(",firstSessionBuffer is null:");
        r45.kv0 kv0Var5 = (r45.kv0) z13Var.m75936x14adae67(6);
        if (kv0Var5 == null || (m75941xfb821914 = kv0Var5.m75941xfb821914(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(m75941xfb821914)) == null) {
            z29 = true;
            str3 = null;
        } else {
            z29 = true;
            str3 = fl2Var.m75945x2fec8307(1);
        }
        sb6.append(str3 == null ? z29 : z28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUserPageCGI", sb6.toString());
    }
}

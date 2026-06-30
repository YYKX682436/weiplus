package db2;

/* loaded from: classes2.dex */
public final class t1 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final r45.na1 f309696t;

    public t1(int i17, long j17, java.lang.Long l17, java.lang.String str, java.lang.String str2, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.lang.String str3, int i19, r45.a34 a34Var) {
        super(qt2Var, null, 2, null);
        this.f309696t = new r45.na1();
        F(this, "", i17, l17, str, j17, gVar, null, qt2Var, str3, str2, i18, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? 4 : 0, null, 0, 0.0f, 0.0f, null, i19, a34Var, 126976, null);
    }

    public static void F(db2.t1 t1Var, java.lang.String str, int i17, java.lang.Long l17, java.lang.String str2, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.xu2 xu2Var, r45.qt2 qt2Var, java.lang.String str3, java.lang.String str4, int i18, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i27, float f17, float f18, r45.ao6 ao6Var, int i28, r45.a34 a34Var, int i29, java.lang.Object obj) {
        int i37;
        java.lang.String str5 = (i29 & 256) != 0 ? null : str3;
        java.lang.String str6 = (i29 & 512) != 0 ? "" : str4;
        int i38 = (i29 & 1024) != 0 ? 0 : i18;
        int i39 = (i29 & 2048) != 0 ? 0 : i19;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i29 & 4096) != 0 ? null : gVar2;
        int i47 = (i29 & 8192) != 0 ? 0 : i27;
        float f19 = (i29 & 16384) != 0 ? 0.0f : f17;
        float f27 = (32768 & i29) == 0 ? f18 : 0.0f;
        r45.ao6 ao6Var2 = (65536 & i29) != 0 ? null : ao6Var;
        int i48 = (131072 & i29) != 0 ? 0 : i28;
        r45.a34 a34Var2 = (i29 & 262144) != 0 ? null : a34Var;
        t1Var.getClass();
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 b17 = t4Var.b(817, qt2Var);
        r45.na1 na1Var = t1Var.f309696t;
        na1Var.set(1, b17);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(4, str);
        na1Var.set(2, gVar);
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(10, xu2Var);
        na1Var.set(15, str6);
        na1Var.set(16, java.lang.Integer.valueOf(i38));
        na1Var.set(11, java.lang.Integer.valueOf(i39));
        na1Var.set(14, gVar3);
        na1Var.set(8, java.lang.Integer.valueOf(i47));
        na1Var.set(5, java.lang.Float.valueOf(f19));
        na1Var.set(6, java.lang.Float.valueOf(f27));
        na1Var.set(9, ao6Var2);
        na1Var.set(20, java.lang.Integer.valueOf(i48));
        if (str5 != null) {
            byte[] bytes = str5.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            i37 = 0;
            na1Var.set(17, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
        } else {
            i37 = 0;
        }
        t4Var.h((r45.kv0) na1Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : i37), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(7)), str2)));
        t4Var.k((r45.kv0) na1Var.m75936x14adae67(1), a34Var2);
        t1Var.E();
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.oa1 resp = (r45.oa1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetTopicFeed", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.oa1 resp = (r45.oa1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = (r45.kv0) this.f309696t.m75936x14adae67(1);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    public final void E() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.dx0 n17 = db2.t4.f309704a.n();
        r45.na1 na1Var = this.f309696t;
        na1Var.set(12, n17);
        lVar.f152197a = na1Var;
        r45.oa1 oa1Var = new r45.oa1();
        oa1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) oa1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = oa1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        lVar.f152200d = 817;
        p(lVar.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(so2.q6 args, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        r45.na1 na1Var = new r45.na1();
        this.f309696t = na1Var;
        db2.t4 t4Var = db2.t4.f309704a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(2, args.f492088a);
        na1Var.set(3, java.lang.Integer.valueOf(args.f492089b));
        na1Var.set(7, java.lang.Long.valueOf(args.f492090c));
        na1Var.set(13, java.lang.Long.valueOf(args.f492092e));
        na1Var.set(18, java.lang.Integer.valueOf(args.f492093f));
        na1Var.set(14, args.f492094g);
        na1Var.set(15, args.f492095h);
        t4Var.h((r45.kv0) na1Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(7)), args.f492091d)));
        E();
    }
}

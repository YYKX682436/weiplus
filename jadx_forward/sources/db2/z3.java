package db2;

/* loaded from: classes2.dex */
public final class z3 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309791t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String username, int i17, java.lang.String str, int i18, long j17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, null, 2, null);
        str = (i19 & 4) != 0 ? null : str;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        j17 = (i19 & 16) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f309791t = "Finder.CgiFinderUserPage";
        r45.z13 z13Var = new r45.z13();
        z13Var.set(1, username);
        z13Var.set(8, java.lang.Integer.valueOf(i17));
        z13Var.set(3, "");
        z13Var.set(4, xy2.c.f(this.f97668n));
        db2.t4 t4Var = db2.t4.f309704a;
        z13Var.set(6, t4Var.b(3736, null));
        r45.kv0 kv0Var = (r45.kv0) z13Var.m75936x14adae67(6);
        if (kv0Var != null) {
            kv0Var.set(1, 0);
        }
        z13Var.set(9, t4Var.n());
        z13Var.set(23, str);
        z13Var.set(16, java.lang.Integer.valueOf(i18));
        z13Var.set(17, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = z13Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 c19796x6abb1fc1 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1();
        c19796x6abb1fc1.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = c19796x6abb1fc1.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = c19796x6abb1fc1;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuserpage";
        lVar.f152200d = 3736;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderUserPage", "init username:" + username + ", enterType:" + i17);
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 resp = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309791t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 resp = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m77066x2817c635 = resp.m77066x2817c635();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77066x2817c635, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m77066x2817c635, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m77066x2817c635) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        return arrayList;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String username, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var, long j18, java.lang.String biz_username, long j19, boolean z17, java.lang.String str) {
        super(null, null, 2, null);
        r45.kv0 kv0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz_username, "biz_username");
        this.f309791t = "Finder.CgiFinderUserPage";
        new r45.z13();
        ya2.b2 b17 = ya2.h.f542017a.b(username);
        java.lang.String str2 = b17 != null ? b17.f69311xd78e96e4 : null;
        str2 = str2 == null ? "" : str2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuserpage";
        lVar.f152200d = 3736;
        r45.z13 z13Var = new r45.z13();
        z13Var.set(1, username);
        z13Var.set(2, java.lang.Long.valueOf(j17));
        z13Var.set(3, str2);
        z13Var.set(4, xy2.c.f(qt2Var));
        z13Var.set(11, 0);
        z13Var.set(10, java.lang.Long.valueOf(j18));
        db2.t4 t4Var = db2.t4.f309704a;
        z13Var.set(6, t4Var.b(3736, qt2Var));
        r45.kv0 kv0Var2 = (r45.kv0) z13Var.m75936x14adae67(6);
        if (kv0Var2 != null) {
            kv0Var2.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0));
        }
        if (z17 && (kv0Var = (r45.kv0) z13Var.m75936x14adae67(6)) != null) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(3) | 524288));
        }
        z13Var.set(5, java.lang.Integer.valueOf((r26.i0.q(z13Var.m75945x2fec8307(1), z13Var.m75945x2fec8307(4), false, 2, null) || ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F1().r()).booleanValue()) ? 1 : 0));
        z13Var.set(7, gVar);
        z13Var.set(9, t4Var.n());
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        z13Var.set(14, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        z13Var.set(15, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        z13Var.set(12, java.lang.Long.valueOf(j19));
        if (biz_username.length() > 0) {
            z13Var.set(8, java.lang.Integer.valueOf(j19 != 0 ? 23 : 24));
            z13Var.set(13, biz_username);
        }
        long j27 = (!t4Var.q() || j19 == 0 || j19 == -1) ? j18 : j19;
        r45.kv0 kv0Var3 = (r45.kv0) z13Var.m75936x14adae67(6);
        r45.kv0 kv0Var4 = (r45.kv0) z13Var.m75936x14adae67(6);
        t4Var.h(kv0Var3, null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var4 != null ? kv0Var4.m75939xb282bd08(1) : 0), java.lang.Long.valueOf(j27), str)));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 c19796x6abb1fc1 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1();
        lVar.f152197a = z13Var;
        lVar.f152198b = c19796x6abb1fc1;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUserPageCGI", "NetSceneFinderUserPage init maxId " + j17 + " username " + username + " pullType " + i17 + " fpMD5 " + str2);
    }
}

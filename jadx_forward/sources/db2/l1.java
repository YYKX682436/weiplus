package db2;

/* loaded from: classes.dex */
public final class l1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f309585t;

    public l1(r45.qt2 qt2Var, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18) {
        super(qt2Var, null, 2, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.i91 i91Var = new r45.i91();
        db2.t4 t4Var = db2.t4.f309704a;
        i91Var.set(1, t4Var.b(13571, qt2Var));
        i91Var.set(2, str);
        i91Var.set(3, gVar);
        i91Var.set(5, java.lang.Integer.valueOf(i17));
        i91Var.set(6, java.lang.Integer.valueOf(i18));
        i91Var.set(4, t4Var.n());
        lVar.f152197a = i91Var;
        r45.j91 j91Var = new r45.j91();
        j91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j91Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = j91Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetpostplaysquarecontainer";
        lVar.f152200d = 13571;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetPostPlaySquareContainer", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914;
        r45.j91 resp = (r45.j91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetPostPlaySquareContainer", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
        if (i17 == 0 && i18 == 0 && (m75941xfb821914 = resp.m75941xfb821914(1)) != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                o3Var.cl(c19792x256d2725, this.f97668n);
            }
        }
    }
}

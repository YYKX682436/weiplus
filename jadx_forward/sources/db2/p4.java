package db2;

/* loaded from: classes10.dex */
public final class p4 extends com.p314xaae8f345.mm.p944x882e457a.i {
    public p4(java.util.LinkedList userList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userList, "userList");
        r45.q91 q91Var = new r45.q91();
        q91Var.set(1, db2.t4.f309704a.a(6688));
        q91Var.set(2, userList);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = q91Var;
        r45.r91 r91Var = new r45.r91();
        r91Var.set(0, new r45.ie());
        lVar.f152198b = r91Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetprivatemsgcontactextinfolist";
        lVar.f152200d = 6688;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.CgiPrivateMsgContactExtInfo", "CgiPrivateMsgContactExtInfo init userNameList.size = " + userList.size());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object obj;
        java.util.LinkedList m75941xfb821914;
        r45.r91 r91Var = (r45.r91) fVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", resp: ");
        if (r91Var == null || (obj = pm0.b0.b(r91Var)) == null) {
            obj = " null";
        }
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.CgiPrivateMsgContactExtInfo", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            if (r91Var != null) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENTER_PERSONAL_MSG_REFRESH_INTERVAL_INT_SYNC, java.lang.Integer.valueOf(r91Var.m75939xb282bd08(2)));
            }
            if (r91Var == null || (m75941xfb821914 = r91Var.m75941xfb821914(1)) == null) {
                return;
            }
            int i19 = 0;
            for (java.lang.Object obj2 : m75941xfb821914) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ar2 ar2Var = (r45.ar2) obj2;
                zy2.dc fj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).fj(ar2Var.m75945x2fec8307(0));
                if (!(fj6 instanceof ya2.b2)) {
                    fj6 = null;
                }
                ya2.b2 b2Var = fj6 != null ? (ya2.b2) fj6 : null;
                if (b2Var != null) {
                    r45.zl1 zl1Var = new r45.zl1();
                    zl1Var.set(0, ar2Var.m75941xfb821914(1));
                    r45.zl1 zl1Var2 = b2Var.f69302xb21664aa;
                    byte[] mo14344x5f01b1f6 = zl1Var2 != null ? zl1Var2.mo14344x5f01b1f6() : null;
                    if (mo14344x5f01b1f6 == null) {
                        mo14344x5f01b1f6 = new byte[0];
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(mo14344x5f01b1f6).equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(zl1Var.mo14344x5f01b1f6())) || b2Var.f69339x744b360c != ar2Var.m75942xfb822ef2(2) || b2Var.f69316x722c2 != ar2Var.m75942xfb822ef2(3) || b2Var.f69313xcad4ef95 != ar2Var.m75939xb282bd08(4) || b2Var.f69317x59c9cadd != ar2Var.m75933x41a8a7f2(5)) {
                        b2Var.f69302xb21664aa = zl1Var;
                        b2Var.f69332x7bc505b2 = c01.id.c();
                        b2Var.f69339x744b360c = ar2Var.m75942xfb822ef2(2);
                        b2Var.f69316x722c2 = ar2Var.m75942xfb822ef2(3);
                        b2Var.f69313xcad4ef95 = ar2Var.m75939xb282bd08(4);
                        b2Var.f69317x59c9cadd = ar2Var.m75933x41a8a7f2(5);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).oj(b2Var);
                    }
                }
                i19 = i27;
            }
        }
    }
}

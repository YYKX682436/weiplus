package db2;

/* loaded from: classes.dex */
public final class p1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f309643t;

    public p1(r45.qt2 qt2Var, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.Integer num, long j17, java.lang.String str2) {
        super(qt2Var, null, 2, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.w91 w91Var = new r45.w91();
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 b17 = t4Var.b(21396, qt2Var);
        if (j17 != 0) {
            if (!(str2 == null || str2.length() == 0)) {
                java.util.LinkedList m75941xfb821914 = b17.m75941xfb821914(7);
                if (m75941xfb821914 != null) {
                    r45.fl2 fl2Var = new r45.fl2();
                    fl2Var.set(0, java.lang.Long.valueOf(j17));
                    fl2Var.set(1, str2);
                    m75941xfb821914.add(fl2Var);
                }
                b17.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderGetRecommendReasonStream sourceFeedId=");
                sb6.append(j17);
                sb6.append(", sourceSessionBuffer=");
                sb6.append(str2);
                sb6.append(", commentScene=");
                sb6.append(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetRecommendReasonHeader", sb6.toString());
            }
        }
        w91Var.set(1, b17);
        w91Var.set(2, str);
        w91Var.set(3, gVar);
        if (num != null) {
            num.intValue();
            w91Var.set(5, java.lang.Integer.valueOf(num.intValue()));
        }
        w91Var.set(4, t4Var.n());
        lVar.f152197a = w91Var;
        r45.x91 x91Var = new r45.x91();
        x91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x91Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = x91Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetrecommendreasonstream";
        lVar.f152200d = 21396;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetRecommendReasonHeader", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914;
        r45.x91 resp = (r45.x91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderGetRecommendReasonHeader", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
        if (i17 == 0 && i18 == 0 && (m75941xfb821914 = resp.m75941xfb821914(2)) != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                o3Var.cl(c19792x256d2725, this.f97668n);
            }
        }
    }
}

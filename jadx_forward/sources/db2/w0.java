package db2;

/* loaded from: classes2.dex */
public final class w0 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final int f309737t;

    /* renamed from: u, reason: collision with root package name */
    public final int f309738u;

    /* renamed from: v, reason: collision with root package name */
    public final yz5.s f309739v;

    /* renamed from: w, reason: collision with root package name */
    public final db2.v3 f309740w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f309741x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i17, int i18, yz5.s callback, db2.v3 v3Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f309737t = i17;
        this.f309738u = i18;
        this.f309739v = callback;
        this.f309740w = v3Var;
        this.f309741x = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.u61 u61Var = new r45.u61();
        u61Var.set(1, xy2.c.f(qt2Var));
        u61Var.set(4, java.lang.Integer.valueOf(i18));
        if (z17) {
            java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(i18), "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            u61Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17)));
        } else {
            u61Var.set(2, gVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetHistory", "[request] tabType=" + i18 + " pullType=" + i17 + " useGlobalLastBuffer=" + z17);
        db2.t4 t4Var = db2.t4.f309704a;
        u61Var.set(3, t4Var.b(3814, qt2Var));
        u61Var.set(5, t4Var.n());
        lVar.f152197a = u61Var;
        r45.v61 v61Var = new r45.v61();
        v61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v61Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = v61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergethistory";
        lVar.f152200d = 3814;
        p(lVar.a());
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v61 resp = (r45.v61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        db2.v3 v3Var = this.f309740w;
        if (v3Var != null && v3Var.a(i17, i18, str, resp)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CgiFinderGetHistory", "has consume.");
            return;
        }
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetHistory", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " pullType=" + this.f309737t + " list=" + m75941xfb821914.size() + " last_buffer=" + resp.m75934xbce7f2f(2));
        if (i17 == 0 && i18 == 0 && this.f309741x) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 c18 = hc2.d0.c(this.f309738u);
            java.lang.String str2 = null;
            if (resp.m75934xbce7f2f(2) != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(2);
                str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
            c17.x(c18, str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetHistory", hc2.o0.k(m75941xfb821914));
        this.f309739v.v(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, resp, m1Var);
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.v61 resp = (r45.v61) fVar;
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
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetHistoryRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.u61) fVar).m75936x14adae67(3);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }
}

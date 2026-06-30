package ek2;

/* loaded from: classes.dex */
public final class g3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final r45.e52 f334988u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f334989v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.es1 f334990w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(gk2.e buContext, r45.e52 coverInfo) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverInfo, "coverInfo");
        this.f334988u = coverInfo;
        this.f334989v = "Finder.CgiUpdateRedPacketCoverInfo";
        r45.es1 es1Var = new r45.es1();
        this.f334990w = es1Var;
        es1Var.set(1, db2.t4.f309704a.a(8259));
        es1Var.set(2, ((mm2.c1) buContext.a(mm2.c1.class)).f410385o);
        java.lang.String f17 = xy2.c.f(this.f97668n);
        if (f17 != null) {
            java.lang.String str = (f17.length() == 0) ^ true ? f17 : null;
            if (str != null) {
                es1Var.set(3, str);
            }
        }
        es1Var.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(((mm2.e1) buContext.a(mm2.e1.class)).f410518o));
        es1Var.set(5, java.lang.Long.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f410516m));
        es1Var.set(6, java.lang.Long.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gn3 gn3Var = new r45.gn3();
        gn3Var.set(0, 1);
        gn3Var.set(1, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(coverInfo.mo14344x5f01b1f6()));
        linkedList.add(gn3Var);
        es1Var.set(7, linkedList);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = es1Var;
        r45.fs1 fs1Var = new r45.fs1();
        fs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fs1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = fs1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetextrainfo";
        lVar.f152200d = 8259;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiUpdateRedPacketCoverInfo", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String m75945x2fec8307;
        r45.fs1 resp = (r45.fs1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] scene:" + this.f334990w.m75942xfb822ef2(6) + ",errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f334989v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getGet_resp_list(...)");
            r45.mn3 mn3Var = (r45.mn3) kz5.n0.Z(m75941xfb821914);
            if (mn3Var != null) {
                r45.i52 i52Var = new r45.i52();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = mn3Var.m75934xbce7f2f(2);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 != null) {
                    try {
                        i52Var.mo11468x92b714fd(g17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "status = " + pm0.b0.b(i52Var));
                java.util.LinkedList m75941xfb8219142 = this.f334988u.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getInfos(...)");
                r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(m75941xfb8219142);
                if (wd5Var == null || (m75945x2fec8307 = wd5Var.m75945x2fec8307(2)) == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k0.f197118a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedPacketCache", "[saveStatus] status:" + pm0.b0.g(i52Var) + ", url:" + m75945x2fec8307);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k0.f197119b.put(m75945x2fec8307, i52Var);
            }
        }
    }
}

package db2;

/* loaded from: classes2.dex */
public final class w3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final db2.u3 f309748t;

    /* renamed from: u, reason: collision with root package name */
    public final int f309749u;

    /* renamed from: v, reason: collision with root package name */
    public final int f309750v;

    /* renamed from: w, reason: collision with root package name */
    public final db2.v3 f309751w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f309752x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.ix2 f309753y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(db2.u3 callback, int i17, int i18, db2.v3 v3Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        java.lang.Object b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f309748t = callback;
        this.f309749u = i17;
        this.f309750v = i18;
        this.f309751w = v3Var;
        this.f309752x = z17;
        r45.ix2 ix2Var = new r45.ix2();
        this.f309753y = ix2Var;
        if (i17 == 0 && z17) {
            gm0.j1.u().c().x(hc2.d0.c(i18), null);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        if (z17) {
            java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(i18), "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            ix2Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17)));
        } else {
            ix2Var.set(1, gVar);
        }
        ix2Var.set(3, java.lang.Integer.valueOf(i17));
        ix2Var.set(11, java.lang.Integer.valueOf(i18));
        if (i17 == 1 && (i18 == 1 || i18 == 3 || i18 == 4)) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c70.f215507g;
            java.lang.Long l17 = (java.lang.Long) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c70.f215507g.remove(java.lang.Integer.valueOf(i18));
            ix2Var.set(15, java.lang.Long.valueOf(l17 == null ? 0L : l17.longValue()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderTimelineStream", "[request] tabType=" + i18 + " partialExposedObjectId=" + ix2Var.m75942xfb822ef2(15) + " h:" + hashCode());
        }
        pf5.u uVar = pf5.u.f435469a;
        jz5.l P6 = ((ey2.k0) uVar.e(c61.l7.class).a(ey2.k0.class)).P6();
        ix2Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        ix2Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        int Q6 = (int) (((ey2.k0) uVar.e(c61.l7.class).a(ey2.k0.class)).Q6() / 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.f183932a;
        r45.fr0 fr0Var = new r45.fr0();
        fr0Var.set(0, java.lang.Float.valueOf(ix2Var.m75938x746dc8a6(5)));
        fr0Var.set(1, java.lang.Float.valueOf(ix2Var.m75938x746dc8a6(6)));
        ix2Var.set(38, java.lang.Integer.valueOf(n3Var.b(fr0Var, 0.0f, null, Q6)));
        db2.t4 t4Var = db2.t4.f309704a;
        ix2Var.set(4, t4Var.b(3901, qt2Var));
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        ix2Var.set(7, Ri != null ? Ri : "");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e r07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().r0(i18);
        if (r07.m75942xfb822ef2(0) != 0) {
            ix2Var.set(12, java.lang.Long.valueOf(r07.m75942xfb822ef2(0)));
            ix2Var.set(13, r07.m75945x2fec8307(1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderTimelineStream", "[request] tabType=" + i18 + " request with showInfo. objectId=" + pm0.v.u(ix2Var.m75942xfb822ef2(12)) + " h:" + hashCode());
        }
        r45.dx0 n17 = t4Var.n();
        ix2Var.set(9, so2.h3.f491925d.h(i18));
        ix2Var.set(8, n17);
        ix2Var.set(21, zl2.q4.d(zl2.q4.f555466a, null, null, 3, null));
        java.util.LinkedList a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l1.I.a(i18);
        if (a17 != null) {
            ix2Var.set(14, a17);
        }
        lVar.f152197a = ix2Var;
        r45.mx2 mx2Var = new r45.mx2();
        mx2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) mx2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = mx2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderstream";
        lVar.f152200d = 3901;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxl CgiFetchFinderTimeline  tabType=");
        sb6.append(i18);
        sb6.append(" init ");
        sb6.append(i17);
        sb6.append(" lastBuffer ");
        sb6.append(ix2Var.m75934xbce7f2f(1) == null);
        sb6.append(", ");
        if (ix2Var.m75934xbce7f2f(1) == null) {
            b17 = '1';
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ix2Var.m75934xbce7f2f(1);
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null);
        }
        sb6.append(b17);
        sb6.append(" longitude=");
        sb6.append(ix2Var.m75938x746dc8a6(5));
        sb6.append(" latitude=");
        sb6.append(ix2Var.m75938x746dc8a6(6));
        sb6.append(",locTime=");
        sb6.append(ix2Var.m75939xb282bd08(38));
        sb6.append(", h:");
        sb6.append(hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderTimelineStream", sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x02c6, code lost:
    
        if ((!r7.isEmpty()) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02d4, code lost:
    
        if ((r7.isEmpty() ^ r2) != false) goto L89;
     */
    @Override // az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r21, int r22, java.lang.String r23, com.p314xaae8f345.mm.p2495xc50a8b8b.f r24, com.p314xaae8f345.mm.p944x882e457a.m1 r25) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.w3.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.j
    public boolean y() {
        return true;
    }
}

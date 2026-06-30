package um2;

/* loaded from: classes3.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510383a;

    public k(um2.x5 x5Var) {
        this.f510383a = x5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        fm2.c cVar;
        co0.s E;
        dk2.xg xgVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r45.hc1 hc1Var = (r45.hc1) fVar.f152151d;
        r45.nw1 nw1Var = (r45.nw1) hc1Var.m75936x14adae67(3);
        r45.ma4 ma4Var = (r45.ma4) hc1Var.m75936x14adae67(2);
        java.lang.String str = this.f510383a.f510565f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("JoinLiveCallback2 errType:");
        sb6.append(fVar.f152148a);
        sb6.append(" errCode:");
        sb6.append(fVar.f152149b);
        sb6.append(" errMsg:");
        sb6.append(fVar.f152150c);
        sb6.append(",respLiveInfo:");
        sb6.append(nw1Var != null ? nw1Var.hashCode() : 0);
        sb6.append(',');
        sb6.append(cm2.a.f124861a.y(nw1Var));
        sb6.append(",respLiveSdkInfo is null:");
        sb6.append(ma4Var == null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && nw1Var != null && ma4Var != null) {
            um2.x5 x5Var = this.f510383a;
            ((mm2.e1) x5Var.c(mm2.e1.class)).h7(ma4Var, nw1Var, hc1Var.m75934xbce7f2f(1));
            mm2.c1 c1Var = (mm2.c1) x5Var.c(mm2.c1.class);
            r45.nw1 nw1Var2 = (r45.nw1) hc1Var.m75936x14adae67(3);
            c1Var.q8(nw1Var2 != null ? nw1Var2.m75942xfb822ef2(32) : 0L);
            ((mm2.c1) x5Var.c(mm2.c1.class)).Q1 = hc1Var.m75939xb282bd08(47);
            ((mm2.c1) x5Var.c(mm2.c1.class)).R1 = hc1Var.m75942xfb822ef2(42);
            ((je2.a0) x5Var.c(je2.a0.class)).N6(nw1Var, "updateLiveData");
            um2.m mVar = um2.m.f510406a;
            um2.x5 x5Var2 = this.f510383a;
            mVar.e(x5Var2.f101142a, x5Var2.f510565f, x5Var2.f101138b, nw1Var, ma4Var);
            um2.x5 x5Var3 = this.f510383a;
            boolean a86 = ((mm2.c1) x5Var3.c(mm2.c1.class)).a8();
            java.lang.String str2 = x5Var3.f510565f;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("JoinLiveCallback2 isDestroyed:");
            fm2.c cVar2 = x5Var3.f101139c;
            sb7.append(cVar2 != null ? java.lang.Boolean.valueOf(cVar2.m57698xbca8d80f()) : null);
            sb7.append(",isLiveStart:");
            sb7.append(a86);
            sb7.append(",liveRoomModel:");
            sb7.append(((mm2.e1) x5Var3.c(mm2.e1.class)).f410523t);
            sb7.append(", liveExtFlag:");
            sb7.append(((mm2.c1) x5Var3.c(mm2.c1.class)).Q1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = x5Var3.f510571h;
            if (ob0Var != null) {
                ob0Var.H1(true);
            }
            co0.s E2 = x5Var3.E();
            if (E2 != null) {
                E2.x0(x5Var3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var2 = x5Var3.f510571h;
            if (ob0Var2 != null) {
                ob0Var2.K0(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var3 = x5Var3.f510571h;
            if (ob0Var3 != null) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                com.p314xaae8f345.p2926x359365.C25484xcc963946 d07 = r4Var.d0(x5Var3.f510565f);
                gk2.e eVar = x5Var3.f101142a;
                fm2.c cVar3 = x5Var3.f101139c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.G1(ob0Var3, 0, d07, r4Var.R0(eVar, cVar3 != null ? cVar3.m46546x9b8334b1() : false, false), false, false, null, null, 105, null);
            }
            if (a86) {
                mVar.b(x5Var3);
            } else {
                x5Var3.W(false);
            }
            dk2.ef efVar = dk2.ef.f314905a;
            long m75942xfb822ef2 = ((mm2.e1) x5Var3.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            dk2.xg xgVar2 = dk2.ef.f314924j0;
            boolean z17 = xgVar2 != null && xgVar2.f315891b;
            if (!z17 && (xgVar = dk2.ef.f314924j0) != null) {
                xgVar.a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "resetHeartBeat liveId:" + m75942xfb822ef2 + " delay:0 heartBeatFinish:" + z17 + '!');
            efVar.v(0L, m75942xfb822ef2);
            fm2.c cVar4 = x5Var3.f101139c;
            if (cVar4 != null) {
                zl2.r4.f555483a.l3(x5Var3.f101142a, cVar4, false);
            }
            kn0.i iVar = ((mm2.e1) x5Var3.c(mm2.e1.class)).f410523t;
            if (iVar != null && (E = x5Var3.E()) != null) {
                hn0.h.f(E, iVar, false, false, 4, null);
            }
            x5Var3.t();
            x5Var3.w((r45.wz1) hc1Var.m75936x14adae67(4));
            zl2.r4 r4Var2 = zl2.r4.f555483a;
            if (!r4Var2.V1(x5Var3.f101142a) && !r4Var2.j2(x5Var3.f101142a) && (cVar = x5Var3.f101139c) != null) {
                r4Var2.E2(x5Var3.f101142a, cVar);
            }
            fm2.c cVar5 = x5Var3.f101139c;
            if (cVar5 != null) {
                r45.nw1 nw1Var3 = (r45.nw1) hc1Var.m75936x14adae67(3);
                cVar5.m57731xf11e93b(nw1Var3 != null ? (r45.jy1) nw1Var3.m75936x14adae67(25) : null);
            }
            fm2.c cVar6 = this.f510383a.f101139c;
            if (cVar6 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57627xbbf42674(cVar6, false, 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}

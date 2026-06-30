package um2;

/* loaded from: classes3.dex */
public final class z5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.b6 f510647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f510648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(um2.b6 b6Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        super(0);
        this.f510647d = b6Var;
        this.f510648e = c19792x256d2725;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.c cVar;
        ?? r57;
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        r45.nw1 m76794xd0557130;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e;
        um2.b6 b6Var = this.f510647d;
        long j17 = ((mm2.e1) b6Var.c(mm2.e1.class)).f410516m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localId:");
        sb6.append(j17);
        sb6.append(" fetchId:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f510648e;
        sb6.append(c19792x256d2725.m76784x5db1b11());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = b6Var.f510264f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (j17 != 0 && c19792x256d2725.m76784x5db1b11() == j17 && (cVar = b6Var.f101139c) != null) {
            ((mm2.c1) b6Var.c(mm2.c1.class)).a9(c19792x256d2725);
            mm2.e1 e1Var = (mm2.e1) b6Var.c(mm2.e1.class);
            java.lang.String m76829x97edf6c0 = c19792x256d2725.m76829x97edf6c0();
            if (m76829x97edf6c0 == null) {
                m76829x97edf6c0 = "";
            }
            e1Var.f410526w = m76829x97edf6c0;
            r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
            if (m76794xd05571302 != null) {
                ((mm2.e1) b6Var.c(mm2.e1.class)).m7(m76794xd05571302);
                r45.rp1 rp1Var = (r45.rp1) m76794xd05571302.m75936x14adae67(45);
                if (rp1Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u3.f184124a.a((mm2.c1) b6Var.c(mm2.c1.class), "handleOnGetFeedObject", rp1Var);
                }
                r45.ma4 ma4Var = (r45.ma4) m76794xd05571302.m75936x14adae67(23);
                if (ma4Var != null) {
                    ((mm2.e1) b6Var.c(mm2.e1.class)).f410520q = ma4Var;
                }
                km2.m mVar = b6Var.f101140d;
                com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e2 = mVar != null ? mVar.f390662d : null;
                if (c10828x8f239b6e2 != null) {
                    c10828x8f239b6e2.f150070e = m76794xd05571302.m75942xfb822ef2(0);
                }
                km2.m mVar2 = b6Var.f101140d;
                if ((mVar2 == null || (c10828x8f239b6e = mVar2.f390662d) == null || !c10828x8f239b6e.H) ? false : true) {
                    mm2.c1 c1Var = (mm2.c1) b6Var.c(mm2.c1.class);
                    km2.m mVar3 = b6Var.f101140d;
                    c1Var.f410360j5 = mVar3 != null ? mVar3.f390666h : null;
                }
                km2.m mVar4 = b6Var.f101140d;
                com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e3 = mVar4 != null ? mVar4.f390662d : null;
                if (c10828x8f239b6e3 != null) {
                    c10828x8f239b6e3.H = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reset staticConfig forceFetchObject!");
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) b6Var.c(mm2.c1.class)).f410379n;
            if ((c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null || m76794xd0557130.m75939xb282bd08(17) != 1) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57621xc099750c(cVar, ((mm2.c1) b6Var.c(mm2.c1.class)).f410385o, false, 2, null);
            }
            fm2.c cVar2 = b6Var.f101139c;
            if (cVar2 == null || (m57663xfb7e5820 = cVar2.m57663xfb7e5820()) == null || (c14197x319b1b9e = m57663xfb7e5820.f390664f) == null) {
                r57 = 0;
            } else {
                r57 = 0;
                dk2.ef.h(dk2.ef.f314905a, b6Var.f101142a, c14197x319b1b9e, cVar, 0, b6Var.f101141e, 8, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a, "RV_VISITOR_" + ((mm2.e1) b6Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(r57), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184104q.f184073b, null, false, false, false, 60, null);
            cVar.m57769x918cb44a();
            cVar.m57766x113b9069();
            fm2.c cVar3 = b6Var.f101139c;
            if (cVar3 != 0) {
                cVar3.m129746xe466bfa0(r57);
            }
        }
        return jz5.f0.f384359a;
    }
}

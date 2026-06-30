package qf2;

/* loaded from: classes10.dex */
public final class y1 extends if2.b implements mf2.c {

    /* renamed from: m */
    public jz5.l f444190m;

    /* renamed from: n */
    public p3325xe03a0797.p3326xc267989b.r2 f444191n;

    /* renamed from: o */
    public final jz5.g f444192o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f444192o = jz5.h.b(new qf2.k1(this));
    }

    public static final boolean Z6(qf2.y1 y1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar;
        java.util.List list = ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
        if (!pm0.v.F(list)) {
            return true;
        }
        if (((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z != null && (naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class)) != null) {
            naVar.B1();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "[BattleTemplateInfo] checkAnchorPkMicing skip. anchorPkMicUserList is empty, curBattle = " + ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z);
        return false;
    }

    public static final void a7(qf2.y1 y1Var, java.lang.String str, r45.im1 im1Var, r45.gd2 gd2Var) {
        y1Var.getClass();
        if (gd2Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpTempInfo source: ");
            sb6.append(str);
            sb6.append(" seq: ");
            sb6.append(gd2Var.m75939xb282bd08(3));
            sb6.append(" svTime: ");
            sb6.append(gd2Var.m75942xfb822ef2(4));
            sb6.append(" battleId: ");
            sb6.append(im1Var.m75945x2fec8307(0));
            sb6.append(" lastId: ");
            dk2.u4 u4Var = ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z;
            sb6.append(u4Var != null ? u4Var.f315687a : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", sb6.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(qf2.y1 r19, dk2.m r20, int r21, boolean r22, yz5.l r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.y1.b7(qf2.y1, dk2.m, int, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r5, r11 != null ? r11.f315687a : null) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c7(qf2.y1 r30, mm2.o4 r31, r45.im1 r32, jz5.l r33) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.y1.c7(qf2.y1, mm2.o4, r45.im1, jz5.l):void");
    }

    public static final void d7(qf2.y1 y1Var, java.lang.String str) {
        dk2.u4 u4Var = ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recoverToNormalMode: ");
        sb6.append(str);
        sb6.append(" finishPublicityJob: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = y1Var.f444191n;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        sb6.append(" curBattle: ");
        sb6.append(u4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", sb6.toString());
        if (u4Var == null) {
            return;
        }
        pm0.v.X(new qf2.x1(y1Var, str));
    }

    public static void f7(qf2.y1 y1Var, yz5.l lVar, int i17, java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
        yz5.l lVar2 = (i17 & 1) != 0 ? null : lVar;
        dk2.u4 u4Var = ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z;
        km2.c cVar = ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).W;
        if (u4Var != null && cVar != null) {
            r2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(y1Var, null, null, new qf2.b1(u4Var, cVar, y1Var, lVar2, null), 3, null);
        }
        if (r2Var == null) {
            db5.t7.g(y1Var.O6(), y1Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6k));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
            if (naVar != null) {
                naVar.y1();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class);
            if (x7Var != null) {
                x7Var.H1(2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewAcceptBattle fail, curBattle: " + ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z + " curAnchorMicPkData: " + ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).W);
        }
    }

    public static /* synthetic */ void h7(qf2.y1 y1Var, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        y1Var.g7(z17, lVar);
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        r45.im1 im1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        jz5.l lVar = this.f444190m;
        if (lVar == null || (im1Var = (r45.im1) lVar.f384366d) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "onMicInfoChanged onBattleStart use tempBattleInfoPair, state: " + im1Var.m75939xb282bd08(2));
        if (im1Var.m75939xb282bd08(2) == 10) {
            n7((mm2.o4) m56788xbba4bfc0(mm2.o4.class), im1Var, lVar);
        }
    }

    public final void e7(dk2.m battleData, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        km2.c cVar = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).W;
        if (cVar != null) {
            ((mm2.y2) m56788xbba4bfc0(mm2.y2.class)).f411101u = battleData;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.y0(battleData, cVar, this, lVar, null), 3, null);
        } else {
            db5.t7.g(O6(), O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6m));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewApplyBattle fail , pk data is null");
        }
    }

    public final void g7(boolean z17, yz5.l lVar) {
        dk2.u4 u4Var = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).Z;
        km2.c cVar = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).W;
        if (((u4Var == null || cVar == null) ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.e1(u4Var, cVar, this, z17, lVar, null), 3, null)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewCloseBattle fail, curBattle: " + ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).Z + " curAnchorMicPkData: " + ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).W);
        }
    }

    public final void i7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "cancelPublicityJob: " + str + " finishPublicityJob: " + this.f444191n);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f444191n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f444191n = null;
    }

    public final void k7(dk2.u4 u4Var, java.lang.String source) {
        tn0.w0 Q6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (u4Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "checkOnMicModeSelectChanged battleScope: " + u4Var.f315699m + " source: " + source);
        if (zl2.r4.f555483a.x1() && (Q6 = Q6()) != null) {
            int i17 = u4Var.f315699m;
            boolean z17 = false;
            if (i17 == 0) {
                int i18 = u4Var.f315701o == 1 ? 8 : 1;
                zn0.a0 U = Q6.U();
                if (U != null && U.f555849t == i18) {
                    z17 = true;
                }
                if (z17) {
                    return;
                }
                Q6.i0(i18, "");
                return;
            }
            if (i17 != 3) {
                return;
            }
            zn0.a0 U2 = Q6.U();
            if (U2 != null && U2.f555849t == 7) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            Q6.i0(7, "");
        }
    }

    public final void l7() {
        tn0.w0 Q6;
        dk2.u4 u4Var;
        if (!zl2.r4.f555483a.x1() || (Q6 = Q6()) == null || (u4Var = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).Z) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "checkResetToNormalMode battleData: " + u4Var);
        if (u4Var.f315699m == 0) {
            zn0.a0 U = Q6.U();
            boolean z17 = false;
            if (U != null && U.f555849t == 1) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            Q6.i0(1, "");
        }
    }

    public final void m7(dk2.u4 u4Var) {
        df2.wy wyVar = (df2.wy) m56789x25fe639c(df2.wy.class);
        if (wyVar != null && !wyVar.f313277u) {
            wyVar.b7(u4Var);
        }
        pm0.v.X(new qf2.t1(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0176, code lost:
    
        if (((r3 != null ? r3.f315689c : 0) - r36.m75939xb282bd08(3)) >= 3) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r4, r15 != null ? r15.f315687a : null) == false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(mm2.o4 r35, r45.im1 r36, jz5.l r37) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.y1.n7(mm2.o4, r45.im1, jz5.l):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new qf2.w1(this, null), 3, null);
    }
}

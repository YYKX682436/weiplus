package df2;

/* loaded from: classes3.dex */
public final class k5 extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(kn0.r rVar, int i17) {
        boolean z17;
        r45.nw1 nw1Var;
        hn0.r rVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayerController", "switchStream selectQualityCfg: " + i17);
        if (rVar != null) {
            co0.s u07 = dk2.ef.f314905a.u0();
            if (u07 == null || (rVar2 = u07.R1) == null) {
                z17 = false;
            } else {
                je2.z zVar = (je2.z) m56788xbba4bfc0(je2.z.class);
                z17 = rVar2.e(i17, rVar, 0, zVar != null ? zVar.P6() : null);
            }
            if (z17) {
                be2.j Rj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Rj();
                mm2.e1 e1Var = (mm2.e1) m56788xbba4bfc0(mm2.e1.class);
                Rj.D0((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0), rVar.f391130b);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        r45.ty4 ty4Var;
        r45.bh5 bh5Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        hn0.r rVar;
        kn0.g gVar;
        r45.ka4 ka4Var;
        r45.ah5 ah5Var;
        if (zl2.r4.f555483a.x1() || r71Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayerController", "checkPlayInfoControl isLivePlayInfoControlEnable: " + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).L3 + " on_quality_change_info: " + ((r45.ty4) r71Var.m75936x14adae67(35)));
        if (!((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).L3 || (ty4Var = (r45.ty4) r71Var.m75936x14adae67(35)) == null) {
            return;
        }
        int m75942xfb822ef2 = (int) ty4Var.m75942xfb822ef2(0);
        if (m75942xfb822ef2 != 1) {
            if (m75942xfb822ef2 != 2) {
                return;
            }
            r45.nw1 nw1Var = (r45.nw1) r71Var.m75936x14adae67(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSdkInfoData liveInfo: ");
            sb6.append(nw1Var);
            sb6.append(" sdkInfo: ");
            sb6.append(nw1Var != null ? (r45.ma4) nw1Var.m75936x14adae67(23) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayerController", sb6.toString());
            r45.ma4 ma4Var = nw1Var != null ? (r45.ma4) nw1Var.m75936x14adae67(23) : null;
            if (nw1Var == null || ma4Var == 0) {
                return;
            }
            um2.m.f510406a.e(getStore().getLiveRoomData(), "FinderLiveVisitorPlayerController", N6(), nw1Var, ma4Var);
            return;
        }
        int m75939xb282bd08 = ty4Var.m75939xb282bd08(2);
        r45.ah5 ah5Var2 = (r45.ah5) ty4Var.m75936x14adae67(1);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateLocalQualityTagInfo selectQualityCfg: ");
        sb7.append(m75939xb282bd08);
        sb7.append(" \nlastQualityInfo: ");
        kn0.i iVar = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410523t;
        sb7.append((iVar == null || (gVar = iVar.f391091b) == null || (ka4Var = gVar.f391081o) == null || (ah5Var = ka4Var.f460078p1) == null) ? null : dk2.nc.f315350a.a(ah5Var));
        sb7.append(" \nnewQualityInfo: ");
        sb7.append(ah5Var2 != null ? dk2.nc.f315350a.a(ah5Var2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayerController", sb7.toString());
        tn0.w0 w0Var = dk2.ef.f314911d;
        boolean z17 = w0Var instanceof co0.s;
        co0.s sVar = z17 ? (co0.s) w0Var : null;
        co0.s sVar2 = z17 ? (co0.s) w0Var : null;
        kn0.g gVar2 = (sVar2 == null || (rVar = sVar2.R1) == null) ? null : rVar.f363943b;
        if (sVar == null || gVar2 == null) {
            return;
        }
        gVar2.f391081o.f460078p1 = ah5Var2;
        ko0.t tVar = ko0.t.f391436a;
        hn0.r rVar2 = sVar.R1;
        mn0.b0 b0Var = rVar2.f363942a;
        java.lang.String d17 = tVar.d(b0Var != null ? ((mn0.y) b0Var).f411348q : null);
        if (d17 == null) {
            d17 = "";
        }
        long m75942xfb822ef22 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        cl0.g gVar3 = new cl0.g();
        int i17 = rVar2.f363946e;
        java.util.Set keySet = gVar2.f391077k.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        int b07 = kz5.n0.b0(keySet, java.lang.Integer.valueOf(i17));
        if (ah5Var2 == null || (linkedList2 = ah5Var2.f451546d) == null) {
            bh5Var = null;
        } else {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.bh5) obj).f452300d == b07) {
                        break;
                    }
                }
            }
            bh5Var = (r45.bh5) obj;
        }
        gVar3.s("liveId", java.lang.Long.valueOf(m75942xfb822ef22));
        gVar3.s("lastStreamId", d17);
        gVar3.s("lastCdnQuality", java.lang.Integer.valueOf(i17));
        gVar3.s("currentQualityDelete", java.lang.Boolean.valueOf(bh5Var == null));
        gVar3.s("targetCdnQuality", java.lang.Integer.valueOf(m75939xb282bd08));
        if (bh5Var != null) {
            if (bh5Var.f452301e == 1) {
                pm0.z.b(xy2.b.f539688b, "livePlayError_autoSwitchStream", false, null, null, false, false, new df2.j5(gVar3), 60, null);
                Z6(gVar2.g(i17), i17);
                return;
            }
            return;
        }
        kn0.r g17 = gVar2.g(m75939xb282bd08);
        java.util.Set keySet2 = gVar2.f391077k.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet2, "<get-keys>(...)");
        int b08 = kz5.n0.b0(keySet2, java.lang.Integer.valueOf(m75939xb282bd08));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("updateLocalQualityTagInfo use targetIndex: ");
        sb8.append(b08);
        sb8.append(" lastQualityInfo: ");
        r45.ah5 ah5Var3 = gVar2.f391081o.f460078p1;
        sb8.append(ah5Var3 != null ? dk2.nc.f315350a.a(ah5Var3) : null);
        sb8.append(" targetLiveUrlInfo: ");
        sb8.append(g17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayerController", sb8.toString());
        if (ah5Var2 != null && (linkedList = ah5Var2.f451546d) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.bh5) next).f452300d == b08) {
                    r8 = next;
                    break;
                }
            }
            r8 = (r45.bh5) r8;
        }
        boolean z18 = r8 != null;
        if (z18 && g17 != null) {
            pm0.z.b(xy2.b.f539688b, "livePlayError_autoSwitchStream", false, null, null, false, false, new df2.i5(gVar3), 60, null);
            Z6(g17, m75939xb282bd08);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorPlayerController", "updateLocalQualityTagInfo return, isTargetQualityExit: " + z18 + " targetLiveUrlInfo: " + g17);
    }
}

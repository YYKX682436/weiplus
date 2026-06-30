package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class wx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx f201778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io f201780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f201781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super(1);
        this.f201778d = yxVar;
        this.f201779e = i17;
        this.f201780f = ioVar;
        this.f201781g = c1163xf1deaba4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        hn0.r rVar;
        kn0.g gVar;
        hn0.r rVar2;
        kn0.g gVar2;
        r45.nw1 nw1Var;
        r45.q82 q82Var;
        r45.nw1 nw1Var2;
        hn0.r rVar3;
        r45.nw1 nw1Var3;
        bm2.b2 definitionInfo = (bm2.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(definitionInfo, "definitionInfo");
        java.util.HashMap hashMap = dk2.nc.f315352c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = this.f201778d;
        gk2.e eVar = yxVar.f202014c;
        long j17 = 0;
        hashMap.put(java.lang.Long.valueOf((eVar == null || (nw1Var3 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var3.m75942xfb822ef2(0)), 1);
        kn0.r rVar4 = definitionInfo.f103319b;
        int i17 = rVar4.f391130b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("sub_element", i17);
        jSONObject.put("sub_type", this.f201779e);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        dk2.ef efVar = dk2.ef.f314905a;
        co0.s u07 = efVar.u0();
        r45.gv gvVar = null;
        if (u07 == null || (rVar3 = u07.R1) == null) {
            z17 = false;
        } else {
            gk2.e eVar2 = yxVar.f202014c;
            z17 = rVar3.e(definitionInfo.f103318a, rVar4, definitionInfo.f103320c, eVar2 != null ? ((je2.z) eVar2.a(je2.z.class)).P6() : null);
        }
        yxVar.f202016e = z17;
        if (z17) {
            this.f201780f.q();
            be2.j Rj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Rj();
            gk2.e eVar3 = yxVar.f202014c;
            if (eVar3 != null && (nw1Var2 = ((mm2.e1) eVar3.a(mm2.e1.class)).f410521r) != null) {
                j17 = nw1Var2.m75942xfb822ef2(0);
            }
            Rj.D0(j17, rVar4.f391130b);
            if (((java.lang.Boolean) ((jz5.n) yxVar.f202013b).mo141623x754a37bb()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", "modifyVideoDefinition uiStyleNew!");
            } else {
                db5.t7.f(this.f201781g.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egt), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vx.f201641a);
            }
            gk2.e eVar4 = yxVar.f202014c;
            boolean z18 = (eVar4 == null || (nw1Var = ((mm2.e1) eVar4.a(mm2.e1.class)).f410521r) == null || (q82Var = (r45.q82) nw1Var.m75936x14adae67(9)) == null || q82Var.m75939xb282bd08(3) != 1) ? false : true;
            co0.s u08 = efVar.u0();
            boolean z19 = (u08 == null || (rVar2 = u08.R1) == null || (gVar2 = rVar2.f363943b) == null) ? false : gVar2.f391085s;
            co0.s u09 = efVar.u0();
            if (u09 != null && (rVar = u09.R1) != null && (gVar = rVar.f363943b) != null) {
                int i18 = rVar4.f391130b;
                java.util.LinkedList cdn_trans_info = gVar.f391081o.f460073m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdn_trans_info, "cdn_trans_info");
                java.util.Iterator it = cdn_trans_info.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((r45.gv) next).f457075m == i18) {
                        gvVar = next;
                        break;
                    }
                }
                gvVar = gvVar;
            }
            boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i19 = gvVar != null ? gvVar.f457075m : 0;
            boolean z27 = rVar4.f391130b == 5;
            int i27 = gvVar != null ? gvVar.f457080r : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", "isOnWifi:" + m40093xb9aa8b5f + ", is_p2p:" + i27 + ", isBanP2PResolution:" + z18 + ", isUltraHd:" + z27 + ", videoQualityLevel:" + i19);
            ?? r17 = (!m40093xb9aa8b5f || i27 == 0 || z18 || !(z19 || z27)) ? 0 : 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", "p2p enable=" + ((boolean) r17));
            r45.ll1 ll1Var = new r45.ll1();
            ll1Var.set(1, db2.t4.f309704a.a(8652));
            ll1Var.set(2, 1);
            java.util.LinkedList m75941xfb821914 = ll1Var.m75941xfb821914(3);
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 2);
            r45.ol1 ol1Var = new r45.ol1();
            ol1Var.set(0, java.lang.Integer.valueOf((int) r17));
            ol1Var.set(1, java.lang.Integer.valueOf(c01.id.e()));
            hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ol1Var.mo14344x5f01b1f6()));
            m75941xfb821914.add(hx0Var);
            pq5.g l17 = ll1Var.d().l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
            pm0.v.T(l17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tx.f201448d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVideoDefinitionWidget", "modifyVideoDefinition failed!");
        }
        return jz5.f0.f384359a;
    }
}

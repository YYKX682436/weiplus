package j00;

@j95.b
/* loaded from: classes9.dex */
public final class d2 extends i95.w implements c00.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f378279d = jz5.h.b(j00.y1.f378483d);

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f378280e;

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
    
        if (r11 == null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bw5.x7 Ai(long r10, int r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.d2.Ai(long, int):bw5.x7");
    }

    public boolean Bi(boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(d17, true);
        boolean o27 = n17 != null ? n17.o2() : true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: check send gift start. talkerUsername: ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", sb6.toString());
        if (mo168058x74219ae7 || o27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: is teen mode? " + mo168058x74219ae7 + " isBlacklistContact " + o27);
            return false;
        }
        if (z3Var != null && !z3Var.r2() && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: is open im chatroom");
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(z3Var != null ? z3Var.d1() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isBottleContact");
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(z3Var != null ? z3Var.d1() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isQQContact");
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(z3Var != null ? z3Var.d1() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isTContact");
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(z3Var != null ? z3Var.d1() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isTextStatusSession");
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(z3Var != null ? z3Var.d1() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isFinderSession");
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.e4(z3Var != null ? z3Var.d1() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isMediaNoteHelper");
            return false;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(z3Var != null ? z3Var.d1() : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isSPUserWeixin");
            return false;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var != null ? z3Var.d1() : null)) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var != null ? z3Var.d1() : null)) {
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(z3Var != null ? z3Var.d1() : null)) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(z3Var != null ? z3Var.d1() : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isFileHelper");
                        return false;
                    }
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(z3Var != null ? z3Var.d1() : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isChatBot");
                        return false;
                    }
                    if (z3Var != null && z3Var.k2()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isBizContact");
                        return false;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), z3Var != null ? z3Var.d1() : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: is self");
                        return false;
                    }
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(z3Var != null ? z3Var.d1() : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isAppBrandContact");
                        return false;
                    }
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(z3Var != null ? z3Var.d1() : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isGameLifeSession");
                        return false;
                    }
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.d4(z3Var != null ? z3Var.d1() : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: isMassSendHelper");
                        return false;
                    }
                    if (!(wi(z17) != null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: no entrance from svr");
                        return false;
                    }
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(z3Var != null ? z3Var.d1() : null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "isBizFansSession");
                        return false;
                    }
                    if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(z3Var != null ? z3Var.d1() : null)) {
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "isBizPhotoFansSession");
                    return false;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: openIm");
        return false;
    }

    public void Di(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "notify send thanks result: " + z17);
        yz5.l lVar = this.f378280e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        this.f378280e = null;
    }

    public void Ni(android.content.Context context, java.lang.String paramsBytesString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsBytesString, "paramsBytesString");
        j00.y yVar = j00.y.f378479a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsGiftFlutterMgr", "open lottery page on main process");
            p3325xe03a0797.p3326xc267989b.l.d(j00.y.f378480b, null, null, new j00.t(paramsBytesString, context, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsGiftFlutterMgr", "open lottery page on sub process");
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(paramsBytesString), j00.q.class, j00.s.f378416d);
        }
    }

    public void Ri(android.content.Context context, long j17, java.lang.String finderUsername, byte[] giftItemData, c00.l3 callback) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftItemData, "giftItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        j00.e0 e0Var = (j00.e0) ((j00.z3) i95.n0.c(j00.z3.class));
        e0Var.getClass();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String valueOf = java.lang.String.valueOf(e0Var.f378287d.incrementAndGet());
            bw5.hm mo11468x92b714fd = new bw5.hm().mo11468x92b714fd(giftItemData);
            j00.g0 g0Var = e0Var.f378289f;
            bw5.gm b17 = mo11468x92b714fd.b();
            java.lang.String str = b17.f109450s[12] ? b17.f109449r : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getGiftId(...)");
            g0Var.a(valueOf, j17, finderUsername, str);
            jz5.l[] lVarArr = new jz5.l[7];
            lVarArr[0] = new jz5.l("finder_username", finderUsername);
            lVarArr[1] = new jz5.l("object_id", java.lang.Long.valueOf(j17));
            lVarArr[2] = new jz5.l("setting_flag", java.lang.Long.valueOf(mo11468x92b714fd.b().f109447p));
            lVarArr[3] = new jz5.l("panel_item_id", java.lang.Integer.valueOf(mo11468x92b714fd.f109800d));
            bw5.gm b18 = mo11468x92b714fd.b();
            lVarArr[4] = new jz5.l("last_gift_id", b18.f109450s[12] ? b18.f109449r : "");
            lVarArr[5] = new jz5.l("attend_duration", java.lang.Integer.valueOf(mo11468x92b714fd.b().f109442h));
            jz5.l[] lVarArr2 = new jz5.l[2];
            bw5.gm b19 = mo11468x92b714fd.b();
            lVarArr2[0] = new jz5.l("attend_type", java.lang.Integer.valueOf((b19.f109450s[11] ? b19.f109448q : new bw5.ao()).f106814d));
            bw5.gm b27 = mo11468x92b714fd.b();
            bw5.ao aoVar = b27.f109450s[11] ? b27.f109448q : new bw5.ao();
            lVarArr2[1] = new jz5.l("attend_wording", aoVar.f106820m[2] ? aoVar.f106815e : "");
            lVarArr[6] = new jz5.l("attend_info", kz5.c1.k(lVarArr2));
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(lVarArr)).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            jz5.l[] lVarArr3 = new jz5.l[4];
            lVarArr3[0] = new jz5.l("seqId", valueOf);
            bw5.gm b28 = mo11468x92b714fd.b();
            lVarArr3[1] = new jz5.l("presentOrderId", b28.f109450s[12] ? b28.f109449r : "");
            lVarArr3[2] = new jz5.l("finderUsername", finderUsername);
            lVarArr3[3] = new jz5.l("finderPresentInfoJson", jSONObject);
            java.util.Map k17 = kz5.c1.k(lVarArr3);
            e0Var.f378288e.put(valueOf, callback);
            j00.y yVar = j00.y.f378479a;
            p3325xe03a0797.p3326xc267989b.l.d(j00.y.f378480b, null, null, new j00.w(kz5.c1.t(k17), context, null), 3, null);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Ecs.Gift.Live.EcsGiftInLiveMgr", m143898xd4a2fc34, "Failed to resend gift in live", new java.lang.Object[0]);
        }
    }

    public void Ui(android.content.Context activityContext, java.lang.String orderId, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orderId, "orderId");
        if (orderId.length() == 0) {
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        } else {
            this.f378280e = lVar;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("order_id", orderId);
            j45.l.j(activityContext, "gift", "com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI", intent, null);
        }
    }

    public boolean Vi(boolean z17) {
        bw5.s8 c17;
        bw5.s8 c18;
        int intValue;
        bw5.s8 b17;
        bw5.t8 b18 = n00.g.f415354a.b();
        boolean z18 = !z17 ? (c17 = b18.c()) == null || c17.f114385p != 2 : (b17 = b18.b()) == null || b17.f114385p != 2;
        n00.g gVar = n00.g.f415354a;
        gVar.getClass();
        boolean booleanValue = z17 ? ((java.lang.Boolean) n00.g.f415361h.b(gVar, n00.g.f415355b[5])).booleanValue() : ((java.lang.Boolean) n00.g.f415360g.b(gVar, n00.g.f415355b[4])).booleanValue();
        bw5.t8 b19 = n00.g.f415354a.b();
        int i17 = (!z17 ? (c18 = b19.c()) != null : (c18 = b19.b()) != null) ? 0 : c18.f114387r;
        if (z17) {
            n00.g gVar2 = n00.g.f415354a;
            gVar2.getClass();
            intValue = ((java.lang.Number) n00.g.f415363j.b(gVar2, n00.g.f415355b[7])).intValue();
        } else {
            n00.g gVar3 = n00.g.f415354a;
            gVar3.getClass();
            intValue = ((java.lang.Number) n00.g.f415362i.b(gVar3, n00.g.f415355b[6])).intValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: panel reddot isStrategyShowReddot " + z18 + " hasClickedLegacy " + booleanValue + " requestClickVersion " + i17 + " lastClickVersion " + intValue);
        if (z18) {
            return i17 <= 0 ? !booleanValue : i17 > intValue;
        }
        return false;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "hy: ecs gift service on create!");
    }

    public final bw5.x7 wi(boolean z17) {
        bw5.s8 b17 = z17 ? n00.g.f415354a.b().b() : n00.g.f415354a.b().c();
        if (b17 != null) {
            if (b17.b() != null) {
                if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsHardcodeChattingGiftJump", 0) == 1) {
                    b17.b().j(new java.util.LinkedList(kz5.b0.c("native")));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "mango: hard code jump native");
                } else {
                    if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsHardcodeChattingGiftJump", 0) == 2) {
                        b17.b().j(new java.util.LinkedList(kz5.b0.c("wxa")));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "mango: hard code jump wxa");
                    } else {
                        if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsHardcodeChattingGiftJump", 0) == 3) {
                            bw5.x7 b18 = b17.b();
                            bw5.s7 s7Var = new bw5.s7();
                            s7Var.f114358d = "MagicEcsNirvanaGift";
                            boolean[] zArr = s7Var.f114372u;
                            zArr[1] = true;
                            s7Var.f114359e = 0;
                            zArr[2] = true;
                            s7Var.f114360f = 0;
                            zArr[3] = true;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("routeName", "ecs_send_gift");
                            s7Var.e(jSONObject.toString());
                            s7Var.f114362h = 2;
                            zArr[5] = true;
                            s7Var.f114365n = false;
                            zArr[8] = true;
                            s7Var.f114370s = true;
                            zArr[13] = true;
                            s7Var.f114371t = 500;
                            zArr[14] = true;
                            s7Var.f114368q = 0;
                            zArr[11] = true;
                            s7Var.f114363i = true;
                            zArr[6] = true;
                            b18.f116515p = s7Var;
                            b18.f116517r[10] = true;
                            b17.b().j(new java.util.LinkedList(kz5.b0.c("mbapp")));
                        }
                    }
                }
            }
            bw5.x7 b19 = b17.b();
            if (b19 != null) {
                if (b17.f114376d == 2) {
                    return b19;
                }
            }
        }
        return null;
    }
}

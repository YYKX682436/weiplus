package ek2;

/* loaded from: classes3.dex */
public final class i2 extends ek2.g0 {
    public final ek2.h2 A;
    public final org.json.JSONObject B;
    public final r45.g82 C;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f334999u;

    /* renamed from: v, reason: collision with root package name */
    public final int f335000v;

    /* renamed from: w, reason: collision with root package name */
    public final int f335001w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f335002x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f335003y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f335004z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(long j17, long j18, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, java.lang.String sendGiftTargetUserName, r45.qt2 qt2Var, java.lang.String str5, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, byte[] bArr, java.lang.Integer num, java.util.List prepareRewardSendInfo, java.lang.String str6, java.lang.String str7, ek2.h2 h2Var) {
        super(null, 1, null);
        boolean z17;
        r45.yi6 Q0;
        gk2.e eVar;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        r45.a84 a84Var;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa> m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendGiftTargetUserName, "sendGiftTargetUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareRewardSendInfo, "prepareRewardSendInfo");
        this.f334999u = str;
        this.f335000v = i17;
        this.f335001w = i19;
        this.f335002x = prepareRewardSendInfo;
        this.f335003y = str6;
        this.f335004z = str7;
        this.A = h2Var;
        this.B = new org.json.JSONObject();
        r45.g82 g82Var = new r45.g82();
        this.C = g82Var;
        int i27 = i18 * i17;
        g82Var.set(1, db2.t4.f309704a.b(5891, qt2Var));
        if (num != null) {
            int intValue = num.intValue();
            r45.kv0 kv0Var = (r45.kv0) g82Var.m75936x14adae67(1);
            if (kv0Var != null) {
                kv0Var.set(6, java.lang.Integer.valueOf(intValue));
            }
        }
        g82Var.set(4, java.lang.Long.valueOf(j17));
        g82Var.set(3, java.lang.Long.valueOf(j18));
        g82Var.set(5, str);
        g82Var.set(6, java.lang.Integer.valueOf(i17));
        g82Var.set(7, java.lang.Integer.valueOf(i27));
        g82Var.set(2, str2);
        g82Var.set(8, str3);
        g82Var.set(9, str4);
        if (!(sendGiftTargetUserName.length() == 0) && (eVar = dk2.ef.I) != null && (f3Var = ((mm2.n0) eVar.a(mm2.n0.class)).f410804p) != null && (a84Var = (r45.a84) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb()) != null && (m75941xfb821914 = a84Var.m75941xfb821914(1)) != null && !m75941xfb821914.isEmpty()) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa : m75941xfb821914) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, sendGiftTargetUserName)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            this.C.set(21, sendGiftTargetUserName);
        } else {
            this.C.set(12, sendGiftTargetUserName);
        }
        this.C.set(13, str5);
        this.C.set(14, java.lang.Integer.valueOf(this.f335001w));
        this.C.set(15, gVar);
        this.C.set(18, this.f335003y);
        this.C.set(17, this.f335004z);
        this.C.set(10, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        java.util.LinkedList m75941xfb8219142 = this.C.m75941xfb821914(16);
        java.util.List list = this.f335002x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            r45.e82 e82Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0) obj).f194114b;
            if ((e82Var == null || e82Var.m75934xbce7f2f(1) == null) ? false : true) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.e82 e82Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0) it.next()).f194114b;
            arrayList2.add(e82Var2 != null ? e82Var2.m75934xbce7f2f(1) : null);
        }
        m75941xfb8219142.addAll(arrayList2);
        java.util.List list2 = this.f335002x;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            r45.e82 e82Var3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0) obj2).f194114b;
            if ((e82Var3 == null || e82Var3.m75941xfb821914(3) == null) ? false : true) {
                arrayList3.add(obj2);
            }
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0 fo0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fo0) it6.next();
            java.util.LinkedList m75941xfb8219143 = this.C.m75941xfb821914(20);
            r45.e82 e82Var4 = fo0Var.f194114b;
            java.util.List m75941xfb8219144 = e82Var4 != null ? e82Var4.m75941xfb821914(3) : null;
            if (m75941xfb8219144 == null) {
                m75941xfb8219144 = kz5.p0.f395529d;
            }
            m75941xfb8219143.addAll(m75941xfb8219144);
        }
        this.B.put("reward_product_id", this.C.m75945x2fec8307(5));
        this.B.put("reward_product_count", this.C.m75939xb282bd08(6));
        ce2.i e17 = dk2.u7.f315714a.e(this.f334999u);
        java.lang.String m75945x2fec8307 = (e17 == null || (Q0 = e17.Q0()) == null) ? null : Q0.m75945x2fec8307(0);
        this.C.set(19, m75945x2fec8307);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId:");
        sb6.append(j17);
        sb6.append(" objectId:");
        sb6.append(j18);
        sb6.append(" rewardProductId:");
        sb6.append(this.f334999u);
        sb6.append(" rewardProductCount:");
        sb6.append(this.f335000v);
        sb6.append(" fromUser:");
        sb6.append(str2);
        sb6.append(" toUser:");
        sb6.append(sendGiftTargetUserName);
        sb6.append(" isCoAuthor:");
        sb6.append(z17);
        sb6.append(" requestId:");
        sb6.append(str3);
        sb6.append(" wecoin:");
        sb6.append(i18);
        sb6.append(",amountPrice:");
        sb6.append(i27);
        sb6.append(", reward_type:");
        sb6.append(this.f335001w);
        sb6.append(",reward_ext_info:");
        sb6.append(gVar != null ? gVar.i() : null);
        sb6.append(",live_identity:");
        r45.kv0 kv0Var2 = (r45.kv0) this.C.m75936x14adae67(1);
        sb6.append(kv0Var2 != null ? java.lang.Integer.valueOf(kv0Var2.m75939xb282bd08(6)) : null);
        sb6.append(", pkgBatchId:");
        sb6.append(this.f335003y);
        sb6.append(", pkgDurationId:");
        sb6.append(this.f335004z);
        sb6.append(", skinId:");
        sb6.append(m75945x2fec8307);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveReward", sb6.toString());
        w04.l.INSTANCE.Ch(540999695, 7);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = this.C;
        r45.h82 h82Var = new r45.h82();
        h82Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h82Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = h82Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivereward";
        lVar.f152200d = 5891;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        int i27;
        dk2.f4 f4Var;
        r45.h82 resp = (r45.h82) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveReward", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.h2 h2Var = this.A;
        if (h2Var != null) {
            dk2.f4 f4Var2 = (dk2.f4) h2Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "doPostGift errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str + ", bill_no:" + resp.m75945x2fec8307(1));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a.d(f4Var2.f314967a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp jpVar = f4Var2.f314968b;
            if (i18 == 0 || i18 == -200042) {
                i19 = 3;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(2);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                java.lang.String str2 = f4Var2.f314972f;
                int i28 = f4Var2.f314973g;
                java.lang.String str3 = f4Var2.f314974h;
                dk2.b4 b4Var = new dk2.b4(jpVar, str2, i28, str3);
                dk2.d4 d4Var = new dk2.d4(jpVar, str2, i28, str3);
                dk2.e4 e4Var = new dk2.e4(jpVar, str2, i28, str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAssistant2", "[WeCoin] sessionID:" + f4Var2.f314969c + " consumeGift:" + g17 + " businessId:" + f4Var2.f314971e);
                android.content.Context context = f4Var2.f314970d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                pr4.l lVar = new pr4.l(1, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context, b4Var, d4Var, e4Var);
                if (g17 == null) {
                    g17 = new byte[0];
                }
                lVar.f439559g = g17;
                ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
                new ls4.u(lVar).f();
            } else {
                if (jpVar != null) {
                    i27 = 1;
                    f4Var = f4Var2;
                    i19 = 3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jp.b(jpVar, false, i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip.f194534e, null, null, 0, null, str, null, 272, null);
                } else {
                    i27 = 1;
                    f4Var = f4Var2;
                    i19 = 3;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(22129, java.lang.Integer.valueOf(i27), f4Var.f314969c, "", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), str);
                g0Var.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184272h, 80L);
            }
        } else {
            i19 = 3;
        }
        zl2.r4.f555483a.l1(i17, i18, (r45.qp1) resp.m75936x14adae67(i19), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
    }

    @Override // az2.j
    public java.util.List s() {
        return kz5.b0.c(new jz5.l("reward_type", java.lang.String.valueOf(this.C.m75939xb282bd08(14))));
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.B;
    }
}

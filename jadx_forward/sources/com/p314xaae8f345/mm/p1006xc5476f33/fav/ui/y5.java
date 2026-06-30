package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f183153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f183155f;

    public y5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var, android.content.Context context, java.lang.Runnable runnable) {
        this.f183153d = f6Var;
        this.f183154e = context;
        this.f183155f = runnable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00d2. Please report as an issue. */
    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it;
        long j17;
        o72.r2 r2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var;
        r45.xs4 xs4Var;
        r45.op0 op0Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y5 y5Var = this;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var2 = y5Var.f183153d;
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(f6Var2.f182381b.split(","));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavMsg: start, toUserCount=%d, itemCount=%d", java.lang.Integer.valueOf(P1.size()), java.lang.Integer.valueOf(((java.util.LinkedList) f6Var2.f182384e).size()));
        java.util.Iterator it6 = P1.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            java.util.Iterator it7 = f6Var2.f182384e.iterator();
            while (true) {
                int i17 = 0;
                if (it7.hasNext()) {
                    o72.r2 r2Var2 = (o72.r2) it7.next();
                    if (r2Var2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendLogic", "in run workerThread,want to send fav msg, but info is null,infos.size = %d", java.lang.Integer.valueOf(((java.util.LinkedList) f6Var2.f182384e).size()));
                    } else {
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = java.lang.Integer.valueOf(r2Var2.f67643xc8a07680);
                        objArr[1] = java.lang.Integer.valueOf(r2Var2.f67657x2262335f);
                        r45.bq0 bq0Var = r2Var2.f67640x5ab01132;
                        objArr[2] = java.lang.Integer.valueOf((bq0Var == null || (linkedList = bq0Var.f452497f) == null) ? 0 : linkedList.size());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavMsg: processing favId=%d, favType=%d, dataListSize=%d", objArr);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10925, java.lang.Integer.valueOf(r2Var2.f67657x2262335f), java.lang.Integer.valueOf(r2Var2.f67643xc8a07680));
                        int i18 = r2Var2.f67657x2262335f;
                        if (i18 != 1) {
                            if (i18 != 2) {
                                android.content.Context context = y5Var.f183154e;
                                if (i18 == 10) {
                                    it = it6;
                                    r45.aq0 aq0Var = r2Var2.f67640x5ab01132.f452513y;
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022 c5853x49a21022 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022();
                                    am.to toVar = c5853x49a21022.f136159g;
                                    toVar.f89558a = 0;
                                    toVar.f89560c = aq0Var.f451727m;
                                    toVar.f89559b = context;
                                    c5853x49a21022.e();
                                    am.uo uoVar = c5853x49a21022.f136160h;
                                    if (uoVar.f89651a) {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        sb6.append(o72.x1.I());
                                        java.lang.String str2 = aq0Var.f451725h;
                                        sb6.append(kk.k.g((str2 != null ? str2 : "").getBytes()));
                                        byte[] x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(sb6.toString());
                                        if (x17 == null) {
                                            x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(uoVar.f89653c);
                                        }
                                        ((dk5.s5) tg3.t1.a()).Ai(str, x17, uoVar.f89652b, null);
                                    }
                                } else if (i18 == 11) {
                                    it = it6;
                                    r45.aq0 aq0Var2 = r2Var2.f67640x5ab01132.f452513y;
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022 c5853x49a210222 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022();
                                    am.to toVar2 = c5853x49a210222.f136159g;
                                    toVar2.f89558a = 1;
                                    toVar2.f89560c = aq0Var2.f451727m;
                                    toVar2.f89559b = context;
                                    c5853x49a210222.e();
                                    am.uo uoVar2 = c5853x49a210222.f136160h;
                                    if (uoVar2.f89651a) {
                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                        sb7.append(o72.x1.I());
                                        java.lang.String str3 = aq0Var2.f451725h;
                                        sb7.append(kk.k.g((str3 != null ? str3 : "").getBytes()));
                                        byte[] x18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(sb7.toString());
                                        if (x18 == null) {
                                            x18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(uoVar2.f89653c);
                                        }
                                        ((dk5.s5) tg3.t1.a()).Ai(str, x18, uoVar2.f89652b, null);
                                    }
                                } else if (i18 != 24) {
                                    switch (i18) {
                                        case 4:
                                            it = it6;
                                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.b(context, str, o72.x1.J(r2Var2));
                                            break;
                                        case 5:
                                            r45.gp0 J2 = o72.x1.J(r2Var2);
                                            r45.bq0 bq0Var2 = r2Var2.f67640x5ab01132;
                                            r45.tq0 tq0Var = bq0Var2.f452501m;
                                            r45.jq0 jq0Var = bq0Var2.f452495d;
                                            ot0.q qVar = new ot0.q();
                                            if (tq0Var != null) {
                                                qVar.f430187f = tq0Var.f468197d;
                                                java.lang.String str4 = tq0Var.f468203m;
                                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && (str4 = J2.G) == null) {
                                                    str4 = "";
                                                }
                                                qVar.f430267z = str4;
                                            }
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430187f)) {
                                                qVar.f430187f = J2.f456937d;
                                            }
                                            if (tq0Var != null) {
                                                qVar.f430191g = tq0Var.f468199f;
                                            }
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430191g)) {
                                                qVar.f430191g = J2.f456941f;
                                            }
                                            r45.tq0 tq0Var2 = r2Var2.f67640x5ab01132.f452501m;
                                            if (tq0Var2 != null) {
                                                qVar.f430207k = tq0Var2.f468201h;
                                            }
                                            if (jq0Var != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430207k)) {
                                                qVar.f430207k = jq0Var.f459585y;
                                            }
                                            if (r2Var2.B1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430207k)) {
                                                qVar.f430207k = J2.A;
                                            }
                                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2.T1)) {
                                                qVar.C2 = J2.T1;
                                            }
                                            qVar.f430195h = "view";
                                            qVar.f430199i = 5;
                                            java.lang.String str5 = jq0Var.B;
                                            qVar.f430255w = str5;
                                            r45.qp0 qp0Var = r2Var2.f67640x5ab01132.K;
                                            if (qp0Var != null) {
                                                ot0.f fVar = new ot0.f();
                                                fVar.f429988b = qp0Var.f465695d;
                                                fVar.f429994h = qp0Var.f465709u;
                                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                                                    qVar.f430255w = qp0Var.f465702n;
                                                }
                                                if (qp0Var.f465695d == 5) {
                                                    fVar.f429996j = qp0Var.f465701m;
                                                    fVar.f429989c = qp0Var.f465699h;
                                                    fVar.f429990d = qp0Var.f465700i;
                                                    fVar.f429991e = qp0Var.f465697f;
                                                    fVar.f429992f = qp0Var.f465698g;
                                                }
                                                qVar.f(fVar);
                                            }
                                            if (tq0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var.f468211u)) {
                                                f6Var = f6Var2;
                                                it = it6;
                                            } else {
                                                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(tq0Var.f468211u, "websearch", null);
                                                su4.l2 l2Var = new su4.l2();
                                                l2Var.f494516b = (java.lang.String) d17.get(".websearch.relevant_vid");
                                                l2Var.f494517c = (java.lang.String) d17.get(".websearch.relevant_expand");
                                                l2Var.f494518d = (java.lang.String) d17.get(".websearch.relevant_pre_searchid");
                                                l2Var.f494519e = (java.lang.String) d17.get(".websearch.relevant_shared_openid");
                                                f6Var = f6Var2;
                                                l2Var.f494520f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".websearch.rec_category"), -1);
                                                l2Var.f494521g = (java.lang.String) d17.get(".websearch.shareUrl");
                                                l2Var.f494522h = (java.lang.String) d17.get(".websearch.shareTitle");
                                                l2Var.f494523i = (java.lang.String) d17.get(".websearch.shareDesc");
                                                l2Var.f494524j = (java.lang.String) d17.get(".websearch.shareImgUrl");
                                                l2Var.f494525k = (java.lang.String) d17.get(".websearch.shareString");
                                                l2Var.f494526l = (java.lang.String) d17.get(".websearch.shareStringUrl");
                                                l2Var.f494527m = (java.lang.String) d17.get(".websearch.source");
                                                l2Var.f494528n = (java.lang.String) d17.get(".websearch.sourceUrl");
                                                l2Var.f494529o = (java.lang.String) d17.get(".websearch.strPlayCount");
                                                l2Var.f494530p = (java.lang.String) d17.get(".websearch.titleUrl");
                                                l2Var.f494531q = (java.lang.String) d17.get(".websearch.extReqParams");
                                                l2Var.f494532r = (java.lang.String) d17.get(".websearch.tagList");
                                                it = it6;
                                                l2Var.f494533s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".websearch.channelId"), -1L);
                                                l2Var.f494534t = (java.lang.String) d17.get(".websearch.thumbUrl");
                                                l2Var.f494535u = (java.lang.String) d17.get(".websearch.shareTag");
                                                qVar.f(l2Var);
                                            }
                                            qVar.Y1 = J2.R1;
                                            byte[] x19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.X(J2));
                                            if (x19 == null) {
                                                java.lang.String str6 = tq0Var == null ? null : tq0Var.f468203m;
                                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                                                    java.lang.String str7 = J2.G;
                                                    str6 = str7 != null ? str7 : "";
                                                }
                                                x19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.I() + kk.k.g(str6.getBytes()));
                                            }
                                            byte[] bArr = x19;
                                            java.lang.String str8 = "fav_" + c01.z1.r() + "_" + r2Var2.f67643xc8a07680;
                                            java.lang.String a17 = c01.n2.a(str8);
                                            c01.l2 c17 = c01.n2.d().c(a17, true);
                                            c17.i("prePublishId", str8);
                                            c17.i("preUsername", r2Var2.f67642xd3939c3a);
                                            c17.i("sendAppMsgScene", 1);
                                            c17.i("adExtStr", J2.R1);
                                            ((dk5.s5) tg3.t1.a()).Bi(str, bArr, ot0.q.u(qVar, null, null), a17, "", tg3.l1.a(pt0.f0.V9(r2Var2.f67642xd3939c3a, J2.f456968s2)), "", false);
                                            y5Var = this;
                                            f6Var2 = f6Var;
                                            break;
                                        case 6:
                                            r45.pp0 pp0Var = r2Var2.f67640x5ab01132.f452499h;
                                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<msg><location x=\"");
                                            sb8.append(pp0Var.f464801f);
                                            sb8.append("\" y=\"");
                                            sb8.append(pp0Var.f464799d);
                                            sb8.append("\" scale=\"");
                                            sb8.append(pp0Var.f464803h);
                                            sb8.append("\" label=\"");
                                            java.lang.String str9 = pp0Var.f464805m;
                                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            sb8.append(str9);
                                            sb8.append("\" maptype=\"0\" poiname=\"");
                                            java.lang.String str10 = pp0Var.f464807o;
                                            sb8.append(str10 != null ? str10 : "");
                                            sb8.append("\" /></msg>");
                                            ((dk5.s5) tg3.t1.a()).fj(str, sb8.toString(), 48, 0);
                                            it = it6;
                                            break;
                                        case 7:
                                            r45.gp0 J3 = o72.x1.J(r2Var2);
                                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423();
                                            c11288x597a4423.f33185x324c710a = J3.A;
                                            c11288x597a4423.f33182xc58aab80 = J3.C;
                                            java.lang.String str11 = J3.E;
                                            c11288x597a4423.f33184xc6370d0b = str11;
                                            c11288x597a4423.f33183xead55f01 = str11;
                                            c11288x597a4423.f33186x239f8b5 = J3.f456954m2;
                                            c11288x597a4423.f33187x1478a44a = J3.f456958o2;
                                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
                                            c11286x34a5504.f33122xe4128443 = c11288x597a4423;
                                            c11286x34a5504.f33130x6942258 = J3.f456937d;
                                            c11286x34a5504.f33121x993583fc = J3.f456941f;
                                            byte[] x110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.X(J3));
                                            if (x110 == null) {
                                                java.lang.String str12 = J3.G;
                                                x110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.I() + kk.k.g((str12 != null ? str12 : "").getBytes()));
                                            }
                                            c11286x34a5504.f33128x4f3b3aa0 = x110;
                                            java.lang.String str13 = r2Var2.f67640x5ab01132.f452495d.f459583w;
                                            java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str13);
                                            ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
                                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.D(c11286x34a5504, str13, Zi, str, 3, null);
                                            it = it6;
                                            break;
                                        case 8:
                                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.c(str, r2Var2, o72.x1.J(r2Var2));
                                            it = it6;
                                            break;
                                        default:
                                            it = it6;
                                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x2.f183127a;
                                            switch (i18) {
                                                case 14:
                                                case 18:
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "want send record, fav id %d", java.lang.Integer.valueOf(r2Var2.f67643xc8a07680));
                                                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e6 a18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e6.a(context, r2Var2);
                                                    r45.bq0 bq0Var3 = new r45.bq0();
                                                    try {
                                                        bq0Var3.mo11468x92b714fd(r2Var2.f67640x5ab01132.mo14344x5f01b1f6());
                                                    } catch (java.lang.Exception e17) {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavSendLogic", e17, "", new java.lang.Object[0]);
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendLogic", "clone fav proto item error: %s", e17.getMessage());
                                                    }
                                                    java.util.LinkedList linkedList2 = bq0Var3.f452497f;
                                                    java.util.Iterator it8 = linkedList2.iterator();
                                                    while (it8.hasNext()) {
                                                        r45.gp0 gp0Var = (r45.gp0) it8.next();
                                                        r45.hp0 hp0Var = gp0Var.J1;
                                                        if (hp0Var != null) {
                                                            r45.dp0 dp0Var = hp0Var.f457901v;
                                                            if (dp0Var != null && com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b0.b(dp0Var)) {
                                                                gp0Var.h0(1);
                                                                gp0Var.m0(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572038wz));
                                                                linkedList2.set(i17, gp0Var);
                                                                bq0Var3.d(linkedList2);
                                                            }
                                                            r45.tq0 tq0Var3 = gp0Var.J1.f457888f;
                                                            if (tq0Var3 != null && o72.j3.a(tq0Var3)) {
                                                                gp0Var.h0(1);
                                                                gp0Var.m0(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572038wz));
                                                                linkedList2.set(i17, gp0Var);
                                                                bq0Var3.d(linkedList2);
                                                            }
                                                            if (gp0Var.I == 36 && (op0Var = gp0Var.J1.H) != null && op0Var.f463953t) {
                                                                gp0Var.h0(1);
                                                                gp0Var.m0(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572038wz));
                                                                linkedList2.set(i17, gp0Var);
                                                                bq0Var3.d(linkedList2);
                                                            }
                                                        }
                                                        i17++;
                                                    }
                                                    o72.n2 n2Var = o72.n2.f424951a;
                                                    int i19 = r2Var2.f67657x2262335f;
                                                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a c6442x3ed73e8a = o72.n2.f424952b;
                                                    c6442x3ed73e8a.f137827d = i19;
                                                    c6442x3ed73e8a.f137828e = 1;
                                                    c6442x3ed73e8a.f137838o = r2Var2.f67643xc8a07680;
                                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
                                                    am.eq eqVar = c5888x4e3b0044.f136196g;
                                                    eqVar.f88116a = 2;
                                                    eqVar.f88136u = f6Var2.f182380a;
                                                    eqVar.f88121f = str;
                                                    eqVar.f88123h = bq0Var3;
                                                    eqVar.f88124i = a18.f182364a;
                                                    eqVar.f88125j = a18.f182365b;
                                                    eqVar.f88126k = a18.f182366c;
                                                    eqVar.f88131p = a18.f182367d;
                                                    c5888x4e3b0044.e();
                                                    break;
                                                case 15:
                                                    r45.mq0 mq0Var = r2Var2.f67640x5ab01132.C;
                                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6150xa1024095 c6150xa1024095 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6150xa1024095();
                                                    am.jy jyVar = c6150xa1024095.f136411g;
                                                    jyVar.getClass();
                                                    jyVar.f88639b = mq0Var.f462274m;
                                                    jyVar.f88638a = context;
                                                    c6150xa1024095.e();
                                                    am.ky kyVar = c6150xa1024095.f136412h;
                                                    if (kyVar.f88723a) {
                                                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                                                        sb9.append(o72.x1.I());
                                                        java.lang.String str14 = mq0Var.f462272h;
                                                        sb9.append(kk.k.g((str14 != null ? str14 : "").getBytes()));
                                                        byte[] x111 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(sb9.toString());
                                                        if (x111 == null) {
                                                            x111 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(kyVar.f88725c);
                                                        }
                                                        ((dk5.s5) tg3.t1.a()).Ai(str, x111, kyVar.f88724b, null);
                                                        break;
                                                    }
                                                    break;
                                                case 16:
                                                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.a(context, str, o72.x1.J(r2Var2));
                                                    break;
                                                case 17:
                                                    java.lang.String str15 = o72.x1.J(r2Var2).f456941f;
                                                    ((dk5.s5) tg3.t1.a()).fj(str, str15, com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(str15).f277891a) ? 66 : 42, 0);
                                                    break;
                                                case 19:
                                                    boolean z18 = f6Var2.f182383d;
                                                    if (i18 == 19) {
                                                        if (!com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b0.b(r2Var2.f67640x5ab01132.I)) {
                                                            r45.dp0 dp0Var2 = r2Var2.f67640x5ab01132.I;
                                                            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(dp0Var2.f454167d);
                                                            java.lang.String string = Bi != null ? Bi.f68913x21f9b213 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572147a00);
                                                            ot0.q qVar2 = new ot0.q();
                                                            java.lang.String str16 = r2Var2.f67640x5ab01132.f452505q;
                                                            qVar2.f430187f = str16;
                                                            qVar2.f430191g = str16;
                                                            qVar2.f430206j2 = dp0Var2.f454167d;
                                                            qVar2.f430202i2 = dp0Var2.f454172i;
                                                            qVar2.f430210k2 = dp0Var2.f454168e;
                                                            qVar2.f430270z2 = dp0Var2.f454169f;
                                                            qVar2.A2 = dp0Var2.f454174n;
                                                            qVar2.f430214l2 = 2;
                                                            qVar2.f430238r2 = dp0Var2.f454175o;
                                                            qVar2.f430207k = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).l2(dp0Var2.f454168e);
                                                            qVar2.B2 = dp0Var2.f454170g;
                                                            qVar2.L1 = "wxapp_" + dp0Var2.f454168e + dp0Var2.f454172i;
                                                            qVar2.f430255w = dp0Var2.f454167d;
                                                            qVar2.f430259x = string;
                                                            ot0.a aVar = new ot0.a();
                                                            aVar.f429892o = dp0Var2.f454176p;
                                                            aVar.f429898u = dp0Var2.f454177q;
                                                            aVar.f429899v = dp0Var2.f454178r;
                                                            aVar.K = z18;
                                                            qVar2.f(aVar);
                                                            qVar2.f430199i = 33;
                                                            byte[] bArr2 = new byte[0];
                                                            android.graphics.Bitmap i27 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.i(o72.x1.J(r2Var2), r2Var2);
                                                            if (i27 == null || i27.isRecycled()) {
                                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavAppBrandLogic", "thumb image is null");
                                                            } else {
                                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavAppBrandLogic", "thumb image is not null ");
                                                                int width = i27.getWidth();
                                                                int height = i27.getHeight();
                                                                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                                arrayList.add(config);
                                                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                                                arrayList.add(java.lang.Integer.valueOf(height));
                                                                arrayList.add(java.lang.Integer.valueOf(width));
                                                                java.lang.Object obj = new java.lang.Object();
                                                                java.util.Collections.reverse(arrayList);
                                                                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavAppBrandLogic", "getThumbData", "(Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                                                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                                                                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/fav/ui/FavAppBrandLogic", "getThumbData", "(Lcom/tencent/mm/plugin/fav/api/FavItemInfo;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                                                                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                                                                canvas.drawColor(-1);
                                                                canvas.drawBitmap(i27, 0.0f, 0.0f, (android.graphics.Paint) null);
                                                                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                                                createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                                                bArr2 = byteArrayOutputStream.toByteArray();
                                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavAppBrandLogic", "bitmap recycle %s", createBitmap);
                                                                createBitmap.recycle();
                                                            }
                                                            byte[] bArr3 = bArr2;
                                                            ot0.k1 a19 = ot0.j1.a();
                                                            java.lang.String str17 = dp0Var2.f454168e;
                                                            ((ez.w0) a19).getClass();
                                                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar2, str17, "", str, "", bArr3);
                                                            break;
                                                        } else {
                                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavAppBrandLogic", "not expect branch for ban forward");
                                                            break;
                                                        }
                                                    } else {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavAppBrandLogic", "not expect type:%d", java.lang.Integer.valueOf(i18));
                                                        break;
                                                    }
                                                    break;
                                                case 20:
                                                    x2Var.c(str, r2Var2, !f6Var2.f182382c.isEmpty());
                                                    break;
                                                case 21:
                                                    break;
                                                default:
                                                    switch (i18) {
                                                        case 33:
                                                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.d(context, str, r2Var2, o72.x1.J(r2Var2));
                                                            break;
                                                        case 34:
                                                            x2Var.b(str, r2Var2, !f6Var2.f182382c.isEmpty());
                                                            break;
                                                    }
                                            }
                                            r45.gp0 J4 = o72.x1.J(r2Var2);
                                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a44232 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423();
                                            c11288x597a44232.f33185x324c710a = J4.A;
                                            c11288x597a44232.f33182xc58aab80 = J4.C;
                                            java.lang.String str18 = J4.E;
                                            c11288x597a44232.f33184xc6370d0b = str18;
                                            c11288x597a44232.f33183xead55f01 = str18;
                                            c11288x597a44232.f33186x239f8b5 = J4.f456954m2;
                                            c11288x597a44232.f33187x1478a44a = J4.f456958o2;
                                            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
                                            c11286x34a55042.f33122xe4128443 = c11288x597a44232;
                                            c11286x34a55042.f33130x6942258 = J4.f456937d;
                                            c11286x34a55042.f33121x993583fc = J4.f456941f;
                                            byte[] x112 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.X(J4));
                                            if (x112 == null) {
                                                java.lang.String str19 = J4.G;
                                                x112 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.I() + kk.k.g((str19 != null ? str19 : "").getBytes()));
                                            }
                                            c11286x34a55042.f33128x4f3b3aa0 = x112;
                                            java.lang.String str20 = r2Var2.f67640x5ab01132.f452495d.f459583w;
                                            java.lang.String Zi2 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str20);
                                            ot0.q qVar3 = new ot0.q();
                                            qVar3.f430187f = J4.f456937d;
                                            qVar3.f430191g = J4.f456941f;
                                            qVar3.f430207k = J4.A;
                                            java.lang.String str21 = J4.E;
                                            qVar3.f430211l = str21;
                                            qVar3.V = J4.C;
                                            qVar3.W = str21;
                                            qVar3.f430179d = str20;
                                            int i28 = r2Var2.f67657x2262335f;
                                            if (i28 == 32) {
                                                qVar3.f430199i = 92;
                                            } else if (i28 == 21) {
                                                qVar3.f430199i = 76;
                                            }
                                            qVar3.H = Zi2;
                                            qVar3.f430239s = 3;
                                            r45.hp0 hp0Var2 = J4.J1;
                                            if (hp0Var2 != null && (xs4Var = hp0Var2.C) != null) {
                                                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0();
                                                i0Var.f273225d = xs4Var.m75945x2fec8307(0);
                                                i0Var.f273226e = xs4Var.m75945x2fec8307(1);
                                                i0Var.f273227f = xs4Var.m75945x2fec8307(2);
                                                i0Var.f273228g = xs4Var.m75945x2fec8307(3);
                                                i0Var.f273229h = xs4Var.m75945x2fec8307(4);
                                                i0Var.f273230i = xs4Var.m75945x2fec8307(5);
                                                i0Var.f273231j = xs4Var.m75945x2fec8307(7);
                                                i0Var.f273232k = java.lang.String.valueOf(xs4Var.m75942xfb822ef2(8));
                                                i0Var.f273233l = xs4Var.m75945x2fec8307(9);
                                                i0Var.f273235n = xs4Var.m75939xb282bd08(10);
                                                i0Var.f273234m = xs4Var.m75945x2fec8307(6);
                                                i0Var.f273236o = xs4Var.m75945x2fec8307(12);
                                                i0Var.f273237p = xs4Var.m75945x2fec8307(11);
                                                i0Var.f273239r = xs4Var.m75939xb282bd08(18);
                                                i0Var.f273240s = xs4Var.m75945x2fec8307(19);
                                                i0Var.f273241t = xs4Var.m75945x2fec8307(20);
                                                i0Var.f273223b = J4.f456954m2;
                                                i0Var.f273224c = J4.f456958o2;
                                                qVar3.f(i0Var);
                                            }
                                            if (r2Var2.f67657x2262335f != 32) {
                                                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
                                                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.G(qVar3, c11286x34a55042, str, null, 0, null);
                                                break;
                                            } else {
                                                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
                                                ((java.lang.Integer) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(qVar3, qVar3.f430179d, qVar3.H, str, null, x112, null, "", null, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g).first).intValue();
                                                break;
                                            }
                                            break;
                                    }
                                } else {
                                    it = it6;
                                    r45.op0 op0Var2 = r2Var2.f67640x5ab01132.P;
                                    r45.gp0 J5 = o72.x1.J(r2Var2);
                                    ot0.q qVar4 = new ot0.q();
                                    if (op0Var2 != null) {
                                        qVar4.f430179d = r2Var2.f67640x5ab01132.f452495d.f459583w;
                                        qVar4.f430187f = op0Var2.f463945i;
                                        qVar4.f430207k = op0Var2.f463940d;
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(op0Var2.f463942f)) {
                                            qVar4.f430267z = op0Var2.f463942f;
                                        }
                                        if (!op0Var2.f463954u.isEmpty()) {
                                            qVar4.f430191g = ((r45.np0) op0Var2.f463954u.getLast()).f463098e;
                                        }
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar4.f430191g)) {
                                            qVar4.f430191g = op0Var2.f463946m;
                                        }
                                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0();
                                        h0Var.f273198b = op0Var2.f463950q;
                                        h0Var.f273200d = op0Var2.f463949p;
                                        h0Var.f273199c = op0Var2.f463948o;
                                        h0Var.f273203g = op0Var2.f463952s;
                                        h0Var.f273205i = op0Var2.f463953t;
                                        int i29 = op0Var2.f463941e;
                                        if (i29 != 1) {
                                            if (i29 == 2) {
                                                h0Var.f273201e = 61166;
                                            }
                                        } else if (op0Var2.f463944h == 0) {
                                            h0Var.f273201e = 52428;
                                        } else {
                                            h0Var.f273201e = 56797;
                                        }
                                        qVar4.f(h0Var);
                                        qVar4.f430199i = 68;
                                        qVar4.f430255w = op0Var2.f463943g;
                                        byte[] x113 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.X(J5));
                                        if (x113 == null) {
                                            java.lang.String str22 = op0Var2.f463942f;
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str22)) {
                                                java.lang.String str23 = J5.G;
                                                str22 = str23 != null ? str23 : "";
                                            }
                                            x113 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.I() + kk.k.g(str22.getBytes()));
                                        }
                                        java.lang.String a27 = c01.n2.a("fav_" + c01.z1.r() + "_" + r2Var2.f67643xc8a07680);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavLiteApp: msgAppId=%s, path=%s, localId=%s", op0Var2.f463950q, op0Var2.f463948o, java.lang.Long.valueOf(r2Var2.f67645x88be67a1));
                                        ((dk5.s5) tg3.t1.a()).Ai(str, x113, ot0.q.u(qVar4, null, null), a27);
                                    }
                                }
                            } else {
                                it = it6;
                                java.util.Iterator it9 = r2Var2.f67640x5ab01132.f452497f.iterator();
                                while (it9.hasNext()) {
                                    r45.gp0 gp0Var2 = (r45.gp0) it9.next();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavMsg IMG: favId=%d, dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, thumbFullSize=%d, orgnPath=%s, orgnThumbPath=%s", java.lang.Integer.valueOf(r2Var2.f67643xc8a07680), gp0Var2.T, java.lang.Integer.valueOf(gp0Var2.I), gp0Var2.f456967s, gp0Var2.f456971u, gp0Var2.f456945h, gp0Var2.f456953m, java.lang.Long.valueOf(gp0Var2.R), gp0Var2.M, java.lang.Long.valueOf(gp0Var2.f456951l1), gp0Var2.V, gp0Var2.X);
                                    int i37 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456971u)) ? 1 : i17;
                                    int i38 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456945h) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456953m)) ? 1 : i17;
                                    if (i37 != 0 || i38 != 0) {
                                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                                        sb10.append("type:");
                                        sb10.append(gp0Var2.I);
                                        sb10.append(";cdnDataUrl:");
                                        sb10.append(gp0Var2.f456967s);
                                        sb10.append(";cdnDataKey:");
                                        sb10.append(gp0Var2.f456971u);
                                        sb10.append(";cdnThumbUrl:");
                                        sb10.append(gp0Var2.f456945h);
                                        sb10.append(";cdnThumbKey:");
                                        sb10.append(gp0Var2.f456953m);
                                        sb10.append(";orgnPath:");
                                        sb10.append(gp0Var2.V);
                                        sb10.append(";orgnThumbPath:");
                                        sb10.append(gp0Var2.X);
                                        if (i37 != 0) {
                                            sb10.append(";is_data_empty:true");
                                        }
                                        if (i38 != 0) {
                                            sb10.append(";is_image_thumb_empty:true");
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b.d("fav_send_img_field_missing", true, pm0.w.f438337e, null, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13628x6b3a805(sb10));
                                    }
                                    c01.f7 b17 = o72.l2.b(gp0Var2);
                                    if (b17 != null) {
                                        java.lang.String x27 = o72.x1.x(gp0Var2);
                                        java.lang.String X = o72.x1.X(gp0Var2);
                                        b17.U(x27);
                                        b17.V(X);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavMsg IMG fastSend: originPath=%s, thumbPath=%s, favDataItemInMsg.cdnDataUrl=%s, favDataItemInMsg.cdnThumbUrl=%s", x27, X, b17.k(), b17.n());
                                        tg3.a1 a28 = tg3.t1.a();
                                        android.content.Context context2 = this.f183154e;
                                        c01.h7 h7Var = new c01.h7();
                                        r2Var = r2Var2;
                                        h7Var.f118760b = gp0Var2.V1;
                                        h7Var.f118764f = gp0Var2.f456964q2;
                                        ((dk5.s5) a28).cj(context2, str, x27, h7Var, b17);
                                    } else {
                                        r2Var = r2Var2;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "sendFavMsg IMG fastSend: favDataItemInMsg is null after conversion, favId=%d", java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
                                    }
                                    r2Var2 = r2Var;
                                    i17 = 0;
                                }
                            }
                            y5Var = this;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y5 y5Var2 = y5Var;
                            it = it6;
                            r45.jq0 jq0Var2 = r2Var2.f67640x5ab01132.f452495d;
                            try {
                                j17 = java.lang.Long.parseLong(jq0Var2 != null ? jq0Var2.f459579s : "");
                            } catch (java.lang.Throwable unused) {
                                j17 = 0;
                            }
                            y5Var = y5Var2;
                            ((dk5.s5) tg3.t1.a()).hj(str, r2Var2.f67640x5ab01132.f452507s, c01.e2.C(str), 0, j17, "", "", "");
                        }
                        it6 = it;
                    }
                } else {
                    java.util.Iterator it10 = it6;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f6Var2.f182382c)) {
                        ((dk5.s5) tg3.t1.a()).fj(str, f6Var2.f182382c, c01.e2.C(str), 0);
                    }
                    it6 = it10;
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(y5Var.f183155f);
    }

    /* renamed from: toString */
    public java.lang.String m55417x9616526c() {
        return super.toString() + "|sendFavMsg";
    }
}

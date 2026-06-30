package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.f6 f101620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f101622f;

    public y5(com.tencent.mm.plugin.fav.ui.f6 f6Var, android.content.Context context, java.lang.Runnable runnable) {
        this.f101620d = f6Var;
        this.f101621e = context;
        this.f101622f = runnable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00d2. Please report as an issue. */
    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it;
        long j17;
        o72.r2 r2Var;
        com.tencent.mm.plugin.fav.ui.f6 f6Var;
        r45.xs4 xs4Var;
        r45.op0 op0Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.fav.ui.y5 y5Var = this;
        com.tencent.mm.plugin.fav.ui.f6 f6Var2 = y5Var.f101620d;
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(f6Var2.f100848b.split(","));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavMsg: start, toUserCount=%d, itemCount=%d", java.lang.Integer.valueOf(P1.size()), java.lang.Integer.valueOf(((java.util.LinkedList) f6Var2.f100851e).size()));
        java.util.Iterator it6 = P1.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            java.util.Iterator it7 = f6Var2.f100851e.iterator();
            while (true) {
                int i17 = 0;
                if (it7.hasNext()) {
                    o72.r2 r2Var2 = (o72.r2) it7.next();
                    if (r2Var2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSendLogic", "in run workerThread,want to send fav msg, but info is null,infos.size = %d", java.lang.Integer.valueOf(((java.util.LinkedList) f6Var2.f100851e).size()));
                    } else {
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = java.lang.Integer.valueOf(r2Var2.field_id);
                        objArr[1] = java.lang.Integer.valueOf(r2Var2.field_type);
                        r45.bq0 bq0Var = r2Var2.field_favProto;
                        objArr[2] = java.lang.Integer.valueOf((bq0Var == null || (linkedList = bq0Var.f370964f) == null) ? 0 : linkedList.size());
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavMsg: processing favId=%d, favType=%d, dataListSize=%d", objArr);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10925, java.lang.Integer.valueOf(r2Var2.field_type), java.lang.Integer.valueOf(r2Var2.field_id));
                        int i18 = r2Var2.field_type;
                        if (i18 != 1) {
                            if (i18 != 2) {
                                android.content.Context context = y5Var.f101621e;
                                if (i18 == 10) {
                                    it = it6;
                                    r45.aq0 aq0Var = r2Var2.field_favProto.f370980y;
                                    com.tencent.mm.autogen.events.ProductOperationEvent productOperationEvent = new com.tencent.mm.autogen.events.ProductOperationEvent();
                                    am.to toVar = productOperationEvent.f54626g;
                                    toVar.f8025a = 0;
                                    toVar.f8027c = aq0Var.f370194m;
                                    toVar.f8026b = context;
                                    productOperationEvent.e();
                                    am.uo uoVar = productOperationEvent.f54627h;
                                    if (uoVar.f8118a) {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        sb6.append(o72.x1.I());
                                        java.lang.String str2 = aq0Var.f370192h;
                                        sb6.append(kk.k.g((str2 != null ? str2 : "").getBytes()));
                                        byte[] x17 = com.tencent.mm.sdk.platformtools.t8.x1(sb6.toString());
                                        if (x17 == null) {
                                            x17 = com.tencent.mm.sdk.platformtools.t8.x1(uoVar.f8120c);
                                        }
                                        ((dk5.s5) tg3.t1.a()).Ai(str, x17, uoVar.f8119b, null);
                                    }
                                } else if (i18 == 11) {
                                    it = it6;
                                    r45.aq0 aq0Var2 = r2Var2.field_favProto.f370980y;
                                    com.tencent.mm.autogen.events.ProductOperationEvent productOperationEvent2 = new com.tencent.mm.autogen.events.ProductOperationEvent();
                                    am.to toVar2 = productOperationEvent2.f54626g;
                                    toVar2.f8025a = 1;
                                    toVar2.f8027c = aq0Var2.f370194m;
                                    toVar2.f8026b = context;
                                    productOperationEvent2.e();
                                    am.uo uoVar2 = productOperationEvent2.f54627h;
                                    if (uoVar2.f8118a) {
                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                        sb7.append(o72.x1.I());
                                        java.lang.String str3 = aq0Var2.f370192h;
                                        sb7.append(kk.k.g((str3 != null ? str3 : "").getBytes()));
                                        byte[] x18 = com.tencent.mm.sdk.platformtools.t8.x1(sb7.toString());
                                        if (x18 == null) {
                                            x18 = com.tencent.mm.sdk.platformtools.t8.x1(uoVar2.f8120c);
                                        }
                                        ((dk5.s5) tg3.t1.a()).Ai(str, x18, uoVar2.f8119b, null);
                                    }
                                } else if (i18 != 24) {
                                    switch (i18) {
                                        case 4:
                                            it = it6;
                                            com.tencent.mm.plugin.fav.ui.x5.b(context, str, o72.x1.J(r2Var2));
                                            break;
                                        case 5:
                                            r45.gp0 J2 = o72.x1.J(r2Var2);
                                            r45.bq0 bq0Var2 = r2Var2.field_favProto;
                                            r45.tq0 tq0Var = bq0Var2.f370968m;
                                            r45.jq0 jq0Var = bq0Var2.f370962d;
                                            ot0.q qVar = new ot0.q();
                                            if (tq0Var != null) {
                                                qVar.f348654f = tq0Var.f386664d;
                                                java.lang.String str4 = tq0Var.f386670m;
                                                if (com.tencent.mm.sdk.platformtools.t8.K0(str4) && (str4 = J2.G) == null) {
                                                    str4 = "";
                                                }
                                                qVar.f348734z = str4;
                                            }
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348654f)) {
                                                qVar.f348654f = J2.f375404d;
                                            }
                                            if (tq0Var != null) {
                                                qVar.f348658g = tq0Var.f386666f;
                                            }
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348658g)) {
                                                qVar.f348658g = J2.f375408f;
                                            }
                                            r45.tq0 tq0Var2 = r2Var2.field_favProto.f370968m;
                                            if (tq0Var2 != null) {
                                                qVar.f348674k = tq0Var2.f386668h;
                                            }
                                            if (jq0Var != null && com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348674k)) {
                                                qVar.f348674k = jq0Var.f378052y;
                                            }
                                            if (r2Var2.B1 && com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348674k)) {
                                                qVar.f348674k = J2.A;
                                            }
                                            if (!com.tencent.mm.sdk.platformtools.t8.K0(J2.T1)) {
                                                qVar.C2 = J2.T1;
                                            }
                                            qVar.f348662h = "view";
                                            qVar.f348666i = 5;
                                            java.lang.String str5 = jq0Var.B;
                                            qVar.f348722w = str5;
                                            r45.qp0 qp0Var = r2Var2.field_favProto.K;
                                            if (qp0Var != null) {
                                                ot0.f fVar = new ot0.f();
                                                fVar.f348455b = qp0Var.f384162d;
                                                fVar.f348461h = qp0Var.f384176u;
                                                if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                                                    qVar.f348722w = qp0Var.f384169n;
                                                }
                                                if (qp0Var.f384162d == 5) {
                                                    fVar.f348463j = qp0Var.f384168m;
                                                    fVar.f348456c = qp0Var.f384166h;
                                                    fVar.f348457d = qp0Var.f384167i;
                                                    fVar.f348458e = qp0Var.f384164f;
                                                    fVar.f348459f = qp0Var.f384165g;
                                                }
                                                qVar.f(fVar);
                                            }
                                            if (tq0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(tq0Var.f386678u)) {
                                                f6Var = f6Var2;
                                                it = it6;
                                            } else {
                                                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(tq0Var.f386678u, "websearch", null);
                                                su4.l2 l2Var = new su4.l2();
                                                l2Var.f412983b = (java.lang.String) d17.get(".websearch.relevant_vid");
                                                l2Var.f412984c = (java.lang.String) d17.get(".websearch.relevant_expand");
                                                l2Var.f412985d = (java.lang.String) d17.get(".websearch.relevant_pre_searchid");
                                                l2Var.f412986e = (java.lang.String) d17.get(".websearch.relevant_shared_openid");
                                                f6Var = f6Var2;
                                                l2Var.f412987f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".websearch.rec_category"), -1);
                                                l2Var.f412988g = (java.lang.String) d17.get(".websearch.shareUrl");
                                                l2Var.f412989h = (java.lang.String) d17.get(".websearch.shareTitle");
                                                l2Var.f412990i = (java.lang.String) d17.get(".websearch.shareDesc");
                                                l2Var.f412991j = (java.lang.String) d17.get(".websearch.shareImgUrl");
                                                l2Var.f412992k = (java.lang.String) d17.get(".websearch.shareString");
                                                l2Var.f412993l = (java.lang.String) d17.get(".websearch.shareStringUrl");
                                                l2Var.f412994m = (java.lang.String) d17.get(".websearch.source");
                                                l2Var.f412995n = (java.lang.String) d17.get(".websearch.sourceUrl");
                                                l2Var.f412996o = (java.lang.String) d17.get(".websearch.strPlayCount");
                                                l2Var.f412997p = (java.lang.String) d17.get(".websearch.titleUrl");
                                                l2Var.f412998q = (java.lang.String) d17.get(".websearch.extReqParams");
                                                l2Var.f412999r = (java.lang.String) d17.get(".websearch.tagList");
                                                it = it6;
                                                l2Var.f413000s = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".websearch.channelId"), -1L);
                                                l2Var.f413001t = (java.lang.String) d17.get(".websearch.thumbUrl");
                                                l2Var.f413002u = (java.lang.String) d17.get(".websearch.shareTag");
                                                qVar.f(l2Var);
                                            }
                                            qVar.Y1 = J2.R1;
                                            byte[] x19 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.X(J2));
                                            if (x19 == null) {
                                                java.lang.String str6 = tq0Var == null ? null : tq0Var.f386670m;
                                                if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                                                    java.lang.String str7 = J2.G;
                                                    str6 = str7 != null ? str7 : "";
                                                }
                                                x19 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.I() + kk.k.g(str6.getBytes()));
                                            }
                                            byte[] bArr = x19;
                                            java.lang.String str8 = "fav_" + c01.z1.r() + "_" + r2Var2.field_id;
                                            java.lang.String a17 = c01.n2.a(str8);
                                            c01.l2 c17 = c01.n2.d().c(a17, true);
                                            c17.i("prePublishId", str8);
                                            c17.i("preUsername", r2Var2.field_fromUser);
                                            c17.i("sendAppMsgScene", 1);
                                            c17.i("adExtStr", J2.R1);
                                            ((dk5.s5) tg3.t1.a()).Bi(str, bArr, ot0.q.u(qVar, null, null), a17, "", tg3.l1.a(pt0.f0.V9(r2Var2.field_fromUser, J2.f375435s2)), "", false);
                                            y5Var = this;
                                            f6Var2 = f6Var;
                                            break;
                                        case 6:
                                            r45.pp0 pp0Var = r2Var2.field_favProto.f370966h;
                                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<msg><location x=\"");
                                            sb8.append(pp0Var.f383268f);
                                            sb8.append("\" y=\"");
                                            sb8.append(pp0Var.f383266d);
                                            sb8.append("\" scale=\"");
                                            sb8.append(pp0Var.f383270h);
                                            sb8.append("\" label=\"");
                                            java.lang.String str9 = pp0Var.f383272m;
                                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            sb8.append(str9);
                                            sb8.append("\" maptype=\"0\" poiname=\"");
                                            java.lang.String str10 = pp0Var.f383274o;
                                            sb8.append(str10 != null ? str10 : "");
                                            sb8.append("\" /></msg>");
                                            ((dk5.s5) tg3.t1.a()).fj(str, sb8.toString(), 48, 0);
                                            it = it6;
                                            break;
                                        case 7:
                                            r45.gp0 J3 = o72.x1.J(r2Var2);
                                            com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = new com.tencent.mm.opensdk.modelmsg.WXMusicObject();
                                            wXMusicObject.musicUrl = J3.A;
                                            wXMusicObject.musicDataUrl = J3.C;
                                            java.lang.String str11 = J3.E;
                                            wXMusicObject.musicLowBandUrl = str11;
                                            wXMusicObject.musicLowBandDataUrl = str11;
                                            wXMusicObject.songAlbumUrl = J3.f375421m2;
                                            wXMusicObject.songLyric = J3.f375425o2;
                                            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
                                            wXMediaMessage.mediaObject = wXMusicObject;
                                            wXMediaMessage.title = J3.f375404d;
                                            wXMediaMessage.description = J3.f375408f;
                                            byte[] x110 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.X(J3));
                                            if (x110 == null) {
                                                java.lang.String str12 = J3.G;
                                                x110 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.I() + kk.k.g((str12 != null ? str12 : "").getBytes()));
                                            }
                                            wXMediaMessage.thumbData = x110;
                                            java.lang.String str13 = r2Var2.field_favProto.f370962d.f378050w;
                                            java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str13);
                                            ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
                                            com.tencent.mm.pluginsdk.model.app.k0.D(wXMediaMessage, str13, Zi, str, 3, null);
                                            it = it6;
                                            break;
                                        case 8:
                                            com.tencent.mm.plugin.fav.ui.x5.c(str, r2Var2, o72.x1.J(r2Var2));
                                            it = it6;
                                            break;
                                        default:
                                            it = it6;
                                            com.tencent.mm.plugin.fav.ui.x2 x2Var = com.tencent.mm.plugin.fav.ui.x2.f101594a;
                                            switch (i18) {
                                                case 14:
                                                case 18:
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "want send record, fav id %d", java.lang.Integer.valueOf(r2Var2.field_id));
                                                    com.tencent.mm.plugin.fav.ui.e6 a18 = com.tencent.mm.plugin.fav.ui.e6.a(context, r2Var2);
                                                    r45.bq0 bq0Var3 = new r45.bq0();
                                                    try {
                                                        bq0Var3.parseFrom(r2Var2.field_favProto.toByteArray());
                                                    } catch (java.lang.Exception e17) {
                                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavSendLogic", e17, "", new java.lang.Object[0]);
                                                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSendLogic", "clone fav proto item error: %s", e17.getMessage());
                                                    }
                                                    java.util.LinkedList linkedList2 = bq0Var3.f370964f;
                                                    java.util.Iterator it8 = linkedList2.iterator();
                                                    while (it8.hasNext()) {
                                                        r45.gp0 gp0Var = (r45.gp0) it8.next();
                                                        r45.hp0 hp0Var = gp0Var.J1;
                                                        if (hp0Var != null) {
                                                            r45.dp0 dp0Var = hp0Var.f376368v;
                                                            if (dp0Var != null && com.tencent.mm.plugin.fav.ui.b0.b(dp0Var)) {
                                                                gp0Var.h0(1);
                                                                gp0Var.m0(context.getString(com.tencent.mm.R.string.f490505wz));
                                                                linkedList2.set(i17, gp0Var);
                                                                bq0Var3.d(linkedList2);
                                                            }
                                                            r45.tq0 tq0Var3 = gp0Var.J1.f376355f;
                                                            if (tq0Var3 != null && o72.j3.a(tq0Var3)) {
                                                                gp0Var.h0(1);
                                                                gp0Var.m0(context.getString(com.tencent.mm.R.string.f490505wz));
                                                                linkedList2.set(i17, gp0Var);
                                                                bq0Var3.d(linkedList2);
                                                            }
                                                            if (gp0Var.I == 36 && (op0Var = gp0Var.J1.H) != null && op0Var.f382420t) {
                                                                gp0Var.h0(1);
                                                                gp0Var.m0(context.getString(com.tencent.mm.R.string.f490505wz));
                                                                linkedList2.set(i17, gp0Var);
                                                                bq0Var3.d(linkedList2);
                                                            }
                                                        }
                                                        i17++;
                                                    }
                                                    o72.n2 n2Var = o72.n2.f343418a;
                                                    int i19 = r2Var2.field_type;
                                                    com.tencent.mm.autogen.mmdata.rpt.FavForwardQualityStruct favForwardQualityStruct = o72.n2.f343419b;
                                                    favForwardQualityStruct.f56294d = i19;
                                                    favForwardQualityStruct.f56295e = 1;
                                                    favForwardQualityStruct.f56305o = r2Var2.field_id;
                                                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
                                                    am.eq eqVar = recordOperationEvent.f54663g;
                                                    eqVar.f6583a = 2;
                                                    eqVar.f6603u = f6Var2.f100847a;
                                                    eqVar.f6588f = str;
                                                    eqVar.f6590h = bq0Var3;
                                                    eqVar.f6591i = a18.f100831a;
                                                    eqVar.f6592j = a18.f100832b;
                                                    eqVar.f6593k = a18.f100833c;
                                                    eqVar.f6598p = a18.f100834d;
                                                    recordOperationEvent.e();
                                                    break;
                                                case 15:
                                                    r45.mq0 mq0Var = r2Var2.field_favProto.C;
                                                    com.tencent.mm.autogen.events.TVOperationEvent tVOperationEvent = new com.tencent.mm.autogen.events.TVOperationEvent();
                                                    am.jy jyVar = tVOperationEvent.f54878g;
                                                    jyVar.getClass();
                                                    jyVar.f7106b = mq0Var.f380741m;
                                                    jyVar.f7105a = context;
                                                    tVOperationEvent.e();
                                                    am.ky kyVar = tVOperationEvent.f54879h;
                                                    if (kyVar.f7190a) {
                                                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                                                        sb9.append(o72.x1.I());
                                                        java.lang.String str14 = mq0Var.f380739h;
                                                        sb9.append(kk.k.g((str14 != null ? str14 : "").getBytes()));
                                                        byte[] x111 = com.tencent.mm.sdk.platformtools.t8.x1(sb9.toString());
                                                        if (x111 == null) {
                                                            x111 = com.tencent.mm.sdk.platformtools.t8.x1(kyVar.f7192c);
                                                        }
                                                        ((dk5.s5) tg3.t1.a()).Ai(str, x111, kyVar.f7191b, null);
                                                        break;
                                                    }
                                                    break;
                                                case 16:
                                                    com.tencent.mm.plugin.fav.ui.x5.a(context, str, o72.x1.J(r2Var2));
                                                    break;
                                                case 17:
                                                    java.lang.String str15 = o72.x1.J(r2Var2).f375408f;
                                                    ((dk5.s5) tg3.t1.a()).fj(str, str15, com.tencent.mm.storage.z3.m4(com.tencent.mm.storage.y8.i(str15).f196358a) ? 66 : 42, 0);
                                                    break;
                                                case 19:
                                                    boolean z18 = f6Var2.f100850d;
                                                    if (i18 == 19) {
                                                        if (!com.tencent.mm.plugin.fav.ui.b0.b(r2Var2.field_favProto.I)) {
                                                            r45.dp0 dp0Var2 = r2Var2.field_favProto.I;
                                                            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(dp0Var2.f372634d);
                                                            java.lang.String string = Bi != null ? Bi.field_nickname : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490614a00);
                                                            ot0.q qVar2 = new ot0.q();
                                                            java.lang.String str16 = r2Var2.field_favProto.f370972q;
                                                            qVar2.f348654f = str16;
                                                            qVar2.f348658g = str16;
                                                            qVar2.f348673j2 = dp0Var2.f372634d;
                                                            qVar2.f348669i2 = dp0Var2.f372639i;
                                                            qVar2.f348677k2 = dp0Var2.f372635e;
                                                            qVar2.f348737z2 = dp0Var2.f372636f;
                                                            qVar2.A2 = dp0Var2.f372641n;
                                                            qVar2.f348681l2 = 2;
                                                            qVar2.f348705r2 = dp0Var2.f372642o;
                                                            qVar2.f348674k = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).l2(dp0Var2.f372635e);
                                                            qVar2.B2 = dp0Var2.f372637g;
                                                            qVar2.L1 = "wxapp_" + dp0Var2.f372635e + dp0Var2.f372639i;
                                                            qVar2.f348722w = dp0Var2.f372634d;
                                                            qVar2.f348726x = string;
                                                            ot0.a aVar = new ot0.a();
                                                            aVar.f348359o = dp0Var2.f372643p;
                                                            aVar.f348365u = dp0Var2.f372644q;
                                                            aVar.f348366v = dp0Var2.f372645r;
                                                            aVar.K = z18;
                                                            qVar2.f(aVar);
                                                            qVar2.f348666i = 33;
                                                            byte[] bArr2 = new byte[0];
                                                            android.graphics.Bitmap i27 = com.tencent.mm.plugin.fav.ui.ra.i(o72.x1.J(r2Var2), r2Var2);
                                                            if (i27 == null || i27.isRecycled()) {
                                                                com.tencent.mars.xlog.Log.e("MicroMsg.FavAppBrandLogic", "thumb image is null");
                                                            } else {
                                                                com.tencent.mars.xlog.Log.i("MicroMsg.FavAppBrandLogic", "thumb image is not null ");
                                                                int width = i27.getWidth();
                                                                int height = i27.getHeight();
                                                                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                                arrayList.add(config);
                                                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                                                                com.tencent.mars.xlog.Log.i("MicroMsg.FavAppBrandLogic", "bitmap recycle %s", createBitmap);
                                                                createBitmap.recycle();
                                                            }
                                                            byte[] bArr3 = bArr2;
                                                            ot0.k1 a19 = ot0.j1.a();
                                                            java.lang.String str17 = dp0Var2.f372635e;
                                                            ((ez.w0) a19).getClass();
                                                            com.tencent.mm.pluginsdk.model.app.k0.I(qVar2, str17, "", str, "", bArr3);
                                                            break;
                                                        } else {
                                                            com.tencent.mars.xlog.Log.e("MicroMsg.FavAppBrandLogic", "not expect branch for ban forward");
                                                            break;
                                                        }
                                                    } else {
                                                        com.tencent.mars.xlog.Log.e("MicroMsg.FavAppBrandLogic", "not expect type:%d", java.lang.Integer.valueOf(i18));
                                                        break;
                                                    }
                                                    break;
                                                case 20:
                                                    x2Var.c(str, r2Var2, !f6Var2.f100849c.isEmpty());
                                                    break;
                                                case 21:
                                                    break;
                                                default:
                                                    switch (i18) {
                                                        case 33:
                                                            com.tencent.mm.plugin.fav.ui.x5.d(context, str, r2Var2, o72.x1.J(r2Var2));
                                                            break;
                                                        case 34:
                                                            x2Var.b(str, r2Var2, !f6Var2.f100849c.isEmpty());
                                                            break;
                                                    }
                                            }
                                            r45.gp0 J4 = o72.x1.J(r2Var2);
                                            com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject2 = new com.tencent.mm.opensdk.modelmsg.WXMusicObject();
                                            wXMusicObject2.musicUrl = J4.A;
                                            wXMusicObject2.musicDataUrl = J4.C;
                                            java.lang.String str18 = J4.E;
                                            wXMusicObject2.musicLowBandUrl = str18;
                                            wXMusicObject2.musicLowBandDataUrl = str18;
                                            wXMusicObject2.songAlbumUrl = J4.f375421m2;
                                            wXMusicObject2.songLyric = J4.f375425o2;
                                            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
                                            wXMediaMessage2.mediaObject = wXMusicObject2;
                                            wXMediaMessage2.title = J4.f375404d;
                                            wXMediaMessage2.description = J4.f375408f;
                                            byte[] x112 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.X(J4));
                                            if (x112 == null) {
                                                java.lang.String str19 = J4.G;
                                                x112 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.I() + kk.k.g((str19 != null ? str19 : "").getBytes()));
                                            }
                                            wXMediaMessage2.thumbData = x112;
                                            java.lang.String str20 = r2Var2.field_favProto.f370962d.f378050w;
                                            java.lang.String Zi2 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str20);
                                            ot0.q qVar3 = new ot0.q();
                                            qVar3.f348654f = J4.f375404d;
                                            qVar3.f348658g = J4.f375408f;
                                            qVar3.f348674k = J4.A;
                                            java.lang.String str21 = J4.E;
                                            qVar3.f348678l = str21;
                                            qVar3.V = J4.C;
                                            qVar3.W = str21;
                                            qVar3.f348646d = str20;
                                            int i28 = r2Var2.field_type;
                                            if (i28 == 32) {
                                                qVar3.f348666i = 92;
                                            } else if (i28 == 21) {
                                                qVar3.f348666i = 76;
                                            }
                                            qVar3.H = Zi2;
                                            qVar3.f348706s = 3;
                                            r45.hp0 hp0Var2 = J4.J1;
                                            if (hp0Var2 != null && (xs4Var = hp0Var2.C) != null) {
                                                com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = new com.tencent.mm.pluginsdk.ui.tools.i0();
                                                i0Var.f191692d = xs4Var.getString(0);
                                                i0Var.f191693e = xs4Var.getString(1);
                                                i0Var.f191694f = xs4Var.getString(2);
                                                i0Var.f191695g = xs4Var.getString(3);
                                                i0Var.f191696h = xs4Var.getString(4);
                                                i0Var.f191697i = xs4Var.getString(5);
                                                i0Var.f191698j = xs4Var.getString(7);
                                                i0Var.f191699k = java.lang.String.valueOf(xs4Var.getLong(8));
                                                i0Var.f191700l = xs4Var.getString(9);
                                                i0Var.f191702n = xs4Var.getInteger(10);
                                                i0Var.f191701m = xs4Var.getString(6);
                                                i0Var.f191703o = xs4Var.getString(12);
                                                i0Var.f191704p = xs4Var.getString(11);
                                                i0Var.f191706r = xs4Var.getInteger(18);
                                                i0Var.f191707s = xs4Var.getString(19);
                                                i0Var.f191708t = xs4Var.getString(20);
                                                i0Var.f191690b = J4.f375421m2;
                                                i0Var.f191691c = J4.f375425o2;
                                                qVar3.f(i0Var);
                                            }
                                            if (r2Var2.field_type != 32) {
                                                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
                                                com.tencent.mm.pluginsdk.model.app.k0.G(qVar3, wXMediaMessage2, str, null, 0, null);
                                                break;
                                            } else {
                                                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
                                                ((java.lang.Integer) com.tencent.mm.pluginsdk.model.app.k0.K(qVar3, qVar3.f348646d, qVar3.H, str, null, x112, null, "", null, com.tencent.mm.plugin.msg.MsgIdTalker.f149479g).first).intValue();
                                                break;
                                            }
                                            break;
                                    }
                                } else {
                                    it = it6;
                                    r45.op0 op0Var2 = r2Var2.field_favProto.P;
                                    r45.gp0 J5 = o72.x1.J(r2Var2);
                                    ot0.q qVar4 = new ot0.q();
                                    if (op0Var2 != null) {
                                        qVar4.f348646d = r2Var2.field_favProto.f370962d.f378050w;
                                        qVar4.f348654f = op0Var2.f382412i;
                                        qVar4.f348674k = op0Var2.f382407d;
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(op0Var2.f382409f)) {
                                            qVar4.f348734z = op0Var2.f382409f;
                                        }
                                        if (!op0Var2.f382421u.isEmpty()) {
                                            qVar4.f348658g = ((r45.np0) op0Var2.f382421u.getLast()).f381565e;
                                        }
                                        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar4.f348658g)) {
                                            qVar4.f348658g = op0Var2.f382413m;
                                        }
                                        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = new com.tencent.mm.pluginsdk.ui.tools.h0();
                                        h0Var.f191665b = op0Var2.f382417q;
                                        h0Var.f191667d = op0Var2.f382416p;
                                        h0Var.f191666c = op0Var2.f382415o;
                                        h0Var.f191670g = op0Var2.f382419s;
                                        h0Var.f191672i = op0Var2.f382420t;
                                        int i29 = op0Var2.f382408e;
                                        if (i29 != 1) {
                                            if (i29 == 2) {
                                                h0Var.f191668e = 61166;
                                            }
                                        } else if (op0Var2.f382411h == 0) {
                                            h0Var.f191668e = 52428;
                                        } else {
                                            h0Var.f191668e = 56797;
                                        }
                                        qVar4.f(h0Var);
                                        qVar4.f348666i = 68;
                                        qVar4.f348722w = op0Var2.f382410g;
                                        byte[] x113 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.X(J5));
                                        if (x113 == null) {
                                            java.lang.String str22 = op0Var2.f382409f;
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(str22)) {
                                                java.lang.String str23 = J5.G;
                                                str22 = str23 != null ? str23 : "";
                                            }
                                            x113 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.I() + kk.k.g(str22.getBytes()));
                                        }
                                        java.lang.String a27 = c01.n2.a("fav_" + c01.z1.r() + "_" + r2Var2.field_id);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavLiteApp: msgAppId=%s, path=%s, localId=%s", op0Var2.f382417q, op0Var2.f382415o, java.lang.Long.valueOf(r2Var2.field_localId));
                                        ((dk5.s5) tg3.t1.a()).Ai(str, x113, ot0.q.u(qVar4, null, null), a27);
                                    }
                                }
                            } else {
                                it = it6;
                                java.util.Iterator it9 = r2Var2.field_favProto.f370964f.iterator();
                                while (it9.hasNext()) {
                                    r45.gp0 gp0Var2 = (r45.gp0) it9.next();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavMsg IMG: favId=%d, dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, thumbFullSize=%d, orgnPath=%s, orgnThumbPath=%s", java.lang.Integer.valueOf(r2Var2.field_id), gp0Var2.T, java.lang.Integer.valueOf(gp0Var2.I), gp0Var2.f375434s, gp0Var2.f375438u, gp0Var2.f375412h, gp0Var2.f375420m, java.lang.Long.valueOf(gp0Var2.R), gp0Var2.M, java.lang.Long.valueOf(gp0Var2.f375418l1), gp0Var2.V, gp0Var2.X);
                                    int i37 = (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375434s) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375438u)) ? 1 : i17;
                                    int i38 = (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375412h) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375420m)) ? 1 : i17;
                                    if (i37 != 0 || i38 != 0) {
                                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                                        sb10.append("type:");
                                        sb10.append(gp0Var2.I);
                                        sb10.append(";cdnDataUrl:");
                                        sb10.append(gp0Var2.f375434s);
                                        sb10.append(";cdnDataKey:");
                                        sb10.append(gp0Var2.f375438u);
                                        sb10.append(";cdnThumbUrl:");
                                        sb10.append(gp0Var2.f375412h);
                                        sb10.append(";cdnThumbKey:");
                                        sb10.append(gp0Var2.f375420m);
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
                                        com.tencent.mm.plugin.report.service.d1.f158158b.d("fav_send_img_field_missing", true, pm0.w.f356804e, null, true, false, new com.tencent.mm.plugin.fav.ui.x5$$b(sb10));
                                    }
                                    c01.f7 b17 = o72.l2.b(gp0Var2);
                                    if (b17 != null) {
                                        java.lang.String x27 = o72.x1.x(gp0Var2);
                                        java.lang.String X = o72.x1.X(gp0Var2);
                                        b17.U(x27);
                                        b17.V(X);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavMsg IMG fastSend: originPath=%s, thumbPath=%s, favDataItemInMsg.cdnDataUrl=%s, favDataItemInMsg.cdnThumbUrl=%s", x27, X, b17.k(), b17.n());
                                        tg3.a1 a28 = tg3.t1.a();
                                        android.content.Context context2 = this.f101621e;
                                        c01.h7 h7Var = new c01.h7();
                                        r2Var = r2Var2;
                                        h7Var.f37227b = gp0Var2.V1;
                                        h7Var.f37231f = gp0Var2.f375431q2;
                                        ((dk5.s5) a28).cj(context2, str, x27, h7Var, b17);
                                    } else {
                                        r2Var = r2Var2;
                                        com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "sendFavMsg IMG fastSend: favDataItemInMsg is null after conversion, favId=%d", java.lang.Integer.valueOf(r2Var.field_id));
                                    }
                                    r2Var2 = r2Var;
                                    i17 = 0;
                                }
                            }
                            y5Var = this;
                        } else {
                            com.tencent.mm.plugin.fav.ui.y5 y5Var2 = y5Var;
                            it = it6;
                            r45.jq0 jq0Var2 = r2Var2.field_favProto.f370962d;
                            try {
                                j17 = java.lang.Long.parseLong(jq0Var2 != null ? jq0Var2.f378046s : "");
                            } catch (java.lang.Throwable unused) {
                                j17 = 0;
                            }
                            y5Var = y5Var2;
                            ((dk5.s5) tg3.t1.a()).hj(str, r2Var2.field_favProto.f370974s, c01.e2.C(str), 0, j17, "", "", "");
                        }
                        it6 = it;
                    }
                } else {
                    java.util.Iterator it10 = it6;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(f6Var2.f100849c)) {
                        ((dk5.s5) tg3.t1.a()).fj(str, f6Var2.f100849c, c01.e2.C(str), 0);
                    }
                    it6 = it10;
                }
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(y5Var.f101622f);
    }

    public java.lang.String toString() {
        return super.toString() + "|sendFavMsg";
    }
}

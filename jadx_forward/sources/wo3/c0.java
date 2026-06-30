package wo3;

/* loaded from: classes9.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f529677a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public wo3.t f529678b = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f529679c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f529680d;

    public c0() {
        java.util.Map d17;
        int P;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f529679c = arrayList;
        this.f529680d = new java.util.HashSet();
        java.lang.String Ni = to3.c0.Ai().Ni(196631);
        if (!android.text.TextUtils.isEmpty(Ni) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(Ni, "sysmsg", null)) != null && (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1)) >= 0 && P == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "msg type is 4 ");
            b(c(d17));
        }
        arrayList.clear();
    }

    public void a(java.lang.String str, boolean z17) {
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null).get(".sysmsg.paymsg.PayMsgType"), -1);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = to3.q.f502506c;
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(20);
        hashSet.add(23);
        hashSet.add(24);
        if (hashSet.contains(java.lang.Integer.valueOf(P))) {
            gm0.j1.e().j(new wo3.r(this, z17));
        }
    }

    public void b(wo3.v vVar) {
        wo3.s sVar;
        if (this.f529677a == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f529677a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f529677a.get(i17);
            if (weakReference != null && (sVar = (wo3.s) weakReference.get()) != null && sVar.mo24790x50fc6e08(vVar)) {
                return;
            }
        }
    }

    public final wo3.t c(java.util.Map map) {
        if (this.f529678b == null) {
            this.f529678b = new wo3.t(this);
        }
        this.f529678b.f529749a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        this.f529678b.f529746d = (java.lang.String) map.get(".sysmsg.paymsg.isfreeze");
        wo3.t tVar = this.f529678b;
        tVar.getClass();
        this.f529678b.f529747e = (java.lang.String) map.get(".sysmsg.paymsg.freezemsg");
        return this.f529678b;
    }

    public final wo3.w d(java.util.Map map) {
        wo3.w wVar = new wo3.w(this);
        wVar.f529749a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        wVar.f529752d = (java.lang.String) map.get(".sysmsg.paymsg.req_key");
        return wVar;
    }

    public final wo3.x e(java.util.Map map) {
        wo3.x xVar = new wo3.x(this);
        xVar.f529749a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        xVar.f529753d = (java.lang.String) map.get(".sysmsg.paymsg.cftretcode");
        xVar.f529754e = (java.lang.String) map.get(".sysmsg.paymsg.cftretmsg");
        xVar.f529755f = (java.lang.String) map.get(".sysmsg.paymsg.wxretcode");
        xVar.f529756g = (java.lang.String) map.get(".sysmsg.paymsg.wxretmsg");
        xVar.f529757h = (java.lang.String) map.get(".sysmsg.paymsg.error_detail_url");
        xVar.f529758i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.pay_cmd"), -1);
        xVar.f529759j = (java.lang.String) map.get(".sysmsg.paymsg.error_icon_url");
        xVar.f529760k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.paymsg.error_icon_lightmode_color"), 0L);
        xVar.f529761l = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(".sysmsg.paymsg.error_icon_darkmode_color"), 0L);
        xVar.f529762m = (java.lang.String) map.get(".sysmsg.paymsg.view_id");
        xVar.f529763n = (java.lang.String) map.get(".sysmsg.paymsg.right_btn_title");
        xVar.f529764o = (java.lang.String) map.get(".sysmsg.paymsg.tinyapp_username");
        xVar.f529765p = (java.lang.String) map.get(".sysmsg.paymsg.tinyapp_path");
        return xVar;
    }

    public final wo3.y f(java.util.Map map) {
        java.util.Map map2;
        wo3.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity;
        java.lang.Object obj;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity2;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.util.Map map3 = map;
        wo3.y yVar2 = new wo3.y(this);
        yVar2.f529749a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.PayMsgType"), -1);
        yVar2.f529766d = (java.lang.String) map3.get(".sysmsg.paymsg.transid");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity();
        commodity3.f261236d = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_uin");
        commodity3.f261237e = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_name");
        commodity3.f261238f = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.sale_uin");
        commodity3.f261239g = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.sale_name");
        commodity3.f261247r = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.trans_id");
        commodity3.f261240h = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.goods_name");
        commodity3.f261242m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.pay_num"), -1) / 100.0d;
        commodity3.f261244o = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.trade_state");
        java.lang.Object obj2 = ".sysmsg.paymsg.user_roll.trade_state_name";
        commodity3.f261245p = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.trade_state_name");
        commodity3.f261248s = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_bank_name");
        commodity3.f261254y = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.discount");
        commodity3.f261246q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.modify_timestamp"), 0);
        commodity3.f261249t = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.fee_type");
        commodity3.f261250u = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.appusername");
        commodity3.f261252w = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.app_telephone");
        commodity3.f261243n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.buy_bank_name"), -1) / 100.0d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
        promotions.f261306f = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.nickname");
        java.lang.String str21 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.username");
        promotions.f261309i = str21;
        promotions.f261304d = 0;
        commodity3.f261251v = str21;
        promotions.f261305e = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.logo_round_url");
        promotions.f261308h = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.subscribe_biz_url");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map3.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.recommend_level"), 1);
        commodity3.f261255z = P;
        commodity3.B = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.rateinfo");
        commodity3.C = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.original_feeinfo");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261306f)) {
            commodity3.I = true;
            ((java.util.ArrayList) commodity3.H).add(promotions);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= 255) {
                map2 = map3;
                yVar = yVar2;
                c19099x8d444f05 = c19099x8d444f052;
                commodity = commodity3;
                obj = obj2;
                i17 = P;
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions();
            if (i18 == 0) {
                java.lang.String str22 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.icon");
                java.lang.String str23 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.wording");
                java.lang.String str24 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.url");
                java.lang.String str25 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.btn_text");
                java.lang.String str26 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.type");
                java.lang.String str27 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.title");
                java.lang.String str28 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_type");
                java.lang.String str29 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_id");
                java.lang.String str30 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.send_record_id");
                java.lang.String str31 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.award_id");
                java.lang.String str32 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.user_record_id");
                java.lang.String str33 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.small_title");
                java.lang.String str34 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_username");
                java.lang.String str35 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_path");
                java.lang.String str36 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_mch_id");
                java.lang.String str37 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_version");
                java.lang.String str38 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.get_award_params");
                java.lang.String str39 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record.query_award_status_params");
                str3 = str26;
                str5 = str32;
                str19 = str34;
                str6 = str37;
                str18 = str39;
                str12 = str23;
                yVar = yVar2;
                str16 = str33;
                str11 = str38;
                c19099x8d444f05 = c19099x8d444f052;
                str7 = str24;
                str9 = str29;
                obj = obj2;
                str14 = str25;
                str15 = str30;
                commodity2 = commodity3;
                str13 = str27;
                str4 = str28;
                i17 = P;
                str8 = str22;
                str10 = str31;
                str20 = str35;
                str17 = str36;
            } else {
                java.lang.String str40 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".icon");
                java.lang.String str41 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".wording");
                java.lang.String str42 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".url");
                java.lang.String str43 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".btn_text");
                java.lang.String str44 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".type");
                java.lang.String str45 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".title");
                java.lang.String str46 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_type");
                java.lang.String str47 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_id");
                java.lang.String str48 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".send_record_id");
                java.lang.String str49 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".award_id");
                java.lang.String str50 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".user_record_id");
                java.lang.String str51 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".small_title");
                java.lang.String str52 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_tinyapp_username");
                java.lang.String str53 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_tinyapp_path");
                java.lang.String str54 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_mch_id");
                java.lang.String str55 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".activity_tinyapp_version");
                java.lang.String str56 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".get_award_params");
                java.lang.String str57 = (java.lang.String) map3.get(".sysmsg.paymsg.user_roll.activity_info.record" + i18 + ".query_award_status_params");
                str3 = str44;
                str4 = str46;
                str5 = str50;
                str6 = str55;
                c19099x8d444f05 = c19099x8d444f052;
                i17 = P;
                str7 = str42;
                str8 = str40;
                str9 = str47;
                str10 = str49;
                str11 = str56;
                commodity2 = commodity3;
                str12 = str41;
                str13 = str45;
                yVar = yVar2;
                obj = obj2;
                str14 = str43;
                str15 = str48;
                str16 = str51;
                str17 = str54;
                str18 = str57;
                str19 = str52;
                str20 = str53;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "hy: activity end. total size: %d", java.lang.Integer.valueOf(i18 + 1));
                map2 = map;
                commodity = commodity2;
                break;
            }
            promotions2.f261305e = str8;
            promotions2.f261306f = str12;
            promotions2.f261308h = str7;
            promotions2.f261307g = str14;
            promotions2.f261304d = 1;
            promotions2.f261311n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
            promotions2.f261310m = str13;
            promotions2.f261313p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, 0);
            promotions2.f261312o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str9, 0L);
            promotions2.f261315r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str15, 0);
            promotions2.f261314q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str10, 0);
            promotions2.f261316s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5, 0);
            promotions2.f261317t = str16;
            promotions2.f261318u = str19;
            promotions2.f261319v = str20;
            promotions2.f261320w = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str17, 0L);
            promotions2.f261321x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str6, 0);
            promotions2.f261322y = str11;
            promotions2.f261323z = str18;
            a36.c q17 = yo3.m.q(map, i18);
            if (q17 != null) {
                promotions2.A = q17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity4 = commodity2;
            ((java.util.ArrayList) commodity4.H).add(promotions2);
            i18++;
            commodity3 = commodity4;
            yVar2 = yVar;
            P = i17;
            obj2 = obj;
            c19099x8d444f052 = c19099x8d444f05;
            map3 = map;
        }
        java.lang.String str58 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.link_ativity_info.text");
        java.lang.String str59 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.link_ativity_info.url");
        at4.w0 w0Var = commodity.f261235J;
        w0Var.f95516a = str58;
        w0Var.f95517b = str59;
        java.lang.String str60 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_name");
        java.lang.String str61 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_logo");
        java.lang.String str62 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_desc");
        java.lang.String str63 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_username");
        java.lang.String str64 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_path");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str60) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str61) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str62) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str63)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo recommendTinyAppInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo();
            commodity.D = recommendTinyAppInfo;
            recommendTinyAppInfo.f261324d = str60;
            recommendTinyAppInfo.f261325e = str61;
            recommendTinyAppInfo.f261326f = str62;
            recommendTinyAppInfo.f261327g = str63;
            recommendTinyAppInfo.f261328h = str64;
            recommendTinyAppInfo.f261329i = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_tinyapp_btn_text");
            commodity.D.f261330m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_id"), 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.RecommendTinyAppInfo recommendTinyAppInfo2 = commodity.D;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_type"), 0L);
            recommendTinyAppInfo2.getClass();
            commodity.D.f261332o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.send_record_id"), 0);
            commodity.D.f261333p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.user_record_id"), 0);
            commodity.D.f261334q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_mch_id"), 0);
            commodity.D.f261331n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.award_id"), 0);
            commodity.D.f261335r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_version"), 0);
        }
        commodity.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.FinderInfo();
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.type"), 0);
        java.lang.String str65 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.url");
        java.lang.String str66 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.username");
        java.lang.String str67 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.path");
        java.lang.String str68 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.tiny_app_uri.version");
        java.lang.String str69 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.logo.url");
        java.lang.String str70 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.logo.dark_mode_url");
        java.lang.String str71 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.sub_logo.url");
        java.lang.String str72 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.sub_logo.dark_mode_url");
        java.lang.String str73 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.title");
        java.lang.String str74 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.desc");
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.type"), -1);
        java.lang.String str75 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.username");
        java.lang.String str76 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.feedid");
        java.lang.String str77 = (java.lang.String) map2.get(".sysmsg.paymsg.user_roll.finder_info_view.route_info.finder_uri.nonceid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "finder jump type：%s", java.lang.Integer.valueOf(P2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "finder h5 url：%s", str65);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "finder tinyapp username：%s ，path：%s，version：%s", str66, str67, str68);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "finder finder_logo_normal：%s，finder_title：%s，finder_desc:%s，finder_uri_type：%s，finder_uri_username：%s，finder_uri_feedid：%s,finder_uri_nonceid：%s", str69, str73, str74, java.lang.Integer.valueOf(P3), str75, str76, str77);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.FinderInfo finderInfo = commodity.E;
        finderInfo.f261275d = P2;
        finderInfo.f261276e = str65;
        finderInfo.f261277f = str66;
        finderInfo.f261278g = str67;
        finderInfo.f261279h = str68;
        finderInfo.f261280i = str69;
        finderInfo.f261281m = str70;
        finderInfo.f261282n = str71;
        finderInfo.f261283o = str72;
        finderInfo.f261284p = str73;
        finderInfo.f261285q = str74;
        finderInfo.f261286r = P3;
        finderInfo.f261287s = str75;
        finderInfo.f261288t = str76;
        finderInfo.f261289u = str77;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.LeadTailViewInfo leadTailViewInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.LeadTailViewInfo();
        commodity.F = leadTailViewInfo;
        leadTailViewInfo.f261290d = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.desc");
        commodity.F.f261291e = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.settled_logo.url");
        commodity.F.f261292f = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.settled_logo.dark_mode_url");
        commodity.F.f261293g = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.unsettled_logo.url");
        commodity.F.f261294h = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.unsettled_logo.dark_mode_url");
        commodity.F.f261295i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.type"), 0);
        commodity.F.f261296m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.type"), 0);
        commodity.F.f261297n = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.url");
        commodity.F.f261298o = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.username");
        commodity.F.f261299p = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.path");
        commodity.F.f261300q = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.route_info.tiny_app_uri.version");
        commodity.F.f261301r = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.busi_param");
        commodity.F.f261302s = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.trans_id");
        commodity.F.f261303t = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.lead_tail_view.jump_info.cmd_data.mmpay_mkt_sign");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f053 = c19099x8d444f05;
        c19099x8d444f053.M = arrayList;
        arrayList.add(commodity);
        c19099x8d444f053.V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.is_use_new_paid_succ_page"), 0);
        c19099x8d444f053.W = (java.lang.String) map.get(".sysmsg.paymsg.user_roll.pay_succ_btn_wording");
        c19099x8d444f053.C = (java.lang.String) map.get(obj);
        c19099x8d444f053.A = i17;
        c19099x8d444f053.f261208e = (java.lang.String) map.get(".sysmsg.req_key");
        c19099x8d444f053.X = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.user_roll.is_use_show_info"), 0);
        c19099x8d444f053.Z = new java.util.ArrayList();
        for (int i19 = 0; i19 < 255; i19++) {
            java.lang.String str78 = i19 == 0 ? ".sysmsg.paymsg.user_roll.show_info.record." : ".sysmsg.paymsg.user_roll.show_info.record" + i19 + ".";
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo showInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo();
            showInfo.f261338d = (java.lang.String) map.get(str78 + com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            showInfo.f261339e = (java.lang.String) map.get(str78 + "value");
            showInfo.f261340f = (java.lang.String) map.get(str78 + "name_color");
            showInfo.f261341g = (java.lang.String) map.get(str78 + "value_color");
            java.lang.String str79 = str78 + "value_attr.";
            showInfo.f261342h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str79 + "link_type"), 0);
            showInfo.f261343i = (java.lang.String) map.get(str79 + "link_weapp");
            showInfo.f261344m = (java.lang.String) map.get(str79 + "link_addr");
            showInfo.f261345n = (java.lang.String) map.get(str79 + "link_url");
            showInfo.f261346o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str79 + "text_attr"), 0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(showInfo.f261338d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(showInfo.f261339e)) {
                c19099x8d444f053.Z.add(showInfo);
            }
        }
        commodity.f261243n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) map.get(".sysmsg.paymsg.user_roll.original_total_fee"), -1.0d) / 100.0d;
        if (android.text.TextUtils.isEmpty((java.lang.String) map.get(".sysmsg.paymsg.user_roll.discount_array.record.favor_desc"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOfflineUtil", ".sysmsg.paymsg.user_roll.discount_array.record.favor_desc value is empty");
        } else {
            int i27 = 0;
            while (true) {
                java.lang.String str80 = i27 != 0 ? "" + i27 : "";
                str = ".sysmsg.paymsg.user_roll.discount_array.record" + str80 + ".favor_desc";
                str2 = ".sysmsg.paymsg.user_roll.discount_array.record" + str80 + ".payment_amount";
                if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(str)) || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(str2))) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo discountInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.DiscountInfo();
                discountInfo.f261274e = (java.lang.String) map.get(str);
                discountInfo.f261273d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) map.get(str2), 0.0d);
                ((java.util.ArrayList) commodity.A).add(discountInfo);
                i27++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOfflineUtil", "favor_desc_key is " + str + ", payment_amount_key is " + str2 + ", break");
        }
        wo3.y yVar3 = yVar;
        yVar3.f529767e = c19099x8d444f053;
        if (((java.util.ArrayList) c19099x8d444f053.M).size() > 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) yVar3.f529767e.M).get(0)).f261247r);
        }
        if (map.containsKey(".sysmsg.paymsg.real_name_info")) {
            yVar3.f529768f = new wo3.a0(this, map);
        }
        return yVar3;
    }

    public final wo3.z g(java.util.Map map) {
        wo3.z zVar = new wo3.z(this);
        zVar.f529749a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        zVar.f529769d = (java.lang.String) map.get(".sysmsg.paymsg.good_name");
        zVar.f529770e = (java.lang.String) map.get(".sysmsg.paymsg.total_fee");
        zVar.f529773h = (java.lang.String) map.get(".sysmsg.paymsg.req_key");
        zVar.f529771f = (java.lang.String) map.get(".sysmsg.paymsg.id");
        java.lang.String str = (java.lang.String) map.get(".sysmsg.paymsg.confirm_type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "msg confirm_type is" + zVar.f529772g);
        if (android.text.TextUtils.isEmpty(str) || !str.equals("1")) {
            zVar.f529772g = 0;
        } else {
            zVar.f529772g = 1;
        }
        return zVar;
    }

    public final void h(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING;
        c17.x(u3Var, "");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, "");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_REQ_KEY_STRING;
        c18.x(u3Var2, "");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.pay_cmd"), -1);
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.paymsg.req_key");
        gm0.j1.u().c().x(u3Var, (java.lang.String) d17.get(".sysmsg.paymsg.ack_key"));
        if (P < 0) {
            P = 0;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_PAYMSG_TYPE_INT, java.lang.Integer.valueOf(P));
        gm0.j1.u().c().x(u3Var2, str2);
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "msg type is " + P3);
        if (P3 >= 0 && P3 == 4) {
            b(c(d17));
            to3.c0.Ai().Vi(196631, str);
            return;
        }
        if (P3 >= 0 && P3 == 5) {
            if (P2 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "payCmd is PAY_CMD_OFFLINE_PAY_REFRESH_TOKEN (value is 1), refresh offline token");
                to3.c0.Ai().Ui().a(4, 4);
            }
            b(e(d17));
            return;
        }
        if (P3 >= 0 && P3 == 6) {
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.paymsg.transid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("helios", "MSG_TYPE_ORDER trasid=" + str3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "orders xml: %s", str);
            b(f(d17));
            return;
        }
        if (P3 >= 0 && P3 == 7) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().B();
            return;
        }
        if (P3 >= 0 && P3 == 8) {
            b(g(d17));
            return;
        }
        if (P3 >= 0 && P3 == 10) {
            to3.c0.Ai().Ui().a(4, 4);
            return;
        }
        if (P3 >= 0 && P3 == 20) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6246x818b27de c6246x818b27de = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6246x818b27de();
            c6246x818b27de.f136495g.f89128a = new wo3.a0(this, d17);
            c6246x818b27de.e();
            return;
        }
        if (P3 < 0 || P3 != 23) {
            if (P3 < 0 || P3 != 24) {
                return;
            }
            b(i(d17));
            return;
        }
        wo3.w d18 = d(d17);
        synchronized (this.f529680d) {
            if (this.f529680d.contains(d18.f529752d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineMsgManager", "pass this msg %s", d18.f529752d);
            } else {
                this.f529680d.add(d18.f529752d);
                b(d18);
            }
        }
    }

    public final wo3.w i(java.util.Map map) {
        wo3.w wVar = new wo3.w(this);
        wVar.f529749a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), -1);
        wVar.f529752d = (java.lang.String) map.get(".sysmsg.paymsg.req_key");
        return wVar;
    }

    public void j(wo3.s sVar) {
        wo3.s sVar2;
        if (this.f529677a == null || sVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f529677a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f529677a.get(i17);
            if (weakReference != null && (sVar2 = (wo3.s) weakReference.get()) != null && sVar2.equals(sVar)) {
                this.f529677a.remove(weakReference);
                return;
            }
        }
    }
}

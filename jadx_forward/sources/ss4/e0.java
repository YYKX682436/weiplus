package ss4;

/* loaded from: classes9.dex */
public class e0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493569d;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 f493579q;

    /* renamed from: r, reason: collision with root package name */
    public final int f493580r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f493581s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Map f493582t;

    /* renamed from: u, reason: collision with root package name */
    public at4.s f493583u;

    /* renamed from: v, reason: collision with root package name */
    public at4.p0 f493584v;

    /* renamed from: w, reason: collision with root package name */
    public at4.r0 f493585w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f493586x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f493587y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f493588z;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493570e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f493571f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f493572g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f493573h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f493574i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f493575m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f493576n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f493577o = "";

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f493578p = new java.util.LinkedList();
    public java.lang.String A = "";
    public java.lang.String B = "";
    public java.lang.String C = "";
    public boolean D = false;

    public e0(java.lang.String str, int i17) {
        this.f493580r = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "NetSceneTenpayQueryBoundBankcard scene:%s", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f493581s = hashMap;
        this.f493580r = i17;
        hashMap.put("req_key", str);
        hashMap.put("bind_query_scene", "" + i17);
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null || !aVar.mo148657xb9a85d2c()) {
            hashMap.put("is_root", "0");
        } else {
            hashMap.put("is_root", "1");
        }
        if (aVar != null) {
            hashMap.put("is_device_open_touch", "1");
            java.util.Map C = aVar.C();
            if (C != null) {
                hashMap.putAll(C);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is true");
        } else {
            hashMap.put("is_device_open_touch", "0");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is false");
        }
        m83032xb4c13117(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f493582t = hashMap2;
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(196612, null);
        gm0.j1.i();
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(196613, null);
        hashMap2.put("bind_serial", str2);
        hashMap2.put("last_bind_serial", str3);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return ss4.p0.f493657a.a(ss4.n0.f493643i, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 72;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return ss4.p0.f493657a.b(ss4.n0.f493643i, "/cgi-bin/mmpay-bin/tenpay/bindquerynew");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray;
        org.json.JSONArray optJSONArray2;
        org.json.JSONObject optJSONObject;
        if (i17 != 0) {
            return;
        }
        at4.p0 p0Var = null;
        at4.s sVar = null;
        if (jSONObject.has("real_name_info")) {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("real_name_info");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43.b(optJSONObject2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "get real_name_info %s", optJSONObject2.toString());
            this.f493569d = optJSONObject2.optString("guide_flag");
            optJSONObject2.optString("guide_wording");
            optJSONObject2.optString("left_button_wording");
            optJSONObject2.optString("right_button_wording");
            optJSONObject2.optString("upload_credit_url");
            this.f493570e = optJSONObject2.optString("done_button_wording");
            this.f493571f = optJSONObject2.optInt("is_show_protocol", 0);
            this.f493572g = optJSONObject2.optString("left_protocol_wording");
            this.f493573h = optJSONObject2.optString("new_upload_credit_url");
            this.f493574i = optJSONObject2.optString("protocol_url");
            this.f493575m = optJSONObject2.optString("right_protocol_wording");
            this.f493576n = optJSONObject2.optString("subtitle");
            this.f493577o = optJSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            this.f493588z = optJSONObject2.optString("compliance_upload_image_half_page");
            org.json.JSONArray optJSONArray3 = optJSONObject2.optJSONArray("upload_reasons");
            java.util.LinkedList linkedList = this.f493578p;
            linkedList.clear();
            if (optJSONArray3 != null) {
                for (int i18 = 0; i18 < optJSONArray3.length(); i18++) {
                    linkedList.add(optJSONArray3.optString(i18));
                }
            }
            if (optJSONObject2.has("ecard_info")) {
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("ecard_info");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 c19096xf9c99b43 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43();
                this.f493579q = c19096xf9c99b43;
                c19096xf9c99b43.f261171p = this.f493577o;
                c19096xf9c99b43.f261172q = new java.util.ArrayList(linkedList);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 c19096xf9c99b432 = this.f493579q;
                c19096xf9c99b432.f261174s = this.f493574i;
                c19096xf9c99b432.f261175t = this.f493572g;
                c19096xf9c99b432.f261176u = this.f493575m;
                c19096xf9c99b432.f261173r = this.f493570e;
                c19096xf9c99b432.f261162d = optJSONObject3.optInt("ecard_open_scene", 0);
                this.f493579q.f261163e = optJSONObject3.optString("ecard_type", "");
                this.f493579q.f261164f = optJSONObject3.optInt("show_check_box", 0);
                this.f493579q.f261165g = optJSONObject3.optInt("check_box_selected", 0);
                this.f493579q.f261166h = optJSONObject3.optString("check_box_left_wording", "");
                this.f493579q.f261167i = optJSONObject3.optString("check_box_right_wording", "");
                this.f493579q.f261168m = optJSONObject3.optString("check_box_url", "");
                this.f493579q.f261169n = optJSONObject3.optInt("is_upload_credid", 0);
                this.f493579q.f261170o = optJSONObject3.optString("upload_credit_url", "");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43.b(null);
        }
        if (jSONObject.has("user_info") && (optJSONObject = jSONObject.optJSONObject("user_info")) != null) {
            this.C = optJSONObject.optString("true_name");
            this.A = optJSONObject.optString("cre_name");
            this.B = optJSONObject.optString("cre_type");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BINDQUERYNEW_TRUE_NAME_STRING, this.C);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BINDQUERYNEW_CRE_NAME_STRING, this.A);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BINDQUERYNEW_CRE_TYPE_STRING, this.B);
            }
        }
        boolean has = jSONObject.has("paymenu_array");
        int i19 = this.f493580r;
        if (has && i19 == 1 && (optJSONArray2 = jSONObject.optJSONArray("paymenu_array")) != null) {
            java.lang.String jSONArray = optJSONArray2.toString();
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_INDEX_MAIDAN_STRING_SYNC, jSONArray);
        }
        if (jSONObject.has("pay_manage_label") && (optJSONArray = jSONObject.optJSONArray("pay_manage_label")) != null) {
            this.f493586x = new java.util.ArrayList();
            for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                org.json.JSONObject optJSONObject4 = optJSONArray.optJSONObject(i27);
                if (optJSONObject4 != null) {
                    this.f493586x.add(at4.x0.a(optJSONObject4));
                }
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_PAY_MANAGE_LABEL_LIST_STRING_SYNC, optJSONArray.toString());
        }
        if (jSONObject.has("home_half_page")) {
            this.f493587y = jSONObject.optString("home_half_page");
        }
        long optLong = jSONObject.optLong("time_stamp");
        if (optLong > 0) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.b("" + optLong);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTenpayQueryBindBankcard", "no time_stamp in bindquerynew.");
        }
        at4.r1.k(jSONObject, i19, true, this.D);
        if (at4.r1.h(i19) || i19 == 1) {
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("bind_card_menu");
            if (optJSONObject5 != null) {
                optJSONObject5.toString();
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC, optJSONObject5.toString());
            } else {
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC, "");
            }
        }
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is not null");
            aVar.af();
            int G = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G();
            if (G == 0) {
                if (aVar.Ic()) {
                    mz2.a aVar2 = (mz2.a) aVar;
                    aVar2.e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    aVar2.d(false);
                } else if (aVar.Rb()) {
                    mz2.a aVar3 = (mz2.a) aVar;
                    aVar3.d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    aVar3.e(false);
                }
            } else if (G == 1 && aVar.Ic()) {
                mz2.a aVar4 = (mz2.a) aVar;
                aVar4.e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                aVar4.d(false);
            } else if (G == 2 && aVar.Rb()) {
                mz2.a aVar5 = (mz2.a) aVar;
                aVar5.d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                aVar5.e(false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is null");
        }
        if (i19 == 10) {
            org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("action_entry");
            if (optJSONObject6 != null) {
                sVar = new at4.s();
                optJSONObject6.optString(dm.i4.f66865x76d1ec5a);
                sVar.f95474a = optJSONObject6.optString("wording");
                optJSONObject6.optString("color");
                sVar.f95475b = optJSONObject6.optInt("type");
                sVar.f95476c = optJSONObject6.optString("native_url");
                sVar.f95477d = optJSONObject6.optString("web_url");
                sVar.f95478e = optJSONObject6.optString("tiny_app_username");
                sVar.f95479f = optJSONObject6.optString("tiny_app_path");
                optJSONObject6.optInt("entrance_type");
            }
            this.f493583u = sVar;
            return;
        }
        if (i19 == 8) {
            if (jSONObject.has("block_layer")) {
                org.json.JSONObject optJSONObject7 = jSONObject.optJSONObject("block_layer");
                if (optJSONObject7 != null) {
                    p0Var = new at4.p0();
                    p0Var.f95451a = optJSONObject7.optInt("view_id");
                    p0Var.f95452b = optJSONObject7.optInt("is_show_block_layer");
                    p0Var.f95453c = optJSONObject7.optInt("waiting_time");
                    p0Var.f95454d = optJSONObject7.optString("main_wording");
                    p0Var.f95455e = optJSONObject7.optString("reminder_content");
                    p0Var.f95457g = optJSONObject7.optString("repayment_tiny_app_path");
                    p0Var.f95456f = optJSONObject7.optString("repayment_tiny_app_username");
                }
                this.f493584v = p0Var;
            }
            org.json.JSONObject optJSONObject8 = jSONObject.optJSONObject("disable_block_layer");
            if (optJSONObject8 == null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_DISABLE_BLOCK_LAYER_STRING_SYNC, "");
            } else {
                this.f493585w = at4.r0.a(optJSONObject8);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_DISABLE_BLOCK_LAYER_STRING_SYNC, optJSONObject8.toString());
            }
        }
    }
}

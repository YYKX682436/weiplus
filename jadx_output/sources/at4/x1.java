package at4;

/* loaded from: classes9.dex */
public class x1 {

    /* renamed from: n, reason: collision with root package name */
    public r45.ey4 f14005n;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f13992a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f13993b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f13994c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f13995d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f13996e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public at4.v1 f13997f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f13998g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f13999h = null;

    /* renamed from: i, reason: collision with root package name */
    public at4.u1 f14000i = null;

    /* renamed from: j, reason: collision with root package name */
    public at4.k0 f14001j = null;

    /* renamed from: k, reason: collision with root package name */
    public at4.f f14002k = null;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f14003l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f14004m = null;

    /* renamed from: o, reason: collision with root package name */
    public long f14006o = com.tencent.mm.sdk.platformtools.t8.i1();

    /* renamed from: p, reason: collision with root package name */
    public long f14007p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f14008q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f14009r = 10000;

    /* renamed from: s, reason: collision with root package name */
    public int f14010s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f14011t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f14012u = "";

    public x1() {
        z();
    }

    public final void A() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "recordDataState()");
        if (this.f13997f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "userInfo == null");
        }
        java.util.ArrayList arrayList = this.f13995d;
        if (arrayList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "bankcards == null");
        } else if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == 0");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == " + this.f13995d.size());
        }
        java.util.ArrayList arrayList2 = this.f13996e;
        if (arrayList2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "virtualBankcards == null");
        } else if (arrayList2.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == 0");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == " + this.f13996e.size());
        }
        if (this.f13999h == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "balance == null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "balance != null");
        }
        if (this.f13998g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "historyBankcard == null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "historyBankcard != null");
        }
        if (this.f14001j == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo == null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo != null");
        }
    }

    public void B() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            v1Var.field_is_reg = -1;
            this.f13997f = null;
        }
        if (this.f14000i != null) {
            this.f14000i = null;
        }
        if (this.f13999h != null) {
            this.f13999h = null;
        }
        java.util.ArrayList arrayList = this.f13995d;
        if (arrayList != null) {
            arrayList.clear();
            this.f13995d = null;
        }
        java.util.ArrayList arrayList2 = this.f13996e;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.f13996e = null;
        }
        if (this.f14005n != null) {
            this.f14005n = null;
        }
        this.f14007p = 0L;
        com.tencent.mm.wallet_core.ui.r1.c(new com.tencent.mm.wallet_core.ui.q1("wallet_balance_version", -1), new com.tencent.mm.wallet_core.ui.q1("wallet_balance_last_update_time", -1), new com.tencent.mm.wallet_core.ui.q1("wallet_balance", -1));
        this.f14006o = com.tencent.mm.sdk.platformtools.t8.i1();
    }

    public void C(at4.v1 v1Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2, at4.k0 k0Var, at4.f fVar, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3, int i17, int i18, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "setBankcards scene %d", java.lang.Integer.valueOf(i18));
        if (i18 == 8) {
            this.f13992a = arrayList;
            this.f14003l = list;
        }
        if (i18 == 24 || i18 == 25) {
            this.f13993b = arrayList;
        }
        if (i18 == 12) {
            this.f13994c = arrayList;
        }
        this.f13995d = arrayList;
        this.f13996e = arrayList2;
        this.f13999h = bankcard;
        this.f14000i = new at4.u1(v1Var.field_switchConfig, v1Var.field_wallet_entrance_balance_switch_state);
        this.f13998g = bankcard2;
        this.f14001j = k0Var;
        this.f14002k = fVar;
        this.f14004m = bankcard3;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "setBankcards()! " + v1Var.field_switchConfig);
        A();
        int i19 = i17 < 0 ? 600 : i17;
        this.f14006o = com.tencent.mm.sdk.platformtools.t8.i1() + i19;
        this.f14007p = com.tencent.mm.sdk.platformtools.t8.i1() + 600;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "hy: cache time: %d, dead time: %d, cacheDeadTime: %s", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(this.f14006o), java.lang.Long.valueOf(this.f14007p));
        if (i18 == 8 || i18 == 12 || i18 == 26) {
            dt4.c Ni = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ni();
            Ni.getClass();
            Ni.f243231d.A("WalletBankcardScene", "delete from WalletBankcardScene where scene=" + i18 + "");
        } else {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().f243234d.A("WalletBankcard", "delete from WalletBankcard");
        }
        if (i18 != 24 && i18 != 25 && arrayList != null) {
            com.tencent.mm.plugin.wallet_core.utils.w0.e(arrayList, i18);
        }
        if (arrayList2 != null) {
            com.tencent.mm.plugin.wallet_core.utils.w0.e(arrayList2, i18);
        }
        if (bankcard != null) {
            com.tencent.mm.plugin.wallet_core.utils.w0.d(bankcard, i18);
        }
        if (bankcard2 != null) {
            com.tencent.mm.plugin.wallet_core.utils.w0.d(bankcard2, i18);
        }
        if (bankcard3 != null) {
            com.tencent.mm.plugin.wallet_core.utils.w0.d(bankcard3, i18);
        }
        H(v1Var);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).Ui().f243227d.A("LoanEntryInfo", "delete from LoanEntryInfo");
        if (k0Var != null) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Ui().insert(k0Var);
        }
    }

    public void D(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().w(196612, str);
    }

    public void E(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "setSelectBindSerial %s %s", str, com.tencent.mm.sdk.platformtools.z3.b(true));
        if (str != null) {
            gm0.j1.i();
            gm0.j1.u().c().w(196633, str);
        }
    }

    public void F(r45.ey4 ey4Var) {
        java.lang.String str;
        this.f14005n = ey4Var;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_OFFLINE_GUIDE_BAR_CONFIG_STRING_SYNC;
        if (ey4Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("guide_type", ey4Var.f373810d);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                r45.fy4 fy4Var = ey4Var.f373811e;
                if (fy4Var != null) {
                    jSONObject2.put("bind_serial", fy4Var.f374730d);
                }
                jSONObject.put("guide_data", jSONObject2.toString());
                jSONObject.put("is_show_guide", ey4Var.f373812f);
                jSONObject.put("guide_content", ey4Var.f373813g);
                jSONObject.put("guide_content_color", ey4Var.f373814h);
                jSONObject.put("guide_btn_text", ey4Var.f373815i);
                jSONObject.put("guide_btn_text_color", ey4Var.f373816m);
                jSONObject.put("guide_btn_bg_color", ey4Var.f373817n);
                jSONObject.put("guide_logo", ey4Var.f373818o);
                jSONObject.put("background_color", ey4Var.f373819p);
                jSONObject.put("attach_info_left_wording", ey4Var.f373820q);
                jSONObject.put("attach_info_right_wording", ey4Var.f373821r);
                jSONObject.put("btn_jump_mode", ey4Var.f373822s);
                jSONObject.put("btn_jump_h5", ey4Var.f373823t);
                jSONObject.put("btn_jump_tinyapp_username", ey4Var.f373824u);
                jSONObject.put("btn_jump_tinyapp_path", ey4Var.f373825v);
                jSONObject.put("dark_guide_btn_text_color", ey4Var.f373826w);
                jSONObject.put("dark_guide_btn_bg_color", ey4Var.f373827x);
                jSONObject.put("dark_background_color", ey4Var.f373828y);
                str = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getOfflineGuideBarJSONStr() Exception: %s", e17.getMessage());
            }
            c17.x(u3Var, str);
        }
        str = "";
        c17.x(u3Var, str);
    }

    public int G() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_soter_pay_open_type;
        }
        return 0;
    }

    public void H(at4.v1 v1Var) {
        this.f13997f = v1Var;
        ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().f243308d.A("WalletUserInfo", "delete from WalletUserInfo");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().insert(v1Var);
    }

    public java.util.ArrayList a(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            if (this.f13999h != null && !y()) {
                arrayList.add(this.f13999h);
            }
            if (this.f14004m != null && !y()) {
                arrayList.add(this.f14004m);
            }
        }
        java.util.ArrayList arrayList2 = this.f13995d;
        if (arrayList2 != null && arrayList2.size() > 0) {
            java.util.Iterator it = this.f13995d.iterator();
            while (it.hasNext()) {
                arrayList.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next());
            }
        }
        return arrayList;
    }

    public java.util.ArrayList b(boolean z17) {
        if (this.f13992a == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            if (this.f13999h != null && !y()) {
                arrayList.add(this.f13999h);
            }
            if (this.f14004m != null && !y()) {
                arrayList.add(this.f14004m);
            }
        }
        if (this.f13992a.size() > 0) {
            java.util.Iterator it = this.f13992a.iterator();
            while (it.hasNext()) {
                arrayList.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next());
            }
        }
        return arrayList;
    }

    public java.util.ArrayList c(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            if (this.f13999h != null && !y()) {
                arrayList.add(this.f13999h);
            }
            if (this.f14004m != null && !y()) {
                arrayList.add(this.f14004m);
            }
        }
        java.util.ArrayList arrayList2 = this.f13992a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            java.util.ArrayList arrayList3 = this.f13995d;
            if (arrayList3 != null && arrayList3.size() > 0) {
                java.util.Iterator it = this.f13995d.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next());
                }
            }
        } else {
            java.util.Iterator it6 = this.f13992a.iterator();
            while (it6.hasNext()) {
                arrayList.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) it6.next());
            }
        }
        return arrayList;
    }

    public java.lang.String d() {
        java.util.ArrayList arrayList = this.f13995d;
        if (arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
            return null;
        }
        java.util.Iterator it = this.f13995d.iterator();
        if (it.hasNext()) {
            return ((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next()).field_bindSerial;
        }
        return null;
    }

    public com.tencent.mm.plugin.wallet_core.model.Bankcard e(java.lang.String str) {
        java.util.ArrayList arrayList = this.f13995d;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = this.f13995d.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                if (bankcard.field_bindSerial.equals(str)) {
                    return bankcard;
                }
            }
        }
        return null;
    }

    public com.tencent.mm.plugin.wallet_core.model.Bankcard f(java.lang.String str) {
        java.util.ArrayList b17 = b(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || b17 == null || b17.isEmpty()) {
            return null;
        }
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            if (bankcard.field_bindSerial.equals(str)) {
                return bankcard;
            }
        }
        return null;
    }

    public com.tencent.mm.plugin.wallet_core.model.Bankcard g(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2;
        if (z17 && (bankcard2 = this.f13999h) != null && bankcard2.field_bindSerial.equals(str)) {
            return this.f13999h;
        }
        if (z18 && (bankcard = this.f14004m) != null && bankcard.field_bindSerial.equals(str)) {
            return this.f14004m;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "need get bankcard is ：%s ", str);
        java.util.ArrayList arrayList = this.f13992a;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = this.f13992a.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "compared offline offlinebankcards:%s", bankcard3.field_bindSerial);
                if (bankcard3.field_bindSerial.equals(str)) {
                    return bankcard3;
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f13995d;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return null;
        }
        java.util.Iterator it6 = this.f13995d.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it6.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "compared bankcards:%s", bankcard4.field_bindSerial);
            if (bankcard4.field_bindSerial.equals(str)) {
                return bankcard4;
            }
        }
        return null;
    }

    public java.util.ArrayList h() {
        java.util.ArrayList arrayList = this.f13995d;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f13995d = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().y0();
        }
        java.util.ArrayList arrayList2 = this.f13995d;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = this.f13995d.iterator();
        while (it.hasNext()) {
            arrayList3.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next());
        }
        return arrayList3;
    }

    public void i(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList == null || arrayList2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "error list,bankcardsClone == null || virtualBankcardsClone == null");
            return;
        }
        if (this.f13994c == null && this.f13995d != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "listManageUIbankcards == null && bankcards != null");
            this.f13994c = this.f13995d;
        }
        if (this.f13994c == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "error list, listManageUIbankcards == null");
            return;
        }
        arrayList.clear();
        arrayList2.clear();
        java.util.ArrayList arrayList3 = this.f13994c;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next());
            }
        }
        java.util.ArrayList arrayList4 = this.f13996e;
        if (arrayList4 != null) {
            java.util.Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it6.next();
                if (bankcard.field_wxcreditState == 0) {
                    arrayList2.add(bankcard);
                } else {
                    arrayList.add(bankcard);
                }
            }
        }
    }

    public java.util.ArrayList j() {
        java.util.ArrayList arrayList = this.f13995d;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = this.f13995d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            if (!bankcard.w0() && !bankcard.A0()) {
                arrayList2.add(bankcard);
            }
        }
        return arrayList2;
    }

    public com.tencent.mm.plugin.wallet_core.model.Bankcard k(java.util.ArrayList arrayList, java.lang.String str, boolean z17, boolean z18) {
        return l(arrayList, str, z17, z18, false);
    }

    public com.tencent.mm.plugin.wallet_core.model.Bankcard l(java.util.ArrayList arrayList, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        at4.v1 v1Var;
        if (arrayList == null) {
            arrayList = this.f13995d;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "bindSerial is null ");
            gm0.j1.i();
            str = (java.lang.String) gm0.j1.u().c().l(196612, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "getDefaultRecommendBankcard bindSerial:%s", str);
        if (z17 && this.f13999h != null) {
            if (x()) {
                return this.f13999h;
            }
            if (str != null && str.equals(this.f13999h.field_bindSerial)) {
                return this.f13999h;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f14004m;
            if (bankcard != null && (v1Var = this.f13997f) != null && v1Var.field_lqt_state == 1 && str != null && str.equals(bankcard.field_bindSerial)) {
                return this.f14004m;
            }
            if (!y() && (arrayList == null || arrayList.size() == 0)) {
                return this.f13999h;
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "return not found bankcard!");
            return null;
        }
        if (arrayList.size() == 1 && z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUserInfoManger", "return only one bankcard：%s", ((com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList.get(0)).field_bindSerial);
            return (com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList.get(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "have multiple bankcards!");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "bankcard serial ：%s，title :%s", bankcard2.field_bindSerial, bankcard2.field_forbid_title);
                if (str.equals(bankcard2.field_bindSerial)) {
                    if (!z19 || !bankcard2.A0()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "return bankcard:%s", bankcard2.field_bindSerial);
                        return bankcard2;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "default card is honeypay");
                    if (z17 && this.f13999h != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "return balance");
                        return this.f13999h;
                    }
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it6.next();
                        if (!bankcard3.A0()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "return bankcard1:%s", bankcard3.field_bindSerial);
                            return bankcard3;
                        }
                    }
                }
            }
        }
        if (!z18) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "return bankcardList.get(0):%s", ((com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList.get(0)).field_bindSerial);
        return (com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList.get(0);
    }

    public java.lang.String m() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_lct_wording;
        }
        return null;
    }

    public java.util.ArrayList n(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17 && this.f13999h != null && !y()) {
            arrayList.add(this.f13999h);
        }
        java.util.ArrayList arrayList2 = this.f13993b;
        if (arrayList2 != null && this.f13995d != null && arrayList2.size() > 0) {
            java.util.Iterator it = this.f13993b.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                if (!bankcard.A0()) {
                    arrayList.add(bankcard);
                }
            }
        }
        return arrayList;
    }

    public int o() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_cre_type;
        }
        return 1;
    }

    public at4.u1 p() {
        at4.u1 u1Var = this.f14000i;
        return u1Var == null ? new at4.u1() : u1Var;
    }

    public java.lang.String q() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_true_name;
        }
        return null;
    }

    public at4.v1 r() {
        if (this.f13997f == null) {
            this.f13997f = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        }
        return this.f13997f;
    }

    public boolean s() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_is_reg == -1;
        }
        return true;
    }

    public boolean t() {
        at4.v1 v1Var = this.f13997f;
        return v1Var != null && v1Var.field_isDomesticUser;
    }

    public boolean u() {
        boolean z17 = x51.o1.f452042a;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, -1)).intValue();
        if (intValue != -1) {
            return intValue == 1;
        }
        at4.v1 v1Var = this.f13997f;
        return v1Var != null && v1Var.field_lqt_state == 1;
    }

    public boolean v() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_is_open_touch == 1;
        }
        return false;
    }

    public boolean w() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_is_reg == 1;
        }
        return false;
    }

    public boolean x() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_is_reg == 2;
        }
        return false;
    }

    public boolean y() {
        at4.v1 v1Var = this.f13997f;
        if (v1Var != null) {
            return v1Var.field_is_reg == 0;
        }
        return false;
    }

    public void z() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3;
        at4.k0 k0Var;
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletUserInfoManger", "Account Not Ready!");
            return;
        }
        at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        this.f13997f = y07;
        this.f14000i = new at4.u1(y07.field_switchConfig, y07.field_wallet_entrance_balance_switch_state);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f13997f.field_bank_priority)) {
            try {
                this.f14003l = at4.r1.i(new org.json.JSONObject(this.f13997f.field_bank_priority));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletUserInfoManger", e17, "", new java.lang.Object[0]);
            }
        }
        dt4.d Ri = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri.getClass();
        l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
        r45.ey4 ey4Var = null;
        android.database.Cursor f17 = Ri.f243234d.f("select * from WalletBankcard where cardType & 8 != 0 ", null, 2);
        if (f17 == null) {
            bankcard = null;
        } else {
            if (f17.moveToFirst()) {
                bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                bankcard.convertFrom(f17);
            } else {
                bankcard = null;
            }
            f17.close();
        }
        this.f13999h = bankcard;
        dt4.d Ri2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri2.getClass();
        android.database.Cursor f18 = Ri2.f243234d.f("select * from WalletBankcard where cardType & 64 != 0 ", null, 2);
        if (f18 == null) {
            bankcard2 = null;
        } else {
            if (f18.moveToFirst()) {
                bankcard2 = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                bankcard2.convertFrom(f18);
            } else {
                bankcard2 = null;
            }
            f18.close();
        }
        this.f14004m = bankcard2;
        at4.w1 w1Var = new at4.w1(this);
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.g1("wallet_balance", w1Var), null));
        this.f13995d = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().y0();
        this.f13992a = com.tencent.mm.plugin.wallet_core.utils.w0.c(8);
        this.f13994c = com.tencent.mm.plugin.wallet_core.utils.w0.c(12);
        dt4.d Ri3 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri3.getClass();
        android.database.Cursor f19 = Ri3.f243234d.f("select * from WalletBankcard where cardType & 4 != 0 ", null, 2);
        if (f19 == null) {
            arrayList = null;
        } else {
            if (f19.moveToFirst()) {
                arrayList = new java.util.ArrayList();
                do {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                    bankcard4.convertFrom(f19);
                    arrayList.add(bankcard4);
                } while (f19.moveToNext());
            } else {
                arrayList = null;
            }
            f19.close();
        }
        this.f13996e = arrayList;
        dt4.d Ri4 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri4.getClass();
        android.database.Cursor f27 = Ri4.f243234d.f("select * from WalletBankcard where cardType & 16 != 0 ", null, 2);
        if (f27 == null) {
            bankcard3 = null;
        } else {
            if (f27.moveToNext()) {
                bankcard3 = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
                bankcard3.convertFrom(f27);
            } else {
                bankcard3 = null;
            }
            f27.close();
        }
        this.f13998g = bankcard3;
        android.database.Cursor f28 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ui().f243227d.f("select * from LoanEntryInfo", null, 2);
        if (f28 == null) {
            k0Var = null;
        } else {
            if (f28.moveToFirst()) {
                k0Var = new at4.k0();
                k0Var.convertFrom(f28);
            } else {
                k0Var = null;
            }
            f28.close();
        }
        this.f14001j = k0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "loadDbData!");
        A();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_OFFLINE_GUIDE_BAR_CONFIG_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            r45.ey4 ey4Var2 = new r45.ey4();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                ey4Var2.f373810d = jSONObject.optInt("guide_type");
                java.lang.String optString = jSONObject.optString("guide_type");
                ey4Var2.f373811e = new r45.fy4();
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    ey4Var2.f373811e.f374730d = new org.json.JSONObject(optString).optString("bind_serial");
                }
                ey4Var2.f373812f = jSONObject.optInt("is_show_guide");
                ey4Var2.f373813g = jSONObject.optString("guide_content");
                ey4Var2.f373814h = jSONObject.optString("guide_content_color");
                ey4Var2.f373815i = jSONObject.optString("guide_btn_text");
                ey4Var2.f373816m = jSONObject.optString("guide_btn_text_color");
                ey4Var2.f373817n = jSONObject.optString("guide_btn_bg_color");
                ey4Var2.f373818o = jSONObject.optString("guide_logo");
                ey4Var2.f373819p = jSONObject.optString("background_color");
                ey4Var2.f373820q = jSONObject.optString("attach_info_left_wording");
                ey4Var2.f373821r = jSONObject.optString("attach_info_right_wording");
                ey4Var2.f373822s = jSONObject.optInt("btn_jump_mode");
                ey4Var2.f373823t = jSONObject.optString("btn_jump_h5");
                ey4Var2.f373824u = jSONObject.optString("btn_jump_tinyapp_username");
                ey4Var2.f373825v = jSONObject.optString("btn_jump_tinyapp_path");
                ey4Var2.f373826w = jSONObject.optString("dark_guide_btn_text_color");
                ey4Var2.f373827x = jSONObject.optString("dark_guide_btn_bg_color");
                ey4Var2.f373828y = jSONObject.optString("dark_background_color");
                ey4Var = ey4Var2;
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletQueryBankcardParser", "getOfflineGuideBarFromJSONStr() Exception:%s", e18.getMessage());
            }
        }
        this.f14005n = ey4Var;
    }
}

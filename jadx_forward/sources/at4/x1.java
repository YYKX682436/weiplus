package at4;

/* loaded from: classes9.dex */
public class x1 {

    /* renamed from: n, reason: collision with root package name */
    public r45.ey4 f95538n;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f95525a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f95526b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f95527c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f95528d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f95529e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public at4.v1 f95530f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f95531g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f95532h = null;

    /* renamed from: i, reason: collision with root package name */
    public at4.u1 f95533i = null;

    /* renamed from: j, reason: collision with root package name */
    public at4.k0 f95534j = null;

    /* renamed from: k, reason: collision with root package name */
    public at4.f f95535k = null;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f95536l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f95537m = null;

    /* renamed from: o, reason: collision with root package name */
    public long f95539o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();

    /* renamed from: p, reason: collision with root package name */
    public long f95540p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f95541q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f95542r = 10000;

    /* renamed from: s, reason: collision with root package name */
    public int f95543s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f95544t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f95545u = "";

    public x1() {
        z();
    }

    public final void A() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "recordDataState()");
        if (this.f95530f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "userInfo == null");
        }
        java.util.ArrayList arrayList = this.f95528d;
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "bankcards == null");
        } else if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == 0");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == " + this.f95528d.size());
        }
        java.util.ArrayList arrayList2 = this.f95529e;
        if (arrayList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "virtualBankcards == null");
        } else if (arrayList2.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == 0");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == " + this.f95529e.size());
        }
        if (this.f95532h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "balance == null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "balance != null");
        }
        if (this.f95531g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "historyBankcard == null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "historyBankcard != null");
        }
        if (this.f95534j == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo == null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo != null");
        }
    }

    public void B() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            v1Var.f67049xff817ee4 = -1;
            this.f95530f = null;
        }
        if (this.f95533i != null) {
            this.f95533i = null;
        }
        if (this.f95532h != null) {
            this.f95532h = null;
        }
        java.util.ArrayList arrayList = this.f95528d;
        if (arrayList != null) {
            arrayList.clear();
            this.f95528d = null;
        }
        java.util.ArrayList arrayList2 = this.f95529e;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.f95529e = null;
        }
        if (this.f95538n != null) {
            this.f95538n = null;
        }
        this.f95540p = 0L;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.c(new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance_version", -1), new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance_last_update_time", -1), new com.p314xaae8f345.mm.p2802xd031a825.ui.q1("wallet_balance", -1));
        this.f95539o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
    }

    public void C(at4.v1 v1Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2, at4.k0 k0Var, at4.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3, int i17, int i18, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "setBankcards scene %d", java.lang.Integer.valueOf(i18));
        if (i18 == 8) {
            this.f95525a = arrayList;
            this.f95536l = list;
        }
        if (i18 == 24 || i18 == 25) {
            this.f95526b = arrayList;
        }
        if (i18 == 12) {
            this.f95527c = arrayList;
        }
        this.f95528d = arrayList;
        this.f95529e = arrayList2;
        this.f95532h = c19091x9511676c;
        this.f95533i = new at4.u1(v1Var.f67065x3aaa9ebb, v1Var.f67070x94698091);
        this.f95531g = c19091x9511676c2;
        this.f95534j = k0Var;
        this.f95535k = fVar;
        this.f95537m = c19091x9511676c3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "setBankcards()! " + v1Var.f67065x3aaa9ebb);
        A();
        int i19 = i17 < 0 ? 600 : i17;
        this.f95539o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + i19;
        this.f95540p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + 600;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "hy: cache time: %d, dead time: %d, cacheDeadTime: %s", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(this.f95539o), java.lang.Long.valueOf(this.f95540p));
        if (i18 == 8 || i18 == 12 || i18 == 26) {
            dt4.c Ni = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ni();
            Ni.getClass();
            Ni.f324764d.A("WalletBankcardScene", "delete from WalletBankcardScene where scene=" + i18 + "");
        } else {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().f324767d.A("WalletBankcard", "delete from WalletBankcard");
        }
        if (i18 != 24 && i18 != 25 && arrayList != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.e(arrayList, i18);
        }
        if (arrayList2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.e(arrayList2, i18);
        }
        if (c19091x9511676c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.d(c19091x9511676c, i18);
        }
        if (c19091x9511676c2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.d(c19091x9511676c2, i18);
        }
        if (c19091x9511676c3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.d(c19091x9511676c3, i18);
        }
        H(v1Var);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).Ui().f324760d.A("LoanEntryInfo", "delete from LoanEntryInfo");
        if (k0Var != null) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Ui().mo880xb970c2b9(k0Var);
        }
    }

    public void D(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().w(196612, str);
    }

    public void E(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "setSelectBindSerial %s %s", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        if (str != null) {
            gm0.j1.i();
            gm0.j1.u().c().w(196633, str);
        }
    }

    public void F(r45.ey4 ey4Var) {
        java.lang.String str;
        this.f95538n = ey4Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OFFLINE_GUIDE_BAR_CONFIG_STRING_SYNC;
        if (ey4Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("guide_type", ey4Var.f455343d);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                r45.fy4 fy4Var = ey4Var.f455344e;
                if (fy4Var != null) {
                    jSONObject2.put("bind_serial", fy4Var.f456263d);
                }
                jSONObject.put("guide_data", jSONObject2.toString());
                jSONObject.put("is_show_guide", ey4Var.f455345f);
                jSONObject.put("guide_content", ey4Var.f455346g);
                jSONObject.put("guide_content_color", ey4Var.f455347h);
                jSONObject.put("guide_btn_text", ey4Var.f455348i);
                jSONObject.put("guide_btn_text_color", ey4Var.f455349m);
                jSONObject.put("guide_btn_bg_color", ey4Var.f455350n);
                jSONObject.put("guide_logo", ey4Var.f455351o);
                jSONObject.put("background_color", ey4Var.f455352p);
                jSONObject.put("attach_info_left_wording", ey4Var.f455353q);
                jSONObject.put("attach_info_right_wording", ey4Var.f455354r);
                jSONObject.put("btn_jump_mode", ey4Var.f455355s);
                jSONObject.put("btn_jump_h5", ey4Var.f455356t);
                jSONObject.put("btn_jump_tinyapp_username", ey4Var.f455357u);
                jSONObject.put("btn_jump_tinyapp_path", ey4Var.f455358v);
                jSONObject.put("dark_guide_btn_text_color", ey4Var.f455359w);
                jSONObject.put("dark_guide_btn_bg_color", ey4Var.f455360x);
                jSONObject.put("dark_background_color", ey4Var.f455361y);
                str = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getOfflineGuideBarJSONStr() Exception: %s", e17.getMessage());
            }
            c17.x(u3Var, str);
        }
        str = "";
        c17.x(u3Var, str);
    }

    public int G() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67064x95279ff9;
        }
        return 0;
    }

    public void H(at4.v1 v1Var) {
        this.f95530f = v1Var;
        ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().f324841d.A("WalletUserInfo", "delete from WalletUserInfo");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().mo880xb970c2b9(v1Var);
    }

    public java.util.ArrayList a(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            if (this.f95532h != null && !y()) {
                arrayList.add(this.f95532h);
            }
            if (this.f95537m != null && !y()) {
                arrayList.add(this.f95537m);
            }
        }
        java.util.ArrayList arrayList2 = this.f95528d;
        if (arrayList2 != null && arrayList2.size() > 0) {
            java.util.Iterator it = this.f95528d.iterator();
            while (it.hasNext()) {
                arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next());
            }
        }
        return arrayList;
    }

    public java.util.ArrayList b(boolean z17) {
        if (this.f95525a == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            if (this.f95532h != null && !y()) {
                arrayList.add(this.f95532h);
            }
            if (this.f95537m != null && !y()) {
                arrayList.add(this.f95537m);
            }
        }
        if (this.f95525a.size() > 0) {
            java.util.Iterator it = this.f95525a.iterator();
            while (it.hasNext()) {
                arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next());
            }
        }
        return arrayList;
    }

    public java.util.ArrayList c(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            if (this.f95532h != null && !y()) {
                arrayList.add(this.f95532h);
            }
            if (this.f95537m != null && !y()) {
                arrayList.add(this.f95537m);
            }
        }
        java.util.ArrayList arrayList2 = this.f95525a;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            java.util.ArrayList arrayList3 = this.f95528d;
            if (arrayList3 != null && arrayList3.size() > 0) {
                java.util.Iterator it = this.f95528d.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next());
                }
            }
        } else {
            java.util.Iterator it6 = this.f95525a.iterator();
            while (it6.hasNext()) {
                arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it6.next());
            }
        }
        return arrayList;
    }

    public java.lang.String d() {
        java.util.ArrayList arrayList = this.f95528d;
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
            return null;
        }
        java.util.Iterator it = this.f95528d.iterator();
        if (it.hasNext()) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next()).f69225xed6d60f6;
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c e(java.lang.String str) {
        java.util.ArrayList arrayList = this.f95528d;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = this.f95528d.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                if (c19091x9511676c.f69225xed6d60f6.equals(str)) {
                    return c19091x9511676c;
                }
            }
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f(java.lang.String str) {
        java.util.ArrayList b17 = b(true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || b17 == null || b17.isEmpty()) {
            return null;
        }
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
            if (c19091x9511676c.f69225xed6d60f6.equals(str)) {
                return c19091x9511676c;
            }
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c g(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2;
        if (z17 && (c19091x9511676c2 = this.f95532h) != null && c19091x9511676c2.f69225xed6d60f6.equals(str)) {
            return this.f95532h;
        }
        if (z18 && (c19091x9511676c = this.f95537m) != null && c19091x9511676c.f69225xed6d60f6.equals(str)) {
            return this.f95537m;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "need get bankcard is ：%s ", str);
        java.util.ArrayList arrayList = this.f95525a;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = this.f95525a.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "compared offline offlinebankcards:%s", c19091x9511676c3.f69225xed6d60f6);
                if (c19091x9511676c3.f69225xed6d60f6.equals(str)) {
                    return c19091x9511676c3;
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f95528d;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return null;
        }
        java.util.Iterator it6 = this.f95528d.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it6.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "compared bankcards:%s", c19091x9511676c4.f69225xed6d60f6);
            if (c19091x9511676c4.f69225xed6d60f6.equals(str)) {
                return c19091x9511676c4;
            }
        }
        return null;
    }

    public java.util.ArrayList h() {
        java.util.ArrayList arrayList = this.f95528d;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f95528d = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().y0();
        }
        java.util.ArrayList arrayList2 = this.f95528d;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = this.f95528d.iterator();
        while (it.hasNext()) {
            arrayList3.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next());
        }
        return arrayList3;
    }

    public void i(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList == null || arrayList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "error list,bankcardsClone == null || virtualBankcardsClone == null");
            return;
        }
        if (this.f95527c == null && this.f95528d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "listManageUIbankcards == null && bankcards != null");
            this.f95527c = this.f95528d;
        }
        if (this.f95527c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "error list, listManageUIbankcards == null");
            return;
        }
        arrayList.clear();
        arrayList2.clear();
        java.util.ArrayList arrayList3 = this.f95527c;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next());
            }
        }
        java.util.ArrayList arrayList4 = this.f95529e;
        if (arrayList4 != null) {
            java.util.Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it6.next();
                if (c19091x9511676c.f69263xe0badd12 == 0) {
                    arrayList2.add(c19091x9511676c);
                } else {
                    arrayList.add(c19091x9511676c);
                }
            }
        }
    }

    public java.util.ArrayList j() {
        java.util.ArrayList arrayList = this.f95528d;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = this.f95528d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
            if (!c19091x9511676c.w0() && !c19091x9511676c.A0()) {
                arrayList2.add(c19091x9511676c);
            }
        }
        return arrayList2;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c k(java.util.ArrayList arrayList, java.lang.String str, boolean z17, boolean z18) {
        return l(arrayList, str, z17, z18, false);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c l(java.util.ArrayList arrayList, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        at4.v1 v1Var;
        if (arrayList == null) {
            arrayList = this.f95528d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "bindSerial is null ");
            gm0.j1.i();
            str = (java.lang.String) gm0.j1.u().c().l(196612, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "getDefaultRecommendBankcard bindSerial:%s", str);
        if (z17 && this.f95532h != null) {
            if (x()) {
                return this.f95532h;
            }
            if (str != null && str.equals(this.f95532h.f69225xed6d60f6)) {
                return this.f95532h;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f95537m;
            if (c19091x9511676c != null && (v1Var = this.f95530f) != null && v1Var.f67060xa2dbcedc == 1 && str != null && str.equals(c19091x9511676c.f69225xed6d60f6)) {
                return this.f95537m;
            }
            if (!y() && (arrayList == null || arrayList.size() == 0)) {
                return this.f95532h;
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "return not found bankcard!");
            return null;
        }
        if (arrayList.size() == 1 && z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "return only one bankcard：%s", ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList.get(0)).f69225xed6d60f6);
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList.get(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "have multiple bankcards!");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "bankcard serial ：%s，title :%s", c19091x9511676c2.f69225xed6d60f6, c19091x9511676c2.f69240x24ff0512);
                if (str.equals(c19091x9511676c2.f69225xed6d60f6)) {
                    if (!z19 || !c19091x9511676c2.A0()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "return bankcard:%s", c19091x9511676c2.f69225xed6d60f6);
                        return c19091x9511676c2;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "default card is honeypay");
                    if (z17 && this.f95532h != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "return balance");
                        return this.f95532h;
                    }
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it6.next();
                        if (!c19091x9511676c3.A0()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "return bankcard1:%s", c19091x9511676c3.f69225xed6d60f6);
                            return c19091x9511676c3;
                        }
                    }
                }
            }
        }
        if (!z18) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "return bankcardList.get(0):%s", ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList.get(0)).f69225xed6d60f6);
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList.get(0);
    }

    public java.lang.String m() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67052xcb187071;
        }
        return null;
    }

    public java.util.ArrayList n(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17 && this.f95532h != null && !y()) {
            arrayList.add(this.f95532h);
        }
        java.util.ArrayList arrayList2 = this.f95526b;
        if (arrayList2 != null && this.f95528d != null && arrayList2.size() > 0) {
            java.util.Iterator it = this.f95526b.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                if (!c19091x9511676c.A0()) {
                    arrayList.add(c19091x9511676c);
                }
            }
        }
        return arrayList;
    }

    public int o() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67042x8a2885a8;
        }
        return 1;
    }

    public at4.u1 p() {
        at4.u1 u1Var = this.f95533i;
        return u1Var == null ? new at4.u1() : u1Var;
    }

    public java.lang.String q() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67066xeae73197;
        }
        return null;
    }

    public at4.v1 r() {
        if (this.f95530f == null) {
            this.f95530f = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        }
        return this.f95530f;
    }

    public boolean s() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67049xff817ee4 == -1;
        }
        return true;
    }

    public boolean t() {
        at4.v1 v1Var = this.f95530f;
        return v1Var != null && v1Var.f67046xf0b0ce38;
    }

    public boolean u() {
        boolean z17 = x51.o1.f533575a;
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, -1)).intValue();
        if (intValue != -1) {
            return intValue == 1;
        }
        at4.v1 v1Var = this.f95530f;
        return v1Var != null && v1Var.f67060xa2dbcedc == 1;
    }

    public boolean v() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67048x2bf388ba == 1;
        }
        return false;
    }

    public boolean w() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67049xff817ee4 == 1;
        }
        return false;
    }

    public boolean x() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67049xff817ee4 == 2;
        }
        return false;
    }

    public boolean y() {
        at4.v1 v1Var = this.f95530f;
        if (v1Var != null) {
            return v1Var.f67049xff817ee4 == 0;
        }
        return false;
    }

    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3;
        at4.k0 k0Var;
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletUserInfoManger", "Account Not Ready!");
            return;
        }
        at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
        this.f95530f = y07;
        this.f95533i = new at4.u1(y07.f67065x3aaa9ebb, y07.f67070x94698091);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f95530f.f67039x86a71dc2)) {
            try {
                this.f95536l = at4.r1.i(new org.json.JSONObject(this.f95530f.f67039x86a71dc2));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletUserInfoManger", e17, "", new java.lang.Object[0]);
            }
        }
        dt4.d Ri = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri.getClass();
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
        r45.ey4 ey4Var = null;
        android.database.Cursor f17 = Ri.f324767d.f("select * from WalletBankcard where cardType & 8 != 0 ", null, 2);
        if (f17 == null) {
            c19091x9511676c = null;
        } else {
            if (f17.moveToFirst()) {
                c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                c19091x9511676c.mo9015xbf5d97fd(f17);
            } else {
                c19091x9511676c = null;
            }
            f17.close();
        }
        this.f95532h = c19091x9511676c;
        dt4.d Ri2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri2.getClass();
        android.database.Cursor f18 = Ri2.f324767d.f("select * from WalletBankcard where cardType & 64 != 0 ", null, 2);
        if (f18 == null) {
            c19091x9511676c2 = null;
        } else {
            if (f18.moveToFirst()) {
                c19091x9511676c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                c19091x9511676c2.mo9015xbf5d97fd(f18);
            } else {
                c19091x9511676c2 = null;
            }
            f18.close();
        }
        this.f95537m = c19091x9511676c2;
        at4.w1 w1Var = new at4.w1(this);
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new c01.ra(new com.p314xaae8f345.mm.p2802xd031a825.ui.g1("wallet_balance", w1Var), null));
        this.f95528d = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().y0();
        this.f95525a = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.c(8);
        this.f95527c = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w0.c(12);
        dt4.d Ri3 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri3.getClass();
        android.database.Cursor f19 = Ri3.f324767d.f("select * from WalletBankcard where cardType & 4 != 0 ", null, 2);
        if (f19 == null) {
            arrayList = null;
        } else {
            if (f19.moveToFirst()) {
                arrayList = new java.util.ArrayList();
                do {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                    c19091x9511676c4.mo9015xbf5d97fd(f19);
                    arrayList.add(c19091x9511676c4);
                } while (f19.moveToNext());
            } else {
                arrayList = null;
            }
            f19.close();
        }
        this.f95529e = arrayList;
        dt4.d Ri4 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
        Ri4.getClass();
        android.database.Cursor f27 = Ri4.f324767d.f("select * from WalletBankcard where cardType & 16 != 0 ", null, 2);
        if (f27 == null) {
            c19091x9511676c3 = null;
        } else {
            if (f27.moveToNext()) {
                c19091x9511676c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                c19091x9511676c3.mo9015xbf5d97fd(f27);
            } else {
                c19091x9511676c3 = null;
            }
            f27.close();
        }
        this.f95531g = c19091x9511676c3;
        android.database.Cursor f28 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ui().f324760d.f("select * from LoanEntryInfo", null, 2);
        if (f28 == null) {
            k0Var = null;
        } else {
            if (f28.moveToFirst()) {
                k0Var = new at4.k0();
                k0Var.mo9015xbf5d97fd(f28);
            } else {
                k0Var = null;
            }
            f28.close();
        }
        this.f95534j = k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "loadDbData!");
        A();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OFFLINE_GUIDE_BAR_CONFIG_STRING_SYNC, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            r45.ey4 ey4Var2 = new r45.ey4();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                ey4Var2.f455343d = jSONObject.optInt("guide_type");
                java.lang.String optString = jSONObject.optString("guide_type");
                ey4Var2.f455344e = new r45.fy4();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    ey4Var2.f455344e.f456263d = new org.json.JSONObject(optString).optString("bind_serial");
                }
                ey4Var2.f455345f = jSONObject.optInt("is_show_guide");
                ey4Var2.f455346g = jSONObject.optString("guide_content");
                ey4Var2.f455347h = jSONObject.optString("guide_content_color");
                ey4Var2.f455348i = jSONObject.optString("guide_btn_text");
                ey4Var2.f455349m = jSONObject.optString("guide_btn_text_color");
                ey4Var2.f455350n = jSONObject.optString("guide_btn_bg_color");
                ey4Var2.f455351o = jSONObject.optString("guide_logo");
                ey4Var2.f455352p = jSONObject.optString("background_color");
                ey4Var2.f455353q = jSONObject.optString("attach_info_left_wording");
                ey4Var2.f455354r = jSONObject.optString("attach_info_right_wording");
                ey4Var2.f455355s = jSONObject.optInt("btn_jump_mode");
                ey4Var2.f455356t = jSONObject.optString("btn_jump_h5");
                ey4Var2.f455357u = jSONObject.optString("btn_jump_tinyapp_username");
                ey4Var2.f455358v = jSONObject.optString("btn_jump_tinyapp_path");
                ey4Var2.f455359w = jSONObject.optString("dark_guide_btn_text_color");
                ey4Var2.f455360x = jSONObject.optString("dark_guide_btn_bg_color");
                ey4Var2.f455361y = jSONObject.optString("dark_background_color");
                ey4Var = ey4Var2;
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletQueryBankcardParser", "getOfflineGuideBarFromJSONStr() Exception:%s", e18.getMessage());
            }
        }
        this.f95538n = ey4Var;
    }
}

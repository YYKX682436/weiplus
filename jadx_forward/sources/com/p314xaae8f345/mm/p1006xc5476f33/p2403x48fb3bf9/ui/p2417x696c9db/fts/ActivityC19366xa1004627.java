package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19366xa1004627 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 implements tj5.n {
    public android.view.View F4;
    public android.view.View G4;
    public android.view.View H4;
    public android.view.View I4;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 J4;
    public boolean K4;
    public boolean L4;
    public boolean M4;
    public boolean N4;
    public android.widget.ImageView O4;
    public android.widget.ImageView P4;
    public java.util.List R4;
    public boolean V4;
    public boolean X4;
    public boolean Q4 = false;
    public int S4 = 0;
    public boolean T4 = false;
    public boolean U4 = false;
    public boolean W4 = false;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.a0 Y4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.a0(this, null);

    public static void ha(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, long j17, java.lang.String str5) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o(str, str2, str3, i17, i18, i19, str4, j17, str5));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        int i18 = this.f265778b4;
        this.f265778b4 = i17;
        if (i18 != i17) {
            ra();
        }
        if (this.R4 == null) {
            this.R4 = new java.util.ArrayList();
        }
        boolean z17 = false;
        if (P9().length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0();
            b0Var.f265879d = this.f265778b4;
            b0Var.f265878c = new java.util.ArrayList(this.J4.m80975xe175c322());
            b0Var.f265877b = this.J4.m80970x134c2d56();
            b0Var.f265876a = this.J4.m80978xc3706fda();
            if (this.R4.size() == 0) {
                this.R4.add(b0Var);
            } else if (!b0Var.m74459xb2c87fbf((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0) this.R4.get(0))) {
                this.R4.add(0, b0Var);
            }
            la(this.R4);
        }
        java.util.List list = this.R4;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0) this.R4.get(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0();
        b0Var3.f265879d = i17;
        b0Var3.f265876a = str;
        b0Var3.f265880e = map;
        if (b0Var2 != null) {
            boolean z18 = true;
            if (b0Var2 != b0Var3) {
                if (i17 == b0Var2.f265879d && str.trim().equals(b0Var2.f265876a.trim())) {
                    z17 = true;
                }
                z18 = z17;
            }
            if (z18) {
                b0Var2.f265880e = map;
            }
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onEditTextChange %s %s %s %s %s %s", str, str2, this.f265781e4, oVar, java.lang.Boolean.valueOf(this.T4), java.lang.Boolean.valueOf(this.f265780d4));
        if (this.f265780d4 && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265781e4) || !this.f265781e4.contentEquals(str))) {
            this.f265780d4 = false;
        }
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            Y9(0, 1);
        } else if (oVar == tj5.o.SetText && this.J4.k()) {
            this.J4.r();
        }
    }

    @Override // tj5.n
    public boolean G0() {
        va(true);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public java.lang.String G7() {
        return this.B3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public java.lang.String N9() {
        return this.J4.m80970x134c2d56();
    }

    @Override // qx4.b
    public void O5() {
        this.J4.d();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public org.json.JSONArray O9() {
        java.util.List<tj5.x> m80975xe175c322 = this.J4.m80975xe175c322();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<tj5.x> it = m80975xe175c322.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tagName", xVar.f266248d);
                jSONObject.put("tagType", xVar.f266249e);
                jSONObject.put("userName", xVar.f266250f);
                jSONArray.put(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public java.lang.String P9() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = this.J4;
        return c19227x8f71d8b3 != null ? c19227x8f71d8b3.m80978xc3706fda() : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void R7(int i17, android.os.Bundle bundle) {
        if (i17 == 138) {
            java.lang.String string = bundle.getString("fts_key_data");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                this.S4 = 0;
            } else if (ya.b.f77479x42930b2.equals(string)) {
                this.S4 = 1;
            } else if ("result".equals(string)) {
                this.S4 = 2;
            } else if ("suggestion".equals(string)) {
                this.S4 = 3;
            } else if ("teach".equals(string)) {
                this.S4 = 4;
            } else if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1918xa622cbca.f5943x453e74b.equals(string)) {
                this.S4 = 5;
            } else if ("history".equals(string)) {
                this.S4 = 6;
            } else {
                this.S4 = 0;
            }
            this.f265786j4 = this.S4;
            return;
        }
        if (i17 == 147) {
            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.n(this, bundle.getInt("ret"), bundle.getLong("reqId"), bundle.getString("json", "")));
            return;
        }
        if (i17 != 100001) {
            if (i17 == 143) {
                this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h(this, bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)));
                return;
            }
            if (i17 != 144) {
                switch (i17) {
                    case 60:
                        if (ga()) {
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.BaseSOSWebViewUI", "current state is not search");
                        return;
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                    case 62:
                        return;
                    default:
                        switch (i17) {
                            case 119:
                                this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f(this, bundle.getBundle("fts_key_data"), bundle.getString("fts_key_json_data"), bundle.getBoolean("fts_key_new_query", true), bundle.getString("fts_key_req_id")));
                                return;
                            case 120:
                                this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.i(this, bundle.getInt("fts_key_ret", 0), bundle.getString("fts_key_data")));
                                return;
                            case 121:
                                o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j(this, bundle.getInt("fts_key_teach_request_type", 0), bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0)));
                                return;
                            case 122:
                                java.lang.String string2 = bundle.getString("fts_key_new_query");
                                java.lang.String string3 = bundle.getString("fts_key_custom_query");
                                boolean z17 = bundle.getBoolean("fts_key_need_keyboard", false);
                                java.lang.String string4 = bundle.getString("fts_key_tag_list");
                                java.lang.String P9 = P9();
                                boolean z18 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) || !P9.equals(string2)) ? false : true;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b, needSosEditTextToBeTouchOnly %b, isFromVoice %b, isNoChange %b", string2, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.T4), java.lang.Boolean.valueOf(this.f265780d4), java.lang.Boolean.valueOf(z18));
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                try {
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                                        org.json.JSONArray jSONArray = new org.json.JSONArray(string4);
                                        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x(this);
                                            xVar.f266248d = jSONObject.getString("tagName");
                                            xVar.f266249e = jSONObject.getInt("tagType");
                                            xVar.f266250f = jSONObject.getString("userName");
                                            arrayList.add(xVar);
                                        }
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                if (this.J4 != null) {
                                    int size = arrayList.size();
                                    tj5.o oVar = tj5.o.UserInput;
                                    tj5.o oVar2 = tj5.o.SetText;
                                    if (size > 0) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = this.J4;
                                        if (!z17) {
                                            oVar = oVar2;
                                        }
                                        c19227x8f71d8b3.o(string3, arrayList, oVar);
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b32 = this.J4;
                                        if (!z17) {
                                            oVar = oVar2;
                                        }
                                        c19227x8f71d8b32.o(string2, arrayList, oVar);
                                    }
                                }
                                if (z17) {
                                    Y9(0, 1);
                                    return;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b33 = this.J4;
                                if (c19227x8f71d8b33 != null) {
                                    this.U4 = !z18 && c19227x8f71d8b33.k();
                                    this.J4.d();
                                    return;
                                }
                                return;
                            default:
                                switch (i17) {
                                    case 124:
                                        this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.k(this, bundle.getString("fts_key_json_data")));
                                        return;
                                    case 125:
                                        this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.m(this, bundle.getString("fts_key_sns_id"), bundle.getInt("fts_key_status", 0)));
                                        return;
                                    case 126:
                                        bundle.getString("fts_key_json_data");
                                        bundle.getBoolean("fts_key_new_query", true);
                                        java.util.HashMap hashMap = new java.util.HashMap();
                                        for (java.lang.String str : bundle.keySet()) {
                                            hashMap.put(str, bundle.get(str));
                                        }
                                        this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.d(this, hashMap));
                                        return;
                                    case 127:
                                        o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.g(this, bundle.getString("fts_key_json_data"), bundle.getString("fts_key_req_id")));
                                        return;
                                    default:
                                        super.R7(i17, bundle);
                                        return;
                                }
                        }
                }
            }
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "needSosEditTextToBeTouchOnly = %s, isFromVoice = %s, isSettingTextFromJS = %s.", java.lang.Boolean.valueOf(this.T4), java.lang.Boolean.valueOf(this.f265780d4), java.lang.Boolean.valueOf(this.U4));
        if (this.T4) {
            return;
        }
        if (this.U4) {
            this.U4 = false;
        } else {
            Y9(0, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public boolean X9() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void ba() {
        super.ba();
        try {
            java.lang.String encode = java.net.URLEncoder.encode(N9(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6701x8103a0ed c6701x8103a0ed = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6701x8103a0ed();
            c6701x8103a0ed.f140389d = c6701x8103a0ed.b("Query", encode, true);
            c6701x8103a0ed.f140391f = this.Y3;
            c6701x8103a0ed.f140396k = 6010L;
            c6701x8103a0ed.f140401p = c6701x8103a0ed.b("SessionId", this.B3, true);
            c6701x8103a0ed.f140405t = java.lang.System.currentTimeMillis();
            c6701x8103a0ed.k();
            c6701x8103a0ed.o();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e76 = super.e7();
        e76.E(this.Y4);
        return e76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean f8() {
        return true;
    }

    public boolean ga() {
        return true;
    }

    public java.lang.String ia() {
        return null;
    }

    public int ja() {
        return 0;
    }

    public java.lang.String ka() {
        return "";
    }

    public void la(java.util.List list) {
    }

    public boolean ma() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "isBackToHistory isHomePage = %s", java.lang.Boolean.valueOf(this.N4));
        java.util.List list = this.R4;
        return list != null && ((java.util.ArrayList) list).size() > 1;
    }

    public void na() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onClickBackBtn isHomePage = %s", java.lang.Boolean.valueOf(this.N4));
        ua(false);
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
        if (this.J4.k()) {
            return;
        }
        this.J4.m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean o7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void o8() {
        na();
    }

    public void oa() {
        if (!this.K4) {
            this.J4.n("", null);
        }
        mo48674x36654fab();
        this.W4 = true;
        Z9(1, 1, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b(this));
        this.R4 = null;
        this.V4 = false;
        G9(vu4.a.K, vu4.b.A);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265779c4);
        java.util.HashMap hashMap = this.f265794s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f265779c4);
        }
        hashMap.put("exittype", "4");
        ua(true);
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = this.J4;
        if (c19227x8f71d8b3 != null) {
            if (!c19227x8f71d8b3.k()) {
                this.J4.m();
                mo26063x7b383410();
            }
            this.J4.m80989x764b0e09(ia());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.K4 = getIntent().getBooleanExtra("ftsInitToSearch", false);
        this.L4 = getIntent().getBooleanExtra("ftsNeedShowCamera", true);
        this.M4 = getIntent().getBooleanExtra("need_show_query_first", false);
        this.N4 = "1".equals(((java.util.HashMap) w9()).get("isHomePage"));
        this.T4 = getIntent().getBooleanExtra("fts_need_sos_edittext_tobe_touch_only", false);
        mo2533x106ab264().o();
        this.G4 = findViewById(com.p314xaae8f345.mm.R.id.mfi);
        this.H4 = findViewById(com.p314xaae8f345.mm.R.id.mek);
        this.I4 = findViewById(com.p314xaae8f345.mm.R.id.mde);
        this.F4 = findViewById(com.p314xaae8f345.mm.R.id.mel);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3) findViewById(com.p314xaae8f345.mm.R.id.ndt);
        this.J4 = c19227x8f71d8b3;
        c19227x8f71d8b3.m80988xce28f7ee(this);
        this.J4.m80989x764b0e09(ia());
        this.J4.m74108x4467b9ee(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.l(this));
        if (this.J4.m80966xdb574fcd() != null) {
            this.J4.m80966xdb574fcd().setText(this.f265779c4);
        }
        this.O4 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aa8);
        this.P4 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.msh);
        if (this.T4) {
            android.view.View view = this.I4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.J4.setFocusable(false);
            this.J4.d();
            android.view.View view2 = this.H4;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.G4;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.G4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p(this));
                this.J4.m74107x6601d973(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.q(this));
            }
            this.J4.m80985x1905aeff(true);
            this.J4.f();
            android.view.View view4 = this.F4;
            if (view4 != null) {
                view4.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b3b));
            }
            if (this.J4.m74102xf2c200a5() != null) {
                this.J4.m74102xf2c200a5().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.r(this), 200L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "searchInputLayout = " + this.F4 + ", searchSosEditTextMask = " + this.G4);
        } else {
            android.view.View view5 = this.G4;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.O4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.s(this));
        this.f265348f.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.t(this));
        if (this.R3) {
            m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u(this), 128L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "oncreate isNeedShowCamera = " + this.L4);
        if (!this.L4) {
            this.J4.m74113x78e570b3(true);
            this.J4.m74112x9e8eda7(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7 s7Var = this.f265337a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        int i17 = this.H3;
        if (i17 == 1) {
            this.J4.m80966xdb574fcd().setHintTextColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            this.J4.m80966xdb574fcd().setTextColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        } else if (i17 == 2) {
            this.J4.m80966xdb574fcd().setHintTextColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
            this.J4.m80966xdb574fcd().setTextColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        try {
            if (this.K1 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("webview_id", hashCode());
                this.K1.U6(1, bundle);
            }
        } catch (android.os.RemoteException unused) {
        }
        mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.a0 a0Var = this.Y4;
        e3Var.M0(a0Var);
        this.L1.K0(a0Var.f265866b);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void pa() {
    }

    public void qa() {
    }

    public void ra() {
    }

    public void sa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onWebViewPageLoaded %b", java.lang.Boolean.valueOf(this.A3));
    }

    public void ta() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "onWebViewPageStartLoad");
    }

    public void ua(boolean z17) {
        mo48674x36654fab();
        Q9();
        if (ma()) {
            ((java.util.ArrayList) this.R4).remove(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0) ((java.util.ArrayList) this.R4).get(0);
            this.J4.n(b0Var.f265877b, b0Var.f265878c);
            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.a(this, b0Var));
            return;
        }
        java.util.List list = this.R4;
        if ((list == null || ((java.util.ArrayList) list).size() <= 1) && this.G3 && !this.J4.m80978xc3706fda().isEmpty()) {
            java.util.List list2 = this.R4;
            if (list2 != null && !((java.util.ArrayList) list2).isEmpty()) {
                ((java.util.ArrayList) this.R4).clear();
            }
            this.J4.m80987x9d01ed35(false);
            this.J4.e();
            this.J4.d();
            return;
        }
        if (!this.V4) {
            if (z17) {
                G9(vu4.a.K, vu4.b.f521806w);
            } else {
                G9(vu4.a.K, vu4.b.f521808y);
            }
            finish();
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265779c4);
        java.util.HashMap hashMap = this.f265794s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f265779c4);
        }
        hashMap.put("exittype", "3");
        oa();
    }

    public void va(boolean z17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "shouldReturnStartSearch, isKeyBoardSearch: ".concat(z17 ? "YES" : "NO"));
        this.J4.d();
        mo48674x36654fab();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.J4.m80972xc738b2f5()) || P9().length() > 0) {
            i17 = 0;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = this.J4;
            c19227x8f71d8b3.n(c19227x8f71d8b3.m80972xc738b2f5(), this.J4.m80975xe175c322());
            i17 = 1;
        }
        if (P9().length() > 0) {
            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.c(this, i17, z17));
            mo48674x36654fab();
            this.V4 = true;
        }
    }
}

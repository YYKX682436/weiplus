package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19391xc941d0e extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 implements tj5.y, tj5.n, tj5.l {
    public tj5.z F4;
    public android.view.View G4;
    public android.view.View H4;
    public int I4;
    public boolean J4;
    public int K4;
    public boolean L4;
    public boolean M4;
    public boolean N4;
    public boolean O4;
    public final java.util.LinkedList P4 = new java.util.LinkedList();
    public boolean Q4 = true;
    public int R4 = 0;
    public boolean S4 = true;
    public boolean T4 = false;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4 U4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4(this, null);
    public boolean V4 = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        java.util.LinkedList linkedList = this.P4;
        linkedList.remove(str);
        linkedList.add(str);
        if (linkedList != null) {
            linkedList.size();
            if (linkedList.size() > 1 || this.N4 || this.O4) {
                this.F4.mo81011x2a82112(0);
            }
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onEditTextChange %s %s %s", str, str2, oVar);
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            Y9(0, 1);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onSearchKeyDown");
        ja();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public java.lang.String N9() {
        return this.F4.mo81005xdc5215a6().m80970x134c2d56();
    }

    @Override // qx4.b
    public void O5() {
        this.F4.mo81005xdc5215a6().d();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public org.json.JSONArray O9() {
        java.util.List<tj5.x> m80975xe175c322 = this.F4.mo81005xdc5215a6().m80975xe175c322();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<tj5.x> it = m80975xe175c322.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.z3 z3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.z3) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tagName", z3Var.f266273d);
                jSONObject.put("tagType", z3Var.f266274e);
                jSONObject.put("userName", z3Var.f266275f);
                jSONArray.put(jSONObject);
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public java.lang.String P9() {
        return this.F4.mo81005xdc5215a6().m80978xc3706fda();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void R7(int i17, android.os.Bundle bundle) {
        if (i17 != 144) {
            if (i17 == 147) {
                this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.l3(this, bundle.getInt("ret"), bundle.getLong("reqId"), bundle.getString("json", "")));
                return;
            }
            if (i17 != 154) {
                if (i17 != 100001) {
                    switch (i17) {
                        case 60:
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                        case 62:
                            return;
                        default:
                            switch (i17) {
                                case 119:
                                    o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v3(this, bundle.getBundle("fts_key_data"), bundle.getString("fts_key_json_data"), bundle.getBoolean("fts_key_new_query", true), bundle.getString("fts_key_req_id")));
                                    return;
                                case 120:
                                    this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.w3(this, bundle.getInt("fts_key_ret", 0), bundle.getString("fts_key_data")));
                                    return;
                                case 121:
                                    o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x3(this, bundle.getInt("fts_key_teach_request_type", 0), bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0)));
                                    return;
                                case 122:
                                    java.lang.String string = bundle.getString("fts_key_new_query");
                                    java.lang.String string2 = bundle.getString("fts_key_custom_query");
                                    boolean z17 = bundle.getBoolean("fts_key_need_keyboard", false);
                                    java.lang.String string3 = bundle.getString("fts_key_tag_list");
                                    boolean z18 = bundle.getBoolean("fts_key_cache", false);
                                    java.lang.String P9 = P9();
                                    boolean z19 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || !P9.equals(string)) ? false : true;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange: %b isNoChange: %b", string, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    try {
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                                            org.json.JSONArray jSONArray = new org.json.JSONArray(string3);
                                            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.z3 z3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.z3(this);
                                                z3Var.f266273d = jSONObject.getString("tagName");
                                                z3Var.f266274e = jSONObject.getInt("tagType");
                                                z3Var.f266275f = jSONObject.getString("userName");
                                                arrayList.add(z3Var);
                                            }
                                        }
                                    } catch (java.lang.Exception unused) {
                                    }
                                    if (this.F4 != null) {
                                        int size = arrayList.size();
                                        tj5.o oVar = tj5.o.UserInput;
                                        tj5.o oVar2 = tj5.o.SetText;
                                        if (size > 0) {
                                            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 mo81005xdc5215a6 = this.F4.mo81005xdc5215a6();
                                            if (!z17) {
                                                oVar = oVar2;
                                            }
                                            mo81005xdc5215a6.o(string2, arrayList, oVar);
                                            if (z18) {
                                                B9(0, string2, null);
                                            }
                                        } else {
                                            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 mo81005xdc5215a62 = this.F4.mo81005xdc5215a6();
                                            if (!z17) {
                                                oVar = oVar2;
                                            }
                                            mo81005xdc5215a62.o(string, arrayList, oVar);
                                            if (z18) {
                                                B9(0, string, null);
                                            }
                                        }
                                    }
                                    if (z17) {
                                        Y9(0, 1);
                                        return;
                                    }
                                    tj5.z zVar = this.F4;
                                    if (zVar != null) {
                                        this.T4 = !z19 && zVar.mo81005xdc5215a6().k();
                                        this.F4.mo81005xdc5215a6().d();
                                        T9(java.lang.Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i17) {
                                        case 124:
                                            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.y3(this, bundle.getString("fts_key_json_data")));
                                            return;
                                        case 125:
                                            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.k3(this, bundle.getString("fts_key_sns_id"), bundle.getInt("fts_key_status", 0)));
                                            return;
                                        case 126:
                                            bundle.getString("fts_key_json_data");
                                            bundle.getBoolean("fts_key_new_query", true);
                                            java.util.HashMap hashMap = new java.util.HashMap();
                                            for (java.lang.String str : bundle.keySet()) {
                                                hashMap.put(str, bundle.get(str));
                                            }
                                            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u3(this, hashMap));
                                            return;
                                    }
                            }
                    }
                }
                return;
            }
            if (bundle.getString("fts_key_data", "").equals("configNavBar")) {
                java.lang.String string4 = bundle.getString("recommendSearchQuery", "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                    this.F4.mo81005xdc5215a6().m80992x157d7269("");
                    this.F4.mo81005xdc5215a6().m80989x764b0e09(ga());
                } else {
                    this.F4.mo81005xdc5215a6().m80992x157d7269(string4);
                }
            }
            super.R7(i17, bundle);
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            if (this.T4) {
                this.T4 = false;
            } else {
                Y9(0, 1);
            }
        }
    }

    @Override // tj5.l
    public boolean Y3(android.view.View view) {
        ja();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e76 = super.e7();
        e76.E(this.U4);
        return e76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean f8() {
        return true;
    }

    public java.lang.String ga() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bdd;
    }

    public final boolean ha() {
        java.util.LinkedList linkedList = this.P4;
        if (linkedList.size() > 1) {
            linkedList.removeLast();
            this.F4.mo81005xdc5215a6().n((java.lang.String) linkedList.getLast(), null);
            this.F4.mo81005xdc5215a6().d();
            this.F4.mo81011x2a82112(0);
            mo48674x36654fab();
            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.t3(this, 1));
            return false;
        }
        if (!this.G3 || this.F4.mo81005xdc5215a6().m80978xc3706fda().isEmpty()) {
            mo48674x36654fab();
            finish();
            return true;
        }
        if (!linkedList.isEmpty()) {
            linkedList.removeLast();
        }
        this.F4.mo81005xdc5215a6().e();
        this.F4.mo81005xdc5215a6().d();
        return false;
    }

    public void ia() {
        this.F4.mo81005xdc5215a6().n("", null);
        Z9(1, 1, true, null);
        this.F4.mo81005xdc5215a6().d();
        mo48674x36654fab();
        G9(vu4.a.K, vu4.b.A);
    }

    public final void ja() {
        tj5.z zVar = this.F4;
        if (zVar != null && zVar.mo81005xdc5215a6() != null) {
            this.F4.mo81005xdc5215a6().d();
            this.F4.mo81005xdc5215a6().v(false);
        }
        mo48674x36654fab();
        this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.t3(this, 0));
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
        if (this.F4.mo81005xdc5215a6().k()) {
            return;
        }
        this.F4.mo81005xdc5215a6().m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean o7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void o8() {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265779c4);
        java.util.HashMap hashMap = this.f265794s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f265779c4);
        }
        hashMap.put("exittype", "4");
        ha();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 800) {
            this.F4.mo81011x2a82112(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (ha()) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265779c4);
            java.util.HashMap hashMap = this.f265794s4;
            if (K0) {
                hashMap.put("query", N9());
            } else {
                hashMap.put("query", this.f265779c4);
            }
            hashMap.put("exittype", "4");
            super.onBackPressed();
        }
    }

    @Override // tj5.y
    /* renamed from: onClickBackBtn */
    public void mo74457x81ab18cc(android.view.View view) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265779c4);
        java.util.HashMap hashMap = this.f265794s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f265779c4);
        }
        hashMap.put("exittype", "3");
        ha();
    }

    @Override // tj5.y
    /* renamed from: onClickCancelBtn */
    public void mo74458x91b34899(android.view.View view) {
        if (this.V4) {
            return;
        }
        this.V4 = true;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22483x6b4c354e c22483x6b4c354e = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22483x6b4c354e) this.F4;
        float x17 = c22483x6b4c354e.getX();
        float y17 = c22483x6b4c354e.getY();
        float scaleX = c22483x6b4c354e.getScaleX();
        float scaleY = c22483x6b4c354e.getScaleY();
        float translationX = c22483x6b4c354e.getTranslationX();
        float translationY = c22483x6b4c354e.getTranslationY();
        int measuredWidth = c22483x6b4c354e.getMeasuredWidth();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c22483x6b4c354e, "scaleY", 1.0f, 0.7f);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(measuredWidth, 200);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "ljd x:%f, transX:%f, originalWidth:%d", java.lang.Float.valueOf(x17), java.lang.Float.valueOf(translationX), java.lang.Integer.valueOf(measuredWidth));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c22483x6b4c354e, "translationX", measuredWidth + org.p3343x72743996.net.InterfaceC29524x4f65168b.f73913x76158116);
        arrayList.add(ofFloat);
        arrayList.add(ofInt);
        arrayList.add(ofFloat2);
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.m3(this, measuredWidth, c22483x6b4c354e));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o3(this, c22483x6b4c354e, scaleX, scaleY, x17, y17, translationX, translationY, measuredWidth));
        animatorSet.start();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        tj5.z zVar = this.F4;
        if (zVar != null) {
            if (!zVar.mo81005xdc5215a6().k()) {
                this.F4.mo81005xdc5215a6().m();
            }
            this.F4.mo81005xdc5215a6().m80989x764b0e09(ga());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("ftsForceShowDarkMode", false);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_page_support_force_night_mode, 1) == 1;
        this.J4 = booleanExtra && z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "isOpenForceNightMode = %s， showDarkMode = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(booleanExtra));
        super.onCreate(bundle);
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        int i17 = com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381.I;
        this.Q4 = j62.e.g().i("clicfg_websearch_input_back_btn", 0, true, true) == 0;
        this.R4 = com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381.m80964xdaabcf26();
        this.S4 = j62.e.g().i("clicfg_websearch_input_cancel_btn", 1, true, true) == 1;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.Q4);
        objArr[1] = java.lang.Boolean.valueOf(this.R4 == 0);
        objArr[2] = java.lang.Boolean.valueOf(this.S4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "initData, isSearchInputBackLast = %s, isSearchInputTypeOld = %s, isSearchInputShowCancel = %s.", objArr);
        this.G4 = findViewById(com.p314xaae8f345.mm.R.id.ggf);
        java.lang.String stringExtra = getIntent().getStringExtra("ftsQuery");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String trim = stringExtra.trim();
        this.K4 = getIntent().getIntExtra("ftsbizscene", 0);
        this.I4 = getIntent().getIntExtra("ftsType", 0);
        this.L4 = getIntent().getBooleanExtra("ftscaneditable", true);
        this.M4 = getIntent().getBooleanExtra("key_hide_cancel_btn", false);
        getIntent().getBooleanExtra("key_from_whole_search", true);
        this.N4 = getIntent().getBooleanExtra("ftsismorebutton", false);
        this.O4 = getIntent().getBooleanExtra("ftsisshowcancel", false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f265348f;
        if (c22633x83752a59 != null) {
            c22633x83752a59.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.p3(this));
        }
        tj5.z zVar = (tj5.z) findViewById(com.p314xaae8f345.mm.R.id.phy);
        this.F4 = zVar;
        zVar.mo81017xcd1079b0(8);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22483x6b4c354e c22483x6b4c354e = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22483x6b4c354e(this, !com.p314xaae8f345.mm.ui.bk.C());
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ajj);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, dimensionPixelOffset);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.addView(c22483x6b4c354e, layoutParams);
        ((android.widget.RelativeLayout) this.G4).addView(linearLayout, new android.widget.RelativeLayout.LayoutParams(-1, dimensionPixelOffset));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f265348f.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ael));
            c22483x6b4c354e.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ael));
            linearLayout.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ael));
            c22483x6b4c354e.searchContainer.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cqc);
        } else {
            this.f265348f.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            this.G4.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aem));
            c22483x6b4c354e.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aem));
            linearLayout.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aem));
            c22483x6b4c354e.searchContainer.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cqd);
        }
        c22483x6b4c354e.mCancelBtn.setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.aek));
        this.F4 = c22483x6b4c354e;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
        this.H4 = findViewById;
        if (this.L4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.F4.mo81016xcd6a5043(this);
            this.F4.mo81005xdc5215a6().m80989x764b0e09(ga());
            this.F4.mo81005xdc5215a6().m80988xce28f7ee(this);
            this.F4.mo81005xdc5215a6().m80979xa89fdb76(this);
            if (this.M4) {
                this.F4.mo81011x2a82112(8);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                this.F4.mo81005xdc5215a6().n(trim, null);
                java.util.LinkedList linkedList = this.P4;
                linkedList.remove(trim);
                linkedList.add(trim);
            }
            if (this.R3) {
                this.F4.mo81005xdc5215a6().m();
                this.F4.mo81005xdc5215a6().t();
            }
            if (getIntent().getBooleanExtra("key_change_search_icon", false)) {
                this.F4.mo81005xdc5215a6().m80969x4fdf4434().setImageDrawable(M9(this.I4));
                this.F4.mo81005xdc5215a6().m80969x4fdf4434().m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
            if (this.N4 || this.O4) {
                this.F4.mo81011x2a82112(0);
            }
        } else {
            this.F4.mo81017xcd1079b0(8);
            if (this.K4 == 130) {
                android.view.View view = this.H4;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f265398w.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.f265398w.setLayoutParams(marginLayoutParams);
            } else {
                java.lang.String stringExtra2 = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aaf)).setText(stringExtra2);
                }
                findViewById(com.p314xaae8f345.mm.R.id.aa8).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.q3(this));
            }
        }
        if (this.J4) {
            android.view.View view2 = this.G4;
            if (view2 != null) {
                view2.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            }
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.aa8);
            if (findViewById2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2).m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aaf);
            if (textView != null) {
                textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            }
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f566608rq1);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.F4.mo81005xdc5215a6() != null) {
                this.F4.mo81005xdc5215a6().m80995x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
                this.F4.mo81005xdc5215a6().m80990xb7ad8eda(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560343hv));
                this.F4.mo81005xdc5215a6().m80976x4d774800().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563383ae3);
            }
            if (this.F4.mo81004x1bd4fecc() != null) {
                this.F4.mo81004x1bd4fecc().setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560081ai));
            }
        }
        mo74408xb0dfae51(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7 s7Var = this.f265337a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = this.f265348f;
        if (c22633x83752a592 != null) {
            c22633x83752a592.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.r3(this));
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b4 b4Var = this.U4;
        e3Var.M0(b4Var);
        this.L1.K0(b4Var.f265888b);
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public int r7() {
        return com.p314xaae8f345.mm.R.raw.f78352x20d6422c;
    }
}

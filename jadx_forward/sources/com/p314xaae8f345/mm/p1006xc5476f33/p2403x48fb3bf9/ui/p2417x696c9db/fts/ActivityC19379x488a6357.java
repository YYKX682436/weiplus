package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19379x488a6357 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 implements tj5.y, tj5.n, tj5.l {
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 F4;
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
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1 U4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1(this, null);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void B9(int i17, java.lang.String str, java.util.Map map) {
        ga(str, i17);
        java.util.LinkedList linkedList = this.P4;
        if (linkedList != null) {
            linkedList.size();
            if (linkedList.size() > 1 || this.N4 || this.O4) {
                this.F4.mo81011x2a82112(0);
            } else {
                this.F4.mo81011x2a82112(8);
            }
        }
    }

    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o textChangeStatus) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onEditTextChange %s %s %s, %s %s", str, str2, textChangeStatus, P9(), N9());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextChange, textChangeStatus=%s, isSettingTextFromJS=%s", textChangeStatus, java.lang.Boolean.valueOf(this.T4));
        tj5.o oVar = tj5.o.UserInput;
        if (textChangeStatus != oVar && textChangeStatus != tj5.o.ClearText) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextChange SKIPPED notifySearchInputChange, textChangeStatus=%s", textChangeStatus);
            return;
        }
        if (!this.K3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextChange -> notifySearchInputChange(0, 1)");
            Y9(0, 1);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
        java.lang.String totalText = P9();
        java.lang.String inEditText = N9();
        c19404xac949430.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(totalText, "totalText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inEditText, "inEditText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textChangeStatus, "textChangeStatus");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onEditTextChange, totalText: " + totalText + ", inEditText: " + inEditText + ", textChangeStatus: " + textChangeStatus);
        long j17 = c19404xac949430.f266176g;
        tg0.r1 r1Var = c19404xac949430.f266177h;
        if (textChangeStatus == oVar) {
            if (!(totalText.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFlutterAndShowSug visibility ");
                android.view.ViewGroup viewGroup = c19404xac949430.f266174e;
                sb6.append(viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getVisibility()) : null);
                sb6.append(" flutterInit ");
                sb6.append(c19404xac949430.f266175f);
                sb6.append(" totalText ");
                sb6.append(totalText);
                sb6.append(" inEditText ");
                sb6.append(inEditText);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", sb6.toString());
                if (!c19404xac949430.f266175f) {
                    c19404xac949430.U6(totalText, true, false, null);
                    ((sg0.w2) r1Var).mj(totalText, inEditText, java.lang.Long.valueOf(j17));
                    return;
                }
                sg0.w2 w2Var = (sg0.w2) r1Var;
                w2Var.mj(totalText, inEditText, java.lang.Long.valueOf(j17));
                w2Var.nj(true, java.lang.Long.valueOf(j17));
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                java.lang.Runnable runnable = c19404xac949430.f266181o;
                handler.removeCallbacks(runnable);
                if (!(totalText.length() > 0)) {
                    if (!(inEditText.length() > 0)) {
                        return;
                    }
                }
                c19404xac949430.f266180n = true;
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(runnable, 1000L);
                return;
            }
        }
        ((sg0.w2) r1Var).mj("", "", java.lang.Long.valueOf(j17));
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).aj(8);
        c19404xac949430.T6();
    }

    public boolean G0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onSearchKeyDown");
        ka();
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
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f1 f1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f1) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tagName", f1Var.f265940d);
                jSONObject.put("tagType", f1Var.f265941e);
                jSONObject.put("userName", f1Var.f265942f);
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
    public void R7(int i17, android.os.Bundle data) {
        if (i17 != 144) {
            if (i17 == 147) {
                this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u0(this, data.getInt("ret"), data.getLong("reqId"), data.getString("json", "")));
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
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.l4 l4Var = this.J3;
                                    if (l4Var != null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
                                        if (((ch0.j) l4Var).f122761a.a(119, data)) {
                                            return;
                                        }
                                    }
                                    o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b1(this, data.getBundle("fts_key_data"), data.getString("fts_key_json_data"), data.getBoolean("fts_key_new_query", true), data.getString("fts_key_req_id")));
                                    return;
                                case 120:
                                    this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.c1(this, data.getInt("fts_key_ret", 0), data.getString("fts_key_data")));
                                    return;
                                case 121:
                                    o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.d1(this, data.getInt("fts_key_teach_request_type", 0), data.getString("fts_key_json_data"), data.getInt("fts_key_is_cache_data", 0)));
                                    return;
                                case 122:
                                    java.lang.String string = data.getString("fts_key_new_query");
                                    java.lang.String string2 = data.getString("fts_key_custom_query");
                                    boolean z17 = data.getBoolean("fts_key_need_keyboard", false);
                                    java.lang.String string3 = data.getString("fts_key_tag_list");
                                    boolean z18 = data.getBoolean("fts_key_cache", false);
                                    java.lang.String P9 = P9();
                                    boolean z19 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || !P9.equals(string)) ? false : true;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange: %b isNoChange: %b", string, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
                                    java.lang.Object[] objArr = new java.lang.Object[5];
                                    objArr[0] = string;
                                    objArr[1] = java.lang.Boolean.valueOf(z17);
                                    objArr[2] = java.lang.Boolean.valueOf(z19);
                                    com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = this.F4;
                                    objArr[3] = c22484x63a3bec1 != null ? java.lang.Boolean.valueOf(c22484x63a3bec1.mo81005xdc5215a6().k()) : "null";
                                    objArr[4] = java.lang.Boolean.valueOf(this.T4);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] AC_ON_FTS_SEARCH_QUERY_CHANGE, query=%s, isInputChange=%s, isNoChange=%s, hasFocus=%s, isSettingTextFromJS=%s", objArr);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    try {
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                                            org.json.JSONArray jSONArray = new org.json.JSONArray(string3);
                                            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f1(this);
                                                f1Var.f265940d = jSONObject.getString("tagName");
                                                f1Var.f265941e = jSONObject.getInt("tagType");
                                                f1Var.f265942f = jSONObject.getString("userName");
                                                arrayList.add(f1Var);
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
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] AC_ON_FTS_SEARCH_QUERY_CHANGE isInputChange=true -> notifySearchInputChange(0, 1)");
                                        Y9(0, 1);
                                        return;
                                    }
                                    com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec12 = this.F4;
                                    if (c22484x63a3bec12 != null) {
                                        boolean z27 = !z19 && c22484x63a3bec12.mo81005xdc5215a6().k();
                                        this.T4 = z27;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] AC_ON_FTS_SEARCH_QUERY_CHANGE isInputChange=false, isSettingTextFromJS=%s, about to clearEditTextFocus", java.lang.Boolean.valueOf(z27));
                                        this.F4.mo81005xdc5215a6().d();
                                        T9(java.lang.Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i17) {
                                        case 124:
                                            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.e1(this, data.getString("fts_key_json_data")));
                                            return;
                                        case 125:
                                            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.t0(this, data.getString("fts_key_sns_id"), data.getInt("fts_key_status", 0)));
                                            return;
                                        case 126:
                                            data.getString("fts_key_json_data");
                                            data.getBoolean("fts_key_new_query", true);
                                            java.util.HashMap hashMap = new java.util.HashMap();
                                            for (java.lang.String str : data.keySet()) {
                                                hashMap.put(str, data.get(str));
                                            }
                                            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.a1(this, hashMap));
                                            return;
                                    }
                            }
                    }
                }
                return;
            }
            if (data.getString("fts_key_data", "").equals("configNavBar")) {
                java.lang.String string4 = data.getString("recommendSearchQuery", "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                    this.F4.mo81005xdc5215a6().m80992x157d7269("");
                    this.F4.mo81005xdc5215a6().m80989x764b0e09(ha());
                } else {
                    this.F4.mo81005xdc5215a6().m80992x157d7269(string4);
                }
            }
            super.R7(i17, data);
        }
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (!this.K3) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onEditTextFocusChange, query = %s, isFromVoice = %s, isSettingTextFromJS = %s.", P9(), java.lang.Boolean.valueOf(this.f265780d4), java.lang.Boolean.valueOf(this.T4));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextFocusChange hasFocus=true, isSettingTextFromJS=%s, query=%s", java.lang.Boolean.valueOf(this.T4), P9());
                if (this.T4) {
                    this.T4 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextFocusChange SKIPPED (isSettingTextFromJS was true), reset to false");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] onEditTextFocusChange -> notifySearchInputChange(0, 1)");
                    Y9(0, 1);
                    return;
                }
            }
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
        c19404xac949430.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onEditTextFocusChange, hasFocus: " + z17);
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c19404xac949430.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) m158354x19263085).M3) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = c19404xac949430.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5) m158354x192630852).fa(-1.0f, 1.0f, 300, false);
            }
        }
        android.view.ViewGroup viewGroup = c19404xac949430.f266174e;
        if (viewGroup != null) {
            ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).bj(z17);
            if (viewGroup.getVisibility() != 0) {
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(c19404xac949430.f266176g);
            sg0.w2 w2Var = (sg0.w2) c19404xac949430.f266177h;
            w2Var.getClass();
            p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
            p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new sg0.o2(w2Var, valueOf, z17, b17, null), 3, null);
        }
    }

    @Override // tj5.l
    public boolean Y3(android.view.View view) {
        ka();
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

    public final void ga(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0();
        b0Var.f265879d = i17;
        b0Var.f265877b = str;
        b0Var.f265876a = str;
        java.util.LinkedList linkedList = this.P4;
        if (linkedList.isEmpty()) {
            linkedList.addFirst(b0Var);
        } else {
            if (b0Var.m74459xb2c87fbf((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0) linkedList.peekFirst())) {
                return;
            }
            linkedList.addFirst(b0Var);
        }
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

    public java.lang.String ha() {
        return null;
    }

    public final boolean ia(boolean z17) {
        java.util.LinkedList linkedList = this.P4;
        if (linkedList.size() > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "handleClickBackBtn, realStartSearch");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn else branch, searchHistory.size=%d", java.lang.Integer.valueOf(linkedList.size()));
            linkedList.pollFirst();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0) linkedList.peekFirst();
            if (b0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn, peekFirst null after pollFirst, finish");
                finish();
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn, about to setText, query=%s, hasFocus=%s", b0Var.f265877b, java.lang.Boolean.valueOf(this.F4.mo81005xdc5215a6().k()));
            this.F4.mo81005xdc5215a6().n(b0Var.f265877b, null);
            this.T4 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "[hitest] handleClickBackBtn, after setText, isSettingTextFromJS=true, about to clearEditTextFocus");
            this.F4.mo81005xdc5215a6().d();
            this.F4.mo81011x2a82112(0);
            mo48674x36654fab();
            la(1, b0Var);
            return false;
        }
        if (this.K3) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
            c19404xac949430.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onSearchBack");
            c19404xac949430.T6();
        }
        if (!this.G3 || this.F4.mo81005xdc5215a6().m80978xc3706fda().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "handleClickBackBtn, finish");
            mo48674x36654fab();
            if (z17) {
                G9(vu4.a.K, vu4.b.f521806w);
            } else {
                G9(vu4.a.K, vu4.b.f521808y);
            }
            finish();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "handleClickBackBtn, backAndClearQuery");
        if (!linkedList.isEmpty()) {
            linkedList.pollFirst();
        }
        this.F4.mo81005xdc5215a6().e();
        this.F4.mo81005xdc5215a6().d();
        if (ja()) {
            this.F4.mo81011x2a82112(8);
        }
        return false;
    }

    public boolean ja() {
        return false;
    }

    public final void ka() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = this.F4;
        if (c22484x63a3bec1 != null && c22484x63a3bec1.mo81005xdc5215a6() != null) {
            this.F4.mo81005xdc5215a6().d();
            this.F4.mo81005xdc5215a6().v(false);
        }
        mo48674x36654fab();
        la(0, null);
    }

    public void la(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var) {
        if (!this.K3) {
            this.Q2.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.z0(this, i17, b0Var));
            return;
        }
        java.lang.String query = P9();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(query)) {
            query = this.F4.mo81005xdc5215a6().m80972xc738b2f5();
            this.F4.mo81005xdc5215a6().o(this.F4.mo81005xdc5215a6().m80972xc738b2f5(), null, tj5.o.SetText);
            this.F4.mo81005xdc5215a6().d();
            this.F4.mo81005xdc5215a6().h();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(query)) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b0Var != null ? b0Var.f265879d : this.I4);
        c19404xac949430.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "realStartSearch, isBackButtonClick: " + i17 + ", query: " + query + " type: " + valueOf);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (i17 == 1) {
            if (valueOf != null) {
                linkedHashMap.put("type", java.lang.Integer.valueOf(valueOf.intValue()));
            }
            linkedHashMap.put("isBackButtonClick", 1);
        }
        c19404xac949430.V6(query, true, linkedHashMap);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onClickBackBtn");
        ia(false);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onBackPressed");
        if (ia(true)) {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onClickBackBtn");
        ia(false);
    }

    @Override // tj5.y
    /* renamed from: onClickCancelBtn */
    public void mo74458x91b34899(android.view.View view) {
        this.F4.mo81005xdc5215a6().n("", null);
        Z9(1, 1, true, null);
        this.F4.mo81005xdc5215a6().d();
        mo48674x36654fab();
        G9(vu4.a.K, vu4.b.A);
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = this.F4;
        if (c22484x63a3bec1 != null) {
            if (!c22484x63a3bec1.mo81005xdc5215a6().k()) {
                this.F4.mo81005xdc5215a6().m();
            }
            this.F4.mo81005xdc5215a6().m80989x764b0e09(ha());
            this.F4.mo81011x2a82112(8);
        }
        if (this.K3) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430.class);
            c19404xac949430.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "onClearInputTextBar");
            ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).aj(8);
            c19404xac949430.T6();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        boolean booleanExtra = getIntent().getBooleanExtra("ftsForceShowDarkMode", false);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_page_support_force_night_mode, 1) == 1;
        this.J4 = booleanExtra && z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "isOpenForceNightMode = %s， showDarkMode = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(booleanExtra));
        super.onCreate(bundle);
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        int i18 = com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381.I;
        this.Q4 = j62.e.g().i("clicfg_websearch_input_back_btn", 0, true, true) == 0;
        this.R4 = com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381.m80964xdaabcf26();
        this.S4 = j62.e.g().i("clicfg_websearch_input_cancel_btn", 1, true, true) == 1;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.Q4);
        objArr[1] = java.lang.Boolean.valueOf(this.R4 == 0);
        objArr[2] = java.lang.Boolean.valueOf(this.S4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "initData, isSearchInputBackLast = %s, isSearchInputTypeOld = %s, isSearchInputShowCancel = %s.", objArr);
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
            c22633x83752a59.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v0(this));
        }
        this.F4 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1) findViewById(com.p314xaae8f345.mm.R.id.phy);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
        this.H4 = findViewById;
        if (this.L4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i17 = 8;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.F4.mo81016xcd6a5043(this);
            this.F4.mo81005xdc5215a6().m80989x764b0e09(ha());
            this.F4.mo81005xdc5215a6().m80988xce28f7ee(this);
            this.F4.mo81005xdc5215a6().m80979xa89fdb76(this);
            if (this.M4) {
                this.F4.mo81004x1bd4fecc().setVisibility(8);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                this.F4.mo81005xdc5215a6().n(trim, null);
                ga(trim, this.I4);
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
            i17 = 8;
            this.F4.setVisibility(8);
            if (this.K4 == 130) {
                android.view.View view = this.H4;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f265398w.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.f265398w.setLayoutParams(marginLayoutParams);
            } else {
                java.lang.String stringExtra2 = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aaf)).setText(stringExtra2);
                }
                findViewById(com.p314xaae8f345.mm.R.id.aa8).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.w0(this));
            }
        }
        if (this.J4) {
            android.view.View view2 = this.G4;
            if (view2 != null) {
                view2.setBackgroundColor(view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
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
                arrayList3.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = this.F4;
            android.view.View view3 = c22484x63a3bec1.webActionbarSearchviewContainer;
            if (view3 != null) {
                view3.setBackgroundColor(c22484x63a3bec1.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            }
            if (this.F4.mo81005xdc5215a6() != null) {
                this.F4.mo81005xdc5215a6().m80995x1c5c5ff4(this.F4.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
                this.F4.mo81005xdc5215a6().m80990xb7ad8eda(this.F4.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560343hv));
                this.F4.mo81005xdc5215a6().m80976x4d774800().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563383ae3);
            }
            if (this.F4.mo81004x1bd4fecc() != null) {
                this.F4.mo81004x1bd4fecc().setTextColor(this.F4.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560081ai));
            }
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 mo81005xdc5215a6 = this.F4.mo81005xdc5215a6();
        if (mo81005xdc5215a6 instanceof com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22481xced82189) {
            ((com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22481xced82189) mo81005xdc5215a6).m80996x5f329b6b(this.K3);
        }
        mo74408xb0dfae51(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7 s7Var = this.f265337a3;
        if (s7Var != null) {
            s7Var.e(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = this.f265348f;
        if (c22633x83752a592 != null) {
            c22633x83752a592.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x0(this));
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.h1 h1Var = this.U4;
        e3Var.M0(h1Var);
        this.L1.K0(h1Var.f265960b);
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

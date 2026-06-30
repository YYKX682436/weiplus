package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes8.dex */
public class r implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f266903d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f266904e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f266905f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final int f266906g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f266907h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 f266908i;

    public r(int i17) {
        this.f266906g = i17;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h1 h1Var, int i17, r45.g14 g14Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = h1Var.f264439d;
        r45.h14 h14Var = oVar == null ? null : (r45.h14) oVar.f152243a.f152217a;
        r45.i14 H = h1Var.H();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_FAIL;
        if (h14Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "authReq is null");
            h1Var.f264441f.b(mVar, null, null, i17, h1Var.H().f458194d.f459024d);
            return;
        }
        if (H == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "authResp is null");
            h1Var.f264441f.b(mVar, null, null, i17, h1Var.H().f458194d.f459024d);
            return;
        }
        gm0.j1.d().a(1096, this);
        java.util.LinkedList linkedList = H.f458197g;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.q24 q24Var = (r45.q24) it.next();
                if (q24Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", q24Var.f465141g, q24Var.f465138d, q24Var.f465140f, java.lang.Integer.valueOf(q24Var.f465139e), h14Var.f457284f);
                    q24Var.f465139e = 1;
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.q24 q24Var2 = (r45.q24) it6.next();
                if (q24Var2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", q24Var2.f465141g, q24Var2.f465138d, q24Var2.f465140f, java.lang.Integer.valueOf(q24Var2.f465139e), h14Var.f457284f);
                }
            }
        }
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k1(g14Var, h14Var.f457282d, h14Var.f457292q, h14Var.f457283e, h14Var.f457284f, h14Var.f457285g, h14Var.f457286h, h14Var.f457287i, h14Var.f457288m, h14Var.f457289n, h14Var.f457290o, linkedList, this.f266906g, ((r45.h14) ((com.p314xaae8f345.mm.p944x882e457a.o) h1Var.mo47948x7f0c4558()).f152243a.f152217a).f457293r));
        h1Var.f264441f.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_OK, null, null, i17, h1Var.H().f458194d.f459024d);
    }

    public final java.lang.String b(java.lang.String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public java.lang.String c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.HashMap hashMap = this.f266904e;
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str2;
        }
        java.lang.String b17 = b(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "appid = %s, url = %s, drophash url = %s", str2, str, b17);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? (java.lang.String) hashMap.get(b17) : str2;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.HashMap hashMap = this.f266905f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q qVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q) hashMap.get(str);
        return qVar == null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q) hashMap.get(b(str)) : qVar;
    }

    public void e(com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, java.lang.String str, java.lang.String str2, int i17, nw4.y2 y2Var, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n nVar) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i19;
        java.lang.String str6;
        java.lang.String str7 = str;
        java.lang.String str8 = y2Var != null ? y2Var.f422552i : "";
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_ACCESS_DENIED;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "jsapi is null, %s", str);
            nVar.b(mVar, null, null, 0, 0);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_FAIL;
        if (c19775x58fd37b3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || y2Var == null || c19775x58fd37b3.f273713d == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str7;
            objArr[1] = str8;
            objArr[2] = java.lang.Boolean.valueOf(c19775x58fd37b3 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "handleJSVerify invalid argument, currentUrl = %s, jsapi = %s, %s", objArr);
            nVar.b(mVar2, "localParameters", null, 0, 0);
            return;
        }
        int d17 = c19775x58fd37b3.d(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify jsApi = %s, permission pos = %d, permission = %s currentUrl = %s", str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17), str7);
        java.lang.String str9 = (java.lang.String) this.f266904e.get(str7);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
            str9 = (java.lang.String) y2Var.f422323a.get("verifyAppId");
        }
        java.util.HashMap hashMap = (java.util.HashMap) y2Var.f422551h;
        hashMap.put("permissionValue", java.lang.Integer.valueOf(d17));
        hashMap.put("appId", str9);
        if (d17 == 0) {
            nVar.b(mVar, null, null, 0, 0);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_OK;
        if (d17 == 1) {
            nVar.b(mVar3, null, null, 0, 0);
            return;
        }
        if (d17 == 2) {
            if (str8.equals("preVerifyJSAPI")) {
                nVar.b(mVar3, null, null, 0, 0);
                return;
            } else {
                nVar.b(mVar, null, null, 0, 0);
                return;
            }
        }
        if (d17 != 3) {
            if (d17 == 4) {
                str7 = (java.lang.String) y2Var.f422323a.get("url");
                r45.g14 g14Var = (r45.g14) this.f266903d.get(str8 + str7);
                if (g14Var != null && g14Var.f456334e == 1) {
                    nVar.b(mVar3, null, null, 0, 0);
                    return;
                }
            }
            nVar.b(mVar2, "unkonwPermission_" + d17, null, 0, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
        }
        java.lang.String str10 = str7;
        java.lang.String str11 = (java.lang.String) y2Var.f422323a.get("verifySignature");
        java.lang.String str12 = (java.lang.String) y2Var.f422323a.get("verifyNonceStr");
        java.lang.String str13 = (java.lang.String) y2Var.f422323a.get("verifyTimestamp");
        java.lang.String str14 = (java.lang.String) y2Var.f422323a.get("verifySignType");
        java.lang.String str15 = (java.lang.String) y2Var.f422323a.get("scope");
        java.lang.String str16 = (java.lang.String) y2Var.f422323a.get("addrSign");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify addrSign = %s, signature = %s", str16, str11);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str16)) {
            str3 = str14;
            str4 = str9;
            str5 = str12;
            i19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11) ? 2 : 0;
            str6 = str11;
        } else {
            java.lang.String str17 = (java.lang.String) y2Var.f422323a.get("appId");
            java.lang.String str18 = (java.lang.String) y2Var.f422323a.get("addrSign");
            java.lang.String str19 = (java.lang.String) y2Var.f422323a.get("signType");
            java.lang.String str20 = (java.lang.String) y2Var.f422323a.get("timeStamp");
            str6 = str18;
            str3 = str19;
            str5 = (java.lang.String) y2Var.f422323a.get("nonceStr");
            i19 = 1;
            str13 = str20;
            str4 = str17;
        }
        org.json.JSONObject b17 = nw4.x2.b(y2Var.f422323a);
        byte[] bytes = b17 != null ? b17.toString().getBytes() : null;
        if (d17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h1(nVar, str10, str2, str4, str8, str13, str5, str6, str3, bytes, i19, str15, this.f266906g, i18);
            gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.j.f34002x366c91de, this);
            gm0.j1.d().g(h1Var);
            return;
        }
        if (d17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j1(nVar, str10, str2, str4, str8, str13, str5, str6, str3, bytes, this.f266906g, i18);
            gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.v.f33963x366c91de, this);
            gm0.j1.d().g(j1Var);
            return;
        }
        nVar.b(mVar2, "unkonwPermission_" + d17, null, 0, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.j14 j14Var;
        r45.j14 j14Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: type[%d], errType[%s], errCode[%s], errMsg[%s]", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: net scene type mismatched, return");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o) m1Var;
        int s17 = oVar.s();
        int i19 = this.f266906g;
        if (s17 != i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "JSVerifyHelper onSceneEnd: this.binderId = %d, incoming binderId = %d, not equal, return", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(oVar.s()));
            return;
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_OK;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_FAIL;
        int i27 = 0;
        if (mo808xfb85f7b0 == 1093) {
            gm0.j1.d().q(bb1.g.f4187x366c91de, this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i1) m1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n nVar = i1Var.f264464f;
            if (nVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIPreVerify, VerifyCallback is null");
                return;
            }
            int i28 = (i1Var.H() == null || i1Var.H().f472243d == null) ? 0 : i1Var.H().f472243d.f459024d;
            if (i17 != 0 || i18 != 0) {
                if (i17 != 4) {
                    i1Var.f264464f.b(mVar2, null, null, i18, i28);
                    return;
                }
                i1Var.f264464f.b(mVar2, i18 + "_" + str, null, i18, i28);
                return;
            }
            r45.y14 H = i1Var.H();
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = i1Var.f264462d;
            r45.x14 x14Var = oVar2 == null ? null : (r45.x14) oVar2.f152243a.f152217a;
            java.lang.String str2 = i1Var.f264465g;
            if (H == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || x14Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x14Var.f471184e)) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(H == null);
                objArr[1] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
                objArr[2] = java.lang.Boolean.valueOf(x14Var == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "something null %b, %b, %b", objArr);
                i1Var.f264464f.b(mVar2, null, null, i18, i28);
                return;
            }
            r45.j14 j14Var3 = H.f472243d;
            if (j14Var3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "jsapi_baseresponse null");
                i1Var.f264464f.b(mVar2, null, null, i18, i28);
                return;
            }
            int i29 = j14Var3.f459024d;
            if (i29 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "jsapi baseresponse errcode fail : %d, errmsg = %s", java.lang.Integer.valueOf(i29), H.f472243d.f459025e);
                i1Var.f264464f.b(mVar2, H.f472243d.f459025e, null, i18, i28);
                return;
            }
            nVar.a(H.f472246g);
            this.f266904e.put(b(x14Var.f471183d), x14Var.f471184e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q(x14Var.f471184e, H);
            java.util.HashMap hashMap = this.f266905f;
            hashMap.put(b(x14Var.f471183d), qVar);
            hashMap.put(b(x14Var.f471193q), qVar);
            i1Var.f264464f.b(mVar, null, H.f472244e, i18, i28);
            return;
        }
        java.util.HashMap hashMap2 = this.f266903d;
        if (mo808xfb85f7b0 != 1095) {
            if (mo808xfb85f7b0 != 1094) {
                if (mo808xfb85f7b0 == 1096) {
                    gm0.j1.d().q(1096, this);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k1 k1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k1) m1Var;
                    com.p314xaae8f345.mm.p944x882e457a.o oVar3 = k1Var.f264509d;
                    r45.b24 b24Var = oVar3 == null ? null : (r45.b24) oVar3.f152243a.f152217a;
                    if (b24Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, setAuthReq is null");
                        return;
                    }
                    if (i17 != 0 || i18 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s], %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), b24Var.f451988f);
                        return;
                    }
                    java.lang.String str3 = b24Var.f451988f;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (o45.vf.b(str3 != null ? str3 : "") == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "JSAPISetOAuth, errType[%s], errCode[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        return;
                    }
                    r45.g14 g14Var = k1Var.f264511f;
                    g14Var.f456334e = 1;
                    hashMap2.put(b24Var.f451988f + b24Var.f451986d, g14Var);
                    return;
                }
                return;
            }
            gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.v.f33963x366c91de, this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j1) m1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(157L, 24L, 1L, false);
            if (j1Var.H() != null && j1Var.H().f451199d != null) {
                i27 = j1Var.H().f451199d.f459024d;
            }
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify netscene error", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                g0Var.mo68477x336bdfd8(157L, 25L, 1L, false);
                if (i17 != 4) {
                    j1Var.f264485f.b(mVar2, null, null, i18, i27);
                    return;
                }
                j1Var.f264485f.b(mVar2, i18 + "_" + str, null, i18, i27);
                return;
            }
            r45.a24 H2 = j1Var.H();
            if (H2 == null || (j14Var = H2.f451199d) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIRealtimeVerify resp is null");
                j1Var.f264485f.b(mVar2, null, null, i18, i27);
                return;
            }
            int i37 = j14Var.f459024d;
            if (i37 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "realtime jsapi_baseresponse %s, %s", java.lang.Integer.valueOf(i37), H2.f451199d.f459025e);
                j1Var.f264485f.b(mVar2, H2.f451199d.f459025e, null, i18, i27);
                return;
            }
            r45.lx6 lx6Var = H2.f451200e;
            if (lx6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, vInfo is null");
                j1Var.f264485f.b(mVar2, "verifyFail", null, i18, i27);
                return;
            }
            int i38 = lx6Var.f461492f;
            if (i38 == 1) {
                j1Var.f264485f.b(mVar, null, null, i18, i27);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "realtime not ok, %s", java.lang.Integer.valueOf(i38));
                j1Var.f264485f.b(mVar2, "verifyFail", null, i18, i27);
                return;
            }
        }
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.j.f34002x366c91de, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h1) m1Var;
        int i39 = (h1Var.H() == null || h1Var.H().f458194d == null) ? 0 : h1Var.H().f458194d.f459024d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth netscene error, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 4) {
                h1Var.f264441f.b(mVar2, str, null, i18, i39);
                return;
            } else {
                h1Var.f264441f.b(mVar2, null, null, i18, i39);
                return;
            }
        }
        java.lang.String str4 = h1Var.f264442g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "scene.jsapi is null or nil.");
            h1Var.f264441f.b(mVar2, null, null, i18, i39);
            return;
        }
        r45.i14 H3 = h1Var.H();
        if (H3 == null || (j14Var2 = H3.f458194d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth resp is null");
            h1Var.f264441f.b(mVar2, null, null, i18, i39);
            return;
        }
        int i47 = j14Var2.f459024d;
        if (i47 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "auth jsapi_baseresponse %s, %s", java.lang.Integer.valueOf(i47), H3.f458194d.f459025e);
            h1Var.f264441f.b(mVar2, H3.f458194d.f459025e, null, i18, i39);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar4 = h1Var.f264439d;
        if ((oVar4 == null ? null : (r45.h14) oVar4.f152243a.f152217a) != null) {
            i27 = (oVar4 == null ? null : (r45.h14) oVar4.f152243a.f152217a).f457290o;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.JSVerifyHelper", "signature flag : %d.", java.lang.Integer.valueOf(i27));
        java.lang.String str5 = h1Var.f264443h;
        if (i27 == 1) {
            java.util.LinkedList linkedList = H3.f458197g;
            if (linkedList == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPI scope_auth_info is null.");
                h1Var.f264441f.b(mVar2, null, null, i18, i39);
                return;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.q24 q24Var = (r45.q24) it.next();
                java.util.LinkedList linkedList2 = q24Var.f465141g;
                if (linkedList2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "authInfo.apiname is null.");
                } else {
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str6 = (java.lang.String) it6.next();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                            r45.g14 g14Var2 = new r45.g14();
                            g14Var2.f456333d = str6;
                            g14Var2.f456334e = q24Var.f465139e;
                            g14Var2.f456335f = q24Var.f465140f;
                            hashMap2.put(g14Var2.f456333d + str5, g14Var2);
                            it = it;
                        }
                    }
                }
            }
        } else {
            java.util.LinkedList linkedList3 = H3.f458195e;
            if (linkedList3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "dealJSAPIAuth auth_info is null");
                h1Var.f264441f.b(mVar2, "nullAuthInfo", null, i18, i39);
                return;
            }
            java.util.Iterator it7 = linkedList3.iterator();
            while (it7.hasNext()) {
                r45.g14 g14Var3 = (r45.g14) it7.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g14Var3.f456333d)) {
                    hashMap2.put(g14Var3.f456333d + str5, g14Var3);
                }
            }
        }
        r45.g14 g14Var4 = (r45.g14) hashMap2.get(str4 + str5);
        if (g14Var4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "The JSAPIAuthInfo is null. (jsapi : %s , url : %s)", str4, str5);
            h1Var.f264441f.b(mVar2, null, null, i18, i39);
            return;
        }
        if (g14Var4.f456334e == 1) {
            h1Var.f264441f.b(mVar, null, null, i18, i39);
            return;
        }
        android.content.Context context = this.f266907h;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.JSVerifyHelper", "JSVerify context not activity");
            a(h1Var, i18, g14Var4);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = this.f266908i;
        java.lang.String str7 = g14Var4.f456336g;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = g14Var4.f456335f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.U6(context, z0Var, false, str8, str9 == null ? "" : str9, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6u), this.f266907h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6t), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k(this, h1Var, i18, g14Var4), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l(this, h1Var, i18));
    }
}

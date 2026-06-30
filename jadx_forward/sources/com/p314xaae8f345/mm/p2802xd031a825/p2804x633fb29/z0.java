package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class z0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: ERR_RETCODE_JSON_RESOLVE_ERROR */
    protected static final int f39852x7e3003c9 = -10089;

    /* renamed from: ERR_RETCODE_NO_JSON */
    private static final int f39853xe426505b = -10088;

    /* renamed from: PAY_END */
    private static final java.lang.String f39854xfbefec84 = "1";
    private static final java.lang.String TAG = "MicroMsg.NetScenePayBase";

    /* renamed from: callback */
    protected com.p314xaae8f345.mm.p944x882e457a.u0 f39858xf5bc2045;

    /* renamed from: errDialogCancelText */
    private java.lang.String f39861xb8505db4;

    /* renamed from: errDialogOkText */
    private java.lang.String f39862x587c3a96;

    /* renamed from: error_detail_url */
    protected java.lang.String f39863x720feb18;

    /* renamed from: jumpRemind */
    private com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 f39870xdaf966d3;

    /* renamed from: rr, reason: collision with root package name */
    protected com.p314xaae8f345.mm.p944x882e457a.o f295573rr;

    /* renamed from: SVR_ERR_TYPE */
    protected int f39856x4b17cde4 = 0;

    /* renamed from: SVR_ERR_CODE */
    protected int f39855x4b0fec97 = 0;

    /* renamed from: payFlag */
    private java.lang.String f39872xd10a9034 = "";

    /* renamed from: payAppUrl */
    private java.lang.String f39871xb05e1256 = "";

    /* renamed from: wappay_jumped_url */
    private java.lang.String f39873x570e1fda = "";

    /* renamed from: isChildConsume */
    protected boolean f39866x381dd98a = false;

    /* renamed from: is_gen_cert */
    public int f39867x3fbd1928 = 0;

    /* renamed from: crt_token */
    public java.lang.String f39859x39c2df1f = "";

    /* renamed from: is_hint_cert */
    public int f39868xf4b7c07 = 0;

    /* renamed from: crt_wording */
    public java.lang.String f39860x739c703e = "";

    /* renamed from: is_ignore_cert */
    public int f39869xff6d14dc = 0;

    /* renamed from: hasRevServerRep */
    public boolean f39865x75b164b1 = false;

    /* renamed from: _request */
    private java.util.Map<java.lang.String, java.lang.String> f39857xcdde9950 = new java.util.HashMap();

    /* renamed from: hasProcessWalletError */
    private boolean f39864x15b23bda = false;

    /* renamed from: getRetModel */
    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o m83001x6758cc7e(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, int i27, java.lang.String str3, int i28, java.lang.String str4) {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o(i17, i18, str);
        if (i17 != 0 || i18 != 0) {
            m83002x6758cc7e(i17, i18, str, oVar);
        } else if (i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "hy: resolve busi error: plat ret is error");
            oVar.a(1000, i19, str2, 1);
        } else if (i27 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "hy: resolve busi error: errType is error");
            oVar.a(1000, i27, str3, 2);
        } else if (i28 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "hy: resolve busi error: retCode is error");
            if (i28 != f39852x7e3003c9 && i28 != f39853xe426505b) {
                oVar.a(1000, i28, str4, 2);
            } else {
                oVar.a(1000, 2, str4, 2);
            }
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finModel.errMsg = biz_errMsg");
                oVar.f295487c = str3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "hy: all's OK");
        }
        return oVar;
    }

    /* renamed from: addRequestData */
    public void m83003x698ba778(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.remove("uin");
        if (this.f39857xcdde9950 == null) {
            this.f39857xcdde9950 = new java.util.HashMap();
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.f39857xcdde9950;
        if (map2 != null) {
            map2.remove("uin");
        }
        for (java.lang.Object obj : map.keySet().toArray()) {
            java.lang.String str = map.get(obj);
            if (this.f39857xcdde9950.containsKey(obj)) {
                this.f39857xcdde9950.remove(obj);
            }
            this.f39857xcdde9950.put((java.lang.String) obj, str);
        }
        m83032xb4c13117(this.f39857xcdde9950);
    }

    /* renamed from: callbackUIWhenWalletError */
    public boolean mo83004xf23e3b1c() {
        return false;
    }

    /* renamed from: checkRecSrvResp */
    public boolean m83005xab5ceedf() {
        return this.f39865x75b164b1;
    }

    /* renamed from: configRequest */
    public abstract void mo83006x226c38ed(boolean z17, boolean z18);

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: getCgicmdForKV */
    public int mo66101xe8b43d29() {
        return mo83013xb2b366a7();
    }

    /* renamed from: getCommReqResp */
    public com.p314xaae8f345.mm.p944x882e457a.o m83007x5a9a73ac() {
        return this.f295573rr;
    }

    /* renamed from: getEncryptUrl */
    public abstract java.lang.String mo83008x94177cc0(java.lang.String str);

    /* renamed from: getErrDetailUrl */
    public java.lang.String m83009x826bf1ef() {
        return this.f39863x720feb18;
    }

    /* renamed from: getErrDialogCancelBtnText */
    public java.lang.String m83010x9ae566b8() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f39861xb8505db4) ? this.f39861xb8505db4 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
    }

    /* renamed from: getErrDialogOkBtnText */
    public java.lang.String m83011x94d0b196() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f39862x587c3a96) ? this.f39862x587c3a96 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.klh);
    }

    /* renamed from: getJumpRemind */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 m83012xc93a1ec9() {
        return this.f39870xdaf966d3;
    }

    /* renamed from: getPayCgicmd */
    public abstract int mo83013xb2b366a7();

    /* renamed from: getRetModel */
    public abstract com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e1 mo83014x6758cc7e(com.p314xaae8f345.mm.p944x882e457a.o oVar);

    /* renamed from: getReturnUrl */
    public java.lang.String m83015xc8313369() {
        return this.f39871xb05e1256;
    }

    /* renamed from: getToken */
    public java.lang.String mo8967x75346043() {
        return null;
    }

    /* renamed from: getWappayJumpUrl */
    public java.lang.String m83016xea8bbc49() {
        return this.f39873x570e1fda;
    }

    /* renamed from: hasProcessWalletError */
    public boolean m83017x15b23bda() {
        return this.f39864x15b23bda;
    }

    /* renamed from: isBlock */
    public boolean mo8970x7a807183() {
        return true;
    }

    /* renamed from: isJumpRemind */
    public boolean m83018x5c64639d() {
        return this.f39870xdaf966d3 != null;
    }

    /* renamed from: isPayEnd */
    public boolean m83019xecdab0dd() {
        java.lang.String str = this.f39872xd10a9034;
        if (str == null) {
            return false;
        }
        return "1".equals(str.trim());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c7  */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11134x5f9cdc6f(int r29, int r30, int r31, java.lang.String r32, com.p314xaae8f345.mm.p971x6de15a2e.v0 r33, byte[] r34, long r35) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0.mo11134x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[], long):void");
    }

    /* renamed from: onGYNetEnd */
    public abstract void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject);

    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
    }

    /* renamed from: onRawGYNetEnd */
    public void m83020xa466b659(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        mo1065x5f9cdc6f(oVar.f295486b, oVar.f295487c, jSONObject);
    }

    /* renamed from: onRawGYNetEnd2 */
    public void m83021xe87014f9(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        mo8968x93feb1a3(oVar, jSONObject);
    }

    /* renamed from: parseErrDialogCancelBtnText */
    public java.lang.String mo83022x7ef65e55(org.json.JSONObject jSONObject) {
        return null;
    }

    /* renamed from: parseErrDialogOkBtnText */
    public java.lang.String mo83023x2b9fffb3(org.json.JSONObject jSONObject) {
        return null;
    }

    /* renamed from: putToReqText */
    public abstract void mo83024x7114b9a1(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var);

    /* renamed from: putToRequest */
    public void mo83025x7123b945(java.lang.StringBuilder sb6, java.lang.String str) {
        sb6.append(str);
    }

    /* renamed from: putToWXReqText */
    public abstract void mo83026xd36d8220(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.cu5 cu5Var);

    /* renamed from: reportCellInfo */
    public void m83027x60322684(int i17, int i18) {
        java.lang.String substring;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String substring2;
        java.lang.String str3;
        try {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "errType is OK, reportCellInfo do nothing");
                return;
            }
            if (!at4.g0.g()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "shouldReportCellInfo is false, reportCellInfo do nothing");
                return;
            }
            r45.r1 c17 = at4.g0.c();
            if (c17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f465948o) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f465949p)) {
                return;
            }
            int mo83013xb2b366a7 = mo83013xb2b366a7();
            java.lang.String str4 = c17.f465948o;
            java.lang.String str5 = c17.f465947n;
            java.lang.String str6 = c17.f465949p;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                return;
            }
            int length = str6.length();
            if (length <= 5000) {
                if (length > 4000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, 2000);
                    str3 = str6.substring(2000, 3000);
                    str2 = str6.substring(3000, 4000);
                    str = str6.substring(4000, length);
                } else if (length > 3000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, 2000);
                    str3 = str6.substring(2000, 3000);
                    str2 = str6.substring(3000, length);
                    str = "";
                } else if (length > 2000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, 2000);
                    str3 = str6.substring(2000, length);
                    str = "";
                    str2 = str;
                } else if (length > 1000) {
                    substring = str6.substring(0, 1000);
                    substring2 = str6.substring(1000, length);
                    str = "";
                    str2 = str;
                    str3 = str2;
                } else if (length > 0) {
                    substring = str6.substring(0, length);
                    str = "";
                    str2 = str;
                    str3 = str2;
                    substring2 = str3;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reportCellInfo do report");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6376xa3d4f404 c6376xa3d4f404 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6376xa3d4f404();
                c6376xa3d4f404.f137223d = mo83013xb2b366a7;
                c6376xa3d4f404.f137224e = i17;
                c6376xa3d4f404.f137225f = i18;
                c6376xa3d4f404.f137226g = c6376xa3d4f404.b("EncryptKey", str4, true);
                c6376xa3d4f404.f137227h = c6376xa3d4f404.b("EncryptUserinfo", str5, true);
                c6376xa3d4f404.f137228i = c6376xa3d4f404.b("EncryptCellinfoLength", "" + length, true);
                c6376xa3d4f404.f137229j = c6376xa3d4f404.b("EncryptCellinfo_01", substring, true);
                c6376xa3d4f404.f137230k = c6376xa3d4f404.b("EncryptCellinfo_02", substring2, true);
                c6376xa3d4f404.f137231l = c6376xa3d4f404.b("EncryptCellinfo_03", str3, true);
                c6376xa3d4f404.f137232m = c6376xa3d4f404.b("EncryptCellinfo_04", str2, true);
                c6376xa3d4f404.f137233n = c6376xa3d4f404.b("EncryptCellinfo_05", str, true);
                c6376xa3d4f404.k();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reportCellInfo. cell info is too long to report");
            str = "";
            substring = str;
            str2 = substring;
            str3 = str2;
            substring2 = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reportCellInfo do report");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6376xa3d4f404 c6376xa3d4f4042 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6376xa3d4f404();
            c6376xa3d4f4042.f137223d = mo83013xb2b366a7;
            c6376xa3d4f4042.f137224e = i17;
            c6376xa3d4f4042.f137225f = i18;
            c6376xa3d4f4042.f137226g = c6376xa3d4f4042.b("EncryptKey", str4, true);
            c6376xa3d4f4042.f137227h = c6376xa3d4f4042.b("EncryptUserinfo", str5, true);
            c6376xa3d4f4042.f137228i = c6376xa3d4f4042.b("EncryptCellinfoLength", "" + length, true);
            c6376xa3d4f4042.f137229j = c6376xa3d4f4042.b("EncryptCellinfo_01", substring, true);
            c6376xa3d4f4042.f137230k = c6376xa3d4f4042.b("EncryptCellinfo_02", substring2, true);
            c6376xa3d4f4042.f137231l = c6376xa3d4f4042.b("EncryptCellinfo_03", str3, true);
            c6376xa3d4f4042.f137232m = c6376xa3d4f4042.b("EncryptCellinfo_04", str2, true);
            c6376xa3d4f4042.f137233n = c6376xa3d4f4042.b("EncryptCellinfo_05", str, true);
            c6376xa3d4f4042.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reportCellInfo error. %s", e17.getMessage());
        }
    }

    /* renamed from: resend */
    public boolean mo8969xc84d8c3b() {
        m48013x6761d4f();
        return false;
    }

    /* renamed from: setCommReqResp */
    public void m83028xf0ffe720(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f295573rr = oVar;
    }

    /* renamed from: setHasProcessWalletError */
    public void m83029xf170c098(boolean z17) {
        this.f39864x15b23bda = z17;
    }

    /* renamed from: setPayInfo */
    public void m83030x824a7eb4(com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        m83031x824a7eb4(c19760x34448d56, map, map2, false);
    }

    /* renamed from: setRequestData */
    public void m83032xb4c13117(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        map.remove("uin");
        if (!h45.y.c()) {
            map.put("jsapi_reqkey", h45.y.f360501a);
        }
        this.f39857xcdde9950 = map;
        mo83006x226c38ed(true, true);
        java.lang.String str = map.get("req_key");
        o45.zg mo47979x2d63726f = m83007x5a9a73ac().mo47979x2d63726f();
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.J(str);
        int i17 = 0;
        mo47979x2d63726f.m150627x65ba7055(0);
        java.lang.Object[] array = map.keySet().toArray();
        java.util.Arrays.sort(array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        while (true) {
            if (i17 >= array.length) {
                break;
            }
            java.lang.Object obj = array[i17];
            java.lang.String str2 = map.get(obj);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                if (z17) {
                    sb6.append("&");
                }
                sb6.append(obj);
                sb6.append("=");
                mo83025x7123b945(sb6, str2);
                z17 = true;
            }
            i17++;
        }
        if (z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "RQ: Cmd : " + mo83013xb2b366a7() + ", req = " + sb6.toString() + " " + toString() + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "RQ: Cmd : " + mo83013xb2b366a7() + ", req = " + sb6.toString() + " " + toString());
        }
        java.lang.String mo83008x94177cc0 = mo83008x94177cc0(sb6.toString());
        sb6.append(z17 ? "&" : "");
        sb6.append("WCPaySign");
        sb6.append("=");
        sb6.append(mo83008x94177cc0);
        byte[] bytes = sb6.toString().getBytes();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bytes);
        mo83024x7114b9a1(this.f295573rr, cu5Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setRequestData getPayCgicmd: %s type: %s this: %s cgi %s ", java.lang.Integer.valueOf(mo83013xb2b366a7()), java.lang.Integer.valueOf(mo808xfb85f7b0()), toString(), this.f295573rr.f152245c);
    }

    /* renamed from: setWXRequestData */
    public void m83033x7c1e2016(java.util.Map<java.lang.String, java.lang.String> map) {
        mo83006x226c38ed(false, false);
        if (map != null) {
            r45.r1 c17 = at4.g0.c();
            if (c17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "location found");
                map.put("province", c17.f465940d);
                if (!map.containsKey("city")) {
                    map.put("city", c17.f465941e);
                }
                map.put("location_timestamp", c17.f465944h + "");
                map.put("encrypt_key", c17.f465948o + "");
                map.put("encrypt_userinfo", c17.f465947n + "");
                if (at4.g0.g()) {
                    map.put("encrypt_cellinfo", c17.f465949p + "");
                }
            }
            java.lang.Object[] array = map.keySet().toArray();
            java.util.Arrays.sort(array);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = false;
            for (java.lang.Object obj : array) {
                java.lang.String str = map.get(obj);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    if (z17) {
                        sb6.append("&");
                    }
                    sb6.append(obj);
                    sb6.append("=");
                    sb6.append(str);
                    z17 = true;
                }
            }
            if (z65.c.a()) {
                mo83013xb2b366a7();
            }
            byte[] bytes = sb6.toString().getBytes();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            mo83026xd36d8220(this.f295573rr, cu5Var);
        }
    }

    /* renamed from: shouldResolveJsonWhenError */
    public boolean mo68416xd2dc02ad() {
        return false;
    }

    /* renamed from: setPayInfo */
    public void m83031x824a7eb4(com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, boolean z17) {
        if (map2 == null) {
            map2 = new java.util.HashMap<>();
        }
        if (c19760x34448d56 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Cmd : " + mo83013xb2b366a7() + ", payInfo is null");
            map2.put("devicename", wo.w0.m());
            m83033x7c1e2016(map2);
            return;
        }
        map.put("req_key", c19760x34448d56.f273647m);
        map.put("partner_id", c19760x34448d56.f273651q);
        map.put("pay_sign", c19760x34448d56.f273652r);
        if (c19760x34448d56.H > -1) {
            map.put("auto_deduct_flag", c19760x34448d56.H + "");
        }
        if (c19760x34448d56.f273642e > 0) {
            map.put("pay_scene", c19760x34448d56.f273642e + "");
        }
        if (c19760x34448d56.f273641d >= 0) {
            map.put("bindbankscene", c19760x34448d56.f273641d + "");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19760x34448d56.I)) {
            map.put("deduct_bank_type", c19760x34448d56.I);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19760x34448d56.f273640J)) {
            map.put("deduct_bind_serial", c19760x34448d56.f273640J);
        }
        if (z17) {
            map.put("use_touch", "0");
        } else {
            map.put("use_touch", "" + c19760x34448d56.f273658x);
        }
        map.put("fp_identify_num", "" + c19760x34448d56.D);
        if (!android.text.TextUtils.isEmpty(c19760x34448d56.A)) {
            map.put("encrypted_pay_info", java.net.URLEncoder.encode(c19760x34448d56.A));
        }
        if (!android.text.TextUtils.isEmpty(c19760x34448d56.B)) {
            map.put("encrypted_rsa_sign", java.net.URLEncoder.encode(c19760x34448d56.B));
        }
        map2.put("uuid", c19760x34448d56.f273648n);
        map2.put("appid", c19760x34448d56.f273649o);
        map2.put("appsource", c19760x34448d56.f273650p);
        map2.put("channel", c19760x34448d56.f273644g + "");
        map2.put("devicename", wo.w0.m());
        map2.put("soter_req", c19760x34448d56.G);
    }

    /* renamed from: getRetModel */
    public static void m83002x6758cc7e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "hy: resolve system error.");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
        if (d17 != null) {
            oVar.f295487c = (java.lang.String) d17.get(".e.Content");
            return;
        }
        if (i18 != -1 && i18 != -500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "hy: unknown system error");
            oVar.f295487c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "hy: network error");
            oVar.f295487c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.krl);
        }
    }
}

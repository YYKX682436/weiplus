package wo3;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f529739h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final wo3.m f529740d;

    /* renamed from: e, reason: collision with root package name */
    public final ss4.e0 f529741e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o f529742f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o f529743g;

    public p(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        wo3.m mVar = new wo3.m("" + java.lang.System.currentTimeMillis(), i17);
        this.f529740d = mVar;
        m83032xb4c13117(mVar.f529738i);
        ss4.e0 e0Var = new ss4.e0(str, i18);
        this.f529741e = e0Var;
        e0Var.D = true;
        java.util.HashMap hashMap = (java.util.HashMap) e0Var.f493581s;
        hashMap.put("event_id", java.lang.String.valueOf(i19));
        hashMap.put("event_feature", str2);
        yo3.m.l();
        hashMap.put("is_new_authcodes", "1");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a17 = yo3.f.f545678a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.f69225xed6d60f6);
            hashMap.put("prefer_bank_type", a17.f69223x58802fcb);
        } else {
            yo3.d dVar = yo3.f.f545679b;
            if (dVar != null) {
                java.lang.String b17 = dVar.b();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                    hashMap.put("prefer_bind_serial", b17);
                    if (b17.equalsIgnoreCase("LQT")) {
                        hashMap.put("prefer_bank_type", "LQT");
                    }
                }
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sImpl");
                throw null;
            }
        }
        m83003x698ba778(hashMap);
        m83033x7c1e2016(e0Var.f493582t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }

    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o H(org.json.JSONObject jSONObject) {
        int i17;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o();
        oVar.f295487c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
        try {
            i17 = jSONObject.getInt("retcode");
            string = jSONObject.optString("retmsg");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: json resolve error: error when resolving error code : " + e17.toString());
            i17 = -10089;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: resolve busi error: retCode is error");
            if (i17 != -10089) {
                oVar.a(1000, i17, string, 2);
            } else {
                oVar.a(1000, 2, string, 2);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: all's OK");
        }
        return oVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1742;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1742;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineuserbindquery";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        if (optJSONObject != null) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_OFFLINE_JUMPINFOPAGE_DATA_STRING_SYNC, optJSONObject.toString());
        } else {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_OFFLINE_JUMPINFOPAGE_DATA_STRING_SYNC, "");
        }
        if (i17 != 0) {
            return;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("queryuser_resp");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o H = H(optJSONObject2);
        this.f529742f = H;
        this.f529740d.mo1065x5f9cdc6f(H.f295486b, H.f295487c, optJSONObject2);
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("bindquerynew_resp");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o H2 = H(optJSONObject3);
        this.f529743g = H2;
        this.f529741e.mo1065x5f9cdc6f(H2.f295486b, H2.f295487c, optJSONObject3);
        if (optJSONObject2 != null) {
            java.lang.String optString = optJSONObject2.optString("card_list");
            if (optString != null) {
                to3.c0.Ai().Vi(196656, optString);
                yo3.m.f545689c = optString;
            }
            org.json.JSONObject optJSONObject4 = optJSONObject2.optJSONObject("prefer_card");
            if (optJSONObject4 != null) {
                java.lang.String optString2 = optJSONObject4.optString("bind_serial");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                    vr4.f1.wi().Ai().getClass();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, optString2);
                    yo3.f fVar = yo3.f.f545678a;
                    yo3.d dVar = yo3.f.f545679b;
                    if (dVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sImpl");
                        throw null;
                    }
                    if (dVar instanceof yo3.c) {
                        fVar.c();
                    }
                }
            }
            java.lang.String optString3 = optJSONObject2.optString("prefer_card_changed_wording");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                return;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, optString3);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: shouldResolveJsonWhenError */
    public boolean mo68416xd2dc02ad() {
        return true;
    }

    public p(int i17, java.lang.String str, int i18, int i19, java.lang.String str2, int i27) {
        wo3.m mVar = new wo3.m("" + java.lang.System.currentTimeMillis(), i17);
        this.f529740d = mVar;
        m83032xb4c13117(mVar.f529738i);
        ss4.e0 e0Var = new ss4.e0(str, i18);
        this.f529741e = e0Var;
        e0Var.D = true;
        java.util.HashMap hashMap = (java.util.HashMap) e0Var.f493581s;
        hashMap.put("event_id", java.lang.String.valueOf(i19));
        hashMap.put("event_feature", str2);
        hashMap.put("is_first_show", java.lang.String.valueOf(i27));
        yo3.m.l();
        hashMap.put("is_new_authcodes", "1");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a17 = yo3.f.f545678a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.f69225xed6d60f6);
            hashMap.put("prefer_bank_type", a17.f69223x58802fcb);
        }
        m83003x698ba778(hashMap);
        m83033x7c1e2016(e0Var.f493582t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }

    public p(int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        wo3.m mVar = new wo3.m("" + java.lang.System.currentTimeMillis(), i17);
        this.f529740d = mVar;
        m83032xb4c13117(mVar.f529738i);
        ss4.e0 e0Var = new ss4.e0(str, i18);
        this.f529741e = e0Var;
        e0Var.D = true;
        java.util.HashMap hashMap = (java.util.HashMap) e0Var.f493581s;
        hashMap.put("event_id", java.lang.String.valueOf(i19));
        hashMap.put("event_feature", str2);
        hashMap.put("package", str4);
        hashMap.put("appId", str3);
        yo3.m.l();
        hashMap.put("is_new_authcodes", "1");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a17 = yo3.f.f545678a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.f69225xed6d60f6);
            hashMap.put("prefer_bank_type", a17.f69223x58802fcb);
        }
        m83003x698ba778(hashMap);
        m83033x7c1e2016(e0Var.f493582t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }
}

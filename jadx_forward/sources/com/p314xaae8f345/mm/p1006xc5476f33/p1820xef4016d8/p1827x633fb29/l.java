package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m();
        mVar.f226969b = "";
        mVar.f226971d = "";
        r45.wv3 wv3Var = new r45.wv3();
        wv3Var.f471033f = "";
        wv3Var.f471031d = "";
        wv3Var.f471034g = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m.f226967e.b(false);
        mVar.f226968a = wv3Var;
        return mVar;
    }

    public final r45.xv3 b(boolean z17) {
        r45.xv3 xv3Var = new r45.xv3();
        xv3Var.f472010d = "";
        xv3Var.f472011e = "";
        xv3Var.f472012f = "";
        xv3Var.f472013g = "";
        xv3Var.f472014h = "";
        xv3Var.f472015i = "";
        xv3Var.f472016m = "";
        xv3Var.f472017n = "";
        xv3Var.f472018o = "";
        xv3Var.f472019p = "";
        xv3Var.f472020q = "";
        xv3Var.f472021r = "";
        xv3Var.f472022s = "";
        xv3Var.f472023t = "";
        xv3Var.f472024u = 0;
        xv3Var.f472025v = "";
        xv3Var.f472026w = "";
        xv3Var.f472027x = "";
        xv3Var.f472028y = "";
        xv3Var.f472029z = "";
        xv3Var.A = "";
        xv3Var.B = "";
        xv3Var.C = "";
        xv3Var.D = 0;
        xv3Var.E = "";
        xv3Var.F = "";
        xv3Var.G = "";
        xv3Var.H = "";
        xv3Var.I = "";
        xv3Var.f472009J = "";
        xv3Var.M = "";
        xv3Var.N = "";
        xv3Var.L = z17;
        return xv3Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 c() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_STRING_SYNC, "");
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        java.lang.String str2 = str != null ? str : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopSourceMac", "[getProtoDataCache] dataStr is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0();
        try {
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ISO_8859_1, "ISO_8859_1");
            byte[] bytes = str2.getBytes(ISO_8859_1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            k0Var.mo11468x92b714fd(bytes);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p0 p0Var = k0Var.f226897d;
            if (p0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopSourceMac", "[getProtoDataCache] success， is default source? %s , id：%s , expired_time：%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f227059f)), p0Var.f227059f, java.lang.Integer.valueOf(p0Var.f227069s));
                return k0Var;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopSourceMac", "[getProtoDataCache] fail: %s", e17.getLocalizedMessage());
        }
        return null;
    }

    public final boolean d() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_prepare_use_new_logic_close, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopSourceMac", "[useNewLogic] needCloseNewLogic");
            return false;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_USE_NEW_LOGIC_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        java.lang.Boolean bool = m17 instanceof java.lang.Boolean ? (java.lang.Boolean) m17 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopSourceMac", "[useNewLogic] %s", java.lang.Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopSourceMac", "json is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m();
        java.lang.String optString = jSONObject.optString("showSourceMac");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        mVar.f226969b = optString;
        java.lang.String optString2 = jSONObject.optString("illegal_msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        mVar.f226971d = optString2;
        mVar.f226970c = jSONObject.optBoolean("is_illegal");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("showSource");
        if (optJSONObject != null) {
            mVar.f226968a = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.b(optJSONObject);
        }
        java.lang.String optString3 = jSONObject.optString("cover_info_buffer_for_place_order");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            r45.wv3 wv3Var = mVar.f226968a;
            r45.km5 km5Var = new r45.km5();
            try {
                km5Var.mo11468x92b714fd(android.util.Base64.decode(optString3.getBytes(), 0));
            } catch (java.io.IOException unused) {
            }
            r45.xv3 xv3Var = wv3Var.f471034g;
            if (xv3Var != null) {
                xv3Var.f472024u = km5Var.f460364d;
                xv3Var.f472025v = km5Var.f460365e;
                xv3Var.f472029z = km5Var.f460366f;
            }
            mVar.f226968a = wv3Var;
        }
        return mVar;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = k0Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ISO_8859_1, "ISO_8859_1");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_STRING_SYNC, new java.lang.String(mo14344x5f01b1f6, ISO_8859_1));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p0 p0Var = k0Var.f226897d;
            if (p0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopSourceMac", "[setProtoDataCache] success， is default source? %s, id：%s , expired_time：%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f227059f)), p0Var.f227059f, java.lang.Integer.valueOf(p0Var.f227069s));
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopSourceMac", "[setProtoDataCache] failed :%s", e17.getMessage());
        }
    }
}

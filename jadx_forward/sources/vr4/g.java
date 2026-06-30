package vr4;

/* loaded from: classes9.dex */
public final class g implements vg3.r4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg3.r4
    public void h0(java.lang.String subType, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) values.get(".sysmsg.paymsg.PayMsgType"), 0);
        java.lang.String str = "";
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
        f9Var = null;
        f9Var = null;
        f9Var = null;
        if (P != 60) {
            if (P != 61) {
                return;
            }
            java.lang.String str2 = (java.lang.String) values.get(".sysmsg.paymsg.app_id");
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = (java.lang.String) values.get(".sysmsg.paymsg.path");
            java.lang.String str4 = (java.lang.String) values.get(".sysmsg.paymsg.query");
            java.lang.String str5 = (java.lang.String) values.get(".sysmsg.paymsg.is_half_screen");
            java.lang.String str6 = (java.lang.String) values.get(".sysmsg.paymsg.height_percent");
            java.lang.Double valueOf = str6 != null ? java.lang.Double.valueOf(java.lang.Double.parseDouble(str6)) : null;
            java.lang.String str7 = (java.lang.String) values.get(".sysmsg.paymsg.is_transparent");
            java.lang.String str8 = (java.lang.String) values.get(".sysmsg.paymsg.min_version");
            java.lang.String str9 = (java.lang.String) values.get(".sysmsg.paymsg.anim_in");
            if (str9 == null) {
                str9 = "sight_slide_bottom_in";
            }
            java.lang.String str10 = (java.lang.String) values.get(".sysmsg.paymsg.anim_out");
            if (str10 == null) {
                str10 = "sight_slide_bottom_out";
            }
            java.lang.String str11 = (java.lang.String) values.get(".sysmsg.paymsg.busi_data");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonPayNewXmlListener", "receive newxml for handleOpenPayLiteAppMsg values:" + values);
            java.util.ArrayList arrayList = (java.util.ArrayList) ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tj(str2);
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonPayNewXmlListener", "current LiteApp is exist:".concat(str2));
                java.lang.Long l17 = (java.lang.Long) arrayList.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65269x10864c08(l17.longValue(), new android.content.Intent());
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", str2);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str3);
            if (str11 != null) {
                str = "busiData=" + java.net.URLEncoder.encode(str11, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            }
            if (str4 != null) {
                if (str4.length() > 0) {
                    str = str4 + '&' + str;
                }
            }
            bundle.putString("query", str);
            bundle.putBoolean("isHalfScreen", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "1"));
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str7, "1"));
            bundle.putString("minVersion", str8);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("nextAnimIn", str9);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            bundle.putInt("nextAnimIn", ra3.h0.a(jSONObject));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("currentAnimOut", str10);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            bundle.putInt("currentAnimOut", ra3.h0.b(jSONObject2));
            if (valueOf != null) {
                double doubleValue = valueOf.doubleValue();
                if (java.lang.Double.compare(doubleValue, 0.0f) > 0) {
                    bundle.putDouble("heightPercent", doubleValue);
                }
            }
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.APP;
            c3708xc1f46f80.f14312x721f2ec7 = "handleOpenPayLiteAppMsg";
            bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, false, new vr4.f());
            return;
        }
        java.lang.String str12 = (java.lang.String) values.get(".sysmsg.paymsg.appmsgcontent");
        java.lang.String str13 = (java.lang.String) values.get(".sysmsg.paymsg.paymsgid");
        java.lang.String str14 = (java.lang.String) values.get(".sysmsg.paymsg.systip");
        java.lang.String str15 = (java.lang.String) values.get(".sysmsg.paymsg.fromusername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonPayNewXmlListener", "receive newxml for third c2c message, payMsgId:" + str13 + " sysTip:" + str14 + " fromUsername:" + str15);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                jz5.g gVar = rb3.g.f475391a;
                up5.a0 a0Var = (up5.a0) ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) rb3.g.f475393c).mo141623x754a37bb()).m107127x946de4d9(up5.m.f511548c.eq(str13));
                if (a0Var != null) {
                    java.lang.Long msgId = a0Var.f511422b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgId, "msgId");
                    if (msgId.longValue() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonPayNewXmlListener", "find third c2c msg:" + a0Var.f511422b + " in db");
                        pt0.e0 e0Var = pt0.f0.f439742b1;
                        java.lang.String str16 = a0Var.f511423c;
                        java.lang.Long msgId2 = a0Var.f511422b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgId2, "msgId");
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(str16, msgId2.longValue());
                        if (n17.m124847x74d37ac6() > 0) {
                            f9Var = n17;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CommonPayNewXmlListener", "can not find third c2c msg:" + a0Var.f511422b + " in message");
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CommonPayNewXmlListener", "can not find third c2c record for payMsgId:" + str13);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CommonPayNewXmlListener", e17, "", new java.lang.Object[0]);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12) && f9Var != null) {
            java.lang.String decode = java.net.URLDecoder.decode(str12);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
            f9Var.d1(decode);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str15) || f9Var == null) {
            return;
        }
        java.lang.String decode2 = java.net.URLDecoder.decode(str14);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str15);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var2.j1(0);
        f9Var2.u1(str15);
        f9Var2.r1(6);
        f9Var2.d1(decode2);
        f9Var2.e1(c01.w9.m(str15, java.lang.System.currentTimeMillis() / 1000));
        f9Var2.m124850x7650bebc(10000);
        f9Var2.f1(f9Var2.w0() | 8);
        long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonPayNewXmlListener", "insert msgId: %s", java.lang.Long.valueOf(M9));
        if (M9 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CommonPayNewXmlListener", "insert sys msg fail!");
        }
    }
}

package ed;

/* loaded from: classes9.dex */
public final class d {
    public static final void a(ed.d dVar, java.lang.String str, ed.a aVar) {
        dVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", ed.b.f332731f);
        jSONObject.put("msg", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", str);
        aVar.mo28747xc397f4dd(jSONObject);
    }

    public static final void b(ed.d dVar, byte[] bArr, ed.a aVar) {
        dVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", ed.b.f332729d);
        jSONObject.put("msg", ya.b.f77504xbb80cbe3);
        r45.wv3 wv3Var = new r45.wv3();
        wv3Var.mo11468x92b714fd(bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back, source=%s", wv3Var.toString());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("corpName", wv3Var.f471031d);
        jSONObject2.put("subType", wv3Var.f471032e);
        jSONObject2.put("materialId", wv3Var.f471033f);
        jSONObject2.put("expire_desc", wv3Var.f471035h);
        jSONObject2.put("is_expired", wv3Var.f471036i);
        jSONObject2.put("is_selected", wv3Var.f471037m);
        jSONObject2.put("obtain_time", wv3Var.f471038n);
        jSONObject2.put("material_flag", wv3Var.f471039o);
        jSONObject2.put("user_flag", wv3Var.f471040p);
        jSONObject2.put("leave_text", wv3Var.f471041q);
        jSONObject2.put("temp_text", wv3Var.f471042r);
        jSONObject2.put("detail_link_type", wv3Var.f471043s);
        jSONObject2.put("detail_link_appname", wv3Var.f471044t);
        jSONObject2.put("detail_link_url", wv3Var.f471045u);
        jSONObject2.put("detail_link_title", wv3Var.f471046v);
        jSONObject2.put("exchange_title", wv3Var.f471047w);
        jSONObject2.put("exchange_url", wv3Var.f471048x);
        jSONObject2.put("exchange_title", wv3Var.f471047w);
        jSONObject2.put("has_source", wv3Var.f471049y);
        jSONObject2.put("last_obtain_time", wv3Var.f471050z);
        jSONObject2.put("disable", wv3Var.A);
        jSONObject2.put("disable_text", wv3Var.B);
        jSONObject2.put("timelimit_promo_text", wv3Var.C);
        jSONObject2.put("timelimit_promo_signature", wv3Var.D);
        r45.xv3 xv3Var = wv3Var.f471034g;
        if (xv3Var != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("corpLogo", xv3Var.f472010d);
            jSONObject3.put("bubbleImage", xv3Var.f472011e);
            jSONObject3.put("coverImage", xv3Var.f472012f);
            jSONObject3.put("detailImage", xv3Var.f472013g);
            jSONObject3.put("bubbleImageMd5", xv3Var.f472014h);
            jSONObject3.put("coverImageMd5", xv3Var.f472015i);
            jSONObject3.put("detailImageMd5", xv3Var.f472016m);
            jSONObject3.put("corpLogoMd5", xv3Var.f472017n);
            jSONObject3.put("coverWidgetImage", xv3Var.f472018o);
            jSONObject3.put("coverWidgetImageMd5", xv3Var.f472019p);
            jSONObject3.put("bubbleWidgetImage", xv3Var.f472020q);
            jSONObject3.put("bubbleWidgetImageMd5", xv3Var.f472021r);
            jSONObject3.put("receiverC2cWidgetImage", xv3Var.f472022s);
            jSONObject3.put("receiverC2cWidgetImageMd5", xv3Var.f472023t);
            jSONObject3.put("StatusFlag", java.lang.Integer.valueOf(xv3Var.f472024u));
            jSONObject3.put("corpLogoDynamic", xv3Var.f472025v);
            jSONObject3.put("bubbleImageDynamic", xv3Var.f472026w);
            jSONObject3.put("coverImageDynamic", xv3Var.f472027x);
            jSONObject3.put("detailImageDynamic", xv3Var.f472028y);
            jSONObject3.put("corpLogoDynamicMd5", xv3Var.f472029z);
            jSONObject3.put("bubbleImageDynamicMd5", xv3Var.A);
            jSONObject3.put("coverImageDynamicMd5", xv3Var.B);
            jSONObject3.put("detailImageDynamicMd5", xv3Var.C);
            jSONObject3.put("coverImageDynamicType", java.lang.Integer.valueOf(xv3Var.D));
            jSONObject2.putOpt("sourceObject", jSONObject3);
        }
        r45.r74 r74Var = wv3Var.E;
        if (r74Var != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("appid", r74Var.f466118d);
            jSONObject4.put("query", r74Var.f466119e);
            jSONObject4.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, r74Var.f466120f);
            jSONObject4.put("default_url", r74Var.f466121g);
            jSONObject2.putOpt("cover_set_liteapp_info", jSONObject4);
        }
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppLuckyMoneyPickEnvelopeService", "on pick envelope activity call back success, result: %s", jSONObject.toString());
        aVar.mo28747xc397f4dd(jSONObject);
    }
}

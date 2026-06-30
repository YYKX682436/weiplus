package b30;

@j95.b
/* loaded from: classes.dex */
public final class k extends i95.w implements c00.w2 {
    public void Ai(android.content.Context context, int i17, org.json.JSONObject data, com.p314xaae8f345.mm.ui.da daVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsAddressFeatureService", "openMyAddress context is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsAddressFeatureService", "openMyAddress, data: " + data);
        int optInt = data.optInt("selectedAddressId", -1);
        java.lang.String optString = data.optString("appId", "");
        int optInt2 = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String optString2 = data.optString("from", "select");
        boolean optBoolean = data.optBoolean("isHalfScreen", false);
        boolean optBoolean2 = data.optBoolean("isPopupTransition", false);
        int optInt3 = data.optInt("halfPageViewHeight", -1);
        android.content.Intent intent = new android.content.Intent();
        if (optBoolean) {
            boolean optBoolean3 = data.optBoolean("clickEmptyClose", false);
            boolean optBoolean4 = data.optBoolean("isForceLightMode", false);
            intent.putExtra("content_view_height", optInt3);
            intent.putExtra("click_empty_close", optBoolean3);
            intent.putExtra("force_light_mode", optBoolean4);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() > 0) {
            intent.putExtra("req_app_id", optString);
        }
        intent.putExtra("enter_scene_address", optInt2);
        if (optBoolean2) {
            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13299xd840884e, com.p314xaae8f345.mm.R.C30854x2dc211.f559344c5);
            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13300x5b49b5b2, com.p314xaae8f345.mm.R.C30854x2dc211.f559364cp);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "select")) {
            intent.putExtra("pageTitle", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nni));
            intent.putExtra("init_addr_id", optInt);
            intent.putExtra("KEY_ITEM_SHOW_EDIT", true);
            intent.putExtra("KEY_ITEM_SHOW_COPY", false);
            intent.putExtra("item_selectable", true);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, "manage")) {
            intent.putExtra("pageTitle", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nng));
            intent.putExtra("KEY_ITEM_SHOW_COPY", true);
            intent.putExtra("KEY_ITEM_SHOW_EDIT", false);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new b30.j(daVar));
        }
        j45.l.o(context, "address", ".ui.WalletSelectAddrUI", intent, i17, false);
    }

    public org.json.JSONObject wi(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String substring;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsAddressFeatureService", "convertIntentToJson, data is null");
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("nationalCode");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("userName");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = intent.getStringExtra("telNumber");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        java.lang.String stringExtra4 = intent.getStringExtra("addressPostalCode");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        java.lang.String stringExtra5 = intent.getStringExtra("proviceFirstStageName");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        java.lang.String stringExtra6 = intent.getStringExtra("addressCitySecondStageName");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        java.lang.String stringExtra7 = intent.getStringExtra("addressCountiesThirdStageName");
        java.lang.String str3 = stringExtra7 != null ? stringExtra7 : "";
        java.lang.String stringExtra8 = intent.getStringExtra("addressCountiesFourStageName");
        if (stringExtra8 == null) {
            stringExtra8 = "";
        }
        java.lang.String stringExtra9 = intent.getStringExtra("addressDetailInfo");
        if (stringExtra9 == null) {
            str = "addressDetailInfo";
            str2 = "";
        } else {
            str = "addressDetailInfo";
            str2 = stringExtra9;
        }
        int intExtra = intent.getIntExtra("addressID", 0);
        int intExtra2 = intent.getIntExtra("formatErrorCode", 0);
        java.lang.String concat = (!(stringExtra8.length() > 0) || r26.i0.y(str2, stringExtra8, false)) ? str2 : stringExtra8.concat(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsAddressFeatureService", "first =  " + stringExtra5 + " ; detail =" + str2 + "; second = " + stringExtra6 + " ; tel = " + stringExtra3 + "; third = " + str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (stringExtra.length() < 6) {
            substring = stringExtra;
        } else {
            substring = stringExtra.substring(0, 6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        }
        jSONObject.put("nationalCode", substring);
        jSONObject.put("userName", stringExtra2);
        jSONObject.put("telNumber", stringExtra3);
        jSONObject.put("addressPostalCode", stringExtra4);
        jSONObject.put("proviceFirstStageName", stringExtra5);
        jSONObject.put("addressCitySecondStageName", stringExtra6);
        jSONObject.put("addressCountiesThirdStageName", str3);
        jSONObject.put("addressStreetFourthStageName", stringExtra8);
        jSONObject.put(str, concat);
        jSONObject.put("addressDetailInfoNew", str2);
        jSONObject.put("nationalCodeFull", stringExtra);
        jSONObject.put("addressID", java.lang.String.valueOf(intExtra));
        jSONObject.put("formatErrorCode", java.lang.String.valueOf(intExtra2));
        return jSONObject;
    }
}

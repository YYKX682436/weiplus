package hc2;

/* loaded from: classes2.dex */
public abstract class e0 {
    public static void a(android.content.Intent intent, int i17, java.lang.String enterExtraInfo, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            enterExtraInfo = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterExtraInfo, "enterExtraInfo");
        if (i17 <= 0) {
            i17 = intent.getIntExtra("report_scene", 0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(enterExtraInfo) && (enterExtraInfo = intent.getStringExtra("key_extra_info")) == null) {
            enterExtraInfo = "";
        }
        java.lang.String stringExtra = intent.getStringExtra("CLIENT_KV_REPORTINFO");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        java.lang.String stringExtra2 = intent.getStringExtra("KEY_SEARCH_WRORD");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = str.length() > 0 ? new org.json.JSONObject(str) : new org.json.JSONObject();
            if (stringExtra2 != null) {
                jSONObject2.put("search_word", stringExtra2);
            }
            if (i17 > 0) {
                if (i17 == 1) {
                    jSONObject2.put("from_user", intent.getStringExtra("from_user"));
                    jSONObject2.put("wx_chat_id", intent.getStringExtra("key_from_user_name"));
                } else if (i17 == 2) {
                    jSONObject2.put("from_user", intent.getStringExtra("from_user"));
                    jSONObject2.put("roomid", intent.getStringExtra("key_to_user_name"));
                    jSONObject2.put("wx_chat_id", intent.getStringExtra("key_from_user_name"));
                } else if (i17 == 3) {
                    jSONObject2.put("from_user", intent.getStringExtra("from_user"));
                } else if (i17 == 11) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject(enterExtraInfo);
                    jSONObject2.put("bizuin", jSONObject3.optString("bizuin"));
                    jSONObject2.put("url", jSONObject3.optString("url"));
                } else if (i17 == 2000) {
                    jSONObject2.put("export_url", intent.getStringExtra("KEY_SCAN_EXPORT_URL"));
                    jSONObject2.put("scan_type", java.lang.String.valueOf(intent.getIntExtra("KEY_SCAN_TYPE", 0)));
                }
            }
            try {
                jSONObject2.put("mini_prog_id", new org.json.JSONObject(enterExtraInfo).optJSONObject("weapp_info").optString("appid"));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "[addClientReportBuffInfo], mini_prog_id null");
            }
            jSONObject.put("clientReportInfo", jSONObject2);
            intent.putExtra("key_common_extra_info", jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderExt", e17, "addClientReportBuffInfo", new java.lang.Object[0]);
        }
    }

    public static final void b(android.content.Intent intent, int i17, java.util.List feedList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13923x8eacaf9a c13923x8eacaf9a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13923x8eacaf9a();
        c13923x8eacaf9a.m56387xe6796cde().addAll(feedList);
        c13923x8eacaf9a.m56377x73095078(gVar);
        c13923x8eacaf9a.m56371x9666405(intent, i17, cVar);
    }
}

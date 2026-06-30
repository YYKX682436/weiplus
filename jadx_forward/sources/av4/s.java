package av4;

/* loaded from: classes.dex */
public final class s extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.s f95864d = new av4.s();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenFinderNativeDramaFeedJSApi", "openFinderNativeDramaFeed");
        java.lang.String str = (java.lang.String) msg.f422323a.get("dramaInfo");
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("episodeID");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object obj = msg.f422323a.get("popDetail");
        java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str3 == null) {
            str3 = "false";
        }
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str3);
        java.lang.String str4 = (java.lang.String) msg.f422323a.get("reportExtraInfo");
        java.lang.Object obj2 = msg.f422323a.get("isInsideFinder");
        java.lang.String str5 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        boolean parseBoolean2 = java.lang.Boolean.parseBoolean(str5 != null ? str5 : "false");
        if (str == null) {
            str = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        java.lang.Object obj3 = msg.f422323a.get("entryCardType");
        java.lang.Integer num = obj3 instanceof java.lang.Integer ? (java.lang.Integer) obj3 : null;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Object obj4 = msg.f422323a.get("commentScene");
        java.lang.Integer num2 = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.String optString3 = jSONObject.optString("dramaSessionBuffer");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_info", str4);
        java.lang.String Yj = parseBoolean2 ? ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Yj() : null;
        if (Yj == null || Yj.length() == 0) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            if (intValue2 == 0) {
                intValue2 = 6;
            }
            if (intValue == 0) {
                intValue = 2;
            }
            ((c61.l7) b6Var).Bj(intValue2, intValue, 356, intent);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(Yj, intent);
        }
        intent.putExtra("KEY_JSAPI_SOURCE_TYPE", 2);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(context instanceof android.app.Activity)) {
            context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f.class);
        intent.putExtra("native_drama_export_id", optString);
        intent.putExtra("native_drama_export_object_id", str2);
        intent.putExtra("native_drama_title", optString2);
        intent.putExtra("native_drama_open_drawer", parseBoolean);
        intent.putExtra("native_drama_session_buffer", optString3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        android.content.Context context2 = context;
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderNativeDramaTimelineUIFromJsApi", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderNativeDramaTimelineUIFromJsApi", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderNativeDramaFeed";
    }
}

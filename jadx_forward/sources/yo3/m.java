package yo3;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f545687a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f545688b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f545689c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f545690d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f545691e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f545692f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f545693g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f545694h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f545695i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f545696j = false;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f545697k = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f545698l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f545699m = "";

    public static void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "clear offline data");
        to3.c0.Ai().Vi(196630, "0");
        to3.c0.Ai().Vi(196626, "");
        to3.c0.Ai().Vi(196627, "");
        to3.c0.Ai().Vi(196628, "");
        to3.c0.Ai().Vi(196617, "");
        to3.c0.Ai().Vi(196632, "");
        to3.c0.Ai().Vi(196641, "");
        to3.c0.Ai().Vi(196647, "");
        to3.c0.Ai().Vi(196649, "");
        l();
        t("", "", "", "", 2);
        r(0);
        to3.c0.Ai().Vi(196629, "0");
        to3.c0.Ai().Vi(196631, "");
        to3.c0.Ai().Ri().f529678b = null;
        to3.c0.Ai().Ui().getClass();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().a(to3.c0.Ai().Ni(196617));
        to3.c0.Ai().Vi(196615, "");
        f545691e = "";
        to3.c0.Ai().Vi(196656, "");
        f545689c = "";
    }

    public static void b(android.app.Activity activity, int i17) {
        java.lang.String Ni = to3.c0.Ai().Ni(196640);
        int i18 = 0;
        if (!android.text.TextUtils.isEmpty(Ni) && j(Ni)) {
            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni, 0);
        }
        y(activity, "create", "", i18 > 0 ? i18 * 100 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059, i17);
    }

    public static java.util.List c(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        for (int i17 = 0; i17 < a17.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) a17.get(i17);
            if (z17) {
                arrayList.add(c19091x9511676c);
            } else {
                arrayList.add(c19091x9511676c);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "getBindBankCardList() list size is " + arrayList.size());
        return arrayList;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a17 = yo3.f.f545678a.a(z17);
        if (a17 != null && a17.f69260x2a326a79 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f69239x93565523)) {
            return a17;
        }
        java.util.ArrayList a18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        for (int i17 = 0; i17 < a18.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) a18.get(i17);
            if (c19091x9511676c != null && c19091x9511676c.f69260x2a326a79) {
                return c19091x9511676c;
            }
        }
        return null;
    }

    public static java.lang.String e() {
        if (!android.text.TextUtils.isEmpty(f545687a)) {
            return f545687a;
        }
        gm0.j1.n().f354821b.g(new c01.ra(new yo3.j(), null));
        if (android.text.TextUtils.isEmpty(f545687a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOfflineUtil", "token is null");
        }
        return f545687a;
    }

    public static int f() {
        if (f545692f == 0) {
            f545692f = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_TOKEN_TYPE_INT_SYNC, 0)).intValue();
        }
        return f545692f;
    }

    public static int g() {
        java.lang.String Ni = to3.c0.Ai().Ni(196649);
        if (android.text.TextUtils.isEmpty(Ni) || !j(Ni)) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(Ni, 0);
    }

    public static void h(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "launch 3rd app: %s", str);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOfflineUtil", "can not find app info");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11301xc3d8400e.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11301xc3d8400e.Resp();
        resp.f32867xa7c470f2 = 0;
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = h17.f67386xa1e9e82c;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }

    public static boolean i() {
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        if (!((h45.q) i95.n0.c(h45.q.class)).mo24775x5d907d7e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "isKindaEnabled false");
            return false;
        }
        boolean mo24777x653c03ca = ((h45.q) i95.n0.c(h45.q.class)).mo24777x653c03ca();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "is kinda ready is %s", java.lang.Boolean.valueOf(mo24777x653c03ca));
        if (!k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "offlinepay is not create, depend on isKindaReady");
            if (!mo24777x653c03ca && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 112L, 1L, false);
                com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_offline_kinda_ready, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "offline mainui cache is not ready, but user connect to network, abtest is on, return YES");
                    return true;
                }
            }
            return mo24777x653c03ca;
        }
        if (!(f() == 2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "abtest is on, but using v1authcode, request get token");
            to3.c0.Ai().Ui().b(1, 1);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "using v2authcode, depend on isKindaReady");
        if (!mo24777x653c03ca && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 111L, 1L, false);
            com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_offline_kinda_ready, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "offline mainui cache is not ready, but user connect to network, abtest is on, return YES");
                return true;
            }
        }
        return mo24777x653c03ca;
    }

    public static boolean j(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return java.util.regex.Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static boolean k() {
        java.lang.String Ni = to3.c0.Ai().Ni(196630);
        return Ni != null && Ni.equals("1");
    }

    public static int l() {
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        return 1;
    }

    public static boolean m() {
        java.lang.String Ni = to3.c0.Ai().Ni(196641);
        return Ni != null && Ni.equals("1");
    }

    public static void n(android.content.Context context) {
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        boolean z17 = false;
        java.lang.String a17 = j62.e.g().a("clicfg_wcpay_host_change_to_cn_android", "", false, false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17, 0) != 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, z17 ? "zh_CN".equals(d17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4m) : "zh_TW".equals(d17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4p) : "zh_HK".equals(d17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4o) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4n) : "zh_CN".equals(d17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4q) : "zh_TW".equals(d17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4t) : "zh_HK".equals(d17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4s) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4r), true);
    }

    public static java.util.LinkedList o(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            if (jSONObject != null) {
                yo3.k kVar = new yo3.k();
                kVar.f545683a = jSONObject.optInt("card_id");
                jSONObject.optString("bank_type");
                kVar.f545684b = jSONObject.optString("bind_serial");
                jSONObject.optString("forbid_word");
                linkedList.add(kVar);
            }
        }
        return linkedList;
    }

    public static java.util.LinkedList p(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    yo3.l lVar = new yo3.l();
                    lVar.f545685a = jSONObject.optString("bank_type");
                    lVar.f545686b = jSONObject.optString("icon_url");
                    linkedList.add(lVar);
                }
            }
            return linkedList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletOfflineUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static a36.c q(java.util.Map map, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6;
        java.lang.String str3;
        if (i17 == 0) {
            str = ".sysmsg.paymsg.user_roll.activity_info.record.exposure_info.";
        } else {
            str = ".sysmsg.paymsg.user_roll.activity_info.record" + i17 + ".exposure_info.";
        }
        if (map == null) {
            return null;
        }
        a36.c cVar = new a36.c();
        cVar.f82638e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + "is_query_others"), 0);
        cVar.f82639f = (java.lang.String) map.get(str + "draw_lottery_params");
        cVar.f82640g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + "is_show_btn"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + "exposure_info_modify_params");
        if (str4 == null) {
            str4 = "";
        }
        cVar.f82642i = str4;
        a36.a aVar = new a36.a();
        java.lang.String str5 = str + "btn_info.";
        aVar.f82624d = (java.lang.String) map.get(str5 + "btn_words");
        aVar.f82625e = (java.lang.String) map.get(str5 + "btn_color");
        aVar.f82626f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str5 + "btn_op_type"), 0);
        aVar.f82627g = (java.lang.String) map.get(str5 + "url");
        aVar.f82629i = (java.lang.String) map.get(str5 + "get_lottery_params");
        java.lang.String str6 = str5 + "mini_app_info.";
        a36.g gVar = new a36.g();
        aVar.f82628h = gVar;
        gVar.f82675d = (java.lang.String) map.get(str6 + "activity_tinyapp_username");
        aVar.f82628h.f82676e = (java.lang.String) map.get(str6 + "activity_tinyapp_path");
        a36.g gVar2 = aVar.f82628h;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str6);
        java.lang.String str7 = "activity_tinyapp_version";
        sb7.append("activity_tinyapp_version");
        gVar2.f82677f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb7.toString()), 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f82624d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f82627g) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f82629i) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f82628h.f82675d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f82628h.f82676e)) {
            cVar.f82641h = aVar;
        }
        cVar.f82643m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + "user_opertaion_type"), 0);
        cVar.f82644n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + "is_show_layer"), 0);
        cVar.f82646p = (java.lang.String) map.get(str + "background_img_whole");
        cVar.f82637d = new java.util.LinkedList();
        int i18 = 0;
        while (true) {
            if (i18 >= 255) {
                str2 = str7;
                break;
            }
            if (i18 == 0) {
                sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                str3 = "single_exposure_info_list.record.";
            } else {
                sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("single_exposure_info_list.record");
                sb6.append(i18);
                str3 = ".";
            }
            sb6.append(str3);
            java.lang.String sb8 = sb6.toString();
            a36.i iVar = new a36.i();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(sb8);
            str2 = str7;
            sb9.append("logo");
            iVar.f82682d = (java.lang.String) map.get(sb9.toString());
            iVar.f82683e = (java.lang.String) map.get(sb8 + "award_name");
            iVar.f82684f = (java.lang.String) map.get(sb8 + "award_description");
            iVar.f82685g = (java.lang.String) map.get(sb8 + "background_img");
            iVar.f82686h = (java.lang.String) map.get(sb8 + "award_name_color");
            iVar.f82687i = (java.lang.String) map.get(sb8 + "award_description_color");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82682d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82683e) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82684f) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82685g) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82686h) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82687i)) {
                cVar.f82637d.add(iVar);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82683e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82684f)) {
                break;
            }
            i18++;
            str7 = str2;
        }
        cVar.f82645o = new a36.f();
        java.lang.String str8 = str + "layer_info.";
        cVar.f82645o.f82666d = (java.lang.String) map.get(str8 + "layer_title");
        cVar.f82645o.f82667e = (java.lang.String) map.get(str8 + "layer_logo");
        cVar.f82645o.f82668f = (java.lang.String) map.get(str8 + "layer_type");
        cVar.f82645o.f82669g = (java.lang.String) map.get(str8 + "layer_name");
        cVar.f82645o.f82670h = (java.lang.String) map.get(str8 + "layer_description");
        cVar.f82645o.f82671i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str8 + "is_show_layer_btn"), 0);
        cVar.f82645o.f82672m = new a36.e();
        java.lang.String str9 = str8 + "layer_btn_info.";
        cVar.f82645o.f82672m.f82660d = (java.lang.String) map.get(str9 + "btn_words");
        cVar.f82645o.f82672m.f82661e = (java.lang.String) map.get(str9 + "btn_color");
        cVar.f82645o.f82672m.f82662f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str9 + "btn_op_type"), 0);
        cVar.f82645o.f82672m.f82663g = (java.lang.String) map.get(str9 + "get_lottery_params");
        cVar.f82645o.f82672m.f82664h = (java.lang.String) map.get(str9 + "url");
        java.lang.String str10 = str9 + "mini_app_info.";
        cVar.f82645o.f82672m.f82665i = new a36.g();
        cVar.f82645o.f82672m.f82665i.f82675d = (java.lang.String) map.get(str10 + "activity_tinyapp_username");
        cVar.f82645o.f82672m.f82665i.f82676e = (java.lang.String) map.get(str10 + "activity_tinyapp_path");
        a36.g gVar3 = cVar.f82645o.f82672m.f82665i;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(str10);
        java.lang.String str11 = str2;
        sb10.append(str11);
        gVar3.f82677f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb10.toString()), 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(str8 + "voice_url"))) {
            cVar.f82645o.f82673n = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(((java.lang.String) map.get(str8 + "voice_url")).getBytes());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(str8 + "voice_data"))) {
            cVar.f82645o.f82674o = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(((java.lang.String) map.get(str8 + "voice_data")).getBytes());
        }
        a36.b bVar = new a36.b();
        java.lang.String str12 = str + "draw_lottery_info.";
        bVar.f82631e = (java.lang.String) map.get(str12 + "url");
        bVar.f82632f = (java.lang.String) map.get(str12 + "animation_wording");
        bVar.f82633g = (java.lang.String) map.get(str12 + "animation_wording_color");
        bVar.f82634h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str12 + "op_type"), 0);
        bVar.f82635i = (java.lang.String) map.get(str12 + "after_animation_wording");
        bVar.f82636m = (java.lang.String) map.get(str12 + "after_animation_wording_color");
        java.lang.String str13 = str12 + "mini_app_info.";
        a36.g gVar4 = new a36.g();
        bVar.f82630d = gVar4;
        gVar4.f82675d = (java.lang.String) map.get(str13 + "activity_tinyapp_username");
        bVar.f82630d.f82676e = (java.lang.String) map.get(str13 + "activity_tinyapp_path");
        bVar.f82630d.f82677f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str13 + str11), 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f82631e) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f82632f) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f82633g) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f82630d.f82675d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f82630d.f82676e)) {
            cVar.f82647q = bVar;
        }
        return cVar;
    }

    public static void r(int i17) {
        if (i17 > 0) {
            boolean z17 = to3.c0.f502484i;
            synchronized (to3.c0.class) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_REGET_TOKEN_NUM_SYNC_INT, java.lang.Integer.valueOf(i17));
                to3.c0.f502485m = i17;
                to3.c0.f502486n = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineUtil", "set token num: %s", java.lang.Integer.valueOf(i17));
        }
    }

    public static void s(java.lang.String str) {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().E(str);
    }

    public static void t(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        f545687a = str;
        f545688b = str2;
        f545689c = str3;
        f545690d = str4;
        to3.c0.Ai().Vi(196656, str3);
        f545689c = str3;
        u(i17);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, "");
        gm0.j1.n().f354821b.g(new c01.ra(new yo3.i(), null));
    }

    public static void u(int i17) {
        int i18 = f545692f;
        f545692f = i17;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_TOKEN_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        if (i18 != i17) {
            yo3.f fVar = yo3.f.f545678a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePriorBankcardLogic", "onTokenTypeChanged: " + f());
            fVar.b();
            java.util.Iterator it = yo3.f.f545680c.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) ((yo3.e) it.next());
                activityC16764xd1ab6b38.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "on token type change");
                activityC16764xd1ab6b38.c7();
                activityC16764xd1ab6b38.h7();
            }
        }
    }

    public static void v(android.app.Activity activity) {
        db5.e1.T(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l1p));
        if (android.text.TextUtils.isEmpty(to3.c0.Ai().Ni(196616))) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activity, to3.c0.Ai().Ni(196616), true);
    }

    public static void w(android.app.Activity activity, int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273641d = 5;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_pay_info", c19760x34448d56);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 5);
        bundle.putInt("key_offline_add_fee", i17);
        if (i18 >= 0) {
            bundle.putInt("key_entry_scene", i18);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, to3.i.class, bundle, null);
            return;
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y()) {
            bundle.putBoolean("key_is_bind_bankcard", true);
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, to3.l.class, bundle, null);
        } else if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, to3.i.class, bundle, null);
        } else {
            bundle.putBoolean("key_is_bind_bankcard", true);
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, to3.l.class, bundle, null);
        }
    }

    public static void x(android.app.Activity activity, int i17, int i18, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273641d = 5;
        bundle.putParcelable("key_pay_info", c19760x34448d56);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 5);
        bundle.putInt("key_offline_add_fee", i17);
        if (i18 >= 0) {
            bundle.putInt("key_entry_scene", i18);
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
        ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(activity, bundle);
    }

    public static void y(android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("oper", str);
        bundle.putInt("offline_chg_fee", i17);
        bundle.putString("pwd_tips", str2);
        if (i18 >= 0) {
            bundle.putInt("offline_from_scene", i18);
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, to3.v.class, bundle, null);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7 f184189a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f184190b = kz5.c0.i(1, 2, 7, 8, 9, 10, 11);

    public final void a(org.json.JSONObject jSONObject, java.lang.String str, android.content.Intent intent) {
        java.lang.String str2 = str;
        int i17 = jSONObject.getInt("liveEntryScene");
        boolean z17 = true;
        if (i17 == 15) {
            java.lang.String string = jSONObject.getString("liveObjectExportId");
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 16);
                if (jSONObject.has("initDataFromGame")) {
                    intent.putExtra("KEY_PARAMS_DO_ACTION_PARAMS", jSONObject.optString("initDataFromGame"));
                }
                d(jSONObject, str, intent);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (jSONObject.has("initDataFromGame")) {
                intent.putExtra("KEY_PARAMS_DO_ACTION_PARAMS", jSONObject.optString("initDataFromGame"));
            }
            c(16, jSONObject, intent2);
            return;
        }
        switch (i17) {
            case 1:
                if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
                    d(jSONObject, str, intent);
                    return;
                }
                int i18 = qs5.i.f447967a;
                intent.putExtra("KEY_AUTH_MODE", 2);
                intent.putExtra("KEY_POST_LIVE_APPID", str2);
                intent.putExtra("KEY_POST_LIVE_JSON", jSONObject.toString());
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).zj(context, intent);
                return;
            case 2:
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
                    java.lang.String string2 = jSONObject.getString("ticket");
                    int i19 = jSONObject.getInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32836x72134112);
                    java.lang.String string3 = jSONObject.getString("gameUserId");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderThirdPartyGameLiveUtil", "jumpGameAuthUI platformId:" + i19 + ", appid:" + str2 + ", gameUserId:" + string3 + ", ticket:" + string2);
                    r45.xl6 xl6Var = new r45.xl6();
                    xl6Var.set(0, str2 == null ? "" : str2);
                    xl6Var.set(1, string2);
                    xl6Var.set(2, java.lang.Integer.valueOf(i19));
                    xl6Var.set(3, string3);
                    intent.putExtra("KEY_FROM_THIRD_PARTY_SHARE", xl6Var.mo14344x5f01b1f6());
                    intent.putExtra("KEY_TICKET", string2);
                    intent.putExtra("KEY_APPID", str2);
                    intent.putExtra("KEY_FROM_SCAN", false);
                    c61.ub ubVar2 = (c61.ub) i95.n0.c(c61.ub.class);
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar2).zj(context2, intent);
                    return;
                } catch (java.lang.Throwable unused) {
                    pm0.z.b(xy2.b.f539688b, "AUTH_ERROR_1", false, null, null, false, false, null, 124, null);
                    if (str2 == null) {
                        str2 = "";
                    }
                    e(-1, str2);
                    return;
                }
            case 3:
                c(1, jSONObject, null);
                return;
            case 4:
                c(0, jSONObject, null);
                return;
            case 5:
                c(2, jSONObject, null);
                return;
            case 6:
                c(0, jSONObject, null);
                return;
            case 7:
                java.lang.String string4 = jSONObject.getString("liveObjectExportId");
                if (string4 != null && string4.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    c(3, jSONObject, null);
                    return;
                } else {
                    intent.putExtra("KEY_PARAMS_DO_ACTION", 3);
                    d(jSONObject, str, intent);
                    return;
                }
            case 8:
                intent.putExtra("KEY_PARAMS_DO_ACTION", 4);
                d(jSONObject, str, intent);
                return;
            case 9:
                java.lang.String string5 = jSONObject.getString("liveObjectExportId");
                if (string5 != null && string5.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    c(5, jSONObject, null);
                    return;
                } else {
                    intent.putExtra("KEY_PARAMS_DO_ACTION", 5);
                    d(jSONObject, str, intent);
                    return;
                }
            case 10:
                java.lang.String string6 = jSONObject.getString("liveObjectExportId");
                if (string6 != null && string6.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    c(6, jSONObject, null);
                    return;
                } else {
                    intent.putExtra("KEY_PARAMS_DO_ACTION", 6);
                    d(jSONObject, str, intent);
                    return;
                }
            case 11:
                java.lang.String string7 = jSONObject.getString("liveObjectExportId");
                if (string7 != null && string7.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    c(7, jSONObject, null);
                    return;
                } else {
                    intent.putExtra("KEY_PARAMS_DO_ACTION", 7);
                    d(jSONObject, str, intent);
                    return;
                }
            case 12:
                java.lang.String string8 = jSONObject.getString("liveObjectExportId");
                if (string8 != null && string8.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    c(11, jSONObject, null);
                    return;
                } else {
                    intent.putExtra("KEY_PARAMS_DO_ACTION", 11);
                    d(jSONObject, str, intent);
                    return;
                }
            default:
                b(10001, "error entry scene", str2);
                return;
        }
    }

    public final void b(int i17, java.lang.String errMsg, java.lang.String appid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderThirdPartyGameLiveUtil", "fallback errMsg:" + errMsg + ", appid:" + appid);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dgf));
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dge));
        u1Var.a(true);
        u1Var.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u7(i17, appid));
        u1Var.q(false);
    }

    public final void c(int i17, org.json.JSONObject jSONObject, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderThirdPartyGameLiveUtil", "jumpGameLiveUI action:" + i17);
        java.lang.String string = jSONObject.getString("liveObjectExportId");
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(11, 8, 65);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3.f517454a.i(i17, intent, string, 0L, e17, Gj, "");
    }

    public final void d(org.json.JSONObject json, java.lang.String appid, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String optString = json.optString("extraAntiInfo", "");
        int optInt = json.optInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32836x72134112, 0);
        java.lang.String optString2 = json.optString("gameUserId");
        if (optString2 == null) {
            optString2 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderThirdPartyGameLiveUtil", "jumpGamePostUI platformId:" + optInt + ", gameUserId:" + optString2);
        ke2.y yVar = new ke2.y(appid, 0, false, null, false, null, 60, null);
        r45.gv1 gv1Var = yVar.f388534u;
        gv1Var.set(7, 1);
        gv1Var.set(6, optString);
        gv1Var.set(8, java.lang.Integer.valueOf(optInt));
        gv1Var.set(9, optString2);
        yVar.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v7(intent, appid, 0, optString, optString2, optInt));
    }

    public final void e(int i17, java.lang.String appid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderThirdPartyGameLiveUtil", "returnBack errCode:" + i17 + ", appid:" + appid);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(appid);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11252x37adebac.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11252x37adebac.Resp();
        resp.f32867xa7c470f2 = i17;
        resp.f32970xb32a65a0 = "";
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderThirdPartyGameLiveUtil", "can not find app info");
            return;
        }
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = h17.f67386xa1e9e82c;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }
}

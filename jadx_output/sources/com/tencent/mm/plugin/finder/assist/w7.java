package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.w7 f102656a = new com.tencent.mm.plugin.finder.assist.w7();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f102657b = kz5.c0.i(1, 2, 7, 8, 9, 10, 11);

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
                int i18 = qs5.i.f366434a;
                intent.putExtra("KEY_AUTH_MODE", 2);
                intent.putExtra("KEY_POST_LIVE_APPID", str2);
                intent.putExtra("KEY_POST_LIVE_JSON", jSONObject.toString());
                c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((com.tencent.mm.plugin.finder.assist.i0) ubVar).zj(context, intent);
                return;
            case 2:
                try {
                    com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
                    java.lang.String string2 = jSONObject.getString("ticket");
                    int i19 = jSONObject.getInt(com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY);
                    java.lang.String string3 = jSONObject.getString("gameUserId");
                    com.tencent.mars.xlog.Log.i("Finder.FinderThirdPartyGameLiveUtil", "jumpGameAuthUI platformId:" + i19 + ", appid:" + str2 + ", gameUserId:" + string3 + ", ticket:" + string2);
                    r45.xl6 xl6Var = new r45.xl6();
                    xl6Var.set(0, str2 == null ? "" : str2);
                    xl6Var.set(1, string2);
                    xl6Var.set(2, java.lang.Integer.valueOf(i19));
                    xl6Var.set(3, string3);
                    intent.putExtra("KEY_FROM_THIRD_PARTY_SHARE", xl6Var.toByteArray());
                    intent.putExtra("KEY_TICKET", string2);
                    intent.putExtra("KEY_APPID", str2);
                    intent.putExtra("KEY_FROM_SCAN", false);
                    c61.ub ubVar2 = (c61.ub) i95.n0.c(c61.ub.class);
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    ((com.tencent.mm.plugin.finder.assist.i0) ubVar2).zj(context2, intent);
                    return;
                } catch (java.lang.Throwable unused) {
                    pm0.z.b(xy2.b.f458155b, "AUTH_ERROR_1", false, null, null, false, false, null, 124, null);
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
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(appid, "appid");
        com.tencent.mars.xlog.Log.e("Finder.FinderThirdPartyGameLiveUtil", "fallback errMsg:" + errMsg + ", appid:" + appid);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.u(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.dgf));
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.dge));
        u1Var.a(true);
        u1Var.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490507x1));
        u1Var.l(new com.tencent.mm.plugin.finder.assist.u7(i17, appid));
        u1Var.q(false);
    }

    public final void c(int i17, org.json.JSONObject jSONObject, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Finder.FinderThirdPartyGameLiveUtil", "jumpGameLiveUI action:" + i17);
        java.lang.String string = jSONObject.getString("liveObjectExportId");
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(11, 8, 65);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3.f435921a.i(i17, intent, string, 0L, e17, Gj, "");
    }

    public final void d(org.json.JSONObject json, java.lang.String appid, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(json, "json");
        kotlin.jvm.internal.o.g(appid, "appid");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String optString = json.optString("extraAntiInfo", "");
        int optInt = json.optInt(com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, 0);
        java.lang.String optString2 = json.optString("gameUserId");
        if (optString2 == null) {
            optString2 = "";
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderThirdPartyGameLiveUtil", "jumpGamePostUI platformId:" + optInt + ", gameUserId:" + optString2);
        ke2.y yVar = new ke2.y(appid, 0, false, null, false, null, 60, null);
        r45.gv1 gv1Var = yVar.f307001u;
        gv1Var.set(7, 1);
        gv1Var.set(6, optString);
        gv1Var.set(8, java.lang.Integer.valueOf(optInt));
        gv1Var.set(9, optString2);
        yVar.l().K(new com.tencent.mm.plugin.finder.assist.v7(intent, appid, 0, optString, optString2, optInt));
    }

    public final void e(int i17, java.lang.String appid) {
        kotlin.jvm.internal.o.g(appid, "appid");
        com.tencent.mars.xlog.Log.i("Finder.FinderThirdPartyGameLiveUtil", "returnBack errCode:" + i17 + ", appid:" + appid);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(appid);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelbiz.WXChannelStartLive.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXChannelStartLive.Resp();
        resp.errCode = i17;
        resp.extMsg = "";
        if (h17 == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderThirdPartyGameLiveUtil", "can not find app info");
            return;
        }
        resp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = h17.field_packageName;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }
}

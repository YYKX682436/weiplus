package av4;

/* loaded from: classes.dex */
public final class o extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.o f95848d = new av4.o();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        int i18;
        int i19;
        java.lang.String str5;
        int i27;
        int i28;
        java.lang.String str6;
        java.lang.String str7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.Map map = msg.f422323a;
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getSaveString(...)");
        java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "schemeUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f18, "getSaveString(...)");
        java.lang.String f19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "parameter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f19, "getSaveString(...)");
        java.lang.String f27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f27, "getSaveString(...)");
        java.lang.String f28 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "sourceInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f28, "getSaveString(...)");
        java.lang.String f29 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "bizInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f29, "getSaveString(...)");
        java.lang.String f37 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "signature");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f37, "getSaveString(...)");
        java.lang.String f38 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f38, "getSaveString(...)");
        int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "showType", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.LocalLaunchApplication", "doLocalLaunchApplication, appid: %s, scheme: %s, extinfo: [%s], parameter: %s, pkg: %s, signature: %s, sourceInfo: %s, bizInfo: %s, showType: %d", f17, f18, f38, f19, f27, f37, f28, f29, java.lang.Integer.valueOf(e17));
        android.os.Bundle bundle = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f18) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.LocalLaunchApplication", "appid, pkg and scheme is null or nil");
            env.f422396d.e(msg.f422546c, "localLaunchApplication:fail, appid, pkg and scheme is null or nil", null);
            return true;
        }
        java.lang.Object obj = msg.f422323a.get("__jsapi_fw_ext_info");
        java.lang.String string = obj instanceof android.os.Bundle ? ((android.os.Bundle) obj).getString("__jsapi_fw_ext_info_key_current_url") : null;
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            try {
                bundle2.putString("current_page_url", java.net.URLEncoder.encode(string, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        bundle2.putString("current_page_appid", null);
        bundle2.putString("current_page_biz_info", f29);
        bundle2.putString("current_page_source_info", f28);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = env.f422395c;
            if (v0Var != null && v0Var != null) {
                bundle = v0Var.i(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c, null);
            }
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.LocalLaunchApplication", "invokeAsResult error.%s", e18);
        }
        if (bundle != null) {
            int i29 = bundle.getInt("key_get_a8key_req_params_req_id");
            str6 = bundle.getString("key_get_a8key_req_params_username");
            str = bundle.getString("key_get_a8key_req_params_msg_username");
            str2 = bundle.getString("key_get_a8key_req_params_msg_id");
            java.lang.String string2 = bundle.getString("key_get_a8key_req_params_biz_info");
            str3 = bundle.getString("key_get_a8key_req_params_source_info");
            int i37 = bundle.getInt("key_get_a8key_req_params_msg_type");
            int i38 = bundle.getInt("key_get_a8key_req_params_app_msg_type");
            int i39 = bundle.getInt("key_get_a8key_req_params_ctrl_mode");
            int i47 = bundle.getInt("key_get_a8key_req_params_scene");
            i18 = i38;
            i17 = i39;
            i19 = i47;
            i27 = i37;
            str4 = string2;
            str5 = f19;
            i28 = i29;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            i17 = 0;
            i18 = 0;
            i19 = 0;
            str5 = f19;
            i27 = 0;
            i28 = 0;
            str6 = str4;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            str7 = f17;
        } else {
            str7 = f17;
            bundle2.putString("current_page_biz_info", str4);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            bundle2.putString("current_page_source_info", str3);
        }
        bundle2.putInt("current_page_secCtrlMode", i17);
        bundle2.putString("current_page_fromUsername", str6);
        bundle2.putString("current_page_msgUsername", str);
        bundle2.putInt("current_page_requestId", i28);
        bundle2.putInt("current_page_msgType", i27);
        bundle2.putInt("current_page_appMsgType", i18);
        bundle2.putInt("current_page_a8keyScene", i19);
        bundle2.putString("current_page_msgId", str2);
        bundle2.putBoolean("current_page_ad_onlineReport", true);
        p95.a.a(new av4.n(f18, env, e17, bundle2, f27, f37, str5, msg, f38, str7));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "localLaunchApplication";
    }
}

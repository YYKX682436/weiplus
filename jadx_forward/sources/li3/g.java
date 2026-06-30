package li3;

@j95.b
/* loaded from: classes9.dex */
public class g extends i95.w implements h45.s {
    public java.lang.String Ai() {
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String str = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPaySevice", "wechat user lang is null");
            return null;
        }
        if (c01.e2.a0()) {
            if (f17.equalsIgnoreCase("zh_CN")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_cn, "支付与服务", true);
            } else if (f17.equalsIgnoreCase("zh_HK")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_hk, "支付與服務", true);
            } else if (f17.equalsIgnoreCase("zh_TW")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_tw, "支付與服務", true);
            } else if (f17.equalsIgnoreCase("en")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_en, "Pay and Services", true);
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtm) : str;
        }
        if (f17.equalsIgnoreCase("zh_CN")) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_cn, "", true);
        }
        if (f17.equalsIgnoreCase("zh_HK")) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_hk, "", true);
        }
        if (f17.equalsIgnoreCase("zh_TW")) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_tw, "", true);
        }
        if (!f17.equalsIgnoreCase("en")) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtm);
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_en, "Pay and Services", true);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtm) : Zi;
    }

    public boolean Bi() {
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y();
    }

    public r45.x57 Di(java.lang.String str) {
        byte[] bArr;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("native");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "hk payurl native param is %s", queryParameter);
        java.lang.String replace = queryParameter.replace(".", "+").replace("_", "/").replace("-", "=");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "hk payurl native param after replace is %s", replace);
        try {
            bArr = android.util.Base64.decode(replace, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxPaySevice", e17, "", new java.lang.Object[0]);
            bArr = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "hk payurl native param base64decode null");
            return null;
        }
        r45.x57 x57Var = new r45.x57();
        try {
            x57Var.mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxPaySevice", "parse nativeInfo exp, " + e18.getLocalizedMessage());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x57Var.f471336d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "attach is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "attach is %s, android supprt version is %s", x57Var.f471336d, java.lang.Integer.valueOf(x57Var.f471338f));
        if (o45.wf.f424562g >= x57Var.f471338f) {
            return x57Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "client version small than min version");
        return null;
    }

    public void Ni(java.lang.String str, r45.i67 i67Var) {
        r45.j67 wi6;
        if (!"gh_f0a92aa7146c".equals(str) || (wi6 = wi(str)) == null || wi6.f459149e.size() == 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= wi6.f459149e.size()) {
                i17 = -1;
                break;
            } else if (((r45.i67) wi6.f459149e.get(i17)).f458302d.equals(i67Var.f458302d)) {
                break;
            } else {
                i17++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "remove pay plugin top msg, index is %s", java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            wi6.f459149e.remove(i17);
        }
        java.lang.String str2 = "";
        if (wi6.f459149e.size() == 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, "");
            return;
        }
        try {
            str2 = new java.lang.String(wi6.mo14344x5f01b1f6(), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPaySevice", "save dataString exp, " + e17.getLocalizedMessage());
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, str2);
    }

    public void Ri(android.app.Activity activity, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "reportLocation %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ((ku5.t0) ku5.t0.f394148d).j(new li3.e(this, i17, i18), "wxpay_report_location");
    }

    public void Ui(int i17) {
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new ss4.e0(null, i17));
    }

    public r45.j67 wi(java.lang.String str) {
        if (!"gh_f0a92aa7146c".equals(str)) {
            return null;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_revert_payplugin_topmsg, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPaySevice", "revert payplugin topmsg abtest is open, return null");
            return null;
        }
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, "");
        r45.j67 j67Var = new r45.j67();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        try {
            j67Var.mo11468x92b714fd(str2.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxPaySevice", "parse cacheString exp, " + e17.getLocalizedMessage());
        }
        return j67Var;
    }
}

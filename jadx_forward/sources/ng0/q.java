package ng0;

@j95.b
/* loaded from: classes9.dex */
public class q extends i95.w implements og0.o {
    public boolean Ai(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62, int i17, com.p314xaae8f345.mm.ui.da daVar) {
        if (c19761xc2874b62 == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", c19761xc2874b62.f273662d);
        intent.putExtra("timeStamp", c19761xc2874b62.f273666h);
        intent.putExtra("nonceStr", c19761xc2874b62.f273665g);
        intent.putExtra("packageExt", c19761xc2874b62.f273667i);
        intent.putExtra("signtype", c19761xc2874b62.f273664f);
        intent.putExtra("paySignature", c19761xc2874b62.f273671p);
        intent.putExtra("url", c19761xc2874b62.f273673r);
        intent.putExtra("key_req_bind_scene", c19761xc2874b62.f273676u);
        intent.putExtra("pay_channel", c19761xc2874b62.f273677v);
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(daVar);
        j45.l.o(abstractActivityC21394xb3d2c0cf, "wallet", ".bind.ui.WalletBindUI", intent, i17, false);
        return true;
    }

    public boolean Bi(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62, int i17, com.p314xaae8f345.mm.ui.xc xcVar) {
        if (c19761xc2874b62 == null) {
            return false;
        }
        h45.a0.a(c19761xc2874b62);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("WalletJsapiData", c19761xc2874b62);
        intent.putExtra("requestCode", i17);
        if (xcVar != null) {
            activityC21401x6ce6f73f.m78750xc5512edd(xcVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startJsapiPay MMFragmentActivity %s from %s", activityC21401x6ce6f73f, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        j45.l.o(activityC21401x6ce6f73f, "wallet_index", ".ui.WalletBrandUI", intent, i17, false);
        return true;
    }

    public void Di(android.content.Context context, android.content.Intent intent, int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.PaymentOpenSdk.k(context, null)) {
            intent.putExtra("key_from_scene", 8);
            intent.putExtra("key_appid", str);
            j45.l.n(context, "offline", ".ui.WalletOfflineEntranceUI", intent, i17);
        }
    }

    public void Ni(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, int i18, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_qrcode_url", str);
        intent.putExtra("key_channel", i17);
        intent.putExtra("key_web_url", str2);
        intent.putExtra("key_scene", i18);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        j45.l.j(context, "collect", ".reward.ui.QrRewardSelectMoneyUI", intent, null);
    }

    public boolean wi(android.content.Context context, android.os.Bundle bundle, boolean z17, final java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("orderhandlerui_checkapp_result", z17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 c11302x8e12daf6 = new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6();
        c11302x8e12daf6.mo48425x63aa4ccc(intent.getExtras());
        final java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11302x8e12daf6.f33257xb3bbab20) ? "" : c11302x8e12daf6.f33257xb3bbab20;
        final java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11302x8e12daf6.f33256x94f8d403) ? "" : c11302x8e12daf6.f33256x94f8d403;
        int i17 = bundle.getInt("key_scene", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startAppPay scene:%s prepay_id:%s partner_id:%s packageName:%s", java.lang.Integer.valueOf(i17), str2, str3, str);
        if (i17 == 0) {
            h45.a0.f360466a = str2;
            intent.addFlags(268435456);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startAppPay OrderHandlerUI add clear top flag");
            intent.addFlags(67108864);
            java.util.Map map = h45.i0.f360483a;
            java.lang.String str4 = h45.a0.f360466a;
            yz5.a aVar = new yz5.a() { // from class: h45.a0$$a
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    java.lang.String str5 = h45.a0.f360466a + " time:" + java.lang.System.currentTimeMillis();
                    java.lang.String str6 = str;
                    java.lang.String str7 = str6 != null ? str6 : "";
                    java.lang.String str8 = str3;
                    java.lang.String str9 = str8 != null ? str8 : "";
                    java.lang.String str10 = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36486, "9", "2", "", str5, "apppay", str7, str9, str10 != null ? str10 : "");
                    return jz5.f0.f384359a;
                }
            };
            if (str4 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPayUtil", "addOutTimeCheck failed, key is null");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addOutTimeCheck task:");
                sb6.append(str4);
                sb6.append(" times:3500 size:");
                java.util.Map map2 = h45.i0.f360483a;
                sb6.append(map2.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayUtil", sb6.toString());
                wu5.c cVar = (wu5.c) ((java.util.LinkedHashMap) map2).get(str4);
                if (cVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxPayUtil", "addOutTimeCheck waring, task:" + str4 + " is exits, cancel first");
                    cVar.cancel(false);
                    map2.remove(str4);
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                h45.h0 h0Var = new h45.h0(str4, aVar);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                wu5.c z18 = t0Var.z(h0Var, 3500L, false);
                if (z18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPayUtil", "addOutTimeCheck failed, task:" + str4 + " is null");
                } else {
                    map2.put(str4, z18);
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long a17 = c01.id.a();
        intent.putExtra("key_start_time", currentTimeMillis);
        m05.i iVar = m05.i.f404103a;
        if (i17 == 0) {
            iVar.d(2, "apppay", str != null ? str : "", str3 != null ? str3 : "", str2 != null ? str2 : "", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17));
        } else if (i17 == 1) {
            iVar.d(2, "h5pay", str != null ? str : "", str3 != null ? str3 : "", str2 != null ? str2 : "", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17));
        }
        j45.l.j(context, "wallet_index", ".ui.OrderHandlerUI", intent, null);
        return true;
    }
}

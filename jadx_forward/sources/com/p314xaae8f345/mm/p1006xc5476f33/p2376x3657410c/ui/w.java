package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class w implements com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f262750a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 f262751b;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02) {
        this.f262751b = activityC19168xd4c44a02;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = this.f262751b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand getGenPrepayFuncId packageExt:%s", activityC19168xd4c44a02.f262619h.f273667i);
        if (nt4.a.a(activityC19168xd4c44a02.f262619h.f273667i, "up_")) {
            return 2519;
        }
        if (nt4.a.a(activityC19168xd4c44a02.f262619h.f273667i, "tax_")) {
            return 2923;
        }
        return nt4.a.a(activityC19168xd4c44a02.f262619h.f273667i, "dc_") ? 2798 : 398;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public com.p314xaae8f345.mm.p944x882e457a.m1 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = this.f262751b;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = activityC19168xd4c44a02.f262619h;
        java.lang.String str = c19761xc2874b62.f273662d;
        java.lang.String str2 = c19761xc2874b62.f273664f;
        java.lang.String str3 = c19761xc2874b62.f273665g;
        java.lang.String str4 = c19761xc2874b62.f273667i;
        java.lang.String str5 = c19761xc2874b62.f273671p;
        java.lang.String str6 = c19761xc2874b62.f273666h;
        java.lang.String str7 = c19761xc2874b62.f273673r;
        java.lang.String str8 = c19761xc2874b62.f273674s;
        int i17 = c19761xc2874b62.f273677v;
        int i18 = c19761xc2874b62.f273675t;
        int i19 = c19761xc2874b62.f273679x;
        java.lang.String str9 = c19761xc2874b62.f273672q;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 rVar = nt4.a.a(str4, "up_") ? new nt4.r(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9) : nt4.a.a(str4, "tax_") ? new nt4.q(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9) : nt4.a.a(str4, "dc_") ? new nt4.j(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9) : new nt4.l(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9);
        rVar.m82990x6fae0924(java.lang.System.currentTimeMillis());
        rVar.m82989x7c4af7d8("PayProcess");
        rVar.m82991x53aed94a(activityC19168xd4c44a02.f262619h.f273675t);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(rVar);
        return rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    public java.lang.String c() {
        return this.f262750a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o
    /* renamed from: onSceneEnd */
    public void mo73991x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = this.f262751b;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand dialog");
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(activityC19168xd4c44a02.f262619h.f273675t, "", i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a022 = this.f262751b;
            if (activityC19168xd4c44a022.f262619h.f273675t == 3) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = activityC19168xd4c44a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.krl);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 E = db5.e1.E(activityC19168xd4c44a022, str, "", activityC19168xd4c44a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl_), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.v(this));
                if (E != null) {
                    E.setCancelable(false);
                }
                android.app.Dialog dialog = activityC19168xd4c44a02.f262616e;
                if (dialog != null) {
                    dialog.dismiss();
                    activityC19168xd4c44a02.f262616e = null;
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand setResult ResultPayFailed");
            android.content.Intent intent = new android.content.Intent();
            if (i17 != 0) {
                i18 = -1;
            }
            intent.putExtra("key_jsapi_pay_onActivityResult", "jsapi_pay_onActivityResult");
            intent.putExtra("key_jsapi_pay_err_code", i18);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = activityC19168xd4c44a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.krl);
            }
            intent.putExtra("key_jsapi_pay_err_msg", str);
            intent.putExtra("key_jsapi_pay_err_dialog_confirm", activityC19168xd4c44a02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl_));
            activityC19168xd4c44a02.setResult(5, intent);
            activityC19168xd4c44a02.finish();
            return;
        }
        nt4.l lVar = (nt4.l) m1Var;
        java.lang.String str2 = lVar.f421371f;
        this.f262750a = str2;
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6237x853c614e().e();
        r45.v67 v67Var = lVar.f421373h;
        if (v67Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v67Var.f469486d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand start WalletMixOrderInfoUI");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("prepayId", str2);
            intent2.putExtra("is_jsapi_offline_pay", false);
            intent2.putExtra("pay_gate_url", v67Var.f469486d);
            intent2.putExtra("need_dialog", v67Var.f469488f);
            intent2.putExtra("dialog_text", v67Var.f469489g);
            intent2.putExtra("max_count", v67Var.f469487e.f470941e);
            intent2.putExtra("inteval_time", v67Var.f469487e.f470940d);
            intent2.putExtra("default_wording", v67Var.f469487e.f470942f);
            j45.l.k(activityC19168xd4c44a02, "wallet_core", ".ui.WalletMixOrderInfoUI", intent2, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand startPay");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273647m = str2;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = activityC19168xd4c44a02.f262619h;
        c19760x34448d56.f273649o = c19761xc2874b62.f273662d;
        c19760x34448d56.f273650p = lVar.f421372g;
        c19760x34448d56.f273642e = c19761xc2874b62.f273675t;
        c19760x34448d56.f273654t = str;
        c19760x34448d56.f273644g = c19761xc2874b62.f273677v;
        c19760x34448d56.F = lVar.f39851x243a3e51;
        if (c19760x34448d56.f273655u == null) {
            c19760x34448d56.f273655u = new android.os.Bundle();
        }
        c19760x34448d56.f273655u.putString("extinfo_key_20", lVar.f421374i);
        c19760x34448d56.f273655u.putString("extinfo_key_21", activityC19168xd4c44a02.f262619h.D);
        c19760x34448d56.f273655u.putString("extinfo_key_22", activityC19168xd4c44a02.f262619h.E);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(c19760x34448d56.f273642e, str2, i18);
        h45.a0.f(activityC19168xd4c44a02, c19760x34448d56, 1);
    }
}

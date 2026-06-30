package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class e1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259684a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b) {
        this.f259684a = activityC19013x23c3e97b;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259684a;
        if (zg5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
            activityC19013x23c3e97b.f259485f = zg5Var;
            if (!activityC19013x23c3e97b.f259504x0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zg5Var.V)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(activityC19013x23c3e97b.f259485f.V);
                    java.lang.String optString = jSONObject.optString("done_button_wording");
                    int optInt = jSONObject.optInt("is_show_protocol", 0);
                    java.lang.String optString2 = jSONObject.optString("left_protocol_wording");
                    java.lang.String optString3 = jSONObject.optString("new_upload_credit_url");
                    java.lang.String optString4 = jSONObject.optString("protocol_url");
                    java.lang.String optString5 = jSONObject.optString("right_protocol_wording");
                    java.lang.String optString6 = jSONObject.optString("subtitle");
                    java.lang.String optString7 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("upload_reasons");
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    if (optJSONArray != null) {
                        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                            linkedList.add(optJSONArray.optString(i17));
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x4.c(activityC19013x23c3e97b.mo55332x76847179(), optString7, optString6, linkedList, optString, optInt, optString2, optString5, optString4, optString3);
                    activityC19013x23c3e97b.f259504x0 = true;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtDetailUI", e17, "", new java.lang.Object[0]);
                }
            }
            activityC19013x23c3e97b.e7(false);
            if (zg5Var.f473564x1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.W6(activityC19013x23c3e97b);
            }
            r45.na5 na5Var = zg5Var.B1;
            if (na5Var != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(na5Var.f462732d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog title is nil, ignore show");
                } else if (activityC19013x23c3e97b.M1 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog has been shown");
                } else {
                    java.lang.String className = activityC19013x23c3e97b.getComponentName().getClassName();
                    if (className.contains(".")) {
                        className = className.substring(className.lastIndexOf(".") + 1);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(activityC19013x23c3e97b).equalsIgnoreCase(className)) {
                        r45.bq bqVar = na5Var.f462736h;
                        if (bqVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bqVar.f452493g)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog first_button is null");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16807, 3);
                            r45.bq bqVar2 = na5Var.f462737i;
                            if ((bqVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bqVar2.f452493g)) ? false : true) {
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19013x23c3e97b, 1, 0);
                                activityC19013x23c3e97b.M1 = z2Var;
                                z2Var.m(na5Var.f462736h.f452493g, na5Var.f462737i.f452493g);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = activityC19013x23c3e97b.M1;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d1(activityC19013x23c3e97b, na5Var);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f1(activityC19013x23c3e97b, na5Var);
                                z2Var2.D = d1Var;
                                z2Var2.E = f1Var;
                                com.p314xaae8f345.mm.ui.bk.s0(z2Var2.f293601t.getPaint());
                                com.p314xaae8f345.mm.ui.bk.s0(activityC19013x23c3e97b.M1.f293602u.getPaint());
                            } else {
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19013x23c3e97b, 2, 0);
                                activityC19013x23c3e97b.M1 = z2Var3;
                                z2Var3.y(na5Var.f462736h.f452493g);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var4 = activityC19013x23c3e97b.M1;
                                z2Var4.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.g1(activityC19013x23c3e97b, na5Var);
                                com.p314xaae8f345.mm.ui.bk.s0(z2Var4.f293605x.getPaint());
                            }
                            activityC19013x23c3e97b.M1.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.h1(activityC19013x23c3e97b));
                            android.view.View inflate = android.view.LayoutInflater.from(activityC19013x23c3e97b.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.btv, (android.view.ViewGroup) null);
                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ltu);
                            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView);
                            textView.setText(na5Var.f462732d);
                            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o3l)).setText(activityC19013x23c3e97b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kor));
                            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ltt);
                            if (com.p314xaae8f345.mm.ui.bk.C()) {
                                imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8v);
                            } else {
                                imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8u);
                            }
                            activityC19013x23c3e97b.M1.j(inflate);
                            activityC19013x23c3e97b.M1.C();
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLqtDetailUI", "showFirstPurchaseDialog when is not top activity, ignore show");
                    }
                }
            }
            r45.na5 na5Var2 = zg5Var.E1;
            if (na5Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "show upgrade to fixed deposit dialog");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(na5Var2.f462732d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(na5Var2.f462733e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(na5Var2.f462742q)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "key info is null");
                } else if (activityC19013x23c3e97b.N1 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "has shown upgrade dialog before!");
                } else {
                    java.lang.String className2 = activityC19013x23c3e97b.getComponentName().getClassName();
                    if (className2.contains(".")) {
                        className2 = className2.substring(className2.lastIndexOf(".") + 1);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n0(activityC19013x23c3e97b).equalsIgnoreCase(className2)) {
                        activityC19013x23c3e97b.N1 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19013x23c3e97b, 2, 3, false);
                        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activityC19013x23c3e97b.mo55332x76847179());
                        android.widget.TextView textView2 = new android.widget.TextView(activityC19013x23c3e97b.mo55332x76847179());
                        textView2.setText(na5Var2.f462732d);
                        textView2.setTextColor(activityC19013x23c3e97b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                        textView2.setTextSize(1, (i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 17) * i65.a.q(activityC19013x23c3e97b.mo55332x76847179())) / i65.a.g(activityC19013x23c3e97b.mo55332x76847179()));
                        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMargins(i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 24), i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 40), 0, 0);
                        textView2.setLayoutParams(layoutParams);
                        linearLayout.addView(textView2);
                        activityC19013x23c3e97b.N1.t(linearLayout);
                        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(activityC19013x23c3e97b.mo55332x76847179());
                        linearLayout2.setOrientation(1);
                        android.widget.TextView textView3 = new android.widget.TextView(activityC19013x23c3e97b.mo55332x76847179());
                        textView3.setText(na5Var2.f462733e);
                        textView3.setTextColor(activityC19013x23c3e97b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                        textView3.setTextSize(1, (i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 14) * i65.a.q(activityC19013x23c3e97b.mo55332x76847179())) / i65.a.g(activityC19013x23c3e97b.mo55332x76847179()));
                        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.setMargins(0, i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 16), 0, 0);
                        textView3.setLayoutParams(layoutParams2);
                        linearLayout2.addView(textView3);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913(activityC19013x23c3e97b.mo55332x76847179(), null);
                        float b17 = com.p314xaae8f345.mm.ui.bl.b(activityC19013x23c3e97b.mo55332x76847179()).x - (i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 24) * 2);
                        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.width = (int) b17;
                        layoutParams3.height = (int) (b17 * 0.6023392f);
                        layoutParams3.setMargins(0, i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 8), 0, 0);
                        c19659x677e0913.setLayoutParams(layoutParams3);
                        c19659x677e0913.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                        c19659x677e0913.m75396xca029dad(na5Var2.f462742q);
                        linearLayout2.addView(c19659x677e0913);
                        zl5.b.f555619a.a(c19659x677e0913, i65.a.b(activityC19013x23c3e97b.mo55332x76847179(), 8));
                        com.p314xaae8f345.mm.ui.bk.s0(activityC19013x23c3e97b.N1.f293605x.getPaint());
                        activityC19013x23c3e97b.N1.x(1);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var5 = activityC19013x23c3e97b.N1;
                        z2Var5.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.i1(activityC19013x23c3e97b);
                        z2Var5.y(na5Var2.f462736h.f452493g);
                        activityC19013x23c3e97b.N1.j(linearLayout2);
                        activityC19013x23c3e97b.N1.C();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLqtDetailUI", "show upgrade dialog when is not top activity, ignore show");
                    }
                }
            }
            if (activityC19013x23c3e97b.c7()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29559, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29559, "9", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            r45.zg5 zg5Var2 = activityC19013x23c3e97b.f259485f;
            if (zg5Var2 != null) {
                try {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_DETAIL_STRING_SYNC, new java.lang.String(zg5Var2.mo14344x5f01b1f6(), s46.a.f484534a));
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletLqtDetailUI", e18, "", new java.lang.Object[0]);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "fetch detail failed");
        }
        android.app.Dialog dialog = activityC19013x23c3e97b.Y;
        if (dialog != null) {
            dialog.dismiss();
        }
        return null;
    }
}

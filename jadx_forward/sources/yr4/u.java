package yr4;

/* loaded from: classes9.dex */
public class u extends qs4.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f546643d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public as4.b f546644e;

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) bundle.getParcelable("key_pay_info");
        bundle.putInt("key_pay_scene", c19760x34448d56.f273642e);
        bundle.putInt("key_pay_channel", c19760x34448d56.f273644g);
        if (F(activity, bundle)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PayProcess", "hy: has err. return");
            return this;
        }
        int i17 = bundle.getInt("key_pay_flag", 0);
        if ((i17 == 2 || i17 == 1) && c19760x34448d56.f273642e == 11) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(13);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "start pay_flag : " + bundle.getInt("key_pay_flag", 0));
        int i18 = bundle.getInt("key_pay_flag", 0);
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "start Process : PayRegBindProcess");
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
        } else if (i18 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "start Process : PayBindProcess");
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        } else if (i18 == 3) {
            if (!bundle.getBoolean("key_need_verify_sms", false) || r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "jump to result ui!");
                G(activity, bundle);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "domestic and verify sms!");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
            }
        }
        return this;
    }

    public final boolean F(android.app.Activity activity, android.os.Bundle bundle) {
        int i17 = bundle.getInt("key_err_code", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "dealwithErr(), errCode %d", java.lang.Integer.valueOf(i17));
        if (i17 == -1004) {
            this.f295334c.putInt("key_pay_flag", 3);
            this.f295334c.putInt("key_err_code", 0);
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FORCE_USE_NEW_CASHIER_INT_SYNC, 0)).intValue();
            if (z65.c.a()) {
                intValue = 1;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) this.f295334c.getParcelable("key_orders");
            if (intValue == 1 || (c19099x8d444f05 != null && c19099x8d444f05.A1 == 1)) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putBoolean("direc_change_bankcard", true);
                bundle2.putBoolean("send_cancel_event", false);
                d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3.class, bundle2, 0);
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9.class, bundle);
            }
            return true;
        }
        if (i17 == -1003) {
            if (vr4.f1.wi().Ai().w()) {
                bundle.putInt("key_pay_flag", 2);
                bundle.putInt("key_err_code", 0);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
            } else {
                bundle.putInt("key_pay_flag", 1);
                bundle.putInt("key_err_code", 0);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
            }
            return true;
        }
        if (i17 != 402 && i17 != 403 && i17 != 408) {
            if (i17 == 417) {
                bundle.putInt("key_err_code", 0);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c.class, bundle);
                return true;
            }
            if (i17 != 418) {
                return false;
            }
            bundle.putInt("key_err_code", 0);
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18.class, bundle);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f295334c.get("key_bankcard");
        if (c19091x9511676c == null || !c19091x9511676c.v0()) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18.class, bundle);
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h() == null || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h().size() <= 0) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "hy: go to select bankcard ui");
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putBoolean("key_is_show_new_bankcard", true);
            bundle3.putInt("key_scene", 0);
            bundle3.putParcelableArrayList("key_showing_bankcards", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().h());
            bundle3.putString("key_top_tips", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575150kz5));
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335.class, bundle3);
        }
        return true;
    }

    public final void G(android.app.Activity activity, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = this.f295334c;
        if (bundle2 != null && bundle2.containsKey("key_realname_guide_helper")) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putParcelable("key_realname_guide_helper", this.f295334c.getParcelable("key_realname_guide_helper"));
        }
        int i17 = bundle.getInt("key_pay_scene", 6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "jumpToResultUI() payScene:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 11 || i17 == 21) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19002xf18a9914.class, bundle);
            return;
        }
        if (i17 == 5 || i17 == 31 || i17 == 32 || i17 == 33 || i17 == 48) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) bundle.getParcelable("key_pay_info");
            if (c19760x34448d56 == null || c19760x34448d56.L != 1) {
                D(activity, "remittance", ".ui.RemittanceResultUI", bundle);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "is busi f2f");
                f(activity, bundle);
                return;
            }
        }
        if (i17 == 37 || i17 == 39 || i17 == 42 || i17 == 45 || i17 == 52 || i17 == 49) {
            f(activity, bundle);
        } else if (i17 == 56) {
            D(activity, "remittance", ".mobile.ui.MobileRemitResultUI", bundle);
        } else {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7.class, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void b(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        ((java.util.ArrayList) this.f546643d).add(new java.lang.ref.WeakReference(abstractActivityC22902xe37969e));
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "back pay_flag : " + this.f295334c.getInt("key_pay_flag", 0));
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, null, i17);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
            m(activity);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "PayProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "end pay_flag : " + this.f295334c.getInt("key_pay_flag", 0));
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
        int i17 = this.f295334c.getBoolean("intent_pay_end", false) ? -1 : 0;
        android.content.Intent intent = new android.content.Intent();
        if (bundle != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d563 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) this.f295334c.getParcelable("key_pay_info");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("intent_pay_end_errcode", this.f295334c.getInt("intent_pay_end_errcode"));
            bundle2.putString("intent_pay_app_url", this.f295334c.getString("intent_pay_app_url"));
            bundle2.putBoolean("intent_pay_end", this.f295334c.getBoolean("intent_pay_end"));
            bundle2.putString("intent_wap_pay_jump_url", this.f295334c.getString("intent_wap_pay_jump_url"));
            bundle2.putParcelable("key_realname_guide_helper", this.f295334c.getParcelable("key_realname_guide_helper"));
            if (c19760x34448d563 != null) {
                bundle2.putInt("pay_channel", c19760x34448d563.f273644g);
            }
            intent.putExtras(bundle2);
        }
        intent.putExtra("key_orders", (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) this.f295334c.getParcelable("key_orders"));
        intent.putExtra("key_is_clear_failure", this.f295334c.getInt("key_is_clear_failure", -1));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
        am.s10 s10Var = c6249x2aa12f2e.f136498g;
        s10Var.f89394a = intent;
        android.os.Bundle bundle3 = this.f295334c;
        java.lang.String str = "";
        if (bundle3 != null && (c19760x34448d562 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) bundle3.getParcelable("key_pay_info")) != null) {
            str = c19760x34448d562.f273647m;
        }
        s10Var.f89397d = str;
        int i18 = this.f295334c.getBoolean("intent_pay_end", false) ? -1 : 0;
        s10Var.f89396c = i18;
        if (i18 == 0 && bundle != null && (c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) bundle.getParcelable("key_pay_info")) != null) {
            bs4.b.a(c19760x34448d56.f273647m, c19760x34448d56.f273642e, c19760x34448d56.f273644g);
        }
        c6249x2aa12f2e.e();
        k(activity, "wallet", ".pay.ui.WalletPayUI", i17, intent, false);
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (F(activity, bundle)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "deal with the err!");
            return;
        }
        boolean z17 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c;
        if (z17) {
            if (this.f295334c.getBoolean("key_forward_to_id_verify", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "go to verify id tail");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19126xf47a4ab1.class, this.f295334c);
                return;
            }
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19126xf47a4ab1) {
            G(activity, bundle);
        }
        int i18 = bundle.containsKey("key_pay_flag") ? bundle.getInt("key_pay_flag", 0) : this.f295334c.getInt("key_pay_flag", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "forward pay_flag : " + i18);
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "forwardUnreg()");
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.class, bundle);
                return;
            }
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
                G(activity, bundle);
                return;
            }
            if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7)) {
                if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19002xf18a9914) {
                    h(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.class, -1, null, true);
                    return;
                } else {
                    super.o(activity, 0, bundle);
                    return;
                }
            }
            if (r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "oversea, set pwd");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "domestic, verify code");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
                return;
            }
        }
        if (i18 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "forwardBind()");
            if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335) || z17) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
                return;
            }
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
                G(activity, bundle);
                return;
            }
            if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7)) {
                if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19002xf18a9914) {
                    h(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.class, -1, null, true);
                    return;
                } else {
                    super.o(activity, 0, bundle);
                    return;
                }
            }
            if (r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "oversea, jump to result ui!");
                G(activity, bundle);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "domestic, verify code!");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
                return;
            }
        }
        if (i18 != 3) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "forwardBound()");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            G(activity, bundle);
            return;
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9)) {
            if ((!bundle.getBoolean("key_need_verify_sms", false) || r()) && !bundle.getBoolean("key_is_changing_balance_phone_num")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "jump to result ui!");
                G(activity, bundle);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "need verify code after reset info or change bank card info!");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19002xf18a9914) {
            h(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.class, -1, null, true);
        } else if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335) && !z17) {
            super.o(activity, 0, bundle);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "need verify code after select bank card!");
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3) {
            return new yr4.l(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new yr4.m(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514) {
            return new yr4.n(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7) {
            return new yr4.o(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            return new yr4.p(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19002xf18a9914) {
            return new yr4.q(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            return new yr4.r(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9) {
            return new yr4.s(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19120x14dda335) {
            return new yr4.b(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18) {
            return new yr4.c(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c) {
            return new yr4.d(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19126xf47a4ab1) {
            return new yr4.e(this, (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public int q(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        return com.p314xaae8f345.mm.R.C30867xcad56011.kvo;
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        this.f295334c.getInt("key_pay_flag", 0);
        int i17 = this.f295334c.getInt("key_pay_flag", 0);
        if (i17 == 1 || i17 == 2) {
            return activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean w(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "onReceiveErr(), errCode %d", java.lang.Integer.valueOf(i17));
        if (i17 != 408) {
            switch (i17) {
                case 402:
                case 403:
                    break;
                case 404:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "404 pay error, cancel pay or change!");
                    java.util.ArrayList h17 = vr4.f1.wi().Ai().h();
                    if (h17 == null || h17.isEmpty()) {
                        db5.e1.A(abstractActivityC22902xe37969e, str, "", abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575122kv1), abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kgy), new yr4.g(this, abstractActivityC22902xe37969e), new yr4.h(this, abstractActivityC22902xe37969e));
                    } else {
                        db5.e1.A(abstractActivityC22902xe37969e, str, "", abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvg), abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kgy), new yr4.i(this, abstractActivityC22902xe37969e), new yr4.j(this, abstractActivityC22902xe37969e));
                    }
                    return true;
                default:
                    return false;
            }
        }
        if ((this.f295334c.getInt("key_pay_flag", 0) == 3) && this.f295334c.getParcelable("key_bankcard") != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f295334c.getParcelable("key_bankcard");
            db5.e1.A(abstractActivityC22902xe37969e, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvx, c19091x9511676c.f69233x225aa2b6, c19091x9511676c.f69249x61dbf87) : str, "", abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvw), abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new yr4.f(this, i17, abstractActivityC22902xe37969e), null);
            return true;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void x() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new yr4.k(this), 200L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void y(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        java.util.List list = this.f546643d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == abstractActivityC22902xe37969e) {
                ((java.util.ArrayList) list).remove(weakReference);
                return;
            }
        }
    }
}

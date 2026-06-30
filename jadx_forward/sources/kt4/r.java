package kt4;

/* loaded from: classes9.dex */
public class r extends com.p314xaae8f345.mm.p2802xd031a825.h {
    public static java.lang.String F(kt4.r rVar) {
        java.lang.String string = rVar.f295334c.getString("key_ecard_type");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? "WEB_DEBIT" : string;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19164x1eb3f050.class, bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "start open ecard: %s", java.lang.Integer.valueOf(G()));
        return this;
    }

    public final int G() {
        return this.f295334c.getInt("key_open_scene");
    }

    public final java.lang.String H() {
        return this.f295334c.getString("key_req_serial");
    }

    public final void I(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.OpenECardProcess", "gotoFinishUI, openScene: %s", java.lang.Integer.valueOf(G()));
        if (G() != 3) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19162xa40b1303.class, null);
            return;
        }
        bundle.putInt("key_open_scene", 3);
        bundle.putString("key_open_extra_data", this.f295334c.getString("key_open_extra_data", ""));
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19165x6de109a8.class, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        if (i17 != 100) {
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
                if (this.f295334c.getInt("key_select_card_action") == 1) {
                    d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b.class, null, 0);
                    return;
                } else {
                    d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19160x772fa748.class, null, 0);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "back to card list");
        int G = G();
        java.lang.String H = H();
        java.lang.String str = (java.lang.String) this.f295334c.get("key_pwd1");
        this.f295334c.clear();
        this.f295334c.putInt("key_open_scene", G);
        this.f295334c.putString("key_req_serial", H);
        this.f295334c.putString("key_pwd1", str);
        d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b.class, null, 0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "OpenECardProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "end process: %s", activity);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19164x1eb3f050.class);
        intent.putExtras(bundle);
        h(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19164x1eb3f050.class, bundle.containsKey("key_process_result_code") ? bundle.getInt("key_process_result_code", 0) : 0, intent, true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            if (!bundle.getBoolean("key_is_reuse_existing_ecard", false)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b.class, null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "forward, is reuse exist card");
            this.f295334c.putBoolean("key_is_reuse_existing_ecard", true);
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19164x1eb3f050.class, bundle);
            activity.finish();
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b) {
            if (this.f295334c.getInt("key_select_card_action", 1) != 1) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19160x772fa748.class, null);
                return;
            } else if (!bundle.getBoolean("key_need_verify_sms")) {
                I(activity, bundle);
                return;
            } else {
                bundle.putBoolean("key_need_confirm_finish", true);
                C(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, null, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            I(activity, bundle);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19160x772fa748) {
            boolean z17 = bundle.getBoolean("key_check_other_card_need_input_card_elem", false);
            boolean z18 = bundle.getBoolean("key_need_verify_sms");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "input card elem: %s, verify sms: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            if (z17) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19161x50d3ecde.class, null);
                return;
            } else if (!z18) {
                I(activity, bundle);
                return;
            } else {
                bundle.putBoolean("key_need_confirm_finish", true);
                C(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, null, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19161x50d3ecde) {
            if (!bundle.getBoolean("key_need_verify_sms")) {
                I(activity, bundle);
                return;
            } else {
                bundle.putBoolean("key_need_confirm_finish", true);
                C(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, null, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19164x1eb3f050) {
            boolean z19 = bundle.getBoolean("key_is_token_invalid", false);
            this.f295334c.putBoolean("key_is_token_invalid", z19);
            java.lang.String string = this.f295334c.getString("key_open_token");
            int G = G();
            int i18 = bundle.getInt("key_ecard_proxy_action", 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "forward openScene: %s, token==null: %s, isTokenInvalid: %s, action: %s", java.lang.Integer.valueOf(G), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(i18));
            if (i18 != 1) {
                if (!bundle.getBoolean("key_need_verify_sms")) {
                    I(activity, bundle);
                    return;
                } else {
                    bundle.putBoolean("key_need_confirm_finish", true);
                    C(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, null, bundle);
                    return;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                E(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle, 1);
            } else if (z19) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
            } else if (G == 3) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b.class, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new kt4.e(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            return new kt4.q(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b) {
            return new kt4.n(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19160x772fa748) {
            return new kt4.b(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19161x50d3ecde) {
            return new kt4.o(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19164x1eb3f050) {
            return new kt4.j(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19165x6de109a8) {
            return new kt4.p(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean v(android.app.Activity activity, android.os.Bundle bundle) {
        bundle.putInt("key_process_result_code", 0);
        return false;
    }
}

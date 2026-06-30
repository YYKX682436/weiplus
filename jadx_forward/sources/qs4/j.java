package qs4;

/* loaded from: classes9.dex */
public class j extends qs4.b {

    /* renamed from: d, reason: collision with root package name */
    public qs4.i f447953d;

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        if (bundle != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, 0);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(0);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            boolean z17 = bundle.getBoolean("key_bind_card_can_pass_pwd", false);
            java.lang.String string = bundle.getString("key_bind_card_user_token", null);
            if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
            }
            return this;
        }
        if (bundle != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.b(activity, bundle.getInt("key_bind_scene", 0), 1);
        }
        if (bundle == null || !bundle.getBoolean("key_is_import_bind", false)) {
            super.A(activity, bundle);
            return this;
        }
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2.class, bundle);
        return this;
    }

    public void F(np5.b0 b0Var) {
        b0Var.d(new ys4.l(this.f295334c.getString("key_country_code", ""), this.f295334c.getString("key_province_code", ""), this.f295334c.getString("key_city_code", ""), (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c) this.f295334c.getParcelable("key_profession"), this.f295334c.getString("key_country_iso")), false);
    }

    public int G() {
        return !r() ? ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? 2 : 1 : ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? 5 : 4;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "BindCardProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.Class<?> cls;
        a("end", activity, bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "end Process : BindCardProcess");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
        n();
        boolean z17 = bundle.getBoolean("intent_bind_end", false);
        android.os.Bundle bundle2 = this.f295334c;
        if (bundle2 != null && bundle2.getBoolean("is_from_new_cashier", false)) {
            try {
                cls = java.lang.Class.forName(bundle2.getString("start_activity_class", ""));
            } catch (java.lang.Exception unused) {
                cls = null;
            }
            java.lang.Class<?> cls2 = cls;
            if (cls2 != null) {
                h(activity, cls2, -1, null, true);
                qs4.i iVar = this.f447953d;
                if (iVar != null) {
                    iVar.run(z17 ? -1 : 0);
                    return;
                }
                return;
            }
        }
        if (!bundle.getBoolean("key_need_bind_response", false)) {
            j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        k(activity, "wallet", ".bind.ui.WalletBindUI", -1, intent, false);
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        a("forward", activity, java.lang.Integer.valueOf(i17), bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "forward Process : BindCardProcess");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            if (bundle.getBoolean("key_is_import_bind", false)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2.class, bundle);
                return;
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
                return;
            }
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2)) {
            if (!r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "is domestic bankcard! need verify code!");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
                return;
            } else if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "wallet is not register, start WalletSetPasswordUI!");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "bind bank card success!!");
                bundle.putBoolean("intent_bind_end", true);
                db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kft));
                f(activity, bundle);
                return;
            }
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) && ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "end process after verify!");
            int i18 = this.f295334c.getInt("key_bind_scene", -1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641) this.f295334c.getParcelable("key_bindcard_value_result");
            if (c19093x748e2641 == null || i18 != 15) {
                bundle.putBoolean("intent_bind_end", true);
                db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kft));
                f(activity, bundle);
                return;
            }
            java.lang.String string = this.f295334c.getString("key_bind_card_type");
            java.lang.String string2 = this.f295334c.getString("key_bind_card_show1");
            java.lang.String string3 = this.f295334c.getString("key_bind_card_show2");
            int i19 = this.f295334c.getInt("key_bind_scene");
            int i27 = this.f295334c.getInt("realname_scene");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", string, string2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            c19093x748e2641.f261147h = string;
            c19093x748e2641.f261148i = string2;
            c19093x748e2641.f261149m = string3;
            c19093x748e2641.f261151o = i19;
            c19093x748e2641.f261152p = i27;
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7.class, bundle);
            return;
        }
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950)) {
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7) {
                f(activity, bundle);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "super forward!");
                super.o(activity, 0, bundle);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "end process after confirm pwd!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.b(activity, this.f295334c.getInt("key_bind_scene", 0), 7);
        bundle.putBoolean("intent_bind_end", true);
        db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kft));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e26412 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641) this.f295334c.getParcelable("key_bindcard_value_result");
        int i28 = this.f295334c.getInt("key_bind_scene", -1);
        if (c19093x748e26412 == null || i28 != 15) {
            f(activity, bundle);
            return;
        }
        java.lang.String string4 = this.f295334c.getString("key_bind_card_type");
        java.lang.String string5 = this.f295334c.getString("key_bind_card_show1");
        java.lang.String string6 = this.f295334c.getString("key_bind_card_show2");
        int i29 = this.f295334c.getInt("key_bind_scene");
        int i37 = this.f295334c.getInt("realname_scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", string4, string5, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
        c19093x748e26412.f261147h = string4;
        c19093x748e26412.f261148i = string5;
        c19093x748e26412.f261149m = string6;
        c19093x748e26412.f261151o = i29;
        c19093x748e26412.f261152p = i37;
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7.class, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new qs4.c(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if ((abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7) || (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2)) {
            return new qs4.f(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            return new qs4.g(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            return new qs4.h(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7) && r()) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) : activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950;
    }
}

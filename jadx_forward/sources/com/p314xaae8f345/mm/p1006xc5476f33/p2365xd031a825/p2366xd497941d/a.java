package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class a extends qs4.j {

    /* renamed from: e, reason: collision with root package name */
    public int f260848e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260849f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f260850g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f260851h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f260852i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f260853j = false;

    /* renamed from: k, reason: collision with root package name */
    public android.content.Intent f260854k = new android.content.Intent();

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f260855l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f260856m = false;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r f260857n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260858o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f260859p;

    public a() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f260858o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$9
            {
                this.f39173x3fe91575 = 572563856;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = c5663xbbd89b80;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent callback");
                if (c5663xbbd89b802 == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.this;
                am.di diVar = c5663xbbd89b802.f135987g;
                if (diVar != null) {
                    if (diVar.f87986a) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Succ");
                        android.app.Activity mo24762xef326bb9 = ((h45.q) i95.n0.c(h45.q.class)).mo24762xef326bb9();
                        if (mo24762xef326bb9 != null) {
                            android.os.Bundle bundle = aVar.f295334c;
                            bundle.putInt("realname_verify_process_ret", -1);
                            bundle.putString("realname_verify_process_finish_title", diVar.f87992g);
                            bundle.putString("realname_verify_process_finish_desc", diVar.f87993h);
                            bundle.putString("realname_verify_process_finish_page", diVar.f87994i);
                            bundle.putInt("realname_verify_process_finish_err_jump", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(diVar.f87995j, 0));
                            bundle.putInt("realname_verify_process_finish_passport_page_style", diVar.f87997l);
                            bundle.putString("realname_verify_process_finish_confirm_btn_title", diVar.f87998m);
                            bundle.putString("realname_verify_process_finish_confirm_btn_url", diVar.f87999n);
                            bundle.putString("realname_verify_process_finish_cancel_btn_title", diVar.f88000o);
                            bundle.putString("realname_verify_process_finish_bottom_wording", diVar.f88001p);
                            bundle.putString("realname_verify_process_finish_bottom_url", diVar.f88002q);
                            bundle.putString("realname_verify_process_finish_bottom_username", diVar.f88003r);
                            aVar.B(mo24762xef326bb9, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339.class, aVar.f295334c);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Cancel");
                        android.app.Activity mo24762xef326bb92 = ((h45.q) i95.n0.c(h45.q.class)).mo24762xef326bb9();
                        if (mo24762xef326bb92 != null) {
                            aVar.f(mo24762xef326bb92, aVar.f295334c);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "activity is null");
                        }
                    }
                }
                aVar.f260858o.mo48814x2efc64();
                aVar.f260859p.mo48814x2efc64();
                return true;
            }
        };
        this.f260859p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5664x24fbc67f>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$10
            {
                this.f39173x3fe91575 = 648959599;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5664x24fbc67f c5664x24fbc67f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardVerifyPhoneEvent callback");
                am.ei eiVar = c5664x24fbc67f.f135988g;
                if (eiVar == null) {
                    return false;
                }
                java.lang.String str = eiVar.f88090a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.this;
                aVar.f260855l = str;
                android.content.Context context = eiVar.f88091b;
                if (context == null) {
                    context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                aVar.B((android.app.Activity) context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f.class, aVar.f295334c);
                return false;
            }
        };
    }

    @Override // qs4.j, qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        this.f260853j = false;
        this.f260854k = new android.content.Intent();
        if (this.f295334c == null) {
            this.f295334c = new android.os.Bundle();
        }
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19079x580b4a5d.class, bundle);
        return this;
    }

    public final void H(final android.app.Activity activity, final android.os.Bundle bundle) {
        final int i17 = bundle.getInt("realname_verify_process_from_scene", 0);
        int i18 = bundle.getInt("realname_payScene", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "realName entrance scene: %s, payScene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ys4.o oVar = new ys4.o(i17, i18);
        oVar.f295437m = true;
        oVar.f295439o = activity;
        oVar.f295438n = false;
        oVar.l().h(new gm5.a() { // from class: com.tencent.mm.plugin.wallet_core.id_verify.a$$a
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:28:0x008e, B:30:0x0094, B:31:0x009a, B:33:0x00a0, B:38:0x00ac, B:39:0x00b2), top: B:27:0x008e }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b2 A[Catch: Exception -> 0x00e1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e1, blocks: (B:28:0x008e, B:30:0x0094, B:31:0x009a, B:33:0x00a0, B:38:0x00ac, B:39:0x00b2), top: B:27:0x008e }] */
            @Override // gm5.a
            /* renamed from: call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo1059x2e7a5e(java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.C19085x2ca3e0.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
            }
        });
        if (bundle.containsKey("realname_verify_process_from_scene")) {
            bundle.remove("realname_verify_process_from_scene");
        }
    }

    public final boolean I() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549 c18986x1ae8b549 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) this.f295334c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
        if (c18986x1ae8b549 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", c18986x1ae8b549.m73793x9616526c());
            return c18986x1ae8b549.f259086d.equals("verifySMS");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
        return false;
    }

    public final boolean J() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549 c18986x1ae8b549 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) this.f295334c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
        if (c18986x1ae8b549 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", c18986x1ae8b549.m73793x9616526c());
            return c18986x1ae8b549.f259086d.equals("bindCardHomeUI");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
        return false;
    }

    public final void K(android.content.Context context, android.os.Bundle bundle) {
        if (context instanceof android.app.Activity) {
            if (((h45.q) i95.n0.c(h45.q.class)).mo24779x384d4000("addPayCard")) {
                this.f260858o.mo48813x58998cd();
                this.f260859p.mo48813x58998cd();
                bundle.putInt("key_bind_scene", 12);
                bundle.putBoolean("key_need_bind_response", true);
                bundle.putString("notifyType", "WCPayRealnameVerifyLogic");
                ((h45.q) i95.n0.c(h45.q.class)).mo24781x29b0a117(bundle, "WCPayRealnameVerifyLogicPlatformCallback", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.q(this));
                return;
            }
            android.app.Activity activity = (android.app.Activity) context;
            if (L(activity, bundle)) {
                return;
            }
            if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || "rename".equals(this.f295334c.getString("key_realname_scene"))) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
            }
        }
    }

    public final boolean L(android.content.Context context, android.os.Bundle bundle) {
        if (!com.p314xaae8f345.mm.p2802xd031a825.b.a().b()) {
            return false;
        }
        this.f260858o.mo48813x58998cd();
        this.f260859p.mo48813x58998cd();
        if (bundle != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, 0);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(0);
        }
        bundle.putInt("key_bind_scene", 10);
        if ("rename".equals(this.f295334c.getString("key_realname_scene"))) {
            bundle.putInt("reg_flag", 0);
        }
        ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(context, bundle);
        return true;
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        a("back", activity, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb)) {
            if (i17 == 0) {
                f(activity, this.f295334c);
                return;
            }
            return;
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514)) {
            if (this.f260852i != 0) {
                f(activity, this.f295334c);
                return;
            }
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            f(activity, this.f295334c);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, null, i17);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339) {
            d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.class, null, i17);
            return;
        }
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f)) {
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "back from WcPayRealnameVerifyBindcardEntranceUI");
                if (J()) {
                    f(activity, this.f295334c);
                    return;
                } else {
                    d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.class, null, i17);
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "back from verifyCodeUI");
        if (I()) {
            f(activity, this.f295334c);
        } else if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260855l))) {
            d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955.class, null, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "is kinda bindcard verify phone scene，finish activity");
            m(activity);
        }
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "realname_verify_process";
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        a("end", activity, bundle);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
        if (bundle == null) {
            bundle = this.f295334c;
        }
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        android.os.Bundle bundle2 = bundle;
        if (this.f260848e == 1) {
            n();
            if (bundle2.getBoolean("intent_bind_end", false)) {
                this.f260851h = -1;
            } else {
                this.f260851h = 0;
            }
        } else if (bundle2.containsKey("realname_verify_process_ret")) {
            this.f260851h = bundle2.getInt("realname_verify_process_ret", -1);
        } else {
            this.f260851h = 0;
        }
        if (bundle2.containsKey("intent_bind_end")) {
            bundle2.remove("intent_bind_end");
        }
        if (bundle2.containsKey("key_is_bind_reg_process")) {
            bundle2.remove("key_is_bind_reg_process");
        }
        bundle2.putInt("realname_verify_process_ret", this.f260851h);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle2);
        if (this.f260851h == -1) {
            dp.a.m125854x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hs7), 0).show();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
        int i17 = this.f260851h;
        am.l10 l10Var = c6243x5c461184.f136491g;
        if (i17 == -1) {
            l10Var.f88748a = 17;
        } else if (i17 == 0) {
            l10Var.f88748a = 18;
        } else {
            l10Var.f88748a = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.h(this, c6243x5c461184, intent, activity, bundle2);
        c6243x5c461184.f273897d = hVar;
        hVar.run();
    }

    @Override // qs4.j, qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        android.os.Bundle bundle2 = bundle;
        a("forward", activity, "actionCode:" + i17, bundle2);
        int i18 = this.f295334c.getInt("real_name_verify_mode", this.f260848e);
        if (this.f260848e != i18) {
            this.f260848e = i18;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19079x580b4a5d) {
            if (bundle2 == null) {
                bundle2 = this.f295334c;
            }
            if (bundle2 != null) {
                this.f260848e = bundle2.getInt("real_name_verify_mode", 0);
            } else {
                this.f260848e = 0;
            }
            this.f260852i = this.f260848e;
            bundle2.putBoolean("key_is_realname_verify_process", true);
            this.f260849f = bundle2.getString("realname_verify_process_jump_plugin", "");
            this.f260850g = bundle2.getString("realname_verify_process_jump_activity", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "mAllowIdVerify is  mAllowIdVerify: %s,mPluginName %s, mActivityName %s ", java.lang.Boolean.valueOf(bundle2.getInt("realname_verify_process_allow_idverify", 0) == 1), this.f260849f, this.f260850g);
            int i19 = this.f260848e;
            if (i19 == 0) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(10);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d.class, bundle2);
                return;
            }
            if (i19 == 1) {
                bundle2.putBoolean("key_need_bind_response", true);
                if (L(activity, bundle2)) {
                    return;
                }
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(10);
                super.A(activity, bundle2);
                return;
            }
            if (i19 == 2) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f.class, bundle2);
                return;
            }
            if (i19 != 4) {
                return;
            }
            java.lang.String string = this.f295334c.getString("key_realname_scene");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "realname scene: %s", string);
            if (I()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "direct go to verifySMS");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549 c18986x1ae8b549 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) this.f295334c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                this.f295334c.putString("key_real_name_token", c18986x1ae8b549.f259087e);
                this.f295334c.putString("realname_verify_process_req_key", c18986x1ae8b549.f259087e);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f.class, bundle2);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549 c18986x1ae8b5492 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) this.f295334c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
            if (c18986x1ae8b5492 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", c18986x1ae8b5492.m73793x9616526c());
                z17 = c18986x1ae8b5492.f259086d.equals("home");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "direct go to realname home");
                H(activity, bundle2);
                return;
            }
            if (J()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549 c18986x1ae8b5493 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) this.f295334c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
                bundle2.putString("usertoken", c18986x1ae8b5493.f259087e);
                bundle2.putBoolean("realname_is_minor_bindcard", true);
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                java.lang.String str = c18986x1ae8b5493.f259087e;
                bundle2.putString("key_real_name_token", str);
                bundle2.putString("realname_verify_process_req_key", str);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955.class, bundle2);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549 c18986x1ae8b5494 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) this.f295334c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter");
            if (c18986x1ae8b5494 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter: %s", c18986x1ae8b5494.m73793x9616526c());
                z18 = c18986x1ae8b5494.f259086d.equals("fillCardInfoUI");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "tinyAppParameter is null");
                z18 = false;
            }
            if (z18) {
                bundle2.putString("usertoken", ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) this.f295334c.getParcelable("JsApiRequestWCPayRealnameVerifyParameter")).f259087e);
                bundle2.putBoolean("realname_is_minor_bindcard", true);
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                K(activity, bundle2);
                return;
            }
            if ("rename".equals(string)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.class, bundle2);
                return;
            } else if (bundle2.getBoolean("directGotoInputUI")) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.class, bundle2);
                return;
            } else {
                H(activity, bundle2);
                return;
            }
        }
        int i27 = this.f260848e;
        if (i27 == 2) {
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle2);
                return;
            }
            if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8)) {
                if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) && (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d)) {
                    B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f.class, bundle2);
                    this.f260848e = 2;
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "Abtest need Sm2Encrypt 1");
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
            }
            bundle2.putBoolean("isNeedSm2Encrypt", true);
            bundle2.putInt("Sm2EncryptType", 5);
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.class, bundle2);
            return;
        }
        if (i27 == 1) {
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19074x1cba768d) {
                if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                    B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle2);
                    return;
                } else {
                    B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle2);
                    return;
                }
            }
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle2);
                return;
            } else {
                super.o(activity, i17, bundle);
                return;
            }
        }
        if (i27 != 4) {
            if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f)) {
                super.o(activity, i17, bundle);
                return;
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle2);
                this.f260848e = 1;
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5.class, bundle2);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5) {
            if (bundle2.getBoolean("realname_verify_process_need_bind_card", false)) {
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                K(activity, bundle2);
                return;
            }
            boolean z19 = this.f295334c.getBoolean("realname_verify_process_show_bindcard_page", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "show bind page: %s", java.lang.Boolean.valueOf(z19));
            if (!z19) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle2);
                return;
            } else {
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955.class, bundle2);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955) {
            if (bundle2.getBoolean("realname_verify_process_do_bind", false)) {
                bundle2.putBoolean("should_block_usecase_stop_when_add_card_success", true);
                K(activity, bundle2);
                return;
            } else if (this.f295334c.getBoolean("realname_verify_process_verify_sms_without_bindcard", false)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f.class, bundle2);
                return;
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle2);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260855l)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle2);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "notify bind card");
            this.f260855l = null;
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("notifyType", "RealNameAfterVerifyPhoneSucc");
            ((h45.q) i95.n0.c(h45.q.class)).mo24781x29b0a117(bundle3, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.c(this));
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "Abtest need Sm2Encrypt 2");
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
            }
            bundle2.putBoolean("isNeedSm2Encrypt", true);
            bundle2.putInt("Sm2EncryptType", 5);
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.class, bundle2);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339.class, bundle2);
            return;
        }
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3)) {
            super.o(activity, i17, bundle);
            return;
        }
        java.lang.String string2 = this.f295334c.getString("key_resetpwd");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "resetpwd: %s", string2);
        if ("resetpwd".equals(string2)) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle2);
        } else {
            super.o(activity, i17, bundle);
        }
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (!(abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950)) {
            return abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f ? new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.l(this, abstractActivityC21394xb3d2c0cf, b0Var) : ((abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7) || (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2)) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.o(this, abstractActivityC21394xb3d2c0cf, b0Var) : abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 ? new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p(this, abstractActivityC21394xb3d2c0cf, b0Var) : abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f ? new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.u(this, abstractActivityC21394xb3d2c0cf, b0Var) : super.p(abstractActivityC21394xb3d2c0cf, b0Var);
        }
        int i17 = this.f260848e;
        return (i17 == 2 || i17 == 4) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.k(this, abstractActivityC21394xb3d2c0cf, b0Var) : super.p(abstractActivityC21394xb3d2c0cf, b0Var);
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public int q(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        return com.p314xaae8f345.mm.R.C30867xcad56011.kne;
    }
}

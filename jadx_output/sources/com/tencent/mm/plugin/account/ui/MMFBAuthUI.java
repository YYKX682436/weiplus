package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class MMFBAuthUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f73439q = {"public_profile", com.google.android.gms.common.Scopes.EMAIL, "user_location"};

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.l f73440d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f73441e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f73442f;

    /* renamed from: g, reason: collision with root package name */
    public r61.a1 f73443g;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f73447n;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73444h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73445i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73446m = "";

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f73448o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f73449p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.MMFBAuthUI.1
        {
            this.__eventId = -1399051904;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent) {
            am.gj gjVar;
            com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent2 = loginDisasterEvent;
            if (loginDisasterEvent2 == null || (gjVar = loginDisasterEvent2.f54483g) == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookAuthUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBAuthUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MMFBAuthUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public final void V6() {
        android.app.ProgressDialog show = android.app.ProgressDialog.show(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.c86), true);
        this.f73441e = show;
        show.setOnCancelListener(this.f73442f);
        this.f73443g = new r61.a1(1, this.f73446m);
        gm0.j1.d().g(this.f73443g);
        W6(true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 1L, 1L, false);
    }

    public final void W6(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new e21.p(32, z17 ? "0" : "1"));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(arrayList));
    }

    public final void X6() {
        ((com.tencent.mm.ui.base.preference.h0) this.f73447n).t();
        boolean u17 = this.f73444h ? false : c01.z1.u();
        java.util.Map map = this.f73448o;
        if (((java.util.HashMap) map).containsKey("facebook_auth_tip")) {
            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) ((java.util.HashMap) map).get("facebook_auth_tip");
            preference.J(u17 ? com.tencent.mm.R.string.c8d : com.tencent.mm.R.string.f491177c85);
            ((com.tencent.mm.ui.base.preference.h0) this.f73447n).d(preference, -1);
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_cat")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73447n).d((com.tencent.mm.ui.base.preference.Preference) ((java.util.HashMap) map).get("facebook_auth_cat"), -1);
        }
        if (!u17) {
            if (((java.util.HashMap) map).containsKey("facebook_auth_bind_btn")) {
                ((com.tencent.mm.ui.base.preference.h0) this.f73447n).d((com.tencent.mm.ui.base.preference.Preference) ((java.util.HashMap) map).get("facebook_auth_bind_btn"), -1);
                return;
            }
            return;
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_account")) {
            com.tencent.mm.ui.base.preference.Preference preference2 = (com.tencent.mm.ui.base.preference.Preference) ((java.util.HashMap) map).get("facebook_auth_account");
            preference2.L(getString(com.tencent.mm.R.string.c87) + gm0.j1.u().c().l(65826, null));
            ((com.tencent.mm.ui.base.preference.h0) this.f73447n).d(preference2, -1);
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_cat2")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73447n).d((com.tencent.mm.ui.base.preference.Preference) ((java.util.HashMap) map).get("facebook_auth_cat2"), -1);
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_unbind_btn")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73447n).d((com.tencent.mm.ui.base.preference.Preference) ((java.util.HashMap) map).get("facebook_auth_unbind_btn"), -1);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494871ad;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73444h = getIntent().getBooleanExtra("is_force_unbind", false);
        this.f73442f = new com.tencent.mm.plugin.account.ui.j8(this);
        setMMTitle(com.tencent.mm.R.string.afl);
        ((com.tencent.mm.ui.base.preference.h0) this.f73447n).g(com.tencent.mm.R.xml.f494871ad);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f73447n).h("facebook_auth_tip");
        java.util.Map map = this.f73448o;
        if (h17 != null) {
            ((java.util.HashMap) map).put("facebook_auth_tip", h17);
        }
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) this.f73447n).h("facebook_auth_cat");
        if (h18 != null) {
            ((java.util.HashMap) map).put("facebook_auth_cat", h18);
        }
        com.tencent.mm.ui.base.preference.Preference h19 = ((com.tencent.mm.ui.base.preference.h0) this.f73447n).h("facebook_auth_bind_btn");
        if (h19 != null) {
            ((java.util.HashMap) map).put("facebook_auth_bind_btn", h19);
        }
        com.tencent.mm.ui.base.preference.Preference h27 = ((com.tencent.mm.ui.base.preference.h0) this.f73447n).h("facebook_auth_account");
        if (h27 != null) {
            ((java.util.HashMap) map).put("facebook_auth_account", h27);
        }
        com.tencent.mm.ui.base.preference.Preference h28 = ((com.tencent.mm.ui.base.preference.h0) this.f73447n).h("facebook_auth_cat2");
        if (h28 != null) {
            ((java.util.HashMap) map).put("facebook_auth_cat2", h28);
        }
        com.tencent.mm.ui.base.preference.Preference h29 = ((com.tencent.mm.ui.base.preference.h0) this.f73447n).h("facebook_auth_unbind_btn");
        if (h29 != null) {
            ((java.util.HashMap) map).put("facebook_auth_unbind_btn", h29);
        }
        setBackBtn(new com.tencent.mm.plugin.account.ui.k8(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FacebookAuthUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i18 == -1 && i17 == 1024 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra));
            objArr2[1] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? 0 : stringExtra.length());
            objArr2[2] = java.lang.Integer.valueOf(intExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookAuthUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                V6();
                return;
            }
        }
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73440d;
        if (lVar != null) {
            lVar.b(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73447n = getPreferenceScreen();
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73440d;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.content.Intent intent = getIntent();
            intent.putExtra("bind_facebook_succ", this.f73445i);
            setResult(-1, intent);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f73449p.dead();
        gm0.j1.d().q(183, this);
        gm0.j1.d().q(254, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FacebookAuthUI", "onPreferenceTreeClick, key is null");
            return true;
        }
        if (!str.equals("facebook_auth_bind_btn")) {
            if (!str.equals("facebook_auth_unbind_btn")) {
                return false;
            }
            db5.e1.n(this, com.tencent.mm.R.string.c8b, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.l8(this), new com.tencent.mm.plugin.account.ui.m8(this));
            return true;
        }
        try {
            com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73440d;
            lVar.getClass();
            com.tencent.xweb.d.g().e();
            lVar.g(null);
            lVar.f209214b = 0L;
            lVar.h(this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FacebookAuthUI", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.ui.mmfb.sdk.l lVar2 = new com.tencent.mm.ui.mmfb.sdk.l();
        this.f73440d = lVar2;
        lVar2.a(this, f73439q, new com.tencent.mm.plugin.account.ui.r8(this, null));
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f73449p.alive();
        super.onResume();
        gm0.j1.d().a(183, this);
        gm0.j1.d().a(254, this);
        X6();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 254) {
            if (i17 == 0 && i18 == 0) {
                this.f73443g = new r61.a1(0, "");
                gm0.j1.d().g(this.f73443g);
                return;
            }
            android.app.ProgressDialog progressDialog = this.f73441e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (i18 == -82) {
                db5.e1.m(this, com.tencent.mm.R.string.inx, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.n8(this));
                return;
            }
            if (i18 == -83) {
                db5.e1.m(this, com.tencent.mm.R.string.inu, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.o8(this));
                return;
            }
            if (i18 == -84) {
                db5.e1.m(this, com.tencent.mm.R.string.inv, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.p8(this));
                return;
            }
            if (i18 == -85) {
                db5.e1.m(this, com.tencent.mm.R.string.f29int, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.q8(this));
                return;
            }
            if (i18 == -86) {
                db5.e1.m(this, com.tencent.mm.R.string.iny, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.account.ui.i8(this));
                return;
            }
            if (i18 == -106) {
                x51.i1.c(this, str, 0);
                return;
            }
            if (i18 == -217) {
                x51.i1.f(this, x51.i.a((com.tencent.mm.modelsimple.v0) m1Var), i18);
                return;
            }
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(this, null, null);
                return;
            }
            return;
        }
        if (m1Var.getType() == 183) {
            android.app.ProgressDialog progressDialog2 = this.f73441e;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            int i19 = ((r61.a1) m1Var).f392816f;
            if (i17 == 0 && i18 == 0) {
                dp.a.makeText(this, i19 == 0 ? com.tencent.mm.R.string.bdi : com.tencent.mm.R.string.bde, 1).show();
                this.f73444h = false;
                X6();
                if (i19 == 1) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("facebookapp");
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().J0("facebookapp");
                    this.f73445i = true;
                    return;
                }
                return;
            }
            if (i17 == 4 && i18 == -67) {
                dp.a.makeText(this, com.tencent.mm.R.string.c89, 1).show();
                return;
            }
            if (i17 == 4 && i18 == -5) {
                dp.a.makeText(this, i19 == 1 ? com.tencent.mm.R.string.f491175c83 : com.tencent.mm.R.string.c8a, 1).show();
                return;
            }
            if (i18 == -106) {
                x51.i1.c(this, str, 0);
                return;
            }
            tm.a b18 = tm.a.b(str);
            if (b18 != null) {
                b18.c(this, null, null);
            } else {
                dp.a.makeText(this, i19 == 0 ? com.tencent.mm.R.string.bdh : com.tencent.mm.R.string.bdd, 1).show();
            }
        }
    }
}

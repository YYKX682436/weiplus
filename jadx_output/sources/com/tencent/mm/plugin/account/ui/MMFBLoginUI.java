package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class MMFBLoginUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f73459p = {"public_profile", com.google.android.gms.common.Scopes.EMAIL, "user_location"};

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.l f73460d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73462f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f73463g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelsimple.v0 f73464h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73465i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.j f73467n;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73461e = "";

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct f73466m = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f73468o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.MMFBLoginUI.1
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
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public static void V6(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI, boolean z17) {
        mMFBLoginUI.getClass();
        int i17 = z17 ? 19 : 20;
        gm0.j1.u().f273148a.f(i17, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().f273148a.a(i17), 0) + 1));
    }

    public final void W6() {
        try {
            com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73460d;
            if (lVar != null) {
                com.tencent.xweb.d.g().e();
                lVar.g(null);
                lVar.f209214b = 0L;
                lVar.h(this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FacebookLoginUI", e17, "", new java.lang.Object[0]);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        com.tencent.mm.ui.mmfb.sdk.l lVar2 = new com.tencent.mm.ui.mmfb.sdk.l();
        this.f73460d = lVar2;
        lVar2.a(this, f73459p, new com.tencent.mm.plugin.account.ui.p9(this, null));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(582L, 5L, 1L, false);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494872ae;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73460d = new com.tencent.mm.ui.mmfb.sdk.l();
        this.f73463g = new com.tencent.mm.plugin.account.ui.n9(this);
        W6();
        setBackBtn(new com.tencent.mm.plugin.account.ui.o9(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i18 == -1 && i17 == 1024 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra));
            objArr2[1] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? 0 : stringExtra.length());
            objArr2[2] = java.lang.Integer.valueOf(intExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                W6();
                return;
            }
        }
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73460d;
        if (lVar != null) {
            lVar.b(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ghi);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        this.f73465i = n71.a.a();
        initView();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73460d;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f73465i);
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f73468o.dead();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L100_200_FB,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L100_200_FB"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FacebookLoginUI", "onPreferenceTreeClick, key is null");
            return true;
        }
        if (!str.equals("facebook_auth_bind_btn")) {
            return false;
        }
        W6();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f73468o.alive();
        super.onResume();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L100_200_FB,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L100_200_FB"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L100_200_FB");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r20 != (-3)) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, com.tencent.mm.modelbase.m1 r22) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.MMFBLoginUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}

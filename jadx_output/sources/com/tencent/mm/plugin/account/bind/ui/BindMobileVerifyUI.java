package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindMobileVerifyUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f73050e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73051f;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f73053h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f73054i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f73055m;

    /* renamed from: o, reason: collision with root package name */
    public int f73057o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f73058p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelsimple.BindWordingContent f73059q;

    /* renamed from: r, reason: collision with root package name */
    public int f73060r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f73061s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f73062t;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73052g = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f73056n = 15;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488204ke;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73051f = (java.lang.String) gm0.j1.u().c().l(4097, null);
        this.f73050e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.aid);
        this.f73053h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aic);
        this.f73054i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ai8);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.aia);
        java.lang.String str = this.f73051f;
        if (str == null || str.equals("")) {
            this.f73051f = (java.lang.String) gm0.j1.u().c().l(6, null);
        }
        java.lang.String str2 = this.f73051f;
        if (str2 != null && str2.length() > 0) {
            this.f73053h.setVisibility(0);
            this.f73053h.setText(this.f73051f);
        }
        this.f73050e.setFilters(new android.text.InputFilter[]{new p61.r2(this)});
        this.f73055m = (android.widget.Button) findViewById(com.tencent.mm.R.id.aif);
        button.setVisibility(8);
        this.f73054i.setText(getResources().getQuantityString(com.tencent.mm.R.plurals.f489684v, this.f73056n.intValue(), this.f73056n));
        if (this.f73058p == null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new p61.w2(this), true);
            this.f73058p = b4Var;
            b4Var.c(1000L, 1000L);
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490502ww), new p61.t2(this));
        setBackBtn(new p61.u2(this));
        this.f73055m.setVisibility(u11.c.b(this.f73051f) ? 0 : 8);
        this.f73055m.setOnClickListener(new p61.v2(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(132, this);
        setMMTitle(com.tencent.mm.R.string.f490719ah4);
        this.f73059q = (com.tencent.mm.modelsimple.BindWordingContent) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f73060r = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.f73061s = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
        this.f73062t = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
        this.f73057o = getIntent().getIntExtra("bind_scene", 0);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(132, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMobileVerifyUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        r61.e1 e1Var = (r61.e1) m1Var;
        if (e1Var.I() != 2) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73052g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f73052g = null;
        }
        boolean z17 = true;
        if (i17 != 0 || i18 != 0) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            if (!com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
                if (i18 == -214) {
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        b17.c(this, null, null);
                    }
                } else if (i18 == -43) {
                    dp.a.makeText(this, com.tencent.mm.R.string.f490713ag4, 0).show();
                } else if (i18 != -41) {
                    switch (i18) {
                        case -36:
                            dp.a.makeText(this, com.tencent.mm.R.string.ag9, 0).show();
                            break;
                        case -35:
                            dp.a.makeText(this, com.tencent.mm.R.string.f490714ag5, 0).show();
                            break;
                        case -34:
                            dp.a.makeText(this, com.tencent.mm.R.string.ag7, 0).show();
                            break;
                        case -33:
                            db5.e1.m(this, com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho, null);
                            break;
                        case org.chromium.net.NetError.ERR_BLOCKED_BY_ORB /* -32 */:
                            db5.e1.m(this, com.tencent.mm.R.string.ahj, com.tencent.mm.R.string.aho, null);
                            break;
                        default:
                            z17 = false;
                            break;
                    }
                } else {
                    dp.a.makeText(this, com.tencent.mm.R.string.ag6, 0).show();
                }
            }
            if (z17) {
                return;
            }
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            if (com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
                return;
            }
            dp.a.makeText(this, getString(com.tencent.mm.R.string.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        if (e1Var.I() == 2) {
            int i19 = this.f73057o;
            if (i19 == 1) {
                if (!((c01.z1.o() & 16384) != 0)) {
                    com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent();
                    am.zz zzVar = updateLocalVerifySwitchEvent.f54920g;
                    zzVar.f8617a = true;
                    zzVar.f8618b = true;
                    updateLocalVerifySwitchEvent.e();
                }
                W6(1);
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
                j45.l.j(this, "account", ".security.ui.MySafeDeviceListUI", intent, null);
                return;
            }
            if (i19 == 6) {
                com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI.Z6(this, !this.f73061s, !this.f73062t);
                U6(-1);
                return;
            }
            if (i19 == 0 || i19 == 3) {
                ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                x51.e.a(x51.e.f451990b);
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI.class);
            intent2.putExtra("kstyle_bind_wording", this.f73059q);
            intent2.putExtra("kstyle_bind_recommend_show", this.f73060r);
            intent2.putExtra("Kfind_friend_by_mobile_flag", this.f73061s);
            intent2.putExtra("Krecom_friends_by_mobile_flag", this.f73062t);
            intent2.putExtra("bind_scene", this.f73057o);
            com.tencent.mm.ui.MMWizardActivity.X6(this, intent2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f73058p;
        if (b4Var != null && !b4Var.e()) {
            this.f73058p.d();
        }
        this.f73058p = null;
        super.onStop();
    }
}

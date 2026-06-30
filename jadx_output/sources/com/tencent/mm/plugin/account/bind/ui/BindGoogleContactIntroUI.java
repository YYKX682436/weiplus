package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes3.dex */
public class BindGoogleContactIntroUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f72917d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f72918e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f72919f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f72920g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f72922i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f72923m;

    /* renamed from: n, reason: collision with root package name */
    public r61.c1 f72924n;

    /* renamed from: o, reason: collision with root package name */
    public int f72925o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f72921h = false;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f72926p = new p61.b(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnClickListener f72927q = new p61.e(this);

    public final void T6() {
        this.f72920g.setVisibility(8);
        this.f72919f.setVisibility(0);
        this.f72917d.setVisibility(0);
        this.f72918e.setVisibility(0);
        this.f72918e.setText(com.tencent.mm.R.string.afo);
        this.f72919f.setText(com.tencent.mm.R.string.afm);
        this.f72919f.setOnClickListener(this.f72926p);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.k_;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new p61.f(this));
        this.f72917d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486858mo0);
        this.f72918e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486859mo1);
        this.f72919f = (android.widget.Button) findViewById(com.tencent.mm.R.id.mnz);
        this.f72920g = (android.widget.Button) findViewById(com.tencent.mm.R.id.mon);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1) {
            if (i17 == 2005) {
                intent.getBooleanExtra("gpservices", false);
            }
        } else if (i17 == 2005) {
            intent.getBooleanExtra("gpservices", false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.afp);
        this.f72925o = getIntent().getIntExtra("enter_scene", 0);
        if (r61.r0.b(this)) {
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(208903, null);
        this.f72922i = str;
        if (android.text.TextUtils.isEmpty(str)) {
            this.f72921h = false;
        } else {
            this.f72921h = true;
        }
        initView();
        if (this.f72921h) {
            this.f72920g.setVisibility(0);
            this.f72919f.setVisibility(8);
            this.f72918e.setVisibility(0);
            this.f72918e.setText(getString(com.tencent.mm.R.string.afn, this.f72922i));
            this.f72920g.setOnClickListener(this.f72927q);
        } else {
            T6();
        }
        gm0.j1.d().a(487, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        android.app.ProgressDialog progressDialog = this.f72923m;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f72923m.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "unbind failed");
            dp.a.makeText(this, com.tencent.mm.R.string.fqz, 0).show();
            return;
        }
        gm0.j1.u().c().w(208903, "");
        gm0.j1.u().c().w(208901, "");
        gm0.j1.u().c().w(208902, "");
        gm0.j1.u().c().w(208905, java.lang.Boolean.TRUE);
        gm0.j1.u().c().i(true);
        T6();
        db5.e1.T(this, getString(com.tencent.mm.R.string.k2e));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(487, this);
    }
}

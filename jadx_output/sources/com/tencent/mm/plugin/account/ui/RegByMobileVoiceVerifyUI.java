package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class RegByMobileVoiceVerifyUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f73620d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73621e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73622f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f73623g;

    /* renamed from: h, reason: collision with root package name */
    public h11.e f73624h;

    /* renamed from: i, reason: collision with root package name */
    public r61.e1 f73625i;

    /* renamed from: m, reason: collision with root package name */
    public int f73626m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73627n;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488206kg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        setMMTitle(com.tencent.mm.R.string.ahy);
        setBackBtn(new com.tencent.mm.plugin.account.ui.ig(this));
        this.f73623g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hsx);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.aig);
        java.lang.String str2 = this.f73620d;
        com.tencent.mm.plugin.account.ui.f3[] V6 = com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI.V6();
        java.lang.String a17 = u11.c.a(str2);
        int length = V6.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                str = "English";
                break;
            }
            com.tencent.mm.plugin.account.ui.f3 f3Var = V6[i17];
            if (f3Var.f73840c.equalsIgnoreCase(a17)) {
                str = f3Var.f73838a;
                break;
            }
            i17++;
        }
        this.f73621e = str;
        this.f73623g.setText(str);
        this.f73622f = u11.c.a(this.f73620d);
        findViewById(com.tencent.mm.R.id.f485654ii0).setOnClickListener(new com.tencent.mm.plugin.account.ui.jg(this));
        button.setOnClickListener(new com.tencent.mm.plugin.account.ui.mg(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 10000 || intent == null) {
            return;
        }
        this.f73621e = intent.getStringExtra("voice_verify_language");
        this.f73622f = intent.getStringExtra("voice_verify_code");
        this.f73623g.setText(this.f73621e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73620d = getIntent().getExtras().getString("bindmcontact_mobile");
        int i17 = getIntent().getExtras().getInt("voice_verify_type");
        this.f73626m = i17;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            gm0.j1.d().a(145, this);
        } else if (i17 == 4 || i17 == 1) {
            gm0.j1.d().a(132, this);
        }
        this.f73627n = n71.a.a();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(132, this);
        gm0.j1.d().q(145, this);
        int i17 = this.f73626m;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_500,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_500"));
            sb6.append(",2");
            n71.a.c(10645, false, sb6.toString());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f73627n);
        hideVKB();
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int i17 = this.f73626m;
        if (i17 == 0 || i17 == 2 || i17 == 3) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_500,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_500"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            n71.a.d("R200_500");
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileVoiceVerifyUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) wi6).getClass();
        com.tencent.mm.ui.pc.a(context, i17, i18, str, 4);
    }
}

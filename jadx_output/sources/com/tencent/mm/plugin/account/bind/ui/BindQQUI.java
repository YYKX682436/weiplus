package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindQQUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f73063h = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73065f;

    /* renamed from: e, reason: collision with root package name */
    public int f73064e = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73066g = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488207kh;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        long longValue = new kk.v(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null))).longValue();
        if (longValue == 0) {
            setMMTitle(com.tencent.mm.R.string.ai7);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.moe);
            textView.setVisibility(8);
            textView.setText(com.tencent.mm.R.string.ai6);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.mof)).setVisibility(8);
            android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.aik);
            button.setVisibility(0);
            button.setText(com.tencent.mm.R.string.f490726ai5);
            button.setOnClickListener(new p61.c3(this));
            removeOptionMenu(1);
        } else {
            setMMTitle(com.tencent.mm.R.string.f490725ai4);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.moe);
            textView2.setVisibility(8);
            textView2.setText(com.tencent.mm.R.string.f490723ai2);
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mof);
            textView3.setVisibility(0);
            textView3.setText(getString(com.tencent.mm.R.string.f490724ai3) + longValue);
            android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.aik);
            button2.setVisibility(8);
            button2.setText(com.tencent.mm.R.string.fv8);
            button2.setOnClickListener(new p61.d3(this));
            addIconOptionMenu(1, com.tencent.mm.R.raw.icons_outlined_more, new p61.g3(this));
        }
        if (this.f73064e == 1) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490458vm), new p61.a3(this));
        } else {
            setBackBtn(new p61.b3(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindQQUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again qq");
            gm0.j1.d().g(new r61.f1(1));
            this.f73065f = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490468vx), true, true, new p61.z2(this));
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73064e = getIntent().getIntExtra("bindqq_regbymobile", 0);
        gm0.j1.d().a(254, this);
        gm0.j1.d().a(255, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(254, this);
        gm0.j1.d().q(255, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73065f;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f73065f = null;
        }
        if (m1Var.getType() != 254) {
            if (m1Var.getType() == 255) {
                if (i18 == 0) {
                    com.tencent.mm.ui.MMWizardActivity.X6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ.class));
                    return;
                } else {
                    db5.e1.C(getContext(), getString(com.tencent.mm.R.string.j0f), null, getString(com.tencent.mm.R.string.j0g), getString(com.tencent.mm.R.string.j0e), true, new p61.j3(this), new p61.k3(this));
                    return;
                }
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.lang.String H = ((r61.f1) m1Var).H();
            this.f73066g = H;
            if (H != null && H.length() > 0) {
                gm0.j1.u().c().w(102407, this.f73066g);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                gm0.j1.d().g(new com.tencent.mm.modelsimple.w0(2));
                return;
            } else {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ.class);
                intent.putExtra("notice", (java.lang.String) null);
                com.tencent.mm.ui.MMWizardActivity.X6(this, intent);
                return;
            }
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f73065f;
        if (u3Var2 != null) {
            u3Var2.dismiss();
            this.f73065f = null;
        }
        if (i18 == -3) {
            db5.e1.C(getContext(), getString(com.tencent.mm.R.string.j0f), null, getString(com.tencent.mm.R.string.j0g), getString(com.tencent.mm.R.string.j0e), true, new p61.h3(this), new p61.i3(this));
            return;
        }
        if (i18 == -81) {
            db5.e1.m(this, com.tencent.mm.R.string.inw, com.tencent.mm.R.string.f490573yv, null);
            return;
        }
        if (i18 == -82) {
            db5.e1.m(this, com.tencent.mm.R.string.inx, com.tencent.mm.R.string.f490573yv, null);
            return;
        }
        if (i18 == -83) {
            db5.e1.m(this, com.tencent.mm.R.string.inu, com.tencent.mm.R.string.f490573yv, null);
            return;
        }
        if (i18 == -84) {
            db5.e1.m(this, com.tencent.mm.R.string.inv, com.tencent.mm.R.string.f490573yv, null);
        } else if (i18 == -85) {
            db5.e1.m(this, com.tencent.mm.R.string.f29int, com.tencent.mm.R.string.f490573yv, null);
        } else if (i18 == -86) {
            db5.e1.m(this, com.tencent.mm.R.string.iny, com.tencent.mm.R.string.f490573yv, null);
        }
    }
}

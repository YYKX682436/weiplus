package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindMContactStatusUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f72979i = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f72980e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f72981f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f72982g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f72983h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488203kd;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f72980e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483382ai2);
        this.f72981f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483380ai0);
        this.f72982g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ahy);
        this.f72983h = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483381ai1);
        if (r61.q0.b() == js.x0.SUCC) {
            this.f72980e.setImageResource(com.tencent.mm.R.raw.mobile_binded_icon);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (str == null || str.equals("")) {
                str = (java.lang.String) gm0.j1.u().c().l(4097, null);
            }
            this.f72982g.setText(getString(com.tencent.mm.R.string.agz));
            this.f72981f.setText(getString(com.tencent.mm.R.string.ahl, str));
        } else {
            this.f72980e.setImageResource(com.tencent.mm.R.raw.mobile_unbind_icon);
            this.f72982g.setText(com.tencent.mm.R.string.ah_);
            this.f72981f.setText(com.tencent.mm.R.string.ah_);
            this.f72982g.setVisibility(8);
        }
        this.f72983h.setOnClickListener(new p61.m1(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f490718ah3);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (!getIntent().getBooleanExtra("intent_back_launcherui", false)) {
            W6(1);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent, this);
        return true;
    }
}

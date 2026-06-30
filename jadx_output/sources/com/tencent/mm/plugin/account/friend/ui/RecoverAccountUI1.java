package com.tencent.mm.plugin.account.friend.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class RecoverAccountUI1 extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73171d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73172e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdd;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackBtn(new s61.t0(this), com.tencent.mm.R.raw.icons_filled_close);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.kao)).setOnClickListener(new s61.u0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73172e = getIntent().getStringExtra("key_qrcode_string");
        initView();
        gm0.j1.d().a(870, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(870, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverAccountUI1", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73171d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getString(com.tencent.mm.R.string.f490391to);
            }
            db5.e1.E(this, str, "", getString(com.tencent.mm.R.string.f490454vi), false, new s61.v0(this, i17, i18));
        } else {
            android.content.Intent intent = new android.content.Intent();
            r61.d1 d1Var = (r61.d1) m1Var;
            intent.putExtra("key_session_id", ((r45.ci) d1Var.f392836d.f70711b.f70700a).f371562d);
            intent.putExtra("key_old_username", ((r45.ci) d1Var.f392836d.f70711b.f70700a).f371563e);
            startActivity(com.tencent.mm.plugin.account.friend.ui.RecoverFriendUI.class, intent);
            finish();
        }
    }
}

package com.tencent.mm.plugin.account.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class ShareToFacebookRedirectUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f73653m = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f73654d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73655e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73656f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73657g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.l f73658h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73659i;

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToFacebookRedirectUI", "doSend");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.u(this.f73654d);
        u1Var.f211996a.f211821b.f211728r = this.f73656f;
        u1Var.h(this.f73655e);
        u1Var.o(getString(com.tencent.mm.R.string.f490357sp));
        u1Var.m(com.tencent.mm.R.string.f490558yg);
        u1Var.b(new com.tencent.mm.plugin.account.ui.ai(this, u1Var));
        u1Var.q(false);
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToFacebookRedirectUI", "refreshFacebookToken");
        long r17 = com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
        if (str == null) {
            str = "";
        }
        if (java.lang.System.currentTimeMillis() - r17 <= 86400000 || str.length() <= 0) {
            T6();
            return;
        }
        com.tencent.mm.ui.mmfb.sdk.l lVar = new com.tencent.mm.ui.mmfb.sdk.l();
        this.f73658h = lVar;
        lVar.g(str);
        new v61.q0(this.f73658h, new com.tencent.mm.plugin.account.ui.yh(this)).c();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToFacebookRedirectUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i17 == 0 && i18 == -1 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("bind_facebook_succ", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareToFacebookRedirectUI", "bind facebooksucc %b", java.lang.Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                U6();
                T6();
                return;
            }
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOff, this);
        this.f73654d = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f73655e = getIntent().getStringExtra("digest");
        this.f73656f = getIntent().getStringExtra("img");
        java.lang.String stringExtra = getIntent().getStringExtra("link");
        this.f73657g = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToFacebookRedirectUI", "title %s, digest:%s, img:%s, link:%s", this.f73654d, this.f73655e, this.f73656f, stringExtra);
        if (c01.z1.u()) {
            U6();
            T6();
        } else {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMFBAuthUI.class);
            intent.putExtra("is_force_unbind", true);
            startActivityForResult(intent, 0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOff, this);
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f73658h;
        if (lVar != null) {
            lVar.c(this);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToFacebookRedirectUI", "type:%d, code:%d, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        hideVKB();
        this.f73659i.dismiss();
        if (i17 == 4 && i18 == -68) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(getContext(), str, getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.bi(this), null);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.lang.String string = getString(com.tencent.mm.R.string.j3v);
            if (!isFinishing()) {
                dp.a.makeText(this, string, 0).show();
            }
            finish();
            return;
        }
        db5.e1.u(getContext(), "err(" + i18 + "," + i17 + ")", getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.xh(this), null);
    }
}

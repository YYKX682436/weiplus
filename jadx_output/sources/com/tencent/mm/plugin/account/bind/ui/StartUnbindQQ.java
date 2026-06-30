package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes11.dex */
public class StartUnbindQQ extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f73092i = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f73093e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f73094f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73095g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73096h = null;

    public final boolean Z6() {
        new com.tencent.mm.autogen.events.BindQQEvent().e();
        java.lang.String str = "" + new kk.v(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0)) + "@qqim";
        ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).d(str);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k(str);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().u0(str);
        java.lang.String str2 = c01.z1.r() + "@qqim";
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().u0(str2);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().p(str, false);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().p(str, true);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().p(str2, false);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().p(str2, true);
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        gm0.j1.b().c();
        if (m61.k.Ai().f324374g == null) {
            m61.k.Ai().f324374g = new r61.v1(gm0.j1.u().f273153f);
        }
        r61.v1 v1Var = m61.k.Ai().f324374g;
        if (v1Var.f392975d.delete("qqgroup", null, null) > 0) {
            v1Var.doNotify();
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cvg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.k2f);
        this.f73093e = findViewById(com.tencent.mm.R.id.mom);
        setBackBtn(new p61.g5(this));
        this.f73093e.setOnClickListener(new p61.j5(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, this);
        this.f73096h = getIntent().getStringExtra("notice");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, this);
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
        if (m1Var.getType() == 253) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73095g;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f73095g = null;
            }
            if (i17 == 0 && i18 == 0) {
                int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0);
                if (j17 != 0) {
                    ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).d(new kk.v(j17) + "@qqim");
                }
                java.lang.Object l17 = gm0.j1.u().c().l(102407, null);
                if (l17 != null && ((java.lang.String) l17).length() > 0) {
                    gm0.j1.u().c().w(102407, null);
                }
                try {
                    Z6();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StartUnbindQQ", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StartUnbindQQ", e17, "", new java.lang.Object[0]);
                }
                gm0.j1.u().c().w(9, 0);
                com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent();
                am.zz zzVar = updateLocalVerifySwitchEvent.f54920g;
                zzVar.f8617a = false;
                zzVar.f8618b = true;
                updateLocalVerifySwitchEvent.e();
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73096h)) {
                    W6(1);
                } else {
                    db5.e1.y(this, this.f73096h, "", getString(com.tencent.mm.R.string.f490455vj), new p61.k5(this));
                }
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            androidx.appcompat.app.AppCompatActivity context = getContext();
            ((com.tencent.mm.app.o7) wi6).getClass();
            com.tencent.mm.ui.pc.a(context, i17, i18, str, 4);
        }
    }
}

package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public abstract class SetPwdUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73649e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73650f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f73651g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73652h = true;

    public int Z6() {
        return 383;
    }

    public abstract com.tencent.mm.modelbase.m1 a7();

    public void b7() {
        i7();
    }

    public abstract java.lang.String c7();

    public abstract java.lang.String d7();

    public boolean e7(int i17, int i18, java.lang.String str) {
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) wi6).getClass();
        return com.tencent.mm.ui.pc.a(context, i17, i18, str, 4);
    }

    public abstract boolean f7(int i17, int i18, java.lang.String str);

    public abstract void g7(c71.a aVar);

    public android.app.ProgressDialog h7(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
    }

    public void i7() {
        this.f73649e = c7();
        this.f73650f = d7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73649e)) {
            return;
        }
        if (!this.f73649e.equals(this.f73650f)) {
            g7(c71.a.TwoPasswordsNotMatch);
            return;
        }
        if (this.f73649e.length() > 16) {
            g7(c71.a.BeyondMaximumLength);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.A0(this.f73649e)) {
            db5.e1.i(this, com.tencent.mm.R.string.f492796hw2, com.tencent.mm.R.string.hwx);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.Z0(this.f73649e)) {
            if (this.f73649e.length() < 8 || this.f73649e.length() >= 16) {
                g7(c71.a.NotReachMinimumLength);
                return;
            } else {
                g7(c71.a.DisallowShortNumericPassword);
                return;
            }
        }
        hideVKB();
        com.tencent.mm.modelbase.m1 a76 = a7();
        gm0.j1.d().g(a76);
        this.f73651g = h7(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492791hv4), true, true, new com.tencent.mm.plugin.account.ui.th(this, a76));
        if (!(this instanceof com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI) || this.f73652h) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11868, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f73652h) {
            if (this instanceof com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11868, 1);
            }
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(Z6(), this);
        super.onCreate(bundle);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.account.ui.uh(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.plugin.account.ui.vh(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(Z6(), this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String string;
        r45.cu5 cu5Var;
        com.tencent.mm.protobuf.f fVar;
        android.app.ProgressDialog progressDialog = this.f73651g;
        r45.q26 q26Var = null;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73651g = null;
        }
        if (m1Var.getType() != Z6()) {
            return;
        }
        if (m1Var.getType() != 383) {
            if (f7(i17, i18, str)) {
                return;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            androidx.appcompat.app.AppCompatActivity context = getContext();
            ((com.tencent.mm.app.o7) wi6).getClass();
            if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
                return;
            }
            dp.a.makeText(this, getString(com.tencent.mm.R.string.fdu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            ((com.tencent.mm.app.o7) wi7).getClass();
            com.tencent.mm.ui.pc.a(context2, i17, i18, str, 4);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().l(6, null))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetPwdUI", "has not bind mobile");
            string = getString(com.tencent.mm.R.string.h_3);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetPwdUI", "has bind mobile");
            string = getString(com.tencent.mm.R.string.f490722ai1);
        }
        com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.modelsimple.f1) m1Var).f71321e;
        if (oVar != null && (fVar = oVar.f70711b.f70700a) != null) {
            q26Var = (r45.q26) fVar;
        }
        if (q26Var != null && (cu5Var = q26Var.f383609d) != null) {
            byte[] g17 = cu5Var.f371841f.g();
            android.content.SharedPreferences.Editor edit = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4).edit();
            edit.putBoolean("key_auth_info_prefs_created", true);
            edit.putInt("key_auth_update_version", o45.wf.f343029g);
            edit.putString("_auth_key", com.tencent.mm.sdk.platformtools.t8.l(g17));
            edit.putInt("_auth_uin", gm0.j1.b().h());
            edit.commit();
        }
        db5.e1.G(this, string, "", false, new com.tencent.mm.plugin.account.ui.wh(this, i17, i18, str));
    }
}

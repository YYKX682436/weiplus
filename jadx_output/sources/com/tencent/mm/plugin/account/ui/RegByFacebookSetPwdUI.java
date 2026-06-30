package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class RegByFacebookSetPwdUI extends com.tencent.mm.plugin.account.ui.SetPwdUI {
    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public int Z6() {
        return 382;
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public com.tencent.mm.modelbase.m1 a7() {
        return new r61.s1(this.f73649e);
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public java.lang.String c7() {
        return ((android.widget.EditText) findViewById(com.tencent.mm.R.id.lrx)).getText().toString();
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public java.lang.String d7() {
        return ((android.widget.EditText) findViewById(com.tencent.mm.R.id.lrw)).getText().toString();
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public boolean f7(int i17, int i18, java.lang.String str) {
        if (i17 != 0 || i18 != 0) {
            return e7(i17, i18, str);
        }
        gm0.j1.u().c().w(57, 0);
        db5.e1.t(this, getString(com.tencent.mm.R.string.hw_, (java.lang.String) gm0.j1.u().c().l(5, null)), getString(com.tencent.mm.R.string.f492795hw1), new com.tencent.mm.plugin.account.ui.se(this));
        return true;
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public void g7(c71.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            db5.e1.i(this, com.tencent.mm.R.string.hvz, com.tencent.mm.R.string.f492795hw1);
            return;
        }
        if (ordinal == 1) {
            db5.e1.i(this, com.tencent.mm.R.string.f492794hw0, com.tencent.mm.R.string.f492795hw1);
        } else if (ordinal == 2) {
            db5.e1.i(this, com.tencent.mm.R.string.k69, com.tencent.mm.R.string.f490389tm);
        } else {
            if (ordinal != 3) {
                return;
            }
            db5.e1.i(this, com.tencent.mm.R.string.k66, com.tencent.mm.R.string.f490389tm);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdq;
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public android.app.ProgressDialog h7(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return db5.e1.Q(context, str, getString(com.tencent.mm.R.string.f492797hw3), z17, z18, onCancelListener);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.hwb);
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI, com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}

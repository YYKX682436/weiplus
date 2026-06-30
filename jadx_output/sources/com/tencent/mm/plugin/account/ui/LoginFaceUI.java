package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class LoginFaceUI extends com.tencent.mm.plugin.account.ui.LoginHistoryUI {
    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI
    public void Z6() {
        super.Z6();
        V6();
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(this.C, this.P, "", 0);
        java.lang.String str = this.P;
        if (str != null) {
            str.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(this.P);
        com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73340u;
        java.lang.String str2 = w6Var.f74287c;
        if (str2 != null) {
            str2.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(w6Var.f74287c);
        this.f73338s = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.g4(this, v0Var));
        gm0.j1.d().g(v0Var);
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.T = 5;
        this.K.setVisibility(0);
        android.view.View view = this.f73331m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginFaceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/LoginFaceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.tencent.mm.R.id.dmp).setEnabled(false);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484287do5)).setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.f479552ab3));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484287do5)).setBackgroundResource(getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f73331m.setOnClickListener(new com.tencent.mm.plugin.account.ui.f4(this));
    }
}

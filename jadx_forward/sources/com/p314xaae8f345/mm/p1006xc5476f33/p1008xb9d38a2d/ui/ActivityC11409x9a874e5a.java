package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginFaceUI */
/* loaded from: classes14.dex */
public class ActivityC11409x9a874e5a extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf
    public void Z6() {
        super.Z6();
        V6();
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = new com.p314xaae8f345.mm.p957x53236a1b.v0(this.C, this.P, "", 0);
        java.lang.String str = this.P;
        if (str != null) {
            str.length();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.P);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154873u;
        java.lang.String str2 = w6Var.f155820c;
        if (str2 != null) {
            str2.length();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(w6Var.f155820c);
        this.f154871s = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g4(this, v0Var));
        gm0.j1.d().g(v0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.T = 5;
        this.K.setVisibility(0);
        android.view.View view = this.f154864m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginFaceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/LoginFaceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.p314xaae8f345.mm.R.id.dmp).setEnabled(false);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565820do5)).setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565820do5)).setBackgroundResource(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f154864m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f4(this));
    }
}

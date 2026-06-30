package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class k3 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l3 f154241a;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l3 l3Var) {
        this.f154241a = l3Var;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "onLoadImageEnd() url:%s path:%s", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l3 l3Var = this.f154241a;
        android.app.Dialog dialog = l3Var.f154253d.C1;
        if (dialog != null && dialog.isShowing()) {
            l3Var.f154253d.C1.dismiss();
        }
        if (bitmap == null) {
            dp.a.m125853x26a183b(l3Var.f154253d, com.p314xaae8f345.mm.R.C30867xcad56011.f571265a5, 1).show();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 1);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, l3Var.f154253d.f154039l1);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, l3Var.f154253d.f154055x1);
        intent.putExtra("url", l3Var.f154253d.f154045p1);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = l3Var.f154253d;
        intent.putExtra("view_info", ym5.u6.b(activityC11351x975a7907.A, activityC11351x975a7907.mo55332x76847179().getWindow().getDecorView()));
        j45.l.n(l3Var.f154253d, "aa", ".ui.AAImagPreviewUI", intent, 310);
        l3Var.f154253d.f7(14);
    }
}

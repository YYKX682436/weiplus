package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class l3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        super(false);
        this.f154253d = activityC11351x975a7907;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154253d;
        if (activityC11351x975a7907.C1 == null) {
            activityC11351x975a7907.C1 = db5.e1.O(activityC11351x975a7907, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, activityC11351x975a7907.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j3(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a79072 = this.f154253d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11351x975a79072.f154045p1)) {
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(activityC11351x975a79072.f154045p1, new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k3(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "imageUrl == null");
        android.app.Dialog dialog = activityC11351x975a79072.C1;
        if (dialog != null && dialog.isShowing()) {
            activityC11351x975a79072.C1.dismiss();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 1);
        activityC11351x975a79072.f154039l1 = 2;
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, activityC11351x975a79072.f154055x1);
        intent.putExtra("view_info", ym5.u6.b(activityC11351x975a79072.A, activityC11351x975a79072.mo55332x76847179().getWindow().getDecorView()));
        j45.l.n(activityC11351x975a79072, "aa", ".ui.AAImagPreviewUI", intent, 310);
        activityC11351x975a79072.f7(14);
    }
}

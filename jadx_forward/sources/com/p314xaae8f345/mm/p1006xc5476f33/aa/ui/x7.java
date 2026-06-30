package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class x7 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y7 f154424a;

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y7 y7Var) {
        this.f154424a = y7Var;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "onLoadImageEnd() url:%s path:%s", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y7 y7Var = this.f154424a;
        android.app.Dialog dialog = y7Var.f154434d.f154449c.f154082n;
        if (dialog != null && dialog.isShowing()) {
            y7Var.f154434d.f154449c.f154082n.dismiss();
        }
        if (bitmap == null) {
            dp.a.m125853x26a183b(y7Var.f154434d.f154449c, com.p314xaae8f345.mm.R.C30867xcad56011.f571265a5, 1).show();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("use_scene", 2);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
        intent.putExtra("url", y7Var.f154434d.f154447a.E);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z7 z7Var = y7Var.f154434d;
        com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 b17 = ym5.u6.b(z7Var.f154448b, z7Var.f154449c.mo55332x76847179().getWindow().getDecorView());
        android.graphics.Rect rect = b17.f295046d;
        rect.right = rect.left + i65.a.b(y7Var.f154434d.f154449c.mo55332x76847179(), 30);
        rect.set(rect);
        intent.putExtra("view_info", b17);
        intent.putExtra("aa_type", y7Var.f154434d.f154449c.R);
        j45.l.n(y7Var.f154434d.f154449c, "aa", ".ui.AAImagPreviewUI", intent, 100);
    }
}

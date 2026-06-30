package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c1 f176939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 f176940e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var) {
        this.f176939d = c1Var;
        this.f176940e = t0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String user_card_id = this.f176940e.a().f468298d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c1 c1Var = this.f176939d;
        c1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = c1Var.f176834e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13074xfcf8fabf.mo55332x76847179(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(activityC13074xfcf8fabf.mo55332x76847179());
        textView.setText(activityC13074xfcf8fabf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asw));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(activityC13074xfcf8fabf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        textView.setGravity(17);
        int dimensionPixelSize = activityC13074xfcf8fabf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = activityC13074xfcf8fabf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a1(activityC13074xfcf8fabf);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.b1(activityC13074xfcf8fabf, user_card_id);
        k0Var.v();
    }
}

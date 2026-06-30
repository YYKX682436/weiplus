package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j f176849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a f176850e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a aVar) {
        this.f176849d = jVar;
        this.f176850e = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a aVar = this.f176850e;
        java.lang.String card_id = aVar.a().f472874d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_id, "card_id");
        java.lang.String user_card_id = aVar.a().f472875e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j jVar = this.f176849d;
        jVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = jVar.f176868e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13069x47bc6a4f.mo55332x76847179(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(activityC13069x47bc6a4f.mo55332x76847179());
        textView.setText(activityC13069x47bc6a4f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572326at3));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(activityC13069x47bc6a4f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        textView.setGravity(17);
        int dimensionPixelSize = activityC13069x47bc6a4f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = activityC13069x47bc6a4f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.h(activityC13069x47bc6a4f);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.i(activityC13069x47bc6a4f, card_id, user_card_id);
        k0Var.v();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19674, 2, java.lang.Integer.valueOf(aVar.a().f472880m), aVar.a().f472875e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }
}

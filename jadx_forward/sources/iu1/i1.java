package iu1;

/* loaded from: classes9.dex */
public final class i1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e f376412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f376413e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e, r45.g45 g45Var) {
        this.f376412d = activityC13068x5a32e52e;
        this.f376413e = g45Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e = this.f376412d;
        activityC13068x5a32e52e.getClass();
        r45.g45 g45Var = this.f376413e;
        if (g45Var == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13068x5a32e52e.mo55332x76847179(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(activityC13068x5a32e52e.mo55332x76847179());
        textView.setText(activityC13068x5a32e52e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asv));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(activityC13068x5a32e52e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        textView.setGravity(17);
        int dimensionPixelSize = activityC13068x5a32e52e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = activityC13068x5a32e52e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f293405n = new iu1.j1(activityC13068x5a32e52e);
        k0Var.f293414s = new iu1.k1(activityC13068x5a32e52e, g45Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(g45Var.f456408h);
        java.lang.String user_card_id = g45Var.f456404d;
        objArr[1] = user_card_id;
        iu1.v0 v0Var = activityC13068x5a32e52e.f176751m;
        if (v0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        objArr[2] = java.lang.Integer.valueOf(v0Var.y(user_card_id, g45Var.f456408h));
        objArr[3] = 3;
        objArr[4] = java.lang.Integer.valueOf(activityC13068x5a32e52e.f176757s);
        g0Var.d(16326, objArr);
        k0Var.v();
    }
}

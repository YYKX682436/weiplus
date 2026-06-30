package iu1;

/* loaded from: classes9.dex */
public final class k1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e f376425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f376426e;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e, r45.g45 g45Var) {
        this.f376425d = activityC13068x5a32e52e;
        this.f376426e = g45Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            r45.g45 g45Var = this.f376426e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g45Var);
            java.lang.String user_card_id = g45Var.f456404d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e = this.f376425d;
            activityC13068x5a32e52e.X6(user_card_id);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g45Var);
            objArr[0] = java.lang.Integer.valueOf(g45Var.f456408h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g45Var);
            objArr[1] = g45Var.f456404d;
            iu1.v0 v0Var = activityC13068x5a32e52e.f176751m;
            if (v0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g45Var);
            java.lang.String user_card_id2 = g45Var.f456404d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id2, "user_card_id");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g45Var);
            objArr[2] = java.lang.Integer.valueOf(v0Var.y(user_card_id2, g45Var.f456408h));
            objArr[3] = 4;
            objArr[4] = java.lang.Integer.valueOf(activityC13068x5a32e52e.f176757s);
            g0Var.d(16326, objArr);
        }
    }
}

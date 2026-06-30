package iu1;

/* loaded from: classes9.dex */
public final class f1 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e f376403a;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e) {
        this.f376403a = activityC13068x5a32e52e;
    }

    @Override // vl1.o
    public final boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "long click item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e = this.f376403a;
        iu1.v0 v0Var = activityC13068x5a32e52e.f176751m;
        if (v0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
            throw null;
        }
        iu1.w0 x17 = v0Var.x(i17);
        if (x17 != null) {
            r45.g45 g45Var = x17.f376507d;
            if (x17.f376504a == 2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                if (g45Var != null) {
                    rl5.r rVar = new rl5.r(activityC13068x5a32e52e.mo55332x76847179(), view);
                    rVar.f478884u = new iu1.h1(activityC13068x5a32e52e);
                    rVar.f478887x = new iu1.i1(activityC13068x5a32e52e, g45Var);
                    android.graphics.Point a17 = lu1.b0.a(view);
                    rVar.n(a17.x, a17.y);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[0] = java.lang.Integer.valueOf(g45Var.f456408h);
                    java.lang.String user_card_id = g45Var.f456404d;
                    objArr[1] = user_card_id;
                    iu1.v0 v0Var2 = activityC13068x5a32e52e.f176751m;
                    if (v0Var2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                        throw null;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
                    objArr[2] = java.lang.Integer.valueOf(v0Var2.y(user_card_id, g45Var.f456408h));
                    objArr[3] = 2;
                    objArr[4] = java.lang.Integer.valueOf(activityC13068x5a32e52e.f176757s);
                    g0Var.d(16326, objArr);
                } else {
                    activityC13068x5a32e52e.getClass();
                }
            }
        }
        return false;
    }
}

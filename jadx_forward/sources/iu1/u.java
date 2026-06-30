package iu1;

/* loaded from: classes9.dex */
public final class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu1.a f376490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f376491f;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, iu1.a aVar, int i17) {
        this.f376489d = activityC13064xaf775f76;
        this.f376490e = aVar;
        this.f376491f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        iu1.a aVar = this.f376490e;
        r45.wt wtVar = aVar.f376364a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
        java.lang.String card_pack_merchant_id = wtVar.f470960d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376489d;
        activityC13064xaf775f76.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "do delete merchant: %s", card_pack_merchant_id);
        new au1.k(card_pack_merchant_id).l().h(new iu1.n(activityC13064xaf775f76, card_pack_merchant_id));
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        r45.wt wtVar2 = aVar.f376364a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar2);
        g0Var.d(16324, 2, wtVar2.f470960d, 0, 0, 9, java.lang.Integer.valueOf(this.f376491f), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
    }
}

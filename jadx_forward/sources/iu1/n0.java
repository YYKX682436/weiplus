package iu1;

/* loaded from: classes.dex */
public final class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 f376458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f376459e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025, r45.g45 g45Var) {
        this.f376458d = activityC13065x7a79a025;
        this.f376459e = g45Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            r45.g45 g45Var = this.f376459e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g45Var);
            java.lang.String user_card_id = g45Var.f456404d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025.f176731v;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025 = this.f376458d;
            activityC13065x7a79a025.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "do delete ticket: %s", user_card_id);
            activityC13065x7a79a025.a7(java.lang.Boolean.TRUE);
            new au1.i(user_card_id).l().h(new iu1.e0(activityC13065x7a79a025, user_card_id));
        }
    }
}

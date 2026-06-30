package iu1;

/* loaded from: classes9.dex */
public final class h0 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 f376408a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025) {
        this.f376408a = activityC13065x7a79a025;
    }

    @Override // vl1.n
    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        r45.g45 g45Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "click item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025 = this.f376408a;
        iu1.w0 x17 = activityC13065x7a79a025.Y6().x(i17);
        if (x17 == null || x17.f376504a != 2 || (g45Var = x17.f376507d) == null) {
            return;
        }
        java.lang.String user_card_id = g45Var.f456404d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        activityC13065x7a79a025.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "go to card detail: %s", user_card_id);
        android.content.Intent intent = new android.content.Intent(activityC13065x7a79a025.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        intent.putExtra("key_card_id", user_card_id);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        activityC13065x7a79a025.mo55332x76847179().startActivityForResult(intent, 256);
    }
}

package iu1;

/* loaded from: classes9.dex */
public final class i0 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 f376411a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025) {
        this.f376411a = activityC13065x7a79a025;
    }

    @Override // vl1.o
    public final boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "long click item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025 = this.f376411a;
        iu1.w0 x17 = activityC13065x7a79a025.Y6().x(i17);
        if (x17 == null || x17.f376504a != 2) {
            return false;
        }
        r45.g45 g45Var = x17.f376507d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        if (g45Var == null) {
            activityC13065x7a79a025.getClass();
            return false;
        }
        rl5.r rVar = new rl5.r(activityC13065x7a79a025.mo55332x76847179(), view);
        rVar.f478884u = new iu1.k0(activityC13065x7a79a025);
        rVar.f478887x = new iu1.l0(activityC13065x7a79a025, g45Var);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        return false;
    }
}

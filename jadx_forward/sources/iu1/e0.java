package iu1;

/* loaded from: classes9.dex */
public final class e0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 f376394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376395b;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025, java.lang.String str) {
        this.f376394a = activityC13065x7a79a025;
        this.f376395b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025 = this.f376394a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.fd0 fd0Var = (r45.fd0) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "retCode: %s", java.lang.Integer.valueOf(fd0Var.f455753d));
            if (fd0Var.f455753d == 0) {
                activityC13065x7a79a025.Y6().z(this.f376395b);
            } else {
                lu1.a0.r(activityC13065x7a79a025, fd0Var.f455754e);
            }
        } else {
            lu1.a0.q(activityC13065x7a79a025, "");
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025.f176731v;
        activityC13065x7a79a025.a7(bool);
        return jz5.f0.f384359a;
    }
}

package iu1;

/* loaded from: classes9.dex */
public final class b1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e f376374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376375b;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e, java.lang.String str) {
        this.f376374a = activityC13068x5a32e52e;
        this.f376375b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e activityC13068x5a32e52e = this.f376374a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.hd0 hd0Var = (r45.hd0) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "retCode: %s", java.lang.Integer.valueOf(hd0Var.f457595d));
            if (hd0Var.f457595d == 0) {
                iu1.v0 v0Var = activityC13068x5a32e52e.f176751m;
                if (v0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                    throw null;
                }
                v0Var.z(this.f376375b);
            } else {
                lu1.a0.r(activityC13068x5a32e52e, hd0Var.f457596e);
            }
        } else {
            lu1.a0.q(activityC13068x5a32e52e, "");
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e.B;
        activityC13068x5a32e52e.Z6(bool);
        return jz5.f0.f384359a;
    }
}
